package com.galaxy.kite.cache.ehcache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EhcacheTest {
	
	@Autowired
	private CacheName cacheName;
	
	@Test
	public void testHowToUseCache(){
		

		for(int i=0; i < 10; i++){
		
			cacheName.getName(0);
			getname();
		}
		
	}
	
	
	@Cacheable(value = { "stringCache" })
	private String getname(){
		
		System.out.println("To here");
		
		return "name";
		
	}
	

}
