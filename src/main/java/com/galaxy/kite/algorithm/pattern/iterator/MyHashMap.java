package com.galaxy.kite.algorithm.pattern.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap<T> implements Iterable<T> {
	
	List<T> list = new LinkedList<T>();

	@Override
	public Iterator<T> iterator() {
		
		return null;
	}
	
	class MyIterator implements Iterator<T>{

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public T next() {
			return null;
		}

		@Override
		public void remove() {
			
		}

		
		
	}

}
