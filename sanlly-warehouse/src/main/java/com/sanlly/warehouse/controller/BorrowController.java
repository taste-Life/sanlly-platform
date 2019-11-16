package com.sanlly.warehouse.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.borrowlend.BorrowLendInput;
import com.sanlly.warehouse.models.input.borrowlend.SearchBorrowLendInput;
import com.sanlly.warehouse.service.BorrowService;

import io.swagger.annotations.Api;

/**
 * 借入单Controller
 * 
 * @author lishzh
 *
 */
@Api(tags = { "借入单API" })
@RestController
public class BorrowController {

	@Autowired
	BorrowService borrowService;

	/**
	 * 添加借入单
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/borrows")
	public Result addBorrow(@RequestBody BorrowLendInput input) {
		borrowService.addBorrow(input);
		return Result.Success();
	}

	/**
	 * 修改借入单
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/borrows")
	public Result editBorrow(@RequestBody BorrowLendInput input) {
		borrowService.editBorrow(input);
		return Result.Success();
	}

	/**
	 * 删除借入单
	 *
	 * @author lishzh
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/borrows")
	public Result deleteBorrow(@RequestParam List<Integer> ids) {
		borrowService.deleteBorrow(ids);
		return Result.Success();
	}

	/**
	 * 根据id获取借入单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/borrows/{id}")
	public Result getBorrowById(@PathVariable(value = "id") Integer id) {
		return Result.Success(borrowService.getBorrowById(id));
	}

	/**
	 * 获取借入单分页列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/borrows")
	public Result getBorrows(@RequestParam(required = false) String no, @RequestParam(required = false) String yard,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String status,
			@RequestParam(required = false) String sparePartsNo, @RequestParam(required = false) String sparePartsName,
			@RequestParam(required = false) Date startDate, @RequestParam(required = false) Date endDate,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchBorrowLendInput input = new SearchBorrowLendInput(index, size);
		input.setContainerNo(containerNo);
		input.setEndDate(endDate);
		input.setNo(no);
		input.setSparePartsName(sparePartsName);
		input.setSparePartsNo(sparePartsNo);
		input.setStartDate(startDate);
		input.setStatus(status);
		input.setYard(yard);
		return Result.Success(borrowService.getBorrows(input));
	}

	/**
	 * 借入单审核
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/borrows/audit")
	public Result auditBorrow(@RequestBody BorrowLendInput input) {
		borrowService.auditBorrow(input);
		return Result.Success();
	}

	/**
	 * 入库
	 *
	 * @author lishzh
	 * @param id
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/borrows/in")
	public Result putInWarehouse(@RequestBody BorrowLendInput input) {
		borrowService.putInWarehouse(input.getWareBorrowLendSlipId());
		return Result.Success();
	}

	/**
	 * 借入未还查询
	 *
	 * @author lishzh
	 * @param no
	 * @param sparePartsNo
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/borrows/notRepay")
	public Result getNotRepay(@RequestParam(required = false) String no,
			@RequestParam(required = false) String sparePartsNo, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchBorrowLendInput input = new SearchBorrowLendInput(index, size);
		input.setNo(no);
		input.setSparePartsNo(sparePartsNo);
		return Result.Success(borrowService.getNotRepay(input));
	}

	/**
	 * 还件申请
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/borrows/repay")
	public Result repay(@RequestBody BorrowLendInput input) {
		borrowService.repay(input);
		return Result.Success();
	}

	/**
	 * 获取还件申请列表
	 *
	 * @author lishzh
	 * @param startDate
	 * @param endDate
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/borrows/repay")
	public Result getRepays(@RequestParam(required = false) Date startDate,
			@RequestParam(required = false) Date endDate, @RequestParam Integer index, @RequestParam Integer size) {
		SearchBorrowLendInput input = new SearchBorrowLendInput(index, size);
		input.setStartDate(startDate);
		input.setEndDate(endDate);
		return Result.Success(borrowService.getRepays(input));
	}

	/**
	 * 还件出库
	 *
	 * @author lishzh
	 * @param repayId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/borrows/repay/out")
	public Result repayOut(@RequestBody BorrowLendInput input) {
		borrowService.repayOut(input.getBorrowRepayId());
		return Result.Success();
	}

	/**
	 *获取最新入库单价
	 *
	 *@author lishzh
	 */
	@GetMapping("/borrows/newPrice")
	public Result getNewPrice(@RequestParam List<String> spareParts){
		return Result.Success(borrowService.getNewPrice(spareParts));
	}

}
