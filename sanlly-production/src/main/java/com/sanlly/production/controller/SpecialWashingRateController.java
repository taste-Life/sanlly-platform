package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.rate.SpecialWashingRateInput;
import com.sanlly.production.models.output.rate.SpecialWashingRateOutput;
import com.sanlly.production.service.SpecialWashingRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 特殊货物洗箱费率
*@Author: zjd
*@date: 2019-09-30
*/

@RestController
public class SpecialWashingRateController {

    @Autowired
    private  SpecialWashingRateService specialWashingRateService;



    @GetMapping("specialWashingRate/pageList")
    public Result<PagedList<SpecialWashingRateOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(specialWashingRateService.pageList(input, searchWords));
    }

    @PostMapping("specialWashingRate/add")
    public Result add(@RequestBody SpecialWashingRateInput input) {
        return Result.Success(specialWashingRateService.add(input));
    }

    @PutMapping("specialWashingRate/update")
    public Result update(@RequestBody SpecialWashingRateInput input) {
        return Result.Success(specialWashingRateService.update(input));
    }


    @DeleteMapping("specialWashingRate/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(specialWashingRateService.multiDelete(ids));
    }


    @PutMapping("specialWashingRate/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(specialWashingRateService.multiValid(ids,valid));
    }


}
