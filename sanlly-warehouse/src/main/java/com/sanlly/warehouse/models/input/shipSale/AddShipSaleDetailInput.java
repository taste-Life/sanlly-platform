package com.sanlly.warehouse.models.input.shipSale;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: AddShipSaleDetailInput
 * Description: 供船新增明细输入类
 * date: 2019/9/17 10:27
 *
 * @author wannt
 * @since JDK 1.8
 */
public class AddShipSaleDetailInput {

    // 供船明细id
    private Integer wareShipSupplyreplaceDetailId;

    // 供船id
    private Integer wareShipSupplyReplaceId;

    // 仓库类型
    private String warehouseType;

    // 仓库
    private String warehouse;

    // 备件
    private String spareParts;

    // 供船数量
    private Double shipSupplyNum;

    // 出库数量
    private Double stockoutNum;

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
}
