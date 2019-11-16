package com.sanlly.purchase.models.input.dailydemand;

/**
 * @ClassName: EditDemandInput
 */
public class EditDemandInput {
    //主键id
    private Integer purcMatterDemandId;
    //商品名称
    private String productNum;
    //品牌
    private String productBrand;
    //规格
    private String productSpecial;
    //型号
    private String productModel;
    //数量
    private Double productCount;
    //要求到货时间
    private String requireArriveTime;
    //采购单位
    private String purchaseCompany;
    //采购类型
    private String purchaseType;
    private String warehouse;
    //商品单位
    private String sparePartsUnit;
    //送货地址
    private String address;
    // 备注
    private String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }


    public Integer getPurcMatterDemandId() {
        return purcMatterDemandId;
    }

    public void setPurcMatterDemandId(Integer purcMatterDemandId) {
        this.purcMatterDemandId = purcMatterDemandId;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSpecial() {
        return productSpecial;
    }

    public void setProductSpecial(String productSpecial) {
        this.productSpecial = productSpecial;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Double getProductCount() {
        return productCount;
    }

    public void setProductCount(Double productCount) {
        this.productCount = productCount;
    }

    public String getRequireArriveTime() {
        return requireArriveTime;
    }

    public void setRequireArriveTime(String requireArriveTime) {
        this.requireArriveTime = requireArriveTime;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
}
