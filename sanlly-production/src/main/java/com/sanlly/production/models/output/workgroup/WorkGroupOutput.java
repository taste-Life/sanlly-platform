package com.sanlly.production.models.output.workgroup;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/10/25
 * @description 工作组类别配置查询响应实体
 */
public class WorkGroupOutput {
    private Integer prodWorkGroupId;

    private String code;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String company;

    private String companyNameLang;

    public String getCompanyNameLang() {
        return companyNameLang;
    }

    public void setCompanyNameLang(String companyNameLang) {
        this.companyNameLang = companyNameLang;
    }

    private String yard;

    private String yardNameLang;

    private String prodDept;

    private String prodDeptNameLang;

    private String workGroupType;

    private String workGroupTypeNameLang;

    public String getYardNameLang() {
        return yardNameLang;
    }

    public void setYardNameLang(String yardNameLang) {
        this.yardNameLang = yardNameLang;
    }

    public String getProdDeptNameLang() {
        return prodDeptNameLang;
    }

    public void setProdDeptNameLang(String prodDeptNameLang) {
        this.prodDeptNameLang = prodDeptNameLang;
    }

    public String getWorkGroupTypeNameLang() {
        return workGroupTypeNameLang;
    }

    public void setWorkGroupTypeNameLang(String workGroupTypeNameLang) {
        this.workGroupTypeNameLang = workGroupTypeNameLang;
    }

    private Integer user;

    private String userName;

    private String type;

    private String typeNameLang;

    private String location;

    private Integer workHourTop;

    private Integer workHourBottom;

    private String title;

    private Integer isValid;

    private Integer isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getTypeNameLang() {
        return typeNameLang;
    }

    public void setTypeNameLang(String typeNameLang) {
        this.typeNameLang = typeNameLang;
    }

    public Integer getProdWorkGroupId() {
        return prodWorkGroupId;
    }

    public void setProdWorkGroupId(Integer prodWorkGroupId) {
        this.prodWorkGroupId = prodWorkGroupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getProdDept() {
        return prodDept;
    }

    public void setProdDept(String prodDept) {
        this.prodDept = prodDept;
    }

    public String getWorkGroupType() {
        return workGroupType;
    }

    public void setWorkGroupType(String workGroupType) {
        this.workGroupType = workGroupType;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getWorkHourTop() {
        return workHourTop;
    }

    public void setWorkHourTop(Integer workHourTop) {
        this.workHourTop = workHourTop;
    }

    public Integer getWorkHourBottom() {
        return workHourBottom;
    }

    public void setWorkHourBottom(Integer workHourBottom) {
        this.workHourBottom = workHourBottom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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
}
