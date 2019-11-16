package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.warehouse.entity.WareLaborStock;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn.LaborStockInInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn.SearchLaborStockInInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.AddReturnStockInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.SearchLaborReturnWarehouseInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.AddLaborStockoutDetailInput;
import com.sanlly.warehouse.models.input.returnwarehouse.AddReturnWarehouseInput;
import com.sanlly.warehouse.models.input.returnwarehouse.SearchReturnWarehouseInput;
import com.sanlly.warehouse.models.input.stock.EditStockNumInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn.LaborStockInOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn.LaborStockOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock.LaborReturnStockDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock.LaborReturnStockOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutDetailOutput;
import com.sanlly.warehouse.models.output.returnwarehouse.ReturnWarehouseOutput;

/**
 * ClassName: LaborInsuranceStockService
 * Description: 劳保库存信息管理接口
 * date: 2019/8/13 10:38
 *
 * @author zhh
 * 
 */
public interface LaborInsuranceStockService {

	/**
     * 劳保库存信息分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborStockOutput> getLaborInsuranceStockPageList(SearchLaborInsuranceInput input);
	
	/**
     * 获得全部劳保库存信息
     * @param input
     * @return
     */
	List<LaborStockOutput> getLaborStockList();
	
	/**
     * 新增劳保入库
     * @param input
     * @return
     */
	void addLaborStockIn(LaborStockInInput input);
	
	/**
     * 劳保入库单信息分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborStockInOutput> laborStockinPageList(SearchLaborStockInInput input);
	
	/**
     * 修改库存
     * @param stockDetail
     */
	void setStock(LaborStockoutDetailOutput stockDetail);
	
	/**
     * 修改库存
     * @param detailInput
     */
	void setStock(AddLaborStockoutDetailInput detailInput);
	
	/**
     * 入库单批量审核通过
     * @param ids
     */
	void auditPassStockin(Integer[] ids);
	
	/**
     * 入库单批量驳回
     * @param ids
     * @param reasonsRejection
     */
	void auditRejectStockin(Integer[] ids, String reasonsRejection);
	
	/**
     * 批量入库
     * @param ids
     */
    void laborStockin(Integer[] ids);
    
    
    
    /**
     * 根据备件key以及仓库key获取库存数量
     * @param spKey
     * @return
     */
    Double getStockNum(String spareParts,String warehouse);
    
    /**
     * 根据备件批次号和备件key获取库存信息
     * @param Batch
     * @param sparePartsKey
     * @return
     */
    LaborStockOutput getStockByBatch(String Batch,String sparePartsKey);
    
    /**
     * 根据备件型号和备件key获取库存信息
     * @param skey
     * @param model
     * @return
     */
    LaborStockOutput getStockByKAndM(String skey,String model);
    
    /**
     * 根据备件key,型号获取库存数量
     * @param spKey
     * @return
     */
    Double getStockNumByKAndM(String spKey,String model);
    
    /**
     * 根据公司,仓库,查询备件库存总数
     * @param company
     * @param warehouse
     * @param spareParts
     * @return
     */
    Double getStockByCompanyOrSP(String company,String warehouse ,String spareParts);
    
    /**
	 * 根据备件和数量自动获取库存批次
	 * @param warehouse
	 * @param spareParts
	 * @param num
	 * @return
	 */
	List<LaborStockOutput> autoGetStock(String spareParts,String model,Double num);
    
    /**
     * 添加退库单
     * @param input
     * @return
     */
    void addLaborReturnStock(AddReturnStockInput input);
    
    void addLaborReturnStockList(List<AddReturnStockInput> inputs);
    
    /**
	 * 获取退库单列表
	 * @param input
	 * @return
	 */
	PagedList<LaborReturnStockOutput> getLaborReturnStockList(SearchLaborReturnWarehouseInput input);

	/**
     * 批量审核通过
     * @param ids
     */
    void auditPass(Integer[] ids);

    /**
     * 批量审核驳回
     * @param ids
     */
    void auditReject(Integer[] ids,String reasonsRejection);
    
    /**
     * 退库修改库存
     * @param stockDetail
     */
    void setStockByReturn(LaborReturnStockDetailOutput returnDetail);
    /**
     * 根据出库单获取退库数量
     * @param stockoutNo
     */
    Double getReturnedNum(String stockoutNo,String sparePartsBatch);
    
    /**
     * 根据原单号获取已退库数量
     * @param no
     */
	Double getReturnedNumByNo(String no,String sparePartsBatch);
	
	/**
     * 根据出库单号,出库明细ID获取已退库数量
     * @param stockoutNo
     * @param detailId
     */
	Double getReturnedNumById(String stockoutNo,Integer detailId);
	
	/**
     * 根据出库单号,查看是否存在未审核的退库单
     * @param stockoutNo
     * 
     */
	boolean isReturn(String stockoutNo);
}
