package com.sanlly.production.models.output.goh;

/**
 * 进场列表
 * 
 * @Package com.sanlly.production.models.output.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月24日 下午3:29:12 
 * @version V1.0   
 */
public class SearchCourseOutput {
	// 进场id
	private String courseId;
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUserLang;
	// 场站
	private String yardLang;
	// 进场类型
	private String courseTypeLang;
	// 尺寸
	private String sizeLang;
	// 箱型
	private String containerTypeLang;
	// 进场时间
	private String courseTime;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

}
