package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.shipSale.AddShipSaleInput;
import com.sanlly.warehouse.models.input.shipSale.EditShipSaleInput;
import com.sanlly.warehouse.models.input.shipSale.SearchShipSaleInput;
import com.sanlly.warehouse.service.WareShipSaleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * ClassName: WareShipSaleController
 * Description: 供船操作接口
 * date: 2019/9/17 10:25
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api("供船操作接口")
public class WareShipSaleController {

    @Autowired
    private WareShipSaleService shipSaleService;

    /**
     * 查询分页列表
     * @param billType
     * @param shipSupplyReplaceNo
     * @param no
     * @param replaceCompany
     * @param shipSupplyCompany
     * @param shipSupplyCz
     * @param customer
     * @param billStatus
     * @param startDate
     * @param endDate
     * @param status
     * @param shipName
     * @param auditStatus
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/shipSale")
    public Result pageList(
            @RequestParam(required = false) String billType,
            @RequestParam(required = false) String shipSupplyReplaceNo,
            @RequestParam(required = false) String no,
            @RequestParam(required = false) String replaceCompany ,
            @RequestParam(required = false) String shipSupplyCompany ,
            @RequestParam(required = false) String shipSupplyCz ,
            @RequestParam(required = false) String customer ,
            @RequestParam(required = false) String billStatus ,
            @RequestParam(required = false) String sparePartsNo ,
            @RequestParam(required = false) String spareParts ,
            @RequestParam(required = false) Date startDate ,
            @RequestParam(required = false) Date endDate,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String shipName,
            @RequestParam(required = false) String auditStatus,
            @RequestParam Integer index,
            @RequestParam Integer size
    ){
        SearchShipSaleInput input = new SearchShipSaleInput(index,size);
        input.setBillType(billType);
        input.setShipSupplyReplaceNo(shipSupplyReplaceNo);
        input.setNo(no);
        input.setReplaceCompany(replaceCompany);
        input.setShipSupplyCompany(shipSupplyCompany);
        input.setShipSupplyCz(shipSupplyCz);
        input.setCustomer(customer);
        input.setBillStatus(billStatus);
        input.setStartDate(startDate);
        input.setEndDate(endDate);
        input.setStatus(status);
        input.setSparePartsNo(sparePartsNo);
        input.setSpareParts(spareParts);
        input.setShipName(shipName);
        input.setAuditStatus(auditStatus);
        return Result.Success(shipSaleService.pageList(input));
    }

    /**
     * 新增供船单
     * @param input
     * @return
     */
    @PostMapping("/shipSale")
    public Result add(@RequestBody AddShipSaleInput input){
        shipSaleService.add(input);
        return Result.Success();
    }

    /**
     * 修改供船单
     * @param input
     * @return
     */
    @PutMapping("/shipSale")
    public Result edit(@RequestBody EditShipSaleInput input){
        shipSaleService.edit(input);
        return Result.Success();
    }

    /**
     * 供船出库
     * @param input
     * @return
     */
    @PutMapping("/shipSale/stockout")
    public Result stockout(@RequestBody EditShipSaleInput input){
        shipSaleService.shipSaleStockout(input);
        return Result.Success();
    }

    /**
     * 供船退库
     * @param input
     * @return
     */
    @PutMapping("/shipSale/stockReturn")
    public Result stockReturn(@RequestBody EditShipSaleInput input){
        shipSaleService.shipSaleReturn(input);
        return Result.Success();
    }

    /**
     * 状态确认
     * @param ids
     * @return
     */
    @PutMapping("/shipSale/statusPass")
    public Result statusPass(@RequestParam Integer[] ids){
        shipSaleService.editState(ids);
        return Result.Success();
    }

    /**
     * 汇率确认
     * @param input
     * @return
     */
    @PutMapping("/shipSale/exchangeRate")
    public Result exchangeRate(@RequestBody EditShipSaleInput input){
        shipSaleService.exchangeRate(input);
        return Result.Success();
    }

    /**
     * 取消供船
     * @param ids
     * @return
     */
    @PutMapping("/shipSale/shipSaleCancel")
    public Result shipSaleCancel(@RequestParam Integer[] ids){
        shipSaleService.shipSalecancel(ids);
        return Result.Success();
    }
}
