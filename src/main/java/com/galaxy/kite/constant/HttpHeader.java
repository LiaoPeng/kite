package com.galaxy.kite.constant;

public enum HttpHeader {
	
	ACCEPT("accept"),
	ACCEPT_LANGUAGE("accept-language"),
	ACCEPT_ENCODING("Accept-Encoding"),
	USER_AGENT("User-Agent"),
	XML_REQUESTED_WITH("X-Requested-With");
	
	private String field;
	private HttpHeader(String field){
		this.field = field;
	}

	public String getHeaderFieldName(){
		return field;
	}
}
