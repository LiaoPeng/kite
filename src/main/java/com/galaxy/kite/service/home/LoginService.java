package com.galaxy.kite.service.home;

import org.springframework.stereotype.Service;

import com.galaxy.kite.service.home.api.ILoginService;

@Service
public class LoginService implements ILoginService {
	

	@Override
	public String isInstance(){
		
		return "Login service";
		
	}

}
