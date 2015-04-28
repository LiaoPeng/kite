package com.galaxy.kite.algorithm.sample;

public class CloneObject implements Cloneable{

	private String age;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	


	public static void main(String[] args) throws CloneNotSupportedException {
		CloneObject originalObject = new CloneObject();
		originalObject.setAge( new String("abc"));
		CloneObject copyObject = (CloneObject) originalObject.clone();
		
		System.out.println(originalObject == copyObject);
		System.out.println(originalObject.getAge() == copyObject.getAge());
	}
}
