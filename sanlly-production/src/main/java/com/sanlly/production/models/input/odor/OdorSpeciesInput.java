package com.sanlly.production.models.input.odor;

public class OdorSpeciesInput {
    private Integer prodOdorSpeciesId;

    private String key;

    private String odorSpeciesCode;

    private String odorSpeciesName;

    private String odorSpeciesNameEn;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdOdorSpeciesId() {
        return prodOdorSpeciesId;
    }

    public void setProdOdorSpeciesId(Integer prodOdorSpeciesId) {
        this.prodOdorSpeciesId = prodOdorSpeciesId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getOdorSpeciesCode() {
        return odorSpeciesCode;
    }

    public void setOdorSpeciesCode(String odorSpeciesCode) {
        this.odorSpeciesCode = odorSpeciesCode == null ? null : odorSpeciesCode.trim();
    }

    public String getOdorSpeciesName() {
        return odorSpeciesName;
    }

    public void setOdorSpeciesName(String odorSpeciesName) {
        this.odorSpeciesName = odorSpeciesName == null ? null : odorSpeciesName.trim();
    }

    public String getOdorSpeciesNameEn() {
        return odorSpeciesNameEn;
    }

    public void setOdorSpeciesNameEn(String odorSpeciesNameEn) {
        this.odorSpeciesNameEn = odorSpeciesNameEn == null ? null : odorSpeciesNameEn.trim();
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
