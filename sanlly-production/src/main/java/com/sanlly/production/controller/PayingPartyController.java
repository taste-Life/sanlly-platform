package com.sanlly.production.controller;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.paying.PayingPartyInput;
import com.sanlly.production.models.output.paying.PayingPartyOutput;
import com.sanlly.production.service.PayingPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 付费方基本信息
 * @Param:
 * @return:
 * @Author: zjd
 * @date: 2019-09-26
 */
@RestController
public class PayingPartyController {

    @Autowired
    private PayingPartyService payingPartyService;

    /**
     * @Description: 付费方分页列表
     * @Param: [index, size, searchWords]
     * @return: com.sanlly.common.models.output.Result<com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.paying.PayingPartyOutput>>
     * @Author: zjd
     * @date: 2019-09-26
     */
    @GetMapping("payingParty/pageList")
    public Result<PagedList<PayingPartyOutput>> pageList(
            @RequestParam(required = true, value = "index") Integer index,
            @RequestParam(required = true, value = "size") Integer size,
            @RequestParam(required = false, value = "searchWords") String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(payingPartyService.pageList(input, searchWords));
    }

    @PostMapping("payingParty/add")
    public Result add(@RequestBody PayingPartyInput input) {
        return Result.Success(payingPartyService.add(input));
    }

    @PutMapping("payingParty/update")
    public Result update(@RequestBody PayingPartyInput input) {
        return Result.Success(payingPartyService.update(input));
    }

    /**
     * @Description: 批量删除
     * @Param: [ids]
     * @return: com.sanlly.common.models.output.Result
     * @Author: zjd
     * @date: 2019-09-26
     */
    @DeleteMapping("payingParty/multiDelete")
    public Result multiDelete(Integer[] ids) {
        return Result.Success(payingPartyService.multiDelete(ids));
    }

    /**
    *@Description: 批量设置有效性
    *@Param: [ids, valid]
    *@return: com.sanlly.common.models.output.Result
    *@Author: zjd
    *@date: 2019-09-26
    */
    @PutMapping("payingParty/multiValid")
    public  Result multiValid(Integer[] ids,int valid){
        return Result.Success(payingPartyService.multiValid(ids,valid));
    }


}
