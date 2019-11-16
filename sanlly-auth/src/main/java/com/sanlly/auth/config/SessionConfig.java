package com.sanlly.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sanlly.auth.core.DefaultSessionProvider;
import com.sanlly.auth.core.ISessionProvider;
import com.sanlly.auth.core.ITokenProvider;
import com.sanlly.auth.core.RedisSessionStore;
import com.sanlly.auth.core.UuidTokenProvider;
import com.sanlly.common.constants.PlatformConstants;

@Configuration
public class SessionConfig {
	
	@Autowired
	private RedisSessionStore redisSessionStore;
	
	@Bean
	public ISessionProvider provider(){
		DefaultSessionProvider provider= new DefaultSessionProvider();
		
		redisSessionStore.setTimeout(PlatformConstants.DEFAULT_TIMEOUT_WEB);
		redisSessionStore.setEnableCaching(false);
		provider.setSessionStore(redisSessionStore);
		
		provider.setTokenProvider(token());
		return provider;
	}
	
	
	@Bean
	public ITokenProvider token(){
		return new UuidTokenProvider();
	}
}
