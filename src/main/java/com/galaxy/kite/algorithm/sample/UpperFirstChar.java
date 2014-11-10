package com.galaxy.kite.algorithm.sample;

import org.springframework.util.StringUtils;

public class UpperFirstChar {
	
	public String upperFirstChar(String str){
		String string = "";
		if(!StringUtils.isEmpty(str)){
			string += str.toString().substring(0, 1).toUpperCase() 
					+ str.toString().substring(1,str.toString().length()).toLowerCase()
					+", ";
		}
		return string;
	}
}
