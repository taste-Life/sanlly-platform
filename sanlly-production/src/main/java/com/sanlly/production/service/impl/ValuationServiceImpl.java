package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.CompanyUsecontMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UnitUrgencyMapper;
import com.sanlly.production.dao.UnrecycleCostMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.dao.ValuationExtMapper;
import com.sanlly.production.entity.CompanyUsecont;
import com.sanlly.production.entity.CompanyUsecontExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.UnitUrgency;
import com.sanlly.production.entity.UnitUrgencyExample;
import com.sanlly.production.entity.UnrecycleCost;
import com.sanlly.production.entity.UnrecycleCostExample;
import com.sanlly.production.entity.User;
import com.sanlly.production.entity.Valuation;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.ErrorMessageEnum;
import com.sanlly.production.enums.RateCurrencyEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReferralTypeEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.ThirdPayTypeEnum;
import com.sanlly.production.models.input.referral.ReferralOperateInput;
import com.sanlly.production.models.input.valuation.PicExportInput;
import com.sanlly.production.models.input.valuation.ValuationBatchReplyInput;
import com.sanlly.production.models.input.valuation.ValuationBatchReplyItemInput;
import com.sanlly.production.models.input.valuation.ValuationCodeDetailInput;
import com.sanlly.production.models.input.valuation.ValuationCodeInput;
import com.sanlly.production.models.input.valuation.ValuationReferralDetailInput;
import com.sanlly.production.models.input.valuation.ValuationReferralInput;
import com.sanlly.production.models.output.estimate.ThirdPayTypeOutput;
import com.sanlly.production.models.output.valuation.PicExportDetailOutput;
import com.sanlly.production.models.output.valuation.PicExportOutput;
import com.sanlly.production.models.output.valuation.UnitUrgencyOutput;
import com.sanlly.production.models.output.valuation.ValuationBatchReplyItemOutput;
import com.sanlly.production.models.output.valuation.ValuationBatchReplyOutput;
import com.sanlly.production.models.output.valuation.ValuationListOutput;
import com.sanlly.production.service.EstimateDetailService;
import com.sanlly.production.service.FinanceService;
import com.sanlly.production.service.ReferralService;
import com.sanlly.production.service.ValuationService;
import com.sanlly.production.service.XxService;

/**
 * 估价实现类
 * @author zhangkai
 *
 */
