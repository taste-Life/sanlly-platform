package com.sanlly.production.models.output.app.containerTesting;

import com.sanlly.common.models.output.pagination.PagedList;


/**   
* @Package com.sanlly.production.models.output.app.containerTesting 
* @Description: TODO 检验列表分页返回实体
* @author tianzhl   
* @date 2019年8月10日 下午2:54:11 
* @version V1.0   
*/
public class CourseListOutput<T> extends PagedList<T> {

	public CourseListOutput(Integer currentPageIndex, Integer pageSize) {
		super(currentPageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

	private String toAudit;

	public String getToAudit() {
		return toAudit;
	}

	public void setToAudit(String toAudit) {
		this.toAudit = toAudit;
	}

	
}
