package com.galaxy.kite.algorithm.pattern;


public class RealObject implements IRealObject {


	@Override
	public String calculateSalary(int year, int month) {
		System.out.println(this.getClass().getSimpleName() + "yearP:" + year);
		return String.valueOf(year + month);
	}

	@Override
	public void printJobTodo() {
		
		
	}
	
	public static void main(String[] args) {
		
		RealObject targetObject =  new RealObject();
		ProxyHandler proxyObject = new ProxyHandler(targetObject);
		
		IRealObject proxy = proxyObject.bind();
		
		proxy.calculateSalary(2, 3);
		
	}

}
