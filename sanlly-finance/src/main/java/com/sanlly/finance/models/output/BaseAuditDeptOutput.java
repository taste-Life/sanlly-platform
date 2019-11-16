package com.sanlly.finance.models.output;

import java.util.Date;
/**
 * 核算部门
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月27日 下午1:35:18 
* @version V1.0   
 */
public class BaseAuditDeptOutput {
	//id
    private Integer id;
    //公司key
    private String companyKey;
    //场站
    private String yard;
    //费用key
    private String chargeKey;
    //箱类别
    private String containerCategory;
    //费用编码
    private String chargeCode;
    //利润中心代码
    private String profitCenterCode;
    //利润中心
    private String profitCenter;
    //利润核算部门
    private String profitDept;
    //成本中心代码
    private String costCenterCode;
    //成本中心
    private String costCenter;
    //成本核算部门
    private String costDept;
    //备注
    private String remarks;
    //是否启用
    private String isEnabled;
    //是否删除
    private Integer isDel;
    //创建时间
    private Date createTime;
    //创建人
    private Integer createUser;
    //修改时间
    private Date updateTime;
    //修改人
    private Integer updateUser;
    
    //创建用户
    private String createUserName;
    //更新用户
    private String updateUserName;
	//是否启用
    private String isEnabledNameLang;
    
    //公司key
    private String companyKeyNameLang;
    //场站
    private String yardNameLang;
    //费用key
    private String chargeKeyNameLang;
    
    //箱类别
    private String containerCategoryNameLang;
    
    //利润中心
    private String profitCenterNameLang;
    //利润核算部门
    private String profitDeptNameLang;
    //成本中心
    private String costCenterNameLang;
    //成本核算部门
    private String costDeptNameLang;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getChargeKey() {
        return chargeKey;
    }

    public void setChargeKey(String chargeKey) {
        this.chargeKey = chargeKey == null ? null : chargeKey.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter == null ? null : profitCenter.trim();
    }

    public String getProfitDept() {
        return profitDept;
    }

    public void setProfitDept(String profitDept) {
        this.profitDept = profitDept == null ? null : profitDept.trim();
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter == null ? null : costCenter.trim();
    }

    public String getCostDept() {
        return costDept;
    }

    public void setCostDept(String costDept) {
        this.costDept = costDept == null ? null : costDept.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}

	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}

	public String getCompanyKeyNameLang() {
		return companyKeyNameLang;
	}

	public void setCompanyKeyNameLang(String companyKeyNameLang) {
		this.companyKeyNameLang = companyKeyNameLang;
	}

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

	public String getChargeKeyNameLang() {
		return chargeKeyNameLang;
	}

	public void setChargeKeyNameLang(String chargeKeyNameLang) {
		this.chargeKeyNameLang = chargeKeyNameLang;
	}

	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}

	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}

	public String getProfitCenterNameLang() {
		return profitCenterNameLang;
	}

	public void setProfitCenterNameLang(String profitCenterNameLang) {
		this.profitCenterNameLang = profitCenterNameLang;
	}

	public String getProfitDeptNameLang() {
		return profitDeptNameLang;
	}

	public void setProfitDeptNameLang(String profitDeptNameLang) {
		this.profitDeptNameLang = profitDeptNameLang;
	}

	public String getCostCenterNameLang() {
		return costCenterNameLang;
	}

	public void setCostCenterNameLang(String costCenterNameLang) {
		this.costCenterNameLang = costCenterNameLang;
	}

	public String getCostDeptNameLang() {
		return costDeptNameLang;
	}

	public void setCostDeptNameLang(String costDeptNameLang) {
		this.costDeptNameLang = costDeptNameLang;
	}

	public String getProfitCenterCode() {
		return profitCenterCode;
	}

	public void setProfitCenterCode(String profitCenterCode) {
		this.profitCenterCode = profitCenterCode;
	}

	public String getCostCenterCode() {
		return costCenterCode;
	}

	public void setCostCenterCode(String costCenterCode) {
		this.costCenterCode = costCenterCode;
	}
	
    
}