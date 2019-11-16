package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

/**
 * 新增edi类型
 * @author RexSheng
 * 2019年10月14日 下午2:04:49
 */
public class AddEdiSearchInput extends PageInput{

	private String containerUser;
	
	private String containerOwner;
	
	private String isSurrender;
	
	private String containerNo;
	
	private String[] yard;
	
	private String courseType;
	
	private String containerCategory;
	
	private String beginCourseTime;
	
	private String endCourseTime;
	
	private String beginAuditTime;
	
	private String endAuditTime;
	
	private String beginFinishTime;
	
	private String endFinishTime;
	
	private String useReplyState;
	
	private String[] ediTypeList;
	
	private String[] importContainerNo;

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String[] getYard() {
		return yard;
	}

	public void setYard(String[] yard) {
		this.yard = yard;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getBeginCourseTime() {
		return beginCourseTime;
	}

	public void setBeginCourseTime(String beginCourseTime) {
		this.beginCourseTime = beginCourseTime;
	}

	public String getEndCourseTime() {
		return endCourseTime;
	}

	public void setEndCourseTime(String endCourseTime) {
		this.endCourseTime = endCourseTime;
	}

	public String getBeginAuditTime() {
		return beginAuditTime;
	}

	public void setBeginAuditTime(String beginAuditTime) {
		this.beginAuditTime = beginAuditTime;
	}

	public String getEndAuditTime() {
		return endAuditTime;
	}

	public void setEndAuditTime(String endAuditTime) {
		this.endAuditTime = endAuditTime;
	}

	public String getBeginFinishTime() {
		return beginFinishTime;
	}

	public void setBeginFinishTime(String beginFinishTime) {
		this.beginFinishTime = beginFinishTime;
	}

	public String getEndFinishTime() {
		return endFinishTime;
	}

	public void setEndFinishTime(String endFinishTime) {
		this.endFinishTime = endFinishTime;
	}

	public String getUseReplyState() {
		return useReplyState;
	}

	public void setUseReplyState(String useReplyState) {
		this.useReplyState = useReplyState;
	}

	public String[] getEdiTypeList() {
		return ediTypeList;
	}

	public void setEdiTypeList(String[] ediTypeList) {
		this.ediTypeList = ediTypeList;
	}

	public String[] getImportContainerNo() {
		return importContainerNo;
	}

	public void setImportContainerNo(String[] importContainerNo) {
		this.importContainerNo = importContainerNo;
	}
	
	
}
