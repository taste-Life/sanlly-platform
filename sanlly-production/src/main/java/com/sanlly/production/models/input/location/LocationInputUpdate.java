package com.sanlly.production.models.input.location;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public class LocationInputUpdate extends LocationInputAdd {
    private Integer prodLocationId;

    public Integer getProdLocationId() {
        return prodLocationId;
    }

    public void setProdLocationId(Integer prodLocationId) {
        this.prodLocationId = prodLocationId;
    }
}
