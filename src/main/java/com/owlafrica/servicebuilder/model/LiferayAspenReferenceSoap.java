package com.owlafrica.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.owlafrica.servicebuilder.service.http.LiferayAspenReferenceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.owlafrica.servicebuilder.service.http.LiferayAspenReferenceServiceSoap
 * @generated
 */
public class LiferayAspenReferenceSoap implements Serializable {
    private long _id;
    private long _liferayUserId;
    private String _aspenEmployeeCode;

    public LiferayAspenReferenceSoap() {
    }

    public static LiferayAspenReferenceSoap toSoapModel(
        LiferayAspenReference model) {
        LiferayAspenReferenceSoap soapModel = new LiferayAspenReferenceSoap();

        soapModel.setId(model.getId());
        soapModel.setLiferayUserId(model.getLiferayUserId());
        soapModel.setAspenEmployeeCode(model.getAspenEmployeeCode());

        return soapModel;
    }

    public static LiferayAspenReferenceSoap[] toSoapModels(
        LiferayAspenReference[] models) {
        LiferayAspenReferenceSoap[] soapModels = new LiferayAspenReferenceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LiferayAspenReferenceSoap[][] toSoapModels(
        LiferayAspenReference[][] models) {
        LiferayAspenReferenceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LiferayAspenReferenceSoap[models.length][models[0].length];
        } else {
            soapModels = new LiferayAspenReferenceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LiferayAspenReferenceSoap[] toSoapModels(
        List<LiferayAspenReference> models) {
        List<LiferayAspenReferenceSoap> soapModels = new ArrayList<LiferayAspenReferenceSoap>(models.size());

        for (LiferayAspenReference model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LiferayAspenReferenceSoap[soapModels.size()]);
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

    public long getLiferayUserId() {
        return _liferayUserId;
    }

    public void setLiferayUserId(long liferayUserId) {
        _liferayUserId = liferayUserId;
    }

    public String getAspenEmployeeCode() {
        return _aspenEmployeeCode;
    }

    public void setAspenEmployeeCode(String aspenEmployeeCode) {
        _aspenEmployeeCode = aspenEmployeeCode;
    }
}
