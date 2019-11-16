package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.parts.PartsTypeInput;
import com.sanlly.production.models.output.parts.PartsTypeOutput;
import com.sanlly.production.service.PartsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 部件大类
*@Author: zjd
*@date: 2019-09-27
*/
@RestController
public class PartsTypeController {

    @Autowired
    private PartsTypeService partsTypeService;


    @GetMapping("partsType/pageList")
    public Result<PagedList<PartsTypeOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(partsTypeService.pageList(input, searchWords));
    }

    @PostMapping("partsType/add")
    public Result add(@RequestBody PartsTypeInput input) {
        return Result.Success(partsTypeService.add(input));
    }

    @PutMapping("partsType/update")
    public Result update(@RequestBody PartsTypeInput input) {
        return Result.Success(partsTypeService.update(input));
    }


    @DeleteMapping("partsType/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(partsTypeService.multiDelete(ids));
    }


    @PutMapping("partsType/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(partsTypeService.multiValid(ids,valid));
    }

}
