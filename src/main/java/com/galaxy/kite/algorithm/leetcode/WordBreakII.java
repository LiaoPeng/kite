package com.galaxy.kite.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakII {

	class Word {
		boolean canBreak = false;
		Set<String> words = new HashSet<String>();
	}
	
	private String orginalStr = null;
	
	private Set<String> orginalDict = null;
	
	private int count =0;

	private Map<String, Word> wordMap = new HashMap<String, WordBreakII.Word>();

	public List<String> wordBreak(String s, Set<String> dict) {

		int strLength = s.length();
		orginalStr = s;
		orginalDict = dict; 
		canWordBreak(0, strLength);
		return new ArrayList<String>(wordMap.get(s).words);
	}

	private boolean canWordBreak(int begin, int end) {

		String destStr = orginalStr.substring(begin, end);
		System.out.println(destStr);
	
		if (!wordMap.containsKey(destStr)) {
			wordMap.put(destStr, new Word());
		} else{
			return wordMap.get(destStr).canBreak;
		}
		Word word = wordMap.get(destStr);
		
		System.out.println("count:" + count++ + destStr);

		if (orginalDict.contains(destStr)) {
			word.canBreak = true;
			word.words.add(destStr);
		}

		String partOneStr = null, partTwoStr = null;
		Set<String> partOneList = null, partTwoList = null;

		for (int i = begin + 1; i < end; i++) {
			
			partOneStr = orginalStr.substring(begin, i);
			partTwoStr = orginalStr.substring(i, end);
			
			if (canWordBreak( begin, i) && canWordBreak(i, end)) {

				word.canBreak = true;
				partOneStr = orginalStr.substring(begin, i);
				partTwoStr = orginalStr.substring(i, end);

				partOneList = wordMap.get(partOneStr).words;
				partTwoList = wordMap.get(partTwoStr).words;

				for (String wordOne : partOneList) {
					for (String wordTwo : partTwoList) {
						word.words.add(wordOne + " " + wordTwo);
					}
				}
			}
		}
		return word.canBreak;
	}

}
