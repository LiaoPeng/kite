package com.galaxy.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EntityDaoImpl <T> implements IEntityDao <T>{
	
	
	private SessionFactory sessionFactory;

	@Override
	public  T get(Serializable id) {
		
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(T entity) {
		Session session = sessionFactory.openSession();
		session.save(entity);
		session.close();
	}

	@Override
	public void delete(T entity) {
		Session session = sessionFactory.openSession();
		session.delete(entity);
;		session.close();;
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdName(Class<T> clazz) {
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
