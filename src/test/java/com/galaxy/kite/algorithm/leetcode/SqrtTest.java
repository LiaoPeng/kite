package com.galaxy.kite.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest {
	
	
	private Sqrt sqrt = null;
	private int MAX_SCOPE =  Integer.MAX_VALUE;
	
	@Before
	public void setUp(){
		sqrt = new Sqrt();
	}
	
	@Test
	public void testSqrt(){
		
		for(int seek = 0; seek < MAX_SCOPE; seek++ ){
			System.out.println(seek);
			Assert.assertEquals(  Math.round(Math.sqrt(seek)-0.5), sqrt.sqrt(seek));		
		}
		
		Math.floor(1.0);
		
		Assert.assertEquals(3,sqrt.sqrt(9));
			
	}

}
