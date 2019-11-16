package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.mustcheckhour.MustCheckHourInputAdd;
import com.sanlly.production.models.input.mustcheckhour.MustCheckHourInputUpdate;
import com.sanlly.production.models.output.mustcheckhour.MustCheckHourOutput;
import com.sanlly.production.service.MustCheckHourService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
@RestController
@Api(tags = "必检工时接口")
public class MustCheckHourController {

    @Autowired
    private MustCheckHourService mustCheckHourService;

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 新增必检工时
     */
    @PostMapping("/addMustCheckHour")
    Result<Integer> addMustCheckHour(@RequestBody MustCheckHourInputAdd mustCheckHourInputAdd) {
        return Result.Success(mustCheckHourService.addMustCheckHour(mustCheckHourInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 修改必检工时
     */
    @PutMapping("/updateMustCheckHour")
    Result<Integer> updateMustCheckHour(@RequestBody MustCheckHourInputUpdate mustCheckHourInputUpdate) {
        return Result.Success(mustCheckHourService.updateMustCheckHour(mustCheckHourInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 删除必检工时
     */
    @DeleteMapping("/deleteMustCheckHour")
    Result<Integer> deleteMustCheckHour(Integer[] ids) {
        return Result.Success(mustCheckHourService.deleteMustCheckHour(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 设置有效
     */
    @PutMapping("/validateMustCheckHour")
    Result<Integer> validateMustCheckHour(Integer[] ids, Integer valid) {
        return Result.Success(mustCheckHourService.validateMustCheckHour(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    @GetMapping("/getMustCheckHourList")
    Result<PagedList<MustCheckHourOutput>> getMustCheckHourList(Integer index, Integer size, String searchWords) {
        return Result.Success(mustCheckHourService.getMustCheckHourList(index, size, searchWords));
    }

}
