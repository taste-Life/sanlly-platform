package com.sanlly.production.models.output.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 派工单明细
 * @author tianzhl   
 * @date 2019年9月7日 下午4:13:22 
 * @version V1.0   
 */
public class FixReferralsDetailsOutput {

	// TODO 派工单明细Id
	private String referralEntryId;

	// TODO 主件
	private String device;

	// TODO 主件
	private String deviceNameLang;

	// TODO 备件号
	private String sparesNum;

	// TODO 备件号
	private String sparesNumNameLang;

	// TODO 位置代码
	private String positionCode;

	// TODO 部件明细代码
	private String partsDetailCodeLang;

	// TODO 维修代码
	private String repairCodeLang;

	// TODO 部件修理代码
	private String partsRepairCodeLang;

	// TODO 材质
	private String materialCodeLang;

	// TODO 付费方
	private String payingParty;

	// TODO 付费方
	private String payingPartyNameLang;

	// TODO 长度
	private String length;

	// TODO 宽度
	private String width;

	// TODO 数量
	private String quantity;

	// TODO 工时
	private String manHour;

	// TODO 修前视频照片
	private String photo;

	// TODO 备注
	private String remarks;

	// TODO 质检状态
	private String qualityState;

	// TODO 返工-是否工艺标准
	private String isTechnology;

	// TODO 返工-质检问题类别
	private String reworkQuestionLang;

	// TODO 返工-整改标准
	private String rectificationStandardLang;

	// TODO 领料状态
	private String pickingState;

	// TODO 序号
	private String serialNumber;

	// TODO 仓库类型
	private String warehouseType;
	// TODO 公司
	private String company;
	// TODO 仓库
	private String warehouse;
	// TODO 仓库类型
	private String warehouseTypeNameLang;
	// TODO 公司
	private String companyNameLang;
	// TODO 仓库
	private String warehouseNameLang;

	public String getReferralEntryId() {
		return referralEntryId;
	}

	public void setReferralEntryId(String referralEntryId) {
		this.referralEntryId = referralEntryId;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getDeviceNameLang() {
		return deviceNameLang;
	}

	public void setDeviceNameLang(String deviceNameLang) {
		this.deviceNameLang = deviceNameLang;
	}

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getSparesNumNameLang() {
		return sparesNumNameLang;
	}

	public void setSparesNumNameLang(String sparesNumNameLang) {
		this.sparesNumNameLang = sparesNumNameLang;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartsDetailCodeLang() {
		return partsDetailCodeLang;
	}

	public void setPartsDetailCodeLang(String partsDetailCodeLang) {
		this.partsDetailCodeLang = partsDetailCodeLang;
	}

	public String getRepairCodeLang() {
		return repairCodeLang;
	}

	public void setRepairCodeLang(String repairCodeLang) {
		this.repairCodeLang = repairCodeLang;
	}

	public String getPartsRepairCodeLang() {
		return partsRepairCodeLang;
	}

	public void setPartsRepairCodeLang(String partsRepairCodeLang) {
		this.partsRepairCodeLang = partsRepairCodeLang;
	}

	public String getMaterialCodeLang() {
		return materialCodeLang;
	}

	public void setMaterialCodeLang(String materialCodeLang) {
		this.materialCodeLang = materialCodeLang;
	}

	public String getPayingParty() {
		return payingParty;
	}

	public void setPayingParty(String payingParty) {
		this.payingParty = payingParty;
	}

	public String getPayingPartyNameLang() {
		return payingPartyNameLang;
	}

	public void setPayingPartyNameLang(String payingPartyNameLang) {
		this.payingPartyNameLang = payingPartyNameLang;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getManHour() {
		return manHour;
	}

	public void setManHour(String manHour) {
		this.manHour = manHour;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getQualityState() {
		return qualityState;
	}

	public void setQualityState(String qualityState) {
		this.qualityState = qualityState;
	}

	public String getIsTechnology() {
		return isTechnology;
	}

	public void setIsTechnology(String isTechnology) {
		this.isTechnology = isTechnology;
	}

	public String getReworkQuestionLang() {
		return reworkQuestionLang;
	}

	public void setReworkQuestionLang(String reworkQuestionLang) {
		this.reworkQuestionLang = reworkQuestionLang;
	}

	public String getRectificationStandardLang() {
		return rectificationStandardLang;
	}

	public void setRectificationStandardLang(String rectificationStandardLang) {
		this.rectificationStandardLang = rectificationStandardLang;
	}

	public String getPickingState() {
		return pickingState;
	}

	public void setPickingState(String pickingState) {
		this.pickingState = pickingState;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getWarehouseTypeNameLang() {
		return warehouseTypeNameLang;
	}

	public void setWarehouseTypeNameLang(String warehouseTypeNameLang) {
		this.warehouseTypeNameLang = warehouseTypeNameLang;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getWarehouseNameLang() {
		return warehouseNameLang;
	}

	public void setWarehouseNameLang(String warehouseNameLang) {
		this.warehouseNameLang = warehouseNameLang;
	}

}
