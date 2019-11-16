package com.sanlly.common.models.input.referral;

public class WorkGroupOutput {
	/**
	 * 编码
	 */
	private String code;
	/**
	 * 公司
	 */
	private String company;
	/**
	 * 场站
	 */
	private String yard;
	/**
	 * 生产部门
	 */
	private String prodDept;
	/**
	 * 工作组类别
	 */
	private String workGroupType;
	/**
	 * 用户
	 */
	private Integer user;
	/**
	 * 班组类型
	 */
	private String type;
	/**
	 * 可工作区位
	 */
	private String location;
	/**
	 * 工时上限
	 */
	private Integer workHourTop;
	/**
	 * 工时下限
	 */
	private Integer workHourBottom;
	/**
	 * 发票抬头
	 */
	private String title;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getProdDept() {
		return prodDept;
	}

	public void setProdDept(String prodDept) {
		this.prodDept = prodDept;
	}

	public String getWorkGroupType() {
		return workGroupType;
	}

	public void setWorkGroupType(String workGroupType) {
		this.workGroupType = workGroupType;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getWorkHourTop() {
		return workHourTop;
	}

	public void setWorkHourTop(Integer workHourTop) {
		this.workHourTop = workHourTop;
	}

	public Integer getWorkHourBottom() {
		return workHourBottom;
	}

	public void setWorkHourBottom(Integer workHourBottom) {
		this.workHourBottom = workHourBottom;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
