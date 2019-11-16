package com.sanlly.production.models.output.guarantee;

import java.util.List;

public class MaintenanceInfoOutput {

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
	private String containerUser;

	/*
	 * 批量保修提醒代码集合
	 */
	private List<MaintenanceBatchOutput> mbList;

	/*
	 * 机组类型
	 */
	private String unitType;

	/*
	 * 冷机公司
	 */
	private String unitCompany;

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
	private String size;

	/*
	 * 箱型
	 */
	private String containerType;

	/*
	 * 保修地点
	 */
	private String maintenanceSite;

	/*
	 * 保修类型
	 */
	private String maintenanceType;

	/*
	 * 是否待保修
	 */
	private String isMaintenance;

	/*
	 * 故障描述
	 */
	private String faultDesc;

	/*
	 * 软件版本
	 */
	private String softwareVersion;

	/*
	 * 进场类型
	 */
	private String courseType;

	/*
	 * 进场场站
	 */
	private String yard;
	/*
	 * 退租箱
	 */
	private String isSurrender;
	/*
	 * 检验状态
	 */
	private String testingState;
	/*
	 * 检验状态
	 */
	private String testingStateNameLang;
	/*
	 * 保修检验人
	 */
	private String testingUser;

	/*
	 * 故障类型
	 */
	private String faultType;

	/*
	 * 保修检验时间
	 */
	private String faultTime;

	/*
	 * 故障处理办法
	 */
	private String faultDispose;

	/*
	 * 保修备注
	 */
	private String faultRemarks;

	/*
	 * 保修备注
	 */
	private String dept;

	/**
	 * 估价币种
	 */
	private String valuationCurrency;

	/**
	 * 估价状态
	 */
	private String useReplyState;

	/**
	 * 估价状态
	 */
	private String useReplyStateNameLang;

	/**
	 * 派工状态
	 */
	private String referralStateKey;

	/**
	 * 派工状态
	 */
	private String referralStateLang;

	/**
	 * 进场id
	 */
	private String course;

	/**
	 * 保修号
	 */
	private String maintenanceNumber;
	/**
	 * ca
	 */
	private String isCa;
	/**
	 * 温度
	 */
	private String isTemperature;
	/**
	 * 湿度
	 */
	private String isHumidity;
	/**
	 * 通风
	 */
	private String isVentilate;
	/**
	 * MODEM序号
	 */
	private String modemNumber;

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

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public List<MaintenanceBatchOutput> getMbList() {
		return mbList;
	}

	public void setMbList(List<MaintenanceBatchOutput> mbList) {
		this.mbList = mbList;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getUnitCompany() {
		return unitCompany;
	}

	public void setUnitCompany(String unitCompany) {
		this.unitCompany = unitCompany;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getMaintenanceSite() {
		return maintenanceSite;
	}

	public void setMaintenanceSite(String maintenanceSite) {
		this.maintenanceSite = maintenanceSite;
	}

	public String getMaintenanceType() {
		return maintenanceType;
	}

	public void setMaintenanceType(String maintenanceType) {
		this.maintenanceType = maintenanceType;
	}

	public String getIsMaintenance() {
		return isMaintenance;
	}

	public void setIsMaintenance(String isMaintenance) {
		this.isMaintenance = isMaintenance;
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

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

	public String getTestingState() {
		return testingState;
	}

	public void setTestingState(String testingState) {
		this.testingState = testingState;
	}

	public String getTestingStateNameLang() {
		return testingStateNameLang;
	}

	public void setTestingStateNameLang(String testingStateNameLang) {
		this.testingStateNameLang = testingStateNameLang;
	}

	public String getTestingUser() {
		return testingUser;
	}

	public void setTestingUser(String testingUser) {
		this.testingUser = testingUser;
	}

	public String getFaultType() {
		return faultType;
	}

	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}

	public String getFaultTime() {
		return faultTime;
	}

	public void setFaultTime(String faultTime) {
		this.faultTime = faultTime;
	}

	public String getFaultDispose() {
		return faultDispose;
	}

	public void setFaultDispose(String faultDispose) {
		this.faultDispose = faultDispose;
	}

	public String getFaultRemarks() {
		return faultRemarks;
	}

	public void setFaultRemarks(String faultRemarks) {
		this.faultRemarks = faultRemarks;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getValuationCurrency() {
		return valuationCurrency;
	}

	public void setValuationCurrency(String valuationCurrency) {
		this.valuationCurrency = valuationCurrency;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getUseReplyState() {
		return useReplyState;
	}

	public void setUseReplyState(String useReplyState) {
		this.useReplyState = useReplyState;
	}

	public String getReferralStateKey() {
		return referralStateKey;
	}

	public void setReferralStateKey(String referralStateKey) {
		this.referralStateKey = referralStateKey;
	}

	public String getUseReplyStateNameLang() {
		return useReplyStateNameLang;
	}

	public void setUseReplyStateNameLang(String useReplyStateNameLang) {
		this.useReplyStateNameLang = useReplyStateNameLang;
	}

	public String getReferralStateLang() {
		return referralStateLang;
	}

	public void setReferralStateLang(String referralStateLang) {
		this.referralStateLang = referralStateLang;
	}

	public String getMaintenanceNumber() {
		return maintenanceNumber;
	}

	public void setMaintenanceNumber(String maintenanceNumber) {
		this.maintenanceNumber = maintenanceNumber;
	}

	public String getIsCa() {
		return isCa;
	}

	public void setIsCa(String isCa) {
		this.isCa = isCa;
	}

	public String getIsTemperature() {
		return isTemperature;
	}

	public void setIsTemperature(String isTemperature) {
		this.isTemperature = isTemperature;
	}

	public String getIsHumidity() {
		return isHumidity;
	}

	public void setIsHumidity(String isHumidity) {
		this.isHumidity = isHumidity;
	}

	public String getIsVentilate() {
		return isVentilate;
	}

	public void setIsVentilate(String isVentilate) {
		this.isVentilate = isVentilate;
	}

	public String getModemNumber() {
		return modemNumber;
	}

	public void setModemNumber(String modemNumber) {
		this.modemNumber = modemNumber;
	}

}
