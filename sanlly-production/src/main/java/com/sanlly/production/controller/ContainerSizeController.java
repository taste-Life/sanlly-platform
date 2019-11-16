package com.sanlly.production.controller;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.input.base.ContainerSizeInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerSizeOutput;
import com.sanlly.production.service.ContainerSizeService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = {"尺寸基本信息维护API"})
public class ContainerSizeController {

    @Autowired
    private ContainerSizeService containerSizeService;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @GetMapping("/containerSize/list")
    public Result<List<ContainerSizeOutput>> list() {
        return Result.Success(containerSizeService.list());
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @GetMapping("/containerSize/query/{id}")
    public Result<ContainerSizeOutput> query(Integer id) {
        return Result.Success(containerSizeService.query(id));
    }

    /**
     * 更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/containerSize/update")
    public Result update(@RequestBody ContainerSizeInput input) {
        return Result.Success(containerSizeService.update(input));
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @PostMapping("/containerSize/add")
    @SuppressWarnings("rawtypes")
    public Result add(@RequestBody ContainerSizeInput input) {
        return Result.Success(containerSizeService.add(input));
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @DeleteMapping("/containerSize/delete/{id}")
    @SuppressWarnings("rawtypes")
    public Result delete(Integer id) {
        return Result.Success(containerSizeService.delete(id));
    }


    /**
    *@Description: 箱型尺寸分页列表
    *@Param: [index, size, searchWords]
    *@return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerSizeOutput>>
    *@Author: zjd
    *@date: 2019-09-25
    */
    @GetMapping("/containerSize/pageList")
    public Result<PagedList<ContainerSizeOutput>> pageList(@RequestParam(required = true, value = "index") Integer index,
                                                           @RequestParam(required = true, value = "size") Integer size,
                                                           @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(containerSizeService.pageList(input, searchWords));
    }

    /**
    *@Description: 批量删除
    *@Param: [ids]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @DeleteMapping("/containerSize/multiDelete")
    public Result multiDelete(Integer[] ids){
        return Result.Success(containerSizeService.multiDelete(ids));
    }

    /**
    *@Description: 批量设置有效性
    *@Param: [ids, valid]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @PutMapping("containerSize/multiValid")
    public Result multiValid(Integer[] ids,int valid){
        return Result.Success(containerSizeService.multiValid(ids,valid));
    }



}
