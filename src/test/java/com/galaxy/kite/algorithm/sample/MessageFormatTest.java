package com.galaxy.kite.algorithm.sample;

import java.text.MessageFormat;

import org.junit.Test;

public class MessageFormatTest {
	
	
	@Test
	public void testNullPoinert(){
		
		System.out.println( MessageFormat.format("null:{0},{1}", null,"null") );
		
	}

}
