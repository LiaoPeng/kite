package com.galaxy.kite.common.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class ServiceLogInterceptor {
	
	private static Log log = LogFactory.getLog(ServiceLogInterceptor.class);
	
	@Around(value = "")
	public void logServiceRuntime(){
		
	}

}
