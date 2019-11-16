package com.sanlly.production.models.output.app.containerTesting;

/**   
* @Package com.sanlly.production.models.output.app.containerTesting 
* @Description: TODO 箱体基础实体-输出
* @author tianzhl   
* @date 2019年8月9日 下午5:05:07 
* @version V1.0   
*/
public class ContainerBaseOutput {

	// TODO 箱子Id
	private String prodCourseId;
	// TODO 箱号
	private String containerNo;
	// TODO 尺寸
	private String size;
	// TODO 干箱/冷箱
	private String containerCategory;
	// TODO 箱型
	private String containerType;
	// TODO 用箱人
	private String containerUser;
	// TODO 进场类别
	private String entryType;
	// TODO 审核状态
	private String auditType;
	// TODO 备注
	private String remark;
	// TODO 进场日期
	private String entryDate;
	// TODO 箱况
	private String containerCondition;

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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}

}
