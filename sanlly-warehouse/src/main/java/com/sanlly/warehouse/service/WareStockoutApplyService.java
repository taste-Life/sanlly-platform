package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.stockoutApply.AddStockoutApplyInput;
import com.sanlly.warehouse.models.input.stockoutApply.SearchStockoutApplyInput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.models.output.stockoutApply.StockoutApplyOutput;

/**
 * ClassName: WareStockoutApplyService
 * Description: 出库申请服务层
 * date: 2019/8/16 13:02
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareStockoutApplyService {

    /**
     * 分页查询出库申请
     * @param input
     * @return
     */
    PagedList<StockoutApplyOutput> stockoutApplyPageList(SearchStockoutApplyInput input);

    /**
     * 新增出库申请
     * @param input
     */
    void addStockoutApply(AddStockoutApplyInput input);

    /**
     * 修改出库申请
     * @param input
     */
    void editStockoutApply(StockoutApplyOutput input);

    /**
     * 批量审核通过出库申请
     * @param ids
     */
    void auditPassStockoutApply(Integer[] ids);

    /**
     * 批量审核通过出库申请 出库
     * @param ids
     */
    void auditPassStockoutApplyOut(Integer[] ids);

    /**
     * 领导批量审核通过出库申请
     * @param ids
     */
    void leadAuditPassStockoutApply(Integer[] ids);

    /**
     * 批量驳回出库申请
     * @param ids
     * @param reasonRejection
     */
    void auditRejectStockoutApply(Integer[] ids,String reasonRejection);

    /**
     * 批量修改出库申请单状态
     * @param ids
     */
    void editStockoutApplyStatus(Integer[] ids);

//    /**
//     * 出库回调
//     * @param input
//     */
//    void applyStockedManage(StockoutOutput input);

    /**
     * 出库申请生成出库单
     * @param input
     */
    void createOut(StockoutApplyOutput input);
}
