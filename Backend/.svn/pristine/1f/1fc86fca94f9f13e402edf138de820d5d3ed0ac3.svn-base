package dao;

import java.util.List;

/**
 * Interface for TbTagsDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbTagsDAO {
	/**
	 * Perform an initial save of a previously unsaved TbTags entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTagsDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTags entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbTags entity);

	/**
	 * Delete a persistent TbTags entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbTagsDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbTags entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbTags entity);

	/**
	 * Persist a previously saved TbTags entity and return it or a copy of it to
	 * the sender. A copy of the TbTags entity parameter is returned when the
	 * JPA persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbTagsDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbTags entity to update
	 * @return TbTags the persisted TbTags entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbTags update(TbTags entity);

	public TbTags findById(String id);

	/**
	 * Find all TbTags entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbTags property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTags> found by query
	 */
	public List<TbTags> findByProperty(String propertyName, Object value,
                                       int... rowStartIdxAndCount);

	public List<TbTags> findByTagDescription(Object tagDescription,
                                             int... rowStartIdxAndCount);

	/**
	 * Find all TbTags entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbTags> all TbTags entities
	 */
	public List<TbTags> findAll(int... rowStartIdxAndCount);
}