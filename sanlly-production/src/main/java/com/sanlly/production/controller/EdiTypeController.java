package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.edi.EdiTypeInput;
import com.sanlly.production.models.output.edi.EdiTypeOutput;
import com.sanlly.production.service.EdiTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: edi类型
*@Author: zjd
*@date: 2019-09-27
*/
@RestController
public class EdiTypeController {

    @Autowired
    private EdiTypeService ediTypeService;

    @GetMapping("ediType/pageList")
    public Result<PagedList<EdiTypeOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(ediTypeService.pageList(input, searchWords));
    }

    @PostMapping("ediType/add")
    public Result add(@RequestBody EdiTypeInput input) {
        return Result.Success(ediTypeService.add(input));
    }

    @PutMapping("ediType/update")
    public Result update(@RequestBody EdiTypeInput input) {
        return Result.Success(ediTypeService.update(input));
    }


    @DeleteMapping("ediType/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(ediTypeService.multiDelete(ids));
    }


    @PutMapping("ediType/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(ediTypeService.multiValid(ids,valid));
    }

}
