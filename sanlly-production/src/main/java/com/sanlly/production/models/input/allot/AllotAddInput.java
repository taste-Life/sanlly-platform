package com.sanlly.production.models.input.allot;
/**
 * 坏箱调拨新增输入类
 * @author zhangkai
 *
 */
public class AllotAddInput {

	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 用箱人
	 */
	private String containerUser;
	
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
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	
	
	
}
