package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.production.dao.CodeCorrespondingMapper;
import com.sanlly.production.dao.CommonRemarksMapper;
import com.sanlly.production.dao.CompanyUsecontMapper;
import com.sanlly.production.dao.ContainerBelongMapper;
import com.sanlly.production.dao.ContainerGradeMapper;
import com.sanlly.production.dao.ContainerSizeMapper;
import com.sanlly.production.dao.ContainerTypeMapper;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.CourseTypeMapper;
import com.sanlly.production.dao.DamageMapper;
import com.sanlly.production.dao.MaterialMapper;
import com.sanlly.production.dao.PartsRepairTypeMapper;
import com.sanlly.production.dao.PayingPartyMapper;
import com.sanlly.production.dao.RateMapper;
import com.sanlly.production.dao.RepairMapper;
import com.sanlly.production.dao.ShortcutRecordMapper;
import com.sanlly.production.dao.SpecialWashingRateMapper;
import com.sanlly.production.dao.UnitCompanyMapper;
import com.sanlly.production.dao.UnitTypeMapper;
import com.sanlly.production.dao.YardContainerTypeMapper;
import com.sanlly.production.dao.ZyRateMapper;
import com.sanlly.production.entity.CodeCorresponding;
import com.sanlly.production.entity.CodeCorrespondingExample;
import com.sanlly.production.entity.CommonRemarks;
import com.sanlly.production.entity.CommonRemarksExample;
import com.sanlly.production.entity.CompanyUsecont;
import com.sanlly.production.entity.CompanyUsecontExample;
import com.sanlly.production.entity.ContainerBelong;
import com.sanlly.production.entity.ContainerBelongExample;
import com.sanlly.production.entity.ContainerGrade;
import com.sanlly.production.entity.ContainerGradeExample;
import com.sanlly.production.entity.ContainerSize;
import com.sanlly.production.entity.ContainerSizeExample;
import com.sanlly.production.entity.ContainerSizeExample.Criteria;
import com.sanlly.production.entity.ContainerType;
import com.sanlly.production.entity.ContainerTypeExample;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.CourseType;
import com.sanlly.production.entity.CourseTypeExample;
import com.sanlly.production.entity.Damage;
import com.sanlly.production.entity.DamageExample;
import com.sanlly.production.entity.Material;
import com.sanlly.production.entity.MaterialExample;
import com.sanlly.production.entity.PartsRepairType;
import com.sanlly.production.entity.PartsRepairTypeExample;
import com.sanlly.production.entity.PayingParty;
import com.sanlly.production.entity.PayingPartyExample;
import com.sanlly.production.entity.Rate;
import com.sanlly.production.entity.RateExample;
import com.sanlly.production.entity.Repair;
import com.sanlly.production.entity.RepairExample;
import com.sanlly.production.entity.ShortcutRecord;
import com.sanlly.production.entity.ShortcutRecordExample;
import com.sanlly.production.entity.SpecialWashingRate;
import com.sanlly.production.entity.SpecialWashingRateExample;
import com.sanlly.production.entity.UnitCompany;
import com.sanlly.production.entity.UnitCompanyExample;
import com.sanlly.production.entity.UnitType;
import com.sanlly.production.entity.UnitTypeExample;
import com.sanlly.production.entity.YardContainerType;
import com.sanlly.production.entity.YardContainerTypeExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.output.app.base.BasicOutput;
import com.sanlly.production.models.output.app.base.CommonRemarksSelectOutput;
import com.sanlly.production.models.output.app.base.ContainerBelongSelectOutput;
import com.sanlly.production.models.output.app.base.ContainerConditionSelectOutput;
import com.sanlly.production.models.output.app.base.ContainerGradeSelectOutput;
import com.sanlly.production.models.output.app.base.ContainerTypeSelectOutput;
import com.sanlly.production.models.output.app.base.ContainerUserSelectOutput;
import com.sanlly.production.models.output.app.base.DamageSelectOutput;
import com.sanlly.production.models.output.app.base.EntryTypeSelectOutput;
import com.sanlly.production.models.output.app.base.MaterialSelectOutput;
import com.sanlly.production.models.output.app.base.PartsDetailDamageSelectOutput;
import com.sanlly.production.models.output.app.base.PartsDetailsSelectOutput;
import com.sanlly.production.models.output.app.base.PartsRepairSelectOutput;
import com.sanlly.production.models.output.app.base.PartsRepairTypeSelectOutput;
import com.sanlly.production.models.output.app.base.PayingPartySelectOutput;
import com.sanlly.production.models.output.app.base.RepairSelectOutput;
import com.sanlly.production.models.output.app.base.ShortcutSelectOutput;
import com.sanlly.production.models.output.app.base.SizeSelectOutput;
import com.sanlly.production.models.output.app.base.SpecialGoodSelectOutput;
import com.sanlly.production.models.output.app.base.UnitCompanySelectOutput;
import com.sanlly.production.models.output.app.base.UnitTypeSelectOutput;
import com.sanlly.production.service.AppService;
import com.sanlly.production.service.LangService;

@Service
public class AppServiceImpl extends BaseServiceImpl implements AppService {
	
