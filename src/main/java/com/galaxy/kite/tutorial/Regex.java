package com.galaxy.kite.tutorial;

import java.util.regex.Pattern;

public class Regex {
	
	public static void getPatternStr(){
		
		String originalStr = "OMDW_Salesperso";
		String originalStr1 = "Power";
		String regex = ".*((OMDW)|Power).*";
		Pattern pattern = Pattern.compile(regex);
		System.out.println(pattern.toString());
		System.out.println(pattern.matcher(originalStr).matches());
		System.out.println(originalStr.matches(regex));
		System.out.println(originalStr.indexOf(regex)!=-1);
		System.out.println(Pattern.matches(regex, originalStr));
		System.out.println(Pattern.matches(regex, originalStr1));
		System.out.println(Pattern.matches("OMD|wwww", "OMD"));
	}

	public static void repalceTd(){
		
		String trString = "<tr><td>ssss</td><td>ssss</td><td id='msrp'>ssss</td>	<td>ssss</td></tr>";
		String result = trString.replaceFirst("<td[^>]*id='msrp'[^>]*>.*?<\\/td>","dddddd" );
		System.out.println(result);
	}
	
	public static void main(String[] args) {
//		getPatternStr();
//		repalceTd();
		System.out.println(Pattern.matches("OMD|wwww", "OM"));
	}
}
