package com.sanlly.purchase.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.supplierbidding.AddSupplierDailyBiddingInput;
import com.sanlly.purchase.models.output.dailybidding.DailyBiddingOutput;
import com.sanlly.purchase.models.output.dailybidding.DailySupplierTenderDetailOutput;

/**
 * @Description: TODO
 * @ClassName: SupplierDailyInquiryService
 * @Version 1.0
 * @Author mqz
 */
public interface SupplierDailyInquiryService {
    public PagedList<DailyBiddingOutput> getSupplerBiddingList(SearchDailyBIddingInput input);
    public DailySupplierTenderDetailOutput getSupplierBiddingListDetail(Integer pureMatterPurchaseId);
    public Result saveBiddingResult(AddSupplierDailyBiddingInput input);
    public  void supplierSign(Integer pureMatterPurchaseId);
}
