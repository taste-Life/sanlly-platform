package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.entryadjustment.AddEntryAdjustmentInput;
import com.sanlly.warehouse.models.input.entryadjustment.SearchEntryAdjustmentInput;
import com.sanlly.warehouse.models.output.entryadjustment.EntryAdjustmentOutput;

/**
 * 
* @Package com.sanlly.warehouse.service 
* @Description: 入库单调账 
* @author jlx   
* @date 2019年9月2日 上午10:00:25 
* @version V1.0   
 */
public interface EntryAdjustmentService {

    /**
     * 调账单分页查询
     * @param input
     * @return
     */
    PagedList<EntryAdjustmentOutput> entryAdjustmentPageList(SearchEntryAdjustmentInput input);
	/**
	 * 添加调账单
	 * @param input
	 */
	void addEntryAdjustment(AddEntryAdjustmentInput input);
	void auditEntryAdjustment(Integer wareEntryAdjustmentId);
}
