package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.delay.DelayReceiveTimeInput;
import com.sanlly.production.models.output.delay.DelayReceiveTimeOutput;
import com.sanlly.production.service.DelayReceiveTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 延期领料时间
*@Author: zjd
*@date: 2019-09-30
*/
@RestController
public class DelayReceiveTimeController {

    @Autowired
    private DelayReceiveTimeService delayReceiveTimeService;

    @GetMapping("delayReceiveTime/pageList")
    public Result<PagedList<DelayReceiveTimeOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(delayReceiveTimeService.pageList(input, searchWords));
    }

    @PostMapping("delayReceiveTime/add")
    public Result add(@RequestBody DelayReceiveTimeInput input) {
        return Result.Success(delayReceiveTimeService.add(input));
    }

    @PutMapping("delayReceiveTime/update")
    public Result update(@RequestBody DelayReceiveTimeInput input) {
        return Result.Success(delayReceiveTimeService.update(input));
    }


    @DeleteMapping("delayReceiveTime/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(delayReceiveTimeService.multiDelete(ids));
    }


    @PutMapping("delayReceiveTime/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(delayReceiveTimeService.multiValid(ids,valid));
    }

}
