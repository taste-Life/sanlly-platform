package com.sanlly.production.controller;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sanlly.common.models.input.base.ContainerUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.production.service.ContainerUserService;

import io.swagger.annotations.Api;

/**
 * 用箱人控制器
 *
 * @author
 */
@RestController
@Api(tags = {"用箱人基本信息维护API"})
public class ContainerUserController {

    @Autowired
    private ContainerUserService containerUserService;


    /**
     * 用箱人下拉列表获取
     *
     * @return
     * @author wangxiaozheng
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/contUserSelect")
    public Result contUserSelect() {
        return Result.Success(containerUserService.contUserSelect());
    }

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @GetMapping("/containerUser/list")
    public Result<List<ContainerUserOutput>> list() {
        return Result.Success(containerUserService.list());
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @GetMapping("/containerUser/query/{id}")
    public Result<ContainerUserOutput> query(Integer id) {
        return Result.Success(containerUserService.query(id));
    }

    /**
     * 更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/containerUser/update")
    public Result update(@RequestBody ContainerUserInput input) {
        return Result.Success(containerUserService.update(input));
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @PostMapping("/containerUser/add")
    @SuppressWarnings("rawtypes")
    public Result add(@RequestBody ContainerUserInput input) {
        return Result.Success(containerUserService.add(input));
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @DeleteMapping("/containerUser/delete/{id}")
    @SuppressWarnings("rawtypes")
    public Result delete(Integer id) {
        return Result.Success(containerUserService.delete(id));
    }

    /**
     * 根据key查询
     *
     * @param key
     * @return 
     * @author fjy
     */
    @GetMapping("/containerUser/getContainerUserByKey/{key}")
    public Result<ContainerUserOutput> getContainerUserByKey(@PathVariable("key") String key) {
        return Result.Success(containerUserService.getContainerUserByKey(key));
    }

    /**
     * @Description: 用箱人分页列表
     * @Param: [index, size, searchWords]
     * @return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerUserOutput>>
     * @Author: zjd
     * @date: 2019-09-25
     */
    @GetMapping("/containerUser/pageList")
    public Result<PagedList<ContainerUserOutput>> list(@RequestParam(required = true, value = "index") Integer index,
                                                       @RequestParam(required = true, value = "size") Integer size,
                                                       @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(containerUserService.containerUserPageList(input, searchWords));
    }

    /**
     * @Description: 批量设置有效性
     * @Param: [ids, valid]
     * @return: com.sanlly.common.models.output.Result
     * @Author: zjd
     * @date: 2019-09-25
     */
    @PutMapping("/containerUser/multiValid")
    public Result setValid(Integer[] ids, int valid) {
        return Result.Success(containerUserService.multiValid(ids,valid));
    }

    /**
    *@Description: 批量删除
    *@Param: [ids]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @DeleteMapping("/containerUser/multiDelete")
    public Result multiDelete(Integer[] ids){
        return Result.Success(containerUserService.multiDelete(ids));
    }


	
	/**
	 * 根据当前登录公司获取该公司用箱人
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/containerUser/getContainersByCurrentCompany")
	public Result<List<SelectOutput>> getContainersByCurrentCompany() {
		return Result.Success(containerUserService.getContainerUsersByCurrentCompany());
	}
	
	/**
	 * 根据 公司获取该公司用箱人
	 * @return
	 * @author fjy  财务用
	 */
	@GetMapping("/containerUser/getContainersByCompany")
	public Result<List<SelectOutput>> getContainersByCompany(@RequestParam(value="companyKey",required = false) String companyKey) {
		return Result.Success(containerUserService.getContainerUsersByCompany(companyKey));
	}
	
	

	
	
}
