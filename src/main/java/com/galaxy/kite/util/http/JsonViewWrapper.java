package com.galaxy.kite.util.http;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

public class JsonViewWrapper {
	
	public static final String STATUS = "status";
	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	public static final String MESSAGE = "message";
	public static final String DATA = "data";
	
	public static void wrapErrorResponseIntoJsonView(String message, MappingJacksonJsonView jsonView){
		jsonView.addStaticAttribute(STATUS, ERROR);
		jsonView.addStaticAttribute(DATA,message);
	}

	public static void wrapSuccessResponseIntoJsonView(Object model, MappingJacksonJsonView jsonView){
		jsonView.addStaticAttribute(STATUS, SUCCESS);
		jsonView.addStaticAttribute(DATA, model);
	}
	
}
