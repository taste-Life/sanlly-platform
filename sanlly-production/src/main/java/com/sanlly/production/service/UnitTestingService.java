package com.sanlly.production.service;

import java.text.ParseException;
import java.util.List;

import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.models.input.unitTesting.AuditUnitInput;
import com.sanlly.production.models.input.unitTesting.PreFixSearchInput;
import com.sanlly.production.models.input.unitTesting.SetUnitStateInput;
import com.sanlly.production.models.input.unitTesting.UnitBasicAddInput;
import com.sanlly.production.models.input.unitTesting.UnitTestingSearchInput;
import com.sanlly.production.models.input.unitTesting.UpdateUnitZoneInput;
import com.sanlly.production.models.output.unitTesting.PreFixOutput;
import com.sanlly.production.models.output.unitTesting.SetUnitStateOutput;
import com.sanlly.production.models.output.unitTesting.UnitBasicDetailOutput;
import com.sanlly.production.models.output.unitTesting.UnitTestingListOutput;

/**
 * 机组检验接口
 * @author RexSheng
 * 2019年8月12日 下午4:56:28
 */
public interface UnitTestingService {

	/**
	 * 机组检验列表
	 * @param input
	 * @return
	 * @throws ParseException 
	 */
	PagedList<UnitTestingListOutput> getPageList(UnitTestingSearchInput input) throws ParseException;
	
	/**
	 * 批量设置好机组
	 * @param input
	 */
	SetUnitStateOutput setUnitStateGood(SetUnitStateInput input);
	
	/**
	 * 批量设置坏机组
	 * @param input
	 */
	SetUnitStateOutput setUnitStateBad(SetUnitStateInput input);
	
	/**
	 * 批量提交机组检验
	 * @param input
	 * @return 
	 */
	SetUnitStateOutput submitUnitTesting(SetUnitStateInput input);
	
	/**
	 * 机组检验审核
	 * @param input
	 */
	void approveUnitTesting(AuditUnitInput input);
	
	/**
	 * 根据进场id获取机组基础信息
	 * @param courseId
	 * @return
	 */
	UnitBasicDetailOutput getUnitBasicInfo(String courseId);
	
	/**
	 * 根据箱号获取机组基础信息
	 * @param containerNo
	 * @return
	 */
	UnitBasicDetailOutput getUnitBasicInfoByContainerNo(String containerNo);
	
	/**
	 * 机组信息录入
	 * @param input
	 * @throws ParseException 
	 */
	void updateUnitBasicInfo(UnitBasicAddInput input) throws ParseException;
	
	
	/**
	 * 修改机组进场区位
	 * @param input
	 */
	void updateZone(UpdateUnitZoneInput input);
	
	/**
	 * 根据进场id获取同一公司下的场站列表
	 * @param courseId
	 * @return
	 */
	List<SelectOutput> getCompanyYardsByCourse(String courseId);
	
	/**
	 * 根据场站key获取对应的必填字段
	 * @param yardKey
	 * @return
	 */
	List<String> getFieldListByYard(String yardKey);
	
	/**
	 * 先修列表
	 * @param input
	 * @return
	 */
	PagedList<PreFixOutput> getPreFixPagedList(PreFixSearchInput input);
	
	/**
	 *   删除没有条目的机组进场
	 * @param courseId
	 * @return
	 */
	void unitDeLete(String courseId) throws Exception;

	/**
	 * 仓储适用机型获取
	 * @param code
	 * @return
	 */
	List<String> getUnitToWare(String code);
	
	/** 
	* @Description: TODO 
	* @param inputs 获取某种状态的进场数据
	* @throws 
	*/
	List<String> selectCourseByTestingState(String[] prodCourseIdList, String[] testingStateList) throws Exception ;
	
	/**
	 * 标记不做PTI
	 * @param courseIds
	 */
	void remarkNotPti(String[] courseIds);

	/**
	 * 标为待审核
	 * @param input
	 */
	void remarkAsUnAudit(SetContainerStateInput input);
}
