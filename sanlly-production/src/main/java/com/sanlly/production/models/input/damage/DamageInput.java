package com.sanlly.production.models.input.damage;

import java.util.Date;

public class DamageInput {
    private Integer prodDamageId;

    private String key;

    private String containerCategory;

    private String damageCode;

    private String damageName;

    private String damageNameEn;

    private Integer useNumber;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdDamageId() {
        return prodDamageId;
    }

    public void setProdDamageId(Integer prodDamageId) {
        this.prodDamageId = prodDamageId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getDamageCode() {
        return damageCode;
    }

    public void setDamageCode(String damageCode) {
        this.damageCode = damageCode == null ? null : damageCode.trim();
    }

    public String getDamageName() {
        return damageName;
    }

    public void setDamageName(String damageName) {
        this.damageName = damageName == null ? null : damageName.trim();
    }

    public String getDamageNameEn() {
        return damageNameEn;
    }

    public void setDamageNameEn(String damageNameEn) {
        this.damageNameEn = damageNameEn == null ? null : damageNameEn.trim();
    }

    public Integer getUseNumber() {
        return useNumber;
    }

    public void setUseNumber(Integer useNumber) {
        this.useNumber = useNumber;
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
