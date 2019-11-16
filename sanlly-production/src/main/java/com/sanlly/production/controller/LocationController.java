package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.location.LocationInputAdd;
import com.sanlly.production.models.input.location.LocationInputUpdate;
import com.sanlly.production.models.output.location.LocationOutput;
import com.sanlly.production.service.LocationService;
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
 * @date 2019/11/6
 * @description
 */
@RestController
@Api(tags = "码头位置接口")
public class LocationController {

    @Autowired
    LocationService locationService;

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 新增码头位置
     */
    @PostMapping("/addLocation")
    public Result<Integer> addLocation(@RequestBody LocationInputAdd locationInputAdd) {
        return Result.Success(locationService.addLocation(locationInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 修改码头位置
     */
    @PutMapping("/updateLocation")
    public Result<Integer> updateLocation(@RequestBody LocationInputUpdate locationInputUpdate) {
        return Result.Success(locationService.updateLocation(locationInputUpdate));

    }

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 删除码头位置
     */
    @DeleteMapping("/deleteLocation")
    public Result<Integer> deleteLocation(Integer[] ids) {
        return Result.Success(locationService.deleteLocation(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    @PutMapping("/validateLocation")
    public Result<Integer> validateLocation(Integer[] ids, Integer valid) {
        return Result.Success(locationService.validateLocation(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 分页查询
     */
    @GetMapping("/getLocationList")
    public Result<PagedList<LocationOutput>> getLocationList(Integer index, Integer size, String searchWords) {
        return Result.Success(locationService.getLocationList(index, size, searchWords));
    }
}
