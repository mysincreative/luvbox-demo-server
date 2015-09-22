package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Level;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbPaymentInfo entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see generated.TbPaymentInfo
 * @author MyEclipse Persistence Tools
 */

public class TbPaymentInfoDAO implements ITbPaymentInfoDAO {
	// property constants
	public static final String PAYMENT = "payment";
	public static final String CURRENCY = "currency";
	public static final String IS_CHARGE = "isCharge";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TbPaymentInfo entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbPaymentInfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbPaymentInfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbPaymentInfo entity) {
		EntityManagerHelper.log("saving TbPaymentInfo instance", Level.INFO,
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
	 * Delete a persistent TbPaymentInfo entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbPaymentInfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbPaymentInfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbPaymentInfo entity) {
		EntityManagerHelper.log("deleting TbPaymentInfo instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(TbPaymentInfo.class,
					entity.getPaymentId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TbPaymentInfo entity and return it or a copy
	 * of it to the sender. A copy of the TbPaymentInfo entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TbPaymentInfoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbPaymentInfo entity to update
	 * @return TbPaymentInfo the persisted TbPaymentInfo entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbPaymentInfo update(TbPaymentInfo entity) {
		EntityManagerHelper.log("updating TbPaymentInfo instance", Level.INFO,
				null);
		try {
			TbPaymentInfo result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TbPaymentInfo findById(Integer id) {
		EntityManagerHelper.log(
				"finding TbPaymentInfo instance with id: " + id, Level.INFO,
				null);
		try {
			TbPaymentInfo instance = getEntityManager().find(
					TbPaymentInfo.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TbPaymentInfo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbPaymentInfo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TbPaymentInfo> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TbPaymentInfo> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TbPaymentInfo instance with property: " + propertyName
						+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TbPaymentInfo model where model."
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

	public List<TbPaymentInfo> findByPayment(Object payment,
			int... rowStartIdxAndCount) {
		return findByProperty(PAYMENT, payment, rowStartIdxAndCount);
	}

	public List<TbPaymentInfo> findByCurrency(Object currency,
			int... rowStartIdxAndCount) {
		return findByProperty(CURRENCY, currency, rowStartIdxAndCount);
	}

	public List<TbPaymentInfo> findByIsCharge(Object isCharge,
			int... rowStartIdxAndCount) {
		return findByProperty(IS_CHARGE, isCharge, rowStartIdxAndCount);
	}

	/**
	 * Find all TbPaymentInfo entities.
	 *
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbPaymentInfo> all TbPaymentInfo entities
	 */
	@SuppressWarnings("unchecked")
    public List<TbPaymentInfo> findAll(final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("finding all TbPaymentInfo instances",
                Level.INFO, null);
        try {
            final String queryString = "select model from TbPaymentInfo model";
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
    public List<TbPaymentInfo> findAllbyYear(Integer year, final int... rowStartIdxAndCount) {
        EntityManagerHelper.log("SELECT * FROM tb_payment_info where year(createTime) = " + year,
                Level.INFO, null);
        try {
            final String queryString = "SELECT * FROM tb_payment_info where year(createTime) = ?year";
            Query query = getEntityManager().createNativeQuery(queryString,TbPaymentInfo.class);
            query.setParameter("year",year);
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