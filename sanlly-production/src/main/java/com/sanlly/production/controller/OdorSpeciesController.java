package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.odor.OdorSpeciesInput;
import com.sanlly.production.models.output.odor.OdorSpeciesOutput;
import com.sanlly.production.service.OdorSpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@Description: 异味种类
*@Author: zjd
*@date: 2019-09-27
*/
@RestController
public class OdorSpeciesController {

    @Autowired
    private OdorSpeciesService odorSpeciesService;

    @GetMapping("odorSpecies/pageList")
    public Result<PagedList<OdorSpeciesOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(odorSpeciesService.pageList(input, searchWords));
    }

    @PostMapping("odorSpecies/add")
    public Result add(@RequestBody OdorSpeciesInput input) {
        return Result.Success(odorSpeciesService.add(input));
    }

    @PutMapping("odorSpecies/update")
    public Result update(@RequestBody OdorSpeciesInput input) {
        return Result.Success(odorSpeciesService.update(input));
    }


    @DeleteMapping("odorSpecies/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(odorSpeciesService.multiDelete(ids));
    }


    @PutMapping("odorSpecies/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(odorSpeciesService.multiValid(ids,valid));
    }



}
