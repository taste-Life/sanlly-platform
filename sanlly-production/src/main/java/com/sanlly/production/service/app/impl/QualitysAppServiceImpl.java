package com.sanlly.production.service.app.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.QualityControlTimeMapper;
import com.sanlly.production.dao.QualityReworkMapper;
import com.sanlly.production.dao.QualitysExtMapper;
import com.sanlly.production.dao.ReasonMapper;
import com.sanlly.production.dao.RectificationStandardMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.ReworkQuestionMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.QualityControlTime;
import com.sanlly.production.entity.QualityControlTimeExample;
import com.sanlly.production.entity.QualityReworkWithBLOBs;
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
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.QualityStateEnum;
import com.sanlly.production.enums.QualityTypeEnum;
import com.sanlly.production.enums.RateFromTypeEnum;
import com.sanlly.production.enums.RateStageEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.models.input.app.qualitys.QualitysContEntryInput;
import com.sanlly.production.models.input.app.qualitys.QualitysContInput;
import com.sanlly.production.models.input.app.qualitys.QualitysUnitEntryInput;
import com.sanlly.production.models.input.app.qualitys.QualitysUnitInput;
import com.sanlly.production.models.input.app.qualitys.SearchQualitysInput;
import com.sanlly.production.models.input.evaluation.AddEvaluationEntryInput;
import com.sanlly.production.models.input.evaluation.AddEvaluationInput;
import com.sanlly.production.models.input.quality.QualityCourseEntryInfoInput;
import com.sanlly.production.models.input.quality.QualityCourseEntryInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.output.app.qualitys.QualityReasonsOutput;
import com.sanlly.production.models.output.app.qualitys.QualityStandardsOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysContEntryOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysContOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysUnitEntryOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysUnitOutput;
import com.sanlly.production.models.output.app.qualitys.SearchQualitysOutput;
import com.sanlly.production.models.output.app.qualitys.StandardOutput;
import com.sanlly.production.models.output.quality.SearchSonQualityListOutput;
import com.sanlly.production.models.output.rate.GetRateMessageOutput;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.EstimateDetailService;
import com.sanlly.production.service.FoamingService;
import com.sanlly.production.service.RateService;
import com.sanlly.production.service.ReferralService;
import com.sanlly.production.service.app.QualitysAppService;
import com.sanlly.production.service.impl.BaseServiceImpl;

@Service
public class QualitysAppServiceImpl extends BaseServiceImpl implements QualitysAppService {

	@Autowired
	private QualitysExtMapper qualitysExtMapper;

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private UnitCourseMapper unitCourseMapper;

	@Autowired
	private ReferralEntryMapper refrralEntryMapper;

	@Autowired
	private QualityReworkMapper qualityReworkMapper;

	@Autowired
	private CourseKeyRuleService courseService;

	@Autowired
	private ReasonMapper reasonMapper;

	@Autowired
	private RectificationStandardMapper rectificationStandardMapper;

	@Autowired
	private YardMapper yardMapper;

	@Autowired
	private RateService rateService;

	@Autowired
	private EstimateDetailService estimateDetailService;

	@Autowired
	private ReferralService referralService;

	@Autowired
	private FoamingService foamingService;

	@Autowired
	private ReworkQuestionMapper reworkQuestionMapper;

	@Autowired
	private ReferralEntryMapper referralEntryMapper;

	@Autowired
	private EvaluationEntryMapper evaluationEntryMapper;

	@Autowired
	private QualityControlTimeMapper qualityControlTimeMapper;

