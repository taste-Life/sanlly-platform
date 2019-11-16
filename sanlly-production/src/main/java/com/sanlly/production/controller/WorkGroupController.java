package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.workgroup.WorkGroupInputAdd;
import com.sanlly.production.models.input.workgroup.WorkGroupInputUpdate;
import com.sanlly.production.models.output.workgroup.WorkGroupOutput;
import com.sanlly.production.service.WorkGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author zhq
 * @date 2019/10/25
 * @description 工作组类别配置表
 */
@RestController
@Api(tags = "工作组类别配置表api接口")
public class WorkGroupController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkGroupController.class);

    @Autowired
    WorkGroupService workGroupService;

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 新增工作组类别配置记录
     */
    @PostMapping("/workGroupAdd")
    @ApiOperation("新增工作组类别配置记录接口")
    public Result<Integer> addWorkGroup(@RequestBody @Valid WorkGroupInputAdd workGroupInputAdd) {

        return Result.Success(workGroupService.addWorkGroup(workGroupInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 更新工作组类别配置记录
     */
    @PutMapping("/workGroupUpdate")
    @ApiOperation("更新工作组类别配置记录接口")
    public Result<Integer> updateWorkGroup(@RequestBody WorkGroupInputUpdate workGroupInputUpdate) {
        return Result.Success(workGroupService.updateWorkGroup(workGroupInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 删除工作组类别配置记录
     */
    @DeleteMapping("/workGroupDelete")
    @ApiOperation("删除工作组类别配置记录接口")
    public Result<Integer> deleteWorkGroup(Integer[] ids) {
        return Result.Success(workGroupService.deleteWorkGroup(ids));
    }

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 分页查询工作组类别配置记录
     */
    @GetMapping("/workGroupSelect")
    @ApiOperation("分页查询工作组类别配置记录接口")
    public Result<PagedList<WorkGroupOutput>> selectWorkGroup(@RequestParam("size") Integer pageSize, @RequestParam("index") Integer pageNum, String searchWords) {
        Assert.notNull(pageSize, "pageSize");
        Assert.notNull(pageNum, "pageNum 不能为空");
        LOGGER.info("每页{}，当前页{}，关键字{}", pageSize, pageNum, searchWords);
        return Result.Success(workGroupService.getWorkGroups(pageSize, pageNum, searchWords));
    }

    /**
     * @author zhq
     * @date 2019/10/29
     * @description 批量设置有效无效
     */
    @PutMapping("/multiValidate")
    @ApiOperation("批量设置有效无效接口")
    public Result<Integer> multiValidate(Integer[] ids, Integer valid) {
        return Result.Success(workGroupService.multiValidate(ids, valid));
    }


}
