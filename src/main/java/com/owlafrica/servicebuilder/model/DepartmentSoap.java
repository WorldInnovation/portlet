package com.owlafrica.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.owlafrica.servicebuilder.service.http.DepartmentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.owlafrica.servicebuilder.service.http.DepartmentServiceSoap
 * @generated
 */
public class DepartmentSoap implements Serializable {
    private long _id;
    private String _name;

    public DepartmentSoap() {
    }

    public static DepartmentSoap toSoapModel(Department model) {
        DepartmentSoap soapModel = new DepartmentSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static DepartmentSoap[] toSoapModels(Department[] models) {
        DepartmentSoap[] soapModels = new DepartmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DepartmentSoap[][] toSoapModels(Department[][] models) {
        DepartmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DepartmentSoap[models.length][models[0].length];
        } else {
            soapModels = new DepartmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DepartmentSoap[] toSoapModels(List<Department> models) {
        List<DepartmentSoap> soapModels = new ArrayList<DepartmentSoap>(models.size());

        for (Department model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DepartmentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
