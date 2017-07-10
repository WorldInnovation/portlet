export default class EmpService {
    constructor(){}

    getAllEmp(depID) {
        let dataObject = {};
        dataObject = this.createDataObject(dataObject, window.MYDepartment.ns, 'id', depID);
        let employeesList =
            $.ajax({
                url: window.MYDepartment.employeesList,
                data: dataObject,
                type: "GET",
                success: function (data, textStatus, jqXHR) {
                    alert("ok " + data);
                },
                error: function (data) {
                    alert("err " + data);
                }
            });
        return employeesList;
    };

    deleteEmp(id) {
        let deleteEmp = $.ajax({
            url: '/empDelete',
            data: {empID: id},
            type: 'POST'
        });
        return deleteEmp;
    };

    editEmp(depID, id){
        let editEmp = $.ajax({
            url:'/employeeEdit',
            data: {
                depID: depID,
                empID: id
            },
            type:'GET'
        });
        return editEmp;
    };

    employeeSave(depID, id) {
        let employeeSave = $.ajax({
            url:'/empSave',
            data: {
             depID: depID,
             id:id,
             firstName:$('#firstName').val(),
             secondName:$('#secondName').val(),
             grade:$('#grade').val(),
             birthday:$('#birthday').val(),
             eMail:$('#eMail').val()
             },
            type: 'POST'
        });
        return employeeSave;
    };
    createDataObject(object, nameSpace, paramName, param) {

        object[nameSpace + paramName] = param;
        return object;
    }

}