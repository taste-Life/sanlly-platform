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

import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.service.PoolOutSourceRepairService;

/**
 * 劳务外包费用池 控制层
* @Package com.sanlly.finance.controller 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午1:16:30 
* @version V1.0   
 */
@RestController
@RequestMapping(value = "/poolOutSourceRepair")
public class PoolOutSourceRepairController {
	
	@Autowired
	private PoolOutSourceRepairService service;

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
	public Result addOrUpadte(@RequestBody PoolOutSourceRepairInput input) {
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
	public Result updates(@RequestBody List<PoolOutSourceRepairInput> input) {
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
	 * @Description:劳务外包完工 修箱
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/wbFinishedRepair")
	public Result wbFinishedRepair(@RequestBody  PoolOutSourceRepairInput input) {
		return Result.Success(service.wbFinishedRepair(input));
	}
	
	/**
	 * 
	 * @Description:劳务外包完工 洗箱
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/wbFinishedClean")
	public Result wbFinishedClean(@RequestBody  PoolOutSourceRepairInput input) {
		return Result.Success(service.wbFinishedClean(input));
	}


	
	
	
}
