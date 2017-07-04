package com.owlafrica.servicebuilder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.owlafrica.servicebuilder.model.LiferayAspenReference;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LiferayAspenReference in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReference
 * @generated
 */
public class LiferayAspenReferenceCacheModel implements CacheModel<LiferayAspenReference>,
    Externalizable {
    public long id;
    public long liferayUserId;
    public String aspenEmployeeCode;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", liferayUserId=");
        sb.append(liferayUserId);
        sb.append(", aspenEmployeeCode=");
        sb.append(aspenEmployeeCode);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LiferayAspenReference toEntityModel() {
        LiferayAspenReferenceImpl liferayAspenReferenceImpl = new LiferayAspenReferenceImpl();

        liferayAspenReferenceImpl.setId(id);
        liferayAspenReferenceImpl.setLiferayUserId(liferayUserId);

        if (aspenEmployeeCode == null) {
            liferayAspenReferenceImpl.setAspenEmployeeCode(StringPool.BLANK);
        } else {
            liferayAspenReferenceImpl.setAspenEmployeeCode(aspenEmployeeCode);
        }

        liferayAspenReferenceImpl.resetOriginalValues();

        return liferayAspenReferenceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        liferayUserId = objectInput.readLong();
        aspenEmployeeCode = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(liferayUserId);

        if (aspenEmployeeCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(aspenEmployeeCode);
        }
    }
}
