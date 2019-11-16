package com.sanlly.common.models.output.user;

/**
 * 用户session信息
 * @author RexSheng
 * 2019年8月16日 下午1:07:08
 */
public class SessionOutput {
	
	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 登陆账号
	 */
	private String loginAccount;
	
	/**
	 * 拥有权限
	 */
	private String[] auth;
	
	/**
	 * 是否管理员
	 */
	private Boolean isAdmin;
	
	/**
	 * 是否总部
	 */
	private Boolean isHeadCompany;
	
	/**
	 * 拥有场站key
	 */
	private String[] yard;
	
	public SessionOutput() {}

	public SessionOutput(UserInfoOutput user) {
		this.userId=user.getUserId();
		if(user.getAuthList()!=null) {
			this.auth=user.getAuthList().stream().map(a->a.getAuthCode()).toArray(String[]::new);
		}
		else {
			this.auth=new String[0];
		}
		if(user.getYardList()!=null) {
			this.yard=user.getYardList().stream().map(a->a.getYardKey()).toArray(String[]::new);
		}
		else {
			this.yard=new String[0];
		}
		this.isAdmin=user.getIsAdmin();
		this.isHeadCompany=user.getIsHeadCompany();
		this.loginAccount=user.getLoginAccount();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String[] getAuth() {
		return auth;
	}

	public void setAuth(String[] auth) {
		this.auth = auth;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsHeadCompany() {
		return isHeadCompany;
	}

	public void setIsHeadCompany(Boolean isHeadCompany) {
		this.isHeadCompany = isHeadCompany;
	}

	public String[] getYard() {
		return yard;
	}

	public void setYard(String[] yard) {
		this.yard = yard;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
}
