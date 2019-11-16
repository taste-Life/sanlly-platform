package com.sanlly.production.models.output.surrender;

public class SurrenderPlanDetailOutput {
	// TODO id
	private Integer prodSurrenderPlanDetailId;

	// TODO 计划id
	private Integer prodSurrenderPlanlId;

	// TODO 箱号
	private String containerNo;

	// TODO 尺寸key
	private String sizeLang;

	// TODO 箱型key
	private String containerTypeLang;

	// TODO 进场场站key
	private String yardLang;

	// TODO 进场时间
	private String courseTime;

	// TODO 账单类型枚举
	private String billTypeLang;

	// TODO dpp
	private String dpp;

	// TODO 上次起租时间
	private String startTime;

	// TODO 是否进场
	private String isCourse;

	// TODO 是否进场
	private String isCourseNameLang;

	// TODO 备注
	private String remarks;

	public Integer getProdSurrenderPlanDetailId() {
		return prodSurrenderPlanDetailId;
	}

	public void setProdSurrenderPlanDetailId(Integer prodSurrenderPlanDetailId) {
		this.prodSurrenderPlanDetailId = prodSurrenderPlanDetailId;
	}

	public Integer getProdSurrenderPlanlId() {
		return prodSurrenderPlanlId;
	}

	public void setProdSurrenderPlanlId(Integer prodSurrenderPlanlId) {
		this.prodSurrenderPlanlId = prodSurrenderPlanlId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getBillTypeLang() {
		return billTypeLang;
	}

	public void setBillTypeLang(String billTypeLang) {
		this.billTypeLang = billTypeLang;
	}

	public String getDpp() {
		return dpp;
	}

	public void setDpp(String dpp) {
		this.dpp = dpp;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getIsCourse() {
		return isCourse;
	}

	public void setIsCourse(String isCourse) {
		this.isCourse = isCourse;
	}

	public String getIsCourseNameLang() {
		return isCourseNameLang;
	}

	public void setIsCourseNameLang(String isCourseNameLang) {
		this.isCourseNameLang = isCourseNameLang;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}