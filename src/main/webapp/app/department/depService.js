
export default class DepService {

    constructor() {

    }

    getAll() {

        return $.ajax({
            url: window.MYDepartment.depAll,
            //data: dataObject,
            type: 'POST',

            success: function (data) {
                alert(data);
                // get person data back from controller
            }
        });

        /* $.ajax({
         type: "GET",
         url: window.MYDepartment.depAll,
         data: {id: 1,
         name: 'test'
         },
         success:  function(data, textStatus, jqXHR){

         alert( "data: "+ data );

         },
         error: function (data, textStatus, jqXHR) {
         console.log(JSON.stringify(data));
         alert( "error: "+ data );
         alert( "error textStatus: "+ textStatus );
         alert( "error jqXHR: "+ jqXHR );

         const body = $('#content');
         body.empty();

         body.append("<h3> Error here </h3>");
         }
         });*/
    };

    /*    getAll(){
     $.ajax({
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
     });
     };*/


    deleteDep(id) {
        let dataObject = {};
        dataObject = this.createDataObject(dataObject, window.MYDepartment.ns, 'id', id);
        let deleteDep = $.ajax({
            url: window.MYDepartment.deleteDep,
            data: dataObject,
            type: 'POST'
        });
        return deleteDep;
    };

    editDep(id) {
        let dataObject = {};
        dataObject[window.MYDepartment.ns + 'id'] = id;
        //dataObject[window.MYDepartment.ns + 'name'] = 'lala';
        let editDep = $.ajax({
            url: window.MYDepartment.editDepartment,
            data: dataObject,//
            type: 'GET'
        });
        return editDep;
    }

    saveDepartment() {
        let id = $('#id').val();
        /*if (typeof undefined == id) {
            id = null;
        }*/

        let name = $('#name').val();
        let dataObject = {};
        dataObject[window.MYDepartment.ns + 'id'] = id;
        dataObject[window.MYDepartment.ns + 'name'] = name;

        let saveDepartment = $.ajax({
            data: dataObject,
            url: window.MYDepartment.depSave,
            type: "POST",
            success: function (data, textStatus, jqXHR) {
                if (data.department == null) {
                    alert("Name: " + data.errors.name);
                }
            }
        });
        return saveDepartment;
    };

    createDataObject(object, nameSpace, paramName, param) {

        object[nameSpace + paramName] = param;
        return object;
    }
/*    createDatamap(object, ns, paramMap){
        let data = {};
        data.id = 1;
        data.name = 'lala';

        data.forEach( (value, key, recipeMap) => {
            alert(`${ns}+${key}: ${value}`);
           // object[ns + paramName] = param;
        });

        return object;
    }*/



}

/*

 $.ajax({
 statusCode: {
 404: function() {
 alert( "page not found" );
 }
 }
 });*/