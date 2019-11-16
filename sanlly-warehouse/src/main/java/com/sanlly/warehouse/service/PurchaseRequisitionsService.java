package com.sanlly.warehouse.service;


import java.text.ParseException;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WarePurchaseRequisitions;
import com.sanlly.warehouse.models.input.wareearlywarning.AddAutoPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddManualPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddManualRequisitionsWareInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AuditPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.DeletePurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.EditPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.output.purchaserequisitions.WarePurchaseRequisitionsListOutput;

/**
 * 
* Description:采购需求 
* @ClassName: WareSafeStockService
* @date 2019年7月25日
*
* @author jlx
 */
public interface PurchaseRequisitionsService {

	/**
	 * 采购需求列表取得
	 * @param input
	 * @return
	 * @throws ParseException 
	 */
	PagedList<WarePurchaseRequisitionsListOutput> getPageListPurchaseRequisitions(SearchPurchaseRequisitionsInput input) throws ParseException;
	/**
	 * 删除采购需求
	 * @param input
	 */
	void deletePurchaseRequisitions(Integer[] warePurchaseRequisitionsId);
	/**
	 * 编辑采购需求
	 * @param input
	 */
	void editPurchaseRequisitions(EditPurchaseRequisitionsInput input) throws ParseException;
	/**
	 * 手动添加采购需求
	 * @param input
	 */
	void addManualPurchaseRequisitions(AddManualPurchaseRequisitionsInput input) throws ParseException;
	void addManualWareRequisitions(AddManualRequisitionsWareInput input);
	/**
	 * 自动添加采购需求
	 * @param input
	 */
	void addAutoPurchaseRequisitions(AddAutoPurchaseRequisitionsInput input);
	/**
	 * 确认采购需求
	 * @param input
	 */
	Boolean AuditPurchaseRequisitions(Integer[] warePurchaseRequisitionsId,String auditStatus,String reject);
	/**
	 * 
	* @Description: 取得备件所在仓库的库存、安全库存、上一年度入库总量 
	* @param spareParts
	* @param warehouse
	* @return
	* @throws ParseException WarePurchaseRequisitionsListOutput
	* @throws 
	 */
	WarePurchaseRequisitionsListOutput getPurchaseRequisitionsOutput(String spareParts,String warehouse) throws ParseException;
	
	
}
