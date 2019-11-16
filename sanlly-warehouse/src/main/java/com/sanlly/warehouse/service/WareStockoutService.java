package com.sanlly.warehouse.service;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.common.models.output.fixOut.PickingListDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WareStockout;
import com.sanlly.warehouse.entity.WareStockoutDetail;
import com.sanlly.warehouse.models.input.stockout.*;
import com.sanlly.warehouse.models.output.stockout.StockoutAppOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailAppOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

/**
 * ClassName: WareStockoutService Description: 出库服务层 date: 2019/8/6 13:47
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareStockoutService {

	/**
	 * 分页查询出库单
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockoutOutput> stockoutPageList(SearchStockoutInput input);

	/**
	 * 新增出库单
	 * 
	 * @param input
	 */
	Integer addStockout(AddStockoutInput input);

	/**
	 * 新增出库单 直接出库
	 *
	 * @param input
	 */
	void addStockoutPass(AddStockoutInput input);

	/**
	 * 修改出库单
	 * 
	 * @param input
	 */
	void editStockout(EditStockoutInput input);

	/**
	 * 根据出库单号查询出库明细
	 *
	 * @param wareStockout
	 * @return
	 */
	List<StockoutDetailOutput> getStockDetailList(WareStockout wareStockout);

	/**
	 * 新增出库单. 确认状态、审核状态由参数确定.调用此方法需加事务控制
	 * 
	 * @author lishzh
	 * @param input
	 */
	void addStockout(StockOutInput input);

	/**
	 * 批量审核出库
	 * 
	 * @param ids
	 */
	void passAudit(Integer[] ids);

	/**
	 * 批量驳回出库
	 * 
	 * @param ids
	 * @param reasonsRejection
	 */
	void rejectAudit(Integer[] ids, String reasonsRejection);

	/**
	 * app 分页查询出库单
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockoutAppOutput> getAppList(SearchStockoutInput input);

	/**
	 * app 分页查询出库单明细
	 * 
	 * @param stockoutId
	 * @return
	 */
	List<StockoutDetailAppOutput> getDetailListApp(String stockoutId);

	/**
	 * app 出库
	 * 
	 * @param stockoutId
	 * @param detailId
	 */
	void stockOutApp(String stockoutId, List<String> detailId);

	/**
	 * App 根据单号查询已出库详情
	 * 
	 * @param stockoutId
	 * @return
	 */
	List<StockoutDetailAppOutput> stockoutDetailsConfirm(String stockoutId);

	/**
	 * app 出库确认
	 * 
	 * @param stockoutId
	 */
	void stockoutConfirm(String stockoutId, String userId);

	/**
	 * 出库
	 * 
	 * @param input
	 */
	void stockout(StockoutOutput input);

	/**
	 * 直接出库.无需确认审核.调用此方法需加事务控制
	 *
	 * @author lishzh
	 * @param input
	 */
	void directOut(StockOutInput input);

	/**
	 * 根据源单号获取该源单的出库明细.找不到则返回null
	 *
	 * @author lishzh
	 * @param sourceNo
	 * @return 出库明细或者null
	 */
	List<StockoutDetailOutput> getStockDetailList(String sourceNo);

	/**
	 * 根据原单号获取出库单列表
	 * @param no
	 * @return
	 */
	List<StockoutOutput> getOrderByNo(String no);

    /**
     * 生产领料出库
     * @param input
     */
	void prodOut(PickingListDetailOutput input);

	/**
	 * 根据领料单号批量出库
	 * @param nos
	 */
	void prodOutOfNos(String[] nos);

	/**
     * 生产领料退库
     * @param input
     */
	void prodReturn(List<StockoutOutput> input);

	/**
     * 根据原单号查询出库单列表
     * @param no
     */
	List<StockoutOutput> byNo(String no);

	/**
	 * 根据领料单号箱号获取出库总价
	 * @param referralNo
	 * @param containerNo
	 * @return
	 */
	BigDecimal getTotalAmount(String referralNo,String containerNo);

	/**
	 * 根据单号获取领料单
	 * @param referralNo
	 * @return
	 */
	PickingListDetailOutput getPicking(String referralNo);
	/**
	 * 
	* @Description: 根据批次号和备件号取得出库明细 
	* @param batchs
	* @return List<StockoutDetailOutput>
	* @throws 
	 */
	List<WareStockoutDetail> getStockOutDetailList(List<String> batchs, String sparePartsKey);
	/**
	 * 
	* @Description: 根据id取得上传SBS的出库单 
	* @param id
	* @return List<StockoutOutput>
	* @throws 
	 */
	List<WareStockout> getStockOut(List<Integer> id);
}
