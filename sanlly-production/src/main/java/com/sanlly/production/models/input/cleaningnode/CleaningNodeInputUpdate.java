package com.sanlly.production.models.input.cleaningnode;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public class CleaningNodeInputUpdate extends CleaningNodeInputAdd {
    private Integer prodCleaningNode;

    public Integer getProdCleaningNode() {
        return prodCleaningNode;
    }

    public void setProdCleaningNode(Integer prodCleaningNode) {
        this.prodCleaningNode = prodCleaningNode;
    }
}
