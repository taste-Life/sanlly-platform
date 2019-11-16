package com.sanlly.production.models.input.reworkquestion;

/**
 * @author zhq
 * @date 2019/10/31
 * @description
 */
public class ReworkQuestionUpdateInput extends ReworkQuestionAddInput {
    private Integer prodReworkQuestionId;

    private String key;

    public Integer getProdReworkQuestionId() {
        return prodReworkQuestionId;
    }

    public void setProdReworkQuestionId(Integer prodReworkQuestionId) {
        this.prodReworkQuestionId = prodReworkQuestionId;
    }
}
