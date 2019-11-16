package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.rate.AddCostRateInput;
import com.sanlly.production.models.input.rate.SearchCostRateInput;
import com.sanlly.production.models.input.rate.UpdateCostRateInput;
import com.sanlly.production.models.output.rate.CostRateOutput;
import com.sanlly.production.models.output.rate.SearchCostRateMasterOutput;
import com.sanlly.production.models.output.rate.SearchCostRateSonOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 成本维护接口
* @Package com.sanlly.production.service 
* @Description: TODO 
* @author wangxzh   
* @date 2019年8月20日 下午4:13:13 
* @version V1.0   
 */
public interface RateCostService {
	/**
	 * 成本维护页面列表
	* @Description: TODO 
	* @param input
	* @return PagedList<SearchCostRateMasterOutput>
	* @throws 
	 */
	PagedList<SearchCostRateMasterOutput> getRatePagedList(SearchCostRateInput input);
	/**
	 * 根据费率查询备件列表
	* @Description: TODO 
	* @param rateId
	* @return List<SearchCostRateSonOutput>
	* @throws 
	 */
	List<SearchCostRateSonOutput> getSparesMessage(String rateId);
	/**
	 * 明细添加
	* @Description: TODO 
	* @param input void
	* @throws 
	 */
	void addCostRate(AddCostRateInput input);
	/**
	 * 获取单条明细信息
	* @Description: TODO 
	* @param rateId
	* @return CostRateOutput
	* @throws 
	 */
	CostRateOutput getCostItemMessage(String rateId);
	/**
	 * 明细编辑
	* @Description: TODO 
	* @param input void
	* @throws 
	 */
	void updateCostRate(UpdateCostRateInput input);
	/**
	 * 明细删除
	* @Description: TODO 
	* @param listIds void
	* @throws 
	 */
	void delCostRate(String[] listIds);
	/**
	 * 算法下拉
	* @Description: TODO 
	* @return List<SelectItemOutput>
	* @throws 
	 */
	List<SelectItemOutput> getAlgorithmList();
	/**
	 * 常用系数下拉
	* @Description: TODO 
	* @return List<SelectItemOutput>
	* @throws 
	 */
	List<SelectItemOutput> getCoefficientList();
	/**
	 * 备件下拉
	* @Description: TODO 
	* @return List<SelectItemOutput>
	* @throws 
	 */
	List<SelectItemOutput> getSparesList();
}
