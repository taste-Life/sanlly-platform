package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基础表维护相关
 * zjd
 */
@RestController
@RequestMapping("baseInfo")
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @GetMapping("/containerUser/list")
    public Result<PagedList<ContainerUserOutput>> list(@RequestParam(required = true, value = "index") Integer index,
                                                       @RequestParam(required = true, value = "size") Integer size,
                                                       @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(baseInfoService.containerUserList(input,searchWords));
    }


    
}
