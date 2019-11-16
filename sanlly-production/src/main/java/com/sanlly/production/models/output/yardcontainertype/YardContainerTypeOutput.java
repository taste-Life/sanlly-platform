package com.sanlly.production.models.output.yardcontainertype;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/11/5
 * @description
 */
public class YardContainerTypeOutput {
    private Integer prodYardContainerTypeId;

    private String key;

    private String yard;

    private String yardNameLang;

    private String containerCondition;

    private String containerConditionNameLang;

    private String courseTypeName;

    private String courseTypeNameEn;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdYardContainerTypeId() {
        return prodYardContainerTypeId;
    }

    public void setProdYardContainerTypeId(Integer prodYardContainerTypeId) {
        this.prodYardContainerTypeId = prodYardContainerTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getYardNameLang() {
        return yardNameLang;
    }

    public void setYardNameLang(String yardNameLang) {
        this.yardNameLang = yardNameLang;
    }

    public String getContainerCondition() {
        return containerCondition;
    }

    public void setContainerCondition(String containerCondition) {
        this.containerCondition = containerCondition;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public String getCourseTypeNameEn() {
        return courseTypeNameEn;
    }

    public void setCourseTypeNameEn(String courseTypeNameEn) {
        this.courseTypeNameEn = courseTypeNameEn;
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

    public String getContainerConditionNameLang() {
        return containerConditionNameLang;
    }

    public void setContainerConditionNameLang(String containerConditionNameLang) {
        this.containerConditionNameLang = containerConditionNameLang;
    }
}
