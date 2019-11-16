package com.sanlly.warehouse.models.output.unit;

/**
 * ClassName: UnitOutput
 * Description: 单位输出类
 * date: 2019/7/25 15:40
 *
 * @author wannt
 * @since JDK 1.8
 */
public class UnitOutput {

    private Integer wareUnitId;

    private String key;

    private String keyLangLang;

    private String unitNameEn;

    private String unitName;

    public Integer getWareUnitId() {
        return wareUnitId;
    }

    public void setWareUnitId(Integer wareUnitId) {
        this.wareUnitId = wareUnitId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUnitNameEn() {
        return unitNameEn;
    }

    public void setUnitNameEn(String unitNameEn) {
        this.unitNameEn = unitNameEn;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getKeyLangLang() {
        return keyLangLang;
    }

    public void setKeyLangLang(String keyLangLang) {
        this.keyLangLang = keyLangLang;
    }

    @Override
    public String toString() {
        return "UnitOutput{" +
                "wareUnitId=" + wareUnitId +
                ", key='" + key + '\'' +
                ", keyLangLang='" + keyLangLang + '\'' +
                ", unitNameEn='" + unitNameEn + '\'' +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
