package com.galaxy.kite.algorithm.leetcode;

import java.util.Stack;

enum Operator {
	PLUS("+") {
		@Override
		int apply(int x, int y) {
			return x + y;
		}
	},
	SUB("-") {
		@Override
		int apply(int x, int y) {
			return y - x;
		}
	},
	MULTIPLICATION("*") {
		@Override
		int apply(int x, int y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		int apply(int x, int y) {
			return y / x;
		}
	};

	private final String operator;

	Operator(String operator) {
		this.operator = operator;
	}

	abstract int apply(int x, int y);
}

public class ReversePolishNotation {

	public int evalRPN(String[] tokens, int version) {

		Stack<Integer> rpnStack = new Stack<Integer>();

		for (String str : tokens) {

			switch (str) {
			case "+":
				rpnStack.push(Operator.PLUS.apply(rpnStack.pop(),
						rpnStack.pop()));
				break;
			case "-":
				rpnStack.push(Operator.SUB.apply(rpnStack.pop(), rpnStack.pop()));
				break;
			case "*":
				rpnStack.push(Operator.MULTIPLICATION.apply(rpnStack.pop(),
						rpnStack.pop()));
				break;
			case "/":
				rpnStack.push(Operator.DIVIDE.apply(rpnStack.pop(),
						rpnStack.pop()));
				break;
			default:
				rpnStack.push(Integer.parseInt(str));
				break;
			}
		}
		return rpnStack.size() == 0 ? 0 : rpnStack.pop();
	}

	public int evalRPN(String[] tokens) {

		Stack<Integer> rpnStack = new Stack<Integer>();

		for (String str : tokens) {
			switch (str) {
			case "+":
				rpnStack.push(rpnStack.pop() + rpnStack.pop());
				break;
			case "-":
				rpnStack.push(-rpnStack.pop() + rpnStack.pop());
				break;
			case "*":
				rpnStack.push(rpnStack.pop() * rpnStack.pop());
				break;
			case "/":
				rpnStack.push(1 / rpnStack.pop() * rpnStack.pop());
				break;
			default:
				rpnStack.push(Integer.parseInt(str));
				break;
			}
		}
		return rpnStack.size() == 0 ? 0 : rpnStack.pop();
	}
}
