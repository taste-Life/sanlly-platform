package com.sanlly.production.models.output.reason;

public class ReasonOutput {
    private Integer prodReasonId;

    private String key;

    private String reasonType;

    private String reasonContentName;

    private String reasonContentEn;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdReasonId() {
        return prodReasonId;
    }

    public void setProdReasonId(Integer prodReasonId) {
        this.prodReasonId = prodReasonId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getReasonType() {
        return reasonType;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType == null ? null : reasonType.trim();
    }

    public String getReasonContentName() {
        return reasonContentName;
    }

    public void setReasonContentName(String reasonContentName) {
        this.reasonContentName = reasonContentName == null ? null : reasonContentName.trim();
    }

    public String getReasonContentEn() {
        return reasonContentEn;
    }

    public void setReasonContentEn(String reasonContentEn) {
        this.reasonContentEn = reasonContentEn == null ? null : reasonContentEn.trim();
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
