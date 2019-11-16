package com.sanlly.auth.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.auth.dao.CompanyMapper;
import com.sanlly.auth.entity.Company;
import com.sanlly.auth.entity.CompanyExample;
import com.sanlly.auth.service.CompanyService;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.company.CompanyDetailOutput;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyMapper companyDao;
	
	@Override
	public List<CompanyDetailOutput> getAllCompanyList(String companyName) {
		CompanyExample example=new CompanyExample();
		CompanyExample.Criteria criteria=example.createCriteria();
		if(StringUtils.isNotEmpty(companyName)) {
			criteria.andCompanyNameLike("%"+companyName+"%");
		}
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");
		//执行查询
		List<Company> companyList=companyDao.selectByExample(example);
		return companyList.stream().map(a->{
			CompanyDetailOutput output=new CompanyDetailOutput();
			output.setCompanyId(a.getProdCompanyId());
			output.setCompanyName(a.getCompanyName());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 根据公司key取得公司信息
	 */
	@Override
	public CompanyDetailOutput getCompanyByKey(String key) {
		CompanyExample example=new CompanyExample();
		CompanyExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andKeyEqualTo(key);
		//执行查询
		List<Company> companyList=companyDao.selectByExample(example);
		if(companyList.size()==1) {
			CompanyDetailOutput output=new CompanyDetailOutput();
			output.setCompanyId(companyList.get(0).getProdCompanyId());
			output.setCompanyKey(key);
			output.setCompanyName(companyList.get(0).getCompanyName());
			return output;
		}
		return null;
	}

}
