package com.sanlly.production.controller;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.RefrigeratorCompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.refrigerator.AddRefrigeratorCompanyInput;
import com.sanlly.production.models.input.refrigerator.EditRefrigeratorCompanyInput;
import com.sanlly.production.models.input.refrigerator.SearchRefrigeratorCompanyInput;
import com.sanlly.production.service.RefrigeratorCompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 冷机公司API
 * 
 * @author lishzh
 *
 */
@Api(tags = { "冷机公司API" })
@RestController
public class RefrigeratorCompanyController {

	@Autowired
	private RefrigeratorCompanyService refrigeratorCompanyService;

	private static final Logger LOGGER = LoggerFactory.getLogger(RefrigeratorCompanyController.class);


	/**
	 * @author zhq
	 * @date 2019/10/18
	 * @description 根据关键字查询冷机公司列表
	 */
	@GetMapping("/unitCompanyList")
	public Result<PagedList<RefrigeratorCompanyOutput>> getUnitCompanyList(
			@RequestParam("index") Integer index,
			@RequestParam("size") Integer size, String searchWords) {
		Assert.notNull(index, "index页码不能为空");
		Assert.notNull(size, "每页记录数size不能为空");
		PageInput input = new PageInput(index, size);
		return Result.Success(refrigeratorCompanyService.getRefrigeratorCompanyListByKeywords(input, searchWords), "success");
	}

	/**
	 * @author zhq
	 * @date 2019/10/23
	 * @description 新增冷机公司
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/refrigerator")
	public Result<Integer> addRefrigeratorCompany(@RequestBody AddRefrigeratorCompanyInput input) {
		LOGGER.info("新增冷机公司接口请求报文为{}", input.toString());
		return Result.Success(refrigeratorCompanyService.addRefrigeratorCompany(input));
	}

	/**
	 @author zhq
	 @date 2019/10/23
	 @description 更新冷机公司记录
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/refrigerators")
	public Result editRefrigeratorCompany(@RequestBody EditRefrigeratorCompanyInput input) {

		refrigeratorCompanyService.updateRefrigeratorCompany(input);
		return Result.Success();

	}

	/**
	 @author zhq
	 @date 2019/10/23
	 @description 根据主键批量删除冷机公司记录
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/refrigerators")
	public Result deleteRefrigeratorCompany(@RequestParam Integer[] ids) {

		return Result.Success(refrigeratorCompanyService.deleteRefrigeratorCompany(ids));
	}

	/**
	 * @author zhq
	 * @date 2019/10/21
	 * @description 批量设置有效性
	 */
	@PutMapping("/unitCompanyValid")
	public Result<Integer> multiValid(Integer[] ids, int valid) {
		return Result.Success(refrigeratorCompanyService.multiValid(ids, valid), ResultCodeEnum.SUCCESS.getMessage());
	}

	/**
	 * 分页查询冷机公司
	 *
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/refrigerators/pages")
	public Result getPageRefrigeratorCompany(@RequestParam(required = false) String unitCompanyName,
			@RequestParam Integer index, @RequestParam Integer size) {

		SearchRefrigeratorCompanyInput input = new SearchRefrigeratorCompanyInput(index, size);
		input.setUnitCompanyName(unitCompanyName);
		return Result.Success(refrigeratorCompanyService.getPageRefrigeratorCompany(input));

	}

	/**
	 * 查询所有冷机公司
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/refrigerators")
	@ApiOperation(value = "获取所有冷机公司")
	public Result<List<RefrigeratorCompanyOutput>> getAllRefrigeratorCompany() {

		return Result.Success(refrigeratorCompanyService.getAllRefrigeratorCompany());

	}

	/**
	 * 根据key获取冷机公司及所属机型
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/refrigerators/types")
	public Result getUnitCompanyByKey(@RequestParam(value = "key",required = false) String key) {
		return Result.Success(refrigeratorCompanyService.getUnitCompanyByKey(key));
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/refrigerators/types/{key}")
	public Result getUnitCompanyByTypeKey(@PathVariable(value = "key",required = false) String key) {
		return Result.Success(refrigeratorCompanyService.getUnitCompanyByTypeKey(key));
	}
}
