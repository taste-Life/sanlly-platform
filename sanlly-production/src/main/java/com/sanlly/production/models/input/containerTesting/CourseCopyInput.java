package com.sanlly.production.models.input.containerTesting;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO 退租箱-复制进场信息
 * @author tianzhl   
 * @date 2019年10月21日 下午4:05:50 
 * @version V1.0   
 */
public class CourseCopyInput {
	// TODO 箱体进场id
	private String prodCourseId;
	// TODO 退租类型
	private String surrenderType;
	// TODO 箱类别
	private String containerCategory;
	// TODO 估价箱体明细id
	private String[] evalEntryIdList;
	// TODO 估价机组明细id
	private String[] evalUnitEntryIdList;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getSurrenderType() {
		return surrenderType;
	}

	public void setSurrenderType(String surrenderType) {
		this.surrenderType = surrenderType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String[] getEvalEntryIdList() {
		return evalEntryIdList;
	}

	public void setEvalEntryIdList(String[] evalEntryIdList) {
		this.evalEntryIdList = evalEntryIdList;
	}

	public String[] getEvalUnitEntryIdList() {
		return evalUnitEntryIdList;
	}

	public void setEvalUnitEntryIdList(String[] evalUnitEntryIdList) {
		this.evalUnitEntryIdList = evalUnitEntryIdList;
	}

}
