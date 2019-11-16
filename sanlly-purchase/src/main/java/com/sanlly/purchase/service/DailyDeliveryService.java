package com.sanlly.purchase.service;

import java.util.List;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailydeliver.AddDailyDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.AddMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.output.dailydeliver.DailyDeliveryDetailOutput;
import com.sanlly.purchase.models.output.dailydeliver.DailyDeliveryOutput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryDetailOutput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 日常采购-送货单 
* @author jlx   
* @date 2019年9月16日 上午11:24:15 
* @version V1.0   
 */
public interface DailyDeliveryService {
	/**
	 * 
	* @Description: 添加送货单 
	* @param input void
	* @throws 
	 */
	void addDailyDelivery(AddDailyDeliveryInput input);
	/**
	 * 送货单分页列表
	 * @param input
	 * @return
	 */
	PagedList<DailyDeliveryOutput> getMatterDeliveryPagedList(SearchMatterDeliveryInput input);

	/**
	 * 
	* @Description: 送货单信息 
	* @param purcPurchaseOrderId
	* @return List<MatterDeliveryDetailOutput>
	* @throws 
	 */
	List<DailyDeliveryDetailOutput> getDeliveryInfo(Integer purcPurchaseOrderId);
	

	/**
	 * 
	* @Description: 删除送货单 
	* @param purcPurchaseDeliveryIds
	* @throws 
	 */
	void delMatterDelivery(Integer[] purcPurchaseDeliveryIds);
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
	PagedList<DailyDeliveryOutput> getVerifyPagedList(SearchMatterDeliveryInput input);

	/**
	 * 
	* @Description: 取得送货信息 
	* @param purcPurchaseDeliveryId
	* @return List<DailyDeliveryDetailOutput>
	* @throws 
	 */
	List<DailyDeliveryDetailOutput> getAcceptInfo(Integer purcPurchaseDeliveryId);
	/**
	 * 
	* @Description: 验收送货单 
	* @param input void
	* @throws 
	 */
	Result addAcceptDelivery(AddDailyDeliveryInput input);
	

}
