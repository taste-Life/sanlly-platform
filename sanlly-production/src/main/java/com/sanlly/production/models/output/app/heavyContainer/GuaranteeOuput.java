package com.sanlly.production.models.output.app.heavyContainer;
/**
 * 重箱监管-保函输出类
 * @author zhangkai
 *
 */
public class GuaranteeOuput {

	/*
	 * 重箱id
	 */
	private Integer prodHeavyEnterId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 用箱人
	 */
	private String containerUserLang;
	/*
	 * 船名航次
	 */
	private String vesVos;
	/*
	 * 提单号
	 */
	private String orderNum;
	/*
	 * 位置
	 */
	private String position;
	/*
	 * 出场场站
	 */
	private String exitYardLang;
	/*
	 * 进港时间
	 */
	private String entryTime;
	/*
	 * 设定温度
	 */
	private String settingTemp;
	/*
	 * 当前温度
	 */
	private String nowTemp;
	/*
	 * 设定湿度
	 */
	private String settingHumidity;
	
	public Integer getProdHeavyEnterId() {
		return prodHeavyEnterId;
	}
	public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
		this.prodHeavyEnterId = prodHeavyEnterId;
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
	public String getVesVos() {
		return vesVos;
	}
	public void setVesVos(String vesVos) {
		this.vesVos = vesVos;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
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
	public String getNowTemp() {
		return nowTemp;
	}
	public void setNowTemp(String nowTemp) {
		this.nowTemp = nowTemp;
	}
	public String getSettingHumidity() {
		return settingHumidity;
	}
	public void setSettingHumidity(String settingHumidity) {
		this.settingHumidity = settingHumidity;
	}
	
}
