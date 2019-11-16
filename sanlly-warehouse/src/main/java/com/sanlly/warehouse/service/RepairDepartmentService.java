package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.repairdepartment.RepairDepartmentInput;
import com.sanlly.warehouse.models.input.repairdepartment.SearchRepairDepartmentInput;
import com.sanlly.warehouse.models.output.repairdepartment.RepairDepartmentOutput;

/**
 * 修理部门服务接口
 * 
 * @author lishzh
 *
 */
public interface RepairDepartmentService {

	/**
	 * 添加修理部门
	 * 
	 * @param input
	 */
	void addRepairDepartment(RepairDepartmentInput input);

	/**
	 * 修改修理部门
	 * 
	 * @param input
	 */
	void editRepairDepartment(RepairDepartmentInput input);

	/**
	 * 删除修理部门
	 * 
	 * @param input
	 */
	void deleteRepairDepartment(List<Integer> ids);

	/**
	 * 分页查询修理部门
	 * 
	 * @param input
	 */
	PagedList<RepairDepartmentOutput> getPageRepairDepartment(SearchRepairDepartmentInput input);

	/**
	 * 查询所有修理部门
	 * 
	 * @param input
	 */
	List<RepairDepartmentOutput> getAllRepairDepartment();

}
