package com.sanlly.common.models.output.auth;

/**
 * 权限信息
 * @author RexSheng
 * 2019年8月16日 下午1:11:08
 */
public class AuthDetailOutput {

	private Integer authId;
	
	private String authCode;
	
	private String authName;
	
	private Integer menuId;
	
	private String menuName;

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
	
}
