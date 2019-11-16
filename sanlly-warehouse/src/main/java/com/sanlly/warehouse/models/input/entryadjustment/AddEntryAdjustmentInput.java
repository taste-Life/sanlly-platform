package com.sanlly.warehouse.models.input.entryadjustment;

import java.math.BigDecimal;
import java.util.List;

public class AddEntryAdjustmentInput {

	// 入库单号
    private String stockinNo;
    // 调整发票类型
    private String adjustmentInvoice;
    // 调整运费
    private BigDecimal adjustmentFreight;
    // 单据总金额
    private BigDecimal billTotalAmount;
    // 关税
    private BigDecimal tariff;
    // 运费
    private BigDecimal vat;
    
    
    private List<AddEntryAdjustmentDetailInput> stockinAdjustmentDetail;

	public String getStockinNo() {
		return stockinNo;
	}

	public void setStockinNo(String stockinNo) {
		this.stockinNo = stockinNo;
	}

	public String getAdjustmentInvoice() {
		return adjustmentInvoice;
	}

	public void setAdjustmentInvoice(String adjustmentInvoice) {
		this.adjustmentInvoice = adjustmentInvoice;
	}

	public BigDecimal getAdjustmentFreight() {
		return adjustmentFreight;
	}

	public void setAdjustmentFreight(BigDecimal adjustmentFreight) {
		this.adjustmentFreight = adjustmentFreight;
	}

	public List<AddEntryAdjustmentDetailInput> getStockinAdjustmentDetail() {
		return stockinAdjustmentDetail;
	}

	public void setStockinAdjustmentDetail(List<AddEntryAdjustmentDetailInput> stockinAdjustmentDetail) {
		this.stockinAdjustmentDetail = stockinAdjustmentDetail;
	}

	public BigDecimal getBillTotalAmount() {
		return billTotalAmount;
	}

	public void setBillTotalAmount(BigDecimal billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}

	public BigDecimal getTariff() {
		return tariff;
	}

	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	

    
    
}
