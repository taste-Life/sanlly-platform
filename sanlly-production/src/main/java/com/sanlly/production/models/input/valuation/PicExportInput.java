package com.sanlly.production.models.input.valuation;
/**
 * 导出照片输入类
 * @author zhangkai
 *
 */
public class PicExportInput {

	// 进场id
	private String prodCourseId;
	// 箱号
	private String containerNo;
	// 修前修后 1、修改；2、修后；3、修前+修后
	private String beforeOrAfter;
	// 箱体机组 1、箱体/干箱；2、机组
	private String courseOrUnit;
	
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getBeforeOrAfter() {
		return beforeOrAfter;
	}
	public void setBeforeOrAfter(String beforeOrAfter) {
		this.beforeOrAfter = beforeOrAfter;
	}
	public String getCourseOrUnit() {
		return courseOrUnit;
	}
	public void setCourseOrUnit(String courseOrUnit) {
		this.courseOrUnit = courseOrUnit;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}
	
	
	
}
