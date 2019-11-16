package com.sanlly.production.service.app;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.out.MoveSearchInput;
import com.sanlly.production.models.input.app.out.OutSearchInput;
import com.sanlly.production.models.input.app.out.PtiOkSearchInput;
import com.sanlly.production.models.output.app.out.MoveListOutput;
import com.sanlly.production.models.output.app.out.OutListOutput;
import com.sanlly.production.models.output.app.out.PtiOkListOutput;

/**
 * 出箱接口
 * @author RexSheng
 * 2019年8月26日 下午4:32:55
 */
public interface OutAppService {

	/**
	 * 获取出箱列表
	 * @param input
	 * @return
	 */
	PagedList<OutListOutput> getOutPagedList(OutSearchInput input);
	
	/**
	 * pti Ok确认
	 * @param prodCourseIds
	 */
	void ptiOkConfirm(String[] prodCourseIds);
	
	/**
	 * pti Not Ok确认
	 * @param prodCourseIds
	 */
	void ptiNotOkConfirm(String[] prodCourseIds);
	
	/**
	 * 出箱操作
	 * @param prodCourseIds
	 */
	void outLeave(String[] prodCourseIds);
	
	/**
	 * 原移
	 * @param prodCourseIds
	 */
	void move(String[] prodCourseIds);
	
	/**
	 * 取消原移
	 * @param prodCourseIds
	 */
	void cancelMove(String[] prodCourseIds);
	
	/**
	 * 出箱列表添加备注
	 * @param prodCourseIds
	 * @param remarks
	 */
	void outRemarks(String[] prodCourseIds,String remarks);
	
	/**
	 * 获取原移箱列表
	 * @param input
	 * @return
	 */
	PagedList<MoveListOutput> getMoveOutPagedList(MoveSearchInput input);
	
	/**
	 * 已确认PTIok列表
	 * @param input
	 * @return
	 */
	PagedList<PtiOkListOutput> getPtiOks(PtiOkSearchInput input);
	
}
