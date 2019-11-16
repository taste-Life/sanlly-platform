package com.sanlly.purchase.models.input.invoicetype;

/**
 * @Description: 发票类型添加input
 * @ClassName: AddInvoiceTypeInput
 * @Date: 2019/8/15 13:34
 * @Version 1.0
 * @Author mqz
 */
public class AddInvoiceTypeInput {
    //发票类型中文名称
    private String invoiceTypeName;
    //发票类型英文
    private String invoiceTypeEn;
    //税点
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

	public String getInvoiceCategroy() {
		return invoiceCategroy;
	}

	public void setInvoiceCategroy(String invoiceCategroy) {
		this.invoiceCategroy = invoiceCategroy;
	}
    
}
