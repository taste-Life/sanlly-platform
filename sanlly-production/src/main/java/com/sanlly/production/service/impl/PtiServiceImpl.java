package com.sanlly.production.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.PtiInfoMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.PtiInfo;
import com.sanlly.production.entity.PtiInfoExample;
import com.sanlly.production.models.input.pti.PtiAddInput;
import com.sanlly.production.models.output.pti.PtiDetailOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.PtiService;

/**
 * pti信息接口实现
 * @author RexSheng
 * 2019年8月19日 上午10:52:47
 */
@Service
public class PtiServiceImpl extends BaseServiceImpl implements PtiService{

	@Autowired
	private PtiInfoMapper ptiDao;
	
	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private LangService langService;

	@Override
	public PtiDetailOutput getPtiInfoByCourseId(String courseId) {
		Course course=courseDao.selectByPrimaryKey(courseId);
		PtiDetailOutput output=null;
		if(course!=null) {
			output=getPtiInfoByContainerNo(course.getContainerNo());
			if(output==null) {
				output=new PtiDetailOutput();
				output.setContainerNo(course.getContainerNo());
				//用箱人
				output.setOwner(course.getContainerUser());
				//场站
				output.setPlace(course.getYard());
				output.setPlaceNameLang(course.getYard());
				output.setTypeNameLang(course.getSize());
				output.setType(course.getSize());
				
				output.setOwnerNameLang(output.getOwner());
				output.setPlaceNameLang(output.getPlace());
//				
//				
//				output.setTempUnitNameLang(output.getTempUnit());
//				output.setCheckContainerNameLang(output.getCheckContainer());
//				output.setCleanUnitNameLang(output.getCleanUnit());
//				output.setCheckFastenersNameLang(output.getCheckFasteners());
//				output.setCheckDrainNameLang(output.getCheckDrain());
//				output.setCheckWiringNameLang(output.getCheckWiring());
//				output.setCheckPowerNameLang(output.getCheckPower());
//				output.setCheckInsulationNameLang(output.getCheckInsulation());
//				output.setCheckIndicateNameLang(output.getCheckIndicate());
//				output.setCheckContainerIdNameLang(output.getCheckContainerId());
//				output.setOperateNameLang(output.getOperate());
//				output.setCheckRotationNameLang(output.getCheckRotation());
//				output.setCheckPowerSupplyNameLang(output.getCheckPowerSupply());
//				output.setCheckEvaporatorNameLang(output.getCheckEvaporator());
//				output.setCheckCurrentNameLang(output.getCheckCurrent());
//				output.setCheckNo1NameLang(output.getCheckNo1());
//				output.setCheckNo2NameLang(output.getCheckNo2());
//				output.setPutHeatNameLang(output.getPutHeat());
//				output.setCheckMainHeatersNameLang(output.getCheckMainHeaters());
//				output.setCheckSubHeatersNameLang(output.getCheckSubHeaters());
//				output.setCheckRefrigerantNameLang(output.getCheckRefrigerant());
//				output.setTemperatureNameLang(output.getTemperature());
//				output.setDownTo32NameLang(output.getDownTo32());
//				output.setCheckOperationNameLang(output.getCheckOperation());
//				output.setCheckDefostNameLang(output.getCheckDefost());
//				output.setOperateUnitNameLang(output.getOperateUnit());
//				output.setCheckFansNameLang(output.getCheckFans());
//				output.setCheckCompressorNameLang(output.getCheckCompressor());
//				output.setDownTo0NameLang(output.getDownTo0());
//				output.setWindTemeratureNameLang(output.getWindTemerature());
//				output.setCheckChartNameLang(output.getCheckChart());
			}
			
		}
		
		return output;
	}

	
	/**
	 * 根据箱号获取pti信息
	 * @param containerNo
	 * @return
	 */
	@Override
	public PtiDetailOutput getPtiInfoByContainerNo(String containerNo) {
		PtiInfoExample example=new PtiInfoExample();
		example.createCriteria().andContainerNoEqualTo(containerNo);
		List<PtiInfo> list=ptiDao.selectByExample(example);
		
		PtiDetailOutput output=new PtiDetailOutput();
		output.setContainerNo(containerNo);
		if(list.size()==0) {
			return null;
//			ContainerExample cExample=new ContainerExample();
//			cExample.createCriteria().andContainerNoEqualTo(containerNo);
//			List<Container> containerList=containerDao.selectByExample(cExample);
//			if(containerList.size()>0) {
//				 
//			}
		}
		else {
			PtiInfo record=list.get(0);
			BeanUtils.copyProperties(record, output);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			if(record.getInspectionDate()!=null) {
				output.setInspectionDate(sdf.format(record.getInspectionDate()));
			}
			output.setOwnerNameLang(output.getOwner());
			output.setPlaceNameLang(output.getPlace());
			output.setTypeNameLang(output.getType());
			output.setTempUnitNameLang(output.getTempUnit());
			output.setCheckContainerNameLang(output.getCheckContainer());
			output.setCleanUnitNameLang(output.getCleanUnit());
			output.setCheckFastenersNameLang(output.getCheckFasteners());
			output.setCheckDrainNameLang(output.getCheckDrain());
			output.setCheckWiringNameLang(output.getCheckWiring());
			output.setCheckPowerNameLang(output.getCheckPower());
			output.setCheckInsulationNameLang(output.getCheckInsulation());
			output.setCheckIndicateNameLang(output.getCheckIndicate());
			output.setCheckContainerIdNameLang(output.getCheckContainerId());
			output.setOperateNameLang(output.getOperate());
			output.setCheckRotationNameLang(output.getCheckRotation());
			output.setCheckPowerSupplyNameLang(output.getCheckPowerSupply());
			output.setCheckEvaporatorNameLang(output.getCheckEvaporator());
			output.setCheckCurrentNameLang(output.getCheckCurrent());
			output.setCheckNo1NameLang(output.getCheckNo1());
			output.setCheckNo2NameLang(output.getCheckNo2());
			output.setPutHeatNameLang(output.getPutHeat());
			output.setCheckMainHeatersNameLang(output.getCheckMainHeaters());
			output.setCheckSubHeatersNameLang(output.getCheckSubHeaters());
			output.setCheckRefrigerantNameLang(output.getCheckRefrigerant());
			output.setTemperatureNameLang(output.getTemperature());
			output.setDownTo32NameLang(output.getDownTo32());
			output.setCheckOperationNameLang(output.getCheckOperation());
			output.setCheckDefostNameLang(output.getCheckDefost());
			output.setOperateUnitNameLang(output.getOperateUnit());
			output.setCheckFansNameLang(output.getCheckFans());
			output.setCheckCompressorNameLang(output.getCheckCompressor());
			output.setDownTo0NameLang(output.getDownTo0());
			output.setWindTemeratureNameLang(output.getWindTemerature());
			output.setCheckChartNameLang(output.getCheckChart());
		}
		return output;
	}

	/**
	 * 修改pti信息
	 * @param input
	 */
	@Override
	public void updatePtiInfo(PtiAddInput input) {
		
		PtiInfoExample example=new PtiInfoExample();
		example.createCriteria().andContainerNoEqualTo(input.getContainerNo());
		List<PtiInfo> list=ptiDao.selectByExample(example);
		if(list.size()==0) {
			//pti信息新增
			PtiInfo record=new PtiInfo();
			BeanUtils.copyProperties(input, record);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			ptiDao.insert(record);
		}
		else {
			//pti信息修改
			PtiInfo record=list.get(0);
			BeanUtils.copyProperties(input, record);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			ptiDao.updateByPrimaryKey(record);
		}
	}

	@Override
	public Object lang(PtiDetailOutput input) {
		LangInput param=new LangInput();
		param.setObject(input);
		if(isChineseRequest()) {
			param.setLang(LanguageEnum.LANGZH);
		}
		else {
			param.setLang(LanguageEnum.LANGEN);
		}
		return langService.lang(param);
	}
}
