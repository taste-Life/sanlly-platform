package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailybidding.AddDailyBiddingInput;
import com.sanlly.purchase.models.input.dailybidding.AddDailyBiddingResultInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.output.dailybidding.DailyBiddingOutput;
import com.sanlly.purchase.models.output.dailybidding.DailySupplierTenderDetailOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterBiddingOutput;

/**
 * @Description: TODO
 * @ClassName: DailyBiddingService
 * @Date: 2019/8/26 9:21
 * @Version 1.0
 * @Author mqz
 */
public interface DailyBiddingService {
    /**
     *
     * @Description:  竞价采购分页列表
     * @param input
     * @return PagedList<MatterBiddingOutput>
     * @throws 
     */
    PagedList<DailyBiddingOutput> getMatterBiddingPagedList(SearchDailyBIddingInput input);

    /**
     *
     * @Description: 竞价发布
     * @param input void
     * @throws 
     */
    void addMatterBidding(AddDailyBiddingInput input);

    /**
     *
     * @Description: 竞价详情
     * @param purcMatterTenderPurchaseId
     * @return MatterTenderOutput
     * @throws 
     */
    MatterBiddingOutput gettMatterBiddingDetail(Integer purcMatterTenderPurchaseId);

    /**
     *
     * @Description: 竞价结果处理
     * @param input void
     * @throws 
     */
    void addBiddingResult(AddDailyBiddingResultInput input);
    /**
     *
     * @Description: 取得报价信息
     * @param purcMatterTenderPurchaseId
     * @return MatterSupplierTenderDetailOutput
     * @throws 
     */
    DailySupplierTenderDetailOutput getSupplierTenderList(Integer purcMatterTenderPurchaseId);

}
