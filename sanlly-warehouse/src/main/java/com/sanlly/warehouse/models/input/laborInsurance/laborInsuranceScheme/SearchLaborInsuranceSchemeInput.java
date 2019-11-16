package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: SearchLaborInsuranceSchemeInput
 * Description: 查询劳保方案信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class SearchLaborInsuranceSchemeInput extends PageInput{
	//方案名称
	private String laborInsuranceName;
	//创建时间	
	private Date createTime;

	public String getLaborInsuranceName() {
		return laborInsuranceName;
	}

	public void setLaborInsuranceName(String laborInsuranceName) {
		this.laborInsuranceName = laborInsuranceName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public SearchLaborInsuranceSchemeInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchLaborInsuranceSchemeInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}	
	
}
