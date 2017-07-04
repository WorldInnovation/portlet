package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.owlafrica.servicebuilder.model.LiferayAspenReference;
import com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LiferayAspenReferenceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LiferayAspenReferenceActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(LiferayAspenReferenceLocalServiceUtil.getService());
        setClass(LiferayAspenReference.class);

        setClassLoader(com.owlafrica.servicebuilder.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
