package com.galaxy.kite.algorithm.leetcode;

import java.util.Set;

public class WordBreak {
	
	class Word{
		boolean isVisited = false;
		boolean canBreak = false;
	}

	private Word canWordBreak[][];

	public boolean wordBreak(String s, Set<String> dict) {
		if (s == null) {
			return dict.contains(s);
		}
		int strLength = s.length();
		canWordBreak = new Word[strLength + 2][strLength + 2];
		for(int i=0; i< canWordBreak.length ;i ++){
			for( int j=0; j<canWordBreak[i].length; j++){
				canWordBreak[i][j] = new Word();
			}
		}
		return canWordBreak(s, dict, 0, strLength);
	}

	private boolean canWordBreak(String orginalStr, Set<String> dict, int begin,
			int end) {
		
		if(canWordBreak[begin][end].isVisited){
			return canWordBreak[begin][end].canBreak;
		}

		canWordBreak[begin][end].canBreak =  dict.contains(orginalStr.substring(begin, end)) ? true : false;
		if (canWordBreak[begin][end].canBreak == false) {
			for (int i = begin + 1; i < end; i++) {
				if (canWordBreak(orginalStr, dict, begin, i)
						&& canWordBreak(orginalStr, dict, i, end)) {
					canWordBreak[begin][end].canBreak = true;
					break;
				}
			}
		}
		canWordBreak[begin][end].isVisited = true;
		return canWordBreak[begin][end].canBreak;
	}

}
