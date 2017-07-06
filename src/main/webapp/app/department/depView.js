import jQuery from "jquery";
import "./depController";

window.$ = window.jQuery = jQuery;

export default class DepView {

    constructor() {

/*        $.ajax({
            url: '<portlet:resourceURL id="editDepartment"/>',
            data: {id: 1,
                name: 'test'
            },//person id to sent
            type: 'GET',
            dataType: "json",
            success: function (data) {
                alert(data);
                // get person data back from controller
            }
        });*/
    };


    displayDepartments(response) {
        const body = $('#content');
        body.empty();
        const table = $('<table>');
        table.append($('<th>').append($('<b>').text(' ID ')));
        table.append($('<th>').append($('<b>').text('Department')));
        table.append($('<th>').append($('<b>').text('Select')));
        table.append($('<th>').append($('<b>').text('Edit')));
        table.append($('<th>').append($('<b>').text('Delete')));

        for (let i = 0; i < response.length; i++) {
            table.append(
                $('<tr>')
                    .append($('<td>').text(response[i].id))
                    .append($('<td>').text(response[i].name))
                    .append($('<td>').append($('<button class="listener" value="employeesList" name="' + response[i].id + '">Select</button>')))
                    .append($('<td>').append($('<button class="listener" value="editDepartment" name="' + response[i].id + '" >Edit</button>')))
                    .append($('<td>').append($('<button class="listener" value="deleteDep" name="' + response[i].id + '">Delete</button>')))
            );
        }
        table.append($('<tr>')
            .append($('<td>')
                .append($('<button class="listener" value="addDepartment" >New</button>')))
        );
        body.append(table);
    };

    displayDepForm(response) {
        response.id = 7;
        let body = $('#content');
        body.empty();
        const firstParent = $('<form id="departmentForm" class="reg-form" method="post" action="" ></form>');
        const row = $('<div class="form-row"> <label for="name">DepName: </label>')
            .append($('<input type="text" id="name" placeholder="Enter department" name ="name"/>').val('lala'))
            .append($('<input type="hidden" id="id" value="7" />'))
            .append($('</div>'))
            .append($('<div class="form-row"> <input id="depSave" class="submit" type="submit" />'))
            .append($('</div>'));
        firstParent.append(row);
        body.append(firstParent);

        this.validateDepartment()
    };

    validateDepartment() {
        var dataObject = {};
        alert($('#id').val());
        dataObject[window.MYDepartment.ns + 'id'] = $('#id').val();
        dataObject[window.MYDepartment.ns + 'name'] = $('#name').val();

        $('#departmentForm').validate({

            rules: {
                namePass: {
                    required: true,
                    minlength: 1,
                    maxlength: 10,
                    remote: {
                        url: window.MYDepartment.getDepName,
                        type: "POST",
                        data: dataObject
                        /*{
                            id: () => {
                                return $('#id').val();
                            },
                            name: () => {
                                return $('#name').val();
                            }
                        }*/
                    }
                }
            },
            messages: {
                name: {
                    required: "Type name, please",
                    minlength: "Name must be at least 5 characters long",
                    maxlength: "Name must not be longer than 10 chars",
                    remote: "This name is already used!"
                }
            },
            submitHandler: () => {
                event.target.value = 'depSave';
                $( "#depSave" ).addClass('listener').trigger( 'click' );
            }
        });
    };

}



