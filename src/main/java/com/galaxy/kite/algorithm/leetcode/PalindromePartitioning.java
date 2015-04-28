package com.galaxy.kite.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {

	private boolean[][] palindrome = null;

	public List<List<String>> partition(String s) {

		int len = s.length();
		palindrome = new boolean[len + 2][len + 2];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				palindrome[i][j] = isPalindrome(s, i, j + 1);
			}
		}
		return findPartition(s, 0, s.length());
	}

	private List<List<String>> findPartition(String str, int start, int end) {
		List<List<String>> list = new LinkedList<List<String>>();

		if (palindrome[start][end-1]) {
			List<String> alist = new LinkedList<String>();
			alist.add(str.substring(start, end));
			list.add(alist);
		}

		for (int i = start; i < end-1; i++) {
			if (palindrome[start][i]) {
				List<List<String>> subLists = findPartition(str, i+1, end);
				for (List<String> alist : subLists) {
					List<String> newList = new ArrayList<String>();
					newList.add(str.substring(start, i + 1));
					newList.addAll(alist);
					list.add(newList);
				}
			}
		}
		return list;
	}

	private boolean isPalindrome(String str, int start, int end) {
		str = str.substring(start, end);
		int len = str.length();
		for (int i = 0; i * 2 < len; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
