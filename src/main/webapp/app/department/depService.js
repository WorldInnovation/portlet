
export default class DepService {

    constructor() {

    }

    getAll() {
        return $.ajax({
            url: window.MYDepartment.depAll,
            type: 'GET',
            success: function (data, textStatus, jqXHR) {
            },
            error: function (data) {
            }
        });
    };

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
        let editDep = $.ajax({
            url: window.MYDepartment.editDepartment,
            data: dataObject,//
            type: 'GET'
        });
        return editDep;
    }

    saveDepartment() {
        let id = $('#id').val();
        if ((typeof undefined == id)||("" == id)) {//
            id = null;
        }

        let name = $('#name').val();

        // Govno peredeluvay
        let dataObject = {};
        dataObject[window.MYDepartment.ns + 'id'] = id;
        dataObject[window.MYDepartment.ns + 'name'] = name;

        let saveDepartment = $.ajax({
            data: dataObject,
            url: window.MYDepartment.depSave,
            type: "POST",
            success: function (data, textStatus, jqXHR) {
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