package com.sanlly.production.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInfoInput;
import com.sanlly.production.models.input.quality.QaQualityInput;
import com.sanlly.production.models.input.quality.QualityCourseEntryInfoInput;
import com.sanlly.production.models.input.quality.QualityEntryListInput;
import com.sanlly.production.models.input.quality.SearchQaListInput;
import com.sanlly.production.models.input.quality.SearchSonQualityListInput;
import com.sanlly.production.service.QualityService;

import io.swagger.annotations.Api;

/**
 * 安全品控
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月10日 下午1:29:40 
 * @version V1.0   
 */
@RestController
@Api(tags = { "质检接口" })
public class QualityController {

	@Autowired
	private QualityService qualityService;

	/**
	 * 子公司现场质检列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 *            箱号
	 * @param courseType
	 *            进场类型
	 * @param designateUser
	 *            指派班组
	 * @param containerUser
	 *            用箱人
	 * @param referralState
	 *            维修状态
	 * @param qualityType
	 *            质检类型
	 * @param referralStartDate
	 *            派工开始时间
	 * @param referralEndDate
	 *            派工结束时间
	 * @param finishStartDate
	 *            完工开始时间
	 * @param finishEndDate
	 *            完工结束时间
	 * @param index
	 * @param size
	 * @return Result @throws 
	 * @throws ParseException
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/safe/son")
	public Result getSonQualityList(@RequestParam String containerCondition, @RequestParam String containerCategory,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String courseType,
			@RequestParam(required = false) Integer designateUser, @RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String referralState, @RequestParam(required = false) String qualityType,
			@RequestParam(required = false) String referralStartDate,
			@RequestParam(required = false) String referralEndDate,
			@RequestParam(required = false) String finishStartDate,
			@RequestParam(required = false) String finishEndDate, @RequestParam(required = false) Integer index,
			@RequestParam(required = false) Integer size) throws ParseException {
		SearchSonQualityListInput input = new SearchSonQualityListInput(index, size);
		input.setContainerCondition(containerCondition);
		input.setContainerCategory(containerCategory);
		input.setContainerNo(containerNo);
		input.setCourseType(courseType);
		input.setDesignateUser(designateUser);
		input.setContainerUser(containerUser);
		input.setReferralState(referralState);
		input.setQualityType(qualityType);
		input.setReferralStartDate(referralStartDate);
		input.setReferralEndDate(referralEndDate);
		input.setFinishStartDate(finishStartDate);
		input.setFinishEndDate(finishEndDate);
		return Result.Success(qualityService.getSonQualityList(input));
	}

	/**
	 * 子公司现场质检合格
	 * 
	 * @Description: TODO
	 * @param foamingId
	 * @param photo
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/safe/son/yes")
	public Result sonQualityYes(String courseId, String photo) {
		qualityService.sonQualityYes(courseId, photo);
		return Result.Success();
	}

	/**
	 * 子公司复检合格
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param photo
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/safe/son/againYes")
	public Result sonQualityAgainYes(String courseId, String photo) {
		qualityService.sonQualityAgainYes(courseId, photo);
		return Result.Success();
	}

	/**
	 * 根据进场id和箱类别获取条目信息
	 * 
	 * @Description: TODO
	 * @param prodCourseId
	 * @param containerCategory
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/quality/entry/list")
	public Result getQualityEntryList(@RequestParam(required = true) String prodCourseId,
			@RequestParam(required = true) String containerCategory) {
		return Result.Success(qualityService.getQualityEntryList(prodCourseId, containerCategory));
	}

	/**
	 * 删除质检明细
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/quality/entry/delete")
	public Result qualityEntryDelete(@RequestBody QualityEntryListInput input) {
		qualityService.qualityEntryDelete(input);
		return Result.Success();
	}

	/**
	 * 质检暂存
	 * 
	 * @Description: TODO
	 * @param input
	 * @return
	 * @throws Exception
	 *             Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/quality/entry/save")
	public Result saveQualityCourserEntryInfo(@RequestBody QualityCourseEntryInfoInput input) throws Exception {
		qualityService.saveQualityCourserEntryInfo(input);
		return Result.Success();
	}

	/**
	 * 质检好转坏
	 * 
	 * @Description: TODO
	 * @param input
	 * @return
	 * @throws Exception
	 *             Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/quality/entry/upload")
	public Result uploadQualityCourserEntryInfo(@RequestBody QualityCourseEntryInfoInput input) throws Exception {
		qualityService.uploadQualityCourserEntryInfo(input);
		return Result.Success();
	}

	/**
	 * 获取问题类别
	 * 
	 * @Description: TODO
	 * @param prodCourseId
	 * @param containerCategory
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/quality/question")
	public Result getQuestionList(@RequestParam String containerCategory) {
		return Result.Success(qualityService.getQuestionList(containerCategory));
	}

	/**
	 * 获取整改标准
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/quality/standard")
	public Result getStandardList(@RequestParam String question) {
		return Result.Success(qualityService.getStandardList(question));
	}

	/**
	 * 错项、漏项、返工原因
	 * 
	 * @Description: TODO
	 * @param reasonType
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/quality/cause")
	public Result getQualityCauseList(@RequestParam String reasonType) {
		return Result.Success(qualityService.getQualityCauseList(reasonType));
	}

	/**
	 * 安全品控质检
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 *            箱类别
	 * @param containerNo
	 *            箱号
	 * @param courseType
	 *            进场类型
	 * @param designateUser
	 *            指派班组
	 * @param containerUser
	 *            用箱人
	 * @param company
	 *            公司
	 * @param yard
	 *            场站
	 * @param qualityResult
	 *            子公司质检结果
	 * @param referralStartDate
	 *            派工开始时间
	 * @param referralEndDate
	 *            派工结束时间
	 * @param finishStartDate
	 *            完工开始时间
	 * @param finishEndDate
	 *            完工结束时间
	 * @param index
	 * @param size
	 * @return
	 * @throws ParseException
	 *             Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/quality/qa")
	public Result getQaList(@RequestParam String containerCategory, @RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String courseType, @RequestParam(required = false) Integer designateUser,
			@RequestParam(required = false) String containerUser, @RequestParam(required = false) String company,
			@RequestParam(required = false) String yard, @RequestParam(required = false) String qualityResult,
			@RequestParam(required = false) String referralStartDate,
			@RequestParam(required = false) String referralEndDate,
			@RequestParam(required = false) String finishStartDate,
			@RequestParam(required = false) String finishEndDate, @RequestParam(required = false) Integer pageIndex,
			@RequestParam(required = false) Integer pageSize) throws ParseException {
		SearchQaListInput input = new SearchQaListInput(pageIndex, pageSize);
		input.setContainerCategory(containerCategory);
		input.setContainerNo(containerNo);
		input.setCourseType(courseType);
		input.setDesignateUser(designateUser);
		input.setContainerUser(containerUser);
		input.setCompany(company);
		input.setYard(yard);
		input.setQualityResult(qualityResult);
		input.setReferralStartDate(referralStartDate);
		input.setReferralEndDate(referralEndDate);
		input.setFinishStartDate(finishStartDate);
		input.setFinishEndDate(finishEndDate);
		return Result.Success(qualityService.getQaList(input));
	}

	/**
	 * 品控部质检通过
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param containerCategory
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("quality/yes")
	public Result qaQualityYes(@RequestBody QaQualityInput input) {
		qualityService.qaQualityYes(input);
		return Result.Success();
	}

	/**
	 * 品控部质检不通过
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param containerCategory
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("quality/no")
	public Result qaQualityNo(@RequestBody QaQualityInput input) {
		qualityService.qaQualityNo(input);
		return Result.Success();
	}

	/**
	 * 复检合格
	 * 
	 * @Description: TODO
	 * @param input
	 * @return
	 * @throws Exception
	 *             Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/quality/recheckOk")
	public Result recheckOk(@RequestBody QualityCourseEntryInfoInput input) throws Exception {
		qualityService.recheckOk(input);
		return Result.Success();
	}

	/**
	 * 复检不合格
	 * 
	 * @Description: TODO
	 * @param input
	 * @return
	 * @throws Exception
	 *             Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/quality/recheckNo")
	public Result recheckNo(@RequestBody QualityCourseEntryInfoInput input) throws Exception {
		qualityService.recheckNo(input);
		return Result.Success();
	}

}
