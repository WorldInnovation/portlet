package com.owlafrica.servicebuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DepLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DepLocalService
 * @generated
 */
public class DepLocalServiceWrapper implements DepLocalService,
    ServiceWrapper<DepLocalService> {
    private DepLocalService _depLocalService;

    public DepLocalServiceWrapper(DepLocalService depLocalService) {
        _depLocalService = depLocalService;
    }

    /**
    * Adds the dep to the database. Also notifies the appropriate model listeners.
    *
    * @param dep the dep
    * @return the dep that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.owlafrica.servicebuilder.model.Dep addDep(
        com.owlafrica.servicebuilder.model.Dep dep)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.addDep(dep);
    }

    /**
    * Creates a new dep with the primary key. Does not add the dep to the database.
    *
    * @param id the primary key for the new dep
    * @return the new dep
    */
    @Override
    public com.owlafrica.servicebuilder.model.Dep createDep(long id) {
        return _depLocalService.createDep(id);
    }

    /**
    * Deletes the dep with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the dep
    * @return the dep that was removed
    * @throws PortalException if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.owlafrica.servicebuilder.model.Dep deleteDep(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.deleteDep(id);
    }

    /**
    * Deletes the dep from the database. Also notifies the appropriate model listeners.
    *
    * @param dep the dep
    * @return the dep that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.owlafrica.servicebuilder.model.Dep deleteDep(
        com.owlafrica.servicebuilder.model.Dep dep)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.deleteDep(dep);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _depLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.DepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.DepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.owlafrica.servicebuilder.model.Dep fetchDep(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.fetchDep(id);
    }

    /**
    * Returns the dep with the primary key.
    *
    * @param id the primary key of the dep
    * @return the dep
    * @throws PortalException if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.owlafrica.servicebuilder.model.Dep getDep(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.getDep(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the deps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.DepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of deps
    * @param end the upper bound of the range of deps (not inclusive)
    * @return the range of deps
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.owlafrica.servicebuilder.model.Dep> getDeps(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.getDeps(start, end);
    }

    /**
    * Returns the number of deps.
    *
    * @return the number of deps
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDepsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.getDepsCount();
    }

    /**
    * Updates the dep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param dep the dep
    * @return the dep that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.owlafrica.servicebuilder.model.Dep updateDep(
        com.owlafrica.servicebuilder.model.Dep dep)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _depLocalService.updateDep(dep);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _depLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _depLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _depLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DepLocalService getWrappedDepLocalService() {
        return _depLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDepLocalService(DepLocalService depLocalService) {
        _depLocalService = depLocalService;
    }

    @Override
    public DepLocalService getWrappedService() {
        return _depLocalService;
    }

    @Override
    public void setWrappedService(DepLocalService depLocalService) {
        _depLocalService = depLocalService;
    }
}
