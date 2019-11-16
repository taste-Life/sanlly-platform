package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Collectors;

import com.sanlly.production.dao.*;
import com.sanlly.production.entity.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.enums.AlgorithmEnum;
import com.sanlly.production.enums.AlgorithmSanEnum;
import com.sanlly.production.enums.AlgorithmTypeEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.RateCalculationTypeEnum;
import com.sanlly.production.enums.RateCommonEnum;
import com.sanlly.production.enums.RateCurrencyEnum;
import com.sanlly.production.enums.RateFromTypeEnum;
import com.sanlly.production.enums.RateSizeEnum;
import com.sanlly.production.enums.RateStageEnum;
import com.sanlly.production.enums.RateTabTypeEnum;
import com.sanlly.production.enums.SparesTypeEnum;
import com.sanlly.production.models.input.paying.PayingChangeInput;
import com.sanlly.production.models.input.rate.AddRateItemInput;
import com.sanlly.production.models.input.rate.AddSanRateInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.rate.SearchRateInput;
import com.sanlly.production.models.input.rate.UpdateRateItemInput;
import com.sanlly.production.models.input.rate.UpdateSanRateInput;
import com.sanlly.production.models.output.rate.GetRateMessageOutput;
import com.sanlly.production.models.output.rate.RateGSItemOutput;
import com.sanlly.production.models.output.rate.RateQJItemOutput;
import com.sanlly.production.models.output.rate.SanRateOutput;
import com.sanlly.production.models.output.rate.SearchSanRateGSItemOutput;
import com.sanlly.production.models.output.rate.SearchSanRateOutput;
import com.sanlly.production.models.output.rate.SearchSanRateQJItemOutput;
import com.sanlly.production.models.output.rate.SearchUserRateOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.models.output.rate.SparePartsOutput;
import com.sanlly.production.service.PayingChangeService;
import com.sanlly.production.service.RateService;
import com.sanlly.production.service.WarehouseClient;

/**
 * 费率实现类
 * 
 * @author wangxzh
 *
 */
@Service
public class RateServiceImpl extends BaseServiceImpl implements RateService {

	@Autowired
	private RateExtMapper rateExtMapper;
	@Autowired
	private RateMapper rateMapper;
	@Autowired
	private RateFormulaMapper rateFormulaMapper;
	@Autowired
	private RateExhaustionMapper rateExhaustionMapper;
	@Autowired
	private ContainerUserMapper containerUserMapper;
	@Autowired
	private CurrencyMapper currencyMapper;
	@Autowired
	private ZyRateMapper zyRateMapper;
	@Autowired
	private ManhourRateMapper manhourRateMapper;
	@Autowired
	private CostRateMapper costRateMapper;
	@Autowired
	private WarehouseClient warehouseClient;
	@Autowired
	private PayingChangeService payingService;
	@Autowired
	private UnitDiscountMapper unitDiscountMapper;
	@Autowired
	private GxRateMapper gxRateMapper;
	@Autowired
	private  LxRateMapper lxRateMapper;
	@Autowired
	private  JzRateMapper jzRateMapper;

	/**
	 * 费率测试 干箱
	 */
	@Override
	public void rateTestGx() {
		GxRateExample gxRateExample = new GxRateExample();
		List<GxRate> gxRates = gxRateMapper.selectByExample(gxRateExample);
		for(GxRate gxRate: gxRates){
			GetRateMessageInput input = new GetRateMessageInput();
			input.setContainerCategory(gxRate.getContainercategory()); //箱子类型
			input.setContainerUser(gxRate.getContaineruser());			//用箱人
			input.setPartsType(gxRate.getPartstypecode());				//部件大类
			if (StringUtils.isNotEmpty(gxRate.getPartsdetailscode()))   //部件明细
				input.setPartsDetails(gxRate.getPartsdetailscode());
			input.setRepair(gxRate.getRepaircode());				//修理代码
			// 取录入的位置代码的前两位比较
			if (StringUtils.isNotEmpty(gxRate.getPositioncode()))    //位置代码
				input.setPositionCode(gxRate.getPositioncode().toUpperCase());
			input.setContainerType(gxRate.getContainertype());		//箱型
			input.setSize(gxRate.getSize());						//尺寸
			input.setLength(Double.parseDouble(gxRate.getLength()));					//长
			input.setWidth(Double.parseDouble(gxRate.getWidth()));						//宽
			input.setQuantity(Double.parseDouble(gxRate.getQuantity()));				//数量
			input.setCompany(gxRate.getCompany());					//公司
			input.setMaterial(gxRate.getMaterialcode());			//材料代码
			input.setSparesNumber(gxRate.getSparesnumber());		//备件号
			input.setFromType(RateFromTypeEnum.TYPE01.getCode());
			input.setStage(RateStageEnum.TYPE01.getCode());
			try{
				GetRateMessageOutput rateAndPayingMessage = getRateAndPayingMessage(input);
				gxRate.setFivecodeNew(rateAndPayingMessage.getFiveCode());
				gxRate.setManhourNew(rateAndPayingMessage.getManHour()+"");
				BigDecimal manHourCost = rateAndPayingMessage.getManHourCost();
				BigDecimal materialCost = rateAndPayingMessage.getMaterialCost();
				if(manHourCost == null ){
					manHourCost = new BigDecimal("0");
				}
				if(materialCost == null ){
					materialCost = new BigDecimal("0");
				}
				double bmanHourCost = manHourCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				double bmaterialCost = materialCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				gxRate.setManhourcostNew(bmanHourCost+"");
				gxRate.setMaterialcostNew(bmaterialCost+"");
				double total = bmanHourCost+bmaterialCost;
				BigDecimal bigTotal = new BigDecimal(total);
				//保留2位小数
				double result = bigTotal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				gxRate.setTotalcostNew(result+"");
				gxRate.setSparesnumberNew(rateAndPayingMessage.getDevice());  //放主件
			}catch (Exception e){
				gxRate.setFivecodeNew("异常");
				gxRate.setManhourNew("异常");
				gxRate.setManhourcostNew("异常");
				gxRate.setMaterialcostNew("异常");
			}finally {
				gxRateMapper.updateByPrimaryKeySelective(gxRate);
			}
			input.setContainerUser("LKCONUSER000128");//三利
			input.setFromType(RateFromTypeEnum.TYPE03.getCode());
			try{
				GetRateMessageOutput rateAndPayingMessage = getRateAndPayingMessage(input);
				Double dispatchingWorkingHours = rateAndPayingMessage.getManHour();//派工工时
				gxRate.setDispatchingworkhourNew(dispatchingWorkingHours+"");
			}catch (Exception e){
				gxRate.setDispatchingworkhourNew("异常");
			}finally {
				gxRateMapper.updateByPrimaryKeySelective(gxRate);
			}


		}

	}

	/**
	 * 费率测试冷箱
	 */
	@Override
	public void rateTestLx() {
		LxRateExample lxRateExample = new LxRateExample();
		List<LxRate> lxRates = lxRateMapper.selectByExample(lxRateExample);
		for(LxRate lxRate: lxRates){
			GetRateMessageInput input = new GetRateMessageInput();
			input.setContainerCategory(lxRate.getContainercategory()); //箱子类型
			input.setContainerUser(lxRate.getContaineruser());			//用箱人
			input.setPartsType(lxRate.getPartstypecode());				//部件大类
			if (StringUtils.isNotEmpty(lxRate.getPartsdetailscode()))   //部件明细
				input.setPartsDetails(lxRate.getPartsdetailscode());
			input.setRepair(lxRate.getRepaircode());				//修理代码
			// 取录入的位置代码的前两位比较
			if (StringUtils.isNotEmpty(lxRate.getPositioncode()))    //位置代码
				input.setPositionCode(lxRate.getPositioncode().toUpperCase());
			input.setContainerType(lxRate.getContainertype());		//箱型
			input.setSize(lxRate.getSize());						//尺寸
			String length= lxRate.getLength();
			if(StringUtils.isBlank(length) || "NULL".equals(length)){
				length="0";
			}
			String width= lxRate.getWidth();
			if(StringUtils.isBlank(width) || "NULL".equals(width)){
				width="0";
			}
			input.setLength(Double.parseDouble(length));					//长
			input.setWidth(Double.parseDouble(width));						//宽
			input.setQuantity(Double.parseDouble(lxRate.getQuantity()));				//数量
			input.setCompany(lxRate.getCompany());					//公司
			input.setMaterial(lxRate.getMaterialcode());			//材料代码
			input.setSparesNumber(lxRate.getSparesnumber());		//备件号
			input.setFromType(RateFromTypeEnum.TYPE01.getCode());
			input.setStage(RateStageEnum.TYPE01.getCode());
			try{
				GetRateMessageOutput rateAndPayingMessage = getRateAndPayingMessage(input);
				lxRate.setFivecodeNew(rateAndPayingMessage.getFiveCode());
				BigDecimal manHour = new BigDecimal(rateAndPayingMessage.getManHour());
				if(manHour == null ){
					manHour = new BigDecimal("0");
				}
				double bmanHour = manHour.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				lxRate.setManhourNew(bmanHour+"");
				BigDecimal manHourCost = rateAndPayingMessage.getManHourCost();
				BigDecimal materialCost = rateAndPayingMessage.getMaterialCost();
				if(manHourCost == null ){
					manHourCost = new BigDecimal("0");
				}
				if(materialCost == null ){
					materialCost = new BigDecimal("0");
				}
				double bmanHourCost = manHourCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				double bmaterialCost = materialCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				lxRate.setManhourcostNew(bmanHourCost+"");
				lxRate.setMaterialcostNew(bmaterialCost+"");
				double total = bmanHourCost+bmaterialCost;
				BigDecimal bigTotal = new BigDecimal(total);
				//保留2位小数
				double result = bigTotal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				lxRate.setTotalcostNew(result+"");
				System.out.println("备件号=="+rateAndPayingMessage.getSparesNumber());
				lxRate.setSparesnumberNew(rateAndPayingMessage.getDevice()); //放主件
			}catch (Exception e){
				lxRate.setFivecodeNew("异常");
				lxRate.setManhourNew("异常");
				lxRate.setManhourcostNew("异常");
				lxRate.setMaterialcostNew("异常");
			}finally {
				lxRateMapper.updateByPrimaryKeySelective(lxRate);
			}

			input.setContainerUser("LKCONUSER000128");//三利
			input.setFromType(RateFromTypeEnum.TYPE03.getCode());
			try{
				GetRateMessageOutput rateAndPayingMessage = getRateAndPayingMessage(input);
				Double dispatchingWorkingHours = rateAndPayingMessage.getManHour();//派工工时
				lxRate.setDispatchingworkhourNew(dispatchingWorkingHours+"");
			}catch (Exception e){
				lxRate.setDispatchingworkhourNew("异常");
			}finally {
				lxRateMapper.updateByPrimaryKeySelective(lxRate);
			}

		}
	}

	/**
	 * 费率测试机组
	 */
	@Override
	public void rateTestJz() {
		JzRateExample jzRateExample = new JzRateExample();
		List<JzRate> jzRates = jzRateMapper.selectByExample(jzRateExample);
		for(JzRate jzRate: jzRates){
			GetRateMessageInput input = new GetRateMessageInput();
			input.setContainerCategory(jzRate.getContainercategory()); //箱子类型
			input.setContainerUser(jzRate.getContaineruser());			//用箱人
			input.setPartsType(jzRate.getPartstypecode());				//部件大类
			if (StringUtils.isNotEmpty(jzRate.getPartsdetailscode()))   //部件明细
				input.setPartsDetails(jzRate.getPartsdetailscode());
			input.setRepair(jzRate.getRepaircode());				//修理代码
			// 取录入的位置代码的前两位比较
//			if (StringUtils.isNotEmpty(jzRate.getPositioncode()))    //位置代码
//				input.setPositionCode(jzRate.getPositioncode().toUpperCase());
			input.setContainerType(jzRate.getContainertype());		//箱型
			input.setSize(jzRate.getSize());						//尺寸
			String length= jzRate.getLength();
			if(StringUtils.isBlank(length) || "NULL".equals(length)){
				length="0";
			}
			String width= jzRate.getWidth();
			if(StringUtils.isBlank(width) || "NULL".equals(width)){
				width="0";
			}
			input.setLength(Double.parseDouble(length));					//长
			input.setWidth(Double.parseDouble(width));						//宽
			input.setQuantity(Double.parseDouble(jzRate.getQuantity()));				//数量
			input.setCompany(jzRate.getCompany());					//公司
//			input.setMaterial(jzRate.getMaterialcode());			//材料代码
			if(StringUtils.isNotBlank(jzRate.getSparesnumber()) &&  !"NULL".equals(jzRate.getSparesnumber())){
			input.setSparesNumber(jzRate.getSparesnumber());		//备件号
			}
			input.setFromType(RateFromTypeEnum.TYPE01.getCode());
			input.setStage(RateStageEnum.TYPE01.getCode());
			try{
				GetRateMessageOutput rateAndPayingMessage = getRateAndPayingMessage(input);
				jzRate.setFivecodeNew(rateAndPayingMessage.getFiveCode());
				BigDecimal manHour = new BigDecimal(rateAndPayingMessage.getManHour());
				if(manHour == null ){
					manHour = new BigDecimal("0");
				}
				double bmanHour = manHour.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				jzRate.setManhourNew(bmanHour+"");
				BigDecimal manHourCost = rateAndPayingMessage.getManHourCost();
				BigDecimal materialCost = rateAndPayingMessage.getMaterialCost();
				if(manHourCost == null ){
					manHourCost = new BigDecimal("0");
				}
				if(materialCost == null ){
					materialCost = new BigDecimal("0");
				}
				double bmanHourCost = manHourCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				double bmaterialCost = materialCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				jzRate.setManhourcostNew(bmanHourCost+"");
				jzRate.setMaterialcostNew(bmaterialCost+"");
				double total = bmanHourCost+bmaterialCost;
				BigDecimal bigTotal = new BigDecimal(total);
				//保留2位小数
				double result = bigTotal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				jzRate.setTotalcostNew(result+"");
				jzRate.setSparesnumberNew(rateAndPayingMessage.getDevice());//放主件
			}catch (Exception e){
				e.printStackTrace();
				jzRate.setFivecodeNew("异常");
				jzRate.setManhourNew("异常");
				jzRate.setManhourcostNew("异常");
				jzRate.setMaterialcostNew("异常");
			}finally {
				jzRateMapper.updateByPrimaryKeySelective(jzRate);
			}

			input.setContainerUser("LKCONUSER000128");//三利
			input.setFromType(RateFromTypeEnum.TYPE03.getCode());
			try{
				GetRateMessageOutput rateAndPayingMessage = getRateAndPayingMessage(input);
				Double dispatchingWorkingHours = rateAndPayingMessage.getManHour();//派工工时
				jzRate.setDispatchingworkhourNew(dispatchingWorkingHours+"");
			}catch (Exception e){
				jzRate.setDispatchingworkhourNew("异常");
			}finally {
				jzRateMapper.updateByPrimaryKeySelective(jzRate);
			}
		}
	}

