package com.galaxy.kite.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;


@Ignore
public class WordBreakIITest {
	
	public List<String> wordBreak(String originalString2, Set<String> dict2){
		return null;
	}
	
	private WordBreakII workBreakII = new WordBreakII();
	private String originalString = null;
	private Set<String> dict = new HashSet<String>();
	
	@Test
	public void testCase0(){
		originalString = "tomtomtom";
		dict.addAll(Arrays.asList("jack", "tom","ja","ck"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}
	
	@Test
	public void testCase1(){
		originalString = "tomtomtomtomckckck";
		dict.addAll(Arrays.asList("jack", "tom","ja","ck"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}
	
	
	@Test
	public void testCase2(){
		originalString = "tomtomjajatom";
		dict.addAll(Arrays.asList("jack", "tom","ja","ck"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}
	
	
	@Test
	public void testCase3(){
		originalString = "jack";
		dict.addAll(Arrays.asList("jack", "tom","ja","ck"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}
	
	
	@Test
	public void testCase4(){
		originalString = "ja";
		dict.addAll(Arrays.asList("jack", "tom","ja","ck"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}

	
	@Test
	public void testCase5(){
		originalString = "jaa";
		dict.addAll(Arrays.asList("jack", "tom","ja","ck"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}
	
	@Test
	@Ignore
	public void testCase6(){
		originalString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		dict.addAll(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
		List<String> result = workBreakII.wordBreak(originalString, dict);
		System.out.println(result);
	}
}
