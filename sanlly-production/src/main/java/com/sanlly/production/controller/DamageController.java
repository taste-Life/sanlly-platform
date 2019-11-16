package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.damage.DamageInput;
import com.sanlly.production.models.output.damage.DamageOutput;
import com.sanlly.production.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 损坏代码基本信息
 * @Author: zjd
 * @date: 2019-09-26
 */
@RestController
public class DamageController {

    @Autowired
    private DamageService damageService;

    /**
     * @Description: 损坏代码分页列表
     * @Param: [index, size, searchWords]
     * @return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.damage.DamageOutput>>
     * @Author: zjd
     * @date: 2019-09-26
     */
    @GetMapping("damage/pageList")
    public Result<PagedList<DamageOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(damageService.pageList(input, searchWords));
    }

    @PostMapping("damage/add")
    public Result add(@RequestBody DamageInput input) {
        return Result.Success(damageService.add(input));
    }

    @PutMapping("damage/update")
    public Result update(@RequestBody DamageInput input) {
        return Result.Success(damageService.update(input));
    }

    /**
     * @Description: 批量删除
     * @Param: [ids]
     * @return: com.sanlly.common.models.output.Result
     * @Author: zjd
     * @date: 2019-09-26
     */
    @DeleteMapping("damage/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(damageService.multiDelete(ids));
    }

    /**
     *@Description: 批量设置有效性
     *@Param: [ids, valid]
     *@return: com.sanlly.common.models.output.Result
     *@Author: zjd
     *@date: 2019-09-26
     */
    @PutMapping("damage/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(damageService.multiValid(ids,valid));
    }

}
