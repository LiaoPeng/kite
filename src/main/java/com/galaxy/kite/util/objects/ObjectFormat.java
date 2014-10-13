package com.galaxy.kite.util.objects;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.codehaus.jackson.map.ObjectMapper;

public class ObjectFormat {
	
	private static boolean isFormat = false;
	
	/**
	 * Convert Object to Jackson string
	 * 	 if convert failed, use default toString() method
	 * @param obj
	 * @return
	 */
	public static String toJsonString(Object obj){	
		return toJsonString(obj, false);
	}
	
	/**
	 * 
	 * @param obj
	 * @param isPrettyPrinter
	 * @return The object string
	 */
	public static String toJsonString(Object obj,boolean isPrettyPrinter){

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = null;
		Writer writer = new StringWriter();
		try {
			if(isPrettyPrinter){
				mapper.writerWithDefaultPrettyPrinter().writeValue(writer, obj);
			} else{
				mapper.writeValue(writer, obj);
			}
			
			jsonString = writer.toString();
		} catch (IOException e) {
			jsonString = obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
		}
		
		return jsonString;
	}
}
