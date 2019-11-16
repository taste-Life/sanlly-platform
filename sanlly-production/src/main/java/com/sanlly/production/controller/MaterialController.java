package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.material.MaterialInput;
import com.sanlly.production.models.output.material.MaterialOutput;
import com.sanlly.production.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 材质代码
*@Author: zjd
*@date: 2019-09-26
*/
@RestController
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("material/pageList")
    public Result<PagedList<MaterialOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(materialService.pageList(input, searchWords));
    }

    @PostMapping("material/add")
    public Result add(@RequestBody MaterialInput input) {
        return Result.Success(materialService.add(input));
    }

    @PutMapping("material/update")
    public Result update(@RequestBody MaterialInput input) {
        return Result.Success(materialService.update(input));
    }


    @DeleteMapping("material/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(materialService.multiDelete(ids));
    }


    @PutMapping("material/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(materialService.multiValid(ids,valid));
    }

}
