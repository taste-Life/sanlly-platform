package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 汇率表
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午2:12:19 
* @version V1.0   
 */
public class BaseExchangeRateOutput {
	//主键
    private Integer exchangeRateId;
    //年月
    private String rateYearMonth;
    //币种
    private String currencyType;
    //汇率
    private BigDecimal exchangeRate;
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
    //创建用户
    private String createUserName;
    //更新用户
    private String updateUserName;
    
	//是否启用
    private String isEnabledNameLang;

    public Integer getExchangeRateId() {
        return exchangeRateId;
    }

    public void setExchangeRateId(Integer exchangeRateId) {
        this.exchangeRateId = exchangeRateId;
    }

    public String getRateYearMonth() {
        return rateYearMonth;
    }

    public void setRateYearMonth(String rateYearMonth) {
        this.rateYearMonth = rateYearMonth == null ? null : rateYearMonth.trim();
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
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
    
}