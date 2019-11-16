package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryInput;
import com.sanlly.warehouse.models.input.delivery.SearchDeliveryInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.output.delivery.DeliveryOutput;
import com.sanlly.warehouse.service.WareDeliveryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * ClassName: WareDeliveryController
 * Description: 送货单表操作接口
 * date: 2019/9/2 10:34
 *
 * @author wannt
 * @since JDK 1.8
 */
@Api("送货单表操作接口")
@RestController
public class WareDeliveryController {

    @Autowired
    private WareDeliveryService deliveryService;


    @GetMapping("/delivery")
    public Result pageList(@RequestParam(required = false) String company,
                           @RequestParam(required = false) String deliverySlipNo,
                           @RequestParam(required = false) String deliveryStatus,
                           @RequestParam(required = false) String spareParts,
                           @RequestParam(required = false) String sparePartsNo,
                           @RequestParam(required = false) Date startDate,
                           @RequestParam(required = false) Date endDate,
                           @RequestParam(required = false) String logisticsNum,
                           @RequestParam(required = false) String purchaseNo,
                           @RequestParam(required = false) String no,
                           @RequestParam Integer index,
                           @RequestParam Integer size){
        SearchDeliveryInput input = new SearchDeliveryInput();
        input.setCompany(company);
        input.setDeliverySlipNo(deliverySlipNo);
        input.setDeliveryStatus(deliveryStatus);
        input.setEndDate(endDate);
        input.setStartDate(startDate);
        input.setLogisticsNum(logisticsNum);
        input.setNo(no);
        input.setSpareParts(spareParts);
        input.setSparePartsNo(sparePartsNo);
        input.setPurchaseNo(purchaseNo);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(deliveryService.pageList(input));
    }

    /**
     * 新增送货单
     * @param input
     * @return
     */
    @PostMapping("/delivery")
    public Result addDelivery(@RequestBody AddDeliveryInput input){
        deliveryService.addDelivery(input);
        return Result.Success();
    }

    /**
     * 根据送货单批量新增出库单
     * @param ids
     * @return
     */
    @PutMapping("/delivery/addStockout")
    public Result addStockout(@RequestParam Integer[] ids){
        deliveryService.addStockout(ids);
        return Result.Success();
    }

    /**
     * 根据送货单新增入库单
     * @return
     */
    @PutMapping("/delivery/addStockin")
    public Result addStockin(@RequestBody AddStockinInput input){
        deliveryService.addStockin(input);
        return Result.Success();
    }

    /**
     * 批量确认
     * @param ids
     * @return
     */
    @PutMapping("/delivery/statusPass")
    public Result statusPass(@RequestParam Integer[] ids){
        deliveryService.statusPass(ids);
        return Result.Success();
    }

    /**
     * 批量取消确认
     * @param ids
     * @return
     */
    @PutMapping("/delivery/statusCancel")
    public Result statusCancel(@RequestParam Integer[] ids){
        deliveryService.statusCancel(ids);
        return Result.Success();
    }
}
