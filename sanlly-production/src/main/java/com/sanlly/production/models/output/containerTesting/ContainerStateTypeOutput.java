package com.sanlly.production.models.output.containerTesting;

import com.sanlly.common.models.output.SelectOutput;


/**   
* @Package com.sanlly.production.models.output.containerTesting 
* @Description: TODO 好坏箱类型
* @author tianzhl   
* @date 2019年8月20日 下午8:01:13 
* @version V1.0   
*/
public class ContainerStateTypeOutput extends SelectOutput {

	// TODO 箱况
	private String containerCondition;

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}
	

}
