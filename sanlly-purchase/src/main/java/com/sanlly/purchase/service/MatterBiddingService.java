package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.bidding.AddBiddingResultInput;
import com.sanlly.purchase.models.input.bidding.AddMatterBiddingInput;
import com.sanlly.purchase.models.input.bidding.SearchMatterBiddingInput;
import com.sanlly.purchase.models.output.matterbidding.MatterBiddingOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderDetailOutput;
import com.sanlly.purchase.models.output.matterinquiry.MatterPeriodSupplierTenderDetailOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 竞价采购接口 
* @author jlx   
* @date 2019年8月24日 下午4:56:24 
* @version V1.0   
 */
public interface MatterBiddingService {

	/**
	 * 
	* @Description:  竞价采购分页列表
	* @param input
	* @return PagedList<MatterBiddingOutput>
	* @throws 
	 */
	PagedList<MatterBiddingOutput> getMatterBiddingPagedList(SearchMatterBiddingInput input);
	
	/**
	 * 
	* @Description: 竞价发布  
	* @param input void
	* @throws 
	 */
	void addMatterBidding(AddMatterBiddingInput input) throws Exception ;

	/**
	 * 
	* @Description: 竞价详情 
	* @param purcMatterTenderPurchaseId
	* @return MatterTenderOutput
	* @throws 
	 */
	MatterBiddingOutput gettMatterBiddingDetail(Integer purcMatterTenderPurchaseId);
	
	/**
	 * 
	* @Description: 竞价结果处理
	* @param input void
	* @throws 
	 */
	void addBiddingResult(AddBiddingResultInput input);
	/**
	 * 
	* @Description: 取得报价信息 
	* @param purcMatterTenderPurchaseId
	* @return MatterSupplierTenderDetailOutput
	* @throws 
	 */
	MatterSupplierTenderDetailOutput getSupplierTenderList(Integer purcMatterTenderPurchaseId);
	/**
	 * 
	* @Description: 周期性询价结果处理
	* @param input void
	* @throws 
	 */
	void addPeriodBiddingResult(MatterPeriodSupplierTenderDetailOutput input);
	/**
	 * 
	* @Description: 取得周期性报价信息 
	* @param purcMatterTenderPurchaseId
	* @return MatterSupplierTenderDetailOutput
	* @throws 
	 */
	MatterPeriodSupplierTenderDetailOutput getPeriodSupplierTenderList(Integer purcMatterTenderPurchaseId);


}
