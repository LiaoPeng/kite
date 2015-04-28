package com.galaxy.kite.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PalindromePartitioningTest {
	
	PalindromePartitioning partitioning = null;
	
	@Before
	public void setUp(){
		partitioning = new PalindromePartitioning();
	}
	
	private void print(List<List<String>> lists){
		for(List<String> list: lists){
			System.out.println(Arrays.toString( list.toArray()));
		}
		System.out.println("-----------------------------------");
	}
	
	@Test
	public void test1(){
		List<List<String>> lists = partitioning.partition("");
		print(lists);
	}

	
	@Test
	public void test2(){
		List<List<String>> lists = partitioning.partition("aaaa");
		print(lists);
	}
	
	@Test
	public void test3(){
		List<List<String>> lists = partitioning.partition("abcd");
		print(lists);
	}
}
