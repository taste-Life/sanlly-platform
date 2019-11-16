package com.sanlly.production.models.output.heavyContainer;

/**
 * 重箱监管输出类（web端）
 * @author zhangkai
 *
 */
public class HeavyContainerOutput {

	/*
	 * 重箱监管id
	 */
	private Integer prodHeavyEnterId;
	/*
	 * 进场id
	 */
    private String courseId;
    /*
     * 箱号
     */
    private String containerNo;
    /*
     * 用箱人（需国际化）
     */
    private String containerUserLang;
    /*
     * 是否出口箱（需国际化）
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
     * 计划装船日期
     */
    private String shipmentDate;
    /*
     * 位置（手填）
     */
    private String location;
    /*
     * 出场场站（需国际化）
     */
    private String exitYardLang;
    /*
     * 入港时间
     */
    private String entryTime;
    /*
     * 设置温度 
     */
    private String settingTemp;
    /*
     * 设置湿度
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
     * 码头（需国际化）
     */
    private String dockLang;
    /*
     * 备注
     */
    private String remark;
    /*
     * 公司（需国际化）
     */
    private String companyLang;
	public Integer getProdHeavyEnterId() {
		return prodHeavyEnterId;
	}
	public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
		this.prodHeavyEnterId = prodHeavyEnterId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
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
	public String getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public String getDockLang() {
		return dockLang;
	}
	public void setDockLang(String dockLang) {
		this.dockLang = dockLang;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCompanyLang() {
		return companyLang;
	}
	public void setCompanyLang(String companyLang) {
		this.companyLang = companyLang;
	}

    
}
