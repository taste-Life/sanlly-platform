package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.yardperiod.YardPeriodInputAdd;
import com.sanlly.production.models.input.yardperiod.YardPeriodInputUpdate;
import com.sanlly.production.models.output.yardperiod.YardPeriodOutput;
import com.sanlly.production.service.YardPeriodService;
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
@Api(tags = "场站记录时段接口")
public class YardPeriodSettingController {

    @Autowired
    private YardPeriodService yardPeriodService;

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 新增场站记录时段
     */
    @PostMapping("/addYardPeriod")
    public Result<Integer> addYardPeriod(@RequestBody YardPeriodInputAdd yardPeriodInputAdd) {
        return Result.Success(yardPeriodService.addYardPeriod(yardPeriodInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 修改场站记录时段
     */
    @PutMapping("/updateYardPeriod")
    public Result<Integer> updateYardPeriod(@RequestBody YardPeriodInputUpdate yardPeriodInputUpdate) {
        return Result.Success(yardPeriodService.updateYardPeriod(yardPeriodInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 删除场站记录时段
     */
    @DeleteMapping("/deleteYardPeriod")
    public Result<Integer> deleteYardPeriod(Integer[] ids) {
        return Result.Success(yardPeriodService.deleteYardPeriod(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 设置有效性
     */
    @PutMapping("/validateYardPeriod")
    public Result<Integer> validateYardPeriod(Integer[] ids, Integer valid) {
        return Result.Success(yardPeriodService.validateYardPeriod(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    @GetMapping("/getYardPeriodList")
    public Result<PagedList<YardPeriodOutput>> getYardPeriodList(Integer index, Integer size, String searchWords) {
        return Result.Success(yardPeriodService.getYarPeriodList(index, size, searchWords));
    }
}
