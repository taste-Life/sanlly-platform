package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.bidding.SearchMatterBiddingInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.supplierbidding.AddSupplierDailyBiddingInput;
import com.sanlly.purchase.models.input.supplierbidding.AddsupplierBiddingInput;
import com.sanlly.purchase.service.SupplierBiddingService;
import com.sanlly.purchase.service.SupplierDailyBiddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description: 供应商竞价
 * @ClassName: SupplierbiddingController
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class SupplierBiddingController {
    @Autowired
    SupplierBiddingService supplierBiddingService;
    @Autowired
    SupplierDailyBiddingService supplierDailyBiddingService;
    /**
     * 获取供应商竞价列表
     * @return
     */
    @GetMapping("/supplierbidding/list")
    public Result getSupplierBIddingList(@RequestParam(required=false) Date tenderCreateTimeStart, @RequestParam(required=false) Date tenderCreateTimeEnd,
                                         @RequestParam(required=false) String purchaseCompany, @RequestParam(required=false) String tenderMethod,
                                         @RequestParam(required=false) String tenderStatus, @RequestParam(required=false) String tenderName,
                                         @RequestParam Integer index, @RequestParam Integer size){
        SearchMatterBiddingInput input = new SearchMatterBiddingInput(index,size);
        input.setPurchaseCompany(purchaseCompany);
        input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
        input.setTenderCreateTimeStart(tenderCreateTimeStart);
        input.setTenderName(tenderName);
        //input.setTenderStatus(tenderStatus);
        return  Result.Success(supplierBiddingService.getSupplerBiddingList(input));
    }

    /**
     * 获取竞价详情
     * @return
     */
    @GetMapping("/supplierbidding/detail")
    public Result getSupplierBiddingListDetail(@RequestParam Integer purcMatterTenderPurchaseId){
        return  Result.Success(supplierBiddingService.getSupplierBiddingListDetail(purcMatterTenderPurchaseId)
        );
    }

    /**
     * 供应商竞价
     * @return
     */
    @PostMapping("/supplierbidding/add")
    public  Result SupplierBIdding(@RequestBody AddsupplierBiddingInput input){


        return  supplierBiddingService.saveBiddingResult(input);
    }
/**
 * 签到
 */
@GetMapping("/supplierbidding/sign")
public  Result SupplerBiddngSign(@RequestParam(required = true)Integer pureMatterPurchaseId){
    return  supplierBiddingService.supplierSign(pureMatterPurchaseId);
}

    /**
     * 获取供应商日常竞价列表
     * @return
     */
    @GetMapping("/supplierdailybidding/list")
    public  Result getSupplierDailyBiddingList(@RequestParam(required=false) Date tenderCreateTimeStart, @RequestParam(required=false) Date tenderCreateTimeEnd,
                                               @RequestParam(required=false) String purchaseCompany, @RequestParam(required=false) String tenderMethod,
                                               @RequestParam(required=false) String tenderStatus, @RequestParam(required=false) String tenderName,
                                               @RequestParam Integer index, @RequestParam Integer size){
        SearchDailyBIddingInput input= new SearchDailyBIddingInput(index ,size);
        input.setPurchaseCompany(purchaseCompany);
        input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
        input.setTenderCreateTimeStart(tenderCreateTimeStart);
        input.setTenderName(tenderName);
        input.setTenderStatus(tenderStatus);



    return  Result.Success(supplierDailyBiddingService.getSupplerBiddingList(input));
}

    /**
     * 获取供应商报价明细
     * @return
     */
    @GetMapping("/supplierdailybidding/detail")
    public  Result getSupplierDailyBiddingDetail(@RequestParam Integer purcMatterTenderPurchaseId){

        return  Result.Success(supplierDailyBiddingService.getSupplierBiddingListDetail(purcMatterTenderPurchaseId));
}

    /**
     * 保存日常采购报价记录
     * @param input
     * @return
     */
    @PostMapping("/supplierdailybidding/add")
    public  Result saveSupplierDailyBiddingResult(@RequestBody AddSupplierDailyBiddingInput input){
       return supplierDailyBiddingService.saveBiddingResult(input);
}
    /**
     *
     * @Description: 取得周期性报价结果信息
     * @param purcMatterTenderPurchaseId
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/supplierBidding/periodResult")
    public Result getPeriodSupplierTenderList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId) {
        return Result.Success(supplierBiddingService.getPeriodSupplierTenderList(purcMatterTenderPurchaseId));
    }
    /**
     *
     * @Description: 周期性竞价结果处理
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/supplierBidding/periodResult")
    public Result addPeriodInquiryResult(@RequestBody AddsupplierBiddingInput input){
        supplierBiddingService.addPeriodBiddingResult(input);
        return Result.Success();

    }

}
