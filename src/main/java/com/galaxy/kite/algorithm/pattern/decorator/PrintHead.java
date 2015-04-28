package com.galaxy.kite.algorithm.pattern.decorator;

public class PrintHead implements IPrint {
	
	public IPrint print;

	@Override
	public void print() {

		System.out.println("Print Head");
		print.print();
	}
	
	public PrintHead(IPrint print){
		this.print = print;
	}

}
