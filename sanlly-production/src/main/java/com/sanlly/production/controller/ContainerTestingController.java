package com.sanlly.production.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInfoInput;
import com.sanlly.production.models.input.containerTesting.AuditContainerInput;
import com.sanlly.production.models.input.containerTesting.CommonRepairInput;
import com.sanlly.production.models.input.containerTesting.ContainerCourseAllInput;
import com.sanlly.production.models.input.containerTesting.ContainerCourseInput;
import com.sanlly.production.models.input.containerTesting.ContainerEntryListInput;
import com.sanlly.production.models.input.containerTesting.ContainerTestingSearchInput;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.models.input.containerTesting.ThirdPartyChargeInput;
import com.sanlly.production.models.input.unitTesting.UnitBasicAddInput;
import com.sanlly.production.models.output.containerTesting.ContainerCourseOutput;
import com.sanlly.production.service.AuditService;
import com.sanlly.production.service.ContainerTestingService;
import com.sanlly.production.service.UnitTestingService;

/**
 *    
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO 箱体进场接口
 * @author tianzhl   
 * @date 2019年8月14日 下午1:50:53 
 * @version V1.0   
 */
@RestController
public class ContainerTestingController {

	@Autowired
	private ContainerTestingService containerTestingService;

	@Autowired
	private UnitTestingService unitTestingService;

	@Autowired
	private AuditService auditService;

