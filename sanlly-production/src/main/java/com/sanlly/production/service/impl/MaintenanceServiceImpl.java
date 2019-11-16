package com.sanlly.production.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.MaintenanceBatchDetailMapper;
import com.sanlly.production.dao.MaintenanceBatchMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseExample.Criteria;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.MaintenanceBatch;
import com.sanlly.production.entity.MaintenanceBatchDetail;
import com.sanlly.production.entity.MaintenanceBatchDetailExample;
import com.sanlly.production.entity.MaintenanceBatchExample;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.NoTypeEnum;
import com.sanlly.production.enums.OperateTypeEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.models.input.guarantee.MaintenanceAddInput;
import com.sanlly.production.models.input.guarantee.MaintenanceDelInput;
import com.sanlly.production.models.input.guarantee.MaintenanceIdsInput;
import com.sanlly.production.models.input.guarantee.MaintenanceInput;
import com.sanlly.production.models.output.guarantee.ContainerNumsOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceBatchDetailOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceBatchOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceCheckOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceEntryDateOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceInfoOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceOutput;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.MaintenanceService;

@Service
public class MaintenanceServiceImpl extends BaseServiceImpl implements MaintenanceService {

	@Autowired
	private MaintenanceMapper maintenanceMapper;
	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private CourseEntryMapper courseEntryDao;
	@Autowired
	private UnitCourseMapper unitCourseMapper;
	@Autowired
	private MaintenanceBatchMapper maintenanceBatchMapper;
	@Autowired
	private MaintenanceBatchDetailMapper maintenanceBatchDetailMapper;
	@Autowired
	private CourseKeyRuleService ruleService;

