package com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.warehouse.models.input.laborInsurance.AddLaborInsuranceInput;
/**
 * ClassName: LaborStockInInput
 * Description: 添加劳保入库单信息输入类
 * date: 2019/8/26 10:51
 *
 * @author zhh
 */
public class LaborStockInInput {
	//所属仓库
	private String warehouse;
	//仓库类型
	private String warehouseType;
	//入库状态
	private String entryStatus;
	private String auditStatus;
	
	//供应商
	private String supplier;
	//发票类型
	private String invoiceType;
	//总金额
	private BigDecimal totalAmount;
	
	//入库明细
	private List<AddLaborInsuranceInput> detailList;

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public List<AddLaborInsuranceInput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<AddLaborInsuranceInput> detailList) {
		this.detailList = detailList;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	
}
