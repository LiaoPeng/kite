package com.galaxy.kite.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberIITest {

	private SingleNumberII singleNumber;
	
	@Before
	public void setUp(){
		singleNumber = new SingleNumberII();
	}
	
	@Test
	public void test1() {
		int ressult = singleNumber.singleNumber(new int[]{5,4,5,5});
		Assert.assertEquals(4, ressult);
	}
	
	
	@Test
	public void test2() {
		int ressult = singleNumber.singleNumber(new int[]{4,4,5,5,5});
		Assert.assertEquals(4, ressult);
	}

	
	@Test
	public void test3() {
		int ressult = singleNumber.singleNumber(new int[]{11111,11111,11111,11111});
		Assert.assertEquals(11111, ressult);
	}
	
	@Test
	public void test4(){
		int ressult = singleNumber.singleNumber(new int[]{-19,-46,-19,-46,-9,-9,-19,17,17,17,-13,-13,-9,-13,-46,-28});
		Assert.assertEquals(-28, ressult);
	}

	@Test 
	public void test5(){
		int ressult = singleNumber.singleNumber(new int[]{43,16,45,89,45,-2147483648,45,2147483646,-2147483647,-2147483648,43,2147483647,-2147483646,-2147483648,89,-2147483646,89,-2147483646,-2147483647,2147483646,-2147483647,16,16,2147483646,43});
		Assert.assertEquals(2147483647, ressult);
	}
	
	@Test
	public void test6(){
		int ressult = singleNumber.singleNumber(new int[]{Integer.MIN_VALUE,2147483646,2147483646,2147483646});
		Assert.assertEquals(Integer.MIN_VALUE, ressult);
	}
}
