package com.sanlly.finance.models.output;

import java.util.Date;
/**
 * 费用基本表
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午2:01:20 
* @version V1.0   
 */
public class BaseChargeOutput {
	//主键ID
    private Integer id;
	//国际化key
    private String langKey;
    //收入成本
    private String chargeInoutType;
	//费用中文名
    private String chargeName;
	//费用英文名
    private String chargeNameEn;
	//费用编码
    private String chargeCode;
	//是否通用
    private String isCommon;
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
    //收入成本类型
    private String chargeInoutTypeNameLang;
	//费用中文名
    private String chargeNameNameLang;
	//是否启用
    private String isEnabledNameLang;
	//是否通用
    private String isCommonNameLang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey == null ? null : langKey.trim();
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName == null ? null : chargeName.trim();
    }

    public String getChargeNameEn() {
        return chargeNameEn;
    }

    public void setChargeNameEn(String chargeNameEn) {
        this.chargeNameEn = chargeNameEn == null ? null : chargeNameEn.trim();
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
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

	public String getIsCommon() {
		return isCommon;
	}

	public void setIsCommon(String isCommon) {
		this.isCommon = isCommon;
	}

	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}

	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}

	public String getIsCommonNameLang() {
		return isCommonNameLang;
	}

	public void setIsCommonNameLang(String isCommonNameLang) {
		this.isCommonNameLang = isCommonNameLang;
	}

	public String getChargeNameNameLang() {
		return chargeNameNameLang;
	}

	public void setChargeNameNameLang(String chargeNameNameLang) {
		this.chargeNameNameLang = chargeNameNameLang;
	}

	public String getChargeInoutType() {
		return chargeInoutType;
	}

	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}

	public String getChargeInoutTypeNameLang() {
		return chargeInoutTypeNameLang;
	}

	public void setChargeInoutTypeNameLang(String chargeInoutTypeNameLang) {
		this.chargeInoutTypeNameLang = chargeInoutTypeNameLang;
	}

 

 
	
    
}