package com.sanlly.production.models.input.yardcontainertype;

/**
 * @author zhq
 * @date 2019/11/5
 * @description
 */
public class YardContainerTypeInputUpdate extends YardContainerTypeInputAdd {
    private Integer prodYardContainerTypeId;

    public Integer getProdYardContainerTypeId() {
        return prodYardContainerTypeId;
    }

    public void setProdYardContainerTypeId(Integer prodYardContainerTypeId) {
        this.prodYardContainerTypeId = prodYardContainerTypeId;
    }
}
