package com.soft.dp.api.model.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.MappedSuperclass;
import javax.persistence.PersistenceContext;

@MappedSuperclass
public abstract class AbstractDao<T, PK extends Serializable> {

	@SuppressWarnings("unchecked")
	private final Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	@PersistenceContext
	private EntityManager entityManager;

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	public void save(T entity) {
		entityManager.persist(entity);
	}

	public void update(T entity) {
		entityManager.merge(entity);
	}

	public void delete(PK id) {
		entityManager.remove(entityManager.getReference(entityClass, id));
	}

	public T findById(PK id) {
		return entityManager.find(entityClass, id);
	}

	public List<T> findAll() {
		var typedQuery = entityManager.createQuery("select u from " + entityClass.getSimpleName() + " u", entityClass);
		return typedQuery.getResultList();
	}
	
	protected List<T> createQuery(String plsql, Object... params) {
		var typedQuery = entityManager.createQuery(plsql, entityClass);
		for (int i = 0; i < params.length; i++) {
		    typedQuery.setParameter(i+1, params[i]);
        }
    	return typedQuery.getResultList();
	}

}