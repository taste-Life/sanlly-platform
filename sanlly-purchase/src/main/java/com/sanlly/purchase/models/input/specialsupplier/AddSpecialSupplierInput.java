package com.sanlly.purchase.models.input.specialsupplier;

import java.util.List;

public class AddSpecialSupplierInput {
    private List<String> supplier;
    private String name;
    private String supplierType;
    private String comments;

	public List<String> getSupplier() {
		return supplier;
	}

	public void setSupplier(List<String> supplier) {
		this.supplier = supplier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }
}
