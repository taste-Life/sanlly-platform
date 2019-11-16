package com.sanlly.production.controller;

import java.text.ParseException;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseOffLineListInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerTestingSearchInput;
import com.sanlly.production.models.input.containerTesting.AuditContainerInput;
import com.sanlly.production.models.input.containerTesting.CommonRepairInput;
import com.sanlly.production.models.input.containerTesting.ContainerEntryListInput;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.service.AuditService;
import com.sanlly.production.service.ContainerTestingService;
import com.sanlly.production.service.app.ContainerTestingAppService;

/**
 *    
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO 箱体进场APP接口
 * @author tianzhl   
 * @date 2019年8月15日 下午6:54:43 
 * @version V1.0   
 */
@RestController
public class ContainerTestingAppController {

	@Autowired
	private ContainerTestingAppService containerTestingAppService;

	@Autowired
	private ContainerTestingService containerTestingService;
	
	@Autowired
	private AuditService auditService;

	/**
	 *  
	 * 
	 * @Description: TODO 箱体进场检验列表
	 * @param input 查询条件
	 * @return PagedList<ContainerInfoOutput> 进场检验列表 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/container/list")
	Result containerTestingList(@RequestParam(required = false) String checkType,
			@RequestParam(required = false) String auditType, @RequestParam(required = false) String containerCategory,
			@RequestParam(required = false) String containerNo, @RequestParam(required = true) Integer index,
			@RequestParam(required = true) Integer size) {
		ContainerTestingSearchInput input = new ContainerTestingSearchInput();
		input.setCheckType(checkType);
		input.setAuditType(auditType);
		input.setContainerCategory(containerCategory);
		input.setContainerNo(containerNo);
		input.setIndex(index);
		input.setSize(size);
		return Result.Success(containerTestingAppService.containerTestingList(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据箱号获取箱体基本信息
	 * @param containerNo 箱号
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/container")
	Result containerInfo(@RequestParam(required = false) String containerNo) {
		return Result.Success(containerTestingAppService.containerInfo(containerNo));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场信息
	 * @param input 箱体进场信息 @throws 
	 * @throws ParseException
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/save")
	Result saveContainerCourseInfo(ContainerCourseInput input) throws Exception {
		String prodCourseId = containerTestingAppService.saveContainerCourseInfo(input);
		auditService.auditAutomatic(prodCourseId, false);
		return Result.Success(prodCourseId);

	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 离线批量上传进场
	 * @param inputs 箱体进场信息 @throws 
	 * @return String prodCourseId 进场id 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/upload")
	Result saveContainerCourseOffLine(@RequestBody ContainerCourseOffLineListInput inputs) throws Exception {
		containerTestingAppService.saveContainerCourseOffLine(inputs.getCourses());
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场检验明细信息
	 * @param input 箱体进场检验明细信息 @throws 
	 * @throws ParseException
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/entry/sava")
	Result saveContainerCourserEntryInfo(@RequestBody ContainerCourseEntryInfoInput input) throws Exception {
		containerTestingService.saveContainerCourserEntryInfo(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 删除进场明细
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/container/entry/delete")
	Result containerCourseEntryDelete(@RequestBody ContainerEntryListInput input) {
		containerTestingService.containerCourseEntryDelete(input);
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
	@GetMapping("/container/entry/list")
	Result containerCourseEntryList(@RequestParam(required = true) String prodCourseId,
			@RequestParam(required = false) String containerCategory) {
		return Result.Success(containerTestingService.containerCourseEntryList(prodCourseId, containerCategory));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 提交箱体进场信息
	 * @param prodCourseId 箱体进场信息 @throws 
	 * @throws ParseException
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/submit")
	Result submitContainerCourse(@RequestBody ContainerCourseEntryInfoInput input) throws Exception {
		containerTestingAppService.submitContainerCourse(input);
		if(StringUtils.isNotBlank(input.getProdCourseId())) {			
			if(ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {				
				auditService.mainReferral(input.getProdCourseId());
				auditService.mainEvaluation(input.getProdCourseId());
			}else {
				auditService.auditAutomatic(input.getProdCourseId(), ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory()));
			}
		}
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 快捷条目录入列表
	 * @param containerCategory
	 * @return List<ShortcutOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/shortcut/list")
	Result shortcutList(@RequestParam(required = false) String containerCategory) {
		return Result.Success(containerTestingAppService.shortcutList(containerCategory));
	}

	/**
	 * 
	 * @Description: TODO 批量设置箱况
	 * @param input void @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/state")
	Result setContainerState(SetContainerStateInput input) {
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
	 * @Description: TODO 箱体检验审核
	 * @param input void @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/audit")
	Result auditContainerTesting(AuditContainerInput input) {
		containerTestingService.auditContainerTesting(input);
		if(input.getAuditType() != null && TestingStateEnum.AUDITED.getCode().equals(input.getAuditType()) && input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			for (String courseId : input.getProdCourseIdList()) {
				auditService.AddEvaluationEntry(courseId, false, false);
				auditService.referralAutomatic(courseId, false);
			}
		}
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 常用修理方案 -- 干箱、箱体
	 * @param input 筛选条件
	 * @return CommonRepairOutput 常用修理方案 @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/container/commonRepair")
	Result commonRepair(CommonRepairInput input) {
		return Result.Success(containerTestingService.commonRepair(input));
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱
	 * @param positionCode 位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/container/partsRepair")
	Result entryRelationPartsRepairNoType(@RequestParam(required = true) String positionCode) {
		return Result.Success(containerTestingService.entryRelationPartsRepairNoType(positionCode));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱  分类
	 * @param positionCode 位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/container/partsRepairType")
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
	@GetMapping("/container/partsDetails")
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
	@GetMapping("/container/repair")
	Result entryRelationRepair(@RequestParam(required = true) String containerCategory,
			@RequestParam(required = false) String partsDetailsCode,
			@RequestParam(required = false) String searchName) {
		return Result.Success(containerTestingService.entryRelationRepair(containerCategory, partsDetailsCode,searchName));
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
	@GetMapping("/container/damage")
	Result entryRelationDamage(@RequestParam(required = true) String containerCategory,
			@RequestParam(required = false) String partsRepairCode,
			@RequestParam(required = false) String partsDetailsCode,
			@RequestParam(required = false) String repairCode,
			@RequestParam(required = false) String searchName) {
		return Result.Success(containerTestingService.entryRelationDamage(containerCategory, partsRepairCode,
				partsDetailsCode, repairCode,searchName));
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
	@GetMapping("/container/material")
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
	@GetMapping("/container/partsType")
	Result entryRelationPartsType() {
		return Result.Success(containerTestingService.entryRelationPartsType());
	}
}
