package com.galaxy.kite.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MaxPointOnLineTest {
	
	private MaxPointOnLine maxPointOnLine = new MaxPointOnLine();
	
	
	@Test
	public void testGcd(){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String key = "key";
		map.put(key, 12);
		Integer integer = map.get(key);
		integer +=12;
		integer = map.get(key);
		System.out.println(integer);
		
		
	
		Point point1 = new Point();
		Point point2 = new Point(1,10);
		Point point3 = new Point(3,100);
		Point point4 = new Point(3,1000);
		Point point5 = new Point(1,100);
		
		int maxPointOnLineNum = 0;
		maxPointOnLineNum = maxPointOnLine.maxPoints( new Point[]{point1,point2,point3,point4,point5});
		System.out.println(maxPointOnLineNum);
		
	}

}
