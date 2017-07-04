package com.owlafrica.servicebuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("birthday", getBirthday());
        attributes.put("eMail", getEMail());
        attributes.put("firstName", getFirstName());
        attributes.put("secondName", getSecondName());
        attributes.put("grade", getGrade());
        attributes.put("depID", getDepID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Date birthday = (Date) attributes.get("birthday");

        if (birthday != null) {
            setBirthday(birthday);
        }

        String eMail = (String) attributes.get("eMail");

        if (eMail != null) {
            setEMail(eMail);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String secondName = (String) attributes.get("secondName");

        if (secondName != null) {
            setSecondName(secondName);
        }

        Integer grade = (Integer) attributes.get("grade");

        if (grade != null) {
            setGrade(grade);
        }

        Long depID = (Long) attributes.get("depID");

        if (depID != null) {
            setDepID(depID);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this employee.
    *
    * @return the ID of this employee
    */
    @Override
    public long getId() {
        return _employee.getId();
    }

    /**
    * Sets the ID of this employee.
    *
    * @param id the ID of this employee
    */
    @Override
    public void setId(long id) {
        _employee.setId(id);
    }

    /**
    * Returns the birthday of this employee.
    *
    * @return the birthday of this employee
    */
    @Override
    public java.util.Date getBirthday() {
        return _employee.getBirthday();
    }

    /**
    * Sets the birthday of this employee.
    *
    * @param birthday the birthday of this employee
    */
    @Override
    public void setBirthday(java.util.Date birthday) {
        _employee.setBirthday(birthday);
    }

    /**
    * Returns the e mail of this employee.
    *
    * @return the e mail of this employee
    */
    @Override
    public java.lang.String getEMail() {
        return _employee.getEMail();
    }

    /**
    * Sets the e mail of this employee.
    *
    * @param eMail the e mail of this employee
    */
    @Override
    public void setEMail(java.lang.String eMail) {
        _employee.setEMail(eMail);
    }

    /**
    * Returns the first name of this employee.
    *
    * @return the first name of this employee
    */
    @Override
    public java.lang.String getFirstName() {
        return _employee.getFirstName();
    }

    /**
    * Sets the first name of this employee.
    *
    * @param firstName the first name of this employee
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _employee.setFirstName(firstName);
    }

    /**
    * Returns the second name of this employee.
    *
    * @return the second name of this employee
    */
    @Override
    public java.lang.String getSecondName() {
        return _employee.getSecondName();
    }

    /**
    * Sets the second name of this employee.
    *
    * @param secondName the second name of this employee
    */
    @Override
    public void setSecondName(java.lang.String secondName) {
        _employee.setSecondName(secondName);
    }

    /**
    * Returns the grade of this employee.
    *
    * @return the grade of this employee
    */
    @Override
    public int getGrade() {
        return _employee.getGrade();
    }

    /**
    * Sets the grade of this employee.
    *
    * @param grade the grade of this employee
    */
    @Override
    public void setGrade(int grade) {
        _employee.setGrade(grade);
    }

    /**
    * Returns the dep i d of this employee.
    *
    * @return the dep i d of this employee
    */
    @Override
    public long getDepID() {
        return _employee.getDepID();
    }

    /**
    * Sets the dep i d of this employee.
    *
    * @param depID the dep i d of this employee
    */
    @Override
    public void setDepID(long depID) {
        _employee.setDepID(depID);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(com.owlafrica.servicebuilder.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.owlafrica.servicebuilder.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public com.owlafrica.servicebuilder.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public com.owlafrica.servicebuilder.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
