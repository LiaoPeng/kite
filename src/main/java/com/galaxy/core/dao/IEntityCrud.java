package com.galaxy.core.dao;

import java.io.Serializable;
import java.util.List;

public interface IEntityCrud {
	
	<T> T get(Class<T> clazz,Serializable id);

	List<Object> getAll();
	
	void save(Object entity);

	void delete(Object entity);

	void deleteById(Serializable id);

	String getIdName(Class<?> clazz);

	void flush();

	void clear();

}
