package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.output.workgrouptype.WorkGroupTypeOutput;
import com.sanlly.production.service.WorkGroupTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhq
 * @date 2019/10/28
 * @description 工作组类别接口
 */
@RestController
@Api(tags = "工作组类别接口")
public class WorkGroupTypeController {

    @Autowired
    WorkGroupTypeService workGroupTypeService;

    @GetMapping("/getWorkGroupTypeList")
    public Result<List<WorkGroupTypeOutput>> getWorkGroupTypeList() {
        return Result.Success(workGroupTypeService.getWorkGroupTypeList());
    }
}
