package com.galaxy.kite.algorithm.pattern.decorator;

public class DecoratorExecute {

	public static void main(String[] args) {
		
		//Print two head and one footer
		IPrint bodyPrint = new PrintMainBody();
		IPrint print = new PrintFooter( new PrintHead( new PrintHead(bodyPrint)));
		print.print();
	}
}
