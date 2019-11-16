package com.sanlly.production.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.enums.UnitStateEnum;
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
import com.sanlly.production.models.input.unitTesting.AuditUnitInput;
import com.sanlly.production.service.AuditService;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.UnitTestingService;
import com.sanlly.production.service.app.UnitTestingAppService;

/**
 * app机组检验，
 * @author RexSheng
 * 2019年8月26日 下午3:00:59
 */
@RestController
public class UnitTestingAppController {

	@Autowired
	private UnitTestingAppService appService;
	
	@Autowired
	private UnitTestingService unitService;
	
	@Autowired
	private AuthService authClient;
	
	@Autowired
	private AuditService auditService;
	
	/**
	 * 机组列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/units")
	public Result getEntryList(UnitTestingSearchInput input) {
		return Result.Success(appService.unitTestingList(input));
	}
	
	/**
	 * 区位列表
	 * @param yardKey
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/zones")
	public Result getZoneList(String yardKey) {
		return Result.Success(appService.getZoneList(yardKey));
	}
	
	/**
	 * 设置好/坏机组
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/setUnit")
	public Result setUnitState(SetUnitStateInput input) {
		String message=appService.setUnitState(input);
		if (UnitStateEnum.GOOD.getCode().equals(input.getUnitState()) && input.getProdCourseIdList() != null
				&& input.getProdCourseIdList().length > 0) {
			for (String prodCourseId : input.getProdCourseIdList()) {
				auditService.auditAutomatic(prodCourseId, false);
			}
		}
		return Result.Success(null,message);
	}
	
	/**
	 * 关联区位
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/setUnitZone")
	public Result setUnitZone(SetUnitZoneInput input) {
		appService.setUnitZone(input);
		return Result.Success();
	}
	
	/**
	 * 补录箱子信息
	 * @param input
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/setContainerInfo")
	public Result setContainerInfo(SetContainerInfoInput input) throws Exception {
		String prodCourseId = appService.setContainerInfo(input);
		auditService.auditAutomatic(prodCourseId, true);
		return Result.Success();
	}
	
	/**
	 * 机组初录
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subUnitInfo")
	public Result subUnitInfo(AddUnitInfoInput input) {
		appService.addUnitInfo(input);
		SetUnitStateInput setStateInput=new SetUnitStateInput();
		setStateInput.setProdCourseIdList(new String[] {input.getProdCourseId()});
		setStateInput.setUnitState(input.getUnitState());
		String message=appService.setUnitState(setStateInput);
		auditService.auditAutomatic(input.getProdCourseId(), true);
		return Result.Success(null,message);
	}
	
	/**
	 * 部件大类列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/partTypes")
	public Result partTypesList(@RequestParam(value="partsTypeSearch",required = false) String partsTypeSearch) {
		PartsTypeSearchInput input=new PartsTypeSearchInput();
		input.setPartsTypeSearch(partsTypeSearch);
		return Result.Success(appService.getPartsTypeList(input));
	}
	
	/**
	 * 相关修理列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/relatRepairs")
	public Result relatRepairs() {
		return Result.Success(appService.getRelationRepairList());
	}
	
	/**
	 * 新增备件号
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/spares/add")
	public Result addSpare(AddSpareInput input) {
		appService.addSpare(input);
		return Result.Success();
	}
	
	/**
	 *暂存检验明细
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subUnitDetail")
	public Result subUnitDetail(SubmitTestingInput input) {
		appService.saveTesting(input);
		return Result.Success();
	}
	
	/**
	 *提交检验明细
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/submit")
	public Result submit(SubmitTestingInput input) {
		appService.submitTesting(input);
		if(StringUtils.isNotBlank(input.getProdCourseId())) {			
			auditService.auditAutomatic(input.getProdCourseId(), true);
		}
		return Result.Success();
	}
	
//	/**
//	 *部件明细
//	 * @param input
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	@GetMapping("/unitPartDetails")
//	public Result getPartDetailList(PartsDetailSearchInput input) {
//		return Result.Success(appService.getPartDetailList(input));
//	}
	
	/**
	 *获取冷机公司和机型
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/companys")
	public Result getCompanyList() {
		return Result.Success(appService.getCompanyList());
	}
	
	/**
	 *备件列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unit/spares")
	public Result getSpares(SearchSpareInput input) {
		return Result.Success(appService.getSpares(input));
	}
	
	/**
	 *备件库存
	 * @param input
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unit/sparesStock")
	public Result getSparesStock(SpareStockInput input) throws Exception {
		if (StringUtils.isBlank(input.getSparesNum()) || StringUtils.isBlank(input.getSpareStockModule())
				|| StringUtils.isBlank(input.getContainerUser()) || StringUtils.isBlank(input.getRepairCode())) {
			throw new Exception("部分参数为空");
		}
		return Result.Success(appService.getSparesStock(input));
	}
	
	/**
	 *根据用户名获取公司列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/companys")
	public Result companys(String userName) {
		return Result.Success(appService.getCompanys(userName));
	}
	
	/**
	 * app登陆
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/login")
	public Result appLogin(@RequestBody AppLoginInput input) {
		return Result.Success(appService.login(input));
	}
	
	/**
	 * app注销
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/loginOut")
	public Result appLoginOut() {
		authClient.logout();
		return Result.Success();
	}
	
	/**
	 * 机组明细
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unitDetails")
	public Result getCourse(@RequestParam("prodCourseId") String prodCourseId) {
		return Result.Success(appService.getCourseDetail(prodCourseId));
	}
	
	/**
	 * 维修历史记录-进场列表 -- 通用
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/entrys")
	public Result getEntryList(UnitTestingHistoryInput input) {
		return Result.Success(appService.getHistoryPagedList(input));
	}
	
	/**
	 * 维修历史记录-明细--通用
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/entryDetail")
	public Result entryDetail(String prodCourseId, String containerCategory, Integer detailType) {
		return Result.Success(appService.getHistoryDetail(prodCourseId,containerCategory, detailType));
	}
	
	/**
	 * pti列表
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/ptis")
	public Result getPtiList() {
		return Result.Success(appService.getPtiList());
	}
	
	/**
	 * 进场审核
	 * @param input 
	 * @param input 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/audits")
	public Result audits(@RequestBody AuditUnitInput input) {
		unitService.approveUnitTesting(input);
		if(input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			for (String courseId : input.getProdCourseIdList()) {
				auditService.AddEvaluationEntry(courseId, true, false);
				auditService.referralAutomatic(courseId, true);
			}
		}
		return Result.Success();
	}
	
	/**
	 * 先修列表
	 * @param zone 区位
	 * @param containerNo 箱号
	 * @param index 要搜索的页码
	 * @param size 每页显示的数量
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/placements")
	public Result getPlacementList(
			@RequestParam(value="zone",required = false) String zone,
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		PreReferralSearchInput input=new PreReferralSearchInput();
		input.setZone(zone);
		input.setContainerNo(containerNo);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(appService.getPreReferralPagedList(input));
	}
}
