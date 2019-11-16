package com.sanlly.common.models.output.stock;

/**
 * ClassName: StockNumOutput
 * Description: 库存数量输出类
 * date: 2019/9/18 10:26
 *
 * @author wannt
 * @since JDK 1.8
 */
public class StockNumOutput {

    // 所属公司
    private String company;
    private String companyLangLang;

    // 仓库类型
    private String warehouseType;
    private String warehouseTypeLangLang;

    // 所属仓库
    private String warehouse;
    private String warehouseLangLang;

    // 备件号
    private String sparePartsNo;

    // 备件
    private String spareParts;
    private String sparePartsLangLang;

    // 库存数量
    private Double actualSurplusNum;

    // 库存面积
    private Double surplusArea;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getWarehouseTypeLangLang() {
        return warehouseTypeLangLang;
    }

    public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
        this.warehouseTypeLangLang = warehouseTypeLangLang;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouseLangLang() {
        return warehouseLangLang;
    }

    public void setWarehouseLangLang(String warehouseLangLang) {
        this.warehouseLangLang = warehouseLangLang;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public Double getActualSurplusNum() {
        return actualSurplusNum;
    }

    public void setActualSurplusNum(Double actualSurplusNum) {
        this.actualSurplusNum = actualSurplusNum;
    }

    public Double getSurplusArea() {
        return surplusArea;
    }

    public void setSurplusArea(Double surplusArea) {
        this.surplusArea = surplusArea;
    }
}
