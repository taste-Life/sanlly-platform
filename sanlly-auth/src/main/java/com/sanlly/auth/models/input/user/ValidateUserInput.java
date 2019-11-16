package com.sanlly.auth.models.input.user;

/**
 * 用户登陆名验证
 * @author RexSheng
 * 2019年8月16日 上午9:42:45
 */
public class ValidateUserInput {

	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 登陆名
	 */
	private String loginAccount;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	
	
}
