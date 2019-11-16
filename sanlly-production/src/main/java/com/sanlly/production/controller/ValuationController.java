package com.sanlly.production.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.models.input.referral.AnewReferraInput;
import com.sanlly.production.models.input.valuation.PicExportInput;
import com.sanlly.production.models.input.valuation.ValuationBatchReplyInput;
import com.sanlly.production.models.input.valuation.ValuationCodeInput;
import com.sanlly.production.models.input.valuation.ValuationIdAndCategoryInput;
import com.sanlly.production.models.input.valuation.ValuationReferralInput;
import com.sanlly.production.models.output.valuation.UnitUrgencyOutput;
import com.sanlly.production.models.output.valuation.ValuationBatchReplyOutput;
import com.sanlly.production.models.output.valuation.ValuationListOutput;
import com.sanlly.production.service.ReferralService;
import com.sanlly.production.service.ValuationService;

import io.swagger.annotations.Api;

/**
 * 估价controller
 * @author zhangkai
 *
 */
@RestController
@Api(tags = {"估价API"})
@RequestMapping("/valuation")
public class ValuationController {
	
	@Autowired
	private ValuationService valuationService;
	@Autowired
	private ReferralService referralService;
	
	/**
	 * 待估价列表-干箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/unValuationList")
	public Result<PagedList<ValuationListOutput>> unValuationList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		String[] valuationStates = new String[]{ReplyStateEnum.UNDO.getCode()};
		return Result.Success(valuationService.list(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 待估价列表-冷箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @param valuationStates
	 * @return
	 * @author zhangkai
	 * @throws ParseException 
	 */
	@GetMapping("/unValuationCodeList")
	public Result<PagedList<ValuationListOutput>> unValuationCodeList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) throws ParseException {
		String[] valuationStates = new String[]{ReplyStateEnum.UNDO.getCode()};
		return Result.Success(valuationService.codeList(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 待批复列表-干箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/unReplyList")
	public Result<PagedList<ValuationListOutput>> unReplyList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		String[] valuationStates = new String[]{ReplyStateEnum.UNREPLY.getCode()};
		return Result.Success(valuationService.list(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 待批复列表-冷箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @param valuationStates
	 * @return
	 * @author zhangkai
	 * @throws ParseException 
	 */
	@GetMapping("/unReplyCodeList")
	public Result<PagedList<ValuationListOutput>> unReplyCodeList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) throws ParseException {
		String[] valuationStates = new String[]{ReplyStateEnum.UNREPLY.getCode()};
		return Result.Success(valuationService.codeList(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 待处理列表-干箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/unProcessList")
	public Result<PagedList<ValuationListOutput>> unProcessList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		String[] valuationStates = new String[]{ReplyStateEnum.UNPROCESS.getCode()};
		return Result.Success(valuationService.list(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 待处理列表-冷箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @param valuationStates
	 * @return
	 * @author zhangkai
	 * @throws ParseException 
	 */
	@GetMapping("/unProcessCodeList")
	public Result<PagedList<ValuationListOutput>> unProcessCodeList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) throws ParseException {
		String[] valuationStates = new String[]{ReplyStateEnum.UNPROCESS.getCode()};
		return Result.Success(valuationService.codeList(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 全部列表-干箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/allList")
	public Result<PagedList<ValuationListOutput>> allList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = false, value = "valuationState") String valuationState,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		String[] valuationStates;
		if (valuationState != null && valuationState != "") {
			valuationStates = new String[]{
					valuationState
			};
		} else {
			valuationStates = new String[]{
					ReplyStateEnum.UNDO.getCode(),
					ReplyStateEnum.UNREPLY.getCode(),
					ReplyStateEnum.UNPROCESS.getCode(),
					ReplyStateEnum.APPLYED.getCode(),
					ReplyStateEnum.TURNGOOD.getCode(),
					ReplyStateEnum.REJECT.getCode()
			};
		}
		return Result.Success(valuationService.list(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize, valuationStates));
	}
	
	/**
	 * 待处理列表-冷箱
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param ladingNo
	 * @param containerNo
	 * @param containerUser
	 * @param courseType
	 * @param pageNum
	 * @param pageSize
	 * @param valuationStates
	 * @return
	 * @author zhangkai
	 * @throws ParseException 
	 */
	@GetMapping("/allCodeList")
	public Result<PagedList<ValuationListOutput>> allCodeList(
			@RequestParam(required = false, value = "beginCourseTime") String beginCourseTime,
			@RequestParam(required = false, value = "endCourseTime") String endCourseTime,
			@RequestParam(required = false, value = "beginValuationTime") String beginValuationTime,
			@RequestParam(required = false, value = "endValuationTime") String endValuationTime,
			@RequestParam(required = false, value = "beginReplyTime") String beginReplyTime,
			@RequestParam(required = false, value = "endReplyTime") String endReplyTime,
			@RequestParam(required = false, value = "ladingNo") String ladingNo,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "containerUser") String containerUser,
			@RequestParam(required = false, value = "courseType") String courseType,
			@RequestParam(required = false, value = "valuationState") String valuationState,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) throws ParseException {
		String[] valuationStates;
		if (valuationState != null && valuationState != "") {
			valuationStates = new String[]{
					valuationState
			};
		} else {
			valuationStates = new String[]{
					ReplyStateEnum.UNDO.getCode(),
					ReplyStateEnum.UNREPLY.getCode(),
					ReplyStateEnum.UNPROCESS.getCode(),
					ReplyStateEnum.APPLYED.getCode(),
					ReplyStateEnum.TURNGOOD.getCode(),
					ReplyStateEnum.REJECT.getCode()
			};
		}
		return Result.Success(valuationService.codeList(
				beginCourseTime, endCourseTime, 
				beginValuationTime, endValuationTime, 
				beginReplyTime, endReplyTime, 
				ladingNo, containerNo, containerUser, courseType, 
				pageNum, pageSize,valuationStates));
	}
	
	/**
	 * 转待批复-干箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@PutMapping("/toUnreply")
	@SuppressWarnings("rawtypes")
	public Result toUnreply(@RequestParam(required = true, value = "courseIds") String[] courseIds) {
		String valuationState = ReplyStateEnum.UNREPLY.getCode();
		Boolean res = valuationService.updateUseReplyState(courseIds, valuationState);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 转待批复-冷箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@PutMapping("/toUnreplyCode")
	@SuppressWarnings("rawtypes")
	public Result toUnreplyCode(@RequestBody ValuationCodeInput input) {
		String valuationState = ReplyStateEnum.UNREPLY.getCode();
		valuationService.updateCodeUseReplyState(input, valuationState);
		return Result.Success();
	}
	
	/**
	 * 转待处理-干箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@PutMapping("/toUnprocess")
	@SuppressWarnings("rawtypes")
	public Result toUnprocess(@RequestParam(required = true, value = "courseIds") String[] courseIds) {
		String valuationState = ReplyStateEnum.UNPROCESS.getCode();
		Boolean res = valuationService.updateUseReplyState(courseIds, valuationState);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 转待处理-冷箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@PutMapping("/toUnprocessCode")
	@SuppressWarnings("rawtypes")
	public Result toUnprocessCode(@RequestBody ValuationCodeInput input) {
		String valuationState = ReplyStateEnum.UNPROCESS.getCode();
		valuationService.updateCodeUseReplyState(input, valuationState);
		return Result.Success();
	}
	
	/**
	 * 待处理转回-干箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@PutMapping("/unprocessBack")
	@SuppressWarnings("rawtypes")
	public Result unprocessBack(@RequestParam(required = true, value = "courseIds") String[] courseIds) {
		String valuationState = ReplyStateEnum.UNDO.getCode();
		Boolean res = valuationService.updateUseReplyState(courseIds, valuationState);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 待处理转回-冷箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@PutMapping("/unprocessBackCode")
	@SuppressWarnings("rawtypes")
	public Result unprocessBackCode(@RequestBody ValuationCodeInput input) {
		String valuationState = ReplyStateEnum.UNDO.getCode();
		valuationService.updateCodeUseReplyState(input, valuationState);
		return Result.Success();
	}
	
	/**
	 * 派工
	 * @param inputList
	 * @return
	 * @author zhangkai
	 */
	@PostMapping("/referral")
	@SuppressWarnings("rawtypes")
	public Result referral(@RequestBody ValuationReferralInput input) {
		try {
			valuationService.referral(input);
			return Result.Success();
		} catch (Exception e) {
			return Result.Error(e.getMessage());
		}
		
	}
	
	/**
	 * 批量批复匹配-干箱
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@PostMapping("/match")
	public Result<ValuationBatchReplyOutput> match(@RequestBody ValuationBatchReplyInput input) {
		return Result.Success(valuationService.match(input));
	}
	
	/**
	 * 批量批复匹配-冷箱
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@PostMapping("/codeMatch")
	public Result<ValuationBatchReplyOutput> codeMatch(@RequestBody ValuationBatchReplyInput input) {
		return Result.Success(valuationService.codeMatch(input));
	}
	
	/**
	 * 批量批复-干箱
	 * @param prodCourseIds
	 * @author zhangkai
	 */
	@PutMapping("/batchReply")
	@SuppressWarnings("rawtypes")
	public Result batchReply(@RequestParam String[] prodCourseIds) {
		valuationService.batchReply(prodCourseIds);
		return Result.Success();
	}
	
	/**
	 * 批量批复-冷箱
	 * @param prodCourseIds
	 * @author zhangkai
	 */
	@PutMapping("/codeBatchReply")
	@SuppressWarnings("rawtypes")
	public Result codeBatchReply(@RequestParam String[] prodCourseIds) {
		valuationService.codeBatchReply(prodCourseIds);
		return Result.Success();
	}
	
	/**
	 * 紧急程度列表
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/urgencyList")
	public Result<List<UnitUrgencyOutput>> urgencyList() {
		return Result.Success(valuationService.urgencyList());
	}
	
	/**
	 * 设置紧急程度
	 * @param prodCourseIds
	 * @param urgency
	 * @author zhangkai
	 */
	@PutMapping("/setUrgency")
	@SuppressWarnings("rawtypes")
	public Result setUrgency(@RequestParam String[] prodCourseIds, @RequestParam String urgency) {
		valuationService.setUrgency(prodCourseIds, urgency);
		return Result.Success();
	}
	
	/**
	 * 照片导出
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/picExport")
	public Result picExport(@RequestBody PicExportInput input) {
		return Result.Success(valuationService.picExport(input));
	}
	
	/**
	 * 批复不修
	 * @param input
	 * @return
	 */
	@PutMapping("/replyNoReferral")
	@SuppressWarnings("rawtypes")
	public Result replyNoReferral(@RequestBody ValuationCodeInput input) {
		valuationService.replyNoReferral(input);
		return Result.Success();
	}
	
	/**
	 * 不修转好
	 * @param input
	 * @return
	 */
	@PutMapping("/replyToGood")
	@SuppressWarnings("rawtypes")
	public Result replyToGood(@RequestBody ValuationCodeInput input) {
		valuationService.replyToGood(input);
		return Result.Success();
	}
	
	/**
	 * 取消不修转好
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@DeleteMapping("/cancelNoReferral")
	@SuppressWarnings("rawtypes")
	public Result cancelNoReferral(@RequestBody ValuationIdAndCategoryInput input) {
		valuationService.cancalNoReferral(input.getProdCourseId(), input.getContainerCategory());
		return Result.Success();
	}
	
	/**
	 * 取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@DeleteMapping("/cancelToGood")
	@SuppressWarnings("rawtypes")
	public Result cancelToGood(@RequestBody ValuationIdAndCategoryInput input) {
		valuationService.cancalNoReferral(input.getProdCourseId(), input.getContainerCategory());
		return Result.Success();
	}
	
	/**
	 * 取消批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@DeleteMapping("/cancelReply")
	public Result<Boolean> cancelReply(@RequestBody ValuationIdAndCategoryInput input) {
		return Result.Success(valuationService.cancelReply(input.getProdCourseId(), input.getContainerCategory()));
	}
	
	/**
	 * 取消派工
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@DeleteMapping("/cancelReferral")
	@SuppressWarnings("rawtypes")
	public Result cancelReferral(@RequestBody ValuationIdAndCategoryInput input) {
		try {
			return Result.Success(referralService.cancelReferra(input.getProdCourseId(), input.getContainerCategory()));
		} catch (Exception e) {
			return Result.Error(e.getMessage());
		}
		
	}
	
	/**
	 * 重新派工
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@PostMapping("/reReferral")
	@SuppressWarnings("rawtypes")
	public Result reReferral(@RequestBody AnewReferraInput input) {
		return Result.Success(referralService.anewReferra(input));
	}
	

}