	/**
	 * web端检索机组保修列表
	 * 
	 * @param containerNo   箱号
	 * @param containerUser 用箱人
	 * @param courseType    进场类型
	 * @param startTime     检索起日
	 * @param endTime       检索止日
	 * @param operateType   操作类型
	 * @param isSurrender   是否退租箱
	 * @param yard          进场场站
	 * @param index         分页页码
	 * @param size          分页条数
	 * @return
	 * @author zhangkai
	 */
	@Override
	public PagedList<MaintenanceOutput> list(String containerNo, String containerUser, String courseType,
			Date startTime, Date endTime, String operateType, String isSurrender, String yard, Integer index,
			Integer size) {
		// 拼接检索条件
		MaintenanceExample example = new MaintenanceExample();
		example.setOrderByClause("create_time DESC");
		com.sanlly.production.entity.MaintenanceExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO.toString());
		if (containerNo != null && containerNo != "") {
			criteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		if (containerUser != null && containerUser != "") {
			criteria.andContainerUserEqualTo(containerUser);
		}
		if (courseType != null && courseType != "") {
			criteria.andCourseTypeEqualTo(courseType);
		}
		if (startTime != null && endTime != null) {
			criteria.andTestingTimeBetween(startTime, endTime);
		}
		if (operateType != null && operateType != "") {
			criteria.andOperateTypeEqualTo(operateType);
		}
		if (isSurrender != null && isSurrender != "") {
			criteria.andIsSurrenderEqualTo(isSurrender);
		}
		if (yard != null && yard != "") {
			criteria.andYardEqualTo(yard);
		}
		// 分页查询
		Integer totalItemCount = (int) maintenanceMapper.countByExample(example);
		PagedList<MaintenanceOutput> pagedList = new PagedList<MaintenanceOutput>(index, size, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<MaintenanceWithBLOBs> list = maintenanceMapper.selectByExampleWithBLOBs(example);
		if (list == null || list.size() == 0) {
			return pagedList;
		}
		List<MaintenanceOutput> outputList = new ArrayList<MaintenanceOutput>();
		for (MaintenanceWithBLOBs item : list) {
			MaintenanceOutput output = new MaintenanceOutput();
			BeanUtils.copyProperties(item, output);
			// 日期转换
			output.setCourseTime(DateUtil.date2String(item.getCourseTime()));
			output.setFaultTime(DateUtil.date2String(item.getFaultTime()));
			output.setTestingTime(DateUtil.date2String(item.getTestingTime()));
			output.setValuationTime(DateUtil.date2String(item.getValuationTime()));
			output.setValuationRejectTime(DateUtil.date2String(item.getValuationRejectTime()));
			output.setRespondTime(DateUtil.date2String(item.getRespondTime()));
			output.setFinishTime(DateUtil.date2String(item.getFinishTime()));
			output.setDispatchTime(DateUtil.date2String(item.getDesignateTime()));
			// 国际化
			output.setOperateTypeLang(item.getOperateType());
			output.setContainerTypeLang(item.getContainerType());
			output.setContainerUserLang(item.getContainerUser());
			output.setSizeLang(item.getSize());
			output.setIsSurrenderLang(item.getIsSurrender());
			output.setYardLang(item.getYard());
			output.setCourseTypeLang(item.getCourseType());
			output.setUnitTypeLang(item.getUnitType());
			output.setUnitCompanyLang(item.getUnitCompany());
			output.setIsCaLang(item.getIsCa());
			output.setIsTemperatureLang(item.getIsTemperature());
			output.setIsHumidityLang(item.getIsHumidity());
			output.setIsVentilateLang(item.getIsVentilate());
			output.setDeptLang(item.getDept());
			output.setMaintenanceTypeLang(item.getMaintenanceType());
			output.setMaintenanceSiteLang(item.getMaintenanceSite());
			output.setFaultTypeLang(item.getFaultType());
			output.setIsMaintenanceLang(item.getIsMaintenance());
			output.setTestingStateLang(item.getTestingState());
			output.setTestingStateKey(item.getTestingState());
			output.setValuationStateLang(item.getValuationState());
			output.setRepairStateLang(item.getReferralState());
			CourseEntryExample courseEntryExample = new CourseEntryExample();
			courseEntryExample.createCriteria().andCourseEqualTo(output.getProdMaintenanceId())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<CourseEntry> courseEntries = courseEntryDao.selectByExampleWithBLOBs(courseEntryExample);
			if (courseEntries != null && courseEntries.size() > 0) {
				output.setHasEntry(true);
				List<CourseEntry> entries = courseEntries.stream()
						.filter(entry -> StringUtils.isBlank(entry.getPhoto())).collect(Collectors.toList());
				output.setNoPhoto(entries != null && entries.size() > 0);
			} else {
				output.setHasEntry(false);
				output.setNoPhoto(false);
			}
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * web保修列表批量删除
	 * 
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Override
	@Transactional
	public Boolean updateByPrimaryKeys(MaintenanceDelInput input) {
		for (String id : input.getIds()) {
			MaintenanceWithBLOBs maintenance = new MaintenanceWithBLOBs();
			maintenance.setIsDel(PlatformConstants.ISDEL_YES.toString());
			maintenance.setProdMaintenanceId(id);
			maintenanceMapper.updateByPrimaryKeySelective(maintenance);
		}
		return true;
	}

	/**
	 * web进场保修批量添加进保修列表
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public Boolean addWebMaintenance(MaintenanceIdsInput input) {
		String[] ids = input.getIds();
		for (String id : ids) {
			// 根据进场id获取进场检验主表记录
			CourseExample example = new CourseExample();
			Criteria criteria = example.createCriteria();
			criteria.andProdCourseIdEqualTo(id);
			List<Course> list = courseMapper.selectByExample(example);
			if (list == null || list.size() == 0) {
				throw new RuntimeException("NoEntryRecord");
			}
			Course course = list.get(0);
			// 匹配与此进场记录同id的机组主表记录
			UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(course.getProdCourseId());
			if (unitCourse == null) {
				throw new RuntimeException("NoUnitRecordWithThisContainerNo");
			}
			// 将进场记录信息拉取至机组保修主表
			MaintenanceWithBLOBs maintenance = new MaintenanceWithBLOBs();
			maintenance.setProdMaintenanceId(ruleService.generateMaintenanceId(course.getContainerNo()));
			maintenance.setCourse(course.getProdCourseId());
			maintenance.setOperateType(OperateTypeEnum.ENTRY.getCode());
			maintenance.setContainerNo(course.getContainerNo());
			maintenance.setContainerType(course.getContainerType());
			maintenance.setContainerUser(course.getContainerUser());
			maintenance.setSize(course.getSize());
			maintenance.setContainerTare(course.getContainerTare());
			maintenance.setContainerLoad(course.getContainerLoad());
			maintenance.setContainerVolume(course.getContainerVolume());
			maintenance.setGrossWeight(course.getGrossWeight());
			maintenance.setIsSurrender(course.getIsSurrender());
			maintenance.setYard(course.getYard());
			maintenance.setCourseType(course.getCourseType());
			maintenance.setUnitType(course.getUnitType());
			// 将机组主表记录信息拉取至机组保修主表
			maintenance.setUnitType(unitCourse.getUnitType());
			maintenance.setUnitCompany(unitCourse.getUnitCompany());
			maintenance.setUnitCode(unitCourse.getUnitCode());
			maintenance.setStartDate(unitCourse.getStartDate());
			maintenance.setCompressor(unitCourse.getCompressor());
			maintenance.setControl(unitCourse.getControl());
			maintenance.setSoftwareVersion(unitCourse.getSoftwareVersion());
			maintenance.setIsCa(unitCourse.getIsCa());
			maintenance.setSubstrateCode(unitCourse.getSubstrateCode());
			maintenance.setIsTemperature(unitCourse.getIsTemperature());
			maintenance.setIsHumidity(unitCourse.getIsHumidity());
			maintenance.setIsVentilate(unitCourse.getIsVentilation());
			// 添加系统信息
			maintenance.setIsDel(PlatformConstants.ISDEL_NO.toString());
			maintenance.setCreateUser(getCurrentUserId());
			maintenance.setCreateTime(new Date());
			maintenance.setTestingTime(new Date());
			maintenance.setTestingState(TestingStateEnum.UNTEST.getCode());
			maintenance.setTestingUser(getCurrentUserId());
			// 添加进保修主表
			maintenanceMapper.insertSelective(maintenance);
		}
		return true;
	}

	/**
	 * web进场保修批量提交
	 * 
	 * @param input
	 * @return
	 */
	@Override
	@Transactional
	public void submitMaintenance(MaintenanceIdsInput input) {
		if (input != null && input.getIds() != null && input.getIds().length > 0) {
			for (String id : input.getIds()) {
				MaintenanceWithBLOBs maintenance = maintenanceMapper.selectByPrimaryKey(id);
				if (maintenance != null) {
					maintenance.setTestingEndTime(new Date());
					maintenance.setTestingState(TestingStateEnum.AUDITED.getCode());
					maintenance.setUpdateTime(new Date());
					maintenance.setUpdateUser(getCurrentUserId());
					maintenanceMapper.updateByPrimaryKeyWithBLOBs(maintenance);
				}
			}
		}
	}

	/**
	 * 匹配批量保修提醒
	 * 
	 * @author zhangkai
	 */
	public List<MaintenanceBatchOutput> matchBatchMaintenance(String containerNo, String unitCode) {
		if (containerNo == null) {
			containerNo = "";
		}
		if (unitCode == null) {
			unitCode = "";
		}
		// 根据箱号检索批量保修提醒主表中适用的保修提醒
		// 查询出所有保修提醒
		MaintenanceBatchExample maintenanceBatchExample = new MaintenanceBatchExample();
		List<MaintenanceBatch> mbList = maintenanceBatchMapper.selectByExample(maintenanceBatchExample);
		List<MaintenanceBatchOutput> mbCodeList = new ArrayList<MaintenanceBatchOutput>();
		String containerNoPrefix = "";
		Integer containerNoNum = null;
		if (containerNo != "") {
			// 截取箱号字符串
			containerNoPrefix = containerNo.substring(0, 4);
			containerNoNum = Integer.valueOf(containerNo.substring(4));
		}
		if (containerNo == "" && unitCode == "") {
			return mbCodeList;
		}
		// 循环遍历匹配的保修提醒
		for (MaintenanceBatch mb : mbList) {
			String containerStartNoPrefix = null;
			Integer containerStartNoNum = null;
			Integer containerEndNoNum = null;
			String unitStartNo = "";
			String unitEndNo = "";
			if (NoTypeEnum.CONTAINERNO.getCode().equals(mb.getNoType())) {
				containerStartNoPrefix = mb.getStartNo().substring(0, 4);
				containerStartNoNum = Integer.valueOf(mb.getStartNo().substring(4));
				containerEndNoNum = Integer.valueOf(mb.getEndNo().substring(4));
			} else if (NoTypeEnum.UNITNO.getCode().equals(mb.getNoType())) {
				unitStartNo = mb.getStartNo() == null ? "" : mb.getStartNo();
				unitEndNo = mb.getEndNo() == null ? "" : mb.getEndNo();
			}
			// 箱号匹配或机组序列号匹配
			if ((containerNoPrefix.equals(containerStartNoPrefix) && containerNoNum >= containerStartNoNum
					&& containerNoNum <= containerEndNoNum)
					|| (unitCode != "" && unitCode.compareTo(unitStartNo) >= 0 && unitCode.compareTo(unitEndNo) <= 0)) {
				MaintenanceBatchOutput output = new MaintenanceBatchOutput();
				output.setCode(mb.getCode());
				output.setDescriptionLang(mb.getCode());
				output.setEndNo(mb.getEndNo());
				output.setNoTypeLang(mb.getNoType());
				output.setProdMaintenanceBatchId(mb.getProdMaintenanceBatchId());
				output.setStartNo(mb.getStartNo());
				mbCodeList.add(output);
			}
		}
		return mbCodeList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO web端保修详情
	 * @param prodMaintenanceId
	 * @return Integer @throws 
	 */
	@Override
	public MaintenanceInfoOutput maintenanceDetail(String prodMaintenanceId) {
		MaintenanceWithBLOBs item = maintenanceMapper.selectByPrimaryKey(prodMaintenanceId);
		MaintenanceInfoOutput output = new MaintenanceInfoOutput();
		if (item != null) {
			BeanUtils.copyProperties(item, output);
			output.setTestingTime(DateUtil.date2String(item.getTestingTime()));
			output.setFaultTime(DateUtil.date2String(item.getFaultTime()));
			output.setTestingUser(StringUtil.valueOf(item.getTestingUser()));
			output.setTestingStateNameLang(item.getTestingState());
			output.setUseReplyState(item.getValuationState());
			output.setUseReplyStateNameLang(item.getValuationState());
			output.setReferralStateKey(item.getReferralState());
			output.setReferralStateLang(item.getReferralState());
			// 匹配批量保修
			List<MaintenanceBatchOutput> mbCodeList = matchBatchMaintenance(output.getContainerNo(),
					output.getUnitCode());
			for (MaintenanceBatchOutput maintenanceBatchOutput : mbCodeList) {
				MaintenanceBatchDetailExample example = new MaintenanceBatchDetailExample();
				example.createCriteria()
						.andProdMaintenanceBatchIdEqualTo(maintenanceBatchOutput.getProdMaintenanceBatchId());
				List<MaintenanceBatchDetail> maintenanceBatchDetails = maintenanceBatchDetailMapper
						.selectByExample(example);
				List<MaintenanceBatchDetailOutput> details = maintenanceBatchDetails.stream().map(detail -> {
					MaintenanceBatchDetailOutput mbdOutput = new MaintenanceBatchDetailOutput();
					BeanUtils.copyProperties(detail, mbdOutput);
					mbdOutput.setQuantity(StringUtil.doubleToEffectString(detail.getQuantity()));
					return mbdOutput;
				}).collect(Collectors.toList());
				maintenanceBatchOutput.setDetailList(details);
			}
			output.setMbList(mbCodeList);
		}
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO
	 * @param inputs 获取某种状态的进场数据 @throws 
	 */
	@Override
	public List<String> selectCourseByTestingState(String[] prodCourseIdList, String[] testingStateList)
			throws Exception {
		if (testingStateList == null || prodCourseIdList == null) {
			return new ArrayList<String>();
		}
		MaintenanceExample example = new MaintenanceExample();
		example.createCriteria().andProdMaintenanceIdIn(Arrays.asList(prodCourseIdList))
				.andTestingStateIn(Arrays.asList(testingStateList));
		List<Maintenance> courses = maintenanceMapper.selectByExample(example);
		return courses.stream().map(a -> a.getProdMaintenanceId()).collect(Collectors.toList());
	}

	/**
	 * app端添加保修基本信息
	 * 
	 * @param maintenanceInput
	 * @return
	 * @author zhangkai
	 */
	@Override
	@Transactional
	public String add(MaintenanceInput maintenanceInput) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		MaintenanceWithBLOBs maintenance = new MaintenanceWithBLOBs();
		if (StringUtils.isNotBlank(maintenanceInput.getProdMaintenanceId())) {
			maintenance = maintenanceMapper.selectByPrimaryKey(maintenanceInput.getProdMaintenanceId());
			if(maintenance == null) {
				maintenance = new MaintenanceWithBLOBs();
			}
		}
		maintenance.setContainerNo(maintenanceInput.getContainerNo());
		maintenance.setSize(maintenanceInput.getSize());
		maintenance.setContainerType(maintenanceInput.getContainerType());
		maintenance.setContainerUser(maintenanceInput.getContainerUser());
		maintenance.setCourseType(maintenanceInput.getCourseType());
		if(StringUtils.isNotBlank(maintenanceInput.getYard())) {			
			maintenance.setYard(maintenanceInput.getYard());
		}else {
			maintenance.setYard(getCurrentYardKey());
		}
		maintenance.setUnitCompany(maintenanceInput.getUnitCompany());
		maintenance.setUnitType(maintenanceInput.getUnitType());
		maintenance.setStartDate(maintenanceInput.getStartDate());
		maintenance.setUnitCode(maintenanceInput.getUnitCode());
		maintenance.setMaintenanceNumber(maintenanceInput.getMaintenanceNumber());
		maintenance.setCompressor(maintenanceInput.getCompressor());
		maintenance.setControl(maintenanceInput.getControl());
		maintenance.setSoftwareVersion(maintenanceInput.getSoftwareVersion());
		maintenance.setSubstrateCode(maintenanceInput.getSubstrateCode());
		maintenance.setModemNumber(maintenanceInput.getModemNumber());
		maintenance.setIsSurrender(maintenanceInput.getIsSurrender());
		maintenance.setIsTemperature(maintenanceInput.getIsTemperature());
		maintenance.setIsHumidity(maintenanceInput.getIsHumidity());
		maintenance.setIsVentilate(maintenanceInput.getIsVentilate());
		maintenance.setIsCa(maintenanceInput.getIsCa());
		maintenance.setDept(maintenanceInput.getDept());
		maintenance.setMaintenanceType(maintenanceInput.getMaintenanceType());
		maintenance.setMaintenanceSite(maintenanceInput.getMaintenanceSite());
		maintenance.setFaultType(maintenanceInput.getFaultType());
		maintenance.setFaultDesc(maintenanceInput.getFaultDesc());
		maintenance.setFaultDispose(maintenanceInput.getFaultDispose());
		if(maintenanceInput.getTestingUser() == null) {
			maintenance.setTestingUser(getCurrentUserId());
		}else {
			maintenance.setTestingUser(maintenanceInput.getTestingUser());
		}
		maintenance.setFaultRemarks(maintenanceInput.getFaultRemarks());
		maintenance.setIsMaintenance(maintenanceInput.getIsMaintenance());
		if (StringUtils.isNotBlank(maintenanceInput.getTestingTime())) {
			try {
				maintenance.setTestingTime(sdf.parse(maintenanceInput.getTestingTime()));
			} catch (ParseException e) {
				maintenance.setTestingTime(new Date());
			}
		} else {
			maintenance.setTestingTime(new Date());
		}
		if (StringUtils.isNotBlank(maintenanceInput.getFaultTime())) {
			try {
				maintenance.setFaultTime(sdf.parse(maintenanceInput.getFaultTime()));
			} catch (ParseException e) {
				maintenance.setFaultTime(new Date());
			}
		} else {
			maintenance.setFaultTime(new Date());
		}
		
		if (StringUtils.isNotBlank(maintenance.getProdMaintenanceId())) {
			maintenance.setUpdateTime(new Date());
			maintenance.setUpdateUser(getCurrentUserId());
			if (maintenance.getTestingState() == null
					|| TestingStateEnum.UNTEST.getCode().equals(maintenance.getTestingState())
					|| TestingStateEnum.REJECTED.getCode().equals(maintenance.getTestingState())) {
				maintenance.setTestingState(TestingStateEnum.TESTING.getCode());
			}
			maintenanceMapper.updateByPrimaryKeyWithBLOBs(maintenance);
		} else {
			maintenance.setProdMaintenanceId(ruleService.generateMaintenanceId(maintenanceInput.getContainerNo()));
			maintenance.setIsDel(PlatformConstants.ISDEL_NO.toString());
			maintenance.setCreateTime(new Date());
			maintenance.setCreateUser(getCurrentUserId());
			maintenance.setTestingState(TestingStateEnum.TESTING.getCode());
			maintenanceMapper.insert(maintenance);
		}
		return maintenance.getProdMaintenanceId();
	}

	/**
	 * app端根据箱号获取进场时间
	 * 
	 * @param containerNo
	 * @return
	 * @author zhangkai
	 */
	@Override
	public MaintenanceEntryDateOutput entryDate(String containerNo) {
		// 根据箱号，获取最新一条该箱进场记录
		CourseExample example = new CourseExample();
		example.setOrderByClause("course_time DESC");
		Criteria criteria = example.createCriteria();
		criteria.andContainerNoEqualTo(containerNo);
		List<Course> list = courseMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			throw new RuntimeException("NoEntryRecord");
		}
		Course course = list.get(0);
		// 返回进场时间
		MaintenanceEntryDateOutput output = new MaintenanceEntryDateOutput();
		output.setEntryDate(DateUtil.date2String(course.getCourseTime()));
		output.setProdCourseId(course.getProdCourseId());
		return output;
	}

	/**
	 * app端添加进保修列表
	 * 
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Override
	@Transactional
	public Boolean addMaintenance(MaintenanceAddInput input) {
		// 根据进场id获取进场检验主表记录
		CourseExample example = new CourseExample();
		Criteria criteria = example.createCriteria();
		criteria.andProdCourseIdEqualTo(input.getProdCourseId());
		List<Course> list = courseMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			throw new RuntimeException("NoEntryRecord");
		}
		Course course = list.get(0);
		// 匹配与此进场记录同id的机组主表记录
		UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(course.getProdCourseId());
		if (unitCourse == null) {
			throw new RuntimeException("NoUnitRecordWithThisContainerNo");
		}
		// 将进场记录信息拉取至机组保修主表
		MaintenanceWithBLOBs maintenance = new MaintenanceWithBLOBs();
		maintenance.setProdMaintenanceId(ruleService.generateMaintenanceId(course.getContainerNo()));
		maintenance.setCourse(course.getProdCourseId());
		maintenance.setOperateType(OperateTypeEnum.ENTRY.getCode());
		maintenance.setContainerNo(course.getContainerNo());
		maintenance.setContainerType(course.getContainerType());
		maintenance.setContainerUser(course.getContainerUser());
		maintenance.setSize(course.getSize());
		maintenance.setContainerTare(course.getContainerTare());
		maintenance.setContainerLoad(course.getContainerLoad());
		maintenance.setContainerVolume(course.getContainerVolume());
		maintenance.setGrossWeight(course.getGrossWeight());
		maintenance.setIsSurrender(course.getIsSurrender());
		maintenance.setYard(course.getYard());
		maintenance.setCourseType(course.getCourseType());
		maintenance.setUnitType(course.getUnitType());
		// 将机组主表记录信息拉取至机组保修主表
		maintenance.setUnitType(unitCourse.getUnitType());
		maintenance.setUnitCompany(unitCourse.getUnitCompany());
		maintenance.setUnitCode(unitCourse.getUnitCode());
		maintenance.setStartDate(unitCourse.getStartDate());
		maintenance.setCompressor(unitCourse.getCompressor());
		maintenance.setControl(unitCourse.getControl());
		maintenance.setSoftwareVersion(unitCourse.getSoftwareVersion());
		maintenance.setIsCa(unitCourse.getIsCa());
		maintenance.setSubstrateCode(unitCourse.getSubstrateCode());
		maintenance.setIsTemperature(unitCourse.getIsTemperature());
		maintenance.setIsHumidity(unitCourse.getIsHumidity());
		maintenance.setIsVentilate(unitCourse.getIsVentilation());
		// 添加系统信息
		maintenance.setIsDel(PlatformConstants.ISDEL_NO.toString());
		maintenance.setCreateUser(getCurrentUserId());
		maintenance.setCreateTime(new Date());
		maintenance.setTestingTime(new Date());
		maintenance.setTestingState(TestingStateEnum.UNTEST.getCode());
		maintenance.setTestingUser(getCurrentUserId());
		// 添加进保修主表
		int res = maintenanceMapper.insertSelective(maintenance);
		if (res != 1) {
			throw new RuntimeException("MaintenanceAddFailed");
		}
		return true;
	}

	/**
	 * app端保修检验列表
	 * 
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 * @author zhangkai
	 */
	@Override
	@Transactional
	public PagedList<MaintenanceCheckOutput> appList(String containerNo, String guaranteeCategory, Integer index,
			Integer size) {
		MaintenanceExample example = new MaintenanceExample();
		example.setOrderByClause("create_time DESC");
		com.sanlly.production.entity.MaintenanceExample.Criteria criteria = example.createCriteria();
		com.sanlly.production.entity.MaintenanceExample.Criteria orCriteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO.toString()).andYardEqualTo(getCurrentYardKey())
				.andReferralStateNotEqualTo(ReferralStateEnum.COMPLETED.getCode());
		orCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO.toString()).andYardEqualTo(getCurrentYardKey())
				.andReferralStateIsNull();
		if (containerNo != null && containerNo != "") {
			criteria.andContainerNoLike("%" + containerNo + "%");
			orCriteria.andContainerNoLike("%" + containerNo + "%");
		}
		if (guaranteeCategory != null && guaranteeCategory != "") {
			criteria.andOperateTypeEqualTo(guaranteeCategory);
			orCriteria.andOperateTypeEqualTo(guaranteeCategory);
		}
		example.or(orCriteria);

		// 分页
		Integer totalItemCount = (int) maintenanceMapper.countByExample(example);
		PagedList<MaintenanceCheckOutput> pagedList = new PagedList<MaintenanceCheckOutput>(index, size,
				totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<MaintenanceWithBLOBs> list = maintenanceMapper.selectByExampleWithBLOBs(example);
		if (list == null || list.size() == 0) {
			return pagedList;
		}
		List<MaintenanceCheckOutput> outputList = new ArrayList<MaintenanceCheckOutput>();
		for (MaintenanceWithBLOBs item : list) {
			MaintenanceCheckOutput output = new MaintenanceCheckOutput();
			BeanUtils.copyProperties(item, output);
			output.setFaultDesc(item.getFaultDesc());
			output.setIsMaintenanceLang(item.getIsMaintenance());
			output.setMaintenanceTypeLang(item.getMaintenanceType());
			output.setContainerUserLang(item.getContainerUser());
			output.setUnitTypeLang(item.getUnitType());
			output.setUnitCompanyLang(item.getUnitCompany());
			output.setContainerTypeLang(item.getContainerType());
			output.setSizeLang(item.getSize());
			output.setContainerUserKey(item.getContainerUser());
			output.setUnitTypeKey(item.getUnitType());
			output.setUnitCompanyKey(item.getUnitCompany());
			output.setSizeKey(item.getSize());
			output.setMaintenanceSiteKey(item.getMaintenanceSite());
			output.setMaintenanceSiteLang(item.getMaintenanceSite());
			output.setCourseTypeKey(item.getCourseType());
			output.setCourseTypeLang(item.getCourseType());
			output.setContainerTypekey(item.getContainerType());
			output.setOperateType(item.getOperateType());
			output.setTestingTime(DateUtil.date2String(item.getTestingTime()));
			// 匹配批量保修
			List<MaintenanceBatchOutput> mbCodeList = matchBatchMaintenance(output.getContainerNo(),
					output.getUnitCode());
			output.setMbCodeList(mbCodeList.stream().map(MaintenanceBatchOutput::getCode).collect(Collectors.toList()));
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * app端模糊查询箱号
	 * 
	 * @param containerNo
	 * @return
	 */
	public List<ContainerNumsOutput> containerNums(String containerNo) {
		List<ContainerNumsOutput> outputList = new ArrayList<ContainerNumsOutput>();
		CourseExample example = new CourseExample();
		CourseExample.Criteria criteria = example.createCriteria();
		criteria.andYardEqualTo(getCurrentYardKey());
		criteria.andContainerNoLike("%" + containerNo + "%");
		criteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
		List<Course> list = courseMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return outputList;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Course item : list) {
			ContainerNumsOutput output = new ContainerNumsOutput();
			output.setProdCourseId(item.getProdCourseId());
			output.setContianerNo(item.getContainerNo());
			output.setEntryDate(sdf.format(item.getCourseTime()));
			output.setContainerUser(item.getContainerUser());
			outputList.add(output);
		}
		return outputList;
	}

	/**
	 * app端取消保修
	 * 
	 * @param prodMaintenanceId
	 */
	public void cancelMaintenance(String prodMaintenanceId) {
		MaintenanceWithBLOBs maintenanceWithBLOBs = new MaintenanceWithBLOBs();
		maintenanceWithBLOBs.setProdMaintenanceId(prodMaintenanceId);
		maintenanceWithBLOBs.setIsDel(PlatformConstants.ISDEL_YES.toString());
		maintenanceWithBLOBs.setUpdateUser(getCurrentUserId());
		maintenanceWithBLOBs.setUpdateTime(new Date());
		maintenanceMapper.updateByPrimaryKeySelective(maintenanceWithBLOBs);
	}

}
