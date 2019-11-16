package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.bidding.SearchMatterBiddingInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.supplierbidding.AddSupplierDailyBiddingInput;
import com.sanlly.purchase.models.input.supplierbidding.AddsupplierBiddingInput;
import com.sanlly.purchase.service.SupplierDailyInquiryService;
import com.sanlly.purchase.service.SupplierInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description: 供应商询价控制器
 * @ClassName: SupplierDailyInquiryController
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class SupplierInquiryController {
    @Autowired
    SupplierDailyInquiryService supplierDailyInquiryService;
@Autowired
private SupplierInquiryService supplierInquiryService;
    /**
     * 获取供应商竞价列表
     *
     * @return
     */
    @GetMapping("/supplierinquiry/list")
    public Result getSupplierBIddingList(@RequestParam(required = false) Date tenderCreateTimeStart, @RequestParam(required = false) Date tenderCreateTimeEnd,
                                         @RequestParam(required = false) String purchaseCompany, @RequestParam(required = false) String tenderMethod,
                                         @RequestParam(required = false) String tenderStatus, @RequestParam(required = false) String tenderName,
                                         @RequestParam Integer index, @RequestParam Integer size) {
        SearchMatterBiddingInput input = new SearchMatterBiddingInput(index, size);
        input.setPurchaseCompany(purchaseCompany);
        input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
        input.setTenderCreateTimeStart(tenderCreateTimeStart);
        input.setTenderName(tenderName);
        //input.setTenderStatus(tenderStatus);
        return Result.Success(supplierInquiryService.getSupplerBiddingList(input));
    }

    /**
     * 获取竞价详情
     *
     * @return
     */
    @GetMapping("/supplierinquiry/detail")
    public Result getSupplierBiddingListDetail(@RequestParam Integer purcMatterTenderPurchaseId) {
        return Result.Success(supplierInquiryService.getSupplierBiddingListDetail(purcMatterTenderPurchaseId)
        );
    }

    /**
     * 供应商竞价
     *
     * @return
     */
    @PostMapping("/supplierinquiry/add")
    public Result SupplierBIdding(@RequestBody AddsupplierBiddingInput input) {


        return supplierInquiryService.saveBiddingResult(input);
    }

    /**
     * 签到
     */
    @GetMapping("/supplierinquiry/sign")
    public Result SupplerBiddngSign(@RequestParam(required = true) Integer pureMatterPurchaseId) {
            return supplierInquiryService.supplierSign(pureMatterPurchaseId);


    }

    /**
     * 获取供应商日常竞价列表
     *
     * @return
     */
    @GetMapping("/supplierdailyinquiry/list")
    public Result getSupplierDailyBiddingList(@RequestParam(required = false) Date tenderCreateTimeStart, @RequestParam(required = false) Date tenderCreateTimeEnd,
                                              @RequestParam(required = false) String purchaseCompany, @RequestParam(required = false) String tenderMethod,
                                              @RequestParam(required = false) String tenderStatus, @RequestParam(required = false) String tenderName,
                                              @RequestParam Integer index, @RequestParam Integer size) {
        SearchDailyBIddingInput input = new SearchDailyBIddingInput(index, size);
        input.setPurchaseCompany(purchaseCompany);
        input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
        input.setTenderCreateTimeStart(tenderCreateTimeStart);
        input.setTenderName(tenderName);
        input.setTenderStatus(tenderStatus);


        return Result.Success(supplierDailyInquiryService.getSupplerBiddingList(input));
    }

    /**
     * 获取供应商报价明细
     *
     * @return
     */
    @GetMapping("/supplierdailyinquiry/detail")
    public Result getSupplierDailyBiddingDetail(@RequestParam Integer purcMatterTenderPurchaseId) {

        return Result.Success(supplierDailyInquiryService.getSupplierBiddingListDetail(purcMatterTenderPurchaseId));
    }

    /**
     * 保存日常采购报价记录
     *
     * @param input
     * @return
     */
    @PostMapping("/supplierdailyinquiry/add")
    public Result saveSupplierDailyBiddingResult(@RequestBody AddSupplierDailyBiddingInput input) {

        return supplierDailyInquiryService.saveBiddingResult(input);
    }
}
