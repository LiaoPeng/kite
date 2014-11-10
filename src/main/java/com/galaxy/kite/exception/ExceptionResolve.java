package com.galaxy.kite.exception;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.galaxy.kite.model.ResultModel;
import com.galaxy.kite.util.http.HttpRequestHelper;
import com.galaxy.kite.util.http.JsonViewWrapper;


@Component("exceptionResolver")
public class ExceptionResolve extends AbstractHandlerExceptionResolver {
	
	private static Log log = LogFactory.getLog(ExceptionResolve.class);

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
	
		log.info(MessageFormat.format("Error caugh in {0}. Exception details:{1}",this.getClass().getSimpleName(), ex));
		
		ModelAndView resultMV = new ModelAndView(); 
		if(HttpRequestHelper.isAjaxRequest(request) && HttpRequestHelper.canReceivedJsonData(request)){
			MappingJacksonJsonView jsonView = new MappingJacksonJsonView();
			JsonViewWrapper.wrapErrorResponseIntoJsonView(ex.getMessage(), jsonView);
			resultMV.setView(jsonView);
		} else {
			resultMV.setViewName("exception-view");
		}
		
		return resultMV;
	}



}
