package com.sanlly.production.models.input.app.qualitys;

import java.util.List;

/**
 * 机组质检结果接收实体
 * @author wangxzh
 *
 */
public class QualitysUnitInput {

	private String prodCourseId;

	private String qualityPhoto;

	private String recheckPhoto;

	private String qualityResult;

	private String containerType;

	private List<QualitysUnitEntryInput> partList;

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

	public List<QualitysUnitEntryInput> getPartList() {
		return partList;
	}

	public void setPartList(List<QualitysUnitEntryInput> partList) {
		this.partList = partList;
	}

	public String getQualityResult() {
		return qualityResult;
	}

	public void setQualityResult(String qualityResult) {
		this.qualityResult = qualityResult;
	}

	public String getRecheckPhoto() {
		return recheckPhoto;
	}

	public void setRecheckPhoto(String recheckPhoto) {
		this.recheckPhoto = recheckPhoto;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

}
