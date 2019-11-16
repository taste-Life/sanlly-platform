package com.sanlly.production.models.input.quality;

/**
 * 品控部质检
 * 
 * @Package com.sanlly.production.models.input.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月19日 下午2:20:21 
 * @version V1.0   
 */
public class QaQualityInput {
	// 进场id
	private String courseId;
	// 箱类别
	private String containerCategory;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

}
