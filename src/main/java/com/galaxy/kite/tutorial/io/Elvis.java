package com.galaxy.kite.tutorial.io;

import java.io.Serializable;
import java.util.Arrays;


enum ElvisEnum{
	INSTANCE;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}

public class Elvis implements Serializable{
	
	
	
	public static final Elvis INSTANCE = new Elvis();
	
	private String[] favouriteSongs = {"Elvis" ,"King of pop"};
	
	private Elvis(){
	}
	
	
	public void leaveTheBuilding(){
		
	}
	
	public void printFavouriteSong(){
		System.out.println(Arrays.toString(favouriteSongs));
	}

}
