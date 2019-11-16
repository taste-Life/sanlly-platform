package com.sanlly.warehouse.models.output.sparepartscategoriesdetails;

/**
 * ClassName: SparePartsCategoriesDetailsOutput
 * Description: 备件明细类别输出类
 * date: 2019/7/25 19:36
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SparePartsCategoriesDetailsOutput {

    //备件明细类别ID
    private Integer wareSparepartsCategoriesDetailsId;

    //备件明细类别key
    private String key;

    //备件明细类别 国际化key
    private String keyLangLang;

    //备件明细类别所属大类
    private String sparePartsCategoriesLangLang;

    //备件明细类别所属大类
    private String sparePartsCategories;

    //备件明细类别英文名
    private String sparepartsCategoriesDetailsNameEn;

    //备件明细类别中文名
    private String sparepartsCategoriesDetailsName;

    public Integer getWareSparepartsCategoriesDetailsId() {
        return wareSparepartsCategoriesDetailsId;
    }

    public void setWareSparepartsCategoriesDetailsId(Integer wareSparepartsCategoriesDetailsId) {
        this.wareSparepartsCategoriesDetailsId = wareSparepartsCategoriesDetailsId;
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

    public String getSparePartsCategoriesLangLang() {
        return sparePartsCategoriesLangLang;
    }

    public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
        this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
    }

    public String getSparepartsCategoriesDetailsNameEn() {
        return sparepartsCategoriesDetailsNameEn;
    }

    public void setSparepartsCategoriesDetailsNameEn(String sparepartsCategoriesDetailsNameEn) {
        this.sparepartsCategoriesDetailsNameEn = sparepartsCategoriesDetailsNameEn;
    }

    public String getSparepartsCategoriesDetailsName() {
        return sparepartsCategoriesDetailsName;
    }

    public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
        this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    @Override
    public String toString() {
        return "SparePartsCategoriesDetailsOutput{" +
                "wareSparepartsCategoriesDetailsId=" + wareSparepartsCategoriesDetailsId +
                ", key='" + key + '\'' +
                ", keyLangLang='" + keyLangLang + '\'' +
                ", sparePartsCategoriesLangLang='" + sparePartsCategoriesLangLang + '\'' +
                ", sparePartsCategories='" + sparePartsCategories + '\'' +
                ", sparepartsCategoriesDetailsNameEn='" + sparepartsCategoriesDetailsNameEn + '\'' +
                ", sparepartsCategoriesDetailsName='" + sparepartsCategoriesDetailsName + '\'' +
                '}';
    }
}
