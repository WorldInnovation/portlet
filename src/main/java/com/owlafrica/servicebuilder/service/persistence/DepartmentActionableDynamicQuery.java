package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.owlafrica.servicebuilder.model.Department;
import com.owlafrica.servicebuilder.service.DepartmentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DepartmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DepartmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DepartmentLocalServiceUtil.getService());
        setClass(Department.class);

        setClassLoader(com.owlafrica.servicebuilder.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
