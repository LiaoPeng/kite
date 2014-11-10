package com.galaxy.kite.service.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class PermissionCheck implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		
		return getUserByUsername(username);
	}

	private User getUserByUsername(String username) {

		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		GrantedAuthority commonAuthority = new GrantedAuthority() {

			@Override
			public String getAuthority() {

				return "ROLE_COMMON";
			}
		};

		GrantedAuthority adminAuthority = new GrantedAuthority() {

			@Override
			public String getAuthority() {

				return "ROLE_ADMIN";
			}
		};

		User user = null;
		if ("admin".equals(username)) {
			authorities.add(commonAuthority);
			authorities.add(adminAuthority);
			user = new User(username, "21232f297a57a5a743894a0e4a801fc3", authorities);
		} else if("test".equals(username)){
			authorities.add(commonAuthority);
			user = new User(username, "21232f297a57a5a743894a0e4a801fc3", authorities);
		}

		return user;
	}

}
