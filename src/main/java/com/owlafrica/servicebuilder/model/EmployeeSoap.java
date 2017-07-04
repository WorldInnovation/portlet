package com.owlafrica.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.owlafrica.servicebuilder.service.http.EmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.owlafrica.servicebuilder.service.http.EmployeeServiceSoap
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _id;
    private Date _birthday;
    private String _eMail;
    private String _firstName;
    private String _secondName;
    private int _grade;
    private long _depID;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setId(model.getId());
        soapModel.setBirthday(model.getBirthday());
        soapModel.setEMail(model.getEMail());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setSecondName(model.getSecondName());
        soapModel.setGrade(model.getGrade());
        soapModel.setDepID(model.getDepID());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
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

    public Date getBirthday() {
        return _birthday;
    }

    public void setBirthday(Date birthday) {
        _birthday = birthday;
    }

    public String getEMail() {
        return _eMail;
    }

    public void setEMail(String eMail) {
        _eMail = eMail;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getSecondName() {
        return _secondName;
    }

    public void setSecondName(String secondName) {
        _secondName = secondName;
    }

    public int getGrade() {
        return _grade;
    }

    public void setGrade(int grade) {
        _grade = grade;
    }

    public long getDepID() {
        return _depID;
    }

    public void setDepID(long depID) {
        _depID = depID;
    }
}
