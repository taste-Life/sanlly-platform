package com.sanlly.purchase.models.input.matterdeliver;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryDetailOutput;

public class AddMatterDeliveryInput {
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
	// 关税
	private BigDecimal tariff;
	
	List<MatterDeliveryDetailOutput> detailOutputs;

	
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

	public BigDecimal getTariff() {
		return tariff;
	}

	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}

	public List<MatterDeliveryDetailOutput> getDetailOutputs() {
		return detailOutputs;
	}

	public void setDetailOutputs(List<MatterDeliveryDetailOutput> detailOutputs) {
		this.detailOutputs = detailOutputs;
	}
	
	
	
}
