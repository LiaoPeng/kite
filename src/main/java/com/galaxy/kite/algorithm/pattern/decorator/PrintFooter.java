package com.galaxy.kite.algorithm.pattern.decorator;

public class PrintFooter implements IPrint {
	
	public IPrint print;

	@Override
	public void print() {
			
		print.print();
		System.err.println("Print Footer");

	}

	public PrintFooter(IPrint print) {
		this.print = print;
	}
}
