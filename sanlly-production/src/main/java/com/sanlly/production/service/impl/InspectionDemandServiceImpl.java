package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.InspectionDemandMapper;
import com.sanlly.production.entity.InspectionDemand;
import com.sanlly.production.entity.InspectionDemandExample;
import com.sanlly.production.entity.InspectionDemandExample.Criteria;
import com.sanlly.production.models.input.inspectionDemand.InspectionDemandSelectInput;
import com.sanlly.production.models.output.inspectionDemand.InspectionDemandSelectOutput;
import com.sanlly.production.service.InspectionDemandService;

/**
 * 
* @Package com.sanlly.production.service.impl 
* @Description: 检验要求 
* @author zhangkai   
* @date 2019年8月28日 下午4:39:14 
* @version V1.0   
 */
@Service
public class InspectionDemandServiceImpl implements InspectionDemandService {
	
	@Autowired
	private InspectionDemandMapper mapper;

	/**
	 * tianzhl要的接口
	 * @author zhangkai
	 */
	@Override
	public List<InspectionDemandSelectOutput> select(InspectionDemandSelectInput input) {
		InspectionDemandExample example = new InspectionDemandExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(input.getCompany());
		criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		criteria.andContainerUserEqualTo(input.getContainerUser());
		List<String> yardList = new ArrayList<String>();
		yardList.add("");
		yardList.add(input.getYard());
		System.out.print(yardList); 
		criteria.andYardIn(yardList);
		List<InspectionDemand> list = mapper.selectByExampleWithBLOBs(example);
		List<InspectionDemandSelectOutput> outputList = new ArrayList<InspectionDemandSelectOutput>();
		if (list == null || list.size() == 0) {
			return outputList;
		}
		for (InspectionDemand item : list) {
			InspectionDemandSelectOutput output = new InspectionDemandSelectOutput();
			output.setCompany(item.getCompany());
			output.setYard(item.getYard());
			output.setDemandContent(new String(item.getDemandContent()));
			outputList.add(output);
		}
		return outputList;
	}

}
