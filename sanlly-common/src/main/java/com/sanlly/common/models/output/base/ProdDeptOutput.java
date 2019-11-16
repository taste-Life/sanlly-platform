package com.sanlly.common.models.output.base;

import java.util.Date;
/**
 * 产生部门实体
* @Package com.sanlly.common.models.output.base 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午4:47:41 
* @version V1.0   
 */
public class ProdDeptOutput {
    private Integer prodProdDeptId;

    private String key;
    //公司
    private String company;
    //场站
    private String yard;
    //中文名称
    private String prodDeptName;
    //英文名称
    private String prodDeptNameEn;

    private Integer isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;
    //是否有效
    private Integer isValid;
    //公司
    private String companyNameLang;
    //场站
    private String yardNameLang;
    
    private String prodDeptNameNameLang;
    

    public Integer getProdProdDeptId() {
        return prodProdDeptId;
    }

    public void setProdProdDeptId(Integer prodProdDeptId) {
        this.prodProdDeptId = prodProdDeptId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getProdDeptName() {
        return prodDeptName;
    }

    public void setProdDeptName(String prodDeptName) {
        this.prodDeptName = prodDeptName == null ? null : prodDeptName.trim();
    }

    public String getProdDeptNameEn() {
        return prodDeptNameEn;
    }

    public void setProdDeptNameEn(String prodDeptNameEn) {
        this.prodDeptNameEn = prodDeptNameEn == null ? null : prodDeptNameEn.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

	public String getProdDeptNameNameLang() {
		return prodDeptNameNameLang;
	}

	public void setProdDeptNameNameLang(String prodDeptNameNameLang) {
		this.prodDeptNameNameLang = prodDeptNameNameLang;
	}
    
}