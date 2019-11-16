package com.sanlly.production.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.OutContainerMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.dao.WorkGroupMapper;
import com.sanlly.production.dao.XxContainerMapper;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.OutContainer;
import com.sanlly.production.entity.OutContainerExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseExample.Criteria;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.User;
import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.entity.WorkGroupExample;
import com.sanlly.production.entity.XxContainer;
import com.sanlly.production.entity.XxContainerExample;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.OkNotOkEnum;
import com.sanlly.production.enums.PreviewStateEnum;
import com.sanlly.production.enums.ProdDeptEnum;
import com.sanlly.production.enums.WorkGroupTypeEnum;
import com.sanlly.production.enums.ZoneTypeEnum;
import com.sanlly.production.models.input.out.OutIdsInput;
import com.sanlly.production.models.input.out.OutRemarkInput;
import com.sanlly.production.models.input.out.OutRemarksInput;
import com.sanlly.production.models.output.app.out.OutRecordListOutput;
import com.sanlly.production.models.output.out.MoveListOutput;
import com.sanlly.production.models.output.out.OperatorOutput;
import com.sanlly.production.models.output.out.OutListOutput;
import com.sanlly.production.service.OutService;

/**
 * 
* @Package com.sanlly.production.service.impl 
* @Description: 出箱 
* @author zhangkai   
* @date 2019年8月28日 下午2:18:11 
* @version V1.0   
 */
@Service
public class OutServiceImpl extends BaseServiceImpl implements OutService {
	
	@Autowired
	private UnitCourseMapper unitCourseMapper;
	@Autowired
	private XxContainerMapper xxContainerMapper;
	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private OutContainerMapper outContainerMapper;
	@Autowired
	private ContainerMapper containerMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private WorkGroupMapper workGroupMapper;
	@Autowired
	private YardZoneMapper yardZoneMapper;
	
	/**
	 * 
	* @Description: 出箱列表
	* @param zoneKeys
	* @param containerNo
	* @param ptiResult
	* @param index
	* @param size
	* @return PagedList<OutListOutput>
	* @throws 
	* @author zhangkai
	 */
	public PagedList<OutListOutput> list(String[] zoneKeys, String containerNo, String ptiResult, Integer index, Integer size) {
		List<OutListOutput> outputList = new ArrayList<OutListOutput>();
		// 该场站在预检区区位的
		YardZoneExample yardZoneExample = new YardZoneExample();
		YardZoneExample.Criteria yardZoneCriteria = yardZoneExample.createCriteria();
		yardZoneCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		yardZoneCriteria.andYardEqualTo(getCurrentYardKey());
		yardZoneCriteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode());
		List<YardZone> yardZones = yardZoneMapper.selectByExample(yardZoneExample);
		if (yardZones == null || yardZones.size() == 0) {
			return new PagedList<OutListOutput>(index, size, 0);
		}
		List<String> yardKeys = new ArrayList<String>();
		for (YardZone yardZone : yardZones) {
			yardKeys.add(yardZone.getKey());
		}
		UnitCourseExample unitCourseExample = new UnitCourseExample();
		Criteria unitCourseCriteria = unitCourseExample.createCriteria();
		unitCourseCriteria.andZoneIn(yardKeys);
		
		if (ptiResult !=null && ptiResult != "") {
			XxContainerExample xxContainerExample = new XxContainerExample();
			XxContainerExample.Criteria xxContainerCriteria = xxContainerExample.createCriteria();
			xxContainerCriteria.andPtiResultEqualTo(ptiResult);
			List<XxContainer> xxContainerList = xxContainerMapper.selectByExample(xxContainerExample);
			List<String> courses = new ArrayList<String>();
			if (xxContainerList == null || xxContainerList.size() == 0) {
				return new PagedList<OutListOutput>(index, size, 0);
			}
			for (XxContainer item : xxContainerList) {
				String course = item.getCourse();
				courses.add(course);
			}
			unitCourseCriteria.andProdCourseIdIn(courses);
		}
		
