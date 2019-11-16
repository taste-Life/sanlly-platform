package com.sanlly.production.models.input.reworkquestion;

/**
 * @author zhq
 * @date 2019/10/31
 * @description
 */
public class ReworkQuestionAddInput {

    private String containerCategory;

    private String reworkQuestion;

    private String reworkQuestionEn;

    private Integer isValid;

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion;
    }

    public String getReworkQuestionEn() {
        return reworkQuestionEn;
    }

    public void setReworkQuestionEn(String reworkQuestionEn) {
        this.reworkQuestionEn = reworkQuestionEn;
    }

    public Integer getIsValid() {

        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
