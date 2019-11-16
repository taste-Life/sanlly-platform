package com.sanlly.production.models.input.containerTesting;

import com.sanlly.production.models.input.unitTesting.UnitBasicAddInput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.app.containerTesting 
 * @Description: TODO 箱体进场全部实体-输入
 * @author tianzhl   
 * @date 2019年8月9日 下午5:00:23 
 * @version V1.0   
 */
public class ContainerCourseAllInput {

	// TODO 箱体进场信息
	private ContainerCourseInput container;

	// TODO 机组进场信息
	private UnitBasicAddInput unit;

	public ContainerCourseInput getContainer() {
		return container;
	}

	public UnitBasicAddInput getUnit() {
		return unit;
	}

	public void setContainer(ContainerCourseInput container) {
		this.container = container;
	}

	public void setUnit(UnitBasicAddInput unit) {
		this.unit = unit;
	}

}
