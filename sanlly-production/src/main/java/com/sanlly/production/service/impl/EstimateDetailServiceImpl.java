package com.sanlly.production.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.finance.BillSceneMDInput;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.EvaluationVersionsMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.ReasonMapper;
import com.sanlly.production.dao.ThirdpartyChargeMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UnrecycleCostMapper;
import com.sanlly.production.dao.XxContainerMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Container;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.EvaluationVersions;
import com.sanlly.production.entity.EvaluationVersionsExample;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.ReasonExample;
import com.sanlly.production.entity.ThirdpartyCharge;
import com.sanlly.production.entity.ThirdpartyChargeExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.UnrecycleCost;
import com.sanlly.production.entity.UnrecycleCostExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.RateCurrencyEnum;
import com.sanlly.production.enums.ReasonTypeEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReferralTypeEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.ThirdPayTypeEnum;
import com.sanlly.production.models.input.evaluation.AddEvaluationEntryInput;
import com.sanlly.production.models.input.evaluation.AddEvaluationInput;
import com.sanlly.production.models.input.evaluation.AddVersionDetailInput;
import com.sanlly.production.models.input.evaluation.AddVersionInput;
import com.sanlly.production.models.input.evaluation.SearchVersionInput;
import com.sanlly.production.models.input.evaluation.ThirdPartPayInput;
import com.sanlly.production.models.input.referral.ReferralOperateInput;
import com.sanlly.production.models.input.surrender.ChangeSurrenderInput;
import com.sanlly.production.models.input.valuation.ValuationCodeDetailInput;
import com.sanlly.production.models.input.valuation.ValuationCodeInput;
import com.sanlly.production.models.output.estimate.EstimateCourseEntryOutput;
import com.sanlly.production.models.output.estimate.EstimateEntryInfoOutput;
import com.sanlly.production.models.output.estimate.ThirdPayTypeOutput;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.EstimateDetailService;
import com.sanlly.production.service.FinanceService;
import com.sanlly.production.service.RateMHService;
import com.sanlly.production.service.ReferralService;
import com.sanlly.production.service.XxService;

/**
 * 估价明细接口实现类
 * 
 * @author RexSheng 
 * 2019年9月6日 下午4:37:17
 */
@Service
public class EstimateDetailServiceImpl extends BaseServiceImpl implements EstimateDetailService {

	@Autowired
	private EvaluationEntryMapper evaluationEntryDao;

	@Autowired
	private CourseEntryMapper courseEntryDao;

	@Autowired
	private CourseMapper courseDao;

	@Autowired
	private UnitCourseMapper unitCourseDao;

	@Autowired
	private ThirdpartyChargeMapper thirdpartyChargeDao;

	@Autowired
	private YardMapper yardDao;

	@Autowired
	private ContainerMapper containerDao;

	@Autowired
	private FinanceService financeClient;
	
	@Autowired
	private CourseKeyRuleService ruleService;
	
	@Autowired
	private EvaluationVersionsMapper versionDao;
	
	@Autowired
	private ThirdpartyChargeMapper thirdPayDao;

	@Autowired
	private ReasonMapper reasonDao;
	
	@Autowired
	private MaintenanceMapper maintenanceDao;
	
	/**
	 * 派工单接口
	 */
	@Autowired
	private ReferralService referralService;
	
	@Autowired
	private RateMHService rateService;
	
	@Autowired
	private XxContainerMapper xxDao;
	
	@Autowired
	private XxService xxService;
	
	@Autowired
	private UnrecycleCostMapper unrecycleCostDao;
	
