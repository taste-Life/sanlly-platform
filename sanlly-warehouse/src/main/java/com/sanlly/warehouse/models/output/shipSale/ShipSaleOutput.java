package com.sanlly.warehouse.models.output.shipSale;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: ShipSaleOutput
 * Description: 供船输出类
 * date: 2019/9/17 10:28
 *
 * @author wannt
 * @since JDK 1.8
 */
public class ShipSaleOutput {

    // 供船ID
    private Integer wareShipSupplyReplaceId;

    // 供船单号
    private String shipSupplyReplaceNo;

    // 源单号
    private String no;

    // 代收公司
    private String replaceCompany;
    private String replaceCompanyLangLang;

    // 供船公司
    private String shipSupplyCompany;
    private String shipSupplyCompanyLangLang;

    // 供船场站
    private String shipSupplyCz;
    private String shipSupplyCzLangLang;

    // 供船费
    private BigDecimal shipSupplyPrice;

    // 汇率
    private BigDecimal exchangeRate;

    // 客户
    private String customer;

    // 单据状态
    private String billStatus;
    private String billStatusLangLang;

    // 供船日期
    private Date shipSupplyDate;
    private String shipSupplyDateStr;

    // 航次
    private String voyageNumber;

    // 状态
    private String status;
    private String statusLangLang;

    // 船名
    private String shipName;

    // 审核状态
    private String auditStatus;
    private String auditStatusLangLang;

    // 驳回原因
    private String reasonsRejection;

    // 备注
    private String remark;

    private Date createTime;
    private String createTimeStr;

    private Integer createUser;
    private String createUserStr;

    private Date updateTime;

    private Integer updateUser;

    // 明细
    private List<ShipSaleDetailOutput> detailOutputList;

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getShipSupplyDateStr() {
        return shipSupplyDateStr;
    }

    public void setShipSupplyDateStr(String shipSupplyDateStr) {
        this.shipSupplyDateStr = shipSupplyDateStr;
    }

    public String getCreateUserStr() {
        return createUserStr;
    }

    public void setCreateUserStr(String createUserStr) {
        this.createUserStr = createUserStr;
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

    public String getReplaceCompanyLangLang() {
        return replaceCompanyLangLang;
    }

    public void setReplaceCompanyLangLang(String replaceCompanyLangLang) {
        this.replaceCompanyLangLang = replaceCompanyLangLang;
    }

    public String getShipSupplyCompany() {
        return shipSupplyCompany;
    }

    public void setShipSupplyCompany(String shipSupplyCompany) {
        this.shipSupplyCompany = shipSupplyCompany;
    }

    public String getShipSupplyCompanyLangLang() {
        return shipSupplyCompanyLangLang;
    }

    public void setShipSupplyCompanyLangLang(String shipSupplyCompanyLangLang) {
        this.shipSupplyCompanyLangLang = shipSupplyCompanyLangLang;
    }

    public String getShipSupplyCz() {
        return shipSupplyCz;
    }

    public void setShipSupplyCz(String shipSupplyCz) {
        this.shipSupplyCz = shipSupplyCz;
    }

    public String getShipSupplyCzLangLang() {
        return shipSupplyCzLangLang;
    }

    public void setShipSupplyCzLangLang(String shipSupplyCzLangLang) {
        this.shipSupplyCzLangLang = shipSupplyCzLangLang;
    }

    public BigDecimal getShipSupplyPrice() {
        return shipSupplyPrice;
    }

    public void setShipSupplyPrice(BigDecimal shipSupplyPrice) {
        this.shipSupplyPrice = shipSupplyPrice;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    public String getBillStatusLangLang() {
        return billStatusLangLang;
    }

    public void setBillStatusLangLang(String billStatusLangLang) {
        this.billStatusLangLang = billStatusLangLang;
    }

    public Date getShipSupplyDate() {
        return shipSupplyDate;
    }

    public void setShipSupplyDate(Date shipSupplyDate) {
        this.shipSupplyDate = shipSupplyDate;
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

    public String getStatusLangLang() {
        return statusLangLang;
    }

    public void setStatusLangLang(String statusLangLang) {
        this.statusLangLang = statusLangLang;
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

    public String getAuditStatusLangLang() {
        return auditStatusLangLang;
    }

    public void setAuditStatusLangLang(String auditStatusLangLang) {
        this.auditStatusLangLang = auditStatusLangLang;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public List<ShipSaleDetailOutput> getDetailOutputList() {
        return detailOutputList;
    }

    public void setDetailOutputList(List<ShipSaleDetailOutput> detailOutputList) {
        this.detailOutputList = detailOutputList;
    }
}
