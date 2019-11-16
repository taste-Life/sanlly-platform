package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.returnSlip.AddReturnSlipInput;
import com.sanlly.warehouse.models.input.returnSlip.SearchReturnSlipInput;
import com.sanlly.warehouse.models.output.returnSlip.ReturnSlipOutput;

/**
 * ClassName: WareReturnSlipService
 * Description: 退货单服务层
 * date: 2019/9/16 10:00
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareReturnSlipService {

    // 获取退货单分页列表
    PagedList<ReturnSlipOutput> pageList(SearchReturnSlipInput input);

    // 新增退货单
    void add(AddReturnSlipInput input);

    // 新增退货单
    void edit(ReturnSlipOutput input);

    // 批量审核退货单
    void auditPass(Integer[] ids);

    // 批量删除退货单
    void slipDel(Integer[] ids);

    // 批量驳回退货单
    void auditReject(Integer[] ids,String str);

    // 批量出库退货单
    void stockout(Integer[] ids);

}
