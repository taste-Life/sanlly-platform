package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.input.stockin.EditStockinInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: WareStockinController
 * Description: 入库操作接口
 * date: 2019/8/2 10:25
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(tags = "入库操作接口")
public class WareStockinController {

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private PurchaseFeignClient purchaseFeignClient;

    /**
     * 获取入库单列表
     * @param stockinNo 入库单号
     * @param entryStatus 入库状态
     * @param startDate 起止时间
     * @param supplierId 供应商
     * @param billType 单据类型
     * @param auditStatus 审核状态
     * @param invoiceType 发票类型
     * @param no 源单号
     * @param sparePartsName 备件名称
     * @param sparePartsNo 备件号
     * @return
     */
    @GetMapping("/stockin")
    public Result stockinPageList(
            @RequestParam(required = false) String stockinNo,
            @RequestParam(required = false) String entryStatus,
            @RequestParam(required = false) Date startDate,
            @RequestParam(required = false) Date endDate ,
            @RequestParam(required = false) String supplierId ,
            @RequestParam(required = false) String billType ,
            @RequestParam(required = false) String invoiceType ,
            @RequestParam(required = false) String auditStatus ,
            @RequestParam(required = false) String no ,
            @RequestParam(required = false) String sparePartsName ,
            @RequestParam(required = false) String sparePartsNo,
            @RequestParam(required = false) String escrowCompany,
            @RequestParam(required = false) Boolean ofReturn,
            @RequestParam Integer index,
            @RequestParam Integer size){
        SearchStockinInput searchStockinInput = new SearchStockinInput();
        searchStockinInput.setStockinNo(stockinNo);
        searchStockinInput.setEntryStatus(entryStatus);
        searchStockinInput.setInvoiceType(invoiceType);
        searchStockinInput.setStartTime(startDate);
        searchStockinInput.setEndTime(endDate);
        searchStockinInput.setSupplierId(supplierId);
        searchStockinInput.setBillType(billType);
        searchStockinInput.setAuditStatus(auditStatus);
        searchStockinInput.setNo(no);
        searchStockinInput.setSparePartsNo(sparePartsNo);
        searchStockinInput.setSparePartsName(sparePartsName);
        searchStockinInput.setEscrowCompany(escrowCompany);
        searchStockinInput.setOfReturn(ofReturn);
        searchStockinInput.setPageIndex(index);
        searchStockinInput.setPageSize(size);
        return Result.Success(stockinService.stockinPageList(searchStockinInput));
    }

    /**
     *根据入库单ID获取入库单
     *
     *@author lishzh
     */
    @GetMapping("/stockin/{id}")
    public Result getStockinById(@PathVariable(value = "id") Integer id){
        return Result.Success(stockinService.getStockinById(id));
    }

    /**
     * 新增入库单
     * @param input
     * @return
     */
    @PostMapping("/stockin")
    public Result addStockin(@RequestBody AddStockinInput input){
        stockinService.addStockin(input);
        return Result.Success();
    }

    /**
     * 修改入库单
     * @param input
     * @return
     */
    @PutMapping("/stockin")
    public Result editStockin(@RequestBody EditStockinInput input){
        stockinService.editStockin(input);
        return Result.Success();
    }

    /**
     * 批量审核入库
     * @param ids
     * @return
     */
    @PutMapping("/stockin/auditPassStockin")
    public Result auditPassStockin(@RequestParam Integer[] ids){
        stockinService.auditPassStockin(ids);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @PutMapping("/stockin/auditRejectStockin")
    public Result auditRejectStockin(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
        stockinService.auditRejectStockin(ids,reasonsRejection);
        return Result.Success();
    }

    /**
     * 代管入库添加
     * @return
     */
    @PostMapping("/stockin/escrowIn")
    public Result addEscrowIn(@RequestBody AddStockinInput input){
        stockinService.addStockin(input);
        return Result.Success();
    }

    /**
     * 入库
     * @param input
     * @return
     */
    @PostMapping("/stockin/in")
    public Result stockin(@RequestBody StockinOutput input){
        stockinService.in(input);
        return Result.Success();
    }

    /**
     * 获取采购 送货单列表
     * @param deliveryNum
     * @param purchaseCompany
     * @param isVerifyAccount
     * @param reciveStatus
     * @param supplyType
     * @param index
     * @param size
     * @return
     */
    @GetMapping("/matterDelivery")
    public Result getDeliveryPageList(@RequestParam(required=false) String deliveryNum,
                                      @RequestParam(required=false) String purchaseCompany,
                                      @RequestParam(required=false) String isVerifyAccount,
                                      @RequestParam(required=false) String reciveStatus,
                                      @RequestParam(required=false) String supplyType,
                                      @RequestParam Integer index,@RequestParam Integer size){
        return Result.Success(purchaseFeignClient.getMatterDeliveryPagedList(deliveryNum,purchaseCompany,isVerifyAccount,reciveStatus,supplyType,index,size));
    }
	/**
     * 评分考核项目：质量及服务水平
     * @param deliveryNum 送货编号
     * @param qualityScore 质量分
     * @param serviceScore 服务水平分
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PutMapping("/evaluates")
	public Result evaluateQualityAndService(@RequestParam(value="deliveryNum") String deliveryNum,@RequestParam(value="qualityScore") Double qualityScore,@RequestParam(value="serviceScore") Double serviceScore) {
		stockinService.evaluateQualityAndService(deliveryNum, qualityScore, serviceScore);
		return Result.Success();
	}

}
