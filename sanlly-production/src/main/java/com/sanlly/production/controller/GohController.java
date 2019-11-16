package com.sanlly.production.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.enums.GohTypeEnum;
import com.sanlly.production.models.input.foaming.SearchFoamingInput;
import com.sanlly.production.models.input.goh.GohContainerCourseAddInput;
import com.sanlly.production.models.input.goh.GohContainerGohAddInput;
import com.sanlly.production.models.input.goh.GohEntryRateInput;
import com.sanlly.production.models.input.goh.GohListInput;
import com.sanlly.production.models.input.goh.GohRequireAddInput;
import com.sanlly.production.models.input.goh.GohRequireUpdateInput;
import com.sanlly.production.models.input.goh.SearchGohContainerInput;
import com.sanlly.production.models.input.goh.SearchGohRequireInput;
import com.sanlly.production.models.input.rate.AddSanRateInput;
import com.sanlly.production.service.GohService;

import io.swagger.annotations.Api;

/**
 * 挂衣箱
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月21日 下午4:07:52 
 * @version V1.0   
 */
@RestController
@Api(tags = { "挂衣箱接口" })
public class GohController {

	@Autowired
	private GohService gohService;

	/**
	 * 改制要求列表
	 * 
	 * @Description: TODO
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/list")
	public Result getGohList(@RequestParam(required = false) String name, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchGohRequireInput input = new SearchGohRequireInput(index, size);
		input.setEntryName(name);
		return Result.Success(gohService.getGohList(input));
	}

	/**
	 * 根据改制要求获取挂衣箱列表
	 * 
	 * @Description: TODO
	 * @param gohId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/one")
	public Result getGohOne(@RequestParam Integer gohId, @RequestParam Integer index, @RequestParam Integer size) {
		return Result.Success(gohService.getGohOne(gohId, index, size));
	}

	/**
	 * 获取挂衣箱列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @param containerUser
	 * @param yard
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/searchList")
	public Result getGohList(@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String containerUser, @RequestParam(required = false) String yard,
			@RequestParam Integer index, @RequestParam Integer size) {
		GohListInput input = new GohListInput(index, size);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setYard(yard);
		return Result.Success(gohService.getGohList(input));
	}

	/**
	 * 新增改制要求
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/goh/require")
	public Result addRequire(@RequestBody GohRequireAddInput input) {
		gohService.addRequire(input);
		return Result.Success();
	}

	/**
	 * 获取单条改制要求信息
	 * 
	 * @Description: TODO
	 * @param requireId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/require")
	public Result getGohRequire(@RequestParam Integer requireId) {
		return Result.Success(gohService.getGohRequire(requireId));
	}

	/**
	 * 删除改制要求和挂衣箱的绑定关系
	 * 
	 * @Description: TODO
	 * @param listIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/goh/list")
	public Result delGohList(@RequestParam Integer[] gohIds) {
		gohService.delGohList(gohIds);
		return Result.Success();
	}

	/**
	 * 改制要求编辑
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/goh/require")
	public Result updateRequire(@RequestBody GohRequireUpdateInput input) {
		gohService.updateRequire(input);
		return Result.Success();
	}

	/**
	 * 添加挂衣箱基础信息
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/goh/add")
	public Result addGohContainer(@RequestBody GohContainerCourseAddInput input) {
		gohService.addGohContainer(input);
		return Result.Success();
	}

	/**
	 * 挂衣箱列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 *            箱号
	 * @param containerUser
	 *            用箱人
	 * @param yard
	 *            场站
	 * @param isEntry
	 *            是否存在条目
	 * @param reshapeType
	 *            改制类型
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/container")
	public Result getGohContainerList(@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String containerUser, @RequestParam(required = false) String yard,
			@RequestParam(required = false) String isEntry, @RequestParam(required = false) String reshapeType,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchGohContainerInput input = new SearchGohContainerInput(index, size);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setYard(yard);
		input.setIsEntry(isEntry);
		input.setReshapeType(reshapeType);
		return Result.Success(gohService.getGohContainerList(input));
	}

	/**
	 * 根据挂衣箱id获取条目信息
	 * 
	 * @Description: TODO
	 * @param gohId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/container/entry")
	public Result getGohContainerEntryList(@RequestParam Integer gohId) {
		return Result.Success(gohService.getGohContainerEntryList(gohId));
	}

	/**
	 * 添加挂衣箱
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/goh/addgoh")
	public Result addGohContainerByGoh(@RequestBody GohContainerGohAddInput input) throws ParseException {
		return Result.Success(gohService.addGohContainerByGoh(input));
	}

	/**
	 * 获取进场信息
	 * 
	 * @Description: TODO
	 * @param containerNo
	 *            箱号
	 * @param containerUser
	 *            用箱人
	 * @param yard
	 *            场站
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/course")
	public Result getCourseList(@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String containerUser, @RequestParam(required = false) String yard,
			@RequestParam Integer index, @RequestParam Integer size) {
		GohListInput input = new GohListInput(index, size);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setYard(yard);
		return Result.Success(gohService.getCourseList(input));
	}

	/**
	 * 根据进场添加挂衣箱
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/addByCourse")
	public Result addGohContainerByGoh(@RequestParam String[] listIds) {
		gohService.addGohContainerByCourseIds(listIds);
		return Result.Success();
	}

	/**
	 * 获取挂衣箱相关信息
	 * 
	 * @Description: TODO
	 * @param gohId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/getGoh")
	public Result getGohContainer(@RequestParam Integer gohId) {
		return Result.Success(gohService.getGohContainer(gohId));
	}

	/**
	 * 获取挂衣箱费率
	 * 
	 * @Description: TODO
	 * @param size
	 * @param structure
	 * @param tierNumber
	 * @param reshapeType
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/getRateName")
	public Result getRateNameSelectList(@RequestParam String size, @RequestParam String structure,
			@RequestParam String tierNumber, @RequestParam String reshapeType) {
		GohEntryRateInput input = new GohEntryRateInput();
		input.setSize(size);
		input.setStructure(structure);
		input.setTierNumber(tierNumber);
		input.setReshapeType(reshapeType);
		return Result.Success(gohService.getRateNameSelectList(input));
	}

	/**
	 * 获取备件
	 * 
	 * @Description: TODO
	 * @param size
	 * @param structure
	 * @param tierNumber
	 * @param reshapeType
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/getSparesNumber")
	public Result getSparesNumberSelectList(@RequestParam String size, @RequestParam String structure,
			@RequestParam String tierNumber, @RequestParam String reshapeType, @RequestParam String entryName) {
		GohEntryRateInput input = new GohEntryRateInput();
		input.setSize(size);
		input.setStructure(structure);
		input.setTierNumber(tierNumber);
		input.setReshapeType(reshapeType);
		input.setEntryName(entryName);
		return Result.Success(gohService.getSparesNumberSelectList(input));
	}

	/**
	 * 获取对应数量
	 * 
	 * @Description: TODO
	 * @param size
	 * @param structure
	 * @param tierNumber
	 * @param reshapeType
	 * @param entryName
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/getQuantity")
	public Result getQuantitySelectList(@RequestParam String size, @RequestParam String structure,
			@RequestParam String tierNumber, @RequestParam String reshapeType, @RequestParam String entryName,
			@RequestParam String sparesNumber) {
		GohEntryRateInput input = new GohEntryRateInput();
		input.setSize(size);
		input.setStructure(structure);
		input.setTierNumber(tierNumber);
		input.setReshapeType(reshapeType);
		input.setEntryName(entryName);
		input.setSparesNumber(sparesNumber);
		return Result.Success(gohService.getQuantitySelectList(input));
	}

	/**
	 * 获取工时
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @param quantity
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/getManHour")
	public Result getManHourInfo(@RequestParam String size, @RequestParam String structure,
			@RequestParam String tierNumber, @RequestParam String reshapeType, @RequestParam String entryName,
			@RequestParam String sparesNumber, @RequestParam String numberExplain, @RequestParam Double quantity) {
		GohEntryRateInput input = new GohEntryRateInput();
		input.setSize(size);
		input.setStructure(structure);
		input.setTierNumber(tierNumber);
		input.setReshapeType(reshapeType);
		input.setEntryName(entryName);
		input.setSparesNumber(sparesNumber);
		input.setNumberExplain(numberExplain);
		input.setQuantity(quantity);
		return Result.Success(gohService.getManHourInfo(input));
	}

	/**
	 * 删除挂衣箱条目
	 * 
	 * @Description: TODO
	 * @param gohIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/goh/entry/delete")
	public Result delGohEntryList(@RequestParam Integer[] ids) {
		gohService.delGohEntryList(ids);
		return Result.Success();
	}

	/**
	 * 获取挂衣箱改装费用
	 * 
	 * @Description: TODO
	 * @param size
	 * @param structure
	 * @param tierNumber
	 * @param reshapeType
	 * @param entryName
	 * @param sparesNumber
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/getMoney")
	public Result getGohMoney(@RequestParam String size, @RequestParam String tierNumber,
			@RequestParam String reshapeType, @RequestParam String weight) {
		GohEntryRateInput input = new GohEntryRateInput();
		input.setSize(size);
		input.setTierNumber(tierNumber);
		input.setReshapeType(reshapeType);
		input.setWeight(weight);
		return Result.Success(gohService.getGohMoney(input));
	}

	/**
	 * 检验状态
	 * 
	 * @Description: TODO
	 * @param id
	 * @param state
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/testingState")
	public Result updateTestingState(@RequestParam Integer id, @RequestParam String state) {
		gohService.updateTestingState(id, state);
		return Result.Success();
	}

	/**
	 * 派工状态
	 * 
	 * @Description: TODO
	 * @param id
	 * @param state
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/referralState")
	public Result updateReferralState(@RequestParam Integer id, @RequestParam String state) {
		gohService.updateReferralState(id, state);
		return Result.Success();
	}

	/**
	 * 获取拆箱条目
	 * 
	 * @Description: TODO
	 * @param size
	 * @param structure
	 * @param tierNumber
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/devanning")
	public Result getDevanning(@RequestParam String size, @RequestParam String structure,
			@RequestParam String tierNumber) {
		GohEntryRateInput input = new GohEntryRateInput();
		input.setSize(size);
		input.setStructure(structure);
		input.setTierNumber(tierNumber);
		input.setReshapeType(GohTypeEnum.DISMANTLE.getCode());
		return Result.Success(gohService.getDevanning(input));
	}

	/**
	 * 领料
	 * 
	 * @Description: TODO
	 * @param id
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/goh/picking")
	public Result addPickingList(@RequestParam Integer id) {
		gohService.addPickingList(id);
		return Result.Success();
	}

}
