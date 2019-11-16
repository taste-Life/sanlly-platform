package com.sanlly.auth.core;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public interface ISessionInfo extends Serializable{
	String getSessionId();
	
	Object getAttribute(String key);
	
	ISessionInfo setAttribute(String key,Object value);
	
	Map<String,Object> getAttributes();
	
	Boolean getIsValid();
	
	void setTimeout(long timeout);
	
	long getTimeout();
	
	Date getCreateTime();
	
}
