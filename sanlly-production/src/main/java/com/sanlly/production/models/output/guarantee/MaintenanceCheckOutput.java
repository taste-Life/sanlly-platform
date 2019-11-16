package com.sanlly.production.models.output.guarantee;

import java.util.List;

public class MaintenanceCheckOutput {

	/*
	 * 保修主表id
	 */
	private String prodMaintenanceId;

	/*
	 * 操作类型
	 */
	private String operateType;

	/*
	 * 箱号
	 */
	private String containerNo;

	/*
	 * 用箱人
	 */
	private String containerUserLang;

	/*
	 * 批量保修提醒代码集合
	 */
	private List<String> mbCodeList;

	/*
	 * 机组类型
	 */
	private String unitTypeLang;

	/*
	 * 冷机公司
	 */
	private String unitCompanyLang;

	/*
	 * 机组序列号
	 */
	private String unitCode;

	/*
	 * 基板序列号
	 */
	private String substrateCode;

	/*
	 * 控制器s/n
	 */
	private String control;

	/*
	 * 压缩机s/n
	 */
	private String compressor;

	/*
	 * 启用日期
	 */
	private String startDate;

	/*
	 * 检验时间
	 */
	private String testingTime;

	/*
	 * 尺寸
	 */
	private String sizeLang;

	/*
	 * 箱型
	 */
	private String containerTypeLang;

	/*
	 * 保修地点
	 */
	private String maintenanceSiteLang;

	/*
	 * 保修类型
	 */
	private String maintenanceTypeLang;

	/*
	 * 是否待保修
	 */
	private String isMaintenanceLang;

	/*
	 * 故障描述
	 */
	private String faultDesc;

	/*
	 * 软件版本
	 */
	private String softwareVersion;

	private String containerUserKey;

	private String unitTypeKey;

	private String unitCompanyKey;

	private String sizeKey;

	private String maintenanceSiteKey;

	private String courseTypeKey;

	private String courseTypeLang;

	private String containerTypekey;

	public String getProdMaintenanceId() {
		return prodMaintenanceId;
	}

	public void setProdMaintenanceId(String prodMaintenanceId) {
		this.prodMaintenanceId = prodMaintenanceId;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public List<String> getMbCodeList() {
		return mbCodeList;
	}

	public void setMbCodeList(List<String> mbCodeList) {
		this.mbCodeList = mbCodeList;
	}

	public String getUnitTypeLang() {
		return unitTypeLang;
	}

	public void setUnitTypeLang(String unitTypeLang) {
		this.unitTypeLang = unitTypeLang;
	}

	public String getUnitCompanyLang() {
		return unitCompanyLang;
	}

	public void setUnitCompanyLang(String unitCompanyLang) {
		this.unitCompanyLang = unitCompanyLang;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getSubstrateCode() {
		return substrateCode;
	}

	public void setSubstrateCode(String substrateCode) {
		this.substrateCode = substrateCode;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getCompressor() {
		return compressor;
	}

	public void setCompressor(String compressor) {
		this.compressor = compressor;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTestingTime() {
		return testingTime;
	}

	public void setTestingTime(String testingTime) {
		this.testingTime = testingTime;
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

	public String getMaintenanceSiteLang() {
		return maintenanceSiteLang;
	}

	public void setMaintenanceSiteLang(String maintenanceSiteLang) {
		this.maintenanceSiteLang = maintenanceSiteLang;
	}

	public String getMaintenanceTypeLang() {
		return maintenanceTypeLang;
	}

	public void setMaintenanceTypeLang(String maintenanceTypeLang) {
		this.maintenanceTypeLang = maintenanceTypeLang;
	}

	public String getIsMaintenanceLang() {
		return isMaintenanceLang;
	}

	public void setIsMaintenanceLang(String isMaintenanceLang) {
		this.isMaintenanceLang = isMaintenanceLang;
	}

	public String getFaultDesc() {
		return faultDesc;
	}

	public void setFaultDesc(String faultDesc) {
		this.faultDesc = faultDesc;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getContainerUserKey() {
		return containerUserKey;
	}

	public void setContainerUserKey(String containerUserKey) {
		this.containerUserKey = containerUserKey;
	}

	public String getUnitTypeKey() {
		return unitTypeKey;
	}

	public void setUnitTypeKey(String unitTypeKey) {
		this.unitTypeKey = unitTypeKey;
	}

	public String getUnitCompanyKey() {
		return unitCompanyKey;
	}

	public void setUnitCompanyKey(String unitCompanyKey) {
		this.unitCompanyKey = unitCompanyKey;
	}

	public String getSizeKey() {
		return sizeKey;
	}

	public void setSizeKey(String sizeKey) {
		this.sizeKey = sizeKey;
	}

	public String getMaintenanceSiteKey() {
		return maintenanceSiteKey;
	}

	public void setMaintenanceSiteKey(String maintenanceSiteKey) {
		this.maintenanceSiteKey = maintenanceSiteKey;
	}

	public String getCourseTypeKey() {
		return courseTypeKey;
	}

	public void setCourseTypeKey(String courseTypeKey) {
		this.courseTypeKey = courseTypeKey;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getContainerTypekey() {
		return containerTypekey;
	}

	public void setContainerTypekey(String containerTypekey) {
		this.containerTypekey = containerTypekey;
	}

}
