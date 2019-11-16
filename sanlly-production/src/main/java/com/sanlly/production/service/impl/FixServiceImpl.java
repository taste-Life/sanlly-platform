package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.enums.StaffBorrowTypeEnum;
import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.input.finance.PoolSourceRepairInput;
import com.sanlly.common.models.input.fixIn.PickingListSearchInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.fixOut.PickingListDetailOutput;
import com.sanlly.common.models.output.fixOut.PickingListEntryOutput;
import com.sanlly.common.models.output.fixOut.PickingListOutput;
import com.sanlly.common.models.output.fixOut.PickingListSparesOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.PickingListMapper;
import com.sanlly.production.dao.PlanStockMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.WorkGroupMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.PickingList;
import com.sanlly.production.entity.PickingListExample;
import com.sanlly.production.entity.PlanStock;
import com.sanlly.production.entity.PlanStockExample;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.enums.CleaningPatternEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.QualityStateEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.models.input.fix.FixDeviceListInput;
import com.sanlly.production.models.input.fix.FixReferralBatchInput;
import com.sanlly.production.models.input.fix.FixReferralDesignateInput;
import com.sanlly.production.models.input.fix.FixReferralEntryInput;
import com.sanlly.production.models.input.fix.FixReferralFinishInput;
import com.sanlly.production.models.input.fix.FixReferralSingleInput;
import com.sanlly.production.models.input.fix.FixReferralsListInput;
import com.sanlly.production.models.input.fix.FixReferralsSearchInput;
import com.sanlly.production.models.input.fix.FixReplaceSparesInput;
import com.sanlly.production.models.input.fix.FixSparesNumSubmitInput;
import com.sanlly.production.models.input.fix.PickingListBatchOutInput;
import com.sanlly.production.models.input.fix.PickingListOutInput;
import com.sanlly.production.models.input.fix.PlanStockInput;
import com.sanlly.production.models.output.fix.FixPickingListOutput;
import com.sanlly.production.models.output.fix.FixReferralsDetailsOutput;
import com.sanlly.production.models.output.fix.FixReferralsListOutput;
import com.sanlly.production.models.output.fix.FixReferralsOutput;
import com.sanlly.production.models.output.fix.FixSparesListOutput;
import com.sanlly.production.models.output.fix.FixSparesOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.ContainerUserService;
import com.sanlly.production.service.FinanceService;
import com.sanlly.production.service.FixService;
import com.sanlly.production.service.WarehouseClient;
import com.sanlly.production.service.YardService;

/**
 *    
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO 生产维修相关接口
 * @author tianzhl   
 * @date 2019年9月7日 下午4:39:43 
 * @version V1.0   
 */
@Service
public class FixServiceImpl extends BaseServiceImpl implements FixService {

	@Autowired
	private CourseMapper courseDao;

	@Autowired
	private UnitCourseMapper unitCourseDao;

	@Autowired
	private MaintenanceMapper maintenanceDao;

	@Autowired
	private AuthService authClient;

	@Autowired
	private PlanStockMapper planStockDao;

	@Autowired
	private ReferralEntryMapper referralEntryDao;

	@Autowired
	private PickingListMapper pickingListDao;

	@Autowired
	private WarehouseClient warehouseClient;

	@Autowired
	private FinanceService financeService;

	@Autowired
	private ContainerUserService containerUserService;

	@Autowired
	private WorkGroupMapper workGroupDao;

	@Autowired
	private YardService yardService;

