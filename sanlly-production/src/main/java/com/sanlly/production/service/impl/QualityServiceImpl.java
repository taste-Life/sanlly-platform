package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.QualityControlTimeMapper;
import com.sanlly.production.dao.ReasonMapper;
import com.sanlly.production.dao.RectificationStandardMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.ReworkQuestionMapper;
import com.sanlly.production.dao.ThirdpartyChargeMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.QualityControlTime;
import com.sanlly.production.entity.QualityControlTimeExample;
import com.sanlly.production.entity.Reason;
import com.sanlly.production.entity.ReasonExample;
import com.sanlly.production.entity.RectificationStandard;
import com.sanlly.production.entity.RectificationStandardExample;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.entity.ReworkQuestion;
import com.sanlly.production.entity.ReworkQuestionExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.AuditTypeEnum;
import com.sanlly.production.enums.AuditUrgencyEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.PkQualityStateEnum;
import com.sanlly.production.enums.QualityStateEnum;
import com.sanlly.production.enums.QualityTypeEnum;
import com.sanlly.production.enums.RateCommonEnum;
import com.sanlly.production.enums.RateFromTypeEnum;
import com.sanlly.production.enums.RateStageEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.models.input.evaluation.AddEvaluationEntryInput;
import com.sanlly.production.models.input.evaluation.AddEvaluationInput;
import com.sanlly.production.models.input.quality.QaQualityInput;
import com.sanlly.production.models.input.quality.QualityCourseEntryInfoInput;
import com.sanlly.production.models.input.quality.QualityCourseEntryInput;
import com.sanlly.production.models.input.quality.QualityEntryListInput;
import com.sanlly.production.models.input.quality.SearchQaListInput;
import com.sanlly.production.models.input.quality.SearchSonQualityListInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.output.quality.QualityEntryInfoOutput;
import com.sanlly.production.models.output.quality.QualityInfoOutput;
import com.sanlly.production.models.output.quality.SearchQaListOutput;
import com.sanlly.production.models.output.quality.SearchSonQualityListOutput;
import com.sanlly.production.models.output.rate.GetRateMessageOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.EstimateDetailService;
import com.sanlly.production.service.FoamingService;
import com.sanlly.production.service.QualityService;
import com.sanlly.production.service.RateService;
import com.sanlly.production.service.ReferralService;

/**
 * 安全品控实现类
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月10日 下午1:31:29 
 * @version V1.0   
 */
@Service
public class QualityServiceImpl extends BaseServiceImpl implements QualityService {

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private AuthService authClient;

	@Autowired
	private UnitCourseMapper unitCourseMapper;

	@Autowired
	private EvaluationEntryMapper evaluationEntryMapper;

	@Autowired
	private YardMapper yardMapper;

	@Autowired
	private ReferralEntryMapper referralEntryMapper;

	@Autowired
	private CourseKeyRuleService courseService;

	@Autowired
	private EstimateDetailService estimateDetailService;

	@Autowired
	private ReferralService referralService;

	@Autowired
	private FoamingService foamingService;

	@Autowired
	private RateService rateService;

	@Autowired
	private ContainerUserMapper containerUserMapper;

	@Autowired
	private CourseEntryMapper courseEntryMapper;

	@Autowired
	private ReworkQuestionMapper reworkQuestionMapper;

	@Autowired
	private RectificationStandardMapper rectificationStandardMapper;

	@Autowired
	private ReasonMapper reasonMapper;

	@Autowired
	private QualityControlTimeMapper qualityControlTimeMapper;

