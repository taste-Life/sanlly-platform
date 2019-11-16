package com.sanlly.production.models.input.delay;

public class DelayReceiveTimeInput {

    private Integer prodDelayReceiveTimeId;

    private String company;

    private String containerType;

    private Integer receiveTime;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdDelayReceiveTimeId() {
        return prodDelayReceiveTimeId;
    }

    public void setProdDelayReceiveTimeId(Integer prodDelayReceiveTimeId) {
        this.prodDelayReceiveTimeId = prodDelayReceiveTimeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public Integer getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Integer receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
