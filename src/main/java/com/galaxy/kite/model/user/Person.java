package com.galaxy.kite.model.user;

import java.io.Serializable;
import java.util.Date;


public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5923915740230055664L;

	
	private int age;
	private String name;
	private String address;
	private Date birthday;
	private Date luckDay;
	private double totalMoney;
	
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getLuckDay() {
		return luckDay;
	}
	public void setLuckDay(Date luckDay) {
		this.luckDay = luckDay;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	


}
