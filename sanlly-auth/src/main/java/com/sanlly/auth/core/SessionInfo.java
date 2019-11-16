package com.sanlly.auth.core;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SessionInfo implements ISessionInfo,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sessionId;
	
	private transient Long timeout;
	
	private Date createTime;
	
	private transient Date expireTime;
	
	private Map<String,Object> attributes;
		
	@SuppressWarnings("unused")
	private transient Boolean isValid;
	
	public SessionInfo(){
		
	}
	
	public SessionInfo(String sessionId,Map<String,Object> attributes){
		this(sessionId,attributes,null,null);
	}
	
	public SessionInfo(String sessionId,Map<String,Object> attributes,Long timeout){
		this(sessionId,attributes,timeout,new Date());
	}
	
	public SessionInfo(String sessionId,Map<String,Object> attributes,Long timeout,Date createTime){
		this.sessionId = sessionId;
		this.attributes = attributes==null?new HashMap<String,Object>():attributes;
		
		if(timeout!=null){
			this.timeout=timeout;
		}
		else {
			this.timeout=-1L;
		}
		if(createTime!=null){
			this.createTime=createTime;
		}
		else{
			this.createTime=new Date();
		}
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public Object getAttribute(String key){
		Object o=this.attributes.get(key);
		return o;
	}
	
	public SessionInfo setAttribute(String key,Object value){
		this.attributes.put(key, value);
		return this;
	}

	public Map<String, Object> getAttributes() {
		return this.attributes;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getIsValid() {
		if(this.timeout.longValue()<0) {
			return true;
		}
		if(this.expireTime==null){
			Calendar cal=Calendar.getInstance();
			cal.setTime(this.getCreateTime());
			cal.add(Calendar.SECOND, timeout.intValue());
			this.expireTime=cal.getTime();
		}
		return this.expireTime.after(new Date());
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	
}
