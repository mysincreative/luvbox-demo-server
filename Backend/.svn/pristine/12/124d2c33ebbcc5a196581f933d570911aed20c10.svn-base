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
 * Date: 10/8/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TbMessageDAO {
    // property constants

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    /**
     * Perform an initial save of a previously unsaved TbMessage entity. All
     * subsequent persist actions of this entity should use the #update()
     * method. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#persist(Object)
     * EntityManager#persist} operation.
     *
     * <pre>
     * EntityManagerHelper.beginTransaction();
     * TbMessageDAO.save(entity);
     * EntityManagerHelper.commit();
     * </pre>
     *
     * @param entity
     *            TbMessage entity to persist
     * @throws RuntimeException
     *             when the operation fails
     */
    public void save(TbMessage entity) {
        EntityManagerHelper.log("saving TbMessage instance", Level.INFO, null);
        try {
            getEntityManager().persist(entity);
            EntityManagerHelper.log("save successful", Level.INFO, null);
        } catch (RuntimeException re) {
            EntityManagerHelper.log("save failed", Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Delete a persistent TbMessage entity. This operation must be performed
     * within the a database transaction context for the entity's data to be
     * permanently deleted from the persistence store, i.e., database. This
     * method uses the {@link javax.persistence.EntityManager#remove(Object)
     * EntityManager#delete} operation.
     *
     * <pre>
     * EntityManagerHelper.beginTransaction();
     * TbMessageDAO.delete(entity);
     * EntityManagerHelper.commit();
     * entity = null;
     * </pre>
     *
     * @param entity
     *            TbMessage entity to delete
     * @throws RuntimeException
     *             when the operation fails
     */
    public void delete(TbMessage entity) {
        EntityManagerHelper
                .log("deleting TbMessage instance", Level.INFO, null);
        try {
            entity = getEntityManager().getReference(TbMessage.class,
                    entity.getId());
            getEntityManager().remove(entity);
            EntityManagerHelper.log("delete successful", Level.INFO, null);
        } catch (RuntimeException re) {
            EntityManagerHelper.log("delete failed", Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Persist a previously saved TbMessage entity and return it or a copy of it
     * to the sender. A copy of the TbMessage entity parameter is returned when
     * the JPA persistence mechanism has not previously been tracking the
     * updated entity. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
     * operation.
     *
     * <pre>
     * EntityManagerHelper.beginTransaction();
     * entity = TbMessageDAO.update(entity);
     * EntityManagerHelper.commit();
     * </pre>
     *
     * @param entity
     *            TbMessage entity to update
     * @return TbMessage the persisted TbMessage entity instance, may not be the
     *         same
     * @throws RuntimeException
     *             if the operation fails
     */
    public TbMessage update(TbMessage entity) {
        EntityManagerHelper
                .log("updating TbMessage instance", Level.INFO, null);
        try {
            TbMessage result = getEntityManager().merge(entity);
            EntityManagerHelper.log("update successful", Level.INFO, null);
            return result;
        } catch (RuntimeException re) {
            EntityManagerHelper.log("update failed", Level.SEVERE, re);
            throw re;
        }
    }

    public TbMessage findById(Integer id) {
        EntityManagerHelper.log("finding TbMessage instance with id: " + id,
                Level.INFO, null);
        try {
            TbMessage instance = getEntityManager().find(TbMessage.class, id);
            return instance;
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find failed", Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Find all TbMessage entities with a specific property value.
     *
     * @param propertyName
     *            the name of the TbMessage property to query
     * @param value
     *            the property value to match
     * @param rowStartIdxAndCount
     *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
     *            row index in the query result-set to begin collecting the
     *            results. rowStartIdxAndCount[1] specifies the the maximum
     *            number of results to return.
     * @return List<TbMessage> found by query
     */
    @SuppressWarnings("unchecked")
    public List<TbMessage> findByProperty(String propertyName,
                                          final Object value, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding TbMessage instance with property: "
                + propertyName + ", value: " + value, Level.INFO, null);
        try {
            final String queryString = "select model from TbMessage model where model."
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
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find by property name failed",
                    Level.SEVERE, re);
            throw re;
        }
    }

    /**
     * Find all TbMessage entities.
     *
     * @param rowStartIdxAndCount
     *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
     *            row index in the query result-set to begin collecting the
     *            results. rowStartIdxAndCount[1] specifies the the maximum
     *            count of results to return.
     * @return List<TbMessage> all TbMessage entities
     */
    @SuppressWarnings("unchecked")
    public List<TbMessage> findAll(final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbMessage instances", Level.INFO,
                null);
        try {
            final String queryString = "select model from TbMessage model";
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

    public List<TbMessage> findAll(boolean isIncludedReaded, String loginID, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbMessage instances", Level.INFO,
                null);
        try {
            String queryString = "select model from TbMessage model";
            if(loginID!=null){
                queryString+= " where model.tbUser.loginId = :loginID ";
            }
            if(!isIncludedReaded){
                queryString += " and model.isReaded = false ";
            }

            queryString += " order by model.isReaded asc, model.createTime desc";
            Query query = getEntityManager().createQuery(queryString);
            if(loginID!=null){

                query.setParameter("loginID",loginID);
            }
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
            System.out.println("loginID: "+loginID);
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }

    public int updateMessageStatus(String loginID){
        try {
            String queryString = "update TbMessage model set model.isReaded = true";
                queryString+= " where model.tbUser.loginId = :loginID ";

            Query query = getEntityManager().createQuery(queryString);

            query.setParameter("loginID",loginID);


            return query.executeUpdate();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }
}
