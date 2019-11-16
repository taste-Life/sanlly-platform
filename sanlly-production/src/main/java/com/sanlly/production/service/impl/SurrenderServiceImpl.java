package com.sanlly.production.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.SurrenderPlanDetailMapper;
import com.sanlly.production.dao.SurrenderPlanMapper;
import com.sanlly.production.entity.SurrenderPlan;
import com.sanlly.production.entity.SurrenderPlanDetail;
import com.sanlly.production.entity.SurrenderPlanDetailExample;
import com.sanlly.production.entity.SurrenderPlanExample;
import com.sanlly.production.enums.SurrenderPlanStateEnum;
import com.sanlly.production.models.input.surrender.SurrenderPlanDeleteInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanDetailInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanFinishInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanSearchInput;
import com.sanlly.production.models.output.surrender.SurrenderPlanDetailOutput;
import com.sanlly.production.models.output.surrender.SurrenderPlanOutput;
import com.sanlly.production.service.SurrenderService;

@Service
public class SurrenderServiceImpl extends BaseServiceImpl implements SurrenderService {

	@Autowired
	private SurrenderPlanMapper surrenderPlanDao;
	@Autowired
	private SurrenderPlanDetailMapper surrenderPlanDetailDao;

	/**
	 *  
	 * 
	 * @Description: TODO 退租计划列表
	 * @param input
	 * @return List<SurrenderPlanOutput> @throws 
	 */
	@Override
	public PagedList<SurrenderPlanOutput> surrenderPlanlist(SurrenderPlanSearchInput input) throws Exception {

		PagedList<SurrenderPlanOutput> pagedList = new PagedList<SurrenderPlanOutput>(input.getPageIndex(),
				input.getPageSize());

		SurrenderPlanExample example = new SurrenderPlanExample();
		surrenderPlanDao.selectByExample(example);
		SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SurrenderPlanExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(getCurrentCompanyKey());
		if (StringUtils.isNotBlank(input.getPlanNo())) {
			criteria.andPlanNoLike("%" + input.getPlanNo() + "%");
		}
		if (StringUtils.isNotBlank(input.getPlanState())) {
			criteria.andPlanStateEqualTo(input.getPlanState());
		}
		if (StringUtils.isNotBlank(input.getStartTime())) {
			criteria.andStartTimeGreaterThanOrEqualTo(sdfs.parse(input.getStartTime()));
		}
		if (StringUtils.isNotBlank(input.getEndTime())) {
			criteria.andEndTimeLessThanOrEqualTo(sdfs.parse(input.getEndTime()));
		}
		if (StringUtils.isNotBlank(input.getIsValid())) {
			criteria.andIsValidEqualTo(input.getIsValid());
		}
		int totalItemCount = (int) surrenderPlanDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		// 按照进场倒序
		example.setOrderByClause(" create_time desc");
		List<SurrenderPlan> list = surrenderPlanDao.selectByExample(example);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<SurrenderPlanOutput> dataList = list.stream().map(item -> {
			SurrenderPlanOutput output = new SurrenderPlanOutput();
			BeanUtils.copyProperties(item, output);
			output.setContainerOwnerNameLang(item.getContainerOwner());
			output.setIsValidNameLang(item.getIsValid());
			output.setPlanStateNameLang(item.getPlanState());
			if (item.getStartTime() != null) {
				output.setStartTime(sdf.format(item.getStartTime()));
			}
			if (item.getEndTime() != null) {
				output.setEndTime(sdf.format(item.getEndTime()));
			}
			if (item.getInputTime() != null) {
				output.setInputTime(sdf.format(item.getInputTime()));
			}
			if (item.getFinishTime() != null) {
				output.setFinishTime(sdf.format(item.getFinishTime()));
			}
			return output;
		}).collect(Collectors.toList());

		// TODO Auto-generated method stub
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存退租计划
	 * @param input
	 * @return String @throws 
	 */
	@Override
	public Integer saveSurrenderPlan(SurrenderPlanInput input) throws Exception {
		SurrenderPlan record = new SurrenderPlan();
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (input.getProdSurrenderPlanId() != null) {
			record = surrenderPlanDao.selectByPrimaryKey(input.getProdSurrenderPlanId());
			BeanUtils.copyProperties(input, record);
			if (StringUtils.isNotBlank(input.getStartTime())) {
				record.setStartTime(sdf.parse(input.getStartTime()));
			}
			if (StringUtils.isNotBlank(input.getEndTime())) {
				record.setEndTime(sdf.parse(input.getEndTime()));
			}
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			return surrenderPlanDao.updateByPrimaryKey(record);
		} else {
			BeanUtils.copyProperties(input, record);
			if (StringUtils.isNotBlank(input.getStartTime())) {
				record.setStartTime(sdf.parse(input.getStartTime()));
			}
			if (StringUtils.isNotBlank(input.getEndTime())) {
				record.setEndTime(sdf.parse(input.getEndTime()));
			}
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCompany(getCurrentCompanyKey());
			record.setPlanState(SurrenderPlanStateEnum.NOT.getCode());
			record.setInputTime(new Date());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			return surrenderPlanDao.insert(record);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 退租计划明细列表
	 * @return List<SurrenderPlanDetailOutput> @throws 
	 */
	@Override
	public List<SurrenderPlanDetailOutput> surrenderPlanDetailist(Integer prodSurrenderPlanId) throws Exception {
		// TODO Auto-generated method stub

		List<SurrenderPlanDetailOutput> pagedList = new ArrayList<SurrenderPlanDetailOutput>();

		SurrenderPlanDetailExample example = new SurrenderPlanDetailExample();
		example.createCriteria().andProdSurrenderPlanIdEqualTo(prodSurrenderPlanId)
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 按照进场倒序
		example.setOrderByClause(" create_time desc");
		List<SurrenderPlanDetail> list = surrenderPlanDetailDao.selectByExample(example);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		pagedList = list.stream().map(item -> {
			SurrenderPlanDetailOutput output = new SurrenderPlanDetailOutput();
			BeanUtils.copyProperties(item, output);
			output.setSizeLang(item.getSize());
			output.setContainerTypeLang(item.getContainerType());
			output.setYardLang(item.getYard());
			if(item.getCourseTime() != null) {				
				output.setCourseTime(sdf.format(item.getCourseTime()));
			}
			output.setBillTypeLang(item.getBillType());
			output.setDpp(StringUtil.doubleToEffectString(item.getDpp()));
			if(item.getStartTime() != null) {				
				output.setStartTime(sdf.format(item.getStartTime()));
			}
			output.setIsCourseNameLang(item.getIsCourse());
			return output;
		}).collect(Collectors.toList());
		// TODO Auto-generated method stub
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存退租计划明细
	 * @param input
	 * @return String @throws 
	 */
	@Override
	public Integer saveSurrenderPlanDetail(SurrenderPlanDetailInput input) throws Exception {
		SurrenderPlanDetail record = new SurrenderPlanDetail();
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (input.getProdSurrenderPlanDetailId() != null) {
			record = surrenderPlanDetailDao.selectByPrimaryKey(input.getProdSurrenderPlanDetailId());
			BeanUtils.copyProperties(input, record);
			if (StringUtils.isNotBlank(input.getDpp())) {
				record.setDpp(Double.valueOf(input.getDpp()));
			}
			if(StringUtils.isNotBlank(input.getStartTime())) {				
				record.setStartTime(sdf.parse(input.getStartTime()));
			}
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			return surrenderPlanDetailDao.updateByPrimaryKey(record);
		} else {
			BeanUtils.copyProperties(input, record);
			if (StringUtils.isNotBlank(input.getDpp())) {
				record.setDpp(Double.valueOf(input.getDpp()));
			}
			if(StringUtils.isNotBlank(input.getStartTime())) {				
				record.setStartTime(sdf.parse(input.getStartTime()));
			}
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setIsCourse(CommonEnum.NO.getCode());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			return surrenderPlanDetailDao.insert(record);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量删除退租计划
	 * @param input
	 * @return String @throws 
	 */
	@Override
	public void deleteSurrenderPlans(SurrenderPlanDeleteInput input) throws Exception {
		if (input.getIds() != null && input.getIds().size() > 0) {
			SurrenderPlanExample example = new SurrenderPlanExample();
			example.createCriteria().andProdSurrenderPlanIdIn(input.getIds())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			SurrenderPlan record = new SurrenderPlan();
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			surrenderPlanDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量删除退租计划明细
	 * @param input
	 * @return String @throws 
	 */
	@Override
	public void deleteSurrenderPlanDetails(SurrenderPlanDeleteInput input) throws Exception {
		if (input.getIds() != null && input.getIds().size() > 0) {
			SurrenderPlanDetailExample example = new SurrenderPlanDetailExample();
			example.createCriteria().andProdSurrenderPlanDetailIdIn(input.getIds())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			SurrenderPlanDetail record = new SurrenderPlanDetail();
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			surrenderPlanDetailDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量完工退租计划
	 * @param input
	 * @return String @throws 
	 */
	@Override
	public void finishSurrenderPlans(SurrenderPlanFinishInput input) throws Exception {
		// TODO Auto-generated method stub
		if (input.getIds() != null && input.getIds().size() > 0) {
			for (Integer prodSurrenderPlanId : input.getIds()) {
				SurrenderPlan record = surrenderPlanDao.selectByPrimaryKey(prodSurrenderPlanId);
				if(input.getIsCancel() != null && input.getIsCancel()) {				
					record.setPlanState(record.getBeforeFinishState());
					record.setBeforeFinishState(null);
					record.setFinishTime(null);
				}else {
					record.setBeforeFinishState(record.getPlanState());
					record.setPlanState(SurrenderPlanStateEnum.FINISH.getCode());
					record.setFinishTime(new Date());
				}
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				surrenderPlanDao.updateByPrimaryKey(record);
			}
		}
	}

}
