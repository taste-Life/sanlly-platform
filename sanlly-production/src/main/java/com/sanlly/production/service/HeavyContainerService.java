package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.output.heavyContainer.HeavyContainerOutput;

/**
 * 重箱监管service
 * @author zhangkai
 *
 */
public interface HeavyContainerService {

	/**
	 * 列表
	 * @param vesVos 船名航次
	 * @param state 状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	PagedList<HeavyContainerOutput> list(String vesVos, String state, Integer pageNum, Integer pageSize);
	
	/**
	 * 装船
	 * @param ids
	 */
	void doSetShip(Integer[] ids);
	
	/**
	 * 转船
	 * @param ids
	 * @param vesVos
	 */
	void doChangeShip(Integer[] ids, String vesVos);
	
	/**
	 * 退载
	 * @param ids
	 */
	void doBackLoad(Integer[] ids);
}
