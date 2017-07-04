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

import com.owlafrica.servicebuilder.NoSuchDepException;
import com.owlafrica.servicebuilder.model.Dep;
import com.owlafrica.servicebuilder.model.impl.DepImpl;
import com.owlafrica.servicebuilder.model.impl.DepModelImpl;
import com.owlafrica.servicebuilder.service.persistence.DepPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepPersistence
 * @see DepUtil
 * @generated
 */
public class DepPersistenceImpl extends BasePersistenceImpl<Dep>
    implements DepPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DepUtil} to access the dep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DepImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DepModelImpl.ENTITY_CACHE_ENABLED,
            DepModelImpl.FINDER_CACHE_ENABLED, DepImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DepModelImpl.ENTITY_CACHE_ENABLED,
            DepModelImpl.FINDER_CACHE_ENABLED, DepImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DepModelImpl.ENTITY_CACHE_ENABLED,
            DepModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DEP = "SELECT dep FROM Dep dep";
    private static final String _SQL_COUNT_DEP = "SELECT COUNT(dep) FROM Dep dep";
    private static final String _ORDER_BY_ENTITY_ALIAS = "dep.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Dep exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DepPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "name"
            });
    private static Dep _nullDep = new DepImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Dep> toCacheModel() {
                return _nullDepCacheModel;
            }
        };

    private static CacheModel<Dep> _nullDepCacheModel = new CacheModel<Dep>() {
            @Override
            public Dep toEntityModel() {
                return _nullDep;
            }
        };

    public DepPersistenceImpl() {
        setModelClass(Dep.class);
    }

    /**
     * Caches the dep in the entity cache if it is enabled.
     *
     * @param dep the dep
     */
    @Override
    public void cacheResult(Dep dep) {
        EntityCacheUtil.putResult(DepModelImpl.ENTITY_CACHE_ENABLED,
            DepImpl.class, dep.getPrimaryKey(), dep);

        dep.resetOriginalValues();
    }

    /**
     * Caches the deps in the entity cache if it is enabled.
     *
     * @param deps the deps
     */
    @Override
    public void cacheResult(List<Dep> deps) {
        for (Dep dep : deps) {
            if (EntityCacheUtil.getResult(DepModelImpl.ENTITY_CACHE_ENABLED,
                        DepImpl.class, dep.getPrimaryKey()) == null) {
                cacheResult(dep);
            } else {
                dep.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all deps.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DepImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DepImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the dep.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Dep dep) {
        EntityCacheUtil.removeResult(DepModelImpl.ENTITY_CACHE_ENABLED,
            DepImpl.class, dep.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Dep> deps) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Dep dep : deps) {
            EntityCacheUtil.removeResult(DepModelImpl.ENTITY_CACHE_ENABLED,
                DepImpl.class, dep.getPrimaryKey());
        }
    }

    /**
     * Creates a new dep with the primary key. Does not add the dep to the database.
     *
     * @param id the primary key for the new dep
     * @return the new dep
     */
    @Override
    public Dep create(long id) {
        Dep dep = new DepImpl();

        dep.setNew(true);
        dep.setPrimaryKey(id);

        return dep;
    }

    /**
     * Removes the dep with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the dep
     * @return the dep that was removed
     * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Dep remove(long id) throws NoSuchDepException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the dep with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the dep
     * @return the dep that was removed
     * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Dep remove(Serializable primaryKey)
        throws NoSuchDepException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Dep dep = (Dep) session.get(DepImpl.class, primaryKey);

            if (dep == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(dep);
        } catch (NoSuchDepException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Dep removeImpl(Dep dep) throws SystemException {
        dep = toUnwrappedModel(dep);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(dep)) {
                dep = (Dep) session.get(DepImpl.class, dep.getPrimaryKeyObj());
            }

            if (dep != null) {
                session.delete(dep);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (dep != null) {
            clearCache(dep);
        }

        return dep;
    }

    @Override
    public Dep updateImpl(com.owlafrica.servicebuilder.model.Dep dep)
        throws SystemException {
        dep = toUnwrappedModel(dep);

        boolean isNew = dep.isNew();

        Session session = null;

        try {
            session = openSession();

            if (dep.isNew()) {
                session.save(dep);

                dep.setNew(false);
            } else {
                session.merge(dep);
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

        EntityCacheUtil.putResult(DepModelImpl.ENTITY_CACHE_ENABLED,
            DepImpl.class, dep.getPrimaryKey(), dep);

        return dep;
    }

    protected Dep toUnwrappedModel(Dep dep) {
        if (dep instanceof DepImpl) {
            return dep;
        }

        DepImpl depImpl = new DepImpl();

        depImpl.setNew(dep.isNew());
        depImpl.setPrimaryKey(dep.getPrimaryKey());

        depImpl.setId(dep.getId());
        depImpl.setName(dep.getName());

        return depImpl;
    }

    /**
     * Returns the dep with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the dep
     * @return the dep
     * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Dep findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDepException, SystemException {
        Dep dep = fetchByPrimaryKey(primaryKey);

        if (dep == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return dep;
    }

    /**
     * Returns the dep with the primary key or throws a {@link com.owlafrica.servicebuilder.NoSuchDepException} if it could not be found.
     *
     * @param id the primary key of the dep
     * @return the dep
     * @throws com.owlafrica.servicebuilder.NoSuchDepException if a dep with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Dep findByPrimaryKey(long id)
        throws NoSuchDepException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the dep with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the dep
     * @return the dep, or <code>null</code> if a dep with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Dep fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Dep dep = (Dep) EntityCacheUtil.getResult(DepModelImpl.ENTITY_CACHE_ENABLED,
                DepImpl.class, primaryKey);

        if (dep == _nullDep) {
            return null;
        }

        if (dep == null) {
            Session session = null;

            try {
                session = openSession();

                dep = (Dep) session.get(DepImpl.class, primaryKey);

                if (dep != null) {
                    cacheResult(dep);
                } else {
                    EntityCacheUtil.putResult(DepModelImpl.ENTITY_CACHE_ENABLED,
                        DepImpl.class, primaryKey, _nullDep);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DepModelImpl.ENTITY_CACHE_ENABLED,
                    DepImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return dep;
    }

    /**
     * Returns the dep with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the dep
     * @return the dep, or <code>null</code> if a dep with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Dep fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the deps.
     *
     * @return the deps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Dep> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Dep> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Dep> findAll(int start, int end,
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

        List<Dep> list = (List<Dep>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEP;

                if (pagination) {
                    sql = sql.concat(DepModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Dep>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Dep>(list);
                } else {
                    list = (List<Dep>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the deps from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Dep dep : findAll()) {
            remove(dep);
        }
    }

    /**
     * Returns the number of deps.
     *
     * @return the number of deps
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

                Query q = session.createQuery(_SQL_COUNT_DEP);

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
     * Initializes the dep persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.owlafrica.servicebuilder.model.Dep")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Dep>> listenersList = new ArrayList<ModelListener<Dep>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Dep>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DepImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
