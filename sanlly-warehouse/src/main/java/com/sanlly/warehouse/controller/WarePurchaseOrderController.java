package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.entity.WarePurchaseOrder;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryInput;
import com.sanlly.warehouse.models.input.purchaseOrder.AddPurchaseOrderInput;
import com.sanlly.warehouse.models.input.purchaseOrder.SearchPurchaseOrderInput;
import com.sanlly.warehouse.service.WarePurchaseOrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * ClassName: WarePurchaseOrderController
 * Description: 采购订单操作接口
 * date: 2019/8/27 9:27
 *
 * @author wannt
 * @since JDK 1.8
 */
@Api("采购订单操作接口")
@RestController
public class WarePurchaseOrderController {

    @Autowired
    private WarePurchaseOrderService purchaseOrderService;

    /**
     * 分页查询采购订单
     * @param purchaseNo
     * @param no
     * @param intWarehouse
     * @param startDate
     * @param endDate
     * @param isFinish
     * @param stockoutStatus
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/purchaseOrder")
    public Result getPageList(@RequestParam(required = false) String purchaseNo, @RequestParam(required = false) String no, @RequestParam(required = false) String intWarehouse, @RequestParam(required = false) Date startDate, @RequestParam(required = false) Date endDate, @RequestParam(required = false) String isFinish, @RequestParam(required = false) String stockoutStatus,  @RequestParam Integer index, @RequestParam Integer size){
        SearchPurchaseOrderInput input = new SearchPurchaseOrderInput();
        input.setEndDate(endDate);
        input.setStartDate(startDate);
        input.setIntWarehouse(intWarehouse);
        input.setIsFinish(isFinish);
        input.setNo(no);
        input.setPurchaseNo(purchaseNo);
        input.setStockoutStatus(stockoutStatus);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(purchaseOrderService.getPageList(input));
    }

    /**
     * 新增采购订单
     * @param input
     * @return
     */
    @PostMapping("/purchaseOrder")
    public Result add(@RequestBody AddPurchaseOrderInput input){
        purchaseOrderService.add(input);
        return Result.Success();
    }

    /**
     * 根据采购订单新增送货单
     * @param input
     * @return
     */
    @PostMapping("/purchaseOrder/addDelivery")
    public Result addDelivery(@RequestBody AddDeliveryInput input){
        purchaseOrderService.addDelivery(input);
        return Result.Success();
    }

    /**
     * 批量确认
     * @param ids
     * @return
     */
    @PutMapping("/purchaseOrder/statusPass")
    public Result statusPass(@RequestParam Integer[] ids){
        purchaseOrderService.statusPass(ids);
        return Result.Success();
    }

    /**
     * 批量取消确认
     * @param ids
     * @return
     */
    @PutMapping("/purchaseOrder/statusCancel")
    public Result statusCancel(@RequestParam Integer[] ids){
        purchaseOrderService.statusCancel(ids);
        return Result.Success();
    }
}
