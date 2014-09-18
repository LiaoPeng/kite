package com.galaxy.kite.algorithm.leetcode;

import org.junit.Test;

public class ReverseWordsTest {
	
	private ReverseWords reverseWords = new ReverseWords();
	
	@Test
	public void testNormalWords(){
		
		System.out.println( reverseWords.reverseWords(" abc def hij kk ") );
		System.out.println( reverseWords.reverseWords(" 1") );
		System.out.println( reverseWords.reverseWords("abc def,   hij kk") );
		System.out.println( reverseWords.reverseWords("Hello worlds!") );
		System.out.println( reverseWords.reverseWords("hi!") );
		
		System.out.println( reverseWords.reverseWordsOne(" abc def hij kk ") );
		System.out.println( reverseWords.reverseWordsOne(" 1") );
		System.out.println( reverseWords.reverseWordsOne("abc def,   hij kk") );
		System.out.println( reverseWords.reverseWordsOne("Hello worlds!") );
		System.out.println( reverseWords.reverseWordsOne("hi!") );
		
		
		
		
	}

}
