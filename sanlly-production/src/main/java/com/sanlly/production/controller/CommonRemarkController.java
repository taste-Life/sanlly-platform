package com.sanlly.production.controller;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.delay.DelayReceiveTimeInput;
import com.sanlly.production.models.input.remark.CommonRemarksInput;
import com.sanlly.production.models.output.remark.CommonRemarksOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.remark.CommonRemarkSelectInput;
import com.sanlly.production.models.output.remark.CommonRemarkSelectOutput;
import com.sanlly.production.service.CommonRemarkService;

import io.swagger.annotations.Api;

/**
 * 
* @Package com.sanlly.production.controller 
* @Description: 常用备注 
* @author zhangkai   
* @date 2019年8月28日 下午2:45:10 
* @version V1.0   
 */
@RestController
@Api(tags = {"常用备注API"})
public class CommonRemarkController {

	@Autowired
	private CommonRemarkService commonRemarkService;
	
	/**
	 * 
	* @Description: tianzhl要的接口 
	* @param company
	* @param containerCategory
	* @return Result<List<CommonRemarkSelectOutput>>
	* @throws
	* @author zhangkai 
	 */
	@GetMapping("/remark/select")
	public Result<List<CommonRemarkSelectOutput>> select(
			@RequestParam(required = false, value = "compangy") String company, 
			@RequestParam(required = false, value = "containerCategory") String containerCategory) {
		CommonRemarkSelectInput input = new CommonRemarkSelectInput();
		input.setCompany(company);
		input.setContainerCategory(containerCategory);
		return Result.Success(commonRemarkService.select(input));
	}

	/**
	*@Description: 常用备注分页
	*@Param: [index, size, searchWords]
	*@return: com.sanlly.common.models.output.Result<PagedList<DelayReceiveTimeOutput>>
	*@Author: zjd
	*@date: 2019-09-30
	*/
	@GetMapping("commonRemarks/pageList")
	public Result<PagedList<CommonRemarksOutput>> pageList(
			@RequestParam(required = true, value = "index") Integer index,
			@RequestParam(required = true, value = "size") Integer size,
			@RequestParam(required = false, value = "searchWords") String searchWords) {
		PageInput input = new PageInput(index, size);
		return Result.Success(commonRemarkService.pageList(input, searchWords));
	}

	@PostMapping("commonRemarks/add")
	public Result add(@RequestBody CommonRemarksInput input) {
		return Result.Success(commonRemarkService.add(input));
	}

	@PutMapping("commonRemarks/update")
	public Result update(@RequestBody CommonRemarksInput input) {
		return Result.Success(commonRemarkService.update(input));
	}


	@DeleteMapping("commonRemarks/multiDelete")
	public Result multiDelete(Integer[] ids) {
		return Result.Success(commonRemarkService.multiDelete(ids));
	}


	@PutMapping("commonRemarks/multiValid")
	public  Result multiValid(Integer[] ids,int valid){
		return Result.Success(commonRemarkService.multiValid(ids,valid));
	}


}