	/**
	 *  
	 * 
	 * @Description: TODO 箱体进场列表
	 * @param startDate          进场开始日期
	 * @param endDate            进场结束日期
	 * @param yard               进场场站
	 * @param containerNo        箱号
	 * @param containerUser      用箱人
	 * @param courseType         进场类型
	 * @param containerType      箱型
	 * @param containerCondition 箱况
	 * @param testingState       检验状态
	 * @param index              当前页码
	 * @param size               页大小
	 * @return
	 * @throws Exception Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/list")
	public Result getEntryList(@RequestParam(required = false) String startDate,
			@RequestParam(required = false) String endDate, @RequestParam(required = false) String yard,
			@RequestParam(required = false) String containerCategory,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String courseType, @RequestParam(required = false) String containerType,
			@RequestParam(required = false) String containerCondition,
			@RequestParam(required = false) String isSurrender, @RequestParam(required = false) String containerOwner,
			@RequestParam(required = false) String testingUser, @RequestParam(required = false) String[] testingState,
			@RequestParam(required = true) Integer pageIndex, @RequestParam(required = true) Integer pageSize)
			throws Exception {
		ContainerTestingSearchInput input = new ContainerTestingSearchInput();
		input.setContainerCategory(containerCategory);
		input.setContainerCondition(containerCondition);
		input.setContainerNo(containerNo);
		input.setContainerType(containerType);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setEndDate(endDate);
		input.setStartDate(startDate);
		input.setTestingState(testingState);
		input.setIsSurrender(isSurrender);
		input.setYard(yard);
		input.setContainerOwner(containerOwner);
		input.setTestingUser(testingUser);
		input.setPageIndex(pageIndex);
		input.setPageSize(pageSize);
		return Result.Success(containerTestingService.getPageList(input));
	}

	/**
	 * 冷代干列表
	 * 
	 * @Description: TODO
	 * @param startDate          进场开始日期
	 * @param endDate            进场结束日期
	 * @param yard               进场场站
	 * @param containerNo        箱号
	 * @param containerUser      用箱人
	 * @param courseType         进场类型
	 * @param containerCondition 箱况
	 * @param testingState       检验状态
	 * @param index              当前页码
	 * @param size               页大小
	 * @return
	 * @throws Exception Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/list/dry")
	public Result getDryEntryList(@RequestParam(required = false) String startDate,
			@RequestParam(required = false) String endDate, @RequestParam(required = false) String yard,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String courseType,
			@RequestParam(required = false) String containerCondition,
			@RequestParam(required = false) String[] testingState, @RequestParam(required = true) Integer pageIndex,
			@RequestParam(required = true) Integer pageSize) throws Exception {
		ContainerTestingSearchInput input = new ContainerTestingSearchInput();
		input.setContainerCondition(containerCondition);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setEndDate(endDate);
		input.setStartDate(startDate);
		input.setTestingState(testingState);
		input.setYard(yard);
		input.setPageIndex(pageIndex);
		input.setPageSize(pageSize);
		return Result.Success(containerTestingService.getUnitPageList(input));
	}

	/**
	 * 取消冷代干
	 * 
	 * @Description: TODO
	 * @param listIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/list/cancel")
	public Result cancelDry(@RequestParam String[] listIds) {
		containerTestingService.cancelDry(listIds);
		return Result.Success();
	}

	/**
	 * 批量设置冷代干
	 * 
	 * @Description: TODO
	 * @param listIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/settingDry")
	public Result settingDry(@RequestParam String[] listIds) {
		containerTestingService.settingDry(listIds);
		return Result.Success();
	}

	/**
	 * 
	 * @Description: TODO 批量设置箱况
	 * @param input void @throws 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/state")
	@Transactional
	Result setContainerState(@RequestBody SetContainerStateInput input) throws Exception {
		containerTestingService.setContainerState(input);
		if (ContainerStateEnum.GOOD.getCode().equals(input.getContainerState()) && input.getProdCourseIdList() != null
				&& input.getProdCourseIdList().length > 0) {
			for (String prodCourseId : input.getProdCourseIdList()) {
				auditService.auditAutomatic(prodCourseId, false);
			}
		}
		return Result.Success();
	}

	/**
	 * 
	 * @Description: TODO 批量提交箱体检验
	 * @param input void @throws 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/submit")
	@Transactional
	Result submitContainerTesting(@RequestBody SetContainerStateInput input) throws Exception {
		List<String> prodCourseIds = containerTestingService.selectCourseByTestingState(input.getProdCourseIdList(),
				new String[] { TestingStateEnum.TESTING.getCode(), TestingStateEnum.REJECTED.getCode(),
						TestingStateEnum.UNAUDIT.getCode() });
		input.setProdCourseIdList(prodCourseIds.toArray(new String[prodCourseIds.size()]));
		containerTestingService.submitContainerTesting(input);
		if (input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			String message = "";
			for (String courseId : input.getProdCourseIdList()) {
				try {
					auditService.auditAutomatic(courseId, false);
				} catch (Exception e) {
					message += courseId + ":" + e.getMessage() + ";";
				}
			}
			if(StringUtils.isNotBlank(message)) {
				throw new Exception(message);
			}
		}
		return Result.Success();
	}

	/**
	 * 
	 * @Description: TODO 箱体检验审核
	 * @param input void @throws 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/audit")
	@Transactional
	Result auditContainerTesting(@RequestBody AuditContainerInput input) throws Exception {
		List<String> prodCourseIds = containerTestingService.selectCourseByTestingState(input.getProdCourseIdList(),
				new String[] { TestingStateEnum.UNAUDIT.getCode() });
		input.setProdCourseIdList(prodCourseIds.toArray(new String[prodCourseIds.size()]));
		containerTestingService.auditContainerTesting(input);
		if (input.getAuditType() != null && TestingStateEnum.AUDITED.getCode().equals(input.getAuditType())
				&& input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			List<String> courseList = new ArrayList<String>();
			String message = "";
			for (String courseId : input.getProdCourseIdList()) {
				try {
					auditService.AddEvaluationEntry(courseId, false, false);
					try {
						auditService.referralAutomatic(courseId, false);
					} catch (Exception e) {
						courseList.add(courseId);
						message += courseId + ":" + e.getMessage() + ";";
					}
				} catch (Exception e) {
					courseList.add(courseId);
					message += courseId + ":" + e.getMessage() + ";";
				}
			}
			if (courseList.size() > 0) {
				SetContainerStateInput scsInput = new SetContainerStateInput();
				scsInput.setProdCourseIdList(courseList.toArray(new String[courseList.size()]));
				containerTestingService.submitContainerTesting(scsInput);
				throw new Exception(message);
			}
		}
		return Result.Success();
	}

	/**
	 * 
	 * @Description: TODO 根据箱号获取箱体基本信息
	 * @param containerNo 箱号
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers")
	Result containerCourseByContainerNo(@RequestParam(required = false) String containerNo) {
		return Result.Success(containerTestingService.containerCourseByContainerNo(containerNo));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据进场获取箱体基本信息
	 * @param prodCourseId 进场信息
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/course")
	Result containerCourse(@RequestParam(required = false) String prodCourseId,
			@RequestParam(required = false) String containerCategory) {
		return Result.Success(containerTestingService.containerCourse(prodCourseId, containerCategory));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场信息
	 * @param input 箱体进场信息 @throws 
	 * @throws ParseException
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/saveAll")
	Result saveContainerCourseAll(@RequestBody ContainerCourseAllInput input) throws ParseException {
		// 箱体基本进场信息
		String prodCourseId = null;
		if (input.getContainer() != null) {
			prodCourseId = containerTestingService.saveContainerCourse(input.getContainer());
			auditService.auditAutomatic(prodCourseId, false);
		}
		ContainerCourseOutput output = containerTestingService.containerCourse(prodCourseId, null);
		if (output != null && output.getContainerCategory() != null
				&& ContainerCategoryEnum.CONTAINER_02.getCode().equals(output.getContainerCategory())) {
			// 机组进场信息
			if (input.getUnit() != null) {
				UnitBasicAddInput unit = input.getUnit();
				if (prodCourseId != null) {
					unit.setProdCourseId(prodCourseId);
				}
				if (input.getContainer() != null && input.getContainer().getContainerNo() != null) {
					unit.setContainerNo(input.getContainer().getContainerNo());
				}
				unitTestingService.updateUnitBasicInfo(unit);
				auditService.auditAutomatic(prodCourseId, true);
			}
		}

		return Result.Success(prodCourseId);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场检验明细信息
	 * @param input 箱体进场检验明细信息 @throws 
	 * @throws ParseException
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/entry/save")
	Result saveContainerCourserEntryInfo(@RequestBody ContainerCourseEntryInfoInput input) throws Exception {
		containerTestingService.saveContainerCourserEntryInfo(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 查看箱体进场检验明细信息列表
	 * @param prodCourseId 进场id
	 * @return ContainerCourseEntryInfoOutput 箱体进场检验明细信息列表 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/entry/list")
	Result containerCourseEntryList(@RequestParam(required = true) String prodCourseId,
			@RequestParam(required = true) String containerCategory) {
		return Result.Success(containerTestingService.containerCourseEntryList(prodCourseId, containerCategory));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取当前场站好坏箱类型
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/stateType")
	Result containerStateType() {
		return Result.Success(containerTestingService.containerStateType());
	}

	/**
	 *  
	 * 
	 * @Description: TODO 常用修理方案 -- 干箱、箱体
	 * @param input 筛选条件
	 * @return CommonRepairOutput 常用修理方案 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/commonRepair")
	Result commonRepair(@RequestParam(required = true) String positionCode,
			@RequestParam(required = false) String partsRepairCode,
			@RequestParam(required = false) String partsDetailsCode,
			@RequestParam(required = false) String repairCode) {
		CommonRepairInput input = new CommonRepairInput();
		input.setPositionCode(positionCode);
		input.setPartsRepairCode(partsRepairCode);
		input.setPartsDetailsCode(partsDetailsCode);
		input.setRepairCode(repairCode);
		return Result.Success(containerTestingService.commonRepair(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱 分类
	 * @param positionCode 位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/partsRepair")
	Result entryRelationPartsRepairNoType(@RequestParam(required = true) String positionCode) {
		return Result.Success(containerTestingService.entryRelationPartsRepairNoType(positionCode));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱
	 * @param positionCode 位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/partsRepairType")
	Result entryRelationPartsRepair(@RequestParam(required = true) String positionCode) {
		return Result.Success(containerTestingService.entryRelationPartsRepair(positionCode));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件大类获取部件明细--箱体、机组
	 * @param containerCategory 箱类别
	 * @param partsTypeCode     部件大类代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/partsDetails")
	Result entryRelationPartsDetails(@RequestParam(required = true) String containerCategory,
			@RequestParam(required = false) String partsTypeCode) {
		return Result.Success(containerTestingService.entryRelationPartsDetails(containerCategory, partsTypeCode));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件明细获取修理--箱体、机组
	 * @param containerCategory      箱类别
	 * @param partsDetailsCode部件明细代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/repair")
	Result entryRelationRepair(@RequestParam(required = true) String containerCategory,
			@RequestParam(required = false) String partsDetailsCode,
			@RequestParam(required = false) String searchName) {
		return Result
				.Success(containerTestingService.entryRelationRepair(containerCategory, partsDetailsCode, searchName));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件修理、部件明细、修理获取损坏--干箱、箱体、机组
	 * @param containerCategory 箱类别
	 * @param partsRepairCode   部件修理代码
	 * @param partsDetailsCode  部件明细代码
	 * @param repairCode        修理代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/damage")
	Result entryRelationDamage(@RequestParam(required = true) String containerCategory,
			@RequestParam(required = false) String partsRepairCode,
			@RequestParam(required = false) String partsDetailsCode, @RequestParam(required = false) String repairCode,
			@RequestParam(required = false) String searchName) {
		return Result.Success(containerTestingService.entryRelationDamage(containerCategory, partsRepairCode,
				partsDetailsCode, repairCode, searchName));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件明细、修理获取材质--箱体
	 * @param partsDetailsCode 部件明细代码
	 * @param repairCode       修理代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/material")
	Result entryRelationMaterial(@RequestParam(required = true) String partsDetailsCode,
			@RequestParam(required = true) String repairCode) {
		return Result.Success(containerTestingService.entryRelationMaterial(partsDetailsCode, repairCode));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取部件大类--机组
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/partsType")
	Result entryRelationPartsType() {
		return Result.Success(containerTestingService.entryRelationPartsType());
	}

	/**
	 *  
	 * 
	 * @Description: TODO 特殊货物洗箱费率
	 * @return List<SpecialGoodSelectOutput>
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/specialRate")
	Result specialWashingRate(@RequestParam(required = true) String company) {
		return Result.Success(containerTestingService.specialWashingRate(company));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 重复条目提醒
	 * @param containerNo      箱号
	 * @param partsRepairCode  部件修理代码
	 * @param partsDetailsCode 部件明细代码
	 * @param repairCode       修理代码
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/repeatPrompts")
	Result repeatPromptsEntry(@RequestParam(required = true) String containerNo,
			@RequestParam(required = true) String containerCategory,
			@RequestParam(required = false) String partsRepairCode,
			@RequestParam(required = false) String partsDetailsCode,
			@RequestParam(required = false) String repairCode) {
		return Result.Success(containerTestingService.repeatPromptsEntry(containerNo, containerCategory,
				partsRepairCode, partsDetailsCode, repairCode));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 删除进场明细
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/containers/entry/delete")
	Result containerCourseEntryDelete(@RequestBody ContainerEntryListInput input) {
		containerTestingService.containerCourseEntryDelete(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 判断是否外包
	 * @param input
	 * @return Result @throws 
	 */
	@GetMapping("/containers/entry/isWb")
	Boolean isWb(@RequestParam(required = true) String prodCourseId,
			@RequestParam(required = true) String containerCategory) {
		return containerTestingService.isWb(prodCourseId, containerCategory);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 导入进场数据
	 * @param inputs 进场数据
	 * @throws Exception @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/export")
	public Result exportContainerCourse(@RequestBody List<ContainerCourseInput> inputs) throws Exception {
		containerTestingService.exportContainerCourse(inputs);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 第三方现场收费
	 * @param input @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/charge")
	public Result containersCharge(@RequestBody ThirdPartyChargeInput input) throws Exception {
		return Result.Success(containerTestingService.thirdPartyCharge(input));
	}
}
