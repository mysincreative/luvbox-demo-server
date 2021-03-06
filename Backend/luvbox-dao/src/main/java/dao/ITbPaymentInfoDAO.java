package dao;

import java.util.List;

/**
 * Interface for TbPaymentInfoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITbPaymentInfoDAO {
	/**
	 * Perform an initial save of a previously unsaved TbPaymentInfo entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbPaymentInfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbPaymentInfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbPaymentInfo entity);

	/**
	 * Delete a persistent TbPaymentInfo entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITbPaymentInfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbPaymentInfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbPaymentInfo entity);

	/**
	 * Persist a previously saved TbPaymentInfo entity and return it or a copy
	 * of it to the sender. A copy of the TbPaymentInfo entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITbPaymentInfoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbPaymentInfo entity to update
	 * @return TbPaymentInfo the persisted TbPaymentInfo entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbPaymentInfo update(TbPaymentInfo entity);

	public TbPaymentInfo findById(Integer id);

	/**
	 * Find all TbPaymentInfo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TbPaymentInfo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbPaymentInfo> found by query
	 */
	public List<TbPaymentInfo> findByProperty(String propertyName,
                                              Object value, int... rowStartIdxAndCount);

	public List<TbPaymentInfo> findByPayment(Object payment,
                                             int... rowStartIdxAndCount);

	public List<TbPaymentInfo> findByCurrency(Object currency,
                                              int... rowStartIdxAndCount);

	public List<TbPaymentInfo> findByIsCharge(Object isCharge,
                                              int... rowStartIdxAndCount);

	/**
	 * Find all TbPaymentInfo entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TbPaymentInfo> all TbPaymentInfo entities
	 */
	public List<TbPaymentInfo> findAll(int... rowStartIdxAndCount);
}