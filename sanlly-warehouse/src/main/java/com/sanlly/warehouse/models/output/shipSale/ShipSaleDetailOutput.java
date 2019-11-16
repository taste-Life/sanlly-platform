package com.sanlly.warehouse.models.output.shipSale;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: ShipSaleDetailOutput
 * Description: 供船明细输出类
 * date: 2019/9/17 10:28
 *
 * @author wannt
 * @since JDK 1.8
 */
public class ShipSaleDetailOutput {

    // 供船明细ID
    private Integer wareShipSupplyreplaceDetailId;

    // 供船ID
    private Integer wareShipSupplyReplaceId;

    // 仓库类型
    private String warehouseType;
    private String warehouseTypeLangLang;

    // 所属仓库
    private String warehouse;
    private String warehouseLangLang;

    // 备件
    private String spareParts;
    private String sparePartsLangLang;

    // 备件批次
    private String sparePartsBatch;

    // 库位
    private String storageLocation;

    // 备件号
    private String sparePartsNo;

    // 供船数量
    private Double shipSupplyNum;

    // 出库数量
    private Double stockoutNum;

    // 库存数量
    private Double actualSurplusNum;

    // 单价
    private BigDecimal price;

    // 备注
    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareShipSupplyreplaceDetailId() {
        return wareShipSupplyreplaceDetailId;
    }

    public void setWareShipSupplyreplaceDetailId(Integer wareShipSupplyreplaceDetailId) {
        this.wareShipSupplyreplaceDetailId = wareShipSupplyreplaceDetailId;
    }

    public Integer getWareShipSupplyReplaceId() {
        return wareShipSupplyReplaceId;
    }

    public void setWareShipSupplyReplaceId(Integer wareShipSupplyReplaceId) {
        this.wareShipSupplyReplaceId = wareShipSupplyReplaceId;
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

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public Double getShipSupplyNum() {
        return shipSupplyNum;
    }

    public void setShipSupplyNum(Double shipSupplyNum) {
        this.shipSupplyNum = shipSupplyNum;
    }

    public Double getStockoutNum() {
        return stockoutNum;
    }

    public void setStockoutNum(Double stockoutNum) {
        this.stockoutNum = stockoutNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public Double getActualSurplusNum() {
        return actualSurplusNum;
    }

    public void setActualSurplusNum(Double actualSurplusNum) {
        this.actualSurplusNum = actualSurplusNum;
    }
}
