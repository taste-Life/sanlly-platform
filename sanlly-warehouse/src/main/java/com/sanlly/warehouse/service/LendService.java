package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.borrowlend.BorrowLendInput;
import com.sanlly.warehouse.models.input.borrowlend.SearchBorrowLendInput;
import com.sanlly.warehouse.models.input.staffborrow.StaffborrowInput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendDetailOutput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendOutput;

/**
 * 借出service
 * 
 * @author lishzh
 *
 */
public interface LendService {
	/**
	 * 添加借出单
	 *
	 * @author lishzh
	 * @param input
	 */
	void addLend(BorrowLendInput input);

	/**
	 * 修改借出单
	 *
	 * @author lishzh
	 * @param input
	 */
	void editLend(BorrowLendInput input);

	/**
	 * 删除借出单
	 *
	 * @author lishzh
	 * @param ids
	 */
	void deleteLend(List<Integer> ids);

	/**
	 * 根据id获取借出单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	BorrowLendOutput getLendById(Integer id);

	/**
	 * 获取借出单分页列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<BorrowLendOutput> getLends(SearchBorrowLendInput input);


	/**
	 * 出库
	 *
	 * @author lishzh
	 * @param id
	 */
	void lendOut(Integer id);
	
	/**
	 * 借出未还
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	PagedList<BorrowLendDetailOutput> getNotRepay(SearchBorrowLendInput input);
	
	/**
	 * 备件借出还库
	 *
	 * @author lishzh
	 * @param input
	 */
	void lendRepay(BorrowLendInput input);
	
	/**
	 * 借出转售
	 *
	 * @author lishzh
	 * @param input
	 */
	void lendSale(BorrowLendInput input);

}
