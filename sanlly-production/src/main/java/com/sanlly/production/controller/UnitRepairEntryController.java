package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.UnitRepairEntry;
import com.sanlly.production.models.input.unit.UnitRepairEntryInput;
import com.sanlly.production.models.output.unit.UnitRepairEntryOutput;
import com.sanlly.production.service.UnitRepairEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 机组相关修理明细
*@Author: zjd
*@date: 2019-09-29
*/
@RestController
public class UnitRepairEntryController {

    @Autowired
    private UnitRepairEntryService unitRepairEntryService;

    @GetMapping("unitRepairEntry/pageList")
    public Result<PagedList<UnitRepairEntryOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(unitRepairEntryService.pageList(input, searchWords));
    }

    @PostMapping("unitRepairEntry/add")
    public Result add(@RequestBody UnitRepairEntryInput input) {
        return Result.Success(unitRepairEntryService.add(input));
    }

    @PutMapping("unitRepairEntry/update")
    public Result update(@RequestBody UnitRepairEntryInput input) {
        return Result.Success(unitRepairEntryService.update(input));
    }


    @DeleteMapping("unitRepairEntry/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(unitRepairEntryService.multiDelete(ids));
    }


    @PutMapping("unitRepairEntry/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(unitRepairEntryService.multiValid(ids,valid));
    }

    /**
    *@Description: 获取页面下来列表所需要的值
    *@Param: []
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-29
    */
    @GetMapping("unitRepairEntry/selectList")
    public Result selectList(){
        return Result.Success(unitRepairEntryService.selectList());
    }
}
