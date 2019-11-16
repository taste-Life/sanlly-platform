package com.sanlly.warehouse.controller;

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
import com.sanlly.warehouse.service.LendService;

import io.swagger.annotations.Api;

/**
 * 借入单Controller
 * 
 * @author lishzh
 *
 */
@Api(tags = { "借出单API" })
@RestController
public class LendController {

	@Autowired
	LendService lendService;

	/**
	 * 添加借出单
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/lends")
	public Result addLend(@RequestBody BorrowLendInput input) {
		lendService.addLend(input);
		return Result.Success();
	}

	/**
	 * 修改借出单
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/lends")
	public Result editLend(@RequestBody BorrowLendInput input) {
		lendService.editLend(input);
		return Result.Success();
	}

	/**
	 * 删除借出单
	 *
	 * @author lishzh
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/lends")
	public Result deleteLend(@RequestParam List<Integer> ids) {
		lendService.deleteLend(ids);
		return Result.Success();
	}

	/**
	 * 根据id获取借出单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/lends/{lendId}")
	public Result getLendById(@PathVariable(value = "lendId") Integer lendId) {
		return Result.Success(lendService.getLendById(lendId));
	}

	/**
	 * 获取借出单分页列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/lends")
	public Result getLends(@RequestParam(required = false) String no, @RequestParam(required = false) String yard,
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
		return Result.Success(lendService.getLends(input));
	}

	/**
	 * 出库
	 *
	 * @author lishzh
	 * @param id
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/lends/out")
	public Result lendOut(@RequestBody BorrowLendInput input) {
		lendService.lendOut(input.getWareBorrowLendSlipId());
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
	@GetMapping("/lends/notRepay")
	public Result getNotRepay(@RequestParam(required = false) String no,
			@RequestParam(required = false) String sparePartsNo, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchBorrowLendInput input = new SearchBorrowLendInput(index, size);
		input.setNo(no);
		input.setSparePartsNo(sparePartsNo);
		return Result.Success(lendService.getNotRepay(input));
	}

	/**
	 * 借出还库
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/lends/repay")
	public Result lendRepay(@RequestBody BorrowLendInput input) {
		lendService.lendRepay(input);
		return Result.Success();
	}

	/**
	 * 借出还库
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/lends/sale")
	public Result lendSale(@RequestBody BorrowLendInput input) {
		lendService.lendSale(input);
		return Result.Success();
	}

}
