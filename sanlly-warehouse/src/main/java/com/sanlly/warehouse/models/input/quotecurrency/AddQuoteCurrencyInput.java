package com.sanlly.warehouse.models.input.quotecurrency;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddQuoteCurrencyInput
 * Description: 币种增加输入类
 * date: 2019/7/25 16:49
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "币种增加输入类")
public class AddQuoteCurrencyInput {

    @ApiModelProperty(value = "币种编号",name = "quoteCurrencyNo")
    private String quoteCurrencyNo;

    @ApiModelProperty(value = "币种英文名",name = "quoteCurrencyNameEn")
    private String quoteCurrencyNameEn;

    @ApiModelProperty(value = "币种名",name = "quoteCurrencyName")
    private String quoteCurrencyName;

    public String getQuoteCurrencyNo() {
        return quoteCurrencyNo;
    }

    public void setQuoteCurrencyNo(String quoteCurrencyNo) {
        this.quoteCurrencyNo = quoteCurrencyNo;
    }

    public String getQuoteCurrencyNameEn() {
        return quoteCurrencyNameEn;
    }

    public void setQuoteCurrencyNameEn(String quoteCurrencyNameEn) {
        this.quoteCurrencyNameEn = quoteCurrencyNameEn;
    }

    public String getQuoteCurrencyName() {
        return quoteCurrencyName;
    }

    public void setQuoteCurrencyName(String quoteCurrencyName) {
        this.quoteCurrencyName = quoteCurrencyName;
    }
}
