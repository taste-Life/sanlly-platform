package com.sanlly.purchase.models.input.invoicetype;

/**
 * @Description: TODO
 * @ClassName: EditInvoiceTypeInput
 * @Version 1.0
 * @Author mqz
 */
public class EditInvoiceTypeInput {
    private Integer purcInvoiceTypeId;

    private String invoiceTypeName;

    private String invoiceTypeEn;

    private Double invoicePoint;
 // 发票分类
    private String invoiceCategroy;

    public String getInvoiceTypeName() {
        return invoiceTypeName;
    }

    public void setInvoiceTypeName(String invoiceTypeName) {
        this.invoiceTypeName = invoiceTypeName;
    }

    public String getInvoiceTypeEn() {
        return invoiceTypeEn;
    }

    public void setInvoiceTypeEn(String invoiceTypeEn) {
        this.invoiceTypeEn = invoiceTypeEn;
    }

    public Double getInvoicePoint() {
        return invoicePoint;
    }

    public void setInvoicePoint(Double invoicePoint) {
        this.invoicePoint = invoicePoint;
    }

    public Integer getPurcInvoiceTypeId() {
        return purcInvoiceTypeId;
    }

    public void setPurcInvoiceTypeId(Integer purcInvoiceTypeId) {
        this.purcInvoiceTypeId = purcInvoiceTypeId;
    }

	public String getInvoiceCategroy() {
		return invoiceCategroy;
	}

	public void setInvoiceCategroy(String invoiceCategroy) {
		this.invoiceCategroy = invoiceCategroy;
	}
    
}
