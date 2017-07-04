package com.owlafrica.servicebuilder.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.owlafrica.servicebuilder.model.Department;
import com.owlafrica.servicebuilder.model.DepartmentModel;
import com.owlafrica.servicebuilder.model.DepartmentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Department service. Represents a row in the &quot;Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.owlafrica.servicebuilder.model.DepartmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DepartmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentImpl
 * @see com.owlafrica.servicebuilder.model.Department
 * @see com.owlafrica.servicebuilder.model.DepartmentModel
 * @generated
 */
@JSON(strict = true)
public class DepartmentModelImpl extends BaseModelImpl<Department>
    implements DepartmentModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a department model instance should use the {@link com.owlafrica.servicebuilder.model.Department} interface instead.
     */
    public static final String TABLE_NAME = "Department";
    public static final Object[][] TABLE_COLUMNS = {
            { "Department_id", Types.BIGINT },
            { "Department_name", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Department (Department_id LONG not null primary key,Department_name VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table Department";
    public static final String ORDER_BY_JPQL = " ORDER BY department.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Department.Department_id ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.owlafrica.servicebuilder.model.Department"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.owlafrica.servicebuilder.model.Department"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.owlafrica.servicebuilder.model.Department"));
    private static ClassLoader _classLoader = Department.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Department.class
        };
    private long _id;
    private String _name;
    private Department _escapedModel;

    public DepartmentModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Department toModel(DepartmentSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Department model = new DepartmentImpl();

        model.setId(soapModel.getId());
        model.setName(soapModel.getName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Department> toModels(DepartmentSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Department> models = new ArrayList<Department>(soapModels.length);

        for (DepartmentSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return Department.class;
    }

    @Override
    public String getModelClassName() {
        return Department.class.getName();
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

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Department.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Department toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Department) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DepartmentImpl departmentImpl = new DepartmentImpl();

        departmentImpl.setId(getId());
        departmentImpl.setName(getName());

        departmentImpl.resetOriginalValues();

        return departmentImpl;
    }

    @Override
    public int compareTo(Department department) {
        long primaryKey = department.getPrimaryKey();

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

        if (!(obj instanceof Department)) {
            return false;
        }

        Department department = (Department) obj;

        long primaryKey = department.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Department> toCacheModel() {
        DepartmentCacheModel departmentCacheModel = new DepartmentCacheModel();

        departmentCacheModel.id = getId();

        departmentCacheModel.name = getName();

        String name = departmentCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            departmentCacheModel.name = null;
        }

        return departmentCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.owlafrica.servicebuilder.model.Department");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
