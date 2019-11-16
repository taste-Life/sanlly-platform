package com.sanlly.warehouse.models.input.laborInsurance;
/**
 * ClassName: EditLaborInsuranceInput
 * Description: 修改劳保信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class EditLaborInsuranceInput extends AddLaborInsuranceInput{
	//劳保信息key
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	

}
