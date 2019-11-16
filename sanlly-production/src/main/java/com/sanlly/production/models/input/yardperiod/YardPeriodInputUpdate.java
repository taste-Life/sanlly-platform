package com.sanlly.production.models.input.yardperiod;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class YardPeriodInputUpdate extends YardPeriodInputAdd {
    private Integer prodYardPeroidSettingId;

    public Integer getProdYardPeroidSettingId() {
        return prodYardPeroidSettingId;
    }

    public void setProdYardPeroidSettingId(Integer prodYardPeroidSettingId) {
        this.prodYardPeroidSettingId = prodYardPeroidSettingId;
    }
}
