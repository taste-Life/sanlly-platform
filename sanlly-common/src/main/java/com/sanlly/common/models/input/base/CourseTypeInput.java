package com.sanlly.common.models.input.base;

public class CourseTypeInput {

	private Integer prodCourseTypeId;

    private String key;

    private String courseTypeCode;

    private String courseTypeName;

    private String courseTypeNameEn;

	public Integer getProdCourseTypeId() {
		return prodCourseTypeId;
	}

	public void setProdCourseTypeId(Integer prodCourseTypeId) {
		this.prodCourseTypeId = prodCourseTypeId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCourseTypeCode() {
		return courseTypeCode;
	}

	public void setCourseTypeCode(String courseTypeCode) {
		this.courseTypeCode = courseTypeCode;
	}

	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}

	public String getCourseTypeNameEn() {
		return courseTypeNameEn;
	}

	public void setCourseTypeNameEn(String courseTypeNameEn) {
		this.courseTypeNameEn = courseTypeNameEn;
	}
    
    
}
