package com.galaxy.kite.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

	public String reverseWordsOne(String s) {

		StringBuilder resultBuilder = new StringBuilder(s.length() * 2);
		StringBuilder tempBuilder = new StringBuilder();
		char ch = 0;
		s = s.trim().replaceAll(" {2,}", " ");
		for (int i = s.length() - 1; i >= 0; i--) {
			ch = s.charAt(i);
			if (ch!=' ') {
				tempBuilder.append(ch);
			} else {
				resultBuilder.append(tempBuilder.reverse().toString())
						.append(ch);
				tempBuilder.setLength(0);
			}
		}

		if (tempBuilder.length() != 0) {
			resultBuilder.append(tempBuilder.reverse().toString());
		}
		return resultBuilder.toString();

	}

	public String reverseWords(String s) {

		String strWithoutSpace = s.trim().replaceAll(" {2,}", " ");
		List<String> words = new ArrayList<String>();

		StringBuilder wordBuilder = new StringBuilder();
		char ch = 0;
		for (int i = 0, len = strWithoutSpace.length(); i < len; i++) {
			ch = strWithoutSpace.charAt(i);
			if (ch!=' ') {
				wordBuilder.append(ch);
			} else {
				if (wordBuilder.length() != 0) {
					words.add(wordBuilder.toString());
				}
				wordBuilder.setLength(0);
				words.add(ch + "");
			}
		}

		if (wordBuilder.length() != 0) {
			words.add(wordBuilder.toString());
		}

		int right = 0, left = words.size()-1;
		String temp;
		while (right < left) {

			if (isWord(words.get(right)) && isWord(words.get(left))) {
				temp = words.get(right);
				words.set(right, words.get(left));
				words.set(left, temp);
				right++;
				left--;
			}

			if (!isWord(words.get(right))) {
				right++;
			}

			if (!isWord(words.get(left))) {
				left--;
			}
		}

		StringBuilder wordsBuilder = new StringBuilder();
		for(String word:words){
			wordsBuilder.append(word);
		}
		
		
		return wordsBuilder.toString();

	}

	private boolean isWord(String word) {

		char ch = word.charAt(0);
		if (ch!=' ') {
			return true;
		}
		return false;
	}
}
