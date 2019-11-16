package com.activiti.config;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import feign.RequestInterceptor;
import feign.RequestTemplate;


@Configuration
public class FeignClientConfig implements RequestInterceptor{

	@Override
	public void apply(RequestTemplate template) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if(attributes==null)
			return;
		HttpServletRequest request = attributes.getRequest();
		Enumeration<String> headerNames = request.getHeaderNames();
		if (headerNames != null) {
			while (headerNames.hasMoreElements()) {
				String name = headerNames.nextElement();
				String values = request.getHeader(name);
				template.header(name, values);

			}
			//logger.info("feign interceptor header:{}", template);
		}
		/*
		 * Enumeration<String> bodyNames = request.getParameterNames();
		 * StringBuffer body =new StringBuffer(); if (bodyNames != null) { while
		 * (bodyNames.hasMoreElements()) { String name =
		 * bodyNames.nextElement(); String values = request.getParameter(name);
		 * body.append(name).append("=").append(values).append("&"); } }
		 * if(body.length()!=0) { body.deleteCharAt(body.length()-1);
		 * template.body(body.toString()); //logger.info(
		 * "feign interceptor body:{}",body.toString()); }
		 */
	}
//	@Bean
//	public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
//		return new BasicAuthRequestInterceptor("admin", "12345678");
//	}
}
