package com.sanlly.warehouse.models.output.purchaseOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * ClassName: PurchaseOrderOutput
 * Description: 采购订单输出类
 * date: 2019/8/27 9:30
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("采购订单输出类")
public class PurchaseOrderOutput {

    @ApiModelProperty(name = "warePurchaseOrderId",value = "采购订单ID")
    private Integer warePurchaseOrderId;

    @ApiModelProperty(name = "purchaseNo",value = "采购订单号")
    private String purchaseNo;

    @ApiModelProperty(name = "no",value = "源单号")
    private String no;

    @ApiModelProperty(name = "purchaseDate",value = "采购日期")
    private Date purchaseDate;
    private String purchaseDateStr;

    @ApiModelProperty(name = "billType",value = "单据类型")
    private String billType;
    private String billTypeLangLang;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;
    private String stockoutStatusLangLang;

    @ApiModelProperty(name = "receivingUser",value = "收货人")
    private String receivingUser;
    private String receivingUserStr;

    @ApiModelProperty(name = "receivingAddress",value = "收货地址")
    private String receivingAddress;

    @ApiModelProperty(name = "intWarehouse",value = "采购仓库")
    private String intWarehouse;
    private String intWarehouseLangLang;

    @ApiModelProperty(name = "company",value = "所属公司")
    private String company;
    private String companyLangLang;

    @ApiModelProperty(name = "isFinish",value = "是否完毕")
    private String isFinish;
    private String isFinishLangLang;

    @ApiModelProperty(name = "remark",value = "备注")
    private String remark;

    @ApiModelProperty(name = "",value = "详细列表")
    private List<PurchaseOrderDetailOutput> detailList;

    public String getReceivingUserStr() {
        return receivingUserStr;
    }

    public void setReceivingUserStr(String receivingUserStr) {
        this.receivingUserStr = receivingUserStr;
    }

    public String getPurchaseDateStr() {
        return purchaseDateStr;
    }

    public void setPurchaseDateStr(String purchaseDateStr) {
        this.purchaseDateStr = purchaseDateStr;
    }

    public Integer getWarePurchaseOrderId() {
        return warePurchaseOrderId;
    }

    public void setWarePurchaseOrderId(Integer warePurchaseOrderId) {
        this.warePurchaseOrderId = warePurchaseOrderId;
    }

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getReceivingUser() {
        return receivingUser;
    }

    public void setReceivingUser(String receivingUser) {
        this.receivingUser = receivingUser;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getIntWarehouse() {
        return intWarehouse;
    }

    public void setIntWarehouse(String intWarehouse) {
        this.intWarehouse = intWarehouse;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<PurchaseOrderDetailOutput> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<PurchaseOrderDetailOutput> detailList) {
        this.detailList = detailList;
    }

    public String getStockoutStatusLangLang() {
        return stockoutStatusLangLang;
    }

    public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
        this.stockoutStatusLangLang = stockoutStatusLangLang;
    }

    public String getIntWarehouseLangLang() {
        return intWarehouseLangLang;
    }

    public void setIntWarehouseLangLang(String intWarehouseLangLang) {
        this.intWarehouseLangLang = intWarehouseLangLang;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getIsFinishLangLang() {
        return isFinishLangLang;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillTypeLangLang() {
        return billTypeLangLang;
    }

    public void setBillTypeLangLang(String billTypeLangLang) {
        this.billTypeLangLang = billTypeLangLang;
    }

    public void setIsFinishLangLang(String isFinishLangLang) {
        this.isFinishLangLang = isFinishLangLang;
    }
}
