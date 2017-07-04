package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.owlafrica.servicebuilder.model.LiferayAspenReference;

/**
 * The persistence interface for the liferay aspen reference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReferencePersistenceImpl
 * @see LiferayAspenReferenceUtil
 * @generated
 */
public interface LiferayAspenReferencePersistence extends BasePersistence<LiferayAspenReference> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LiferayAspenReferenceUtil} to access the liferay aspen reference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the liferay aspen reference in the entity cache if it is enabled.
    *
    * @param liferayAspenReference the liferay aspen reference
    */
    public void cacheResult(
        com.owlafrica.servicebuilder.model.LiferayAspenReference liferayAspenReference);

    /**
    * Caches the liferay aspen references in the entity cache if it is enabled.
    *
    * @param liferayAspenReferences the liferay aspen references
    */
    public void cacheResult(
        java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> liferayAspenReferences);

    /**
    * Creates a new liferay aspen reference with the primary key. Does not add the liferay aspen reference to the database.
    *
    * @param id the primary key for the new liferay aspen reference
    * @return the new liferay aspen reference
    */
    public com.owlafrica.servicebuilder.model.LiferayAspenReference create(
        long id);

    /**
    * Removes the liferay aspen reference with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the liferay aspen reference
    * @return the liferay aspen reference that was removed
    * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.owlafrica.servicebuilder.model.LiferayAspenReference remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException;

    public com.owlafrica.servicebuilder.model.LiferayAspenReference updateImpl(
        com.owlafrica.servicebuilder.model.LiferayAspenReference liferayAspenReference)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the liferay aspen reference with the primary key or throws a {@link com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException} if it could not be found.
    *
    * @param id the primary key of the liferay aspen reference
    * @return the liferay aspen reference
    * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.owlafrica.servicebuilder.model.LiferayAspenReference findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException;

    /**
    * Returns the liferay aspen reference with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the liferay aspen reference
    * @return the liferay aspen reference, or <code>null</code> if a liferay aspen reference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.owlafrica.servicebuilder.model.LiferayAspenReference fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the liferay aspen references.
    *
    * @return the liferay aspen references
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.owlafrica.servicebuilder.model.LiferayAspenReference> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the liferay aspen references from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of liferay aspen references.
    *
    * @return the number of liferay aspen references
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
