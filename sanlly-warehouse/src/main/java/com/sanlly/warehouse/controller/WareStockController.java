package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.warehouse.models.input.stock.*;
import com.sanlly.warehouse.service.WareStockService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: WareStockController Description: 库存接口层 date: 2019/7/30 11:40
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(tags = "库存操作接口")
public class WareStockController {

    @Autowired
    private WareStockService wareStockService;

    /**
     * 查询库存列表
     *
     * @param company
     * @param sparePartsCategories
     * @param sparePartsNo
     * @param sparePartsName
     * @param warehouse
     * @param isMoreThanZero
     * @param isIncise
     * @return
     */
    @GetMapping("/stock")
    public Result stockPageList(@RequestParam(required = false) String company,
                                @RequestParam(required = false) String sparePartsCategories,
                                @RequestParam(required = false) String sparePartsNo, @RequestParam(required = false) String sparePartsName,
                                @RequestParam(required = false) String warehouse, @RequestParam(required = false) String warehouseType,
                                @RequestParam(required = false) String escrowCompany,
                                @RequestParam(required = false) Boolean isMoreThanZero, @RequestParam(required = false) String billType,
                                @RequestParam(required = false) String isIncise, @RequestParam Integer index, @RequestParam Integer size) {
        SearchStockInput input = new SearchStockInput();
        input.setCompany(company);
        input.setSparePartsCategories(sparePartsCategories);
        input.setSparePartsName(sparePartsName);
        input.setSparePartsNo(sparePartsNo);
        input.setWarehouse(warehouse);
        input.setWarehouseType(warehouseType);
        input.setMoreThanZero(isMoreThanZero);
        input.setEscrowCompany(escrowCompany);
        input.setIsIncise(isIncise);
        input.setBillType(billType);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(wareStockService.stockPageList(input));
    }

    /**
     * 分组分页查询库存数量
     *
     * @param company
     * @param sparePartsNo
     * @param sparePartsName
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/stock/num")
    public Result stockNumPageList(@RequestParam String company, @RequestParam(required = false) String yard,
                                   @RequestParam(required = false) String sparePartsNo, @RequestParam(required = false) String sparePartsName,
                                   @RequestParam Integer index, @RequestParam Integer size) {
        SearchStockNumInput input = new SearchStockNumInput();
        input.setCompany(company);
        input.setYard(yard);
        input.setSparePartsName(sparePartsName);
        input.setSparePartsNo(sparePartsNo);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(wareStockService.stockNumPageList(input));
    }

    /**
     * 添加库存
     *
     * @param input
     * @return
     */
    @PostMapping("/stock")
    public Result addStock(@RequestBody AddStockInput input) {
        wareStockService.addStock(input);
        return Result.Success();
    }

    /**
     * 修改库存基础信息
     *
     * @param input
     * @return
     */
    @PutMapping("/stock")
    public Result editStock(@RequestBody EditStockInput input) {
        wareStockService.editStock(input);
        return Result.Success();
    }

    /**
     * 修改库存数量
     *
     * @param input
     * @return
     */
    @PutMapping("/stockNum")
    public Result editStockNum(@RequestBody EditStockNumInput input) {
        wareStockService.editStockNum(input);
        return Result.Success();
    }

    /**
     * 根据公司和备件查询库存
     *
     * @param company
     * @param spareParts
     * @return
     */
    @GetMapping("/stock/getStockByCompanyOrSP")
    public Result getStockByCompanyOrSP(@RequestParam String company, @RequestParam String warehouse,
                                        @RequestParam String spareParts) {
        return Result.Success(wareStockService.getStockByCompanyOrSP(company, warehouse, spareParts));
    }

    /**
     * 根据公司和备件查询库存
     *
     * @param company
     * @param spareParts
     * @return
     */
    @GetMapping("/stock/getStockByWarehouseType")
    public Result getStockByCompanyOrSP(@RequestParam String company, @RequestParam String warehouse,
                                        @RequestParam String spareParts, @RequestParam String warehouseType) {
        return Result.Success(wareStockService.getStockByCompanyOrSP(company, warehouse, spareParts, warehouseType));
    }

    /**
     * 根据备件key和批次号查询库存数量
     *
     * @param batch
     * @param sparePartsKey
     * @return
     */
    @GetMapping("/stock/getStockByBatch")
    public Result getStockByBatch(@RequestParam String batch, @RequestParam String sparePartsKey) {
        return Result.Success(wareStockService.getStockByBatch(batch, sparePartsKey).getActualSurplusNum());
    }

    /**
     * 根据多个备件号获取库存
     *
     * @return
     */
    @GetMapping("/stock/getStockBySparePartsNos")
    public Result getStockBySparePartsNos(@RequestParam List<String> sparePartsNos) {
        return Result.Success(wareStockService.getStockBySparePartsNos(sparePartsNos));
    }

    /**
     * 查询公司下各仓库备件储量
     *
     * @param company
     * @param sparePartsNo
     * @param sparePartsName
     * @param sparePartsCategories
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/stock/getNumGropuBySpOrWe")
    public Result getStockByCompany(@RequestParam String company, @RequestParam(required = false) String sparePartsNo,
                                    @RequestParam(required = false) String sparePartsName,
                                    @RequestParam(required = false) String sparePartsCategories, @RequestParam Integer index,
                                    @RequestParam Integer size) {
        SearchStockNumInput input = new SearchStockNumInput();
        input.setCompany(company);
        input.setSparePartsNo(sparePartsNo);
        input.setSparePartsName(sparePartsName);
        input.setSparePartsCategories(sparePartsCategories);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(wareStockService.getStockByCompany(input));
    }

    /**
     * 查询是否借入件
     *
     * @param ids
     * @return
     * @author lishzh
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/stock/isBorrow")
    public Result isBorrow(@RequestParam List<Integer> ids) {
        return Result.Success(wareStockService.isBorrow(ids));
    }

    /**
     * 根据仓库 仓库类型 备件集合获取库存集合
     *
     * @param spareParts
     * @param warehouse
     * @param warehouseType
     * @return
     * @author lishzh
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/stock/toolStock")
    public Result getStock(@RequestParam List<String> spareParts, @RequestParam String warehouse,
                           @RequestParam String warehouseType) {
        return Result.Success(wareStockService.getStock(spareParts, warehouse, warehouseType));
    }

    /**
     * @param spareParts
     * @param warehouse
     * @return Result
     * @Description: 上次入库价格
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/stock/lastEntryPrice")
    public Result getLastEntryPrice(@RequestParam(value = "spareParts", required = true) String spareParts,
                                    @RequestParam(value = "warehouse") String warehouse) {
        return Result.Success(wareStockService.getLastEntryPrice(spareParts, warehouse));
    }

    /**
     * 机组进场检验获取库存
     *
     * @author lishzh
     */
    @GetMapping("/stock/jzjcjy")
    public Result getStockJZJCJY(@RequestParam String sparesNum, @RequestParam String billType,
								 @RequestParam String yard, @RequestParam String containerUser) {
        return Result.Success(wareStockService.getStockJZJCJY(sparesNum, billType, yard, containerUser));
    }

    /**
     *备件修理压缩机材料出库获取库存
     *
     * @author lishzh
     * @return List<StockOutput> or empty list
     */
    @GetMapping("/stock/compressorMaterial")
    public Result getStockCompressorMaterial(@RequestParam String yard,@RequestParam String warehouseType){
        return Result.Success(getStockCompressorMaterial(yard,warehouseType));
    }

}
