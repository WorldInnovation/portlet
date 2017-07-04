package com.owlafrica.servicebuilder.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.owlafrica.servicebuilder.service.ClpSerializer;
import com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class LiferayAspenReferenceClp extends BaseModelImpl<LiferayAspenReference>
    implements LiferayAspenReference {
    private long _id;
    private long _liferayUserId;
    private String _liferayUserUuid;
    private String _aspenEmployeeCode;
    private BaseModel<?> _liferayAspenReferenceRemoteModel;
    private Class<?> _clpSerializerClass = com.owlafrica.servicebuilder.service.ClpSerializer.class;

    public LiferayAspenReferenceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return LiferayAspenReference.class;
    }

    @Override
    public String getModelClassName() {
        return LiferayAspenReference.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("liferayUserId", getLiferayUserId());
        attributes.put("aspenEmployeeCode", getAspenEmployeeCode());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long liferayUserId = (Long) attributes.get("liferayUserId");

        if (liferayUserId != null) {
            setLiferayUserId(liferayUserId);
        }

        String aspenEmployeeCode = (String) attributes.get("aspenEmployeeCode");

        if (aspenEmployeeCode != null) {
            setAspenEmployeeCode(aspenEmployeeCode);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_liferayAspenReferenceRemoteModel != null) {
            try {
                Class<?> clazz = _liferayAspenReferenceRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_liferayAspenReferenceRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLiferayUserId() {
        return _liferayUserId;
    }

    @Override
    public void setLiferayUserId(long liferayUserId) {
        _liferayUserId = liferayUserId;

        if (_liferayAspenReferenceRemoteModel != null) {
            try {
                Class<?> clazz = _liferayAspenReferenceRemoteModel.getClass();

                Method method = clazz.getMethod("setLiferayUserId", long.class);

                method.invoke(_liferayAspenReferenceRemoteModel, liferayUserId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLiferayUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getLiferayUserId(), "uuid",
            _liferayUserUuid);
    }

    @Override
    public void setLiferayUserUuid(String liferayUserUuid) {
        _liferayUserUuid = liferayUserUuid;
    }

    @Override
    public String getAspenEmployeeCode() {
        return _aspenEmployeeCode;
    }

    @Override
    public void setAspenEmployeeCode(String aspenEmployeeCode) {
        _aspenEmployeeCode = aspenEmployeeCode;

        if (_liferayAspenReferenceRemoteModel != null) {
            try {
                Class<?> clazz = _liferayAspenReferenceRemoteModel.getClass();

                Method method = clazz.getMethod("setAspenEmployeeCode",
                        String.class);

                method.invoke(_liferayAspenReferenceRemoteModel,
                    aspenEmployeeCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLiferayAspenReferenceRemoteModel() {
        return _liferayAspenReferenceRemoteModel;
    }

    public void setLiferayAspenReferenceRemoteModel(
        BaseModel<?> liferayAspenReferenceRemoteModel) {
        _liferayAspenReferenceRemoteModel = liferayAspenReferenceRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _liferayAspenReferenceRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_liferayAspenReferenceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LiferayAspenReferenceLocalServiceUtil.addLiferayAspenReference(this);
        } else {
            LiferayAspenReferenceLocalServiceUtil.updateLiferayAspenReference(this);
        }
    }

    @Override
    public LiferayAspenReference toEscapedModel() {
        return (LiferayAspenReference) ProxyUtil.newProxyInstance(LiferayAspenReference.class.getClassLoader(),
            new Class[] { LiferayAspenReference.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LiferayAspenReferenceClp clone = new LiferayAspenReferenceClp();

        clone.setId(getId());
        clone.setLiferayUserId(getLiferayUserId());
        clone.setAspenEmployeeCode(getAspenEmployeeCode());

        return clone;
    }

    @Override
    public int compareTo(LiferayAspenReference liferayAspenReference) {
        long primaryKey = liferayAspenReference.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LiferayAspenReferenceClp)) {
            return false;
        }

        LiferayAspenReferenceClp liferayAspenReference = (LiferayAspenReferenceClp) obj;

        long primaryKey = liferayAspenReference.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", liferayUserId=");
        sb.append(getLiferayUserId());
        sb.append(", aspenEmployeeCode=");
        sb.append(getAspenEmployeeCode());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.owlafrica.servicebuilder.model.LiferayAspenReference");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
        sb.append(getLiferayUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aspenEmployeeCode</column-name><column-value><![CDATA[");
        sb.append(getAspenEmployeeCode());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
