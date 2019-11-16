package com.sanlly.production.models.input.app.user;

/**
 * 修改密码
 * @author RexSheng
 * 2019年8月27日 下午7:39:43
 */
public class ChangePwdInput {

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 旧密码
	 */
	private String oldPwd;
	
	/**
	 * 新密码
	 */
	private String newPwd;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
	
}
