package com.sanlly.purchase.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderInput;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderResultInput;
import com.sanlly.purchase.models.input.mattertender.SearchMatterTenderInput;
import com.sanlly.purchase.models.output.mattertender.MatterTenderOutput;
import com.sanlly.purchase.models.output.mattertender.MatterTenderProductOutput;
import com.sanlly.purchase.models.output.mattertender.TenderNoticeOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 招标采购接口 
* @author jlx   
* @date 2019年8月19日 下午4:28:17 
* @version V1.0   
 */
public interface MatterTenderService {

	/**
	 * 
	* @Description:  招标采购分页列表
	* @param input
	* @return PagedList<MatterTenderOutput>
	* @throws 
	 */
	PagedList<MatterTenderOutput> getMatterTenderPagedList(SearchMatterTenderInput input);
	
	/**
	 * 
	* @Description: 招标发布  
	* @param input void
	* @throws 
	 */
	void addMatterTender(AddMatterTenderInput input) throws Exception;
	
	/**
	 * 
	* @Description: 初审结果录入 
	* @param supplierInputs void
	* @throws 
	 */
	void addFirstTrial(Integer purcMatterTenderPurchaseId,String[] supplierInputs) throws Exception;
	/**
	 * 
	* @Description: 招标结果录入 
	* @param input void
	* @throws 
	 */
	void addTenderResult(AddMatterTenderResultInput input);
	/**
	 * 
	* @Description: 招标详情 
	* @param purcMatterTenderPurchaseId
	* @return MatterTenderOutput
	* @throws 
	 */
	MatterTenderOutput gettMatterTenderDetail(Integer purcMatterTenderPurchaseId);
	
	/**
	 * 
	* @Description: 公告列表 
	* @return List<MatterTenderOutput>
	* @throws 
	 */
	List<TenderNoticeOutput> getTenderNoticeList();

	/**
	 * 
	* @Description: 招标备件列表  
	* @param purcMatterTenderPurchaseId
	* @return List<MatterTenderProductOutput>
	* @throws 
	 */
	List<MatterTenderProductOutput> gettMatterTenderProductList(Integer purcMatterTenderPurchaseId);
	/**
	 * 
	* @Description: 为招标相关供应商发送邮件 
	* @param secondSpecials
	* @param supplierKeys
	* @param text
	* @param subject
	* @throws Exception void
	* @throws 
	 */
	void sendMail(String[] secondSpecials,String[] supplierKeys,String text,String subject) throws Exception;
}
