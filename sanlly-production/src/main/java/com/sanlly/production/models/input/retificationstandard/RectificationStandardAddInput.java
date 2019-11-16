package com.sanlly.production.models.input.retificationstandard;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author zhq
 * @date 2019/10/30
 * @description
 */
public class RectificationStandardAddInput {
    @NotEmpty(message = "reworkQuestion不能为空")
    private String reworkQuestion;
    @NotBlank(message = "standardContentName 不能为空")
    private String standardContentName;

    private String standardContentEn;

    public String getReworkQuestion() {
        return reworkQuestion;
    }

    public void setReworkQuestion(String reworkQuestion) {
        this.reworkQuestion = reworkQuestion;
    }

    public String getStandardContentName() {
        return standardContentName;
    }

    public void setStandardContentName(String standardContentName) {
        this.standardContentName = standardContentName;
    }

    public String getStandardContentEn() {
        return standardContentEn;
    }

    public void setStandardContentEn(String standardContentEn) {
        this.standardContentEn = standardContentEn;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    private Integer isValid;
}
