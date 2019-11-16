package com.sanlly.production.models.input.dock;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public class DockInputUpdate extends DockInputAdd {
    private Integer prodDockId;

    public Integer getProdDockId() {
        return prodDockId;
    }

    public void setProdDockId(Integer prodDockId) {
        this.prodDockId = prodDockId;
    }
}
