package com.sanlly.common.models.output.user;

import java.util.List;

import com.sanlly.common.models.output.auth.AuthDetailOutput;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.menu.MenuDetailOutput;
import com.sanlly.common.models.output.yard.YardDetailOutput;

/**
 * 用户信息类
 * @author RexSheng
 * 2019年8月16日 下午1:08:23
 */
public class UserInfoOutput {
	
	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 登陆账号
	 */
	private String loginAccount;
	
	/**
	 * 是否管理员
	 */
	private Boolean isAdmin;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 性别
	 */
	private Integer userSex;
	
	/**
	 * 所在公司
	 */
	private Integer companyId;
	
	/**
	 * 是否总部权限
	 */
	private Boolean isHeadCompany;
	
	/**
	 * 公司列表
	 */
	private List<CompanyDetailOutput> companyList;
	
	/**
	 * 场站列表
	 */
	private List<YardDetailOutput> yardList;
	
	/**
	 * 菜单列表（树形结构）
	 */
	private List<MenuDetailOutput> menuList;
	
	/**
	 * 所有菜单
	 */
	private List<MenuDetailOutput> allMenuList;
	
	/**
	 * 权限列表
	 */
	private List<AuthDetailOutput> authList;
	
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

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public List<CompanyDetailOutput> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<CompanyDetailOutput> companyList) {
		this.companyList = companyList;
	}

	public List<YardDetailOutput> getYardList() {
		return yardList;
	}

	public void setYardList(List<YardDetailOutput> yardList) {
		this.yardList = yardList;
	}

	public List<MenuDetailOutput> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuDetailOutput> menuList) {
		this.menuList = menuList;
	}

	public List<AuthDetailOutput> getAuthList() {
		return authList;
	}

	public void setAuthList(List<AuthDetailOutput> authList) {
		this.authList = authList;
	}

	public Boolean getIsHeadCompany() {
		return isHeadCompany;
	}

	public void setIsHeadCompany(Boolean isHeadCompany) {
		this.isHeadCompany = isHeadCompany;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public List<MenuDetailOutput> getAllMenuList() {
		return allMenuList;
	}

	public void setAllMenuList(List<MenuDetailOutput> allMenuList) {
		this.allMenuList = allMenuList;
	}
 
	
}
