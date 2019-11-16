package com.sanlly.production.models.input.yardZone;

/**
 * @author zhq
 * @date 2019/11/4
 * @description
 */
public class YardZoneInputUpdate extends YardZoneInputAdd {
    private Integer prodYardZoneId;

    public Integer getProdYardZoneId() {
        return prodYardZoneId;
    }

    public void setProdYardZoneId(Integer prodYardZoneId) {
        this.prodYardZoneId = prodYardZoneId;
    }
}
