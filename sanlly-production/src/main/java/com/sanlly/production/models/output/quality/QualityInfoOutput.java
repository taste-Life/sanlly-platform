package com.sanlly.production.models.output.quality;

import java.util.List;

public class QualityInfoOutput {
	// 修后照片
	private String afterPhoto;
	// 质检图片
	private String qualityPhoto;
	// 复检图片
	private String recheckPhoto;
	// 质检结果
	private String qualityResultLang;
	// 质检结果
	private String qualityResultKey;
	// 质检状态
	private String qualityState;
	// 质检状态
	private String qualityStateNameLang;
	// 箱况
	private String containerCondition;

	// 第三方收费方式,现结、月结、不结
	private String chargeType;

	// 条目明细列表
	private List<QualityEntryInfoOutput> dataList;

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public List<QualityEntryInfoOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<QualityEntryInfoOutput> dataList) {
		this.dataList = dataList;
	}

	public String getQualityPhoto() {
		return qualityPhoto;
	}

	public void setQualityPhoto(String qualityPhoto) {
		this.qualityPhoto = qualityPhoto;
	}

	public String getRecheckPhoto() {
		return recheckPhoto;
	}

	public void setRecheckPhoto(String recheckPhoto) {
		this.recheckPhoto = recheckPhoto;
	}

	public String getQualityResultLang() {
		return qualityResultLang;
	}

	public void setQualityResultLang(String qualityResultLang) {
		this.qualityResultLang = qualityResultLang;
	}

	public String getQualityResultKey() {
		return qualityResultKey;
	}

	public void setQualityResultKey(String qualityResultKey) {
		this.qualityResultKey = qualityResultKey;
	}

	public String getQualityState() {
		return qualityState;
	}

	public void setQualityState(String qualityState) {
		this.qualityState = qualityState;
	}

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}

	public String getQualityStateNameLang() {
		return qualityStateNameLang;
	}

	public void setQualityStateNameLang(String qualityStateNameLang) {
		this.qualityStateNameLang = qualityStateNameLang;
	}

}
