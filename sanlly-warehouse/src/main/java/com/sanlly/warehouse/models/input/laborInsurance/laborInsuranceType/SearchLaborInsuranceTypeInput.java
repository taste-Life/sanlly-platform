package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: SearchLaborInsuranceTypeInput
 * Description: 查询劳保类别信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class SearchLaborInsuranceTypeInput extends PageInput{
    //劳保类别名称
    private String sparepartsCategoriesDetailsName;
    	
	public String getSparepartsCategoriesDetailsName() {
		return sparepartsCategoriesDetailsName;
	}

	public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
		this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
	}

	public SearchLaborInsuranceTypeInput() {
		super();
	}

	public SearchLaborInsuranceTypeInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
    
    
}
