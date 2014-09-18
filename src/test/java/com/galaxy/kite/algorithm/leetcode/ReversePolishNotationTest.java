package com.galaxy.kite.algorithm.leetcode;

import junit.framework.Assert;

import org.junit.Test;

public class ReversePolishNotationTest {

	private ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

	@Test
	public void testEvalRPN() {

		int result = reversePolishNotation.evalRPN(new String[] {});

		Assert.assertEquals(0, result);

		result = reversePolishNotation.evalRPN(new String[] { "4", "13", "5", "/", "+" });

		Assert.assertEquals(6, result);

	}

}
