package com.sanlly.warehouse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn.LaborStockInInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn.SearchLaborStockInInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.AddReturnStockInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.SearchLaborReturnWarehouseInput;
import com.sanlly.warehouse.models.input.returnwarehouse.AddReturnWarehouseInput;
import com.sanlly.warehouse.models.input.returnwarehouse.SearchReturnWarehouseInput;
import com.sanlly.warehouse.service.LaborInsuranceStockService;

import io.swagger.annotations.Api;

/**
 * ClassName: LaborReceiveController
 * Description: 劳保库存信息API
 * date: 2019/8/23 10:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保库存信息API"})
@RestController
public class LaborStockController {
	
	@Autowired
	private LaborInsuranceStockService laborInsuranceStockService;
	
	/**
     * 劳保库存分页列表查询
     * @param applicantType 申请类型
     * @param stockoutStatus 出库状态
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStocks/pages")
    public Result laborReceivePagedList(@RequestParam(required = false) String warehouse ,@RequestParam(required=false) String sparePartsNo,@RequestParam(required=false) String sparePartsName,@RequestParam(required=false) String sparePartsCategoriesDetails, @RequestParam Integer index, @RequestParam Integer size){
		SearchLaborInsuranceInput input = new SearchLaborInsuranceInput(index, size);
		input.setWarehouse(warehouse);
		input.setSparePartsNo(sparePartsNo);
		input.setSparePartsName(sparePartsName);
		input.setSparePartsCategoriesDetails(sparePartsCategoriesDetails);
		return Result.Success(laborInsuranceStockService.getLaborInsuranceStockPageList(input));
	}
	/**
     * 获得全部劳保库存信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStockIns")
	public Result getLaborStockList(){
		return Result.Success(laborInsuranceStockService.getLaborStockList());
		
	}
	
	/**
     * 新增劳保入库单
     * @param input
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborStockIns")
	public Result addLaborStockIn(@RequestBody LaborStockInInput input){
		laborInsuranceStockService.addLaborStockIn(input);
		return Result.Success();
	}
	
	/**
     * 劳保入库单信息分页列表查询
     * @param input
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStockIns/pages")
	public Result laborStockinPageList(@RequestParam(required = false) String warehouse ,@RequestParam(required=false) String labaorStockinNo,@RequestParam(required=false) Date stockinDate, @RequestParam(required=false) String supplier,@RequestParam(required=false) String sparePartsNo,@RequestParam(required=false) String sparePartsName,@RequestParam Integer index, @RequestParam Integer size){
		SearchLaborStockInInput input = new SearchLaborStockInInput(index, size);
		input.setLabaorStockinNo(labaorStockinNo);
		input.setStockinDate(stockinDate);
		input.setWarehouse(warehouse);
		input.setSupplier(supplier);
		input.setSparePartsNo(sparePartsNo);
		input.setSparePartsName(sparePartsName);
		return Result.Success(laborInsuranceStockService.laborStockinPageList(input));
		
	}
	
	/**
     * 入库单批量审核通过
     * @param ids
     */
	@SuppressWarnings("rawtypes")
	@PutMapping("/laborStockIns/auditPassStockin")
	public Result auditPassStockin(@RequestParam Integer[] ids){
		laborInsuranceStockService.auditPassStockin(ids);
		return Result.Success();
		
	}
	
	/**
     * 入库单批量驳回
     * @param ids
     * @param reasonsRejection
     */
	@SuppressWarnings("rawtypes")
	@PutMapping("/laborStockIns/auditRejectStockin")
	public Result auditRejectStockin(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
		laborInsuranceStockService.auditRejectStockin(ids, reasonsRejection);
		return Result.Success();
	}
	
	/**
     * 根据备件型号及备件key查询备件库存信息
     * @param skey
     * @param model
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStocks/stock")
	public Result autoGetStock(@RequestParam String skey,@RequestParam String model,@RequestParam Double num){
		return Result.Success(laborInsuranceStockService.autoGetStock(skey, model, num));
	}
	
	/**
	 * 添加退库单
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborStocks/returnStock")
	public Result addLaborReturnStock(@RequestBody AddReturnStockInput input) {
		laborInsuranceStockService.addLaborReturnStock(input);
		return Result.Success();
	}
	
	/**
	 * 添加退库单
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborStocks/returnStocks")
	public Result addLaborReturnStock(@RequestBody List<AddReturnStockInput> inputs) {
		laborInsuranceStockService.addLaborReturnStockList(inputs);
		return Result.Success();
	}

	/**
	 * 获取退库单列表
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStocks/returnStock")
	public Result getLaborReturnStockList(@RequestParam(required = false) String no, @RequestParam Integer index, @RequestParam Integer size) {
		SearchLaborReturnWarehouseInput input = new SearchLaborReturnWarehouseInput(index, size);
		input.setReturnNo(no);
		return Result.Success(laborInsuranceStockService.getLaborReturnStockList(input));
	}
	
	/**
     * 批量审核退库
     * @param ids
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborStocks/auditPass")
    public Result auditPass(@RequestParam Integer[] ids){
    	laborInsuranceStockService.auditPass(ids);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborStocks/auditReject")
    public Result auditReject(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
    	laborInsuranceStockService.auditReject(ids,reasonsRejection);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborStocks/isReturn")
    public Result isReturn(@RequestParam String stockoutNo){
        return Result.Success(laborInsuranceStockService.isReturn(stockoutNo));
    }	
    
    /**
     * 根据备件key及型号获得库存数量
     * @param spareParts
     * @param model
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborStocks/totalNum")
    public Result getStockByKAndM(@RequestParam String spareParts,@RequestParam String model){
        return Result.Success(laborInsuranceStockService.getStockByKAndM(spareParts, model));
    }	
}
