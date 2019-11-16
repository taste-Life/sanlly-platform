package com.sanlly.auth.core;

import java.util.Map;

public interface ISessionProvider {

	ISessionInfo createSession(Map<String,Object> data);
	
	ISessionInfo createSession(Map<String,Object> data,Long timeout);
	
	ISessionInfo getSession(String sessionId);
	
	ISessionInfo getCurrentSession();

	ISessionStore getSessionStore();

	void setSessionStore(ISessionStore sessionStore);
 
	ITokenProvider getTokenProvider();

	void setTokenProvider(ITokenProvider tokenProvider);
	
	void expire();
	
	void expire(String sessionId);
}