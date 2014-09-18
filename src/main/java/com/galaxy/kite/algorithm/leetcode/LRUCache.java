package com.galaxy.kite.algorithm.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer>{

	class Pair {
		int key;
		int val;

		public Pair(int key, int value) {
			this.key = key;
			this.val = value;
		}

		public Pair(int key) {
			this.key = key;
		}
	}

	LRUCache(int capacity) {
		this.capacity = capacity;
		pairMap = new HashMap<Integer, Iterator<Pair>>(
				(int) (capacity / loadFactor));
		pairList = new LinkedList<Pair>();
		size = 0;
	}

	private final int capacity;
	private int size = 0;
	private float loadFactor = 0.75f;
	private Map<Integer, Iterator<Pair>> pairMap;
	private LinkedList<Pair> pairList;

	public int get(int key) {

		Iterator<Pair> pairIterator = pairMap.get(key);
		int value = -1;
		if (pairIterator != null) {
			Pair visitedPair = pairIterator.next();
			value = (pairIterator == null) ? -1 : visitedPair.val;
			pairMap.remove(key);
			pairIterator.remove();
			pairList.add(visitedPair);
			pairMap.put(key, pairList.iterator());
			pairList.iterator();
		}
		return value;
	}

	public void set(int key, int value) {
		Iterator<Pair> pairIterator = pairMap.get(key);

		if (pairIterator != null) {
			pairIterator.remove();
			pairMap.remove(key);
			Pair newPair = new Pair(key, value);
			pairList.addFirst(newPair);
			pairMap.put(key, pairList.iterator());
		} else {
			Pair newPair = new Pair(key, value);
			if (size == capacity) {
				Pair removedPair = pairList.getLast();
				pairMap.remove(removedPair.key);

				pairList.addFirst(newPair);
				pairMap.put(key, pairList.iterator());

			} else {
				size++;
				pairList.addFirst(newPair);
				pairMap.put(key, pairList.iterator());
			}
		}
	}

}
