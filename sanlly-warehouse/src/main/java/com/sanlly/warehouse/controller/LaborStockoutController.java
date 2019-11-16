package com.sanlly.warehouse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.AddLaborStockoutInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.EditLaborStockoutIntput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.SearchLaborStockoutInput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.PersonalLaborStockoutOutput;
import com.sanlly.warehouse.service.LaborStockOutService;

import io.swagger.annotations.Api;

/**
 * ClassName: LaborStockoutController
 * Description: 劳保出库信息API
 * date: 2019/9/3 15:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保出库信息API"})
@RestController
public class LaborStockoutController {
	
	@Autowired
    private LaborStockOutService stockoutService;

    /**
     *
     * @param startDate
     * @param no
     * @param receiveDepartment
     * @param sparePartsName
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/laborStockouts/pages")
    public Result<PagedList<LaborStockoutOutput>> stockout(
            @RequestParam(required = false) Date startDate,
            @RequestParam(required = false) Date endDate,
            @RequestParam(required = false)String no,
            @RequestParam(required = false)String receiveDepartment,
            @RequestParam(required = false)Integer receiveUser,
            @RequestParam(required = false)String sparePartsName,
            @RequestParam(required = false)String billType,
            @RequestParam Integer index,
            @RequestParam Integer size){
    	SearchLaborStockoutInput input = new SearchLaborStockoutInput();
        input.setStartDate(startDate);
        input.setEndDate(endDate);
        input.setNo(no);
        input.setBillType(billType);
        input.setReceiveDepartment(receiveDepartment);
        input.setReceiveUser(receiveUser);
        input.setSparePartsName(sparePartsName);
        input.setPageIndex(index);
        input.setPageSize(size);
        return Result.Success(stockoutService.stockoutPageList(input));
    }

    /**
     * 新增出库单,直接出库
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PostMapping("/laborStockouts")
    public Result addStockout(@RequestBody AddLaborStockoutInput input){
        stockoutService.addStockoutPass(input);
        return Result.Success();
    }

    /**
     * 修改出库单
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborStockouts")
    public Result editStockout(@RequestBody EditLaborStockoutIntput input){
        stockoutService.editStockout(input);
        return Result.Success();
    }

    /**
     * 批量审核出库单
     * @param ids
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborStockouts/auditPassStockout")
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
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborStockouts/auditRejectStockout")
    public Result auditRejectStockout(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
        stockoutService.rejectAudit(ids,reasonsRejection);
        return Result.Success();
    }
    
    /**
     * 出库
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborStockouts/out")
    public Result stockout(@RequestBody LaborStockoutOutput input){
        stockoutService.stockout(input);
        return Result.Success();
    }
    
    /**
	 * 根据源单号获取该源单的出库明细
	 */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborStockouts/detail")
    public Result stockout(@RequestParam String no){
        return Result.Success(stockoutService.getStockDetailListByNo(no));
    }

}
