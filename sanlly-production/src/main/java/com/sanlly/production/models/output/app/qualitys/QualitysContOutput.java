package com.sanlly.production.models.output.app.qualitys;

import java.util.List;

/**
 * 箱体质检返回实体
 * 
 * @author wangxzh
 *
 */
public class QualitysContOutput {
	// 修后图片
	private String afterPhoto;
	// 质检图片
	private String qualityPhoto;
	// 复检图片
	private String recheckPhoto;

	private List<QualitysContEntryOutput> dataList;

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

	public List<QualitysContEntryOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<QualitysContEntryOutput> dataList) {
		this.dataList = dataList;
	}

	public String getRecheckPhoto() {
		return recheckPhoto;
	}

	public void setRecheckPhoto(String recheckPhoto) {
		this.recheckPhoto = recheckPhoto;
	}

}
