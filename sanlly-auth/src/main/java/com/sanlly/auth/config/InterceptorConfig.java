package com.sanlly.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
//	@Autowired
//	private AuthInterceptor interceptor;
	/**
	 * 添加拦截器到Spring Boot配置中
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/login","/validate");
	}
}
