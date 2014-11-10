package com.galaxy.kite.util.http;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

import com.galaxy.kite.constant.HttpHeader;

public class HttpRequestHelper {
	
	
	/**
	 * If the ajax request send by JQuery, 
	 * 	according to the header x-requested-with to judge the request is ajax request or not
	 * @param request
	 * @return
	 */
	public static boolean isAjaxRequest(HttpServletRequest request){
		
		String ajaxParameter = request.getHeader(HttpHeader.XML_REQUESTED_WITH.getHeaderFieldName());
		return StringUtils.isEmpty(ajaxParameter) ? false : true;
	}
	
	public static boolean canReceivedJsonData(HttpServletRequest request){
		
		boolean isJsonDataReceived = false;
		
		String acceptType = request.getHeader(HttpHeader.ACCEPT.getHeaderFieldName());
		if(!acceptType.isEmpty()){
			isJsonDataReceived = isJsonDataReceived ||acceptType.toLowerCase().contains("application/json");
			isJsonDataReceived = isJsonDataReceived ||acceptType.toLowerCase().contains("*/*");
		}
		return isJsonDataReceived;
	}

}
