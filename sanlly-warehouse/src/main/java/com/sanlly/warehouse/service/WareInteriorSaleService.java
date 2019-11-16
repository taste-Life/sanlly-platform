package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.interiorSale.AddInteriorSaleInput;
import com.sanlly.warehouse.models.input.interiorSale.EditInteriorSaleInput;
import com.sanlly.warehouse.models.input.interiorSale.SearchInteriorSaleInput;
import com.sanlly.warehouse.models.output.interiorSale.InteriorSaleOutput;

/**
 * ClassName: WareInteriorSaleService
 * Description: 内部销售服务层
 * date: 2019/8/22 13:48
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareInteriorSaleService {

    /**
     * 查询内部采购单分页列表
     * @param input
     * @return
     */
    PagedList<InteriorSaleOutput> getPageList(SearchInteriorSaleInput input);

    /**
     * 新增内部采购单
     * @param input
     */
    void add (AddInteriorSaleInput input);

    /**
     * 审核通过
     * @param interiorSaleInput
     */
    void auditPass(EditInteriorSaleInput interiorSaleInput);

    /**
     * 审核驳回
     * @param id
     * @param reject
     */
    void auditReject(Integer id,String reject);

    /**
     * 批量确认状态
     * @param ids
     */
    void statusPass(Integer[] ids);

    /**
     * 批量确认状态
     * @param ids
     */
    void statusCancel(Integer[] ids);

    /**
     * 批量确认状态
     * @param ids
     */
    void charge(Integer[] ids);

}
