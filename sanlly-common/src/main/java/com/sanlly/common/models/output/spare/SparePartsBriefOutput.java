package com.sanlly.common.models.output.spare;

/**
 * ClassName: SparePartsBriefOutput
 * Description: 备件基础信息输出类
 * date: 2019/7/24 15:26
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SparePartsBriefOutput {
    //备件ID
    private Integer wareSparePartsId;

    //备件Key
    private String key;

    //备件 国际化key
    private String keyLangLang;

    //备件大类
    private String sparePartsCategoriesLangLang;
    private String sparePartsCategories;

    //备件明细类别
    private String sparePartsCategoriesDetailsLangLang;
    private String sparePartsCategoriesDetails;

    //备件号
    private String sparePartsNo;

    //备件名
    private String sparePartsName;

    //备件英文名
    private String sparePartsNameEn;

    // 仓库类型
    private String defaultWarehouseTypeLangLang;
    private String defaultWarehouseType;
    
    //型号
    private String model;

    public Integer getWareSparePartsId() {
        return wareSparePartsId;
    }

    public void setWareSparePartsId(Integer wareSparePartsId) {
        this.wareSparePartsId = wareSparePartsId;
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

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsCategoriesDetailsLangLang() {
        return sparePartsCategoriesDetailsLangLang;
    }

    public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
        this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
    }

    public String getSparePartsCategoriesDetails() {
        return sparePartsCategoriesDetails;
    }

    public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
        this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName;
    }

    public String getSparePartsNameEn() {
        return sparePartsNameEn;
    }

    public void setSparePartsNameEn(String sparePartsNameEn) {
        this.sparePartsNameEn = sparePartsNameEn;
    }

    public String getDefaultWarehouseTypeLangLang() {
        return defaultWarehouseTypeLangLang;
    }

    public void setDefaultWarehouseTypeLangLang(String defaultWarehouseTypeLangLang) {
        this.defaultWarehouseTypeLangLang = defaultWarehouseTypeLangLang;
    }

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType;
    }

    
    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
    public String toString() {
        return "SparePartsBriefOutput{" +
                "wareSparePartsId=" + wareSparePartsId +
                ", key='" + key + '\'' +
                ", keyLangLang='" + keyLangLang + '\'' +
                ", sparePartsCategoriesLangLang='" + sparePartsCategoriesLangLang + '\'' +
                ", sparePartsCategories='" + sparePartsCategories + '\'' +
                ", sparePartsCategoriesDetailsLangLang='" + sparePartsCategoriesDetailsLangLang + '\'' +
                ", sparePartsCategoriesDetails='" + sparePartsCategoriesDetails + '\'' +
                ", sparePartsNo='" + sparePartsNo + '\'' +
                ", sparePartsName='" + sparePartsName + '\'' +
                ", sparePartsNameEn='" + sparePartsNameEn + '\'' +
                ", defaultWarehouseTypeLangLang='" + defaultWarehouseTypeLangLang + '\'' +
                ", defaultWarehouseType='" + defaultWarehouseType + '\'' +
                '}';
    }
}
