package com.sanlly.production.controller;

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
import com.sanlly.production.models.input.rate.AddZYRateInput;
import com.sanlly.production.models.input.rate.CopyZYRateInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.rate.SearchZYRateInput;
import com.sanlly.production.models.input.rate.UpdateZYRateInput;
import com.sanlly.production.models.input.rate.ZyFiveInput;
import com.sanlly.production.service.RateZYService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = { "中远费率接口" })
public class RateZYController {

	@Autowired
	private RateZYService rateService;

	/**
	 * 中远费率列表
	 * 
	 * @param company
	 *            地点
	 * @param containerCategory
	 *            箱类别
	 * @param rateCode
	 *            费率编码
	 * @param partsDetails
	 *            部件明细
	 * @param repair
	 *            维修代码
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zyrate")
	public Result zyRatePagedList(@RequestParam(required = false) String company,
			@RequestParam(required = false) String containerCategory, @RequestParam(required = false) String rateCode,
			@RequestParam(required = false) String partsDetails, @RequestParam(required = false) String repair,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchZYRateInput input = new SearchZYRateInput(index, size);
		input.setCompany(company);
		input.setContainerCategory(containerCategory);
		input.setRateCode(rateCode);
		input.setPartsDetails(partsDetails);
		input.setRepair(repair);
		return Result.Success(rateService.getZYRatePagedList(input));
	}

	/**
	 * 中远费率新增
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/zyrate")
	public Result addZYRate(@RequestBody AddZYRateInput input) {
		rateService.addZYRate(input);
		return Result.Success();
	}

	/**
	 * 获取中远费率单条数据
	 * 
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zyrate/{rateId}")
	public Result messageDetail(@PathVariable("rateId") String rateId) {
		return Result.Success(rateService.getZYRate(rateId));
	}

	/**
	 * 编辑中远费率
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/zyrate")
	public Result updateZYRate(@RequestBody UpdateZYRateInput input) {
		rateService.updateZYRate(input);
		return Result.Success();
	}

	/**
	 * 删除中远费率
	 * 
	 * @param rateIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/zyrate")
	public Result delZYRate(@RequestParam String[] rateIds) {
		rateService.delZYRate(rateIds);
		return Result.Success();
	}

	/**
	 * 中远费率复制
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/copyzy")
	public Result copyZYRate(@RequestBody CopyZYRateInput input) {
		rateService.copyZYRate(input);
		return Result.Success();
	}

	/**
	 * 是否存在费率
	 * 
	 * @param company
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zyrate/isexist")
	public Result isExist(@RequestParam String company) {
		return Result.Success(rateService.isExist(company));
	}

	/**
	 * 费率代码是否已存在
	 * 
	 * @param company
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zyrate/isexist/code")
	public Result isExistCode(@RequestParam String code, @RequestParam(required = false) String rateId) {
		return Result.Success(rateService.isExistCode(code, rateId));
	}

	/**
	 * 中远五位代码
	 * 
	 * @param company
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zyrate/five")
	public Result getZYFiveCodeMessage(@RequestParam String fiveCode, @RequestParam String containerType,
			@RequestParam String size, @RequestParam String positionCode, @RequestParam String company) {
		ZyFiveInput input = new ZyFiveInput();
		input.setFiveCode(fiveCode);
		input.setContainerType(containerType);
		input.setSize(size);
		input.setPositionCode(positionCode);
		input.setCompany(company);
		return Result.Success(rateService.getZYFiveMessage(input));
	}

	/**
	 * 根据条件获取中远费率长宽
	* @Description: TODO 
	* @param partsDetails 部件明细
	* @param repair 维修代码
	* @param containerType 箱型
	* @param size 尺寸
	* @param positionCode 位置代码
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zyrate/select")
	public Result getZYFiveCodeSelectMessage(@RequestParam String partsDetails, @RequestParam String repair,
			@RequestParam(required = false) String containerType, @RequestParam(required = false) String size,
			@RequestParam(required = false) String positionCode) {
		GetRateMessageInput input = new GetRateMessageInput();
		input.setPartsDetails(partsDetails);
		input.setRepair(repair);
		input.setContainerType(containerType);
		input.setSize(size);
		input.setPositionCode(positionCode);
		return Result.Success(rateService.getZYFiveCodeSelectMessage(input));
	}
}
