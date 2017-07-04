package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.owlafrica.servicebuilder.model.Dep;

/**
 * The persistence interface for the dep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepPersistenceImpl
 * @see DepUtil
 * @generated
 */
public interface DepPersistence extends BasePersistence<Dep> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DepUtil} to access the dep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the dep in the entity cache if it is enabled.
    *
    * @param dep the dep
    */
    public void cacheResult(com.owlafrica.servicebuilder.model.Dep dep);

    /**
    * Caches the deps in the entity cache if it is enabled.
    *
    * @param deps the deps
    */
    public void cacheResult(
        java.util.List<com.owlafrica.servicebuilder.model.Dep> deps);

    /**
    * Creates a new dep with the primary key. Does not add the dep to the database.
    *
    * @param id the primary key for the new dep
    * @return the new dep
    */
    public com.owlafrica.servicebuilder.model.Dep create(long id);

    /**
    * Removes the dep with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the dep
    * @return the dep that was removed
    * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.owlafrica.servicebuilder.model.Dep remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchDepException;

    public com.owlafrica.servicebuilder.model.Dep updateImpl(
        com.owlafrica.servicebuilder.model.Dep dep)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the dep with the primary key or throws a {@link com.owlafrica.servicebuilder.NoSuchDepException} if it could not be found.
    *
    * @param id the primary key of the dep
    * @return the dep
    * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.owlafrica.servicebuilder.model.Dep findByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchDepException;

    /**
    * Returns the dep with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the dep
    * @return the dep, or <code>null</code> if a dep with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.owlafrica.servicebuilder.model.Dep fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the deps.
    *
    * @return the deps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.owlafrica.servicebuilder.model.Dep> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.owlafrica.servicebuilder.model.Dep> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.owlafrica.servicebuilder.model.Dep> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the deps from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of deps.
    *
    * @return the number of deps
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
