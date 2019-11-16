package com.sanlly.warehouse.models.input.quotecurrency;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditQuoteCurrencyInput
 * Description: 币种修改输入类
 * date: 2019/7/25 16:49
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "币种修改输入类")
public class EditQuoteCurrencyInput {

    @ApiModelProperty(value = "币种ID",name = "wareQuoteCurrencyId")
    private Integer wareQuoteCurrencyId;

    @ApiModelProperty(value = "币种Key",name = "key")
    private String key;

    @ApiModelProperty(value = "币种编号",name = "quoteCurrencyNo")
    private String quoteCurrencyNo;

    @ApiModelProperty(value = "币种英文名",name = "quoteCurrencyNameEn")
    private String quoteCurrencyNameEn;

    @ApiModelProperty(value = "币种名",name = "quoteCurrencyName")
    private String quoteCurrencyName;

    public EditQuoteCurrencyInput() {
    }

    public EditQuoteCurrencyInput(String key) {
        this.key = key;
    }

    public Integer getWareQuoteCurrencyId() {
        return wareQuoteCurrencyId;
    }

    public void setWareQuoteCurrencyId(Integer wareQuoteCurrencyId) {
        this.wareQuoteCurrencyId = wareQuoteCurrencyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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
