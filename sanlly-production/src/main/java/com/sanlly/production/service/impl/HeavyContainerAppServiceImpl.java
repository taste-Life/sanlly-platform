package com.sanlly.production.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.HeavyEnterInfoExtMapper;
import com.sanlly.production.dao.HeavyEnterInfoMapper;
import com.sanlly.production.dao.HeavyTempRecordExtMapper;
import com.sanlly.production.dao.HeavyTempRecordMapper;
import com.sanlly.production.dao.LangEnumMapper;
import com.sanlly.production.dao.YardPeroidSettingMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.HeavyEnterInfo;
import com.sanlly.production.entity.HeavyEnterInfoExample;
import com.sanlly.production.entity.HeavyTempRecord;
import com.sanlly.production.entity.HeavyTempRecordExample;
import com.sanlly.production.entity.LangEnum;
import com.sanlly.production.entity.LangEnumExample;
import com.sanlly.production.entity.YardPeroidSetting;
import com.sanlly.production.entity.YardPeroidSettingExample;
import com.sanlly.production.enums.CollectStateEnum;
import com.sanlly.production.enums.HeavyContainerStateEnum;
import com.sanlly.production.enums.HeavyContainerTagEnum;
import com.sanlly.production.models.input.app.heavyContainer.HeavyContainerSetPositionInput;
import com.sanlly.production.models.input.app.heavyContainer.HeavyContainerSetTempInput;
import com.sanlly.production.models.output.app.heavyContainer.DeviceStateOutput;
import com.sanlly.production.models.output.app.heavyContainer.GuaranteeOuput;
import com.sanlly.production.models.output.app.heavyContainer.HeavyContainerListOutput;
import com.sanlly.production.models.output.app.heavyContainer.HeavyContainerTempsOutput;
import com.sanlly.production.models.output.app.heavyContainer.HeavySupContainerListOutput;
import com.sanlly.production.models.output.app.heavyContainer.VoyageContainerOutput;
import com.sanlly.production.service.HeavyContainerAppService;

/**
 * 
* @Package com.sanlly.production.service.impl 
* @Description: APP重箱监管 
* @author zhangkai   
* @date 2019年9月2日 下午1:21:02 
* @version V1.0   
 */
@Service
public class HeavyContainerAppServiceImpl extends BaseServiceImpl implements HeavyContainerAppService {
	
	@Autowired
	private HeavyEnterInfoMapper heavyEnterInfoMapper;
	@Autowired
	private HeavyTempRecordMapper heavyTempRecordMapper;
	@Autowired
	private YardPeroidSettingMapper yardPeroidSettingMapper;
	@Autowired
	private LangEnumMapper langEnumMapper;
	@Autowired
	private HeavyEnterInfoExtMapper heavyEnterInfoExtMapper;
	@Autowired
	private HeavyTempRecordExtMapper heavyTempRecordExtMapper;
	@Autowired
	private CourseMapper courseMapper;

