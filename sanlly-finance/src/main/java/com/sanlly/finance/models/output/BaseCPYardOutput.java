package com.sanlly.finance.models.output;

import java.util.Date;
/**
 * 成本中心和场站对应表
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午2:11:21 
* @version V1.0   
 */
public class BaseCPYardOutput {
	//主键
    private Integer id;
	//成本中心配置id
    private String cpKey;
	//场站
    private String yard;
	//公司
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
	//成本中心
    private String cpNameNameLang;

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

	public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
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

	public String getCpNameNameLang() {
		return cpNameNameLang;
	}

	public void setCpNameNameLang(String cpNameNameLang) {
		this.cpNameNameLang = cpNameNameLang;
	}


    
}