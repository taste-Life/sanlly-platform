package com.sanlly.production.models.output.proddept;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/10/24
 * @description
 */
public class ProdDeptOutputSelect {

    private Integer prodProdDeptId;

    private String key;

    private String keyNameLang;

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
        this.key = key;
    }

    public String getKeyNameLang() {
        return keyNameLang;
    }

    public void setKeyNameLang(String keyNameLang) {
        this.keyNameLang = keyNameLang;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getProdDeptName() {
        return prodDeptName;
    }

    public void setProdDeptName(String prodDeptName) {
        this.prodDeptName = prodDeptName;
    }

    public String getProdDeptNameEn() {
        return prodDeptNameEn;
    }

    public void setProdDeptNameEn(String prodDeptNameEn) {
        this.prodDeptNameEn = prodDeptNameEn;
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

    private String company;

    private String yard;

    private String prodDeptName;

    private String prodDeptNameEn;

    private Integer isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private Integer isValid;

}
