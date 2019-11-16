package com.sanlly.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.input.finance.PoolSourceRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.service.PoolSourceRepairService;

/**
 * 	成本维修费用池 控制层
* @Package com.sanlly.finance.controller 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午1:16:30 
* @version V1.0   
 */
@RestController
@RequestMapping(value = "/poolSourceRepair")
public class PoolSourceRepairController {
	
	@Autowired
	private PoolSourceRepairService service;

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
	 * @Description:新增或者修改
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/addOrUpadte")
	public Result addOrUpadte(@RequestBody PoolSourceRepairInput input) {
		return Result.Success(service.addOrUpadte(input));
	}
	
	/**
	 * 
	 * @Description:批量删除
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/updates")
	public Result updates(@RequestBody List<PoolSourceRepairInput> input) {
		return Result.Success(service.Upadtes(input));
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
	 * @Description:费用确认
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/costOk")
	public Result costOk(@RequestParam String [] Ids) {
		return Result.Success(service.costOk(Ids));
	}
	
	/**
	 * 
	 * @Description:无法收费
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/noCharge")
	public Result NoCharge(@RequestBody PoolBaseInput input) {
		return Result.Success(service.NoCharge(input));
	}
	
	/**
	 * 
	 * @Description:批量添加费用  单箱批复插入
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/oneReply")
	public Result add(@RequestBody  List<PoolSourceRepairInput> list) {
		return Result.Success(service.add(list));
	}
	
	/**
	 * 
	 * @Description:干箱完工时，生成费用 判断场站核算模式 是完工产生 还是 修理账单确认产生
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/finishedGX")
	public Result finishedGX(@RequestBody PoolSourceRepairInput input) {
		return Result.Success(service.finishedGX(input));
	}
	
	/**
	 * 修理收入账单  提交审核，触发这个条件保存到成本费用
	 * @Description:修理账单确认，生成费用 判断场站核算模式 是完工产生 还是 修理账单确认产生
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/wxBillOk")
	public Result wxBillOk(@RequestBody PoolRepairInput input) {
		return Result.Success(service.wxBillOk(input));
	}


	
	
}
