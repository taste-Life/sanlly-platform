package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.entrustprocess.EntrustProcessInput;
import com.sanlly.warehouse.models.input.entrustprocess.SearchEntrustProcessInput;
import com.sanlly.warehouse.models.output.entrustprocess.EntrustProcessOutput;

/**
 * 委托加工service
 * 
 * @author lishzh
 *
 */
public interface EntrustProcessService {

	/**
	 * 添加委托加工单
	 *
	 * @author lishzh
	 * @param input
	 */
	void addEntrustProcess(EntrustProcessInput input);

	/**
	 *生成委托加工单
	 *
	 *@author lishzh
	 */
	Integer generateEntrustProcess(EntrustProcessInput input);

	/**
	 * 修改委托加工单
	 *
	 * @author lishzh
	 * @param input
	 */
	void editEntrustProcess(EntrustProcessInput input);

	/**
	 * 删除委托加单
	 *
	 * @author lishzh
	 * @param ids
	 */
	void deleteEntrustProcess(List<Integer> ids);

	/**
	 * 获取委托加工单列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<EntrustProcessOutput> getEntrustProcess(SearchEntrustProcessInput input);

	/**
	 * 根据id获取委托加工单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	EntrustProcessOutput getEntrustProcessById(Integer id);

	/**
	 * 出库审核
	 *
	 * @author lishzh
	 * @param id
	 */
	void audit(List<Integer> ids);

	/**
	 * 出库驳回
	 *
	 * @author lishzh
	 * @param input
	 */
	void reject(EntrustProcessInput input);

	/**
	 * 加工成品入库
	 *
	 * @author lishzh
	 * @param id
	 */
	void productIn(Integer id);

}
