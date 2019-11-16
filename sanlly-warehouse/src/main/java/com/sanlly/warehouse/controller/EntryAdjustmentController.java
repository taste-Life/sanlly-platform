package com.sanlly.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.entryadjustment.AddEntryAdjustmentInput;
import com.sanlly.warehouse.models.input.entryadjustment.SearchEntryAdjustmentInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddWareSafeStockInput;
import com.sanlly.warehouse.service.EntryAdjustmentService;

import io.swagger.annotations.Api;

/**
 * 
* @Package com.sanlly.warehouse.controller 
* @Description: 入库单调账 
* @author jlx   
* @date 2019年9月2日 上午9:59:16 
* @version V1.0   
 */
@RestController
@Api(value="入库单调账controller",tags={"入库单调账操作接口"})
public class EntryAdjustmentController {

    @Autowired
    private EntryAdjustmentService entryAdjustmentService;
    @SuppressWarnings("rawtypes")
   	@GetMapping("/entryAdjustment")
    public Result entryAdjustmentPageList(@RequestParam(required = false) String entryAdjustmentNo , @RequestParam(required = false) String stockinNo ,@RequestParam(required = false) String auditStatus, @RequestParam Integer index, @RequestParam Integer size){
    	SearchEntryAdjustmentInput input = new SearchEntryAdjustmentInput(index,size);
    	input.setAuditStatus(auditStatus);
    	input.setEntryAdjustmentNo(entryAdjustmentNo);
    	input.setStockinNo(stockinNo);
        return Result.Success(entryAdjustmentService.entryAdjustmentPageList(input));
    
    }
    /**
     * 
    * @Description: 添加调账 
    * @param input
    * @return Result
    * @throws 
     */
    @SuppressWarnings("rawtypes")
	@PostMapping(value="/entryAdjustment")
	public Result addEntryAdjustment(@RequestBody AddEntryAdjustmentInput input) {
    	entryAdjustmentService.addEntryAdjustment(input);
		return Result.Success();		
	}
    /**
     * 
    * @Description: 添加调账 
    * @param input
    * @return Result
    * @throws 
     */
    @SuppressWarnings("rawtypes")
	@PutMapping(value="/entryAdjustment")
	public Result addEntryAdjustment(@RequestParam(required = false)  Integer wareEntryAdjustmentId) {
    	entryAdjustmentService.auditEntryAdjustment(wareEntryAdjustmentId);
		return Result.Success();		
	}
}
