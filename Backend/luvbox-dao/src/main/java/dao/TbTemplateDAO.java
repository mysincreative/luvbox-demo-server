package dao;

import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Level;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbTemplate entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see generated.TbTemplate
 * @author MyEclipse Persistence Tools
 */

public class TbTemplateDAO implements ITbTemplateDAO {
	// property constants
	public static final String AUTHOR = "author";
	public static final String DESCRIPTION = "description";
	public static final String CREATE_TIME = "createTime";
	public static final String TITLE = "title";
	public static final String FILE_PATH = "filePath";
	public static final String IMAGE_PREVIEW_URL = "imagePreviewUrl";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TbTemplate entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbTemplateDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplate entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbTemplate entity) {
		EntityManagerHelper.log("saving TbTemplate instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TbTemplate entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbTemplateDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplate entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbTemplate entity) {
		EntityManagerHelper.log("deleting TbTemplate instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(TbTemplate.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TbTemplate entity and return it or a copy of
	 * it to the sender. A copy of the TbTemplate entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TbTemplateDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplate entity to update
	 * @return TbTemplate the persisted TbTemplate entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbTemplate update(TbTemplate entity) {
		EntityManagerHelper.log("updating TbTemplate instance", Level.INFO,
				null);
		try {
			TbTemplate result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TbTemplate findById(Integer id) {
		EntityManagerHelper.log("finding TbTemplate instance with id: " + id,
				Level.INFO, null);
		try {
			TbTemplate instance = getEntityManager().find(TbTemplate.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TbTemplate entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbTemplate property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TbTemplate> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TbTemplate> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TbTemplate instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TbTemplate model where model."
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

	public List<TbTemplate> findByAuthor(Object author,
			int... rowStartIdxAndCount) {
		return findByProperty(AUTHOR, author, rowStartIdxAndCount);
	}

	public List<TbTemplate> findByDescription(Object description,
			int... rowStartIdxAndCount) {
		return findByProperty(DESCRIPTION, description, rowStartIdxAndCount);
	}

	public List<TbTemplate> findByCreateTime(Object createTime,
			int... rowStartIdxAndCount) {
		return findByProperty(CREATE_TIME, createTime, rowStartIdxAndCount);
	}

	public List<TbTemplate> findByTitle(Object title,
			int... rowStartIdxAndCount) {
		return findByProperty(TITLE, title, rowStartIdxAndCount);
	}

	public List<TbTemplate> findByFilePath(Object filePath,
			int... rowStartIdxAndCount) {
		return findByProperty(FILE_PATH, filePath, rowStartIdxAndCount);
	}

	public List<TbTemplate> findByImagePreviewUrl(Object imagePreviewUrl,
			int... rowStartIdxAndCount) {
		return findByProperty(IMAGE_PREVIEW_URL, imagePreviewUrl,
				rowStartIdxAndCount);
	}

	/**
	 * Find all TbTemplate entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTemplate> all TbTemplate entities
	 */
	@SuppressWarnings("unchecked")
	public List<TbTemplate> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TbTemplate instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from TbTemplate model";
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

    public List<TbTemplate> findByTitle(String title) {
        EntityManagerHelper.log("finding all TbTemplate instances", Level.INFO,
                null);
        try {
            final String queryString = "select model from TbTemplate model where model.title like :title";
            Query query = getEntityManager().createQuery(queryString);
            query.setParameter("title","%"+title+"%");

            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }

}