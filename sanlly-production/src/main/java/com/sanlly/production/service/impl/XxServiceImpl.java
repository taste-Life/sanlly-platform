package com.sanlly.production.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.NoTransactionException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.input.finance.PoolPtiInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.XxContainerMapper;
import com.sanlly.production.entity.Container;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.XxContainer;
import com.sanlly.production.entity.XxContainerExample;
import com.sanlly.production.enums.CleaningSourceEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.OkNotOkEnum;
import com.sanlly.production.enums.PreviewStateEnum;
import com.sanlly.production.enums.PtiTypeEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.enums.XxStateEnum;
import com.sanlly.production.models.input.cleaning.CleaningAddInput;
import com.sanlly.production.models.input.xx.XxSearchInput;
import com.sanlly.production.models.output.xx.XxDetailOutput;
import com.sanlly.production.service.CleaningService;
import com.sanlly.production.service.FinanceService;
import com.sanlly.production.service.XxService;

/**
 * xx箱接口实现
 * @author RexSheng
 * 2019年8月30日 下午3:09:18
 */
@Service
public class XxServiceImpl extends BaseServiceImpl implements XxService{

	@Autowired
	private XxContainerMapper xxDao;
	
	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	@Autowired
	private MaintenanceMapper maintenanceDao;
	
	@Autowired
	private CleaningService cleaningService;
	
	@Autowired
	private ContainerMapper containerDao;
	
