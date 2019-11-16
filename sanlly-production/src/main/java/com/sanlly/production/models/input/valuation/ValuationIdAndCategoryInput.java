package com.sanlly.production.models.input.valuation;
/**
 * 估价进场id和箱类型输入类
 * @author zhangkai
 *
 */
public class ValuationIdAndCategoryInput {
	
	private String prodCourseId;
	
	private String containerCategory;
	
	private String yard;
	
	private String containerUser;

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

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	
	

}
