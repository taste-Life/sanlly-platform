package com.sanlly.purchase.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.supplier.*;
import com.sanlly.purchase.models.output.lang.LangSelectOutput;
import com.sanlly.purchase.models.output.lang.SelectOptionOutput;
import com.sanlly.purchase.models.output.specialsupplier.SpecialSupplierOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.models.output.supplier.SupplierReportOutput;
import com.sanlly.purchase.models.output.supplier.SupplierReviewOutput;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.util.List;

public interface SupplierService {
	/**
	 * 导入黑名单
	 * @param inputs
	 * @throws Exception
	 */
	List<SpecialSupplierOutput> importBlackList(List<AddBlackListInput> inputs) throws  Exception;
	 /**
	 * 供应商批量导入
	 * @throws Exception
	 */
	void  importSupplier(List<ImportSupplierInput> inputs) throws Exception;
	
	/**
	 * 供应商新增
	 * @param input
	 */
	Result addSupplier (AddPurcSupplierInput input) throws Exception;
	/**
	 * 供应商评价
	 * @param input
	 */
	void addRecevierScore(AddReceiverScoreInput input);
	/**
	 * 供应商修改
	 * @param input
	 */
	void updateSupplier(EditSupplierInput input);
	
	/**
	 * 批量删除供应商
	 * @param SupplierIds
	 */
	void deleteSupplier(Integer[] supplierIds);
	
	
	/**
	 * 供应商邮件激活
	 * @param input
	 * @return 
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	Result supplierMailActivation(MailActivationInput input) throws AddressException, MessagingException;
	
	/**
	 * @author fjy 获取供应商Key
	 */
	 List<String> getSupplierList(SearchPurcSupplierInput input);
	
	/**
	 * @author mx
	 * 获取供应商列表
	 */
	public PagedList<PurcSupplierOutput> getSupplierPagedList(SearchPurcSupplierInput input) ;
	
	
	/**
	 * @author mx
	 * 获取供应商审核列表
	 */
	public List<SupplierReviewOutput> getSupplierReviewPagedList(SearchSupplierReviewInput input);
	
	/**
	 * @author mx
	 * 获取单独供应商
	 */
	public PurcSupplierOutput getSupplier(SearchPurcSupplierInput input) ;
	/**
	 * @author mx
	 * 获取供应商列表
	 */
	public List<SelectOptionOutput> getSuppliers();
	
	/**
	 * @author fjy 
	 * 获取供应商列表   外包商 下拉框
	 */
	public List<LangSelectOutput> getOutSuppliersFinance();
	
	/**
	 * @author mx
	 * 获取供应商管理报告列表
	 */
	public PagedList<SupplierReportOutput> getSupplierReports(SupplierReportInput input);
	
	/**
	 * @author mx
	 * 根据key获取单独供应商
	 */
	public PurcSupplierOutput getSupplierByKey(SearchPurcSupplierInput input) ;
	/**
	 * @author mx
	 * 供应商审核驳回
	 */
	public void rejectSupplier(Integer[] purcSupplierCompanyIds, String[] processInstanceIds, String[] taskIds,String[] auditType);
	/**
	 * @author mx
	 * 供应商审核通过
	 */
	public void auditSupplier(Integer[] purcSupplierCompanyIds, String[] processInstanceIds, String[] taskIds,String[] auditType);
	/**
	 * @author mx
	 * 根据备件分类获取供应商
	 * @throws Exception 
	 */
	public List<PurcSupplierOutput> getSupplierBySecondSpecial(String[] secondSpecial,String name,String grade) throws Exception;

	/**
	 * 
	* @Description: 根据key取得供应商SAPID 
	* @param key
	* @return String
	* @throws 
	 */
	public String getSupplierSAP(String key) ;
	/**
	 * 
	* @Description: 根据key取得供应商币种 
	* @param key
	* @return String
	* @throws 
	 */
	public String getCurrencyByKey(String key) ;
	
}
