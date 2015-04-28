package com.galaxy.kite.algorithm.sample;

public class GeneralClass {
	
	
	public static <T> String getClassType(Class<T> c){
		
		return c.getSimpleName();
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getClassType(String.class ));
	}

}
