package com.sanlly.purchase.models.input.dailydeliver;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.purchase.models.output.dailydeliver.DailyDeliveryDetailOutput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryDetailOutput;

public class AddDailyDeliveryInput {
	// 采购订单id
    private Integer purcPurchaseOrderId;
	// 供货方式
	private String supplyType;
	// 物流公司
	private String logisticsCompany;
	// 物流单号
	private String logisticsNum;
	// 收货地址
	private String reciveAddress;
	// 运费
	private BigDecimal freight;
	
	List<DailyDeliveryDetailOutput> detailOutputs;

	
	public Integer getPurcPurchaseOrderId() {
		return purcPurchaseOrderId;
	}

	public void setPurcPurchaseOrderId(Integer purcPurchaseOrderId) {
		this.purcPurchaseOrderId = purcPurchaseOrderId;
	}

	public String getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}

	public String getLogisticsCompany() {
		return logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getLogisticsNum() {
		return logisticsNum;
	}

	public void setLogisticsNum(String logisticsNum) {
		this.logisticsNum = logisticsNum;
	}

	public String getReciveAddress() {
		return reciveAddress;
	}

	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}


	public List<DailyDeliveryDetailOutput> getDetailOutputs() {
		return detailOutputs;
	}

	public void setDetailOutputs(List<DailyDeliveryDetailOutput> detailOutputs) {
		this.detailOutputs = detailOutputs;
	}
	
	
	
}
