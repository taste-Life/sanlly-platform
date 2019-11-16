package com.sanlly.production.models.input.goh;

/**
 * 挂衣箱条目费率
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月25日 下午1:50:47 
 * @version V1.0   
 */
public class GohEntryRateInput {
	// 尺寸
	private String size;
	// 结构
	private String structure;
	// 层数
	private String tierNumber;
	// 改制类型
	private String reshapeType;
	// 费率名称
	private String entryName;
	// 备件
	private String sparesNumber;
	// 对应数量选择
	private String numberExplain;
	// 数量
	private Double quantity;
	// 重量
	private String weight;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getTierNumber() {
		return tierNumber;
	}

	public void setTierNumber(String tierNumber) {
		this.tierNumber = tierNumber;
	}

	public String getReshapeType() {
		return reshapeType;
	}

	public void setReshapeType(String reshapeType) {
		this.reshapeType = reshapeType;
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public String getNumberExplain() {
		return numberExplain;
	}

	public void setNumberExplain(String numberExplain) {
		this.numberExplain = numberExplain;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
