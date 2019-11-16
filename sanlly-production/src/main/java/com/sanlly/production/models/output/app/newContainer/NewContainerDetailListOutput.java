package com.sanlly.production.models.output.app.newContainer;
/**
 * 新箱订单明细列表输出类
 * @author zhangkai
 *
 */
public class NewContainerDetailListOutput {

	/*
	 * 订单明细id
	 */
	private Integer orderDetailId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 订单号
	 */
	private String orderNo;
	/*
	 * 打冷日期
	 */
	private String codeData;
	/*
	 * 机组序列号
	 */
	private String unitCode;
	/*
	 * 控制器序列号
	 */
	private String control;
	/*
	 * 压缩机序列号
	 */
	private String compressor;
	/*
	 * COMM date
	 */
	private String commDate;
	/*
	 * 基板序列号
	 */
	private String substrateCode;
	/*
	 * Modem号
	 */
	private String modemNum;
	/*
	 * GPS号
	 */
	private String gpsNum;
	/*
	 * CA模块号
	 */
	private String caNum;
	/*
	 * 备注
	 */
	private String remarks;
	/*
	 * 机组id
	 */
	private String unitId;
	/*
	 * 软件版本
	 */
	private String softwareVersion;

	public Integer getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCodeData() {
		return codeData;
	}

	public void setCodeData(String codeData) {
		this.codeData = codeData;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getCompressor() {
		return compressor;
	}

	public void setCompressor(String compressor) {
		this.compressor = compressor;
	}

	public String getCommDate() {
		return commDate;
	}

	public void setCommDate(String commDate) {
		this.commDate = commDate;
	}

	public String getSubstrateCode() {
		return substrateCode;
	}

	public void setSubstrateCode(String substrateCode) {
		this.substrateCode = substrateCode;
	}

	public String getModemNum() {
		return modemNum;
	}

	public void setModemNum(String modemNum) {
		this.modemNum = modemNum;
	}

	public String getGpsNum() {
		return gpsNum;
	}

	public void setGpsNum(String gpsNum) {
		this.gpsNum = gpsNum;
	}

	public String getCaNum() {
		return caNum;
	}

	public void setCaNum(String caNum) {
		this.caNum = caNum;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	
	
}
