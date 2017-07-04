package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.owlafrica.servicebuilder.model.Dep;

import java.util.List;

/**
 * The persistence utility for the dep service. This utility wraps {@link DepPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepPersistence
 * @see DepPersistenceImpl
 * @generated
 */
public class DepUtil {
    private static DepPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Dep dep) {
        getPersistence().clearCache(dep);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Dep> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Dep> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Dep> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Dep update(Dep dep) throws SystemException {
        return getPersistence().update(dep);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Dep update(Dep dep, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(dep, serviceContext);
    }

    /**
    * Caches the dep in the entity cache if it is enabled.
    *
    * @param dep the dep
    */
    public static void cacheResult(com.owlafrica.servicebuilder.model.Dep dep) {
        getPersistence().cacheResult(dep);
    }

    /**
    * Caches the deps in the entity cache if it is enabled.
    *
    * @param deps the deps
    */
    public static void cacheResult(
        java.util.List<com.owlafrica.servicebuilder.model.Dep> deps) {
        getPersistence().cacheResult(deps);
    }

    /**
    * Creates a new dep with the primary key. Does not add the dep to the database.
    *
    * @param id the primary key for the new dep
    * @return the new dep
    */
    public static com.owlafrica.servicebuilder.model.Dep create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the dep with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the dep
    * @return the dep that was removed
    * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.owlafrica.servicebuilder.model.Dep remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchDepException {
        return getPersistence().remove(id);
    }

    public static com.owlafrica.servicebuilder.model.Dep updateImpl(
        com.owlafrica.servicebuilder.model.Dep dep)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(dep);
    }

    /**
    * Returns the dep with the primary key or throws a {@link com.owlafrica.servicebuilder.NoSuchDepException} if it could not be found.
    *
    * @param id the primary key of the dep
    * @return the dep
    * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.owlafrica.servicebuilder.model.Dep findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchDepException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the dep with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the dep
    * @return the dep, or <code>null</code> if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.owlafrica.servicebuilder.model.Dep fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the deps.
    *
    * @return the deps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.owlafrica.servicebuilder.model.Dep> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.owlafrica.servicebuilder.model.Dep> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the deps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.DepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of deps
    * @param end the upper bound of the range of deps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of deps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.owlafrica.servicebuilder.model.Dep> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the deps from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of deps.
    *
    * @return the number of deps
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DepPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DepPersistence) PortletBeanLocatorUtil.locate(com.owlafrica.servicebuilder.service.ClpSerializer.getServletContextName(),
                    DepPersistence.class.getName());

            ReferenceRegistry.registerReference(DepUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DepPersistence persistence) {
    }
}
