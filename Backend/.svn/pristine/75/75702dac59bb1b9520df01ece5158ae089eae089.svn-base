package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Level;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbCategory entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see generated.TbCategory
 * @author MyEclipse Persistence Tools
 */

public class TbCategoryDAO implements ITbCategoryDAO {
	// property constants
	public static final String CATEGORY = "category";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TbCategory entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbCategoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbCategory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbCategory entity) {
		EntityManagerHelper.log("saving TbCategory instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TbCategory entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbCategoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbCategory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbCategory entity) {
		EntityManagerHelper.log("deleting TbCategory instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(TbCategory.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TbCategory entity and return it or a copy of
	 * it to the sender. A copy of the TbCategory entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TbCategoryDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbCategory entity to update
	 * @return TbCategory the persisted TbCategory entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbCategory update(TbCategory entity) {
		EntityManagerHelper.log("updating TbCategory instance", Level.INFO,
				null);
		try {
			TbCategory result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TbCategory findById(Integer id) {
		EntityManagerHelper.log("finding TbCategory instance with id: " + id,
				Level.INFO, null);
		try {
			TbCategory instance = getEntityManager().find(TbCategory.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TbCategory entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbCategory property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TbCategory> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TbCategory> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TbCategory instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TbCategory model where model."
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

	public List<TbCategory> findByCategory(Object category,
			int... rowStartIdxAndCount) {
		return findByProperty(CATEGORY, category, rowStartIdxAndCount);
	}

	/**
	 * Find all TbCategory entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbCategory> all TbCategory entities
	 */
	@SuppressWarnings("unchecked")
	public List<TbCategory> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TbCategory instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from TbCategory model";
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