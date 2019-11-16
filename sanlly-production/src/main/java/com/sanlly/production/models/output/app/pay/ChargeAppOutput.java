package com.sanlly.production.models.output.app.pay;
/**
 * APP端获取缴费状态-回填发票信息二维码输出类
 * @author zhangkai
 *
 */
public class ChargeAppOutput {

	/*
	 * 回填发票信息二维码 —-有值代表缴费成功，空串表示缴费中
	 */
	private String qrInfoUrl = "";
	/*
	 * 账单号
	 */
	private String billNum;
	/*
	 * 交易流水号（通联）
	 */
	private String serialNum;

	public String getQrInfoUrl() {
		return qrInfoUrl;
	}

	public void setQrInfoUrl(String qrInfoUrl) {
		this.qrInfoUrl = qrInfoUrl;
	}

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	
	
	
}
