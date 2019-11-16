package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.ptitype.PtiTypeInputAdd;
import com.sanlly.production.models.input.ptitype.PtiTypeInputUpdate;
import com.sanlly.production.models.output.ptitype.PtiTypeOutput;
import com.sanlly.production.service.PtiTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
@RestController
public class PtiTypeController {

    @Autowired
    private PtiTypeService ptiTypService;

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 新增pti类型
     */
    @PostMapping("/addPtiType")
    public Result<Integer> addPtiType(@RequestBody PtiTypeInputAdd ptiTypeInputAdd) {
        return Result.Success(ptiTypService.addPtiType(ptiTypeInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 修改pti类型
     */
    @PutMapping("/updatePtiType")
    public Result<Integer> updatePtiType(@RequestBody PtiTypeInputUpdate ptiTypeInputUpdate) {
        return Result.Success(ptiTypService.updatePtiType(ptiTypeInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 删除pti类型
     */
    @DeleteMapping("/deletePtiType")
    public Result<Integer> deletePtiType(Integer[] ids) {
        return Result.Success(ptiTypService.deletePtiType(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    @PutMapping("/validatePtiType")
    public Result<Integer> validatePtiType(Integer[] ids, Integer valid) {
        return Result.Success(ptiTypService.validatePtiType(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 分页查询
     */
    @GetMapping("/getPtiTypeList")
    public Result<PagedList<PtiTypeOutput>> getPtiTypeList(Integer index, Integer size, String searchWords) {
        return Result.Success(ptiTypService.getPtiTypeList(index, size, searchWords));
    }
}
