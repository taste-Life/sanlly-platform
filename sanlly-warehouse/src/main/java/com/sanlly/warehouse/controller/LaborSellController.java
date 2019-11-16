package com.sanlly.warehouse.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborSellInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborSellInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.output.laborInsurance.laborSell.LaborSellDetailOutput;
import com.sanlly.warehouse.service.LaborSellService;

import io.swagger.annotations.Api;

/**
 * ClassName: LaborSellController
 * Description: 劳保销售申请单信息API
 * date: 2019/9/3 15:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保销售申请单信息API"})
@RestController
public class LaborSellController {
	@Autowired
	private LaborSellService laborSellService;
	
	/**
     * 劳保销售申请单分页列表查询
     * @param startDate 日期范围   
     * @param applicantDepartment 申请部门
     * @param auditStatus 审核状态
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborSells/pages")
    public Result laborSellPagedList(@RequestParam(required = false) String[] startDate ,@RequestParam(required=false) String applyDepartment,@RequestParam(required=false) String auditStatus, @RequestParam Integer index, @RequestParam Integer size){
		SearchLaborSellInput input = new SearchLaborSellInput(index, size);
		if(startDate!=null && startDate.length>0){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                input.setStartDate(sdf.parse(startDate[0]));
                input.setEndDate(sdf.parse(startDate[1]));
            } catch (ParseException e) {
                new RuntimeException("DateError");
            }
        }
		input.setApplyDepartment(applyDepartment);
		input.setAuditStatus(auditStatus);;
		return Result.Success(laborSellService.getLaborSellPageList(input));
	}
		
	
	/**
     * 添加劳保申请单
     * @param input
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborSells")
	public Result addLaborSell(@RequestBody AddLaborSellInput input){
		laborSellService.addLaborSell(input);
		return Result.Success();
		
	}
	/**
     * 批量审核入库
     * @param ids
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborSells/auditPass")
    public Result auditPass(@RequestParam Integer[] ids){
    	laborSellService.auditPass(ids);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborSells/auditReject")
    public Result auditReject(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
    	laborSellService.auditReject(ids,reasonsRejection);
        return Result.Success();
    }
    /**
     * 销售确认
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborSells/confirm")
    public Result sellConfirm(@RequestParam Integer id){
    	laborSellService.sellConfirm(id);
        return Result.Success();
    }
    /**
     * 销售取消确认
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborSells/cancelConfirm")
    public Result sellCancelConfirm(@RequestParam Integer id){
    	laborSellService.sellCancelConfirm(id);
        return Result.Success();
    }
    /**
     * 根据id 查询
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborSells/{id}")
    public Result getSellById(@PathVariable Integer id){
        return Result.Success(laborSellService.getDetailListById(id));
    }
    
    /**
     * 根据销售单号 查询
     * @param sellNo
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborSells/returnStock/{sellNo}")
    public Result getReturnByNo(@PathVariable String sellNo){
        return Result.Success(laborSellService.getreturnListByNo(sellNo));
    }
    
    /**
     * 获取销售备件列表
     * 
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborSells/spareParts")
    public Result getSparePartsList(@RequestParam String sparePartsNo,@RequestParam String sparePartsName){
    	SearchSparePartsInput input = new SearchSparePartsInput();
    	input.setSparePartsNo(sparePartsNo);
    	input.setSparePartsName(sparePartsName);
    	input.setSparePartsCategories("LKWASPCRGE000007");
    	return Result.Success(laborSellService.getSparePartsList(input));
    }
}