	/**
	 *  
	 * 
	 * @Description: TODO 派工单列表 -- app
	 * @param input
	 * @return PagedList<FixSparesOutput> 派工单列表
	 * @throws Exception
	 */
	@Override
	public PagedList<FixReferralsOutput> fixReferrals(FixReferralsSearchInput input) throws Exception {

		PagedList<FixReferralsOutput> pagedList = new PagedList<FixReferralsOutput>(input.getIndex(), input.getSize());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		List<FixReferralsOutput> outputList = new ArrayList<FixReferralsOutput>();
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			// TODO Auto-generated method stub
			CourseExample courseExample = new CourseExample();
			CourseExample.Criteria criteria = courseExample.createCriteria();
			// 箱号
			if (StringUtils.isNotBlank(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
			}
			// 箱类别
			if (StringUtils.isNotBlank(input.getContainerCategory())) {
				criteria.andContainerCategoryEqualTo(StringUtils.trim(input.getContainerCategory()));
			}
			// 派工状态
			if (StringUtils.isNotBlank(input.getReferralState())) {
				if (ReferralStateEnum.COMPLETED.getCode().equals(input.getReferralState())) {
					criteria.andReferralStateEqualTo(ReferralStateEnum.COMPLETED.getCode())
							.andQualityStateNotEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode());
				} else if (ReferralStateEnum.QUALITY.getCode().equals(input.getReferralState())) {
					criteria.andReferralStateEqualTo(ReferralStateEnum.COMPLETED.getCode())
							.andQualityStateEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode());
				} else {
					criteria.andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode());
				}
			} else {
				criteria.andReferralStateIn(Arrays.asList(ReferralStateEnum.COMPLETED.getCode(),
						ReferralStateEnum.REFERRALED.getCode(), ReferralStateEnum.UNREFERRAL.getCode()));
			}
			// 分页查询
			int total = (int) courseDao.countByExample(courseExample);
			courseExample.setLimitStart(pagedList.getLimitStart());
			courseExample.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			courseExample.setOrderByClause(" course_time desc");
			List<CourseWithBLOBs> courses = courseDao.selectByExampleWithBLOBs(courseExample);
			// 转换输出实体
			outputList = courses.stream().map(course -> {
				FixReferralsOutput output = new FixReferralsOutput();
				output.setProdCourseId(course.getProdCourseId());
				output.setContainerNo(course.getContainerNo());
				output.setSizeNameLang(course.getSize());
				output.setContainerTypeNameLang(course.getContainerType());
				output.setIsSurrender(course.getIsSurrender());
				output.setYardNameLang(course.getYard());
				ReferralEntryExample example = new ReferralEntryExample();
				example.createCriteria().andCourseEqualTo(course.getProdCourseId())
						.andContainerCategoryEqualTo(input.getContainerCategory())
						.andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode());
				long count = referralEntryDao.countByExample(example);
				if (count > 0) {
					output.setPickingState(PickingStateEnum.NOPICKING.getCode());
				} else {
					output.setPickingState(PickingStateEnum.PICKINGED.getCode());
				}
				output.setPickingStateNameLang(output.getPickingState());
				output.setReferralState(course.getReferralState());
				output.setReferralStateNameLang(course.getReferralState());
				output.setQualityState(course.getQualityState());
				output.setQualityStateNameLang(course.getQualityState());
				output.setManHour(StringUtil.valueOf(course.getManHour()));
				output.setAfterPhoto(course.getAfterPhoto());
				if (course.getReferralTime() != null) {
					output.setReferralDate(sdf.format(course.getReferralTime()));
				}
				output.setContainerUserNameLang(course.getContainerUser());
				if (course.getDesignateUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getDesignateUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							output.setRepairTeam(user.getUserName());
						}
					}
				}
				return output;
			}).collect(Collectors.toList());
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			// TODO Auto-generated method stub
			MaintenanceExample unitCourseExample = new MaintenanceExample();
			MaintenanceExample.Criteria criteria = unitCourseExample.createCriteria();
			// 箱号
			if (StringUtils.isNotBlank(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
			}
			// 派工状态
			if (StringUtils.isNotBlank(input.getReferralState())) {
				criteria.andReferralStateEqualTo(StringUtils.trim(input.getReferralState()));
			} else {
				criteria.andReferralStateIn(Arrays.asList(ReferralStateEnum.COMPLETED.getCode(),
						ReferralStateEnum.REFERRALED.getCode(), ReferralStateEnum.UNREFERRAL.getCode()));
			}

			// 分页查询
			int total = (int) maintenanceDao.countByExample(unitCourseExample);
			unitCourseExample.setLimitStart(pagedList.getLimitStart());
			unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			unitCourseExample.setOrderByClause(" testing_time desc");
			List<MaintenanceWithBLOBs> unitCourses = maintenanceDao.selectByExampleWithBLOBs(unitCourseExample);
			// 转换输出实体
			outputList = unitCourses.stream().map(unitCourse -> {
				FixReferralsOutput output = new FixReferralsOutput();
				output.setProdCourseId(unitCourse.getProdMaintenanceId());
				output.setContainerNo(unitCourse.getContainerNo());
				output.setUnitTypeNameLang(unitCourse.getUnitType());
				Course course = courseDao.selectByPrimaryKey(unitCourse.getProdMaintenanceId());
				if (course != null) {
					output.setSizeNameLang(course.getSize());
					output.setContainerTypeNameLang(course.getContainerType());
					output.setIsSurrender(course.getIsSurrender());
					output.setYardNameLang(course.getYard());
					output.setContainerUserNameLang(course.getContainerUser());
				}
				ReferralEntryExample example = new ReferralEntryExample();
				example.createCriteria().andCourseEqualTo(unitCourse.getProdMaintenanceId())
						.andContainerCategoryEqualTo(input.getContainerCategory())
						.andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode());
				long count = referralEntryDao.countByExample(example);
				if (count > 0) {
					output.setPickingState(PickingStateEnum.NOPICKING.getCode());
				} else {
					output.setPickingState(PickingStateEnum.PICKINGED.getCode());
				}
				output.setManHour(StringUtil.valueOf(unitCourse.getManHour()));
				output.setAfterPhoto(unitCourse.getAfterPhoto());
				if (unitCourse.getReferralTime() != null) {
					output.setReferralDate(sdf.format(unitCourse.getReferralTime()));
				}
				if (unitCourse.getDesignateUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(unitCourse.getDesignateUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							output.setRepairTeam(user.getUserName());
						}
					}
				}
				return output;
			}).collect(Collectors.toList());
		} else {
			// TODO Auto-generated method stub
			UnitCourseExample unitCourseExample = new UnitCourseExample();
			UnitCourseExample.Criteria criteria = unitCourseExample.createCriteria();
			// 箱号
			if (StringUtils.isNotBlank(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
			}
			// 派工状态
			if (StringUtils.isNotBlank(input.getReferralState())) {
				if (ReferralStateEnum.COMPLETED.getCode().equals(input.getReferralState())) {
					criteria.andReferralStateEqualTo(ReferralStateEnum.COMPLETED.getCode())
							.andQualityStateNotEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode());
				} else if (ReferralStateEnum.QUALITY.getCode().equals(input.getReferralState())) {
					criteria.andReferralStateEqualTo(ReferralStateEnum.COMPLETED.getCode())
							.andQualityStateEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode());
				} else {
					criteria.andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode());
				}
			} else {
				criteria.andReferralStateIn(Arrays.asList(ReferralStateEnum.COMPLETED.getCode(),
						ReferralStateEnum.REFERRALED.getCode(), ReferralStateEnum.UNREFERRAL.getCode()));
			}

			// 分页查询
			int total = (int) unitCourseDao.countByExample(unitCourseExample);
			unitCourseExample.setLimitStart(pagedList.getLimitStart());
			unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			unitCourseExample.setOrderByClause(" testing_time desc");
			List<UnitCourseWithBLOBs> unitCourses = unitCourseDao.selectByExampleWithBLOBs(unitCourseExample);
			// 转换输出实体
			outputList = unitCourses.stream().map(unitCourse -> {
				FixReferralsOutput output = new FixReferralsOutput();
				output.setProdCourseId(unitCourse.getProdCourseId());
				output.setContainerNo(unitCourse.getContainerNo());
				output.setUnitTypeNameLang(unitCourse.getUnitType());
				Course course = courseDao.selectByPrimaryKey(unitCourse.getProdCourseId());
				if (course != null) {
					output.setSizeNameLang(course.getSize());
					output.setContainerTypeNameLang(course.getContainerType());
					output.setIsSurrender(course.getIsSurrender());
					output.setYardNameLang(course.getYard());
					output.setContainerUserNameLang(course.getContainerUser());
				}
				ReferralEntryExample example = new ReferralEntryExample();
				example.createCriteria().andCourseEqualTo(unitCourse.getProdCourseId())
						.andContainerCategoryEqualTo(input.getContainerCategory())
						.andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode());
				long count = referralEntryDao.countByExample(example);
				if (count > 0) {
					output.setPickingState(PickingStateEnum.NOPICKING.getCode());
				} else {
					output.setPickingState(PickingStateEnum.PICKINGED.getCode());
				}
				output.setManHour(StringUtil.valueOf(unitCourse.getManHour()));
				output.setAfterPhoto(unitCourse.getAfterPhoto());
				if (unitCourse.getReferralTime() != null) {
					output.setReferralDate(sdf.format(unitCourse.getReferralTime()));
				}
				if (unitCourse.getDesignateUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(unitCourse.getDesignateUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							output.setRepairTeam(user.getUserName());
						}
					}
				}
				return output;
			}).collect(Collectors.toList());
		}

		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 派工单列表 -- web
	 * @param input
	 * @return PagedList<FixReferralsListOutput> 派工单列表
	 * @throws Exception
	 */
	@Override
	public PagedList<FixReferralsListOutput> fixReferralsList(FixReferralsListInput input) throws Exception {
		PagedList<FixReferralsListOutput> pagedList = new PagedList<FixReferralsListOutput>(input.getPageIndex(),
				input.getPageSize());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<FixReferralsListOutput> outputList = new ArrayList<FixReferralsListOutput>();
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			// TODO Auto-generated method stub
			CourseExample courseExample = new CourseExample();
			CourseExample.Criteria criteria = courseExample.createCriteria();
			// 箱号
			if (StringUtils.isNotBlank(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
			}
			// 用箱人
			if (StringUtils.isNotBlank(input.getContainerUser())) {
				criteria.andContainerUserEqualTo(StringUtils.trim(input.getContainerUser()));
			}
			// 进场类型
			if (StringUtils.isNotBlank(input.getCourseType())) {
				criteria.andCourseTypeEqualTo(StringUtils.trim(input.getCourseType()));
			}
			// 箱型
			if (StringUtils.isNotBlank(input.getContainerType())) {
				criteria.andContainerTypeEqualTo(StringUtils.trim(input.getContainerType()));
			}
			// 箱类别
			if (StringUtils.isNotBlank(input.getContainerCategory())) {
				criteria.andContainerCategoryEqualTo(StringUtils.trim(input.getContainerCategory()));
			}
			// 班组
			if (StringUtils.isNotBlank(input.getDesignateUser())) {
				criteria.andDesignateUserEqualTo(Integer.valueOf(input.getDesignateUser()));
			}
			// 场站
			if (StringUtils.isNotBlank(input.getYard())) {
				criteria.andYardEqualTo(StringUtils.trim(input.getYard()));
			}
			// 派工状态
			if (input.getReferralState() != null && input.getReferralState().length > 0) {
				criteria.andReferralStateIn(Arrays.asList(input.getReferralState()));
			} else {
				criteria.andReferralStateIn(
						Arrays.asList(ReferralStateEnum.COMPLETED.getCode(), ReferralStateEnum.REFERRALED.getCode()));
			}

			// 派工开始时间
			if (StringUtils.isNotBlank(input.getStartDate())) {
				criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getStartDate())));
			}

			// 派工结束时间
			if (StringUtils.isNotBlank(input.getEndDate())) {
				criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(StringUtils.trim(input.getEndDate())));
			}

			// 分页查询
			int total = (int) courseDao.countByExample(courseExample);
			courseExample.setLimitStart(pagedList.getLimitStart());
			courseExample.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			courseExample.setOrderByClause(" referral_time desc");
			List<Course> courses = courseDao.selectByExample(courseExample);
			// 转换输出实体
			outputList = courses.stream().map(course -> {
				return courseTofixReferrals(course, input.getContainerCategory());
			}).collect(Collectors.toList());
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			// TODO Auto-generated method stub
			MaintenanceExample courseExample = new MaintenanceExample();
			MaintenanceExample.Criteria criteria = courseExample.createCriteria();
			// 箱号
			if (StringUtils.isNotBlank(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
			}
			// 用箱人
			if (StringUtils.isNotBlank(input.getContainerUser())) {
				criteria.andContainerUserEqualTo(StringUtils.trim(input.getContainerUser()));
			}
			// 进场类型
			if (StringUtils.isNotBlank(input.getCourseType())) {
				criteria.andCourseTypeEqualTo(StringUtils.trim(input.getCourseType()));
			}
			// 箱型
			if (StringUtils.isNotBlank(input.getContainerType())) {
				criteria.andContainerTypeEqualTo(StringUtils.trim(input.getContainerType()));
			}
			// 班组
			if (StringUtils.isNotBlank(input.getDesignateUser())) {
				criteria.andDesignateUserEqualTo(Integer.valueOf(input.getDesignateUser()));
			}
			// 场站
			if (StringUtils.isNotBlank(input.getYard())) {
				criteria.andYardEqualTo(StringUtils.trim(input.getYard()));
			}
			// 派工状态
			if (input.getReferralState() != null && input.getReferralState().length > 0) {
				criteria.andReferralStateIn(Arrays.asList(input.getReferralState()));
			} else {
				criteria.andReferralStateIn(
						Arrays.asList(ReferralStateEnum.COMPLETED.getCode(), ReferralStateEnum.REFERRALED.getCode()));
			}

			// 派工开始时间
			if (StringUtils.isNotBlank(input.getStartDate())) {
				criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getStartDate())));
			}

			// 派工结束时间
			if (StringUtils.isNotBlank(input.getEndDate())) {
				criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(StringUtils.trim(input.getEndDate())));
			}

			// 分页查询
			int total = (int) maintenanceDao.countByExample(courseExample);
			courseExample.setLimitStart(pagedList.getLimitStart());
			courseExample.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			courseExample.setOrderByClause(" referral_time desc");
			List<Maintenance> unitCourses = maintenanceDao.selectByExample(courseExample);
			if (unitCourses != null && unitCourses.size() > 0) {
				// 转换输出实体
				outputList = unitCourses.stream().map(course -> {
					return maintenanceTofixReferrals(course.getProdMaintenanceId(), input.getContainerCategory());
				}).collect(Collectors.toList());
			}
		} else {
			// TODO Auto-generated method stub
			UnitCourseExample courseExample = new UnitCourseExample();
			UnitCourseExample.Criteria criteria = courseExample.createCriteria();
			// 箱号
			if (StringUtils.isNotBlank(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
			}
			// 用箱人
			if (StringUtils.isNotBlank(input.getContainerUser())) {
				criteria.andContainerUserEqualTo(StringUtils.trim(input.getContainerUser()));
			}
			// 进场类型
			if (StringUtils.isNotBlank(input.getCourseType())) {
				criteria.andCourseTypeEqualTo(StringUtils.trim(input.getCourseType()));
			}
			// 箱型
			if (StringUtils.isNotBlank(input.getContainerType())) {
				criteria.andContainerTypeEqualTo(StringUtils.trim(input.getContainerType()));
			}
			// 班组
			if (StringUtils.isNotBlank(input.getDesignateUser())) {
				criteria.andDesignateUserEqualTo(Integer.valueOf(input.getDesignateUser()));
			}
			// 场站
			if (StringUtils.isNotBlank(input.getYard())) {
				criteria.andYardEqualTo(StringUtils.trim(input.getYard()));
			}
			// 派工状态
			if (input.getReferralState() != null && input.getReferralState().length > 0) {
				criteria.andReferralStateIn(Arrays.asList(input.getReferralState()));
			} else {
				criteria.andReferralStateIn(
						Arrays.asList(ReferralStateEnum.COMPLETED.getCode(), ReferralStateEnum.REFERRALED.getCode()));
			}

			// 派工开始时间
			if (StringUtils.isNotBlank(input.getStartDate())) {
				criteria.andReferralTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getStartDate())));
			}

			// 派工结束时间
			if (StringUtils.isNotBlank(input.getEndDate())) {
				criteria.andReferralTimeLessThanOrEqualTo(sdf.parse(StringUtils.trim(input.getEndDate())));
			}

			// 分页查询
			int total = (int) unitCourseDao.countByExample(courseExample);
			courseExample.setLimitStart(pagedList.getLimitStart());
			courseExample.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			courseExample.setOrderByClause(" referral_time desc");
			List<UnitCourse> unitCourses = unitCourseDao.selectByExample(courseExample);
			if (unitCourses != null && unitCourses.size() > 0) {
				CourseExample example = new CourseExample();
				example.createCriteria().andProdCourseIdIn(
						unitCourses.stream().map(UnitCourse::getProdCourseId).collect(Collectors.toList()));
				List<Course> courses = courseDao.selectByExample(example);
				// 转换输出实体
				outputList = courses.stream().map(course -> {
					return courseTofixReferrals(course, input.getContainerCategory());
				}).collect(Collectors.toList());
			}
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 派工单基本信息 -- web
	 * @param input
	 * @return FixReferralsListOutput 派工单列表
	 * @throws Exception
	 */
	public FixReferralsListOutput fixReferralsInfo(FixReferralSingleInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			return maintenanceTofixReferrals(input.getProdCourseId(), input.getContainerCategory());
		} else {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			return courseTofixReferrals(course, input.getContainerCategory());
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 进场实体转化为派工输出实体
	 * @param course
	 * @param containerCategory
	 * @return
	 * @throws Exception FixReferralsListOutput @throws 
	 */
	private FixReferralsListOutput courseTofixReferrals(Course course, String containerCategory) {
		if (course == null || StringUtils.isBlank(containerCategory)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		FixReferralsListOutput output = new FixReferralsListOutput();
		output.setProdCourseId(course.getProdCourseId());
		output.setContainerNo(course.getContainerNo());
		output.setSizeLang(course.getSize());
		output.setContainerTypeLang(course.getContainerType());
		output.setContainerUserLang(course.getContainerUser());
		output.setContainerBelongLang(course.getContainerBelong());
		output.setCourseTypeLang(course.getCourseType());
		output.setIsSurrenderLang(course.getIsSurrender());
		output.setIsSurrenderKey(course.getIsSurrender());
		output.setYardLang(course.getYard());
		ReferralEntryExample example = new ReferralEntryExample();
		example.createCriteria().andCourseEqualTo(course.getProdCourseId())
				.andContainerCategoryEqualTo(containerCategory)
				.andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode());
		long count = referralEntryDao.countByExample(example);
		if (count > 0) {
			output.setPickingStateKey(PickingStateEnum.NOPICKING.getCode());
		} else {
			output.setPickingStateKey(PickingStateEnum.PICKINGED.getCode());
		}
		UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(course.getProdCourseId());
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(containerCategory)) {
			output.setUseReplyStateLang(course.getUseReplyState());
			output.setIsPreviewLang(course.getIsPreview());
			output.setIsPreviewKey(course.getIsPreview());
			if (course.getCourseTime() != null) {
				output.setCourseTime(sdf.format(course.getCourseTime()));
			}
			output.setTestingRemarks(course.getTestingRemarks());
			output.setReferralStateLang(course.getReferralState());
			output.setReferralStateKey(course.getReferralState());
			output.setQualityStateKey(course.getQualityState());
			if (unitCourse != null) {
				output.setManHour(StringUtil.valueOf(unitCourse.getManHour()));
			}
			output.setRemark(course.getTestingRemarks());
			if (course.getValuationUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getValuationUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setValuationUser(user.getUserName());
					}
				}
			}
			if (course.getFinishUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getFinishUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setFinishUser(user.getUserName());
					}
				}
			}
			if (course.getDesignateUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setRepairTeam(user.getUserName());
					}
				}
			}
			if (course.getTestingEndTime() != null) {
				output.setTestingEndTime(sdf.format(course.getTestingEndTime()));
			}
			if (course.getUseReplyTime() != null) {
				output.setUseReplyTime(sdf.format(course.getUseReplyTime()));
			}
			if (course.getFinishTime() != null) {
				output.setFinishTime(sdf.format(course.getFinishTime()));
			}
			if (course.getReferralTime() != null) {
				output.setReferralDate(sdf.format(course.getReferralTime()));
			}
		} else {
			output.setUseReplyStateLang(unitCourse.getUseReplyState());
			output.setIsPreviewLang(unitCourse.getIsPreview());
			output.setIsPreviewKey(unitCourse.getIsPreview());
			output.setTestingRemarks(unitCourse.getTestingRemarks());
			if (course.getCourseTime() != null) {
				output.setCourseTime(sdf.format(course.getCourseTime()));
			}
			output.setReferralStateLang(unitCourse.getReferralState());
			output.setReferralStateKey(unitCourse.getReferralState());
			output.setQualityStateKey(unitCourse.getQualityState());
			output.setRemark(unitCourse.getTestingRemarks());
			output.setManHour(StringUtil.valueOf(course.getManHour()));
			if (unitCourse.getValuationUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(unitCourse.getValuationUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setValuationUser(user.getUserName());
					}
				}
			}
			if (unitCourse.getFinishUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(unitCourse.getFinishUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setFinishUser(user.getUserName());
					}
				}
			}
			if (unitCourse.getDesignateUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(unitCourse.getDesignateUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setRepairTeam(user.getUserName());
					}
				}
			}
			if (unitCourse.getTestingEndTime() != null) {
				output.setTestingEndTime(sdf.format(unitCourse.getTestingEndTime()));
			}
			if (unitCourse.getUseReplyTime() != null) {
				output.setUseReplyTime(sdf.format(unitCourse.getUseReplyTime()));
			}
			if (unitCourse.getFinishTime() != null) {
				output.setFinishTime(sdf.format(unitCourse.getFinishTime()));
			}
			if (unitCourse.getReferralTime() != null) {
				output.setReferralDate(sdf.format(unitCourse.getReferralTime()));
			}
			output.setUnitTypeLang(unitCourse.getUnitType());
		}
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 进场实体转化为派工输出实体
	 * @param course
	 * @param containerCategory
	 * @return
	 * @throws Exception FixReferralsListOutput @throws 
	 */
	private FixReferralsListOutput maintenanceTofixReferrals(String prodMaintenanceId, String containerCategory) {
		if (prodMaintenanceId == null || StringUtils.isBlank(containerCategory)) {
			return null;
		}
		MaintenanceWithBLOBs course = maintenanceDao.selectByPrimaryKey(prodMaintenanceId);
		if (course == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		FixReferralsListOutput output = new FixReferralsListOutput();
		output.setProdCourseId(course.getProdMaintenanceId());
		output.setContainerNo(course.getContainerNo());
		output.setSizeLang(course.getSize());
		output.setContainerTypeLang(course.getContainerType());
		output.setContainerUserLang(course.getContainerUser());
//		output.setContainerBelongLang(course.getContainerBelong());
		output.setCourseTypeLang(course.getCourseType());
		output.setIsSurrenderLang(course.getIsSurrender());
		output.setIsSurrenderKey(course.getIsSurrender());
		output.setYardLang(course.getYard());
		ReferralEntryExample example = new ReferralEntryExample();
		example.createCriteria().andCourseEqualTo(course.getProdMaintenanceId())
				.andContainerCategoryEqualTo(containerCategory)
				.andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode());
		long count = referralEntryDao.countByExample(example);
		if (count > 0) {
			output.setPickingStateKey(PickingStateEnum.NOPICKING.getCode());
		} else {
			output.setPickingStateKey(PickingStateEnum.PICKINGED.getCode());
		}
		output.setUseReplyStateLang(course.getValuationState());
//		output.setIsPreviewLang(course.getIsPreview());
//		output.setIsPreviewKey(course.getIsPreview());
		if (course.getCourseTime() != null) {
			output.setCourseTime(sdf.format(course.getCourseTime()));
		}
		output.setTestingRemarks(course.getTestingRemarks());
		output.setReferralStateLang(course.getReferralState());
		output.setReferralStateKey(course.getReferralState());
		output.setManHour(StringUtil.valueOf(course.getManHour()));
		output.setRemark(course.getTestingRemarks());
		if (course.getValuationUser() != null) {
			Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getValuationUser());
			if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
				UserInfoOutput user = rlt.getData();
				if (user != null) {
					output.setValuationUser(user.getUserName());
				}
			}
		}
		if (course.getFinishUser() != null) {
			Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getFinishUser());
			if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
				UserInfoOutput user = rlt.getData();
				if (user != null) {
					output.setFinishUser(user.getUserName());
				}
			}
		}
		if (course.getDesignateUser() != null) {
			Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getDesignateUser());
			if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
				UserInfoOutput user = rlt.getData();
				if (user != null) {
					output.setRepairTeam(user.getUserName());
				}
			}
		}
		if (course.getTestingEndTime() != null) {
			output.setTestingEndTime(sdf.format(course.getTestingEndTime()));
		}
		if (course.getRespondTime() != null) {
			output.setUseReplyTime(sdf.format(course.getRespondTime()));
		}
		if (course.getFinishTime() != null) {
			output.setFinishTime(sdf.format(course.getFinishTime()));
		}
		if (course.getReferralTime() != null) {
			output.setReferralDate(sdf.format(course.getReferralTime()));
		}
		output.setUnitTypeLang(course.getUnitType());
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取领料备件列表
	 * @param input
	 * @return List<FixSparesOutput> 领料备件列表
	 * @throws Exception
	 */
	@Override
	public List<FixSparesOutput> fixSpares(FixReferralBatchInput input) throws Exception {

		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseIn(Arrays.asList(input.getProdCourseIdList()))
				.andContainerCategoryEqualTo(input.getContainerCategory());
		List<PlanStock> planStocks = planStockDao.selectByExample(example);

		if (planStocks != null && planStocks.size() > 0) {
			Map<String, PlanStock> planStockMap = new HashMap<String, PlanStock>();
			Set<String> sparePartsNos = new HashSet<String>();
			for (PlanStock planStock : planStocks) {
				String key = planStock.getSparesNumber() + StringUtil.doubleToIntString(planStock.getWidth())
						+ StringUtil.doubleToIntString(planStock.getLength());
				if (planStockMap.containsKey(key)) {
					PlanStock pStock = planStockMap.get(key);
					pStock.setQuantity(pStock.getQuantity() + planStock.getQuantity());
					planStockMap.put(key, pStock);
				} else {
					planStockMap.put(key, planStock);
					sparePartsNos.add(planStock.getSparesNumber());
				}
			}
			Result<List<StockOutput>> result = warehouseClient.getStockBySparePartsNos(new ArrayList<>(sparePartsNos));
			Map<String, String> surplus = new HashMap<String, String>();
			if (result != null && result.getCode() == 0 && result.getData() != null) {
				for (StockOutput stockOutput : result.getData()) {
					surplus.put(stockOutput.getSparePartsNo(), StringUtil.valueOf(stockOutput.getActualSurplusNum()));
				}
			}
			return planStockMap.values().stream().map(PlanStock -> {
				FixSparesOutput output = new FixSparesOutput();
				output.setLength(StringUtil.valueOf(PlanStock.getLength()));
				output.setQuantity(StringUtil.valueOf(PlanStock.getQuantity()));
				output.setSparesNum(PlanStock.getSparesNumber());
				output.setWidth(StringUtil.valueOf(PlanStock.getWidth()));
				output.setSurplusNum(surplus.get(PlanStock.getSparesNumber()));
				return output;
			}).collect(Collectors.toList());
		}
		return new ArrayList<FixSparesOutput>();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取领料备件列表
	 * @param input
	 * @return List<FixSparesOutput> 领料备件列表
	 * @throws Exception
	 */
	@Override
	public List<FixSparesOutput> fixSparesSingle(FixReferralEntryInput input) throws Exception {

		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()))
				.andContainerCategoryEqualTo(input.getContainerCategory());
		List<PlanStock> planStocks = planStockDao.selectByExample(example);

		if (planStocks != null && planStocks.size() > 0) {
			Map<String, PlanStock> planStockMap = new HashMap<String, PlanStock>();
			Set<String> sparePartsNos = new HashSet<String>();
			for (PlanStock planStock : planStocks) {
				String key = planStock.getSparesNumber() + StringUtil.doubleToIntString(planStock.getWidth())
						+ StringUtil.doubleToIntString(planStock.getLength());
				if (planStockMap.containsKey(key)) {
					PlanStock pStock = planStockMap.get(key);
					pStock.setQuantity(pStock.getQuantity() + planStock.getQuantity());
					planStockMap.put(key, pStock);
				} else {
					planStockMap.put(key, planStock);
					sparePartsNos.add(planStock.getSparesNumber());
				}
			}
			Result<List<StockOutput>> result = warehouseClient.getStockBySparePartsNos(new ArrayList<>(sparePartsNos));
			Map<String, String> surplus = new HashMap<String, String>();
			if (result != null && result.getCode() == 0 && result.getData() != null) {
				for (StockOutput stockOutput : result.getData()) {
					surplus.put(stockOutput.getSparePartsNo(), StringUtil.valueOf(stockOutput.getActualSurplusNum()));
				}
			}
			return planStockMap.values().stream().map(PlanStock -> {
				FixSparesOutput output = new FixSparesOutput();
				output.setLength(StringUtil.valueOf(PlanStock.getLength()));
				output.setQuantity(StringUtil.valueOf(PlanStock.getQuantity()));
				output.setSparesNum(PlanStock.getSparesNumber());
				output.setWidth(StringUtil.valueOf(PlanStock.getWidth()));
				output.setSurplusNum(surplus.get(PlanStock.getSparesNumber()));
				return output;
			}).collect(Collectors.toList());
		}
		return new ArrayList<FixSparesOutput>();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量领料
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void fixPicking(FixReferralBatchInput input) throws Exception {

		PickingList record = new PickingList();
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		record.setPickingState(PickingStateEnum.PICKINGED.getCode());
		record.setPickingTime(new Date());
		record.setPickingUser(getCurrentUserId());
		record.setRemarks("");
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		Result<String> result = warehouseClient.getBillNumberBykey("LKBILLTYPE000080", getCurrentCompanyKey());
		record.setReferralNo(result.getData());
		pickingListDao.insert(record);

		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseIn(Arrays.asList(input.getProdCourseIdList()));
		PlanStock model = new PlanStock();
		// 需要统一生成领料单号的接口
		model.setReferralNo(record.getReferralNo());
		model.setPickingState(PickingStateEnum.PICKINGED.getCode());
		planStockDao.updateByExampleSelective(model, example);

		ReferralEntryExample referralEntryExample = new ReferralEntryExample();
		referralEntryExample.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseIn(Arrays.asList(input.getProdCourseIdList()));
		ReferralEntry recode = new ReferralEntry();
		recode.setPickingState(PickingStateEnum.PICKINGED.getCode());
		referralEntryDao.updateByExampleSelective(recode, referralEntryExample);

	}

	/**
	 *  
	 * 
	 * @Description: TODO 单箱领料
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void fixPickingSingle(FixReferralEntryInput input) throws Exception {
		PickingList record = new PickingList();
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		record.setPickingState(PickingStateEnum.PICKINGED.getCode());
		record.setPickingTime(new Date());
		record.setPickingUser(getCurrentUserId());
		record.setRemarks("");
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		Result<String> result = warehouseClient.getBillNumberBykey("LKBILLTYPE000080", getCurrentCompanyKey());
		record.setReferralNo(result.getData());
		pickingListDao.insert(record);

		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()));
		PlanStock model = new PlanStock();
		model.setReferralNo(record.getReferralNo());
		model.setPickingState(PickingStateEnum.PICKINGED.getCode());
		planStockDao.updateByExampleSelective(model, example);

		ReferralEntryExample referralEntryExample = new ReferralEntryExample();
		referralEntryExample.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andProdReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()));
		ReferralEntry recode = new ReferralEntry();
		recode.setPickingState(PickingStateEnum.PICKINGED.getCode());
		referralEntryDao.updateByExampleSelective(recode, referralEntryExample);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量完工
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void fixFinish(FixReferralBatchInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseExample example = new CourseExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			CourseWithBLOBs model = new CourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setFinishUser(getCurrentUserId());
			model.setFinishTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setReferralState(ReferralStateEnum.COMPLETED.getCode());
			courseDao.updateByExampleSelective(model, example);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceExample example = new MaintenanceExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdMaintenanceIdIn(Arrays.asList(input.getProdCourseIdList()));
			MaintenanceWithBLOBs model = new MaintenanceWithBLOBs();
			model.setUpdateTime(new Date());
			model.setFinishUser(getCurrentUserId());
			model.setFinishTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setValuationState(ReplyStateEnum.UNREPLY.getCode());
			model.setReferralState(ReferralStateEnum.COMPLETED.getCode());
			maintenanceDao.updateByExampleSelective(model, example);
		} else {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			UnitCourseWithBLOBs model = new UnitCourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setFinishUser(getCurrentUserId());
			model.setFinishTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setReferralState(ReferralStateEnum.COMPLETED.getCode());
			unitCourseDao.updateByExampleSelective(model, example);
		}

		for (String prodCourseId : input.getProdCourseIdList()) {
			finishFinance(prodCourseId, input.getContainerCategory());
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量质检完工
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void fixQualityFinish(FixReferralBatchInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseExample example = new CourseExample();
			example.createCriteria().andQualityStateEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode())
					.andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			CourseWithBLOBs model = new CourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setQualityState(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			courseDao.updateByExampleSelective(model, example);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			// 保修暂无质检
		} else {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andQualityStateEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode())
					.andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			UnitCourseWithBLOBs model = new UnitCourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setQualityState(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			unitCourseDao.updateByExampleSelective(model, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 单箱完工
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void fixFinishSingle(FixReferralFinishInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseExample example = new CourseExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdCourseIdEqualTo(input.getProdCourseId());
			CourseWithBLOBs model = new CourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setFinishUser(getCurrentUserId());
			model.setFinishTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setReferralState(ReferralStateEnum.COMPLETED.getCode());
			if (StringUtils.isNotBlank(input.getAfterPhoto())) {
				model.setAfterPhoto(input.getAfterPhoto());
			}
			courseDao.updateByExampleSelective(model, example);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceExample example = new MaintenanceExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdMaintenanceIdEqualTo(input.getProdCourseId());
			MaintenanceWithBLOBs model = new MaintenanceWithBLOBs();
			model.setUpdateTime(new Date());
			model.setFinishUser(getCurrentUserId());
			model.setFinishTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setValuationState(ReplyStateEnum.UNREPLY.getCode());
			model.setReferralState(ReferralStateEnum.COMPLETED.getCode());
			if (StringUtils.isNotBlank(input.getAfterPhoto())) {
				model.setAfterPhoto(input.getAfterPhoto());
			}
			maintenanceDao.updateByExampleSelective(model, example);
		} else {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdCourseIdEqualTo(input.getProdCourseId());
			UnitCourseWithBLOBs model = new UnitCourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setFinishUser(getCurrentUserId());
			model.setFinishTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setReferralState(ReferralStateEnum.COMPLETED.getCode());
			if (StringUtils.isNotBlank(input.getAfterPhoto())) {
				model.setAfterPhoto(input.getAfterPhoto());
			}
			unitCourseDao.updateByExampleSelective(model, example);
		}

		finishFinance(input.getProdCourseId(), input.getContainerCategory());

	}

	/**
	 *  
	 * 
	 * @Description: TODO 单箱质检完工
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void fixQualityFinishSingle(FixReferralFinishInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseExample example = new CourseExample();
			example.createCriteria().andQualityStateEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode())
					.andProdCourseIdEqualTo(input.getProdCourseId());
			CourseWithBLOBs model = new CourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setQualityState(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			if (StringUtils.isNotBlank(input.getAfterPhoto())) {
				model.setAfterPhoto(input.getAfterPhoto());
			}
			courseDao.updateByExampleSelective(model, example);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {

		} else {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andQualityStateEqualTo(QualityStateEnum.QUALITY_DISPATCHED.getCode())
					.andProdCourseIdEqualTo(input.getProdCourseId());
			UnitCourseWithBLOBs model = new UnitCourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setQualityState(QualityStateEnum.QUALITY_FINISHWORK.getCode());
			if (StringUtils.isNotBlank(input.getAfterPhoto())) {
				model.setAfterPhoto(input.getAfterPhoto());
			}
			unitCourseDao.updateByExampleSelective(model, example);
		}

		finishFinance(input.getProdCourseId(), input.getContainerCategory());

	}

	/**
	 *  
	 * 
	 * @Description: TODO 派工单明细
	 * @param input
	 * @return List<FixReferralsDetailsOutput> 派工单明细
	 * @throws Exception
	 */
	@Override
	public List<FixReferralsDetailsOutput> fixreFerralDetails(FixReferralSingleInput input) throws Exception {

		List<FixReferralsDetailsOutput> output = new ArrayList<FixReferralsDetailsOutput>();
		ReferralEntryExample example = new ReferralEntryExample();
		example.createCriteria().andCourseEqualTo(input.getProdCourseId())
				.andContainerCategoryEqualTo(input.getContainerCategory()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ReferralEntry> referralEntries = referralEntryDao.selectByExampleWithBLOBs(example);
		if (referralEntries != null && referralEntries.size() > 0) {
			output = referralEntries.stream().map(referralEntrie -> {
				FixReferralsDetailsOutput rdOutput = new FixReferralsDetailsOutput();
				rdOutput.setReferralEntryId(referralEntrie.getProdReferralEntryId());
				rdOutput.setPositionCode(referralEntrie.getPositionCode());
				rdOutput.setRepairCodeLang(referralEntrie.getRepairCode());
				rdOutput.setPartsRepairCodeLang(referralEntrie.getPartsRepairCode());
				rdOutput.setPartsDetailCodeLang(referralEntrie.getPartsDetailsCode());
				rdOutput.setMaterialCodeLang(referralEntrie.getMaterialCode());
				rdOutput.setSparesNum(referralEntrie.getSparesNumber());
				rdOutput.setDevice(referralEntrie.getDevice());
				rdOutput.setPayingParty(referralEntrie.getPayingParty());
				rdOutput.setSparesNumNameLang(referralEntrie.getSparesNumber());
				rdOutput.setDeviceNameLang(referralEntrie.getDevice());
				rdOutput.setPayingPartyNameLang(referralEntrie.getPayingParty());
				rdOutput.setLength(StringUtil.doubleToIntString(referralEntrie.getLength()));
				rdOutput.setWidth(StringUtil.doubleToIntString(referralEntrie.getWidth()));
				rdOutput.setQuantity(StringUtil.doubleToEffectString(referralEntrie.getQuantity()));
				rdOutput.setRemarks(referralEntrie.getRemarks());
				rdOutput.setManHour(StringUtil.doubleToEffectString(referralEntrie.getManHour()));
				rdOutput.setRemarks(referralEntrie.getRemarks());
				rdOutput.setQualityState(referralEntrie.getQualityState());
				rdOutput.setPhoto(referralEntrie.getPhoto());
				rdOutput.setPickingState(referralEntrie.getPickingState());
				rdOutput.setSerialNumber(StringUtil.valueOf(referralEntrie.getSerialNumber()));
				rdOutput.setIsTechnology(referralEntrie.getIsTechnology());
				rdOutput.setReworkQuestionLang(referralEntrie.getReworkQuestion());
				rdOutput.setRectificationStandardLang(referralEntrie.getRectificationStandard());
				rdOutput.setWarehouseType(referralEntrie.getWarehouseType());
				rdOutput.setWarehouseTypeNameLang(referralEntrie.getWarehouseType());
				rdOutput.setCompany(referralEntrie.getCompany());
				rdOutput.setCompanyNameLang(referralEntrie.getCompany());
				rdOutput.setWarehouse(referralEntrie.getWarehouse());
				rdOutput.setWarehouseNameLang(referralEntrie.getWarehouse());
				return rdOutput;
			}).collect(Collectors.toList());
		}
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 上传修后照片
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void containerUploadAfterPhoto(FixReferralFinishInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			CourseWithBLOBs model = new CourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setAfterPhoto(input.getAfterPhoto());
			courseDao.updateByExampleSelective(model, example);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceExample example = new MaintenanceExample();
			example.createCriteria().andProdMaintenanceIdEqualTo(input.getProdCourseId());
			MaintenanceWithBLOBs model = new MaintenanceWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setAfterPhoto(input.getAfterPhoto());
			maintenanceDao.updateByExampleSelective(model, example);
		} else {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
			UnitCourseWithBLOBs model = new UnitCourseWithBLOBs();
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setAfterPhoto(input.getAfterPhoto());
			unitCourseDao.updateByExampleSelective(model, example);
		}

	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取修后照片
	 * @param input
	 * @return String 修后照片
	 * @throws Exception
	 */
	@Override
	public String containerAfterPhoto(FixReferralSingleInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseWithBLOBs courseWithBLOBs = courseDao.selectByPrimaryKey(input.getProdCourseId());
			if (courseWithBLOBs != null) {
				return courseWithBLOBs.getAfterPhoto();
			}
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceWithBLOBs courseWithBLOBs = maintenanceDao.selectByPrimaryKey(input.getProdCourseId());
			if (courseWithBLOBs != null) {
				return courseWithBLOBs.getAfterPhoto();
			}
		} else {
			UnitCourseWithBLOBs unitCourseWithBLOBs = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			if (unitCourseWithBLOBs != null) {
				return unitCourseWithBLOBs.getAfterPhoto();
			}
		}
		return null;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 强制不出
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void fixNotout(FixReferralEntryInput input) throws Exception {
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()));
		PlanStock model = new PlanStock();
		model.setPickingState(PickingStateEnum.NOTSTOCKOUT.getCode());
		planStockDao.updateByExampleSelective(model, example);

		ReferralEntryExample referralEntryExample = new ReferralEntryExample();
		referralEntryExample.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andProdReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()));
		ReferralEntry recode = new ReferralEntry();
		recode.setPickingState(PickingStateEnum.NOTSTOCKOUT.getCode());
		referralEntryDao.updateByExampleSelective(recode, referralEntryExample);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据主件获取备件列表
	 * @param device
	 * @return String 主件
	 * @throws Exception
	 */
	@Override
	public List<SpareTestingOutput> spareNumList(String device) throws Exception {
		if (StringUtils.isNotBlank(device)) {
			Result<List<String>> result = warehouseClient.getSPListByMDNo(device);
			if (result != null && result.getCode() == 0 && result.getData() != null) {
				return result.getData().stream().map(sparesNum -> {
					SpareTestingOutput output = new SpareTestingOutput();
					output.setSparesNum(sparesNum);
					output.setSparesNameLang(sparesNum);
					return output;
				}).collect(Collectors.toList());
			}
		}
		return new ArrayList<SpareTestingOutput>();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 提交备件号
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void sparesNumSubmit(FixSparesNumSubmitInput input) throws Exception {
		if (StringUtils.isNotBlank(input.getReferralEntryId()) && StringUtils.isNotBlank(input.getSparesNum())) {

			PlanStockExample planStockExample = new PlanStockExample();
			planStockExample.createCriteria().andReferralEntryIdEqualTo(input.getReferralEntryId());
			PlanStock model = new PlanStock();
			model.setSparesNumber(input.getSparesNum());
			model.setPickingState(PickingStateEnum.NOPICKING.getCode());
			planStockDao.updateByExampleSelective(model, planStockExample);

			ReferralEntryExample example = new ReferralEntryExample();
			example.createCriteria().andProdReferralEntryIdEqualTo(input.getReferralEntryId());
			ReferralEntry record = new ReferralEntry();
			record.setSparesNumber(input.getSparesNum());
			record.setPickingState(PickingStateEnum.NOPICKING.getCode());
			referralEntryDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 换件
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void sparesNumReplace(FixReplaceSparesInput input) throws Exception {
		if (StringUtils.isNotBlank(input.getProdCourseId()) && input.getSparesNumList() != null) {
			for (FixSparesNumSubmitInput sparesNumSubmitInput : input.getSparesNumList()) {
				sparesNumSubmit(sparesNumSubmitInput);
			}
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取领料单
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<FixPickingListOutput> pickingList(FixReferralSingleInput input) throws Exception {
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andCourseEqualTo(input.getProdCourseId())
				.andContainerCategoryEqualTo(input.getContainerCategory());
		List<PlanStock> planStocks = planStockDao.selectByExample(example);
		if (planStocks != null && planStocks.size() > 0) {
			return planStocks.stream().map(PlanStock -> {
				FixPickingListOutput output = new FixPickingListOutput();
				output.setLength(StringUtil.valueOf(PlanStock.getLength()));
				output.setQuantity(StringUtil.valueOf(PlanStock.getQuantity()));
				output.setSparesNum(PlanStock.getSparesNumber());
				output.setSparesNumNameLang(PlanStock.getSparesNumber());
				output.setWidth(StringUtil.valueOf(PlanStock.getWidth()));
				output.setBorrowQuantity(StringUtil.valueOf(PlanStock.getBorrowQuantity()));
				output.setPickingQuantity(StringUtil.valueOf(PlanStock.getPickingQuantity()));
				output.setPickingStateLang(PlanStock.getPickingState());
				output.setReferralEntryId(PlanStock.getReferralEntryId());
				output.setReferralNo(PlanStock.getReferralNo());
				return output;
			}).collect(Collectors.toList());
		}
		return new ArrayList<FixPickingListOutput>();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据主件列表获取主件备件列表
	 * @param input
	 * @return String 主件
	 * @throws Exception
	 */
	@Override
	public List<FixSparesListOutput> deviceSpareNumList(FixDeviceListInput input) throws Exception {
		List<FixSparesListOutput> outputs = new ArrayList<FixSparesListOutput>();
		if (input != null && input.getDeviceList() != null && input.getDeviceList().size() > 0) {
			for (String device : input.getDeviceList()) {
				List<SpareTestingOutput> sparesList = spareNumList(device);
				FixSparesListOutput output = new FixSparesListOutput();
				output.setDevice(device);
				output.setSparesList(sparesList);
				outputs.add(output);
			}
		}
		return outputs;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量指派
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void fixDesignate(FixReferralDesignateInput input) throws Exception {
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseExample example = new CourseExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			CourseWithBLOBs model = new CourseWithBLOBs();
			model.setDesignateUser(Integer.valueOf(input.getDesignateUser()));
			model.setDesignateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			courseDao.updateByExampleSelective(model, example);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceExample example = new MaintenanceExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdMaintenanceIdIn(Arrays.asList(input.getProdCourseIdList()));
			MaintenanceWithBLOBs model = new MaintenanceWithBLOBs();
			model.setDesignateUser(Integer.valueOf(input.getDesignateUser()));
			model.setDesignateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			maintenanceDao.updateByExampleSelective(model, example);
		} else {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
					.andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			UnitCourseWithBLOBs model = new UnitCourseWithBLOBs();
			model.setDesignateUser(Integer.valueOf(input.getDesignateUser()));
			model.setDesignateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			unitCourseDao.updateByExampleSelective(model, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 领料单出库列表
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public PagedList<PickingListOutput> pickingList(PickingListSearchInput input) throws Exception {
		PagedList<PickingListOutput> pagedList = new PagedList<PickingListOutput>(input.getPageIndex(),
				input.getPageSize());
		// TODO Auto-generated method stub
		PickingListExample pickingListExample = new PickingListExample();
		PickingListExample.Criteria criteria = pickingListExample.createCriteria();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		criteria.andPickingStateNotEqualTo(PickingStateEnum.NOPICKING.getCode());
		// 用箱人
		if (StringUtils.isNotBlank(input.getReferralNo())) {
			criteria.andReferralNoLike("%" + input.getReferralNo() + "%");
		}
		// 进场类型
		if (StringUtils.isNotBlank(input.getPickingState())) {
			criteria.andPickingStateEqualTo(StringUtils.trim(input.getPickingState()));
		}

		// 进场类型
		if (StringUtils.isNotBlank(input.getPickingUser())) {
			criteria.andPickingUserEqualTo(Integer.valueOf(input.getPickingUser()));
		}

		// 派工开始时间
		if (StringUtils.isNotBlank(input.getStartDate())) {
			criteria.andPickingTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getStartDate())));
		}

		// 派工结束时间
		if (StringUtils.isNotBlank(input.getEndDate())) {
			criteria.andPickingTimeLessThanOrEqualTo(sdf.parse(StringUtils.trim(input.getEndDate())));
		}

		// 分页查询
		int total = (int) pickingListDao.countByExample(pickingListExample);
		pickingListExample.setLimitStart(pagedList.getLimitStart());
		pickingListExample.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		pickingListExample.setOrderByClause(" create_time desc");
		List<PickingList> pickingLists = pickingListDao.selectByExample(pickingListExample);
		// 转换输出实体
		List<PickingListOutput> outputList = pickingLists.stream().map(pickingList -> {
			PickingListOutput output = new PickingListOutput();
			output.setProdPickingListId(StringUtil.valueOf(pickingList.getProdPickingListId()));
			output.setPickingStateNameLang(pickingList.getPickingState());
			output.setPickingState(pickingList.getPickingState());
			output.setPickingTime(DateUtil.date2String(pickingList.getPickingTime()));
			output.setPickingUser(StringUtil.valueOf(pickingList.getPickingUser()));
			if (pickingList.getPickingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(pickingList.getPickingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setPickingUserName(user.getUserName());
					}
				}
			}
			output.setReferralNo(pickingList.getReferralNo());
			output.setRemarks(pickingList.getRemarks());
			output.setCreateUser(StringUtil.valueOf(pickingList.getCreateUser()));
			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 领料单批量出库
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void pickingListBatchOut(PickingListBatchOutInput input) throws Exception {
		// 领料单出库
		PickingListExample pickingListExample = new PickingListExample();
		pickingListExample.createCriteria().andPickingStateNotEqualTo(PickingStateEnum.STOCKOUTALL.getCode())
				.andReferralNoIn(input.getReferralNoList());
		PickingList pickingList = new PickingList();
		pickingList.setPickingState(PickingStateEnum.STOCKOUTALL.getCode());
		pickingList.setUpdateTime(new Date());
		pickingList.setUpdateUser(getCurrentUserId());
		pickingListDao.updateByExampleSelective(pickingList, pickingListExample);

		// 派工单明细
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateNotEqualTo(PickingStateEnum.STOCKOUTALL.getCode())
				.andReferralNoIn(input.getReferralNoList());
		List<PlanStock> planStocks = planStockDao.selectByExample(example);
		if (planStocks != null && planStocks.size() > 0) {

			ReferralEntryExample referralEntryExample = new ReferralEntryExample();
			referralEntryExample.createCriteria().andPickingStateNotEqualTo(PickingStateEnum.STOCKOUTALL.getCode())
					.andProdReferralEntryIdIn(
							planStocks.stream().map(PlanStock::getReferralEntryId).collect(Collectors.toList()));
			ReferralEntry recode = new ReferralEntry();
			recode.setPickingState(PickingStateEnum.PICKINGED.getCode());
			recode.setUpdateTime(new Date());
			recode.setUpdateUser(getCurrentUserId());
			referralEntryDao.updateByExampleSelective(recode, referralEntryExample);
		}

		// 预出库出库
		PlanStock model = new PlanStock();
		model.setPickingState(PickingStateEnum.PICKINGED.getCode());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		planStockDao.updateByExampleSelective(model, example);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 出库领料单
	 * @param referralNo
	 * @return
	 * @throws Exception
	 */
	@Override
	public PickingListDetailOutput pickingListDetail(String referralNo) throws Exception {
		PickingListDetailOutput pickingListDetailOutput = new PickingListDetailOutput();
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andReferralNoEqualTo(referralNo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		List<PlanStock> planStocks = planStockDao.selectByExample(example);

		if (planStocks != null && planStocks.size() > 0) {
			Map<String, List<PickingListEntryOutput>> pickingListSparesMap = new HashMap<String, List<PickingListEntryOutput>>();
			Set<String> sparePartsNos = new HashSet<String>();
			for (PlanStock planStock : planStocks) {
				String key = planStock.getSparesNumber() + StringUtil.doubleToIntString(planStock.getWidth())
						+ StringUtil.doubleToIntString(planStock.getLength());
				PickingListEntryOutput output = new PickingListEntryOutput();
				output.setBorrowQuantity(planStock.getBorrowQuantity());
				output.setContainerNo(planStock.getContainerNo());
				output.setLength(planStock.getLength());
				output.setPickingQuantity(planStock.getPickingQuantity());
				output.setPickingStateLang(planStock.getPickingState());
				output.setQuantity(planStock.getQuantity());
				output.setReferralEntryId(planStock.getReferralEntryId());
				output.setRemarks(planStock.getRemarks());
				output.setSparesNumber(planStock.getSparesNumber());
				output.setWidth(planStock.getWidth());
				if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(planStock.getContainerCategory())) {
					output.setStaffBorrowType(StaffBorrowTypeEnum.GUARANTEE.getCode());
				} else {
					output.setStaffBorrowType(StaffBorrowTypeEnum.REPAIR.getCode());
				}
				if (pickingListSparesMap.containsKey(key)) {
					List<PickingListEntryOutput> outputs = new ArrayList<PickingListEntryOutput>(
							pickingListSparesMap.get(key));
					outputs.add(output);
					pickingListSparesMap.put(key, outputs);
				} else {
					pickingListSparesMap.put(key, Arrays.asList(output));
					sparePartsNos.add(planStock.getSparesNumber());
				}
			}
			Result<List<StockOutput>> result = warehouseClient.getStockBySparePartsNos(new ArrayList<>(sparePartsNos));
			Map<String, String> surplus = new HashMap<String, String>();
			Map<String, Boolean> mergeMap = new HashMap<String, Boolean>();
			if (result != null && result.getCode() == 0 && result.getData() != null) {
				for (StockOutput stockOutput : result.getData()) {
					surplus.put(stockOutput.getSparePartsNo(), StringUtil.valueOf(stockOutput.getActualSurplusNum()));
					mergeMap.put(stockOutput.getSparePartsNo(),
							CommonEnum.YES.getCode().equals(stockOutput.getIsMergerAcquisition()));
				}
			}
			List<PickingListSparesOutput> sparesList = pickingListSparesMap.values().stream().map(pickingListSpares -> {
				PickingListSparesOutput output = new PickingListSparesOutput();
				double quantity = 0d;
				double pickingQuantity = 0d;
				boolean pickinged = true;
				boolean stockoutall = true;
				for (PickingListEntryOutput pickingListEntryOutput : pickingListSpares) {
					if (pickingListEntryOutput.getQuantity() != null) {
						quantity += pickingListEntryOutput.getQuantity();
					}
					if (pickingListEntryOutput.getPickingQuantity() != null) {
						pickingQuantity += pickingListEntryOutput.getPickingQuantity();
					}
					if (!PickingStateEnum.PICKINGED.getCode().equals(pickingListEntryOutput.getPickingStateLang())) {
						pickinged = false;
					}
					if (!PickingStateEnum.STOCKOUTALL.getCode().equals(pickingListEntryOutput.getPickingStateLang())) {
						stockoutall = false;
					}
				}
				String pickingState = PickingStateEnum.STOCKOUT.getCode();
				if (pickinged) {
					pickingState = PickingStateEnum.PICKINGED.getCode();
				}
				if (stockoutall) {
					pickingState = PickingStateEnum.STOCKOUTALL.getCode();
				}
				output.setPlanStockList(pickingListSpares);
				output.setLength(StringUtil.doubleToIntString(pickingListSpares.get(0).getLength()));
				output.setSparesNumber(pickingListSpares.get(0).getSparesNumber());
				output.setSparesNumberNameLang(pickingListSpares.get(0).getSparesNumber());
				output.setWidth(StringUtil.doubleToIntString(pickingListSpares.get(0).getWidth()));
				output.setPickingStateLang(pickingState);
				output.setQuantity(StringUtil.doubleToIntString(quantity));
				output.setPickingQuantity(StringUtil.doubleToIntString(pickingQuantity));
				output.setSurplusQuantity(surplus.get(output.getSparesNumber()));
				return output;
			}).collect(Collectors.toList());
			List<PickingListSparesOutput> newSparesList = new ArrayList<PickingListSparesOutput>();
			for (PickingListSparesOutput pickingListSparesOutput : sparesList) {
				if (mergeMap.get(pickingListSparesOutput.getSparesNumber())) {
					newSparesList.add(pickingListSparesOutput);
				} else {
					for (PickingListEntryOutput pickingListEntryOutput : pickingListSparesOutput.getPlanStockList()) {
						PickingListSparesOutput output = new PickingListSparesOutput();
						output.setPlanStockList(Arrays.asList(pickingListEntryOutput));
						output.setLength(StringUtil.doubleToIntString(pickingListEntryOutput.getLength()));
						output.setSparesNumber(pickingListEntryOutput.getSparesNumber());
						output.setSparesNumberNameLang(pickingListEntryOutput.getSparesNumber());
						output.setWidth(StringUtil.doubleToIntString(pickingListEntryOutput.getWidth()));
						output.setPickingStateLang(pickingListEntryOutput.getPickingStateLang());
						output.setQuantity(StringUtil.doubleToIntString(pickingListEntryOutput.getQuantity()));
						output.setPickingQuantity(
								StringUtil.doubleToIntString(pickingListEntryOutput.getPickingQuantity()));
						output.setSurplusQuantity(pickingListSparesOutput.getSurplusQuantity());
						newSparesList.add(output);
					}
				}
			}

			PickingListExample pickingListExample = new PickingListExample();
			pickingListExample.createCriteria().andReferralNoEqualTo(referralNo);
			List<PickingList> pickingLists = pickingListDao.selectByExample(pickingListExample);
			if (pickingLists != null && pickingLists.size() > 0) {
				PickingList pickingList = pickingLists.get(0);
				pickingListDetailOutput.setProdPickingListId(StringUtil.valueOf(pickingList.getProdPickingListId()));
				pickingListDetailOutput.setPickingStateLang(pickingList.getPickingState());
				if (pickingList.getPickingTime() != null) {
					pickingListDetailOutput.setPickingTime(sdf.format(pickingList.getPickingTime()));
				}

				if (pickingList.getPickingUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(pickingList.getPickingUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							pickingListDetailOutput.setPickingUser(user.getUserName());
						}
					}
				}
				pickingListDetailOutput.setReferralNo(pickingList.getReferralNo());
				pickingListDetailOutput.setRemarks(pickingList.getRemarks());
				pickingListDetailOutput.setCreateUser(StringUtil.valueOf(pickingList.getCreateUser()));
			}
			pickingListDetailOutput.setSparesList(newSparesList);
		}
		return pickingListDetailOutput;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 领料单出库
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void pickingListOut(PickingListOutInput input) throws Exception {
		Map<String, String> map = input.getPlanStockList().stream()
				.collect(Collectors.toMap(PlanStockInput::getReferralEntryId, PlanStockInput::getQuantity));
		// 预出库出库
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateNotEqualTo(PickingStateEnum.STOCKOUTALL.getCode()).andReferralEntryIdIn(
				input.getPlanStockList().stream().map(PlanStockInput::getReferralEntryId).collect(Collectors.toList()));
		List<PlanStock> planStocks = planStockDao.selectByExample(example);
		for (PlanStock planStock : planStocks) {
			if (Double.valueOf(map.get(planStock.getReferralEntryId())) > 0) {
				if (Double.valueOf(map.get(planStock.getReferralEntryId())) + planStock.getBorrowQuantity()
						+ planStock.getPickingQuantity() >= planStock.getQuantity()) {
					planStock.setPickingState(PickingStateEnum.STOCKOUTALL.getCode());
				} else {
					planStock.setPickingState(PickingStateEnum.STOCKOUT.getCode());
				}
				planStock.setPickingQuantity(
						Double.valueOf(map.get(planStock.getReferralEntryId())) + planStock.getPickingQuantity());
				planStockDao.updateByPrimaryKey(planStock);
				// 派工单明细
				ReferralEntry referralEntry = referralEntryDao.selectByPrimaryKey(planStock.getReferralEntryId());
				referralEntry.setPickingQuantity(planStock.getPickingQuantity());
				referralEntry.setQuantity(planStock.getQuantity());
				referralEntry.setBorrowQuantity(planStock.getBorrowQuantity());
				referralEntry.setPickingState(planStock.getPickingState());
				referralEntryDao.updateByPrimaryKey(referralEntry);
			}
		}
		// 领料单出库
		PlanStockExample planStockExample = new PlanStockExample();
		planStockExample.createCriteria().andPickingStateNotEqualTo(PickingStateEnum.STOCKOUTALL.getCode())
				.andReferralNoEqualTo(input.getReferralNo());
		int count = (int) planStockDao.countByExample(planStockExample);
		PickingListExample pickingListExample = new PickingListExample();
		pickingListExample.createCriteria().andReferralNoEqualTo(input.getReferralNo());
		PickingList pickingList = new PickingList();
		if (count > 0) {
			pickingList.setPickingState(PickingStateEnum.STOCKOUT.getCode());
		} else {
			pickingList.setPickingState(PickingStateEnum.STOCKOUTALL.getCode());
		}
		pickingList.setUpdateTime(new Date());
		pickingList.setUpdateUser(getCurrentUserId());
		pickingListDao.updateByExampleSelective(pickingList, pickingListExample);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 领料单退库
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public void pickingListBack(PickingListOutInput input) throws Exception {

		Map<String, String> map = input.getPlanStockList().stream()
				.collect(Collectors.toMap(PlanStockInput::getReferralEntryId, PlanStockInput::getQuantity));
		// 预出库出库
		PlanStockExample example = new PlanStockExample();
		example.createCriteria()
				.andPickingStateIn(
						Arrays.asList(PickingStateEnum.STOCKOUT.getCode(), PickingStateEnum.STOCKOUTALL.getCode()))
				.andReferralEntryIdIn(input.getPlanStockList().stream().map(PlanStockInput::getReferralEntryId)
						.collect(Collectors.toList()));
		List<PlanStock> planStocks = planStockDao.selectByExample(example);
		for (PlanStock planStock : planStocks) {
			if (Double.valueOf(map.get(planStock.getReferralEntryId())) >= planStock.getQuantity()) {
				if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(planStock.getContainerCategory())
						|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(planStock.getContainerCategory())) {
					planStock.setPickingState(PickingStateEnum.NOPICKING.getCode());
					planStock.setReferralNo("");
				}else {
					planStock.setPickingState(PickingStateEnum.PICKINGED.getCode());
				}
			} else {
				planStock.setPickingState(PickingStateEnum.STOCKOUT.getCode());
			}
			if (planStock.getPickingQuantity() < Double.valueOf(map.get(planStock.getReferralEntryId()))) {
				planStock.setPickingQuantity(0d);
			} else {
				planStock.setPickingQuantity(
						planStock.getPickingQuantity() - Double.valueOf(map.get(planStock.getReferralEntryId())));
			}
			planStockDao.updateByPrimaryKey(planStock);
			// 派工单明细
			ReferralEntry referralEntry = referralEntryDao.selectByPrimaryKey(planStock.getReferralEntryId());
			referralEntry.setPickingQuantity(planStock.getPickingQuantity());
			referralEntry.setQuantity(planStock.getQuantity());
			referralEntry.setBorrowQuantity(planStock.getBorrowQuantity());
			referralEntry.setPickingState(planStock.getPickingState());
			referralEntryDao.updateByPrimaryKey(referralEntry);
		}

		// 领料单出库
		PlanStockExample planStockExample = new PlanStockExample();
		com.sanlly.production.entity.PlanStockExample.Criteria criteria = planStockExample.createCriteria();
		criteria.andReferralNoEqualTo(input.getReferralNo());
		int total = (int) planStockDao.countByExample(planStockExample);
		criteria.andPickingStateNotEqualTo(PickingStateEnum.NOPICKING.getCode());
		int count = (int) planStockDao.countByExample(planStockExample);
		PickingListExample pickingListExample = new PickingListExample();
		pickingListExample.createCriteria().andReferralNoEqualTo(input.getReferralNo());
		PickingList pickingList = new PickingList();
		if (count >= total) {
			pickingList.setPickingState(PickingStateEnum.NOPICKING.getCode());
		} else {
			pickingList.setPickingState(PickingStateEnum.STOCKOUT.getCode());
		}
		pickingList.setUpdateTime(new Date());
		pickingList.setUpdateUser(getCurrentUserId());
		pickingListDao.updateByExampleSelective(pickingList, pickingListExample);

	}

	/**
	 *  
	 * 
	 * @Description: TODO 延期出库
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void fixPostpone(FixReferralEntryInput input) throws Exception {
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()));
		PlanStock model = new PlanStock();
		model.setPickingState(PickingStateEnum.DELAYSTOCKOUT.getCode());
		planStockDao.updateByExampleSelective(model, example);

		ReferralEntryExample referralEntryExample = new ReferralEntryExample();
		referralEntryExample.createCriteria().andPickingStateEqualTo(PickingStateEnum.NOPICKING.getCode())
				.andCourseEqualTo(input.getProdCourseId())
				.andProdReferralEntryIdIn(Arrays.asList(input.getReferralEntryIdList()));
		ReferralEntry recode = new ReferralEntry();
		recode.setPickingState(PickingStateEnum.DELAYSTOCKOUT.getCode());
		referralEntryDao.updateByExampleSelective(recode, referralEntryExample);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 完工财务接口
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public void finishFinance(String prodCourseId, String containerCategory) throws Exception {
		// 构造财务接口参数
		FixReferralSingleInput input = new FixReferralSingleInput();
		input.setProdCourseId(prodCourseId);
		input.setContainerCategory(containerCategory);
		// 班组ID
		Integer workdGroupId = 0;
		// 外包商
		String outCompanyKey = "";
		// 完工工时
		BigDecimal finishedManHour = new BigDecimal(0);
		// 用箱人code 判断是否中远用
		String containerUserCode = "";
		// 箱号
		String containerNo = "";
		// 退租箱
		String isBackLease = "";
		// 场站
		String yard = "";
		// 公司
		String company = "";
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			workdGroupId = course.getFinishUser();
			finishedManHour = new BigDecimal(course.getManHour() == null ? 0 : course.getManHour());
			containerUserCode = course.getContainerUser();
			containerNo = course.getContainerNo();
			isBackLease = course.getIsSurrender();
			yard = course.getYard();
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceWithBLOBs course = maintenanceDao.selectByPrimaryKey(input.getProdCourseId());
			workdGroupId = course.getFinishUser();
			finishedManHour = new BigDecimal(course.getManHour() == null ? 0 : course.getManHour());
			containerUserCode = course.getContainerUser();
			containerNo = course.getContainerNo();
			isBackLease = course.getIsSurrender();
			yard = course.getYard();
		} else {
			UnitCourseWithBLOBs course = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			workdGroupId = course.getDesignateUser();
			finishedManHour = new BigDecimal(course.getManHour() == null ? 0 : course.getManHour());
			containerUserCode = course.getContainerUser();
			containerNo = course.getContainerNo();
			isBackLease = CommonEnum.NO.getCode();
			yard = course.getYard();
		}

		ContainerUserOutput containerUser = containerUserService.getContainerUserByKey(containerUserCode);
		if (containerUser != null) {
			containerUserCode = containerUser.getContainerUserCode();
		} else {
			containerUserCode = "";
		}

		YardOutput yardOutput = yardService.queryByKey(yard);
		if (yardOutput != null) {
			company = yardOutput.getCompany();
		}

		WorkGroup workGroup = workGroupDao.selectByPrimaryKey(workdGroupId);
		if (workGroup != null) {
			outCompanyKey = workGroup.getTitle();
		}
		// 外包财务接口
		if (workGroup != null && CleaningPatternEnum.OUT.getCode().equals(workGroup.getType())) {
			PoolOutSourceRepairInput posrInput = new PoolOutSourceRepairInput();
			// 箱量
			posrInput.setContainerNumber(new BigDecimal(1));
			// 公司key
			posrInput.setCompanyKey(company);
			// 0 班组 1 外包商
			posrInput.setBzOrWb(1);
			// 班组ID
			posrInput.setWorkdGroupId(workdGroupId);
			// 外包商
			posrInput.setOutCompanyKey(outCompanyKey);
			// 完工工时
			posrInput.setFinishedManHour(finishedManHour);
			// 用箱人code 判断是否中远用
			posrInput.setContainerUserCode(containerUserCode);
			// 进场主表ID
			posrInput.setProdCourseId(input.getProdCourseId());
			// 箱ID
			// posrInput.setProdContainerId();
			// 箱号
			posrInput.setContainerNo(containerNo);
			// 进场场站key，关联场站表
			posrInput.setYard(yard);
			// 是否退租箱
			posrInput.setIsBackLease(isBackLease);
			// 箱类别
			posrInput.setContainerCategory(input.getContainerCategory());
			financeService.wbFinishedRepair(posrInput);
		}
		// 干箱财务接口
		else if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
			PoolSourceRepairInput psrInput = new PoolSourceRepairInput();
			// 公司key
			psrInput.setCompanyKey(company);
			// 班组ID
			psrInput.setWorkGroupId(StringUtil.valueOf(workdGroupId));
			// 完工工时
			psrInput.setFinishedManHour(finishedManHour);
			// 用箱人code 判断是否中远用
			psrInput.setContainerUserCode(containerUserCode);
			// 进场主表ID
			psrInput.setProdCourseId(input.getProdCourseId());
			// 箱ID
			// psrInput.setProdContainerId();
			// 箱号
			psrInput.setContainerNo(containerNo);
			// 进场场站key，关联场站表
			psrInput.setYard(yard);
			// 是否退租箱
			psrInput.setIsBackLease(isBackLease);
			// 箱类别
			psrInput.setContainerCategory(input.getContainerCategory());
			financeService.finishedGX(psrInput);
		}

	}
}
