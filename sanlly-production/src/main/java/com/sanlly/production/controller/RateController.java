package com.sanlly.production.controller;

import org.apache.commons.lang.StringUtils;
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
import com.sanlly.production.enums.RateCalculationTypeEnum;
import com.sanlly.production.enums.RateFromTypeEnum;
import com.sanlly.production.enums.RateStageEnum;
import com.sanlly.production.models.input.rate.AddRateItemInput;
import com.sanlly.production.models.input.rate.AddSanRateInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.rate.SearchRateInput;
import com.sanlly.production.models.input.rate.UpdateRateItemInput;
import com.sanlly.production.models.input.rate.UpdateSanRateInput;
import com.sanlly.production.service.RateService;

import io.swagger.annotations.Api;

/**
 * 标准费率
 * 
 * @author wangxzh
 *
 */
@RestController
@Api(tags = { "标准费率接口" })
public class RateController {

	@Autowired
	private RateService rateService;

	/**
	 * 费率测试干箱
	 * @return
	 */
	@GetMapping("/rate/getrate/testgx")
	public Result getRateTestGx(){
		rateService.rateTestGx();
		return Result.Success();
	}

	/**
	 * 费率测试冷箱
	 * @return
	 */
	@GetMapping("/rate/getrate/testlx")
	public Result getRateTestLx(){
		rateService.rateTestLx();
		return Result.Success();
	}

	/**
	 * 费率测试机组
	 * @return
	 */
	@GetMapping("/rate/getrate/testjz")
	public Result getRateTestJz(){
		rateService.rateTestJz();
		return Result.Success();
	}