@Service
public class ValuationServiceImpl extends BaseServiceImpl implements ValuationService {
	
	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ReferralService referralService;
	@Autowired
	private CompanyUsecontMapper companyUsecontMapper;
	@Autowired
	private UnitUrgencyMapper unitUrgencyMapper;
	@Autowired
	private ValuationExtMapper valuationExtMapper;
	@Autowired
	private UnitCourseMapper unitCourseMapper;
	@Autowired
	private EvaluationEntryMapper evaluationEntryMapper;
	@Autowired
	private FinanceService financeClient;
	@Autowired
	private EstimateDetailService estimateDetailService;
	@Autowired
	private UnrecycleCostMapper unrecycleCostMapper;
	@Autowired
	private MaintenanceMapper maintenanceDao;
	@Autowired
	private XxService ptiService;
	
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
	public PagedList<ValuationListOutput> list(
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
			) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria courseCriteria = courseExample.createCriteria();
		if (beginCourseTime != null && beginCourseTime != "" && endCourseTime != null && endCourseTime != "") {
			try {
				courseCriteria.andCourseTimeBetween(sdf.parse(beginCourseTime), sdf.parse(endCourseTime));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (beginValuationTime != null && beginValuationTime != "" && endValuationTime != null && endValuationTime != "") {
			try {
				courseCriteria.andValuationTimeBetween(sdf.parse(beginValuationTime), sdf.parse(endValuationTime));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (beginReplyTime != null && beginReplyTime != "" && endReplyTime != null && endReplyTime != "") {
			try {
				courseCriteria.andUseReplyTimeBetween(sdf.parse(beginReplyTime), sdf.parse(endReplyTime));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (ladingNo != null && ladingNo != "") {
			courseCriteria.andBillOfLadingNoLike("%"+ladingNo.trim()+"%");
		}
		if (containerNo != null && containerNo != "") {
			courseCriteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		if (containerUser != null && containerUser != "") {
			courseCriteria.andContainerUserEqualTo(containerUser.trim());
		}
		if (courseType != null && courseType != "") {
			courseCriteria.andCourseTypeEqualTo(courseType.trim());
		}
		courseCriteria.andUseReplyStateIn(Arrays.asList(valuationStates));
		courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode());
		courseCriteria.andContainerConditionEqualTo(ContainerStateEnum.BAD.getCode());
		Integer totalItemCount = (int)courseMapper.countByExample(courseExample);
		PagedList<ValuationListOutput> pagedList = new PagedList<ValuationListOutput>(pageNum, pageSize, totalItemCount);
		courseExample.setOrderByClause("audit_time desc");
		courseExample.setLimitStart(pagedList.getLimitStart());
		courseExample.setLimitEnd(pagedList.getLimitEnd());
		List<Course> list = courseMapper.selectByExample(courseExample);
		if (list == null || list.size() == 0) {
			return pagedList;
		}
		List<ValuationListOutput> outputList = new ArrayList<ValuationListOutput>();
		for (Course item : list) {
			ValuationListOutput output = new ValuationListOutput();
			output.setProdCourseId(item.getProdCourseId());
			output.setValuationNo(item.getValuationNo());
			output.setContainerNo(item.getContainerNo());
			output.setSizeLang(item.getSize());
			output.setContainerTypeLang(item.getContainerType());
			output.setContainerUserLang(item.getContainerUser());
			output.setCourseTypeLang(item.getCourseType());
			output.setYardLang(item.getYard());
			output.setCourseTime(DateUtil.date2String(item.getCourseTime()));
			output.setLadingNo(item.getBillOfLadingNo());
			output.setTradeLang(item.getDomesticForeignTrade());
			output.setContainerGradeLang(item.getContainerGrade());
			output.setAuditTime(DateUtil.date2String(item.getAuditTime()));
			output.setContainerCategoryLang(item.getContainerCategory());
			output.setContainerCategoryKey(item.getContainerCategory());
			output.setUserValuationStateLang(item.getUseReplyState());
			if (item.getValuationUser() == null) {
				output.setValuationUser("");
			} else {
				User user = userMapper.selectByPrimaryKey(item.getValuationUser());
				if (user == null) {
					output.setValuationUser("");
				} else {
					output.setValuationUser(user.getUserName());
				}
			}
			output.setReferralStateLang(item.getReferralState());
			output.setReferralStateKey(item.getReferralState());
			if (item.getFinishUser() == null) {
				output.setFinishUser("");
			} else {
				User user = userMapper.selectByPrimaryKey(item.getFinishUser());
				if (user == null) {
					output.setFinishUser("");
				} else {
					output.setFinishUser(user.getUserName());
				}
			}
			output.setFinishTime(DateUtil.date2String(item.getFinishTime()));
			output.setValuationRemarks(item.getValuationRemarks());
			output.setValuationMoney(item.getValuationMoney()==null?"":item.getValuationMoney().setScale(2).toPlainString());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
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
			) throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("beginCourseTime", beginCourseTime);
		map.put("endCourseTime", endCourseTime);
		map.put("beginValuationTime", beginValuationTime);
		map.put("endValuationTime", endValuationTime);
		map.put("beginReplyTime", beginReplyTime);
		map.put("endReplyTime", endReplyTime);
		map.put("ladingNo", ladingNo);
		map.put("containerNo", containerNo);
		map.put("containerUser", containerUser);
		map.put("courseType", courseType);
		map.put("valuationStates", Arrays.asList(valuationStates));
		Integer totalItemCount = valuationExtMapper.selectValuationCodeCount(map);
		PagedList<ValuationListOutput> pagedList = new PagedList<ValuationListOutput>(pageNum, pageSize, totalItemCount);
		map.put("startLimit", pagedList.getLimitStart());
		map.put("endLimit", pagedList.getLimitEnd());
		List<Valuation> list = valuationExtMapper.selectValuationCodeList(map);
		if (list == null || list.size() == 0) {
			return pagedList;
		}
		List<ValuationListOutput> outputList = new ArrayList<ValuationListOutput>();
		for (Valuation item : list) {
			ValuationListOutput output = new ValuationListOutput();
			output.setProdCourseId(item.getProdCourseId());
			output.setValuationNo(item.getValuationNo());
			output.setContainerNo(item.getContainerNo());
			output.setSizeLang(item.getSize());
			output.setContainerTypeLang(item.getContainerType());
			output.setContainerUserLang(item.getContainerUser());
			output.setCourseTypeLang(item.getCourseType());
			output.setYardLang(item.getYard());
			output.setCourseTime(DateUtil.date2String(item.getCourseTime()));
			output.setLadingNo(item.getLadingNo());
			output.setTradeLang(item.getTrade());
			output.setContainerGradeLang(item.getContainerGrade());
			output.setAuditTime(DateUtil.date2String(item.getAuditTime()));
			output.setContainerCategoryLang(item.getContainerCategory());
			output.setContainerCategoryKey(item.getContainerCategory());
			output.setUserValuationStateLang(item.getUseValuationState());
			if (item.getValuationUser() == null) {
				output.setValuationUser("");
			} else {
				User user = userMapper.selectByPrimaryKey(item.getValuationUser());
				if (user == null) {
					output.setValuationUser("");
				} else {
					output.setValuationUser(user.getUserName());
				}
			}
			output.setReferralStateLang(item.getReferralState());
			output.setReferralStateKey(item.getReferralState());
			if (item.getFinishUser() == null) {
				output.setFinishUser("");
			} else {
				User user = userMapper.selectByPrimaryKey(item.getFinishUser());
				if (user == null) {
					output.setFinishUser("");
				} else {
					output.setFinishUser(user.getUserName());
				}
			}
			output.setFinishTime(DateUtil.date2String(item.getFinishTime()));
			output.setValuationRemarks(item.getValuationRemarks());
			output.setValuationMoney(item.getValuationMoney()==null?"":item.getValuationMoney().setScale(2).toPlainString());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 更新估价状态-干箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@Transactional
	public boolean updateUseReplyState(String[] courseIds, String valuationState) {
		if (courseIds == null || courseIds.length == 0) {
			return false;
		}
		for (String courseId : courseIds) {
			CourseWithBLOBs course = new CourseWithBLOBs();
			course.setProdCourseId(courseId);
			course.setUseReplyState(valuationState);
			course.setUpdateUser(getCurrentUserId());
			course.setUpdateTime(new Date());
			if (ReplyStateEnum.UNREPLY.getCode().equals(valuationState)) {
				// 转待批复的记录估价人、估价时间
				course.setValuationUser(getCurrentUserId());
				course.setValuationTime(new Date());
			}
			courseMapper.updateByPrimaryKeySelective(course);
		}
		return true;
	}
	
	/**
	 * 更新估价状态-冷箱
	 * @param courseIds
	 * @param valuationState
	 * @author zhangkai
	 */
	@Transactional
	public void updateCodeUseReplyState(ValuationCodeInput input, String valuationState) {
		for (ValuationCodeDetailInput item : input.getDetails()) {
			if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(item.getContainerCategory())) {
				// 箱体
				CourseWithBLOBs course = new CourseWithBLOBs();
				course.setProdCourseId(item.getProdCourseId());
				course.setUseReplyState(valuationState);
				course.setUpdateUser(getCurrentUserId());
				course.setUpdateTime(new Date());
				if (ReplyStateEnum.UNREPLY.getCode().equals(valuationState)) {
					// 转待批复的记录估价人、估价时间
					course.setValuationUser(getCurrentUserId());
					course.setValuationTime(new Date());
				}
				courseMapper.updateByPrimaryKeySelective(course);
			} else {
				// 冷箱机组
				UnitCourseWithBLOBs unitCourse = new UnitCourseWithBLOBs();
				unitCourse.setProdCourseId(item.getProdCourseId());
				unitCourse.setUseReplyState(valuationState);
				unitCourse.setUpdateUser(getCurrentUserId());
				unitCourse.setUpdateTime(new Date());
				if (ReplyStateEnum.UNREPLY.getCode().equals(valuationState)) {
					// 转待批复的记录估价人、估价时间
					unitCourse.setValuationUser(getCurrentUserId());
					unitCourse.setValuationTime(new Date());
				}
				unitCourseMapper.updateByPrimaryKeySelective(unitCourse);
				
			}
			
			ptiService.createPtiInfo(item.getProdCourseId());
		}
	}
	
	/**
	 * 派工
	 * @param input
	 * @author zhangkai
	 */
	@Transactional
	public void referral(ValuationReferralInput input) {
		for (ValuationReferralDetailInput item : input.getDetails()) {
			// 调维修接口
			ReferralOperateInput referralOperateInput = new ReferralOperateInput();
			referralOperateInput.setCourseId(item.getProdCourseId());
			referralOperateInput.setContainerCategory(item.getContainerCategory());
			referralOperateInput.setReferralType(ReferralTypeEnum.VALUATION.getCode());
			referralService.referralOperate(referralOperateInput);
		}
	}
	
	/**
	 * 批量批复匹配-干箱
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	public ValuationBatchReplyOutput match(ValuationBatchReplyInput input) {
		ValuationBatchReplyOutput output = new ValuationBatchReplyOutput();
		List<ValuationBatchReplyItemOutput> okList = new ArrayList<ValuationBatchReplyItemOutput>();
		List<ValuationBatchReplyItemOutput> errorList = new ArrayList<ValuationBatchReplyItemOutput>();
		// 查询出所有待批复状态的箱子（干箱）
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria courseCriteria = courseExample.createCriteria();
		courseCriteria.andUseReplyStateEqualTo(ReplyStateEnum.UNREPLY.getCode());
		courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode());
		List<Course> unreplyList = courseMapper.selectByExample(courseExample);
		// 如果没有，导入的数据全部为errorList，错误提示为“未匹配到数据”
		if (unreplyList == null || unreplyList.size() == 0) {
			for (ValuationBatchReplyItemInput item : input.getDetails()) {
				ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
				itemOutput.setContainerNo(item.getContainerNo());
				itemOutput.setReplyCost(item.getReplyCost());
				itemOutput.setValuationMoneyRmb("");
				itemOutput.setErrorMessageLang(ErrorMessageEnum.UNMATCH.getCode());
				errorList.add(itemOutput);
			}
			output.setOkList(okList);
			output.setErrorList(errorList);
			return output;
		}
		
		
		// 开始匹配
		boolean matched = false;
		for (ValuationBatchReplyItemInput item : input.getDetails()) {
			for (Course course : unreplyList) {
				if (item.getContainerNo().equals(course.getContainerNo())) {
					// 进场表有此箱号，查询是否有配置批复差额
					matched = true;
					CompanyUsecontExample companyUsecontExample = new CompanyUsecontExample();
					CompanyUsecontExample.Criteria companyUsecontCriteria = companyUsecontExample.createCriteria();
					companyUsecontCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					companyUsecontCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
					companyUsecontCriteria.andCompanyEqualTo(getCurrentCompanyKey());
					companyUsecontCriteria.andContainerUserEqualTo(course.getContainerUser());
					List<CompanyUsecont> companyUsecontList = companyUsecontMapper.selectByExample(companyUsecontExample);
					if (companyUsecontList == null || companyUsecontList.size() == 0 || companyUsecontList.get(0).getDifferenceMoney() == null) {
						// 说明未配置
						ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
						itemOutput.setContainerNo(item.getContainerNo());
						itemOutput.setReplyCost(item.getReplyCost());
						itemOutput.setValuationMoneyRmb(course.getValuationMoney().toString());
						itemOutput.setErrorMessageLang(ErrorMessageEnum.NOIMBALANCE.getCode());
						errorList.add(itemOutput);
					} else {
						BigDecimal replyCost = new BigDecimal(item.getReplyCost());
						if ((replyCost.subtract(course.getValuationMoney()).abs().compareTo(companyUsecontList.get(0).getDifferenceMoney()) < 1)) {
							// 小于差值
							ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
							itemOutput.setProdCourseId(course.getProdCourseId());
							itemOutput.setContainerNo(item.getContainerNo());
							itemOutput.setReplyCost(item.getReplyCost());
							itemOutput.setValuationMoneyRmb(course.getValuationMoney().toString());
							okList.add(itemOutput);
						} else {
							// 大于差值
							ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
							itemOutput.setContainerNo(item.getContainerNo());
							itemOutput.setReplyCost(item.getReplyCost());
							itemOutput.setValuationMoneyRmb(course.getValuationMoney().toString());
							itemOutput.setErrorMessageLang(ErrorMessageEnum.OUTIMBALANCE.getCode());
							errorList.add(itemOutput);
						}	
					}
				}
			}
			// 没匹配上,说明进场表没有此箱号
			if (!matched) {
				ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
				itemOutput.setContainerNo(item.getContainerNo());
				itemOutput.setReplyCost(item.getReplyCost());
				itemOutput.setValuationMoneyRmb("");
				itemOutput.setErrorMessageLang(ErrorMessageEnum.UNMATCH.getCode());
				errorList.add(itemOutput);
			}
		}
		output.setOkList(okList);
		output.setErrorList(errorList);
		return output;
	}
	
	/**
	 * 批量批复匹配-冷箱
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	public ValuationBatchReplyOutput codeMatch(ValuationBatchReplyInput input) {
		ValuationBatchReplyOutput output = new ValuationBatchReplyOutput();
		List<ValuationBatchReplyItemOutput> okList = new ArrayList<ValuationBatchReplyItemOutput>();
		List<ValuationBatchReplyItemOutput> errorList = new ArrayList<ValuationBatchReplyItemOutput>();
		// 查询出所有待批复状态的箱子（箱体）
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria courseCriteria = courseExample.createCriteria();
		courseCriteria.andUseReplyStateEqualTo(ReplyStateEnum.UNREPLY.getCode());
		courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
		List<Course> unreplyList1 = courseMapper.selectByExample(courseExample);
		// 查询出所有待批复状态的机组
		UnitCourseExample unitCourseExample = new UnitCourseExample();
		UnitCourseExample.Criteria unitCourseCriteria = unitCourseExample.createCriteria();
		unitCourseCriteria.andUseReplyStateEqualTo(ReplyStateEnum.UNREPLY.getCode());
		List<UnitCourse> unreplyList2 = unitCourseMapper.selectByExample(unitCourseExample);
		// 开始匹配
		boolean matched = false;
		for (ValuationBatchReplyItemInput item : input.getDetails()) {
			BigDecimal containerCost = new BigDecimal(0);
			BigDecimal unitCost = new BigDecimal(0);
			BigDecimal totalCost = new BigDecimal(0);
			Course theCourse = null;
			for (Course course : unreplyList1) {
				if (item.getContainerNo().equals(course.getContainerNo())) {
					// 进场表有此箱号
					matched = true;
					if (course.getValuationMoney() != null) {
						containerCost = containerCost.add(course.getValuationMoney());
					}
					theCourse = course;
				}
			}
			for (UnitCourse unitCourse : unreplyList2) {
				if (item.getContainerNo().equals(unitCourse.getContainerNo())) {
					// 机组进场表有此箱号
					matched = true;
					if (unitCourse.getValuationMoney() != null) {
						unitCost = unitCost.add(unitCourse.getValuationMoney());
					}
					theCourse = courseMapper.selectByPrimaryKey(unitCourse.getProdCourseId());
				}
			}
			totalCost = containerCost.add(unitCost);
			if (matched) {
				// 有数据，查询是否有配置批复差额
				CompanyUsecontExample companyUsecontExample = new CompanyUsecontExample();
				CompanyUsecontExample.Criteria companyUsecontCriteria = companyUsecontExample.createCriteria();
				companyUsecontCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				companyUsecontCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
				companyUsecontCriteria.andCompanyEqualTo(getCurrentCompanyKey());
				companyUsecontCriteria.andContainerUserEqualTo(theCourse.getContainerUser());
				List<CompanyUsecont> companyUsecontList = companyUsecontMapper.selectByExample(companyUsecontExample);
				if (companyUsecontList == null || companyUsecontList.size() == 0 || companyUsecontList.get(0).getDifferenceMoney() == null) {
					// 说明未配置
					ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
					itemOutput.setContainerNo(item.getContainerNo());
					itemOutput.setReplyCost(item.getReplyCost());
					itemOutput.setContainerCost(containerCost.toString());
					itemOutput.setUnitCost(unitCost.toString());
					itemOutput.setValuationMoneyRmb(totalCost.toString());
					itemOutput.setErrorMessageLang(ErrorMessageEnum.NOIMBALANCE.getCode());
					errorList.add(itemOutput);
				} else {
					BigDecimal replyCost = new BigDecimal(item.getReplyCost());
					if ((replyCost.subtract(totalCost).abs().compareTo(companyUsecontList.get(0).getDifferenceMoney()) < 1)) {
						// 小于差值
						ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
						itemOutput.setProdCourseId(theCourse.getProdCourseId());
						itemOutput.setContainerNo(item.getContainerNo());
						itemOutput.setReplyCost(item.getReplyCost());
						itemOutput.setContainerCost(containerCost.toString());
						itemOutput.setUnitCost(unitCost.toString());
						itemOutput.setValuationMoneyRmb(totalCost.toString());
						okList.add(itemOutput);
					} else {
						// 大于差值
						ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
						itemOutput.setContainerNo(item.getContainerNo());
						itemOutput.setReplyCost(item.getReplyCost());
						itemOutput.setContainerCost(containerCost.toString());
						itemOutput.setUnitCost(unitCost.toString());
						itemOutput.setValuationMoneyRmb(totalCost.toString());
						itemOutput.setErrorMessageLang(ErrorMessageEnum.OUTIMBALANCE.getCode());
						errorList.add(itemOutput);
					}	
				}
			} else {
				// 没匹配上,说明进场表没有此箱号
				ValuationBatchReplyItemOutput itemOutput = new ValuationBatchReplyItemOutput();
				itemOutput.setContainerNo(item.getContainerNo());
				itemOutput.setReplyCost(item.getReplyCost());
				itemOutput.setContainerCost("");
				itemOutput.setUnitCost("");
				itemOutput.setValuationMoneyRmb("");
				itemOutput.setErrorMessageLang(ErrorMessageEnum.UNMATCH.getCode());
				errorList.add(itemOutput);
			}	
		} 
		output.setOkList(okList);
		output.setErrorList(errorList);
		return output;
	}
		
	
	/**
	 * 批量批复-干箱
	 * @param prodCourseIds
	 * @author zhangkai
	 */
	@Transactional
	public void batchReply(String[] prodCourseIds) {
		for (String prodCourseId : prodCourseIds) {
			// 1、更新估价状态为已批复
			CourseWithBLOBs course = new CourseWithBLOBs();
			course.setProdCourseId(prodCourseId);
			course.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
			course.setUpdateUser(getCurrentUserId());
			course.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKeySelective(course);
			Course record = courseMapper.selectByPrimaryKey(prodCourseId);
			// 2、调建运接口
			// 获取币种，计算用箱人批复费用
			BigDecimal replyMoneyRmb = new BigDecimal(0);
			if (record != null && RateCurrencyEnum.USD.getCode().equals(record.getValuationCurrency())) {
				// 美元
				BigDecimal rate = new BigDecimal(financeClient.getNewRate().getData());
				replyMoneyRmb = record.getValuationMoney().multiply(rate);
				CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
				courseWithBLOBs.setProdCourseId(prodCourseId);
				courseWithBLOBs.setUseReplyMoneyRmb(replyMoneyRmb);
				courseWithBLOBs.setUseReplyMoneyUsd(record.getValuationMoney());
				courseWithBLOBs.setUpdateUser(getCurrentUserId());
				courseWithBLOBs.setUpdateTime(new Date());
				courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
			} else if (record != null && RateCurrencyEnum.CNY.getCode().equals(record.getValuationCurrency())) {
				// 人民币
				replyMoneyRmb = record.getValuationMoney();
				CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
				courseWithBLOBs.setProdCourseId(prodCourseId);
				courseWithBLOBs.setUseReplyMoneyRmb(replyMoneyRmb);
				courseWithBLOBs.setUpdateUser(getCurrentUserId());
				courseWithBLOBs.setUpdateTime(new Date());
				courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
			}
			Course record2 = courseMapper.selectByPrimaryKey(prodCourseId);
			// 单箱批复
			List<PoolRepairInput> billList = estimateDetailService.estimateEntryList(prodCourseId, ContainerCategoryEnum.CONTAINER_01.getCode()).getDataList().stream().map(a -> {
				PoolRepairInput item = new PoolRepairInput();
				item.setProdCourseId(prodCourseId);
				item.setContainerNo(record.getContainerNo());
				item.setContainerCategory(record.getContainerCategory());
				item.setYard(record.getYard());
				item.setReplyTime(new Date());
				item.setContainerUser(record.getContainerUser());
				item.setRemarks(a.getRemarks());
				item.setReplyTaxTotalCostRmb(record2.getUseReplyMoneyRmb());
				item.setPayer(a.getPayingParty());
				return item;
			}).collect(Collectors.toList());
			financeClient.oneReply(billList);
			// 3、未派工的调维修接口派工
			if (record != null && ReferralStateEnum.UNREFERRAL.getCode().equals(record.getReferralState())) {
				ReferralOperateInput input = new ReferralOperateInput();
				input.setCourseId(prodCourseId);
				input.setContainerCategory(ContainerCategoryEnum.CONTAINER_01.getCode());
				input.setReferralType(ReferralTypeEnum.REPLY.getCode());
				referralService.referralOperate(input);
			}
		}
	}
	
	/**
	 * 批量批复-冷箱
	 * @param prodCourseIds
	 * @author zhangkai
	 */
	@Transactional
	public void codeBatchReply(String[] prodCourseIds) {
		for (String prodCourseId : prodCourseIds) {
			CourseExample courseExample = new CourseExample();
			CourseExample.Criteria courseCriteria = courseExample.createCriteria();
			courseCriteria.andProdCourseIdEqualTo(prodCourseId);
			courseCriteria.andUseReplyStateEqualTo(ReplyStateEnum.UNREPLY.getCode());
			courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
			List<Course> list1 = courseMapper.selectByExample(courseExample);
			if (list1 != null && list1.size() != 0) {
				// 箱体
				// 1、更新估价状态为已批复
				CourseWithBLOBs course = new CourseWithBLOBs();
				course.setProdCourseId(prodCourseId);
				course.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
				course.setUpdateUser(getCurrentUserId());
				course.setUpdateTime(new Date());
				courseMapper.updateByPrimaryKeySelective(course);
				Course record = courseMapper.selectByPrimaryKey(prodCourseId);
				// 2、调建运接口
				// 获取币种，计算用箱人批复费用
				BigDecimal replyMoneyRmb = new BigDecimal(0);
				if (record != null && RateCurrencyEnum.USD.getCode().equals(record.getValuationCurrency())) {
					// 美元
					BigDecimal rate = new BigDecimal(financeClient.getNewRate().getData());
					replyMoneyRmb = record.getValuationMoney().multiply(rate);
					CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
					courseWithBLOBs.setProdCourseId(prodCourseId);
					courseWithBLOBs.setUseReplyMoneyRmb(replyMoneyRmb);
					courseWithBLOBs.setUseReplyMoneyUsd(record.getValuationMoney());
					courseWithBLOBs.setUpdateUser(getCurrentUserId());
					courseWithBLOBs.setUpdateTime(new Date());
					courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
				} else if (record != null && RateCurrencyEnum.CNY.getCode().equals(record.getValuationCurrency())) {
					// 人民币
					replyMoneyRmb = record.getValuationMoney();
					CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
					courseWithBLOBs.setProdCourseId(prodCourseId);
					courseWithBLOBs.setUseReplyMoneyRmb(replyMoneyRmb);
					courseWithBLOBs.setUpdateUser(getCurrentUserId());
					courseWithBLOBs.setUpdateTime(new Date());
					courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
				}
				Course record2 = courseMapper.selectByPrimaryKey(prodCourseId);
				// 单箱批复
				List<PoolRepairInput> billList = estimateDetailService.estimateEntryList(prodCourseId, ContainerCategoryEnum.CONTAINER_02.getCode()).getDataList().stream().map(a -> {
					PoolRepairInput item = new PoolRepairInput();
					item.setProdCourseId(prodCourseId);
					item.setContainerNo(record.getContainerNo());
					item.setContainerCategory(record.getContainerCategory());
					item.setYard(record.getYard());
					item.setReplyTime(new Date());
					item.setContainerUser(record.getContainerUser());
					item.setRemarks(a.getRemarks());
					item.setReplyTaxTotalCostRmb(record2.getUseReplyMoneyRmb());
					item.setPayer(a.getPayingParty());
					return item;
				}).collect(Collectors.toList());
				financeClient.oneReply(billList);
				// 3、未派工的调维修接口派工
				if (ReferralStateEnum.UNREFERRAL.getCode().equals(record.getReferralState())) {
					ReferralOperateInput referralOperateInput = new ReferralOperateInput();
					referralOperateInput.setCourseId(prodCourseId);
					referralOperateInput.setContainerCategory(ContainerCategoryEnum.CONTAINER_02.getCode());
					referralOperateInput.setReferralType(ReferralTypeEnum.REPLY.getCode());
					referralService.referralOperate(referralOperateInput);
				}
			}
			UnitCourseExample unitCourseExample = new UnitCourseExample();
			UnitCourseExample.Criteria unitCourseCriteria = unitCourseExample.createCriteria();
			unitCourseCriteria.andProdCourseIdEqualTo(prodCourseId);
			unitCourseCriteria.andUseReplyStateEqualTo(ReplyStateEnum.UNREPLY.getCode());
			List<Course> list2 = courseMapper.selectByExample(courseExample);
			if (list2 != null && list2.size() != 0) {
				// 机组
				UnitCourseWithBLOBs unitCourse = new UnitCourseWithBLOBs();
				unitCourse.setProdCourseId(prodCourseId);
				unitCourse.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
				unitCourse.setUpdateUser(getCurrentUserId());
				unitCourse.setUpdateTime(new Date());
				unitCourseMapper.updateByPrimaryKeySelective(unitCourse);
				UnitCourse record = unitCourseMapper.selectByPrimaryKey(prodCourseId);
				// 2、调建运接口
				// 获取币种，计算用箱人批复费用
				BigDecimal replyMoneyRmb = new BigDecimal(0);
				if (record != null && RateCurrencyEnum.USD.getCode().equals(record.getValuationCurrency())) {
					// 美元
					BigDecimal rate = new BigDecimal(financeClient.getNewRate().getData());
					replyMoneyRmb = record.getValuationMoney().multiply(rate);
					UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
					unitCourseWithBLOBs.setProdCourseId(prodCourseId);
					unitCourseWithBLOBs.setUseReplyMoneyRmb(replyMoneyRmb);
					unitCourseWithBLOBs.setUseReplyMoneyUsd(record.getValuationMoney());
					unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
					unitCourseWithBLOBs.setUpdateTime(new Date());
					unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
				} else if (record != null && RateCurrencyEnum.CNY.getCode().equals(record.getValuationCurrency())) {
					// 人民币
					replyMoneyRmb = record.getValuationMoney();
					UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
					unitCourseWithBLOBs.setProdCourseId(prodCourseId);
					unitCourseWithBLOBs.setUseReplyMoneyRmb(replyMoneyRmb);
					unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
					unitCourseWithBLOBs.setUpdateTime(new Date());
					unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
				}
				UnitCourse record2 = unitCourseMapper.selectByPrimaryKey(prodCourseId);
				Course record3 = courseMapper.selectByPrimaryKey(prodCourseId);
				// 单箱批复
				List<PoolRepairInput> billList = estimateDetailService.estimateEntryList(prodCourseId, ContainerCategoryEnum.CONTAINER_03.getCode()).getDataList().stream().map(a -> {
					PoolRepairInput item = new PoolRepairInput();
					item.setProdCourseId(prodCourseId);
					item.setContainerNo(record.getContainerNo());
					item.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
					item.setYard(record3.getYard());
					item.setReplyTime(new Date());
					item.setContainerUser(record3.getContainerUser());
					item.setRemarks(a.getRemarks());
					item.setReplyTaxTotalCostRmb(record2.getUseReplyMoneyRmb());
					item.setPayer(a.getPayingParty());
					return item;
				}).collect(Collectors.toList());
				financeClient.oneReply(billList);
				// 3、未派工的调维修接口派工
				if (ReferralStateEnum.UNREFERRAL.getCode().equals(record.getReferralState())) {
					ReferralOperateInput referralOperateInput = new ReferralOperateInput();
					referralOperateInput.setCourseId(prodCourseId);
					referralOperateInput.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
					referralOperateInput.setReferralType(ReferralTypeEnum.REPLY.getCode());
					referralService.referralOperate(referralOperateInput);
				}
 			}
			Course course = courseMapper.selectByPrimaryKey(prodCourseId);
			UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(prodCourseId);
			if (course != null && unitCourse != null) {
				ptiService.createPtiInfo(course, unitCourse);
			}
		}
	}
	
	/**
	 * 紧急程度列表
	 * @return
	 * @author zhangkai
	 */
	public List<UnitUrgencyOutput> urgencyList() {
		UnitUrgencyExample example = new UnitUrgencyExample();
		UnitUrgencyExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitUrgency> list = unitUrgencyMapper.selectByExample(example);
		List<UnitUrgencyOutput> outputList = new ArrayList<UnitUrgencyOutput>();
		if (list == null || list.size() == 0) {
			return outputList;
		}
		for (UnitUrgency item : list) {
			UnitUrgencyOutput output = new UnitUrgencyOutput();
			output.setKey(item.getKey());
			output.setUrgencyNameLang(item.getKey());
			outputList.add(output);
		}
		return outputList;
	}
	
	/**
	 * 设置紧急程度
	 * @param prodCourseIds
	 * @param urgency
	 * @author zhangkai
	 */
	@Transactional
	public void setUrgency(String[] prodCourseIds, String urgency) {
		for (String prodCourseId : prodCourseIds) {
			CourseWithBLOBs course = new CourseWithBLOBs();
			course.setProdCourseId(prodCourseId);
			course.setUrgency(urgency);
			course.setUpdateUser(getCurrentUserId());
			course.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKeySelective(course);
		}
	}
	
	/**
	 * 照片导出
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	public PicExportOutput picExport(PicExportInput input) {
		PicExportOutput output = new PicExportOutput();
		if (input.getBeforeOrAfter().equals("1")) {
			// 导修前照片
			if (input.getCourseOrUnit().equals("1")) {
				// 箱体、干箱
				EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
				EvaluationEntryExample.Criteria evaluationEntryCriteria = evaluationEntryExample.createCriteria();
				evaluationEntryCriteria.andCourseEqualTo(input.getProdCourseId());
				List<String> sList = new ArrayList<String>();
				sList.add(ContainerCategoryEnum.CONTAINER_01.getCode());
				sList.add(ContainerCategoryEnum.CONTAINER_02.getCode());
				evaluationEntryCriteria.andContainerCategoryIn(sList);
				List<EvaluationEntry> entries = evaluationEntryMapper.selectByExampleWithBLOBs(evaluationEntryExample);
				List<PicExportDetailOutput> detailOutputs = new ArrayList<PicExportDetailOutput>();
				for (EvaluationEntry item : entries) {
					PicExportDetailOutput detailOutput = new PicExportDetailOutput();
					detailOutput.setDetailNo(item.getSerialNumber());
					detailOutput.setBeforePhoto(item.getPhoto());
					detailOutputs.add(detailOutput);
				}
				output.setContainerNo(input.getContainerNo());
				output.setDetails(detailOutputs);
				output.setAfterPhoto("");
				return output;
			} else {
				// 机组
				EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
				EvaluationEntryExample.Criteria evaluationEntryCriteria = evaluationEntryExample.createCriteria();
				evaluationEntryCriteria.andCourseEqualTo(input.getProdCourseId());
				evaluationEntryCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
				List<EvaluationEntry> entries = evaluationEntryMapper.selectByExampleWithBLOBs(evaluationEntryExample);
				List<PicExportDetailOutput> detailOutputs = new ArrayList<PicExportDetailOutput>();
				for (EvaluationEntry item : entries) {
					PicExportDetailOutput detailOutput = new PicExportDetailOutput();
					detailOutput.setDetailNo(item.getSerialNumber());
					detailOutput.setBeforePhoto(item.getPhoto());
					detailOutputs.add(detailOutput);
				}
				output.setContainerNo(input.getContainerNo());
				output.setDetails(detailOutputs);
				output.setAfterPhoto("");
				return output;
			}
		} else if (input.getBeforeOrAfter().equals("2")) {
			// 导修后照片
			if (input.getCourseOrUnit().equals("1")) {
				// 干箱、箱体
				CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
				output.setContainerNo(input.getContainerNo());
				output.setDetails(new ArrayList<PicExportDetailOutput>());
				output.setAfterPhoto(course.getAfterPhoto());
				return output;
			} else {
				// 机组
				UnitCourseWithBLOBs unitCourse = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
				output.setContainerNo(input.getContainerNo());
				output.setDetails(new ArrayList<PicExportDetailOutput>());
				output.setAfterPhoto(unitCourse.getAfterPhoto());
				return output;
			}
		} else {
			//导修前修后
			if (input.getCourseOrUnit().equals("1")) {
				// 干箱、箱体
				EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
				EvaluationEntryExample.Criteria evaluationEntryCriteria = evaluationEntryExample.createCriteria();
				evaluationEntryCriteria.andCourseEqualTo(input.getProdCourseId());
				List<String> sList = new ArrayList<String>();
				sList.add(ContainerCategoryEnum.CONTAINER_01.getCode());
				sList.add(ContainerCategoryEnum.CONTAINER_02.getCode());
				evaluationEntryCriteria.andContainerCategoryIn(sList);
				List<EvaluationEntry> entries = evaluationEntryMapper.selectByExampleWithBLOBs(evaluationEntryExample);
				List<PicExportDetailOutput> detailOutputs = new ArrayList<PicExportDetailOutput>();
				for (EvaluationEntry item : entries) {
					PicExportDetailOutput detailOutput = new PicExportDetailOutput();
					detailOutput.setDetailNo(item.getSerialNumber());
					detailOutput.setBeforePhoto(item.getPhoto());
					detailOutputs.add(detailOutput);
				}
				output.setContainerNo(input.getContainerNo());
				output.setDetails(detailOutputs);
				CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
				output.setAfterPhoto(course.getAfterPhoto());
				return output;
			} else {
				// 机组
				EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
				EvaluationEntryExample.Criteria evaluationEntryCriteria = evaluationEntryExample.createCriteria();
				evaluationEntryCriteria.andCourseEqualTo(input.getProdCourseId());
				evaluationEntryCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
				List<EvaluationEntry> entries = evaluationEntryMapper.selectByExampleWithBLOBs(evaluationEntryExample);
				List<PicExportDetailOutput> detailOutputs = new ArrayList<PicExportDetailOutput>();
				for (EvaluationEntry item : entries) {
					PicExportDetailOutput detailOutput = new PicExportDetailOutput();
					detailOutput.setDetailNo(item.getSerialNumber());
					detailOutput.setBeforePhoto(item.getPhoto());
					detailOutputs.add(detailOutput);
				}
				output.setContainerNo(input.getContainerNo());
				output.setDetails(detailOutputs);
				UnitCourseWithBLOBs unitCourse = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
				output.setAfterPhoto(unitCourse.getAfterPhoto());
				return output;
			}
		}
	}
	
	/**
	 * 批复不修
	 * @param input
	 * @author zhangkai
	 */
	@Transactional
	public void replyNoReferral(ValuationCodeInput input) {
		for (ValuationCodeDetailInput itemInput : input.getDetails()) {
			if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(itemInput.getContainerCategory()) || ContainerCategoryEnum.CONTAINER_02.getCode().equals(itemInput.getContainerCategory())) {
				// 箱体或机组
				// 更新估价状态为批复不修
				CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
				courseWithBLOBs.setProdCourseId(itemInput.getProdCourseId());
				courseWithBLOBs.setUseReplyState(ReplyStateEnum.REJECT.getCode());
				courseWithBLOBs.setUpdateUser(getCurrentUserId());
				courseWithBLOBs.setUpdateTime(new Date());
				courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
				// 判断派工状态为已派工或已完工的，调维修接口，已经出库的，记录出库产生的成本
				CourseWithBLOBs res = courseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
				if (res != null && (ReferralStateEnum.REFERRALED.getCode().equals(res.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(res.getReferralState()))) {
					// 调维修接口
					BigDecimal cost = referralService.getStockMoney(itemInput.getProdCourseId(), itemInput.getContainerCategory());
					// 记录成本
					if (BigDecimal.ZERO.compareTo(cost) != 0) {
						CourseWithBLOBs courseWithBLOBs2 = courseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
						UnrecycleCost unrecycleCost = new UnrecycleCost();
						unrecycleCost.setCourse(courseWithBLOBs2.getProdCourseId());
						unrecycleCost.setContainerNo(courseWithBLOBs2.getContainerNo());
						unrecycleCost.setCourseTime(courseWithBLOBs2.getCourseTime());
						unrecycleCost.setSize(courseWithBLOBs2.getSize());
						unrecycleCost.setContainerType(courseWithBLOBs2.getContainerType());
						unrecycleCost.setContainerCategory(itemInput.getContainerCategory());
						unrecycleCost.setYard(courseWithBLOBs2.getYard());
						unrecycleCost.setValuationState(ReplyStateEnum.REJECT.getCode());
						unrecycleCost.setStockoutCost(cost);
						unrecycleCost.setCreateUser(getCurrentUserId());
						unrecycleCost.setCreateTime(new Date());
						unrecycleCostMapper.insertSelective(unrecycleCost);
					}
				}
			} else {
				// 机组
				// 更新估价状态为批复不修
				UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
				unitCourseWithBLOBs.setProdCourseId(itemInput.getProdCourseId());
				unitCourseWithBLOBs.setUseReplyState(ReplyStateEnum.REJECT.getCode());
				unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
				unitCourseWithBLOBs.setUpdateTime(new Date());
				unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
				// 判断派工状态为已派工或已完工的，调维修接口，已经出库的，记录出库产生的成本
				UnitCourseWithBLOBs res = unitCourseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
				if (res != null && (ReferralStateEnum.REFERRALED.getCode().equals(res.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(res.getReferralState()))) {
					// 调维修接口
					BigDecimal cost = referralService.getStockMoney(itemInput.getProdCourseId(), itemInput.getContainerCategory());
					// 记录成本
					if (BigDecimal.ZERO.compareTo(cost) != 0) {
						CourseWithBLOBs courseWithBLOBs2 = courseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
						UnrecycleCost unrecycleCost = new UnrecycleCost();
						unrecycleCost.setCourse(courseWithBLOBs2.getProdCourseId());
						unrecycleCost.setContainerNo(courseWithBLOBs2.getContainerNo());
						unrecycleCost.setCourseTime(courseWithBLOBs2.getCourseTime());
						unrecycleCost.setSize(courseWithBLOBs2.getSize());
						unrecycleCost.setContainerType(courseWithBLOBs2.getContainerType());
						unrecycleCost.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
						unrecycleCost.setYard(courseWithBLOBs2.getYard());
						unrecycleCost.setValuationState(ReplyStateEnum.REJECT.getCode());
						unrecycleCost.setStockoutCost(cost);
						unrecycleCost.setCreateUser(getCurrentUserId());
						unrecycleCost.setCreateTime(new Date());
						unrecycleCostMapper.insertSelective(unrecycleCost);
					}
				}
			}
			ptiService.createPtiInfo(itemInput.getProdCourseId());
		}
	}
	
	/**
	 * 不修转好
	 * @param input
	 * @author zhangkai
	 */
	@Transactional
	public void replyToGood(ValuationCodeInput input) {
		for (ValuationCodeDetailInput itemInput : input.getDetails()) {
			if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(itemInput.getContainerCategory()) || ContainerCategoryEnum.CONTAINER_02.getCode().equals(itemInput.getContainerCategory())) {
				// 箱体或机组
				// 更新估价状态为批复不修
				CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
				courseWithBLOBs.setProdCourseId(itemInput.getProdCourseId());
				courseWithBLOBs.setUseReplyState(ReplyStateEnum.TURNGOOD.getCode());
				courseWithBLOBs.setUpdateUser(getCurrentUserId());
				courseWithBLOBs.setUpdateTime(new Date());
				courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
				// 判断派工状态为已派工或已完工的，调维修接口，已经出库的，记录出库产生的成本
				CourseWithBLOBs res = courseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
				if (res != null && (ReferralStateEnum.REFERRALED.getCode().equals(res.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(res.getReferralState()))) {
					// 调维修接口
					BigDecimal cost = referralService.getStockMoney(itemInput.getProdCourseId(), itemInput.getContainerCategory());
					// 记录成本
					if (BigDecimal.ZERO.compareTo(cost) != 0) {
						CourseWithBLOBs courseWithBLOBs2 = courseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
						UnrecycleCost unrecycleCost = new UnrecycleCost();
						unrecycleCost.setCourse(courseWithBLOBs2.getProdCourseId());
						unrecycleCost.setContainerNo(courseWithBLOBs2.getContainerNo());
						unrecycleCost.setCourseTime(courseWithBLOBs2.getCourseTime());
						unrecycleCost.setSize(courseWithBLOBs2.getSize());
						unrecycleCost.setContainerType(courseWithBLOBs2.getContainerType());
						unrecycleCost.setContainerCategory(itemInput.getContainerCategory());
						unrecycleCost.setYard(courseWithBLOBs2.getYard());
						unrecycleCost.setValuationState(ReplyStateEnum.TURNGOOD.getCode());
						unrecycleCost.setStockoutCost(cost);
						unrecycleCost.setCreateUser(getCurrentUserId());
						unrecycleCost.setCreateTime(new Date());
						unrecycleCostMapper.insertSelective(unrecycleCost);
					}
				}
				ptiService.createPtiInfo(res, null);
			} else {
				// 机组
				// 更新估价状态为批复不修
				UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
				unitCourseWithBLOBs.setProdCourseId(itemInput.getProdCourseId());
				unitCourseWithBLOBs.setUseReplyState(ReplyStateEnum.TURNGOOD.getCode());
				unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
				unitCourseWithBLOBs.setUpdateTime(new Date());
				unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
				// 判断派工状态为已派工或已完工的，调维修接口，已经出库的，记录出库产生的成本
				UnitCourseWithBLOBs res = unitCourseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
				if (res != null && (ReferralStateEnum.REFERRALED.getCode().equals(res.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(res.getReferralState()))) {
					// 调维修接口
					BigDecimal cost = referralService.getStockMoney(itemInput.getProdCourseId(), itemInput.getContainerCategory());
					// 记录成本
					if (BigDecimal.ZERO.compareTo(cost) != 0) {
						CourseWithBLOBs courseWithBLOBs2 = courseMapper.selectByPrimaryKey(itemInput.getProdCourseId());
						UnrecycleCost unrecycleCost = new UnrecycleCost();
						unrecycleCost.setCourse(courseWithBLOBs2.getProdCourseId());
						unrecycleCost.setContainerNo(courseWithBLOBs2.getContainerNo());
						unrecycleCost.setCourseTime(courseWithBLOBs2.getCourseTime());
						unrecycleCost.setSize(courseWithBLOBs2.getSize());
						unrecycleCost.setContainerType(courseWithBLOBs2.getContainerType());
						unrecycleCost.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
						unrecycleCost.setYard(courseWithBLOBs2.getYard());
						unrecycleCost.setValuationState(ReplyStateEnum.TURNGOOD.getCode());
						unrecycleCost.setStockoutCost(cost);
						unrecycleCost.setCreateUser(getCurrentUserId());
						unrecycleCost.setCreateTime(new Date());
						unrecycleCostMapper.insertSelective(unrecycleCost);
					}
				}
				ptiService.createPtiInfo(null,res);
			}
		}
	}
	
	/**
	 * 取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 * @author zhangkai
	 */
	@Transactional
	public void cancalNoReferral(String prodCourseId, String containerCategory) {
		// 删除无法回收费用表
		UnrecycleCostExample unrecycleCostExample = new UnrecycleCostExample();
		UnrecycleCostExample.Criteria unrecycleCostCriteria = unrecycleCostExample.createCriteria();
		unrecycleCostCriteria.andCourseEqualTo(prodCourseId);
		unrecycleCostCriteria.andContainerCategoryEqualTo(containerCategory);
		unrecycleCostCriteria.andValuationStateEqualTo(ReplyStateEnum.REJECT.getCode());
		unrecycleCostMapper.deleteByExample(unrecycleCostExample);
		// 更新状态为待估价
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			// 机组
			UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
			unitCourseWithBLOBs.setProdCourseId(prodCourseId);
			unitCourseWithBLOBs.setUseReplyState(ReplyStateEnum.UNDO.getCode());
			unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
			unitCourseWithBLOBs.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
		} else {
			// 干箱或箱体
			CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
			courseWithBLOBs.setProdCourseId(prodCourseId);
			courseWithBLOBs.setUseReplyState(ReplyStateEnum.UNDO.getCode());
			courseWithBLOBs.setUpdateUser(getCurrentUserId());
			courseWithBLOBs.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
		}
		ptiService.createPtiInfo(prodCourseId);
	}
	
	/**
	 * 取消不修转好
	 * @param prodCourseId
	 * @param containerCategory
	 * @author zhangkai
	 */
	@Transactional
	public void cancalToGood(String prodCourseId, String containerCategory) {
		// 删除无法回收费用表
		UnrecycleCostExample unrecycleCostExample = new UnrecycleCostExample();
		UnrecycleCostExample.Criteria unrecycleCostCriteria = unrecycleCostExample.createCriteria();
		unrecycleCostCriteria.andCourseEqualTo(prodCourseId);
		unrecycleCostCriteria.andContainerCategoryEqualTo(containerCategory);
		unrecycleCostCriteria.andValuationStateEqualTo(ReplyStateEnum.TURNGOOD.getCode());
		unrecycleCostMapper.deleteByExample(unrecycleCostExample);
		// 更新状态为待估价
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			// 机组
			UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
			unitCourseWithBLOBs.setProdCourseId(prodCourseId);
			unitCourseWithBLOBs.setUseReplyState(ReplyStateEnum.UNDO.getCode());
			unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
			unitCourseWithBLOBs.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
			ptiService.createPtiInfo(null,unitCourseMapper.selectByPrimaryKey(prodCourseId));
		} else {
			// 干箱或箱体
			CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
			courseWithBLOBs.setProdCourseId(prodCourseId);
			courseWithBLOBs.setUseReplyState(ReplyStateEnum.UNDO.getCode());
			courseWithBLOBs.setUpdateUser(getCurrentUserId());
			courseWithBLOBs.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
			ptiService.createPtiInfo(courseMapper.selectByPrimaryKey(prodCourseId),null);
		}
		ptiService.createPtiInfo(prodCourseId);
	}
	
	/**
	 * 取消批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @param yard
	 * @param containerUser
	 * @return
	 * @author zhangkai
	 */
	@Transactional
	public boolean cancelReply(String prodCourseId, String containerCategory) {
		// 调建运接口删除批复费用，返回true可以取消批复，返回false不可取消批复
		PoolRepairInput input = new PoolRepairInput();
		input.setProdCourseId(prodCourseId);
		input.setContainerCategory(containerCategory);
		if (!financeClient.cancelReply(input)) {
			return false;
		}
		Course course = courseMapper.selectByPrimaryKey(prodCourseId);
		// 将收费方式为现结的箱子，估价单明细的是否第三方收费置为否
		ThirdPayTypeOutput thirdPayTypeOutput = estimateDetailService.getThirdPayType(course.getYard(), course.getContainerUser());
		if (thirdPayTypeOutput != null && ThirdPayTypeEnum.SPOT.getCode().equals(thirdPayTypeOutput.getThirdPayType())) {
			EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
			EvaluationEntryExample.Criteria evaluationEntryCriteria = evaluationEntryExample.createCriteria();
			evaluationEntryCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			evaluationEntryCriteria.andCourseEqualTo(prodCourseId);
			evaluationEntryCriteria.andContainerCategoryEqualTo(containerCategory);
			EvaluationEntry evaluationEntry = new EvaluationEntry();
			evaluationEntry.setIsCharge(CommonEnum.NO.getCode());
			evaluationEntry.setUpdateUser(getCurrentUserId());
			evaluationEntry.setUpdateTime(new Date());
			evaluationEntryMapper.updateByExampleSelective(evaluationEntry, evaluationEntryExample);
		}
		// 更改状态为待批复
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			// 机组
			UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
			unitCourseWithBLOBs.setProdCourseId(prodCourseId);
			unitCourseWithBLOBs.setUseReplyState(ReplyStateEnum.UNREPLY.getCode());
			unitCourseWithBLOBs.setUpdateUser(getCurrentUserId());
			unitCourseWithBLOBs.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(unitCourseWithBLOBs);
		} else {
			// 干箱或箱体
			CourseWithBLOBs courseWithBLOBs = new CourseWithBLOBs();
			courseWithBLOBs.setProdCourseId(prodCourseId);
			courseWithBLOBs.setUseReplyState(ReplyStateEnum.UNREPLY.getCode());
			courseWithBLOBs.setUpdateUser(getCurrentUserId());
			courseWithBLOBs.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKeySelective(courseWithBLOBs);
		}
		ptiService.createPtiInfo(prodCourseId);
		return true;
		
	}

	/**
	 * 保修-取消保修批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@Override
	@Transactional
	public boolean cancelMaintenanceReply(String prodCourseId, String containerCategory) {
		// 调建运接口删除批复费用，返回true可以取消批复，返回false不可取消批复
		PoolRepairInput input = new PoolRepairInput();
		input.setProdCourseId(prodCourseId);
		input.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
		if (!financeClient.cancelReply(input)) {
			return false;
		}
		MaintenanceWithBLOBs record=maintenanceDao.selectByPrimaryKey(prodCourseId);
		record.setRespondUser(null);
		record.setRespondTime(null);
		record.setRespondCost(null);
		record.setRespondCostRmb(null);
		record.setRespondRemarks(null);
		// 更改状态为待批复
		record.setValuationState(ReplyStateEnum.UNREPLY.getCode());
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		maintenanceDao.updateByPrimaryKeyWithBLOBs(record);
		return true;
		
	}

	/**
	 * 保修-批复不修
	 * @param input
	 */
	@Override
	@Transactional
	public void replyMaintenanceNoReferral(ValuationCodeInput input) {
		for (ValuationCodeDetailInput itemInput : input.getDetails()) {
			itemInput.setContainerCategory(ContainerCategoryEnum.CONTAINER_04.getCode());
			// 箱体或机组
			// 更新估价状态为批复不修
			MaintenanceWithBLOBs record=maintenanceDao.selectByPrimaryKey(itemInput.getProdCourseId());
			 
			record.setValuationState(ReplyStateEnum.REJECT.getCode());
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			maintenanceDao.updateByPrimaryKeyWithBLOBs(record);
			
			if(StringUtils.isNotEmpty(record.getCourse())) {
				// 判断派工状态为已派工或已完工的，调维修接口，已经出库的，记录出库产生的成本
				CourseWithBLOBs res = courseMapper.selectByPrimaryKey(record.getCourse());
				if (res != null && (ReferralStateEnum.REFERRALED.getCode().equals(record.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(record.getReferralState()))) {
					// 调维修接口
					BigDecimal cost = referralService.getStockMoney(itemInput.getProdCourseId(), itemInput.getContainerCategory());
					// 记录成本
					if (BigDecimal.ZERO.compareTo(cost) != 0) {
						UnrecycleCost unrecycleCost = new UnrecycleCost();
						unrecycleCost.setCourse(record.getProdMaintenanceId());
						unrecycleCost.setContainerNo(record.getContainerNo());
						unrecycleCost.setCourseTime(record.getCourseTime());
						unrecycleCost.setSize(record.getSize());
						unrecycleCost.setContainerType(record.getContainerType());
						unrecycleCost.setContainerCategory(itemInput.getContainerCategory());
						unrecycleCost.setYard(record.getYard());
						unrecycleCost.setValuationState(ReplyStateEnum.REJECT.getCode());
						unrecycleCost.setStockoutCost(cost);
						unrecycleCost.setCreateUser(getCurrentUserId());
						unrecycleCost.setCreateTime(new Date());
						unrecycleCostMapper.insertSelective(unrecycleCost);
					}
				}
			}
			
		}
	}
	
	/**
	 * 保修-取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 */
	@Override
	@Transactional
	public void cancalMaintenanceNoReferral(String prodCourseId, String containerCategory) {
		// 删除无法回收费用表
		UnrecycleCostExample unrecycleCostExample = new UnrecycleCostExample();
		UnrecycleCostExample.Criteria unrecycleCostCriteria = unrecycleCostExample.createCriteria();
		unrecycleCostCriteria.andCourseEqualTo(prodCourseId);
		unrecycleCostCriteria.andContainerCategoryEqualTo(containerCategory);
		unrecycleCostCriteria.andValuationStateEqualTo(ReplyStateEnum.REJECT.getCode());
		unrecycleCostMapper.deleteByExample(unrecycleCostExample);
		// 更新状态为待估价
		
		MaintenanceWithBLOBs record=maintenanceDao.selectByPrimaryKey(prodCourseId);
		record.setValuationState(ReplyStateEnum.UNDO.getCode());
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		maintenanceDao.updateByPrimaryKeyWithBLOBs(record);
				
	}
}
