package com.galaxy.kite.dao.userinfo;

import java.math.BigInteger;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository("userPermissionDao")
public class UserPermissionDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	
	public int getCount(){
		
		String querySql = "SELECT count(*) FROM volkswagen.ocn_order_config";
		Session session = sessionFactory.getCurrentSession();
		SQLQuery sqlQuery = session.createSQLQuery(querySql);
		
	    BigInteger count =  (BigInteger) sqlQuery.uniqueResult();
		
		return count.intValue();
	}
	

}
