package com.sanlly.auth.models.input.auth;

/**
 * 修改权限输入类
 * @author RexSheng
 * 2019年8月16日 上午9:37:09
 */
public class EditAuthInput extends AddAuthInput{
	
	/**
	 * 权限id
	 */
	private Integer authId;

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}
	

	 
}
