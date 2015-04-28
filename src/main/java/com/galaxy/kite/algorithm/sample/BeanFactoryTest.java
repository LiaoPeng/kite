package com.galaxy.kite.algorithm.sample;


interface A{
	
}

interface B{
	
}

class C implements A,B{
	
}
public class BeanFactoryTest {
	
	
	
	public static void main(String[] args) {
		
		C c = new C();
		B b = getB(c);
		System.out.println("No exception");
		
	}
	
	public static B getB(A a){
		return (B) a;
	}
}
