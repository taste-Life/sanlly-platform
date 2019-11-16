package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme;

import java.util.List;
/**
 * ClassName: LaborInsuranceSchemeOutput
 * Description: 劳保方案信息输出类
 * date: 2019/8/12 9:50
 *
 * @author zhh
 */
public class LaborInsuranceSchemeOutput {
	//方案key
	private String key;
	//国际化方案key
	private String keyLangLang;
	//方案名称英文
	private String laborInsuranceNameEn;
    //方案名称
    private String laborInsuranceName;
    //创建时间
    private String createTime;
    //修改时间
    private String updateTime;
    //修改人
    private String updateUser;
    //备注
    private String remark;
    //方案明细
    private List<LaborInsuranceSchemeDetailOutput> detailList;
    
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getKeyLangLang() {
		return keyLangLang;
	}
	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}
	public String getLaborInsuranceNameEn() {
		return laborInsuranceNameEn;
	}
	public void setLaborInsuranceNameEn(String laborInsuranceNameEn) {
		this.laborInsuranceNameEn = laborInsuranceNameEn;
	}
	public String getLaborInsuranceName() {
		return laborInsuranceName;
	}
	public void setLaborInsuranceName(String laborInsuranceName) {
		this.laborInsuranceName = laborInsuranceName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
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
    
	

}
