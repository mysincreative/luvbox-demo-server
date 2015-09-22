package dao;

import dto.Status;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Level;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbRequestMessage entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TbRequestMessage
 * @author MyEclipse Persistence Tools
 */

public class TbRequestMessageDAO implements ITbRequestDetailDAO {
	// property constants
	public static final String REQUEST_STATUS = "requestStatus";
	public static final String REQUEST_MESSAGE = "requestMessage";
	public static final String CREATE_TIME = "createTime";
	public static final String IS_READED = "isReaded";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TbRequestMessage entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbRequestMessageDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestMessage entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbRequestMessage entity) {
		EntityManagerHelper.log("saving TbRequestMessage instance", Level.INFO,
				null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TbRequestMessage entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbRequestMessageDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestMessage entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbRequestMessage entity) {
		EntityManagerHelper.log("deleting TbRequestMessage instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TbRequestMessage.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TbRequestMessage entity and return it or a copy
	 * of it to the sender. A copy of the TbRequestMessage entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TbRequestMessageDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestMessage entity to update
	 * @return TbRequestMessage the persisted TbRequestMessage entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbRequestMessage update(TbRequestMessage entity) {
		EntityManagerHelper.log("updating TbRequestMessage instance",
				Level.INFO, null);
		try {
			TbRequestMessage result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TbRequestMessage findById(Integer id) {
		EntityManagerHelper.log("finding TbRequestMessage instance with id: "
				+ id, Level.INFO, null);
		try {
			TbRequestMessage instance = getEntityManager().find(
					TbRequestMessage.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TbRequestMessage entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbRequestMessage property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TbRequestMessage> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TbRequestMessage> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TbRequestMessage instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TbRequestMessage model where model."
					+ propertyName + "= :propertyValue" +  " order by model.currentStep desc";

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

	public List<TbRequestMessage> findByRequestStatus(Object requestStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(REQUEST_STATUS, requestStatus,
				rowStartIdxAndCount);
	}

	public List<TbRequestMessage> findByRequestMessage(Object requestMessage,
			int... rowStartIdxAndCount) {
		return findByProperty(REQUEST_MESSAGE, requestMessage,
				rowStartIdxAndCount);
	}

	public List<TbRequestMessage> findByCreateTime(Object createTime,
			int... rowStartIdxAndCount) {
		return findByProperty(CREATE_TIME, createTime, rowStartIdxAndCount);
	}

	public List<TbRequestMessage> findByIsReaded(Object isReaded,
			int... rowStartIdxAndCount) {
		return findByProperty(IS_READED, isReaded, rowStartIdxAndCount);
	}

	/**
	 * Find all TbRequestMessage entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbRequestMessage> all TbRequestMessage entities
	 */
	@SuppressWarnings("unchecked")
	public List<TbRequestMessage> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TbRequestMessage instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TbRequestMessage model order by model.requestStatus asc, model.createTime desc";
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
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}


    public List<TbRequestMessage> findByUserIdAndStatus(boolean isIncludedReaded, String userID, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding TbRequestMessage instances by loginID: "+userID,
                Level.INFO, null);
        try {
             String queryString = "select model from TbRequestMessage model ";
                    if(userID!=null){
                    queryString += " where model.tbRequest.tbUser.loginId = :loginID ";
                        if(!isIncludedReaded){
                            queryString += " and model.isReaded =false ";
                        }
                    }
                    queryString +=" order by model.createTime desc";
            Query query = getEntityManager().createQuery(queryString);
            if(userID!=null)
            query.setParameter("loginID",userID);

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
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }


}