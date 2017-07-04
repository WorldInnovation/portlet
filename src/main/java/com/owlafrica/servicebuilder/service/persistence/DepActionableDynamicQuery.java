package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.owlafrica.servicebuilder.model.Dep;
import com.owlafrica.servicebuilder.service.DepLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DepActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DepActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DepLocalServiceUtil.getService());
        setClass(Dep.class);

        setClassLoader(com.owlafrica.servicebuilder.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
