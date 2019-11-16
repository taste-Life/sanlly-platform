package com.sanlly.auth.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sanlly.auth.core.ISessionInfo;
import com.sanlly.auth.core.ISessionProvider;
import com.sanlly.common.annotations.DisablePermission;
import com.sanlly.common.annotations.PlatformPermission;
import com.sanlly.common.models.exception.AuthorizationException;
import com.sanlly.common.models.output.user.UserInfoOutput;

@Service
public class AuthInterceptor implements HandlerInterceptor{
	
	@Autowired
	private ISessionProvider sessionProvider;
	
	@SuppressWarnings("unused")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//判断用户是否已登录
		if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
			HandlerMethod handlerMethod=(HandlerMethod)handler;
			
			//判断controller下的方法是否需要判断权限
			DisablePermission disPermission=handlerMethod.getMethod().getAnnotation(DisablePermission.class);
			if(disPermission!=null){
				return true;
			}
			PlatformPermission permission=handlerMethod.getMethod().getAnnotation(PlatformPermission.class);
			if(permission!=null && permission.value()!=null){
				//权限判断
				String[] values=permission.value();
				ISessionInfo sessionInfo=sessionProvider.getCurrentSession();
				if(sessionInfo==null){
					setError(response);
					return false;
				}
				UserInfoOutput user=(UserInfoOutput)sessionInfo.getAttribute("user");
				if(user==null){
					setError(response);
					return false;
				}
//				if(user.getAuthList()==null || user.getAuthList().size()==0){
//					setError(response);
//					return false;
//				}
//				List<String> list=user.getAuthList().stream().map(m->m.getAuthCode()).collect(Collectors.toList());
//				Boolean contains=false;
//				for(String value:values){
//					if(list.contains(value)){
//						contains=true;
//					}
//				}
//				if(!contains){
//					setError(response);
//					return false;
//				}
//				return contains;
			}
		}
		else{
			ISessionInfo sessionInfo=sessionProvider.getCurrentSession();
			if(sessionInfo==null){
				setError(response);
				return false;
			}
//			UserInfoOutput user=(UserInfoOutput)sessionInfo.getAttribute("user");
//			if(user==null){
//				setError(response);
//				return false;
//			}
		}
		return true;
	}
	
	private Boolean setError(HttpServletResponse response)throws Exception{
		throw new AuthorizationException();
//		response.setContentType("application/json;charset=utf-8");
////		response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
////		response.setStatus(401);
//		response.getOutputStream().write(
//				JSON.toJSONString(Result.Error(HttpServletResponse.SC_UNAUTHORIZED,"UNAUTHORIZED")).getBytes("utf-8"));
//		return false;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object data, Exception e)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object data, ModelAndView e)
			throws Exception {
		
	}

	

}