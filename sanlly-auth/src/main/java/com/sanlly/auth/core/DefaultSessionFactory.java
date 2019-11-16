package com.sanlly.auth.core;

import java.util.Date;
import java.util.Map;

public class DefaultSessionFactory implements ISessionFactory{
	
	@Override
	public ISessionInfo create(ISessionInfo session){
		SessionInfo newSession= new SessionInfo(session.getSessionId(),session.getAttributes(),session.getTimeout(),session.getCreateTime());
		return newSession;
	}
	
	@Override
	public ISessionInfo create(String sessionId,Map<String,Object> data){
		SessionInfo newSession= new SessionInfo(sessionId,data);
		return newSession;
	}

	@Override
	public ISessionInfo create(String sessionId, Map<String, Object> data, Date createTime) {
		SessionInfo newSession= new SessionInfo(sessionId,data,null,createTime);
		return newSession;
	}

	@Override
	public ISessionInfo create(String sessionId, Map<String, Object> data, Long timeout) {
		SessionInfo newSession= new SessionInfo(sessionId,data,timeout,null);
		return newSession;
	}

	@Override
	public ISessionInfo create(String sessionId, Map<String, Object> data, Long timeout, Date createTime) {
		SessionInfo newSession= new SessionInfo(sessionId,data,timeout,createTime);
		return newSession;
	}
}
