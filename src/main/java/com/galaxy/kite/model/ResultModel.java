package com.galaxy.kite.model;

import java.io.Serializable;

public class ResultModel implements Serializable{

	
	public static String SUCCESS ="success";
	public static String ERROR ="error";
	private static final long serialVersionUID = 876830731890826400L;

	private String status;
	private String message;
	
	public ResultModel(String status,String message){
		this.status = status;
		this.message = message;
	}
	
	public ResultModel(){
		
	}

	public String getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
	
}
