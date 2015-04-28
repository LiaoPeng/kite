package com.galaxy.kite.tutorial.guava;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.base.Functions;

public class FucntionSample {

	public static void functionMap() {

		Map<String, String> map = new HashMap<String, String>() {
			{
				put("lover", "dulasi");
				put("hope", "only hope");
			}
		};
		Function<String, String> function = Functions.forMap(map);
		System.out.println(function.apply("lover"));
		System.out.println(function.apply("love"));
	}

	public static void main(String[] args) {
		functionMap();
	}

}
