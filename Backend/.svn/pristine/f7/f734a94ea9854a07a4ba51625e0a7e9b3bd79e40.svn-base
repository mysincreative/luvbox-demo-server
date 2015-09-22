package dao;

import dto.UserRole;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Level;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbUser entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see generated.TbUser
 * @author MyEclipse Persistence Tools
 */

public class TbUserDAO implements ITbUserDAO {
	// property constants
	public static final String LOGIN_ID = "loginId";
	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String EMAIL = "email";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String ADDRESS = "address";
	public static final String IS_ACTIVE = "isActive";
	public static final String CREATE_TIME = "createTime";
	public static final String LAST_UPDATE_TIME = "lastUpdateTime";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

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
	 * TbUserDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbUser entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TbUser entity) {
		EntityManagerHelper.log("saving TbUser instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TbUser entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TbUserDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TbUser entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TbUser entity) {
		EntityManagerHelper.log("deleting TbUser instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TbUser.class,
					entity.getUid());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 * entity = TbUserDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TbUser entity to update
	 * @return TbUser the persisted TbUser entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TbUser update(TbUser entity) {
		EntityManagerHelper.log("updating TbUser instance", Level.INFO, null);
		try {
			TbUser result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TbUser findById(Integer id) {
		EntityManagerHelper.log("finding TbUser instance with id: " + id,
				Level.INFO, null);
		try {
			TbUser instance = getEntityManager().find(TbUser.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 *            number of results to return.
	 * @return List<TbUser> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TbUser> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TbUser instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TbUser model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}


	public List<TbUser> findByPassword(Object password,
			int... rowStartIdxAndCount) {
		return findByProperty(PASSWORD, password, rowStartIdxAndCount);
	}

	public List<TbUser> findByRole(Object role, int... rowStartIdxAndCount) {
		return findByProperty(ROLE, role, rowStartIdxAndCount);
	}

	public List<TbUser> findByFirstName(Object firstName,
			int... rowStartIdxAndCount) {
		return findByProperty(FIRST_NAME, firstName, rowStartIdxAndCount);
	}

	public List<TbUser> findByLastName(Object lastName,
			int... rowStartIdxAndCount) {
		return findByProperty(LAST_NAME, lastName, rowStartIdxAndCount);
	}

	public List<TbUser> findByEmail(Object email, int... rowStartIdxAndCount) {
		return findByProperty(EMAIL, email, rowStartIdxAndCount);
	}

	public List<TbUser> findByPhoneNumber(Object phoneNumber,
			int... rowStartIdxAndCount) {
		return findByProperty(PHONE_NUMBER, phoneNumber, rowStartIdxAndCount);
	}

	public List<TbUser> findByAddress(Object address,
			int... rowStartIdxAndCount) {
		return findByProperty(ADDRESS, address, rowStartIdxAndCount);
	}

	public List<TbUser> findByIsActive(Object isActive,
			int... rowStartIdxAndCount) {
		return findByProperty(IS_ACTIVE, isActive, rowStartIdxAndCount);
	}

	public List<TbUser> findByCreateTime(Object createTime,
			int... rowStartIdxAndCount) {
		return findByProperty(CREATE_TIME, createTime, rowStartIdxAndCount);
	}

	public List<TbUser> findByLastUpdateTime(Object lastUpdateTime,
			int... rowStartIdxAndCount) {
		return findByProperty(LAST_UPDATE_TIME, lastUpdateTime,
				rowStartIdxAndCount);
	}

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
	@SuppressWarnings("unchecked")
	public List<TbUser> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TbUser instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from TbUser model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

    public List<TbUser> findByLoginId(String loginId, UserRole userRole) {
        EntityManagerHelper.log("finding all TbUser by loginId", Level.INFO,
                null);
        try {
            String queryString = "select model from TbUser model where model.loginId like :loginId ";
            if(userRole!=null){
                queryString+=" and model.role = :role";
            }
            Query query = getEntityManager().createQuery(queryString);
            query.setParameter("loginId","%"+loginId+"%");
            if(userRole!=null){
             query.setParameter("role", userRole);
            }
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return query.getResultList();
        } catch (RuntimeException re) {
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }
    public TbUser login(String loginId,String password) {
        EntityManagerHelper.log("finding all TbUser by loginId", Level.INFO,
                null);
        try {
            final String queryString = "select model from TbUser model where model.loginId = :loginId and model.password =:passWord";
            Query query = getEntityManager().createQuery(queryString);
            query.setParameter("loginId",loginId);
            query.setParameter("passWord",password);
            query.setHint(QueryHints.REFRESH, HintValues.TRUE);
            return (TbUser) query.getSingleResult();
        } catch (RuntimeException re) {
            if(re instanceof NoResultException){
                return null;
            }
            EntityManagerHelper.log("find all failed", Level.SEVERE, re);
            throw re;
        }
    }

}