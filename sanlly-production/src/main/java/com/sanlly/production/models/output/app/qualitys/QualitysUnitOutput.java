package com.sanlly.production.models.output.app.qualitys;

import java.util.List;

/**
 * 机组质检主信息实体
 * @author wangxzh
 *
 */
public class QualitysUnitOutput {

	private String afterPhoto;

	private String qualityPhoto;

	private List<QualitysUnitEntryOutput> dataList;

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}

	public String getQualityPhoto() {
		return qualityPhoto;
	}

	public void setQualityPhoto(String qualityPhoto) {
		this.qualityPhoto = qualityPhoto;
	}

	public List<QualitysUnitEntryOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<QualitysUnitEntryOutput> dataList) {
		this.dataList = dataList;
	}

}
