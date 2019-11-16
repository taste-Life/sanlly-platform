package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.dailyInquiry.AddDailyInquiryInput;
import com.sanlly.purchase.models.input.dailyInquiry.AddDailyInquiryResultInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.inquiry.AddReInquiryInput;
import com.sanlly.purchase.service.DailyInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description: 询价采购Controller
 * @ClassName: DailyInquiryContoller
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class DailyInquiryContoller {
    @Autowired
    private DailyInquiryService dailyInquiryService;
    /**
     *
     * @Description: 询价采购分页列表
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
    @GetMapping("/dailyInquiry")
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
        return Result.Success(dailyInquiryService.getMatterBiddingPagedList(input));
    }
    /**
     *
     * @Description: 发布询价采购
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyInquiry")
    public Result addMatterBidding(@RequestBody AddDailyInquiryInput input){
        dailyInquiryService.addMatterBidding(input);
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
    @GetMapping("/dailyInquiry/result")
    public Result getSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
        return Result.Success(dailyInquiryService.getSupplierTenderList(purcMatterTenderPurchaseId));
    }


    /**
     *
     * @Description: 询价结果处理
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyInquiry/result")
    public Result addBiddingResult(@RequestBody AddDailyInquiryResultInput input){
        dailyInquiryService.addBiddingResult(input);
        return Result.Success();

    }
    /**
     *
     * @Description: 重新询价
     * @param purcMatterTenderPurchaseId
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyInquiry/reInquiry")
    public Result getReMatterInquiry(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
        return Result.Success(dailyInquiryService.getReMatterInquiry(purcMatterTenderPurchaseId));
    }

    /**
     * 添加重新询价
     * @param input
     * @return
     */
    @PostMapping("/dailyInquiry/addReInquiry")
    public Result getReMatterInquiry(@RequestBody AddDailyInquiryInput input) {
        dailyInquiryService.addMatterReInquiry(input);
        return Result.Success();
    }
    /**
     *
     * @Description: 再次询价
     * @param input
     * @return Result
     * @throws Exception
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyInquiry/reInquiry")
    public Result addReInquiry(@RequestBody AddReInquiryInput input) throws Exception{
        dailyInquiryService.addReInquiry(input);
        return Result.Success();

    }
}
