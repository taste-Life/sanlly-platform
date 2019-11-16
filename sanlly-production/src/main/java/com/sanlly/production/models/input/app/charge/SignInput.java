package com.sanlly.production.models.input.app.charge;
/**
 * 签字确认输入类
 * @author zhangkai
 *
 */
public class SignInput {

	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 箱类别
	 */
	private String containerCategory;
	/*
	 * 签字照片
	 */
	private String signaturePic;

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

	public String getSignaturePic() {
		return signaturePic;
	}

	public void setSignaturePic(String signaturePic) {
		this.signaturePic = signaturePic;
	}
	
	
}
