package com.sanlly.warehouse.models.output.laborInsurance.LaborStaff;

import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.LaborStaffInput;

/**
 * 用户信息类
 * @author zhh
 * 2019年8月22日 上午10:08:23
 */
public class userSchemeOutput {
	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 用户名
	 */
	private String userName;
	
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
	 * 所在公司key
	 */
	private String company;
	
	/**
	 * 国际化所在公司key
	 */
	private String companyNameLang;
	
	/**
	 * 所属方案key
	 */
	private String laborScheme;
	/**
	 * 国际化所属方案key
	 */
	private String laborSchemeNameLang;
	private String laborSchemeNames;
	/**
	 * 员工劳保信息
	 */
	private LaborStaffInput laborInfo;

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

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getLaborSchemeNameLang() {
		return laborSchemeNameLang;
	}

	public void setLaborSchemeNameLang(String laborSchemeNameLang) {
		this.laborSchemeNameLang = laborSchemeNameLang;
	}

	public String getLaborScheme() {
		return laborScheme;
	}

	public void setLaborScheme(String laborScheme) {
		this.laborScheme = laborScheme;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public LaborStaffInput getLaborInfo() {
		return laborInfo;
	}

	public void setLaborInfo(LaborStaffInput laborInfo) {
		this.laborInfo = laborInfo;
	}

	public String getLaborSchemeNames() {
		return laborSchemeNames;
	}

	public void setLaborSchemeNames(String laborSchemeNames) {
		this.laborSchemeNames = laborSchemeNames;
	}

	
	
	
	
}
