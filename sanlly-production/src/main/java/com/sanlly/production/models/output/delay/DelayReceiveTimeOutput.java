package com.sanlly.production.models.output.delay;

public class DelayReceiveTimeOutput {
    private Integer prodDelayReceiveTimeId;

    private String companyLang;

    private String containerTypeLang;

    private Integer receiveTime;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdDelayReceiveTimeId() {
        return prodDelayReceiveTimeId;
    }

    public void setProdDelayReceiveTimeId(Integer prodDelayReceiveTimeId) {
        this.prodDelayReceiveTimeId = prodDelayReceiveTimeId;
    }

    public String getCompanyLang() {
        return companyLang;
    }

    public void setCompanyLang(String companyLang) {
        this.companyLang = companyLang;
    }

    public String getContainerTypeLang() {
        return containerTypeLang;
    }

    public void setContainerTypeLang(String containerTypeLang) {
        this.containerTypeLang = containerTypeLang;
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
