package dao;

import dto.Status;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbRequest entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see dao.TbRequest
 * @author MyEclipse Persistence Tools
 */

public class TbRequestDAO implements ITbRequestDAO {
	// property constants

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TbRequest entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbRequestDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequest entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbRequest entity) {
		EntityManagerHelper.log("saving TbRequest instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TbRequest entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbRequestDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequest entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbRequest entity) {
		EntityManagerHelper
				.log("deleting TbRequest instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TbRequest.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TbRequest entity and return it or a copy of it
	 * to the sender. A copy of the TbRequest entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TbRequestDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequest entity to update
	 * @return TbRequest the persisted TbRequest entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbRequest update(TbRequest entity) {
		EntityManagerHelper
				.log("updating TbRequest instance", Level.INFO, null);
		try {
			TbRequest result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TbRequest findById(Integer id) {
		EntityManagerHelper.log("finding TbRequest instance with id: " + id,
				Level.INFO, null);
		try {
			TbRequest instance = getEntityManager().find(TbRequest.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TbRequest entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbRequest property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TbRequest> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TbRequest> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TbRequest instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TbRequest model where model."
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
	 * Find all TbRequest entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbRequest> all TbRequest entities
	 */
	@SuppressWarnings("unchecked")
	public List<TbRequest> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TbRequest instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from TbRequest model";
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

    public List<TbRequest> findAll(List<Status> statuses, String loginID, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbRequest instances", Level.INFO,
                null);
        try {
             String queryString = "select model from TbRequest model";
            if(loginID!=null){
                queryString+= " where model.tbUser.loginId = :loginID ";
                if(statuses!=null&&statuses.size()>0){
                    queryString+= " and model.currentStatus in :statuses ";
                }
            }else if(statuses!=null&&statuses.size()>0){
                queryString+= " where model.currentStatus in :statuses ";
            }

            queryString += " order by model.updateTime desc";
            Query query = getEntityManager().createQuery(queryString);
            if(loginID!=null){

                query.setParameter("loginID",loginID);
            }
            if(statuses!=null&&statuses.size()>0){
                query.setParameter("statuses",statuses);
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
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }
    public List<TbRequest> findAllByAssignToMe( String loginID, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbRequest instances", Level.INFO,
                null);
        try {
            String queryString = "select model from TbRequest model";
            if(loginID!=null){
                queryString+= " where model.personInCharge.loginId = :loginID ";
            }

            queryString += " order by model.updateTime desc";
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
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }
    public List<TbRequest> findByCreateTime(Date since, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbRequest instances", Level.INFO,
                null);
        try {
            String queryString = "select model from TbRequest model";
            if(since!=null){
                queryString+= " where model.requestTime >= :since ";
            }

            queryString += " order by model.requestTime desc";
            Query query = getEntityManager().createQuery(queryString);
            if(since!=null){

                query.setParameter("since",since);
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
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }
}