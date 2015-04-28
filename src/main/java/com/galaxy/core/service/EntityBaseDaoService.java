package com.galaxy.core.service;

import com.galaxy.core.dao.IEntityCrud;

public class EntityBaseDaoService implements IEntityBaseDaoService {
	
	private IEntityCrud entityCrud;

	@Override
	public <T> void save(T entity) {
		
		entityCrud.save(entity);
	}
	
	
	
	

}
