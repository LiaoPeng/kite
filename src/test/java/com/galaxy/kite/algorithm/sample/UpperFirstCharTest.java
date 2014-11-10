package com.galaxy.kite.algorithm.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.expression.spel.ast.OpLE;

public class UpperFirstCharTest {

	private UpperFirstChar upperFirstChar = new UpperFirstChar();

	@Test
	@Ignore
	public void testUpperFirstChar() {

		String str = upperFirstChar.upperFirstChar(null);
		System.out.println(str);

		str = upperFirstChar.upperFirstChar("");
		System.out.println(str);

		str = upperFirstChar.upperFirstChar("A");
		System.out.println(str);

		str = upperFirstChar.upperFirstChar("sfA");
		System.out.println(str);

		str = upperFirstChar.upperFirstChar("1");
		System.out.println(str);

		str = upperFirstChar.upperFirstChar("a");
		System.out.println(str);
	}

	@Test
	public void test() throws IOException {

		File file = new File("file");
		file.createNewFile();
		String dirString = "/11/22\\33\\44/55";
		
		String strs[] = dirString.split("\\\\|/");
		for (String string : strs) {
			System.out.println(string + " ");
		}
	
		
		Object object = null;
		System.out.println("Object null" + object);
		
		List<String> optList = new ArrayList<String>();
		optList.add(null);
		optList.add(null);
		System.out.println("Size = " + optList.size());
		for(String str:optList){
			System.out.println(str + "str");
		}
	}

}
