package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.paying.PayingChangeInput;
import com.sanlly.production.service.PayingChangeService;

import io.swagger.annotations.Api;

/**
 * 付费方转换接口
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月12日 下午4:03:36 
 * @version V1.0   
 */
@RestController
@Api(tags = { "付费方转换接口" })
public class PayingChangeController {

	@Autowired
	private PayingChangeService payingService;

	/**
	 * 检验条目付费方获取（条目录入使用，获取付费方）
	 * 
	 * @Description: TODO
	 * @param company
	 *            公司
	 * @param courseType
	 *            进场类型
	 * @param containerUser
	 *            用箱人
	 * @param containerCategory
	 *            箱类别
	 * @param partsRepairCode
	 *            部件修理代码
	 * @param domesticForeignTrade
	 *            内外贸
	 * @param damageCode
	 *            损坏代码
	 * @param isSurrender
	 *            是否退租箱
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/paying/change")
	public Result getPayingChange(@RequestParam String company, @RequestParam String courseType,
			@RequestParam(required = false) String containerCategory,
			@RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String partsRepairCode,
			@RequestParam(required = false) String domesticForeignTrade,
			@RequestParam(required = false) String damageCode, @RequestParam String isSurrender) {
		PayingChangeInput input = new PayingChangeInput();
		input.setCompany(company);
		input.setCourseType(courseType);
		input.setContainerCategory(containerCategory);
		input.setContainerUser(containerUser);
		input.setPartsRepairCode(partsRepairCode);
		input.setDomesticForeignTrade(domesticForeignTrade);
		input.setDamageCode(damageCode);
		input.setIsSurrender(isSurrender);
		return Result.Success(payingService.getPayingChange(input));
	}

}
