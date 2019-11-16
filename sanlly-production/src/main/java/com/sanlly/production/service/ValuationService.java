package com.sanlly.production.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.UnitUrgency;
import com.sanlly.production.models.input.valuation.PicExportInput;
import com.sanlly.production.models.input.valuation.ValuationBatchReplyInput;
import com.sanlly.production.models.input.valuation.ValuationCodeInput;
import com.sanlly.production.models.input.valuation.ValuationReferralInput;
import com.sanlly.production.models.output.valuation.PicExportOutput;
import com.sanlly.production.models.output.valuation.UnitUrgencyOutput;
import com.sanlly.production.models.output.valuation.ValuationBatchReplyOutput;
import com.sanlly.production.models.output.valuation.ValuationListOutput;

/**
 * 估价service
 * @author zhangkai
 *
 */
public interface ValuationService {
	
	/**
	 * 估价管理列表-干箱
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
	 */
	PagedList<ValuationListOutput> list(
			String beginCourseTime, 
			String endCourseTime,
			String beginValuationTime,
			String endValuationTime,
			String beginReplyTime,
			String endReplyTime,
			String ladingNo,
			String containerNo,
			String containerUser,
			String courseType,
			Integer pageNum,
			Integer pageSize,
			String[] valuationStates
		);
	
	/**
	 * 估价管理列表-冷箱
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
	public PagedList<ValuationListOutput> codeList(
				String beginCourseTime, 
				String endCourseTime,
				String beginValuationTime,
				String endValuationTime,
				String beginReplyTime,
				String endReplyTime,
				String ladingNo,
				String containerNo,
				String containerUser,
				String courseType,
				Integer pageNum,
				Integer pageSize,
				String[] valuationStates
			) throws ParseException;
	
	/**
	 * 更新估价状态-干箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	boolean updateUseReplyState(String[] courseIds, String valuationState);
	
	/**
	 * 更新估价状态-冷箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	void updateCodeUseReplyState(ValuationCodeInput input, String valuationState);
	
	/**
	 * 派工
	 * @param input
	 * @author zhangkai
	 */
	void referral(ValuationReferralInput input);
	
	/**
	 * 批量批复匹配-干箱
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	ValuationBatchReplyOutput match(ValuationBatchReplyInput input);
	
	/**
	 * 批量批复匹配-冷箱
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	ValuationBatchReplyOutput codeMatch(ValuationBatchReplyInput input);
	
	/**
	 * 批量批复-干箱
	 * @param prodCourseIds
	 * @author zhangkai
	 */
	void batchReply(String[] prodCourseIds);
	
	/**
	 * 批量批复-冷箱
	 * @param prodCourseIds
	 * @author zhangkai
	 */
	void codeBatchReply(String[] prodCourseIds);
	
	/**
	 * 紧急程度列表
	 * @return
	 * @author zhangkai
	 */
	List<UnitUrgencyOutput> urgencyList();
	
	/**
	 * 设置紧急程度
	 * @param prodCourseIds
	 * @param urgency
	 * @author zhangkai
	 */
	void setUrgency(String[] prodCourseIds, String urgency);
	
	/**
	 * 照片导出
	 * @param input
	 * @return
	 */
	PicExportOutput picExport(PicExportInput input);
	
	/**
	 * 批复不修
	 * @param input
	 */
	void replyNoReferral(ValuationCodeInput input);
	
	/**
	 * 不修转好
	 * @param input
	 */
	void replyToGood(ValuationCodeInput input);
	
	/**
	 * 取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 */
	void cancalNoReferral(String prodCourseId, String containerCategory);
	
	/**
	 * 取消不修转好
	 * @param prodCourseId
	 * @param containerCategory
	 */
	void cancalToGood(String prodCourseId, String containerCategory);
	
	/**
	 * 取消批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @param yard
	 * @param containerUser
	 * @return
	 */
	boolean cancelReply(String prodCourseId, String containerCategory);

	/**
	 * 保修-取消保修批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	boolean cancelMaintenanceReply(String prodCourseId, String containerCategory);
	
	/**
	 * 保修-批复不修
	 * @param input
	 */
	void replyMaintenanceNoReferral(ValuationCodeInput input);
	
	/**
	 * 保修-取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 */
	void cancalMaintenanceNoReferral(String prodCourseId, String containerCategory);

}
