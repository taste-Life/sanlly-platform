package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.AddLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.EditLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.SearchLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceType.LaborInsuranceTypeOutput;

/**
 * ClassName: LaborInsuranceTypeService
 * Description: 劳保类别管理接口
 * date: 2019/8/12 15:06
 *
 * @author zhh
 * 
 */
public interface LaborInsuranceTypeService {
	/**
     * 劳保类别分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborInsuranceTypeOutput> getLaborInsuranceTypePageList(SearchLaborInsuranceTypeInput input);
	
	/**
     * 获得全部劳保类别
     * @param input
     * @return
     */
	List<LaborInsuranceTypeOutput> getLaborInsuranceTypeList();
	
	/**
     * 新增劳保类别
     * @param input
     * @return
     */
	void addLaborInsuranceType(AddSparePartsCategoriesDetailsInput input);
	
	/**
     * 修改劳保类别
     * @param input
     * @return
     */
	void editLaborInsuranceType(EditSparePartsCategoriesDetailsInput input);
	
	
	/**
     * 批量删除劳保类别
     * @param input
     * @return
     */
	void deleteLaborInsuranceType(String[] keys);
	
	/**
     * 根据劳保类别查询备件key
     * @param input
     * @return
     */
	List<String> getSparePartsKeyListByType(String sparePartsCategoriesDetails);
	

}