	/**
	 * 部件大类下拉
	 */
	@Override
	public List<SelectItemOutput> getPartsTypeSelect(String name) {
		return rateExtMapper.getPartsTypeSelect(name);
	}

	/**
	 * 部件明细下拉
	 */
	@Override
	public List<SelectItemOutput> getPartsDetailsSelect(String name) {
		// return rateExtMapper.getPartsDetailsSelect(name);
		return null;
	}

	/**
	 * 维修代码下拉
	 */
	@Override
	public List<SelectItemOutput> getRepairSelect(String name) {
		return rateExtMapper.getRepairSelect(name);
	}

	/**
	 * 材质代码
	 */
	@Override
	public List<SelectItemOutput> getMaterialSelect(String name) {
		return rateExtMapper.getMaterialSelect(name);
	}

	/**
	 * 币种下拉
	 */
	@Override
	public List<SelectItemOutput> getCurrencySelect() {
		CurrencyExample example = new CurrencyExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Currency> list = currencyMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * SAN费率列表
	 */
	@Override
	public List<SearchSanRateOutput> getSanRateList(SearchRateInput input) {
		List<SearchSanRateOutput> list = rateExtMapper.getSanRateList(input);
		return list;
	}

	/**
	 * SAN费率新增
	 */
	@Override
	public void addSanRate(AddSanRateInput input) {
		Rate model = new Rate();
		model.setProdRateId(UUID.randomUUID().toString());
		model.setContainerCategory(input.getContainerCategory()); // 箱类别
		if (input.getContainerUser().equals(RateCommonEnum.CONTAINERUSERKEY2.getCode())) {
			model.setContainerUser(getSanKey()); // 用箱人
		} else {
			model.setContainerUser(input.getContainerUser()); // 用箱人
			model.setStandardRate(input.getMasterRateId()); // 关联id
		}
		model.setCompany(input.getCompany()); // 公司
		model.setRateCode(input.getPartsDetails().toUpperCase() + input.getRepair()); // 费率代码
		model.setPartsType(input.getPartsType()); // 部件大类
		model.setPartsDetails(input.getPartsDetails().toUpperCase()); // 部件明细
		model.setPartsDetailsName(input.getPartsDetailsName()); // 部件明细名称
		model.setPartsDetailsNameEn(input.getPartsDetailsNameEn()); // 部件明细英文名称
		model.setCalculationType(input.getCalculationType()); // 费率计算方式
		model.setRepair(input.getRepair()); // 维修代码
		model.setMaterial(input.getMaterial()); // 材质代码
		model.setRateName(input.getRateNameZh()); // 费率中文名称
		model.setRateNameEn(input.getRateNameEn()); // 费率英文名称
		model.setIsContainerUserRate(input.getIsContainerUserRate()); // 是否使用用箱人费率
		model.setContainerUserDescribe(input.getContainerUserDescribe()); // 用箱人描述
		model.setRemark(input.getRemark()); // 备注
		model.setIsMustPhoto(input.getIsMustPhoto()); // 是否必传图片
		model.setIsRepeatPrompts(input.getIsRepeatPrompts()); // 重复条目是否提示
		model.setIsGz(input.getIsGuangZhou()); // 是否广州使用
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		rateMapper.insert(model);
	}

	/**
	 * 获取SANkey
	 * 
	 * @return String @throws 
	 */
	private String getSanKey() {
		ContainerUserExample userExample = new ContainerUserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerUserCodeEqualTo(RateCommonEnum.CONTAINERUSERKEY2.getCode());
		List<ContainerUser> userList = containerUserMapper.selectByExample(userExample);
		if (userList.size() > 0)
			return userList.get(0).getKey();
		return null;
	}

	/**
	 * SAN获取费率编辑信息
	 */
	@Override
	public SanRateOutput getUpdateSanRate(String rateId) {
		Rate rate = rateMapper.selectByPrimaryKey(rateId);
		if (rate.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			SanRateOutput model = new SanRateOutput();
			model.setRateId(rate.getProdRateId());
			model.setCompany(rate.getCompany()); // 公司
			model.setContainerCategory(rate.getContainerCategory()); // 箱类别
			model.setContainerUser(rate.getContainerUser()); // 用箱人
			model.setCalculationType(rate.getCalculationType()); // 费率计算方式
			model.setPartsType(rate.getPartsType()); // 部件大类
			model.setPartsDetails(rate.getPartsDetails()); // 部件明细
			model.setPartsDetailsName(rate.getPartsDetailsName()); // 部件明细名称
			model.setPartsDetailsNameEn(rate.getPartsDetailsNameEn()); // 部件名称英文名
			model.setRepair(rate.getRepair()); // 维修代码
			model.setMaterial(rate.getMaterial()); // 材质代码
			model.setRateNameZh(rate.getRateName()); // 费率中文名称
			model.setRateNameEn(rate.getRateNameEn()); // 费率英文名称
			model.setIsContainerUserRate(rate.getIsContainerUserRate()); // 是否使用用箱人费率
			model.setContainerUserDescribe(rate.getContainerUserDescribe()); // 用箱人描述
			model.setRemark(rate.getRemark()); // 备注
			model.setIsMustPhoto(rate.getIsMustPhoto()); // 是否必传图片
			model.setIsRepeatPrompts(rate.getIsRepeatPrompts()); // 重复条目是否提示
			model.setIsGuangZhou(rate.getIsGz()); // 是否广州使用
			return model;
		}
		return null;
	}

	/**
	 * SAN费率编辑
	 */
	@Override
	public void updateSanRate(UpdateSanRateInput input) {
		Rate model = rateMapper.selectByPrimaryKey(input.getRateId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setCompany(input.getCompany()); // 公司
			model.setContainerCategory(input.getContainerCategory()); // 箱类别
			if (input.getContainerUser().equals(RateCommonEnum.CONTAINERUSERKEY2.getCode())) {
				model.setContainerUser(getSanKey()); // 用箱人
			} else {
				model.setContainerUser(input.getContainerUser()); // 用箱人
			}
			model.setRateCode(input.getPartsDetails().toUpperCase() + input.getRepair()); // 费率代码
			model.setCalculationType(input.getCalculationType()); // 费率计算方式
			model.setPartsType(input.getPartsType()); // 部件大类
			model.setPartsDetails(input.getPartsDetails().toUpperCase()); // 部件明细
			model.setPartsDetailsName(input.getPartsDetailsName()); // 部件明细中文名
			model.setPartsDetailsNameEn(input.getPartsDetailsNameEn()); // 部件明细英文名
			model.setRepair(input.getRepair()); // 维修代码
			model.setMaterial(input.getMaterial()); // 材质代码
			model.setRateName(input.getRateNameZh()); // 费率中文名称
			model.setRateNameEn(input.getRateNameEn()); // 费率英文名称
			model.setIsContainerUserRate(input.getIsContainerUserRate()); // 是否使用用箱人费率
			model.setContainerUserDescribe(input.getContainerUserDescribe()); // 用箱人描述
			model.setRemark(input.getRemark()); // 备注
			model.setIsMustPhoto(input.getIsMustPhoto()); // 是否必传图片
			model.setIsRepeatPrompts(input.getIsRepeatPrompts()); // 重复条目是否提示
			model.setIsGz(input.getIsGuangZhou()); // 是否广州使用
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			rateMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * SAN费率删除
	 */
	@Override
	public void delSanRate(String[] listIds) {
		RateExample example = new RateExample();
		example.createCriteria().andProdRateIdIn(Arrays.asList(listIds));
		Rate model = new Rate();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		// 批量删除
		rateMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 根据SAN费率获取用箱人费率列表
	 */
	@Override
	public List<SearchUserRateOutput> getUserRateList(String rateId) {
		List<SearchUserRateOutput> list = rateExtMapper.getUserRateList(rateId);
		return list;
	}

	/**
	 * 费率明细列表（公式型）
	 */
	@Override
	public List<SearchSanRateGSItemOutput> getSanRateGSItemList(String rateId, String type) {
		List<SearchSanRateGSItemOutput> list = new ArrayList<SearchSanRateGSItemOutput>();
		// 构造查询
		RateFormulaExample example = new RateFormulaExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andRateIdEqualTo(rateId)
				.andTypeEqualTo(type);
		List<RateFormula> rateList = rateFormulaMapper.selectByExample(example);
		for (RateFormula item : rateList) {
			SearchSanRateGSItemOutput model = new SearchSanRateGSItemOutput();
			model.setRateItemId(item.getProdRateFormulaId());
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setContainerTypeLang(item.getContainerType()); // 箱型
			model.setSizeLang(item.getSize()); // 尺寸
			model.setAlgorithmTypeLang(item.getAlgorithmType()); // 算法类型
			model.setAlgorithmBasisLang(item.getAlgorithmBasis()); // 算法依据
			model.setCardinalNumber(item.getCardinalNumber()); // 基数
			model.setStartValue(item.getStartValue()); // 起始数值
			model.setMaxCardinalNumber(item.getMaxCardinalNumber()); // 最大基数
			model.setMaxValue(item.getMaxValue()); // 最大数值
			model.setAddCardinalNumber(item.getAddCardinalNumber()); // 递增基数
			model.setAddValue(item.getAddValue()); // 递增数值
			list.add(model);
		}

		return list;
	}

	/**
	 * 费率明细列表（穷举型）
	 */
	@Override
	public List<SearchSanRateQJItemOutput> getSanRateQJItemList(String rateId, String type) {
		List<SearchSanRateQJItemOutput> list = new ArrayList<SearchSanRateQJItemOutput>();
		// 构造查询条件
		RateExhaustionExample example = new RateExhaustionExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andRateIdEqualTo(rateId)
				.andTypeEqualTo(type);
		List<RateExhaustion> rateList = rateExhaustionMapper.selectByExample(example);
		for (RateExhaustion item : rateList) {
			SearchSanRateQJItemOutput model = new SearchSanRateQJItemOutput();
			model.setRateItemId(item.getProdRateExhaustionId());
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setContainerTypeLang(item.getContainerType()); // 箱型
			model.setSizeLang(item.getSize()); // 尺寸
			model.setAlgorithmBasisLang(item.getAlgorithmBasis()); // 算法依据
			model.setLength(item.getLength()); // 长
			model.setWidth(item.getWidth()); // 宽
			model.setQuantity(item.getQuantity()); // 数量
			model.setManHour(item.getManHour()); // 工时数
			model.setMaterialCost(item.getMaterialCost()); // 材料费
			model.setRateDescribe(item.getRateDescribe()); // 费率描述
			list.add(model);
		}
		return list;
	}

	/**
	 * 费率明细新增
	 */
	@Override
	public void addRateItem(AddRateItemInput input) {
		// 判断tab类型
		// SAN费率
		if (input.getTabIndex().equals(RateTabTypeEnum.RATETABTYPE1.getCode())) {
			input.setFromType(RateFromTypeEnum.TYPE01.getCode());
			// 判断计算方式
			if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())) {
				AddGSRateItem(input); // 公式型
			} else if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE02.getCode())) {
				AddQJRateItem(input); // 穷举型
			}
		}
		// 用箱人费率
		else if (input.getTabIndex().equals(RateTabTypeEnum.RATETABTYPE2.getCode())) {
			input.setFromType(RateFromTypeEnum.TYPE01.getCode());
			// 判断计算方式
			if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())) {
				AddGSRateItem(input); // 公式型
			} else if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE02.getCode())) {
				AddQJRateItem(input); // 穷举型
			}
		}
		// 辅助费率
		else if (input.getTabIndex().equals(RateTabTypeEnum.RATETABTYPE3.getCode())) {
			input.setFromType(RateFromTypeEnum.TYPE02.getCode());
			// 判断计算方式
			if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())) {
				AddGSRateItem(input); // 公式型
			} else if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE02.getCode())) {
				AddQJRateItem(input); // 穷举型
			}
		}
		// 派工工时
		else if (input.getTabIndex().equals(RateTabTypeEnum.RATETABTYPE4.getCode())) {
			input.setFromType(RateFromTypeEnum.TYPE03.getCode());
			// 判断计算方式
			if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())) {
				AddGSRateItem(input); // 公式型
			} else if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE02.getCode())) {
				AddQJRateItem(input); // 穷举型
			}
		}
	}

	/**
	 * 穷举型条目明细添加
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	private void AddQJRateItem(AddRateItemInput input) {
		RateExhaustion model = new RateExhaustion();
		model.setProdRateExhaustionId(UUID.randomUUID().toString());
		model.setRateId(input.getRateId()); // 关联主键
		model.setType(input.getFromType()); // 费率类型
		model.setAlgorithmBasis(input.getAlgorithmBasis()); // 算法依赖
		model.setSize(input.getSize()); // 尺寸
		model.setContainerType(input.getContainerType()); // 箱型
		if (StringUtils.isNotEmpty(input.getPositionCode()))
			model.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
		model.setLength(input.getLength()); // 长
		model.setWidth(input.getWidth()); // 宽
		model.setQuantity(input.getQuantity()); // 数量
		model.setManHour(input.getManHour()); // 工时
		model.setMaterialCost(input.getMaterialCost()); // 材料费
		model.setRateDescribe(input.getRateDescribe()); // 费率描述
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		rateExhaustionMapper.insert(model);
	}

	/**
	 * 公式型条目明细添加
	 * 
	 * @Description: TODO
	 * @param input
	 * @param type
	 *            void @throws 
	 */
	private void AddGSRateItem(AddRateItemInput input) {
		RateFormula model = new RateFormula();
		model.setProdRateFormulaId(UUID.randomUUID().toString());
		model.setRateId(input.getRateId()); // 关联主键
		model.setType(input.getFromType()); // 费率类型
		model.setAlgorithmType(input.getAlgorithmType()); // 算法类型
		model.setAlgorithmBasis(input.getAlgorithmBasis()); // 算法依据
		model.setSize(input.getSize()); // 尺寸
		model.setContainerType(input.getContainerType()); // 箱型
		if (StringUtils.isNotEmpty(input.getPositionCode()))
			model.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
		model.setCardinalNumber(input.getCardinalNumber()); // 基数
		model.setStartValue(input.getStartValue()); // 起始数值
		model.setAddCardinalNumber(input.getAddCardinalNumber()); // 递增基数
		model.setAddValue(input.getAddValue()); // 递增数值
		model.setMaxCardinalNumber(input.getMaxCardinalNumber()); // 最大基数
		model.setMaxValue(input.getMaxValue()); // 最大数值
		model.setRemark(input.getRemark()); // 备注
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		rateFormulaMapper.insert(model);
	}

	/**
	 * 获取公式型明细信息
	 */
	@Override
	public RateGSItemOutput getRateGSItemList(String rateId) {
		RateFormula rate = rateFormulaMapper.selectByPrimaryKey(rateId);
		if (rate.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			RateGSItemOutput model = new RateGSItemOutput();
			model.setRateItemId(rate.getProdRateFormulaId());
			model.setRateId(rate.getRateId());
			model.setAlgorithmBasis(rate.getAlgorithmBasis()); // 算法依赖
			model.setAlgorithmType(rate.getAlgorithmType()); // 算法类型
			model.setSize(rate.getSize()); // 尺寸
			model.setContainerType(rate.getContainerType()); // 箱型
			model.setPositionCode(rate.getPositionCode()); // 位置代码
			model.setCardinalNumber(rate.getCardinalNumber()); // 基数
			model.setStartValue(rate.getStartValue()); // 起始数值
			model.setAddCardinalNumber(rate.getAddCardinalNumber()); // 递增基数
			model.setAddValue(rate.getAddValue()); // 递增数值
			model.setMaxCardinalNumber(rate.getMaxCardinalNumber()); // 最大基数
			model.setMaxValue(rate.getMaxValue()); // 最大数值
			model.setRemark(rate.getRemark()); // 备注
			// model.setIsRepeatPrompts(rate.getIsRepeatPrompts()); // 重复条目是否提示
			// model.setIsMustPhoto(rate.getIsMustPhoto()); // 图片是否必传
			return model;
		}
		return null;
	}

	/**
	 * 获取穷举型明细信息
	 */
	@Override
	public RateQJItemOutput getRateQJItemList(String rateId) {
		RateExhaustion rate = rateExhaustionMapper.selectByPrimaryKey(rateId);
		if (rate.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			RateQJItemOutput model = new RateQJItemOutput();
			model.setRateItemId(rate.getProdRateExhaustionId());
			model.setRateId(rate.getRateId());
			model.setAlgorithmBasis(rate.getAlgorithmBasis()); // 算法依赖
			model.setSize(rate.getSize()); // 尺寸
			model.setContainerType(rate.getContainerType()); // 箱型
			model.setPositionCode(rate.getPositionCode()); // 位置代码
			model.setLength(rate.getLength()); // 长
			model.setWidth(rate.getWidth()); // 宽
			model.setQuantity(rate.getQuantity()); // 数量
			model.setManHour(rate.getManHour()); // 工时
			model.setMaterialCost(rate.getMaterialCost()); // 材料费
			model.setRateDescribe(rate.getRateDescribe()); // 费率描述
			// model.setIsRepeatPrompts(rate.getIsRepeatPrompts()); // 重复条目是否提示
			// model.setIsMustPhoto(rate.getIsMustPhoto()); // 图片是否必传
			return model;
		}
		return null;
	}

	/**
	 * 费率条目编辑
	 */
	@Override
	public void updateRateItem(UpdateRateItemInput input) {
		// 判断计算方式
		if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())) {
			UpdateGSRateItem(input); // 公式型
		} else if (input.getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE02.getCode())) {
			UpdateQJRateItem(input); // 穷举型
		}
	}

	/**
	 * 公式型条目更新
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	private void UpdateGSRateItem(UpdateRateItemInput input) {
		RateFormula model = rateFormulaMapper.selectByPrimaryKey(input.getRateItemId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setAlgorithmType(input.getAlgorithmType()); // 算法类型
			model.setAlgorithmBasis(input.getAlgorithmBasis()); // 算法依据
			model.setSize(input.getSize()); // 尺寸
			model.setContainerType(input.getContainerType()); // 箱型
			if (StringUtils.isNotEmpty(input.getPositionCode()))
				model.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
			model.setCardinalNumber(input.getCardinalNumber()); // 基数
			model.setStartValue(input.getStartValue()); // 起始数值
			model.setAddCardinalNumber(input.getAddCardinalNumber()); // 递增基数
			model.setAddValue(input.getAddValue()); // 递增数值
			model.setMaxCardinalNumber(input.getMaxCardinalNumber()); // 最大基数
			model.setMaxValue(input.getMaxValue()); // 最大数值
			model.setRemark(input.getRemark()); // 备注
			// model.setIsRepeatPrompts(input.getIsRepeatPrompts()); // 重复条目是否提示
			// model.setIsMustPhoto(input.getIsMustPhoto()); // 图片是否必传
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			rateFormulaMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * 穷举型条目更新
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	private void UpdateQJRateItem(UpdateRateItemInput input) {
		RateExhaustion model = rateExhaustionMapper.selectByPrimaryKey(input.getRateItemId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setAlgorithmBasis(input.getAlgorithmBasis()); // 算法依赖
			model.setSize(input.getSize()); // 尺寸
			model.setContainerType(input.getContainerType()); // 箱型
			if (StringUtils.isNotEmpty(input.getPositionCode()))
				model.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
			model.setLength(input.getLength()); // 长
			model.setWidth(input.getWidth()); // 宽
			model.setQuantity(input.getQuantity()); // 数量
			model.setManHour(input.getManHour()); // 工时
			model.setMaterialCost(input.getMaterialCost()); // 材料费
			model.setRateDescribe(input.getRateDescribe()); // 费率描述
			// model.setIsRepeatPrompts(input.getIsRepeatPrompts()); // 重复条目是否提示
			// model.setIsMustPhoto(input.getIsMustPhoto()); // 图片是否必传
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			rateExhaustionMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * 费率条目删除
	 */
	@Override
	public void delRateItem(String[] listIds, String type) {
		// 判断计算方式
		if (type.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())) {
			DeleteGSRateItem(listIds); // 公式型
		} else if (type.equals(RateCalculationTypeEnum.CALCULATIONTYPE02.getCode())) {
			DeleteQJRateItem(listIds); // 穷举型
		}
	}

	/**
	 * 公式型明细删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	private void DeleteGSRateItem(String[] listIds) {
		RateFormulaExample example = new RateFormulaExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andProdRateFormulaIdIn(Arrays.asList(listIds));
		RateFormula model = new RateFormula();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		// 批量删除
		rateFormulaMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 穷举型明细删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	private void DeleteQJRateItem(String[] listIds) {
		RateExhaustionExample example = new RateExhaustionExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andProdRateExhaustionIdIn(Arrays.asList(listIds));
		RateExhaustion model = new RateExhaustion();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		rateExhaustionMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 获取材料费、工时费费率信息和付费方
	 */
	@Override
	public GetRateMessageOutput getRateAndPayingMessage(GetRateMessageInput input) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 获取费率信息
		model = getRateMessage(input);
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory())) {
			model.setPayingChange("O");
		} else {
			// 判断进场类型和是否退租箱字段
			if (!StringUtils.isNotEmpty(input.getCourseType()) || !StringUtils.isNotEmpty(input.getIsSurrender())) {
				model.setPayingChange("O");
				return model;
			}
			// 获取付费方
			PayingChangeInput paying = new PayingChangeInput();
			paying.setCompany(input.getCompany());
			paying.setCourseType(input.getCourseType());
			paying.setContainerCategory(input.getContainerCategory());
			paying.setContainerUser(input.getContainerUser());
			paying.setPartsRepairCode(input.getPartsDetails() + input.getRepair());
			paying.setDomesticForeignTrade(input.getDomesticForeignTrade());
			paying.setDamageCode(input.getDamageCode());
			paying.setIsSurrender(input.getIsSurrender());
			String payingChange = payingService.getPayingChange(paying);
			if (StringUtils.isNotEmpty(payingChange)) {
				model.setPayingChange(payingChange);
			} else {
				model.setPayingChange("O");
			}
		}
		return model;
	}

	/**
	 * 获取材料费、工时费费率信息
	 */
	@Override
	public GetRateMessageOutput getRateMessage(GetRateMessageInput input) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		input.setSanPartsDetails(input.getPartsDetails());
		input.setSanRepair(input.getRepair());
		// 检验录入的部件明细代码和维修代码是SAN的标准代码，所以当计算费率类型不为派工工时是要首先转换为用箱人的代码
		if (!RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType())
				&& !StringUtils.isNotEmpty(input.getRateId()))
			input = updateRateInput(input);
		// 判断尺寸是否是大于40尺寸的，如果大于40尺寸，则转换成40尺寸的
		if (StringUtils.isNotEmpty(input.getSize()) && !RateSizeEnum.SIZE_20.getCode().equals(input.getSize())
				&& !RateSizeEnum.SIZE_40.getCode().equals(input.getSize()))
			input.setSize(RateSizeEnum.SIZE_40.getCode());

		// 判断用箱人是否是COS
		if (getCosKey().equals(input.getContainerUser())
				&& ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())) {
			// 获取COS费率信息
			model = getCosRate(input);
		} else {
			// 获取标准费率信息
			model = getStandardRate(input);
		}
		// 获取主件
		if (StringUtils.isNotEmpty(model.getRateId())) {
			String device = getDevice(input, model.getRateId());
			model.setDevice(device);
			if (StringUtils.isNotEmpty(device)) {
				// 根据主件获取默认备件
				String sparesNumber = getSparesNumber(device);
				model.setSparesNumber(sparesNumber);
			}
		}
		return model;
	}

	/**
	 * 部件明细代码、维修代码转换
	 * 
	 * @Description: TODO
	 * @param input
	 * @return GetRateMessageInput @throws 
	 */
	private GetRateMessageInput updateRateInput(GetRateMessageInput input) {
		// 根据录入的部件明细和维修代码确认SAN标准费率
		RateExample example = new RateExample();
		RateExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(getSanKey())
				.andPartsDetailsEqualTo(input.getPartsDetails()).andRepairEqualTo(input.getRepair())
				.andContainerCategoryEqualTo(input.getContainerCategory());
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory())) {
			criteria.andPartsTypeEqualTo(input.getPartsType());
		}
		List<Rate> rateList = rateMapper.selectByExample(example);
		if (rateList.size() > 0) {
			input.setRateId(rateList.get(0).getProdRateId()); // SAN费率主键
			// 根据外键查询用箱人的部件明细和维修代码
			RateExample rateExample = new RateExample();
			rateExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCompanyEqualTo(input.getCompany()).andContainerUserEqualTo(input.getContainerUser())
					.andStandardRateEqualTo(rateList.get(0).getProdRateId());
			List<Rate> userRateList = rateMapper.selectByExample(rateExample);
			// 如果结果集小于1，则不修改录入的部件明细和维修代码
			if (userRateList.size() > 0) {
				input.setPartsDetails(userRateList.get(0).getPartsDetails());
				input.setRepair(userRateList.get(0).getRepair());
			}
		}
		return input;
	}

	/**
	 * 获取COS费率
	 * 
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getCosRate(GetRateMessageInput input) {
		// 返回实体
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 查询结果集
		List<ZyRate> zyList = new ArrayList<ZyRate>();
		// 优先根据用箱人、部件大类、部件明细、维修代码，查找中远费率表
		ZyRateExample zyExample = new ZyRateExample();
		ZyRateExample.Criteria criteria = zyExample.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andPartsDetailsCodeEqualTo(input.getPartsDetails())
				.andRepairCodeEqualTo(input.getRepair()).andCompanyEqualTo(input.getCompany());
		// // 机组对部件大类判断
		// if
		// (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory()))
		// {
		// criteria.andPartsTypeCodeEqualTo(input.getPartsType());
		// }
		List<ZyRate> contZyRateList = zyRateMapper.selectByExample(zyExample);
		// 如果结果集小于1并且公司不为青岛的时候，则使用青岛（青岛是中远标准费率）为公司查找费率
		if (contZyRateList.size() < 1 && !RateCommonEnum.QINGDAOCOMPANYKEY.getCode().equals(input.getCompany())) {
			// 优先根据用箱人、部件大类、部件明细、维修代码，查找中远费率表,按照青岛地点筛选费率
			ZyRateExample zyExample1 = new ZyRateExample();
			ZyRateExample.Criteria criteria1 = zyExample1.createCriteria();
			criteria1.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andPartsDetailsCodeEqualTo(input.getPartsDetails())
					.andRepairCodeEqualTo(input.getRepair())
					.andCompanyEqualTo(RateCommonEnum.QINGDAOCOMPANYKEY.getCode());
			// // 机组对部件大类判断
			// if
			// (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory()))
			// {
			// criteria1.andPartsTypeCodeEqualTo(input.getPartsType());
			// }
			zyList = zyRateMapper.selectByExample(zyExample1);
		} else {
			zyList = contZyRateList;
		}
		// 判断结果集中的数据条数
		if (zyList.size() > 1) {
			// 查询到的中远费率大于1条时,再根据箱型or尺寸or位置代码再次缩小数据范围
			// 将筛选出的list合并并去重
			List<ZyRate> list = new ArrayList<ZyRate>();
			// 筛选箱型
			List<ZyRate> zyContList = zyList.stream().filter(a -> {
				// 箱型为空或者是箱型等于录入的箱型,返回true，否则返回false
				if (!StringUtils.isNotEmpty(a.getContainerType())) {
					return true;
				} else {
					if (StringUtils.isNotEmpty(input.getContainerType())
							&& a.getContainerType().equals(input.getContainerType())) {
						return true;
					}
				}
				return false;
			}).collect(Collectors.toList());
			list.addAll(zyContList);
			// 筛选尺寸
			List<ZyRate> zySizeList = zyList.stream().filter(a -> {
				// 尺寸为空或者是尺寸等于录入的尺寸,返回true，否则返回false
				if (!StringUtils.isNotEmpty(a.getSize())) {
					return true;
				} else {
					if (StringUtils.isNotEmpty(input.getSize()) && a.getSize().equals(input.getSize())) {
						return true;
					}
				}
				return false;
			}).collect(Collectors.toList());
			list.retainAll(zySizeList);
			// 筛选位置代码
			List<ZyRate> zyPostList = zyList.stream()
					.filter(a -> getPosition(input.getPositionCode(), a.getPositionCode()))
					.collect(Collectors.toList());
			list.retainAll(zyPostList);
			List<ZyRate> secondFilterList = new ArrayList<>(list);
			// 判断筛选后list长度，list为空时使用上一级查询结果zyList集合
			if (secondFilterList.size() > 1) {
				// 查询结果集大于1，进行下一轮筛选
				model = thirdFilter(secondFilterList, input);
			} else if (secondFilterList.size() == 1) {
				// 判断这条费率的计算依据是否是数量，如果是数量，则录入的数量和费率的数量必须一致,不一致则使用通用费率
				if (secondFilterList.get(0).getCalculationType().equals(AlgorithmEnum.ALGORITHM_04.getCode())
						&& BigDecimal.valueOf(secondFilterList.get(0).getQuantity())
								.compareTo(BigDecimal.valueOf(input.getQuantity())) != 0) {
					model = getStandardRate(input);
				} else {
					// 查询到的中远费率等于1条时，判断录入的长宽数量
					if (!judgeNumber(zyList.get(0), input)) {
						// 如果录入的长宽数量不满足COS费率，则使用标准费率
						model = getStandardRate(input);
					} else {
						// 组装返回数据
						model = getCosRateInfo(secondFilterList.get(0), input.getContainerUser(),
								input.getContainerCategory(), input.getQuantity(), input.getStage());
					}
				}
			} else {
				// 查询结果集小于1，使用上一级查询结果,进行再次筛选
				model = thirdFilter(zyList, input);
			}
		} else if (zyList.size() == 1) {
			// 查询到的中远费率等于1条时，判断录入的长宽数量
			if (!judgeNumber(zyList.get(0), input)) {
				// 如果录入的长宽数量不满足COS费率，则使用标准费率
				model = getStandardRate(input);
			} else {
				// 组装返回数据
				model = getCosRateInfo(zyList.get(0), input.getContainerUser(), input.getContainerCategory(),
						input.getQuantity(), input.getStage());
			}
		} else {
			// 查询到的中远费率小于1条时，使用标准费率表
			model = getStandardRate(input);
		}
		return model;
	}

	/**
	 * 判断长度、宽度、数量、面积是否符合COS费率
	 * 
	 * @Description: TODO
	 * @param rate
	 * @param input
	 * @return Boolean @throws 
	 */
	private Boolean judgeNumber(ZyRate zyRate, GetRateMessageInput input) {
		// 长
		if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_01.getCode())) {
			// 如果录入的长度大于COS长度，则返回false，使用标准费率
			if (input.getLength() > zyRate.getLength())
				return false;
		}
		// 长宽
		else if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_02.getCode())) {
			// 如果录入的长度或宽度大于COS长度或宽度，则返回false，使用标准费率
			if (input.getLength() > zyRate.getLength() || input.getWidth() > zyRate.getWidth())
				return false;
		}
		// 面积
		else if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_03.getCode())) {
			// 如果录入的长度*宽度大于COS长度*宽度，则返回false，使用标准费率
			if (new BigDecimal(input.getLength()).multiply(new BigDecimal(input.getWidth()))
					.doubleValue() > new BigDecimal(zyRate.getLength()).multiply(new BigDecimal(zyRate.getWidth()))
							.doubleValue())
				return false;
		}
		// 数量
		else if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_04.getCode())) {
			// 如果录入的数量大于COS数量，则返回false，使用标准费率
			if (input.getQuantity() > zyRate.getQuantity())
				return false;
		}
		return true;
	}

	/**
	 * 判断位置代码是否符合
	 * 
	 * @Description: TODO
	 * @param inputPostition
	 *            录入的位置代码
	 * @param ratePostition
	 *            费率的位置代码
	 * @return Boolean @throws 
	 */
	private Boolean getPosition(String inputPostition, String ratePostition) {
		// 位置代码为空或者是录入的位置代码包含费率位置代码
		if (!StringUtils.isNotEmpty(ratePostition))
			return true;
		else {
			if (StringUtils.isNotEmpty(inputPostition)) {
				String pos = inputPostition;
				// 根据"/"将标准费率的位置代码分割
				String[] positionList = ratePostition.split("/");
				for (String postition : positionList) {
					if (postition.length() > 1 && postition.subSequence(1, 2).equals("X")) {
						if (!pos.subSequence(1, 2).equals("G") && !pos.subSequence(1, 2).equals("H")) {
							StringBuilder posBuilder = new StringBuilder(pos);
							// 将第二位字符替换成"X"
							pos = posBuilder.replace(1, 2, "X") + "";
						}
					}
					// 如果录入的位置包含费率位置，则返回true
					if (pos.contains(postition))
						return true;
				}
			}
		}
		return false;
	}

	/**
	 * 获取标准费率
	 * 
	 * @Description: TODO
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getStandardRate(GetRateMessageInput input) {
		// 返回实体
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 查询结果集
		List<Rate> rateList = new ArrayList<Rate>();
		// 第一步筛选，根绝箱类别、用箱人、地点（公司）、部件大类、部件明细、维修代码、材质代码（箱体专用）匹配费率
		RateExample rateExample = new RateExample();
		RateExample.Criteria criteria = rateExample.createCriteria();
		// 首先判断传参中有没有SAN费率id，如果有直接按照id查询
		if (StringUtils.isNotEmpty(input.getRateId())) {
			criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(input.getContainerUser())
					.andCompanyEqualTo(input.getCompany()).andStandardRateEqualTo(input.getRateId());
		} else {
			criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andPartsDetailsEqualTo(input.getPartsDetails())
					.andRepairEqualTo(input.getRepair()).andContainerCategoryEqualTo(input.getContainerCategory())
					.andCompanyEqualTo(input.getCompany()).andContainerUserEqualTo(input.getContainerUser());
		}
		// 机组时使用部件大类
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory())) {
			criteria.andPartsTypeEqualTo(input.getPartsType());
		}
		rateList = rateMapper.selectByExample(rateExample);
		// 如果结果集大于1
		if (rateList.size() > 1) {
			// 箱类别为箱体时，再根据材质代码筛选
			if (StringUtils.isNotEmpty(input.getMaterial())
					&& ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
				List<Rate> firstList = rateList.stream().filter(a -> input.getMaterial().equals(a.getMaterial()))
						.collect(Collectors.toList());
				// 如果结果集等于1，则使用这条费率为标准费率
				if (firstList.size() == 0) {
					// 筛选rateList集合中材质代码为null或者是""的费率
					firstList = rateList.stream().filter(a -> !StringUtils.isNotEmpty(a.getMaterial()))
							.collect(Collectors.toList());
					if (firstList.size() == 1) {
						// 判断计算方式
						if (firstList.get(0).getCalculationType()
								.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())
								|| RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType()))
							model = getSecondGSRate(firstList.get(0), input, false);
						else
							model = getSecondQJRate(firstList.get(0), input, false);
					} else if (firstList.size() == 0) {
						// 查询用箱人为SAN的费率，即标准费率
						model = getSanRate(input, true);
					} else {
						throw new InvalidException("费率不唯一");
					}
				} else {
					// 判断计算方式
					if (firstList.get(0).getCalculationType()
							.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())
							|| RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType()))
						model = getSecondGSRate(firstList.get(0), input, false);
					else
						model = getSecondQJRate(firstList.get(0), input, false);
				}
			} else {
				throw new InvalidException("费率不唯一");
			}
			//
			// // 在原list上对公司筛选
			// List<Rate> firstList = rateList.stream().filter(a ->
			// input.getCompany().equals(a.getCompany()))
			// .collect(Collectors.toList());
			// // 如果结果集等于1，则使用这条费率为标准费率
			// if (firstList.size() == 1) {
			// // 判断计算方式
			// if
			// (firstList.get(0).getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode()))
			// model = getSecondGSRate(firstList.get(0), input, false);
			// else
			// model = getSecondQJRate(firstList.get(0), input, false);
			// }
			// // 如果大于1或者是等于0。等于0时使用原来的rateList集合，又因为rateList大于1，则查出符合标准的费率为多条
			// else {
			// throw new InvalidException("费率不唯一");
			// }
		}
		// 如果结果集等于1，则使用该条费率
		else if (rateList.size() == 1) {
			// 判断计算方式
			if (rateList.get(0).getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())
					|| RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType()))
				model = getSecondGSRate(rateList.get(0), input, false);
			else
				model = getSecondQJRate(rateList.get(0), input, false);
		}
		// 如果结果集小于1，则查询SAN标准费率
		else {
			// 查询用箱人为SAN的费率，即标准费率
			model = getSanRate(input, true);
		}

		return model;
	}

	/**
	 * 获取COSkey
	 * 
	 * @Description: TODO
	 * @return String @throws 
	 */
	private String getCosKey() {
		ContainerUserExample userExample = new ContainerUserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerUserCodeEqualTo(RateCommonEnum.CONTAINERUSERKEY3.getCode());
		List<ContainerUser> userList = containerUserMapper.selectByExample(userExample);
		if (userList.size() > 0)
			return userList.get(0).getKey();
		return "";
	}

	/**
	 * 查询工时费率表，返回工时费
	 * 
	 * @Description: TODO
	 * @param containerUser
	 *            用箱人
	 * @param company
	 *            地点（公司）
	 * @param containerCategory
	 *            箱类别
	 * @param stage
	 *            环节，检验、报价、派工；报价使用报价币种计算出报价金额
	 * @return Double @throws 
	 */
	private GetRateMessageOutput getManHourMoney(String containerUser, String company, String containerCategory,
			Double manHour, BigDecimal materialCost, String stage, BigDecimal qual) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 查询工时费率表
		ManhourRateExample example = new ManhourRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(containerUser)
				.andCompanyEqualTo(company);
		List<ManhourRate> rateList = manhourRateMapper.selectByExample(example);
		// 判断查询数量
		if (rateList.size() > 0) {
			ManhourRate rate = rateList.get(0);
			// 干箱
			if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
				// 工时费率乘工时数
				BigDecimal money = rate.getDrycontManhourRate()
						.multiply(twoDecimal(new BigDecimal(manHour).multiply(qual)));
				model.setManHourCost(twoDecimal(money));
				model.setCurrency(rate.getDrycontRateCurrency());
				model.setMaterialCost(materialCost.multiply(qual));
				// 如果环节是报价并且费率币种和报价币种不一致，需要将金额转为报价金额和报价币种
				if (!rate.getDrycontQuotedCurrency().equals(rate.getDrycontRateCurrency())
						&& RateStageEnum.TYPE02.getCode().equals(stage)) {
					model.setCurrency(rate.getDrycontQuotedCurrency());
					if (rate.getDrycontQuotedCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
						model.setManHourCost(costMultiply(model.getManHourCost(), rate.getDrycontExchangeRate()));
						model.setMaterialCost(costMultiply(model.getMaterialCost(), rate.getDrycontExchangeRate()));
					} else {
						model.setManHourCost(costDivide(model.getManHourCost(), rate.getDrycontExchangeRate()));
						model.setMaterialCost(costDivide(model.getMaterialCost(), rate.getDrycontExchangeRate()));
					}
				}
			}
			// 箱体
			else if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(containerCategory)) {
				// 工时费率乘工时数
				BigDecimal money = rate.getContbodyManhourRate()
						.multiply(twoDecimal(new BigDecimal(manHour).multiply(qual)));
				model.setManHourCost(twoDecimal(money));
				model.setCurrency(rate.getContbodyRateCurrency());
				model.setMaterialCost(materialCost.multiply(qual));
				// 如果环节是报价并且费率币种和报价币种不一致，需要将金额转为报价金额和报价币种
				if (!rate.getContbodyQuotedCurrency().equals(rate.getContbodyRateCurrency())
						&& RateStageEnum.TYPE02.getCode().equals(stage)) {
					model.setCurrency(rate.getContbodyQuotedCurrency());
					if (rate.getContbodyQuotedCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
						model.setManHourCost(costMultiply(model.getManHourCost(), rate.getContbodyExchangeRate()));
						model.setMaterialCost(costMultiply(model.getMaterialCost(), rate.getContbodyExchangeRate()));
					} else {
						model.setManHourCost(costDivide(model.getManHourCost(), rate.getContbodyExchangeRate()));
						model.setMaterialCost(costDivide(model.getMaterialCost(), rate.getContbodyExchangeRate()));
					}
				}
			}
			// 机组
			else if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
				// 工时费率乘工时数
				BigDecimal money = rate.getUnitManhourRate()
						.multiply(twoDecimal(new BigDecimal(manHour).multiply(qual)));
				model.setManHourCost(twoDecimal(money));
				model.setCurrency(rate.getUnitRateCurrency());
				model.setMaterialCost(materialCost.multiply(qual));
				// 如果环节是报价并且费率币种和报价币种不一致，需要将金额转为报价金额和报价币种
				if (!rate.getUnitQuotedCurrency().equals(rate.getUnitRateCurrency())
						&& RateStageEnum.TYPE02.getCode().equals(stage)) {
					model.setCurrency(rate.getUnitQuotedCurrency());
					if (rate.getUnitQuotedCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
						model.setManHourCost(costMultiply(model.getManHourCost(), rate.getUnitExchangeRate()));
						model.setMaterialCost(costMultiply(model.getMaterialCost(), rate.getUnitExchangeRate()));
					} else {
						model.setManHourCost(costDivide(model.getManHourCost(), rate.getUnitExchangeRate()));
						model.setMaterialCost(costDivide(model.getMaterialCost(), rate.getUnitExchangeRate()));
					}
				}
			}
		} else {
			throw new InvalidException("工时费率不存在，请维护");
		}
		return model;
	}

	/**
	 * BigDecimal乘法，保留四位小数
	 * 
	 * @Description: TODO
	 * @param cost
	 * @param exchange
	 * @return BigDecimal @throws 
	 */
	private BigDecimal costMultiply(BigDecimal cost, BigDecimal exchange) {
		return cost.multiply(exchange).setScale(4);
	}

	/**
	 * BigDecimal除法，保留四位小数
	 * 
	 * @Description: TODO
	 * @param manHourCost
	 * @param drycontExchangeRate
	 * @return BigDecimal @throws 
	 */
	private BigDecimal costDivide(BigDecimal cost, BigDecimal exchange) {
		return cost.divide(exchange, 4, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 中远费率表，组装返回数据
	 * 
	 * @Description: TODO
	 * @param rate
	 *            费率
	 * @param containerUser
	 *            用箱人
	 * @param containerCategory
	 *            箱型
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getCosRateInfo(ZyRate rate, String containerUser, String containerCategory,
			Double number, String stage) {
		// 判斷算法類型是否為數量
		if (rate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_04.getCode()))
			number = 1.d;
		BigDecimal qual = BigDecimal.valueOf(number);
		// 工时费用处理
		GetRateMessageOutput model = getManHourMoney(containerUser, rate.getCompany(), containerCategory,
				rate.getManHour(), rate.getMaterialCost(), stage, qual);
		model.setRateId(getSanRateId(rate)); // SAN标准费率id
		model.setFiveCode(rate.getCosRateCode()); // 五位代码
		model.setMaterialCost(model.getMaterialCost()); // 材料费
		model.setManHour(BigDecimal.valueOf(rate.getManHour()).multiply(qual).doubleValue()); // 工时
		model.setManHourCost(model.getManHourCost());
		Rate sRate = rateMapper.selectByPrimaryKey(model.getRateId());
		model.setIsMustPhoto(sRate.getIsMustPhoto()); // 是否必传图片
		model.setIsRepeatPrompts(sRate.getIsRepeatPrompts()); // 重复条目是否提示
		model.setUserPartsDetails(rate.getPartsDetailsCode()); // 用箱人部件明细
		model.setUserRepair(rate.getRepairCode()); // 用箱人维修代码
		return model;
	}

	/**
	 * 获取标准费率id
	 * 
	 * @Description: TODO
	 * @param rate
	 * @return Integer @throws 
	 */
	private String getSanRateId(ZyRate rate) {
		RateExample example = new RateExample();
		example.createCriteria().andRateCodeEqualTo(rate.getPartsDetailsCode() + rate.getRepairCode())
				.andStandardRateIsNotNull();
		List<Rate> list = rateMapper.selectByExample(example);
		if (list.size() > 0)
			return list.get(0).getStandardRate();
		return null;
	}

	/**
	 * 金额小数处理（保留两位）
	 * 
	 * @Description: TODO
	 * @param money
	 * @return BigDecimal @throws 
	 */
	private BigDecimal twoDecimal(BigDecimal money) {
		BigDecimal divisor = new BigDecimal(1);
		return money.divide(divisor, 2, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 金额小数处理（保留两位）
	 * 
	 * @Description: TODO
	 * @param manHour
	 * @return Double @throws 
	 */
	private Double twoDouble(Double manHour) {
		BigDecimal divisor = new BigDecimal(1);
		return new BigDecimal(manHour).divide(divisor, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 中远费率第三轮筛选
	 * 
	 * @Description: TODO
	 * @param list
	 *            void @throws 
	 */
	private GetRateMessageOutput thirdFilter(List<ZyRate> list, GetRateMessageInput input) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 判断结果集的计算方式是否一致
		long algorithmCount = list.stream().map(ZyRate::getCalculationType).distinct().count();
		if (algorithmCount == 1) {
			ZyRate zyRate = list.get(0);
			// 长
			if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_01.getCode())) {
				// 取出list中的最大长度，和录入的长度进行比较
				Double maxLength = list.stream().max(Comparator.comparingDouble(ZyRate::getLength)).get().getLength();
				// 判断长度和宽度
				if (input.getWidth() > input.getLength()) {
					Double temp = input.getWidth();
					input.setWidth(input.getLength());
					input.setLength(temp);
				}
				if (input.getLength() > maxLength) {
					// 超过最大长度，则使用通用费率
					return getStandardRate(input);
				} else {
					// 获取最符合的费率
					ZyRate zyRate1 = list.stream().reduce((a, b) -> {
						// 长度差
						Double aLength = Math.abs(a.getLength() - input.getLength());
						Double bLength = Math.abs(b.getLength() - input.getLength());
						// a的长度差比b的长度差小时返回a
						if (aLength < bLength) {
							return a;
						} else if (aLength.toString().equals(bLength.toString())) {
							// a、b长度差相等时，返回a、b中原始长度小
							if (a.getLength() <= b.getLength())
								return a;
							else
								return b;
						} else {
							return b;
						}
					}).get();
					// 组装返回数据
					model = getCosRateInfo(zyRate1, input.getContainerUser(), input.getContainerCategory(),
							input.getQuantity(), input.getStage());
				}
			}
			// 长宽
			else if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_02.getCode())) {
				// 取出list中的最大长度和最大宽度，和录入的长度和宽度必检
				Double maxLength = list.stream().max(Comparator.comparingDouble(ZyRate::getLength)).get().getLength();
				Double maxWidth = list.stream().max(Comparator.comparingDouble(ZyRate::getWidth)).get().getWidth();
				// 判断长度和宽度
				if (input.getWidth() > input.getLength()) {
					Double temp = input.getWidth();
					input.setWidth(input.getLength());
					input.setLength(temp);
				}

				if (input.getLength() > maxLength || input.getWidth() > maxWidth) {
					// 超过最大长度或超过最大宽度，则使用通用费率
					return getStandardRate(input);
				}
				// 按照长度差排序
				List<ZyRate> firstList = list.stream().map(a -> {
					// 长度差
					a.setLength(Math.abs(a.getLength() - input.getLength()));
					return a;
				}).sorted(Comparator.comparing(ZyRate::getLength)).collect(Collectors.toList());
				// 获取最符合长度的费率集合
				List<ZyRate> secondList = firstList.stream().filter(a -> Double
						.doubleToLongBits(a.getLength()) == Double.doubleToLongBits(firstList.get(0).getLength()))
						.collect(Collectors.toList());
				// 判断secondList集合长度是否为1
				if (secondList.size() == 1) {
					// 组装返回数据
					model = getCosRateInfo(secondList.get(0), input.getContainerUser(), input.getContainerCategory(),
							input.getQuantity(), input.getStage());
				} else {
					// 再根据宽度筛选最符合的费率
					// 获取最符合的费率
					ZyRate zyRate1 = secondList.stream().reduce((a, b) -> {
						// 宽度差
						Double aWidth = Math.abs(a.getWidth() - input.getWidth());
						Double bWidth = Math.abs(b.getWidth() - input.getWidth());
						// a的宽度差比b的宽度差小时返回a
						if (aWidth < bWidth) {
							return a;
						} else if (aWidth.toString().equals(bWidth.toString())) {
							// a、b长度差相等时，返回a、b中原始长度小
							if (a.getWidth() <= b.getWidth())
								return a;
							else
								return b;
						} else {
							return b;
						}
					}).get();
					// 组装返回数据
					model = getCosRateInfo(zyRate1, input.getContainerUser(), input.getContainerCategory(),
							input.getQuantity(), input.getStage());
				}
			}
			// 面积
			else if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_03.getCode())) {
				// 根据面积查询最优费率
				List<ZyRate> firstList = list.stream()
						// 筛选数量（面积存入了数量字段）大于等于录入的长度* 宽度
						// .filter(a -> a.getQuantity() >= input.getLength() * input.getWidth())
						.filter(a -> BigDecimal.valueOf(a.getLength()).multiply(BigDecimal.valueOf(a.getWidth()))
								.compareTo(BigDecimal.valueOf(input.getLength())
										.multiply(BigDecimal.valueOf(input.getWidth()))) > -1)
						// 根据面积排序,讲长*宽存入长度字段，用长度字段排序
						.map(a -> {
							a.setLength(BigDecimal.valueOf(a.getLength()).multiply(BigDecimal.valueOf(a.getWidth()))
									.doubleValue());
							return a;
						}).sorted(Comparator.comparing(ZyRate::getLength)).collect(Collectors.toList());

				// firstList集合数量大于0时，取第一条数据作为最符合的费率
				if (firstList.size() > 0) {
					// 组装返回数据
					model = getCosRateInfo(firstList.get(0), input.getContainerUser(), input.getContainerCategory(),
							input.getQuantity(), input.getStage());
				} else {
					// 没有符合的费率，使用标准费率
					return getStandardRate(input);
				}
			}
			// 数量
			else if (zyRate.getCalculationType().equals(AlgorithmEnum.ALGORITHM_04.getCode())) {
				// 根据数量查询中远费率表中数量相等的一条数据
				List<ZyRate> firstList = list.stream()
						.filter(a -> Double.parseDouble(a.getQuantity().toString()) == input.getQuantity())
						.collect(Collectors.toList());
				// firstList集合数量大于0时，取第一条数据作为最符合的费率
				if (firstList.size() > 0) {
					// 组装返回数据
					model = getCosRateInfo(firstList.get(0), input.getContainerUser(), input.getContainerCategory(),
							1.d, input.getStage());
				} else {
					// 没有符合的费率，使用标准费率
					return getStandardRate(input);
				}
			}
		} else {
			// 使用标准费率
			return getStandardRate(input);
		}
		return model;
	}

	/**
	 * 获取SAN标准费率
	 * 
	 * @Description: TODO
	 * @param input
	 * @param isFirstLink
	 *            是否第一环节调用,true:是，false:否
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getSanRate(GetRateMessageInput input, boolean isFirstLink) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		RateExample rateExample = new RateExample();
		RateExample.Criteria criteria = rateExample.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(getSanKey())
				.andPartsDetailsEqualTo(input.getSanPartsDetails()).andRepairEqualTo(input.getSanRepair())
				.andContainerCategoryEqualTo(input.getContainerCategory())
				.andCompanyEqualTo(RateCommonEnum.QINGDAOCOMPANYKEY.getCode());
		// 机组时使用部件大类
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory())) {
			criteria.andPartsTypeEqualTo(input.getPartsType());
		}
		List<Rate> rateList = rateMapper.selectByExample(rateExample);
		// 判断rateList集合长度，等于1时
		if (rateList.size() == 1) {
			// // 根据SAN标准费率ID，获取用箱人对应的费率
			// RateExample tempExample = new RateExample();
			// tempExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
			// .andStandardRateEqualTo(rateList.get(0).getProdRateId()).andCompanyEqualTo(input.getCompany())
			// .andContainerUserEqualTo(input.getContainerUser())
			// .andContainerCategoryEqualTo(input.getContainerCategory());
			// List<Rate> temp = rateMapper.selectByExample(tempExample);
			// if (temp.size() > 0)
			// rateList = temp;
			// 判断计算方式
			if (rateList.get(0).getCalculationType().equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())
					|| RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType()))
				model = getSecondGSRate(rateList.get(0), input, isFirstLink);
			else
				model = getSecondQJRate(rateList.get(0), input, isFirstLink);
		}
		// 大于1时
		else if (rateList.size() > 1) {
			// throw new InvalidException("费率不唯一");
			// 判断箱类别是否为箱体
			if (StringUtils.isNotEmpty(input.getMaterial())
					&& ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
				List<Rate> firstList = rateList.stream().filter(a -> input.getMaterial().equals(a.getMaterial()))
						.collect(Collectors.toList());
				// 如果结果集等于1，则使用这条费率为标准费率
				if (firstList.size() == 0) {
					// 筛选rateList集合中材质代码为null或者是""的费率
					firstList = rateList.stream().filter(a -> !StringUtils.isNotEmpty(a.getMaterial()))
							.collect(Collectors.toList());
					if (firstList.size() == 1) {
						// // 根据SAN标准费率ID，获取用箱人对应的费率
						// RateExample tempExample = new RateExample();
						// tempExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						// .andStandardRateEqualTo(rateList.get(0).getProdRateId())
						// .andCompanyEqualTo(input.getCompany()).andContainerUserEqualTo(input.getContainerUser())
						// .andContainerCategoryEqualTo(input.getContainerCategory());
						// List<Rate> temp = rateMapper.selectByExample(tempExample);
						// if (temp.size() > 0)
						// firstList = temp;
						// 判断计算方式
						if (firstList.get(0).getCalculationType()
								.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())
								|| RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType()))
							model = getSecondGSRate(firstList.get(0), input, false);
						else
							model = getSecondQJRate(firstList.get(0), input, false);
					} else {
						throw new InvalidException("费率不唯一");
					}
				} else {
					// 判断计算方式
					if (firstList.get(0).getCalculationType()
							.equals(RateCalculationTypeEnum.CALCULATIONTYPE01.getCode())
							|| RateFromTypeEnum.TYPE03.getCode().equals(input.getFromType()))
						model = getSecondGSRate(firstList.get(0), input, false);
					else
						model = getSecondQJRate(firstList.get(0), input, false);
				}
			} else {
				throw new InvalidException("费率不唯一");
			}
		} else {
			throw new InvalidException("费率不存在");
		}
		return model;
	}

	/**
	 * 标准费率第二轮筛选(穷举型)
	 * 
	 * @Description: TODO
	 * @param rate
	 * @param input
	 * @param isFirstLink
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getSecondQJRate(Rate rate, GetRateMessageInput input, boolean isFirstLink) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 根据费率计算方式，查询明细算法
		RateExhaustionExample example = new RateExhaustionExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andRateIdEqualTo(rate.getProdRateId())
				.andTypeEqualTo(input.getFromType());
		List<RateExhaustion> list = rateExhaustionMapper.selectByExample(example);
		// 判断list长度大于1，继续筛选
		if (list.size() > 1) {
			// 继续第三轮筛选
			model = getThirdQJRate(rate, list, input);
		} else if (list.size() == 1) {
			// 等于1，就用该条算法计算费用
			model = getFourthQJRate(rate, list, input);
		} else {
			// 小于1，判断第二轮的入口
			if (isFirstLink)
				throw new InvalidException("费率不存在");
			else
				model = getSanRate(input, true);
		}
		return model;
	}

	/**
	 * 标准费率第二轮筛选(公式型)
	 * 
	 * @Description: TODO
	 * @param rate
	 * @param input
	 * @param isFirstLink
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getSecondGSRate(Rate rate, GetRateMessageInput input, boolean isFirstLink) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 工时数、材料费
		Double manHour = 0.d;
		BigDecimal materialCost = new BigDecimal(0);
		RateFormulaExample rateExample = new RateFormulaExample();
		rateExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andTypeEqualTo(input.getFromType())
				.andAlgorithmTypeEqualTo(AlgorithmTypeEnum.ALGORITHMTYPE01.getCode())
				.andRateIdEqualTo(rate.getProdRateId());
		List<RateFormula> rateList = rateFormulaMapper.selectByExample(rateExample);
		if (rateList.size() > 1) {
			// 继续第三轮筛选
			manHour = getThirdGSRate(rate, rateList, input).doubleValue();
		} else if (rateList.size() == 1) {
			// 等于1，就用该条算法计算费用
			manHour = getFifthGSRate(rate, rateList, input).doubleValue();
		} else {
			// 小于1，判断第二轮的入口
			if (isFirstLink)
				//// 工时不存在算法时，返回0,(机组的如果有客户费率主表，没有明细的返回0吧,有工时返回工时，有材料返回材料费,先改机组的吧)
				if (ContainerCategoryEnum.isUnit(input.getContainerCategory()))
					manHour = 0.d; // 机组工时，没有工时的计算公式时，返回0
				else
					throw new InvalidException("费率不存在");
			else
				model = getSanRate(input, true);
		}
		// 根据费率计算方式，查询明细算法(材料费),请求类型不为报价工时时才会使用材料费的计算
		if (!input.getFromType().equals(RateFromTypeEnum.TYPE03.getCode())) {
			// 进场类型为机组，并且备件号不为空时，使用备件表中的报价金额和报价币种
			if (ContainerCategoryEnum.isUnit(input.getContainerCategory())
					&& StringUtils.isNotEmpty(input.getSparesNumber())) {
				// 调用备件接口，回去备件报价费用，材料费=报价费用*数量，并根据环节将报价币种和费率币种进行转换
				materialCost = getUnitMaterialCost(input);
			} else {
				RateFormulaExample example = new RateFormulaExample();
				example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andTypeEqualTo(input.getFromType())
						.andAlgorithmTypeEqualTo(AlgorithmTypeEnum.ALGORITHMTYPE02.getCode())
						.andRateIdEqualTo(rate.getProdRateId());
				List<RateFormula> materialList = rateFormulaMapper.selectByExample(example);
				if (materialList.size() > 1) {
					// 继续第三轮筛选
					materialCost = getThirdGSRate(rate, materialList, input);
				} else if (materialList.size() == 1) {
					// 等于1，就用该条算法计算费用
					materialCost = getFifthGSRate(rate, materialList, input);
				} else {
					// 小于1，判断第二轮的入口
					if (isFirstLink) {
						//// 材料费不存在算法时，返回0,(机组的如果有客户费率主表，没有明细的返回0吧,有工时返回工时，有材料返回材料费,先改机组的吧)
						if (ContainerCategoryEnum.isUnit(input.getContainerCategory()))
							materialCost = new BigDecimal(0); // 机组材料费，当没有备件号，没有材料费的计算公式时，返回0
						else
							throw new InvalidException("费率不存在");
					} else
						model = getSanRate(input, true);

				}
			}
		}
		model = getStandardRateInfo(rate, manHour, materialCost, input, new BigDecimal(1));
		return model;
	}

	/**
	 * 标准费率第三轮筛选(穷举型)
	 * 
	 * @Description: TODO
	 * @param list
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getThirdQJRate(Rate rate, List<RateExhaustion> list, GetRateMessageInput input) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 结果集
		List<RateExhaustion> resultList = new ArrayList<RateExhaustion>();
		// 根据尺寸、箱型、位置代码筛选
		// 将筛选出的list取交集
		List<RateExhaustion> exList = new ArrayList<RateExhaustion>();
		// 筛选箱型
		List<RateExhaustion> zyContList = list.stream().filter(a -> {
			// 箱型为空或者是箱型等于录入的箱型,返回true，否则返回false
			if (!StringUtils.isNotEmpty(a.getContainerType())) {
				return true;
			} else {
				if (StringUtils.isNotEmpty(input.getContainerType())) {
					if (StringUtils.isNotEmpty(a.getContainerType())
							&& a.getContainerType().indexOf(input.getContainerType()) > -1)
						return true;
				}
			}
			return false;
		}).collect(Collectors.toList());
		exList.addAll(zyContList);
		// 筛选尺寸
		List<RateExhaustion> zySizeList = list.stream().filter(a -> {
			// 尺寸为空或者是箱型等于录入的尺寸,返回true，否则返回false
			if (!StringUtils.isNotEmpty(a.getSize())) {
				return true;
			} else {
				if (StringUtils.isNotEmpty(input.getSize())) {
					if (StringUtils.isNotEmpty(a.getSize()) && a.getSize().indexOf(input.getSize()) > -1)
						return true;
				}
			}
			return false;
		}).collect(Collectors.toList());
		exList.retainAll(zySizeList);
		// 筛选位置代码
		List<RateExhaustion> zyPostList = list.stream()
				.filter(a -> getPosition(input.getPositionCode(), a.getPositionCode())).collect(Collectors.toList());
		exList.retainAll(zyPostList);
		List<RateExhaustion> thirdFilterList = new ArrayList<>(exList);
		// 判断thirdFilterList集合长度，小于1时使用上一级筛选的list
		if (thirdFilterList.size() > 0) {
			// 如果大于0，使用本次筛选的结果集
			resultList = thirdFilterList;
		} else {
			resultList = list;
		}
		// 判断结果集的算法依赖是否一致
		long typeCount = resultList.stream().map(RateExhaustion::getAlgorithmBasis).distinct().count();
		if (typeCount == 1) {
			model = getFourthQJRate(rate, resultList, input);
		} else {
			throw new InvalidException("算法依据不唯一");
		}

		return model;
	}

	/**
	 * 标准费率第四轮计算费用(穷举型)
	 * 
	 * @param input
	 * @param list
	 * @Description: TODO
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getFourthQJRate(Rate rate, List<RateExhaustion> list, GetRateMessageInput input) {
		GetRateMessageOutput model = new GetRateMessageOutput();
		// 算法类型
		String algorithmBasis = list.get(0).getAlgorithmBasis();
		Double manHour = 0.d; // 工时数
		BigDecimal materialCost = new BigDecimal(0); // 材料费
		// 长度
		if (algorithmBasis.equals(AlgorithmSanEnum.ALGORITHMSAN01.getCode())) {
			// 获取集合最大宽度，用于判断是否使用同时宽度计算
			Double maxWidth = list.stream().max(Comparator.comparingDouble(RateExhaustion::getWidth)).get().getWidth();
			// 获取最大长度
			Double maxLength = list.stream().max(Comparator.comparingDouble(RateExhaustion::getLength)).get()
					.getLength();
			// 如果最大宽度等于0，则将录入的宽度设为0，进行后续计算
			if (Double.doubleToLongBits(maxWidth) == Double.doubleToLongBits(0.d))
				input.setWidth(0.d);
			if (Double.doubleToLongBits(input.getWidth()) == Double.doubleToLongBits(0.d)) {
				// 获取最符合的一条费率算法
				RateExhaustion rateEx = getLengthOptimum(list, input.getLength());
				if (input.getLength() <= maxLength) {
					manHour = rateEx.getManHour(); // 工时数
					materialCost = rateEx.getMaterialCost(); // 材料费
				} else {
					// 获取录入的长度和最大长度的余数
					Double leftLength = input.getLength() % maxLength;
					// 倍数
					Double multiple = Math.floor(input.getLength() / maxLength);
					manHour = rateEx.getManHour() * multiple; // 工时数
					materialCost = rateEx.getMaterialCost().multiply(new BigDecimal(multiple)); // 材料费
					if (leftLength > 0) {
						// 根据多余的长度再次获取最符合的一条费率算法
						RateExhaustion rateEx1 = getLengthOptimum(list, leftLength);
						// 将多余长度获取到的信息与之前的信息相加
						manHour = manHour + rateEx1.getManHour(); // 工时数
						materialCost = materialCost.add(rateEx1.getMaterialCost()); // 材料费
					}
				}
			} else {
				// 判断录入的长宽，如果宽大于长，则互换
				if (Double.doubleToLongBits(input.getWidth()) > Double.doubleToLongBits(input.getLength())) {
					Double width1 = input.getWidth();
					input.setWidth(input.getLength());
					input.setLength(width1);
				}
				// 根据长度宽度获取最佳费率
				RateExhaustion rateEx = getLengthWidthOptimum(list, input.getLength(), input.getWidth());
				if (input.getLength() <= maxLength && input.getWidth() <= maxWidth) {
					manHour = rateEx.getManHour(); // 工时数
					materialCost = rateEx.getMaterialCost(); // 材料费
				} else {
					if (input.getLength() > maxLength && input.getWidth() > maxWidth) {
						throw new InvalidException("算法存在逻辑错误:长和宽都超过最大值！");
					} else {
						// 如果录入长度大于最大长度
						if (input.getLength() > maxLength) {
							Double leftLength = input.getLength() % maxLength;// 超过整张板取余
							// 倍数
							Double multiple = Math.floor(input.getLength() / maxLength);
							manHour = rateEx.getManHour() * multiple; // 工时数
							materialCost = rateEx.getMaterialCost().multiply(new BigDecimal(multiple)); // 材料费
							if (leftLength > 0) {
								RateExhaustion rateEx1 = new RateExhaustion();
								// 判断剩余长度和宽度的大小，宽度大则互换
								if (leftLength >= input.getWidth())
									rateEx1 = getLengthWidthOptimum(list, leftLength, input.getWidth());
								else
									rateEx1 = getLengthWidthOptimum(list, input.getWidth(), leftLength);
								// 将多余长度获取到的信息与之前的信息相加
								manHour = manHour + rateEx1.getManHour(); // 工时数
								materialCost = materialCost.add(rateEx1.getMaterialCost()); // 材料费
							}
						}
						// 如果录入宽度大于最大宽度
						else if (input.getWidth() > maxWidth) {
							// 宽度余数
							Double leftWidth = input.getWidth() % maxWidth;
							// 宽度倍数
							Double multiple = Math.floor(input.getWidth() / maxWidth);
							manHour = rateEx.getManHour() * multiple; // 工时数
							materialCost = rateEx.getMaterialCost().multiply(new BigDecimal(multiple)); // 材料费
							if (leftWidth > 0) {
								RateExhaustion rateEx1 = getLengthWidthOptimum(list, input.getLength(), leftWidth);
								// 将多余宽度获取到的信息与之前的信息相加
								manHour = manHour + rateEx1.getManHour(); // 工时数
								materialCost = materialCost.add(rateEx1.getMaterialCost()); // 材料费
							}
						}
					}
				}
			}
		}
		// 数量
		else if (algorithmBasis.equals(AlgorithmSanEnum.ALGORITHMSAN03.getCode())) {
			// 根据数量筛选最佳费率
			list = list.stream().filter(
					a -> Double.doubleToLongBits(a.getQuantity()) == Double.doubleToLongBits(input.getQuantity()))
					.collect(Collectors.toList());
			if (list.size() == 1) {
				manHour = list.get(0).getManHour(); // 工时数
				materialCost = list.get(0).getMaterialCost(); // 材料费
			} else if (list.size() > 1) {
				throw new InvalidException("费率算法不唯一");
			} else {
				throw new InvalidException("费率算法不存在");
			}
		} else {
			throw new InvalidException("暂无算法实现");
		}
		// 箱类别为机组并且备件号不为空
		if (ContainerCategoryEnum.isUnit(input.getContainerCategory())
				&& StringUtils.isNotEmpty(input.getSparesNumber())) {
			materialCost = getUnitMaterialCost(input);
		}
		model = getStandardRateInfo(rate, manHour, materialCost, input, new BigDecimal(input.getQuantity()));
		return model;
	}

	/**
	 * 获取机组材料费
	 * 
	 * @Description: TODO
	 * @param input
	 * @return BigDecimal @throws 
	 */
	private BigDecimal getUnitMaterialCost(GetRateMessageInput input) {
		BigDecimal materialCost = new BigDecimal(0);
		// 调用备件接口，回去备件报价费用，材料费=报价费用*数量，并根据环节将报价币种和费率币种进行转换
		// 机组的材料费要计算折扣率，待添加，基础表“客户备件折扣管理” prod_unit_discount
		// 机组备件折扣率
		BigDecimal discount = new BigDecimal(1);
		if (StringUtils.isNotEmpty(input.getUnitCompany()) && StringUtils.isNotEmpty(input.getYard())) {
			UnitDiscountExample discountExample = new UnitDiscountExample();
			discountExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andCompanyEqualTo(input.getCompany())
					.andYardEqualTo(input.getYard()).andContainerUserEqualTo(input.getContainerUser())
					.andUnitCompanyEqualTo(input.getUnitCompany());
			List<UnitDiscount> discountList = unitDiscountMapper.selectByExample(discountExample);
			if (discountList.size() > 0)
				discount = discountList.get(0).getDiscount();
		}
		Result<SparePartsOutput> spares = warehouseClient.getSparePartByNo(input.getSparesNumber());
		if (spares != null && spares.getData() != null && spares.getData().getSpareNum() != null) {
			SparePartsOutput sDate = spares.getData();
			BigDecimal money = sDate.getQuotePrice().multiply(discount);
			String curreny = sDate.getQuoteCurrency();
			// 判断报价金额和报价币种是否为空
			if (money != null && StringUtils.isNotEmpty(curreny)) {
				// 获取用箱人的费率币种
				ManhourRateExample manExample = new ManhourRateExample();
				manExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andContainerUserEqualTo(input.getContainerUser()).andCompanyEqualTo(input.getCompany());
				List<ManhourRate> manList = manhourRateMapper.selectByExample(manExample);
				if (manList.size() > 0 && !manList.get(0).getUnitRateCurrency().equals(curreny)) {
					if (RateCurrencyEnum.CNY.getCode().equals(curreny))
						materialCost = costDivide(money, manList.get(0).getUnitExchangeRate());
					else
						materialCost = costMultiply(money, manList.get(0).getUnitExchangeRate());
				} else {
					materialCost = money;
				}
			}
		}
		return materialCost.multiply(new BigDecimal(input.getQuantity()));
	}

	/**
	 * 标准费率，组装返回数据
	 * 
	 * @Description: TODO
	 * @param rate
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getStandardRateInfo(Rate rate, Double manHour, BigDecimal materialCost,
			GetRateMessageInput input, BigDecimal quantity) {
		// 工时费用处理
		GetRateMessageOutput model = getManHourMoney(input.getContainerUser(), rate.getCompany(),
				rate.getContainerCategory(), manHour, materialCost, input.getStage(), quantity);
		model.setFiveCode("99999"); // 中远五位代码
		if (StringUtils.isNotEmpty(rate.getStandardRate()))
			model.setRateId(rate.getStandardRate());
		else
			model.setRateId(rate.getProdRateId());
		model.setMaterialCost(twoDecimal(model.getMaterialCost())); // 材料费
		model.setManHour(twoDouble(new BigDecimal(manHour).multiply(quantity).doubleValue())); // 工时
		model.setManHourCost(twoDecimal(model.getManHourCost())); // 工时费
		Rate sRate = rateMapper.selectByPrimaryKey(model.getRateId());
		model.setIsMustPhoto(sRate.getIsMustPhoto()); // 是否必传图片
		model.setIsRepeatPrompts(sRate.getIsRepeatPrompts()); // 重复条目是否提示
		// 返回用箱人部件明细和维修代码
		model.setUserPartsDetails(input.getPartsDetails()); // 用箱人部件明细
		model.setUserRepair(input.getRepair()); // 用箱人维修代码
		return model;
	}

	/**
	 * 根据长度获取最佳费率（穷举型）
	 * 
	 * @Description: TODO
	 * @param list
	 * @return RateExhaustion @throws 
	 */
	private RateExhaustion getLengthOptimum(List<RateExhaustion> list, Double length) {
		RateExhaustion rateEx = list.stream().reduce((a, b) -> {
			// 长度差
			Double aLength = Math.abs(a.getLength() - length);
			Double bLength = Math.abs(b.getLength() - length);
			// a的长度差比b的长度差小时返回a
			if (aLength < bLength) {
				return a;
			} else if (aLength.toString().equals(bLength.toString())) {
				// a、b长度差相等时，返回a、b中原始长度小
				if (a.getLength() <= b.getLength())
					return a;
				else
					return b;
			} else {
				return b;
			}
		}).get();
		return rateEx;
	}

	/**
	 * 根据宽度获取最佳费率（穷举型）
	 * 
	 * @Description: TODO
	 * @param list
	 * @return RateExhaustion @throws 
	 */
	private RateExhaustion getWidthOptimum(List<RateExhaustion> list, Double width) {
		RateExhaustion rateEx = list.stream().reduce((a, b) -> {
			// 宽度差
			Double aWidth = Math.abs(a.getWidth() - width);
			Double bWidth = Math.abs(b.getWidth() - width);
			// a的宽度差比b的宽度差小时返回a
			if (aWidth < bWidth) {
				return a;
			} else if (aWidth.toString().equals(bWidth.toString())) {
				// a、b宽度差相等时，返回a、b中原始宽度小
				if (a.getWidth() <= b.getWidth())
					return a;
				else
					return b;
			} else {
				return b;
			}
		}).get();
		return rateEx;
	}

	/**
	 * 根据长宽获取最佳费率（穷举型）
	 * 
	 * @Description: TODO
	 * @param list
	 * @param length
	 * @param width
	 * @return RateExhaustion @throws 
	 */
	private RateExhaustion getLengthWidthOptimum(List<RateExhaustion> list, Double length, Double width) {
		// 根据长度获取最佳长度费率集合
		RateExhaustion lengthOp = getLengthOptimum(list, length);
		list = list.stream()
				.filter(a -> Double.doubleToLongBits(a.getLength()) == Double.doubleToLongBits(lengthOp.getLength()))
				.collect(Collectors.toList());
		// 再根据宽度筛选最符合的费率
		RateExhaustion widthOp = getWidthOptimum(list, width);
		return widthOp;
	}

	/**
	 * 标准费率第三轮筛选(公式型)
	 * 
	 * @Description: TODO
	 * @param rate
	 * @param materialList
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private BigDecimal getThirdGSRate(Rate rate, List<RateFormula> list, GetRateMessageInput input) {
		BigDecimal money = new BigDecimal(0);
		// 结果集
		List<RateFormula> resultList = new ArrayList<RateFormula>();
		// 根据尺寸、箱型、位置代码筛选
		// 将筛选出的list取交集
		List<RateFormula> exList = new ArrayList<RateFormula>();
		// 筛选箱型
		List<RateFormula> zyContList = list.stream().filter(a -> {
			// 箱型为空或者是箱型等于录入的箱型,返回true，否则返回false
			if (!StringUtils.isNotEmpty(a.getContainerType())) {
				return true;
			} else {
				if (StringUtils.isNotEmpty(input.getContainerType())) {
					if (a.getContainerType().indexOf(input.getContainerType()) > -1)
						return true;
				}
			}
			return false;
		}).collect(Collectors.toList());
		exList.addAll(zyContList);
		// 筛选尺寸
		List<RateFormula> zySizeList = list.stream().filter(a -> {
			// 尺寸为空或者是箱型等于录入的尺寸,返回true，否则返回false
			if (!StringUtils.isNotEmpty(a.getSize())) {
				return true;
			} else {
				if (StringUtils.isNotEmpty(input.getSize())) {
					if (a.getSize().indexOf(input.getSize()) > -1)
						return true;
				}
			}
			return false;
		}).collect(Collectors.toList());
		exList.retainAll(zySizeList);
		// 筛选位置代码
		List<RateFormula> zyPostList = list.stream()
				.filter(a -> getPosition(input.getPositionCode(), a.getPositionCode())).collect(Collectors.toList());
		exList.retainAll(zyPostList);
		List<RateFormula> thirdFilterList = new ArrayList<RateFormula>(exList);
		// 判断thirdFilterList集合长度，小于1时使用上一级筛选的list
		if (thirdFilterList.size() > 0) {
			// 如果大于0，使用本次筛选的结果集
			resultList = thirdFilterList;
		} else {
			resultList = list;
		}
		// 判断结果集的长度
		if (resultList.size() == 1) {
			// 筛选结果为1条时，直接使用该条算法
			money = getFifthGSRate(rate, resultList, input);
		} else {
			// 筛选结果为多条时，再根据输入的数值的范围筛选
			money = getFourthGSRate(rate, resultList, input);
		}

		return money;
	}

	/**
	 * 标准费率第四轮筛选(公式型)
	 * 
	 * @Description: TODO
	 * @param rate
	 * @param list
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private BigDecimal getFourthGSRate(Rate rate, List<RateFormula> list, GetRateMessageInput input) {
		BigDecimal money = new BigDecimal(0);
		// 结果集
		List<RateFormula> listDr = new ArrayList<RateFormula>();
		// 获取集合中的算法依赖
		List<String> alBasisList = list.stream().map(RateFormula::getAlgorithmBasis).distinct()
				.collect(Collectors.toList());
		if (alBasisList.size() > 1)
			throw new InvalidException("算法依赖不唯一");
		if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN01.getCode())) {
			// 长度筛选
			findByInterval(list, listDr, AlgorithmSanEnum.ALGORITHMSAN01.getCode(), input.getLength());
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN02.getCode())) {
			// 宽度筛选
			findByInterval(list, listDr, AlgorithmSanEnum.ALGORITHMSAN02.getCode(), input.getWidth());
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN03.getCode())) {
			// 数量筛选
			findByInterval(list, listDr, AlgorithmSanEnum.ALGORITHMSAN03.getCode(), input.getQuantity());
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN04.getCode())) {
			// 周长筛选
			Double value = (input.getLength() + input.getWidth()) * 2;
			findByInterval(list, listDr, AlgorithmSanEnum.ALGORITHMSAN04.getCode(), value);
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN05.getCode())) {
			// 面积筛选
			Double value = input.getLength() * input.getWidth();
			findByInterval(list, listDr, AlgorithmSanEnum.ALGORITHMSAN05.getCode(), value);
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN06.getCode())) {
			// 其他筛选
			Double value = input.getLength() * input.getWidth();
			specialFind(list, listDr, AlgorithmSanEnum.ALGORITHMSAN06.getCode(), value);
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN07.getCode())) {
			// 面积取整
			Double value = input.getLength() * input.getWidth();
			specialFind(list, listDr, AlgorithmSanEnum.ALGORITHMSAN07.getCode(), value);
		} else if (alBasisList.get(0).equals(AlgorithmSanEnum.ALGORITHMSAN08.getCode())) {
			// 周长取整
			Double value = (input.getLength() + input.getWidth()) * 2;
			specialFind(list, listDr, AlgorithmSanEnum.ALGORITHMSAN08.getCode(), value);
		} else {
			throw new InvalidException("算法类型不存在");
		}
		// 结果数据组装
		money = getFifthGSRate(rate, listDr, input);
		return money;
	}

	/**
	 * 标准费率第五轮筛选(公式型)
	 * 
	 * @Description: TODO
	 * @param rate
	 * @param list
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private BigDecimal getFifthGSRate(Rate rate, List<RateFormula> list, GetRateMessageInput input) {
		Double money = 0.d;
		// 标准算法
		RateFormula rateFormula = list.get(0);
		if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN01.getCode())) {
			// 长度
			money = GetDryResult(input.getContainerCategory(), input.getLength(), rateFormula) * input.getQuantity();
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN02.getCode())) {
			// 宽度
			money = GetDryResult(input.getContainerCategory(), input.getWidth(), rateFormula) * input.getQuantity();
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN03.getCode())) {
			// 数量
			money = GetDryResult(input.getContainerCategory(), input.getQuantity(), rateFormula);
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN04.getCode())) {
			// 周长
			money = GetDryResult(input.getContainerCategory(), (input.getWidth() + input.getLength()) * 2, rateFormula)
					* input.getQuantity();
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN05.getCode())) {
			// 面积
			money = GetDryResult(input.getContainerCategory(), input.getLength() * input.getWidth(), rateFormula)
					* input.getQuantity();
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN06.getCode())) {
			// 其他
			money = GetRefResultO(2 * (input.getLength() + input.getWidth()), input.getLength() * input.getWidth(),
					rateFormula) * input.getQuantity();
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN07.getCode())) {
			// 面积取整
			money = GetRefResultRS(input.getLength() * input.getWidth() * input.getQuantity(), rateFormula);
		} else if (rateFormula.getAlgorithmBasis().equals(AlgorithmSanEnum.ALGORITHMSAN08.getCode())) {
			// 周长取整
			money = GetRefResultRC(2 * (input.getLength() + input.getWidth()) * input.getQuantity(), rateFormula);
		}
		return BigDecimal.valueOf(money);
	}

	/**
	 * 根据数值区间筛选 
	 */
	private void findByInterval(List<RateFormula> list, List<RateFormula> listDr, String alBasis, Double value) {
		// 根据录入的数值区间筛选
		// 录入的数值在某条数据的最大基数和最小基数之间
		List<RateFormula> resultList = list.stream().filter(a -> {
			// 起始基数小于录入值，并且最大基数大于录入数值或最大基数为空
			if (a.getCardinalNumber() <= value
					&& (a.getMaxCardinalNumber() >= value || Double.doubleToLongBits(a.getMaxCardinalNumber()) == 0))
				return true;
			return false;
		}).collect(Collectors.toList());
		// 判断list长度
		if (resultList.size() == 1)
			listDr.add(resultList.get(0));
		else if (resultList.size() > 1)
			throw new InvalidException("算法依据不存在");
		else {
			// 判断录入值是否比所有匹配到的算法的最大基数还大，如果还大则取出最大基数最大的一条当做最佳费率
			// 取最大基数的最大值
			RateFormula maxNumberRate = list.stream().max(Comparator.comparing(RateFormula::getMaxCardinalNumber))
					.get();
			// 最大基数和录入值比较
			if (Double.doubleToLongBits(value) >= Double.doubleToLongBits(maxNumberRate.getMaxCardinalNumber())) {
				listDr.add(maxNumberRate);
			}
			// resultList = list.stream().filter(a -> {
			// if (a.getMaxCardinalNumber() <= value &&
			// Double.doubleToLongBits(a.getMaxCardinalNumber()) != 0)
			// return true;
			// return false;
			// }).sorted(Comparator.comparing(RateFormula::getMaxCardinalNumber)).collect(Collectors.toList());
			// if (resultList.size() == 1)
			// listDr.add(resultList.get(0));
			// else if (resultList.size() > 2)
			// throw new InvalidException("算法依据不存在");
			else {
				// 判断录入的值是否比所有匹配到的算法的起始基数还小，如果还小则取出起始基数最小的一条当做最佳费率
				// 取最小起始基数和录入值比较
				RateFormula minNumberRate = list.stream().min(Comparator.comparing(RateFormula::getCardinalNumber))
						.get();
				// 最小起始基数和录入值比较
				if (Double.doubleToLongBits(value) <= Double.doubleToLongBits(minNumberRate.getCardinalNumber())) {
					listDr.add(minNumberRate);
				} else {
					throw new InvalidException("算法依据不存在");
				}
				// resultList = list.stream().filter(a -> {
				// if (a.getCardinalNumber() >= value)
				// return true;
				// return false;
				// }).sorted(Comparator.comparing(RateFormula::getCardinalNumber)).collect(Collectors.toList());
				// if (resultList.size() == 1)
				// listDr.add(resultList.get(0));
				// else
				// throw new InvalidException("算法依据不存在");
			}
		}
	}

	/**
	 * 按数值期间筛选，算法依赖：其他、面积取整、周长取整
	 * 
	 * @Description: TODO
	 * @param list
	 * @param listDr
	 * @param alBasis
	 * @param value
	 *            void @throws 
	 */
	private void specialFind(List<RateFormula> list, List<RateFormula> listDr, String alBasis, Double value) {
		// 筛选特殊类型的最符合费率
		List<RateFormula> resultList = list.stream().filter(a -> {
			// 起始基数小于录入值，并且最大基数大于录入数值或最大基数为空
			if (a.getCardinalNumber() <= value)
				return true;
			return false;
		}).collect(Collectors.toList());
		// 如果list长度为1，则该条就是标准算法，否则提示算法不唯一
		if (resultList.size() == 1)
			listDr.add(resultList.get(0));
		else
			throw new InvalidException("算法不唯一");
	}

	/**
	 * 计算费用（公式型）
	 * 
	 * @Description: TODO
	 * @param value
	 * @param rate
	 * @return Double @throws 
	 */
	private Double GetDryResult(String containerCategory, Double value, RateFormula rate) {
		Double money = 0.d;
		// 如果递增基数为0，则设为1
		if (Double.doubleToLongBits(rate.getAddCardinalNumber()) == 0) {
			rate.setAddCardinalNumber(1.d);
		}
		// 如果value小于起始基数,则返回起始数值
		if (Double.doubleToLongBits(value) < Double.doubleToLongBits(rate.getCardinalNumber())) {
			return rate.getStartValue();
		}
		// 如果最大基数不为0，并且value大于最大基数
		if (Double.doubleToLongBits(rate.getMaxCardinalNumber()) != 0
				&& Double.doubleToLongBits(value) >= Double.doubleToLongBits(rate.getMaxCardinalNumber())) {
			if (Double.doubleToLongBits(rate.getMaxValue()) != 0)
				return rate.getMaxValue();
		}
		// 递增金额=（value-起始基数）/递增基数
		Double addMoney = 0.d;
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory))
			addMoney = Math.ceil((value - rate.getCardinalNumber()) / rate.getAddCardinalNumber());
		else
			addMoney = (value - rate.getCardinalNumber()) / rate.getAddCardinalNumber();
		money = new BigDecimal(rate.getStartValue() + addMoney * rate.getAddValue()).doubleValue();
		// .setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		// 如果最大数值不等于0，并且递增金额不大于最大数值
		if (Double.doubleToLongBits(rate.getMaxValue()) != 0
				&& Double.doubleToLongBits(money) >= Double.doubleToLongBits(rate.getMaxValue()))
			money = rate.getMaxValue();
		return money;
	}

	/**
	 * 计算费用，算法依赖：其他
	 */
	private Double GetRefResultO(Double perimeter, Double area, RateFormula rate) {
		Double money = 0.d;
		// 如果递增基数为0，则设为1
		if (Double.doubleToLongBits(rate.getAddCardinalNumber()) == 0) {
			rate.setAddCardinalNumber(1.d);
		}
		// 面积小于起始基数，返回起始基数
		if (Double.doubleToLongBits(area) <= Double.doubleToLongBits(rate.getCardinalNumber())) {
			return rate.getStartValue();
		}
		// 最大基数不为0，并且面积大于最大基数
		if (Double.doubleToLongBits(rate.getMaxCardinalNumber()) != 0
				&& Double.doubleToLongBits(area) >= Double.doubleToLongBits(rate.getMaxCardinalNumber())) {
			if (Double.doubleToLongBits(rate.getMaxValue()) != 0)
				return rate.getMaxValue();
		}
		// 金额=周长*递增数值/递增基数
		money = (perimeter * rate.getAddValue()) / rate.getAddCardinalNumber();
		// 如果最大数值不等于0，并且递增金额不大于最大数值
		if (Double.doubleToLongBits(rate.getMaxValue()) != 0
				&& Double.doubleToLongBits(money) >= Double.doubleToLongBits(rate.getMaxValue()))
			money = rate.getMaxValue();
		return money;
	}

	/**
	 * 计算费用，算法依赖：面积取整
	 * 
	 * @Description: TODO
	 * @param value
	 * @param rate
	 * @return Double @throws 
	 */
	private Double GetRefResultRS(Double value, RateFormula rate) {
		Double money = 0.d;
		// 如果递增基数为0，则设为1
		if (Double.doubleToLongBits(rate.getAddCardinalNumber()) == 0) {
			rate.setAddCardinalNumber(1.d);
		}
		// 如果value小于起始基数
		if (Double.doubleToLongBits(value) < Double.doubleToLongBits(rate.getCardinalNumber())) {
			throw new InvalidException("无法按照RS方式计算,因为输入值小于取值范围");
		}
		// 最大基数不为0，并且value大于最大基数
		if (Double.doubleToLongBits(rate.getMaxCardinalNumber()) != 0
				&& Double.doubleToLongBits(value) >= Double.doubleToLongBits(rate.getMaxCardinalNumber())) {
			if (Double.doubleToLongBits(rate.getMaxValue()) != 0)
				return rate.getMaxValue();
		}
		// value减去起始基数
		value -= rate.getCardinalNumber();
		// 金额=起始基数+（value/递增基数）*递增数值
		money = rate.getStartValue() + Math.floor(value / rate.getAddCardinalNumber()) * rate.getAddValue();
		Double dLeft = value % rate.getCardinalNumber();
		if (Double.doubleToLongBits(dLeft) > 0) {
			///////////////////
			////////////
			////////
			////
			//
		}
		// 如果最大数值不等于0，并且递增金额不大于最大数值
		if (Double.doubleToLongBits(rate.getMaxValue()) != 0
				&& Double.doubleToLongBits(money) >= Double.doubleToLongBits(rate.getMaxValue()))
			money = rate.getMaxValue();
		return money;
	}

	/**
	 * 计算费用，算法依赖：周长取整
	 * 
	 * @Description: TODO
	 * @param value
	 * @param rate
	 * @return Double @throws 
	 */
	private Double GetRefResultRC(Double value, RateFormula rate) {
		Double money = 0.d;
		// 如果递增基数为0，则设为1
		if (Double.doubleToLongBits(rate.getAddCardinalNumber()) == 0) {
			rate.setAddCardinalNumber(1.d);
		}
		// 如果value小于起始基数
		if (Double.doubleToLongBits(value) < Double.doubleToLongBits(rate.getCardinalNumber())) {
			throw new InvalidException("无法按照RC方式计算,因为输入值小于取值范围");
		}
		// 最大基数不为0，并且value大于最大基数
		if (Double.doubleToLongBits(rate.getMaxCardinalNumber()) != 0
				&& Double.doubleToLongBits(value) >= Double.doubleToLongBits(rate.getMaxCardinalNumber())) {
			if (Double.doubleToLongBits(rate.getMaxValue()) != 0)
				return rate.getMaxValue();
		}
		// value减去起始基数
		value -= rate.getCardinalNumber();
		// 金额=起始基数+（value/递增基数）*递增数值
		money = rate.getStartValue() + Math.floor(value / rate.getAddCardinalNumber()) * rate.getAddValue();
		Double dLeft = value % rate.getCardinalNumber();
		if (Double.doubleToLongBits(dLeft) > 0) {
			///////////////////
			////////////
			////////
			////
			//
		}
		// 如果最大数值不等于0，并且递增金额不大于最大数值
		if (Double.doubleToLongBits(rate.getMaxValue()) != 0
				&& Double.doubleToLongBits(money) >= Double.doubleToLongBits(rate.getMaxValue()))
			money = rate.getMaxValue();
		return money;
	}

	/**
	 * 根据标准费率id获取主件
	 * 
	 * @Description: TODO
	 * @param input
	 * @param rateId
	 * @return String @throws 
	 */
	private String getDevice(GetRateMessageInput input, String rateId) {
		// 获取成本费率信息
		CostRateExample example = new CostRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andRateIdEqualTo(rateId)
				.andSparesTypeEqualTo(SparesTypeEnum.SPARESTYPE_01.getCode());
		List<CostRate> costList = costRateMapper.selectByExample(example);
		// 如果只有一条主件数据，则使用该条数据
		if (costList.size() == 1) {
			return costList.get(0).getSpares();
		} else if (costList.size() > 1) {
			// 多条时，再根据箱型、尺寸、位置筛选
			// 将筛选出的list取交集
			List<CostRate> exList = new ArrayList<CostRate>();
			// 筛选箱型
			List<CostRate> zyContList = costList.stream().filter(a -> {
				// 箱型为空或者是箱型等于录入的箱型,返回true，否则返回false
				if (!StringUtils.isNotEmpty(a.getContainerType())) {
					return true;
				} else {
					if (StringUtils.isNotEmpty(input.getContainerType())) {
						if (StringUtils.isNotEmpty(a.getContainerType())
								&& a.getContainerType().indexOf(input.getContainerType()) > -1)
							return true;
					}
				}
				return false;
			}).collect(Collectors.toList());
			exList.addAll(zyContList);
			// 筛选尺寸
			List<CostRate> zySizeList = costList.stream().filter(a -> {
				// 尺寸为空或者是箱型等于录入的尺寸,返回true，否则返回false
				if (!StringUtils.isNotEmpty(a.getSize())) {
					return true;
				} else {
					if (StringUtils.isNotEmpty(input.getSize())) {
						if (StringUtils.isNotEmpty(a.getSize()) && a.getSize().indexOf(input.getSize()) > -1)
							return true;
					}
				}
				return false;
			}).collect(Collectors.toList());
			exList.retainAll(zySizeList);
			// 筛选位置代码
			List<CostRate> zyPostList = costList.stream()
					.filter(a -> getPosition(input.getPositionCode(), a.getPositionCode()))
					.collect(Collectors.toList());
			exList.retainAll(zyPostList);
			List<CostRate> filterList = new ArrayList<CostRate>(exList);
			// 确定唯一一条时，返回主件
			if (filterList.size() == 1)
				return filterList.get(0).getSpares();
		}
		return null;
	}

	/**
	 * 获取默认备件号
	 * 
	 * @Description: TODO
	 * @param device
	 * @return String @throws 
	 */
	private String getSparesNumber(String masterDeviceKey) {
		Result<String> model = warehouseClient.query(masterDeviceKey);
		if (model != null && model.getData() != null)
			return model.getData();
		return null;
	}

	/**
	 * 部件明细下拉
	 */
	@Override
	public List<SelectItemOutput> getPartsSelect() {
		RateExample example = new RateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(getSanKey());
		List<Rate> rateList = rateMapper.selectByExample(example);
		// 根据部件明细去重
		rateList = rateList.stream()
				.collect(Collectors.collectingAndThen(
						Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Rate::getPartsDetails))),
						ArrayList::new));
		return rateList.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setCode(a.getPartsDetails());
			return output;
		}).collect(Collectors.toList());
	}
}
