package dao;

import java.util.List;

/**
 * Interface for TbRequestDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbRequestDAO {
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
	 * ITbRequestDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequest entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbRequest entity);

	/**
	 * Delete a persistent TbRequest entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbRequestDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequest entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbRequest entity);

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
	 * entity = ITbRequestDAO.update(entity);
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
	public TbRequest update(TbRequest entity);

	public TbRequest findById(Integer id);

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
	 *            count of results to return.
	 * @return List<TbRequest> found by query
	 */
	public List<TbRequest> findByProperty(String propertyName, Object value,
                                          int... rowStartIdxAndCount);

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
	public List<TbRequest> findAll(int... rowStartIdxAndCount);
}