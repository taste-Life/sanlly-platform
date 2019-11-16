package com.sanlly.warehouse.models.output.transfer;

/**
 * 调拨明细output
 * 
 * @author lishzh
 *
 */
public class TransferDetailOutput {

	private Integer warnTransferSlipDetailId;

	private Integer warnTransferSlip;

	private String sparePartsNo;

	private String spareParts;

	private String sparePartsLangLang;

	private String storageLocation;

	private String sparePartsBatch;

	private Double surplusNum;

	private Double num;

	private Double length;

	private Double width;

	public Integer getWarnTransferSlipDetailId() {
		return warnTransferSlipDetailId;
	}

	public void setWarnTransferSlipDetailId(Integer warnTransferSlipDetailId) {
		this.warnTransferSlipDetailId = warnTransferSlipDetailId;
	}

	public Integer getWarnTransferSlip() {
		return warnTransferSlip;
	}

	public void setWarnTransferSlip(Integer warnTransferSlip) {
		this.warnTransferSlip = warnTransferSlip;
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

	public Double getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

}
