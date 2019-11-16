package com.sanlly.purchase.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.entity.PeriodProduct;
import com.sanlly.purchase.models.input.mattertender.SearchMatterTenderInput;
import com.sanlly.purchase.models.input.periodproduct.AddPeriodProductInput;
import com.sanlly.purchase.models.input.periodproduct.EditPeriodProductInput;
import com.sanlly.purchase.models.input.periodproduct.SearchPeriodProductInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.mattertender.MatterTenderOutput;
import com.sanlly.purchase.models.output.period.PeriodProductOutput;

/**
 * 
* Description:周期性定价备件接口 
* @ClassName: PeriodProductService
* @date 2019年8月1日
*
* @author jlx
 */
public interface PeriodProductService {

	/**
	 * 添加周期性定价备件
	 * @param product
	 * @return
	 */
	void addPeriodProduct(AddPeriodProductInput input);
	/**
	 * 周期性定价备件的信息
	 * @param product
	 * @return
	 */
	PeriodProduct getSupplier(String product,String warehouse);
	/**
	 * 
	* @Description: 周期性定价备件分页列表 
	* @param input
	* @return PagedList<PeriodProductOutput>
	* @throws 
	 */
	PagedList<PeriodProductOutput> getPeriodProductPagedList(SearchPeriodProductInput input);
	
	/**
	 * 
	* @Description: 编辑周期性定价备件价格  
	* @param input void
	* @throws 
	 */
	void UpdateProductPrice(EditPeriodProductInput input);
	
	/**
	 * 
	* @Description: 重新招标备件信息取得 
	* @param periodProductIds
	* @return List<MatterDemandOutput>
	* @throws 
	 */
	List<MatterDemandOutput> getReTenderProductList(Integer[] periodProductIds);
	
	/**
	 * 
	* @Description: 周期性定价备件到期提醒分页列表 
	* @param input
	* @return PagedList<PeriodProductOutput>
	* @throws 
	 */
	PagedList<PeriodProductOutput> getPeriodProductRemindPagedList(SearchPeriodProductInput input);
	

}
