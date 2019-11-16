package com.sanlly.auth.core;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisSessionStore extends MemorySessionStore{
	
	@Autowired
	private RedisTemplate<String,Object> redisTemplate;
	
	private String prefix="session:";
	
	@Override
	protected ISessionInfo getStore(String sessionId) {
		Object obj=redisTemplate.opsForValue().get(sessionId.startsWith("session:")?sessionId:(prefix+sessionId));
		if(obj!=null){
			return (ISessionInfo)obj;
		}
		else{
			return null;
		}
	}

	@Override
	public ISessionInfo updateStore(ISessionInfo session) {
		redisTemplate.opsForValue().set(prefix+session.getSessionId(),session,session.getTimeout(),TimeUnit.SECONDS);
		return session;
	}

	@Override
	protected ISessionInfo addStore(ISessionInfo session) {
		redisTemplate.opsForValue().set(prefix+session.getSessionId(),session,session.getTimeout(),TimeUnit.SECONDS);
		return session;
	}

	@Override
	protected ISessionInfo deleteStore(ISessionInfo session) {
		redisTemplate.delete(prefix+session.getSessionId());
		return session;
	}
}
