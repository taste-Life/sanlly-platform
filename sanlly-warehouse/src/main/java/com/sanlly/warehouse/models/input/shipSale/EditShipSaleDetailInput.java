package com.sanlly.warehouse.models.input.shipSale;

import java.math.BigDecimal;

/**
 * ClassName: EditShipSaleDetailInput
 * Description: 修改供船输入类
 * date: 2019/9/17 14:11
 *
 * @author wannt
 * @since JDK 1.8
 */
public class EditShipSaleDetailInput {

    // 供船明细ID
    private Integer wareShipSupplyreplaceDetailId;

    // 供船ID
    private Integer wareShipSupplyReplaceId;

    // 仓库类型
    private String warehouseType;

    // 所属仓库
    private String warehouse;

    // 备件
    private String spareParts;

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

    // 本次出库数量
    private Double outNum;

    // 本次退库数量
    private Double returnNum;

    // 单价
    private BigDecimal price;

    // 备注
    private String remark;

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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
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

    public Double getOutNum() {
        return outNum;
    }

    public void setOutNum(Double outNum) {
        this.outNum = outNum;
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

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }
}
