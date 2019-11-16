package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.base.YardInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.production.service.YardService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = {"场站相关API"})
public class YardController {

    @Autowired
    private YardService yardService;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @GetMapping("/yard/list")
    public Result<List<YardOutput>> list(String companyKey) {
        return Result.Success(yardService.list(companyKey));
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @GetMapping("/yard/query/{id}")
    public Result<YardOutput> query(Integer id) {
        return Result.Success(yardService.query(id));
    }

    /**
     * 根据key查询
     *
     * @param key
     * @return 
     * @author zhh
     */
    @GetMapping("/yard/querykey/{key}")
    public Result<YardOutput> queryByKey(@PathVariable(value = "key") String key) {
        return Result.Success(yardService.queryByKey(key));
    }

    /**
     * 更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/yard/update")
    public Result update(@RequestBody YardInput input) {
        return Result.Success(yardService.update(input));
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @PostMapping("/yard/add")
    @SuppressWarnings("rawtypes")
    public Result add(@RequestBody YardInput input) {
        return Result.Success(yardService.add(input));
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @DeleteMapping("/yard/delete/{id}")
    @SuppressWarnings("rawtypes")
    public Result delete(Integer id) {
        return Result.Success(yardService.delete(id));
    }


    /**
     * 查询列表  根据场站名称,公司key检索
     *
     * @return
     * @author fjy
     */
    @PostMapping("/yard/searchList")
    public Result<List<YardOutput>> list(@RequestBody BaseSearchInput input) {
        return Result.Success(yardService.list(input));
    }

    /**
     * @Description: 场站分页列表
     * @Param: [index, size, searchWords]
     * @return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList < com.sanlly.common.models.output.yard.YardOutput>>
     * @Author: zjd
     * @date: 2019-09-27
     */
    @GetMapping("/yard/pageList")
    public Result<PagedList<YardOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(yardService.pageList(input, searchWords));
    }

    @DeleteMapping("yard/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(yardService.multiDelete(ids));
    }


    @PutMapping("yard/multiValid")
    public Result multiValid(Integer[] ids, int valid) {
        return Result.Success(yardService.multiValid(ids, valid));
    }


}
