package com.sanlly.production.models.output.app.heavyContainer;

/**
 * 重箱监管-查看温度记录输出类
 * @author zhangkai
 *
 */
public class HeavyContainerTempsOutput {
	
	private Integer prodHeavyTempRecordId;
	
	private String recordTime;
	
	private String containerNo;
	
	private String recordingPeriod;
	
	private String supplyTemp;
	
	private String returnTemp;
	
	private String remark;

	public Integer getProdHeavyTempRecordId() {
		return prodHeavyTempRecordId;
	}

	public void setProdHeavyTempRecordId(Integer prodHeavyTempRecordId) {
		this.prodHeavyTempRecordId = prodHeavyTempRecordId;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
