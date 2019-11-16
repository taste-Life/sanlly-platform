package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailyInquiry.AddDailyInquiryInput;
import com.sanlly.purchase.models.input.dailyInquiry.AddDailyInquiryResultInput;
import com.sanlly.purchase.models.input.dailybidding.SearchDailyBIddingInput;
import com.sanlly.purchase.models.input.inquiry.AddReInquiryInput;
import com.sanlly.purchase.models.output.dailybidding.DailySupplierTenderDetailOutput;
import com.sanlly.purchase.models.output.dailyinquiry.DailyInquiryOutput;
import com.sanlly.purchase.models.output.dailyinquiry.DailyReInquiryOutput;

/**
 * @Description: TODO
 * @ClassName: DailyInquiry
 * @Date: 2019/8/26 9:22
 * @Version 1.0
 * @Author mqz
 */
public interface DailyInquiryService {
    /**
     *
     * @Description:  询价采购分页列表
     * @param input
     * @return PagedList<MatterBiddingOutput>
     * @throws 
     */
    PagedList<DailyInquiryOutput> getMatterBiddingPagedList(SearchDailyBIddingInput input);

    /**
     *
     * @Description: 询价发布
     * @param input void
     * @throws 
     */
    void addMatterBidding(AddDailyInquiryInput input);

    /**
     *
     * @Description: 询价详情
     * @param purcMatterTenderPurchaseId
     * @return MatterTenderOutput
     * @throws 
     */
    DailyReInquiryOutput gettMatterBiddingDetail(Integer purcMatterTenderPurchaseId);

    /**
     *
     * @Description: 询价结果处理
     * @param input void
     * @throws 
     */
    void addBiddingResult(AddDailyInquiryResultInput input);
    /**
     *
     * @Description: 取得报价信息
     * @param purcMatterTenderPurchaseId
     * @return MatterSupplierTenderDetailOutput
     * @throws 
     */
    DailySupplierTenderDetailOutput getSupplierTenderList(Integer purcMatterTenderPurchaseId);

    /**
     *
     * @Description: 重新询价
     * @param purcMatterTenderPurchaseId
     * @return MatterInquiryOutput
     * @throws 
     */
    DailyReInquiryOutput getReMatterInquiry(Integer purcMatterTenderPurchaseId);
    /**
     *
     * @Description: 重新询价发布
     * @param input void
     * @throws 
     */
    void addMatterReInquiry(AddDailyInquiryInput input);

    /**
     * 再次询价
     * @param input
     */
     void  addReInquiry(AddReInquiryInput input);
}
