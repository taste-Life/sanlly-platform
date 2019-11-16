package com.sanlly.production.dao;

import java.util.List;

import com.sanlly.production.models.input.containerTesting.SearchAuditRateInput;
import com.sanlly.production.models.input.rate.SearchCostRateInput;
import com.sanlly.production.models.input.rate.SearchRateInput;
import com.sanlly.production.models.output.containerTesting.SearchAuditRateOutput;
import com.sanlly.production.models.output.rate.SearchCostRateMasterOutput;
import com.sanlly.production.models.output.rate.SearchSanRateOutput;
import com.sanlly.production.models.output.rate.SearchUserRateOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 费率扩展接口
 * 
 * @author wangxzh
 *
 */
public interface RateExtMapper {
	/**
	 * 成分费率列表查询
	 * 
	 * @param input
	 * @return
	 */
	List<SearchCostRateMasterOutput> getCostRatePagedList(SearchCostRateInput input);

	/**
	 * 成本费率总条数
	 * 
	 * @param input
	 * @return
	 */
	Integer getCostRatePagedCount(SearchCostRateInput input);

	/**
	 * 部件明细下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getPartsDetailsSelect(String name);

	/**
	 * 部件大类下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getPartsTypeSelect(String name);

	/**
	 * 维修代码下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getRepairSelect(String name);

	/**
	 * 材质代码下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getMaterialSelect(String name);

	/**
	 * SAN费率列表
	 * 
	 * @param input
	 * @return
	 */
	List<SearchSanRateOutput> getSanRateList(SearchRateInput input);

	/**
	 * 用箱人费率列表
	 * 
	 * @param rateId
	 * @return
	 */
	List<SearchUserRateOutput> getUserRateList(String rateId);

	/**
	 * 限制条目（费率代码）列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return List<SearchAuditRateOutput> @throws 
	 */
	List<SearchAuditRateOutput> getAuditRateList(SearchAuditRateInput input);

	/**
	 * 限制条目（费率代码）列表总数
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Integer @throws 
	 */
	Integer getAuditRateCount(SearchAuditRateInput input);

}
