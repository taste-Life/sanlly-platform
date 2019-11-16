package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailydemand.AddDailyDemandInput;
import com.sanlly.purchase.models.input.dailydemand.EditDemandInput;
import com.sanlly.purchase.models.input.dailydemand.SearcherDailyDemandInput;
import com.sanlly.purchase.models.output.dailydemand.DailyDemandOutput;

import java.util.List;

/**
 * @Description: 日常采购需求接口
 * @ClassName: DailyDemandService
 * @Version 1.0
 * @Author mqz
 */
public interface DailyDemandService {
    /**
     * 获取需求列表
     * @param input
     * @return
     */
    PagedList<DailyDemandOutput> getDailyDemandPagedList(SearcherDailyDemandInput input);

    /**
     * 删除需求
     * @param matterDemandIds
     */
    public void delMatterDemand(Integer[] matterDemandIds) ;

    /**
     * 审核需求
     * @param matterdemandId
     * @param auditStatus
     * @param reject
     */
    void auditMatterDemand(Integer[] matterdemandId,String auditStatus,String reject);

    /**
     * 修改需求
     * @param input
     */
  void  updateMatterDemand(EditDemandInput input);

    /**
     * 添加需求
     * @param input
     */

  void  addDailyDemand(AddDailyDemandInput input);
    List<DailyDemandOutput> getDailyDemand(Integer[] matterDemandIds);
    }
