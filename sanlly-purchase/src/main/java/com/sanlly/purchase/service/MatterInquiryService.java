package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.inquiry.AddInquiryResultInput;
import com.sanlly.purchase.models.input.inquiry.AddMatterInquiryInput;
import com.sanlly.purchase.models.input.inquiry.AddReInquiryInput;
import com.sanlly.purchase.models.input.inquiry.SearchMatterInquiryInput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderDetailOutput;
import com.sanlly.purchase.models.output.matterinquiry.MatterInquiryOutput;
import com.sanlly.purchase.models.output.matterinquiry.MatterPeriodSupplierTenderDetailOutput;
import com.sanlly.purchase.models.output.matterinquiry.MatterReInquiryOutput;

public interface MatterInquiryService {

	/**
	 * 
	* @Description:  询价采购分页列表
	* @param input
	* @return PagedList<MatterInquiryOutput>
	* @throws 
	 */
	PagedList<MatterInquiryOutput> getMatterInquiryPagedList(SearchMatterInquiryInput input);
	/**
	 * 
	* @Description:  招标-竞价-询价未采纳推荐供应商审核列表
	* @param input
	* @return PagedList<MatterInquiryOutput>
	* @throws 
	 */
	PagedList<MatterInquiryOutput> getMatterAuditPagedList(SearchMatterInquiryInput input);
	
	/**
	 * 
	* @Description: 询价发布  
	* @param input void
	* @throws 
	 */
	void addMatterInquiry(AddMatterInquiryInput input) throws Exception;
	

	/**
	 * 
	* @Description: 重新询价  
	* @param input void
	* @throws 
	 */
	void addMatterReInquiry(AddMatterInquiryInput input) throws Exception;

	/**
	 * 
	* @Description: 询价详情 
	* @param purcMatterTenderPurchaseId
	* @return MatterTenderOutput
	* @throws 
	 */
	MatterInquiryOutput gettMatterInquiryDetail(Integer purcMatterTenderPurchaseId);
	
	/**
	 * 
	* @Description: 询价结果处理
	* @param input void
	* @throws 
	 */
	void addInquiryResult(AddInquiryResultInput input);
	/**
	 * 
	* @Description: 周期性询价结果处理
	* @param input void
	* @throws 
	 */
	void addPeriodInquiryResult(MatterPeriodSupplierTenderDetailOutput input);
	
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
	* @Description: 取得周期性报价信息 
	* @param purcMatterTenderPurchaseId
	* @return MatterSupplierTenderDetailOutput
	* @throws 
	 */
	MatterPeriodSupplierTenderDetailOutput getPeriodSupplierTenderList(Integer purcMatterTenderPurchaseId);

	/**
	 * 
	* @Description: 再次询价 -推迟截止时间
	* @param input void
	* @throws 
	 */
	void addReInquiry(AddReInquiryInput input) throws Exception;
	/**
	 * 
	* @Description: 取得重新询价信息 
	* @param purcMatterTenderPurchaseId
	* @return MatterInquiryOutput
	* @throws 
	 */
	MatterReInquiryOutput getReMatterInquiry(Integer purcMatterTenderPurchaseId);
	
	/**
	 * 招标-竞价-询价未采纳推荐供应商审核
	 * @param purcMatterTemporaryPurchaseId
	 */
	void auditMatterPurchase(Integer[] purcMatterTenderPurchaseIds,String[] processInstanceIds,String[] taskIds);
	/**
	 * 招标-竞价-询价未采纳推荐供应商驳回
	 * @param purcMatterTemporaryPurchaseId
	 */
	void rejectMatterPurchase(Integer[] purcMatterTenderPurchaseIds,String[] processInstanceIds,String[] taskIds);

}
