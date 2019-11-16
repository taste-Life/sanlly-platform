package com.sanlly.common.models.output.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 登陆结果
 * @author RexSheng
 * 2019年8月16日 下午1:06:54
 */
public class LoginOutput {
	private String token;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	private Date expireDate;
	
	private UserInfoOutput user;
	
	public LoginOutput() {}
	
	public LoginOutput(UserInfoOutput user) {
		this.user=user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public UserInfoOutput getUser() {
		return user;
	}

	public void setUser(UserInfoOutput user) {
		this.user = user;
	}
	
	
}
