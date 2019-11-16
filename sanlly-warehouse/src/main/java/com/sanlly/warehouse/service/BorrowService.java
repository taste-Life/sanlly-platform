package com.sanlly.warehouse.service;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.borrowlend.BorrowLendInput;
import com.sanlly.warehouse.models.input.borrowlend.SearchBorrowLendInput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendDetailOutput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendOutput;

/**
 * 借入service
 * 
 * @author lishzh
 *
 */
public interface BorrowService {

	/**
	 * 添加借入单
	 *
	 * @author lishzh
	 * @param input
	 */
	void addBorrow(BorrowLendInput input);

	/**
	 * 修改借入单
	 *
	 * @author lishzh
	 * @param input
	 */
	void editBorrow(BorrowLendInput input);

	/**
	 * 删除借入单
	 *
	 * @author lishzh
	 * @param ids
	 */
	void deleteBorrow(List<Integer> ids);

	/**
	 * 根据id获取借入单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	BorrowLendOutput getBorrowById(Integer id);

	/**
	 * 获取借入单分页列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<BorrowLendOutput> getBorrows(SearchBorrowLendInput input);

	/**
	 * 借入单审核
	 *
	 * @author lishzh
	 * @param input
	 */
	void auditBorrow(BorrowLendInput input);

	/**
	 * 入库
	 *
	 * @author lishzh
	 * @param id
	 */
	void putInWarehouse(Integer id);

	/**
	 * 借入未还
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<BorrowLendDetailOutput> getNotRepay(SearchBorrowLendInput input);
	
	/**
	 * 还件申请
	 *
	 *@author lishzh 
	 *@param input
	 */
	void repay(BorrowLendInput input);
	
	/**
	 * 修改借入单
	 *
	 * @author lishzh
	 * @param input
	 */
	void editRepay(BorrowLendInput input);

	/**
	 * 删除借入单
	 *
	 * @author lishzh
	 * @param ids
	 */
	void deleteRepay(List<Integer> ids);

	/**
	 * 根据id获取借入单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	BorrowLendOutput getRepayById(Integer id);

	/**
	 * 获取借入单还件申请分页列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<BorrowLendOutput> getRepays(SearchBorrowLendInput input);

	/**
	 * 出库
	 *
	 * @author lishzh
	 * @param id
	 */
	void repayOut(Integer id);

	/**
	 *获取最新入库单价
	 *
	 *@author lishzh
	 */
	List<BigDecimal> getNewPrice(List<String> spareParts);
	
	

}
