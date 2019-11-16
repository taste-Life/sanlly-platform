package com.sanlly.purchase.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailydemand.AddDailyTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.dailydemand.SearchDailyPurchaseInput;
import com.sanlly.purchase.models.output.dailydemand.DailyPurchaseOutput;

/**
 * @Description: 日常采购接口
 * @ClassName: DailyPurchaseService
 * @Version 1.0
 * @Author mqz
 */
public interface DailyTemporaryPurchaseService {
    /**
     * 添加日常采购单
     */
    Result addDailyPurchase(AddDailyTemporaryPurchaseInput input) throws Exception;

    /**
     * 日常采购单分页列表
     *
     * @param input
     * @return
     */
    PagedList<DailyPurchaseOutput> getDailyPurchasePagedList(SearchDailyPurchaseInput input);

    /**
     * 采购审核列表
     *
     * @param input
     * @return
     */
    PagedList<DailyPurchaseOutput> getAuditPurchasePagedList(SearchDailyPurchaseInput input);

    /**
     * 日常采购单审核
     *
     * @param purcDailyPurchaseId
     */
    void auditMatterPurchase(Integer[] purcDailyPurchaseId, String[] processInstanceIds, String[] taskIds);

    /**
     * 日常采购单驳回
     *
     * @param purcDailyPurchaseId
     */
    void rejectMatterPurchase(Integer[] purcDailyPurchaseId, String[] processInstanceIds, String[] taskIds);

    DailyPurchaseOutput getMatterTemporaryPurchaseInfo(Integer purcMatterTemporaryPurchaseId);

    void editDailyPurchase(DailyPurchaseOutput input);
}

