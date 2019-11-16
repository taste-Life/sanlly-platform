package com.sanlly.auth.core;

/**
 * 简单存储示例
 * @author 生旭鹏
 *
 */
public class MemorySessionStore extends AbstractSessionStore{
	
	private ICacheManager<String,ISessionInfo> cacheManager;
	
	public MemorySessionStore(){
		cacheManager=new DefaultCacheManager<String,ISessionInfo>();
	}
	@Override
	protected ISessionInfo getStore(String sessionId) {
		return cacheManager.get(sessionId);
	}

	@Override
	public ISessionInfo updateStore(ISessionInfo session) {
		cacheManager.set(session.getSessionId(), session);
		return session;
	}

	@Override
	protected ISessionInfo addStore(ISessionInfo session) {
		cacheManager.set(session.getSessionId(), session);
		return session;
	}

	@Override
	protected ISessionInfo deleteStore(ISessionInfo session) {
		cacheManager.remove(session.getSessionId());
		return session;
	}
}
