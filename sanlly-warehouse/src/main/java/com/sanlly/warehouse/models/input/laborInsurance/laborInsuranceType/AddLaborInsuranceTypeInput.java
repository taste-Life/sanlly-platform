package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType;
/**
 * ClassName: AddLaborInsuranceTypeInput
 * Description: 添加劳保类别信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class AddLaborInsuranceTypeInput {
	//劳保类别名称
	private String sparepartsCategoriesDetailsName;
	//劳保类被名称英文
	private String sparepartsCategoriesDetailsNameEn;

	public String getSparepartsCategoriesDetailsName() {
		return sparepartsCategoriesDetailsName;
	}

	public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
		this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
	}

	public String getSparepartsCategoriesDetailsNameEn() {
		return sparepartsCategoriesDetailsNameEn;
	}

	public void setSparepartsCategoriesDetailsNameEn(String sparepartsCategoriesDetailsNameEn) {
		this.sparepartsCategoriesDetailsNameEn = sparepartsCategoriesDetailsNameEn;
	}
	
	
	
}