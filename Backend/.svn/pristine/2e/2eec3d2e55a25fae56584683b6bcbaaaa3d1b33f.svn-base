package dao;

import java.util.List;

/**
 * Interface for TbCategoryDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbCategoryDAO {
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
	 * ITbCategoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbCategory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbCategory entity);

	/**
	 * Delete a persistent TbCategory entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbCategoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbCategory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbCategory entity);

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
	 * entity = ITbCategoryDAO.update(entity);
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
	public TbCategory update(TbCategory entity);

	public TbCategory findById(Integer id);

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
	 *            count of results to return.
	 * @return List<TbCategory> found by query
	 */
	public List<TbCategory> findByProperty(String propertyName, Object value,
                                           int... rowStartIdxAndCount);

	public List<TbCategory> findByCategory(Object category,
                                           int... rowStartIdxAndCount);

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
	public List<TbCategory> findAll(int... rowStartIdxAndCount);
}