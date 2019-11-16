package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.output.basicfield.BasicFieldOutput;
import com.sanlly.production.service.BasicFieldService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhq
 * @date 2019/11/6
 * @description 自定义字段表接口
 */
@RestController
@Api(tags = "自定义字段表接口")
public class BasicFieldController {

    @Autowired
    private BasicFieldService basicFieldService;

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 获取全部自定义字段
     */
    @GetMapping("/getAllBasicField")
    public Result<List<BasicFieldOutput>> getAllBasicField() {
        return Result.Success(basicFieldService.getBasicField());
    }
}
