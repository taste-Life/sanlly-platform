package com.sanlly.production.models.input.valuation;
/**
 * 估价派工明细输入类
 * @author zhangkai
 *
 */
public class ValuationReferralDetailInput {

	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 箱类型
	 */
	private String containerCategory;

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
	
	
}
