package com.sanlly.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.BillLeaseInput;
import com.sanlly.finance.models.input.PoolLeaseInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.service.BillLeaseService;

/**
 * 	现场收费控制层
* @Package com.sanlly.finance.controller 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午1:16:30 
* @version V1.0   
 */
@RestController
@RequestMapping(value = "/billLease")
public class BillLeaseController {
	
	@Autowired
	private BillLeaseService service;
	

	/**
	 * 
	 * @Description:分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getPage")
	public Result getPage(@RequestBody SearchBaseInput input) {
		return Result.Success(service.getPage(input));
	}
	/**
	 * 
	 * @Description: 现场收费，生成账单和明细
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/createBill")
	public Result createBill(@RequestBody List<PoolLeaseInput> list) {
		return Result.Success(service.createBill(list)); 
	}
	
	
	/**
	 * 
	 * @Description:新增或者修改
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/add")
	public Result add(@RequestBody BillLeaseInput input) {
		return Result.Success(service.add(input));
	}
	
	/**
	 * 
	 * @Description:批量修改
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/updates")
	public Result updates(@RequestBody List<BillLeaseInput> input) {
		return Result.Success(service.Upadtes(input));
	}
	
	/**
	 * 
	 * @Description:账单驳回
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billReturn")
	public Result billReturn(@RequestBody RejectInput input) {
		return Result.Success(service.billReturn(input));
	}
	
	/**
	 * 
	 * @Description:批量删除
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deletes")
	public Result deletes(@RequestParam String [] Ids) {
		return Result.Success(service.deletes(Ids));
	}
	
	
	
	/**
	 *	 账单提交
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billSubmit")
	public Result  billSubmit(@RequestParam String [] ids){
		return Result.Success(service.billSubmit(ids));
	}
	/**
	 *	 账单审核
	 *	同时传账单主信息及明细汇总信息（根据成本利润中心分类汇总）到应收账款模块。
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billAudit")
	public Result  billAudit(@RequestParam String [] ids){
		return Result.Success(service.billAudit(ids));
	}
	/**
	 *	 取消账单审核
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billCancleAudit")
	public Result  billCancleAudit(@RequestParam String [] ids){
		return Result.Success(service.billCancleAudit(ids));
	}
	
	/**
	 *	 全额冲回
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billFullReturn")
	public Result  billFullReturn(@RequestParam String [] ids){
		return Result.Success(service.billFullReturn(ids));
	}
	
	/**
	 *	 全额调账
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billFullAdjustment")
	public Result  billFullAdjustment(@RequestParam String [] ids){
		return Result.Success(service.billFullAdjustment(ids));
	}
	
	
	
	
	
	
	
}
