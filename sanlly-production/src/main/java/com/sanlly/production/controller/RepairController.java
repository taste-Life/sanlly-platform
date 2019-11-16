package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.repair.RepairInput;
import com.sanlly.production.models.output.repair.RepairOutput;
import com.sanlly.production.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 修理代码
*@Author: zjd
*@date: 2019-09-26
*/
@RestController
public class RepairController {

    @Autowired
    private RepairService repairService;


    /**
    *@Description: 修理分页列表
    *@Param: [index, size, searchWords]
    *@return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.repair.RepairOutput>>
    *@Author: zjd
    *@date: 2019-09-26
    */
    @GetMapping("repair/pageList")
    public Result<PagedList<RepairOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(repairService.pageList(input, searchWords));
    }

    @PostMapping("repair/add")
    public Result add(@RequestBody RepairInput input) {
        return Result.Success(repairService.add(input));
    }

    @PutMapping("repair/update")
    public Result update(@RequestBody RepairInput input) {
        return Result.Success(repairService.update(input));
    }


    @DeleteMapping("repair/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(repairService.multiDelete(ids));
    }


    @PutMapping("repair/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(repairService.multiValid(ids,valid));
    }

}
