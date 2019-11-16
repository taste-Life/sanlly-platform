package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.entity.YardExample.Criteria;
import com.sanlly.production.service.ProdYardService;

@Service
public class ProdYardServiceImpl implements ProdYardService {
	
	@Autowired
	private YardMapper prodYardMapper;

	/**
	 * 根据companyKey获取该公司下的所有场站
	 * @author zhangkai
	 */
	@Override
	public List<YardOutput> getYardListByCompanyKey(String companyKey) {
		List<YardOutput> outputList = new ArrayList<YardOutput>();
		YardExample example = new YardExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompanyEqualTo(companyKey);
		List<Yard> list = prodYardMapper.selectByExample(example);
		for (Yard item : list) {
			YardOutput output = new YardOutput();
			BeanUtils.copyProperties(item, output);
			output.setKeyNameLang(item.getKey());
			output.setCreateTime(DateUtil.date2String(item.getCreateTime()));
			output.setUpdateTime(DateUtil.date2String(item.getUpdateTime()));
			outputList.add(output);
		}
		return outputList;
	}

}
