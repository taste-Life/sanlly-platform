package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.maintenance.EstimateSearchInput;
import com.sanlly.production.models.output.valuation.ValuationListOutput;

/**
 * 保修估价接口
 * @author RexSheng
 * 2019年10月9日 下午3:56:13
 */
public interface MaintenanceEstimateService {

	/**
	 * 分页获取保修估价单列表
	 * @param input
	 * @return
	 * @throws Exception
	 */
	PagedList<ValuationListOutput> getEstimateList(EstimateSearchInput input) throws Exception;
}
