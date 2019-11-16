package com.sanlly.production.models.input.app.containerTesting;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.app.containerTesting 
 * @Description: TODO 箱体进场实体-输入
 * @author tianzhl   
 * @date 2019年8月9日 下午5:00:23 
 * @version V1.0   
 */
public class PartsDetailInput {

	// TODO 箱类别
	private String containerCategory;
	// TODO 部件明细key
	private String partsDetailKey;
	// TODO 损坏搜索内容
	private String damageSearch;
	// TODO 修理搜索内容
	private String repairSearch;
	// TODO 材质搜索内容
	private String materialSearch;


	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getPartsDetailKey() {
		return partsDetailKey;
	}

	public String getDamageSearch() {
		return damageSearch;
	}

	public String getRepairSearch() {
		return repairSearch;
	}

	public String getMaterialSearch() {
		return materialSearch;
	}


	public void setPartsDetailKey(String partsDetailKey) {
		this.partsDetailKey = partsDetailKey;
	}

	public void setDamageSearch(String damageSearch) {
		this.damageSearch = damageSearch;
	}

	public void setRepairSearch(String repairSearch) {
		this.repairSearch = repairSearch;
	}

	public void setMaterialSearch(String materialSearch) {
		this.materialSearch = materialSearch;
	}

}
