package com.sanlly.common.models.input.base;

public class ContainerTypeInput {

	private Integer prodContainerTypeId;

    private String key;

    private String containerTypeName;

    private String containerTypeNameEn;

    private String containerCategory;

	public Integer getProdContainerTypeId() {
		return prodContainerTypeId;
	}

	public void setProdContainerTypeId(Integer prodContainerTypeId) {
		this.prodContainerTypeId = prodContainerTypeId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getContainerTypeName() {
		return containerTypeName;
	}

	public void setContainerTypeName(String containerTypeName) {
		this.containerTypeName = containerTypeName;
	}

	public String getContainerTypeNameEn() {
		return containerTypeNameEn;
	}

	public void setContainerTypeNameEn(String containerTypeNameEn) {
		this.containerTypeNameEn = containerTypeNameEn;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
    
    
}
