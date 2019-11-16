package com.sanlly.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.billtype.AddBillTypeInput;
import com.sanlly.warehouse.models.input.billtype.EditBillTypeInput;
import com.sanlly.warehouse.models.input.billtype.SearchBillTypeInput;
import com.sanlly.warehouse.service.BillTypeService;

import io.swagger.annotations.Api;

/**
 * 单据类型API
 * 
 * @author lishzh
 *
 */
@Api(tags = { "单据类型API" })
@RestController
public class BillTypeController {

	@Autowired
	BillTypeService billTypeService;

	/**
	 * 添加单据类型
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billTypes")
	public Result addBillType(@RequestBody AddBillTypeInput input) {
		billTypeService.addBillType(input);
		return Result.Success();
	}

	/**
	 * 修改单据类型
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/billTypes")
	public Result editBillType(@RequestBody EditBillTypeInput input) {
		billTypeService.editBillType(input);
		return Result.Success();
	}

	/**
	 * 删除单据类型
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/billTypes")
	public Result deleteBillType(@RequestParam String[] keys) {
		billTypeService.deleteBillType(keys);
		return Result.Success();
	}

	/**
	 * 分页查询单据类型
	 * 
	 * @param key
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/pages")
	public Result getPageBillType(@RequestParam(required = false) String key, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchBillTypeInput input = new SearchBillTypeInput(index, size);
		input.setKey(key);
		return Result.Success(billTypeService.getPageBillType(input));
	}

	/**
	 * 查询所有单据类型
	 * 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes")
	public Result getAllBillType() {
		return Result.Success(billTypeService.getAllBillType());
	}

	/**
	 * 根据单据类型名称生成单号
	 * 
	 * @param billTypeName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/getBillNumber")
	public Result getBillNumber(@RequestParam String billTypeName) {
		return Result.Success(billTypeService.getBillNumber(billTypeName));
	}

	/**
	 * 根据单据类型名称和公司生成单号
	 * 
	 * @param billTypeName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/getBillNumber/company")
	public Result getBillNumber(@RequestParam String billTypeName, @RequestParam String company) {
		return Result.Success(billTypeService.getBillNumber(billTypeName, company));
	}

	/**
	 * 根据单据类型key生成单号
	 *
	 * @param billTypekey
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/getBillNumberBykey")
	public Result getBillNumberBykey(@RequestParam String billTypekey) {
		return Result.Success(billTypeService.getBillNumberByKey(billTypekey));
	}

	/**
	 * 根据单据类型key和公司生成单号
	 *
	 * @author lishzh
	 * @param billTypekey 单据类型key
	 * @param company     公司
	 * @return BillNumber 单号
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/getBillNumberBykey/company")
	public Result getBillNumberBykey(@RequestParam String billTypekey, @RequestParam String company) {
		return Result.Success(billTypeService.getBillNumberByKey(billTypekey, company));
	}

	/**
	 * 根据单据类型名获取对应key
	 * 
	 * @author lishzh
	 * @param billTypeName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/getBillTypeKey")
	public Result getBillTypeKeyByName(@RequestParam String billTypeName) {
		return Result.Success(billTypeService.getBillTypeKeyByName(billTypeName));
	}

	/**
	 * 校验单据类型名称是否重复
	 * 
	 * @author lishzh
	 * @param billTypeName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/billTypes/valid")
	public Result nameDuplicateValid(@RequestParam String billTypeName) {
		return Result.Success(billTypeService.nameDuplicateValid(billTypeName));
	}

}
