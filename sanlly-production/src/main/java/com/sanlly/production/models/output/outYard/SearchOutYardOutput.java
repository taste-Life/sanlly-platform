package com.sanlly.production.models.output.outYard;

/**
 * 出厂列表
 * 
 * @Package com.sanlly.production.models.output.outYard 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年11月7日 下午6:22:02 
 * @version V1.0   
 */
public class SearchOutYardOutput {
	// 出厂id
	private String prodOutId;
	// 进场id
	private String prodCourseId;
	// 箱号
	private String containerNo;
	// 出厂操作人
	private String outUser;
	// 出厂图片
	private String outPhoto;
	// 出厂时间
	private String outDate;
	// 是否已出厂
	private String outState;

	public String getProdOutId() {
		return prodOutId;
	}

	public void setProdOutId(String prodOutId) {
		this.prodOutId = prodOutId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getOutUser() {
		return outUser;
	}

	public void setOutUser(String outUser) {
		this.outUser = outUser;
	}

	public String getOutPhoto() {
		return outPhoto;
	}

	public void setOutPhoto(String outPhoto) {
		this.outPhoto = outPhoto;
	}

	public String getOutDate() {
		return outDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getOutState() {
		return outState;
	}

	public void setOutState(String outState) {
		this.outState = outState;
	}

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

}
