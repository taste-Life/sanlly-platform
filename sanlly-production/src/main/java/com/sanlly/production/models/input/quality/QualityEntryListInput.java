package com.sanlly.production.models.input.quality;

/**
 * 删除质检明细
* @Package com.sanlly.production.models.input.quality 
* @Description: TODO 
* @author wangxzh   
* @date 2019年10月15日 上午10:46:45 
* @version V1.0   
 */
public class QualityEntryListInput {
	// 条目id
	private String[] courseEntryIdList;

	public String[] getCourseEntryIdList() {
		return courseEntryIdList;
	}

	public void setCourseEntryIdList(String[] courseEntryIdList) {
		this.courseEntryIdList = courseEntryIdList;
	}

}
