package com.owlafrica.servicebuilder.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException;
import com.owlafrica.servicebuilder.model.LiferayAspenReference;
import com.owlafrica.servicebuilder.model.impl.LiferayAspenReferenceImpl;
import com.owlafrica.servicebuilder.model.impl.LiferayAspenReferenceModelImpl;
import com.owlafrica.servicebuilder.service.persistence.LiferayAspenReferencePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the liferay aspen reference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReferencePersistence
 * @see LiferayAspenReferenceUtil
 * @generated
 */
public class LiferayAspenReferencePersistenceImpl extends BasePersistenceImpl<LiferayAspenReference>
    implements LiferayAspenReferencePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LiferayAspenReferenceUtil} to access the liferay aspen reference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LiferayAspenReferenceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
            LiferayAspenReferenceModelImpl.FINDER_CACHE_ENABLED,
            LiferayAspenReferenceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
            LiferayAspenReferenceModelImpl.FINDER_CACHE_ENABLED,
            LiferayAspenReferenceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
            LiferayAspenReferenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LIFERAYASPENREFERENCE = "SELECT liferayAspenReference FROM LiferayAspenReference liferayAspenReference";
    private static final String _SQL_COUNT_LIFERAYASPENREFERENCE = "SELECT COUNT(liferayAspenReference) FROM LiferayAspenReference liferayAspenReference";
    private static final String _ORDER_BY_ENTITY_ALIAS = "liferayAspenReference.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LiferayAspenReference exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LiferayAspenReferencePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "liferayUserId", "aspenEmployeeCode"
            });
    private static LiferayAspenReference _nullLiferayAspenReference = new LiferayAspenReferenceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LiferayAspenReference> toCacheModel() {
                return _nullLiferayAspenReferenceCacheModel;
            }
        };

    private static CacheModel<LiferayAspenReference> _nullLiferayAspenReferenceCacheModel =
        new CacheModel<LiferayAspenReference>() {
            @Override
            public LiferayAspenReference toEntityModel() {
                return _nullLiferayAspenReference;
            }
        };

    public LiferayAspenReferencePersistenceImpl() {
        setModelClass(LiferayAspenReference.class);
    }

    /**
     * Caches the liferay aspen reference in the entity cache if it is enabled.
     *
     * @param liferayAspenReference the liferay aspen reference
     */
    @Override
    public void cacheResult(LiferayAspenReference liferayAspenReference) {
        EntityCacheUtil.putResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
            LiferayAspenReferenceImpl.class,
            liferayAspenReference.getPrimaryKey(), liferayAspenReference);

        liferayAspenReference.resetOriginalValues();
    }

    /**
     * Caches the liferay aspen references in the entity cache if it is enabled.
     *
     * @param liferayAspenReferences the liferay aspen references
     */
    @Override
    public void cacheResult(List<LiferayAspenReference> liferayAspenReferences) {
        for (LiferayAspenReference liferayAspenReference : liferayAspenReferences) {
            if (EntityCacheUtil.getResult(
                        LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
                        LiferayAspenReferenceImpl.class,
                        liferayAspenReference.getPrimaryKey()) == null) {
                cacheResult(liferayAspenReference);
            } else {
                liferayAspenReference.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all liferay aspen references.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LiferayAspenReferenceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LiferayAspenReferenceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the liferay aspen reference.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LiferayAspenReference liferayAspenReference) {
        EntityCacheUtil.removeResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
            LiferayAspenReferenceImpl.class,
            liferayAspenReference.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<LiferayAspenReference> liferayAspenReferences) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LiferayAspenReference liferayAspenReference : liferayAspenReferences) {
            EntityCacheUtil.removeResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
                LiferayAspenReferenceImpl.class,
                liferayAspenReference.getPrimaryKey());
        }
    }

    /**
     * Creates a new liferay aspen reference with the primary key. Does not add the liferay aspen reference to the database.
     *
     * @param id the primary key for the new liferay aspen reference
     * @return the new liferay aspen reference
     */
    @Override
    public LiferayAspenReference create(long id) {
        LiferayAspenReference liferayAspenReference = new LiferayAspenReferenceImpl();

        liferayAspenReference.setNew(true);
        liferayAspenReference.setPrimaryKey(id);

        return liferayAspenReference;
    }

    /**
     * Removes the liferay aspen reference with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the liferay aspen reference
     * @return the liferay aspen reference that was removed
     * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference remove(long id)
        throws NoSuchLiferayAspenReferenceException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the liferay aspen reference with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the liferay aspen reference
     * @return the liferay aspen reference that was removed
     * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference remove(Serializable primaryKey)
        throws NoSuchLiferayAspenReferenceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LiferayAspenReference liferayAspenReference = (LiferayAspenReference) session.get(LiferayAspenReferenceImpl.class,
                    primaryKey);

            if (liferayAspenReference == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLiferayAspenReferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(liferayAspenReference);
        } catch (NoSuchLiferayAspenReferenceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LiferayAspenReference removeImpl(
        LiferayAspenReference liferayAspenReference) throws SystemException {
        liferayAspenReference = toUnwrappedModel(liferayAspenReference);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(liferayAspenReference)) {
                liferayAspenReference = (LiferayAspenReference) session.get(LiferayAspenReferenceImpl.class,
                        liferayAspenReference.getPrimaryKeyObj());
            }

            if (liferayAspenReference != null) {
                session.delete(liferayAspenReference);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (liferayAspenReference != null) {
            clearCache(liferayAspenReference);
        }

        return liferayAspenReference;
    }

    @Override
    public LiferayAspenReference updateImpl(
        com.owlafrica.servicebuilder.model.LiferayAspenReference liferayAspenReference)
        throws SystemException {
        liferayAspenReference = toUnwrappedModel(liferayAspenReference);

        boolean isNew = liferayAspenReference.isNew();

        Session session = null;

        try {
            session = openSession();

            if (liferayAspenReference.isNew()) {
                session.save(liferayAspenReference);

                liferayAspenReference.setNew(false);
            } else {
                session.merge(liferayAspenReference);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
            LiferayAspenReferenceImpl.class,
            liferayAspenReference.getPrimaryKey(), liferayAspenReference);

        return liferayAspenReference;
    }

    protected LiferayAspenReference toUnwrappedModel(
        LiferayAspenReference liferayAspenReference) {
        if (liferayAspenReference instanceof LiferayAspenReferenceImpl) {
            return liferayAspenReference;
        }

        LiferayAspenReferenceImpl liferayAspenReferenceImpl = new LiferayAspenReferenceImpl();

        liferayAspenReferenceImpl.setNew(liferayAspenReference.isNew());
        liferayAspenReferenceImpl.setPrimaryKey(liferayAspenReference.getPrimaryKey());

        liferayAspenReferenceImpl.setId(liferayAspenReference.getId());
        liferayAspenReferenceImpl.setLiferayUserId(liferayAspenReference.getLiferayUserId());
        liferayAspenReferenceImpl.setAspenEmployeeCode(liferayAspenReference.getAspenEmployeeCode());

        return liferayAspenReferenceImpl;
    }

    /**
     * Returns the liferay aspen reference with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the liferay aspen reference
     * @return the liferay aspen reference
     * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLiferayAspenReferenceException, SystemException {
        LiferayAspenReference liferayAspenReference = fetchByPrimaryKey(primaryKey);

        if (liferayAspenReference == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLiferayAspenReferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return liferayAspenReference;
    }

    /**
     * Returns the liferay aspen reference with the primary key or throws a {@link com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException} if it could not be found.
     *
     * @param id the primary key of the liferay aspen reference
     * @return the liferay aspen reference
     * @throws com.owlafrica.servicebuilder.NoSuchLiferayAspenReferenceException if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference findByPrimaryKey(long id)
        throws NoSuchLiferayAspenReferenceException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the liferay aspen reference with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the liferay aspen reference
     * @return the liferay aspen reference, or <code>null</code> if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        LiferayAspenReference liferayAspenReference = (LiferayAspenReference) EntityCacheUtil.getResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
                LiferayAspenReferenceImpl.class, primaryKey);

        if (liferayAspenReference == _nullLiferayAspenReference) {
            return null;
        }

        if (liferayAspenReference == null) {
            Session session = null;

            try {
                session = openSession();

                liferayAspenReference = (LiferayAspenReference) session.get(LiferayAspenReferenceImpl.class,
                        primaryKey);

                if (liferayAspenReference != null) {
                    cacheResult(liferayAspenReference);
                } else {
                    EntityCacheUtil.putResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
                        LiferayAspenReferenceImpl.class, primaryKey,
                        _nullLiferayAspenReference);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LiferayAspenReferenceModelImpl.ENTITY_CACHE_ENABLED,
                    LiferayAspenReferenceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return liferayAspenReference;
    }

    /**
     * Returns the liferay aspen reference with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the liferay aspen reference
     * @return the liferay aspen reference, or <code>null</code> if a liferay aspen reference with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LiferayAspenReference fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the liferay aspen references.
     *
     * @return the liferay aspen references
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LiferayAspenReference> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<LiferayAspenReference> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<LiferayAspenReference> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<LiferayAspenReference> list = (List<LiferayAspenReference>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LIFERAYASPENREFERENCE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LIFERAYASPENREFERENCE;

                if (pagination) {
                    sql = sql.concat(LiferayAspenReferenceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<LiferayAspenReference>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LiferayAspenReference>(list);
                } else {
                    list = (List<LiferayAspenReference>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the liferay aspen references from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (LiferayAspenReference liferayAspenReference : findAll()) {
            remove(liferayAspenReference);
        }
    }

    /**
     * Returns the number of liferay aspen references.
     *
     * @return the number of liferay aspen references
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LIFERAYASPENREFERENCE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the liferay aspen reference persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.owlafrica.servicebuilder.model.LiferayAspenReference")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LiferayAspenReference>> listenersList = new ArrayList<ModelListener<LiferayAspenReference>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LiferayAspenReference>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LiferayAspenReferenceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
