package com.galaxy.kite.algorithm.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.util.StringUtils;

public class UpperFirstChar {
	
	public String upperFirstChar(String str){
		String string = "";
		if(!StringUtils.isEmpty(str)){
			string += str.toString().substring(0, 1).toUpperCase() 
					+ str.toString().substring(1,str.toString().length()).toLowerCase()
					+", ";
		}
		return string;
	}
	
	public static void main(String[] args) {
		
		List<Integer> inter = Arrays.asList(1,2,3,4,5);
		
		Integer [] arr= new Integer[]{5,2,3,4};
		
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 -o2;
			}
		});
		
		System.out.println(arr);
	}
}
