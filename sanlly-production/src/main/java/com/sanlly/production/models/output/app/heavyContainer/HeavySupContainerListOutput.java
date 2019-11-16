package com.sanlly.production.models.output.app.heavyContainer;

/**
 * 重箱监管-监管箱列表输出类
 * @author zhangkai
 *
 */
public class HeavySupContainerListOutput {

	/*
	 * 重箱监管入港id
	 */
	private Integer prodHeavyEnterId;
	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 用箱人
	 */
	private String containerUserLang;
	/*
	 * 是否出口箱
	 */
	private String isExportLang;
	/*
	 * 船名航次
	 */
	private String vesVos;
	/*
	 * 船期
	 */
	private String sailingDate;
	/*
	 * 码头内位置
	 */
	private String position;
	/*
	 * 出场场站
	 */
	private String exitYardLang;
	/*
	 * 入港时间
	 */
	private String entryTime;
	/*
	 * 设定温度
	 */
	private String settingTemp;
	/*
	 * 设定湿度
	 */
	private String settingHumidity;
	/*
	 * 通风口开度值
	 */
	private String vent;
	/*
	 * 状态
	 */
	private String stateLang;
	/*
	 * 备注
	 */
	private String remark;
	/*
	 * 采集状态
	 */
	private String collectStateLang;
	/*
	 * 设备状态
	 */
	private String deviceStateLang;
	/*
	 * 最近一个时间段的送风温度
	 */
	private String supplyTemp;
	/*
	 * 最近一个时间段的回风温度
	 */
	private String returnTemp;
	/*
	 * 最近一个采集时间段
	 */
	private String recordingPeriod;
	public Integer getProdHeavyEnterId() {
		return prodHeavyEnterId;
	}
	public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
		this.prodHeavyEnterId = prodHeavyEnterId;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
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
	public String getIsExportLang() {
		return isExportLang;
	}
	public void setIsExportLang(String isExportLang) {
		this.isExportLang = isExportLang;
	}
	public String getVesVos() {
		return vesVos;
	}
	public void setVesVos(String vesVos) {
		this.vesVos = vesVos;
	}
	public String getSailingDate() {
		return sailingDate;
	}
	public void setSailingDate(String sailingDate) {
		this.sailingDate = sailingDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getExitYardLang() {
		return exitYardLang;
	}
	public void setExitYardLang(String exitYardLang) {
		this.exitYardLang = exitYardLang;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public String getSettingTemp() {
		return settingTemp;
	}
	public void setSettingTemp(String settingTemp) {
		this.settingTemp = settingTemp;
	}
	public String getSettingHumidity() {
		return settingHumidity;
	}
	public void setSettingHumidity(String settingHumidity) {
		this.settingHumidity = settingHumidity;
	}
	public String getVent() {
		return vent;
	}
	public void setVent(String vent) {
		this.vent = vent;
	}
	public String getStateLang() {
		return stateLang;
	}
	public void setStateLang(String stateLang) {
		this.stateLang = stateLang;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCollectStateLang() {
		return collectStateLang;
	}
	public void setCollectStateLang(String collectStateLang) {
		this.collectStateLang = collectStateLang;
	}
	public String getDeviceStateLang() {
		return deviceStateLang;
	}
	public void setDeviceStateLang(String deviceStateLang) {
		this.deviceStateLang = deviceStateLang;
	}
	public String getSupplyTemp() {
		return supplyTemp;
	}
	public void setSupplyTemp(String supplyTemp) {
		this.supplyTemp = supplyTemp;
	}
	public String getReturnTemp() {
		return returnTemp;
	}
	public void setReturnTemp(String returnTemp) {
		this.returnTemp = returnTemp;
	}
	public String getRecordingPeriod() {
		return recordingPeriod;
	}
	public void setRecordingPeriod(String recordingPeriod) {
		this.recordingPeriod = recordingPeriod;
	}
	
	
}
