package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.base.CompanyInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.service.CompanyService;
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
@Api(tags = {"公司操作相关API"})
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @GetMapping("/company/list")
    public Result<PagedList<CompanyOutput>> list(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(companyService.list(input, searchWords));
    }

    /**
     * @param id
     * @return Result
     * @Description: 根据主键查询
     * @throws 
     */
    @GetMapping("/company/query/{id}")
    public Result<CompanyOutput> query(@PathVariable("id") Integer id) {
        return Result.Success(companyService.query(id));
    }

    /**
     * 更新
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/company/update")
    public Result update(@RequestBody CompanyInput input) {
        return Result.Success(companyService.update(input));
    }

    /**
     * 新增
     *
     * @param input
     * @return
     */
    @PostMapping("/company/add")
    @SuppressWarnings("rawtypes")
    public Result add(@RequestBody CompanyInput input) {
        return Result.Success(companyService.add(input));
    }

    /**
     * 逻辑删除
     *
     * @param ids
     * @return
     */
    @DeleteMapping("/company/delete")
    @SuppressWarnings("rawtypes")
    public Result delete(Integer[] ids) {
        return Result.Success(companyService.delete(ids));
    }


    /**
     * 查询列表
     *
     * @return
     * @author fjy
     */
    @PostMapping("/company/searchList")
    public Result<List<CompanyOutput>> list(@RequestBody BaseSearchInput input) {
        return Result.Success(companyService.list(input));
    }


    /**
     * @Description: 批量设置有效性
     * @Param: [ids, valid]
     * @return: com.sanlly.common.models.output.Result
     * @Author: zjd
     * @date: 2019-09-25
     */
    @PutMapping("/company/multiValid")
    public Result multiValid(Integer[] ids, int valid) {
        return Result.Success(companyService.multiValid(ids, valid));
    }


    /**
     * 根据key查询公司位置代码
     *
     * @param key
     * @return
     */
    @GetMapping("/company/getPositionCode")
    public Result<String> getPositionCode(@RequestParam String key) {
        return Result.Success(companyService.getPositionCode(key));
    }

    /**
     * 根据key查询公司代码
     *
     * @param key
     * @return
     */
    @GetMapping("/company/getCompanyCode")
    public Result<String> getCompanyCode(@RequestParam String key) {
        return Result.Success(companyService.getPositionCode(key));
    }

    /**
     * 根据key查询公司是否锁库
     *
     * @param key
     * @return
     */
    @GetMapping("/company/getIsLock")
    public Result<Integer> getIsLock(@RequestParam String key) {
        return Result.Success(companyService.getIsLock(key));
    }

    /**
     * @author zhq
     * @date 2019/10/28
     * @description 查询所有公司
     */
    @GetMapping("/companyList")
    public Result<List<CompanyOutput>> getCompanyList() {
        return Result.Success(companyService.selectCompanyList());
    }

}
