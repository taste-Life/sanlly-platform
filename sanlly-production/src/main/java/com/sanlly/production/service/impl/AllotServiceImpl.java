package com.sanlly.production.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.AllocationCostMappingMapper;
import com.sanlly.production.dao.BadContainerAllocationMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.entity.BadContainerAllocation;
import com.sanlly.production.entity.BadContainerAllocationExample;
import com.sanlly.production.enums.AllotStateEnum;
import com.sanlly.production.enums.AllotTypeEnum;
import com.sanlly.production.models.input.allot.AllotAddInput;
import com.sanlly.production.models.input.allot.AllotUpdateInput;
import com.sanlly.production.models.output.allot.AllotOutput;
import com.sanlly.production.service.AllotService;
/**
 * 坏箱调拨实现类
 * @author zhangkai
 *
 */
@Service
public class AllotServiceImpl extends BaseServiceImpl implements AllotService {

	@Autowired
	private BadContainerAllocationMapper badContainerAllocationMapper;
	@Autowired
	private AllocationCostMappingMapper allocationCostMappingMapper;
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 列表
	 * @param containerNo 箱号
	 * @param exitYard 调出场站
	 * @param entryYard 调入场站
	 * @param state 调拨状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	public PagedList<AllotOutput> list(String containerNo, String exitYard, String entryYard, String state, Integer pageNum, Integer pageSize) {
		BadContainerAllocationExample example = new BadContainerAllocationExample();
		BadContainerAllocationExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (containerNo!=null && containerNo!="") {
			criteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		if (exitYard!=null && exitYard!="") {
			criteria.andExitYardEqualTo(exitYard);
		}
		if (entryYard!=null && entryYard!="") {
			criteria.andEntryYardEqualTo(entryYard);
		}
		if (state!=null && state!="") {
			criteria.andStateEqualTo(state);
		}
		Integer totalItemCount = (int)badContainerAllocationMapper.countByExample(example);
		PagedList<AllotOutput> pagedList = new PagedList<>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<BadContainerAllocation> list = badContainerAllocationMapper.selectByExample(example);
		List<AllotOutput> outputList = new ArrayList<AllotOutput>();
		for (BadContainerAllocation item : list) {
			AllotOutput output = new AllotOutput();
			output.setProdBadContainerAllocationId(item.getProdBadContainerAllocationId());
			output.setOutCourse(item.getOutCourse());
			output.setInCourse(item.getInCourse());
			output.setAllocationNo(item.getAllocationNo());
			output.setCourse(item.getCourse());
			output.setContainerNo(item.getContainerNo());
			output.setExitYardLang(item.getExitYard());
			output.setExitYardKey(item.getExitYard());
			output.setEntryYardLang(item.getEntryYard());
			output.setEntryYardKey(item.getEntryYard());
			output.setContainerUserLang(item.getContainerUser());
			output.setContainerUserKey(item.getContainerUser());
			output.setFleet(item.getFleet());
			output.setPlateNo(item.getPlateNo());
			output.setCost(item.getCost());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			output.setAllocationTime(item.getAllocationTime()==null?"":sdf.format(item.getAllocationTime()));
			output.setStateLang(item.getState());
			output.setStateKey(item.getState());
			output.setReason(item.getReason());
			output.setRemark(item.getRemark());
			output.setAllocationTypeLang(item.getAllocationType());
			output.setAllocationTypeKey(item.getAllocationType());
			output.setDirectiveIssuer(item.getDirectiveIssuer());
			output.setDirectiveTime(item.getDirectiveTime()==null?"":sdf.format(item.getDirectiveTime()));
			output.setIdentifyPeople(item.getIdentifyPeople());
			output.setIdentifyTime(item.getIdentifyTime()==null?"":sdf.format(item.getIdentifyTime()));
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 新增
	 * @param inputs
	 */
	public void add(List<AllotAddInput> inputs) {
		for (AllotAddInput input : inputs) {
			BadContainerAllocation badContainerAllocation = new BadContainerAllocation();
			badContainerAllocation.setCourse(input.getProdCourseId());
			badContainerAllocation.setContainerNo(input.getContainerNo());
			badContainerAllocation.setContainerUser(input.getContainerUser());
			badContainerAllocation.setAllocationNo(String.valueOf(Calendar.getInstance().getTimeInMillis())); // 规则待定
			badContainerAllocation.setAllocationTime(new Date());
			badContainerAllocation.setState(AllotStateEnum.APPLYIN.getCode());
			badContainerAllocation.setAllocationType(AllotTypeEnum.IN.getCode());
			badContainerAllocation.setDirectiveIssuer(userMapper.selectByPrimaryKey(getCurrentUserId()).getUserName());
			badContainerAllocation.setDirectiveTime(new Date());
			badContainerAllocation.setCreateUser(getCurrentUserId());
			badContainerAllocation.setCreateTime(new Date());
			badContainerAllocation.setIsDel(PlatformConstants.ISDEL_NO);
			badContainerAllocationMapper.insertSelective(badContainerAllocation);
		}
	}
	
	/**
	 * 编辑
	 * @param input
	 */
	public void update(AllotUpdateInput input) {
		BadContainerAllocation badContainerAllocation = new BadContainerAllocation();
		badContainerAllocation.setProdBadContainerAllocationId(input.getProdBadContainerAllocationId());
		badContainerAllocation.setExitYard(input.getExitYard());
		badContainerAllocation.setEntryYard(input.getEntryYard());
		badContainerAllocation.setFleet(input.getFleet());
		badContainerAllocation.setPlateNo(input.getPlateNo());
		badContainerAllocation.setCost(Long.valueOf(input.getCost()));
		badContainerAllocation.setReason(input.getReason());
		badContainerAllocationMapper.updateByPrimaryKeySelective(badContainerAllocation);
	}
	
	/**
	 * 确认调入
	 * @param ids
	 */
	public void inConfirm(Integer[] ids) {
		for (Integer id : ids) {
			BadContainerAllocation badContainerAllocation = new BadContainerAllocation();
			badContainerAllocation.setProdBadContainerAllocationId(id);
			badContainerAllocation.setState(AllotStateEnum.ALREADYIN.getCode());
			badContainerAllocation.setIdentifyPeople(userMapper.selectByPrimaryKey(getCurrentUserId()).getUserName());
			badContainerAllocation.setIdentifyTime(new Date());
			badContainerAllocation.setUpdateUser(getCurrentUserId());
			badContainerAllocation.setUpdateTime(new Date());
			badContainerAllocationMapper.updateByPrimaryKeySelective(badContainerAllocation);
		}
	}
	
	/**
	 * 申请调回
	 * @param ids 坏箱调拨id集合
	 * @param fleet 车队
	 * @param plateNo 车牌号
	 * @param cost 费用
	 * @param reason 调回原因
	 */
	public void applyBack(Integer[] ids, String fleet, String plateNo, String cost, String reason) {
		// 根据调入记录，生成调回记录
		for (Integer id : ids) {
			BadContainerAllocation in = badContainerAllocationMapper.selectByPrimaryKey(id);
			BadContainerAllocation out = new BadContainerAllocation();
			out.setAllocationNo(in.getAllocationNo());
			out.setCourse(in.getCourse());
			out.setContainerNo(in.getContainerNo());
			out.setContainerUser(in.getContainerUser());
			out.setExitYard(in.getEntryYard());
			out.setEntryYard(in.getExitYard());
			out.setState(AllotStateEnum.APPLYBACK.getCode());
			out.setAllocationTime(new Date());
			out.setAllocationType(AllotTypeEnum.BACK.getCode());
			out.setDirectiveIssuer(userMapper.selectByPrimaryKey(getCurrentUserId()).getUserName());
			out.setDirectiveTime(new Date());
			out.setCreateUser(getCurrentUserId());
			out.setCreateTime(new Date());
			out.setIsDel(PlatformConstants.ISDEL_NO);
			out.setFleet(fleet);
			out.setPlateNo(plateNo);
			out.setCost(Long.valueOf(cost));
			out.setReason(reason);
			badContainerAllocationMapper.insertSelective(out);
			in.setState(AllotStateEnum.APPLYBACK.getCode());
			badContainerAllocationMapper.updateByPrimaryKeySelective(in);
		}
	}
	
	/**
	 * 确认调回
	 * @param ids
	 */
	public void backConfirm(Integer[] ids) {
		for (Integer id : ids) {
			BadContainerAllocation badContainerAllocation = new BadContainerAllocation();
			badContainerAllocation.setProdBadContainerAllocationId(id);
			badContainerAllocation.setState(AllotStateEnum.ALREADYBACK.getCode());
			badContainerAllocation.setIdentifyPeople(userMapper.selectByPrimaryKey(getCurrentUserId()).getUserName());
			badContainerAllocation.setIdentifyTime(new Date());
			badContainerAllocation.setUpdateUser(getCurrentUserId());
			badContainerAllocation.setUpdateTime(new Date());
			badContainerAllocationMapper.updateByPrimaryKeySelective(badContainerAllocation);
		}
	}
	
}
