package com.owlafrica.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.owlafrica.servicebuilder.service.http.DepServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.owlafrica.servicebuilder.service.http.DepServiceSoap
 * @generated
 */
public class DepSoap implements Serializable {
    private long _id;
    private String _name;

    public DepSoap() {
    }

    public static DepSoap toSoapModel(Dep model) {
        DepSoap soapModel = new DepSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static DepSoap[] toSoapModels(Dep[] models) {
        DepSoap[] soapModels = new DepSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DepSoap[][] toSoapModels(Dep[][] models) {
        DepSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DepSoap[models.length][models[0].length];
        } else {
            soapModels = new DepSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DepSoap[] toSoapModels(List<Dep> models) {
        List<DepSoap> soapModels = new ArrayList<DepSoap>(models.size());

        for (Dep model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DepSoap[soapModels.size()]);
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
