package com.galaxy.core.dao;

import java.io.Serializable;
import java.util.List;

public interface IEntityDao<T> {

	T get(Serializable id);

	List<T> getAll();
	
	void save(T entity);

	void delete(T entity);

	void deleteById(Serializable id);

	String getIdName(Class<T> clazz);

	void flush();

	void clear();

}
