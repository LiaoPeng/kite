package com.galaxy.kite.algorithm.sample;

public class TestInstanceOf {
	
	public static void main(String[] args) {
	
		System.out.println( new Object() instanceof Object);
		
		System.out.println( new String() instanceof Object);
		
		System.out.println( new String().getClass() == String.class);
		
		System.out.println( new String().getClass().equals(String.class));
		
	}

}
