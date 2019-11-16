package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.yardcontainertype.YardContainerTypeInputAdd;
import com.sanlly.production.models.input.yardcontainertype.YardContainerTypeInputUpdate;
import com.sanlly.production.models.output.yardcontainertype.YardContainerTypeOutput;
import com.sanlly.production.service.YardContainerTypeService;
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
 * @date 2019/11/5
 * @description
 */
@RestController
@Api(tags = "场站好坏箱类型接口")
public class YardContainerTypeController {

    @Autowired
    private YardContainerTypeService yardContainerTypeService;

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 新增好坏箱类型
     */
    @PostMapping("/addYardContainerType")
    public Result<Integer> addYardContainerType(@RequestBody YardContainerTypeInputAdd yardContainerTypeInputAdd) {
        return Result.Success(yardContainerTypeService.addYardContainerType(yardContainerTypeInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 修改好坏箱类型
     */
    @PutMapping("/updateYardContainerType")
    public Result<Integer> updateYardContainerType(@RequestBody YardContainerTypeInputUpdate yardContainerTypeInputUpdate) {
        return Result.Success(yardContainerTypeService.updateYardContainerType(yardContainerTypeInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 删除好坏箱类型
     */
    @DeleteMapping("/deleteYardContainerType")
    public Result<Integer> deleteYardContainerType(Integer[] ids) {
        return Result.Success(yardContainerTypeService.deleteYardContainerType(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 设置有效
     */
    @PutMapping("/validateYardContainerType")
    public Result<Integer> validateYardContainerType(Integer[] ids, Integer valid) {
        return Result.Success(yardContainerTypeService.validateYardContainerType(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 分页查询
     */
    @GetMapping("/getYardContainerTypeList")
    public Result<PagedList<YardContainerTypeOutput>> getYardContainerTypeList(Integer index, Integer size, String searchWords) {
        return Result.Success(yardContainerTypeService.getYardContainerTypeList(index, size, searchWords));
    }

}