		if (zoneKeys != null && zoneKeys.length != 0) {
			unitCourseCriteria.andZoneIn(Arrays.asList(zoneKeys));
		}
		if (containerNo != null && containerNo != "") {
			unitCourseCriteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		
		Integer totalItemCount = (int)unitCourseMapper.countByExample(unitCourseExample);
		PagedList<OutListOutput> pagedList = new PagedList<OutListOutput>(index, size, totalItemCount);
		unitCourseExample.setLimitStart(pagedList.getLimitStart());
		unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
		List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);
		if (unitCourseList == null || unitCourseList.size() == 0) {
			return new PagedList<>(index, size, 0);
		}
		
		for (UnitCourse item : unitCourseList) {
			OutListOutput output = new OutListOutput();
			output.setProdCourseId(item.getProdCourseId());
			output.setContainerNo(item.getContainerNo());
			output.setZoneLang(item.getZone());
			output.setUnitTypeLang(item.getUnitType());
			output.setStartDate(item.getStartDate());
			output.setIsTemperatureLang(item.getIsTemperature());
			output.setIsHumidityLang(item.getIsHumidity());
			output.setIsVentilationLang(item.getIsVentilation());
			output.setIsFireTestLang(item.getIsFireTest());
			output.setPreviewStateLang(item.getPreviewState());
			output.setUnitStateLang(item.getUnitState());
			output.setUnitReferralStateLang(item.getReferralState());
			// 获取同进场id的箱体信息
			Course course = courseMapper.selectByPrimaryKey(item.getProdCourseId());
			// 由于数据库数据不准确，暂做如下处理
			if (course == null) {
				continue;
			}
			output.setContainerUserLang(course.getContainerUser());
			output.setContainerVolume(course.getContainerVolume());
			output.setOutContainerRemarks(item.getOutRemarks());
			output.setContainerConditionLang(course.getContainerCondition());
			output.setContainerReferralStateLang(course.getReferralState());
			// 获取同进场id的xx箱表的pti结果
			XxContainerExample xxContainerExample = new XxContainerExample();
			XxContainerExample.Criteria xxCriteria = xxContainerExample.createCriteria();
			xxCriteria.andCourseEqualTo(item.getProdCourseId());
			List<XxContainer> xxContainers = xxContainerMapper.selectByExample(xxContainerExample);
			if (xxContainers == null || xxContainers.size() == 0) {
				output.setPtiResultLang("");
				output.setPtiResultKey("");
			} else {
				// 由业务决定，同一进场id在xx箱表里只会有一条记录
				output.setPtiResultLang(xxContainers.get(0).getPtiResult());
				output.setPtiResultKey(xxContainers.get(0).getPtiResult());
			}
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 
	* @Description: 保存出箱备注 
	* @return boolean
	* @throws 
	* @author zhangkai
	 */
	public boolean saveRemarks(OutRemarksInput inputList) {
		if (inputList == null) {
			return false;
		}
		if (inputList.getRemarkList() == null || inputList.getRemarkList().size() == 0) {
			return false;
		}
		for (OutRemarkInput item : inputList.getRemarkList()) {
			UnitCourseWithBLOBs record = new UnitCourseWithBLOBs();
			record.setProdCourseId(item.getProdCourseId());
			record.setOutRemarks(item.getOutContainerRemarks());
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(record);
		}
		return true;
	}
	
	/**
	 * 原移
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	public boolean setMove(OutIdsInput input) {
		if (input == null || input.getProdCourseIdList() == null || input.getProdCourseIdList().size() == 0) {
			return false;
		}
		for (String prodCourseId : input.getProdCourseIdList()) {
			UnitCourseWithBLOBs unitCourse = new UnitCourseWithBLOBs();
			unitCourse.setProdCourseId(prodCourseId);
			unitCourse.setPreviewState(PreviewStateEnum.MOVE.getCode());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourse.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(unitCourse);
		}
		return true;
	}
	
	/**
	 * 出箱列表PTIOK
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	public boolean setPtiOk(OutIdsInput input) {
		if (input == null || input.getProdCourseIdList() == null || input.getProdCourseIdList().size() == 0) {
			return false;
		}
		for (String prodCourseId : input.getProdCourseIdList()) {
			// 取消原移标记
			UnitCourseWithBLOBs unitCourse = new UnitCourseWithBLOBs();
			unitCourse.setProdCourseId(prodCourseId);
			unitCourse.setPreviewState(PreviewStateEnum.DEFAULT.getCode());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourse.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(unitCourse);
			// 修改ptiok最终结果
			XxContainerExample example = new XxContainerExample();
			XxContainerExample.Criteria criteria = example.createCriteria();
			criteria.andCourseEqualTo(prodCourseId);
			XxContainer xxContainer = new XxContainer();
			xxContainer.setPtiLastResult(OkNotOkEnum.OK.getCode());
			xxContainer.setUpdateUser(getCurrentUserId());
			xxContainer.setUpdateTime(new Date());
			xxContainerMapper.updateByExampleSelective(xxContainer, example);
		}
		return true;
	}
	
	/**
	 * 出箱操作
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public boolean outLeave(OutIdsInput input) {
		if (input == null || input.getProdCourseIdList() == null || input.getProdCourseIdList().size() == 0) {
			return false;
		}
		String batchNumber = String.valueOf(Calendar.getInstance().getTimeInMillis());
		for(String courseId:input.getProdCourseIdList()) {
			UnitCourse unitCourse=unitCourseMapper.selectByPrimaryKey(courseId);
			OutContainer outRecord=new OutContainer();
			//记录原区位
			outRecord.setOldZone(unitCourse.getZone());
			//清空区位
			unitCourse.setZone(null);
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseMapper.updateByPrimaryKey(unitCourse);
			//生成出箱操作记录
			outRecord.setContainerNo(unitCourse.getContainerNo());
			outRecord.setCreateUser(getCurrentUserId());
			outRecord.setCreateTime(new Date());
			//箱id
			ContainerExample cExp=new ContainerExample();
			cExp.createCriteria().andContainerNoEqualTo(outRecord.getContainerNo());
			outRecord.setContainer(containerMapper.selectByExample(cExp).get(0).getProdContainerId());
			//批次号
			outRecord.setBatchNumber(batchNumber);
			outContainerMapper.insert(outRecord);
		}
		return true;
	}
	
	/**
	 * 原移列表
	 * @param zoneKeys
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 * @author zhangkai
	 */
	public PagedList<MoveListOutput> moveList(String[] zoneKeys, String containerNo, Integer index, Integer size) {
		List<MoveListOutput> outputList = new ArrayList<MoveListOutput>();
		List<String> conditionList = new ArrayList<String>();
		XxContainerExample allXxContainerExample = new XxContainerExample();
		List<XxContainer> allXxContainerList = xxContainerMapper.selectByExample(allXxContainerExample);
		List<String> allIds = new ArrayList<String>();
		for (XxContainer ele : allXxContainerList) {
			allIds.add(ele.getCourse());
		}
		UnitCourseExample unitCourseExample1 = new UnitCourseExample();
		if (allIds != null && allIds.size() != 0) {
			UnitCourseExample.Criteria unitCourseCriteria1 = unitCourseExample1.createCriteria();
			unitCourseCriteria1.andProdCourseIdNotIn(allIds);
			List<UnitCourse> unitCourses1 = unitCourseMapper.selectByExample(unitCourseExample1);
			List<String> unitCourseIds1 = new ArrayList<String>();
			for (UnitCourse unitCourse1 : unitCourses1) {
				unitCourseIds1.add(unitCourse1.getProdCourseId());
			}
			// 未确认ptiok的
			XxContainerExample xxContainerExample = new XxContainerExample();
			XxContainerExample.Criteria xxContainerCriteria = xxContainerExample.createCriteria();
			xxContainerCriteria.andPtiLastResultIsNull();
			List<XxContainer> xxContainerList = xxContainerMapper.selectByExample(xxContainerExample);
			// 未确认ptiok的进场id集合
			List<String> courses = new ArrayList<String>();
			for (XxContainer item : xxContainerList) {
				String course = item.getCourse();
				courses.add(course);
			}
			unitCourseIds1.addAll(courses);
			conditionList = unitCourseIds1;
		} else {
			List<UnitCourse> unitCourses2 = unitCourseMapper.selectByExample(unitCourseExample1);
			for (UnitCourse unitCourse2 : unitCourses2) {
				conditionList.add(unitCourse2.getProdCourseId());
			}
		}
		if (conditionList == null || conditionList.size() == 0) {
			return new PagedList<MoveListOutput>(index, size, 0);
		}
		UnitCourseExample unitCourseExample = new UnitCourseExample();
		Criteria unitCourseCriteria = unitCourseExample.createCriteria();
		// 原移的
		unitCourseCriteria.andPreviewStateEqualTo(PreviewStateEnum.MOVE.getCode());
		// 未确认ptiok的
		unitCourseCriteria.andProdCourseIdIn(conditionList);
		if (zoneKeys != null && zoneKeys.length != 0) {
			unitCourseCriteria.andZoneIn(Arrays.asList(zoneKeys));
		}
		if (containerNo != null && containerNo != "") {
			unitCourseCriteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		Integer totalItemCount = (int)unitCourseMapper.countByExample(unitCourseExample);
		PagedList<MoveListOutput> pagedList = new PagedList<MoveListOutput>(index, size, totalItemCount);
		unitCourseExample.setLimitStart(pagedList.getLimitStart());
		unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
		List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);
		if (unitCourseList == null || unitCourseList.size() == 0) {
			return new PagedList<>(index, size, 0);
		}
		for (UnitCourse item : unitCourseList) {
			MoveListOutput output = new MoveListOutput();
			output.setProdCourseId(item.getProdCourseId());
			output.setContainerNo(item.getContainerNo());
			output.setZoneLang(item.getZone());
			output.setUnitTypeLang(item.getUnitType());
			output.setStartDate(item.getStartDate());
			output.setIsTemperatureLang(item.getIsTemperature());
			output.setIsHumidityLang(item.getIsHumidity());
			output.setIsVentilationLang(item.getIsVentilation());
			output.setIsFireTestLang(item.getIsFireTest());
			output.setUnitStateLang(item.getUnitState());
			output.setUnitReferralStateLang(item.getReferralState());
			// 获取同进场id的箱体信息
			Course course = courseMapper.selectByPrimaryKey(item.getProdCourseId());
			// 由于数据库数据不准确，暂做如下处理
			if (course == null) {
				continue;
			}
			output.setContainerUserLang(course.getContainerUser());
			output.setContainerVolume(course.getContainerVolume());
			output.setTestingRemarks(course.getTestingRemarks());
			output.setContainerConditionLang(course.getContainerCondition());
			output.setContainerReferralStateLang(course.getReferralState());
			// 获取同进场id的xx箱表的pti结果
			XxContainerExample xxExample = new XxContainerExample();
			XxContainerExample.Criteria xxCriteria = xxExample.createCriteria();
			xxCriteria.andCourseEqualTo(item.getProdCourseId());
			List<XxContainer> xxContainers = xxContainerMapper.selectByExample(xxExample);
			if (xxContainers == null || xxContainers.size() == 0) {
				output.setPtiResultLang("");
			} else {
				// 由业务决定，同一进场id在xx箱表里只会有一条记录
				output.setPtiResultLang(xxContainers.get(0).getPtiResult());
			}
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 取消原移
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	public boolean cancelMove(OutIdsInput input) {
		if (input == null || input.getProdCourseIdList() == null || input.getProdCourseIdList().size() == 0) {
			return false;
		}
		for (String prodCourseId : input.getProdCourseIdList()) {
			UnitCourseWithBLOBs record = new UnitCourseWithBLOBs();
			record.setProdCourseId(prodCourseId);
			record.setPreviewState(PreviewStateEnum.DEFAULT.getCode());
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			unitCourseMapper.updateByPrimaryKeySelective(record);
		}
		return true;
	}
	
	/**
	 * 出箱记录列表
	 * @param batchNum
	 * @param containerNo
	 * @param operator
	 * @param startTime
	 * @param endTime
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	public PagedList<OutRecordListOutput> outRecordList(String batchNum, String containerNo, Integer operator, 
			String startTime, String endTime, Integer pageNum, Integer pageSize) {
		OutContainerExample example = new OutContainerExample();
		OutContainerExample.Criteria criteria = example.createCriteria();
		if (batchNum != null && batchNum != "") {
			criteria.andBatchNumberLike("%"+batchNum.trim()+"%");
		}
		if (containerNo != null && containerNo != "") {
			criteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		if (operator != null) {
			criteria.andCreateUserEqualTo(operator);
		}
		if (startTime != null && startTime != "" && endTime != null && endTime != "") {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			try {
				criteria.andCreateTimeBetween(sdf.parse(startTime), sdf.parse(endTime));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		Integer totalItemCount = (int)outContainerMapper.countByExample(example);
		PagedList<OutRecordListOutput> pagedList = new PagedList<OutRecordListOutput>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<OutContainer> list = outContainerMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return pagedList;
		}
		List<OutRecordListOutput> outputList = new ArrayList<OutRecordListOutput>();
		for (OutContainer item : list) {
			OutRecordListOutput output = new OutRecordListOutput();
			output.setProdOutContainerId(item.getProdOutContainerId());
			output.setBatchNumber(item.getBatchNumber());
			output.setContainerNo(item.getContainerNo());
			output.setCreateTime(DateUtil.date2String(item.getCreateTime()));
			// 根据操作者id获取操作者姓名
			User user = userMapper.selectByPrimaryKey(item.getCreateUser());
			if (user == null) {
				output.setOperator("");
			} else {
				output.setOperator(user.getUserName());
			}
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 出箱记录操作人列表
	 * @return
	 * @author zhangkai
	 */
	public List<OperatorOutput> operators() {
		WorkGroupExample example = new WorkGroupExample();
		WorkGroupExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(getCurrentCompanyKey());
		criteria.andYardEqualTo(getCurrentYardKey());
		criteria.andProdDeptEqualTo(ProdDeptEnum.UNIT.getCode());
		criteria.andWorkGroupTypeEqualTo(WorkGroupTypeEnum.UNITCHECK.getCode());
		List<WorkGroup> list = workGroupMapper.selectByExample(example);
		List<OperatorOutput> outputList = new ArrayList<OperatorOutput>();
		if (list == null || list.size() == 0) {
			return outputList;
		}
		for (WorkGroup item : list) {
			OperatorOutput output = new OperatorOutput();
			output.setUserId(item.getUser());
			User user = userMapper.selectByPrimaryKey(item.getUser());
			if (user == null) {
				continue;
			}
			output.setUserName(user.getUserName());
			outputList.add(output);
		}
		return outputList;
	}
	
	/**
	 * 取消出箱
	 * @param ids
	 */
	@Transactional
	public void cancelOut(Integer[] ids) {
		for (Integer id : ids) {
			// 将原区位恢复至机组进场表
			OutContainer outContainer = outContainerMapper.selectByPrimaryKey(id);
			String zone = outContainer.getOldZone();
			UnitCourseExample example = new UnitCourseExample();
			UnitCourseExample.Criteria criteria = example.createCriteria();
			criteria.andContainerNoEqualTo(outContainer.getContainerNo());
			UnitCourseWithBLOBs unitCourseWithBLOBs = new UnitCourseWithBLOBs();
			unitCourseWithBLOBs.setZone(zone);
			unitCourseMapper.updateByExampleSelective(unitCourseWithBLOBs, example);
			// 删除该出箱记录
			outContainerMapper.deleteByPrimaryKey(id);
		}
	}
}
