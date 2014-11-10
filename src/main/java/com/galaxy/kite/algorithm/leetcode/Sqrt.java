package com.galaxy.kite.algorithm.leetcode;

import java.util.TreeMap;


public class Sqrt {
	
	private int MAX_SQUARE = 46340;
	
	/**
	 * Description:Compute and return square the root of x
	 * 
	 * procedure:
	 * 1, if result * result == x 
	 * 
	 * @param x
	 * @return
	 */
	public int sqrt(int x){
		
		int result = 0;
		int left = 0; 
		int right =  MAX_SQUARE < x ? MAX_SQUARE: x;
		int middle = 0;
		while(left <= right){
			middle = (left - right)/2 + right;
			
			if(middle * middle == x){
				result = middle;
				break;
			}else if(middle * middle < x){
				
				if( (long)(middle+1) * (long)(middle+1) <= x ){
					left = middle+1;
				}else {
					result = selectBetterResult(middle, middle+1, x);
					break;
				}
			}else if(middle * middle > x){
				
				if( (middle-1) * (middle-1) >= x ){
					right = middle-1;
				}else {
					result = selectBetterResult(middle-1, middle, x);
					break;
				}
			}
		}
		return result;

	}
	
	
	public int selectBetterResult(long candidateA,long candidateB,int x){
		
		long a = candidateA *candidateA ;
		long b = candidateB * candidateB;
		
		return (int)( a<b ? candidateA : candidateB);
		
	}
}
