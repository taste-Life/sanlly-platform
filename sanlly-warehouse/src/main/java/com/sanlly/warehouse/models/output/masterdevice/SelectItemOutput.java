package com.sanlly.warehouse.models.output.masterdevice;

/**
 * ClassName: SelectItemOutput
 * Description: 主件下拉列表输出类
 * date: 2019/9/3 17:59
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SelectItemOutput {

    private String value;

    private String labelLang;

    private String code;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabelLang() {
        return labelLang;
    }

    public void setLabelLang(String labelLang) {
        this.labelLang = labelLang;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
