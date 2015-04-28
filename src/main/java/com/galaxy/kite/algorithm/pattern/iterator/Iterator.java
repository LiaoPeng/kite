package com.galaxy.kite.algorithm.pattern.iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
			 
public class Iterator {
	
	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<String,String>();
		Set<String> keySet = map.keySet();
		java.util.Iterator<String> iterator = keySet.iterator();
		String element = iterator.next();
		
	}
	
	

}