	/**
	 * 子公司现场质检列表
	 * 
	 * @throws ParseException
	 */
	@Override
	public PagedList<SearchSonQualityListOutput> getSonQualityList(SearchSonQualityListInput input)
			throws ParseException {
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory()))
			return getUnitSonQualityList(input);
		CourseExample example = new CourseExample();
		CourseExample.Criteria criteria = example.createCriteria();
		CourseExample.Criteria criteria1 = example.createCriteria();
		// 查询条件
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 箱况
		if (StringUtils.isNotEmpty(input.getContainerCondition())) {
			criteria.andContainerConditionEqualTo(input.getContainerCondition());
			criteria1.andContainerConditionEqualTo(input.getContainerCondition());
			// 坏箱判断派工状态
			if (ContainerStateEnum.BAD.getCode().equals(input.getContainerCondition())) {
				criteria.andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode());
				criteria1.andReferralStateEqualTo(ReferralStateEnum.COMPLETED.getCode());
			}
		}
		// 箱类别
		if (StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
			criteria1.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
			criteria1.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 进场类型
		if (StringUtils.isNotEmpty(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(input.getCourseType());
			criteria1.andCourseTypeEqualTo(input.getCourseType());
		}
		// 指派班组
		if (input.getDesignateUser() != null) {
			criteria.andDesignateUserEqualTo(input.getDesignateUser());
			criteria1.andDesignateUserEqualTo(input.getDesignateUser());
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
			criteria1.andContainerUserEqualTo(input.getContainerUser());
		}
		// 维修状态
		if (StringUtils.isNotEmpty(input.getReferralState())) {
			criteria.andReferralStateEqualTo(input.getReferralState());
			criteria1.andReferralStateEqualTo(input.getReferralState());
		}
		// 质检类型
		if (StringUtils.isNotEmpty(input.getQualityType())) {
			criteria.andQualityTypeEqualTo(input.getQualityType());
			criteria1.andQualityTypeEqualTo(input.getQualityType());
			// 质检状态
			if (QualityTypeEnum.QUALITYTYPE_REPEAT.getCode().equals(input.getQualityType())) {
				criteria.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
				criteria1.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			} else {
				criteria.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				criteria1.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				if (QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode().equals(input.getQualityType())) {
					QualityControlTimeExample timeExample = new QualityControlTimeExample();
					timeExample.createCriteria().andContainerCategoryEqualTo(input.getContainerCategory())
							.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode())
							.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
					List<QualityControlTime> timeList = qualityControlTimeMapper.selectByExample(timeExample);
					if (timeList.size() > 0 && timeList.get(0).getQualityControlTime() > 0) {
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(new Date());
						calendar.set(Calendar.HOUR,
								calendar.get(Calendar.HOUR) - timeList.get(0).getQualityControlTime()); // 追加时间
						criteria.andReferralTimeGreaterThanOrEqualTo(calendar.getTime());
						criteria1.andReferralTimeGreaterThanOrEqualTo(calendar.getTime());
					}
				}
			}
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralStartDate())) {
			criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getReferralStartDate())));
			criteria1.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getReferralStartDate())));
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralEndDate())) {
			criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(input.getReferralEndDate()));
			criteria1.andReferralTimeLessThanOrEqualTo(sdf.parse(input.getReferralEndDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishStartDate())) {
			criteria.andFinishTimeGreaterThanOrEqualTo(sdf.parse(input.getFinishStartDate()));
			criteria1.andFinishTimeGreaterThanOrEqualTo(sdf.parse(input.getFinishStartDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishEndDate())) {
			criteria.andFinishAuditTimeLessThanOrEqualTo(sdf.parse(input.getFinishEndDate()));
			criteria1.andFinishAuditTimeLessThanOrEqualTo(sdf.parse(input.getFinishEndDate()));
		}
		example.or(criteria1);
		// 分页查询
		int total = (int) courseMapper.countByExample(example);
		PagedList<SearchSonQualityListOutput> pagedList = new PagedList<SearchSonQualityListOutput>(
				input.getPageIndex(), input.getPageSize(), total);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		example.setOrderByClause(" course_time desc");
		List<Course> courseList = courseMapper.selectByExample(example);

		Integer mustTime = 0;
		if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(input.getQualityType())) {
			QualityControlTimeExample mustTimeExample = new QualityControlTimeExample();
			mustTimeExample.createCriteria().andContainerCategoryEqualTo(input.getContainerCategory())
					.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES);
			List<QualityControlTime> mustTimeList = qualityControlTimeMapper.selectByExample(mustTimeExample);
			if (mustTimeList.size() > 0)
				mustTime = mustTimeList.get(0).getQualityControlTime();
		}
		// 组装数据
		List<SearchSonQualityListOutput> outList = new ArrayList<>();
		for (Course item : courseList) {
			SearchSonQualityListOutput model = new SearchSonQualityListOutput();
			model.setCourseId(item.getProdCourseId()); // 进场id
			model.setContainerCategory(item.getContainerCategory()); // 箱类别
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setCourseTypeLang(item.getCourseType()); // 进场类型
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setReferralStateLang(item.getReferralState()); // 维修状态
			model.setQualityTypeLang(item.getQualityType()); // 质检类型
			model.setQualityResult(item.getQualityResult()); // 质检结果
			model.setIsQualityLang(item.getQualityResult()); // 质检结果
			// 指派班组
			if (item.getDesignateUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setDesignateUser(user.getUserName());
					}
				}
			}
			// 格式化日期
			if (item.getReferralTime() != null) {
				model.setReferralTime(sdf.format(item.getReferralTime())); // 派工时间
			}
			if (item.getFinishTime() != null) {
				model.setFinishTime(sdf.format(item.getFinishTime())); // 完工时间
			}
			// 质检员
			if (item.getQualityUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getQualityUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setQualityUser(user.getUserName());
					}
				}
			}
			// 质检时间
			if (item.getQualityTime() != null) {
				model.setQualityTime(sdf.format(item.getQualityTime()));
			}
			model.setIsChangeBg(false); // 背景色
			// 背景色
			if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(input.getQualityType()) && mustTime > 0) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date());
				calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) - mustTime); // 追加时间
				if (QualityStateEnum.QUALITY_DEFAULT.getCode().equals(item.getQualityResult())
						&& item.getReferralTime().getTime() < calendar.getTime().getTime())
					model.setIsChangeBg(true);
			}
			outList.add(model);
		}
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * 机组质检列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchSonQualityList
	 * @throws ParseException
	 *             Output> @throws 
	 */
	private PagedList<SearchSonQualityListOutput> getUnitSonQualityList(SearchSonQualityListInput input)
			throws ParseException {
		UnitCourseExample example = new UnitCourseExample();
		UnitCourseExample.Criteria criteria = example.createCriteria();
		UnitCourseExample.Criteria criteria1 = example.createCriteria();
		// 查询条件
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 箱况
		if (StringUtils.isNotEmpty(input.getContainerCondition())) {
			if (ContainerStateEnum.GOOD.getCode().equals(input.getContainerCondition()))
				input.setContainerCondition(UnitStateEnum.GOOD.getCode());
			else if (ContainerStateEnum.BAD.getCode().equals(input.getContainerCondition())) {
				// 坏箱判断派工状态
				if (ContainerStateEnum.BAD.getCode().equals(input.getContainerCondition())) {
					criteria.andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode());
					criteria1.andReferralStateEqualTo(ReferralStateEnum.COMPLETED.getCode());
				}
				input.setContainerCondition(UnitStateEnum.BAD.getCode());
			}
			criteria.andUnitStateEqualTo(input.getContainerCondition());
			criteria1.andUnitStateEqualTo(input.getContainerCondition());
		}
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
			criteria1.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 进场类型
		if (StringUtils.isNotEmpty(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(input.getCourseType());
			criteria1.andCourseTypeEqualTo(input.getCourseType());
		}
		// 指派班组
		if (input.getDesignateUser() != null) {
			criteria.andDesignateUserEqualTo(input.getDesignateUser());
			criteria1.andDesignateUserEqualTo(input.getDesignateUser());
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
			criteria1.andContainerUserEqualTo(input.getContainerUser());
		}
		// 维修状态
		if (StringUtils.isNotEmpty(input.getReferralState())) {
			criteria.andReferralStateEqualTo(input.getReferralState());
			criteria1.andReferralStateEqualTo(input.getReferralState());
		}
		// 质检类型
		if (StringUtils.isNotEmpty(input.getQualityType())) {
			criteria.andQualityTypeEqualTo(input.getQualityType());
			criteria1.andQualityTypeEqualTo(input.getQualityType());
			// 质检状态
			if (QualityTypeEnum.QUALITYTYPE_REPEAT.getCode().equals(input.getQualityType())) {
				criteria.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
				criteria1.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			} else {
				criteria.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				criteria1.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				if (QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode().equals(input.getQualityType())) {
					QualityControlTimeExample timeExample = new QualityControlTimeExample();
					timeExample.createCriteria()
							.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
							.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode())
							.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
					List<QualityControlTime> timeList = qualityControlTimeMapper.selectByExample(timeExample);
					if (timeList.size() > 0 && timeList.get(0).getQualityControlTime() > 0) {
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(new Date());
						calendar.set(Calendar.HOUR,
								calendar.get(Calendar.HOUR) - timeList.get(0).getQualityControlTime()); // 追加时间
						criteria.andReferralTimeGreaterThanOrEqualTo(calendar.getTime());
						criteria1.andReferralTimeGreaterThanOrEqualTo(calendar.getTime());
					}
				}
			}
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralStartDate())) {
			criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getReferralStartDate())));
			criteria1.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getReferralStartDate())));
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralEndDate())) {
			criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(input.getReferralEndDate()));
			criteria1.andReferralTimeLessThanOrEqualTo(sdf.parse(input.getReferralEndDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishStartDate())) {
			criteria.andFinishTimeGreaterThanOrEqualTo(sdf.parse(input.getFinishStartDate()));
			criteria1.andFinishTimeGreaterThanOrEqualTo(sdf.parse(input.getFinishStartDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishEndDate())) {
			criteria.andFinishAuditTimeLessThanOrEqualTo(sdf.parse(input.getFinishEndDate()));
			criteria1.andFinishAuditTimeLessThanOrEqualTo(sdf.parse(input.getFinishEndDate()));
		}
		example.or(criteria1);
		// 分页查询
		int total = (int) unitCourseMapper.countByExample(example);
		PagedList<SearchSonQualityListOutput> pagedList = new PagedList<SearchSonQualityListOutput>(
				input.getPageIndex(), input.getPageSize(), total);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		example.setOrderByClause(" create_time desc");
		List<UnitCourse> courseList = unitCourseMapper.selectByExample(example);

		Integer mustTime = 0;
		if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(input.getQualityType())) {
			QualityControlTimeExample mustTimeExample = new QualityControlTimeExample();
			mustTimeExample.createCriteria().andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
					.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES);
			List<QualityControlTime> mustTimeList = qualityControlTimeMapper.selectByExample(mustTimeExample);
			if (mustTimeList.size() > 0)
				mustTime = mustTimeList.get(0).getQualityControlTime();
		}

		// 组装数据
		List<SearchSonQualityListOutput> outList = new ArrayList<>();
		for (UnitCourse item : courseList) {
			SearchSonQualityListOutput model = new SearchSonQualityListOutput();
			model.setCourseId(item.getProdCourseId()); // 进场id
			model.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode()); // 箱类别
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setCourseTypeLang(item.getCourseType()); // 进场类型
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setReferralStateLang(item.getReferralState()); // 维修状态
			model.setQualityTypeLang(item.getQualityType()); // 质检类型
			model.setIsQualityLang(item.getQualityResult()); // 质检结果
			// 指派班组
			if (item.getDesignateUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setDesignateUser(user.getUserName());
					}
				}
			}
			// 格式化日期
			if (item.getReferralTime() != null) {
				model.setReferralTime(sdf.format(item.getReferralTime())); // 派工时间
			}
			if (item.getFinishTime() != null) {
				model.setFinishTime(sdf.format(item.getFinishTime())); // 完工时间
			}
			// 质检员
			if (item.getQualityUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setQualityUser(user.getUserName());
					}
				}
			}
			// 质检时间
			if (item.getQualityTime() != null) {
				model.setQualityTime(sdf.format(item.getQualityTime()));
			}
			// 背景色
			if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(input.getQualityType()) && mustTime > 0) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date());
				calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) - mustTime); // 追加时间
				if (QualityStateEnum.QUALITY_DEFAULT.getCode().equals(item.getQualityResult())
						&& item.getReferralTime().getTime() < calendar.getTime().getTime())
					model.setIsChangeBg(true);
			}
			outList.add(model);
		}
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * 子公司现场质检合格
	 */
	@Override
	public void sonQualityYes(String courseId, String photo) {
		// 查询进场信息
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(courseId);
		// 修改进场数据
		course.setQualityResult(QualityStateEnum.QUALITY_OK.getCode());
		course.setQualityPhoto(photo);
		course.setQualityUser(getCurrentUserId());
		course.setQualityTime(new Date());
		course.setUpdateUser(getCurrentUserId());
		course.setUpdateTime(new Date());
		courseMapper.updateByPrimaryKeySelective(course);
	}

	/**
	 * 子公司复检合格
	 */
	@Override
	public void sonQualityAgainYes(String courseId, String photo) {
		// 查询进场信息
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(courseId);
		// 修改进场数据
		course.setQualityResult(QualityStateEnum.QUALITY_OK.getCode());
		course.setQualityState(QualityStateEnum.QUALITY_COMPLETE.getCode());
		course.setRecheckPhoto(photo);
		course.setQualityUser(getCurrentUserId());
		course.setQualityTime(new Date());
		course.setUpdateUser(getCurrentUserId());
		course.setUpdateTime(new Date());
		courseMapper.updateByPrimaryKeySelective(course);
	}

	/**
	 * 根据进场id和箱类别获取质检条目
	 */
	@Override
	public QualityInfoOutput getQualityEntryList(String prodCourseId, String containerCategory) {
		QualityInfoOutput output = new QualityInfoOutput();
		// 查询进场表
		CourseWithBLOBs courseWithBLOBs = courseMapper.selectByPrimaryKey(prodCourseId);
		if (courseWithBLOBs != null) {
			output.setAfterPhoto(courseWithBLOBs.getAfterPhoto());
			output.setQualityPhoto(courseWithBLOBs.getQualityPhoto());
			output.setRecheckPhoto(courseWithBLOBs.getRecheckPhoto());
			output.setQualityResultLang(courseWithBLOBs.getQualityResult());
			output.setQualityResultKey(courseWithBLOBs.getQualityResult());
			output.setQualityState(courseWithBLOBs.getQualityState());
			output.setQualityStateNameLang(courseWithBLOBs.getQualityState());
			output.setContainerCondition(courseWithBLOBs.getContainerCondition());
		}
		if (StringUtils.isNotBlank(containerCategory)
				&& containerCategory.equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			UnitCourseWithBLOBs unitCourse = unitCourseMapper.selectByPrimaryKey(prodCourseId);
			if (unitCourse != null) {
				output.setAfterPhoto(unitCourse.getAfterPhoto());
				output.setQualityPhoto(unitCourse.getQualityPhoto());
				output.setRecheckPhoto(unitCourse.getRecheckPhoto());
				output.setQualityResultLang(unitCourse.getQualityResult());
				output.setQualityResultKey(unitCourse.getQualityResult());
				output.setQualityState(unitCourse.getQualityState());
				output.setQualityStateNameLang(unitCourse.getQualityState());
				output.setContainerCondition(unitCourse.getUnitState());
			}
		}
		// 明细数据
		ReferralEntryExample example = new ReferralEntryExample();
		example.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory)
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("serial_number");
		// 获取估价条目
		List<ReferralEntry> courseEntries = referralEntryMapper.selectByExampleWithBLOBs(example);
		if (courseEntries != null && courseEntries.size() > 0) {
			List<QualityEntryInfoOutput> dataList = new ArrayList<QualityEntryInfoOutput>();
			for (ReferralEntry courseEntrie : courseEntries) {
				QualityEntryInfoOutput cceOutput = new QualityEntryInfoOutput();
				cceOutput.setCourseEntryId(courseEntrie.getProdReferralEntryId()); // 条目id
				cceOutput.setPositionCode(courseEntrie.getPositionCode()); // 位置代码
				cceOutput.setRepairCode(courseEntrie.getRepairCode()); // 维修代码
				cceOutput.setDamageCode(courseEntrie.getDamageCode()); // 损坏代码
				cceOutput.setMaterialCode(courseEntrie.getMaterialCode()); // 材质代码
				cceOutput.setPartsDetailsCode(courseEntrie.getPartsDetailsCode()); // 部件明细
				cceOutput.setPartsRepairCode(courseEntrie.getPartsRepairCode()); // 部件修理代码
				cceOutput.setPartTypeCode(courseEntrie.getPartsTypeCode()); // 部件大类
				cceOutput.setPartsTypeCode(courseEntrie.getPartsTypeCode()); // 部件大类
				cceOutput.setSparesNum(courseEntrie.getSparesNumber()); // 备件号
				cceOutput.setLength(StringUtil.doubleToIntString(courseEntrie.getLength())); // 长
				cceOutput.setWidth(StringUtil.doubleToIntString(courseEntrie.getWidth())); // 宽
				cceOutput.setQuantity(StringUtil.doubleToEffectString(courseEntrie.getQuantity())); // 数量
				cceOutput.setRemarks(courseEntrie.getRemarks()); // 备注
				cceOutput.setDevice(courseEntrie.getDevice()); // 主件
				cceOutput.setPhoto(courseEntrie.getPhoto()); // 修前图片
				// cceOutput.setManHour(StringUtil.doubleToEffectString(courseEntrie.getManHour()));
				// // 工时
				cceOutput.setRateId(courseEntrie.getRateId()); // 费率主键
				cceOutput.setFiveCode(courseEntrie.getFiveCode()); // 五位代码
				cceOutput.setIsMustPhoto(courseEntrie.getIsMustPhoto()); // 是否必填
				if (StringUtils.isNotEmpty(courseEntrie.getIsRepair())
						&& courseEntrie.getIsRepair().equals(CommonEnum.NO.getCode())) {
					cceOutput.setIsRepair(CommonEnum.NO.getCode()); // 是否修理
					cceOutput.setIsRepairNameLang(CommonEnum.NO.getCode());
				} else {
					cceOutput.setIsRepair(CommonEnum.YES.getCode());
					cceOutput.setIsRepairNameLang(CommonEnum.YES.getCode());
				}
				cceOutput.setWarehouseType(courseEntrie.getWarehouseType()); // 仓库类型
				cceOutput.setWarehouseTypeNameLang(courseEntrie.getWarehouseType());
				// 质检标识
				cceOutput.setQualityStateLang(courseEntrie.getQualityState());
				cceOutput.setQualityStateKey(courseEntrie.getQualityState());
				cceOutput.setIsTechnology(courseEntrie.getIsTechnology());
				cceOutput.setReworkQuestion(courseEntrie.getReworkQuestion());
				cceOutput.setRectificationStandard(courseEntrie.getRectificationStandard());
				cceOutput.setQualityCause(courseEntrie.getQualityCause());
				dataList.add(cceOutput);
			}
			output.setDataList(dataList);
		}

		return output;
	}

	/**
	 * 删除质检明细
	 */
	@Override
	public void qualityEntryDelete(QualityEntryListInput input) {
		if (input != null && input.getCourseEntryIdList() != null && input.getCourseEntryIdList().length > 0) {
			// 批量删除派工明细
			ReferralEntry record = new ReferralEntry();
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量删除条件
			ReferralEntryExample example = new ReferralEntryExample();
			example.createCriteria().andProdReferralEntryIdIn(Arrays.asList(input.getCourseEntryIdList()));
			referralEntryMapper.updateByExampleSelective(record, example);
			// 批量删除估价明细
			EvaluationEntry eval = new EvaluationEntry();
			eval.setIsDel(PlatformConstants.ISDEL_YES);
			eval.setUpdateTime(new Date());
			eval.setUpdateUser(getCurrentUserId());
			// 批量删除条件
			EvaluationEntryExample evalExample = new EvaluationEntryExample();
			evalExample.createCriteria().andProdEvaluationEntryIdIn(Arrays.asList(input.getCourseEntryIdList()));
			evaluationEntryMapper.updateByExampleSelective(eval, evalExample);
		}
	}

	/**
	 * 质检保存
	 */
	@Override
	public void saveQualityCourserEntryInfo(QualityCourseEntryInfoInput input) {
		// 获取进场信息，判断估价状态
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
		UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
		String containerCond = course.getContainerCondition(); // 箱况
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory()))
			containerCond = unit.getUnitState();
		// 质检结果
		if (QualityStateEnum.QUALITY_OK.getCode().equals(input.getQualityResult())) {
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
				unit.setQualityUser(getCurrentUserId());
				unit.setQualityTime(new Date());
				unit.setUpdateTime(new Date());
				unit.setUpdateUser(getCurrentUserId());
				unit.setQualityTimeout(0.d);
				if (QualityStateEnum.QUALITY_DEFAULT.getCode().equals(unit.getQualityState())) {
					unit.setQualityResult(QualityStateEnum.QUALITY_OK.getCode()); // 质检合格
					unit.setQualityPhoto(input.getQualityPhoto()); // 质检图片
					if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(unit.getQualityType())
							&& unit.getReferralTime() != null) {
						Double timeOut = getTimeOut(ContainerCategoryEnum.CONTAINER_03.getCode(),
								unit.getReferralTime());
						unit.setQualityTimeout(timeOut);
					}
				}
				// 判断质检状态
				if (QualityStateEnum.QUALITY_FINISHWORK.getCode().equals(unit.getQualityState())) {
					unit.setQualityState(QualityStateEnum.QUALITY_COMPLETE.getCode()); // 质检状态
					unit.setRecheckPhoto(input.getRecheckPhoto()); // 复检图片
				}
				UnitCourseExample example = new UnitCourseExample();
				example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
				unitCourseMapper.updateByExampleSelective(unit, example);
			} else {
				course.setQualityUser(getCurrentUserId());
				course.setQualityTime(new Date());
				course.setUpdateTime(new Date());
				course.setUpdateUser(getCurrentUserId());
				course.setQualityTimeout(0.d);
				if (QualityStateEnum.QUALITY_DEFAULT.getCode().equals(course.getQualityState())) {
					course.setQualityResult(QualityStateEnum.QUALITY_OK.getCode()); // 质检合格
					course.setQualityPhoto(input.getQualityPhoto()); // 质检图片
					if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(course.getQualityType())
							&& course.getReferralTime() != null) {
						Double timeOut = getTimeOut(input.getContainerCategory(), course.getReferralTime());
						course.setQualityTimeout(timeOut);
					}
				}
				// 判断质检状态
				if (QualityStateEnum.QUALITY_FINISHWORK.getCode().equals(course.getQualityState())) {
					course.setQualityState(QualityStateEnum.QUALITY_COMPLETE.getCode()); // 质检状态
					course.setQualityPhoto(input.getRecheckPhoto()); // 复检图片
				}
				CourseExample example = new CourseExample();
				example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
				courseMapper.updateByExampleSelective(course, example);
			}
		} else if (QualityStateEnum.QUALITY_NOTOK.getCode().equals(input.getQualityResult())
				&& (ContainerStateEnum.GOOD.getCode().equals(containerCond)
						|| UnitStateEnum.GOOD.equals(containerCond))) {
			// 好箱质检不通过
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
				unit.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检合格
				unit.setQualityPhoto(input.getQualityPhoto()); // 质检图片
				unit.setQualityUser(getCurrentUserId());
				unit.setQualityTime(new Date());
				unit.setUpdateTime(new Date());
				unit.setUpdateUser(getCurrentUserId());
				UnitCourseExample example = new UnitCourseExample();
				example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
				unitCourseMapper.updateByExampleSelective(unit, example);
			} else {
				course.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检合格
				course.setQualityPhoto(input.getQualityPhoto()); // 质检图片
				course.setQualityUser(getCurrentUserId());
				course.setQualityTime(new Date());
				course.setUpdateTime(new Date());
				course.setUpdateUser(getCurrentUserId());
				CourseExample example = new CourseExample();
				example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
				courseMapper.updateByExampleSelective(course, example);
			}
		} else {
			// 坏箱质检不通过
			// 估价状态
			String replyState = "";
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
				replyState = unit.getUseReplyState();
			} else {
				replyState = course.getUseReplyState();
			}
			// 条目序号
			Integer order = 0;
			ReferralEntryExample reExample = new ReferralEntryExample();
			reExample.createCriteria().andCourseEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(input.getContainerCategory())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			reExample.setOrderByClause("serial_number desc");
			List<ReferralEntry> referralEntry = referralEntryMapper.selectByExample(reExample);
			if (referralEntry.size() > 0)
				order = referralEntry.get(0).getSerialNumber();

			// 获取公司key
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<Yard> yardList = yardMapper.selectByExample(yardExample);
			if (yardList.size() < 1)
				return;
			// 遍历
			for (QualityCourseEntryInput item : input.getPartList()) {
				// 判断质检标识
				if (StringUtils.isNotEmpty(item.getQualityStateKey())) {
					// 错项
					if (QualityStateEnum.QUALITY_ERROR.getCode().equals(item.getQualityStateKey())) {
						order++;
						// 添加派工单明细
						ReferralEntry model = AddReferralEntry(item, input, course, unit, yardList.get(0).getCompany(),
								order);
						if (ReplyStateEnum.UNDO.getCode().equals(replyState)) {
							// 调用估价单修改方法
							AddEvaluationEntry(model, yardList.get(0).getCompany(), course);
						}
					}
					// 返工
					else if (QualityStateEnum.QUALITY_BACK.getCode().equals(item.getQualityStateKey())) {
						order++;
						// 添加派工单明细
						AddReferralEntry(item, input, course, unit, yardList.get(0).getCompany(), order);
						// if (ReplyStateEnum.UNDO.getCode().equals(replyState)) {
						// // 调用估价单修改方法
						// AddEvaluationEntry(model, yardList.get(0).getCompany(), course);
						// }
					}
					// 漏项
					else if (QualityStateEnum.QUALITY_LEAK.getCode().equals(item.getQualityStateKey())) {
						order++;
						// 添加派工单明细
						ReferralEntry model = AddReferralEntry(item, input, course, unit, yardList.get(0).getCompany(),
								order);
						if (ReplyStateEnum.UNDO.getCode().equals(replyState)) {
							// 调用估价单修改方法
							AddEvaluationEntry(model, yardList.get(0).getCompany(), course);
						}
					}
				}
			}

			// 质检结果,修改主表数据
			if (QualityStateEnum.QUALITY_NOTOK.getCode().equals(input.getQualityResult())) {
				if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
					unit.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检不合格
					unit.setQualityState(QualityStateEnum.QUALITY_DISPATCHED.getCode()); // 质检状态
					unit.setQualityPhoto(input.getQualityPhoto()); // 质检图片
					unit.setQualityUser(getCurrentUserId());
					unit.setQualityTime(new Date());
					unit.setUpdateTime(new Date());
					unit.setUpdateUser(getCurrentUserId());
					unit.setQualityTimeout(0.d);
					if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(unit.getQualityType())
							&& unit.getReferralTime() != null) {
						Double timeOut = getTimeOut(ContainerCategoryEnum.CONTAINER_03.getCode(),
								unit.getReferralTime());
						unit.setQualityTimeout(timeOut);
					}
					// 派工工时
					Double manHour = 0.d;
					ReferralEntryExample referralEntryExample = new ReferralEntryExample();
					referralEntryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andCourseEqualTo(input.getProdCourseId())
							.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
					List<ReferralEntry> list = referralEntryMapper.selectByExample(referralEntryExample);
					if (list.size() > 0)
						manHour = list.stream().map(ReferralEntry::getManHour).reduce(Double::sum).get();
					unit.setManHour(manHour);
					unit.setQualityType(QualityTypeEnum.QUALITYTYPE_REPEAT.getCode()); // 复检箱
					UnitCourseExample example = new UnitCourseExample();
					example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
					unitCourseMapper.updateByExampleSelective(unit, example);
				} else {
					course.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检不合格
					course.setQualityState(QualityStateEnum.QUALITY_DISPATCHED.getCode()); // 质检状态
					course.setQualityPhoto(input.getQualityPhoto()); // 质检图片
					course.setQualityUser(getCurrentUserId());
					course.setQualityTime(new Date());
					course.setUpdateTime(new Date());
					course.setUpdateUser(getCurrentUserId());
					course.setQualityTimeout(0.d);
					if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(course.getQualityType())
							&& course.getReferralTime() != null) {
						Double timeOut = getTimeOut(course.getContainerCategory(), course.getReferralTime());
						course.setQualityTimeout(timeOut);
					}
					// 派工工时
					Double manHour = 0.d;
					ReferralEntryExample referralEntryExample = new ReferralEntryExample();
					referralEntryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andCourseEqualTo(input.getProdCourseId())
							.andContainerCategoryEqualTo(input.getContainerCategory());
					List<ReferralEntry> list = referralEntryMapper.selectByExample(referralEntryExample);
					if (list.size() > 0)
						manHour = list.stream().map(ReferralEntry::getManHour).reduce(Double::sum).get();
					course.setManHour(manHour);
					course.setQualityType(QualityTypeEnum.QUALITYTYPE_REPEAT.getCode()); // 复检箱
					CourseExample example = new CourseExample();
					example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
					courseMapper.updateByExampleSelective(course, example);
				}
			}
		}
	}

	/**
	 * 获取质检超时时间
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 * @param time
	 * @return Double @throws 
	 */
	private Double getTimeOut(String containerCategory, Date time) {
		Integer mustTime = 0;
		QualityControlTimeExample mustTimeExample = new QualityControlTimeExample();
		mustTimeExample.createCriteria().andContainerCategoryEqualTo(containerCategory)
				.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode())
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES);
		List<QualityControlTime> mustTimeList = qualityControlTimeMapper.selectByExample(mustTimeExample);
		if (mustTimeList.size() > 0)
			mustTime = mustTimeList.get(0).getQualityControlTime();
		if (mustTime > 0) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(time);
			calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) + mustTime); // 追加时间

			Double nh = 1000 * 60 * 60.d;
			long diff = new Date().getTime() - calendar.getTime().getTime();
			if (diff > 0) {
				Double hour = diff / nh;
				return new BigDecimal(hour).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
		}
		return 0.d;
	}

	/**
	 * 派工明细添加
	 * 
	 * @Description: TODO
	 * @param item
	 *            void @throws 
	 * @param input
	 * @param course
	 * @param unit
	 * @param company
	 * @param order
	 */
	private ReferralEntry AddReferralEntry(QualityCourseEntryInput item, QualityCourseEntryInfoInput input,
			CourseWithBLOBs course, UnitCourseWithBLOBs unit, String company, Integer order) {
		// 查询派工条目
		ReferralEntry referral = referralEntryMapper.selectByPrimaryKey(item.getCourseEntryId());
		if (referral != null) {
			referral.setPositionCode(item.getPositionCode()); // 位置代码
			referral.setPartsTypeCode(item.getPartTypeCode()); // 部件大类
			if (StringUtils.isNotEmpty(item.getPartsDetailsCode())) {
				referral.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
				referral.setRepairCode(item.getRepairCode()); // 修理代码
			} else {
				Integer count = item.getPartsRepairCode().length();
				referral.setPartsDetailsCode(item.getPartsRepairCode().substring(0, count - 2)); // 部件明细
				referral.setRepairCode(item.getPartsRepairCode().substring(count - 2, count)); // 修理代码
			}
			referral.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
			referral.setDamageCode(item.getDamageCode()); // 损坏代码
			referral.setMaterialCode(item.getMaterialCode()); // 材质
			referral.setLength(Double.valueOf(item.getLength())); // 长度
			referral.setWidth(Double.valueOf(item.getWidth())); // 宽度
			referral.setQuantity(Double.valueOf(item.getQuantity())); // 数量
			referral.setDevice(item.getDevice()); // 主件
			referral.setSparesNumber(item.getSparesNum()); // 备件号
			if (StringUtils.isNotEmpty(referral.getSparesNumber()))
				referral.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			else
				referral.setPickingState(PickingStateEnum.NOTSTOCKOUT.getCode());
			referral.setQualityState(item.getQualityStateKey()); // 质检状态
			referral.setPhoto(item.getPhoto()); // 修前图片
			referral.setPayingParty(item.getPayingParty()); // 付费方
			referral.setRemarks(item.getRemarks()); // 备注
			referral.setIsDel(PlatformConstants.ISDEL_NO);
			referral.setWarehouseType(item.getWarehouseType());// 仓库类型
			// 费率相关字段
			referral.setRateId(item.getRateId()); // 费率主键
			referral.setFiveCode(item.getFiveCode()); // 五位代码
			if (!QualityStateEnum.QUALITY_LEAK.getCode().equals(item.getQualityStateKey()))
				referral.setManHour(0.d);
			else {
				// 获取费率信息
				GetRateMessageOutput rate = getRateMessage(referral, company, course, true);
				referral.setManHour(rate.getManHour()); // 工时，根据费率计算工时
			}
			referral.setIsMustPhoto(item.getIsMustPhoto()); // 是否必传图片
			referral.setIsTechnology(item.getIsTechnology()); // 是否有工艺标准
			referral.setReworkQuestion(item.getReworkQuestion()); // 问题类别
			referral.setRectificationStandard(item.getRectificationStandard()); // 整改标准
			referral.setQualityCause(item.getQualityCause()); // 原因
			referral.setCreateTime(new Date());
			referral.setCreateUser(getCurrentUserId());
			ReferralEntryExample example = new ReferralEntryExample();
			example.createCriteria().andProdReferralEntryIdEqualTo(referral.getProdReferralEntryId());
			referralEntryMapper.updateByExampleWithBLOBs(referral, example);
			// 判断生成预出库单
			referralService.addPlanStock(course, referral);
			// 调用发泡添加接口
			foamingService.addFoaming(course.getProdCourseId());
			return referral;
		} else {
			// 派工明细
			ReferralEntry model = new ReferralEntry();
			model.setProdReferralEntryId(courseService.generateCourseEntryKey(course.getContainerNo()));
			model.setParentReferralEntry(item.getCourseEntryId()); // 关联主键
			model.setSerialNumber(order); // 序号
			model.setCourse(input.getProdCourseId()); // 进场id
			model.setContainerCategory(input.getContainerCategory()); // 箱类别
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setPartsTypeCode(item.getPartTypeCode()); // 部件大类
			if (StringUtils.isNotEmpty(item.getPartsDetailsCode())) {
				model.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
				model.setRepairCode(item.getRepairCode()); // 修理代码
			} else {
				Integer count = item.getPartsRepairCode().length();
				model.setPartsDetailsCode(item.getPartsRepairCode().substring(0, count - 2)); // 部件明细
				model.setRepairCode(item.getPartsRepairCode().substring(count - 2, count)); // 修理代码
			}
			model.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
			model.setDamageCode(item.getDamageCode()); // 损坏代码
			model.setMaterialCode(item.getMaterialCode()); // 材质
			model.setLength(Double.valueOf(item.getLength())); // 长度
			model.setWidth(Double.valueOf(item.getWidth())); // 宽度
			model.setQuantity(Double.valueOf(item.getQuantity())); // 数量
			model.setPickingQuantity(0.d); // 已领件数量
			model.setBorrowQuantity(0.d); // 借件数量
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNum()); // 备件号
			if (StringUtils.isNotEmpty(model.getSparesNumber()))
				model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			else
				model.setPickingState(PickingStateEnum.NOTSTOCKOUT.getCode());
			model.setQualityState(item.getQualityStateKey()); // 质检状态
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setPayingParty(item.getPayingParty()); // 付费方
			model.setRemarks(item.getRemarks()); // 备注
			model.setIsDel(PlatformConstants.ISDEL_NO);
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());
			model.setWarehouseType(item.getWarehouseType());// 仓库类型
			// 费率相关字段
			model.setRateId(item.getRateId()); // 费率主键
			model.setFiveCode(item.getFiveCode()); // 五位代码
			if (!QualityStateEnum.QUALITY_LEAK.getCode().equals(item.getQualityStateKey()))
				model.setManHour(0.d);
			else {
				// 获取费率信息
				GetRateMessageOutput rate = getRateMessage(model, company, course, true);
				model.setManHour(rate.getManHour()); // 工时，根据费率计算工时
			}
			model.setIsMustPhoto(item.getIsMustPhoto()); // 是否必传图片
			model.setIsTechnology(item.getIsTechnology()); // 是否有工艺标准
			model.setReworkQuestion(item.getReworkQuestion()); // 问题类别
			model.setRectificationStandard(item.getRectificationStandard()); // 整改标准
			model.setQualityCause(item.getQualityCause()); // 原因
			// 添加派工明细
			referralEntryMapper.insert(model);
			// 判断生成预出库单
			referralService.addPlanStock(course, model);
			// 调用发泡添加接口
			foamingService.addFoaming(course.getProdCourseId());
			return model;
		}
	}

	/**
	 * 添加估价单明细
	 * 
	 * @Description: TODO
	 * @param ref
	 * @param company
	 * @param course
	 *            void @throws 
	 */
	private void AddEvaluationEntry(ReferralEntry ref, String company, CourseWithBLOBs course) {
		// 获取估价单信息
		EvaluationEntry eval = evaluationEntryMapper.selectByPrimaryKey(ref.getProdReferralEntryId());
		if (eval != null) {
			eval.setPositionCode(ref.getPositionCode()); // 位置代码
			eval.setPartsTypeCode(ref.getPartsTypeCode()); // 部件大类
			eval.setDamageCode(ref.getDamageCode()); // 损坏代码
			eval.setMaterialCode(ref.getMaterialCode()); // 材质代码
			eval.setDevice(ref.getDevice()); // 主件
			eval.setSparesNumber(ref.getSparesNumber()); // 备件号
			eval.setLength(ref.getLength()); // 长
			eval.setWidth(ref.getWidth()); // 宽
			eval.setQuantity(ref.getQuantity()); // 数量
			eval.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			eval.setPhoto(ref.getPhoto()); // 修前图片
			eval.setRemarks(ref.getRemarks()); // 备注
			eval.setWarehouseType(ref.getWarehouseType()); // 仓库类型
			eval.setIsMustPhoto(ref.getIsMustPhoto()); // 是否必填图片
			// 获取费率信息
			GetRateMessageOutput rate = getRateMessage(ref, company, course, false);
			eval.setRateId(rate.getRateId()); // 费率id
			eval.setFiveCode(rate.getFiveCode()); // 五位代码
			eval.setManHour(rate.getManHour()); // 工时数
			eval.setManHourCost(rate.getManHourCost()); // 工时费
			eval.setMaterialCost(rate.getMaterialCost()); // 材料费
			BigDecimal sumMoney = rate.getManHourCost().add(rate.getMaterialCost());
			eval.setSumMoney(sumMoney); // 总费用
			eval.setThirdpartyMoney(sumMoney); // 第三方费用
			eval.setIsCharge(CommonEnum.NO.getCode()); // 是否已收费
			eval.setPartsDetailsCode(rate.getUserPartsDetails()); // 用箱人部件明细
			eval.setRepairCode(rate.getUserRepair()); // 用箱人维修代码
			eval.setPartsRepairCode(rate.getUserPartsDetails() + rate.getUserRepair()); // 用箱人部件修理代码
			// 付费方相关字段
			eval.setPayingParty(ref.getPayingParty()); // 付费方
			eval.setCreateTime(new Date());
			eval.setCreateUser(getCurrentUserId());
			// 更新条目表
			evaluationEntryMapper.updateByPrimaryKey(eval);
			// 更新进场主表字段
			estimateDetailService.updateEstimateCourse(eval.getCourse(), eval.getContainerCategory());
		} else {
			// 估价单
			AddEvaluationInput addInput = new AddEvaluationInput();
			List<AddEvaluationEntryInput> addList = new ArrayList<AddEvaluationEntryInput>();
			AddEvaluationEntryInput model = new AddEvaluationEntryInput();
			model.setProdEvaluationEntryId(ref.getProdReferralEntryId());
			model.setSerialNumber(ref.getSerialNumber()); // 序号
			model.setCourse(ref.getCourse()); // 进场id
			model.setContainerCategory(ref.getContainerCategory()); // 箱类别
			model.setPositionCode(ref.getPositionCode()); // 位置代码
			model.setPartsTypeCode(ref.getPartsTypeCode()); // 部件大类
			model.setDamageCode(ref.getDamageCode()); // 损坏代码
			model.setMaterialCode(ref.getMaterialCode()); // 材质代码
			model.setDevice(ref.getDevice()); // 主件
			model.setSparesNumber(ref.getSparesNumber()); // 备件号
			model.setLength(ref.getLength()); // 长
			model.setWidth(ref.getWidth()); // 宽
			model.setQuantity(ref.getQuantity()); // 数量
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setPhoto(ref.getPhoto()); // 修前图片
			model.setRemarks(ref.getRemarks()); // 备注
			model.setWarehouseType(ref.getWarehouseType()); // 仓库类型
			model.setIsMustPhoto(ref.getIsMustPhoto()); // 是否必填图片
			// 获取费率信息
			GetRateMessageOutput rate = getRateMessage(ref, company, course, false);
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			model.setManHourCost(rate.getManHourCost()); // 工时费
			model.setMaterialCost(rate.getMaterialCost()); // 材料费
			BigDecimal sumMoney = rate.getManHourCost().add(rate.getMaterialCost());
			model.setSumMoney(sumMoney); // 总费用
			model.setThirdpartyMoney(sumMoney); // 第三方费用
			model.setIsCharge(CommonEnum.NO.getCode()); // 是否已收费
			model.setPartsDetailsCode(rate.getUserPartsDetails()); // 用箱人部件明细
			model.setRepairCode(rate.getUserRepair()); // 用箱人维修代码
			model.setPartsRepairCode(rate.getUserPartsDetails() + rate.getUserRepair()); // 用箱人部件修理代码
			// 付费方相关字段
			model.setPayingParty(ref.getPayingParty()); // 付费方
			addList.add(model);
			addInput.setCourse(model.getCourse());
			addInput.setEntryList(addList);
			// 调用估价单明细添加接口
			estimateDetailService.addEstimateEntry(addInput);
			// 更新进场主表字段
			estimateDetailService.updateEstimateCourse(model.getCourse(), model.getContainerCategory());
		}
	}

	/**
	 * 获取费率信息
	 * 
	 * @Description: TODO
	 * @param ref
	 * @param course
	 * @param company
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getRateMessage(ReferralEntry ref, String company, CourseWithBLOBs course,
			Boolean isRepair) {
		// 返回
		GetRateMessageOutput output = new GetRateMessageOutput();
		// 组装参数
		GetRateMessageInput rateInput = new GetRateMessageInput();
		rateInput.setCompany(company); // 公司
		rateInput.setContainerUser(course.getContainerUser()); // 用箱人
		rateInput.setContainerCategory(ref.getContainerCategory()); // 箱类别
		rateInput.setPartsType(ref.getPartsTypeCode()); // 部件大类
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(ref.getContainerCategory())) {
			Integer count = ref.getPartsRepairCode().length();
			rateInput.setPartsDetails(ref.getPartsRepairCode().substring(0, count - 2)); // 部件明细
			rateInput.setRepair(ref.getPartsRepairCode().substring(count - 2, count)); // 维修代码
		} else {
			rateInput.setPartsDetails(ref.getPartsDetailsCode()); // 部件明细
			rateInput.setRepair(ref.getRepairCode()); // 维修代码
		}
		rateInput.setMaterial(ref.getMaterialCode()); // 材质代码
		rateInput.setPositionCode(ref.getPositionCode()); // 位置代码
		rateInput.setContainerType(course.getContainerType()); // 箱型
		rateInput.setSize(course.getSize()); // 尺寸
		rateInput.setLength(ref.getLength()); // 长
		rateInput.setWidth(ref.getWidth()); // 宽
		rateInput.setQuantity(ref.getQuantity()); // 数量
		rateInput.setSparesNumber(ref.getSparesNumber()); // 备件号
		rateInput.setStage(RateStageEnum.TYPE02.getCode()); // 报价环节使用费率
		rateInput.setFromType(RateFromTypeEnum.TYPE01.getCode()); // 费率类型：标准费率
		if (isRepair) {
			rateInput.setFromType(RateFromTypeEnum.TYPE03.getCode()); // 费率类型：派工工时
			rateInput.setContainerUser(getSanKey()); // 用箱人
		} else
			rateInput.setFromType(RateFromTypeEnum.TYPE01.getCode()); // 费率类型：标准费率
		// 调用费率
		output = rateService.getRateMessage(rateInput);
		return output;
	}

	/**
	 * 获取SANkey
	 * 
	 * @return String @throws 
	 */
	private String getSanKey() {
		ContainerUserExample userExample = new ContainerUserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerUserCodeEqualTo(RateCommonEnum.CONTAINERUSERKEY2.getCode());
		List<ContainerUser> userList = containerUserMapper.selectByExample(userExample);
		if (userList.size() > 0)
			return userList.get(0).getKey();
		return null;
	}

	/**
	 * 质检好转坏
	 */
	@Override
	public void uploadQualityCourserEntryInfo(QualityCourseEntryInfoInput input) {
		if (input.getPartList().size() < 1)
			return;
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
		UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
		// 获取公司key
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() < 1)
			return;
		// 添加进场条目、估价条目、派工条目
		Integer order = 0;
		for (QualityCourseEntryInput item : input.getPartList()) {
			order++;
			// 添加派工明细
			ReferralEntry referralEntry = AddReferralEntry(item, input, course, unit, yardList.get(0).getCompany(),
					order);
			// 进场条目
			addCourseEntry(referralEntry, item, yardList.get(0).getCompany(), course);
			// 添加估价明细
			AddEvaluationEntry(referralEntry, yardList.get(0).getCompany(), course);
		}
		// 修改主表数据
		if (!ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
			// 检验相关字段
			course.setContainerCondition(ContainerStateEnum.BAD.getCode()); // 箱况
			course.setTestingUser(getCurrentUserId()); // 检验人
			course.setTestingTime(new Date()); // 检验时间
			course.setTestingEndTime(new Date()); // 检验完成时间
			course.setAuditType(AuditTypeEnum.AuditTypeEnum_02.getCode()); // 审核类型
			course.setAuditUser(getCurrentUserId()); // 审核人
			course.setAuditTime(new Date()); // 审核时间
			CourseEntryExample entryExample = new CourseEntryExample();
			entryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCourseEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(input.getContainerCategory());
			List<CourseEntry> entryList = courseEntryMapper.selectByExample(entryExample);
			BigDecimal manHourCost = entryList.stream().map(CourseEntry::getManHourCost).reduce(BigDecimal.ZERO,
					BigDecimal::add);
			BigDecimal materialCost = entryList.stream().map(CourseEntry::getMaterialCost).reduce(BigDecimal.ZERO,
					BigDecimal::add);
			BigDecimal thirdpartyMoney = entryList.stream().map(CourseEntry::getThirdpartyMoney).reduce(BigDecimal.ZERO,
					BigDecimal::add);
			course.setTestingManHourCost(manHourCost); // 检验工时费金额
			course.setTestingMaterialCost(materialCost); // 检验材料费金额
			course.setTestingThirdpartyMoney(thirdpartyMoney); // 检验第三方费用
			course.setTestingMoney(manHourCost.add(materialCost)); // 检验总费用

			// 估价相关字段
			course.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态
			course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode()); // 紧急程度

			// 派工相关字段
			course.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
			course.setReferralTime(new Date()); // 派工时间
			ReferralEntryExample referralExample = new ReferralEntryExample();
			referralExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCourseEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(input.getContainerCategory());
			List<ReferralEntry> referralList = referralEntryMapper.selectByExample(referralExample);
			Double manHour = referralList.stream().map(ReferralEntry::getManHour).reduce(Double::sum).get();
			course.setManHour(manHour); // 工时

			// 质检相关字段
			course.setQualityType(QualityTypeEnum.QUALITYTYPE_REPEAT.getCode()); // 质检类型
			course.setQualityState(QualityStateEnum.QUALITY_DISPATCHED.getCode()); // 质检状态
			course.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检结果
			course.setQualityUser(getCurrentUserId()); // 质检人
			course.setQualityTime(new Date()); // 质检时间

			// 保存
			CourseExample courseExample = new CourseExample();
			courseExample.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			courseMapper.updateByExampleSelective(course, courseExample);

		} else {
			// 检验相关字段
			unit.setUnitState(UnitStateEnum.BAD.getCode()); // 机组状态
			unit.setTestingUser(getCurrentUserId()); // 检验人
			unit.setTestingTime(new Date()); // 检验时间
			unit.setTestingEndTime(new Date()); // 检验完成时间
			unit.setAuditType(AuditTypeEnum.AuditTypeEnum_02.getCode()); // 审核类型
			unit.setAuditUser(getCurrentUserId()); // 审核人
			unit.setAuditTime(new Date()); // 审核时间
			CourseEntryExample entryExample = new CourseEntryExample();
			entryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCourseEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
			List<CourseEntry> entryList = courseEntryMapper.selectByExample(entryExample);
			BigDecimal manHourCost = entryList.stream().map(CourseEntry::getManHourCost).reduce(BigDecimal.ZERO,
					BigDecimal::add);
			BigDecimal materialCost = entryList.stream().map(CourseEntry::getMaterialCost).reduce(BigDecimal.ZERO,
					BigDecimal::add);
			BigDecimal thirdpartyMoney = entryList.stream().map(CourseEntry::getThirdpartyMoney).reduce(BigDecimal.ZERO,
					BigDecimal::add);
			unit.setTestingManHourCost(manHourCost); // 检验工时费金额
			unit.setTestingMaterialCost(materialCost); // 检验材料费金额
			unit.setTestingThirdpartyMoney(thirdpartyMoney); // 检验第三方费用
			unit.setTestingMoney(manHourCost.add(materialCost)); // 检验总费用

			// 估价相关字段
			unit.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态

			// 派工相关字段
			unit.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
			unit.setReferralTime(new Date()); // 派工时间
			ReferralEntryExample referralExample = new ReferralEntryExample();
			referralExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCourseEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(input.getContainerCategory());
			List<ReferralEntry> referralList = referralEntryMapper.selectByExample(referralExample);
			Double manHour = referralList.stream().map(ReferralEntry::getManHour).reduce(Double::sum).get();
			unit.setManHour(manHour); // 工时

			// 质检相关字段
			unit.setQualityType(QualityTypeEnum.QUALITYTYPE_REPEAT.getCode()); // 质检类型
			unit.setQualityState(QualityStateEnum.QUALITY_DISPATCHED.getCode()); // 质检状态
			unit.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检结果
			unit.setQualityUser(getCurrentUserId()); // 质检人
			unit.setQualityTime(new Date()); // 质检时间

			// 保存
			UnitCourseExample courseExample = new UnitCourseExample();
			courseExample.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			unitCourseMapper.updateByExampleSelective(unit, courseExample);

		}
	}

	/**
	 * 添加进场明细
	 * 
	 * @param item
	 * 
	 * @Description: TODO
	 * @param input
	 * @param course
	 * @param company
	 *            void @throws 
	 */
	private void addCourseEntry(ReferralEntry referralEntry, QualityCourseEntryInput item, String company,
			CourseWithBLOBs course) {

		CourseEntry model = new CourseEntry();
		model.setProdCourseEntryId(referralEntry.getProdReferralEntryId());
		model.setSerialNumber(referralEntry.getSerialNumber()); // 序号
		model.setRateId(referralEntry.getRateId()); // 费率主键
		model.setFiveCode(referralEntry.getFiveCode()); // 五位代码
		model.setCourse(course.getProdCourseId()); // 进场id
		model.setContainerCategory(referralEntry.getContainerCategory()); // 箱类别
		model.setPositionCode(item.getPositionCode()); // 位置
		model.setPartsTypeCode(item.getPartTypeCode()); // 部件大类
		model.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
		model.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
		model.setDamageCode(item.getDamageCode()); // 损坏代码
		model.setRepairCode(item.getRepairCode()); // 维修代码
		model.setMaterialCode(item.getMaterialCode()); // 材质代码
		model.setDevice(item.getDevice()); // 主件
		model.setSparesNumber(item.getSparesNum()); // 备件
		model.setWarehouseType(item.getWarehouseType()); // 仓库
		model.setLength(Double.valueOf(item.getLength())); // 长
		model.setWidth(Double.valueOf(item.getWidth())); // 宽
		model.setQuantity(Double.valueOf(item.getQuantity())); // 数量
		model.setManHour(Double.valueOf(item.getManHour())); // 工时
		model.setManHourCost(BigDecimal.valueOf(Double.valueOf(item.getManHourCost()))); // 工时费
		model.setMaterialCost(BigDecimal.valueOf(Double.valueOf(item.getMaterialCost()))); // 材料费
		model.setThirdpartyMoney(BigDecimal.valueOf(Double.valueOf(item.getThirdpartyMoney()))); // 第三方费用
		model.setIsCharge(CommonEnum.NO.getCode()); // 是否已收费
		model.setSumMoney(model.getManHourCost().add(model.getMaterialCost())); // 总金额
		model.setPayingParty(item.getPayingParty()); // 付费方
		model.setPhoto(item.getPhoto()); // 修前图片
		model.setIsMustPhoto(item.getIsMustPhoto()); // 是否必传图片
		model.setRemarks(item.getRemarks()); // 备注
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		courseEntryMapper.insert(model);

	}

	/**
	 * 获取问题类别
	 */
	@Override
	public List<SelectItemOutput> getQuestionList(String containerCategory) {
		// 获取所有的问题类型
		ReworkQuestionExample example = new ReworkQuestionExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andContainerCategoryEqualTo(containerCategory);
		List<ReworkQuestion> list = reworkQuestionMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 获取整改标准
	 */
	@Override
	public List<SelectItemOutput> getStandardList(String question) {
		// 根据问题类型获取整改标准
		RectificationStandardExample example = new RectificationStandardExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andReworkQuestionEqualTo(question);
		List<RectificationStandard> list = rectificationStandardMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 错项、漏项、返工原因
	 */
	@Override
	public List<SelectItemOutput> getQualityCauseList(String reasonType) {
		ReasonExample example = new ReasonExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andReasonTypeEqualTo(reasonType);
		List<Reason> list = reasonMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 品控部质检列表
	 * 
	 * @throws ParseException
	 */
	@Override
	public PagedList<SearchQaListOutput> getQaList(SearchQaListInput input) throws ParseException {
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory()))
			return getUnitQaList(input);
		CourseExample example = new CourseExample();
		CourseExample.Criteria criteria = example.createCriteria().andPkQualityStateIsNotNull();
		// 查询条件
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 进场类型
		if (StringUtils.isNotEmpty(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(input.getCourseType());
		}
		// 指派班组
		if (input.getDesignateUser() != null) {
			criteria.andDesignateUserEqualTo(input.getDesignateUser());
		}
		// 箱类别
		if (StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		// 公司
		if (StringUtils.isNotEmpty(input.getCompany())) {
			List<String> yardList = getYardListByCompany(input.getCompany());
			if (yardList.size() > 0)
				criteria.andYardIn(yardList);
		}
		// 场站
		if (StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		// 子公司质检结果
		if (StringUtils.isNotEmpty(input.getQualityResult())) {
			criteria.andQualityResultEqualTo(input.getQualityResult());
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralStartDate())) {
			criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getReferralStartDate())));
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralEndDate())) {
			criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(input.getReferralEndDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishStartDate())) {
			criteria.andFinishTimeGreaterThanOrEqualTo(sdf.parse(input.getFinishStartDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishEndDate())) {
			criteria.andFinishAuditTimeLessThanOrEqualTo(sdf.parse(input.getFinishEndDate()));
		}
		// 按照进场倒序
		example.setOrderByClause(" course_time desc");
		// 分页查询
		int total = (int) courseMapper.countByExample(example);
		PagedList<SearchQaListOutput> pagedList = new PagedList<SearchQaListOutput>(input.getPageIndex(),
				input.getPageSize(), total);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		List<Course> courseList = courseMapper.selectByExample(example);
		// 组装数据
		List<SearchQaListOutput> outList = courseList.stream().map(item -> {
			SearchQaListOutput model = new SearchQaListOutput();
			model.setCourseId(item.getProdCourseId()); // 进场id
			model.setContainerCategoryKey(item.getContainerCategory()); // 箱类别
			model.setContainerCategoryLang(item.getContainerCategory()); // 箱类别
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setCourseTypeLang(item.getCourseType()); // 进场类型
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setYardLang(item.getYard()); // 进场场站
			model.setQualityResultLang(item.getQualityResult()); // 子公司质检结果
			model.setPkQualityStateKey(item.getPkQualityState()); // 品控部质检结果
			model.setPkQualityStateLang(item.getPkQualityState()); // 品控部质检结果
			model.setCompanyLang(getCompanyByYard(item.getYard())); // 公司
			// 指派班组
			if (item.getDesignateUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setDesignateUser(user.getUserName());
					}
				}
			}
			// 格式化日期
			if (item.getReferralTime() != null) {
				model.setReferralTime(sdf.format(item.getReferralTime())); // 派工时间
			}
			if (item.getFinishTime() != null) {
				model.setFinishTime(sdf.format(item.getFinishTime())); // 完工时间
			}

			return model;
		}).collect(Collectors.toList());
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * 机组品控质检列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchQaListOutput> @throws 
	 * @throws ParseException
	 */
	private PagedList<SearchQaListOutput> getUnitQaList(SearchQaListInput input) throws ParseException {
		UnitCourseExample example = new UnitCourseExample();
		UnitCourseExample.Criteria criteria = example.createCriteria().andPkQualityStateIsNotNull();
		// 查询条件
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 进场类型
		if (StringUtils.isNotEmpty(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(input.getCourseType());
		}
		// 指派班组
		if (input.getDesignateUser() != null) {
			criteria.andDesignateUserEqualTo(input.getDesignateUser());
		}
		// 公司
		if (StringUtils.isNotEmpty(input.getCompany())) {
			List<String> yardList = getYardListByCompany(input.getCompany());
			if (yardList.size() > 0)
				criteria.andYardIn(yardList);
		}
		// 场站
		if (StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		// 子公司质检结果
		if (StringUtils.isNotEmpty(input.getQualityResult())) {
			criteria.andQualityResultEqualTo(input.getQualityResult());
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralStartDate())) {
			criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getReferralStartDate())));
		}
		// 派工时间
		if (StringUtils.isNotEmpty(input.getReferralEndDate())) {
			criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(input.getReferralEndDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishStartDate())) {
			criteria.andFinishTimeGreaterThanOrEqualTo(sdf.parse(input.getFinishStartDate()));
		}
		// 完工时间
		if (StringUtils.isNotEmpty(input.getFinishEndDate())) {
			criteria.andFinishAuditTimeLessThanOrEqualTo(sdf.parse(input.getFinishEndDate()));
		}
		// 按照进场倒序
		example.setOrderByClause(" create_time desc");
		// 分页查询
		int total = (int) unitCourseMapper.countByExample(example);
		PagedList<SearchQaListOutput> pagedList = new PagedList<SearchQaListOutput>(input.getPageIndex(),
				input.getPageSize(), total);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		List<UnitCourse> courseList = unitCourseMapper.selectByExample(example);
		// 组装数据
		List<SearchQaListOutput> outList = courseList.stream().map(item -> {
			SearchQaListOutput model = new SearchQaListOutput();
			model.setCourseId(item.getProdCourseId()); // 进场id
			model.setContainerCategoryKey(ContainerCategoryEnum.CONTAINER_03.getCode()); // 箱类别
			model.setContainerCategoryLang(ContainerCategoryEnum.CONTAINER_03.getCode()); // 箱类别
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setCourseTypeLang(item.getCourseType()); // 进场类型
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setYardLang(item.getYard()); // 进场场站
			model.setQualityResultLang(item.getQualityResult()); // 子公司质检结果
			model.setPkQualityStateKey(item.getPkQualityState()); // 品控部质检结果
			model.setPkQualityStateLang(item.getPkQualityState()); // 品控部质检结果
			model.setCompanyLang(getCompanyByYard(item.getYard())); // 公司
			// 指派班组
			if (item.getDesignateUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setDesignateUser(user.getUserName());
					}
				}
			}
			// 格式化日期
			if (item.getReferralTime() != null) {
				model.setReferralTime(sdf.format(item.getReferralTime())); // 派工时间
			}
			if (item.getFinishTime() != null) {
				model.setFinishTime(sdf.format(item.getFinishTime())); // 完工时间
			}

			return model;
		}).collect(Collectors.toList());
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * 获取公司下的场站
	 * 
	 * @Description: TODO
	 * @param company
	 * @return List<String> @throws 
	 */
	private List<String> getYardListByCompany(String company) {
		List<String> list = new ArrayList<>();
		YardExample example = new YardExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andCompanyEqualTo(company);
		List<Yard> yardList = yardMapper.selectByExample(example);
		if (yardList.size() > 0)
			list = yardList.stream().map(a -> a.getKey()).collect(Collectors.toList());
		return list;
	}

	/**
	 * 根据场站获取公司
	 * 
	 * @Description: TODO
	 * @param yard
	 * @return String @throws 
	 */
	private String getCompanyByYard(String yard) {
		YardExample example = new YardExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andKeyEqualTo(yard);
		List<Yard> yardList = yardMapper.selectByExample(example);
		if (yardList.size() > 0)
			return yardList.get(0).getCompany();
		return null;
	}

	/**
	 * 质检通过
	 */
	@Override
	public void qaQualityYes(QaQualityInput input) {
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
			UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getCourseId());
			unit.setPkQualityState(PkQualityStateEnum.PKQUALITY_YES.getCode());
			unit.setPkQualityUser(getCurrentUserId());
			unit.setPkQualityTime(new Date());
			unit.setUpdateUser(getCurrentUserId());
			unit.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKey(unit);
		} else {
			CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getCourseId());
			course.setPkQualityState(PkQualityStateEnum.PKQUALITY_YES.getCode());
			course.setPkQualityUser(getCurrentUserId());
			course.setPkQualityTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			course.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKey(course);
		}
	}

	/**
	 * 品控部质检不通过
	 */
	@Override
	public void qaQualityNo(QaQualityInput input) {
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
			UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getCourseId());
			unit.setPkQualityState(PkQualityStateEnum.PKQUALITY_NO.getCode());
			unit.setPkQualityUser(getCurrentUserId());
			unit.setPkQualityTime(new Date());
			unit.setUpdateUser(getCurrentUserId());
			unit.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKey(unit);
		} else {
			CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getCourseId());
			course.setPkQualityState(PkQualityStateEnum.PKQUALITY_NO.getCode());
			course.setPkQualityUser(getCurrentUserId());
			course.setPkQualityTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			course.setUpdateTime(new Date());
			courseMapper.updateByPrimaryKey(course);
		}
	}

	/**
	 * 复检合格
	 */
	@Override
	public void recheckOk(QualityCourseEntryInfoInput input) {
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
			UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
			unit.setQualityState(QualityStateEnum.QUALITY_COMPLETE.getCode());
			unit.setRecheckPhoto(input.getRecheckPhoto());
			unit.setUpdateTime(new Date());
			unit.setUpdateUser(getCurrentUserId());
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			unitCourseMapper.updateByExampleSelective(unit, example);
		} else {
			CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
			course.setQualityState(QualityStateEnum.QUALITY_COMPLETE.getCode());
			course.setRecheckPhoto(input.getRecheckPhoto());
			course.setUpdateTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			courseMapper.updateByExampleSelective(course, example);
		}

	}

	/**
	 * 复检不合格
	 */
	@Override
	public void recheckNo(QualityCourseEntryInfoInput input) {
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
			UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
			unit.setRecheckPhoto(input.getRecheckPhoto());
			unit.setUpdateTime(new Date());
			unit.setUpdateUser(getCurrentUserId());
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			unitCourseMapper.updateByExampleSelective(unit, example);
		} else {
			CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
			course.setRecheckPhoto(input.getRecheckPhoto());
			course.setUpdateTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			courseMapper.updateByExampleSelective(course, example);
		}
	}

}
