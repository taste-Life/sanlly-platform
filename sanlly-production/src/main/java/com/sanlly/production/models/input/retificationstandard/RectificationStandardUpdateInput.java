package com.sanlly.production.models.input.retificationstandard;

/**
 * @author zhq
 * @date 2019/10/30
 * @description
 */
public class RectificationStandardUpdateInput extends RectificationStandardAddInput {
    private Integer prodRectStandardId;

    public Integer getProdRectStandardId() {
        return prodRectStandardId;
    }

    public void setProdRectStandardId(Integer prodRectStandardId) {
        this.prodRectStandardId = prodRectStandardId;
    }
}
