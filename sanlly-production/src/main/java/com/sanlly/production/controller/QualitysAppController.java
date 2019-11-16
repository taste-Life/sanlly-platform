package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.qualitys.QualitysContInput;
import com.sanlly.production.models.input.app.qualitys.QualitysUnitInput;
import com.sanlly.production.models.input.app.qualitys.SearchQualitysInput;
import com.sanlly.production.service.app.QualitysAppService;

import io.swagger.annotations.Api;

/**
 * 安全质检
 * 
 * @author wangxzh
 *
 */
@RestController
@Api(tags = { "APP质检相关接口" })
public class QualitysAppController {

	@Autowired
	private QualitysAppService qualitysService;

	/**
	 * app质检列表
	 * 
	 * @param type
	 *            箱类别
	 * @param containerNo
	 *            箱号
	 * @param isQuality
	 *            质检类型
	 * @param qualityState
	 *            质检状态
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/qualitys")
	public Result qualitysPagedList(@RequestParam String type, @RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String isQuality, @RequestParam(required = false) String qualityState,
			@RequestParam Integer index, @RequestParam Integer size) {
		SearchQualitysInput input = new SearchQualitysInput(index, size);
		input.setType(type);
		input.setContainerNo(containerNo);
		input.setIsQuality(isQuality);
		input.setQualityState(qualityState);
		return Result.Success(qualitysService.getQualitysPagedList(input));
	}

	/**
	 * 质检明细-箱体
	 * 
	 * @param prodCourseId
	 *            进场id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containerQualityDetails")
	public Result containerQualityDetails(@RequestParam String prodCourseId, @RequestParam String containerCategory) {
		return Result.Success(qualitysService.containerQualityDetails(prodCourseId, containerCategory));
	}

	/**
	 * 质检明细-机组（删除）
	 * 
	 * @param prodCourseId
	 *            进场id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unitReferralDetails")
	public Result unitReferralDetails(@RequestParam String prodCourseId) {
		return Result.Success(qualitysService.unitReferralDetails(prodCourseId));
	}

	/**
	 * 提交质检明细-箱体
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containerQualityDetail")
	public Result updateQualityContEntry(@RequestBody QualitysContInput input) {
		qualitysService.updateQualityContEntry(input);
		return Result.Success();
	}

	/**
	 * 提交质检明细-机组（删除）
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subUnitQualityDetail")
	public Result updateQualityUnitEntry(@RequestBody QualitysUnitInput input) {
		qualitysService.updateQualityUnitEntry(input);
		return Result.Success();
	}

	/**
	 * 获取质检错误原因
	 * 
	 * @Description: TODO
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/qualityReasons")
	public Result getQualityReasons(@RequestParam String reasonType) {
		return Result.Success(qualitysService.getQualityReasons(reasonType));
	}

	/**
	 * 获取返工问题类别和整改标准列表
	 * 
	 * @Description: TODO
	 * @param reasonType
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/qualitystandards")
	public Result getQualityStandards(@RequestParam String containerCategory) {
		return Result.Success(qualitysService.getQualityStandards(containerCategory));
	}

}
