package com.owlafrica.servicebuilder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.owlafrica.servicebuilder.model.Dep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Dep in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Dep
 * @generated
 */
public class DepCacheModel implements CacheModel<Dep>, Externalizable {
    public long id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Dep toEntityModel() {
        DepImpl depImpl = new DepImpl();

        depImpl.setId(id);

        if (name == null) {
            depImpl.setName(StringPool.BLANK);
        } else {
            depImpl.setName(name);
        }

        depImpl.resetOriginalValues();

        return depImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
