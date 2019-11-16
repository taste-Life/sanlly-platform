package com.sanlly.production.service.impl;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.User;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.maintenance.EstimateSearchInput;
import com.sanlly.production.models.output.valuation.ValuationListOutput;
import com.sanlly.production.service.MaintenanceEstimateService;

/**
 * 保修估价接口
 * @author RexSheng
 * 2019年10月9日 下午3:55:32
 */
@Service
public class MaintenanceEstimateServiceImpl extends BaseServiceImpl implements MaintenanceEstimateService {

	@Autowired
	private MaintenanceMapper maintenanceDao;

	@Autowired
	private CourseMapper courseDao;

	@Autowired
	private UserMapper userDao;

	/**
	 * 分页获取保修估价单列表
	 */
	@Override
	public PagedList<ValuationListOutput> getEstimateList(EstimateSearchInput input) throws Exception {
		PagedList<ValuationListOutput> pagedList = new PagedList<ValuationListOutput>(input.getPageIndex(),
				input.getPageSize());
		MaintenanceExample example = new MaintenanceExample();
		MaintenanceExample.Criteria criteria = example.createCriteria();
		//查询估价状态不为空的
		criteria.andValuationStateIsNotNull().andValuationStateNotEqualTo("");
		if(input.getValuationStates()!=null && input.getValuationStates().length>0) {
			criteria.andValuationStateIn(Arrays.asList(input.getValuationStates()));
		}
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
		}
		// 提单号
		if (StringUtils.isNotEmpty(input.getLadingNo())) {
			CourseExample courseExample = new CourseExample();
			courseExample.createCriteria().andBillOfLadingNoLike("%" + input.getLadingNo().trim() + "%");
			List<Course> courseList = courseDao.selectByExample(courseExample);
			if (courseList.isEmpty()) {
				return pagedList;
			}
			criteria.andCourseIn(courseList.stream().map(a -> a.getProdCourseId()).collect(Collectors.toList()));
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		// 进场类型
		if (StringUtils.isNotEmpty(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(input.getCourseType());
		}
		// 进场起止日
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (StringUtils.isNotEmpty(input.getBeginCourseTime())) {
			criteria.andTestingTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginCourseTime()));
		}
		if (StringUtils.isNotEmpty(input.getEndCourseTime())) {
			criteria.andTestingTimeLessThanOrEqualTo(sdf.parse(input.getEndCourseTime().trim() + " 23:59:59"));
		}
		// 批复起止日
		if (StringUtils.isNotEmpty(input.getBeginReplyTime())) {
			criteria.andRespondTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginReplyTime()));
		}
		if (StringUtils.isNotEmpty(input.getEndReplyTime())) {
			criteria.andRespondTimeLessThanOrEqualTo(sdf.parse(input.getEndReplyTime().trim() + " 23:59:59"));
		}
		// 估价起止日
		if (StringUtils.isNotEmpty(input.getBeginValuationTime())) {
			criteria.andValuationTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginValuationTime()));
		}
		if (StringUtils.isNotEmpty(input.getEndValuationTime())) {
			criteria.andValuationTimeLessThanOrEqualTo(sdf.parse(input.getEndValuationTime().trim() + " 23:59:59"));
		}
		int totalItemCount = (int) maintenanceDao.countByExample(example);
		if (totalItemCount < 1) {
			return pagedList;
		}
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<MaintenanceWithBLOBs> list = maintenanceDao.selectByExampleWithBLOBs(example);
		SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<ValuationListOutput> dataList = list.stream().map(record -> {
			ValuationListOutput item = new ValuationListOutput();
			item.setProdMaintenanceId(record.getProdMaintenanceId());
			item.setProdCourseId(record.getCourse());
			item.setValuationNo(record.getValuationNo());
			item.setContainerNo(record.getContainerNo());
			item.setSizeLang(record.getSize());
			item.setContainerTypeLang(record.getContainerType());
			item.setContainerUserLang(record.getContainerUser());
			item.setCourseTypeLang(record.getCourseType());
			item.setYardLang(record.getYard());
			if (record.getCourseTime() != null) {
				item.setCourseTime(timeSdf.format(record.getCourseTime()));
			}
			Course course = courseDao.selectByPrimaryKey(record.getCourse());
			if (course != null) {
				item.setLadingNo(course.getBillOfLadingNo());
				item.setTradeLang(course.getDomesticForeignTrade());
				item.setContainerGradeLang(course.getContainerGrade());

			}

			item.setContainerCategoryLang(ContainerCategoryEnum.CONTAINER_04.getCode());
			item.setContainerCategoryKey(ContainerCategoryEnum.CONTAINER_04.getCode());
//			item.setAuditTime(auditTime);
			item.setUserValuationStateLang(record.getValuationState());
			item.setUserValuationStateKey(record.getValuationState());
			if (record.getValuationUser() != null) {
				User u = userDao.selectByPrimaryKey(record.getValuationUser());
				if (u != null)
					item.setValuationUser(u.getUserName());
			}
			item.setReferralStateKey(record.getReferralState());
			item.setReferralStateLang(record.getReferralState());
			if (record.getFinishUser() != null) {
				User u = userDao.selectByPrimaryKey(record.getFinishUser());
				if (u != null)
					item.setFinishUser(u.getUserName());
			}

			if (record.getFinishTime() != null)
				item.setFinishTime(timeSdf.format(record.getFinishTime()));
			item.setValuationRemarks(record.getValuationRemarks());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}
}
