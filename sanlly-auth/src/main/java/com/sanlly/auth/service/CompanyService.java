package com.sanlly.auth.service;

import java.util.List;

import com.sanlly.common.models.output.company.CompanyDetailOutput;

/**
 * 公司接口
 * @author RexSheng
 * 2019年8月16日 上午9:48:05
 */
public interface CompanyService {

	/**
	 * 获取公司列表
	 * @param companyName
	 * @return
	 */
	List<CompanyDetailOutput> getAllCompanyList(String companyName);
	/**
	 * 根据公司key取得公司信息
	 */
	CompanyDetailOutput getCompanyByKey(String key);
}
