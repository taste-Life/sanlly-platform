package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WareReturnSlip;
import com.sanlly.warehouse.models.input.returnSlip.AddReturnSlipInput;
import com.sanlly.warehouse.models.input.returnSlip.SearchReturnSlipInput;
import com.sanlly.warehouse.models.output.returnSlip.ReturnSlipOutput;
import com.sanlly.warehouse.service.WareReturnSlipService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * ClassName: WareReturnSlipController
 * Description: 退货单操作接口
 * date: 2019/9/16 9:43
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api("退货单操作接口")
public class WareReturnSlipController {

    @Autowired
    private WareReturnSlipService returnSlipService;

    /**
     * 分页查询退货单
     * @param startDate
     * @param endDate
     * @param sourceId
     * @param company
     * @param returnBillNo
     * @param supplier
     * @param auditStatus
     * @param returnStatus
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/returnSlip")
    public Result<PagedList<ReturnSlipOutput>> pageList(
            @RequestParam(required = false) Date startDate,
            @RequestParam(required = false) Date endDate,
            @RequestParam(required = false)String sourceId,
            @RequestParam(required = false)String company,
            @RequestParam(required = false)String returnBillNo,
            @RequestParam(required = false)String supplier,
            @RequestParam(required = false)String auditStatus,
            @RequestParam(required = false)String returnStatus,
            @RequestParam Integer index,
            @RequestParam Integer size
    ){
        SearchReturnSlipInput input = new SearchReturnSlipInput(index,size);
        input.setSourceId(sourceId);
        input.setCompany(company);
        input.setReturnBillNo(returnBillNo);
        input.setSupplier(supplier);
        input.setAuditStatus(auditStatus);
        input.setReturnStatus(returnStatus);
        input.setStartDate(startDate);
        input.setEndDate(endDate);
        return Result.Success(returnSlipService.pageList(input));
    }

    /**
     * 新增退货单
     * @param input
     * @return
     */
    @PostMapping("/returnSlip")
    public Result add(@RequestBody AddReturnSlipInput input){
        returnSlipService.add(input);
        return Result.Success();
    }

    /**
     * 修改退货单
     * @param input
     * @return
     */
    @PutMapping("/returnSlip")
    public Result edit(@RequestBody ReturnSlipOutput input){
        returnSlipService.edit(input);
        return Result.Success();
    }

    /**
     * 根据ID批量出库
     * @param ids
     * @return
     */
    @PutMapping("/returnSlip/out")
    public Result out(@RequestParam Integer[] ids){
        returnSlipService.stockout(ids);
        return Result.Success();
    }

    /**
     * 根据ID批量删除退货单
     * @param ids
     * @return
     */
    @PutMapping("/returnSlip/slipDel")
    public Result slipDel(@RequestParam Integer[] ids){
        returnSlipService.slipDel(ids);
        return Result.Success();
    }

    /**
     * 根据ID批量审核通过
     * @param ids
     * @return
     */
    @PutMapping("/returnSlip/pass")
    public Result audit(@RequestParam Integer[] ids){
        returnSlipService.auditPass(ids);
        return Result.Success();
    }

    /**
     * 根据ID批量审核驳回
     * @param ids
     * @return
     */
    @PutMapping("/returnSlip/reject")
    public Result reject(@RequestParam Integer[] ids,@RequestParam String str){
        returnSlipService.auditReject(ids,str);
        return Result.Success();
    }


}