	/**
	 * app质检列表
	 */
	@Override
	public PagedList<SearchQualitysOutput> getQualitysPagedList(SearchQualitysInput input) {
		if (ContainerCategoryEnum.isUnit(input.getType()))
			return getUnitSonQualityList(input);
		CourseExample example = new CourseExample();
		CourseExample.Criteria criteria = example.createCriteria();
		CourseExample.Criteria criteria1 = example.createCriteria();
		// 查询条件
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 箱类别
		if (StringUtils.isNotEmpty(input.getType())) {
			criteria.andContainerCategoryEqualTo(input.getType());
			criteria1.andContainerCategoryEqualTo(input.getType());
		}
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
			criteria1.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 质检类型
		if (StringUtils.isNotEmpty(input.getIsQuality())) {
			criteria.andQualityTypeEqualTo(input.getIsQuality());
			criteria1.andQualityTypeEqualTo(input.getIsQuality());
			// 质检状态
			if (QualityTypeEnum.QUALITYTYPE_REPEAT.getCode().equals(input.getIsQuality())) {
				criteria.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
				criteria1.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			} else {
				criteria.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				criteria1.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				if (QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode().equals(input.getIsQuality())) {
					QualityControlTimeExample timeExample = new QualityControlTimeExample();
					timeExample.createCriteria().andContainerCategoryEqualTo(input.getType())
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
		// 质检结果
		if (StringUtils.isNotEmpty(input.getQualityState())) {
			if (QualityStateEnum.QUALITY_COMPLETE.getCode().equals(input.getQualityState())) {
				criteria.andQualityStateEqualTo(input.getQualityState());
				criteria1.andQualityStateEqualTo(input.getQualityState());
			} else {
				criteria.andQualityResultEqualTo(input.getQualityState());
				criteria1.andQualityResultEqualTo(input.getQualityState());
			}
		}
		example.or(criteria1);
		// 分页查询
		int total = (int) courseMapper.countByExample(example);
		PagedList<SearchQualitysOutput> pagedList = new PagedList<SearchQualitysOutput>(input.getPageIndex(),
				input.getPageSize(), total);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		example.setOrderByClause(" referral_time desc");
		List<Course> courseList = courseMapper.selectByExample(example);

		// 组装数据
		List<SearchQualitysOutput> outList = new ArrayList<>();
		for (Course item : courseList) {
			SearchQualitysOutput model = new SearchQualitysOutput();
			model.setProdCourseId(item.getProdCourseId()); // 进场id
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setSizeKey(item.getSize()); // 尺寸
			model.setSizeLang(item.getSize()); // 尺寸
			model.setContainerTypeKey(item.getContainerType()); // 箱型
			model.setContainerTypeLang(item.getContainerType()); // 箱型
			model.setContainerUserKey(item.getContainerUser()); // 用箱人
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setCourseType(item.getCourseType()); // 进场；类型
			if (StringUtils.isNotEmpty(item.getDomesticForeignTrade()))
				model.setDomesticForeignTrade(item.getDomesticForeignTrade()); // 内外贸
			else
				model.setDomesticForeignTrade(" "); // 内外贸
			if (item.getManHour() != null)
				model.setManHour(item.getManHour().toString()); // 工时
			model.setIsQualityKey(item.getQualityType()); // 质检类型
			model.setIsQualityLang(item.getQualityType()); // 质检类型
			model.setRepairStateLang(item.getReferralState()); // 派工状态
			if (item.getReferralTime() != null)
				model.setReferralDate(sdf.format(item.getReferralTime()));
			model.setIsSurrenderKey(item.getIsSurrender()); // 退租箱
			model.setIsSurrenderLang(item.getIsSurrender()); // 退租箱
			model.setQualityStateKey(item.getQualityResult()); // 质检结果
			model.setQualityStateLang(item.getQualityResult()); // 质检结果
			model.setQualityStateOneKey(item.getQualityState()); // 质检结果
			model.setQualityStateOneLang(item.getQualityState()); // 质检结果
			model.setContainerCondition(item.getContainerCondition()); // 箱况
			outList.add(model);
		}
		pagedList.setDataList(outList);
		return pagedList;
	}

	private PagedList<SearchQualitysOutput> getUnitSonQualityList(SearchQualitysInput input) {
		UnitCourseExample example = new UnitCourseExample();
		UnitCourseExample.Criteria criteria = example.createCriteria();
		UnitCourseExample.Criteria criteria1 = example.createCriteria();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
			criteria1.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 质检类型
		if (StringUtils.isNotEmpty(input.getIsQuality())) {
			criteria.andQualityTypeEqualTo(input.getIsQuality());
			criteria1.andQualityTypeEqualTo(input.getIsQuality());
			// 质检状态
			if (QualityTypeEnum.QUALITYTYPE_REPEAT.getCode().equals(input.getIsQuality())) {
				criteria.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
				criteria1.andQualityStateEqualTo(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			} else {
				criteria.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				criteria1.andQualityResultEqualTo(QualityStateEnum.QUALITY_DEFAULT.getCode());
				if (QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode().equals(input.getIsQuality())) {
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
		// 质检结果
		if (StringUtils.isNotEmpty(input.getQualityState())) {
			if (QualityStateEnum.QUALITY_COMPLETE.getCode().equals(input.getQualityState())) {
				criteria.andQualityStateEqualTo(input.getQualityState());
				criteria1.andQualityStateEqualTo(input.getQualityState());
			} else {
				criteria.andQualityResultEqualTo(input.getQualityState());
				criteria1.andQualityResultEqualTo(input.getQualityState());
			}
		}
		example.or(criteria1);
		// 分页查询
		int total = (int) unitCourseMapper.countByExample(example);
		PagedList<SearchQualitysOutput> pagedList = new PagedList<SearchQualitysOutput>(input.getPageIndex(),
				input.getPageSize(), total);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		example.setOrderByClause(" referral_time desc");
		List<UnitCourse> courseList = unitCourseMapper.selectByExample(example);

		// 组装数据
		List<SearchQualitysOutput> outList = new ArrayList<>();
		for (UnitCourse item : courseList) {
			SearchQualitysOutput model = new SearchQualitysOutput();
			model.setProdCourseId(item.getProdCourseId()); // 进场id
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setSizeKey(item.getSize()); // 尺寸
			model.setSizeLang(item.getSize()); // 尺寸
			model.setContainerTypeKey(item.getContainerType()); // 箱型
			model.setContainerTypeLang(item.getContainerType()); // 箱型
			model.setContainerUserKey(item.getContainerUser()); // 用箱人
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setCourseType(item.getCourseType()); // 进场；类型
			if (item.getManHour() != null)
				model.setManHour(item.getManHour().toString()); // 工时
			model.setIsQualityKey(item.getQualityType()); // 质检类型
			model.setIsQualityLang(item.getQualityType()); // 质检类型
			model.setDomesticForeignTrade(" "); // 退租箱
			model.setRepairStateLang(item.getReferralState()); // 派工状态
			if (item.getReferralTime() != null)
				model.setReferralDate(sdf.format(item.getReferralTime()));
			model.setQualityStateKey(item.getQualityResult()); // 质检结果
			model.setQualityStateLang(item.getQualityResult()); // 质检结果
			model.setQualityStateOneKey(item.getQualityState()); // 质检结果
			model.setQualityStateOneLang(item.getQualityState()); // 质检结果
			model.setContainerCondition(item.getUnitState()); // 箱况
			model.setUnitCompanyKey(item.getUnitCompany()); // 冷机公司
			model.setUnitTypeKey(item.getUnitType()); // 机型

			outList.add(model);
		}
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * app质检明细
	 */
	@Override
	public QualitysContOutput containerQualityDetails(String prodCourseId, String containerCategory) {
		QualitysContOutput model = new QualitysContOutput();
		if (!ContainerCategoryEnum.isUnit(containerCategory)) {
			CourseWithBLOBs course = courseMapper.selectByPrimaryKey(prodCourseId);
			// 修后照片
			model.setAfterPhoto(course.getAfterPhoto());
			// 质检照片
			model.setQualityPhoto(course.getQualityPhoto());
			// 复检图片
			model.setRecheckPhoto(course.getRecheckPhoto());
		} else {
			UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(prodCourseId);
			// 修后照片
			model.setAfterPhoto(unit.getAfterPhoto());
			// 质检照片
			model.setQualityPhoto(unit.getQualityPhoto());
			// 复检图片
			model.setRecheckPhoto(unit.getRecheckPhoto());
		}
		List<QualitysContEntryOutput> list = qualitysExtMapper.getQualitysContList(prodCourseId, containerCategory);
		model.setDataList(list);
		return model;
	}

	/**
	 * app质检明细-机组
	 */
	@Override
	public QualitysUnitOutput unitReferralDetails(String prodCourseId) {
		QualitysUnitOutput model = new QualitysUnitOutput();
		UnitCourseWithBLOBs course = unitCourseMapper.selectByPrimaryKey(prodCourseId);
		// 修后照片
		model.setAfterPhoto(course.getAfterPhoto());
		// 质检照片
		model.setQualityPhoto(course.getQualityPhoto());
		List<QualitysUnitEntryOutput> list = qualitysExtMapper.getQualitysUnitList(prodCourseId,
				ContainerCategoryEnum.CONTAINER_03.getCode());
		model.setDataList(list);
		return model;
	}

	/**
	 * 提交质检明细-箱体
	 */
	@Override
	public void updateQualityContEntry(QualitysContInput input) {
		// 箱体进场信息
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
		// 机组进场信息
		UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
		// 质检结果
		if (QualityStateEnum.QUALITY_OK.getCode().equals(input.getQualityResult())) {
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
				unit.setQualityPhoto(input.getQualityPhoto()); // 质检图片
				unit.setRecheckPhoto(input.getRecheckPhoto()); // 复检图片
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
				}
				UnitCourseExample example = new UnitCourseExample();
				example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
				unitCourseMapper.updateByExampleSelective(unit, example);
			} else {
				course.setQualityPhoto(input.getQualityPhoto()); // 质检图片
				course.setRecheckPhoto(input.getRecheckPhoto()); // 复检图片
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
				}
				CourseExample example = new CourseExample();
				example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
				courseMapper.updateByExampleSelective(course, example);
			}
		} else if (input.getQualityResult().equals(QualityStateEnum.QUALITY_NOTOK.getCode())) {
			// 判断质检状态
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
				if (QualityStateEnum.QUALITY_FINISHWORK.getCode().equals(unit.getQualityState())) {
					unit.setQualityPhoto(input.getRecheckPhoto()); // 复检图片
					unit.setUpdateTime(new Date());
					unit.setUpdateUser(getCurrentUserId());
					UnitCourseExample example = new UnitCourseExample();
					example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
					unitCourseMapper.updateByExampleSelective(unit, example);
					return;
				}
			} else {
				if (QualityStateEnum.QUALITY_FINISHWORK.getCode().equals(course.getQualityState())) {
					course.setQualityPhoto(input.getRecheckPhoto()); // 复检图片
					course.setUpdateTime(new Date());
					course.setUpdateUser(getCurrentUserId());
					CourseExample example = new CourseExample();
					example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
					courseMapper.updateByExampleSelective(course, example);
					return;
				}
			}
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
			List<ReferralEntry> referralEntry = refrralEntryMapper.selectByExample(reExample);
			if (referralEntry.size() > 0)
				order = referralEntry.get(0).getSerialNumber();

			// 获取公司key
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<Yard> yardList = yardMapper.selectByExample(yardExample);
			if (yardList.size() < 1)
				return;

			// 遍历条目信息
			for (QualitysContEntryInput item : input.getPartList()) {
				// 判断条目类型是否不为空，为空则表示条目正常，不需要修改
				if (StringUtils.isNotEmpty(item.getQualityState())) {
					// 错项
					if (QualityStateEnum.QUALITY_ERROR.getCode().equals(item.getQualityState())) {
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
					else if (QualityStateEnum.QUALITY_BACK.getCode().equals(item.getQualityState())) {
						order++;
						// 添加派工单明细
						AddReferralEntry(item, input, course, unit, yardList.get(0).getCompany(), order);
						// if (ReplyStateEnum.UNDO.getCode().equals(replyState)) {
						// // 调用估价单修改方法
						// AddEvaluationEntry(model, yardList.get(0).getCompany(), course);
						// }
					}
					// 漏项
					else if (QualityStateEnum.QUALITY_LEAK.getCode().equals(item.getQualityState())) {
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
		}
		// 质检结果,修改主表数据
		if (QualityStateEnum.QUALITY_NOTOK.getCode().equals(input.getQualityResult())) {
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
				unit.setQualityResult(QualityStateEnum.QUALITY_NOTOK.getCode()); // 质检不合格
				unit.setQualityState(QualityStateEnum.QUALITY_DISPATCHED.getCode()); // 质检状态
				unit.setQualityPhoto(input.getQualityPhoto()); // 质检图片
				unit.setRecheckPhoto(input.getRecheckPhoto()); // 复检图片
				unit.setQualityUser(getCurrentUserId());
				unit.setQualityTime(new Date());
				unit.setUpdateTime(new Date());
				unit.setUpdateUser(getCurrentUserId());
				unit.setQualityTimeout(0.d);
				if (QualityTypeEnum.QUALITYTYPE_MUST.getCode().equals(unit.getQualityType())
						&& unit.getReferralTime() != null) {
					Double timeOut = getTimeOut(ContainerCategoryEnum.CONTAINER_03.getCode(), unit.getReferralTime());
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
				course.setRecheckPhoto(input.getRecheckPhoto()); // 复检图片
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
	 * 提交质检明细-机组(删除)
	 */
	@Override
	public void updateQualityUnitEntry(QualitysUnitInput input) {
		UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(input.getProdCourseId());
		unit.setQualityPhoto(input.getQualityPhoto()); // 质检图片
		unit.setRecheckPhoto(input.getRecheckPhoto()); // 附件图片
		unit.setQualityResult(input.getQualityResult()); // 质检结果
		unit.setQualityUser(getCurrentUserId());
		unit.setQualityTime(new Date());
		// 质检不合格
		if (input.getQualityResult().equals(QualityStateEnum.QUALITY_NOTOK.getCode()))
			unit.setQualityState(QualityStateEnum.QUALITY_DISPATCHED.getCode());
		unitCourseMapper.updateByPrimaryKey(unit);
		// 条目序号
		Integer order = 0;
		ReferralEntryExample reExample = new ReferralEntryExample();
		reExample.createCriteria().andCourseEqualTo(input.getProdCourseId())
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		reExample.setOrderByClause("serial_number desc");
		List<ReferralEntry> referralEntry = refrralEntryMapper.selectByExample(reExample);
		if (referralEntry.size() > 0)
			order = referralEntry.get(0).getSerialNumber();
		// 条目
		for (QualitysUnitEntryInput item : input.getPartList()) {
			// 错项
			if (item.getQualityState().equals(QualityStateEnum.QUALITY_ERROR.getCode())) {
				ReferralEntry entry = refrralEntryMapper.selectByPrimaryKey(item.getCourseEntryId());
				entry.setManHour(0.d);
				entry.setQualityState(QualityStateEnum.QUALITY_ERROR.getCode());
				entry.setUpdateTime(new Date());
				entry.setUpdateUser(getCurrentUserId());
				refrralEntryMapper.updateByPrimaryKey(entry);
			}
			// 漏项or返工，添加新的条目
			else if (item.getQualityState().equals(QualityStateEnum.QUALITY_BACK.getCode())
					|| item.getQualityState().equals(QualityStateEnum.QUALITY_LEAK.getCode())) {
				order++;
				ReferralEntry entry = refrralEntryMapper.selectByPrimaryKey(item.getCourseEntryId());
				entry.setProdReferralEntryId(courseService.generateCourseEntryKey(unit.getContainerNo()));
				entry.setSerialNumber(order);
				entry.setCourse(input.getProdCourseId());
				entry.setContainerCategory(input.getContainerType());
				entry.setIsRepair(CommonEnum.YES.getCode());
				entry.setQualityState(item.getQualityState());
				entry.setPartsTypeCode(item.getPartTypeCode());
				entry.setPartsDetailsCode(item.getPartDetailCode());
				entry.setRepairCode(item.getRepairCode());
				entry.setDamageCode(item.getDamageCode());
				entry.setQuantity(Double.valueOf(item.getQuantity()));
				entry.setRemarks(item.getRemarks());
				entry.setSparesNumber(item.getSparesNum());
				entry.setPickingQuantity(0.d);
				entry.setBorrowQuantity(0.d);
				entry.setPickingState(StockoutEnum.NOTOUT.getCode());
				entry.setManHour(0.d);
				entry.setIsDel(PlatformConstants.ISDEL_NO);
				entry.setCreateTime(new Date());
				entry.setCreateUser(getCurrentUserId());
				// entry.setphoto 图片暂定存储位置
				refrralEntryMapper.insert(entry);
				if (item.getQualityState().equals(QualityStateEnum.QUALITY_BACK.getCode())) {
					QualityReworkWithBLOBs rework = new QualityReworkWithBLOBs();
					rework.setCourse(input.getProdCourseId());
					rework.setReferralEntryId(entry.getProdReferralEntryId());
					rework.setState(QualityStateEnum.QUALITY_DISPATCHED.getCode());
					rework.setIsTechnology(item.getIsTechnology());
					rework.setReworkQuestion(item.getReworkQuestion());
					rework.setRectificationStandard(item.getRectificationStandard());
					rework.setBackCause(item.getReasonConten());
					rework.setIsDel(PlatformConstants.ISDEL_NO);
					rework.setCreateTime(new Date());
					rework.setCreateUser(getCurrentUserId());
					qualityReworkMapper.insert(rework);
				}
			}
		}
	}

	/**
	 * 获取质检错项原因
	 */
	@Override
	public List<QualityReasonsOutput> getQualityReasons(String reasonType) {
		// 获取错误类型key
		String errorKey = QualityStateEnum.getMessagebyCode(reasonType);
		ReasonExample example = new ReasonExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andReasonTypeEqualTo(errorKey);
		List<Reason> list = reasonMapper.selectByExample(example);
		return list.stream().map(a -> {
			QualityReasonsOutput model = new QualityReasonsOutput();
			model.setReasonKey(a.getKey());
			model.setReasonContentLang(a.getKey());
			return model;
		}).collect(Collectors.toList());
	}

	/**
	 * 获取返工问题类别和整改标准列表
	 */
	@Override
	public List<QualityStandardsOutput> getQualityStandards(String containerCategory) {
		// 获取所有的问题类型
		ReworkQuestionExample example = new ReworkQuestionExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andContainerCategoryEqualTo(containerCategory);
		List<ReworkQuestion> rectList = reworkQuestionMapper.selectByExample(example);
		// 返回
		return rectList.stream().map(a -> {
			QualityStandardsOutput model = new QualityStandardsOutput();
			model.setRectStandardTypeKey(a.getKey());
			model.setRectStandardTypeNameLang(a.getKey());
			// 根据问题类型获取整改标准
			RectificationStandardExample itemExample = new RectificationStandardExample();
			itemExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andReworkQuestionEqualTo(a.getKey());
			List<StandardOutput> sList = rectificationStandardMapper.selectByExample(itemExample).stream().map(s -> {
				StandardOutput standard = new StandardOutput();
				standard.setStandardKey(s.getKey());
				standard.setStandardNameLang(s.getKey());
				return standard;
			}).collect(Collectors.toList());
			model.setStandardsList(sList);
			return model;
		}).collect(Collectors.toList());
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
		// 调用费率
		output = rateService.getRateMessage(rateInput);
		return output;
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
	private ReferralEntry AddReferralEntry(QualitysContEntryInput item, QualitysContInput input, CourseWithBLOBs course,
			UnitCourseWithBLOBs unit, String company, Integer order) {
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
			referral.setQualityState(item.getQualityState()); // 质检状态
			referral.setPhoto(item.getPhoto()); // 修前图片
			referral.setPayingParty(item.getPayingParty()); // 付费方
			referral.setRemarks(item.getRemarks()); // 备注
			referral.setIsDel(PlatformConstants.ISDEL_NO);
			// referral.setWarehouseType(item.getWarehouseType());// 仓库类型
			// 费率相关字段
			referral.setRateId(item.getRateId()); // 费率主键
			referral.setFiveCode(item.getFiveCode()); // 五位代码
			if (!QualityStateEnum.QUALITY_LEAK.getCode().equals(item.getQualityState()))
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
			referral.setQualityCause(item.getReasonConten()); // 原因
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
			model.setQualityState(item.getQualityState()); // 质检状态
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setPayingParty(item.getPayingParty()); // 付费方
			model.setRemarks(item.getRemarks()); // 备注
			model.setIsDel(PlatformConstants.ISDEL_NO);
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());
			// model.setWarehouseType(item.getWarehouseType());// 仓库类型
			// 费率相关字段
			model.setRateId(item.getRateId()); // 费率主键
			model.setFiveCode(item.getFiveCode()); // 五位代码
			if (!QualityStateEnum.QUALITY_LEAK.getCode().equals(item.getQualityState()))
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
			model.setQualityCause(item.getReasonConten()); // 原因
			// 添加派工明细
			referralEntryMapper.insert(model);
			// 判断生成预出库单
			referralService.addPlanStock(course, model);
			// 调用发泡添加接口
			foamingService.addFoaming(course.getProdCourseId());
			return model;
		}
	}

}
