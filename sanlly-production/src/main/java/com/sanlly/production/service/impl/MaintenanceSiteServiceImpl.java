package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.MaintenanceSiteMapper;
import com.sanlly.production.entity.MaintenanceSite;
import com.sanlly.production.entity.MaintenanceSiteExample;
import com.sanlly.production.entity.MaintenanceSiteExample.Criteria;
import com.sanlly.production.models.output.guarantee.MaintenanceSiteOutput;
import com.sanlly.production.service.MaintenanceSiteService;

@Service
public class MaintenanceSiteServiceImpl implements MaintenanceSiteService {

	@Autowired
	private MaintenanceSiteMapper maintenanceSiteMapper;
	
	/**
	 * 根据companyKey获取保修地点
	 * @param companyKey
	 * @return
	 * @author zhangkai
	 */
	@Override
	@Transactional
	public List<MaintenanceSiteOutput> getMaintenanceSiteByCompanyKey(String companyKey) {		
		MaintenanceSiteExample example = new MaintenanceSiteExample();
		example.setOrderByClause("create_time DESC");
		Criteria criteria = example.createCriteria();
		criteria.andCompanyEqualTo(companyKey);
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<MaintenanceSite> list = maintenanceSiteMapper.selectByExample(example);
		List<MaintenanceSiteOutput> outputList = new ArrayList<MaintenanceSiteOutput>();
		for (MaintenanceSite item : list) {
			MaintenanceSiteOutput output = new MaintenanceSiteOutput();
			output.setMaintenanceSiteLang(item.getKey());
			output.setMaintenanceSiteKey(item.getKey());
			outputList.add(output);
		}
		return outputList;
	}

}