	@Autowired
	private ContainerSizeMapper containerSizeMapper;
	@Autowired
	private ContainerTypeMapper containerTypeMapper;
	@Autowired
	private ContainerUserMapper containerUserMapper;
	@Autowired
	private CourseTypeMapper courseTypeMapper;
	@Autowired
	private ContainerGradeMapper containerGradeMapper;
	@Autowired
	private UnitTypeMapper unitTypeMapper;
	@Autowired
	private ContainerBelongMapper containerBelongMapper;
	@Autowired
	private CommonRemarksMapper commonRemarksMapper;
	@Autowired
	private YardContainerTypeMapper yardContainerTypeMapper;
	@Autowired
	private PayingPartyMapper payingPartyMapper;
	@Autowired
	private ShortcutRecordMapper shortcutRecordMapper;
	@Autowired
	private UnitCompanyMapper unitCompanyMapper;
	@Autowired
	private SpecialWashingRateMapper specialWashingRateMapper;
	@Autowired
	private ZyRateMapper zyRateMapper;
	@Autowired
	private RateMapper rateMapper;
	@Autowired
	private CompanyUsecontMapper cuMapper;
	@Autowired
	private CodeCorrespondingMapper codeCorrespondingMapper;
	@Autowired
	private RepairMapper repairMapper;
	@Autowired
	private MaterialMapper materialMapper;
	@Autowired
	private DamageMapper damageMapper;
	@Autowired
	private PartsRepairTypeMapper partsRepairTypeMapper;
	@Autowired
	private LangService langService;

