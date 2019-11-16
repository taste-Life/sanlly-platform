package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme;
/**
 * ClassName: EditLaborInsuranceSchemeInput
 * Description: 修改劳保方案信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class EditLaborInsuranceSchemeInput extends AddLaborInsuranceSchemeInput{
	//方案key
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public EditLaborInsuranceSchemeInput(String key) {
		super();
		this.key = key;
	}

	public EditLaborInsuranceSchemeInput() {
		super();
	}
	

}
