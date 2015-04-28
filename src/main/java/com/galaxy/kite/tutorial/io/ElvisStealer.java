package com.galaxy.kite.tutorial.io;

import java.io.Serializable;

public class ElvisStealer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3512429099725406804L;
	static Elvis impersonator;
	private Elvis payload;
	
	private Object readResolve(){
		
		impersonator = payload;
		return new String[] {"A fool such I"};
	}
	
	

}
