package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.evaluation.AddEvaluationInput;
import com.sanlly.production.models.input.evaluation.SearchVersionInput;
import com.sanlly.production.models.input.evaluation.ThirdPartPayInput;
import com.sanlly.production.models.input.surrender.ChangeSurrenderInput;
import com.sanlly.production.models.output.BaseSelectOutput;
import com.sanlly.production.models.output.estimate.EstimateCourseEntryOutput;
import com.sanlly.production.models.output.estimate.EstimateEntryInfoOutput;
import com.sanlly.production.models.output.estimate.ThirdPayTypeOutput;

/**
 * 估价明细接口
 * @author RexSheng
 * 2019年9月6日 下午4:37:17
 */
public interface EstimateDetailService {

	/**
	 * 根据进场id和箱类别获取条目明细
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	EstimateEntryInfoOutput estimateEntryList(String prodCourseId, String containerCategory);
	
	/**
	 * 版本查询列表
	 * @param input
	 * @return
	 */
	PagedList<EstimateCourseEntryOutput> getVersionPagedList(SearchVersionInput input);
	
	/**
	 * 新增估价条目明细
	 * @param input
	 */
	void addEstimateEntry(AddEvaluationInput input);
	
	/**
	 * 第三方付费
	 * @param input
	 */
	void thirdPartPay(ThirdPartPayInput input);
	
	/**
	 * 第三方减免
	 * @param input
	 */
	void thirdPartRefund(ThirdPartPayInput input);
	
	/**
	 *  单箱批复
	 * @param input
	 */
	void singleReply(ThirdPartPayInput input);
	
	/**
	 * 标为单条不修
	 *  @param input
	 */
	void remarkNotRepair(ThirdPartPayInput input);
	
	/**
	 * 根据场站key和用箱人key获取第三方收费方式
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	ThirdPayTypeOutput getThirdPayType(String yardKey,String containerUser);

	/**
	 * 根据进场和箱类别修改 估价表状态及费用
	 * @param courseId
	 * @param containerCategory
	 */
	void updateEstimateCourse(String courseId,String containerCategory);
	
	/**
	 * 估价驳回
	 * @param courseId
	 * @param containerCategory
	 * @param message
	 */
	void rejectTestingCourse(String courseId,String containerCategory,String message);

	/**
	 * 保存估价明细
	 * @param input
	 */
	void saveEstimateEntry(ThirdPartPayInput input);
	
	/**
	 * 获取估价驳回原因列表
	 * @return
	 */
	List<SelectOutput> getRejectReasons();

	/**
	 * 保修估价驳回
	 * @param courseId
	 * @param message
	 */
	void rejectMaintenanceCourse(String courseId, String message);

	/**
	 * 保修估价单箱批复
	 * @param input
	 */
	void singleMaintenanceReply(ThirdPartPayInput input);

	/**
	 * 箱东单箱批复
	 * @param input
	 */
	void masterSingleReply(ThirdPartPayInput input);

	/**
	 * 修改退租箱状态
	 * @param input
	 */
	void changeSurrenderState(ChangeSurrenderInput input);

	/**
	 * 退租取消批复
	 * @param input
	 * @return
	 */
	boolean cancelSurrenderReply(ChangeSurrenderInput input);

	/**
	 * 退租箱-批复不修
	 * @param input
	 */
	void replyNoReferral(ChangeSurrenderInput input);

	/**
	 * 退租箱-取消批复不修
	 * @param input
	 */
	void cancalNoReferral(ChangeSurrenderInput input);
	
	/**
	 * 退租箱-箱东扣款
	 * @param input
	 */
	void masterBack(ChangeSurrenderInput input);
}
