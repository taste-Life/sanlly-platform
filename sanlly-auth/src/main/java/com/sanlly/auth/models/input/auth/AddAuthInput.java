package com.sanlly.auth.models.input.auth;

/**
 * 新增权限输入类
 * @author RexSheng
 * 2019年8月16日 上午9:36:30
 */
public class AddAuthInput {
	
	/**
	 * 权限编号
	 */
	private String authCode;
	
	/**
	 * 权限名称
	 */
	private String authName;
	
	/**
	 * 所属菜单
	 */
	private Integer menuId;

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
}
