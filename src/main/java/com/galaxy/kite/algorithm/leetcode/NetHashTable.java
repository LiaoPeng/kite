package com.galaxy.kite.algorithm.leetcode;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class NetHashTable {
	
	class Node{
		String value;
		Date date;
	}
	private Date allDate;
	private String allValue;
	private Map<String, Node> map = new HashMap<String,Node>();
	
	public void set(String key,String value){
		
		 Node node = map.get(key);
		 node.value = value;
		 node.date = new Date();
	}
	
	public String get(String key){
		Node node = map.get(key);
		return (node.date.compareTo(allDate) > 0 ) ? node.value: allValue;
	}
	
	public void setAll(String value){
		allDate = new Date();
		allValue = value;
	}

}
