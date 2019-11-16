package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.FaultTypeOutput;
import com.sanlly.production.dao.UnitFailureMapper;
import com.sanlly.production.entity.UnitFailure;
import com.sanlly.production.entity.UnitFailureExample;
import com.sanlly.production.entity.UnitFailureExample.Criteria;
import com.sanlly.production.service.FaultTypeService;

@Service
public class FaultTypeServiceImpl implements FaultTypeService {
	
	@Autowired
	private UnitFailureMapper unitFailureMapper;
	@Autowired
	private LangServiceImpl lang;
	
	public List<FaultTypeOutput> list() {
		UnitFailureExample example = new UnitFailureExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitFailure> list = unitFailureMapper.selectByExample(example);
		List<FaultTypeOutput> outputs = new ArrayList<FaultTypeOutput>();
		if (list == null || list.size() == 0) {
			return outputs;
		} 
		for (UnitFailure item : list) {
			FaultTypeOutput output = new FaultTypeOutput();
			BeanUtils.copyProperties(item, output);
			output.setKeyNameLang(item.getKey());
			outputs.add(output);
		}
		return outputs;
	}
 
}
