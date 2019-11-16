package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.staffborrow.SearchStaffBorrowInput;
import com.sanlly.warehouse.models.input.staffborrow.StaffborrowInput;
import com.sanlly.warehouse.models.output.staffborrow.StaffBorrowDetailOutput;
import com.sanlly.warehouse.models.output.staffborrow.StaffBorrowOutput;

/**
 * 员工借件service interface
 * 
 * @author lishzh
 *
 */
public interface StaffBorrowService {

	/**
	 * 添加员工借件单
	 *
	 * @author lishzh
	 * @param input
	 */
	void addStaffBorrow(StaffborrowInput input);

	/**
	 * 修改员工借件单
	 *
	 * @author lishzh
	 * @param input
	 */
	void edidStaffBorrow(StaffborrowInput input);

	/**
	 * 删除员工借件单
	 *
	 * @author lishzh
	 * @param ids
	 */
	void deleteStaffBorrow(List<Integer> ids);

	/**
	 * 获取员工借件单列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<StaffBorrowOutput> getStaffBorrows(SearchStaffBorrowInput input);

	/**
	 * 根据id获取员工借件单以及去重后的明细
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	StaffBorrowOutput getStaffBorrowById(Integer id);

	/**
	 * 根据id获取员工借件单 及所有明细 不去重
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	StaffBorrowOutput getStaffBorrow(Integer staffBorrowId);

	/**
	 * 借件单出库
	 *
	 * @author lishzh
	 * @param id
	 */
	void staffBorrowOut(Integer staffBorrowId);

	/**
	 * 借件单还库
	 *
	 * @author lishzh
	 * @param input
	 */
	void staffRepay(StaffborrowInput input);

	/**
	 * 借件未还查询
	 *
	 * @author lishzh
	 * @param input
	 */
	PagedList<StaffBorrowDetailOutput> getNotRepay(SearchStaffBorrowInput input);

	/**
	 * 获取借件数量
	 *
	 * @author lishzh
	 * @param containerNo
	 * @param spareparts
	 * @param num
	 */
	Double getBorrowNum(String containerNo, String spareParts, String borrowType);

	/**
	 * 借件上箱
	 *
	 * @author lishzh
	 * @param containerNo
	 * @param spareparts
	 * @param num
	 */
	void upContainer(String containerNo, String spareParts, String borrowType, Double num);
}
