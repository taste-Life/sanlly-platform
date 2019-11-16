package com.sanlly.production.models.input.containerTesting;


/**   
* @Package com.sanlly.production.models.input.containerTesting 
* @Description: TODO 进场明细列表-实体
* @author tianzhl   
* @date 2019年8月20日 上午10:13:07 
* @version V1.0   
*/
public class ContainerEntryListInput{
	// TODO 进场明细id
	private String[] courseEntryIdList;

	public String[] getCourseEntryIdList() {
		return courseEntryIdList;
	}

	public void setCourseEntryIdList(String[] courseEntryIdList) {
		this.courseEntryIdList = courseEntryIdList;
	}
}
