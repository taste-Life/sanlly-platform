package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import io.swagger.annotations.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.input.base.ContainerGradeInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerGradeOutput;
import com.sanlly.production.service.ContainerGradeService;

@RestController
@Api(tags = {"箱等级基本信息维护表"})
public class ContainerGradeController {

    @Autowired
    private ContainerGradeService containerGradeService;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @GetMapping("/containerGrade/list")
    public Result<List<ContainerGradeOutput>> list() {
        return Result.Success(containerGradeService.list());
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @GetMapping("/containerGrade/query/{id}")
    public Result<ContainerGradeOutput> query(Integer id) {
        return Result.Success(containerGradeService.query(id));
    }

    /**
     * 更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/containerGrade/update")
    public Result update(@RequestBody ContainerGradeInput input) {
        return Result.Success(containerGradeService.update(input));
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @PostMapping("/containerGrade/add")
    @SuppressWarnings("rawtypes")
    public Result add(@RequestBody ContainerGradeInput input) {
        return Result.Success(containerGradeService.add(input));
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @DeleteMapping("/containerGrade/delete/{id}")
    @SuppressWarnings("rawtypes")
    public Result delete(Integer id) {
        return Result.Success(containerGradeService.delete(id));
    }

    /**
    *@Description: 箱等级分页列表
    *@Param: [index, size, searchWords]
    *@return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerGradeOutput>>
    *@Author: zjd
    *@date: 2019-09-25
    */
    @GetMapping("/containerGrade/pageList")
    public Result<PagedList<ContainerGradeOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String
                    searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(containerGradeService.pageList(input, searchWords));
    }

    /**
    *@Description: 批量删除箱等级
    *@Param: [ids]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @DeleteMapping("/containerGrade/multiDelete")
    public  Result multiDelete(Integer[] ids){
        return Result.Success(containerGradeService.multiDelete(ids));
    }

    /**
    *@Description: 批量设置有效性
    *@Param: [ids, valid]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-25
    */
    @PutMapping("/containerGrade/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(containerGradeService.multiValid(ids,valid));
    }
}
