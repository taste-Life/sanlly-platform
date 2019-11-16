package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.remark.CommonRemarkSelectInput;
import com.sanlly.production.models.input.remark.CommonRemarksInput;
import com.sanlly.production.models.output.remark.CommonRemarkSelectOutput;
import com.sanlly.production.models.output.remark.CommonRemarksOutput;

/**
 * 
* @Package com.sanlly.production.service 
* @Description: 常用备注 
* @author zhangkai   
* @date 2019年8月28日 下午2:46:30 
* @version V1.0   
 */
public interface CommonRemarkService {
	
	/**
	 * tianzhl要的接口
	 * @author zhangkai
	 */
	List<CommonRemarkSelectOutput> select(CommonRemarkSelectInput input);

	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zjd
	 */
	int update(CommonRemarksInput input);

	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zjd
	 */
	int add(CommonRemarksInput input);

	PagedList<CommonRemarksOutput> pageList(PageInput input, String searchWords);

	int multiDelete(Integer[] ids);

	int multiValid(Integer[] ids, int valid);

}
