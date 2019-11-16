package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.reason.ReasonInput;
import com.sanlly.production.models.output.reason.ReasonOutput;
import com.sanlly.production.service.ReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 维护原因
*@Author: zjd
*@date: 2019-09-28
*/
@RestController
public class ReasonController {

    @Autowired
    private ReasonService reasonService;

    @GetMapping("reason/pageList")
    public Result<PagedList<ReasonOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(reasonService.pageList(input, searchWords));
    }

    @PostMapping("reason/add")
    public Result add(@RequestBody ReasonInput input) {
        return Result.Success(reasonService.add(input));
    }

    @PutMapping("reason/update")
    public Result update(@RequestBody ReasonInput input) {
        return Result.Success(reasonService.update(input));
    }


    @DeleteMapping("reason/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(reasonService.multiDelete(ids));
    }


    @PutMapping("reason/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(reasonService.multiValid(ids,valid));
    }



}
