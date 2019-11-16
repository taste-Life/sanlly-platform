package com.sanlly.production.controller;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.input.base.ContainerTypeInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerTypeOutput;
import com.sanlly.production.service.ContainerTypeService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = {"箱型基本信息维护API"})
public class ContainerTypeController {

    @Autowired
    private ContainerTypeService containerTypeService;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @GetMapping("/containerType/list")
    public Result<List<ContainerTypeOutput>> list() {
        return Result.Success(containerTypeService.list());
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @GetMapping("/containerType/query/{id}")
    public Result<ContainerTypeOutput> query(Integer id) {
        return Result.Success(containerTypeService.query(id));
    }

    /**
     * 更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/containerType/update")
    public Result update(@RequestBody ContainerTypeInput input) {
        return Result.Success(containerTypeService.update(input));
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @PostMapping("/containerType/add")
    @SuppressWarnings("rawtypes")
    public Result add(@RequestBody ContainerTypeInput input) {
        return Result.Success(containerTypeService.add(input));
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @DeleteMapping("/containerType/delete/{id}")
    @SuppressWarnings("rawtypes")
    public Result delete(Integer id) {
        return Result.Success(containerTypeService.delete(id));
    }

    /**
     * @Description: 箱型分页列表
     * @Param: [index, size, searchWords]
     * @return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerTypeOutput>>
     * @Author: zjd
     * @date: 2019-09-25
     */
    @GetMapping("/containerType/pageList")
    public Result<PagedList<ContainerTypeOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String
                    searchWords) {

        PageInput input = new PageInput(index, size);
        return Result.Success(containerTypeService.pageList(input, searchWords));
    }

    /**
    *@Description: 批量删除箱型
    *@Param: [ids]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @DeleteMapping("containerType/multiDelete")
    public Result multiDelete(Integer[] ids){
        return Result.Success(containerTypeService.multiDelete(ids));
    }

    /**
    *@Description: 批量设置有效性
    *@Param: [ids, valid]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @PutMapping("containerType/multiValid")
    public Result multiValid(Integer[] ids,int valid){
        return Result.Success(containerTypeService.multiValid(ids,valid));
    }
}