package com.sanlly.auth.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.core.ISessionInfo;
import com.sanlly.auth.core.ISessionProvider;
import com.sanlly.auth.service.UserService;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.input.user.LoginInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.LoginOutput;
import com.sanlly.common.models.output.user.SessionOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 用户登陆相关
 * @author RexSheng
 * 2019年8月16日 下午1:15:15
 */
@RestController
public class AuthorityController {
	
	@Autowired
	private ISessionProvider session;
	
	@Autowired
	private UserService userService;

	/**
	 * 用户登陆
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Result login(@RequestBody LoginInput input) {
		UserInfoOutput user=userService.login(input);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put(PlatformConstants.SESSION_KEY_USER, new SessionOutput(user));
		ISessionInfo info=null;
		//创建session
		if(input.getSystemType()!=null && input.getSystemType().equals(SystemTypeEnum.APP.getCode())) {
			info=session.createSession(map,PlatformConstants.DEFAULT_TIMEOUT_APP);
		}
		else {
			info=session.createSession(map);
		}
		LoginOutput output=new LoginOutput(user);
		output.setToken(info.getSessionId());
		Calendar cal=Calendar.getInstance();
		cal.setTime(info.getCreateTime());
		cal.add(Calendar.SECOND, (int)info.getTimeout());
		output.setExpireDate(cal.getTime());
		return Result.Success(output);
	}
	
	/**
	 * 校验返回用户信息
	 * @return
	 * @throws AuthenticationException 
	 */
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public Result<SessionOutput> validate() throws AuthenticationException{
		ISessionInfo info=session.getCurrentSession();
		if(info!=null) {
			return Result.Success((SessionOutput)info.getAttribute(PlatformConstants.SESSION_KEY_USER));
		}
		throw new AuthenticationException("未登录");
	}
	
	/**
	 * 校验用户是否已登录
	 * @return
	 * @throws AuthenticationException
	 */
	@RequestMapping(value="/exists",method=RequestMethod.POST)
	public Result<Boolean> exists() throws AuthenticationException{
		return Result.Success(session.getCurrentSession()!=null);
	}
	
	/**
	 * 获取当前登陆用户
	 * @return
	 */
	@RequestMapping(value="/user/current",method=RequestMethod.GET)
	public Result<SessionOutput> getCurrentUser(){
		ISessionInfo info=session.getCurrentSession();
		return Result.Success((SessionOutput)info.getAttribute(PlatformConstants.SESSION_KEY_USER));
	}
	
	/**
	 * 退出登陆
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public Result logout() {
		session.expire();
		return Result.Success();
	}

}
