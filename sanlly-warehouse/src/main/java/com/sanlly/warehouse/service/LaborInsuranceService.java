package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WareLaborInsurance;
import com.sanlly.warehouse.models.input.laborInsurance.AddLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.EditLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

/**
 * ClassName: LabaorInsuranceService
 * Description: 基础劳保信息管理接口
 * date: 2019/7/30 15:06
 *
 * @author zhh
 * 
 */
public interface LaborInsuranceService {
	/**
     * 劳保信息分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborInsuranceOutput> getLaborInsurancePageList(SearchLaborInsuranceInput input);
	
	/**
     * 获得全部劳保信息
     * @param input
     * @return
     */
	List<LaborInsuranceOutput> getLaborInsuranceList();
	
	/**
     * 新增劳保信息
     * @param input
     * @return
     */
	void addLaborInsurance(AddLaborInsuranceInput input);
	
	/**
     * 修改劳保信息
     * @param input
     * @return
     */
	void editLaborInsurance(EditLaborInsuranceInput input);
	
	/**
     * 获取劳保信息
     * @param input
     * @return
     */
	WareLaborInsurance getLaborInsuranceDetail(EditLaborInsuranceInput input);
	
	/**
     * 批量删除劳保信息
     * @param input
     * @return
     */
	void deleteLaborInsurance(String[] keys);
	
	
	
}
