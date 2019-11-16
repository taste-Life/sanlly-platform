package com.sanlly.purchase.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.matterdeliver.AddMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.input.matterinvoice.AddMatterInvoiceInput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryDetailOutput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryOutput;
import com.sanlly.purchase.models.output.matterorder.PurchaseOrderOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 物料采购-送货单 
* @author jlx   
* @date 2019年9月16日 上午11:23:42 
* @version V1.0   
 */
public interface MatterDeliveryService {
	/**
	 * 
	* @Description: 添加送货单 
	* @param input void
	* @throws 
	 */
	void addMatterDelivery(AddMatterDeliveryInput input);
	/**
	 * 送货单分页列表
	 * @param input
	 * @return
	 */
	PagedList<MatterDeliveryOutput> getMatterDeliveryPagedList(SearchMatterDeliveryInput input);
	/**
	 * 送货单入库信息取得
	 * @param input
	 * @return
	 */
	MatterDeliveryOutput getMatterDeliveryTOStockin(SearchMatterDeliveryInput input);

	/**
	 * 
	* @Description: 送货单信息 
	* @param purcPurchaseOrderId
	* @return List<MatterDeliveryDetailOutput>
	* @throws 
	 */
	List<MatterDeliveryDetailOutput> getDeliveryInfo(Integer purcPurchaseOrderId);
	

	/**
	 * 
	* @Description: 删除送货单 
	* @param purcPurchaseDeliveryIds
	* @throws 
	 */
	void delMatterDelivery(Integer[] purcPurchaseDeliveryIds);
	
	/**
	 * 
	* @Description: 送货单入库 
	* @param stockinOutputs void
	* @throws 
	 */
	void deliveryStockin(StockinOutput stockinOutput);
	/**
	 * 
	* @Description: 对账 
	* @param purcPurchaseDeliveryIds void
	* @throws 
	 */
	void verifyMatterDelivery(Integer[] purcPurchaseDeliveryIds);
	/**
	 * 
	* @Description: 对账确认 
	* @param purcPurchaseDeliveryIds void
	* @throws 
	 */
	void verifyOkMatterDelivery(Integer[] purcPurchaseDeliveryIds);
	
	

	/**
	 * 对账管理分页列表
	 * @param input
	 * @return
	 */
	PagedList<MatterDeliveryOutput> getVerifyPagedList(SearchMatterDeliveryInput input);
}
