package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.allot.AllotAddInput;
import com.sanlly.production.models.input.allot.AllotUpdateInput;
import com.sanlly.production.models.output.allot.AllotOutput;

/**
 * 坏箱调拨service
 * @author zhangkai
 *
 */
public interface AllotService {

	/**
	 * 列表
	 * @param containerNo 箱号
	 * @param exitYard 调出场站
	 * @param entryYard 调入场站
	 * @param state 调拨状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	PagedList<AllotOutput> list(String containerNo, String exitYard, String entryYard, String state, Integer pageNum, Integer pageSize);
	
	/**
	 * 新增
	 * @param inputs
	 */
	void add(List<AllotAddInput> inputs);
	
	/**
	 * 编辑
	 * @param input
	 */
	void update(AllotUpdateInput input);
	
	/**
	 * 确认调入
	 * @param ids
	 */
	void inConfirm(Integer[] ids);
	
	/**
	 * 申请调回
	 * @param ids 坏箱调拨id集合
	 * @param fleet 车队
	 * @param plateNo 车牌号
	 * @param cost 费用
	 * @param reason 调回原因
	 */
	void applyBack(Integer[] ids, String fleet, String plateNo, String cost, String reason);
	
	/**
	 * 确认调回
	 * @param ids
	 */
	void backConfirm(Integer[] ids);
}
