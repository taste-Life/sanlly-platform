package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.qualitycontrol.QualityControlTimeInputAdd;
import com.sanlly.production.models.input.qualitycontrol.QualityControlTimeInputUpdate;
import com.sanlly.production.models.output.qualitycontrol.QualityControlTimeOutput;
import com.sanlly.production.service.QualityControlTimeService;
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
@Api(tags = "质检时间接口")
public class QualityControlTimeController {

    @Autowired
    private QualityControlTimeService qualityControlTimeService;

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 新增质检时间
     */
    @PostMapping("/addQualityControlTime")
    Result<Integer> addQualityControlTime(@RequestBody QualityControlTimeInputAdd qualityControlTimeInputAdd) {
        return Result.Success(qualityControlTimeService.addQualityControlTime(qualityControlTimeInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 修改质检时间
     */
    @PutMapping("/updateQualityControlTime")
    Result<Integer> updateQualityControlTime(@RequestBody QualityControlTimeInputUpdate qualityControlTimeInputUpdate) {
        return Result.Success(qualityControlTimeService.updateQualityControlTime(qualityControlTimeInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 删除质检时间
     */
    @DeleteMapping("/deleteQualityControlTime")
    Result<Integer> deleteQualityControlTime(Integer[] ids) {
        return Result.Success(qualityControlTimeService.deleteQualityControlTime(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 设置有效
     */
    @PutMapping("/validateQualityControlTime")
    Result<Integer> validateQualityControlTime(Integer[] ids, Integer valid) {
        return Result.Success(qualityControlTimeService.validateQualityControlTime(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    @GetMapping("/getQualityControlTimeList")
    Result<PagedList<QualityControlTimeOutput>> getQualityControlTimeList(Integer index, Integer size, String searchWords) {
        return Result.Success(qualityControlTimeService.getQualityControlTimeList(index, size, searchWords));
    }
}
