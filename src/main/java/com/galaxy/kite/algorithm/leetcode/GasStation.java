package com.galaxy.kite.algorithm.leetcode;

public class GasStation {

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int gasCount = gas.length;
		int left[] = new int[gasCount +2];
		for(int index =0; index < gasCount ;index++){
			left[index] = gas[index] - cost[index];
		}
		
		for(int index = 0; index < gasCount; index++){
			if(gasCount == 1){
				return left[0] >=0 ? 0 : -1;
			}
			if( left[(index + gasCount -1) % gasCount] <0 && left[index] >=0){
				if(canCompleteCircuit(left,gasCount,index)){
					return index;
				}
			}
		}
		return -1;
	}
	
	public boolean canCompleteCircuit(int []left ,int count,int index){
		
		int totalLeft = left[index], position = index +1;
		while(position % count != index ){
			totalLeft += left[(position++) % count];
			if(totalLeft < 0) return false;
		}
		return true;
	}

}
