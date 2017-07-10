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
        let dataObject = {};
        dataObject = this.createDataObject(dataObject, window.MYDepartment.ns, 'id', id);
        let deleteEmp = $.ajax({
            url: window.MYDepartment.empDelete,
            data: dataObject,
            type: 'POST'
        });
        return deleteEmp;
    };

    editEmp(depID, id){
        let dataObject = {};
        dataObject[window.MYDepartment.ns + 'id'] = id;
        dataObject[window.MYDepartment.ns + 'depID'] = depID;
        let editEmp = $.ajax({
            url: window.MYDepartment.employeeEdit,
            data: dataObject,
            type:'GET'
        });
        return editEmp;
    };

    employeeSave(depID, id) {
        let dataObject = {};
        dataObject[window.MYDepartment.ns + 'id'] = id;
        dataObject[window.MYDepartment.ns + 'depID'] = depID;
        dataObject[window.MYDepartment.ns + 'firstName'] = $('#firstName').val();
        dataObject[window.MYDepartment.ns + 'secondName'] = $('#secondName').val();
        dataObject[window.MYDepartment.ns + 'grade'] = $('#grade').val();
        dataObject[window.MYDepartment.ns + 'birthday'] = $('#birthday').val();
        dataObject[window.MYDepartment.ns + 'eMail'] = $('#eMail').val();

        let employeeSave = $.ajax({
            url: window.MYDepartment.empSave,
            data: dataObject,
            type: 'POST'
        });
        return employeeSave;
    };
    createDataObject(object, nameSpace, paramName, param) {

        object[nameSpace + paramName] = param;
        return object;
    }

}