package com.sanlly.production.service.app.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.ContainerTypeMapper;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.ShortcutRecordMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.entity.Container;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.ContainerTypeExample;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseExample.Criteria;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.ShortcutRecord;
import com.sanlly.production.entity.ShortcutRecordExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInfoInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseOffLineInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerTestingSearchInput;
import com.sanlly.production.models.output.app.containerTesting.ContainerCourseOutput;
import com.sanlly.production.models.output.app.containerTesting.CourseListOutput;
import com.sanlly.production.models.output.app.shortcut.ShortcutDetailOutput;
import com.sanlly.production.models.output.app.shortcut.ShortcutOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.ContainerTestingService;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.app.ContainerTestingAppService;

/**
 *
 * @Package com.sanlly.production.service.app 
 * @Description: TODO 集装箱检验 APP相关服务类
 * @author tianzhl   
 * @date 2019年8月9日 下午3:16:41 
 * @version V1.0   
 */
@Service
public class ContainerTestingAppServiceImpl extends BaseAppServiceImpl implements ContainerTestingAppService {

	@Autowired
	private CourseMapper courseDao;

	@Autowired
	private ContainerMapper containerDao;
	
	@Autowired
	private CourseEntryMapper courseEntryDao;

	@Autowired
	private ContainerTypeMapper containerTypeDao;

	@Autowired
	private ShortcutRecordMapper shortcutRecordDao;

	@Autowired
	private CourseKeyRuleService ruleService;

	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	@Autowired
	private MaintenanceMapper maintenanceDao;
	
	@Autowired
	private AuthService authClient;
	
	@Autowired
	private ContainerTestingService containerTestingService;

