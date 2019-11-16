package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.dailytender.AddDailyTenderInput;
import com.sanlly.purchase.models.input.dailytender.AddDailyTenderResultInput;
import com.sanlly.purchase.models.input.dailytender.SearchDailyTenderInput;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderResultInput;
import com.sanlly.purchase.service.DailyTenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: DailyTenderControlle
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class DailyTenderController {


    @Autowired
    private DailyTenderService matterTenderService;

    /** 
     * @Description: 招标采购分页列表
     * @param tenderEndTimeStart
     * @param tenderEndTimeEnd
     * @param purchaseCompany
     * @param tenderMethod
     * @param tenderStatus
     * @param tenderName
     * @param isPeriod
     * @param index
     * @param size
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyTenders")
    public Result getMatterBiddingPagedList(@RequestParam(required=false) Date tenderCreateTimeStart, @RequestParam(required=false) Date tenderCreateTimeEnd,
                                            @RequestParam(required=false) String purchaseCompany, @RequestParam(required=false) String tenderMethod,
                                            @RequestParam(required=false) String tenderStatus, @RequestParam(required=false) String tenderName,
                                            @RequestParam Integer index, @RequestParam Integer size){
        SearchDailyTenderInput input = new SearchDailyTenderInput(index,size);
        input.setPurchaseCompany(purchaseCompany);
      //  input.setIsPeriod(isPeriod);
        input.setTenderCreateTimeEnd(tenderCreateTimeEnd);
        input.setTenderCreateTimeStart(tenderCreateTimeStart);
        input.setTenderMethod(tenderMethod);
        input.setTenderName(tenderName);
        input.setTenderStatus(tenderStatus);
        return Result.Success(matterTenderService.getMatterTenderPagedList(input));
    }
    /**
     *
     * @Description: 发布招标采购
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyTenders")
    public Result addMatterTender(@RequestBody AddDailyTenderInput input){
        matterTenderService.addMatterTender(input);
        return Result.Success();

    }

    /**
     *
     * @Description: 初审结果录入
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyTenders/first")
    public Result addFirstTrial(@RequestParam(required=true) Integer purcMatterTenderPurchaseId,@RequestParam(required=true) String[] purcSupplierIds){
        matterTenderService.addFirstTrial(purcMatterTenderPurchaseId,purcSupplierIds);
        return Result.Success();

    }

    /**
     *
     * @Description: 招标结果录入
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/dailyTenders/result")
    public Result addTenderResult(@RequestBody AddDailyTenderResultInput input){
        matterTenderService.addTenderResult(input);
        return Result.Success();

    }

    /**
     *
     * @Description: 招标详情
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyTenders/detail")
    public Result gettMatterTenderDetail(@RequestParam(required=true) Integer purcMatterTenderPurchaseId){

        return Result.Success(matterTenderService.gettMatterTenderDetail(purcMatterTenderPurchaseId));

    }

    /**
     *
     * @Description: 供应商查看招标列表
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyTenders/noticelist")
    public Result getTenderNoticeList(){

        return Result.Success(matterTenderService.getTenderNoticeList());

    }
    /**
     *
     * @Description: 招标详情
     * @param input
     * @return Result
     * @throws 
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/dailyTenders/productlist")
    public Result gettMatterTenderProductList(@RequestParam(required=true) Integer purcMatterTenderPurchaseId){

        return Result.Success(matterTenderService.gettMatterTenderProductList(purcMatterTenderPurchaseId));

    }

    /**
     * 获取相应供应商列表
     * @param purcMatterTenderPurchaseId
     * @param type
     * @return
     */
    @GetMapping("/dailyTenders/supplierlist")
    public  Result getTenderSupplierList(@RequestParam(required = true) Integer purcMatterTenderPurchaseId,String type){


        return  Result.Success(matterTenderService.getTenderSupplierList(purcMatterTenderPurchaseId,type));
    }



}
