package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.models.input.evaluation.SearchVersionInput;
import com.sanlly.production.models.input.evaluation.ThirdPartPayInput;
import com.sanlly.production.models.input.surrender.ChangeSurrenderInput;
import com.sanlly.production.models.input.valuation.ValuationCodeInput;
import com.sanlly.production.models.input.valuation.ValuationIdAndCategoryInput;
import com.sanlly.production.service.EstimateDetailService;
import com.sanlly.production.service.ValuationService;

/**
 * 估价明细控制器
 * @author RexSheng
 * 2019年9月6日 下午4:57:49
 */
@RestController
public class EstimateDetailController {

	@Autowired
	private EstimateDetailService estimateDetailService;
	
	@Autowired
	private ValuationService valuationService;

	/**
	 * 获取估价明细
	 * 根据进场id和箱类别获取条目明细
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/estimate/entry/list")
	public Result getEstimateEntryList(@RequestParam(required = true) String prodCourseId,
			@RequestParam(required = true) String containerCategory) {
		
		return Result.Success(estimateDetailService.estimateEntryList(prodCourseId, containerCategory));
	}
	
	/**
	 * 第三方收费
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/third")
	public Result thirdPartAdd(@RequestBody ThirdPartPayInput input) {
		estimateDetailService.thirdPartPay(input);
		return Result.Success();
	}
	
	/**
	 * 第三方减免
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/refund")
	public Result thirdPartRefund(@RequestBody ThirdPartPayInput input) {
		estimateDetailService.thirdPartRefund(input);
		return Result.Success();
	}
	
	/**
	 *  保存估价明细
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/entry/save")
	public Result saveEstimateEntry(@RequestBody ThirdPartPayInput input) {
		estimateDetailService.saveEstimateEntry(input);
		estimateDetailService.updateEstimateCourse(input.getProdCourseId(),input.getContainerCategory());
		return Result.Success();
	}
	
	/**
	 * 单箱批复
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/singleReply")
	public Result singlePay(@RequestBody ThirdPartPayInput input) {
		estimateDetailService.singleReply(input);
		return Result.Success();
	}
	
	/**
	 * 退租箱-单箱批复
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/master/singleReply")
	public Result masterSinglePay(@RequestBody ThirdPartPayInput input) {
		estimateDetailService.masterSingleReply(input);
		return Result.Success();
	}
	
	/**
	 * 查看估价历史版本
	 * @param versionNo
	 * @param prodCourseId
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/estimate/history")
	public Result getVersionPagedList(@RequestParam(required = false) String versionNo,
			@RequestParam(required = true) String prodCourseId,
			@RequestParam(required = true) String containerCategory,
			@RequestParam(required = true) Integer index,
			@RequestParam(required = true) Integer size) {
		SearchVersionInput input=new SearchVersionInput();
		input.setContainerCategory(containerCategory);
		input.setVersionNo(versionNo);
		input.setProdCourseId(prodCourseId);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(estimateDetailService.getVersionPagedList(input));
	}
	
	/**
	 * 标记单条不修
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/notRepair")
	public Result remarkNotRepair(@RequestBody ThirdPartPayInput input) {
		estimateDetailService.remarkNotRepair(input);
		return Result.Success();
	}
	
	/**
	 * 获取第三方付费方式
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/estimate/third")
	public Result getThirdPayType(@RequestParam("yard") String yardKey,@RequestParam("containerUser") String containerUser) {
		
		return Result.Success(estimateDetailService.getThirdPayType(yardKey, containerUser));
	}
	
	/**
	 *  驳回
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/reject")
	public Result rejectEstimate(@RequestParam("prodCourseId") String prodCourseId,
			@RequestParam("containerCategory") String containerCategory,
			@RequestParam("message") String message) {
		estimateDetailService.rejectTestingCourse(prodCourseId, containerCategory, message);
		return Result.Success();
	}
	
	/**
	 * 获取估价驳回原因
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/estimate/reasons")
	public Result getRejectReasons() {
		
		return Result.Success(estimateDetailService.getRejectReasons());
	}
	
	
	/**
	 * 保修-单箱批复
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/maintenance/singleReply")
	public Result singlePayMaintenance(@RequestBody ThirdPartPayInput input) {
		input.setContainerCategory(ContainerCategoryEnum.CONTAINER_04.getCode());
		estimateDetailService.singleMaintenanceReply(input);
		return Result.Success();
	}
	
	/**
	 * 保修-取消批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@DeleteMapping("/estimate/maintenance/cancelReply")
	public Result<Boolean> cancelReplyMaintenance(@RequestBody ValuationIdAndCategoryInput input) {
		input.setContainerCategory(ContainerCategoryEnum.CONTAINER_04.getCode());
		return Result.Success(valuationService.cancelMaintenanceReply(input.getProdCourseId(), input.getContainerCategory()));
	}
	
	/**
	 * 保修-批复不修
	 * @param input
	 * @return
	 */
	@PutMapping("/estimate/maintenance/replyNoReferral")
	@SuppressWarnings("rawtypes")
	public Result replyNoReferral(@RequestBody ValuationCodeInput input) {
		valuationService.replyMaintenanceNoReferral(input);
		return Result.Success();
	}
	
