package com.sanlly.production.models.input.mustcheckhour;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class MustCheckHourInputUpdate extends MustCheckHourInputAdd {
    private Integer prodMustCheckHourId;

    public Integer getProdMustCheckHourId() {
        return prodMustCheckHourId;
    }

    public void setProdMustCheckHourId(Integer prodMustCheckHourId) {
        this.prodMustCheckHourId = prodMustCheckHourId;
    }
}
