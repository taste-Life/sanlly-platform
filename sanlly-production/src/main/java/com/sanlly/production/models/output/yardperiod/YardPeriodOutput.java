package com.sanlly.production.models.output.yardperiod;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class YardPeriodOutput {
    private Integer prodYardPeroidSettingId;

    private String company;

    private String companyNameLang;

    private String recordingPeroid;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdYardPeroidSettingId() {
        return prodYardPeroidSettingId;
    }

    public void setProdYardPeroidSettingId(Integer prodYardPeroidSettingId) {
        this.prodYardPeroidSettingId = prodYardPeroidSettingId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRecordingPeroid() {
        return recordingPeroid;
    }

    public void setRecordingPeroid(String recordingPeroid) {
        this.recordingPeroid = recordingPeroid;
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
}
