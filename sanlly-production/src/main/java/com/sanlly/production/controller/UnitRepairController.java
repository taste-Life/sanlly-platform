package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.unit.UnitRepairInput;
import com.sanlly.production.models.output.unit.UnitRepairOutput;
import com.sanlly.production.service.UnitRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 机组相关修理
*@Author: zjd
*@date: 2019-09-28
*/
@RestController
public class UnitRepairController {

    @Autowired
    private UnitRepairService unitRepairService;

    @GetMapping("unitRepair/pageList")
    public Result<PagedList<UnitRepairOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(unitRepairService.pageList(input, searchWords));
    }

    @PostMapping("unitRepair/add")
    public Result add(@RequestBody UnitRepairInput input) {
        return Result.Success(unitRepairService.add(input));
    }

    @PutMapping("unitRepair/update")
    public Result update(@RequestBody UnitRepairInput input) {
        return Result.Success(unitRepairService.update(input));
    }


    @DeleteMapping("unitRepair/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(unitRepairService.multiDelete(ids));
    }


    @PutMapping("unitRepair/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(unitRepairService.multiValid(ids,valid));
    }
}
