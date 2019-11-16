package com.sanlly.warehouse.models.output.quotecurrency;

/**
 * ClassName: QuoteCurrencyOutput
 * Description: 币种输出类
 * date: 2019/7/25 17:01
 *
 * @author wannt
 * @since JDK 1.8
 */
public class QuoteCurrencyOutput {
    //币种ID
    private Integer wareQuoteCurrencyId;
    //币种key
    private String key;
    //币种 国际化key
    private String keyLangLang;
    //币种编号
    private String quoteCurrencyNo;
    //币种英文名
    private String quoteCurrencyNameEn;
    //币种中文名
    private String quoteCurrencyName;

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

    public String getKeyLangLang() {
        return keyLangLang;
    }

    public void setKeyLangLang(String keyLangLang) {
        this.keyLangLang = keyLangLang;
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

    @Override
    public String toString() {
        return "QuoteCurrencyOutput{" +
                "wareQuoteCurrencyId=" + wareQuoteCurrencyId +
                ", key='" + key + '\'' +
                ", keyLangLang='" + keyLangLang + '\'' +
                ", quoteCurrencyNo='" + quoteCurrencyNo + '\'' +
                ", quoteCurrencyNameEn='" + quoteCurrencyNameEn + '\'' +
                ", quoteCurrencyName='" + quoteCurrencyName + '\'' +
                '}';
    }
}
