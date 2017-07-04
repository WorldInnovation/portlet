package com.owlafrica.servicebuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DepService}.
 *
 * @author Brian Wing Shun Chan
 * @see DepService
 * @generated
 */
public class DepServiceWrapper implements DepService,
    ServiceWrapper<DepService> {
    private DepService _depService;

    public DepServiceWrapper(DepService depService) {
        _depService = depService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _depService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _depService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _depService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DepService getWrappedDepService() {
        return _depService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDepService(DepService depService) {
        _depService = depService;
    }

    @Override
    public DepService getWrappedService() {
        return _depService;
    }

    @Override
    public void setWrappedService(DepService depService) {
        _depService = depService;
    }
}
