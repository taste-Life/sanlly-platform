package com.sanlly.production.models.output.app.repair;

public class RelationRepairOutput {

	private String repaireCode;
	
	private String repaireName;
	
	private RelationRepairEntryOutput[] partsList;

	public String getRepaireCode() {
		return repaireCode;
	}

	public void setRepaireCode(String repaireCode) {
		this.repaireCode = repaireCode;
	}

	public String getRepaireName() {
		return repaireName;
	}

	public void setRepaireName(String repaireName) {
		this.repaireName = repaireName;
	}

	public RelationRepairEntryOutput[] getPartsList() {
		return partsList;
	}

	public void setPartsList(RelationRepairEntryOutput[] partsList) {
		this.partsList = partsList;
	}
	
	
}
