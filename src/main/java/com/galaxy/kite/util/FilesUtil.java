package com.galaxy.kite.util;

import java.io.File;
import java.util.regex.Pattern;

public class FilesUtil {
	
	
	public static String[] separatorDirtory(String filePath){
		
		if(filePath != null){
			return filePath.split( Pattern.quote(File.separator));
		}
		return new String[0];
	}
	
}
