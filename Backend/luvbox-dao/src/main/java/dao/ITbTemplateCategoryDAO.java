package dao;

import java.util.List;

/**
 * Interface for TbTemplateCategoryDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbTemplateCategoryDAO {
	/**
	 * Perform an initial save of a previously unsaved TbTemplateCategory
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTemplateCategoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplateCategory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbTemplateCategory entity);

	/**
	 * Delete a persistent TbTemplateCategory entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTemplateCategoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplateCategory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbTemplateCategory entity);

	/**
	 * Persist a previously saved TbTemplateCategory entity and return it or a
	 * copy of it to the sender. A copy of the TbTemplateCategory entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbTemplateCategoryDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplateCategory entity to update
	 * @return TbTemplateCategory the persisted TbTemplateCategory entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbTemplateCategory update(TbTemplateCategory entity);

	public TbTemplateCategory findById(Integer id);

	/**
	 * Find all TbTemplateCategory entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbTemplateCategory property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTemplateCategory> found by query
	 */
	public List<TbTemplateCategory> findByProperty(String propertyName,
                                                   Object value, int... rowStartIdxAndCount);

	/**
	 * Find all TbTemplateCategory entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTemplateCategory> all TbTemplateCategory entities
	 */
	public List<TbTemplateCategory> findAll(int... rowStartIdxAndCount);
}