	/**
	 *  
	 * 
	 * @Description: TODO 箱体进场检验列表
	 * @param input 查询条件
	 * @return PagedList<ContainerInfoOutput> 进场检验列表 @throws 
	 */
	@Override
	public CourseListOutput<ContainerCourseOutput> containerTestingList(ContainerTestingSearchInput input) {
		CourseListOutput<ContainerCourseOutput> pagedList = new CourseListOutput<ContainerCourseOutput>(
				input.getIndex(), input.getSize());
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		// 箱列別
		if (StringUtils.isNotBlank(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory().trim());
		}
		// 箱号
		if (StringUtils.isNotBlank(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
		}
		// 检验状态
		if (StringUtils.isNotBlank(input.getCheckType())) {
			if (input.getCheckType().equals("OVER")) {
				criteria.andTestingStateIn(Arrays.asList(TestingStateEnum.UNAUDIT.getCode(),
						TestingStateEnum.AUDITED.getCode(), TestingStateEnum.REJECTED.getCode()));
			} else {
				criteria.andTestingStateEqualTo(input.getCheckType());
			}
		}
		// 审核状态
		if (StringUtils.isNotBlank(input.getAuditType())) {
			criteria.andTestingStateEqualTo(input.getAuditType());
		}
		
		// 场站
		criteria.andYardEqualTo(getCurrentYardKey());

		// 分页查询信息
		int totalItemCount = (int) courseDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		// 按照进场倒序
		example.setOrderByClause(" course_time desc");
		// 包含text查询方法
		List<CourseWithBLOBs> dataList = courseDao.selectByExampleWithBLOBs(example);
		List<ContainerCourseOutput> list = dataList.stream().map(record -> {
			ContainerCourseOutput item = new ContainerCourseOutput();
			item.setProdCourseId(record.getProdCourseId());
			item.setContainerNo(record.getContainerNo());
			item.setSizeKey(record.getSize());
			item.setContainerCategoryKey(record.getContainerCategory());
			item.setContainerTypeKey(record.getContainerType());
			item.setEntryTypeKey(record.getCourseType());
			item.setContainerUserKey(record.getContainerUser());
			item.setAuditTypeKey(record.getTestingState());
			item.setContainerConditionKey(record.getContainerCondition());
			item.setContainerConditionCategoryKey(record.getYardContainerType());
			item.setContainerBelongKey(record.getContainerBelong());
			item.setContainerOwnerKey(record.getContainerOwner());
			item.setUnitTypeKey(record.getUnitType());
			item.setContainerGradeKey(record.getContainerGrade());
			item.setSizeLang(record.getSize());
			item.setContainerCategoryLang(record.getContainerCategory());
			item.setContainerTypeLang(record.getContainerType());
			item.setEntryTypeLang(record.getCourseType());
			item.setContainerUserLang(record.getContainerUser());
			item.setAuditTypeLang(record.getTestingState());
			item.setContainerConditionLang(record.getContainerCondition());
			item.setContainerConditionCategoryLang(record.getYardContainerType());
			item.setContainerBelongLang(record.getContainerBelong());
			item.setContainerOwnerLang(record.getContainerOwner());
			item.setUnitTypeLang(record.getUnitType());
			item.setContainerGradeLang(record.getContainerGrade());
			item.setTestingPhoto(record.getTestingPhoto());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if (record.getCourseTime() != null) {
				item.setEntryDate(sdf.format(record.getCourseTime()));
			}
			item.setBillOfLadingNo(record.getBillOfLadingNo());
			item.setVesselVoyage(record.getVesselVoyage());
			item.setContainerAge(record.getContainerAge());
			item.setDomesticForeignTrade(record.getDomesticForeignTrade());
			item.setContainerLevel(record.getContainerGrade());
			item.setIsFreezeDry(record.getIsFreezeDry());
			item.setIsGonContainer(record.getIsGonContainer());
			item.setLabelling(record.getLabelling());
			item.setRemark(record.getTestingRemarks());
			item.setContainerTare(StringUtil.valueOf(record.getContainerTare()));
			item.setContainerLoad(StringUtil.valueOf(record.getContainerLoad()));
			item.setLeadSealing(record.getLeadSealing());
			item.setBareWeight(record.getBareWeight());
			item.setContainerVolume(StringUtil.valueOf(record.getContainerVolume()));
			item.setGrossWeight(StringUtil.valueOf(record.getGrossWeight()));
			item.setIsSurrender(record.getIsSurrender());
			item.setRightAngle(record.getRightAngle());
			item.setIsCleanout(record.getIsCleanout());
			item.setIsLocator(record.getIsLocator());
			item.setIsLabel(record.getIsLabel());
			item.setSpeedPhoto(record.getSpeedPhoto());
			if (record.getTestingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(record.getTestingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						item.setCheckUser(user.getUserName());
					}
				}
			}
			CourseEntryExample courseEntryExample = new CourseEntryExample();
			courseEntryExample.createCriteria().andCourseEqualTo(record.getProdCourseId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			int count = (int) courseEntryDao.countByExample(courseEntryExample);
			item.setEntryCount(count);
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(list);
		// 获取待审核数量
		CourseExample exampleAd = new CourseExample();
		exampleAd.createCriteria().andTestingStateEqualTo(TestingStateEnum.UNAUDIT.getCode());
		pagedList.setToAudit(courseDao.countByExample(exampleAd) + "");
		// TODO Auto-generated method stub
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据箱号获取箱体基本信息
	 * @param containerNo 箱号
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@Override
	public ContainerCourseOutput containerInfo(String containerNo) {
		if (StringUtils.isNotBlank(containerNo)) {
			ContainerCourseOutput containerCourseOutput = new ContainerCourseOutput();
			CourseExample example = new CourseExample();
			example.createCriteria().andContainerNoEqualTo(containerNo);
			example.setOrderByClause("course_time desc");
			List<CourseWithBLOBs> courses = courseDao.selectByExampleWithBLOBs(example);
			if (courses != null && courses.size() > 0) {
				// 获取最新一次进场信息
				CourseWithBLOBs record = courses.get(0);
				containerCourseOutput.setProdCourseId(record.getProdCourseId());
				containerCourseOutput.setContainerNo(record.getContainerNo());
				containerCourseOutput.setSizeKey(record.getSize());
				containerCourseOutput.setContainerCategoryKey(record.getContainerCategory());
				containerCourseOutput.setContainerTypeKey(record.getContainerType());
				containerCourseOutput.setEntryTypeKey(record.getCourseType());
				containerCourseOutput.setContainerUserKey(record.getContainerUser());
				containerCourseOutput.setAuditTypeKey(record.getTestingState());
				containerCourseOutput.setContainerConditionKey(record.getContainerCondition());
				containerCourseOutput.setContainerConditionCategoryKey(record.getYardContainerType());
				containerCourseOutput.setContainerBelongKey(record.getContainerBelong());
				containerCourseOutput.setUnitTypeKey(record.getUnitType());
				containerCourseOutput.setContainerGradeKey(record.getContainerGrade());
				containerCourseOutput.setSizeLang(record.getSize());
				containerCourseOutput.setContainerCategoryLang(record.getContainerCategory());
				containerCourseOutput.setContainerTypeLang(record.getContainerType());
				containerCourseOutput.setEntryTypeLang(record.getCourseType());
				containerCourseOutput.setContainerUserLang(record.getContainerUser());
				containerCourseOutput.setAuditTypeLang(record.getTestingState());
				containerCourseOutput.setContainerConditionLang(record.getContainerCondition());
				containerCourseOutput.setContainerConditionCategoryLang(record.getYardContainerType());
				containerCourseOutput.setContainerBelongLang(record.getContainerBelong());
				containerCourseOutput.setUnitTypeLang(record.getUnitType());
				containerCourseOutput.setContainerGradeLang(record.getContainerGrade());
				containerCourseOutput.setTestingPhoto(record.getTestingPhoto());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				if (record.getCourseTime() != null) {
					containerCourseOutput.setEntryDate(sdf.format(record.getCourseTime()));
				}

				containerCourseOutput.setBillOfLadingNo(record.getBillOfLadingNo());
				containerCourseOutput.setVesselVoyage(record.getVesselVoyage());
				containerCourseOutput.setContainerAge(record.getContainerAge());
				containerCourseOutput.setDomesticForeignTrade(record.getDomesticForeignTrade());
				containerCourseOutput.setContainerLevel(record.getContainerGrade());
				containerCourseOutput.setIsFreezeDry(record.getIsFreezeDry());
				containerCourseOutput.setIsGonContainer(record.getIsGonContainer());
				containerCourseOutput.setLabelling(record.getLabelling());
				containerCourseOutput.setRemark(record.getTestingRemarks());
				containerCourseOutput.setContainerTare(record.getContainerTare());
				containerCourseOutput.setContainerLoad(record.getContainerLoad());
				containerCourseOutput.setLeadSealing(record.getLeadSealing());
				containerCourseOutput.setBareWeight(record.getBareWeight());
				containerCourseOutput.setContainerVolume(record.getContainerVolume());
				containerCourseOutput.setGrossWeight(record.getGrossWeight());
				containerCourseOutput.setTestingPhoto(record.getTestingPhoto());
				containerCourseOutput.setIsSurrender(record.getIsSurrender());
				containerCourseOutput.setRightAngle(record.getRightAngle());
				containerCourseOutput.setIsCleanout(record.getIsCleanout());
				containerCourseOutput.setIsLocator(record.getIsLocator());
				containerCourseOutput.setIsLabel(record.getIsLabel());
			} else {
				// 没有进场信息 通过箱基本信息获取
				ContainerExample containerExample = new ContainerExample();
				containerExample.createCriteria().andContainerNoEqualTo(containerNo);
				List<Container> containers = containerDao.selectByExample(containerExample);
				if (containers != null && containers.size() > 0) {
					Container record = containers.get(0);
					containerCourseOutput.setContainerNo(record.getContainerNo());
					containerCourseOutput.setSizeKey(record.getSize());
					containerCourseOutput.setContainerCategoryKey(record.getContainerCategory());
					containerCourseOutput.setContainerTypeKey(record.getContainerType());
					containerCourseOutput.setUnitTypeKey(record.getUnitType());
					containerCourseOutput.setSizeLang(record.getSize());
					containerCourseOutput.setContainerCategoryLang(record.getContainerCategory());
					containerCourseOutput.setContainerTypeLang(record.getContainerType());
					containerCourseOutput.setUnitTypeLang(record.getUnitType());
					containerCourseOutput.setContainerAge(record.getContainerAge());
					containerCourseOutput.setContainerTare(StringUtil.valueOf(record.getContainerTare()));
					containerCourseOutput.setContainerLoad(StringUtil.valueOf(record.getContainerLoad()));
					containerCourseOutput.setContainerVolume(StringUtil.valueOf(record.getContainerVolume()));
					containerCourseOutput.setRightAngle(record.getRightAngle());
					containerCourseOutput.setIsLabel(record.getIsLabel());
				}
			}
			return containerCourseOutput;
		}
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场信息
	 * @param input 箱体进场信息 @throws 
	 */
	@Override
	public String saveContainerCourseInfo(ContainerCourseInput input) throws Exception {
		if (Strings.isBlank(input.getContainerNo()) || Strings.isBlank(input.getSize())
				|| Strings.isBlank(input.getContainerType()) || Strings.isBlank(input.getEntryType())
				|| Strings.isBlank(input.getContainerUser()) || Strings.isBlank(input.getContainerCondition())) {
			throw new Exception("必填参数不能为空！");
		}
		CourseWithBLOBs record = courseDao.selectByPrimaryKey(input.getProdCourseId());
		if(record == null) {
			record = new CourseWithBLOBs();
		}
		record.setProdCourseId(input.getProdCourseId());
		record.setContainerNo(input.getContainerNo());
		record.setSize(input.getSize());
		record.setContainerType(input.getContainerType());
		ContainerTypeExample example = new ContainerTypeExample();
		example.createCriteria().andKeyEqualTo(input.getContainerType().trim());
		List<com.sanlly.production.entity.ContainerType> containerTypes = containerTypeDao.selectByExample(example);
		if (containerTypes != null && containerTypes.size() > 0) {
			record.setContainerCategory(containerTypes.get(0).getContainerCategory());
		}
		record.setCourseType(input.getEntryType());
		record.setContainerUser(input.getContainerUser());
		if(record.getCourseTime() == null) {			
			record.setCourseTime(new Date());
		}
		record.setTestingUser(getCurrentUserId());
		record.setContainerCondition(input.getContainerCondition());
		if (ContainerStateEnum.UNKNOWN.getCode().equals(input.getContainerCondition())) {
			record.setTestingState(TestingStateEnum.UNTEST.getCode());
		} else if (ContainerStateEnum.GOOD.getCode().equals(input.getContainerCondition())) {
			record.setTestingTime(new Date());
			record.setTestingState(TestingStateEnum.AUDITED.getCode());
		} else {
			record.setTestingTime(new Date());
			if (StringUtils.isBlank(record.getTestingState())
					|| TestingStateEnum.REJECTED.getCode().equals(record.getTestingState())
					|| TestingStateEnum.UNTEST.getCode().equals(record.getTestingState())) {
				record.setTestingState(TestingStateEnum.TESTING.getCode());
			}
		}
		record.setBillOfLadingNo(input.getBillOfLadingNo());
		record.setVesselVoyage(input.getVesselVoyage());
		record.setContainerAge(input.getContainerAge());
		record.setDomesticForeignTrade(input.getDomesticForeignTrade());
		record.setIsFreezeDry(input.getIsFreezeDry());
		record.setYard(getCurrentYardKey());
		record.setIsGonContainer(input.getIsGonContainer());
		record.setLabelling(input.getLabelling());
		record.setTestingRemarks(input.getRemark());
		record.setContainerTare(input.getContainerTare().trim());
		record.setContainerLoad(input.getContainerLoad().trim());
		record.setContainerVolume(input.getContainerVolume().trim());
		record.setGrossWeight(input.getGrossWeight().trim());
		record.setLeadSealing(input.getLeadSealing());
		record.setBareWeight(input.getBareWeight());
		record.setYardContainerType(input.getContainerConditionCategory());
		record.setTestingPhoto(input.getTestingPhoto());
		record.setSpeedPhoto(input.getSpeedPhoto());
		record.setContainerBelong(input.getContainerBelong());
		record.setContainerOwner(input.getContainerOwner());
		record.setUnitType(input.getUnitType());
		if(StringUtils.isNotBlank(input.getIsSurrender())) {
			record.setIsSurrender(input.getIsSurrender());
		}else {
			record.setIsSurrender(CommonEnum.NO.getCode());
		}
		record.setRightAngle(input.getRightAngle());
		record.setIsCleanout(input.getIsCleanout());
		record.setIsLocator(input.getIsLocator());
		record.setIsLabel(input.getIsLabel());
		record.setContainerGrade(input.getContainerGrade());
		// TODO Auto-generated method stub
		if (StringUtils.isNotBlank(input.getProdCourseId())) {
			// 修改时间
			record.setUpdateTime(new Date());
			// 修改人
			record.setUpdateUser(getCurrentUserId());
			courseDao.updateByPrimaryKeyWithBLOBs(record);
		} else {
			record.setProdCourseId(ruleService.generateCourseKey(input.getContainerNo()));
			// 创建时间
			record.setCreateTime(new Date());
			// 创建人
			record.setCreateUser(getCurrentUserId());
			courseDao.insert(record);
			if(CommonEnum.YES.getCode().equals(record.getIsSurrender())) {
				containerTestingService.containerSurrender(record.getProdCourseId());
			}
		}
		// 机组没有进场信息添加紧张进场
		if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(record.getContainerCategory())) {
			UnitCourseWithBLOBs unit = unitCourseDao.selectByPrimaryKey(record.getProdCourseId());
			if (unit == null) {
				unit = new UnitCourseWithBLOBs();
				unit.setProdCourseId(record.getProdCourseId());
				unit.setContainerNo(record.getContainerNo());
				unit.setContainerType(record.getContainerType());
				unit.setContainerUser(record.getContainerUser());
				unit.setSize(record.getSize());
				unit.setCourseType(record.getCourseType());
				unit.setUnitCompany(input.getUnitType());
				unit.setYard(record.getYard());
				unit.setUnitState(UnitStateEnum.UNKNOWN.getCode());
				unit.setTestingState(TestingStateEnum.UNTEST.getCode());
				// unit.setTestingTime(new Date());
				unit.setCreateTime(new Date());
				unit.setCreateUser(getCurrentUserId());
				unit.setIsVentilation(CommonEnum.YES.getCode());
				unitCourseDao.insert(unit);
			}
		}
		// 箱基本型信息没有 添加箱基本信息
		ContainerExample containerExample = new ContainerExample();
		containerExample.createCriteria().andContainerNoEqualTo(record.getContainerNo());
		List<Container> containers = containerDao.selectByExample(containerExample);
		if (containers == null || containers.size() == 0) {
			Container container = new Container();
			container.setProdContainerId(ruleService.generateContainerId(input.getContainerNo()));
			container.setContainerNo(record.getContainerNo());
			container.setSize(record.getSize());
			container.setContainerCategory(record.getContainerCategory());
			container.setContainerType(record.getContainerType());
			container.setContainerAge(record.getContainerAge());
			container.setContainerTare(record.getContainerTare());
			container.setContainerLoad(record.getContainerLoad());
			container.setContainerVolume(record.getContainerVolume());
			container.setUnitType(record.getUnitType());
			container.setRightAngle(record.getRightAngle());
			container.setIsLabel(record.getIsLabel());
			containerDao.insert(container);
		}
		// 返回进场id
		return record.getProdCourseId();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 离线批量上传进场
	 * @param inputs 箱体进场信息 @throws 
	 * @return String prodCourseId 进场id 
	 */
	@Override
	@Transactional
	public void saveContainerCourseOffLine(List<ContainerCourseOffLineInput> inputs) throws Exception {
		if(inputs != null && inputs.size() > 0) {
			for (ContainerCourseOffLineInput input : inputs) {
				// 进场信息保存
				ContainerCourseInput containerCourseInput = new ContainerCourseInput();
				BeanUtils.copyProperties(input, containerCourseInput);
				String prodCourseId = saveContainerCourseInfo(containerCourseInput);
				// 条目信息保存
				CourseWithBLOBs record = courseDao.selectByPrimaryKey(prodCourseId);
				ContainerCourseEntryInfoInput containerCourseEntryInfoInput = new ContainerCourseEntryInfoInput();
				containerCourseEntryInfoInput.setAfterPhoto(input.getAfterPhoto());
				containerCourseEntryInfoInput.setContainerCategory(record.getContainerCategory());
				containerCourseEntryInfoInput.setProdCourseId(prodCourseId);
				containerCourseEntryInfoInput.setPartList(input.getPartList());
				containerTestingService.saveContainerCourserEntryInfo(containerCourseEntryInfoInput);
				// 待审核状态
				record.setTestingState(TestingStateEnum.UNAUDIT.getCode());
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				courseDao.updateByPrimaryKey(record);
			}
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 提交箱体进场信息
	 * @param prodCourseId 箱体进场信息 @throws 
	 */
	@Override
	public void submitContainerCourse(ContainerCourseEntryInfoInput input) throws Exception {
		// 保存基本信息
		containerTestingService.saveContainerCourserEntryInfo(input);
		// TODO Auto-generated method stub
		if(ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory())) {
			UnitCourseWithBLOBs record = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			if (record != null) {
				record.setTestingState(TestingStateEnum.UNAUDIT.getCode());
				// 修改时间
				record.setUpdateTime(new Date());
				// 修改人
				record.setUpdateUser(getCurrentUserId());
				unitCourseDao.updateByPrimaryKey(record);
			}
		}else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceWithBLOBs record = maintenanceDao.selectByPrimaryKey(input.getProdCourseId());
			if (record != null) {
				record.setTestingState(TestingStateEnum.AUDITED.getCode());
				// 修改时间
				record.setUpdateTime(new Date());
				// 修改人
				record.setUpdateUser(getCurrentUserId());
				maintenanceDao.updateByPrimaryKey(record);
			}
		}else {
			CourseWithBLOBs record = courseDao.selectByPrimaryKey(input.getProdCourseId());
			if (record != null) {
				record.setTestingState(TestingStateEnum.UNAUDIT.getCode());
				// 修改时间
				record.setUpdateTime(new Date());
				// 修改人
				record.setUpdateUser(getCurrentUserId());
				courseDao.updateByPrimaryKey(record);
			}
		}
		
	}

	/**
	 *  
	 * 
	 * @Description: TODO 快捷条目录入列表
	 * @param containerCategory
	 * @return List<ShortcutOutput> @throws 
	 */
	@Override
	public List<ShortcutOutput> shortcutList(String containerCategory) {
		List<ShortcutOutput> outputs = new ArrayList<ShortcutOutput>();
		ShortcutRecordExample example = new ShortcutRecordExample();
		if (containerCategory == null) {
			containerCategory = ContainerCategoryEnum.CONTAINER_01.getCode();
		}
		example.createCriteria().andContainerCategoryEqualTo(containerCategory)
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ShortcutRecord> shortcutRecords = shortcutRecordDao.selectByExample(example);
		if (shortcutRecords != null && shortcutRecords.size() > 0) {

			outputs = shortcutRecords.stream().map(shortcutRecord -> {
				ShortcutDetailOutput detailOutput = new ShortcutDetailOutput();
				detailOutput.setDamageCode(shortcutRecord.getDamageCode());
				detailOutput.setMaterialCode(shortcutRecord.getMaterialCode());
				detailOutput.setPartsDetailsCode(shortcutRecord.getPartsDetailsCode());
				detailOutput.setPartsRepairCode(shortcutRecord.getPartsRepairCode());
				detailOutput.setRepairCode(shortcutRecord.getRepairCode());
				detailOutput.setPartsTypeCode(shortcutRecord.getPartsTypeCode());
				detailOutput.setDamageNameLang(shortcutRecord.getDamageCode());
				detailOutput.setMaterialNameLang(shortcutRecord.getMaterialCode());
				detailOutput.setPartsDetailsNameLang(shortcutRecord.getPartsDetailsCode());
				detailOutput.setPartsRepairNameLang(shortcutRecord.getPartsRepairCode());
				detailOutput.setRepairNameLang(shortcutRecord.getRepairCode());
				detailOutput.setPartsTypeNameLang(shortcutRecord.getPartsTypeCode());
				detailOutput.setPositionCode(shortcutRecord.getPositionCode());
				detailOutput.setLength(String.valueOf(shortcutRecord.getLength()));
				detailOutput.setWidth(String.valueOf(shortcutRecord.getWidth()));
				detailOutput.setQuantity(String.valueOf(shortcutRecord.getQuantity()));

				ShortcutOutput output = new ShortcutOutput();
				output.setShortcutCode(shortcutRecord.getShortcutCode());
				output.setShortcutName(shortcutRecord.getShortcutName());
				output.setShortcutDetail(detailOutput);
				return output;
			}).collect(Collectors.toList());
		}
		// TODO Auto-generated method stub
		return outputs;
	}

}
