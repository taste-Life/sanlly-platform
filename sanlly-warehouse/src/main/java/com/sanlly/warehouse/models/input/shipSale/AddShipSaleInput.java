package com.sanlly.warehouse.models.input.shipSale;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: AddShipSaleInput
 * Description: 新增供船输入类
 * date: 2019/9/17 10:27
 *
 * @author wannt
 * @since JDK 1.8
 */
public class AddShipSaleInput {

    // 供船id
    private Integer wareShipSupplyReplaceId;

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

    // 供船费
    private BigDecimal shipSupplyPrice;

    // 汇率
    private BigDecimal exchangeRate;

    // 客户
    private String customer;

    // 单据状态
    private String billStatus;

    // 供船日期
    private Date shipSupplyDate;

    // 航次
    private String voyageNumber;

    // 状态
    private String status;

    // 船名
    private String shipName;

    // 审核状态
    private String auditStatus;

    // 驳回原因
    private String reasonsRejection;

    // 单据类型
    private String billType;

    // 备注
    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    // 明细
    private List<AddShipSaleDetailInput> detailInputList;

    public List<AddShipSaleDetailInput> getDetailInputList() {
        return detailInputList;
    }

    public void setDetailInputList(List<AddShipSaleDetailInput> detailInputList) {
        this.detailInputList = detailInputList;
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
}
