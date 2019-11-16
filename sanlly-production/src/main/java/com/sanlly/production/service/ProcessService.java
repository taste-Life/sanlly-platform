package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.ActiveProcessInput;
import com.sanlly.production.models.output.ActiveProcessOutPut;

/**
 * 流程配置接口  单表查询
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年7月31日  
*
 */
public interface ProcessService {

	/**
	 * 业务系统使用流程分页列表
	 * @param input
	 * @return
	 */
	PagedList<ActiveProcessOutPut> getProcessPagedList(ActiveProcessInput input);
}
