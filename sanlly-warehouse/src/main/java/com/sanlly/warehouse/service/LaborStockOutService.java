package com.sanlly.warehouse.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WareStockoutLabaor;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.AddLaborStockoutInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.EditLaborStockoutIntput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.SearchLaborStockoutInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.stockout.EditStockoutInput;
import com.sanlly.warehouse.models.output.laborInsurance.PersonalReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.PersonalLaborStockoutOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

/**
 * ClassName: LaborStockOutService
 * Description: 劳保出库服务层
 * date: 2019/9/5 13:47
 *
 * @author zhh
 */
public interface LaborStockOutService {
	/**
     * 分页查询劳保出库单
     * @param input
     * @return
     */
    PagedList<LaborStockoutOutput> stockoutPageList(SearchLaborStockoutInput input);

    /**
     * 新增出库单
     * @param input
     */
    Integer addStockout(AddLaborStockoutInput input);

    /**
     * 修改出库单
     * @param input
     */
    void editStockout(EditLaborStockoutIntput input);

    /**
	 * 新增出库单直接出库
	 * @param input
	 */
	void addStockoutPass(AddLaborStockoutInput input);
	
    /**
     * 根据出库id查询出库明细
     * @param wareStockoutLabaorId
     * @return
     */
    List<LaborStockoutDetailOutput> getStockDetailListById(WareStockoutLabaor stockout);
    
    /**
     * 根据出库单号查询出库明细
     * @param wareStockoutLabaorId
     * @return
     */
    List<LaborStockoutDetailOutput> getStockDetailListByStockoutNo(String stockoutNo);
    
    /**
     * 批量审核出库
     * @param ids
     */
    void passAudit(Integer[] ids);

    /**
     * 批量驳回出库
     * @param ids
     * @param reasonsRejection
     */
    void rejectAudit(Integer[] ids ,String reasonsRejection);
    
    /**
     * 出库
     * @param input
     */
    void stockout(LaborStockoutOutput input);
    
    /**
	 * 根据源单号获取该源单的出库明细
	 */
	List<LaborStockoutDetailOutput> getStockDetailListByNo(String sourceNo);

	
	
}
