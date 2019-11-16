package com.sanlly.auth.core;

public interface ISessionStore {

	ISessionInfo save(ISessionInfo session);
	ISessionInfo update(ISessionInfo session);
	ISessionInfo delete(ISessionInfo session);
	ISessionInfo delete(String sessionId);
	ISessionInfo get(String sessionId);
	/**
	 * 过期时间（秒）默认1800L
	 * @param timeout
	 */
	void setTimeout(Long timeout);
	Long getTimeout();
	
	/**
	 * 是否允许本地二级缓存，默认true
	 * @param enableCaching
	 */
	void setEnableCaching(Boolean enableCaching);
}
