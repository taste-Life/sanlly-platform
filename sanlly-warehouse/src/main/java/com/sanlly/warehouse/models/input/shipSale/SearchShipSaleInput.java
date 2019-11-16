package com.sanlly.warehouse.models.input.shipSale;

import com.sanlly.common.models.input.PageInput;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: SearchShipSaleInput
 * Description: 查询供船输入类
 * date: 2019/9/17 10:26
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SearchShipSaleInput extends PageInput {

    // 供船ID
    private Integer wareShipSupplyReplaceId;

    // 单据类型
    private String billType;

    // 供船单号
    private String shipSupplyReplaceNo;

    // 源单号
    private String no;

    // 代收公司
    private String replaceCompany;

    // 供船公司
    private String shipSupplyCompany;

    // 供船场站
    private String shipSupplyCz;

    // 客户
    private String customer;

    // 单据状态
    private String billStatus;

    // 起止日期
    private Date startDate;
    private Date endDate;

    // 航次
    private String voyageNumber;

    // 状态
    private String status;

    // 船名
    private String shipName;

    // 审核状态
    private String auditStatus;

    private String sparePartsNo;

    private String spareParts;

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

    public SearchShipSaleInput() {
    }

    public SearchShipSaleInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public Integer getWareShipSupplyReplaceId() {
        return wareShipSupplyReplaceId;
    }

    public void setWareShipSupplyReplaceId(Integer wareShipSupplyReplaceId) {
        this.wareShipSupplyReplaceId = wareShipSupplyReplaceId;
    }

    public String getShipSupplyReplaceNo() {
        return shipSupplyReplaceNo;
    }

    public void setShipSupplyReplaceNo(String shipSupplyReplaceNo) {
        this.shipSupplyReplaceNo = shipSupplyReplaceNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getReplaceCompany() {
        return replaceCompany;
    }

    public void setReplaceCompany(String replaceCompany) {
        this.replaceCompany = replaceCompany;
    }

    public String getShipSupplyCompany() {
        return shipSupplyCompany;
    }

    public void setShipSupplyCompany(String shipSupplyCompany) {
        this.shipSupplyCompany = shipSupplyCompany;
    }

    public String getShipSupplyCz() {
        return shipSupplyCz;
    }

    public void setShipSupplyCz(String shipSupplyCz) {
        this.shipSupplyCz = shipSupplyCz;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
}
