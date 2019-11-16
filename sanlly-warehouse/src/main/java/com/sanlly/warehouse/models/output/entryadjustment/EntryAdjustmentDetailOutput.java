package com.sanlly.warehouse.models.output.entryadjustment;

import java.math.BigDecimal;

/**
 * 
* @Package com.sanlly.warehouse.models.output.entryadjustment 
* @Description: 调账单明细输出  
* @author jlx   
* @date 2019年9月2日 上午11:05:11 
* @version V1.0   
 */
public class EntryAdjustmentDetailOutput {

	private Integer wareReturnWarehouseDetailId;
	// 调账单
    private Integer entryAdjustment;
    // 备件
    private String spareParts;
    private String sparePartsLangLang;
    // 原始仓库类型
    private String oldWarehouseType;
    private String oldWarehouseTypeLangLang;
    // 调整仓库类型
    private String adjustmentWarehouseType;
    private String adjustmentWarehouseTypeLangLang;
    // 原始增值税
    private BigDecimal oldVat;
    // 调整增值税
    private BigDecimal adjustmentVat;
    // 原始关税
    private BigDecimal oldTariff;
    // 调整关税
    private BigDecimal adjustmentTariff;
    // 原始数量
    private Double oldNum;
    // 调整数量
    private Double adjustmentNum;
    
	public Integer getWareReturnWarehouseDetailId() {
		return wareReturnWarehouseDetailId;
	}
	public void setWareReturnWarehouseDetailId(Integer wareReturnWarehouseDetailId) {
		this.wareReturnWarehouseDetailId = wareReturnWarehouseDetailId;
	}
	public Integer getEntryAdjustment() {
		return entryAdjustment;
	}
	public void setEntryAdjustment(Integer entryAdjustment) {
		this.entryAdjustment = entryAdjustment;
	}
	public String getSpareParts() {
		return spareParts;
	}
	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}
	public String getOldWarehouseType() {
		return oldWarehouseType;
	}
	public void setOldWarehouseType(String oldWarehouseType) {
		this.oldWarehouseType = oldWarehouseType;
	}
	public String getAdjustmentWarehouseType() {
		return adjustmentWarehouseType;
	}
	public void setAdjustmentWarehouseType(String adjustmentWarehouseType) {
		this.adjustmentWarehouseType = adjustmentWarehouseType;
	}
	public BigDecimal getAdjustmentTariff() {
		return adjustmentTariff;
	}
	public void setAdjustmentTariff(BigDecimal adjustmentTariff) {
		this.adjustmentTariff = adjustmentTariff;
	}
	public BigDecimal getAdjustmentVat() {
		return adjustmentVat;
	}
	public void setAdjustmentVat(BigDecimal adjustmentVat) {
		this.adjustmentVat = adjustmentVat;
	}
	public Double getAdjustmentNum() {
		return adjustmentNum;
	}
	public void setAdjustmentNum(Double adjustmentNum) {
		this.adjustmentNum = adjustmentNum;
	}
	public BigDecimal getOldTariff() {
		return oldTariff;
	}
	public void setOldTariff(BigDecimal oldTariff) {
		this.oldTariff = oldTariff;
	}
	public BigDecimal getOldVat() {
		return oldVat;
	}
	public void setOldVat(BigDecimal oldVat) {
		this.oldVat = oldVat;
	}
	public Double getOldNum() {
		return oldNum;
	}
	public void setOldNum(Double oldNum) {
		this.oldNum = oldNum;
	}
	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}
	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}
	public String getOldWarehouseTypeLangLang() {
		return oldWarehouseTypeLangLang;
	}
	public void setOldWarehouseTypeLangLang(String oldWarehouseTypeLangLang) {
		this.oldWarehouseTypeLangLang = oldWarehouseTypeLangLang;
	}
	public String getAdjustmentWarehouseTypeLangLang() {
		return adjustmentWarehouseTypeLangLang;
	}
	public void setAdjustmentWarehouseTypeLangLang(String adjustmentWarehouseTypeLangLang) {
		this.adjustmentWarehouseTypeLangLang = adjustmentWarehouseTypeLangLang;
	}
    
    
}
