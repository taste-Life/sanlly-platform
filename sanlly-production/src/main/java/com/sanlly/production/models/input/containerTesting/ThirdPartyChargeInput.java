package com.sanlly.production.models.input.containerTesting;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO 第三方现场收费实体
 * @author tianzhl   
 * @date 2019年8月20日 上午10:13:07 
 * @version V1.0   
 */
public class ThirdPartyChargeInput {
	// TODO 进场id
	private String prodCourseId;

	// TODO 箱类别
	private String containerCategory;

	// TODO 收费类型
	private String chargeType;

	// TODO 实收金额
	private String receivedMoney;

	// TODO 押金
	private String depositMoney;

	// TODO 付费类型
	private String paymentType;

	// TODO 刷卡支付照片
	private String payInvoice;

	// TODO 签字照片
	private String signaturePic;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getReceivedMoney() {
		return receivedMoney;
	}

	public void setReceivedMoney(String receivedMoney) {
		this.receivedMoney = receivedMoney;
	}

	public String getDepositMoney() {
		return depositMoney;
	}

	public void setDepositMoney(String depositMoney) {
		this.depositMoney = depositMoney;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPayInvoice() {
		return payInvoice;
	}

	public void setPayInvoice(String payInvoice) {
		this.payInvoice = payInvoice;
	}

	public String getSignaturePic() {
		return signaturePic;
	}

	public void setSignaturePic(String signaturePic) {
		this.signaturePic = signaturePic;
	}

}
