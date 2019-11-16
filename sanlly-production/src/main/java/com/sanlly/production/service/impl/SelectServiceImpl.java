package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.production.dao.CompanyMapper;
import com.sanlly.production.dao.CompanyUsecontMapper;
import com.sanlly.production.dao.ContainerBelongMapper;
import com.sanlly.production.dao.ContainerGradeMapper;
import com.sanlly.production.dao.ContainerSizeMapper;
import com.sanlly.production.dao.ContainerTypeMapper;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.CourseTypeMapper;
import com.sanlly.production.dao.EdiTypeMapper;
import com.sanlly.production.dao.LangEnumMapper;
import com.sanlly.production.dao.PayingPartyMapper;
import com.sanlly.production.dao.UnitCompanyMapper;
import com.sanlly.production.dao.YardContGradeMapper;
import com.sanlly.production.entity.Company;
import com.sanlly.production.entity.CompanyExample;
import com.sanlly.production.entity.CompanyUsecont;
import com.sanlly.production.entity.CompanyUsecontExample;
import com.sanlly.production.entity.ContainerBelong;
import com.sanlly.production.entity.ContainerBelongExample;
import com.sanlly.production.entity.ContainerGrade;
import com.sanlly.production.entity.ContainerGradeExample;
import com.sanlly.production.entity.ContainerSize;
import com.sanlly.production.entity.ContainerSizeExample;
import com.sanlly.production.entity.ContainerType;
import com.sanlly.production.entity.ContainerTypeExample;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.CourseType;
import com.sanlly.production.entity.CourseTypeExample;
import com.sanlly.production.entity.EdiType;
import com.sanlly.production.entity.EdiTypeExample;
import com.sanlly.production.entity.LangEnum;
import com.sanlly.production.entity.LangEnumExample;
import com.sanlly.production.entity.PayingParty;
import com.sanlly.production.entity.PayingPartyExample;
import com.sanlly.production.entity.PayingPartyExample.Criteria;
import com.sanlly.production.entity.UnitCompany;
import com.sanlly.production.entity.UnitCompanyExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardContGrade;
import com.sanlly.production.entity.YardContGradeExample;
import com.sanlly.production.models.output.BaseSelectOutput;
import com.sanlly.production.models.output.SelectEnumOutput;
import com.sanlly.production.service.SelectService;

@Service
public class SelectServiceImpl extends BaseServiceImpl implements SelectService {

	@Autowired
	private PayingPartyMapper payingPartyMapper;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private ContainerSizeMapper sizeMapper;
	@Autowired
	private ContainerUserMapper containerUserMapper;
	@Autowired
	private ContainerTypeMapper containerTypeMapper;
	@Autowired
	private ContainerBelongMapper containerBelongMapper;
	@Autowired
	private ContainerGradeMapper containerGradeMapper;
	@Autowired
	private CourseTypeMapper courseTypeMapper;
	@Autowired
	private UnitCompanyMapper unitCompanyMapper;
	@Autowired
	private LangEnumMapper langEnumMapper;
	@Autowired
	private CompanyUsecontMapper cuMapper;
	@Autowired
	private YardContGradeMapper yardContGradeDao;
	@Autowired
	private EdiTypeMapper ediTypeDao;

