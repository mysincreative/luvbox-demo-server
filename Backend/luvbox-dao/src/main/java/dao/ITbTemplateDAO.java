package dao;

import java.util.List;

/**
 * Interface for TbTemplateDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbTemplateDAO {
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
	 * ITbTemplateDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplate entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbTemplate entity);

	/**
	 * Delete a persistent TbTemplate entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTemplateDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplate entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbTemplate entity);

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
	 * entity = ITbTemplateDAO.update(entity);
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
	public TbTemplate update(TbTemplate entity);

	public TbTemplate findById(Integer id);

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
	 *            count of results to return.
	 * @return List<TbTemplate> found by query
	 */
	public List<TbTemplate> findByProperty(String propertyName, Object value,
                                           int... rowStartIdxAndCount);

	public List<TbTemplate> findByAuthor(Object author,
                                         int... rowStartIdxAndCount);

	public List<TbTemplate> findByDescription(Object description,
                                              int... rowStartIdxAndCount);

	public List<TbTemplate> findByCreateTime(Object createTime,
                                             int... rowStartIdxAndCount);

	public List<TbTemplate> findByTitle(Object title,
                                        int... rowStartIdxAndCount);

	public List<TbTemplate> findByFilePath(Object filePath,
                                           int... rowStartIdxAndCount);

	public List<TbTemplate> findByImagePreviewUrl(Object imagePreviewUrl,
                                                  int... rowStartIdxAndCount);

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
	public List<TbTemplate> findAll(int... rowStartIdxAndCount);
}