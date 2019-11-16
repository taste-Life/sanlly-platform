package com.sanlly.production.models.output.app.user;

/**
 * 用户信息
 * @author RexSheng
 * 2019年8月27日 下午7:09:19
 */
public class UserAppInfoOutput {

	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 用户姓名
	 */
	private String userName;
	
	/**
	 * 手机
	 */
	private String phone;
	
	/**
	 * 性别
	 */
	private Integer gender;
	
	/**
	 * 邮箱
	 */
	private String email;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
