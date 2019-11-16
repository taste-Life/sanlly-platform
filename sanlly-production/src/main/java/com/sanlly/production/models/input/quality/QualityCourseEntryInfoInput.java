package com.sanlly.production.models.input.quality;

import java.util.List;

/**
 * 质检保存
 * 
 * @Package com.sanlly.production.models.input.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月15日 上午11:35:12 
 * @version V1.0   
 */
public class QualityCourseEntryInfoInput {
	// TODO 进场Id
	private String prodCourseId;
	// TODO 箱类别
	private String containerCategory;
	// TODO 质检结果
	private String qualityResult;
	// TODO 质检图片
	private String qualityPhoto;
	// TODO 质检图片
	private String recheckPhoto;
	// TODO 修前照片视频
	private List<QualityCourseEntryInput> partList;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public List<QualityCourseEntryInput> getPartList() {
		return partList;
	}

	public void setPartList(List<QualityCourseEntryInput> partList) {
		this.partList = partList;
	}

	public String getQualityResult() {
		return qualityResult;
	}

	public void setQualityResult(String qualityResult) {
		this.qualityResult = qualityResult;
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

}
