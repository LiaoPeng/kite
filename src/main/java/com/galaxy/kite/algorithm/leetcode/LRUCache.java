package com.galaxy.kite.algorithm.leetcode;

import java.util.Map;
import java.util.LinkedHashMap;

public class LRUCache extends LinkedHashMap<Integer, Integer> {

	private final int maxCapacity;

	LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		maxCapacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {

		return size() > maxCapacity;
	}

	public int get(int key) {
		Object value = super.get(key);
		return (value == null) ? -1 : (Integer) value;
	}

	public void set(int key, int value) {
		super.put(key, value);
	}
}
