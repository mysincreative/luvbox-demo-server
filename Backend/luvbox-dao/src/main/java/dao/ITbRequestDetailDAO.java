package dao;

import java.util.List;

/**
 * Interface for TbRequestMessageDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbRequestDetailDAO {
	/**
	 * Perform an initial save of a previously unsaved TbRequestMessage entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbRequestDetailDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestMessage entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbRequestMessage entity);

	/**
	 * Delete a persistent TbRequestMessage entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbRequestDetailDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestMessage entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbRequestMessage entity);

	/**
	 * Persist a previously saved TbRequestMessage entity and return it or a copy
	 * of it to the sender. A copy of the TbRequestMessage entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbRequestDetailDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbRequestMessage entity to update
	 * @return TbRequestMessage the persisted TbRequestMessage entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbRequestMessage update(TbRequestMessage entity);

	public TbRequestMessage findById(Integer id);

	/**
	 * Find all TbRequestMessage entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbRequestMessage property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbRequestMessage> found by query
	 */
	public List<TbRequestMessage> findByProperty(String propertyName,
                                                Object value, int... rowStartIdxAndCount);

	public List<TbRequestMessage> findByRequestStatus(Object requestStatus,
                                                     int... rowStartIdxAndCount);

	public List<TbRequestMessage> findByRequestMessage(Object requestMessage,
                                                      int... rowStartIdxAndCount);

	public List<TbRequestMessage> findByCreateTime(Object createTime,
                                                  int... rowStartIdxAndCount);

	public List<TbRequestMessage> findByIsReaded(Object isReaded,
                                                int... rowStartIdxAndCount);

	/**
	 * Find all TbRequestMessage entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbRequestMessage> all TbRequestMessage entities
	 */
	public List<TbRequestMessage> findAll(int... rowStartIdxAndCount);
}