	/**
	 * app端离线模式一次性获取下拉选基本信息
	 * @author zhangkai
	 *
	 */
	@Override
	public BasicOutput select() {
		BasicOutput basicOutput = new BasicOutput();
		
		// 尺寸
		ContainerSizeExample containerSizeExample = new ContainerSizeExample();
		Criteria containerSizeCriteria = containerSizeExample.createCriteria();
		containerSizeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerSize> containerSizes =  containerSizeMapper.selectByExample(containerSizeExample);
		List<SizeSelectOutput> sizeSelectOutputs = new ArrayList<SizeSelectOutput>();
		if (containerSizes == null || containerSizes.size() == 0) {
			basicOutput.setSizeList(sizeSelectOutputs);
		} else {
			for (ContainerSize item : containerSizes) {
				SizeSelectOutput output = new SizeSelectOutput();
				BeanUtils.copyProperties(item, output);
				sizeSelectOutputs.add(output);
			}
			basicOutput.setSizeList(sizeSelectOutputs);
		}	
		
		// 箱型
		ContainerTypeExample containerTypeExample = new ContainerTypeExample();
		com.sanlly.production.entity.ContainerTypeExample.Criteria containerTypeCriteria = containerTypeExample.createCriteria();
		containerTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerType> containerTypes = containerTypeMapper.selectByExample(containerTypeExample);
		List<ContainerTypeSelectOutput> containerTypeSelectOutputs = new ArrayList<ContainerTypeSelectOutput>();
		if (containerTypes == null || containerTypes.size() == 0) {
			basicOutput.setContainerTypeList(containerTypeSelectOutputs);
		} else {
			for (ContainerType item : containerTypes) {
				ContainerTypeSelectOutput output = new ContainerTypeSelectOutput();
				BeanUtils.copyProperties(item, output);
				containerTypeSelectOutputs.add(output);
			}
			basicOutput.setContainerTypeList(containerTypeSelectOutputs);
		}
		
		// 用箱人
		// 用箱人与公司具有多对多关联关系
		// 先根据用户确定公司，根据公司选择相关用箱人
		List<ContainerUserSelectOutput> containerUserList = new ArrayList<ContainerUserSelectOutput>();
		String companyKey = "LKCOMPANY000001";
		CompanyUsecontExample cuExample2 = new CompanyUsecontExample();
		com.sanlly.production.entity.CompanyUsecontExample.Criteria cuCriteria2 = cuExample2.createCriteria();
		cuCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		cuCriteria2.andCompanyEqualTo(companyKey);
		List<CompanyUsecont> cuList2 = cuMapper.selectByExample(cuExample2);
		if (cuList2 == null || cuList2.size() == 0) {
			basicOutput.setContainerUserList(containerUserList);
		} else {
			for (CompanyUsecont cu : cuList2) {
				ContainerUserExample containerUserExample = new ContainerUserExample();
				com.sanlly.production.entity.ContainerUserExample.Criteria containerUserCriteria = containerUserExample
						.createCriteria();
				containerUserCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				containerUserCriteria.andKeyEqualTo(cu.getContainerUser());
				List<ContainerUser> containerUsers = containerUserMapper.selectByExample(containerUserExample);
				if (containerUsers == null || containerUsers.size() == 0) {
					continue;
				} else {
					for (ContainerUser item : containerUsers) {
						ContainerUserSelectOutput output = new ContainerUserSelectOutput();
						output.setKey(item.getKey());
						output.setContainerUserCode(item.getContainerUserCode());
						output.setContainerUserName(item.getContainerUserName());
						output.setContainerUserNameEn(item.getContainerUserNameEn());
						containerUserList.add(output);
					}
					basicOutput.setContainerUserList(containerUserList);
				}
			}
		}
			
		// 进场类别
		CourseTypeExample courseTypeExample = new CourseTypeExample();
		com.sanlly.production.entity.CourseTypeExample.Criteria courseTypeCriteria = courseTypeExample.createCriteria();
		courseTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<CourseType> courseTypes = courseTypeMapper.selectByExample(courseTypeExample);
		List<EntryTypeSelectOutput> entryTypeSelectOutputs = new ArrayList<EntryTypeSelectOutput>();
		if (courseTypes == null || courseTypes.size() == 0) {
			basicOutput.setEntryTypeList(entryTypeSelectOutputs);
		} else {
			for (CourseType item : courseTypes) {
				EntryTypeSelectOutput output = new EntryTypeSelectOutput();
				output.setKey(item.getKey());
				output.setEntryTypeCode(item.getCourseTypeCode());
				output.setEntryTypeName(item.getCourseTypeName());
				output.setEntryTypeNameEn(item.getCourseTypeNameEn());
				entryTypeSelectOutputs.add(output);
			}
			basicOutput.setEntryTypeList(entryTypeSelectOutputs);
		}	
		
		// 箱等级
		ContainerGradeExample containerGradeExample = new ContainerGradeExample();
		com.sanlly.production.entity.ContainerGradeExample.Criteria containerGradeCriteria = containerGradeExample.createCriteria();
		containerGradeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerGrade> containerGrades = containerGradeMapper.selectByExample(containerGradeExample);
		List<ContainerGradeSelectOutput> containerGradeSelectOutputs = new ArrayList<ContainerGradeSelectOutput>();
		if (containerGrades == null || containerGrades.size() == 0) {
			basicOutput.setContainerGradeList(containerGradeSelectOutputs);
		} else {
			for (ContainerGrade item : containerGrades) {
				ContainerGradeSelectOutput output = new ContainerGradeSelectOutput();
				BeanUtils.copyProperties(item, output);
				containerGradeSelectOutputs.add(output);
			}
			basicOutput.setContainerGradeList(containerGradeSelectOutputs);
		}
		
		// 机型
		UnitTypeExample unitTypeExample = new UnitTypeExample();
		com.sanlly.production.entity.UnitTypeExample.Criteria unitTypeCriteria = unitTypeExample.createCriteria();
		unitTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitType> unitTypes = unitTypeMapper.selectByExample(unitTypeExample);
		List<UnitTypeSelectOutput> unitTypeSelectOutputs = new ArrayList<UnitTypeSelectOutput>();
		if (unitTypes == null || unitTypes.size() == 0) {
			basicOutput.setUnitTypeList(unitTypeSelectOutputs);
		} else {
			for (UnitType item : unitTypes) {
				UnitTypeSelectOutput output = new UnitTypeSelectOutput();
				BeanUtils.copyProperties(item, output);
				unitTypeSelectOutputs.add(output);
			}
			basicOutput.setUnitTypeList(unitTypeSelectOutputs);
		}
			
		// 箱属
		ContainerBelongExample containerBelongExample = new ContainerBelongExample();
		com.sanlly.production.entity.ContainerBelongExample.Criteria containerBelongCriteria = containerBelongExample.createCriteria();
		containerBelongCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerBelong> containerBelongs = containerBelongMapper.selectByExample(containerBelongExample);
		List<ContainerBelongSelectOutput> containerBelongSelectOutputs = new ArrayList<ContainerBelongSelectOutput>();
		if (containerBelongs == null || containerBelongs.size() == 0) {
			basicOutput.setContainerBelongList(containerBelongSelectOutputs);
		} else {
			for (ContainerBelong item : containerBelongs) {
				ContainerBelongSelectOutput output = new ContainerBelongSelectOutput();
				BeanUtils.copyProperties(item, output);
				containerBelongSelectOutputs.add(output);
			}
			basicOutput.setContainerBelongList(containerBelongSelectOutputs);
		}	
		
		// 常用备注
		CommonRemarksExample commonRemarksExample = new CommonRemarksExample();
		com.sanlly.production.entity.CommonRemarksExample.Criteria commonRemarksCriteria = commonRemarksExample.createCriteria();
		commonRemarksCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<CommonRemarks> commonRemarks = commonRemarksMapper.selectByExample(commonRemarksExample);
		List<CommonRemarksSelectOutput> commonRemarksSelectOutputs = new ArrayList<CommonRemarksSelectOutput>();
		if (commonRemarks == null || commonRemarks.size() == 0) {
			basicOutput.setRemarksList(commonRemarksSelectOutputs);
		} else {
			for (CommonRemarks item : commonRemarks) {
				CommonRemarksSelectOutput output = new CommonRemarksSelectOutput();
				BeanUtils.copyProperties(item, output);
				commonRemarksSelectOutputs.add(output);
			}
			basicOutput.setRemarksList(commonRemarksSelectOutputs);	
		}
		
		// 箱况
		YardContainerTypeExample yardContainerTypeExample = new YardContainerTypeExample();
		com.sanlly.production.entity.YardContainerTypeExample.Criteria yardContainerTypeCriteria = yardContainerTypeExample.createCriteria();
		yardContainerTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<YardContainerType> yardContainerTypes = yardContainerTypeMapper.selectByExample(yardContainerTypeExample);
		List<ContainerConditionSelectOutput> containerConditionSelectOutputs = new ArrayList<ContainerConditionSelectOutput>();
		if (yardContainerTypes == null || yardContainerTypes.size() == 0) {
			basicOutput.setContainerConditionList(containerConditionSelectOutputs);
		} else {
			for (YardContainerType item : yardContainerTypes) {
				ContainerConditionSelectOutput output = new ContainerConditionSelectOutput();
				BeanUtils.copyProperties(item, output);
				output.setContainerCategoryName(item.getCourseTypeName());
				output.setContainerCategoryNameEn(item.getCourseTypeNameEn());
				containerConditionSelectOutputs.add(output);
			}
			basicOutput.setContainerConditionList(containerConditionSelectOutputs);
		}
		
		// 付费方
		PayingPartyExample payingPartyExample = new PayingPartyExample();
		com.sanlly.production.entity.PayingPartyExample.Criteria payingPartyCriteria = payingPartyExample.createCriteria();
		payingPartyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<PayingParty> payingParties = payingPartyMapper.selectByExample(payingPartyExample);
		List<PayingPartySelectOutput> payingPartySelectOutputs = new ArrayList<PayingPartySelectOutput>();
		if (payingParties == null || payingParties.size() == 0) {
			basicOutput.setPayingPartyList(payingPartySelectOutputs);
		} else {
			for (PayingParty item : payingParties) {
				PayingPartySelectOutput output = new PayingPartySelectOutput();
				BeanUtils.copyProperties(item, output);
				payingPartySelectOutputs.add(output);
			}
			basicOutput.setPayingPartyList(payingPartySelectOutputs);
		}
		
		// 快捷录入
		ShortcutRecordExample shortcutRecordExample = new ShortcutRecordExample();
		com.sanlly.production.entity.ShortcutRecordExample.Criteria shortcutRecordCriteria = shortcutRecordExample.createCriteria();
		shortcutRecordCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ShortcutRecord> shortcutRecords = shortcutRecordMapper.selectByExample(shortcutRecordExample);
		List<ShortcutSelectOutput> shortcutSelectOutputs = new ArrayList<ShortcutSelectOutput>();
		if (shortcutRecords == null || shortcutRecords.size() == 0) {
			basicOutput.setShortcutList(shortcutSelectOutputs);
		} else {
			for (ShortcutRecord item : shortcutRecords) {
				ShortcutSelectOutput output = new ShortcutSelectOutput();
				BeanUtils.copyProperties(item, output);
				output.setPartsTypeName(langService.langValue(output.getPartsTypeCode(), LanguageEnum.LANGZH, "partsTypeName"));
				output.setPartsTypeNameEn(langService.langValue(output.getPartsTypeCode(), LanguageEnum.LANGEN, "partsTypeNameEn"));
				output.setPartsDetailsName(langService.langValue(output.getPartsDetailsCode(), LanguageEnum.LANGZH, "partsDetailsName"));
				output.setPartsDetailsNameEn(langService.langValue(output.getPartsDetailsCode(), LanguageEnum.LANGEN, "partsDetailsNameEn"));
				output.setPartsRepairName(langService.langValue(output.getPartsRepairCode(), LanguageEnum.LANGZH, "partsRepairName"));
				output.setPartsRepairNameEn(langService.langValue(output.getPartsRepairCode(), LanguageEnum.LANGEN, "partsRepairNameEn"));
				output.setRepairName(langService.langValue(output.getRepairCode(), LanguageEnum.LANGZH, "repairName"));
				output.setRepairNameEn(langService.langValue(output.getRepairCode(), LanguageEnum.LANGEN, "repairNameEn"));
				output.setDamageName(langService.langValue(output.getDamageCode(), LanguageEnum.LANGZH, "damageName"));
				output.setDamageNameEn(langService.langValue(output.getDamageCode(), LanguageEnum.LANGEN, "damageNameEn"));
				output.setMaterialName(langService.langValue(output.getMaterialCode(), LanguageEnum.LANGZH, "materialName"));
				output.setMaterialNameEn(langService.langValue(output.getMaterialCode(), LanguageEnum.LANGEN, "materialNameEn"));
				shortcutSelectOutputs.add(output);
			}
			basicOutput.setShortcutList(shortcutSelectOutputs);	
		}

		// 冷机公司
		UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
		com.sanlly.production.entity.UnitCompanyExample.Criteria unitCompanyCriteria = unitCompanyExample.createCriteria();
		unitCompanyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitCompany> unitCompanys = unitCompanyMapper.selectByExample(unitCompanyExample);
		List<UnitCompanySelectOutput> unitCompanySelectOutputs = new ArrayList<UnitCompanySelectOutput>();
		if (unitCompanys == null || unitCompanys.size() == 0) {
			basicOutput.setUnitCompanyList(unitCompanySelectOutputs);
		} else {
			for (UnitCompany item : unitCompanys) {
				UnitCompanySelectOutput output = new UnitCompanySelectOutput();
				BeanUtils.copyProperties(item, output);
				unitCompanySelectOutputs.add(output);
			}
			basicOutput.setUnitCompanyList(unitCompanySelectOutputs);
		}
		// 特殊货物洗箱费率
		SpecialWashingRateExample specialWashingRateExample = new SpecialWashingRateExample();
		com.sanlly.production.entity.SpecialWashingRateExample.Criteria specialWashingRateCriteria = specialWashingRateExample.createCriteria();
		specialWashingRateCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<SpecialWashingRate> specialWashingRates = specialWashingRateMapper.selectByExample(specialWashingRateExample);
		List<SpecialGoodSelectOutput> specialGoodSelectOutputs = new ArrayList<SpecialGoodSelectOutput>();
		if (specialWashingRates == null || specialWashingRates.size() == 0) {
			basicOutput.setSpecialGoodsList(specialGoodSelectOutputs);
		} else {
			for (SpecialWashingRate item : specialWashingRates) {
				SpecialGoodSelectOutput output = new SpecialGoodSelectOutput();
				BeanUtils.copyProperties(item, output);
				output.setFortyMoney(item.getFortyRate()==null?"":item.getFortyRate().toString());
				output.setTwentyMoney(item.getTwentyRate()==null?"":item.getTwentyRate().toString());
				specialGoodSelectOutputs.add(output);
			}
			basicOutput.setSpecialGoodsList(specialGoodSelectOutputs);
		}
		
		// 部件修理代码列表（干箱）
		PartsRepairTypeExample partsRepairTypeExample = new PartsRepairTypeExample();
		partsRepairTypeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<PartsRepairType> partsRepairTypes = partsRepairTypeMapper.selectByExample(partsRepairTypeExample);
		Map<String, PartsRepairType> prtMap = partsRepairTypes.stream().collect(Collectors.toMap(PartsRepairType::getKey, partsRepairType -> partsRepairType));
		List<PartsRepairSelectOutput>  partsRepairList = new ArrayList<PartsRepairSelectOutput>();
		RateExample rateExample4 = new RateExample();
		RateExample.Criteria rateCriteria4 = rateExample4.createCriteria();
		rateCriteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 干箱
		rateCriteria4.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode());
		// 用箱人是鑫三利的
		ContainerUserExample containerUserExample2 = new ContainerUserExample();
		ContainerUserExample.Criteria containerUserCriteria2 = containerUserExample2.createCriteria();
		containerUserCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		containerUserCriteria2.andContainerUserCodeEqualTo("SAN");
		// 根据用箱人code查用箱人key
		List<ContainerUser> containerUsers2 = containerUserMapper.selectByExample(containerUserExample2);
		// 对查询结果做非空判断
		if (containerUsers2 == null || containerUsers2.size() == 0 || containerUsers2.get(0).getKey() == null || containerUsers2.get(0).getKey().equals("")) {
			basicOutput.setPartsRepairList(partsRepairList);
		}
		rateCriteria4.andContainerUserEqualTo(containerUsers2.get(0).getKey());
		List<Rate> rates2 = rateMapper.selectByExample(rateExample4);
		for (Rate rate : rates2) {
			// 关联prod_code_corresponding表，匹配位置代码
			CodeCorrespondingExample codeCorrespondingExample = new CodeCorrespondingExample();
			CodeCorrespondingExample.Criteria codeCorrespondingCriteria = codeCorrespondingExample.createCriteria();
			codeCorrespondingCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			codeCorrespondingCriteria.andPartsRepairCodeEqualTo(rate.getPartsDetails()+rate.getRepair());
			List<CodeCorresponding> codeCorrespondings = codeCorrespondingMapper.selectByExample(codeCorrespondingExample);
			if (codeCorrespondings == null || codeCorrespondings.size() == 0) {
				continue;
			} else {
				for (CodeCorresponding codeCorresponding : codeCorrespondings) {
					if (codeCorresponding.getPositionCode() == null || codeCorresponding.getPositionCode() == "") {
						continue;
					}
					String positionCodeStr = codeCorresponding.getPositionCode();
					positionCodeStr = positionCodeStr.replaceAll("\\[", " ").replaceAll("\\]", " ").trim();
					String[] positionCodeArray = positionCodeStr.split("  ");
					for (String positionCode : positionCodeArray) {
						PartsRepairSelectOutput output = new PartsRepairSelectOutput();
						output.setPositionCode(positionCode);
						output.setPartsRepairCode(codeCorresponding.getPartsRepairCode());
						PartsRepairType partsRepairType = prtMap.get(codeCorresponding.getPartsRepairType());
						if(partsRepairType != null) {
							output.setTypeKey(partsRepairType.getKey());
							output.setType(partsRepairType.getTypeName());
							output.setTypeEn(partsRepairType.getTypeNameEn());
						}
						output.setPartsRepairName(rate.getRateName());
						output.setPartsRepairNameEn(rate.getRateNameEn());
						partsRepairList.add(output);
					}
				}	
			}
		}
		basicOutput.setPartsRepairList(partsRepairList);
		
