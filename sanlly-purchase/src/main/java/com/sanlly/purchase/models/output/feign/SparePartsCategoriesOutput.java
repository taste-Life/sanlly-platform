package com.sanlly.purchase.models.output.feign;

import com.sanlly.purchase.models.input.feign.SparePartsCategoriesDetailsOutput;

import java.util.List;

/**
 * ClassName: SparePartsCategoriesOutput
 * Description: 备件大类输出类
 * date: 2019/7/25 17:51
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SparePartsCategoriesOutput {

    //备件大类ID
    private Integer wareSparePartsCategoriesId;

    //备件大类Key
    private String key;

    //备件大类 国际化key
    private String keyLangLang;

    //备件大类英文名
    private String sparePartsCategoriesNameEn;

    //备件大类英文名
    private String sparePartsCategoriesName;
    
    //明细类别
    private List<SparePartsCategoriesDetailsOutput> details;

    public List<SparePartsCategoriesDetailsOutput> getDetails() {
		return details;
	}

	public void setDetails(List<SparePartsCategoriesDetailsOutput> details) {
		this.details = details;
	}

	public Integer getWareSparePartsCategoriesId() {
        return wareSparePartsCategoriesId;
    }

    public void setWareSparePartsCategoriesId(Integer wareSparePartsCategoriesId) {
        this.wareSparePartsCategoriesId = wareSparePartsCategoriesId;
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

    public String getSparePartsCategoriesNameEn() {
        return sparePartsCategoriesNameEn;
    }

    public void setSparePartsCategoriesNameEn(String sparePartsCategoriesNameEn) {
        this.sparePartsCategoriesNameEn = sparePartsCategoriesNameEn;
    }

    public String getSparePartsCategoriesName() {
        return sparePartsCategoriesName;
    }

    public void setSparePartsCategoriesName(String sparePartsCategoriesName) {
        this.sparePartsCategoriesName = sparePartsCategoriesName;
    }

    @Override
    public String toString() {
        return "SparePartsCategoriesOutput{" +
                "wareSparePartsCategoriesId=" + wareSparePartsCategoriesId +
                ", key='" + key + '\'' +
                ", keyLangLang='" + keyLangLang + '\'' +
                ", sparePartsCategoriesNameEn='" + sparePartsCategoriesNameEn + '\'' +
                ", sparePartsCategoriesName='" + sparePartsCategoriesName + '\'' +
                '}';
    }
}
