package com.galaxy.kite.algorithm.leetcode;

public class SingleNumberII {
	
 public int singleNumber(int[] arr) {
		 
		 int bitNum[] = new int[34];
		 for(int value:arr){
			 int bitValue = 1;
			 bitNum[32] += (value < 0) ? 1 :0;
			 value = (value<0) ? ~value: value;
			 for(int i=0;i<32;i++){
				bitNum[i] += (bitValue & value) >>i ;
				bitValue = bitValue << 1;
			 }
		 }
		 int bitValue = 1, result = 0;
		 for(int i=0; i< 32;i++){
			 if(bitNum[i] % 3 != 0){
				 result += bitValue;
			 }
			 bitValue = bitValue << 1;
		 }
		 return (bitNum[32] % 3 != 0) ? ~result : result;
	 }

}
