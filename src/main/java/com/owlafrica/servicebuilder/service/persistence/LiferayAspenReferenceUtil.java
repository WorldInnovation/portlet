package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.owlafrica.servicebuilder.model.LiferayAspenReference;

import java.util.List;

/**
 * The persistence utility for the liferay aspen reference service. This utility wraps {@link LiferayAspenReferencePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReferencePersistence
 * @see LiferayAspenReferencePersistenceImpl
 * @generated
 */
public class LiferayAspenReferenceUtil {
    private static LiferayAspenReferencePersistence _persistence;

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
    public static void clearCache(LiferayAspenReference liferayAspenReference) {
        getPersistence().clearCache(liferayAspenReference);
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
    public static List<LiferayAspenReference> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LiferayAspenReference> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LiferayAspenReference> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static LiferayAspenReference update(
        LiferayAspenReference liferayAspenReference) throws SystemException {
        return getPersistence().update(liferayAspenReference);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static LiferayAspenReference update(
        LiferayAspenReference liferayAspenReference,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(liferayAspenReference, serviceContext);
    }

    /**
    * Caches the liferay aspen reference in the entity cache if it is enabled.
    *
    * @param liferayAspenReference the liferay aspen reference
    */
    public static void cacheResult(
        com.owlafrica.servicebuilder.model.LiferayAspenReference liferayAspenReference) {
        getPersistence().cacheResult(liferayAspenReference);
    }

    /**
    * Caches the liferay aspen references in the entity cache if it is enabled.
    *
    * @param liferayAspenReferences the liferay aspen references
    */
    public static void cacheResult(
        java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> liferayAspenReferences) {
        getPersistence().cacheResult(liferayAspenReferences);
    }

    /**
    * Creates a new liferay aspen reference with the primary key. Does not add the liferay aspen reference to the database.
    *
    * @param id the primary key for the new liferay aspen reference
    * @return the new liferay aspen reference
    */
    public static com.owlafrica.servicebuilder.model.LiferayAspenReference create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the liferay aspen reference with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the liferay aspen reference
    * @return the liferay aspen reference that was removed
    * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.owlafrica.servicebuilder.model.LiferayAspenReference remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException {
        return getPersistence().remove(id);
    }

    public static com.owlafrica.servicebuilder.model.LiferayAspenReference updateImpl(
        com.owlafrica.servicebuilder.model.LiferayAspenReference liferayAspenReference)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(liferayAspenReference);
    }

    /**
    * Returns the liferay aspen reference with the primary key or throws a {@link com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException} if it could not be found.
    *
    * @param id the primary key of the liferay aspen reference
    * @return the liferay aspen reference
    * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.owlafrica.servicebuilder.model.LiferayAspenReference findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the liferay aspen reference with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the liferay aspen reference
    * @return the liferay aspen reference, or <code>null</code> if a liferay aspen reference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.owlafrica.servicebuilder.model.LiferayAspenReference fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the liferay aspen references.
    *
    * @return the liferay aspen references
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the liferay aspen references.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.owlafrica.servicebuilder.model.impl.LiferayAspenReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of liferay aspen references
    * @param end the upper bound of the range of liferay aspen references (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of liferay aspen references
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the liferay aspen references from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of liferay aspen references.
    *
    * @return the number of liferay aspen references
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LiferayAspenReferencePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LiferayAspenReferencePersistence) PortletBeanLocatorUtil.locate(com.owlafrica.servicebuilder.service.ClpSerializer.getServletContextName(),
                    LiferayAspenReferencePersistence.class.getName());

            ReferenceRegistry.registerReference(LiferayAspenReferenceUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LiferayAspenReferencePersistence persistence) {
    }
}
