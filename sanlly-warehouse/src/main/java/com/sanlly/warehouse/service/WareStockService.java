package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockNumOutput;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.stock.WareOutput;
import com.sanlly.warehouse.entity.WareEntryAdjustmentDetail;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.models.input.entryadjustment.AddEntryAdjustmentDetailInput;
import com.sanlly.warehouse.models.input.stock.*;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: WareStockService Description: 库存服务层 date: 2019/7/29 17:27
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareStockService {

	/**
	 * 查询库存分页列表
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockOutput> stockPageList(SearchStockInput input);

	/**
	 * 分组分页查询库存数量
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockOutput> stockNumPageList(SearchStockNumInput input);

	/**
	 * 新增库存
	 * 
	 * @param input
	 */
	void addStock(AddStockInput input);

	/**
	 * 修改基础库存信息
	 * 
	 * @param input
	 */
	void editStock(EditStockInput input);

	/**
	 * 修改库存数量
	 * 
	 * @param input
	 */
	void editStockNum(EditStockNumInput input);

	/**
	 * 根据备件批次号和备件key获取库存信息
	 * 
	 * @param Batch
	 * @param sparePartsKey
	 * @return
	 */
	StockOutput getStockByBatch(String Batch, String sparePartsKey);
	/**
	 * 根据备件原始批次号和备件key获取库存数量
	 * 
	 * @param Batch
	 * @param sparePartsKey
	 * @return
	 */
	Double getStockByOriginalBatch(String originalBatch, String sparePartsKey);
	/**
	 * 根据备件原始批次号和备件key获取批次
	 * 
	 * @param Batch
	 * @param sparePartsKey
	 * @return
	 */
	List<String> getBatchByOriginalBatch(String originalBatch, String sparePartsKey);
	/**
	 * 根据备件原始批次号和备件key获取库存信息
	 * 
	 * @param Batch
	 * @param sparePartsKey
	 * @return
	 */
	WareStock getStockInfoByOriginalBatch(String originalBatch, String sparePartsKey);
	/**
	 * 修改库存-入库单调账-调整数量
	 * 
	 * @param stockDetail
	 */
	void setStock(String originalBatch, String sparePartsKey,Double stock);
	/**
	 * 修改库存-入库单调账-调整仓库类型
	 * 
	 * @param stockDetail
	 */
	void setStock(String originalBatch, String sparePartsKey,String warehouseType,BigDecimal entryPrice);
	/**
	 * 修改库存-入库单调账-调整关税、增值税、单价
	 * 
	 * @param stockDetail
	 */
	void setStock(String originalBatch, String sparePartsKey,WareEntryAdjustmentDetail adjustmentDetail);

	/**
	 * 修改库存
	 * 
	 * @param stockDetail
	 */
	void setStock(StockoutDetailOutput stockDetail);

	/**
	 * 修改库存
	 * 
	 * @param stockDetail
	 */
	void setStock(AddStockoutDetailInput stockDetail);

	/**
	 * 根据备件key获取库存数量
	 * 
	 * @param spKey
	 * @return
	 */
	Double getStockNum(String spKey);

	/**
	 * 根据公司获取备件库存总数
	 * 
	 * @param company
	 * @param spareParts
	 * @return
	 */
	Double getStockByCompanyOrSP(String company, String warehouse, String spareParts);

	/**
	 * 根据公司获取备件库存总数
	 * 
	 * @param company
	 * @param spareParts
	 * @param warehouse
	 * @param warehouseType
	 * @return
	 */
	Double getStockByCompanyOrSP(String company, String warehouse, String spareParts, String warehouseType);

	/**
	 * 根据备件和数量自动获取库存批次
	 * 
	 * @param warehouse
	 * @param spareParts
	 * @param num
	 * @return
	 */
	List<StockOutput> autoGetStock(String warehouse, String spareParts, Double num);

	/**
	 * 根据备件和数量,仓库类型自动获取库存批次
	 * 
	 * @param warehouse
	 * @param spareParts
	 * @param num
	 * @return
	 */
	List<StockOutput> autoGetStock(String warehouse, String spareParts, Double num, String warehouseType);

	/**
	 * 根据备件和长度自动获取库存批次
	 * 
	 * @param warehouse
	 * @param spareParts
	 * @param length
	 * @return
	 */
	List<StockOutput> autoGetStockByLen(String warehouse, String spareParts, Double length);

	/**
	 * 根据备件和面积自动获取库存批次
	 * 
	 * @param warehouse
	 * @param spareParts
	 * @param area
	 * @return
	 */
	List<StockOutput> autoGetStockByArea(String warehouse, String spareParts, Double area);

	/**
	 * 根据备件和数量自动获取库存批次
	 * 
	 * @param warehouse
	 * @param spareParts
	 * @param num
	 * @return
	 */
	List<StockOutput> autoGetStock(String warehouse, String warehouseType, String spareParts, Double num);

	/**
	 * 根据备件号list获取库存信息
	 * 
	 * @param sparePartsNos
	 * @return
	 */
	List<StockOutput> getStockBySparePartsNos(List<String> sparePartsNos);

	/**
	 * 根据备件和仓库类型分组
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockOutput> pageListGroup(SearchStockInput input);

	/**
	 * 查询公司下各仓库备件储量
	 * 
	 * @param input
	 * @return
	 */
	PagedList<StockOutput> getStockByCompany(SearchStockNumInput input);

	/**
	 * 库存调拨
	 *
	 * @author lishzh
	 * @param input
	 */
	void stockTransfer(AddStockInput input);

	/**
	 * 库存修改
	 *
	 * @author lishzh
	 * @param input
	 */
	void updateStock(AddStockInput input);

	/**
	 * 根据库存id获取改库存是否是借入件
	 *
	 * @author lishzh
	 */
	boolean isBorrow(List<Integer> ids);

	/**
	 * 查询可切割备件库存
	 * 
	 * @param key
	 * @param company
	 * @param yard
	 * @return
	 */
	Double isIncGetNum(String key, String company, String yard);

	/**
	 * 工具出库获取库存
	 * 根据仓库 仓库类型 备件集合获取库存集合
	 * 
	 * @author lishzh
	 * @param spareParts
	 * @param warehouse
	 * @param warehouseType
	 * @return
	 */
	List<StockOutput> getStock(List<String> spareParts, String warehouse, String warehouseType);
	/**
	 * 
	* @Description: 根据key判断仓库是否被锁 
	* @param key
	* @return boolean
	* @throws 
	 */
	boolean getWarehouseLockStatus(String key);

	/**
	 * 上次入库价格
	 * 
	 * @return
	 */
	BigDecimal getLastEntryPrice(String spareParts, String warehouse);


	/**
	 *根据检索条件获得库存list
	 *
	 * @param input  SearchStockInput
	 * @author lishzh
	 * @return List<StockOutput> or empty list
	 */
	List<StockOutput> getStock(SearchStockInput input);


	/**
	 *机组进场检验获取库存
	 *
	 * @author lishzh
	 */
	WareOutput getStockJZJCJY(String sparesNum, String billType, String yard, String containerUser);

	/**
	 *备件修理压缩机材料出库获取库存
	 *
	 * @author lishzh
	 * @return List<StockOutput> or empty list
	 */
	List<StockOutput> getStockCompressorMaterial(String yard,String warehouseType);



}
