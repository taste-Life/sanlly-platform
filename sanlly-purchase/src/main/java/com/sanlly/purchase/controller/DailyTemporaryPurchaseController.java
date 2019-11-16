package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.dailydemand.AddDailyTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.dailydemand.SearchDailyPurchaseInput;
import com.sanlly.purchase.models.output.dailydemand.DailyPurchaseOutput;
import com.sanlly.purchase.service.DailyTemporaryPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: TODO
 * @ClassName: DailyTemporaryPurchaseController
 * @Date: 2019/8/27 9:40
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class DailyTemporaryPurchaseController {
    @Autowired
    private DailyTemporaryPurchaseService matterTemporaryPurchaseService;

    /**
     * 采购单分页列表
     * @param demandNo
     * @param purchaseCompany
     * @param sparePartsNo
     * @param supplier
     * @param auditStatus
     * @param purchasingPattern
     * @param index
     * @param size
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyPurchase")
    public Result matterPurchasePagedList(@RequestParam(required=false) String demandNo, @RequestParam(required=false) String purchaseCompany,
                                          @RequestParam(required=false) String productName, @RequestParam(required=false) String supplier,
                                          @RequestParam(required=false) String auditStatus, @RequestParam(required=false) String purchasingPattern,
                                          @RequestParam Integer index, @RequestParam Integer size){
        SearchDailyPurchaseInput input = new SearchDailyPurchaseInput(index,size);
        input.setDemandNo(demandNo);
        input.setPurchaseCompany(purchaseCompany);
        input.setProductName(productName);
        input.setSupplier(supplier);
        input.setAuditStatus(auditStatus);
        input.setPurchasingPattern(purchasingPattern);
        return Result.Success(matterTemporaryPurchaseService.getDailyPurchasePagedList(input));
    }


    /**
     * 采购单审核分页列表
     * @param demandNo
     * @param purchaseCompany
     * @param sparePartsNo
     * @param supplier
     * @param auditStatus
     * @param purchasingPattern
     * @param index
     * @param size
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyPurchaseAudit")
    public Result getAuditPurchasePagedList(@RequestParam(required=false) String demandNo,@RequestParam(required=false) String purchaseCompany,
                                            @RequestParam(required=false) String productName,@RequestParam(required=false) String supplier,
                                            @RequestParam(required=false) String auditStatus,@RequestParam(required=false) String purchasingPattern,
                                            @RequestParam Integer index,@RequestParam Integer size){
        SearchDailyPurchaseInput input = new SearchDailyPurchaseInput(index,size);
        input.setDemandNo(demandNo);
        input.setPurchaseCompany(purchaseCompany);
        input.setProductName(productName);
        input.setSupplier(supplier);
        input.setAuditStatus(auditStatus);
        input.setPurchasingPattern(purchasingPattern);
        return Result.Success(matterTemporaryPurchaseService.getAuditPurchasePagedList(input));
    }

    /**
     * 直接采购生成采购单
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyPurchase")
    public Result addMatterTemporaryPurchase(@RequestBody AddDailyTemporaryPurchaseInput input) throws Exception {
           return matterTemporaryPurchaseService.addDailyPurchase(input);

    }

    /**
     * 采购审核或驳回
     * @param status
     * @param purcMatterTemporaryPurchaseId
     * @param processInstanceIds
     * @param taskIds
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/dailyPurchaseAudit")
    public Result auditMatterPurchase(@RequestParam(required=false) String status, @RequestParam Integer[] purcMatterTemporaryPurchaseId, @RequestParam String[] processInstanceIds, @RequestParam String[] taskIds) {
        if(status.equals("1")) {
            matterTemporaryPurchaseService.auditMatterPurchase(purcMatterTemporaryPurchaseId, processInstanceIds, taskIds);
        }else {
            matterTemporaryPurchaseService.rejectMatterPurchase(purcMatterTemporaryPurchaseId, processInstanceIds, taskIds);
        }
        return Result.Success();
    }
    /**
     *
     * @Description: 取得采购单编辑信息
     * @param purcMatterTemporaryPurchaseId
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyPurchase/info")
    public Result getMatterTemporaryPurchaseInfo(@RequestParam Integer purcMatterTemporaryPurchaseId) {
        return Result.Success(matterTemporaryPurchaseService.getMatterTemporaryPurchaseInfo(purcMatterTemporaryPurchaseId));
    }

    /**
     * 直接采购生成采购单
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/dailyPurchase")
    public Result editMatterTemporaryPurchase(@RequestBody DailyPurchaseOutput input){
        try {
            matterTemporaryPurchaseService.editDailyPurchase(input);
            return Result.Success();
        }catch(Exception e) {
            e.printStackTrace();
            return Result.Error("错误");
        }
    }
}
