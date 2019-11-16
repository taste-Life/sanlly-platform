package com.sanlly.production.models.input.app.outYard;

/**
 * 出场
 * 
 * @Package com.sanlly.production.models.input.app.outYard 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年11月11日 下午6:15:24 
 * @version V1.0   
 */
public class OutYardInput {
	// 进场id
	private String prodCourseId;
	// 箱号
	private String containerNo;
	// 图片
	private String photo;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
