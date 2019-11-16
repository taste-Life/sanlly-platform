package com.sanlly.warehouse.models.input.compressormaterial;

import com.sanlly.common.models.input.PageInput;

import java.math.BigDecimal;

/**
 * @author lishzh
 */
public class CompressorMaterialInput {

    private Integer wareCompressorMaterialId;

    private String compressor;

    private String material;

    private BigDecimal repairOffer;

    private String descripZh;

    private String warehouse;

    private String warehouseType;

    private String repairWay;

    private String descripEn;

    private String type;

    private String isValid;

    private BigDecimal cost;

    private String materialNo;

    private String compressorNo;

    public Integer getWareCompressorMaterialId() {
        return wareCompressorMaterialId;
    }

    public void setWareCompressorMaterialId(Integer wareCompressorMaterialId) {
        this.wareCompressorMaterialId = wareCompressorMaterialId;
    }

    public String getCompressor() {
        return compressor;
    }

    public void setCompressor(String compressor) {
        this.compressor = compressor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BigDecimal getRepairOffer() {
        return repairOffer;
    }

    public void setRepairOffer(BigDecimal repairOffer) {
        this.repairOffer = repairOffer;
    }

    public String getDescripZh() {
        return descripZh;
    }

    public void setDescripZh(String descripZh) {
        this.descripZh = descripZh;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getRepairWay() {
        return repairWay;
    }

    public void setRepairWay(String repairWay) {
        this.repairWay = repairWay;
    }

    public String getDescripEn() {
        return descripEn;
    }

    public void setDescripEn(String descripEn) {
        this.descripEn = descripEn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    public String getCompressorNo() {
        return compressorNo;
    }

    public void setCompressorNo(String compressorNo) {
        this.compressorNo = compressorNo;
    }
}
