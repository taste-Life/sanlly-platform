package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.dailydemand.AddDailyDemandInput;
import com.sanlly.purchase.models.input.dailydemand.EditDemandInput;
import com.sanlly.purchase.models.input.dailydemand.SearcherDailyDemandInput;
import com.sanlly.purchase.service.DailyDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 日常采购需求列表
 * @ClassName: DailyDemandController
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class DailyDemandController {
    @Autowired
    DailyDemandService dailyDemandService;

    @GetMapping("/DailyDemand")
    public Result matterDemandPagedList(@RequestParam(required = false) String auditStatus, @RequestParam(required = false) String productNum, @RequestParam(required = false) String isCreateOrder, @RequestParam(required = false) String purchaseCompany, @RequestParam Integer index, @RequestParam Integer size) {
        SearcherDailyDemandInput searcherDailyDemandInput = new SearcherDailyDemandInput();
        searcherDailyDemandInput.setPageIndex(index);
        searcherDailyDemandInput.setPageSize(size);
        searcherDailyDemandInput.setProductNum(productNum);
        searcherDailyDemandInput.setPurchaseCompany(purchaseCompany);
        searcherDailyDemandInput.setIsCreateOrder(isCreateOrder);
        searcherDailyDemandInput.setAuditStatus(auditStatus);
        return Result.Success(dailyDemandService.getDailyDemandPagedList(searcherDailyDemandInput));
    }
    /**
     * 获取选择的采购需求
     * @param matterDemandIds
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyDemand/selected")
    public Result getMatterDemand(@RequestParam Integer[] matterDemandIds){
        return Result.Success(dailyDemandService.getDailyDemand(matterDemandIds));
    }
    /**
     * 新增日常采购需求
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/DailyDemand")
    public Result addDailyDemand(@RequestBody AddDailyDemandInput input) {
        dailyDemandService.addDailyDemand(input);
        return Result.Success();
    }

    /**
     * 删除采购需求
     *
     * @param
     * @return
     */
    @SuppressWarnings("rawtypes")
    @DeleteMapping("/DailyDemand")
    public Result delMatterDemand(@RequestParam Integer[] matterDemandIds) {
        dailyDemandService.delMatterDemand(matterDemandIds);
        return Result.Success();
    }

    /**
     * 审核采购需求
     *
     * @param matterDemandIds
     * @param auditStatus
     * @param reject
     * @return
     */
    @SuppressWarnings("rawtypes")

    @PutMapping("/DailyDemandAudit")
    public Result auditMatterDemand(@RequestParam Integer[] matterDemandIds, @RequestParam String auditStatus, @RequestParam(required = false) String reject) {
        dailyDemandService.auditMatterDemand(matterDemandIds, auditStatus, reject);
        return Result.Success();
    }

    /**
     * 修改采购需求
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/DailyDemand")
    public Result updateDailyDemand(@RequestBody EditDemandInput input) {
        dailyDemandService.updateMatterDemand(input);
        return Result.Success();
    }


}
