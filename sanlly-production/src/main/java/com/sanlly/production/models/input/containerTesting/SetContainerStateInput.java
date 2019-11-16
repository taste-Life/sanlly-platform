package com.sanlly.production.models.input.containerTesting;

/**   
* @Package com.sanlly.production.models.input.containerTesting 
* @Description: TODO 箱体批量设置
* @author tianzhl   
* @date 2019年8月15日 下午5:32:08 
* @version V1.0   
*/
public class SetContainerStateInput {

	// TODO 进场id数字
	private String[] prodCourseIdList;
	
	// TODO 箱子状态-好LEContainStateEnum02/坏LEContainStateEnum03
	private String containerState;

	public String[] getProdCourseIdList() {
		return prodCourseIdList;
	}

	public void setProdCourseIdList(String[] prodCourseIdList) {
		this.prodCourseIdList = prodCourseIdList;
	}

	public String getContainerState() {
		return containerState;
	}

	public void setContainerState(String containerState) {
		this.containerState = containerState;
	}


}
