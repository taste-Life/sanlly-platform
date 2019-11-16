package com.sanlly.production.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.User;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.surrender.EstimateSearchInput;
import com.sanlly.production.models.output.valuation.ValuationListOutput;
import com.sanlly.production.service.SurrenderEstimateService;

/**
 * 保修估价接口
 * @author RexSheng
 * 2019年10月9日 下午3:55:32
 */
@Service
public class SurrenderEstimateServiceImpl extends BaseServiceImpl implements SurrenderEstimateService {

	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;

	@Autowired
	private UserMapper userDao;
	
	/**
	 * 分页获取保修估价单列表
	 */
	@Override
	public PagedList<ValuationListOutput> getEstimateList(EstimateSearchInput input) throws Exception {
		PagedList<ValuationListOutput> pagedList = new PagedList<ValuationListOutput>(input.getPageIndex(),
				input.getPageSize());
		//干箱
		if(StringUtils.isNotEmpty(input.getContainerCategory()) && 
				(input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()) || input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode()))) {
			CourseExample example = new CourseExample();
			CourseExample.Criteria criteria = example.createCriteria();
			//查询估价状态不为空的
			criteria.andUseReplyStateIsNotNull().andUseReplyStateNotEqualTo("");
			if(StringUtils.isNotEmpty(input.getValuationState())) {
				criteria.andUseReplyStateEqualTo(input.getValuationState());
			}
			else {
				criteria.andUseReplyStateIsNotNull();
			}
			if(StringUtils.isNotEmpty(input.getOwnerValuationState())) {
				criteria.andMasterReplyStateEqualTo(input.getOwnerValuationState());
			}
			else {
				criteria.andMasterReplyStateIsNotNull();
			}
			criteria.andIsSurrenderEqualTo(CommonEnum.YES.getCode());
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
			// 进场起止日
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (StringUtils.isNotEmpty(input.getBeginCourseTime())) {
				criteria.andTestingTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginCourseTime()));
			}
			if (StringUtils.isNotEmpty(input.getEndCourseTime())) {
				criteria.andTestingTimeLessThanOrEqualTo(sdf.parse(input.getEndCourseTime().trim() + " 23:59:59"));
			}
			// 箱号
			if (StringUtils.isNotEmpty(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
			}
			// 用箱人
			if (StringUtils.isNotEmpty(input.getContainerUser())) {
				criteria.andContainerUserEqualTo(input.getContainerUser());
			}
			// 进场类型
			if (StringUtils.isNotEmpty(input.getCourseType())) {
				criteria.andCourseTypeEqualTo(input.getCourseType());
			}
			int totalItemCount = (int) courseDao.countByExample(example);
			if (totalItemCount < 1) {
				return pagedList;
			}
			pagedList.setTotalItemCount(totalItemCount);
			example.setLimitStart(pagedList.getLimitStart());
			example.setLimitEnd(pagedList.getLimitEnd());
			List<CourseWithBLOBs> list = courseDao.selectByExampleWithBLOBs(example);
			SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			List<ValuationListOutput> dataList = list.stream().map(record -> {
				ValuationListOutput item = new ValuationListOutput();
				item.setProdCourseId(record.getProdCourseId());
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

				item.setContainerCategoryLang(record.getContainerCategory());
				item.setContainerCategoryKey(record.getContainerCategory());
				if(record.getAuditTime()!=null) {
					item.setAuditTime(timeSdf.format(record.getAuditTime()));
				}
				item.setUserValuationStateLang(record.getUseReplyState());
				item.setUserValuationStateKey(record.getUseReplyState());
				//箱东估价状态
				item.setOwnerValuationStateLang(record.getMasterReplyState());
				item.setOwnerValuationStateKey(record.getMasterReplyState());
//				if (record.getValuationUser() != null) {
//					User u = userDao.selectByPrimaryKey(record.getValuationUser());
//					if (u != null)
//						item.setValuationUser(u.getUserName());
//				}
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
		}
		else if(StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
			//冷箱
			
			// 进场起止日
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//筛选机组
			UnitCourseExample unitCourseExample=new UnitCourseExample();
			UnitCourseExample.Criteria unitCriteria=unitCourseExample.createCriteria();
			if(StringUtils.isNotEmpty(input.getValuationState())) {
				unitCriteria.andUseReplyStateEqualTo(input.getValuationState());
			}
			else {
				unitCriteria.andUseReplyStateIsNotNull();
			}
			if(StringUtils.isNotEmpty(input.getOwnerValuationState())) {
				unitCriteria.andMasterReplyStateEqualTo(input.getOwnerValuationState());
			}
			else {
				unitCriteria.andMasterReplyStateIsNotNull();
			}
			// 进场起止日
			if (StringUtils.isNotEmpty(input.getBeginCourseTime())) {
				unitCriteria.andTestingTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginCourseTime()));
			}
			if (StringUtils.isNotEmpty(input.getEndCourseTime())) {
				unitCriteria.andTestingTimeLessThanOrEqualTo(sdf.parse(input.getEndCourseTime().trim() + " 23:59:59"));
			}
			// 箱号
			if (StringUtils.isNotEmpty(input.getContainerNo())) {
				unitCriteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
			}
			// 用箱人
			if (StringUtils.isNotEmpty(input.getContainerUser())) {
				unitCriteria.andContainerUserEqualTo(input.getContainerUser());
			}
			// 进场类型
			if (StringUtils.isNotEmpty(input.getCourseType())) {
				unitCriteria.andCourseTypeEqualTo(input.getCourseType());
			}
			List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExample);
			if (unitCourseList.isEmpty()) {
				return pagedList;
			}
			CourseExample example = new CourseExample();
			CourseExample.Criteria criteria = example.createCriteria();
			criteria.andIsSurrenderEqualTo(CommonEnum.YES.getCode());
			criteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
			//机组检验必须已审核
			criteria.andProdCourseIdIn(unitCourseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
			
			if(StringUtils.isNotEmpty(input.getValuationState())) {
				criteria.andUseReplyStateEqualTo(input.getValuationState());
			}
			else {
				criteria.andUseReplyStateIsNotNull();
			}
			if(StringUtils.isNotEmpty(input.getOwnerValuationState())) {
				criteria.andMasterReplyStateEqualTo(input.getOwnerValuationState());
			}
			else {
				criteria.andMasterReplyStateIsNotNull();
			}
			// 进场起止日
			if (StringUtils.isNotEmpty(input.getBeginCourseTime())) {
				criteria.andTestingTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginCourseTime()));
			}
			if (StringUtils.isNotEmpty(input.getEndCourseTime())) {
				criteria.andTestingTimeLessThanOrEqualTo(sdf.parse(input.getEndCourseTime().trim() + " 23:59:59"));
			}
			// 箱号
			if (StringUtils.isNotEmpty(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
			}
			// 用箱人
			if (StringUtils.isNotEmpty(input.getContainerUser())) {
				criteria.andContainerUserEqualTo(input.getContainerUser());
			}
			// 进场类型
			if (StringUtils.isNotEmpty(input.getCourseType())) {
				criteria.andCourseTypeEqualTo(input.getCourseType());
			}
			int totalItemCount = (int) courseDao.countByExample(example);
			if (totalItemCount < 1) {
				return pagedList;
			}
			pagedList.setTotalItemCount(totalItemCount);
			example.setLimitStart(pagedList.getLimitStart());
			example.setLimitEnd(pagedList.getLimitEnd());
			List<CourseWithBLOBs> list = courseDao.selectByExampleWithBLOBs(example);
			SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			List<ValuationListOutput> dataList = list.stream().map(record -> {
				ValuationListOutput item = new ValuationListOutput();
				item.setProdCourseId(record.getProdCourseId());
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

				item.setContainerCategoryLang(ContainerCategoryEnum.CONTAINER_05.getCode());
				item.setContainerCategoryKey(ContainerCategoryEnum.CONTAINER_05.getCode());
				if(record.getAuditTime()!=null) {
					item.setAuditTime(timeSdf.format(record.getAuditTime()));
				}
				item.setUserValuationStateLang(record.getUseReplyState());
				item.setUserValuationStateKey(record.getUseReplyState());
				//箱东估价状态
				item.setOwnerValuationStateLang(record.getMasterReplyState());
				item.setOwnerValuationStateKey(record.getMasterReplyState());
//				if (record.getValuationUser() != null) {
//					User u = userDao.selectByPrimaryKey(record.getValuationUser());
//					if (u != null)
//						item.setValuationUser(u.getUserName());
//				}
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
		}
		return pagedList;
	}

//	/**
//	 * 分页获取保修估价单列表
//	 */
//	@Override
//	public PagedList<ValuationListOutput> getEstimateList(EstimateSearchInput input) throws Exception {
//		PagedList<ValuationListOutput> pagedList = new PagedList<ValuationListOutput>(input.getPageIndex(),
//				input.getPageSize());
//		//干箱
//		if(StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
//			CourseExample example = new CourseExample();
//			CourseExample.Criteria criteria = example.createCriteria();
//			//查询估价状态不为空的
//			criteria.andUseReplyStateIsNotNull().andUseReplyStateNotEqualTo("");
//			if(input.getValuationStates()!=null && input.getValuationStates().length>0) {
//				criteria.andUseReplyStateIn(Arrays.asList(input.getValuationStates()));
//			}
//			criteria.andIsSurrenderEqualTo(CommonEnum.YES.getCode());
//			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
//			// 进场起止日
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			if (StringUtils.isNotEmpty(input.getBeginCourseTime())) {
//				criteria.andTestingTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginCourseTime()));
//			}
//			if (StringUtils.isNotEmpty(input.getEndCourseTime())) {
//				criteria.andTestingTimeLessThanOrEqualTo(sdf.parse(input.getEndCourseTime().trim() + " 23:59:59"));
//			}
//			// 箱号
//			if (StringUtils.isNotEmpty(input.getContainerNo())) {
//				criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
//			}
//			// 用箱人
//			if (StringUtils.isNotEmpty(input.getContainerUser())) {
//				criteria.andContainerUserEqualTo(input.getContainerUser());
//			}
//			// 进场类型
//			if (StringUtils.isNotEmpty(input.getCourseType())) {
//				criteria.andCourseTypeEqualTo(input.getCourseType());
//			}
//			int totalItemCount = (int) courseDao.countByExample(example);
//			if (totalItemCount < 1) {
//				return pagedList;
//			}
//			pagedList.setTotalItemCount(totalItemCount);
//			example.setLimitStart(pagedList.getLimitStart());
//			example.setLimitEnd(pagedList.getLimitEnd());
//			List<CourseWithBLOBs> list = courseDao.selectByExampleWithBLOBs(example);
//			SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			List<ValuationListOutput> dataList = list.stream().map(record -> {
//				ValuationListOutput item = new ValuationListOutput();
//				item.setProdCourseId(record.getProdCourseId());
//				item.setValuationNo(record.getValuationNo());
//				item.setContainerNo(record.getContainerNo());
//				item.setSizeLang(record.getSize());
//				item.setContainerTypeLang(record.getContainerType());
//				item.setContainerUserLang(record.getContainerUser());
//				item.setCourseTypeLang(record.getCourseType());
//				item.setYardLang(record.getYard());
//				if (record.getCourseTime() != null) {
//					item.setCourseTime(timeSdf.format(record.getCourseTime()));
//				}
//
//				item.setContainerCategoryLang(record.getContainerCategory());
//				item.setContainerCategoryKey(record.getContainerCategory());
//				if(record.getAuditTime()!=null) {
//					item.setAuditTime(timeSdf.format(record.getAuditTime()));
//				}
//				item.setUserValuationStateLang(record.getUseReplyState());
//				item.setUserValuationStateKey(record.getUseReplyState());
//				if (record.getValuationUser() != null) {
//					User u = userDao.selectByPrimaryKey(record.getValuationUser());
//					if (u != null)
//						item.setValuationUser(u.getUserName());
//				}
//				item.setReferralStateKey(record.getReferralState());
//				item.setReferralStateLang(record.getReferralState());
//				if (record.getFinishUser() != null) {
//					User u = userDao.selectByPrimaryKey(record.getFinishUser());
//					if (u != null)
//						item.setFinishUser(u.getUserName());
//				}
//
//				if (record.getFinishTime() != null)
//					item.setFinishTime(timeSdf.format(record.getFinishTime()));
//				item.setValuationRemarks(record.getValuationRemarks());
//				return item;
//			}).collect(Collectors.toList());
//			pagedList.setDataList(dataList);
//		}
//		//冷箱
//		else if(StringUtils.isEmpty(input.getContainerCategory()) || (StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode()))) {
//			CourseExample example = new CourseExample();
//			CourseExample.Criteria criteria = example.createCriteria();
//			
//			criteria.andIsSurrenderEqualTo(CommonEnum.YES.getCode());
//			//查询估价状态不为空的
//			criteria.andUseReplyStateIsNotNull().andUseReplyStateNotEqualTo("");
//			
//			if(StringUtils.isEmpty(input.getContainerCategory())) {
//				criteria.andContainerCategoryIn(Arrays.asList(ContainerCategoryEnum.CONTAINER_01.getCode(),ContainerCategoryEnum.CONTAINER_02.getCode()));
//			}
//			else {
//				criteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
//			}
//			if(input.getValuationStates()!=null && input.getValuationStates().length>0) {
//				criteria.andUseReplyStateIn(Arrays.asList(input.getValuationStates()));
//			}
//			// 进场起止日
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			if (StringUtils.isNotEmpty(input.getBeginCourseTime())) {
//				criteria.andTestingTimeGreaterThanOrEqualTo(sdf.parse(input.getBeginCourseTime()));
//			}
//			if (StringUtils.isNotEmpty(input.getEndCourseTime())) {
//				criteria.andTestingTimeLessThanOrEqualTo(sdf.parse(input.getEndCourseTime().trim() + " 23:59:59"));
//			}
//			// 箱号
//			if (StringUtils.isNotEmpty(input.getContainerNo())) {
//				criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
//			}
//			// 用箱人
//			if (StringUtils.isNotEmpty(input.getContainerUser())) {
//				criteria.andContainerUserEqualTo(input.getContainerUser());
//			}
//			// 进场类型
//			if (StringUtils.isNotEmpty(input.getCourseType())) {
//				criteria.andCourseTypeEqualTo(input.getCourseType());
//			}
//			List<Course> list = courseDao.selectByExample(example);
//			int totalItemCount = list.size();
//			
//			List<ValuationListOutput> dataList=new ArrayList<>();
//			SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			
//			pagedList.setTotalItemCount(totalItemCount);
//			dataList.addAll(list.stream().map(record -> {
//				ValuationListOutput item = new ValuationListOutput();
//				item.setProdCourseId(record.getProdCourseId());
//				item.setValuationNo(record.getValuationNo());
//				item.setContainerNo(record.getContainerNo());
//				item.setSizeLang(record.getSize());
//				item.setContainerTypeLang(record.getContainerType());
//				item.setContainerUserLang(record.getContainerUser());
//				item.setCourseTypeLang(record.getCourseType());
//				item.setYardLang(record.getYard());
//				if (record.getCourseTime() != null) {
//					item.setCourseTime(timeSdf.format(record.getCourseTime()));
//				}
//				if(StringUtils.isNotEmpty(record.getContainerCategory())) {
//					if(record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
//						item.setContainerCategoryLang(record.getContainerCategory());
//						item.setContainerCategoryKey(record.getContainerCategory());
//					}
//					else {
//						item.setContainerCategoryLang(ContainerCategoryEnum.CONTAINER_05.getCode());
//						item.setContainerCategoryKey(ContainerCategoryEnum.CONTAINER_05.getCode());
//					}
//				}
//				if(record.getAuditTime()!=null) {
//					item.setAuditTime(timeSdf.format(record.getAuditTime()));
//				}
//				item.setUserValuationStateLang(record.getUseReplyState());
//				item.setUserValuationStateKey(record.getUseReplyState());
//				if (record.getValuationUser() != null) {
//					User u = userDao.selectByPrimaryKey(record.getValuationUser());
//					if (u != null)
//						item.setValuationUser(u.getUserName());
//				}
//				item.setReferralStateKey(record.getReferralState());
//				item.setReferralStateLang(record.getReferralState());
//				if (record.getFinishUser() != null) {
//					User u = userDao.selectByPrimaryKey(record.getFinishUser());
//					if (u != null)
//						item.setFinishUser(u.getUserName());
//				}
//
//				if (record.getFinishTime() != null)
//					item.setFinishTime(timeSdf.format(record.getFinishTime()));
//				item.setValuationRemarks(record.getValuationRemarks());
//				item.setCreateTime(record.getCreateTime());
//				return item;
//			}).collect(Collectors.toList()));
//			//查询机组
//			if(StringUtils.isEmpty(input.getContainerCategory()) || 
//					(StringUtils.isNotEmpty(input.getContainerCategory()) && !input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()))) 
//			{
//				List<String> unitCourseIds=list.stream().map(a->a.getProdCourseId()).collect(Collectors.toList());
//				UnitCourseExample unitCourseExmaple=new UnitCourseExample();
//				UnitCourseExample.Criteria unitCourseCriteria=unitCourseExmaple.createCriteria();
//				if(unitCourseIds.size()>0) {
//					unitCourseCriteria.andProdCourseIdNotIn(unitCourseIds);
//				}
//				unitCourseCriteria.andUseReplyStateIsNotNull().andUseReplyStateNotEqualTo("");
//				if(input.getValuationStates()!=null && input.getValuationStates().length>0) {
//					unitCourseCriteria.andUseReplyStateIn(Arrays.asList(input.getValuationStates()));
//				}
//				List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExmaple);
//				//+
//				totalItemCount+=unitCourseList.size();
//				pagedList.setTotalItemCount(totalItemCount);
//				
//				dataList.addAll(unitCourseList.stream().map(unitCourse -> {
//					ValuationListOutput item = new ValuationListOutput();
//					
//					Course record=courseDao.selectByPrimaryKey(unitCourse.getProdCourseId());
//					if(record!=null) {
//						item.setProdCourseId(record.getProdCourseId());
//						item.setValuationNo(record.getValuationNo());
//						item.setContainerNo(record.getContainerNo());
//						item.setSizeLang(record.getSize());
//						item.setContainerTypeLang(record.getContainerType());
//						item.setContainerUserLang(record.getContainerUser());
//						item.setCourseTypeLang(record.getCourseType());
//						item.setYardLang(record.getYard());
//						if (record.getCourseTime() != null) {
//							item.setCourseTime(timeSdf.format(record.getCourseTime()));
//						}
//						if(StringUtils.isNotEmpty(record.getContainerCategory())) {
//							if(record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
//								item.setContainerCategoryLang(record.getContainerCategory());
//								item.setContainerCategoryKey(record.getContainerCategory());
//							}
//							else {
//								item.setContainerCategoryLang(ContainerCategoryEnum.CONTAINER_05.getCode());
//								item.setContainerCategoryKey(ContainerCategoryEnum.CONTAINER_05.getCode());
//							}
//						}
//					}
//					if(unitCourse.getAuditTime()!=null) {
//						item.setAuditTime(timeSdf.format(unitCourse.getAuditTime()));
//					}
//					item.setUserValuationStateLang(unitCourse.getUseReplyState());
//					item.setUserValuationStateKey(unitCourse.getUseReplyState());
//					if (unitCourse.getValuationUser() != null) {
//						User u = userDao.selectByPrimaryKey(unitCourse.getValuationUser());
//						if (u != null)
//							item.setValuationUser(u.getUserName());
//					}
//					item.setReferralStateKey(unitCourse.getReferralState());
//					item.setReferralStateLang(unitCourse.getReferralState());
//					if (unitCourse.getFinishUser() != null) {
//						User u = userDao.selectByPrimaryKey(unitCourse.getFinishUser());
//						if (u != null)
//							item.setFinishUser(u.getUserName());
//					}
//
//					if (unitCourse.getFinishTime() != null)
//						item.setFinishTime(timeSdf.format(unitCourse.getFinishTime()));
//					item.setValuationRemarks(unitCourse.getValuationRemarks());
//					item.setCreateTime(unitCourse.getCreateTime());
//					return item;
//				}).collect(Collectors.toList()));
//			}
//				 
//			dataList.sort(new Comparator<ValuationListOutput>() {
//
//				@Override
//				public int compare(ValuationListOutput a, ValuationListOutput b) {
//					if(a.getCreateTime()!=null && b.getCreateTime()!=null) {
//						return a.getCreateTime().compareTo(b.getCreateTime());
//					}
//					return 0;
//				}
//				
//			});
//			
//			
//			int max=pagedList.getLimitStart().intValue()+pagedList.getPageSize().intValue();
//			max=max>dataList.size()?dataList.size():max;
//			pagedList.setDataList(dataList.subList(pagedList.getLimitStart(), max));
//		}
//		
//		return pagedList;
//	}
}
