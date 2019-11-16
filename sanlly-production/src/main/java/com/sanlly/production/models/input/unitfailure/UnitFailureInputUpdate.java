package com.sanlly.production.models.input.unitfailure;

/**
 * @author zhq
 * @date 2019/11/1
 * @description
 */
public class UnitFailureInputUpdate extends UnitFailureInputAdd {

    private Integer prodUnitFailureId;

    public Integer getProdUnitFailureId() {
        return prodUnitFailureId;
    }

    public void setProdUnitFailureId(Integer prodUnitFailureId) {
        this.prodUnitFailureId = prodUnitFailureId;
    }
}
