package com.galaxy.kite.cache.ehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheName {
	
	
	@Cacheable(value="stringCache")
	public String getName(int i){
		
		System.out.println("Cache in not exist, call service.");
		
		return "name";
		
	}

}
