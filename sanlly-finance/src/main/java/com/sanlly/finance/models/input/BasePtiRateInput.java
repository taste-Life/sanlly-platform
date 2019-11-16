package com.sanlly.finance.models.input;

import java.math.BigDecimal;
import java.util.Date;
/**
 * PTI费率表费率表
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午2:16:12 
* @version V1.0   
 */
public class BasePtiRateInput {
	//主键
    private Integer id;
	//公司key
    private String companyKey;
	//用箱人
    private String containerUser;
	//场站key
    private String yard;
	//箱型尺寸
    private String containerSize;
	//PTI类型
    private String ptiType;
	//币种
    private String currencyType;
	//应收
    private BigDecimal receivable;
	//启用应收公式 0 :无 1：用
    private String isFormulaYs;
	//应收计算方式
    private String computeFormulaYs;
	//应收币种
    private String currencyTypeYs;
	//应收操作值
    private String optionValueYs;
    //应付币种
    private String payCurrencyType;
	//应付
    private BigDecimal payFee;
	//启用应付公式 0 :无 1：用
    private String isFormulaYf;
	//应付计算方式
    private String computeFormulaYf;
	//应付币种
    private String currencyTypeYf;
	//应付操作值
    private String optionValueYf;
	//
    private String freeStatus;
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

    private Integer status;

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

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize == null ? null : containerSize.trim();
    }

    public String getPtiType() {
        return ptiType;
    }

    public void setPtiType(String ptiType) {
        this.ptiType = ptiType == null ? null : ptiType.trim();
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public BigDecimal getReceivable() {
        return receivable;
    }

    public void setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
    }



    public String getComputeFormulaYs() {
        return computeFormulaYs;
    }

    public void setComputeFormulaYs(String computeFormulaYs) {
        this.computeFormulaYs = computeFormulaYs == null ? null : computeFormulaYs.trim();
    }

    public String getCurrencyTypeYs() {
        return currencyTypeYs;
    }

    public void setCurrencyTypeYs(String currencyTypeYs) {
        this.currencyTypeYs = currencyTypeYs == null ? null : currencyTypeYs.trim();
    }

    public String getOptionValueYs() {
        return optionValueYs;
    }

    public void setOptionValueYs(String optionValueYs) {
        this.optionValueYs = optionValueYs == null ? null : optionValueYs.trim();
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getComputeFormulaYf() {
        return computeFormulaYf;
    }

    public void setComputeFormulaYf(String computeFormulaYf) {
        this.computeFormulaYf = computeFormulaYf == null ? null : computeFormulaYf.trim();
    }

    public String getCurrencyTypeYf() {
        return currencyTypeYf;
    }

    public void setCurrencyTypeYf(String currencyTypeYf) {
        this.currencyTypeYf = currencyTypeYf == null ? null : currencyTypeYf.trim();
    }

    public String getOptionValueYf() {
        return optionValueYf;
    }

    public void setOptionValueYf(String optionValueYf) {
        this.optionValueYf = optionValueYf == null ? null : optionValueYf.trim();
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

    public String getFreeStatus() {
        return freeStatus;
    }

    public void setFreeStatus(String freeStatus) {
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	public String getIsFormulaYs() {
		return isFormulaYs;
	}

	public void setIsFormulaYs(String isFormulaYs) {
		this.isFormulaYs = isFormulaYs;
	}

	public String getIsFormulaYf() {
		return isFormulaYf;
	}

	public void setIsFormulaYf(String isFormulaYf) {
		this.isFormulaYf = isFormulaYf;
	}

	public String getPayCurrencyType() {
		return payCurrencyType;
	}

	public void setPayCurrencyType(String payCurrencyType) {
		this.payCurrencyType = payCurrencyType;
	}
    
}