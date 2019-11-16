package com.sanlly.production.models.output.app.login;

/**
 * app登陆返回
 * @author RexSheng
 * 2019年8月9日 上午11:48:41
 */
public class AppLoginOutput {
	
	/**
	 * 用户标识
	 */
	private String token;

	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 公司名
	 */
	private String companyNameLang;

	/**
	 * 公司key
	 */
	private String companyKey;
	
	/**
	 * 公司代码
	 */
	private String companyCode;

	/**
	 * 场站名
	 */
	private String yardNameLang;

	/**
	 * 场站key
	 */
	private String yardKey;
	
	/**
	 * 箱子权限
	 */
	private ContainerAuth containerAuth;
	
	/**
	 *  箱子基础数据权限
	 */
	private ContainerBasic containerBasic;
	
	/**
	 * 质检权限
	 */
	private QualityAuth qualityAuth;
	
	/**
	 * 主页剩余权限
	 */
	private OtherAuth otherAuth;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}


	public String getYardKey() {
		return yardKey;
	}

	public void setYardKey(String yardKey) {
		this.yardKey = yardKey;
	}

	public ContainerAuth getContainerAuth() {
		return containerAuth;
	}

	public void setContainerAuth(ContainerAuth containerAuth) {
		this.containerAuth = containerAuth;
	}

	public ContainerBasic getContainerBasic() {
		return containerBasic;
	}

	public void setContainerBasic(ContainerBasic containerBasic) {
		this.containerBasic = containerBasic;
	}

	public QualityAuth getQualityAuth() {
		return qualityAuth;
	}

	public void setQualityAuth(QualityAuth qualityAuth) {
		this.qualityAuth = qualityAuth;
	}

	public OtherAuth getOtherAuth() {
		return otherAuth;
	}

	public void setOtherAuth(OtherAuth otherAuth) {
		this.otherAuth = otherAuth;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	
}
