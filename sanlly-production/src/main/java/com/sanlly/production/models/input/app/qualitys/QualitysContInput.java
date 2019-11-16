package com.sanlly.production.models.input.app.qualitys;

import java.util.List;

/**
 * 箱体质检结果接收实体
 * 
 * @author wangxzh
 *
 */
public class QualitysContInput {
	// 进场id
	private String prodCourseId;
	// 质检图片
	private String qualityPhoto;
	// 附件图片
	private String recheckPhoto;
	// 质检结果
	private String qualityResult;
	// 箱类别
	private String containerCategory;
	// 条目明细
	private List<QualitysContEntryInput> partList;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
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

	public String getQualityResult() {
		return qualityResult;
	}

	public void setQualityResult(String qualityResult) {
		this.qualityResult = qualityResult;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public List<QualitysContEntryInput> getPartList() {
		return partList;
	}

	public void setPartList(List<QualitysContEntryInput> partList) {
		this.partList = partList;
	}

}
