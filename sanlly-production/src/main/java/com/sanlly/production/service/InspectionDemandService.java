package com.sanlly.production.service;

import java.util.List;

import com.sanlly.production.models.input.inspectionDemand.InspectionDemandSelectInput;
import com.sanlly.production.models.output.inspectionDemand.InspectionDemandSelectOutput;

/**
 * 
* @Package com.sanlly.production.service 
* @Description: 检验要求 
* @author zhangkai   
* @date 2019年8月28日 下午3:28:59 
* @version V1.0   
 */
public interface InspectionDemandService {
	
	/**
	 * tianzhl要的接口
	 * @author zhangkai
	 */
	List<InspectionDemandSelectOutput> select(InspectionDemandSelectInput input);

}
