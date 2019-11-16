package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceivePageInput;
import com.sanlly.warehouse.models.output.laborInsurance.PersonalReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.PersonalLaborStockoutOutput;

/**
 * ClassName: LabaorInsuranceService
 * Description: 基础申请信息管理接口
 * date: 2019/8/14 18:49
 *
 * @author zhh
 * 
 */
public interface LaborReceiveService {
	/**
     * 劳保申请单信息分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborReceiveOutput> getLaborReceivePageList(SearchLaborReceiveInput input);
	
	/**
     * 添加劳保申请单
     * @param input
     * @return
     */
    void addLaborReceive(AddLaborReceiveInput input);
    
    /**
     * 批量审核通过
     * @param ids
     */
    void auditPass(Integer[] ids);

    /**
     * 批量审核驳回
     * @param ids
     */
    void auditReject(Integer[] ids,String reasonsRejection);

    /**
     * 查询劳保申请单信息分页
     * @param input
     * @return
     */
    PagedList<LaborReceiveDetailOutput> getLaborReceiveDetailList(SearchLaborReceivePageInput input);
    
    /**
     * 查询劳保申请单信息
     * @param input
     * @return
     */
    List<LaborReceiveDetailOutput> getReceiveDetailList();
    /**
     * 根据申请单id查询明细
     * @param id
     * @return
     */
    List<LaborReceiveDetailOutput> getDetailListById(Integer id);
    
    /**
     * 根据申请单id查询申请单信息
     * @param id
     * @return
     */
    LaborReceiveOutput getReceiveById(Integer id);
    
    /**
     * 出库回调
     * @param input
     */
    void applyStockedManage(LaborStockoutOutput input);
    
    /**
	 * 个人劳保待出库信息查询
	 */
	List<PersonalLaborStockoutOutput> getAdvanceStockoutList(Integer id);
	
	/**
	 * 个人可领用劳保信息查询
	 */
	List<PersonalReceiveOutput> getPersonalReceiveList(Integer id);
	
	/**
	 * 个人领用劳保信息记录查询
	 */
	List<PersonalReceiveOutput> getPersonalReceivedList(Integer id);
}
