package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.fixOut.PickingListDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.stockout.EditStockoutInput;
import com.sanlly.warehouse.models.input.stockout.SearchStockoutInput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.service.WareStockoutService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: WareStockoutController
 * Description: 出库操作接口
 * date: 2019/8/6 19:33
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api("出库操作接口")
public class WareStockoutController {

    @Autowired
    private WareStockoutService stockoutService;

    /**
     *
     * @param startDate
     * @param warehouseType
     * @param warehouse
     * @param billType
     * @param stockoutNo
     * @param advanceWarehouseReceipt
     * @param no
     * @param receiveDepartment
     * @param sparePartsNo
     * @param sparePartsName
     * @param containerNo
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/stockout")
    public Result<PagedList<StockoutOutput>> stockout(
            @RequestParam(required = false) Date startDate,
            @RequestParam(required = false) Date endDate,
            @RequestParam(required = false)String warehouseType,
            @RequestParam(required = false)String isReturn,
            @RequestParam(required = false)String warehouse,
            @RequestParam(required = false)String billType,
            @RequestParam(required = false)String stockoutNo,
            @RequestParam(required = false)String advanceWarehouseReceipt,
            @RequestParam(required = false)String no,
            @RequestParam(required = false)String receiveDepartment,
            @RequestParam(required = false)String sparePartsNo,
            @RequestParam(required = false)String isLike,
            @RequestParam(required = false)String sparePartsName,
            @RequestParam(required = false)String containerNo,
            @RequestParam Integer index,
            @RequestParam Integer size){
        SearchStockoutInput input = new SearchStockoutInput();
        input.setStartDate(startDate);
        input.setEndDate(endDate);
        input.setWarehouse(warehouse);
        input.setBillType(billType);
        input.setIsReturn(isReturn);
        input.setIsLike(isLike);
        input.setStockoutNo(stockoutNo);
        input.setAdvanceWarehouseReceipt(advanceWarehouseReceipt);
        input.setNo(no);
        input.setReceiveDepartment(receiveDepartment);
        input.setSparePartsNo(sparePartsNo);
        input.setSparePartsName(sparePartsName);
        input.setContainerNo(containerNo);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(stockoutService.stockoutPageList(input));
    }

    /**
     * 新增出库单
     * @param input
     * @return
     */
    @PostMapping("/stockout")
    public Result addStockout(@RequestBody AddStockoutInput input){
        System.out.println(input);
        stockoutService.addStockout(input);
        return Result.Success();
    }

    /**
     * 根据预出库单新增出库单
     * @param input
     * @return
     */
    @PostMapping("/addStockout")
    public Result addStockoutForRefe(@RequestBody AddStockoutInput input){
        System.out.println(input);
        stockoutService.addStockout(input);
        return Result.Success();
    }

    /**
     * 修改出库单
     * @param input
     * @return
     */
    @PutMapping("/stockout")
    public Result editStockout(@RequestBody EditStockoutInput input){
        stockoutService.editStockout(input);
        return Result.Success();
    }

    /**
     * 批量审核出库单
     * @param ids
     * @return
     */
    @PutMapping("/stockout/auditPassStockout")
    public Result auditPassStockout(@RequestParam Integer[] ids){
        stockoutService.passAudit(ids);
        return Result.Success();
    }


    /**
     * 批量驳回出库单
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @PutMapping("/stockout/auditRejectStockout")
    public Result auditRejectStockout(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
        stockoutService.rejectAudit(ids,reasonsRejection);
        return Result.Success();
    }


    /**
     *  app 获取出库单列表(领料单)
     * @param stockoutNo
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/stockouts")
    public Result getListApp(@RequestParam(required = false)String stockoutNo, @RequestParam Integer index, @RequestParam Integer size){
        SearchStockoutInput input = new SearchStockoutInput();
        input.setPageSize(size);
        input.setPageIndex(index);
        input.setStockoutNo(stockoutNo);
        return Result.Success(stockoutService.getAppList(input));
    }

    /**
     * app 获取出库单详细列表(领料单)
     * @param stockoutId
     * @return
     */
    @GetMapping("/stockoutDetails")
    public Result getDetailListApp(@RequestParam String stockoutId){
        return Result.Success(stockoutService.getDetailListApp(stockoutId));
    }

    /**
     * app 出库
     * @param stockoutId
     * @param detailId
     * @return
     */
    @PutMapping("/subStockout")
    public Result stockOutApp(@RequestParam String stockoutId,@RequestParam List<String> detailId){
        stockoutService.stockOutApp(stockoutId,detailId);
        return Result.Success();
    }

    /**
     * app 根据ID查询已出库详情
     * @param stockoutId
     * @return
     */
    @GetMapping("/stockoutDetailsConfirm")
    public Result stockoutDetailsConfirm(@RequestParam String stockoutId){
        return Result.Success(stockoutService.stockoutDetailsConfirm(stockoutId));
    }

    /**
     * app 出库确认
     * @param stockoutId
     * @return
     */
    @PutMapping("/stockoutConfirm")
    public Result stockoutConfirm(@RequestParam String stockoutId,@RequestParam String userId){
        stockoutService.stockoutConfirm(stockoutId,userId);
        return Result.Success();
    }

    /**
     * 出库
     * @param input
     * @return
     */
    @PutMapping("/stockout/out")
    public Result stockout(@RequestBody StockoutOutput input){
        stockoutService.stockout(input);
        return Result.Success();
    }

    /**
     * 根据原单号获取出库单列表
     * @param no
     * @return
     */
    @GetMapping("/stockout/getOrderByNo")
    public Result getOrderByNo(@RequestParam String no){
        return Result.Success(stockoutService.getOrderByNo(no));
    }

    /**
     * 生产领料出库
     * @param input
     * @return
     */
    @PutMapping("/stockout/prodOut")
    public Result prodOut(@RequestBody PickingListDetailOutput input){
        stockoutService.prodOut(input);
        return Result.Success();
    }

    /**
     * 根据领料单号批量出库
     * @param nos
     * @return
     */
    @GetMapping("/stockout/prodOutOfNos")
    public Result prodOutOfNos(@RequestParam String[] nos){
        stockoutService.prodOutOfNos(nos);
        return Result.Success();
    }

    /**
     * 生产领料退库
     * @param input
     * @return
     */
    @PutMapping("/stockout/prodReturn")
    public Result prodReturn(@RequestBody List<StockoutOutput> input){
        stockoutService.prodReturn(input);
        return Result.Success();
    }

    /**
     * 根据原单号查询出库单
     * @param no
     * @return
     */
    @GetMapping("/stockout/byNo")
    public Result byNo(@RequestParam String no){
        return Result.Success(stockoutService.byNo(no));
    }

    /**
     * 根据领料单号箱号获取出库总价
     * @param referralNo
     * @param containerNo
     * @return
     */
    @GetMapping("/stockout/getTotalAmount")
    public Result<BigDecimal> getTotalAmount(@RequestParam(value = "referralNo") String referralNo,@RequestParam(value = "containerNo") String containerNo){
        return Result.Success(stockoutService.getTotalAmount(referralNo,containerNo));
    }

    /**
     * 领料单号
     * @param referralNo
     * @return
     */
    @GetMapping("/fixs/pickinglist/detail")
    public Result getPicking(@RequestParam(value = "referralNo") String referralNo){
        return Result.Success(stockoutService.getPicking(referralNo));
    }
}
