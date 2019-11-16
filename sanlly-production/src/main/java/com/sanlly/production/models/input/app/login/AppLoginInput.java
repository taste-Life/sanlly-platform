package com.sanlly.production.models.input.app.login;

/**
 * app登陆
 * @author RexSheng
 * 2019年8月9日 上午10:55:36
 */
public class AppLoginInput {

	/**
	 * 公司
	 */
	private String companyKey;
	
	/**
	 * 场站
	 */
	private String yardKey;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 密码
	 */
	private String password;

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getYardKey() {
		return yardKey;
	}

	public void setYardKey(String yardKey) {
		this.yardKey = yardKey;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
