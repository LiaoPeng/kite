package com.galaxy.kite.algorithm.sample;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonString {
	
	static class GsonObject{
		
		String name;
		String age;
		GsonObject gson;
		
	}
	
	
	public static void main(String[] args) {

		Gson gson = new GsonBuilder().serializeNulls().create();
		GsonObject gsonObject =  new GsonString.GsonObject();
		System.out.println(gson.toJson(gsonObject));
		
	}

}