	/**
	 * 一次性加载下拉选
	 * 
	 * @return
	 */
	public BaseSelectOutput select() {
		BaseSelectOutput bsOutput = new BaseSelectOutput();
		// 付费方
		PayingPartyExample payingPartyExample = new PayingPartyExample();
		Criteria payingPartyCriteria = payingPartyExample.createCriteria();
		payingPartyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<PayingParty> payingParties = payingPartyMapper.selectByExample(payingPartyExample);
		List<SelectOutput> payingPartyList = new ArrayList<SelectOutput>();
		if (payingParties == null || payingParties.size() == 0) {
			bsOutput.setPayingPartyList(payingPartyList);
		} else {
			for (PayingParty item : payingParties) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getPayingPartyCode());
				output.setLabel(item.getPayingPartyName());
				output.setLabelEn(item.getPayingPartyNameEn());
				payingPartyList.add(output);
			}
			bsOutput.setPayingPartyList(payingPartyList);
		}

		// 公司
		CompanyExample companyExample = new CompanyExample();
		com.sanlly.production.entity.CompanyExample.Criteria companyCriteria = companyExample.createCriteria();
		companyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Company> companies = companyMapper.selectByExample(companyExample);
		List<SelectOutput> companyList = new ArrayList<SelectOutput>();
		if (companies == null || companies.size() == 0) {
			bsOutput.setCompanyList(companyList);
		}
		for (Company item : companies) {
			SelectOutput output = new SelectOutput();
			output.setValue(item.getKey());
			output.setLabel(item.getCompanyName());
			output.setLabelEn(item.getCompanyNameEn());
			companyList.add(output);
		}
		bsOutput.setCompanyList(companyList);
		// 场站
		// 调鹏总接口
		List<Yard> yards = getPermittedYards();
		List<SelectOutput> yardList = new ArrayList<SelectOutput>();
		if (yards == null || yards.size() == 0) {
			bsOutput.setYardList(yardList);
		} else {
			for (Yard item : yards) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getYardName());
				output.setLabelEn(item.getYardNameEn());
				yardList.add(output);
			}
			bsOutput.setYardList(yardList);
		}

		// 尺寸
		ContainerSizeExample sizeExample = new ContainerSizeExample();
		com.sanlly.production.entity.ContainerSizeExample.Criteria sizeCriteria = sizeExample.createCriteria();
		sizeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerSize> sizes = sizeMapper.selectByExample(sizeExample);
		List<SelectOutput> sizeList = new ArrayList<SelectOutput>();
		if (sizes == null || sizes.size() == 0) {
			bsOutput.setSizeList(sizeList);
		} else {
			for (ContainerSize item : sizes) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getSizeName());
				output.setLabelEn(item.getSizeNameEn());
				sizeList.add(output);
			}
			bsOutput.setSizeList(sizeList);
		}

		// 用箱人
		// 用箱人与公司具有多对多关联关系
		// 先根据用户确定公司，根据公司选择相关用箱人
		List<SelectOutput> containerUserList = new ArrayList<SelectOutput>();
		String companyKey = getCurrentCompanyKey();
		CompanyUsecontExample cuExample = new CompanyUsecontExample();
		com.sanlly.production.entity.CompanyUsecontExample.Criteria cuCriteria = cuExample.createCriteria();
		cuCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		cuCriteria.andCompanyEqualTo(companyKey);
		List<CompanyUsecont> cuList = cuMapper.selectByExample(cuExample);
		if (cuList == null || cuList.size() == 0) {
			bsOutput.setContainerUserList(containerUserList);
		} else {
			for (CompanyUsecont cu : cuList) {
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
						SelectOutput output = new SelectOutput();
						output.setValue(item.getKey());
						output.setLabel(item.getContainerUserCode());
						output.setLabelEn(item.getContainerUserCode());
						output.setExtend(item.getContainerUserCode());
						containerUserList.add(output);
					}
					bsOutput.setContainerUserList(containerUserList);
				}
			}
		}

		// 箱型
		ContainerTypeExample containerTypeExample = new ContainerTypeExample();
		com.sanlly.production.entity.ContainerTypeExample.Criteria containerTypeCriteria = containerTypeExample
				.createCriteria();
		containerTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerType> containerTypes = containerTypeMapper.selectByExample(containerTypeExample);
		List<SelectOutput> containerTypeList = new ArrayList<SelectOutput>();
		if (containerTypes == null || containerTypes.size() == 0) {
			bsOutput.setContainerTypeList(containerTypeList);
		} else {
			for (ContainerType item : containerTypes) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getContainerTypeName());
				output.setLabelEn(item.getContainerTypeNameEn());
				output.setExtend(item.getContainerCategory());
				containerTypeList.add(output);
			}
			bsOutput.setContainerTypeList(containerTypeList);
		}

		// 箱属
		ContainerBelongExample containerBelongExample = new ContainerBelongExample();
		com.sanlly.production.entity.ContainerBelongExample.Criteria containerBelongCriteria = containerBelongExample
				.createCriteria();
		containerBelongCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerBelong> containerBelongs = containerBelongMapper.selectByExample(containerBelongExample);
		List<SelectOutput> containerBelongList = new ArrayList<SelectOutput>();
		if (containerBelongs == null || containerBelongs.size() == 0) {
			bsOutput.setContainerBelongList(containerBelongList);
		} else {
			for (ContainerBelong item : containerBelongs) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getContainerBelongName());
				output.setLabelEn(item.getContainerBelongNameEn());
				containerBelongList.add(output);
			}
			bsOutput.setContainerBelongList(containerBelongList);
		}

		// 箱等级
		ContainerGradeExample containerGradeExample = new ContainerGradeExample();
		com.sanlly.production.entity.ContainerGradeExample.Criteria containerGradeCriteria = containerGradeExample
				.createCriteria();
		containerGradeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerGrade> containerGrades = containerGradeMapper.selectByExample(containerGradeExample);
		List<SelectOutput> containerGradeList = new ArrayList<SelectOutput>();
		if (containerGrades == null || containerGrades.size() == 0) {
			bsOutput.setContainerGradeList(containerGradeList);
		} else {
			for (ContainerGrade item : containerGrades) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getContainerGradeName());
				output.setLabelEn(item.getContainerGradeNameEn());
				containerGradeList.add(output);
			}
			bsOutput.setContainerGradeList(containerGradeList);
		}

		// 进场类型
		CourseTypeExample courseTypeExample = new CourseTypeExample();
		com.sanlly.production.entity.CourseTypeExample.Criteria courseTypeCriteria = courseTypeExample.createCriteria();
		courseTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<CourseType> courseTypes = courseTypeMapper.selectByExample(courseTypeExample);
		List<SelectOutput> courseTypeList = new ArrayList<SelectOutput>();
		if (courseTypes == null || courseTypes.size() == 0) {
			bsOutput.setCourseTypeList(courseTypeList);
		} else {
			for (CourseType item : courseTypes) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getCourseTypeName());
				output.setLabelEn(item.getCourseTypeNameEn());
				courseTypeList.add(output);
			}
			bsOutput.setCourseTypeList(courseTypeList);
		}

		// 冷机公司
		UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
		com.sanlly.production.entity.UnitCompanyExample.Criteria unitCompanyCriteria = unitCompanyExample
				.createCriteria();
		unitCompanyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitCompany> unitCompanies = unitCompanyMapper.selectByExample(unitCompanyExample);
		List<SelectOutput> unitCompanyList = new ArrayList<SelectOutput>();
		if (unitCompanies == null || unitCompanies.size() == 0) {
			bsOutput.setUnitCompanyList(unitCompanyList);
		} else {
			for (UnitCompany item : unitCompanies) {
				SelectOutput output = new SelectOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getUnitCompanyName());
				output.setLabelEn(item.getUnitCompanyNameEn());
				unitCompanyList.add(output);
			}
			bsOutput.setUnitCompanyList(unitCompanyList);
		}

		// 场站箱等级
		YardContGradeExample yardContGradeExample = new YardContGradeExample();
		String yardKey = getCurrentYardKey();
		List<SelectOutput> yardCategoryList = new ArrayList<SelectOutput>();
		if (yardKey == null) {
			bsOutput.setYardCategoryList(yardCategoryList);
		} else{
			yardContGradeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andYardEqualTo(getCurrentYardKey());
			List<YardContGrade> yardContGrades = yardContGradeDao.selectByExample(yardContGradeExample);
			if (yardContGrades == null || yardContGrades.size() == 0) {
				bsOutput.setYardCategoryList(yardCategoryList);
			} else {
				for (YardContGrade item : yardContGrades) {
					SelectOutput output = new SelectOutput();
					output.setValue(item.getKey());
					output.setLabel(item.getYardContGradeName());
					output.setLabelEn(item.getYardContGradeEn());
					yardCategoryList.add(output);
				}
				bsOutput.setYardCategoryList(yardCategoryList);
			}
		}
		
		//edi类型
		EdiTypeExample ediTypeExample=new EdiTypeExample();
		ediTypeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES);
		List<EdiType> ediTypes = ediTypeDao.selectByExample(ediTypeExample);
		bsOutput.setEdiTypeList(ediTypes.stream().map(a->{
			SelectOutput output = new SelectOutput();
			output.setValue(a.getKey());
			output.setLabel(a.getEdiTypeName());
			output.setLabelEn(a.getEdiTypeNameEn());
			return output;
		}).collect(Collectors.toList()));
		
		
		// 枚举
		LangEnumExample langEnumExample = new LangEnumExample();
		com.sanlly.production.entity.LangEnumExample.Criteria langEnumCriteria = langEnumExample.createCriteria();
		langEnumCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<LangEnum> langEnums = langEnumMapper.selectByExample(langEnumExample);
		List<SelectEnumOutput> enumList = new ArrayList<SelectEnumOutput>();
		Map<String, List<SelectEnumOutput>> enumMap = new HashMap<String, List<SelectEnumOutput>>();
		if (langEnums == null || langEnums.size() == 0) {
			bsOutput.setEnumMap(enumMap);
		} else {
			for (LangEnum item : langEnums) {
				SelectEnumOutput output = new SelectEnumOutput();
				output.setValue(item.getEnumKey());
				output.setLabel(item.getEnumValue());
				output.setLabelEn(item.getEnumValueEn());
				output.setEnumName(item.getEnumName());
				enumList.add(output);
			}
			enumMap = enumList.stream().collect(Collectors.groupingBy(SelectEnumOutput::getEnumName));
			bsOutput.setEnumMap(enumMap);
		}
		return bsOutput;
	}

	/**
	 * 集采平台一次性加载下拉选
	 */
	@Override
	public BaseSelectOutput supplierSelect() {

		BaseSelectOutput bsOutput = new BaseSelectOutput();

		// 公司
		
		CompanyExample companyExample = new CompanyExample();
		com.sanlly.production.entity.CompanyExample.Criteria companyCriteria = companyExample.createCriteria();
		companyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Company> companies = companyMapper.selectByExample(companyExample);
		List<SelectOutput> companyList = new ArrayList<SelectOutput>();
		if (companies == null || companies.size() == 0) {
			bsOutput.setCompanyList(companyList);
		}
		for (Company item : companies) {
			SelectOutput output = new SelectOutput();
			output.setValue(item.getKey());
			output.setLabel(item.getCompanyName());
			output.setLabelEn(item.getCompanyNameEn());
			companyList.add(output);
		}
		bsOutput.setCompanyList(companyList);
		

		// 枚举
		LangEnumExample langEnumExample = new LangEnumExample();
		com.sanlly.production.entity.LangEnumExample.Criteria langEnumCriteria = langEnumExample.createCriteria();
		langEnumCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<LangEnum> langEnums = langEnumMapper.selectByExample(langEnumExample);
		List<SelectEnumOutput> enumList = new ArrayList<SelectEnumOutput>();
		Map<String, List<SelectEnumOutput>> enumMap = new HashMap<String, List<SelectEnumOutput>>();
		if (langEnums == null || langEnums.size() == 0) {
			bsOutput.setEnumMap(enumMap);
		} else {
			for (LangEnum item : langEnums) {
				SelectEnumOutput output = new SelectEnumOutput();
				output.setValue(item.getEnumKey());
				output.setLabel(item.getEnumValue());
				output.setLabelEn(item.getEnumValueEn());
				output.setEnumName(item.getEnumName());
				enumList.add(output);
			}
			enumMap = enumList.stream().collect(Collectors.groupingBy(SelectEnumOutput::getEnumName));
			bsOutput.setEnumMap(enumMap);
		}
		return bsOutput;
	}

}
