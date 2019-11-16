package com.sanlly.warehouse.controller;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.AddLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.EditLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.SearchLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.LaborStaffInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.SearchUserInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborStaff.userSchemeOutput;
import com.sanlly.warehouse.service.LaborInsuranceSchemeService;

import io.swagger.annotations.Api;

/**
 * ClassName: LaborInsuranceController
 * Description: 劳保方案信息API
 * date: 2019/8/05 15:24
 *
 * @author zhh
 * 
 */
@Api(tags= {"劳保方案信息API"})
@RestController
public class LaborInsuranceSchemeController {

	@Autowired
	private LaborInsuranceSchemeService laborInsuranceSchemeService;
	
	/**
     * 劳保信息分页列表查询
     * @param sparePartsNo 备件号   
     * @param sparePartsName 备件名称
     * @param sparePartsCategoriesDetails 劳保类型
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsuranceSchemes/pages")
    public Result getLaborInsuranceSchemePageList(@RequestParam(required=false) String laborInsuranceName,@RequestParam(required=false) Date createTime, @RequestParam Integer index, @RequestParam Integer size){
		SearchLaborInsuranceSchemeInput input = new SearchLaborInsuranceSchemeInput(index, size);
		input.setLaborInsuranceName(laborInsuranceName);;
		input.setCreateTime(createTime);
		return Result.Success(laborInsuranceSchemeService.getLaborInsuranceSchemePageList(input));
	}
	
	/**
     * 获取全部方案信息
     * 
     * @return
	 * @throws ParseException 
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsuranceSchemes")
	public Result laborInsuranceList(@RequestParam(required=false) String laborInsuranceName,@RequestParam(required=false) Date createTime) {
		SearchLaborInsuranceSchemeInput input = new SearchLaborInsuranceSchemeInput();
		input.setCreateTime(createTime);
		input.setLaborInsuranceName(laborInsuranceName);
		return Result.Success(laborInsuranceSchemeService.getLaborInsuranceSchemeList(input));
	}
	
	/**
	 * 根据key获取方案信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborInsuranceSchemeDetails")
	public Result getLaborInsuranceScheme(@RequestParam String key) {
		EditLaborInsuranceSchemeInput input = new EditLaborInsuranceSchemeInput();
		input.setKey(key);
		return Result.Success(laborInsuranceSchemeService.getLaborInsuranceScheme(input));
	}
	/**
	 * 添加方案信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/laborInsuranceSchemes")
	public Result addLaborInsuranceScheme(@RequestBody AddLaborInsuranceSchemeInput input) {
		laborInsuranceSchemeService.addLaborInsuranceScheme(input);
		return Result.Success();
	}
	
	/**
	 * 修改方案信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/laborInsuranceSchemes")
	public Result editLaborInsuranceScheme(@RequestBody EditLaborInsuranceSchemeInput input) {
		laborInsuranceSchemeService.editLaborInsuranceScheme(input);
		return Result.Success();
	}
	
	/**
	 * 批量删除方案信息
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/laborInsuranceSchemes")
	public Result deleteLaborInsuranceScheme(@RequestParam String[] keys) {
		laborInsuranceSchemeService.delLaborInsuaranceScheme(keys);
		return Result.Success();
	}
	
	/**
	 * 设置劳保方案为无效状态
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/laborInsuranceSchemes/valid")
	public Result invalidLaborInsuaranceScheme(@RequestParam String[] keys) {
		laborInsuranceSchemeService.invalidLaborInsuaranceScheme(keys);
		return Result.Success();
	}
	/**
	 * 列表查询
	 * @param userName 要搜索的用户名称
	 * @param index 页码
	 * @param size 分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStaffs")
	public Result userPagedList(@RequestParam(required=false) String userName,@RequestParam(required=false)  Integer companyId,@RequestParam Integer index,@RequestParam Integer size){
		SearchUserInput input=new SearchUserInput(index,size);
		input.setCompany(companyId);
		input.setUserName(userName);
		return Result.Success(laborInsuranceSchemeService.getUserPageList(input));
	}
	/**
	 * 获得员工劳保信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStaffs/{userId}")
	public Result userDetail(@PathVariable Integer userId) {
		return Result.Success(laborInsuranceSchemeService.userDetail(userId));
	}
	
	/**
	 * 根据方案号获取方案信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborSchemes/{no}")
	public Result getInfoByNo(@PathVariable String no) {
		return Result.Success(laborInsuranceSchemeService.getInfoByNo(no));
	}
	
	/**
	 * 修改员工劳保信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/laborStaffs")
	public Result editLaborStaff(@RequestBody userSchemeOutput input) {
		laborInsuranceSchemeService.editStaffLabor(input);
		return Result.Success();
	}
	
	/**
	 * 下期领用信息
	 * 
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/laborStaffs/personal/{userId}")
	public Result getNextReceiveInfo(@PathVariable Integer userId) {
		return Result.Success(laborInsuranceSchemeService.getNextReceiveInfo(userId));
	}
	
	/**
	 * 劳保福利需求预估
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/labors/demandEstimation")
	public Result getDemandEstimationList(@RequestParam Date startDate,@RequestParam Date endDate) {
		return Result.Success(laborInsuranceSchemeService.getDemandList(startDate, endDate));
	}
}
