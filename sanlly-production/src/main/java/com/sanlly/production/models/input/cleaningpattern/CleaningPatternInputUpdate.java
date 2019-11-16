package com.sanlly.production.models.input.cleaningpattern;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public class CleaningPatternInputUpdate extends CleaningPatternInputAdd {
    private Integer prodCleaningPatternId;

    public Integer getProdCleaningPatternId() {
        return prodCleaningPatternId;
    }

    public void setProdCleaningPatternId(Integer prodCleaningPatternId) {
        this.prodCleaningPatternId = prodCleaningPatternId;
    }
}
