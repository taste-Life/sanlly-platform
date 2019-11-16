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
import com.sanlly.finance.models.input.BillDetailInput;
import com.sanlly.finance.models.input.BillInfoInput;
import com.sanlly.finance.models.input.BillPtiInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.service.BillPtiDetailService;
import com.sanlly.finance.service.BillPtiService;

/**
 *	维修账单控制层
* @Package com.sanlly.finance.controller 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午1:16:30 
* @version V1.0   
 */
@RestController
@RequestMapping(value = "/billPti")
public class BillPtiController {
	
	@Autowired
	private BillPtiService service;
	
	@Autowired
	private BillPtiDetailService serviceDetail;

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
	public Result createBill(@RequestBody BillPtiInput input) {
		return Result.Success(service.createBill(input)); 
	}
	
	
	
	/**
	 * 
	 * @Description:新增或者修改
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/add")
	public Result add(@RequestBody BillPtiInput input) {
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
	public Result updates(@RequestBody List<BillPtiInput> input) {
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
	 * 
	 * @Description:分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getDetailList")
	public Result getDetailList(@RequestBody BillDetailInput input) {
		return Result.Success(serviceDetail.getPage(input));
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
	
	/**
	 * 	明细方法
	 */
	
	/**
	 * 
	 * @Description: 账单明细查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/listDetail")
	public Result listDetail(@RequestBody SearchBaseInput input) {
		return Result.Success(service.listDetail(input));
	}
	
	/**
	 * 
	 * @Description: 费用池查询列表
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/listPoolDetail")
	public Result listPoolDetail(@RequestBody SearchBaseInput input) {
		return Result.Success(service.listPoolDetail(input));
	}
	
	/**
	 *	 删除账单明细
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/deleteBillDetail")
	public Result  deleteBillDetail(@RequestParam String [] ids){
		return Result.Success(service.deleteDetail(ids));
	}
	
	/**
	 *	 取消费用确认
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/cancleFreeOk")
	public Result  cancleFreeOk(@RequestParam String [] ids){
		return Result.Success(service.cancleFreeOk(ids));
	}
	
	/**
	 *	费用池明细插入账单明细
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billAdd")
	public Result  billAdd(@RequestParam String [] ids,@RequestParam Integer billId){
		return Result.Success(service.billAdd(ids,billId));
	}
	
	
	/**
	 * 
	 * @Description:账单主信息编辑
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billEdit")
	public Result billEdit(@RequestBody BillInfoInput input) {
		return Result.Success(service.billEdit(input));
	}
	
	/**
	 *	 调账驳回 
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billFullAdjustmentReturn")
	public Result  billFullAdjustmentReturn(@RequestParam String [] ids){
		return Result.Success(service.billFullAdjustmentReturn(ids));
	}
	


}
