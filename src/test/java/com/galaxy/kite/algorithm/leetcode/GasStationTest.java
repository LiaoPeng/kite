package com.galaxy.kite.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class GasStationTest {
	
	private GasStation gasStation = new GasStation();
	
	@Test
	public void test1(){
		int result = gasStation.canCompleteCircuit(new int[]{1,1,4}, new int[]{2,2,2});
		Assert.assertEquals(2, result);
		result = gasStation.canCompleteCircuit(new int[]{4,1,1}, new int[]{2,2,2});
		Assert.assertEquals(0, result);
	}

	
	@Test
	public void test2(){
		int result = gasStation.canCompleteCircuit(new int[]{1,2,3}, new int[]{3,3,3});
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void test3(){
		int result = gasStation.canCompleteCircuit(new int[]{1}, new int[]{1});
		Assert.assertEquals(0, result);
		result = gasStation.canCompleteCircuit(new int[]{0}, new int[]{1});
		Assert.assertEquals(-1, result);
		result = gasStation.canCompleteCircuit(new int[]{}, new int[]{});
		Assert.assertEquals(-1, result);
	}
}
