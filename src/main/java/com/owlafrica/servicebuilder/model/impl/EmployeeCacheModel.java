package com.owlafrica.servicebuilder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.owlafrica.servicebuilder.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long id;
    public long birthday;
    public String eMail;
    public String firstName;
    public String secondName;
    public int grade;
    public long depID;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{id=");
        sb.append(id);
        sb.append(", birthday=");
        sb.append(birthday);
        sb.append(", eMail=");
        sb.append(eMail);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", secondName=");
        sb.append(secondName);
        sb.append(", grade=");
        sb.append(grade);
        sb.append(", depID=");
        sb.append(depID);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setId(id);

        if (birthday == Long.MIN_VALUE) {
            employeeImpl.setBirthday(null);
        } else {
            employeeImpl.setBirthday(new Date(birthday));
        }

        if (eMail == null) {
            employeeImpl.setEMail(StringPool.BLANK);
        } else {
            employeeImpl.setEMail(eMail);
        }

        if (firstName == null) {
            employeeImpl.setFirstName(StringPool.BLANK);
        } else {
            employeeImpl.setFirstName(firstName);
        }

        if (secondName == null) {
            employeeImpl.setSecondName(StringPool.BLANK);
        } else {
            employeeImpl.setSecondName(secondName);
        }

        employeeImpl.setGrade(grade);
        employeeImpl.setDepID(depID);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        birthday = objectInput.readLong();
        eMail = objectInput.readUTF();
        firstName = objectInput.readUTF();
        secondName = objectInput.readUTF();
        grade = objectInput.readInt();
        depID = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(birthday);

        if (eMail == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(eMail);
        }

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (secondName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(secondName);
        }

        objectOutput.writeInt(grade);
        objectOutput.writeLong(depID);
    }
}
