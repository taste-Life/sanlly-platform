package com.sanlly.production.models.input.app.containerTesting;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.app.containerTesting 
 * @Description: TODO 箱体进场明细信息实体-输入
 * @author tianzhl   
 * @date 2019年8月10日 上午9:49:34 
 * @version V1.0   
 */
public class ContainerCourseOffLineListInput {

	// TODO 离线进场列表
	private List<ContainerCourseOffLineInput> courses;

	public List<ContainerCourseOffLineInput> getCourses() {
		return courses;
	}

	public void setCourses(List<ContainerCourseOffLineInput> courses) {
		this.courses = courses;
	}

}
