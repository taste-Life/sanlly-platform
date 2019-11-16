package com.sanlly.production.models.output.guarantee;
/**
 * app端模糊查询箱号输出类
 * @author zhangkai
 *
 */
public class ContainerNumsOutput {

	/*
	 * 箱号 
	 */
	private String contianerNo;
	/*
	 * 用箱人
	 */
	private String containerUser;
	/*
	 * 进场日期
	 */
	private String entryDate;
	/*
	 * 进场id
	 */
	private String prodCourseId;
	public String getContianerNo() {
		return contianerNo;
	}
	public void setContianerNo(String contianerNo) {
		this.contianerNo = contianerNo;
	}
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}
	
	
}
