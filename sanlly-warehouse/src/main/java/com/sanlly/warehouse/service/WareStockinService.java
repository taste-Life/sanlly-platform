package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.input.stockin.EditStockinInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.stockin.StockInInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;

/**
 * ClassName: WareStockinService Description: 入库单服务层 date: 2019/8/2 15:16
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareStockinService {

	/**
	 * 分页查询入库单
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockinOutput> stockinPageList(SearchStockinInput input);

	/**
	 *根据入库单ID获取入库单
	 *
	 *@author lishzh
	 */
	StockinOutput getStockinById(Integer id);

	/**
	 * 新增入库单
	 * 
	 * @param input
	 */
	Integer addStockin(AddStockinInput input);

	/**
	 * 修改入库单
	 * 
	 * @param input
	 */
	void editStockin(EditStockinInput input);

	/**
	 * 批量审核通过
	 * 
	 * @param ids
	 */
	void auditPassStockin(Integer[] ids);

	/**
	 * 批量审核驳回
	 * 
	 * @param ids
	 */
	void auditRejectStockin(Integer[] ids, String reasonsRejection);

	/**
	 * 批量入库
	 * 
	 * @param ids
	 */
	void stockin(Integer[] ids);

	/**
	 * 新增代管入库单
	 * 
	 * @param input
	 */
	void addEscrowIn(AddStockinInput input);

	/**
	 * 新自动审核增入库单
	 * 
	 * @param input
	 */
	void addStockinAudited(AddStockinInput input);

	/**
	 * 入库
	 * 
	 * @param input
	 */
	void in(StockinOutput input);

	/**
	 * 新增入库单. 确认状态、审核状态由参数确定.调用此方法需加事务控制
	 * 
	 * @author lishzh
	 * @param input
	 */
	Integer addStockin(StockInInput input);

	/**
	 * 直接入库.无需确认审核.调用此方法需加事务控制
	 *
	 * @author lishzh
	 * @param input
	 */
	void directIn(StockInInput input);
	
	/**
	 * 调拨入库 
	 *
	 * @author lishzh
	 * @param input
	 */
	void TransferIn(StockInInput input);
	
	/**
	 * 退库入库 
	 *
	 * @author lishzh
	 * @param input
	 */
	void returnIn(StockInInput input);
	
	/**
	 * 借件入库 
	 *
	 * @author lishzh
	 * @param input
	 */
	void borrowIn(StockInInput input);

	/**
     * 评分考核项目：质量及服务水平
     * @param deliveryNum 送货编号
     * @param qualityScore 质量分
     * @param serviceScore 服务水平分
     * @return
     */
	void evaluateQualityAndService(String deliveryNum,Double qualityScore,Double serviceScore);

}