		DamageExample damageExample = new DamageExample();
		DamageExample.Criteria damageCriteria = damageExample.createCriteria();
		damageCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Damage> damages = damageMapper.selectByExample(damageExample);
		
		// 损坏代码列表（干箱）
		List<DamageSelectOutput> damageList = new ArrayList<DamageSelectOutput>();
		CodeCorrespondingExample codeCorrespondingExample2 = new CodeCorrespondingExample();
		CodeCorrespondingExample.Criteria codeCorrespondingCriteria2 =  codeCorrespondingExample2.createCriteria();
		codeCorrespondingCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 干箱
		codeCorrespondingCriteria2.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode());
		List<CodeCorresponding> codeCorrespondings2 = codeCorrespondingMapper.selectByExample(codeCorrespondingExample2);
		for (CodeCorresponding codeCorresponding : codeCorrespondings2) {
			String damageStr = codeCorresponding.getDamageCode();
			if (damageStr == null || damageStr == "") {
				continue;
			}
			damageStr = damageStr.replaceAll("\\[", " ").replaceAll("\\]", " ").trim();
			String[] damageArray = damageStr.split("  ");
			for (String damageCode : damageArray) {
				DamageSelectOutput output = new DamageSelectOutput();
				output.setPartsRepairCode(codeCorresponding.getPartsRepairCode());
				output.setDamageCode(damageCode);
				// 关联prod_damage表，匹配中英文名
				for (Damage damage : damages) {
					if (damage.getDamageCode().equals(damageCode)) {
						output.setDamageName(damage.getDamageName());
						output.setDamageNameEn(damage.getDamageNameEn());
					}
				}
				damageList.add(output);
			}
		}
		basicOutput.setDamageList(damageList);
		
		// 部件明细代码列表（箱体）
		List<PartsDetailsSelectOutput> partsDetailsList = new ArrayList<PartsDetailsSelectOutput>();
		RateExample rateExample3 = new RateExample();
		RateExample.Criteria rateCriteria3 = rateExample3.createCriteria();
		rateCriteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 箱体
		rateCriteria3.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
		// 用箱人是鑫三利的
		ContainerUserExample containerUserExample = new ContainerUserExample();
		ContainerUserExample.Criteria containerUserCriteria = containerUserExample.createCriteria();
		containerUserCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		containerUserCriteria.andContainerUserCodeEqualTo("SAN");
		// 根据用箱人code查用箱人key
		List<ContainerUser> containerUsers = containerUserMapper.selectByExample(containerUserExample);
		// 对查询结果做非空判断
		if (containerUsers == null || containerUsers.size() == 0 || containerUsers.get(0).getKey() == null || containerUsers.get(0).getKey().equals("")) {
			basicOutput.setPartsDetailsList(partsDetailsList);
		}
		rateCriteria3.andContainerUserEqualTo(containerUsers.get(0).getKey());
		List<Rate> rates = rateMapper.selectByExample(rateExample3);
		for (Rate rate : rates) {
			PartsDetailsSelectOutput output = new PartsDetailsSelectOutput();
			output.setPartsDetailsCode(rate.getPartsDetails());
			output.setPartsDetailsName(rate.getPartsDetailsName());
			output.setPartsDetailsNameEn(rate.getPartsDetailsNameEn());
			partsDetailsList.add(output);
		}
		// 去重
		partsDetailsList = partsDetailsList.stream().distinct().collect(Collectors.toList());
		
		basicOutput.setPartsDetailsList(partsDetailsList);
		
		RepairExample repairExample = new RepairExample();
		RepairExample.Criteria repairCriteria = repairExample.createCriteria();
		repairCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Repair> repairs = repairMapper.selectByExample(repairExample);
		// 修理代码列表（箱体）
		List<RepairSelectOutput> repairList = new ArrayList<RepairSelectOutput>();
		CodeCorrespondingExample codeCorrespondingExample = new CodeCorrespondingExample();
		CodeCorrespondingExample.Criteria codeCorrespondingCriteria =  codeCorrespondingExample.createCriteria();
		codeCorrespondingCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 箱体
		codeCorrespondingCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
		List<CodeCorresponding> codeCorrespondings = codeCorrespondingMapper.selectByExample(codeCorrespondingExample);
		for (CodeCorresponding codeCorresponding : codeCorrespondings) {
			RepairSelectOutput output = new RepairSelectOutput();
			output.setPartsDetailsCode(codeCorresponding.getPartsDetailsCode());
			output.setRepairCode(codeCorresponding.getRepairCode());
			// 关联查询prod_repair表，匹配中英文名
			for (Repair repair : repairs) {
				if (repair.getRepairCode().equals(codeCorresponding.getRepairCode())) {
					output.setRepairName(repairs.get(0).getRepairName());
					output.setRepairNameEn(repairs.get(0).getRepairNameEn());
				}
			}
			repairList.add(output);
		}
		basicOutput.setRepairList(repairList);
		
		// 损坏代码列表（箱体）
		List<PartsDetailDamageSelectOutput> partsDetailDamageList = new ArrayList<PartsDetailDamageSelectOutput>();
		for (CodeCorresponding codeCorresponding : codeCorrespondings) {
			String damageStr = codeCorresponding.getDamageCode();
			if (damageStr == null || damageStr == "") {
				continue;
			}
			damageStr = damageStr.replaceAll("\\[", " ").replaceAll("\\]", " ").trim();
			String[] damageArray = damageStr.split("  ");
			for (String damageCode : damageArray) {
				PartsDetailDamageSelectOutput output = new PartsDetailDamageSelectOutput();
				output.setPartsDetailsCode(codeCorresponding.getPartsDetailsCode());
				output.setRepairCode(codeCorresponding.getRepairCode());
				output.setDamageCode(damageCode);
				// 关联prod_damage表，匹配中英文名
				for (Damage damage : damages) {
					if (damage.getDamageCode().equals(damageCode)) {
						output.setDamageName(damage.getDamageName());
						output.setDamageNameEn(damage.getDamageNameEn());
					}
				}
				partsDetailDamageList.add(output);
			}
		}
		basicOutput.setPartsDetailDamageList(partsDetailDamageList);
		
		MaterialExample materialExample = new MaterialExample();
		MaterialExample.Criteria materialCriteria = materialExample.createCriteria();
		materialCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Material> materials = materialMapper.selectByExample(materialExample);
		// 材质代码列表（箱体）
		List<MaterialSelectOutput> materialList = new ArrayList<MaterialSelectOutput>();
		for (CodeCorresponding codeCorresponding : codeCorrespondings) {
			MaterialSelectOutput output = new MaterialSelectOutput();
			output.setPartsDetailsCode(codeCorresponding.getPartsDetailsCode());
			output.setRepairCode(codeCorresponding.getRepairCode());
			output.setMaterialCode(codeCorresponding.getMaterialCode());
			// 关联prod_material表，匹配中英文名
			for (Material material : materials) {
				if (material.getMaterialCode().equals(codeCorresponding.getMaterialCode())) {
					output.setMaterialName(materials.get(0).getMaterialName());
					output.setMaterialNameEn(materials.get(0).getMaterialNameEn());
				}
			}
			materialList.add(output);
		}
		basicOutput.setMaterialList(materialList);
		
		// 部件修理分类列表
		List<PartsRepairTypeSelectOutput> partsRepairTypeList = new ArrayList<PartsRepairTypeSelectOutput>();
		PartsRepairTypeExample partsRepairTypeExample2 = new PartsRepairTypeExample();
		PartsRepairTypeExample.Criteria partsRepairTypeCriteria2 = partsRepairTypeExample2.createCriteria();
		partsRepairTypeCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<PartsRepairType> partsRepairTypes2 = partsRepairTypeMapper.selectByExample(partsRepairTypeExample2);
		for (PartsRepairType partsRepairType : partsRepairTypes2) {
			// 关联parts_repair表，看此分类下是否有数据
			for (PartsRepairSelectOutput item : basicOutput.getPartsRepairList()) {
				if (item.getTypeKey()!=null && item.getTypeKey().equals(partsRepairType.getKey())) {
					PartsRepairTypeSelectOutput output = new PartsRepairTypeSelectOutput();
					output.setType(partsRepairType.getTypeName());
					output.setTypeEn(partsRepairType.getTypeNameEn());
					partsRepairTypeList.add(output);
					break;
				}
			}	
		}
		basicOutput.setPartsRepairTypeList(partsRepairTypeList);
		
