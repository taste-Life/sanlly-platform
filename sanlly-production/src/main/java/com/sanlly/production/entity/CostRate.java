package com.sanlly.production.entity;

import java.util.Date;

public class CostRate {
    private String prodCostRateId;

    private String rateId;

    private String positionCode;

    private String size;

    private String containerType;

    private String sparesType;

    private String spares;

    private String useAlgorithm;

    private String useCoefficientOne;

    private String useCoefficientTwo;

    private Double useConstant;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public String getProdCostRateId() {
        return prodCostRateId;
    }

    public void setProdCostRateId(String prodCostRateId) {
        this.prodCostRateId = prodCostRateId == null ? null : prodCostRateId.trim();
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId == null ? null : rateId.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getSparesType() {
        return sparesType;
    }

    public void setSparesType(String sparesType) {
        this.sparesType = sparesType == null ? null : sparesType.trim();
    }

    public String getSpares() {
        return spares;
    }

    public void setSpares(String spares) {
        this.spares = spares == null ? null : spares.trim();
    }

    public String getUseAlgorithm() {
        return useAlgorithm;
    }

    public void setUseAlgorithm(String useAlgorithm) {
        this.useAlgorithm = useAlgorithm == null ? null : useAlgorithm.trim();
    }

    public String getUseCoefficientOne() {
        return useCoefficientOne;
    }

    public void setUseCoefficientOne(String useCoefficientOne) {
        this.useCoefficientOne = useCoefficientOne == null ? null : useCoefficientOne.trim();
    }

    public String getUseCoefficientTwo() {
        return useCoefficientTwo;
    }

    public void setUseCoefficientTwo(String useCoefficientTwo) {
        this.useCoefficientTwo = useCoefficientTwo == null ? null : useCoefficientTwo.trim();
    }

    public Double getUseConstant() {
        return useConstant;
    }

    public void setUseConstant(Double useConstant) {
        this.useConstant = useConstant;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}