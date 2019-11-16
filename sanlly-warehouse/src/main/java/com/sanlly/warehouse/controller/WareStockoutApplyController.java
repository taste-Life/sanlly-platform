package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.stockoutApply.AddStockoutApplyInput;
import com.sanlly.warehouse.models.input.stockoutApply.SearchStockoutApplyInput;
import com.sanlly.warehouse.models.output.stockoutApply.StockoutApplyOutput;
import com.sanlly.warehouse.service.WareStockoutApplyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: WareStockoutApplyController
 * Description:出库申请操作接口
 * date: 2019/8/16 13:01
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api("出库申请操作接口")
public class WareStockoutApplyController {

    @Autowired
    private WareStockoutApplyService stockoutApplyService;

    /**
     * 获取出库申请分页列表
     * @param stockoutApplyNo
     * @param receiveDepartment
     * @param startDate
     * @param warehouse
     * @param billType
     * @param auditStatus
     * @param no
     * @param sparePartsName
     * @param sparePartsNo
     * @param warehouseType
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/stockoutApply")
    public Result stockinPageList(@RequestParam(required = false) String stockoutApplyNo, @RequestParam(required = false) String receiveDepartment, @RequestParam(required = false) Integer receiveUser,@RequestParam(required = false) Date startDate,@RequestParam(required = false) Date endDate, @RequestParam(required = false) String warehouse, @RequestParam(required = false) String billType, @RequestParam(required = false) String auditStatus, @RequestParam(required = false) String no, @RequestParam(required = false) String sparePartsName, @RequestParam(required = false) String sparePartsNo, @RequestParam(required = false) String warehouseType,@RequestParam(required = false)String containerNo, @RequestParam Integer index, @RequestParam Integer size) {
        SearchStockoutApplyInput input = new SearchStockoutApplyInput();
        input.setAuditStatus(auditStatus);
        input.setBillType(billType);
        input.setEndDate(endDate);
        input.setStartDate(startDate);
        input.setNo(no);
        input.setReceiveDepartment(receiveDepartment);
        input.setReceiveUser(receiveUser);
        input.setWarehouse(warehouse);
        input.setWarehouseType(warehouseType);
        input.setSparePartsName(sparePartsName);
        input.setSparePartsNo(sparePartsNo);
        input.setStockoutApplyNo(stockoutApplyNo);
        input.setContainerNo(containerNo);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(stockoutApplyService.stockoutApplyPageList(input));
    }

    /**
     * 新增出库申请
     * @param input
     * @return
     */
    @PostMapping("/stockoutApply")
    public Result addStockoutApply(@RequestBody AddStockoutApplyInput input){
        stockoutApplyService.addStockoutApply(input);
        return Result.Success();
    }

    /**
     * 修改出库申请
     * @param input
     * @return
     */
    @PutMapping("/stockoutApply")
    public Result editStockoutApply(@RequestBody StockoutApplyOutput input){
        stockoutApplyService.editStockoutApply(input);
        return Result.Success();
    }

    /**
     * 批量审核申请出库单 并出库
     * @param ids
     * @return
     */
    @PutMapping("/stockoutApply/passOut")
    public Result passOut(@RequestParam Integer[] ids){
        System.out.println(ids);
        stockoutApplyService.auditPassStockoutApplyOut(ids);
        return Result.Success();
    }

    /**
     * 批量审核申请出库单
     * @param ids
     * @return
     */
    @PutMapping("/stockoutApply/pass")
    public Result pass(@RequestParam Integer[] ids){
        System.out.println(ids);
        stockoutApplyService.auditPassStockoutApply(ids);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @PutMapping("/stockoutApply/reject")
    public Result reject(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
        stockoutApplyService.auditRejectStockoutApply(ids,reasonsRejection);
        return Result.Success();
    }

    /**
     * 领导批量审核申请出库单
     * @param ids
     * @return
     */
    @PutMapping("/stockoutApply/leadPass")
    public Result leadPass(@RequestParam Integer[] ids){
        stockoutApplyService.leadAuditPassStockoutApply(ids);
        return Result.Success();
    }

    /**
     * 批量修改状态
     * @param ids
     * @return
     */
    @PutMapping("/stockoutApply/statusPass")
    public Result statusPass(@RequestParam Integer[] ids){
        stockoutApplyService.editStockoutApplyStatus(ids);
        return Result.Success();
    }

    /**
     * 出库申请生成出库单
     * @param input
     * @return
     */
    @PostMapping("/stockoutApply/createOut")
    public Result createOut(@RequestBody StockoutApplyOutput input){
        stockoutApplyService.createOut(input);
        return Result.Success();
    }
}