	/**
	 * 根据进场id和箱类别获取条目明细
	 * 
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@Override
	public EstimateEntryInfoOutput estimateEntryList(String prodCourseId, String containerCategory) {
		if (StringUtils.isBlank(containerCategory)) {
			containerCategory = ContainerCategoryEnum.CONTAINER_01.getCode();
		}
		if (containerCategory.equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
			containerCategory = null;
		}
		EstimateEntryInfoOutput output = new EstimateEntryInfoOutput();
		EvaluationEntryExample example = new EvaluationEntryExample();
		EvaluationEntryExample.Criteria criteria=example.createCriteria();
		criteria.andCourseEqualTo(prodCourseId).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(containerCategory)) {
			criteria.andContainerCategoryEqualTo(containerCategory);
		}
		example.setOrderByClause("serial_number");
		List<EvaluationEntry> courseEntries = evaluationEntryDao.selectByExampleWithBLOBs(example);
		if (courseEntries != null && courseEntries.size() > 0) {
			List<EstimateCourseEntryOutput> dataList = new ArrayList<EstimateCourseEntryOutput>();
			for (EvaluationEntry courseEntrie : courseEntries) {
				EstimateCourseEntryOutput cceOutput = new EstimateCourseEntryOutput();
				cceOutput.setCourseEntryId(courseEntrie.getProdEvaluationEntryId());
				cceOutput.setPositionCode(courseEntrie.getPositionCode());
				cceOutput.setRepairCode(courseEntrie.getRepairCode());
				cceOutput.setDamageCode(courseEntrie.getDamageCode());
				cceOutput.setMaterialCode(courseEntrie.getMaterialCode());
				cceOutput.setPartsDetailsCode(courseEntrie.getPartsDetailsCode());
				cceOutput.setPartsRepairCode(courseEntrie.getPartsRepairCode());
				cceOutput.setPartTypeCode(courseEntrie.getPartsTypeCode());
				cceOutput.setPartsTypeCode(courseEntrie.getPartsTypeCode());
				cceOutput.setRepairNameLang(courseEntrie.getRepairCode());
				cceOutput.setDamageNameLang(courseEntrie.getDamageCode());
				cceOutput.setMaterialNameLang(courseEntrie.getMaterialCode());
				cceOutput.setPartsDetailsNameLang(courseEntrie.getPartsDetailsCode());
				cceOutput.setPartsRepairNameLang(courseEntrie.getPartsRepairCode());
				cceOutput.setPartTypeNameLang(courseEntrie.getPartsTypeCode());
				cceOutput.setSparesNum(courseEntrie.getSparesNumber());
				cceOutput.setLength(StringUtil.doubleToIntString(courseEntrie.getLength()));
				cceOutput.setWidth(StringUtil.doubleToIntString(courseEntrie.getWidth()));
				cceOutput.setQuantity(StringUtil.doubleToEffectString(courseEntrie.getQuantity()));
				cceOutput.setThirdpartyMoney(StringUtil.bigDecimalToEffectString(courseEntrie.getThirdpartyMoney()));
				cceOutput.setPayingParty(courseEntrie.getPayingParty());
				cceOutput.setRemarks(courseEntrie.getRemarks());
				cceOutput.setDevice(courseEntrie.getDevice());
				cceOutput.setManHourCost(StringUtil.bigDecimalToEffectString(courseEntrie.getManHourCost()));
				cceOutput.setMaterialCost(StringUtil.bigDecimalToEffectString(courseEntrie.getMaterialCost()));
				cceOutput.setSumMoney(StringUtil.bigDecimalToEffectString(courseEntrie.getSumMoney()));
				cceOutput.setOriginalManHourCost(StringUtil.bigDecimalToEffectString(courseEntrie.getOriginalManHourCost()));
				cceOutput.setOriginalMaterialCost(StringUtil.bigDecimalToEffectString(courseEntrie.getOriginalMaterialCost()));
				cceOutput.setOriginalSumMoney(StringUtil.bigDecimalToEffectString(courseEntrie.getOriginalSumMoney()));
				cceOutput.setPhoto(courseEntrie.getPhoto());
				cceOutput.setManHour(StringUtil.doubleToEffectString(courseEntrie.getManHour()));
				cceOutput.setRateId(courseEntrie.getRateId());
				cceOutput.setFiveCode(courseEntrie.getFiveCode());
				cceOutput.setIsMustPhoto(courseEntrie.getIsMustPhoto());
				if(StringUtils.isNotEmpty(courseEntrie.getIsCharge()) && courseEntrie.getIsCharge().equals(CommonEnum.YES.getCode())){
					cceOutput.setIsChargeLang(CommonEnum.YES.getCode());
					cceOutput.setIsChargeKey(CommonEnum.YES.getCode());
				}
				else {
					cceOutput.setIsChargeLang(CommonEnum.NO.getCode());
					cceOutput.setIsChargeKey(CommonEnum.NO.getCode());
				}
				if(StringUtils.isNotEmpty(courseEntrie.getIsRepair()) && courseEntrie.getIsRepair().equals(CommonEnum.NO.getCode())){
					cceOutput.setIsRepair(CommonEnum.NO.getCode());
					cceOutput.setIsRepairNameLang(CommonEnum.NO.getCode());
				}
				else {
					cceOutput.setIsRepair(CommonEnum.YES.getCode());
					cceOutput.setIsRepairNameLang(CommonEnum.YES.getCode());
				}
				cceOutput.setPrice(StringUtil.bigDecimalToEffectString(courseEntrie.getPrice()));
				cceOutput.setIsOriginal(courseEntrie.getIsOriginal());
				cceOutput.setWarehouseType(courseEntrie.getWarehouseType());
				cceOutput.setWarehouseTypeNameLang(courseEntrie.getWarehouseType());
				cceOutput.setCompany(courseEntrie.getCompany());
				cceOutput.setCompanyNameLang(courseEntrie.getCompany());
				cceOutput.setWarehouse(courseEntrie.getWarehouse());
				cceOutput.setWarehouseNameLang(courseEntrie.getWarehouse());
				dataList.add(cceOutput);
			}
			output.setDataList(dataList);
		}
		
		// 查询进场表
		CourseWithBLOBs courseWithBLOBs = courseDao.selectByPrimaryKey(prodCourseId);
		if (courseWithBLOBs != null) {
			output.setAfterPhoto(courseWithBLOBs.getAfterPhoto());
			String containerUser = courseWithBLOBs.getContainerUser();
			String yardKey = courseWithBLOBs.getYard();
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(yardKey);
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			if (yardList.size() > 0) {
				// 查询第三方付费方式
				ThirdpartyChargeExample chargeExample = new ThirdpartyChargeExample();
				chargeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andCompanyEqualTo(yardList.get(0).getCompany()).andContainerUserEqualTo(containerUser);
				List<ThirdpartyCharge> chargeList = thirdpartyChargeDao.selectByExample(chargeExample);
				if (chargeList.size() > 0) {
					output.setChargeType(chargeList.get(0).getThirdpartyChargeType());
				}
				
			}
		}
		if (StringUtils.isNotBlank(containerCategory) && containerCategory.equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			UnitCourseWithBLOBs unitCourse=unitCourseDao.selectByPrimaryKey(prodCourseId);
			if(unitCourse!=null) {
				output.setAfterPhoto(unitCourse.getAfterPhoto());
				output.setTestingPhoto(unitCourse.getUnitPhoto());
			}
		}else if (StringUtils.isNotBlank(containerCategory) && containerCategory.equals(ContainerCategoryEnum.CONTAINER_04.getCode())) {
			MaintenanceWithBLOBs course=maintenanceDao.selectByPrimaryKey(prodCourseId);
			if(course!=null) {
				output.setAfterPhoto(course.getAfterPhoto());
			}
		}else {
			if(courseWithBLOBs != null) {
				output.setSpeedPhoto(courseWithBLOBs.getSpeedPhoto());
				output.setTestingPhoto(courseWithBLOBs.getTestingPhoto());
			}
		}
		
		return output;
	}

	/**
	 * 新增估价条目明细
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void addEstimateEntry(AddEvaluationInput input) {
		if (input.getEntryList() != null) {
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			ObjectMapper mapper=new ObjectMapper();
			for (AddEvaluationEntryInput item : input.getEntryList()) {
				EvaluationEntry entry = new EvaluationEntry();
				BeanUtils.copyProperties(item, entry);
				entry.setIsDel(PlatformConstants.ISDEL_NO);
				entry.setCreateTime(new Date());
				entry.setCreateUser(getCurrentUserId());
				evaluationEntryDao.insert(entry);
				
				AddVersionDetailInput version=new AddVersionDetailInput();
				version.setEntry(entry.getProdEvaluationEntryId());
				version.setBeforeUpdate(null);
				try {
					version.setAfterUpdate(mapper.writeValueAsString(entry));
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				versionList.add(version);
			}
			if(input.getEntryList().size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getCourse());
				versionInput.setContainerCategory(input.getEntryList().get(0).getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
			TransactionAspectSupport.currentTransactionStatus().flush();
		}

	}

	/**
	 * 第三方收费新增
	 * @throws JsonProcessingException 
	 */
	@Override
	@Transactional
	public void thirdPartPay(ThirdPartPayInput input){
		if(StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			UnitCourseWithBLOBs unitCourse=unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			Yard yard = yardList.get(0);

			//更新第三方收费状态
			unitCourse.setThirdpartyChargeState(CommonEnum.YES.getCode());
			//第三方收费总金额（人民币）
			BigDecimal totalPay=input.getEntries().stream().map(a->a.getThirdpartyMoney()).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
			//批复费用
			//人民币
			unitCourse.setUseReplyMoneyRmb(unitCourse.getValuationMoney().add(totalPay.negate()));
			if(StringUtils.isNotEmpty(unitCourse.getValuationCurrency()) && unitCourse.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
				//美元
				BigDecimal dec=rateService.getCNYtoUSD(yard.getCompany(), course.getContainerUser(), input.getContainerCategory(), totalPay);
				unitCourse.setUseReplyMoneyUsd(unitCourse.getValuationMoney().add(dec.negate()));
			}
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);
					
			List<BillSceneMDInput> billList = input.getEntries().stream().map(a -> {
				BillSceneMDInput item = new BillSceneMDInput();
				item.setContainerCategory(input.getContainerCategory());
				item.setRepairCode(a.getRepairCode());
				item.setProdCourseId(input.getProdCourseId());
				item.setContainerUser(course.getContainerUser());
				item.setAmount(a.getThirdpartyMoney()!=null?a.getThirdpartyMoney():null);
				item.setRemarks(a.getRemarks());
				item.setProdContainerId(container.getProdContainerId());
				item.setContainerNo(course.getContainerNo());
				item.setCompanyKey(yard.getCompany());
				item.setYard(course.getYard());
				item.setCourseType(course.getCourseType());
				item.setCourseTime(course.getCourseTime());
				item.setValuationRemarks(unitCourse.getValuationRemarks());

				return item;
			}).collect(Collectors.toList());

			financeClient.createBill(billList);
			
			Date date=new Date();
			Integer userId=getCurrentUserId();
			ObjectMapper mapper=new ObjectMapper();
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			try {
				//更新已删除的条目
				EvaluationEntryExample example=new EvaluationEntryExample();
				List<String> newEntryIdList=input.getTableData().stream()
						.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
						.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
				EvaluationEntryExample.Criteria cri=example.createCriteria();
				cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
				if(newEntryIdList.size()>0) {
					cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
				}
				List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
				if(entries.size()>0) {
					for(EvaluationEntry entry:entries) {
						entry.setIsDel(PlatformConstants.ISDEL_YES);
						entry.setUpdateTime(date);
						entry.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKey(entry);
						
					}
					
				}
				
				// 更新所有条目明细
				for(AddEvaluationEntryInput entry:input.getTableData()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(mapper.writeValueAsString(record));
						
						BeanUtils.copyProperties(entry, record);
						
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
				// 更新第三方收费明细
				for(AddEvaluationEntryInput entry:input.getEntries()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						AddVersionDetailInput version=versionList.stream().filter(a->a.getEntry().equals(entry.getProdEvaluationEntryId())).findFirst().get();
						EvaluationEntry record=null;
						try {
							record = mapper.readValue(version.getAfterUpdate(), EvaluationEntry.class);
							record.setIsCharge(CommonEnum.YES.getCode());
							evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
							version.setAfterUpdate(mapper.writeValueAsString(record));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
						EvaluationEntry record = new EvaluationEntry();
						// 标为已收费
						BeanUtils.copyProperties(entry, record);
						record.setProdEvaluationEntryId(ruleService.generateCourseEntryKey(course.getContainerNo()));
						record.setCreateTime(date);
						record.setCreateUser(userId);
						record.setIsCharge(CommonEnum.YES.getCode());
						record.setIsDel(PlatformConstants.ISDEL_NO);
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.insert(record);
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(null);
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
			
			} catch (JsonProcessingException e) {
				throw new InvalidException("error write object to json");
			}
			if(versionList.size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getProdCourseId());
				versionInput.setContainerCategory(input.getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
		}
		else {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			
			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			Yard yard = yardList.get(0);

			//更新第三方收费状态
			course.setThirdpartyChargeState(CommonEnum.YES.getCode());
			//第三方收费总金额（人民币）
			BigDecimal totalPay=input.getEntries().stream().map(a->a.getThirdpartyMoney()).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
			//批复费用
			//人民币
			course.setUseReplyMoneyRmb(course.getValuationMoney().add(totalPay.negate()));
			if(StringUtils.isNotEmpty(course.getValuationCurrency()) && course.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
				//美元
				BigDecimal dec=rateService.getCNYtoUSD(yard.getCompany(), course.getContainerUser(), course.getContainerCategory(), totalPay);
				course.setUseReplyMoneyUsd(course.getValuationMoney().add(dec.negate()));
			}
			courseDao.updateByPrimaryKeyWithBLOBs(course);
					
			List<BillSceneMDInput> billList = input.getEntries().stream().map(a -> {
				BillSceneMDInput item = new BillSceneMDInput();
				item.setContainerCategory(input.getContainerCategory());
				item.setRepairCode(a.getRepairCode());
				item.setProdCourseId(input.getProdCourseId());
				item.setContainerUser(course.getContainerUser());
				item.setAmount(a.getThirdpartyMoney()!=null?a.getThirdpartyMoney():null);
				item.setRemarks(a.getRemarks());
				item.setProdContainerId(container.getProdContainerId());
				item.setContainerNo(course.getContainerNo());
				item.setCompanyKey(yard.getCompany());
				item.setYard(course.getYard());
				item.setCourseType(course.getCourseType());
				item.setCourseTime(course.getCourseTime());
				item.setValuationRemarks(course.getValuationRemarks());

				return item;
			}).collect(Collectors.toList());

			financeClient.createBill(billList);
			
			Date date=new Date();
			Integer userId=getCurrentUserId();
			ObjectMapper mapper=new ObjectMapper();
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			try {
				//更新已删除的条目
				EvaluationEntryExample example=new EvaluationEntryExample();
				List<String> newEntryIdList=input.getTableData().stream()
						.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
						.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
				EvaluationEntryExample.Criteria cri=example.createCriteria();
				cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
				if(newEntryIdList.size()>0) {
					cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
				}
				List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
				if(entries.size()>0) {
					for(EvaluationEntry entry:entries) {
						entry.setIsDel(PlatformConstants.ISDEL_YES);
						entry.setUpdateTime(date);
						entry.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKey(entry);
						
					}
					
				}
				
				// 更新所有条目明细
				for(AddEvaluationEntryInput entry:input.getTableData()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(mapper.writeValueAsString(record));
						
						BeanUtils.copyProperties(entry, record);
						
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
				// 更新第三方收费明细
				for(AddEvaluationEntryInput entry:input.getEntries()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						AddVersionDetailInput version=versionList.stream().filter(a->a.getEntry().equals(entry.getProdEvaluationEntryId())).findFirst().get();
						EvaluationEntry record=null;
						try {
							record = mapper.readValue(version.getAfterUpdate(), EvaluationEntry.class);
							record.setIsCharge(CommonEnum.YES.getCode());
							evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
							version.setAfterUpdate(mapper.writeValueAsString(record));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
						EvaluationEntry record = new EvaluationEntry();
						// 标为已收费
						BeanUtils.copyProperties(entry, record);
						record.setProdEvaluationEntryId(ruleService.generateCourseEntryKey(course.getContainerNo()));
						record.setCreateTime(date);
						record.setCreateUser(userId);
						record.setIsCharge(CommonEnum.YES.getCode());
						record.setIsDel(PlatformConstants.ISDEL_NO);
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.insert(record);
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(null);
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
			
			} catch (JsonProcessingException e) {
				throw new InvalidException("error write object to json");
			}
			if(versionList.size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getProdCourseId());
				versionInput.setContainerCategory(input.getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
		}
		

	}
	
	/**
	 * 新增估价条目版本信息
	 * @param input
	 */
	@Transactional
	public void addVersion(AddVersionInput input){
		Date date=new Date();
		Integer userId=getCurrentUserId();
		//先获取上个版本号
		EvaluationVersionsExample example=new EvaluationVersionsExample();
		example.createCriteria()
		.andProdCourseIdEqualTo(input.getProdCourseId())
		.andContainerCategoryEqualTo(input.getContainerCategory());
		example.setOrderByClause("create_time desc,version_no desc");
		List<EvaluationVersions> versionList=versionDao.selectByExample(example);
		Integer versionNo=1;
		if(versionList.size()>0) {
			versionNo=versionList.get(0).getVersionNo()+1;
		}
		for(AddVersionDetailInput entry:input.getEntries()) {
			EvaluationVersions record=new EvaluationVersions();
			record.setEntry(entry.getEntry());
			record.setBeforeUpdate(entry.getBeforeUpdate());
			record.setAfterUpdate(entry.getAfterUpdate());
			record.setProdCourseId(input.getProdCourseId());
			record.setContainerCategory(input.getContainerCategory());
			record.setVersionNo(versionNo);
			record.setCreateTime(date);
			record.setCreateUser(userId);
			record.setUpdateTime(date);
			record.setUpdateUser(userId);
			versionDao.insert(record);
		}
		
	}

	/**
	 * 估价版本查询列表
	 */
	@Override
	public PagedList<EstimateCourseEntryOutput> getVersionPagedList(SearchVersionInput input) {
		PagedList<EstimateCourseEntryOutput> pagedList=new PagedList<EstimateCourseEntryOutput>(input.getPageIndex(),input.getPageSize());
		EvaluationVersionsExample example=new EvaluationVersionsExample();
		EvaluationVersionsExample.Criteria criteria=example.createCriteria();
		if(StringUtils.isNotEmpty(input.getVersionNo())) {
			if(input.getVersionNo().matches("\\d+")) {
				criteria.andVersionNoEqualTo(Integer.parseInt(input.getVersionNo()));
			}
			else {
				return pagedList;
			}
		}
		criteria.andProdCourseIdEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
		example.setOrderByClause("version_no desc");
		int totalItemCount=(int)versionDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<EvaluationVersions> list=versionDao.selectByExample(example);
		ObjectMapper mapper=new ObjectMapper();
		List<EstimateCourseEntryOutput> dataList=list.stream().map(a->{
			EstimateCourseEntryOutput item=new EstimateCourseEntryOutput();
			EvaluationEntry record=null;
			try {
				record=mapper.readValue(a.getAfterUpdate(), EvaluationEntry.class);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(record!=null) {
				item.setCourseEntryId(record.getProdEvaluationEntryId());
				item.setPositionCode(record.getPositionCode());
				item.setRepairCode(record.getRepairCode());
				item.setDamageCode(record.getDamageCode());
				item.setMaterialCode(record.getMaterialCode());
				item.setPartsDetailsCode(record.getPartsDetailsCode());
				item.setPartsRepairCode(record.getPartsRepairCode());
				item.setPartTypeCode(record.getPartsTypeCode());
				item.setPartsTypeCode(record.getPartsTypeCode());
				item.setSparesNum(record.getSparesNumber());
				item.setSparesNum(record.getSparesNumber());
				item.setLength(StringUtil.doubleToIntString(record.getLength()));
				item.setWidth(StringUtil.doubleToIntString(record.getWidth()));
				item.setQuantity(StringUtil.doubleToEffectString(record.getQuantity()));
				item.setSumMoney(StringUtil.bigDecimalToEffectString(record.getSumMoney()));
				item.setPayingParty(record.getPayingParty());
				item.setRemarks(record.getRemarks());
				item.setDevice(record.getDevice());
				item.setManHourCost(StringUtil.bigDecimalToEffectString(record.getManHourCost()));
				item.setMaterialCost(StringUtil.bigDecimalToEffectString(record.getMaterialCost()));
				item.setPhoto(record.getPhoto());
				item.setManHour(StringUtil.doubleToEffectString(record.getManHour()));
				item.setRateId(record.getRateId());
				item.setFiveCode(record.getFiveCode());
				if(StringUtils.isNotEmpty(record.getIsCharge()) && record.getIsCharge().equals(CommonEnum.YES.getCode())){
					item.setIsChargeLang(CommonEnum.YES.getCode());
					item.setIsChargeKey(CommonEnum.YES.getCode());
				}
				else {
					item.setIsChargeLang(CommonEnum.NO.getCode());
					item.setIsChargeKey(CommonEnum.NO.getCode());
				}
				if(StringUtils.isNotEmpty(record.getIsRepair()) && record.getIsRepair().equals(CommonEnum.NO.getCode())){
					item.setIsRepair(CommonEnum.NO.getCode());
					item.setIsRepairNameLang(CommonEnum.NO.getCode());
				}
				else {
					item.setIsRepair(CommonEnum.YES.getCode());
					item.setIsRepairNameLang(CommonEnum.YES.getCode());
				}
				item.setVersionNo(String.valueOf(a.getVersionNo()));
				item.setWarehouseType(record.getWarehouseType());
				item.setWarehouseTypeNameLang(record.getWarehouseType());
			}
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 第三方减免
	 */
	@Override
	@Transactional
	public void thirdPartRefund(ThirdPartPayInput input) {
		if(StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			UnitCourseWithBLOBs unitCourse=unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			Yard yard = yardList.get(0);
			
			//更新第三方收费状态
			unitCourse.setThirdpartyChargeState(CommonEnum.NO.getCode());
			//第三方收费总金额（人民币）
			BigDecimal totalPay=input.getEntries().stream().map(a->a.getThirdpartyMoney()).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
			//批复费用
			//人民币
			unitCourse.setUseReplyMoneyRmb(unitCourse.getUseReplyMoneyRmb().add(totalPay.negate()));
			if(StringUtils.isNotEmpty(unitCourse.getValuationCurrency()) && unitCourse.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
				//美元
				BigDecimal dec=rateService.getCNYtoUSD(yard.getCompany(), course.getContainerUser(), input.getContainerCategory(), totalPay);
				unitCourse.setUseReplyMoneyUsd(unitCourse.getUseReplyMoneyUsd().add(dec));
			}
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);
					
			//财务请求减免
			List<BillSceneMDInput> financeList=new ArrayList<BillSceneMDInput>();
			if(input.getEntries()!=null && input.getEntries().size()>0) {
				
				for(AddEvaluationEntryInput entry:input.getEntries()) {
					BillSceneMDInput item=new BillSceneMDInput();
					item.setContainerCategory(entry.getContainerCategory());
					item.setRepairCode(entry.getRepairCode());
					item.setContainerUser(course.getContainerUser());
					item.setAmount(entry.getThirdpartyMoney()!=null?entry.getThirdpartyMoney():null);
					item.setProdCourseId(input.getProdCourseId());
					item.setProdContainerId(container.getProdContainerId());
					item.setContainerNo(course.getContainerNo());
					item.setCompanyKey(yard.getCompany());
					item.setYard(yard.getKey());
					item.setCourseType(course.getCourseType());
					item.setValuationRemarks(unitCourse.getValuationRemarks());
					item.setRemarks(entry.getRemarks());
					financeList.add(item);
				}
			}
		    
			Date date=new Date();
			Integer userId=getCurrentUserId();
			ObjectMapper mapper=new ObjectMapper();
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			try {
				//更新已删除的条目
				EvaluationEntryExample example=new EvaluationEntryExample();
				List<String> newEntryIdList=input.getTableData().stream()
						.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
						.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
				EvaluationEntryExample.Criteria cri=example.createCriteria();
				cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
				if(newEntryIdList.size()>0) {
					cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
				}
				List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
				if(entries.size()>0) {
					for(EvaluationEntry entry:entries) {
						entry.setIsDel(PlatformConstants.ISDEL_YES);
						entry.setUpdateTime(date);
						entry.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKey(entry);
						
					}
					
				}
				
				// 更新所有条目明细
				for(AddEvaluationEntryInput entry:input.getTableData()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(mapper.writeValueAsString(record));
						
						BeanUtils.copyProperties(entry, record);
						
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
				// 更新第三方减免明细
				for(AddEvaluationEntryInput entry:input.getEntries()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						AddVersionDetailInput version=versionList.stream().filter(a->a.getEntry().equals(entry.getProdEvaluationEntryId())).findFirst().get();
						EvaluationEntry record=null;
						try {
							record = mapper.readValue(version.getAfterUpdate(), EvaluationEntry.class);
							record.setIsCharge(CommonEnum.NO.getCode());
							record.setPayingParty("O");
							record.setThirdpartyMoney(BigDecimal.ZERO);
							evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
							version.setAfterUpdate(mapper.writeValueAsString(record));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
						
					}
				}
			
			} catch (JsonProcessingException e) {
				throw new InvalidException("error write object to json");
			}
			if(versionList.size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getProdCourseId());
				versionInput.setContainerCategory(input.getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
			//财务发起请求
			if(financeList.size()>0) {
				Result<String> financeResult=financeClient.reductionBill(financeList);
				if(financeResult!=null) {
					if(StringUtils.isNotEmpty(financeResult.getData())) {
						throw new InvalidException(financeResult.getData());
					}
				}
				else {
					throw new InvalidException();
				}
			}
		}
		else {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());

			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			Yard yard = yardList.get(0);
			
			//更新第三方收费状态
			course.setThirdpartyChargeState(CommonEnum.NO.getCode());
			//第三方收费总金额（人民币）
			BigDecimal totalPay=input.getEntries().stream().map(a->a.getThirdpartyMoney()).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
			//批复费用
			//人民币
			course.setUseReplyMoneyRmb(course.getUseReplyMoneyRmb().add(totalPay.negate()));
			if(StringUtils.isNotEmpty(course.getValuationCurrency()) && course.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
				//美元
				BigDecimal dec=rateService.getCNYtoUSD(yard.getCompany(), course.getContainerUser(), course.getContainerCategory(), totalPay);
				course.setUseReplyMoneyUsd(course.getUseReplyMoneyUsd().add(dec));
			}
			courseDao.updateByPrimaryKeyWithBLOBs(course);
					
			//财务请求减免
			List<BillSceneMDInput> financeList=new ArrayList<BillSceneMDInput>();
			if(input.getEntries()!=null && input.getEntries().size()>0) {
				
				for(AddEvaluationEntryInput entry:input.getEntries()) {
					BillSceneMDInput item=new BillSceneMDInput();
					item.setContainerCategory(entry.getContainerCategory());
					item.setRepairCode(entry.getRepairCode());
					item.setContainerUser(course.getContainerUser());
					item.setAmount(entry.getThirdpartyMoney()!=null?entry.getThirdpartyMoney():null);
					item.setProdCourseId(input.getProdCourseId());
					item.setProdContainerId(container.getProdContainerId());
					item.setContainerNo(course.getContainerNo());
					item.setCompanyKey(yard.getCompany());
					item.setYard(yard.getKey());
					item.setCourseType(course.getCourseType());
					item.setValuationRemarks(course.getValuationRemarks());
					item.setRemarks(entry.getRemarks());
					financeList.add(item);
				}
			}
		    
			Date date=new Date();
			Integer userId=getCurrentUserId();
			ObjectMapper mapper=new ObjectMapper();
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			try {
				//更新已删除的条目
				EvaluationEntryExample example=new EvaluationEntryExample();
				List<String> newEntryIdList=input.getTableData().stream()
						.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
						.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
				EvaluationEntryExample.Criteria cri=example.createCriteria();
				cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
				if(newEntryIdList.size()>0) {
					cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
				}
				List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
				if(entries.size()>0) {
					for(EvaluationEntry entry:entries) {
						entry.setIsDel(PlatformConstants.ISDEL_YES);
						entry.setUpdateTime(date);
						entry.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKey(entry);
						
					}
					
				}
				
				// 更新所有条目明细
				for(AddEvaluationEntryInput entry:input.getTableData()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(mapper.writeValueAsString(record));
						
						BeanUtils.copyProperties(entry, record);
						
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
				// 更新第三方减免明细
				for(AddEvaluationEntryInput entry:input.getEntries()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						AddVersionDetailInput version=versionList.stream().filter(a->a.getEntry().equals(entry.getProdEvaluationEntryId())).findFirst().get();
						EvaluationEntry record=null;
						try {
							record = mapper.readValue(version.getAfterUpdate(), EvaluationEntry.class);
							record.setIsCharge(CommonEnum.NO.getCode());
							record.setPayingParty("O");
							record.setThirdpartyMoney(BigDecimal.ZERO);
							evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
							version.setAfterUpdate(mapper.writeValueAsString(record));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
						
					}
				}
			
			} catch (JsonProcessingException e) {
				throw new InvalidException("error write object to json");
			}
			if(versionList.size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getProdCourseId());
				versionInput.setContainerCategory(input.getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
			//财务发起请求
			if(financeList.size()>0) {
				Result<String> financeResult=financeClient.reductionBill(financeList);
				if(financeResult!=null) {
					if(StringUtils.isNotEmpty(financeResult.getData())) {
						throw new InvalidException(financeResult.getData());
					}
				}
				else {
					throw new InvalidException();
				}
			}
		}
		
		
	}
	
	/**
	 * 保存估价明细
	 */
	@Override
	@Transactional
	public void saveEstimateEntry(ThirdPartPayInput input) {
		
		Date date=new Date();
		Integer userId=getCurrentUserId();
		ObjectMapper mapper=new ObjectMapper();
		List<AddVersionDetailInput> versionList=new ArrayList<>();
		try {
			//更新已删除的条目
			EvaluationEntryExample example=new EvaluationEntryExample();
			List<String> newEntryIdList=input.getTableData().stream()
					.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
					.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
			EvaluationEntryExample.Criteria cri=example.createCriteria();
			cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
			if(newEntryIdList.size()>0) {
				cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
			}
			List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
			if(entries.size()>0) {
				for(EvaluationEntry entry:entries) {
					entry.setIsDel(PlatformConstants.ISDEL_YES);
					entry.setUpdateTime(date);
					entry.setUpdateUser(userId);
					evaluationEntryDao.updateByPrimaryKey(entry);
					
				}
				
			}
			
			// 更新所有条目明细
			for(AddEvaluationEntryInput entry:input.getTableData()) {
				if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
					EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
					
					AddVersionDetailInput version=new AddVersionDetailInput();
					version.setEntry(record.getProdEvaluationEntryId());
					version.setBeforeUpdate(mapper.writeValueAsString(record));
					
					BeanUtils.copyProperties(entry, record);
					
					record.setUpdateTime(date);
					record.setUpdateUser(userId);
					evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
					
					version.setAfterUpdate(mapper.writeValueAsString(record));
					versionList.add(version);
				}
				else {
					EvaluationEntry record = new EvaluationEntry();
					// 标为已收费
					BeanUtils.copyProperties(entry, record);
					record.setProdEvaluationEntryId(ruleService.generateCourseEntryKey(courseDao.selectByPrimaryKey(input.getProdCourseId()).getContainerNo()));
					record.setCreateTime(date);
					record.setCreateUser(userId);
					record.setIsCharge(CommonEnum.NO.getCode());
					record.setIsDel(PlatformConstants.ISDEL_NO);
					evaluationEntryDao.insert(record);
					
					AddVersionDetailInput version=new AddVersionDetailInput();
					version.setEntry(record.getProdEvaluationEntryId());
					version.setBeforeUpdate(null);
					version.setAfterUpdate(mapper.writeValueAsString(record));
					versionList.add(version);
				}
			}
		
		} catch (JsonProcessingException e) {
			throw new InvalidException("error write object to json");
		}
		if(versionList.size()>0 && input.getCreateVersionHistory()!=null && input.getCreateVersionHistory().equals(true)) {
			AddVersionInput versionInput=new AddVersionInput();
			versionInput.setProdCourseId(input.getProdCourseId());
			versionInput.setContainerCategory(input.getContainerCategory());
			versionInput.setEntries(versionList);
			addVersion(versionInput);
		}
		
		
	}

	/**
	 * 单条不修
	 */
	@Override
	public void remarkNotRepair(ThirdPartPayInput input) {
		Course course = courseDao.selectByPrimaryKey(input.getProdCourseId());

		ContainerExample containerExample = new ContainerExample();
		containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
		Container container = containerDao.selectByExample(containerExample).get(0);
		
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
		List<Yard> yardList = yardDao.selectByExample(yardExample);
		Yard yard = yardList.get(0);

		
		Date date=new Date();
		Integer userId=getCurrentUserId();
		ObjectMapper mapper=new ObjectMapper();
		List<AddVersionDetailInput> versionList=new ArrayList<>();
		try {
			//更新已删除的条目
			EvaluationEntryExample example=new EvaluationEntryExample();
			List<String> newEntryIdList=input.getTableData().stream()
					.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
					.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
			EvaluationEntryExample.Criteria cri=example.createCriteria();
			cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
			if(newEntryIdList.size()>0) {
				cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
			}
			List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
			if(entries.size()>0) {
				for(EvaluationEntry entry:entries) {
					entry.setIsDel(PlatformConstants.ISDEL_YES);
					entry.setUpdateTime(date);
					entry.setUpdateUser(userId);
					evaluationEntryDao.updateByPrimaryKey(entry);
				}
				
			}
			
			// 更新所有条目明细
			for(AddEvaluationEntryInput entry:input.getTableData()) {
				if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
					EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
					
					AddVersionDetailInput version=new AddVersionDetailInput();
					version.setEntry(record.getProdEvaluationEntryId());
					version.setBeforeUpdate(mapper.writeValueAsString(record));
					
					BeanUtils.copyProperties(entry, record);
					
					record.setUpdateTime(date);
					record.setUpdateUser(userId);
					evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
					
					version.setAfterUpdate(mapper.writeValueAsString(record));
					versionList.add(version);
				}
			}
			// 更新单条不修明细
			List<String> referralInput=new ArrayList<>();
			for(AddEvaluationEntryInput entry:input.getEntries()) {
				if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
					AddVersionDetailInput version=versionList.stream().filter(a->a.getEntry().equals(entry.getProdEvaluationEntryId())).findFirst().get();
					EvaluationEntry record=null;
					try {
						record = mapper.readValue(version.getAfterUpdate(), EvaluationEntry.class);
						record.setIsRepair(CommonEnum.NO.getCode());
						
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						version.setAfterUpdate(mapper.writeValueAsString(record));
						referralInput.add(entry.getProdEvaluationEntryId());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					
				}
			}
			//更新派工单明细
			if(referralInput.size()>0) {
				referralService.updateIsRepair(referralInput.toArray(new String[referralInput.size()]));
			}
		
		} catch (JsonProcessingException e) {
			throw new InvalidException("error write object to json");
		}
		if(versionList.size()>0) {
			AddVersionInput versionInput=new AddVersionInput();
			versionInput.setProdCourseId(input.getProdCourseId());
			versionInput.setContainerCategory(input.getContainerCategory());
			versionInput.setEntries(versionList);
			addVersion(versionInput);
		}
	}
	
	/**
	 * 根据场站key和用箱人key获取第三方收费方式
	 * @param yardKey
	 * @param containerUser
	 * @return
	 */
	@Override
	public ThirdPayTypeOutput getThirdPayType(String yardKey, String containerUser) {
		ThirdPayTypeOutput result=new ThirdPayTypeOutput();
		//获取第三方收费方式配置
		YardExample yardExample=new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(yardKey);
		List<Yard> yardList=yardDao.selectByExample(yardExample);
		if(yardList.size()>0) {
			Yard yard=yardList.get(0);
			ThirdpartyChargeExample thirdExample=new ThirdpartyChargeExample();
			thirdExample.createCriteria()
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
			.andCompanyEqualTo(yard.getCompany()).andContainerUserEqualTo(containerUser);
			List<ThirdpartyCharge> thirdList=thirdPayDao.selectByExample(thirdExample);
			if(thirdList.size()>0) {
				result.setThirdPayType(thirdList.get(0).getThirdpartyChargeType());
			}
			
		}
		return result;
	}
	
	/**
	 * 单箱批复
	 */
	@Override
	@Transactional
	public void singleReply(ThirdPartPayInput input) {
		Date date=new Date();
		Integer userId=getCurrentUserId();
		ObjectMapper mapper=new ObjectMapper();
		
		if(input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			//机组进场信息
			UnitCourseWithBLOBs unitcourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			unitcourse.setUseReplyMoneyRmb(input.getTotalReplyMoney());
			unitcourse.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
			unitcourse.setUseReplyTime(date);
			unitcourse.setUpdateTime(date);
			unitcourse.setUpdateUser(userId);
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitcourse);
			
			Course course = courseDao.selectByPrimaryKey(input.getProdCourseId());

			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			Yard yard = yardList.get(0);
			
			//获取第三方收费方式
			Boolean thirdPay=false;
			ThirdPayTypeOutput thirdPayTypeOutput=getThirdPayType(course.getYard(),course.getContainerUser());
			if(StringUtils.isNotEmpty(thirdPayTypeOutput.getThirdPayType()) && thirdPayTypeOutput.getThirdPayType().equals(ThirdPayTypeEnum.SPOT.getCode())) {
				thirdPay=true;
			}

			List<PoolRepairInput> billList = input.getEntries().stream().map(a -> {
				PoolRepairInput item = new PoolRepairInput();
				item.setProdCourseId(input.getProdCourseId());
				item.setProdContainerId(container.getProdContainerId());
				item.setContainerNo(course.getContainerNo());
				item.setContainerCategory(input.getContainerCategory());
				item.setYard(course.getYard());
				item.setReplyTime(date);
				item.setIsBackLease(CommonEnum.NO.getCode());
				item.setContainerUser(course.getContainerUser());
				item.setRemarks(a.getRemarks());
				item.setPayer(a.getPayingParty());

				List<AddEvaluationEntryInput> valuationSum = input.getTableData().stream()
						.filter(b -> StringUtils.isNotEmpty(b.getProdEvaluationEntryId())
								&& b.getPayingParty().equals(a.getPayingParty()))
						.collect(Collectors.toList());
				BigDecimal manHourNum=valuationSum.stream().map(c -> new BigDecimal(c.getManHour())).reduce((e, f) -> ComputeUtil.add(e, f)).get();
				BigDecimal manHourCost = valuationSum.stream().map(c -> c.getManHourCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
				BigDecimal materialCost = valuationSum.stream().map(c -> c.getMaterialCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
				
				item.setValuationManHourCost(ComputeUtil.round(manHourCost, 2));
				item.setValuationMaterialCost(ComputeUtil.round(materialCost, 2));
				item.setValuationHourNumber(manHourNum);
				item.setReplyFreeUser(getCurrentUserId());
				item.setReplyFreeTime(new Date());
				// 币种转换为 CNY USD字母表示
				if (StringUtils.isNotEmpty(course.getValuationCurrency())
						&& course.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
					item.setEstCurrencyType("CNY");
					item.setValuationMoneyRmb(a.getSumMoney());// 总费用 美金
					item.setReplyTaxTotalCostRmb(a.getSumMoney());

				} else {
					item.setEstCurrencyType("USD");
					item.setValuationMoneyUsd(a.getSumMoney());// 总费用 美金
					item.setReplyTaxTotalCostUsa(a.getSumMoney());

				}
				return item;
			}).collect(Collectors.toList());

			financeClient.oneReply(billList);
			
			
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			try {
				//更新已删除的条目
				EvaluationEntryExample example=new EvaluationEntryExample();
				List<String> newEntryIdList=input.getTableData().stream()
						.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
						.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
				EvaluationEntryExample.Criteria cri=example.createCriteria();
				cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
				if(newEntryIdList.size()>0) {
					cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
				}
				List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
				if(entries.size()>0) {
					for(EvaluationEntry entry:entries) {
						entry.setIsDel(PlatformConstants.ISDEL_YES);
						entry.setUpdateTime(date);
						entry.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKey(entry);
						
					}
					
				}
				
				// 更新所有条目明细
				for(AddEvaluationEntryInput entry:input.getTableData()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(mapper.writeValueAsString(record));
						
						BeanUtils.copyProperties(entry, record);
						//收费方式为现结，第三方是否收费改为是，其他的收费方式不用管此字段
						if(thirdPay && StringUtils.isNotEmpty(record.getPayingParty()) && record.getPayingParty().equals("T")) {
							record.setIsCharge(CommonEnum.YES.getCode());
						}
						
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
					else {
						EvaluationEntry record = new EvaluationEntry();
						// 标为已收费
						BeanUtils.copyProperties(entry, record);
						record.setProdEvaluationEntryId(ruleService.generateCourseEntryKey(course.getContainerNo()));
						record.setCreateTime(date);
						record.setCreateUser(userId);
						//收费方式为现结，第三方是否收费改为是，其他的收费方式不用管此字段
						if(thirdPay && StringUtils.isNotEmpty(record.getPayingParty()) && record.getPayingParty().equals("T")) {
							record.setIsCharge(CommonEnum.YES.getCode());
						}
						
						record.setIsDel(PlatformConstants.ISDEL_NO);
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.insert(record);
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(null);
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
			
			} catch (JsonProcessingException e) {
				throw new InvalidException("error write object to json");
			}
			if(versionList.size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getProdCourseId());
				versionInput.setContainerCategory(input.getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
			//批复后判断是否符合xx箱转OK的条件
			xxService.createPtiInfo(course, unitcourse);
		}
		else {
			//箱体进场信息
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			course.setUseReplyMoneyRmb(input.getTotalReplyMoney());
			course.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
			course.setUseReplyTime(date);
			course.setUpdateTime(date);
			course.setUpdateUser(userId);
			courseDao.updateByPrimaryKeyWithBLOBs(course);
			
			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			YardExample yardExample = new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
			List<Yard> yardList = yardDao.selectByExample(yardExample);
			Yard yard = yardList.get(0);
			

			//获取第三方收费方式
			Boolean thirdPay=false;
			ThirdPayTypeOutput thirdPayTypeOutput=getThirdPayType(course.getYard(),course.getContainerUser());
			if(StringUtils.isNotEmpty(thirdPayTypeOutput.getThirdPayType()) && thirdPayTypeOutput.getThirdPayType().equals(ThirdPayTypeEnum.SPOT.getCode())) {
				thirdPay=true;
			}
			
			List<PoolRepairInput> billList = input.getEntries().stream().map(a -> {
				PoolRepairInput item = new PoolRepairInput();
				item.setProdCourseId(input.getProdCourseId());
				item.setProdContainerId(container.getProdContainerId());
				item.setContainerNo(course.getContainerNo());
				item.setContainerCategory(input.getContainerCategory());
				item.setYard(course.getYard());
				item.setReplyTime(date);
				item.setIsBackLease(CommonEnum.NO.getCode());
				item.setContainerUser(course.getContainerUser());
				item.setRemarks(a.getRemarks());
				item.setPayer(a.getPayingParty());
				
				List<AddEvaluationEntryInput> valuationSum = input.getTableData().stream()
						.filter(b -> StringUtils.isNotEmpty(b.getProdEvaluationEntryId())
								&& b.getPayingParty().equals(a.getPayingParty()))
						.collect(Collectors.toList());
				BigDecimal manHourNum=valuationSum.stream().map(c -> new BigDecimal(c.getManHour())).reduce((e, f) -> ComputeUtil.add(e, f)).get();
				BigDecimal manHourCost = valuationSum.stream().map(c -> c.getManHourCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
				BigDecimal materialCost = valuationSum.stream().map(c -> c.getMaterialCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
				
				item.setValuationManHourCost(ComputeUtil.round(manHourCost, 2));
				item.setValuationMaterialCost(ComputeUtil.round(materialCost, 2));
				item.setValuationHourNumber(manHourNum);
				item.setReplyFreeUser(getCurrentUserId());
				item.setReplyFreeTime(new Date());
				// 币种转换为 CNY USD字母表示
				if (StringUtils.isNotEmpty(course.getValuationCurrency())
						&& course.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
					item.setEstCurrencyType("CNY");
					item.setValuationMoneyRmb(a.getSumMoney());// 总费用 美金
					item.setReplyTaxTotalCostRmb(a.getSumMoney());

				} else {
					item.setEstCurrencyType("USD");
					item.setValuationMoneyUsd(a.getSumMoney());// 总费用 美金
					item.setReplyTaxTotalCostUsa(a.getSumMoney());

				}
				return item;
			}).collect(Collectors.toList());

			financeClient.oneReply(billList);
			
			
			List<AddVersionDetailInput> versionList=new ArrayList<>();
			try {
				//更新已删除的条目
				EvaluationEntryExample example=new EvaluationEntryExample();
				List<String> newEntryIdList=input.getTableData().stream()
						.filter(a->StringUtils.isNotEmpty(a.getProdEvaluationEntryId()))
						.map(a->a.getProdEvaluationEntryId()).collect(Collectors.toList());
				EvaluationEntryExample.Criteria cri=example.createCriteria();
				cri.andCourseEqualTo(input.getProdCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
				if(newEntryIdList.size()>0) {
					cri.andProdEvaluationEntryIdNotIn(newEntryIdList);
				}
				List<EvaluationEntry> entries=evaluationEntryDao.selectByExample(example);
				if(entries.size()>0) {
					for(EvaluationEntry entry:entries) {
						entry.setIsDel(PlatformConstants.ISDEL_YES);
						entry.setUpdateTime(date);
						entry.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKey(entry);
						
					}
					
				}
				
				// 更新所有条目明细
				for(AddEvaluationEntryInput entry:input.getTableData()) {
					if(StringUtils.isNotEmpty(entry.getProdEvaluationEntryId())) {
						EvaluationEntry record = evaluationEntryDao.selectByPrimaryKey(entry.getProdEvaluationEntryId());
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(mapper.writeValueAsString(record));
						
						BeanUtils.copyProperties(entry, record);
						
						//收费方式为现结，第三方是否收费改为是，其他的收费方式不用管此字段
						if(thirdPay && StringUtils.isNotEmpty(record.getPayingParty()) && record.getPayingParty().equals("T")) {
							record.setIsCharge(CommonEnum.YES.getCode());
						}
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.updateByPrimaryKeyWithBLOBs(record);
						
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
					else {
						EvaluationEntry record = new EvaluationEntry();
						// 标为已收费
						BeanUtils.copyProperties(entry, record);
						record.setProdEvaluationEntryId(ruleService.generateCourseEntryKey(course.getContainerNo()));
						record.setCreateTime(date);
						record.setCreateUser(userId);
						//收费方式为现结，第三方是否收费改为是，其他的收费方式不用管此字段
						if(thirdPay && StringUtils.isNotEmpty(record.getPayingParty()) && record.getPayingParty().equals("T")) {
							record.setIsCharge(CommonEnum.YES.getCode());
						}
						record.setIsDel(PlatformConstants.ISDEL_NO);
						record.setUpdateTime(date);
						record.setUpdateUser(userId);
						evaluationEntryDao.insert(record);
						
						AddVersionDetailInput version=new AddVersionDetailInput();
						version.setEntry(record.getProdEvaluationEntryId());
						version.setBeforeUpdate(null);
						version.setAfterUpdate(mapper.writeValueAsString(record));
						versionList.add(version);
					}
				}
			
			} catch (JsonProcessingException e) {
				throw new InvalidException("error write object to json");
			}
			if(versionList.size()>0) {
				AddVersionInput versionInput=new AddVersionInput();
				versionInput.setProdCourseId(input.getProdCourseId());
				versionInput.setContainerCategory(input.getContainerCategory());
				versionInput.setEntries(versionList);
				addVersion(versionInput);
			}
			if(input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
				//批复后判断是否符合xx箱转OK的条件
				xxService.createPtiInfo(course, null);
			}
			
		}
		//批复派工
		ReferralOperateInput refInput=new ReferralOperateInput();
		refInput.setCourseId(input.getProdCourseId());
		refInput.setContainerCategory(input.getContainerCategory());
		refInput.setReferralType(ReferralTypeEnum.REPLY.getCode());
		referralService.referralOperate(refInput);
		
	}
	
	/**
	 * 根据进场和箱类别修改 估价表状态及费用
	 * @param courseId
	 * @param containerCategory
	 */
	@Override
	public void updateEstimateCourse(String courseId, String containerCategory) {
		if(StringUtils.isNotEmpty(containerCategory)) {
			if(containerCategory.equals(ContainerCategoryEnum.CONTAINER_04.getCode())) {
				//保修
				MaintenanceWithBLOBs record=maintenanceDao.selectByPrimaryKey(courseId);
				if(record!=null) {
					
					YardExample yardExample=new YardExample();
					yardExample.createCriteria().andKeyEqualTo(record.getYard());
					Yard yard=yardDao.selectByExample(yardExample).get(0);
					//币种
					String currency=rateService.getUserCurrency(yard.getCompany(), record.getContainerUser(), ContainerCategoryEnum.CONTAINER_03.getCode());
					if(StringUtils.isEmpty(currency)) {
						throw new InvalidException("请维护工时费率");
					}
					record.setValuationCurrency(currency);
					
					//第三方收费状态
					EvaluationEntryExample entryExample=new EvaluationEntryExample();
					entryExample.createCriteria()
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andContainerCategoryEqualTo(containerCategory)
					.andCourseEqualTo(courseId);
					List<EvaluationEntry> entryList=evaluationEntryDao.selectByExample(entryExample);
				    //报价工时费
					record.setValuationWorkingHoursCost(entryList.stream().map(a->a.getManHourCost()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					//报价材料费
					record.setValuationMaterialCost(entryList.stream().map(a->a.getMaterialCost()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					
					//报价总费用
					if(StringUtils.isNotEmpty(currency)) {
						BigDecimal rmb=entryList.stream().map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
						record.setValuationTotalCost(rmb);
					}
					//用箱人批复费用（人民币)
					
					//用箱人批复费用（美金）
					//设置估价状态
					record.setValuationState(ReplyStateEnum.UNDO.getCode());
					maintenanceDao.updateByPrimaryKeyWithBLOBs(record);
				}
			 
				return;
			}
			
			
			
			Course course=courseDao.selectByPrimaryKey(courseId);

			
			YardExample yardExample=new YardExample();
			yardExample.createCriteria().andKeyEqualTo(course.getYard());
			Yard yard=yardDao.selectByExample(yardExample).get(0);
			
			String currency=rateService.getUserCurrency(yard.getCompany(), course.getContainerUser(), containerCategory);
			if(StringUtils.isEmpty(currency)) {
				throw new InvalidException("请维护工时费率");
			}
			course.setValuationCurrency(currency);
			
			if(containerCategory.equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
				//机组
				UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
				unitCourse.setValuationCurrency(currency);
				//第三方收费状态
				EvaluationEntryExample entryExample=new EvaluationEntryExample();
				entryExample.createCriteria()
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
				.andCourseEqualTo(courseId);
				List<EvaluationEntry> entryList=evaluationEntryDao.selectByExample(entryExample);
				 
					//报价工时费
					unitCourse.setValuationManHourCost(entryList.stream().map(a->a.getManHourCost()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					//报价材料费
					unitCourse.setValuationMaterialCost(entryList.stream().map(a->a.getMaterialCost()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					//报价第三方费用
					unitCourse.setValuationThirdpartyMoney(entryList.stream().map(a->a.getThirdpartyMoney()==null?BigDecimal.ZERO:a.getThirdpartyMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					
					//报价总费用
					if(StringUtils.isNotEmpty(currency)) {
						BigDecimal rmb=entryList.stream().map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
						unitCourse.setValuationMoney(rmb);
					}
					//用箱人批复费用（人民币)
					if(StringUtils.isNotEmpty(currency)) {
						if(currency.equals(RateCurrencyEnum.USD.getCode())) {
							BigDecimal usd=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
							BigDecimal rmb=rateService.getUSDtoCNY(yard.getCompany(), course.getContainerUser(), containerCategory, usd);
							unitCourse.setUseReplyMoneyRmb(rmb);
						}
						else {
							BigDecimal rmb=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
							unitCourse.setUseReplyMoneyRmb(rmb);
						}
					}
					else {
						BigDecimal rmb=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
						unitCourse.setUseReplyMoneyRmb(rmb);
					}
					//用箱人批复费用（美金）
					if(StringUtils.isNotEmpty(currency)) {
						if(currency.equals(RateCurrencyEnum.USD.getCode())) {
							BigDecimal usd=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
							unitCourse.setUseReplyMoneyUsd(usd);
						}
					}
					unitCourseDao.updateByPrimaryKey(unitCourse);
				 
				
			}
			else {
				//箱体和干箱
				
				
				//第三方收费状态
				EvaluationEntryExample entryExample=new EvaluationEntryExample();
				entryExample.createCriteria()
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerCategoryEqualTo(containerCategory)
				.andCourseEqualTo(courseId);
				List<EvaluationEntry> entryList=evaluationEntryDao.selectByExample(entryExample);
				 
					//报价工时费
					course.setValuationManHourCost(entryList.stream().map(a->a.getManHourCost()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					//报价材料费
					course.setValuationMaterialCost(entryList.stream().map(a->a.getMaterialCost()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					//报价第三方费用
					course.setValuationThirdpartyMoney(entryList.stream().map(a->a.getThirdpartyMoney()==null?BigDecimal.ZERO:a.getThirdpartyMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b)));
					//报价总费用
					if(StringUtils.isNotEmpty(currency)) {
						BigDecimal rmb=entryList.stream().map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
						course.setValuationMoney(rmb);
					}
					//用箱人批复费用（人民币)
					if(StringUtils.isNotEmpty(currency)) {
						if(currency.equals(RateCurrencyEnum.USD.getCode())) {
							BigDecimal usd=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
							BigDecimal rmb=rateService.getUSDtoCNY(yard.getCompany(), course.getContainerUser(), containerCategory, usd);
							course.setUseReplyMoneyRmb(rmb);
						}
						else {
							BigDecimal rmb=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
							course.setUseReplyMoneyRmb(rmb);
						}
					}
					else {
						BigDecimal rmb=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
						course.setUseReplyMoneyRmb(rmb);
					}
					//用箱人批复费用（美金）
					if(StringUtils.isNotEmpty(currency)) {
						if(currency.equals(RateCurrencyEnum.USD.getCode())) {
							BigDecimal usd=entryList.stream().filter(a->!(StringUtils.isNotEmpty(a.getIsCharge()) && a.getIsCharge().equals(CommonEnum.YES.getCode()))).map(a->a.getSumMoney()).reduce(BigDecimal.ZERO, (a,b)->a.add(b));
							course.setUseReplyMoneyUsd(usd);
						}
					}
					courseDao.updateByPrimaryKey(course);
			 
			}
		}
	}
	
	/**
	 * 估价驳回到检验
	 */
	@Override
	public void rejectTestingCourse(String courseId, String containerCategory, String message) {
		if(containerCategory.equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
			if(StringUtils.isNotEmpty(unitCourse.getReferralState())) {
				if(unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())) {
					throw new InvalidException("已完工，无法驳回");
				}
				unitCourse.setUseReplyState(null);
				unitCourse.setUseReplyTime(null);
				unitCourse.setThirdpartyChargeState(null);
				unitCourse.setValuationCurrency(null);
				unitCourse.setValuationManHourCost(null);
				unitCourse.setValuationMaterialCost(null);
				unitCourse.setValuationThirdpartyMoney(null);
				unitCourse.setValuationMoney(null);
				unitCourse.setValuationTime(null);
				unitCourse.setUseReplyMoneyRmb(null);
				unitCourse.setUseReplyMoneyUsd(null);
				unitCourse.setTestingState(TestingStateEnum.UNAUDIT.getCode());
				unitCourse.setValuationReject(message);
				unitCourseDao.updateByPrimaryKey(unitCourse);
			}
		}
		else {
			Course course=courseDao.selectByPrimaryKey(courseId);
			if(StringUtils.isNotEmpty(course.getReferralState())) {
				if(course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())) {
					throw new InvalidException("已完工，无法驳回");
				}
				course.setUseReplyState(null);
				course.setUseReplyTime(null);
				course.setThirdpartyChargeState(null);
				course.setValuationCurrency(null);
				course.setValuationManHourCost(null);
				course.setValuationMaterialCost(null);
				course.setValuationThirdpartyMoney(null);
				course.setValuationMoney(null);
				course.setValuationTime(null);
				course.setUseReplyMoneyRmb(null);
				course.setUseReplyMoneyUsd(null);
				course.setTestingState(TestingStateEnum.UNAUDIT.getCode());
				course.setValuationReject(message);
				courseDao.updateByPrimaryKey(course);
			}
			
		}
		EvaluationEntryExample entryExample=new EvaluationEntryExample();
		entryExample.createCriteria().andCourseEqualTo(courseId).andContainerCategoryEqualTo(containerCategory);
		evaluationEntryDao.deleteByExample(entryExample);
	}
	
	/**
	 * 估价驳回原因
	 */
	@Override
	public List<SelectOutput> getRejectReasons() {
		ReasonExample example=new ReasonExample();
		example.createCriteria()
		.andReasonTypeEqualTo(ReasonTypeEnum.EVALUATION_REJECT.getCode())
		.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		return reasonDao.selectByExample(example).stream().map(a->{
			SelectOutput item=new SelectOutput();
			item.setValue(a.getKey());
			if(isChineseRequest()) {
				item.setLabel(a.getReasonContentName());
			}
			else {
				item.setLabel(a.getReasonContentEn());
			}
			return item;
		}).collect(Collectors.toList());
	}
	
	/**
	 * 保修估价驳回
	 * @param courseId
	 * @param message
	 */
	@Override
	public void rejectMaintenanceCourse(String courseId, String message) {
		MaintenanceWithBLOBs record=maintenanceDao.selectByPrimaryKey(courseId);
		if(record!=null) {
			if(StringUtils.isNotEmpty(record.getReferralState())) {
				if(record.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode())) {
					throw new InvalidException("已完工，无法驳回");
				}
				
			}
			record.setValuationNo(null);
			record.setValuationUser(null);
			record.setValuationTime(null);
			record.setValuationState(null);
			record.setValuationRemarks(null);
			record.setValuationRejectUser(getCurrentUserId());
			record.setValuationRejectTime(new Date());
			record.setValuationRejectReason(message);
			record.setValuationWorkingHoursCost(null);
			record.setValuationWorkingHoursCost(null);
			record.setValuationMaterialCost(null);
			record.setValuationTotalCost(null);
			record.setValuationTotalCostRmb(null);
			record.setValuationState(ReplyStateEnum.REJECTED.getCode());
			maintenanceDao.updateByPrimaryKeyWithBLOBs(record);
		}
		//删除估价明细
		EvaluationEntryExample entryExample=new EvaluationEntryExample();
		entryExample.createCriteria().andCourseEqualTo(courseId).andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_04.getCode());
		evaluationEntryDao.deleteByExample(entryExample);
	}
	
	/**
	 * 保修单箱批复
	 */
	@Override
	@Transactional
	public void singleMaintenanceReply(ThirdPartPayInput input) {
		Date date=new Date();
		Integer userId=getCurrentUserId();

		MaintenanceWithBLOBs record=maintenanceDao.selectByPrimaryKey(input.getProdCourseId());
		if(record!=null) {
			
			record.setRespondUser(userId);
			record.setRespondTime(new Date());
			record.setRespondCost(input.getTotalReplyMoney());
			record.setRespondCostRmb(input.getTotalReplyMoney());
			record.setValuationState(ReplyStateEnum.APPLYED.getCode());
			record.setUpdateTime(date);
			record.setUpdateUser(userId);
			maintenanceDao.updateByPrimaryKeyWithBLOBs(record);
			
			ContainerExample containerExample = new ContainerExample();
			containerExample.createCriteria().andContainerNoEqualTo(record.getContainerNo());
			Container container = containerDao.selectByExample(containerExample).get(0);
			
			List<PoolRepairInput> billList = input.getEntries().stream().map(a -> {
				PoolRepairInput item = new PoolRepairInput();
				item.setProdCourseId(input.getProdCourseId());
				item.setProdContainerId(container.getProdContainerId());
				item.setContainerNo(record.getContainerNo());
				item.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
				item.setYard(record.getYard());
				item.setReplyTime(date);
				item.setIsBackLease(CommonEnum.NO.getCode());
				item.setContainerUser(record.getContainerUser());
				item.setRemarks(a.getRemarks());
				item.setReplyTaxTotalCostRmb(a.getSumMoney());
				item.setPayer(a.getPayingParty());
				return item;
			}).collect(Collectors.toList());

			financeClient.oneReply(billList);
			
		}
		
	}
	
	/**
	 * 退租箱-箱东单箱批复
	 */
	@Override
	@Transactional
	public void masterSingleReply(ThirdPartPayInput input) {
		Date date=new Date();
		Integer userId=getCurrentUserId();
		ObjectMapper mapper=new ObjectMapper();
		//箱体+机组同时批复
		//箱体进场信息
		CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
		if(input.getIsMaster()!=null && input.getIsMaster().equals(true)) {
			course.setMasterReplyMoneyRmb(input.getTotalReplyMoney());
			course.setMasterReplyState(ReplyStateEnum.APPLYED.getCode());
			course.setMasterReplyTime(date);
		}
		else {
			course.setUseReplyMoneyRmb(input.getTotalReplyMoney());
			course.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
			course.setUseReplyTime(date);
		}
		
		course.setUpdateTime(date);
		course.setUpdateUser(userId);
		courseDao.updateByPrimaryKeyWithBLOBs(course);
		
		//机组进场信息
		UnitCourseWithBLOBs unitcourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
		if(unitcourse!=null) {
			if(input.getIsMaster()!=null && input.getIsMaster().equals(true)) {
				unitcourse.setMasterReplyMoneyRmb(input.getTotalReplyMoney());
				unitcourse.setMasterReplyState(ReplyStateEnum.APPLYED.getCode());
				unitcourse.setMasterReplyTime(date);
			}
			else {
				unitcourse.setUseReplyMoneyRmb(input.getTotalReplyMoney());
				unitcourse.setUseReplyState(ReplyStateEnum.APPLYED.getCode());
				unitcourse.setUseReplyTime(date);
			}
			unitcourse.setUpdateTime(date);
			unitcourse.setUpdateUser(userId);
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitcourse);
		}
		
		ContainerExample containerExample = new ContainerExample();
		containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
		Container container = containerDao.selectByExample(containerExample).get(0);
		
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
		List<Yard> yardList = yardDao.selectByExample(yardExample);
		Yard yard = yardList.get(0);
		
		//获取第三方收费方式
		Boolean thirdPay=false;
		ThirdPayTypeOutput thirdPayTypeOutput=getThirdPayType(course.getYard(),course.getContainerUser());
		if(StringUtils.isNotEmpty(thirdPayTypeOutput.getThirdPayType()) && thirdPayTypeOutput.getThirdPayType().equals(ThirdPayTypeEnum.SPOT.getCode())) {
			thirdPay=true;
		}

		List<PoolRepairInput> billList = input.getEntries().stream().map(a -> {
			PoolRepairInput item = new PoolRepairInput();
			item.setProdCourseId(input.getProdCourseId());
			item.setProdContainerId(container.getProdContainerId());
			item.setContainerNo(course.getContainerNo());
			item.setContainerCategory(input.getContainerCategory());
			item.setYard(course.getYard());
			item.setReplyTime(date);
			item.setIsBackLease(CommonEnum.NO.getCode());
			item.setContainerUser(course.getContainerUser());
			item.setRemarks(a.getRemarks());
			item.setPayer(a.getPayingParty());

			List<AddEvaluationEntryInput> valuationSum = input.getTableData().stream()
					.filter(b -> StringUtils.isNotEmpty(b.getProdEvaluationEntryId())
							&& b.getPayingParty().equals(a.getPayingParty()))
					.collect(Collectors.toList());
			BigDecimal manHourNum=valuationSum.stream().map(c -> new BigDecimal(c.getManHour())).reduce((e, f) -> ComputeUtil.add(e, f)).get();
			BigDecimal manHourCost = valuationSum.stream().map(c -> c.getManHourCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
			BigDecimal materialCost = valuationSum.stream().map(c -> c.getMaterialCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
			
			item.setValuationManHourCost(ComputeUtil.round(manHourCost, 2));
			item.setValuationMaterialCost(ComputeUtil.round(materialCost, 2));
			item.setValuationHourNumber(manHourNum);
			item.setReplyFreeUser(getCurrentUserId());
			item.setReplyFreeTime(new Date());
			// 币种转换为 CNY USD字母表示
			if (StringUtils.isNotEmpty(course.getValuationCurrency())
					&& course.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
				item.setEstCurrencyType("CNY");
				item.setValuationMoneyRmb(a.getSumMoney());// 总费用 美金
				item.setReplyTaxTotalCostRmb(a.getSumMoney());

			} else {
				item.setEstCurrencyType("USD");
				item.setValuationMoneyUsd(a.getSumMoney());// 总费用 美金
				item.setReplyTaxTotalCostUsa(a.getSumMoney());

			}
			return item;
		}).collect(Collectors.toList());

		financeClient.oneReply(billList);
		
		//更新所有条目状态
//		EvaluationEntryExample entryExample=new EvaluationEntryExample();
//		entryExample.createCriteria().andCourseEqualTo(input.getProdCourseId());
//		
//		EvaluationEntry record = new EvaluationEntry();
//		record.setIsCharge(CommonEnum.YES.getCode());
//		record.setUpdateTime(date);
//		record.setUpdateUser(userId);
//		evaluationEntryDao.updateByExampleSelective(record, entryExample);
		   
		//批复后判断是否符合xx箱转OK的条件
		xxService.createPtiInfo(course, unitcourse);
		
		//批复派工
		ReferralOperateInput refInput=new ReferralOperateInput();
		refInput.setCourseId(input.getProdCourseId());
		refInput.setContainerCategory(input.getContainerCategory());
		refInput.setReferralType(ReferralTypeEnum.REPLY.getCode());
		referralService.referralOperate(refInput);
		
	}
	
	/**
	 * 修改退租箱状态
	 * @param input
	 */
	@Transactional
	@Override
	public void changeSurrenderState(ChangeSurrenderInput input) {
		/**
		 * 箱体
		 */
		CourseWithBLOBs course=new CourseWithBLOBs();
		if(input.getIsMaster()!=null && input.getIsMaster().equals(true)) {
			course.setMasterReplyState(input.getState());
		}
		else {
			course.setUseReplyState(input.getState());
		}
		course.setUpdateTime(new Date());
		course.setUpdateUser(getCurrentUserId());
		
		CourseExample courseExample=new CourseExample();
		courseExample.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
		
		courseDao.updateByExampleSelective(course, courseExample);
		//机组
		UnitCourseWithBLOBs unitCourse=new UnitCourseWithBLOBs();
		if(input.getIsMaster()!=null && input.getIsMaster().equals(true)) {
			unitCourse.setMasterReplyState(input.getState());
		}
		else {
			unitCourse.setUseReplyState(input.getState());
		}
		unitCourse.setUpdateTime(new Date());
		unitCourse.setUpdateUser(getCurrentUserId());
		
		UnitCourseExample unitCourseExample=new UnitCourseExample();
		unitCourseExample.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
		
		unitCourseDao.updateByExampleSelective(unitCourse, unitCourseExample);
		
		xxService.createPtiInfo(input.getProdCourseId());
	}
	
	/**
	 * 退租取消批复
	 * @param prodCourseId
	 * @param containerCategory
	 * @return
	 */
	@Transactional
	@Override
	public boolean cancelSurrenderReply(ChangeSurrenderInput input) {
		// 调建运接口删除批复费用，返回true可以取消批复，返回false不可取消批复
		PoolRepairInput finput = new PoolRepairInput();
		finput.setProdCourseId(input.getProdCourseId());
		finput.setContainerCategory(input.getContainerCategory());
		if (!financeClient.cancelReply(finput)) {
			return false;
		}
		Course course = courseDao.selectByPrimaryKey(input.getProdCourseId());
		// 将收费方式为现结的箱子，估价单明细的是否第三方收费置为否
		ThirdPayTypeOutput thirdPayTypeOutput = this.getThirdPayType(course.getYard(), course.getContainerUser());
		if (thirdPayTypeOutput != null && ThirdPayTypeEnum.SPOT.getCode().equals(thirdPayTypeOutput.getThirdPayType())) {
			EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
			EvaluationEntryExample.Criteria evaluationEntryCriteria = evaluationEntryExample.createCriteria();
			evaluationEntryCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			evaluationEntryCriteria.andCourseEqualTo(input.getProdCourseId());
//			evaluationEntryCriteria.andContainerCategoryEqualTo(input.getContainerCategory());
			EvaluationEntry evaluationEntry = new EvaluationEntry();
			evaluationEntry.setIsCharge(CommonEnum.NO.getCode());
			evaluationEntry.setUpdateUser(getCurrentUserId());
			evaluationEntry.setUpdateTime(new Date());
			evaluationEntryDao.updateByExampleSelective(evaluationEntry, evaluationEntryExample);
		}
		
		input.setState(ReplyStateEnum.UNREPLY.getCode());
		this.changeSurrenderState(input);
		
		xxService.createPtiInfo(course, null);
		return true;
		
	}
	
	/**
	 * 退租箱-批复不修
	 * @param input
	 * @author zhangkai
	 */
	@Transactional
	@Override
	public void replyNoReferral(ChangeSurrenderInput input) {
		input.setState(ReplyStateEnum.REJECT.getCode());
		this.changeSurrenderState(input);
		
		// 判断派工状态为已派工或已完工的，调维修接口，已经出库的，记录出库产生的成本
		CourseWithBLOBs res = courseDao.selectByPrimaryKey(input.getProdCourseId());
		if (res != null && (ReferralStateEnum.REFERRALED.getCode().equals(res.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(res.getReferralState()))) {
			// 调维修接口
			BigDecimal cost = referralService.getStockMoney(input.getProdCourseId(), res.getContainerCategory());
			// 记录成本
			if (BigDecimal.ZERO.compareTo(cost) != 0) {
				UnrecycleCost unrecycleCost = new UnrecycleCost();
				unrecycleCost.setCourse(res.getProdCourseId());
				unrecycleCost.setContainerNo(res.getContainerNo());
				unrecycleCost.setCourseTime(res.getCourseTime());
				unrecycleCost.setSize(res.getSize());
				unrecycleCost.setContainerType(res.getContainerType());
				unrecycleCost.setContainerCategory(res.getContainerCategory());
				unrecycleCost.setYard(res.getYard());
				unrecycleCost.setValuationState(ReplyStateEnum.REJECT.getCode());
				unrecycleCost.setStockoutCost(cost);
				unrecycleCost.setCreateUser(getCurrentUserId());
				unrecycleCost.setCreateTime(new Date());
				unrecycleCostDao.insertSelective(unrecycleCost);
			}
		}
		
		
		UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
		if (unitCourse != null && (ReferralStateEnum.REFERRALED.getCode().equals(unitCourse.getReferralState()) || ReferralStateEnum.COMPLETED.getCode().equals(unitCourse.getReferralState()))) {
			// 调维修接口
			BigDecimal cost = referralService.getStockMoney(input.getProdCourseId(), input.getContainerCategory());
			// 记录成本
			if (BigDecimal.ZERO.compareTo(cost) != 0) {
				UnrecycleCost unrecycleCost = new UnrecycleCost();
				unrecycleCost.setCourse(res.getProdCourseId());
				unrecycleCost.setContainerNo(res.getContainerNo());
				unrecycleCost.setCourseTime(res.getCourseTime());
				unrecycleCost.setSize(res.getSize());
				unrecycleCost.setContainerType(res.getContainerType());
				unrecycleCost.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
				unrecycleCost.setYard(res.getYard());
				unrecycleCost.setValuationState(ReplyStateEnum.REJECT.getCode());
				unrecycleCost.setStockoutCost(cost);
				unrecycleCost.setCreateUser(getCurrentUserId());
				unrecycleCost.setCreateTime(new Date());
				unrecycleCostDao.insertSelective(unrecycleCost);
			}
		}
		
		xxService.createPtiInfo(res, unitCourse);
	}
	
	/**
	 * 退租箱-取消批复不修
	 * @param prodCourseId
	 * @param containerCategory
	 * @author zhangkai
	 */
	@Transactional
	@Override
	public void cancalNoReferral(ChangeSurrenderInput input) {
		// 删除无法回收费用表
		UnrecycleCostExample unrecycleCostExample = new UnrecycleCostExample();
		UnrecycleCostExample.Criteria unrecycleCostCriteria = unrecycleCostExample.createCriteria();
		unrecycleCostCriteria.andCourseEqualTo(input.getProdCourseId());
		unrecycleCostCriteria.andValuationStateEqualTo(ReplyStateEnum.REJECT.getCode());
		unrecycleCostDao.deleteByExample(unrecycleCostExample);
		// 更新状态为待估价
		input.setState(ReplyStateEnum.UNDO.getCode());
		this.changeSurrenderState(input);
		
		xxService.createPtiInfo(input.getProdCourseId());
	}

	/**
	 * 退租箱-箱东扣款
	 * @param input
	 */
	@Override
	@Transactional
	public void masterBack(ChangeSurrenderInput input) {
		Course course=courseDao.selectByPrimaryKey(input.getProdCourseId());
		course.setIsOwnerCharge(CommonEnum.YES.getCode());
		course.setUpdateUser(getCurrentUserId());
		course.setUpdateTime(new Date());
		courseDao.updateByPrimaryKey(course);
		
		
		ContainerExample containerExample = new ContainerExample();
		containerExample.createCriteria().andContainerNoEqualTo(course.getContainerNo());
		Container container = containerDao.selectByExample(containerExample).get(0);
		
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
		List<Yard> yardList = yardDao.selectByExample(yardExample);
		Yard yard = yardList.get(0);
		
		
			PoolRepairInput item = new PoolRepairInput();
			item.setProdCourseId(input.getProdCourseId());
			item.setProdContainerId(container.getProdContainerId());
			item.setContainerNo(course.getContainerNo());
			item.setContainerCategory(input.getContainerCategory());
			item.setYard(course.getYard());
			item.setReplyTime(new Date());
			item.setIsBackLease(CommonEnum.NO.getCode());
			item.setContainerUser(course.getContainerUser());
			item.setRemarks(course.getValuationRemarks());
			item.setPayer("O");

//			List<AddEvaluationEntryInput> valuationSum = input.getTableData().stream()
//					.filter(b -> StringUtils.isNotEmpty(b.getProdEvaluationEntryId())
//							&& b.getPayingParty().equals(a.getPayingParty()))
//					.collect(Collectors.toList());
//			BigDecimal manHourNum=valuationSum.stream().map(c -> new BigDecimal(c.getManHour())).reduce((e, f) -> ComputeUtil.add(e, f)).get();
//			BigDecimal manHourCost = valuationSum.stream().map(c -> c.getManHourCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
//			BigDecimal materialCost = valuationSum.stream().map(c -> c.getMaterialCost()).reduce((e, f) -> ComputeUtil.add(e, f)).get();
//			
//			item.setValuationManHourCost(ComputeUtil.round(manHourCost, 2));
//			item.setValuationMaterialCost(ComputeUtil.round(materialCost, 2));
//			item.setValuationHourNumber(manHourNum);
			item.setReplyFreeUser(getCurrentUserId());
			item.setReplyFreeTime(new Date());
			// 币种转换为 CNY USD字母表示
			if (StringUtils.isNotEmpty(course.getValuationCurrency())
					&& course.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
				item.setEstCurrencyType("CNY");
				item.setValuationMoneyRmb(new BigDecimal(course.getUseReplyMoneyRmb()==null?0d:course.getUseReplyMoneyRmb().doubleValue()*-1));
				item.setReplyTaxTotalCostRmb(new BigDecimal(course.getUseReplyMoneyRmb()==null?0d:course.getUseReplyMoneyRmb().doubleValue()*-1));

			} else {
				item.setEstCurrencyType("USD");
				item.setValuationMoneyUsd(new BigDecimal(course.getUseReplyMoneyUsd()==null?0d:course.getUseReplyMoneyUsd().doubleValue()*-1));// 总费用 美金
				item.setReplyTaxTotalCostUsa(new BigDecimal(course.getUseReplyMoneyUsd()==null?0d:course.getUseReplyMoneyUsd().doubleValue()*-1));// 总费用 美金

			}
			//U的批复金额作为O的负数账单，调用建云接口
			List<PoolRepairInput> billList = Arrays.asList(item);

		financeClient.oneReply(billList);
	}
}
