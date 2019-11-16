package com.sanlly.warehouse.models.input.billtype;

public class EditBillTypeInput extends AddBillTypeInput{
	
	private Integer wareBillTypeId;
	
	private String key;

	private Integer updateUser;

	public Integer getWareBillTypeId() {
		return wareBillTypeId;
	}

	public void setWareBillTypeId(Integer wareBillTypeId) {
		this.wareBillTypeId = wareBillTypeId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

}
