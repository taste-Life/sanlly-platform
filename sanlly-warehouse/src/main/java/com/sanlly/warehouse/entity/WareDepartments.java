package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareDepartments {
    private Integer wareDepartmentsId;

    private String key;

    private String departmentsNameEn;

    private String departmentsName;

    private String company;

    private Integer isDel;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareDepartmentsId() {
        return wareDepartmentsId;
    }

    public void setWareDepartmentsId(Integer wareDepartmentsId) {
        this.wareDepartmentsId = wareDepartmentsId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getDepartmentsNameEn() {
        return departmentsNameEn;
    }

    public void setDepartmentsNameEn(String departmentsNameEn) {
        this.departmentsNameEn = departmentsNameEn == null ? null : departmentsNameEn.trim();
    }

    public String getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(String departmentsName) {
        this.departmentsName = departmentsName == null ? null : departmentsName.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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