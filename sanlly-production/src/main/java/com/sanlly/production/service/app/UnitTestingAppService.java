package com.sanlly.production.service.app;

import java.util.List;
import java.util.Map;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.login.AppLoginInput;
import com.sanlly.production.models.input.app.partsType.PartsTypeSearchInput;
import com.sanlly.production.models.input.app.spare.AddSpareInput;
import com.sanlly.production.models.input.app.spare.SearchSpareInput;
import com.sanlly.production.models.input.app.spare.SpareStockInput;
import com.sanlly.production.models.input.app.unitTesting.AddUnitInfoInput;
import com.sanlly.production.models.input.app.unitTesting.PreReferralSearchInput;
import com.sanlly.production.models.input.app.unitTesting.SetContainerInfoInput;
import com.sanlly.production.models.input.app.unitTesting.SetUnitStateInput;
import com.sanlly.production.models.input.app.unitTesting.SetUnitZoneInput;
import com.sanlly.production.models.input.app.unitTesting.SubmitTestingInput;
import com.sanlly.production.models.input.app.unitTesting.UnitTestingHistoryInput;
import com.sanlly.production.models.input.app.unitTesting.UnitTestingSearchInput;
import com.sanlly.production.models.output.app.company.CompanyLoginOutput;
import com.sanlly.production.models.output.app.login.AppLoginOutput;
import com.sanlly.production.models.output.app.partsType.PartsTypeOutput;
import com.sanlly.production.models.output.app.pti.PtiTypeDetailOutpput;
import com.sanlly.production.models.output.app.repair.RelationRepairOutput;
import com.sanlly.production.models.output.app.spare.SparePartDetailOutput;
import com.sanlly.production.models.output.app.spare.SpareStockOutput;
import com.sanlly.production.models.output.app.unitCompany.UnitCompanyOutput;
import com.sanlly.production.models.output.app.unitTesting.CourseOutput;
import com.sanlly.production.models.output.app.unitTesting.PreReferralListOutput;
import com.sanlly.production.models.output.app.unitTesting.UnitTestingDetailOutput;
import com.sanlly.production.models.output.app.unitTesting.UnitTestingHistoryOutput;
import com.sanlly.production.models.output.app.zone.ZoneDetailOutput;

/**
 * 机组进场检验
 * @author RexSheng
 * 2019年8月5日 上午9:47:54
 */
public interface UnitTestingAppService {
	
	/**
	 * 机组检验分页列表
	 * @param input
	 * @return
	 */
	PagedList<UnitTestingDetailOutput> unitTestingList(UnitTestingSearchInput input);
	
	/**
	 * 区位列表
	 * @param yardKey 场站ID
	 * @return
	 */
	List<ZoneDetailOutput> getZoneList(String yardKey);
	
	/**
	 * 设置机组状态
	 * @param input
	 */
	String setUnitState(SetUnitStateInput input);
	
	/**
	 * 管理机组区位
	 * @param input
	 */
	void setUnitZone(SetUnitZoneInput input);
	
	/**
	 * 补录箱子信息
	 * @param input
	 */
	String setContainerInfo(SetContainerInfoInput input) throws Exception ;
	
	/**
	 * 机组初录
	 * @param input
	 */
	void addUnitInfo(AddUnitInfoInput input);
	
	/**
	 * 部件大类列表
	 * @param input
	 * @return
	 */
	List<PartsTypeOutput> getPartsTypeList(PartsTypeSearchInput input);
	
	/**
	 * 相关修理列表
	 * @return
	 */
	List<RelationRepairOutput> getRelationRepairList();
	
	/**
	 * 新增备件号
	 * @param input
	 */
	void addSpare(AddSpareInput input);
	
	/**
	 * 暂存检验明细
	 * @param input
	 */
	void saveTesting(SubmitTestingInput input);
	/**
	 * 提交检验明细
	 * @param input
	 */
	void submitTesting(SubmitTestingInput input);
	
	/**
	 * 部件明细列表
	 * @param input
	 * @return
	 */
//	List<PartsTypeDetailOutput> getPartDetailList(PartsDetailSearchInput input);
	
	/**
	 * 冷机公司列表，包含机型
	 * @return
	 */
	List<UnitCompanyOutput> getCompanyList();
	
	/**
	 * 备件列表
	 * @param input
	 * @return
	 */
	List<SparePartDetailOutput> getSpares(SearchSpareInput input);
	
	/**
	 * 备件库存列表
	 * @param input
	 * @return
	 */
	SpareStockOutput getSparesStock(SpareStockInput input);
	
	/**
	 * 根据登录名获取公司列表
	 * @param userName
	 * @return
	 */
	List<CompanyLoginOutput> getCompanys(String userName);
	
	/**
	 * app登陆
	 * @param input
	 * @return
	 */
	AppLoginOutput login(AppLoginInput input);
	
	/**
	 * 根据进场id获取机组检验明细
	 * @param courseId
	 * @return
	 */
	CourseOutput getCourseDetail(String courseId);
	
	/**
	 * 维修历史记录-进场列表
	 * @param input
	 * @return
	 */
	PagedList<UnitTestingHistoryOutput> getHistoryPagedList(UnitTestingHistoryInput input);
	
	/**
	 * 维修历史记录-进场明细--通用
	 * @param prodCourseId
	 * @param detailType
	 * @return
	 */
	Map<String,Object> getHistoryDetail(String prodCourseId, String containerCategory,Integer detailType);
	
	/**
	 * pti类型列表
	 * @return
	 */
	List<PtiTypeDetailOutpput> getPtiList();
	
	/**
	 * 先修列表
	 * @param input
	 * @return
	 */
	PagedList<PreReferralListOutput> getPreReferralPagedList(PreReferralSearchInput input);

}
