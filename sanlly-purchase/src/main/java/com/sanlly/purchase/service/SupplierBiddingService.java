package com.sanlly.purchase.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.bidding.SearchMatterBiddingInput;
import com.sanlly.purchase.models.input.supplierbidding.AddsupplierBiddingInput;
import com.sanlly.purchase.models.output.matterbidding.MatterBiddingOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderDetailOutput;

/**
 * @Description: 供应商竞价操作接口
 * @ClassName: SupplierBiddingService
 * @Version 1.0
 * @Author mqz
 */

public interface SupplierBiddingService {
//
public PagedList<MatterBiddingOutput> getSupplerBiddingList(SearchMatterBiddingInput input);
public MatterSupplierTenderDetailOutput getSupplierBiddingListDetail(Integer pureMatterPurchaseId);
public Result saveBiddingResult(AddsupplierBiddingInput input);
public  Result supplierSign(Integer pureMatterPurchaseId);
    MatterSupplierTenderDetailOutput getPeriodSupplierTenderList(Integer purcMatterTenderPurchaseId);
    void  addPeriodBiddingResult(AddsupplierBiddingInput input);

}
