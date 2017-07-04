package com.owlafrica.servicebuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Dep}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Dep
 * @generated
 */
public class DepWrapper implements Dep, ModelWrapper<Dep> {
    private Dep _dep;

    public DepWrapper(Dep dep) {
        _dep = dep;
    }

    @Override
    public Class<?> getModelClass() {
        return Dep.class;
    }

    @Override
    public String getModelClassName() {
        return Dep.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this dep.
    *
    * @return the primary key of this dep
    */
    @Override
    public long getPrimaryKey() {
        return _dep.getPrimaryKey();
    }

    /**
    * Sets the primary key of this dep.
    *
    * @param primaryKey the primary key of this dep
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _dep.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this dep.
    *
    * @return the ID of this dep
    */
    @Override
    public long getId() {
        return _dep.getId();
    }

    /**
    * Sets the ID of this dep.
    *
    * @param id the ID of this dep
    */
    @Override
    public void setId(long id) {
        _dep.setId(id);
    }

    /**
    * Returns the name of this dep.
    *
    * @return the name of this dep
    */
    @Override
    public java.lang.String getName() {
        return _dep.getName();
    }

    /**
    * Sets the name of this dep.
    *
    * @param name the name of this dep
    */
    @Override
    public void setName(java.lang.String name) {
        _dep.setName(name);
    }

    @Override
    public boolean isNew() {
        return _dep.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _dep.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _dep.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _dep.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _dep.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _dep.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _dep.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _dep.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _dep.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _dep.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _dep.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DepWrapper((Dep) _dep.clone());
    }

    @Override
    public int compareTo(com.owlafrica.servicebuilder.model.Dep dep) {
        return _dep.compareTo(dep);
    }

    @Override
    public int hashCode() {
        return _dep.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.owlafrica.servicebuilder.model.Dep> toCacheModel() {
        return _dep.toCacheModel();
    }

    @Override
    public com.owlafrica.servicebuilder.model.Dep toEscapedModel() {
        return new DepWrapper(_dep.toEscapedModel());
    }

    @Override
    public com.owlafrica.servicebuilder.model.Dep toUnescapedModel() {
        return new DepWrapper(_dep.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _dep.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _dep.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _dep.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DepWrapper)) {
            return false;
        }

        DepWrapper depWrapper = (DepWrapper) obj;

        if (Validator.equals(_dep, depWrapper._dep)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Dep getWrappedDep() {
        return _dep;
    }

    @Override
    public Dep getWrappedModel() {
        return _dep;
    }

    @Override
    public void resetOriginalValues() {
        _dep.resetOriginalValues();
    }
}
