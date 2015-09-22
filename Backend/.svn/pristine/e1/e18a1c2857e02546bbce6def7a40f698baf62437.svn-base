package dao;

import java.util.List;

/**
 * Interface for TbRequestTemplateDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbUsertemplateDAO {
	/**
	 * Perform an initial save of a previously unsaved TbRequestTemplate entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbUsertemplateDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestTemplate entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbRequestTemplate entity);

	/**
	 * Delete a persistent TbRequestTemplate entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbUsertemplateDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestTemplate entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbRequestTemplate entity);

	/**
	 * Persist a previously saved TbRequestTemplate entity and return it or a copy
	 * of it to the sender. A copy of the TbRequestTemplate entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbUsertemplateDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestTemplate entity to update
	 * @return TbRequestTemplate the persisted TbRequestTemplate entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbRequestTemplate update(TbRequestTemplate entity);

	public TbRequestTemplate findById(Integer id);

	/**
	 * Find all TbRequestTemplate entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbRequestTemplate property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbRequestTemplate> found by query
	 */
	public List<TbRequestTemplate> findByProperty(String propertyName,
                                               Object value, int... rowStartIdxAndCount);

	/**
	 * Find all TbRequestTemplate entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbRequestTemplate> all TbRequestTemplate entities
	 */
	public List<TbRequestTemplate> findAll(int... rowStartIdxAndCount);
}