	/**
	 * 获取材料费、工时费等费率信息
	 * 
	 * @Description: TODO
	 * @param company
	 *            地点（公司）
	 * @param containerUser
	 *            用箱人
	 * @param containerCategory
	 *            箱类别
	 * @param partsType
	 *            部件大类
	 * @param partsDetails
	 *            部件明细
	 * @param repair
	 *            维修代码
	 * @param material
	 *            材质代码
	 * @param positionCode
	 *            位置代码
	 * @param containerType
	 *            箱型
	 * @param size
	 *            尺寸
	 * @param length
	 *            长度
	 * @param width
	 *            宽度
	 * @param quantity
	 *            数量
	 * @param fromType
	 *            费率类型
	 * @param courseType
	 *            进场类型
	 * @param domesticForeignTrade
	 *            内外贸
	 * @param isSurrender
	 *            是否退租箱
	 * @param damageCode
	 *            损坏代码
	 * @param sparesNumber
	 *            备件号
	 * @param unitCompany
	 *            冷机公司
	 * @param yard
	 *            场站
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/getrate")
	public Result getRateMessage(@RequestParam String company, @RequestParam String containerUser,
			@RequestParam String containerCategory, @RequestParam(required = false) String partsTypeCode,
			@RequestParam String partsDetailsCode, @RequestParam String repairCode,
			@RequestParam(required = false) String materialCode, @RequestParam(required = false) String positionCode,
			@RequestParam(required = false) String containerType, @RequestParam(required = false) String size,
			@RequestParam(required = false) Double length, @RequestParam(required = false) Double width,
			@RequestParam(required = false) Double quantity, @RequestParam(required = false) String fromType,
			@RequestParam(required = false) String courseType, @RequestParam(required = false) String sparesNumber,
			@RequestParam(required = false) String domesticForeignTrade,
			@RequestParam(required = false) String isSurrender, @RequestParam(required = false) String damageCode,
			@RequestParam(required = false) String stage, @RequestParam(required = false) String unitCompany,
			@RequestParam(required = false) String yard) {
		GetRateMessageInput input = new GetRateMessageInput();
		input.setContainerCategory(containerCategory);
		input.setContainerUser(containerUser);
		input.setPartsType(partsTypeCode);
		if (StringUtils.isNotEmpty(partsDetailsCode))
			input.setPartsDetails(partsDetailsCode.toUpperCase());
		input.setRepair(repairCode);
		// 取录入的位置代码的前两位比较
		if (StringUtils.isNotEmpty(positionCode))
			input.setPositionCode(positionCode.toUpperCase());
		input.setContainerType(containerType);
		input.setSize(size);
		input.setLength(length);
		input.setWidth(width);
		input.setQuantity(quantity);
		input.setCompany(company);
		input.setMaterial(materialCode);
		input.setSparesNumber(sparesNumber);
		input.setUnitCompany(unitCompany);
		input.setYard(yard);
		if (StringUtils.isNotEmpty(fromType))
			input.setFromType(fromType);
		else
			input.setFromType(RateFromTypeEnum.TYPE01.getCode());
		input.setCourseType(courseType);
		input.setDomesticForeignTrade(domesticForeignTrade);
		input.setIsSurrender(isSurrender);
		input.setDamageCode(damageCode);
		if (StringUtils.isNotEmpty(stage))
			input.setStage(stage);
		else
			input.setStage(RateStageEnum.TYPE01.getCode());
		return Result.Success(rateService.getRateAndPayingMessage(input));
	}

	/**
	 * 获取部件大类下拉列表
	 * 
	 * @param name
	 *            编码or名称
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/parttype/select")
	public Result getPartsTypeSelect(@RequestParam(required = false) String name) {
		return Result.Success(rateService.getPartsTypeSelect(name));
	}

	/**
	 * 获取部件明细下拉列表
	 * 
	 * @param name
	 *            编码or名称
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/partdetails/select")
	public Result getPartsDetailsSelect(@RequestParam(required = false) String name) {
		return Result.Success(rateService.getPartsDetailsSelect(name));
	}

	/**
	 * 获取维修代码下拉列表
	 * 
	 * @param name
	 *            编码or名称
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/repair/select")
	public Result getRepairSelect(@RequestParam(required = false) String name) {
		return Result.Success(rateService.getRepairSelect(name));
	}

	/**
	 * 获取材质代码下拉列表
	 * 
	 * @param name
	 *            编码or名称
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/material/select")
	public Result getMaterialSelect(@RequestParam(required = false) String name) {
		return Result.Success(rateService.getMaterialSelect(name));
	}

	/**
	 * 币种下拉
	 * 
	 * @Description: TODO
	 * @param name
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/currency/select")
	public Result getCurrencySelect() {
		return Result.Success(rateService.getCurrencySelect());
	}

	/**
	 * 获取SAN列表数据
	 * 
	 * @param partsType
	 *            部件大类
	 * @param partsDetails
	 *            部件明细
	 * @param repair
	 *            维修代码
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/san")
	public Result getSanRateList(@RequestParam(required = false) String partsType,
			@RequestParam(required = false) String partsDetails, @RequestParam(required = false) String repair,
			@RequestParam(required = false) String containerCategory) {
		SearchRateInput input = new SearchRateInput();
		input.setPartsType(partsType);
		input.setPartsDetails(partsDetails);
		input.setRepair(repair);
		input.setContainerCategory(containerCategory);
		return Result.Success(rateService.getSanRateList(input));
	}

	/**
	 * 新增SAN费率
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/rate/san")
	public Result addSanRate(@RequestBody AddSanRateInput input) {
		rateService.addSanRate(input);
		return Result.Success();
	}

	/**
	 * 获取编辑信息
	 * 
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/san/{rateId}")
	public Result getUpdateSanRate(@PathVariable("rateId") String rateId) {
		return Result.Success(rateService.getUpdateSanRate(rateId));
	}

	/**
	 * SAN费率编辑
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/rate/san")
	public Result updateSanRate(@RequestBody UpdateSanRateInput input) {
		rateService.updateSanRate(input);
		return Result.Success();
	}

	/**
	 * SAN费率删除
	 * 
	 * @param listIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/rate/san")
	public Result delCostRate(@RequestParam String[] listIds) {
		rateService.delSanRate(listIds);
		return Result.Success();
	}

	/**
	 * 根据SAN获取用箱人费率
	 * 
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/userlist/{rateId}")
	public Result getUserRateList(@PathVariable("rateId") String rateId) {
		return Result.Success(rateService.getUserRateList(rateId));
	}

	/**
	 * 根据SAN获取费率明细列表
	 * 
	 * @param rateId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/item")
	public Result getSanRateItemList(@RequestParam String rateId, @RequestParam String calculationType,
			@RequestParam String type) {
		if (calculationType.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode()))
			return Result.Success(rateService.getSanRateGSItemList(rateId, type));
		else
			return Result.Success(rateService.getSanRateQJItemList(rateId, type));
	}

	/**
	 * 费率明细新增
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/rate/san/item")
	public Result addRateItem(@RequestBody AddRateItemInput input) {
		rateService.addRateItem(input);
		return Result.Success();
	}

	/**
	 * 获取费率明细信息
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @param calculationType
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/san/item")
	public Result getRateItemMessage(@RequestParam String rateId, @RequestParam String calculationType) {
		if (calculationType.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode()))
			return Result.Success(rateService.getRateGSItemList(rateId));
		else
			return Result.Success(rateService.getRateQJItemList(rateId));
	}

	/**
	 * 费率明细编辑
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/rate/san/item")
	public Result delRateItem(@RequestBody UpdateRateItemInput input) {
		rateService.updateRateItem(input);
		return Result.Success();
	}

	/**
	 * 费率明细删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/rate/san/item")
	public Result delRateItem(@RequestParam String[] listIds, @RequestParam String type) {
		rateService.delRateItem(listIds, type);
		return Result.Success();
	}

	/**
	 * 获取部件明细下拉
	 * 
	 * @Description: TODO
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/rate/parts/select")
	public Result getPartsSelect() {
		return Result.Success(rateService.getPartsSelect());
	}
}
