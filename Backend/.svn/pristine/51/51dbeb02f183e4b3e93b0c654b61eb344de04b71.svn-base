package dao;

import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Level;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 11/21/13
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class TbRequestAttachmentDAO {
    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    /**
     * Perform an initial save of a previously unsaved TbRequestAttachmentDAOAttachment entity. All
     * subsequent persist actions of this entity should use the #update()
     * method. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#persist(Object)
     * EntityManager#persist} operation.
     *
     * <pre>
     * EntityManagerHelper.beginTransaction();
     * TbRequestAttachmentDAOAttachmentDAO.save(entity);
     * EntityManagerHelper.commit();
     * </pre>
     *
     * @param entity
     *            TbRequestAttachment entity to persist
     * @throws RuntimeException
     *             when the operation fails
     */
    public void save(TbRequestAttachment entity) {
        EntityManagerHelper.log("saving TbRequestAttachment instance", Level.INFO, null);
        try {
            getEntityManager().persist(entity);
            EntityManagerHelper.log("save successful", Level.INFO, null);
        } catch (RuntimeException re) {
            EntityManagerHelper.log("save failed", Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Delete a persistent TbRequestAttachment entity. This operation must be performed
     * within the a database transaction context for the entity's data to be
     * permanently deleted from the persistence store, i.e., database. This
     * method uses the {@link javax.persistence.EntityManager#remove(Object)
     * EntityManager#delete} operation.
     *
     * <pre>
     * EntityManagerHelper.beginTransaction();
     * TbRequestAttachmentDAO.delete(entity);
     * EntityManagerHelper.commit();
     * entity = null;
     * </pre>
     *
     * @param entity
     *            TbRequestAttachment entity to delete
     * @throws RuntimeException
     *             when the operation fails
     */
    public void delete(TbRequestAttachment entity) {
        EntityManagerHelper
                .log("deleting TbRequestAttachment instance", Level.INFO, null);
        try {
            entity = getEntityManager().getReference(TbRequestAttachment.class,
                    entity.getId());
            getEntityManager().remove(entity);
            EntityManagerHelper.log("delete successful", Level.INFO, null);
        } catch (RuntimeException re) {
            EntityManagerHelper.log("delete failed", Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Persist a previously saved TbRequestAttachment entity and return it or a copy of it
     * to the sender. A copy of the TbRequestAttachment entity parameter is returned when
     * the JPA persistence mechanism has not previously been tracking the
     * updated entity. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
     * operation.
     *
     * <pre>
     * EntityManagerHelper.beginTransaction();
     * entity = TbRequestAttachmentDAO.update(entity);
     * EntityManagerHelper.commit();
     * </pre>
     *
     * @param entity
     *            TbRequestAttachment entity to update
     * @return TbRequestAttachment the persisted TbRequestAttachment entity instance, may not be the
     *         same
     * @throws RuntimeException
     *             if the operation fails
     */
    public TbRequestAttachment update(TbRequestAttachment entity) {
        EntityManagerHelper
                .log("updating TbRequestAttachment instance", Level.INFO, null);
        try {
            TbRequestAttachment result = getEntityManager().merge(entity);
            EntityManagerHelper.log("update successful", Level.INFO, null);
            return result;
        } catch (RuntimeException re) {
            EntityManagerHelper.log("update failed", Level.SEVERE, re);
            throw re;
        }
    }

    public TbRequestAttachment findById(Integer id) {
        EntityManagerHelper.log("finding TbRequestAttachment instance with id: " + id,
                Level.INFO, null);
        try {
            TbRequestAttachment instance = getEntityManager().find(TbRequestAttachment.class, id);
            return instance;
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find failed", Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Find all TbRequestAttachment entities with a specific property value.
     *
     * @param propertyName
     *            the name of the TbRequestAttachment property to query
     * @param value
     *            the property value to match
     * @param rowStartIdxAndCount
     *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
     *            row index in the query result-set to begin collecting the
     *            results. rowStartIdxAndCount[1] specifies the the maximum
     *            number of results to return.
     * @return List<TbRequestAttachment> found by query
     */
    @SuppressWarnings("unchecked")
    public List<TbRequestAttachment> findByProperty(String propertyName,
                                          final Object value, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding TbRequestAttachment instance with property: "
                + propertyName + ", value: " + value, Level.INFO, null);
        try {
            final String queryString = "select model from TbRequestAttachment model where model."
                    + propertyName + "= :propertyValue";
            Query query = getEntityManager().createQuery(queryString);
            query.setParameter("propertyValue", value);
            if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
                int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
                if (rowStartIdx > 0) {
                    query.setFirstResult(rowStartIdx);
                }

                if (rowStartIdxAndCount.length > 1) {
                    int rowCount = Math.max(0, rowStartIdxAndCount[1]);
                    if (rowCount > 0) {
                        query.setMaxResults(rowCount);
                    }
                }
            }
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find by property name failed",
                    Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Find all TbRequestAttachment entities.
     *
     * @param rowStartIdxAndCount
     *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
     *            row index in the query result-set to begin collecting the
     *            results. rowStartIdxAndCount[1] specifies the the maximum
     *            count of results to return.
     * @return List<TbRequestAttachment> all TbRequestAttachment entities
     */
    @SuppressWarnings("unchecked")
    public List<TbRequestAttachment> findAll(final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbRequestAttachment instances", Level.INFO,
                null);
        try {
            final String queryString = "select model from TbRequestAttachment model";
            Query query = getEntityManager().createQuery(queryString);
            if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
                int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
                if (rowStartIdx > 0) {
                    query.setFirstResult(rowStartIdx);
                }

                if (rowStartIdxAndCount.length > 1) {
                    int rowCount = Math.max(0, rowStartIdxAndCount[1]);
                    if (rowCount > 0) {
                        query.setMaxResults(rowCount);
                    }
                }
            }
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }
}