	/**
	 * 保修-取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@DeleteMapping("/estimate/maintenance/cancelToGood")
	@SuppressWarnings("rawtypes")
	public Result cancelToGood(@RequestBody ValuationIdAndCategoryInput input) {
		input.setContainerCategory(ContainerCategoryEnum.CONTAINER_04.getCode());
		valuationService.cancalMaintenanceNoReferral(input.getProdCourseId(), input.getContainerCategory());
		return Result.Success();
	}
	

	/**
	 *  保修-驳回
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/maintenance/reject")
	public Result rejectEstimate(@RequestParam("prodCourseId") String prodCourseId,
			@RequestParam("message") String message) {
		estimateDetailService.rejectMaintenanceCourse(prodCourseId, message);
		return Result.Success();
	}
	
	/**
	 *  退租-转待批复
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/toUnReply")
	public Result surrenderToUnReply(@RequestBody ChangeSurrenderInput input) {
		input.setState(ReplyStateEnum.UNREPLY.getCode());
		estimateDetailService.changeSurrenderState(input);
		return Result.Success();
	}
	
	/**
	 *  退租-转待批复-批量
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/toUnReply/batch")
	public Result surrenderToUnReplyBatch(@RequestBody ChangeSurrenderInput[] items) {
		for(ChangeSurrenderInput input:items) {
			input.setState(ReplyStateEnum.UNREPLY.getCode());
			estimateDetailService.changeSurrenderState(input);
		}
		return Result.Success();
	}
	
	/**
	 *  退租-取消批复
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/estimate/master/cancelReply")
	public Result surrendercancelReply(@RequestBody ChangeSurrenderInput input) {
		 
		return Result.Success(estimateDetailService.cancelSurrenderReply(input));
	}
	
	/**
	 *  退租-待处理
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/toUnprocess")
	public Result surrenderToUnprocess(@RequestBody ChangeSurrenderInput input) {
		input.setState(ReplyStateEnum.UNPROCESS.getCode());
		estimateDetailService.changeSurrenderState(input);
		return Result.Success();
	}
	
	/**
	 *  退租-待处理-批量
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/toUnprocess/batch")
	public Result surrenderToUnprocessBatch(@RequestBody ChangeSurrenderInput[] items) {
		for(ChangeSurrenderInput input:items) {
			input.setState(ReplyStateEnum.UNPROCESS.getCode());
			estimateDetailService.changeSurrenderState(input);
		}
		return Result.Success();
	}
	
	/**
	 *  退租-待处理转回
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/unprocessBack")
	public Result surrenderToUnprocessBack(@RequestBody ChangeSurrenderInput input) {
		input.setState(ReplyStateEnum.UNDO.getCode());
		estimateDetailService.changeSurrenderState(input);
		return Result.Success();
	}
	
	/**
	 *  退租-待处理转回-批量
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/unprocessBack/batch")
	public Result surrenderToUnprocessBackBatch(@RequestBody ChangeSurrenderInput[] items) {
		for(ChangeSurrenderInput input:items) {
			input.setState(ReplyStateEnum.UNDO.getCode());
			estimateDetailService.changeSurrenderState(input);
		}
		return Result.Success();
	}
	
	/**
	 *  退租-批复不修
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/replyNoReferral")
	public Result surrenderReplyNoReferral(@RequestBody ChangeSurrenderInput input) {
		estimateDetailService.replyNoReferral(input);
		return Result.Success();
	}
	
	/**
	 *  退租-批复不修-批量
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/estimate/master/replyNoReferral/batch")
	public Result surrenderReplyNoReferralBatch(@RequestBody ChangeSurrenderInput[] items) {
		for(ChangeSurrenderInput input:items) {
			estimateDetailService.replyNoReferral(input);
		}
		return Result.Success();
	}
	
	/**
	 *  退租-取消批复不修
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/estimate/master/cancelToGood")
	public Result surrenderCancelToGood(@RequestBody ChangeSurrenderInput input) {
		estimateDetailService.cancalNoReferral(input);
		return Result.Success();
	}
	
	/**
	 *  退租-取消批复不修-批量
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/estimate/master/cancelToGood/batch")
	public Result surrenderCancelToGoodBatch(@RequestBody ChangeSurrenderInput[] items) {
		for(ChangeSurrenderInput input:items) {
			estimateDetailService.cancalNoReferral(input);
		}
		return Result.Success();
	}
	/**
	 * 箱东扣款
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/estimate/master/back")
	public Result surrenderMasterBack(@RequestBody ChangeSurrenderInput input) {
		estimateDetailService.masterBack(input);
		return Result.Success();
	}
	
	/**
	 *  退租-派工
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
//	@SuppressWarnings("rawtypes")
//	@PostMapping("/estimate/master/referral")
//	public Result surrenderReferral(@RequestBody ChangeSurrenderInput input) {
//		estimateDetailService.cancalNoReferral(input);
//		return Result.Success();
//	}
}
