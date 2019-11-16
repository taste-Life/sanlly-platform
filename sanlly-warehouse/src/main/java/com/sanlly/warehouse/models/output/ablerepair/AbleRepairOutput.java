package com.sanlly.warehouse.models.output.ablerepair;

/**
 * @author lishzh
 */
public class AbleRepairOutput {

    private Integer wareAbleRepairId;

    private String spareParts;

    private String sparePartsLangLang;

    private String sparePartsNo;

    private String isValid;

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public Integer getWareAbleRepairId() {
        return wareAbleRepairId;
    }

    public void setWareAbleRepairId(Integer wareAbleRepairId) {
        this.wareAbleRepairId = wareAbleRepairId;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
