package com.galaxy.kite.tutorial.guava;

import com.google.common.base.Predicate;




public class PredicateSample {
	
	
	public void sample1(){
		
		Predicate<Integer> oddPredicate = new Predicate<Integer>() {
			@Override
			public boolean apply(Integer input) {
				return input % 2 == 0;
			}
		};
	
		
	}

}
