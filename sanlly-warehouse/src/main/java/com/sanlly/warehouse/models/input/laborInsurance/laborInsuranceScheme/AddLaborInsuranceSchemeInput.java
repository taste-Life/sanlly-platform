package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme;

import java.util.List;

import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeDetailOutput;

/**
 * ClassName: AddLaborInsuranceSchemeInput
 * Description: 添加劳保方案信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class AddLaborInsuranceSchemeInput {
    //方案名称
    private String laborInsuranceName;
    //方案名称英文
    private String laborInsuranceNameEn;
    //备注
    private String remark;
    //方案明细
    private List<LaborInsuranceSchemeDetailOutput> detailList;

	public String getLaborInsuranceName() {
		return laborInsuranceName;
	}

	public void setLaborInsuranceName(String laborInsuranceName) {
		this.laborInsuranceName = laborInsuranceName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<LaborInsuranceSchemeDetailOutput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<LaborInsuranceSchemeDetailOutput> detailList) {
		this.detailList = detailList;
	}

	public String getLaborInsuranceNameEn() {
		return laborInsuranceNameEn;
	}

	public void setLaborInsuranceNameEn(String laborInsuranceNameEn) {
		this.laborInsuranceNameEn = laborInsuranceNameEn;
	}
    
    

}
