package com.sanlly.production.models.input.qualitycontrol;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class QualityControlTimeInputUpdate extends QualityControlTimeInputAdd {
    private Integer prodQualityControlTimeId;

    public Integer getProdQualityControlTimeId() {
        return prodQualityControlTimeId;
    }

    public void setProdQualityControlTimeId(Integer prodQualityControlTimeId) {
        this.prodQualityControlTimeId = prodQualityControlTimeId;
    }
}
