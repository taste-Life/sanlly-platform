package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.HeavyEnterInfoMapper;
import com.sanlly.production.entity.HeavyEnterInfo;
import com.sanlly.production.entity.HeavyEnterInfoExample;
import com.sanlly.production.enums.HeavyContainerStateEnum;
import com.sanlly.production.models.output.heavyContainer.HeavyContainerOutput;
import com.sanlly.production.service.HeavyContainerService;
/**
 * 重箱监管实现类
 * @author zhangkai
 *
 */
@Service
public class HeavyContainerServiceImpl extends BaseServiceImpl implements HeavyContainerService {

	@Autowired
	private HeavyEnterInfoMapper heavyEnterInfoMapper;
	
	/**
	 * 列表
	 * @param vesVos 船名航次
	 * @param state 状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	@Override
	public PagedList<HeavyContainerOutput> list(String vesVos, String state, Integer pageNum, Integer pageSize) {
		HeavyEnterInfoExample example = new HeavyEnterInfoExample();
		example.setOrderByClause("create_time DESC");
		HeavyEnterInfoExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(getCurrentCompanyKey());
		List<String> states = new ArrayList<String>();
		// 未入港
		states.add(HeavyContainerStateEnum.UNENTER.getCode());
		// 已入港
		states.add(HeavyContainerStateEnum.ENTERED.getCode());
		// 监管中
		states.add(HeavyContainerStateEnum.WATCHING.getCode());
		// 转船
		states.add(HeavyContainerStateEnum.CHANGESHIP.getCode());
		criteria.andStateIn(states);
		if (vesVos != null && vesVos != "") {
			criteria.andVesVosEqualTo(vesVos);
		}
		if (state != null && state != "") {
			criteria.andStateEqualTo(state);
		}
		Integer totalItemCount = (int)heavyEnterInfoMapper.countByExample(example);
		PagedList<HeavyContainerOutput> pagedList = new PagedList<HeavyContainerOutput>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<HeavyEnterInfo> list = heavyEnterInfoMapper.selectByExample(example);
		List<HeavyContainerOutput> outputList = new ArrayList<HeavyContainerOutput>();
		for (HeavyEnterInfo item : list) {
			HeavyContainerOutput output = new HeavyContainerOutput();
			output.setProdHeavyEnterId(item.getProdHeavyEnterId());
			output.setContainerNo(item.getContainerNo());
			output.setContainerUserLang(item.getContainerUser());
			output.setIsExportLang(item.getIsExport());
			output.setVesVos(item.getVesVos());
			output.setSailingDate(DateUtil.date2String(item.getSailingDate()));
			output.setLocation(item.getLocation());
			output.setExitYardLang(item.getExitYard());
			output.setEntryTime(DateUtil.date2String(item.getEntryTime()));
			output.setSettingTemp(item.getSettingTemp()== null ? "" : item.getSettingTemp().toString());
			output.setSettingHumidity(item.getSettingHumidity() == null ? "" : item.getSettingHumidity().toString());
			output.setVent(item.getVent() == null ? "" : item.getVent().toString());
			output.setStateLang(item.getState());
			output.setRemark(item.getRemark());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 装船
	 * @param ids
	 */
	public void doSetShip(Integer[] ids) {
		for (Integer id : ids) {
			HeavyEnterInfo heavyEnterInfo = new HeavyEnterInfo();
			heavyEnterInfo.setProdHeavyEnterId(id);
			heavyEnterInfo.setState(HeavyContainerStateEnum.SETSHIP.getCode());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(heavyEnterInfo);
		}
	}
	
	/**
	 * 转船
	 * @param ids
	 * @param vesVos
	 */
	public void doChangeShip(Integer[] ids, String vesVos) {
		for (Integer id : ids) {
			HeavyEnterInfo heavyEnterInfo = new HeavyEnterInfo();
			heavyEnterInfo.setProdHeavyEnterId(id);
			heavyEnterInfo.setState(HeavyContainerStateEnum.CHANGESHIP.getCode());
			heavyEnterInfo.setVesVos(vesVos);
			heavyEnterInfoMapper.updateByPrimaryKeySelective(heavyEnterInfo);
		}
	}
	
	/**
	 * 退载
	 * @param ids
	 */
	public void doBackLoad(Integer[] ids) {
		for (Integer id : ids) {
			HeavyEnterInfo heavyEnterInfo = new HeavyEnterInfo();
			heavyEnterInfo.setProdHeavyEnterId(id);
			heavyEnterInfo.setState(HeavyContainerStateEnum.BACKLOAD.getCode());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(heavyEnterInfo);
		}
	}

}
