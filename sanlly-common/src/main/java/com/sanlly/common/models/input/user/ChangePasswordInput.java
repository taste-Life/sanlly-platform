package com.sanlly.common.models.input.user;

/**
 * 修改密码
 * @author RexSheng
 * 2019年8月27日 下午7:31:04
 */
public class ChangePasswordInput {

	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 旧密码
	 */
	private String oldPassword;
	
	/**
	 * 新密码
	 */
	private String newPassword;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
}
