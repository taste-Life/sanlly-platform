package com.sanlly.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.finance.models.input.BaseCostProfitInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.service.BaseCostProfitService;

/**
 *	成本中心字典表控制层
* @Package com.sanlly.finance.controller 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午1:16:30 
* @version V1.0   
 */
@RestController
@RequestMapping(value = "/costProfit")
public class BaseCostProfitController {
	
	@Autowired
	private BaseCostProfitService service;
	
	/**
	 * 
	 * @Description:分页查询
	 * @param input
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getList")
	public Result getList(@RequestBody SearchBaseInput input) {
		return Result.Success(service.list(input));
	}

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
	public Result addOrUpadte(@RequestBody BaseCostProfitInput input) {
		return Result.Success(service.addOrUpadte(input));
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
	 * @Description:查询成本 利润 下拉集合
	 * @param cpType
	 * @return Result
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/selectList")
	public Result selectList(@RequestParam String cpType) {
		return Result.Success(service.selectList(cpType));
	}
	
	
}
