package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.dailybidding.AddDailyBiddingInput;
import com.sanlly.purchase.models.input.dailybidding.AddDailyBiddingResultInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.service.DailyBiddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: DailyBiddingController
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class DailyBiddingController {
    @Autowired
    private DailyBiddingService matterBiddingService;
    /**
     *
     * @Description: 竞价采购分页列表
     * @param tenderCreateTimeStart
     * @param tenderCreateTimeEnd
     * @param purchaseCompany
     * @param tenderMethod
     * @param tenderStatus
     * @param tenderName
     * @param index
     * @param size
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyBidding")
    public Result getMatterBiddingPagedList(@RequestParam(required=false) Date tenderCreateTimeStart, @RequestParam(required=false) Date tenderCreateTimeEnd,
                                            @RequestParam(required=false) String purchaseCompany, @RequestParam(required=false) String tenderMethod,
                                            @RequestParam(required=false) String tenderStatus, @RequestParam(required=false) String tenderName,
                                            @RequestParam Integer index, @RequestParam Integer size){
        SearchDailyBIddingInput input = new SearchDailyBIddingInput(index,size);
        input.setPurchaseCompany(purchaseCompany);
        input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
        input.setTenderCreateTimeStart(tenderCreateTimeStart);
        input.setTenderMethod(tenderMethod);
        input.setTenderName(tenderName);
        input.setTenderStatus(tenderStatus);
        return Result.Success(matterBiddingService.getMatterBiddingPagedList(input));
    }
    /**
     *
     * @Description: 发布招标采购
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyBidding")
    public Result addMatterBidding(@RequestBody AddDailyBiddingInput input){
        matterBiddingService.addMatterBidding(input);
        return Result.Success();

    }


    /**
     *
     * @Description: 取得报价结果信息
     * @param purcMatterTenderPurchaseId
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyBidding/result")
    public Result getSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
        return Result.Success(matterBiddingService.getSupplierTenderList(purcMatterTenderPurchaseId));
    }


    /**
     *
     * @Description: 竞价结果处理
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyBidding/result")
    public Result addBiddingResult(@RequestBody AddDailyBiddingResultInput input){
        matterBiddingService.addBiddingResult(input);
        return Result.Success();

    }
}
