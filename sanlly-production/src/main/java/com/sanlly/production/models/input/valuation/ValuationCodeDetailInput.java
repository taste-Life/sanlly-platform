package com.sanlly.production.models.input.valuation;
/**
 * 冷箱记录输入类
 * @author zhangkai
 *
 */
public class ValuationCodeDetailInput {

	private String prodCourseId;
	/* 箱体/冷箱  */
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
