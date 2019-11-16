package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborSellInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborSellInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock.LaborReturnStockDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborSell.LaborSellDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborSell.LaborSellOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;

/**
 * ClassName: LaborSellService
 * Description: 销售申请信息管理接口
 * date: 2019/8/14 18:49
 *
 * @author zhh
 * 
 */
public interface LaborSellService {
	/**
     * 劳保销售申请单信息分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborSellOutput> getLaborSellPageList(SearchLaborSellInput input);
	
	/**
     * 添加劳保销售申请单
     * @param input
     * @return
     */
    void addLaborSell(AddLaborSellInput input);
    
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
     * 销售确认
     * @param id
     */
    void sellConfirm(Integer id);
    /**
     * 销售取消确认
     * @param id
     */
    void sellCancelConfirm(Integer id);

    /**
     * 查询劳保销售申请单信息
     * @param input
     * @return
     */
    List<LaborSellDetailOutput> getLaborSellDetailList();
    
    /**
     * 根据申请单id查询明细
     * @param id
     * @return
     */
    LaborSellOutput getDetailListById(Integer id);
    
    /**
     * 根据销售单号查询出库明细
     * @param sellNo
     * @return
     */
    List<LaborReturnStockDetailOutput> getreturnListByNo(String sellNo);
    
    /**
     * 出库回调
     * @param input
     */
    void sellStockedManage(LaborStockoutOutput input);
    
    /**
     * 获取销售备件列表
     * 
     */
    List<LaborSellDetailOutput> getSparePartsList(SearchSparePartsInput input);
}
