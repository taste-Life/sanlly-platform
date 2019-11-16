package com.sanlly.production.models.output.estimate;

import java.util.List;

public class EstimateEntryInfoOutput {

	// TODO 修后照片
	private String afterPhoto;
	// TODO 速验照片
	private String speedPhoto;
	// TODO 箱照片
	private String testingPhoto;

	/**
	 * 第三方收费方式,现结、月结、不结
	 */
	private String chargeType;

	// TODO 条目明细列表
	private List<EstimateCourseEntryOutput> dataList;

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}

	public String getSpeedPhoto() {
		return speedPhoto;
	}

	public void setSpeedPhoto(String speedPhoto) {
		this.speedPhoto = speedPhoto;
	}

	public String getTestingPhoto() {
		return testingPhoto;
	}

	public void setTestingPhoto(String testingPhoto) {
		this.testingPhoto = testingPhoto;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public List<EstimateCourseEntryOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<EstimateCourseEntryOutput> dataList) {
		this.dataList = dataList;
	}

}
