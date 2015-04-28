package com.galaxy.kite.algorithm.leetcode;

public class Candy {

	private  int totalCandy = 0;
	
	public  int candy(int[] ratings) {
		totalCandy = 0;
		int minCandy = 0;
		int maxRating = Integer.MAX_VALUE;
		int beginPosition = 0;
		for (int i = 0; i <= ratings.length; i++) {
			
			if ( i == ratings.length || ratings[i] > maxRating){
				minCandy = candy(minCandy,beginPosition,i-1,ratings);
				beginPosition = i;
			}
			maxRating = ratings[i];
		}
		return totalCandy;
	}
	
	public  int candy(int mincandy,int begin, int end, int[]ratings){
		
		if(end == begin){
			mincandy = mincandy +1;
			totalCandy += mincandy;
			return mincandy;
		}
		int lastCandy = 0;
		int minRating = Integer.MIN_VALUE;
		for(int i=end ; i >= begin; i--){
			
			if(ratings[i] > minRating){
				lastCandy +=1;
			}else if(ratings[i] == minRating){
				lastCandy = 1;
			}
			minRating = ratings[i];
			totalCandy +=lastCandy;
		}
		if(lastCandy <= mincandy){
			totalCandy = totalCandy -lastCandy + mincandy +1;
		}
		return 1;
	}

	public static void main(String[] args) {

						

	}

}
