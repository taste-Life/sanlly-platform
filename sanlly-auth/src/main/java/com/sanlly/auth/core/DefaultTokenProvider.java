package com.sanlly.auth.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.sanlly.common.utils.JwtUtil;

public class DefaultTokenProvider implements ITokenProvider{

	@Override
	public String createToken(Map<String, Object> data) {
		Map<String,String> newMap=new HashMap<String,String>();
		if(data!=null){
			for(Entry<String,Object> entry:data.entrySet()){
				newMap.put(entry.getKey(), JSON.toJSONString(entry.getValue()));
			}
		}
		return JwtUtil.createToken(newMap);
	}

	public Boolean verifyToken(String token) {
		return JwtUtil.verifyTokenStatus(token);
	}

	public Map<String, Object> getTokenData(String token) {
		Map<String,String> data= JwtUtil.verifyToken(token);
		Map<String,Object> newMap=new HashMap<String,Object>();
		for(Entry<String,String> entry:data.entrySet()){
			newMap.put(entry.getKey(), JSON.parse(entry.getValue()));
		}
		return newMap;
	}

	protected HttpServletRequest getHttpRequest(){
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		return request;
	}
	
	@Override
	public String getCurrentToken(){
		HttpServletRequest request = getHttpRequest();
		String auth=request.getHeader("Authorization");
		if(auth!=null && !auth.equals("") && !auth.equals("undefined")){
			if(auth.startsWith("Bear ")){
				return auth.substring(5);
			}
			else{
				return auth;
			}
		}
		else{
			return null;
		}
	}
}
