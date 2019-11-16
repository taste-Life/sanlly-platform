package com.sanlly.production.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.out.OutIdsInput;
import com.sanlly.production.models.input.out.OutRemarksInput;
import com.sanlly.production.models.output.app.out.OutRecordListOutput;
import com.sanlly.production.models.output.out.MoveListOutput;
import com.sanlly.production.models.output.out.OperatorOutput;
import com.sanlly.production.models.output.out.OutListOutput;

/**
 * 
* @Package com.sanlly.production.service 
* @Description: 出箱 
* @author zhangkai   
* @date 2019年8月28日 下午2:17:22 
* @version V1.0   
 */
public interface OutService {
	
	/**
	 * 
	* @Description: 出箱列表
	* @param zoneKeys
	* @param containerNo
	* @param ptiResult
	* @param index
	* @param size
	* @return PagedList<OutListOutput>
	* @throws 
	* @author zhangkai
	 */
	PagedList<OutListOutput> list(String[] zoneKeys, String containerNo, String ptiResult, Integer index, Integer size);
	
	/**
	 * 
	* @Description: 保存出箱备注 
	* @param inputList
	* @return boolean
	* @throws 
	* @author zhangkai
	 */
	boolean saveRemarks(OutRemarksInput inputList);

	/**
	 * 原移
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	boolean setMove(OutIdsInput input);
	
	/**
	 * 出箱列表PTIOK
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	boolean setPtiOk(OutIdsInput input);
	
	/**
	 * 出箱操作
	 * @param prodCourseIds
	 */
	boolean outLeave(OutIdsInput input);
	
	/**
	 * 原移列表
	 * @param zoneKeys
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 * @author zhangkai
	 */
	PagedList<MoveListOutput> moveList(String[] zoneKeys, String containerNo, Integer index, Integer size);
	
	/**
	 * 取消原移
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	boolean cancelMove(OutIdsInput input);
	
	/**
	 * 出箱记录列表
	 * @param batchNum
	 * @param containerNo
	 * @param operator
	 * @param startTime
	 * @param endTime
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	PagedList<OutRecordListOutput> outRecordList(String batchNum, String containerNo, Integer operator, 
			String startTime, String endTime, Integer pageNum, Integer pageSize);
	
	/**
	 * 出箱记录操作人列表
	 * @return
	 * @author zhangkai
	 */
	List<OperatorOutput> operators();
	
	/**
	 * 取消出箱
	 * @param ids
	 */
	void cancelOut(Integer[] ids);
}
