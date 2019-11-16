package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.demand.AddManualRequisitionsWareInput;
import com.sanlly.purchase.models.input.demand.AddMatterDemandInput;
import com.sanlly.purchase.models.input.demand.SearchDemandOutputInput;
import com.sanlly.purchase.models.input.demand.editMatterDemandInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;

import java.util.List;

/**
 * Description: 采购模块采购需求
 *
 * @author jlx
 * @ClassName: MatterDemandService
 * @date 2019年8月8日
 */
public interface MatterDemandService {

    /**
     * 新增周期性采购需求
     *
     * @param input
     */
    void addManualWareRequisitions(AddManualRequisitionsWareInput input);

    void addMatterDemand(AddMatterDemandInput input);

    /**
     * 编辑周期性采购需求
     *
     * @param input
     */
    void eidtMatterDemand(editMatterDemandInput input);

    /**
     * 批量新增采购需求
     *
     * @param input
     */
    boolean addMutiMatterDemand(List<AddMatterDemandInput> inputList);

    /**
     * 删除采购需求
     *
     * @param matterDemandIds
     */
    void delMatterDemand(Integer[] matterDemandIds);

    /**
     * 获取选择的采购需求
     *
     * @param matterDemandIds
     */
    List<MatterDemandOutput> getMatterDemand(Integer[] matterDemandIds);

    /**
     * 物料采购需求分页列表
     *
     * @param input
     * @return
     */
    PagedList<MatterDemandOutput> getMatterDemandPagedList(SearchDemandOutputInput input);
}
