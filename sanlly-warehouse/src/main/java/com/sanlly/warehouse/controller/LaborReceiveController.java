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

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceivePageInput;
import com.sanlly.warehouse.service.LaborInsuranceSchemeService;
import com.sanlly.warehouse.service.LaborReceiveService;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.swagger.annotations.Api;

/**
 * ClassName: LaborReceiveController
 * Description: 劳保申请单信息API
 * date: 2019/8/14 15:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保申请单信息API"})
@RestController
public class LaborReceiveController {
	
	@Autowired
	private LaborReceiveService laborReceiveService;
	
	@Autowired
	protected ProductionFeignClient productionService;
	
	@Autowired
	private LaborInsuranceSchemeService schemeService;
	
	/**
     * 劳保申请单分页列表查询
     * @param startDate 日期范围   
     * @param applicantDepartment 申请部门
     * @param applicantType 申请类型
     * @param stockoutStatus 出库状态
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/pages")
    public Result laborReceivePagedList(@RequestParam(required = false) String[] startDate ,@RequestParam(required=false) String applicantDepartment,@RequestParam(required=false) String applicantType,@RequestParam(required=false) String stockoutStatus,@RequestParam(required=false) String sparePartsNo,@RequestParam(required=false) String sparePartsName, @RequestParam Integer index, @RequestParam Integer size){
		SearchLaborReceiveInput input = new SearchLaborReceiveInput(index, size);
		if(startDate!=null && startDate.length>0){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                input.setStartDate(sdf.parse(startDate[0]));
                input.setEndDate(sdf.parse(startDate[1]));
            } catch (ParseException e) {
                new RuntimeException("DateError");
            }
        }
		input.setApplicantDepartment(applicantDepartment);
		input.setSparePartsName(sparePartsName);
		input.setSparePartsNo(sparePartsNo);
		input.setApplicantType(applicantType);
		input.setStockoutStatus(stockoutStatus);
		return Result.Success(laborReceiveService.getLaborReceivePageList(input));
	}
	
	/**
     * 获取全部部门信息
     * 
     */
	@GetMapping("/laborReceives/applicationDepts")
    public Result<List<ProdDeptOutput>> laborReceivePagedList() {
		BaseSearchInput input = new BaseSearchInput();
		return productionService.prodDeptList(input);
		
	}
	
	
	/**
     * 添加劳保申请单
     * @param input
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborReceives")
	public Result addLaborReceive(@RequestBody AddLaborReceiveInput input){
		laborReceiveService.addLaborReceive(input);
		return Result.Success();
		
	}
	/**
     * 批量审核入库
     * @param ids
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborReceives/auditPass")
    public Result auditPass(@RequestParam Integer[] ids){
    	laborReceiveService.auditPass(ids);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/laborReceives/auditReject")
    public Result auditReject(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
    	laborReceiveService.auditReject(ids,reasonsRejection);
        return Result.Success();
    }
    
    /**
     * 查询自动生成劳保申请单信息
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives")
    public Result getLaborReceiveDetailList(){
    	return Result.Success(laborReceiveService.getReceiveDetailList());
    }
    
    /**
     * 查询自动生成劳保申请单信息分页
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/auto/pages")
    public Result getLaborReceiveDetailPagedList(@RequestParam(required=false) String department, @RequestParam Integer user, @RequestParam String sparePartsName,@RequestParam String sparePartsNo, @RequestParam Integer index, @RequestParam Integer size){
    	SearchLaborReceivePageInput input = new SearchLaborReceivePageInput(index, size);
    	input.setDepartment(department);
    	input.setUser(user);
    	input.setSparePartsName(sparePartsName);
    	input.setSparePartsNo(sparePartsNo);
    	return Result.Success(laborReceiveService.getLaborReceiveDetailList(input));
    }
    
    
    /**
     * 根据id查询申请单信息
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/{id}")
    public Result getReceiveById(@PathVariable Integer id){
    	return Result.Success(laborReceiveService.getReceiveById(id));
    }
    
    /**
     * 根据备件及使用人获取备件型号
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/models")
    public Result getModel(@RequestParam Integer userId,@RequestParam String spareParts){
    	return Result.Success(schemeService.getModel(userId, spareParts));
    }
    /**
     * 根据备件及使用人获取备件型号及库存数量
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/totalNum")
    public Result getMAndN(@RequestParam Integer userId,@RequestParam String spareParts){
    	return Result.Success(schemeService.getModelAndNum(userId, spareParts));
    }
    /**
     * 根据id查询个人劳保待出库信息
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/personalStockout/{id}")
    public Result getAdvanceStockoutList(@PathVariable Integer id){
    	return Result.Success(laborReceiveService.getAdvanceStockoutList(id));
    }
    
    /**
     * 根据id查询个人劳保可领取信息
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/personalReceive/{id}")
    public Result getPersonalReceiveList(@PathVariable Integer id){
    	return Result.Success(laborReceiveService.getPersonalReceiveList(id));
    }
    
    /**
     * 根据id查询个人领用信息记录
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/laborReceives/personalReceived/{id}")
    public Result getPersonalReceivedList(@PathVariable Integer id){
    	return Result.Success(laborReceiveService.getPersonalReceivedList(id));
    }

}
