package com.sanlly.finance.models.input;

import java.util.Date;

/**
 * 成本中心和部门对应表
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午2:10:19 
* @version V1.0   
 */
public class BaseCPDeptInput {
	//成本中心和部门对应表
    private Integer id;
	//成本中心配置id
    private String cpKey;
	//生产部门
    private String prodDept;
	//公司key
    private String companyKey;
	//备注
    private String remarks;
	//是否启用
    private String isEnabled;
	//是否删除
    private Integer isDel;
	//创建时间
    private Date createTime;
	//创建用户
    private Integer createUser;
	//更新时间
    private Date updateTime;
	//更新用户
    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  

    public String getCpKey() {
		return cpKey;
	}

	public void setCpKey(String cpKey) {
		this.cpKey = cpKey;
	}

	public String getProdDept() {
        return prodDept;
    }

    public void setProdDept(String prodDept) {
        this.prodDept = prodDept == null ? null : prodDept.trim();
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
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
}