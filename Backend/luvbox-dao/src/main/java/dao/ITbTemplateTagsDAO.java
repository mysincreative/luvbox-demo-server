package dao;

import java.util.List;

/**
 * Interface for TbTemplateTagsDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbTemplateTagsDAO {
	/**
	 * Perform an initial save of a previously unsaved TbTemplateTags entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTemplateTagsDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplateTags entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbTemplateTags entity);

	/**
	 * Delete a persistent TbTemplateTags entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTemplateTagsDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplateTags entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbTemplateTags entity);

	/**
	 * Persist a previously saved TbTemplateTags entity and return it or a copy
	 * of it to the sender. A copy of the TbTemplateTags entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbTemplateTagsDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTemplateTags entity to update
	 * @return TbTemplateTags the persisted TbTemplateTags entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbTemplateTags update(TbTemplateTags entity);

	public TbTemplateTags findById(Integer id);

	/**
	 * Find all TbTemplateTags entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbTemplateTags property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTemplateTags> found by query
	 */
	public List<TbTemplateTags> findByProperty(String propertyName,
                                               Object value, int... rowStartIdxAndCount);

	/**
	 * Find all TbTemplateTags entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTemplateTags> all TbTemplateTags entities
	 */
	public List<TbTemplateTags> findAll(int... rowStartIdxAndCount);
}