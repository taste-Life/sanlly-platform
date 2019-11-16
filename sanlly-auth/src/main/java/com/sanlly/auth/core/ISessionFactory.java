package com.sanlly.auth.core;

import java.util.Date;
import java.util.Map;

public interface ISessionFactory {
	ISessionInfo create(ISessionInfo session);

	/**
	 * 创建一个session，自动装入sessionstore,并指定createTime=new Date()
	 * @param sessionId
	 * @param data
	 * @return
	 */
	ISessionInfo create(String sessionId, Map<String, Object> data);
	
	/**
	 * 根据session所有信息，还原那个session
	 * @param sessionId
	 * @param data
	 * @param createTime
	 * @return
	 */
	ISessionInfo create(String sessionId, Map<String, Object> data,Date createTime);
	
	ISessionInfo create(String sessionId, Map<String, Object> data,Long timeout);
	
	ISessionInfo create(String sessionId, Map<String, Object> data,Long timeout,Date createTime);
}
