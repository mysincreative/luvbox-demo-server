package dao;

import java.util.List;

/**
 * Interface for TbUserDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbUserDAO {
	/**
	 * Perform an initial save of a previously unsaved TbUser entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbUserDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbUser entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbUser entity);

	/**
	 * Delete a persistent TbUser entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbUserDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbUser entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbUser entity);

	/**
	 * Persist a previously saved TbUser entity and return it or a copy of it to
	 * the sender. A copy of the TbUser entity parameter is returned when the
	 * JPA persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbUserDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbUser entity to update
	 * @return TbUser the persisted TbUser entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbUser update(TbUser entity);

	public TbUser findById(Integer id);

	/**
	 * Find all TbUser entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbUser property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbUser> found by query
	 */
	public List<TbUser> findByProperty(String propertyName, Object value,
                                       int... rowStartIdxAndCount);


	public List<TbUser> findByPassword(Object password,
                                       int... rowStartIdxAndCount);

	public List<TbUser> findByRole(Object role, int... rowStartIdxAndCount);

	public List<TbUser> findByFirstName(Object firstName,
                                        int... rowStartIdxAndCount);

	public List<TbUser> findByLastName(Object lastName,
                                       int... rowStartIdxAndCount);

	public List<TbUser> findByEmail(Object email, int... rowStartIdxAndCount);

	public List<TbUser> findByPhoneNumber(Object phoneNumber,
                                          int... rowStartIdxAndCount);

	public List<TbUser> findByAddress(Object address,
                                      int... rowStartIdxAndCount);

	public List<TbUser> findByIsActive(Object isActive,
                                       int... rowStartIdxAndCount);

	public List<TbUser> findByCreateTime(Object createTime,
                                         int... rowStartIdxAndCount);

	public List<TbUser> findByLastUpdateTime(Object lastUpdateTime,
                                             int... rowStartIdxAndCount);

	/**
	 * Find all TbUser entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbUser> all TbUser entities
	 */
	public List<TbUser> findAll(int... rowStartIdxAndCount);
}