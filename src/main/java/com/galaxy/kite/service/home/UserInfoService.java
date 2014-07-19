package com.galaxy.kite.service.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galaxy.kite.dao.userinfo.UserPermissionDao;
import com.galaxy.kite.service.home.api.IUserInfoService;


@Service("userInfoService")
@Transactional(value="transactionManager")
public class UserInfoService implements IUserInfoService {
	
	
	@Autowired
	@Qualifier("userPermissionDao")
	private UserPermissionDao userPermissionDao;


	public int getCountOfUsers() {
		
		return userPermissionDao.getCount();
	}
}