//		// 中远五位代码 （放在最后一个）
//		// 1、查询出数据库里所有的五位代码原始记录
//		List<ZyRateSelectOutput> outputList = new ArrayList<ZyRateSelectOutput>();
//		
//		ZyRateExample zyRateExample = new ZyRateExample();
//		com.sanlly.production.entity.ZyRateExample.Criteria zyRateCriteria = zyRateExample.createCriteria();
//		zyRateCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//		List<ZyRate> totalList = zyRateMapper.selectByExample(zyRateExample);
//		
//		RateExample rateExample = new RateExample();
//		com.sanlly.production.entity.RateExample.Criteria rateCriteria = rateExample.createCriteria();
//		rateCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//		rateCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode());
//		// 用枚举里维护的中远的用箱人code取中远的用箱人key，不要问我为什么，问就是设计
//		ContainerUserExample cuExample = new ContainerUserExample();
//		com.sanlly.production.entity.ContainerUserExample.Criteria cuCriteria = cuExample.createCriteria();
//		cuCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//		cuCriteria.andContainerUserCodeEqualTo(RateCommonEnum.CONTAINERUSERKEY3.getCode());
//		List<ContainerUser> cuList = containerUserMapper.selectByExample(cuExample);
//		if (cuList == null || cuList.size() == 0) {
//			// 如果没有中远这个公司还取什么中远五位代码，自然是空集合了
//			basicOutput.setFiveDetailList(outputList);
//			return basicOutput;
//		}
//		rateCriteria.andContainerUserEqualTo(cuList.get(0).getKey());
//		List<Rate> rateList = rateMapper.selectByExample(rateExample);
//		if (rateList == null || rateList.size() == 0) {
//			// 没有对应的费率
//			basicOutput.setFiveDetailList(outputList);
//			return basicOutput;
//		}
//		
//		RateExample rateExample2 = new RateExample();
//		com.sanlly.production.entity.RateExample.Criteria rateCriteria2 = rateExample.createCriteria();
//		rateCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//		List<Rate> allRateList = rateMapper.selectByExample(rateExample2);
//		
//		ContainerTypeExample ctExample = new ContainerTypeExample();
//		com.sanlly.production.entity.ContainerTypeExample.Criteria ctCriteria = ctExample.createCriteria();
//		ctCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//		List<ContainerType> containerTypeList = containerTypeMapper.selectByExample(ctExample);
//		if (containerTypeList == null || containerTypeList.size() == 0) {
//			basicOutput.setFiveDetailList(outputList);
//			return basicOutput;
//		}
//		
//		ContainerSizeExample csExample = new ContainerSizeExample();
//		Criteria csCriteria = csExample.createCriteria();
//		csCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//		List<ContainerSize> sizeList = containerSizeMapper.selectByExample(csExample);
//		if (sizeList == null || sizeList.size() == 0) {
//			basicOutput.setFiveDetailList(outputList);
//			return basicOutput;
//		}
//		
//		// 2、遍历每条记录，取出部件明细代码（parts_details_code）和修理代码（repair_code）的值，找出这两项符合的所有记录
//		if (totalList == null || totalList.size() == 0) {
//			basicOutput.setFiveDetailList(outputList);
//			// 没有记录返回空集合
//			return basicOutput;
//		}
//		for (ZyRate item : totalList) {
//			String partsDetailsCode = item.getPartsDetailsCode();
//			String repairCode = item.getRepairCode();
//			List<ZyRate> matchPrList = new ArrayList<ZyRate>();
//			for (ZyRate ele : totalList) {
//				if (ele.getPartsDetailsCode().equals(partsDetailsCode) && ele.getRepairCode().equals(repairCode) && ele.getIsDel() == 0) {
//					matchPrList.add(ele);
//				}
//			}
//			// 3、去标准费率表里（prod_rate）取标准部件明细代码和维修代码，组合成部件明细维修代码
//			// 取的规则是：找到部件明细维修代码=费率代码的、箱类别是干箱的、用箱人是中远的、公司key一致的数据的standard_rate，
//			// 再找prod_rate_id是standard_rate的数据的部件明细代码和维修代码，如果没有则放弃该item
//		
//			rateCriteria.andRateCodeEqualTo(item.getPartsDetailsCode()+item.getRepairCode());
//			rateCriteria.andCompanyEqualTo(item.getCompany());
//			String standardRate = null;
//			for (Rate ele : rateList) {
//				if (ele.getRateCode().equals(item.getPartsDetailsCode()+item.getRepairCode())) {
//					// 由业务决定部件明细维修代码、箱类别是干箱、用箱人、公司，可以唯一确定一个标准费率
//					standardRate = ele.getStandardRate();
//					break;
//				}
//			}
//			if (standardRate == null) {
//				// 如果没有匹配到，就放弃
//				continue;
//			}
//			Rate rate = null;
//			for (Rate ele : allRateList) {
//				if (ele.getProdRateId().equals(standardRate)) {
//					rate = ele;
//					break;
//				}
//			}
//			if (rate == null) {
//				// 如果没有匹配到，就放弃
//				continue;
//			}
//			// 标准部件明细维修代码
//			String partsRepairCode = rate.getPartsDetails()+rate.getRepair();
//			// 4、开始拼接组装数据
//			// 因为是用matchPrList中的数据的字段作为查询条件，所以结果集中至少会有matchPrList中的数据，所以此处不必做非空判断
//			for (ZyRate item2 :matchPrList) {
//				ZyRateSelectOutput output = new ZyRateSelectOutput();
//				output.setFiveCode(item.getCosRateCode());
//				output.setFiveCodeTrue(item2.getCosRateCode());
//				output.setPartsRepairCode(partsRepairCode);
//				output.setContainerType(item2.getContainerType());
//				output.setSize(item2.getSize());
//				output.setManHourCost(StringUtil.doubleToEffectString(item.getManHour()));
//				output.setMaterialCost(StringUtil.bigDecimalToEffectString(item.getMaterialCost()));
//				output.setIsMustPhoto(item.getIsMustPhoto());
//				ContainerType containerType = null;
//				// 根据箱型key找名字
//				for (ContainerType ele : containerTypeList) {
//					if (ele.getKey().equals(item2.getContainerType())) {
//						containerType = ele;
//						break;
//					}
//				}
//				if (containerType != null) {
//					// 由于key是唯一的，ctList中只能有一条数据
//					output.setContainerTypeName(containerType.getContainerTypeName());
//					output.setContainerTypeNameEn(containerType.getContainerTypeNameEn());
//				}
//				// 根据尺寸key找名字
//				ContainerSize size = null;
//				// 根据箱型key找名字
//				for (ContainerSize ele : sizeList) {
//					if (ele.getKey().equals(item2.getSize())) {
//						size = ele;
//						break;
//					}
//				}
//				if (size != null) {
//					output.setSizeName(size.getSizeName());
//					output.setSizeNameEn(size.getSizeNameEn());
//				}
//				output.setPositionCode(item2.getPositionCode());
//				output.setLength(item2.getLength());
//				output.setWidth(item2.getWidth());
//				output.setQuantity(item2.getQuantity());
//				outputList.add(output);
//			}
//		}
//		basicOutput.setFiveDetailList(outputList);
		// 返回结果
		return basicOutput;	
	}
	
}
