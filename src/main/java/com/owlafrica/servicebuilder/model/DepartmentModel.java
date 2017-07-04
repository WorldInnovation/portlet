package com.owlafrica.servicebuilder.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Department service. Represents a row in the &quot;Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.owlafrica.servicebuilder.model.impl.DepartmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.owlafrica.servicebuilder.model.impl.DepartmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @see com.owlafrica.servicebuilder.model.impl.DepartmentImpl
 * @see com.owlafrica.servicebuilder.model.impl.DepartmentModelImpl
 * @generated
 */
public interface DepartmentModel extends BaseModel<Department> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a department model instance should use the {@link Department} interface instead.
     */

    /**
     * Returns the primary key of this department.
     *
     * @return the primary key of this department
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this department.
     *
     * @param primaryKey the primary key of this department
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this department.
     *
     * @return the ID of this department
     */
    public long getId();

    /**
     * Sets the ID of this department.
     *
     * @param id the ID of this department
     */
    public void setId(long id);

    /**
     * Returns the name of this department.
     *
     * @return the name of this department
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this department.
     *
     * @param name the name of this department
     */
    public void setName(String name);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.owlafrica.servicebuilder.model.Department department);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.owlafrica.servicebuilder.model.Department> toCacheModel();

    @Override
    public com.owlafrica.servicebuilder.model.Department toEscapedModel();

    @Override
    public com.owlafrica.servicebuilder.model.Department toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
