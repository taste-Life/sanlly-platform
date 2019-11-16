package com.sanlly.production.models.input.app.user;

/**
 * 用户修改
 * @author RexSheng
 * 2019年8月27日 下午7:50:47
 */
public class UserEditInput {

	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 用户性别
	 */
	private Integer gender;
	
	/**
	 * 用户电话
	 */
	private String phone;
	
	/**
	 * 用户邮箱
	 */
	private String email;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
