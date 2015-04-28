package com.galaxy.kite.tutorial.jvm;

import java.text.MessageFormat;
import java.util.Random;

public class HelloJava {
	
	public static final String NAME= "NAME";
	public static final double VERSION = 1.0;
	public static final int token = new Random().nextInt();	
	public static volatile int count = 0;
	
	public final double SUB_VERSION = 1.1;
	public final int id;
	public final String name;
	
	public int lifeCycle = 12;
	public long addTime = 2;
	
	public HelloJava(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		HelloJava helloJava = new HelloJava(1, "Java");
	}
	
	public void welcome(){
		
		int tempCount = 0;
		System.err.println(MessageFormat.format("Serial num:{0}, name:{1}", id,name));
		tempCount = 22;
		
	}

}
