package com.sanlly.production.controller;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.input.base.CourseTypeInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.CourseTypeOutput;
import com.sanlly.production.service.CourseTypeService;

import io.swagger.annotations.Api;

@RestController
@Api(tags={"进场类型基本信息维护API"})
public class CourseTypeController {
	
	@Autowired
	private CourseTypeService courseTypeService;
	
	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/courseType/list")
	public Result<List<CourseTypeOutput>> list() {
		return Result.Success(courseTypeService.list());
	}
	
	/**
	 * 
	 * 根据主键查询
	 * @param id
	 * @return 
	 * @author zhangkai
	 */
	@GetMapping("/courseType/query/{id}")
	public Result<CourseTypeOutput> query(Integer id) {
		return Result.Success(courseTypeService.query(id));
	}
	
	/**
	 * 更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/courseType/update")
	public Result update(@RequestBody CourseTypeInput input) {
		return Result.Success(courseTypeService.update(input));
	}
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@PostMapping("/courseType/add")
	@SuppressWarnings("rawtypes")
	public Result add(@RequestBody CourseTypeInput input) {
		return Result.Success(courseTypeService.add(input));
	}
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	@DeleteMapping("/courseType/delete/{id}")
	@SuppressWarnings("rawtypes")
	public Result delete(Integer id) {
		return Result.Success(courseTypeService.delete(id));
	}

	/**
	*@Description: 进场类型分页列表
	*@Param: [index, size, searchWords]
	*@return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.CourseTypeOutput>>
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@GetMapping("/courseType/pageList")
	public Result<PagedList<CourseTypeOutput>> pageList(
			@RequestParam(required = true, value = "index") Integer index,
			@RequestParam(required = true, value = "size") Integer size,
			@RequestParam(required = false, value = "searchWords") String
					searchWords) {
		PageInput input = new PageInput(index, size);
		return Result.Success(courseTypeService.pageList(input, searchWords));
	}

	/**
	*@Description: 批量删除 进场类型
	*@Param: [ids]
	*@return: com.sanlly.common.models.output.Result
	*@Author: zjd
	*@date: 2019-09-26
	*/
	@DeleteMapping("/courseType/multiDelete")
	public Result multiDelete(Integer[] ids){
		return Result.Success(courseTypeService.multiDelete(ids));
	}

	/**
	*@Description: 批量设置有效性
	*@Param: [ids, valid]
	*@return: com.sanlly.common.models.output.Result
	*@Author: zjd
	*@date: 2019-09-26
	*/
	@PutMapping("/courseType/multiValid")
	public Result multiValid(Integer[] ids,int valid){
		return Result.Success(courseTypeService.multiValid(ids,valid));
	}
}
