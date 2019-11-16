package com.sanlly.auth.core;

/**
 * 缓存基类
 * @author 生旭鹏
 *
 */
public abstract class AbstractSessionStore implements ISessionStore{
	private ICacheManager<String,ISessionInfo> cacheManager;
	//默认1800s失效
	private long expireTime=1800L;
	//默认禁用缓存
	private Boolean enableCaching=false;
	public AbstractSessionStore(){
		cacheManager=new DefaultCacheManager<String,ISessionInfo>();
	}
	
	public AbstractSessionStore(long expireTime){
		this();
	}
	@Override
	public ISessionInfo save(ISessionInfo session) {
		addStore(session);
		if(enableCaching){
			cacheManager.set(session.getSessionId(), session);
		}
		return session;
	}

	@Override
	public ISessionInfo update(ISessionInfo session) {
		if(enableCaching){
			cacheManager.set(session.getSessionId(), session);
		}
		return updateStore(session);
	}
	
	@Override
	public ISessionInfo delete(ISessionInfo session) {
		if(enableCaching){
			cacheManager.remove(session.getSessionId());
		}
		return deleteStore(session);
	}

	@Override
	public ISessionInfo delete(String sessionId) {
		ISessionInfo session=null;
		if(enableCaching){
			session=cacheManager.remove(sessionId);
		}
		if(session!=null){
			deleteStore(session);
		}
		else{
			session=getStore(sessionId);
			if(session!=null){
				deleteStore(session);
			}
		}
		return session;
	}

	@Override
	public ISessionInfo get(String sessionId) {
		ISessionInfo session= null;
		if(enableCaching){
			session= cacheManager.get(sessionId);
		}
		if(session!=null){
			if(session.getIsValid()){
				
			}
			else{
				delete(session);
				return null;
			}
		}
		else{
			session= getStore(sessionId);
			//缓存无数据则加入
			if(session!=null && session.getIsValid() && enableCaching){
				cacheManager.set(session.getSessionId(), session);
			}
		}
		return session;
	}
	protected abstract ISessionInfo addStore(ISessionInfo session);
	protected abstract ISessionInfo getStore(String sessionId);
	protected abstract ISessionInfo updateStore(ISessionInfo session);
	protected abstract ISessionInfo deleteStore(ISessionInfo session);

	@Override
	public void setTimeout(Long timeout) {
		this.expireTime=timeout;
	}
	
	@Override
	public Long getTimeout() {
		return this.expireTime;
	}

	@Override
	public void setEnableCaching(Boolean enableCaching) {
		this.enableCaching=enableCaching;
	}
	
	
}