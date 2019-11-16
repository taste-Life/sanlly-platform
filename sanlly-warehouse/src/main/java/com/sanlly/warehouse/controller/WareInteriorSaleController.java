package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.interiorSale.AddInteriorSaleInput;
import com.sanlly.warehouse.models.input.interiorSale.EditInteriorSaleInput;
import com.sanlly.warehouse.models.input.interiorSale.SearchInteriorSaleInput;
import com.sanlly.warehouse.service.WareInteriorSaleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * ClassName: WareInteriorSaleController
 * Description: 内部销售操作接口
 * date: 2019/8/22 13:42
 *
 * @author wannt
 * @since JDK 1.8
 */
@Api("内部销售操作接口")
@RestController
public class WareInteriorSaleController {

    @Autowired
    private WareInteriorSaleService interiorSaleService;

    /**
     * 分页查询内部销售单
     * @param purchasingOrderNo
     * @param warehouse
     * @param auditStatus
     * @param startDate
     * @param endDate
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/interiorSale")
    public Result getPageList(@RequestParam(required = false) String billType,@RequestParam(required = false) String purchasingOrderNo, @RequestParam(required = false) String warehouse, @RequestParam(required = false) String auditStatus, @RequestParam(required = false) Date startDate, @RequestParam(required = false) Date endDate, @RequestParam Integer index, @RequestParam Integer size){
        SearchInteriorSaleInput input = new SearchInteriorSaleInput();
        input.setPurchasingOrderNo(purchasingOrderNo);
        input.setAuditStatus(auditStatus);
        input.setBillType(billType);
        input.setIntWarehouse(warehouse);
        input.setEndDate(endDate);
        input.setStartDate(startDate);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(interiorSaleService.getPageList(input));
    }

    /**
     * 新增内部销售单
     * @param input
     * @return
     */
    @PostMapping("/interiorSale")
    public Result add(@RequestBody AddInteriorSaleInput input){
        interiorSaleService.add(input);
        return Result.Success();
    }

    /**
     * 审核
     * @param input
     * @return
     */
    @PutMapping("/interiorSale/pass")
    public Result auditPass(@RequestBody EditInteriorSaleInput input){
        interiorSaleService.auditPass(input);
        return Result.Success();
    }

    /**
     * 驳回
     * @param id
     * @param reject
     * @return
     */
    @PutMapping("/interiorSale/reject")
    public Result reject(@RequestParam Integer id, @RequestParam String reject){
        interiorSaleService.auditReject(id,reject);
        return Result.Success();
    }

    /**
     * 批量确认
     * @param ids
     * @return
     */
    @PutMapping("/interiorSale/statusPass")
    public Result statusPass(@RequestParam Integer[] ids){
        interiorSaleService.statusPass(ids);
        return Result.Success();
    }

    /**
     * 批量取消确认
     * @param ids
     * @return
     */
    @PutMapping("/interiorSale/statusCancel")
    public Result statusCancel(@RequestParam Integer[] ids){
        interiorSaleService.statusCancel(ids);
        return Result.Success();
    }

    /**
     * 批量收费
     * @param ids
     * @return
     */
    @PutMapping("/interiorSale/charge")
    public Result charge(@RequestParam Integer[] ids){
        interiorSaleService.charge(ids);
        return Result.Success();
    }
}
