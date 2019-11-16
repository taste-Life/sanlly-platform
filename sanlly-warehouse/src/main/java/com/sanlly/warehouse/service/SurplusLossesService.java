package com.sanlly.warehouse.service;
/**
 * 盘盈盘亏管理接口
 * 
 * @author zhh
 *
 */

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.surplusLosses.AddSLInput;
import com.sanlly.warehouse.models.input.surplusLosses.EditSLInput;
import com.sanlly.warehouse.models.input.surplusLosses.SearchSLInput;
import com.sanlly.warehouse.models.output.surplusLosses.SLOutput;

public interface SurplusLossesService {
	/**
     * 盘盈盘亏单分页列表
     * @param input
     * @return
     */
	PagedList<SLOutput> getSLPageList(SearchSLInput input);
	
	/**
     * 根据id查询单据信息
     * @param id
     * @return
     */
	SLOutput getSL(Integer id);
	
	/**
     * 根据ids查询单据信息
     * @param ids
     * @return
     */
	List<SLOutput> getSLlist(Integer[] ids);
	
	/**
     * 添加盘盈盘亏单
     * @param input
     * @return
     */
    void addSL(AddSLInput input);
    
    /**
     * 修改盘盈盘亏单
     * @param input
     * @return
     */
    void editSL(EditSLInput input);
    
    /**
     * 审核盘盈盘亏单
     * @param ids
     * @return
     */
    void auditSL(Integer[] ids);
    
    /**
     * 盘盈入库
     * @param ids
     * @return
     */
    void stockIn(Integer[] ids);
    
    /**
     * 盘亏出库
     * @param ids
     * @return
     */
    void stockOut(Integer[] ids);
}
