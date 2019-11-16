package com.sanlly.production.timedTask;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.ProdDeptMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.WorkGroupMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.ProdDept;
import com.sanlly.production.entity.ProdDeptExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.entity.WorkGroupExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.WorkGroupTypeEnum;
import com.sanlly.production.models.output.referral.UserContainerNumberOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 自动指派定时任务
 * 
 * @Package com.sanlly.production.timedTask 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月11日 上午10:26:02 
 * @version V1.0   
 */
@Component
public class DesignateTask implements SchedulingConfigurer {

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private YardMapper yardMapper;

	@Autowired
	private WorkGroupMapper workGroupMapper;

	@Autowired
	private ProdDeptMapper prodDeptMapper;

	@Autowired
	private UnitCourseMapper unitCourseMapper;

	@Override
	public void configureTasks(ScheduledTaskRegistrar task) {
		task.addTriggerTask(
				// 1.添加任务内容(Runnable)
				() -> {
					designateDry();
					designateUnit();
				},
				// 2.设置执行周期(Trigger)
				triggerContext -> {
					// 2.3 返回执行周期(Date)，每十分钟执行一次
					return new CronTrigger("0 */10 * * * ?").nextExecutionTime(triggerContext);
				});
	}

	/**
	 * 指派班组
	 * 
	 * @Description: TODO void @throws 
	 */
	private void designateDry() {
		// 获取箱体进场表中已派工、未指派的进场信息
		CourseExample courseExample = new CourseExample();
		courseExample.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
				.andDesignateUserIsNull();
		List<Course> courseList = courseMapper.selectByExample(courseExample);
		// 遍历进场数据
		for (Course item : courseList) {
			// 获取该条进场信息的公司、场站下的维修人员
			String company = getCompanyKey(item.getYard());
			// 获取成产部门key
			ProdDeptExample deptExample = new ProdDeptExample();
			deptExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company)
					.andYardEqualTo(item.getYard()).andProdDeptNameLike(
							"%" + ContainerCategoryEnum.getMessagebyCode(item.getContainerCategory()) + "%");
			List<ProdDept> deptList = prodDeptMapper.selectByExample(deptExample);
			if (deptList.size() < 1)
				continue;
			List<String> deptKeyList = deptList.stream().map(a -> a.getKey()).collect(Collectors.toList());
			// 获取维修人员
			WorkGroupExample workExample = new WorkGroupExample();
			workExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company)
					.andYardEqualTo(item.getYard()).andProdDeptIn(deptKeyList)
					.andWorkGroupTypeEqualTo(WorkGroupTypeEnum.REFERRAL.getCode());
			List<WorkGroup> workList = workGroupMapper.selectByExample(workExample);
			// 调用场站接口获取集装箱所在区位
			String zone = "[zone27]";
			// 根据可工作区位，工时限制，箱量匹配追最佳班组
			List<WorkGroup> userList = workList.stream().filter(a -> {
                if (a.getZone().indexOf(zone) > 0 && item.getManHour() >= a.getWorkHourBottom()
						&& item.getManHour() <= a.getWorkHourTop()) {
					return true;
				}
				return false;
			}).collect(Collectors.toList());
			if (userList.size() < 1)
				continue;
			// 获取维修班组待修理的箱子
			List<UserContainerNumberOutput> numberList = userList.stream().map(a -> {
				UserContainerNumberOutput model = new UserContainerNumberOutput();
				model.setUser(a.getUser());
				// 获取箱量
				CourseExample cExample = new CourseExample();
				cExample.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
						.andDesignateUserEqualTo(a.getUser());
				Integer number = (int) courseMapper.countByExample(cExample);
				model.setNumber(number);
				return model;
			}).sorted(Comparator.comparing(UserContainerNumberOutput::getNumber)).collect(Collectors.toList());
			// 获取第一条作为最匹配班组,修改进场表指派班组
			CourseExample updateExample = new CourseExample();
			updateExample.createCriteria().andProdCourseIdEqualTo(item.getProdCourseId());
			CourseWithBLOBs course = new CourseWithBLOBs();
			course.setDesignateUser(numberList.get(0).getUser());
			course.setDesignateTime(new Date());
			courseMapper.updateByExampleSelective(course, updateExample);
		}
	}

	/**
	 * 机组自动指派
	 * 
	 * @Description: TODO void @throws 
	 */
	private void designateUnit() {
		// 获取机组进场表中已派工、未指派的进场信息
		UnitCourseExample courseExample = new UnitCourseExample();
		courseExample.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
				.andDesignateUserIsNull();
		List<UnitCourse> courseList = unitCourseMapper.selectByExample(courseExample);
		// 遍历进场数据
		for (UnitCourse item : courseList) {
			// 获取该条进场信息的公司、场站下的维修人员
			Course course = getYardKey(item.getProdCourseId());
			if (course == null)
				continue;
			String company = getCompanyKey(course.getYard());
			// 获取成产部门key
			ProdDeptExample deptExample = new ProdDeptExample();
			deptExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company)
					.andYardEqualTo(course.getYard())
					.andProdDeptNameLike("%" + ContainerCategoryEnum.CONTAINER_03.getMessage() + "%");
			List<ProdDept> deptList = prodDeptMapper.selectByExample(deptExample);
			if (deptList.size() < 1)
				continue;
			List<String> deptKeyList = deptList.stream().map(a -> a.getKey()).collect(Collectors.toList());
			// 获取维修人员
			WorkGroupExample workExample = new WorkGroupExample();
			workExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company)
					.andYardEqualTo(course.getYard()).andProdDeptIn(deptKeyList)
					.andWorkGroupTypeEqualTo(WorkGroupTypeEnum.REFERRAL.getCode());
			List<WorkGroup> workList = workGroupMapper.selectByExample(workExample);
			// 调用场站接口获取集装箱所在区位
			String zone = "[zone27]";
			// 根据可工作区位，工时限制，箱量匹配追最佳班组
			List<WorkGroup> userList = workList.stream().filter(a -> {
                if (a.getZone().indexOf(zone) > 0 && item.getManHour() >= a.getWorkHourBottom()
						&& item.getManHour() <= a.getWorkHourTop()) {
					return true;
				}
				return false;
			}).collect(Collectors.toList());
			if (userList.size() < 1)
				continue;
			// 获取维修班组待修理的箱子
			List<UserContainerNumberOutput> numberList = userList.stream().map(a -> {
				UserContainerNumberOutput model = new UserContainerNumberOutput();
				model.setUser(a.getUser());
				// 获取箱量
				UnitCourseExample cExample = new UnitCourseExample();
				cExample.createCriteria().andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode())
						.andDesignateUserEqualTo(a.getUser());
				Integer number = (int) unitCourseMapper.countByExample(cExample);
				model.setNumber(number);
				return model;
			}).sorted(Comparator.comparing(UserContainerNumberOutput::getNumber)).collect(Collectors.toList());
			// 获取第一条作为最匹配班组,修改进场表指派班组
			UnitCourseExample updateExample = new UnitCourseExample();
			updateExample.createCriteria().andProdCourseIdEqualTo(item.getProdCourseId());
			UnitCourseWithBLOBs unitCourse = new UnitCourseWithBLOBs();
			unitCourse.setDesignateUser(numberList.get(0).getUser());
			unitCourse.setDesignateTime(new Date());
			unitCourseMapper.updateByExampleSelective(unitCourse, updateExample);
		}
	}

	/**
	 * 根据场站获取公司key
	 * 
	 * @Description: TODO
	 * @param yard
	 * @return String @throws 
	 */
	private String getCompanyKey(String yard) {
		YardExample example = new YardExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andKeyEqualTo(yard);
		List<Yard> list = yardMapper.selectByExample(example);
		if (list.size() > 0)
			return list.get(0).getCompany();
		return null;
	}

	/**
	 * 根据进组进场id获取箱体进场信息
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @return String @throws 
	 */
	private Course getYardKey(String courseId) {
		return courseMapper.selectByPrimaryKey(courseId);
	}

}
