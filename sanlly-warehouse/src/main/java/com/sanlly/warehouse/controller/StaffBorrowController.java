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
import com.sanlly.warehouse.models.input.staffborrow.SearchStaffBorrowInput;
import com.sanlly.warehouse.models.input.staffborrow.StaffborrowInput;
import com.sanlly.warehouse.service.StaffBorrowService;

import io.swagger.annotations.Api;

/**
 * 员工借件Controller
 * 
 * @author lishzh
 *
 */
@Api(tags = { "员工借件API" })
@RestController
public class StaffBorrowController {

	@Autowired
	StaffBorrowService staffBorrowService;

	/**
	 * 添加员工借件单
	 *
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/staffBorrows")
	public Result addStaffBorrow(@RequestBody StaffborrowInput input) {
		staffBorrowService.addStaffBorrow(input);
		return Result.Success();
	}

	/**
	 * 修改员工借件单
	 *
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/staffBorrows")
	public Result edidStaffBorrow(@RequestBody StaffborrowInput input) {
		staffBorrowService.edidStaffBorrow(input);
		return Result.Success();
	}

	/**
	 * 删除员工借件单
	 *
	 * @author lishzh
	 * @param ids
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/staffBorrows")
	public Result deleteStaffBorrow(@RequestParam List<Integer> ids) {
		staffBorrowService.deleteStaffBorrow(ids);
		return Result.Success();
	}

	/**
	 * 获取员工借件单列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/staffBorrows")
	public Result getStaffBorrows(@RequestParam(required = false) String no,
			@RequestParam(required = false) String yard, @RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String status, @RequestParam(required = false) String warehouse,
			@RequestParam(required = false) String warehouseType, @RequestParam(required = false) String sparePartsNo,
			@RequestParam(required = false) String sparePartsName, @RequestParam(required = false) Date startDate,
			@RequestParam(required = false) Integer userId, @RequestParam(required = false) Date endDate,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchStaffBorrowInput input = new SearchStaffBorrowInput(index, size);
		input.setContainerNo(containerNo);
		input.setEndDate(endDate);
		input.setNo(no);
		input.setSparePartsName(sparePartsName);
		input.setSparePartsNo(sparePartsNo);
		input.setStartDate(startDate);
		input.setStatus(status);
		input.setWarehouse(warehouse);
		input.setWarehouseType(warehouseType);
		input.setYard(yard);
		input.setUserId(userId);
		return Result.Success(staffBorrowService.getStaffBorrows(input));
	}

	/**
	 * 根据id获取员工借件单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/staffBorrows/{staffBorrowId}")
	public Result getStaffBorrowById(@PathVariable(value = "staffBorrowId") Integer staffBorrowId) {
		return Result.Success(staffBorrowService.getStaffBorrowById(staffBorrowId));
	}
	
	/**
	 * 根据id获取员工借件单 及所有明细   不去重
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/staffBorrows/allDetail/{staffBorrowId}")
	public Result getStaffBorrow(@PathVariable(value = "staffBorrowId") Integer staffBorrowId) {
		return Result.Success(staffBorrowService.getStaffBorrow(staffBorrowId));
	}

	/**
	 * 借件单出库
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/staffBorrows/out")
	public Result staffBorrowOut(@RequestBody StaffborrowInput input) {
		staffBorrowService.staffBorrowOut(input.getWareStaffBorrowId());
		return Result.Success();
	}

	/**
	 * 借件单还库
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/staffBorrows/repay")
	public Result staffRepay(@RequestBody StaffborrowInput input) {
		staffBorrowService.staffRepay(input);
		return Result.Success();
	}

	/**
	 * 获取借件未还列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/staffBorrows/notRepay")
	public Result getNotRepay(@RequestParam(required = false) String no,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String sparePartsNo,
			@RequestParam(required = false) Integer userId, @RequestParam Integer index, @RequestParam Integer size) {
		SearchStaffBorrowInput input = new SearchStaffBorrowInput(index, size);
		input.setContainerNo(containerNo);
		input.setNo(no);
		input.setSparePartsNo(sparePartsNo);
		input.setUserId(userId);
		return Result.Success(staffBorrowService.getNotRepay(input));
	}

}
