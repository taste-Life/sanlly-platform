package com.sanlly.production.service;

import java.util.List;

import com.sanlly.production.models.output.guarantee.MaintenanceSiteOutput;

public interface MaintenanceSiteService {

	/**
	 * 根据companyKey获取保修地点
	 * @param companyKey
	 * @return
	 * @author zhangkai
	 */
	List<MaintenanceSiteOutput> getMaintenanceSiteByCompanyKey(String companyKey);
}
