package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.unitfailure.UnitFailureInputAdd;
import com.sanlly.production.models.input.unitfailure.UnitFailureInputUpdate;
import com.sanlly.production.models.output.unitfailure.UnitFailureOutput;
import com.sanlly.production.service.UnitFailureService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhq
 * @date 2019/11/1
 * @description 机组故障类型接口
 */
@RestController
@Api(tags = "机组故障类型接口")
public class UnitFailureController {

    @Autowired
    private UnitFailureService unitFailureService;

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 新增机组故障类型接口
     */
    @PostMapping("/addUnitFailure")
    public Result<Integer> addUnitFailure(@RequestBody UnitFailureInputAdd unitFailureInputAdd) {
        return Result.Success(unitFailureService.addUnitFailure(unitFailureInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 修改机组故障类型接口
     */
    @PutMapping("/updateUnitFailure")
    public Result<Integer> updateUnitFailure(@RequestBody UnitFailureInputUpdate unitFailureInputUpdate) {
        return Result.Success(unitFailureService.updateUnitFailure(unitFailureInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 批量删除机组故障
     */
    @DeleteMapping("/deleteUnitFailure")
    public Result<Integer> deleteUnitFailure(Integer[] ids) {
        return Result.Success(unitFailureService.deleteUnitFailure(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 批量设置有效
     */
    @PutMapping("/validateUnitFailure")
    public Result<Integer> validateUnitFailure(Integer[] ids, Integer valid) {
        return Result.Success(unitFailureService.validateUnitFailure(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 分页查询
     */
    @GetMapping("/getUnitFailureList")
    public Result<PagedList<UnitFailureOutput>> getUnitFailureList(Integer index, Integer size, String searchWords) {
        Assert.notNull(index, "页码index不能为空");
        Assert.isTrue(index > 0, "页码index必须大于0");
        Assert.notNull(size, "每页条数size不能为空");
        Assert.isTrue(size > 0, "每页条数size必须大于0");
        return Result.Success(unitFailureService.getUnitFailureList(index, size, searchWords));
    }

}
