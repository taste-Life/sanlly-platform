package com.sanlly.production.models.output.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 领料备件列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:08:09 
 * @version V1.0   
 */
public class FixPickingListOutput {

	private String referralNo;

	private String referralEntryId;

	private String sparesNum;

	private String sparesNumNameLang;

	private String length;

	private String width;

	private String quantity;

	private String pickingQuantity;

	private String borrowQuantity;

	private String pickingStateLang;

	public String getReferralNo() {
		return referralNo;
	}

	public void setReferralNo(String referralNo) {
		this.referralNo = referralNo;
	}

	public String getReferralEntryId() {
		return referralEntryId;
	}

	public void setReferralEntryId(String referralEntryId) {
		this.referralEntryId = referralEntryId;
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

	public String getPickingQuantity() {
		return pickingQuantity;
	}

	public void setPickingQuantity(String pickingQuantity) {
		this.pickingQuantity = pickingQuantity;
	}

	public String getBorrowQuantity() {
		return borrowQuantity;
	}

	public void setBorrowQuantity(String borrowQuantity) {
		this.borrowQuantity = borrowQuantity;
	}

	public String getPickingStateLang() {
		return pickingStateLang;
	}

	public void setPickingStateLang(String pickingStateLang) {
		this.pickingStateLang = pickingStateLang;
	}

}
