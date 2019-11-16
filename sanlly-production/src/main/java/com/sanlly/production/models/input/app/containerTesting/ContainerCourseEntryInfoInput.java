package com.sanlly.production.models.input.app.containerTesting;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.app.containerTesting 
 * @Description: TODO 箱体进场明细信息实体-输入
 * @author tianzhl   
 * @date 2019年8月10日 上午9:49:34 
 * @version V1.0   
 */
public class ContainerCourseEntryInfoInput {
	// TODO 检验人
	private String testingUser;
	// TODO 进场Id
	private String prodCourseId;
	// TODO 箱类别
	private String containerCategory;
	// TODO 修后照片
	private String afterPhoto;
	// TODO 刷卡支付发票照片
	private String payInvoice;
	// TODO 是否预检区
	private String isPreview;
	// TODO 修前照片视频
	private List<ContainerCourseEntryInput> partList;

	public String getTestingUser() {
		return testingUser;
	}

	public void setTestingUser(String testingUser) {
		this.testingUser = testingUser;
	}

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

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}

	public String getPayInvoice() {
		return payInvoice;
	}

	public void setPayInvoice(String payInvoice) {
		this.payInvoice = payInvoice;
	}

	public String getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(String isPreview) {
		this.isPreview = isPreview;
	}

	public List<ContainerCourseEntryInput> getPartList() {
		return partList;
	}

	public void setPartList(List<ContainerCourseEntryInput> partList) {
		this.partList = partList;
	}

}