	/**
	 * 码头采集-箱列表
	 * @author zhangkai
	 */
	@Override
	public PagedList<HeavyContainerListOutput> list(String vesVos, String state, String containerNo, Integer pageNum,
			Integer pageSize) {
		List<HeavyContainerListOutput> outputList = new ArrayList<HeavyContainerListOutput>();
		HeavyEnterInfoExample heavyEnterInfoExample = new HeavyEnterInfoExample();
		HeavyEnterInfoExample.Criteria heavyEnterInfoCriteria = heavyEnterInfoExample.createCriteria();
		heavyEnterInfoCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (vesVos != null && vesVos != "") {
			heavyEnterInfoCriteria.andVesVosLike("%"+vesVos.trim()+"%");
		}
		if (state != null && state != "") {
			heavyEnterInfoCriteria.andStateEqualTo(state.trim());
		} else {
			// 箱列表显示的是state为待入港和已入港的
			List<String> stateList = new ArrayList<String>();
			stateList.add(HeavyContainerStateEnum.UNENTER.getCode());
			stateList.add(HeavyContainerStateEnum.ENTERED.getCode());
			heavyEnterInfoCriteria.andStateIn(stateList);
		}
		if (containerNo != null && containerNo != "") {
			heavyEnterInfoCriteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		Integer totalItemCount = (int)heavyEnterInfoMapper.countByExample(heavyEnterInfoExample);
		PagedList<HeavyContainerListOutput> pagedList = new PagedList<HeavyContainerListOutput>(pageNum, pageSize, totalItemCount);
		heavyEnterInfoExample.setLimitStart(pagedList.getLimitStart());
		heavyEnterInfoExample.setLimitEnd(pagedList.getLimitEnd());
		List<HeavyEnterInfo> heavyEnterInfos = heavyEnterInfoMapper.selectByExample(heavyEnterInfoExample);
		if (heavyEnterInfos == null || heavyEnterInfos.size() == 0) {
			pagedList.setDataList(outputList);
			return pagedList;
		}
		for (HeavyEnterInfo item : heavyEnterInfos) {
			HeavyContainerListOutput output = new HeavyContainerListOutput();
			output.setProdHeavyEnterId(item.getProdHeavyEnterId());
			output.setProdCourseId(item.getCourseId());
			output.setContainerNo(item.getContainerNo());
			output.setVesVos(item.getVesVos());
			output.setPosition(item.getLocation());
			output.setEntryTime(DateUtil.date2String(item.getEntryTime()));
			output.setStateLang(item.getState());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 重箱监管-批量设置入港时间和位置
	 * @param input
	 * @return
	 * @author zhangkai
	 * @throws ParseException 
	 */
	public boolean setPosition(HeavyContainerSetPositionInput input) throws ParseException {
		if (input == null || input.getProdHeavyEnterIds() == null || input.getProdHeavyEnterIds() == "") {
			return false;
		}
		if (input.getEntryTime() == null || input.getEntryTime() == "" || input.getPosition() == null || input.getPosition() == "") {
			return false;
		}
		for (String id : input.getProdHeavyEnterIds().split(",")) {
			HeavyEnterInfo record = new HeavyEnterInfo();
			record.setProdHeavyEnterId(Integer.valueOf(id));
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			record.setEntryTime(simpleDateFormat.parse(input.getEntryTime()));
			record.setLocation(input.getPosition());
			// 设置为已入港
			record.setState(HeavyContainerStateEnum.ENTERED.getCode());
			// 设置更新人
			record.setUpdateUser(getCurrentUserId());
			// 设置更新时间
			record.setUpdateTime(new Date());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(record);
		}
		return true;
	}
	
	/**
	 * 重箱监管-温度采集
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Transactional
	public boolean setTemp(HeavyContainerSetTempInput input) {
		if (input == null) {
			return false;
		}
		HeavyTempRecord record = new HeavyTempRecord();
		record.setHeavyEnterId(input.getProdHeavyEnterId());
		record.setCreateUser(getCurrentUserId());
		record.setCreateTime(new Date());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setRecordingPeroid(input.getRecordingPeriod());
		try {
			record.setSupplyTemp(Double.valueOf(input.getSupplyTemp()));
			record.setReturnTemp(Double.valueOf(input.getReturnTemp()));
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		record.setTab(input.getDeviceState());
		record.setRemark(input.getRemark());
		record.setPhoto(input.getTempPic());
		heavyTempRecordMapper.insertSelective(record);
		// 根据业务需要，当该次重箱监管第一次采集温度的时候，将重箱监管状态设置为监管中
		HeavyTempRecordExample example = new HeavyTempRecordExample();
		HeavyTempRecordExample.Criteria criteria = example.createCriteria();
		criteria.andHeavyEnterIdEqualTo(input.getProdHeavyEnterId());
		if (heavyTempRecordMapper.countByExample(example) == 1) {
			HeavyEnterInfo heavyEnterInfo = new HeavyEnterInfo();
			heavyEnterInfo.setState(HeavyContainerStateEnum.WATCHING.getCode());
			heavyEnterInfo.setUpdateUser(getCurrentUserId());
			heavyEnterInfo.setUpdateTime(new Date());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(heavyEnterInfo);
		}
		return true;
	}
	
	/**
	 * 重箱监管-查看温度记录
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	public List<HeavyContainerTempsOutput> temps(Integer prodHeavyEnterId) {
		List<HeavyContainerTempsOutput> outputList = new ArrayList<HeavyContainerTempsOutput>();
		HeavyEnterInfo record = heavyEnterInfoMapper.selectByPrimaryKey(prodHeavyEnterId);
		if (record == null) {
			return outputList;
		}
		String containerNo = record.getContainerNo();
		HeavyTempRecordExample example = new HeavyTempRecordExample();
		HeavyTempRecordExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andHeavyEnterIdEqualTo(prodHeavyEnterId);
		List<HeavyTempRecord> temps = heavyTempRecordMapper.selectByExample(example);
		if (temps == null || temps.size() == 0) {
			return outputList;
		}
		for (HeavyTempRecord item : temps) {
			HeavyContainerTempsOutput output = new HeavyContainerTempsOutput();
			output.setContainerNo(containerNo);
			output.setRecordTime(DateUtil.date2String(item.getCreateTime()));
			output.setProdHeavyTempRecordId(item.getProdHeavyTempRecordId());
			output.setRecordingPeriod(item.getRecordingPeroid());
			if (item.getSupplyTemp() == null) {
				output.setSupplyTemp("");
			} else {
				output.setSupplyTemp(item.getSupplyTemp().toString());
			}
			if (item.getReturnTemp() == null) {
				output.setReturnTemp("");
			} else {
				output.setReturnTemp(item.getReturnTemp().toString());
			}
			output.setRemark(item.getRemark());
			outputList.add(output);
		}
		return outputList;
	}
	
	/**
	 * 重箱监管-时间段列表（根据公司key获取）
	 * @param companyKey
	 * @return
	 * @author zhangkai
	 */
	public List<String> recordingPeroids(String companyKey) {
		List<String> list = new ArrayList<String>();
		YardPeroidSettingExample example = new YardPeroidSettingExample();
		YardPeroidSettingExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
		criteria.andCompanyEqualTo(companyKey);
		List<YardPeroidSetting> result = yardPeroidSettingMapper.selectByExample(example);
		if (result == null || result.size() == 0) {
			return list;
		}
		for (YardPeroidSetting item : result) {
			list.add(item.getRecordingPeroid());
		}
		return list;
	}
	
	/**
	 * 重箱监管-监管箱列表
	 * @param recordingPeroid
	 * @param position
	 * @param isCollect
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PagedList<HeavySupContainerListOutput> heavySupContainers(
				String recordingPeroid,
				String position,
				String isCollect,
				Integer pageNum,
				Integer pageSize
			) {
		List<HeavySupContainerListOutput> outputList = new ArrayList<HeavySupContainerListOutput>();
		HeavyEnterInfoExample enterInfoExample = new HeavyEnterInfoExample();
		HeavyEnterInfoExample.Criteria enterInfoCriteria = enterInfoExample.createCriteria();
		enterInfoCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 监管箱列表显示的是状态是已入港和监管中的
		List<String> stateList = new ArrayList<String>();
		stateList.add(HeavyContainerStateEnum.ENTERED.getCode());
		stateList.add(HeavyContainerStateEnum.WATCHING.getCode());
		enterInfoCriteria.andStateIn(stateList);
		if (position != null && position != "") {
			enterInfoCriteria.andLocationLike("%"+position.trim()+"%");
		}
		enterInfoCriteria.andCompanyEqualTo(getCurrentCompanyKey());
		// 查询温度采集记录表中，哪些重箱已经采集了该时段的温度信息
		HeavyTempRecordExample tempRecordExample = new HeavyTempRecordExample();
		HeavyTempRecordExample.Criteria tempRecordCriteria = tempRecordExample.createCriteria();
		tempRecordCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		tempRecordCriteria.andRecordingPeroidEqualTo(recordingPeroid);
		Calendar start = Calendar.getInstance();
		start.set(Calendar.HOUR_OF_DAY, 0);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		start.set(Calendar.MILLISECOND, 0);
		Calendar end = Calendar.getInstance();
		end.set(Calendar.HOUR_OF_DAY, 0);
		end.set(Calendar.MINUTE, 0);
		end.set(Calendar.SECOND, 0);
		end.set(Calendar.MILLISECOND, 0);
		end.add(Calendar.DATE, 1);
		start.getTime();
		tempRecordCriteria.andCreateTimeBetween(start.getTime(), end.getTime());
		List<HeavyTempRecord> tempRecords = heavyTempRecordMapper.selectByExample(tempRecordExample);
		List<Integer> heavyEnterIdList = new ArrayList<Integer>();
		if (tempRecords != null && tempRecords.size() != 0) {
			for (HeavyTempRecord iTempRecord : tempRecords) {
				heavyEnterIdList.add(iTempRecord.getHeavyEnterId());
			}
		}

		if ((CollectStateEnum.UNCOLLECT.getCode().equals(isCollect)) && heavyEnterIdList.size() != 0) {
			// 查未采集的
			enterInfoCriteria.andProdHeavyEnterIdNotIn(heavyEnterIdList);
		} else if (CollectStateEnum.COLLECT.getCode().equals(isCollect)) {
			if (heavyEnterIdList.size() == 0) {
				// 全部都是未采集的
				return new PagedList<HeavySupContainerListOutput>(pageNum, pageSize, 0);
			}
			// 已采集的
			enterInfoCriteria.andProdHeavyEnterIdIn(heavyEnterIdList);
		} 
		Integer totalItemCount = (int)heavyEnterInfoMapper.countByExample(enterInfoExample);
		PagedList<HeavySupContainerListOutput> pagedList = new PagedList<HeavySupContainerListOutput>(pageNum, pageSize, totalItemCount);
		enterInfoExample.setLimitStart(pagedList.getLimitStart());
		enterInfoExample.setLimitEnd(pagedList.getLimitEnd());
		List<HeavyEnterInfo> heavyEnterInfos = heavyEnterInfoMapper.selectByExample(enterInfoExample);
		if (heavyEnterInfos == null || heavyEnterInfos.size() == 0) {
			return pagedList;
		}
		for (HeavyEnterInfo item : heavyEnterInfos) {
			HeavySupContainerListOutput output = new HeavySupContainerListOutput();
			output.setProdHeavyEnterId(item.getProdHeavyEnterId());
			output.setProdCourseId(item.getCourseId());
			output.setContainerNo(item.getContainerNo());
			output.setContainerUserLang(item.getContainerUser());
			output.setIsExportLang(item.getIsExport());
			output.setVesVos(item.getVesVos());
			output.setSailingDate(DateUtil.date2String(item.getSailingDate()));
			output.setPosition(item.getLocation());
			output.setExitYardLang(item.getExitYard());
			output.setEntryTime(DateUtil.date2String(item.getEntryTime()));
			if (heavyEnterIdList.contains(item.getProdHeavyEnterId())) {
				// 已采集
				output.setCollectStateLang(CollectStateEnum.COLLECT.getCode());
			} else {
				// 未采集
				output.setCollectStateLang(CollectStateEnum.UNCOLLECT.getCode());
			}
			if (item.getSettingTemp() == null) {
				output.setSettingTemp("");
			} else {
				output.setSettingTemp(item.getSettingTemp().toString());
			}
			output.setSettingHumidity(item.getSettingHumidity().toString());
			output.setVent(item.getVent().toString());
			output.setStateLang(item.getState());
			output.setRemark(item.getRemark());
			HeavyTempRecordExample heavyTempRecordExample = new HeavyTempRecordExample();
			// 先比较创建时间，再比较记录时段，倒叙。没有记录，说明未采集，有记录，取第一条（即取最近一次的采集记录）
			heavyTempRecordExample.setOrderByClause("create_time DESC, recording_peroid DESC");
			HeavyTempRecordExample.Criteria heavyTempRecordCriteria = heavyTempRecordExample.createCriteria();
			heavyTempRecordCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			heavyTempRecordCriteria.andHeavyEnterIdEqualTo(item.getProdHeavyEnterId());
			List<HeavyTempRecord> heavyTempRecords = heavyTempRecordMapper.selectByExample(heavyTempRecordExample);
			if (heavyTempRecords == null || heavyTempRecords.size() == 0) {
				output.setSupplyTemp("");
				output.setReturnTemp("");
			} else {
				if (heavyTempRecords.get(0).getSupplyTemp() == null) {
					output.setSupplyTemp("");
				} else {
					output.setSupplyTemp(heavyTempRecords.get(0).getSupplyTemp().toString());
				}
				if (heavyTempRecords.get(0).getReturnTemp() == null) {
					output.setReturnTemp("");
				} else {
					output.setReturnTemp(heavyTempRecords.get(0).getReturnTemp().toString());
				}
				output.setRecordingPeriod(heavyTempRecords.get(0).getRecordingPeroid());
				output.setDeviceStateLang(heavyTempRecords.get(0).getTab());
			}
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;	
	}
	
	/**
	 * 重箱监管-设备状态列表
	 * @return
	 * @author zhangkai
	 */
	public List<DeviceStateOutput> deviceStates() {
		List<DeviceStateOutput> outputList = new ArrayList<DeviceStateOutput>(); 
		LangEnumExample example = new LangEnumExample();
		LangEnumExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andEnumNameEqualTo("HeavyContainerTagEnum");
		List<LangEnum> result = langEnumMapper.selectByExample(example);
		if (result == null || result.size() == 0) {
			return outputList;
		}
		for (LangEnum item : result) {
			DeviceStateOutput output = new DeviceStateOutput();
			output.setDeviceStateKey(item.getEnumKey());
			output.setDeviceStateNameLang(item.getEnumKey());
			outputList.add(output);
		}
		return outputList;
	}
	
	/**
	 * 重箱监管-船名航次列表（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	public PagedList<String> voyages(Integer pageNum, Integer pageSize) {
		// 船名航次列表只查询已进港和监管中的记录
		Integer totalItemCount = heavyEnterInfoExtMapper.count();
		PagedList<String> pagedList = new PagedList<String>(pageNum, pageSize, totalItemCount);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pagedList.getLimitStart());
		map.put("end", pagedList.getLimitEnd());
		List<String> list = heavyEnterInfoExtMapper.voyages(map);
		pagedList.setDataList(list);
		return pagedList;
	}
	
	/**
	 * 航次箱列表-分页
	 * @param vesVos
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	public PagedList<VoyageContainerOutput> voyageContainers(String vesVos, Integer pageNum, Integer pageSize) {
		HeavyEnterInfoExample example = new HeavyEnterInfoExample();
		HeavyEnterInfoExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andVesVosEqualTo(vesVos);
		List<String> stateList = new ArrayList<String>();
		stateList.add(HeavyContainerStateEnum.ENTERED.getCode());
		stateList.add(HeavyContainerStateEnum.WATCHING.getCode());
		criteria.andStateIn(stateList);
		Integer totalItemCount = (int)heavyEnterInfoMapper.countByExample(example);
		PagedList<VoyageContainerOutput> pagedList = new PagedList<VoyageContainerOutput>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<HeavyEnterInfo> list = heavyEnterInfoMapper.selectByExample(example);
		List<VoyageContainerOutput> outputList = new ArrayList<VoyageContainerOutput>();
		if (list == null || list.size() == 0) {
			return pagedList;
		}
		for (HeavyEnterInfo item : list) {
			VoyageContainerOutput output = new VoyageContainerOutput();
			output.setProdHeavyEnterId(item.getProdHeavyEnterId());
			output.setContainerNo(item.getContainerNo());
			output.setVesVos(item.getVesVos());
			output.setShipmentDate(DateUtil.date2String(item.getShipmentDate()));
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 装船
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	public boolean setShipment(String prodHeavyEnterIds) {
		String[] prodHeavyEnterIdArr = prodHeavyEnterIds.split(",");
		for (String item :prodHeavyEnterIdArr) {
			HeavyEnterInfo record = new HeavyEnterInfo();
			record.setProdHeavyEnterId(Integer.valueOf(item));
			record.setState(HeavyContainerStateEnum.SETSHIP.getCode());
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(record);
		}
		return true;
	}
	
	/**
	 * 转船
	 * @param prodHeavyEnterId
	 * @param vesVos
	 * @return
	 * @author zhangkai
	 */
	public boolean transshipment(String prodHeavyEnterIds, String vesVos) {
		String[] prodHeavyEnterIdArr = prodHeavyEnterIds.split(",");
		for (String item : prodHeavyEnterIdArr) {
			HeavyEnterInfo record = new HeavyEnterInfo();
			record.setProdHeavyEnterId(Integer.valueOf(item));
			record.setVesVos(vesVos);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(record);
		}
		return true;
	}
	
	/**
	 * 退载
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	public boolean setBack(String prodHeavyEnterIds) {
		String[] prodHeavyEnterIdArr = prodHeavyEnterIds.split(",");
		for (String item : prodHeavyEnterIdArr) {
			HeavyEnterInfo record = new HeavyEnterInfo();
			record.setProdHeavyEnterId(Integer.valueOf(item));
			record.setState(HeavyContainerStateEnum.BACKLOAD.getCode());
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			heavyEnterInfoMapper.updateByPrimaryKeySelective(record);
		}
		return true;
	}
	
	/**
	 * 保函
	 * @param containerNo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	public PagedList<GuaranteeOuput> guarantees(String containerNo, Integer pageNum, Integer pageSize) {
		// 从温度采集记录表中根据重箱id分组取最新一条数据，组成一个集合
		List<HeavyTempRecord> lastTempList = heavyTempRecordExtMapper.lastTemp();
		if (lastTempList == null || lastTempList.size() == 0) {
			return new PagedList<GuaranteeOuput>(pageNum, pageSize, 0);
		}
		List<Integer> highTempHeavyEnterIdList = new ArrayList<Integer>();
		for (HeavyTempRecord item : lastTempList) {
			// 把货温高的记录的heavy_enter_id加入集合
			if (HeavyContainerTagEnum.HIGHTEMP.getCode().equals(item.getTab())) {
				highTempHeavyEnterIdList.add(item.getHeavyEnterId());
			}
		}
		// 获取重箱监管主表中主键在highTempHeavyEnterIdList的记录，关联prod_course表获取提单号，返回给页面
		HeavyEnterInfoExample example = new HeavyEnterInfoExample();
		HeavyEnterInfoExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (containerNo != null && containerNo != "") {
			criteria.andContainerNoLike("%"+containerNo+"%");
		}
		// 只获取监管中的
		criteria.andStateEqualTo(HeavyContainerStateEnum.WATCHING.getCode());
		criteria.andProdHeavyEnterIdIn(highTempHeavyEnterIdList);
		Integer totalItemCount = (int)heavyEnterInfoMapper.countByExample(example);
		PagedList<GuaranteeOuput> pagedList = new PagedList<GuaranteeOuput>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<HeavyEnterInfo> heavyEnterInfos = heavyEnterInfoMapper.selectByExample(example);
		if (heavyEnterInfos == null || heavyEnterInfos.size() == 0) {
			return pagedList;
		}
		List<GuaranteeOuput> outputList = new ArrayList<GuaranteeOuput>();
		for (HeavyEnterInfo item : heavyEnterInfos) {
			GuaranteeOuput output = new GuaranteeOuput();
			output.setProdHeavyEnterId(item.getProdHeavyEnterId());
			output.setContainerNo(item.getContainerNo());
			output.setContainerUserLang(item.getContainerUser());
			output.setVesVos(item.getVesVos());
			output.setPosition(item.getLocation());
			output.setExitYardLang(item.getExitYard());
			output.setEntryTime(DateUtil.date2String(item.getEntryTime()));
			output.setSettingTemp(item.getSettingTemp().toString());
			output.setSettingHumidity(item.getSettingHumidity().toString());
			// 设置当前温度
			for (HeavyTempRecord tempRecord : lastTempList) {
				if (item.getProdHeavyEnterId() == tempRecord.getHeavyEnterId()) {
					if (Double.valueOf(item.getSettingTemp()) >= -5) {
						output.setNowTemp(tempRecord.getSupplyTemp().toString());
					} else {
						output.setNowTemp(tempRecord.getReturnTemp().toString());
					}
				}
			}
			Course course = courseMapper.selectByPrimaryKey(item.getCourseId());
			if (course == null) {
				output.setOrderNum("");
			} else {
				output.setOrderNum(course.getBillOfLadingNo());
			}
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
}
