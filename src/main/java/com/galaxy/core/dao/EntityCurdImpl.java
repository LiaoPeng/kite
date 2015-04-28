package com.galaxy.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EntityCurdImpl implements IEntityCrud {

	SessionFactory sessionFactory;

	
	@Override
	public <T> T get(Class<T> clazz, Serializable id) {
	
		Session session = sessionFactory.openSession();
		T entity = (T) session.get(clazz, id);
		session.close();
		return entity;
	}


	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getIdName(Class<?> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}



}
