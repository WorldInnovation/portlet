package com.owlafrica.servicebuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LiferayAspenReference}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReference
 * @generated
 */
public class LiferayAspenReferenceWrapper implements LiferayAspenReference,
    ModelWrapper<LiferayAspenReference> {
    private LiferayAspenReference _liferayAspenReference;

    public LiferayAspenReferenceWrapper(
        LiferayAspenReference liferayAspenReference) {
        _liferayAspenReference = liferayAspenReference;
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

    /**
    * Returns the primary key of this liferay aspen reference.
    *
    * @return the primary key of this liferay aspen reference
    */
    @Override
    public long getPrimaryKey() {
        return _liferayAspenReference.getPrimaryKey();
    }

    /**
    * Sets the primary key of this liferay aspen reference.
    *
    * @param primaryKey the primary key of this liferay aspen reference
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _liferayAspenReference.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this liferay aspen reference.
    *
    * @return the ID of this liferay aspen reference
    */
    @Override
    public long getId() {
        return _liferayAspenReference.getId();
    }

    /**
    * Sets the ID of this liferay aspen reference.
    *
    * @param id the ID of this liferay aspen reference
    */
    @Override
    public void setId(long id) {
        _liferayAspenReference.setId(id);
    }

    /**
    * Returns the liferay user ID of this liferay aspen reference.
    *
    * @return the liferay user ID of this liferay aspen reference
    */
    @Override
    public long getLiferayUserId() {
        return _liferayAspenReference.getLiferayUserId();
    }

    /**
    * Sets the liferay user ID of this liferay aspen reference.
    *
    * @param liferayUserId the liferay user ID of this liferay aspen reference
    */
    @Override
    public void setLiferayUserId(long liferayUserId) {
        _liferayAspenReference.setLiferayUserId(liferayUserId);
    }

    /**
    * Returns the liferay user uuid of this liferay aspen reference.
    *
    * @return the liferay user uuid of this liferay aspen reference
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getLiferayUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _liferayAspenReference.getLiferayUserUuid();
    }

    /**
    * Sets the liferay user uuid of this liferay aspen reference.
    *
    * @param liferayUserUuid the liferay user uuid of this liferay aspen reference
    */
    @Override
    public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
        _liferayAspenReference.setLiferayUserUuid(liferayUserUuid);
    }

    /**
    * Returns the aspen employee code of this liferay aspen reference.
    *
    * @return the aspen employee code of this liferay aspen reference
    */
    @Override
    public java.lang.String getAspenEmployeeCode() {
        return _liferayAspenReference.getAspenEmployeeCode();
    }

    /**
    * Sets the aspen employee code of this liferay aspen reference.
    *
    * @param aspenEmployeeCode the aspen employee code of this liferay aspen reference
    */
    @Override
    public void setAspenEmployeeCode(java.lang.String aspenEmployeeCode) {
        _liferayAspenReference.setAspenEmployeeCode(aspenEmployeeCode);
    }

    @Override
    public boolean isNew() {
        return _liferayAspenReference.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _liferayAspenReference.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _liferayAspenReference.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _liferayAspenReference.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _liferayAspenReference.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _liferayAspenReference.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _liferayAspenReference.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _liferayAspenReference.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _liferayAspenReference.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _liferayAspenReference.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _liferayAspenReference.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LiferayAspenReferenceWrapper((LiferayAspenReference) _liferayAspenReference.clone());
    }

    @Override
    public int compareTo(
        com.owlafrica.servicebuilder.model.LiferayAspenReference liferayAspenReference) {
        return _liferayAspenReference.compareTo(liferayAspenReference);
    }

    @Override
    public int hashCode() {
        return _liferayAspenReference.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.owlafrica.servicebuilder.model.LiferayAspenReference> toCacheModel() {
        return _liferayAspenReference.toCacheModel();
    }

    @Override
    public com.owlafrica.servicebuilder.model.LiferayAspenReference toEscapedModel() {
        return new LiferayAspenReferenceWrapper(_liferayAspenReference.toEscapedModel());
    }

    @Override
    public com.owlafrica.servicebuilder.model.LiferayAspenReference toUnescapedModel() {
        return new LiferayAspenReferenceWrapper(_liferayAspenReference.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _liferayAspenReference.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _liferayAspenReference.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _liferayAspenReference.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LiferayAspenReferenceWrapper)) {
            return false;
        }

        LiferayAspenReferenceWrapper liferayAspenReferenceWrapper = (LiferayAspenReferenceWrapper) obj;

        if (Validator.equals(_liferayAspenReference,
                    liferayAspenReferenceWrapper._liferayAspenReference)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public LiferayAspenReference getWrappedLiferayAspenReference() {
        return _liferayAspenReference;
    }

    @Override
    public LiferayAspenReference getWrappedModel() {
        return _liferayAspenReference;
    }

    @Override
    public void resetOriginalValues() {
        _liferayAspenReference.resetOriginalValues();
    }
}
