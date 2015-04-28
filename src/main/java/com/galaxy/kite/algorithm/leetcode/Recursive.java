package com.galaxy.kite.algorithm.leetcode;


public class Recursive {
	
	public static void main(String[] args) {
		print(11);
	}

	public static void print(int n){
		int []array = new int[20];
		//print(0,n,array,-1);
		
		int begin = 0;
		int left = n ;
		
		while(begin + 1 <= left){
		
			
		}
	}
	
	/**
	 * 
	 * n represent total sum
	 * 
	 * @param begin , begin+1 下一个加数最小值
	 * @param left  , 还需要的加数和
	 * @param array , 存储加数的数组
	 * @param deep	, deep +1 一共有几个加数
	 */
	public static void print(int begin,int left,int array[],int deep){
		
		if( left >= (begin +1 )  ){
			for(int i=0;i<= deep;i++){
				System.out.print(array[i] + " ");
			}
			System.out.println(left);
		}
		for(int i = begin +1;i <= left;i++){
			array[deep+1] = i;
			print(i ,left - i, array,deep + 1 );
		}
	}
	
	
	
}
