package com.owlafrica.servicebuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LiferayAspenReferenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReferenceService
 * @generated
 */
public class LiferayAspenReferenceServiceWrapper
    implements LiferayAspenReferenceService,
        ServiceWrapper<LiferayAspenReferenceService> {
    private LiferayAspenReferenceService _liferayAspenReferenceService;

    public LiferayAspenReferenceServiceWrapper(
        LiferayAspenReferenceService liferayAspenReferenceService) {
        _liferayAspenReferenceService = liferayAspenReferenceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _liferayAspenReferenceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _liferayAspenReferenceService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _liferayAspenReferenceService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LiferayAspenReferenceService getWrappedLiferayAspenReferenceService() {
        return _liferayAspenReferenceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLiferayAspenReferenceService(
        LiferayAspenReferenceService liferayAspenReferenceService) {
        _liferayAspenReferenceService = liferayAspenReferenceService;
    }

    @Override
    public LiferayAspenReferenceService getWrappedService() {
        return _liferayAspenReferenceService;
    }

    @Override
    public void setWrappedService(
        LiferayAspenReferenceService liferayAspenReferenceService) {
        _liferayAspenReferenceService = liferayAspenReferenceService;
    }
}
