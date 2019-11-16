package com.sanlly.production.controller;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.proddept.ProdDeptInputAdd;
import com.sanlly.production.models.input.proddept.ProdDeptInputUpdate;
import com.sanlly.production.models.output.proddept.ProdDeptOutputSelect;
import com.sanlly.production.service.DeptService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门控制层
 *
 * @author fjy   
 * @Description: TODO
 * @date 2019年9月9日 下午1:37:26 
 */
@RestController
@Api(tags = {"部门相关API"})
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询列表 部门集合
     *
     * @return
     */
    @PostMapping("/dept/list")
    public Result<List<DeptOutput>> deptList(@RequestBody BaseSearchInput input) {
        return Result.Success(deptService.deptList(input));
    }

    /**
     * 查询列表 生产部门集合
     *
     * @return
     */
    @PostMapping("/dept/prodDeptList")
    public Result<List<ProdDeptOutput>> prodDeptList(@RequestBody BaseSearchInput input) {
        return Result.Success(deptService.prodDeptList(input));
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ProdDeptController.class);

    /**
     * @author zhq
     * @date 2019/10/24
     * @description 新增生产部门接口
     */
    @PostMapping("/prodDeptAdd")
    public Result<String> addProdDept(@RequestBody ProdDeptInputAdd prodDeptInputAdd) {
        LOGGER.info(prodDeptInputAdd.toString());
        return new Result<>(prodDeptInputAdd.toString());
    }

    /**
     * @author zhq
     * @date 2019/10/24
     * @description 修改生产部门接口
     */
    @PutMapping("/prodDeptUpdate")
    public Result<String> updateProdDept(@RequestBody ProdDeptInputUpdate prodDeptInputUpdate) {
        LOGGER.info(prodDeptInputUpdate.toString());
        return new Result<>(prodDeptInputUpdate.toString());
    }

    /**
     * @author zhq
     * @date 2019/10/24
     * @description 删除生产部门接口
     */
    @DeleteMapping("/prodDeptDelete")
    public Result<Integer> deleteProdDept(Integer[] ids) {
        return null;
    }

    /**
     * @author zhq
     * @date 2019/10/24
     * @description 根据关键字分页查询生产部门列表
     */
    @GetMapping("/prodDeptSelect")
    public Result<PagedList<ProdDeptOutputSelect>> selectProdDeptList() {
        return null;
    }

    /**
     * @author zhq
     * @date 2019/10/28
     * @description 根据公司key 查询该公司下所有生产部门列表
     */
    @GetMapping("/prodDeptListByCompanyKey")
    public Result<List<DeptOutput>> getDeptListByCompanyKey(String companyKey) {
        return Result.Success(deptService.getDeptListByCompanyKey(companyKey));
    }


}
