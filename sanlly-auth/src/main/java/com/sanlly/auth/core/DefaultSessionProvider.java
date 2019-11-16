package com.sanlly.auth.core;

import java.util.Map;

public class DefaultSessionProvider implements ISessionProvider{

	private ITokenProvider tokenProvider=new DefaultTokenProvider();
	
	private ISessionStore sessionStore=new MemorySessionStore();
	
	private ISessionFactory sessionFactory=new DefaultSessionFactory();
	
	public DefaultSessionProvider(){
		 
	}
	
	public DefaultSessionProvider(ITokenProvider userTokenProvider,ISessionStore userSessonStore){
		tokenProvider=userTokenProvider;
		sessionStore=userSessonStore;
	}
	
	public ISessionInfo createSession(Map<String,Object> data){
		String sessionId=tokenProvider.createToken(data);
		
		ISessionInfo session= sessionFactory.create(sessionId, data,sessionStore.getTimeout());
		sessionStore.save(session);
		return session;
	}
	

	@Override
	public ISessionInfo createSession(Map<String, Object> data, Long timeout) {
		String sessionId=tokenProvider.createToken(data);
		
		ISessionInfo session= sessionFactory.create(sessionId, data, timeout);
		sessionStore.save(session);
		return session;
	}
	
	public ISessionInfo getSession(String sessionId){
		if(sessionId==null){
			return null;
		}
		ISessionInfo session=sessionStore.get(sessionId);
		if(session!=null){
			return sessionFactory.create(session.getSessionId(), session.getAttributes(),sessionStore.getTimeout(), session.getCreateTime());
		}
		else{
			return null;
		}
	}
	
	public ISessionInfo getCurrentSession(){
		String token=tokenProvider.getCurrentToken();
		return getSession(token);
	}

	public ISessionStore getSessionStore() {
		return sessionStore;
	}

	public void setSessionStore(ISessionStore sessionStore) {
		this.sessionStore = sessionStore;
	}
 
	public ITokenProvider getTokenProvider() {
		return tokenProvider;
	}

	public void setTokenProvider(ITokenProvider tokenProvider) {
		this.tokenProvider = tokenProvider;
	}

	@Override
	public void expire() {
		String sessionId=tokenProvider.getCurrentToken();
		if(sessionId!=null){
			sessionStore.delete(sessionId);
		}
	}

	@Override
	public void expire(String sessionId) {
		if(sessionId!=null){
			sessionStore.delete(sessionId);
		}
	}

	
}
