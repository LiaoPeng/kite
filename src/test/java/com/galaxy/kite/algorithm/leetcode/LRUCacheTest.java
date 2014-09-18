package com.galaxy.kite.algorithm.leetcode;

import java.net.URLDecoder;
import java.util.Random;

import junit.framework.Assert;

import org.junit.Test;

public class LRUCacheTest {

	private LRUCache lruCache = null;

	@Test
	public void testLruCache() {

		int key = 0, value = new Random().nextInt();
		int result = 0;
		lruCache = new LRUCache(2);

		lruCache.set(2, 1);
		lruCache.set(1, 1);
		Assert.assertEquals(1, lruCache.get(2));
		lruCache.set(4, 1);
		Assert.assertEquals(-1, lruCache.get(1));
		Assert.assertEquals(1, lruCache.get(2));

	}

	@Test
	public void testLruCacheNull() {

		lruCache = new LRUCache(4);
		set(10, 13);
		set(3, 17);
		set(6, 11);
		set(10, 5);
		set(9, 10);
		//get(13);
		set(2, 19);
		get(2);
		get(3);
		set(5, 25);
		get(8);
		set(9, 22);
		set(5, 5);
		set(1, 30);
		get(11);
		set(9, 12);
		get(7);
		get(5);
		get(8);
		get(9);
		set(4, 30);
		
	}

	private void set(int key, int value) {
		lruCache.set(key, value);
	}

	private void get(int key) {
		lruCache.get(key);
	}
	
	
	@Test
	public void testEncode(){
		String myString="%E4%B8%AD%E5%9B%BD";
		String encodedStr =null;
		encodedStr = URLDecoder.decode(myString);
		System.out.println(encodedStr);
	}

}
