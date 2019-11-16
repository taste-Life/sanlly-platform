package com.sanlly.production.models.output.app.unitTesting;

/**
 * 维修历史记录-明细
 * 
 * @author RexSheng 2019年8月12日 上午11:07:32
 */
public class UnitTestingHistoryEntryOutput {

	/**
	 * 位置
	 */
	private String positionCode;

	/**
	 * 部件大类
	 */
	private String partTypeCode;

	/**
	 * 部件大类
	 */
	private String partTypeNameLang;

	/**
	 * 部件修理
	 */
	private String partRepairCode;

	/**
	 * 部件明细
	 */
	private String partDetailCode;

	/**
	 * 损坏代码
	 */
	private String damageCode;

	/**
	 * 修理代码
	 */
	private String repairCode;

	/**
	 * 材质代码"
	 */
	private String materialCode;

	/**
	 * 备件号
	 */
	private String sparesNum;

	/**
	 * 数量
	 */
	private String quantity;

	/**
	 * 长度
	 */
	private String length;

	/**
	 * 宽度
	 */
	private String width;

	/**
	 * 修前视频照片
	 */
	private String photo;

	/**
	 * 条目类型 0 派工 1 错项 2 漏项 3 返工
	 */
	private String qualityStateLang;

	/**
	 * 返工-是否工艺标准 0 是 1 不是
	 */
	private String isTechnologyLang;

	/**
	 * 返工-质检问题类别
	 */
	private String reworkQuestionLang;

	/**
	 * 返工-整改标准
	 */
	private String rectificationStandardLang;

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartTypeCode() {
		return partTypeCode;
	}

	public void setPartTypeCode(String partTypeCode) {
		this.partTypeCode = partTypeCode;
	}

	public String getPartTypeNameLang() {
		return partTypeNameLang;
	}

	public void setPartTypeNameLang(String partTypeNameLang) {
		this.partTypeNameLang = partTypeNameLang;
	}

	public String getPartRepairCode() {
		return partRepairCode;
	}

	public void setPartRepairCode(String partRepairCode) {
		this.partRepairCode = partRepairCode;
	}

	public String getPartDetailCode() {
		return partDetailCode;
	}

	public void setPartDetailCode(String partDetailCode) {
		this.partDetailCode = partDetailCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getQualityStateLang() {
		return qualityStateLang;
	}

	public void setQualityStateLang(String qualityStateLang) {
		this.qualityStateLang = qualityStateLang;
	}

	public String getIsTechnologyLang() {
		return isTechnologyLang;
	}

	public void setIsTechnologyLang(String isTechnologyLang) {
		this.isTechnologyLang = isTechnologyLang;
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

}
