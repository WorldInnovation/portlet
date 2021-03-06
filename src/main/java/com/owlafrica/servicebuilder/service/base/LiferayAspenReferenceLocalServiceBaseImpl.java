package com.owlafrica.servicebuilder.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.owlafrica.servicebuilder.model.LiferayAspenReference;
import com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalService;
import com.owlafrica.servicebuilder.service.persistence.LiferayAspenReferencePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the liferay aspen reference local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.owlafrica.servicebuilder.service.impl.LiferayAspenReferenceLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.owlafrica.servicebuilder.service.impl.LiferayAspenReferenceLocalServiceImpl
 * @see com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalServiceUtil
 * @generated
 */
public abstract class LiferayAspenReferenceLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements LiferayAspenReferenceLocalService,
        IdentifiableBean {
    @BeanReference(type = com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalService.class)
    protected com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalService liferayAspenReferenceLocalService;
    @BeanReference(type = com.owlafrica.servicebuilder.service.LiferayAspenReferenceService.class)
    protected com.owlafrica.servicebuilder.service.LiferayAspenReferenceService liferayAspenReferenceService;
    @BeanReference(type = LiferayAspenReferencePersistence.class)
    protected LiferayAspenReferencePersistence liferayAspenReferencePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private LiferayAspenReferenceLocalServiceClpInvoker _clpInvoker = new LiferayAspenReferenceLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalServiceUtil} to access the liferay aspen reference local service.
     */

    /**
     * Adds the liferay aspen reference to the database. Also notifies the appropriate model listeners.
     *
     * @param liferayAspenReference the liferay aspen reference
     * @return the liferay aspen reference that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public LiferayAspenReference addLiferayAspenReference(
        LiferayAspenReference liferayAspenReference) throws SystemException {
        liferayAspenReference.setNew(true);

        return liferayAspenReferencePersistence.update(liferayAspenReference);
    }

    /**
     * Creates a new liferay aspen reference with the primary key. Does not add the liferay aspen reference to the database.
     *
     * @param id the primary key for the new liferay aspen reference
     * @return the new liferay aspen reference
     */
    @Override
    public LiferayAspenReference createLiferayAspenReference(long id) {
        return liferayAspenReferencePersistence.create(id);
    }

    /**
     * Deletes the liferay aspen reference with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the liferay aspen reference
     * @return the liferay aspen reference that was removed
     * @throws PortalException if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public LiferayAspenReference deleteLiferayAspenReference(long id)
        throws PortalException, SystemException {
        return liferayAspenReferencePersistence.remove(id);
    }

    /**
     * Deletes the liferay aspen reference from the database. Also notifies the appropriate model listeners.
     *
     * @param liferayAspenReference the liferay aspen reference
     * @return the liferay aspen reference that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public LiferayAspenReference deleteLiferayAspenReference(
        LiferayAspenReference liferayAspenReference) throws SystemException {
        return liferayAspenReferencePersistence.remove(liferayAspenReference);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(LiferayAspenReference.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return liferayAspenReferencePersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.LiferayAspenReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return liferayAspenReferencePersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.LiferayAspenReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return liferayAspenReferencePersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return liferayAspenReferencePersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return liferayAspenReferencePersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public LiferayAspenReference fetchLiferayAspenReference(long id)
        throws SystemException {
        return liferayAspenReferencePersistence.fetchByPrimaryKey(id);
    }

    /**
     * Returns the liferay aspen reference with the primary key.
     *
     * @param id the primary key of the liferay aspen reference
     * @return the liferay aspen reference
     * @throws PortalException if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference getLiferayAspenReference(long id)
        throws PortalException, SystemException {
        return liferayAspenReferencePersistence.findByPrimaryKey(id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return liferayAspenReferencePersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the liferay aspen references.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.LiferayAspenReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of liferay aspen references
     * @param end the upper bound of the range of liferay aspen references (not inclusive)
     * @return the range of liferay aspen references
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LiferayAspenReference> getLiferayAspenReferences(int start,
        int end) throws SystemException {
        return liferayAspenReferencePersistence.findAll(start, end);
    }

    /**
     * Returns the number of liferay aspen references.
     *
     * @return the number of liferay aspen references
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getLiferayAspenReferencesCount() throws SystemException {
        return liferayAspenReferencePersistence.countAll();
    }

    /**
     * Updates the liferay aspen reference in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param liferayAspenReference the liferay aspen reference
     * @return the liferay aspen reference that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public LiferayAspenReference updateLiferayAspenReference(
        LiferayAspenReference liferayAspenReference) throws SystemException {
        return liferayAspenReferencePersistence.update(liferayAspenReference);
    }

    /**
     * Returns the liferay aspen reference local service.
     *
     * @return the liferay aspen reference local service
     */
    public com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalService getLiferayAspenReferenceLocalService() {
        return liferayAspenReferenceLocalService;
    }

    /**
     * Sets the liferay aspen reference local service.
     *
     * @param liferayAspenReferenceLocalService the liferay aspen reference local service
     */
    public void setLiferayAspenReferenceLocalService(
        com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalService liferayAspenReferenceLocalService) {
        this.liferayAspenReferenceLocalService = liferayAspenReferenceLocalService;
    }

    /**
     * Returns the liferay aspen reference remote service.
     *
     * @return the liferay aspen reference remote service
     */
    public com.owlafrica.servicebuilder.service.LiferayAspenReferenceService getLiferayAspenReferenceService() {
        return liferayAspenReferenceService;
    }

    /**
     * Sets the liferay aspen reference remote service.
     *
     * @param liferayAspenReferenceService the liferay aspen reference remote service
     */
    public void setLiferayAspenReferenceService(
        com.owlafrica.servicebuilder.service.LiferayAspenReferenceService liferayAspenReferenceService) {
        this.liferayAspenReferenceService = liferayAspenReferenceService;
    }

    /**
     * Returns the liferay aspen reference persistence.
     *
     * @return the liferay aspen reference persistence
     */
    public LiferayAspenReferencePersistence getLiferayAspenReferencePersistence() {
        return liferayAspenReferencePersistence;
    }

    /**
     * Sets the liferay aspen reference persistence.
     *
     * @param liferayAspenReferencePersistence the liferay aspen reference persistence
     */
    public void setLiferayAspenReferencePersistence(
        LiferayAspenReferencePersistence liferayAspenReferencePersistence) {
        this.liferayAspenReferencePersistence = liferayAspenReferencePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.owlafrica.servicebuilder.model.LiferayAspenReference",
            liferayAspenReferenceLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.owlafrica.servicebuilder.model.LiferayAspenReference");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return LiferayAspenReference.class;
    }

    protected String getModelClassName() {
        return LiferayAspenReference.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = liferayAspenReferencePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
