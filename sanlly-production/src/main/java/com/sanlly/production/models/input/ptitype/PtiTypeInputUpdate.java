package com.sanlly.production.models.input.ptitype;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public class PtiTypeInputUpdate extends PtiTypeInputAdd {
    private Integer prodPtiTypeId;

    public Integer getProdPtiTypeId() {
        return prodPtiTypeId;
    }

    public void setProdPtiTypeId(Integer prodPtiTypeId) {
        this.prodPtiTypeId = prodPtiTypeId;
    }
}
