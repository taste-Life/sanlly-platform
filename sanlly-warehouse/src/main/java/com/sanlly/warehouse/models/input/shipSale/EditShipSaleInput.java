package com.sanlly.warehouse.models.input.shipSale;

import com.sanlly.warehouse.models.output.stockout.StockoutOutput;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: EditShipSaleInput
 * Description: 修改供船输入类
 * date: 2019/9/17 14:11
 *
 * @author wannt
 * @since JDK 1.8
 */
public class EditShipSaleInput {
    // 供船ID
    private Integer wareShipSupplyReplaceId;

    // 供船单号
    private String shipSupplyReplaceNo;

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

    // 单据类型
    private String billType;

    // 备注
    private String remark;

    private List<EditShipSaleDetailInput> detailInputList;

    private List<StockoutOutput> tableData;

    public List<StockoutOutput> getTableData() {
        return tableData;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public void setTableData(List<StockoutOutput> tableData) {
        this.tableData = tableData;
    }

    public String getShipSupplyReplaceNo() {
        return shipSupplyReplaceNo;
    }

    public void setShipSupplyReplaceNo(String shipSupplyReplaceNo) {
        this.shipSupplyReplaceNo = shipSupplyReplaceNo;
    }

    public List<EditShipSaleDetailInput> getDetailInputList() {
        return detailInputList;
    }

    public void setDetailInputList(List<EditShipSaleDetailInput> detailInputList) {
        this.detailInputList = detailInputList;
    }

    public Integer getWareShipSupplyReplaceId() {
        return wareShipSupplyReplaceId;
    }

    public void setWareShipSupplyReplaceId(Integer wareShipSupplyReplaceId) {
        this.wareShipSupplyReplaceId = wareShipSupplyReplaceId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