	@Autowired
	private FinanceService financeClient;
	/**
	 * 获取xx箱列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<XxDetailOutput> getXxPagedList(XxSearchInput input) {
		PagedList<XxDetailOutput> pagedList=new PagedList<XxDetailOutput>(input.getPageIndex(),input.getPageSize());
		XxContainerExample example=new XxContainerExample();
		XxContainerExample.Criteria criteria=example.createCriteria();
		//箱号
		if(StringUtils.isNotEmpty(input.getContainerNo())){
			criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		//用箱人
		if(StringUtils.isNotEmpty(input.getContainerUser())){
			CourseExample courseExample=new CourseExample();
			courseExample.createCriteria().andContainerUserEqualTo(input.getContainerUser());
			List<Course> courseList=courseDao.selectByExample(courseExample);
			if(courseList.size()==0) {
				return pagedList;
			}
			criteria.andCourseIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		}
		criteria.andIsXxIsNotNull().andIsXxEqualTo(CommonEnum.YES.getCode());
		//xx箱状态
		if(StringUtils.isNotEmpty(input.getXxState())){
			criteria.andXxStateEqualTo(input.getXxState());
		}
		int totalItemCount=(int)xxDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<XxContainer> containerList=xxDao.selectByExample(example);
		List<XxDetailOutput> dataList=containerList.stream().map(a->{
			XxDetailOutput item=new XxDetailOutput();
			item.setCourseId(a.getCourse());
			item.setXxStateLang(a.getXxState());
			item.setXxStateKey(a.getXxState());
			item.setPtiResultLang(a.getPtiResult());
			item.setPtiResultKey(a.getPtiResult());
			item.setPtiLastResultLang(a.getPtiLastResult());
			item.setContainerNo(a.getContainerNo());
			Course course=courseDao.selectByPrimaryKey(a.getCourse());
			if(course!=null) {
				item.setContainerUserLang(course.getContainerUser());
				item.setCourseTypeLang(course.getCourseType());
				item.setContainerStateLang(course.getContainerCondition());
				item.setContainerReplyStateLang(course.getUseReplyState());
				item.setRemark(course.getTestingRemarks());
			}
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(a.getCourse());
			if(unitCourse!=null) {
				item.setUnitStateLang(unitCourse.getUnitState());
				item.setUnitReplyStateLang(unitCourse.getUseReplyState());
			}
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * xx箱确认ok
	 * @param courseIds
	 */
	@Override
	@Transactional
	public void confirmOk(String[] courseIds) {
		XxContainer record=new XxContainer();
		record.setXxState(XxStateEnum.OK.getCode());
		record.setPtiResult(OkNotOkEnum.OK.getCode());
		record.setPtiLastResult(OkNotOkEnum.OK.getCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		
		XxContainerExample example=new XxContainerExample();
		example.createCriteria().andCourseIn(Arrays.asList(courseIds));
		
		xxDao.updateByExampleSelective(record, example);
		
		for(String courseId:courseIds) {
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
			//
			unitCourse.setPreviewState(PreviewStateEnum.DEFAULT.getCode());
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKey(unitCourse);
		}
		
	} 

	/**
	 *  PTI ok确认列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<XxDetailOutput> getPtiOkPagedList(XxSearchInput input) {
		PagedList<XxDetailOutput> pagedList=new PagedList<XxDetailOutput>(input.getPageIndex(),input.getPageSize());
		XxContainerExample example=new XxContainerExample();
		XxContainerExample.Criteria criteria=example.createCriteria();
		
		//箱号
		if(StringUtils.isNotEmpty(input.getContainerNo())){
			criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		//用箱人
		if(StringUtils.isNotEmpty(input.getContainerUser())){
			CourseExample courseExample=new CourseExample();
			courseExample.createCriteria().andContainerUserEqualTo(input.getContainerUser())
			//非退租箱
				.andIsSurrenderIfNullNotEqualTo(CommonEnum.YES.getCode(),"");
			List<Course> courseList=courseDao.selectByExample(courseExample);
			if(courseList.size()==0) {
				return pagedList;
			}
			criteria.andCourseIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		}
		else {
			CourseExample courseExample=new CourseExample();
			//非退租箱
			courseExample.createCriteria().andIsSurrenderIfNullNotEqualTo(CommonEnum.YES.getCode(),"");
			List<Course> courseList=courseDao.selectByExample(courseExample);
			if(courseList.size()==0) {
				return pagedList;
			}
			criteria.andCourseIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		}
		//非待保修
		List<String> maintenanceCourseList=maintenanceDao.selectByExample(null).stream().filter(a->a.getCourse()!=null).map(a->a.getCourse()).collect(Collectors.toList());
		if(maintenanceCourseList.size()>0) {
			criteria.andCourseNotIn(maintenanceCourseList);
		}
		//PTI类型不等于 不做pti
		UnitCourseExample unitCourseExample=new UnitCourseExample();
		UnitCourseExample.Criteria unitCourseCriteria=unitCourseExample.createCriteria();
		unitCourseCriteria.andPtiTypeIfNullNotEqualTo(PtiTypeEnum.NOTDO.getCode(), "");
		List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExample);
		if(unitCourseList.size()==0) {
			return pagedList;
		}
		criteria.andCourseIn(unitCourseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		//xx箱状态
		if(StringUtils.isNotEmpty(input.getXxState())){
			criteria.andXxStateEqualTo(input.getXxState());
		}
		int totalItemCount=(int)xxDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<XxContainer> containerList=xxDao.selectByExample(example);
		List<XxDetailOutput> dataList=containerList.stream().map(a->{
			XxDetailOutput item=new XxDetailOutput();
			item.setCourseId(a.getCourse());
			item.setXxStateLang(a.getXxState());
			item.setXxStateKey(a.getXxState());
			item.setPtiResultLang(a.getPtiResult());
			item.setPtiResultKey(a.getPtiResult());
			item.setPtiLastResultLang(a.getPtiLastResult());
			item.setContainerNo(a.getContainerNo());
			Course course=courseDao.selectByPrimaryKey(a.getCourse());
			if(course!=null) {
				item.setContainerUserLang(course.getContainerUser());
				item.setCourseTypeLang(course.getCourseType());
				item.setContainerStateLang(course.getContainerCondition());
				item.setContainerReplyStateLang(course.getUseReplyState());
				item.setRemark(course.getTestingRemarks());
			}
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(a.getCourse());
			if(unitCourse!=null) {
				item.setUnitStateLang(unitCourse.getUnitState());
				item.setUnitReplyStateLang(unitCourse.getUseReplyState());
			}
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}
	
	
	/**
	 * pti Ok确认
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void ptiOkConfirm(String[] prodCourseIds) {
		for(String courseId:prodCourseIds) {
			XxContainerExample xxExample=new XxContainerExample();
			xxExample.createCriteria().andCourseEqualTo(courseId);
			List<XxContainer> xxList=xxDao.selectByExample(xxExample);
			if(xxList.size()>0) {
				XxContainer xxRecord=xxList.get(0);
				//pti状态
				xxRecord.setPtiResult(OkNotOkEnum.OK.getCode());
				xxRecord.setPtiLastResult(OkNotOkEnum.OK.getCode());
				xxRecord.setUpdateTime(new Date());
				xxRecord.setUpdateUser(getCurrentUserId());
				xxDao.updateByPrimaryKey(xxRecord);
				//自动取消原移箱标记
				UnitCourseWithBLOBs unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
				unitCourse.setPreviewState(PreviewStateEnum.DEFAULT.getCode());
				unitCourseDao.updateByPrimaryKey(unitCourse);
			}
//			//PTI洗箱生成
//			CleaningAddInput cleaingAddInput=new CleaningAddInput();
//			cleaingAddInput.setCourseId(courseId);
//			cleaingAddInput.setSource(CleaningSourceEnum.PTI);
//			cleaningService.addCleaning(cleaingAddInput);
			//产生费用
			PoolPtiInput ptiFee=new PoolPtiInput();
			ptiFee.setProdCourseId(courseId);
			Course course=courseDao.selectByPrimaryKey(courseId);
			ptiFee.setContainerNo(course.getContainerNo());
			ptiFee.setContainerUser(course.getContainerUser());
			ptiFee.setYard(course.getYard());
			ptiFee.setContainerSize(course.getSize());
			ptiFee.setContainerCategory(course.getContainerCategory());
			financeClient.ptiOkNode(ptiFee);
		}
	}
	
	/**
	 * 创建pti信息
	 * @param course
	 * @param unitCourse
	 */
	public void createPtiInfo(Course course,UnitCourse unitCourse) {
		try {
			TransactionAspectSupport.currentTransactionStatus().flush();
		}
		catch (NoTransactionException e) {
		}
		updatePtiInfo(course,unitCourse);
		updateXxState(course, unitCourse);
	}
	
	public void updatePtiInfo(Course course,UnitCourse unitCourse) {
		if(course==null) {
			course=courseDao.selectByPrimaryKey(unitCourse.getProdCourseId());
		}
		if(course==null) {
			return;
		}
		if(unitCourse==null) {
			unitCourse=unitCourseDao.selectByPrimaryKey(course.getProdCourseId());
		}
		if(unitCourse==null) {
			return;
		}
		//非待保修
		MaintenanceExample mExp=new MaintenanceExample();
		mExp.createCriteria().andCourseEqualTo(course.getProdCourseId());
		if(maintenanceDao.selectByExample(mExp).size()>0) {
			return;
		}
		
		XxContainerExample xxExample=new XxContainerExample();
		xxExample.createCriteria().andCourseEqualTo(course.getProdCourseId());
		List<XxContainer> xxList=xxDao.selectByExample(xxExample);
		XxContainer record=null;
		if(xxList.size()>0) {
			record=xxList.get(0);
			if(StringUtils.isNotEmpty(record.getPtiLastResult())){
				return;
			}
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
		}
		else {
			record=new XxContainer();
			
			//箱id
			ContainerExample cExp=new ContainerExample();
			cExp.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container=containerDao.selectByExample(cExp).get(0);
			record.setContainerNo(course.getContainerNo());
			record.setContainer(container.getProdContainerId());
			record.setCourse(course.getProdCourseId());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
		}
		if(StringUtils.isEmpty(record.getPtiResult())) {
			record.setPtiResult(OkNotOkEnum.NOTOK.getCode());
		}
		
		if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode())
				
		) {
			//	好箱体 + 好机组 + 非“待保修”箱；
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		else if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getReferralState())
				&& unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				
		) {
			//	好箱体 + 坏机组已完工 + 非“待保修”箱；
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		else if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getReferralState())
				&& course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode())
				
		) {
			//	坏箱体已完工 + 好机组 + 非“待保修”箱；
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		else if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getReferralState())
				&& course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getReferralState())
				&& unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				
		) {
			//	坏箱体已完工 + 坏机组已完工 + 非“待保修”箱；
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		else if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUseReplyState())
				&& unitCourse.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode())
				
		) {
			//	好箱体 + 坏机组不修转好 + 非“待保修”箱；
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		else if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getUseReplyState())
				&& course.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode())
				
		) {
			//	坏箱体不修转好 + 好机组 + 非“待保修”箱；
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		else if(
				StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getUseReplyState())
				&& course.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUseReplyState())
				&& unitCourse.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode())
				
		) {
			//	坏箱体不修转好 + 坏机组不修转好 + 非“待保修”箱。
			record.setPtiResult(OkNotOkEnum.OK.getCode());
		}
		
		if(xxList.size()>0) {
			xxDao.updateByPrimaryKey(record);
		}
		else {
			xxDao.insert(record);
		}
	}
	
	/**
	 * 更新xx箱状态
	 * @param course
	 * @param unitCourse
	 */
	public void updateXxState(Course course,UnitCourse unitCourse) {
		if(course==null) {
			course=courseDao.selectByPrimaryKey(unitCourse.getProdCourseId());
		}
		if(course==null) {
			return;
		}
		if(unitCourse==null) {
			unitCourse=unitCourseDao.selectByPrimaryKey(course.getProdCourseId());
		}
		if(unitCourse==null) {
			return;
		}
		//非待保修
		MaintenanceExample mExp=new MaintenanceExample();
		mExp.createCriteria().andCourseEqualTo(course.getProdCourseId());
		if(maintenanceDao.selectByExample(mExp).size()>0) {
			return;
		}
		
		XxContainerExample xxExample=new XxContainerExample();
		xxExample.createCriteria().andCourseEqualTo(course.getProdCourseId());
		List<XxContainer> xxList=xxDao.selectByExample(xxExample);
		XxContainer record=null;
		if(xxList.size()>0) {
			record=xxList.get(0);
			if(StringUtils.isNotEmpty(record.getXxState()) && record.getXxState().equals(XxStateEnum.OK.getCode())){
				return;
			}
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
		}
		else {
			record=new XxContainer();
			
			//箱id
			ContainerExample cExp=new ContainerExample();
			cExp.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container=containerDao.selectByExample(cExp).get(0);
			record.setContainerNo(course.getContainerNo());
			record.setContainer(container.getProdContainerId());
			record.setCourse(course.getProdCourseId());
			record.setPtiResult(OkNotOkEnum.NOTOK.getCode());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
		}
		Boolean updateXx=false;
		String xxState=null;
		//	好箱体 + 坏机组已完工未批复（待估价，待批复） + 非“待保修”箱；
		if(StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getReferralState())
				&& unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& (unitCourse.getUseReplyState()==null 
					|| ReplyStateEnum.UNDO.getCode().equals(unitCourse.getUseReplyState()) 
					|| ReplyStateEnum.UNREPLY.getCode().equals(unitCourse.getUseReplyState())
				   )
				) {
			updateXx=true;
			xxState=XxStateEnum.XX.getCode();
		}
		//	坏箱体已完工未批复 + 好机组 + 非“待保修”箱；
		else if(StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getReferralState())
				&& course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& (course.getUseReplyState()==null 
					|| ReplyStateEnum.UNDO.getCode().equals(course.getUseReplyState()) 
					|| ReplyStateEnum.UNREPLY.getCode().equals(course.getUseReplyState())
				   )
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode())
				) {
			updateXx=true;
			xxState=XxStateEnum.XX.getCode();
		}
		
		//		坏箱体已完工未批复 + 坏机组已完工未批复 + 非“待保修”箱；
		else if(StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getReferralState())
				&& course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& (course.getUseReplyState()==null 
					|| ReplyStateEnum.UNDO.getCode().equals(course.getUseReplyState()) 
					|| ReplyStateEnum.UNREPLY.getCode().equals(course.getUseReplyState())
				   )
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getReferralState())
				&& unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& (unitCourse.getUseReplyState()==null 
					|| ReplyStateEnum.UNDO.getCode().equals(unitCourse.getUseReplyState()) 
					|| ReplyStateEnum.UNREPLY.getCode().equals(unitCourse.getUseReplyState())
				   )
				) {
			updateXx=true;
			xxState=XxStateEnum.XX.getCode();
		}
		//	好箱体 + 坏机组已完工已批复 + 非“待保修”箱；
		if(StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getReferralState())
				&& unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUseReplyState())
				&& unitCourse.getUseReplyState().equals(ReplyStateEnum.APPLYED.getCode())
				) {
			updateXx=true;
			xxState=XxStateEnum.XX_OK.getCode();
		}
		//	坏箱体已完工已批复 + 好机组 + 非“待保修”箱；
		else if(StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getReferralState())
				&& course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& StringUtils.isNotEmpty(course.getUseReplyState())
				&& course.getUseReplyState().equals(ReplyStateEnum.APPLYED.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUnitState())
				&& unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode())
				) {
			updateXx=true;
			xxState=XxStateEnum.XX_OK.getCode();
		}
		//		坏箱体已完工已批复 + 坏机组已完工已批复 + 非“待保修”箱；
		else if(StringUtils.isNotEmpty(course.getContainerCondition())
				&& course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(course.getReferralState())
				&& course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& StringUtils.isNotEmpty(course.getUseReplyState())
				&& course.getUseReplyState().equals(ReplyStateEnum.APPLYED.getCode())
				&& unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getReferralState())
				&& unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())
				&& StringUtils.isNotEmpty(unitCourse.getUseReplyState())
				&& unitCourse.getUseReplyState().equals(ReplyStateEnum.APPLYED.getCode())
				) {
			updateXx=true;
			xxState=XxStateEnum.XX_OK.getCode();
		}
		if(updateXx) {
			record.setIsXx(CommonEnum.YES.getCode());
			record.setXxState(xxState);
			if(xxList.size()>0) {
				xxDao.updateByPrimaryKey(record);
			}
			else {
				xxDao.insert(record);
			}
		}
	}
	/**
	 * pti Not Ok确认
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void ptiNotOkConfirm(String[] prodCourseIds) {
		for(String courseId:prodCourseIds) {
			XxContainerExample xxExample=new XxContainerExample();
			xxExample.createCriteria().andCourseEqualTo(courseId);
			List<XxContainer> xxList=xxDao.selectByExample(xxExample);
			if(xxList.size()>0) {
				XxContainer xxRecord=xxList.get(0);
				//pti状态
				xxRecord.setPtiResult(OkNotOkEnum.NOTOK.getCode());
				xxRecord.setPtiLastResult(OkNotOkEnum.NOTOK.getCode());
				xxRecord.setUpdateTime(new Date());
				xxRecord.setUpdateUser(getCurrentUserId());
				xxDao.updateByPrimaryKey(xxRecord);
			}
		}
	}

	/**
	 * 创建pti信息
	 * @param course
	 * @param unitCourse
	 */
	@Override
	public void createPtiInfo(String prodCourseId) {
		// TODO Auto-generated method stub
		Course course = courseDao.selectByPrimaryKey(prodCourseId);
		UnitCourse unitCourse = unitCourseDao.selectByPrimaryKey(prodCourseId);
		try {
			createPtiInfo(course, unitCourse);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
