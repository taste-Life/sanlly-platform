package com.sanlly.production.models.input.app.heavyContainer;

/**
 * 重箱监管-温度采集输入类
 * @author zhangkai
 *
 */
public class HeavyContainerSetTempInput {

	/*
	 * 重箱id
	 */
	private Integer prodHeavyEnterId;
	/*
	 * 时间段
	 */
	private String recordingPeriod;
	/*
	 * 送风温度
	 */
	private String supplyTemp;
	/*
	 * 回风温度
	 */
	private String returnTemp;
	/*
	 * 设备状态key
	 */
	private String deviceState;
	/*
	 * 备注
	 */
	private String remark;
	/*
	 * 照片-华为返回的图片链接拼接字符串
	 */
	private String tempPic;
	public Integer getProdHeavyEnterId() {
		return prodHeavyEnterId;
	}
	public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
		this.prodHeavyEnterId = prodHeavyEnterId;
	}
	public String getRecordingPeriod() {
		return recordingPeriod;
	}
	public void setRecordingPeriod(String recordingPeriod) {
		this.recordingPeriod = recordingPeriod;
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
	public String getDeviceState() {
		return deviceState;
	}
	public void setDeviceState(String deviceState) {
		this.deviceState = deviceState;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTempPic() {
		return tempPic;
	}
	public void setTempPic(String tempPic) {
		this.tempPic = tempPic;
	}
	
	
	
	
}
