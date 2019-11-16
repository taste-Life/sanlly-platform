package com.sanlly.warehouse.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.wareearlywarning.AddAutoPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddImportWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddManualRequisitionsWareInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.EditPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.EditWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchWareSafeStockInput;
import com.sanlly.warehouse.service.PurchaseRequisitionsService;
import com.sanlly.warehouse.service.SafeStockService;

import io.swagger.annotations.Api;

/**
 * 
* Description: 安全库存设置
* @ClassName: WareEarlyWarningController
* @date 2019年7月25日
*
* @author jlx
 */
@Api(tags = { "库存预警API" })
@RestController
public class WareEarlyWarningController {


	@Autowired
	private SafeStockService wareSafeStockService;
	@Autowired
	private PurchaseRequisitionsService purchaseRequisitionsService;


	/**
	 * 库存预警设置列表
	 * @param wareSafeStockInput
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value="/wareSafeStock")
	public Result getPageListSafeStock(@RequestParam(required=false) String spareParts,@RequestParam(required=false)  String warehouse,@RequestParam Integer index,@RequestParam Integer size){
		SearchWareSafeStockInput input = new SearchWareSafeStockInput(index,size);
		input.setSpareParts(spareParts);
		input.setWareWarehouse(warehouse);
		return Result.Success(wareSafeStockService.getPageListSafeStock(input));
	}
	
	/**
	 * 库存预警设置删除
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping(value="/wareSafeStock")
	public Result deleteSafeStock(@RequestParam Integer[] wareSafeStockIds){	
		wareSafeStockService.deleteSafeStock(wareSafeStockIds);
		return Result.Success();
	}

	/**
	 * 库存预警修改
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping(value="/wareSafeStock")
	public Result editSafeStock(@RequestBody EditWareSafeStockInput input){	
		wareSafeStockService.editSafeStock(input);
		return Result.Success();
	}
	/**
	 * 添加安全库存
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping(value="/wareSafeStock")
	public Result addSafeStock(@RequestBody AddWareSafeStockInput input) {
		wareSafeStockService.addSafeStock(input);
		return Result.Success();		
	}
	/**
	 * 批量导入安全库存
	 * @param input
	 * @return
	 */
//	@SuppressWarnings("rawtypes")
//	@PostMapping(value="/wareSafeStock/import")
//	public Result importSafeStock() {
//		return Result.Success();		
//	}

	/**
	 * 采购需求列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value="/purchaseRequisitions")
	public Result getPageListPurchaseRequisitions(@RequestParam(required=false) String spareParts,@RequestParam(required=false)  String warehouse,
			@RequestParam(required=false)  String purchaseRequisitionsNo,@RequestParam(required=false)  String auditStatus,
			@RequestParam(required=false)  String sparePartsCategories,@RequestParam(required=false)  String sparePartsName,
			@RequestParam Integer index,@RequestParam Integer size){	
		
		try {
			SearchPurchaseRequisitionsInput input = new SearchPurchaseRequisitionsInput(index,size);
			input.setSpareParts(spareParts);
			input.setWarehouse(warehouse);
			input.setPurchaseRequisitionsNo(purchaseRequisitionsNo);
			input.setAuditStatus(auditStatus);
			input.setSparePartsCategories(sparePartsCategories);
			input.setSparePartsName(sparePartsName);
			return Result.Success(purchaseRequisitionsService.getPageListPurchaseRequisitions(input));
		} catch (ParseException e) {
			e.printStackTrace();
			return Result.Error(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getMessage());
		}
	}
//	/**
//	 * 手动添加采购需求
//	 * @param input
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	@PostMapping(value="/purchaseRequisitions")
//	public Result addManualPurchaseRequisitions(@RequestBody AddManualPurchaseRequisitionsInput input){	
//		try {
//			purchaseRequisitionsService.addManualPurchaseRequisitions(input);
//			return Result.Success();
//		} catch (ParseException e) {
//			e.printStackTrace();
//			return Result.Error(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getMessage());
//		}
//	}

	/**
	 * 手动添加采购需求
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping(value="/purchaseRequisitions")
	public Result addManualWareRequisitions(@RequestBody AddManualRequisitionsWareInput input){	
		try {
			purchaseRequisitionsService.addManualWareRequisitions(input);
			return Result.Success();
		} catch (Exception e) {
			e.printStackTrace();
			return Result.Error(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getMessage());
		}
	}
	
	/**
	 * 自动添加采购需求
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping(value="/purchaseRequisitions/auto")
	public Result addAutoPurchaseRequisitions(@RequestBody AddAutoPurchaseRequisitionsInput input){	
		purchaseRequisitionsService.addAutoPurchaseRequisitions(input);
		return Result.Success();
	}
	/**
	 * 编辑采购需求
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping(value="/purchaseRequisitions")
	public Result editPurchaseRequisitions(@RequestBody EditPurchaseRequisitionsInput input) {
		try {
			purchaseRequisitionsService.editPurchaseRequisitions(input);
			return Result.Success();
		} catch (ParseException e) {
			e.printStackTrace();
			return Result.Error(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getMessage());
		}
	}
	
	/**
	 * 删除采购需求
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping(value="/purchaseRequisitions")
	public Result deletePurchaseRequisitions(@RequestParam Integer[] warePurchaseRequisitionsId){	
		purchaseRequisitionsService.deletePurchaseRequisitions(warePurchaseRequisitionsId);
		return Result.Success();
	}
	/**
	 * 需求确认
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping(value="/purchaseRequisitions/audit")
	public Result AuditPurchaseRequisitions(@RequestParam Integer[] warePurchaseRequisitionsId,@RequestParam String auditStatus,@RequestParam(required=false) String reject){	
		if (purchaseRequisitionsService.AuditPurchaseRequisitions(warePurchaseRequisitionsId, auditStatus, reject)) {
			return Result.Success();
		} else {

			return Result.Error(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getMessage());
		}
	}
    @PostMapping("/importSafeStock")
    public Result importSafeStock(@RequestBody List<AddImportWareSafeStockInput> inputs) {
    	wareSafeStockService.importSafeStock(inputs);
        return Result.Success();
    }
}
