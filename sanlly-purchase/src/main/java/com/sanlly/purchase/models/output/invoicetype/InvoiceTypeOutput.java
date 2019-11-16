package com.sanlly.purchase.models.output.invoicetype;

/**、
 * @Description: 发票类型输出类
 * @ClassName: InvoiceTypeOutput
 * @Date: 2019/8/15 14:02
 * @Version 1.0
 * @Author mqz
 */
public class InvoiceTypeOutput {
//主键id自增
    private Integer purcInvoiceTypeId;
//唯一的key
    private String key;
//发票类型
    private String invoiceTypeName;
//发票类型英文
    private String invoiceTypeEn;
//税点
    private Double invoicePoint;
 private  String keyLangLang;
// 发票分类
 private String invoiceCategroy;
 private String invoiceCategroyLangLang;

    public String getKeyLangLang() {
        return keyLangLang;
    }

    public void setKeyLangLang(String keyLangLang) {
        this.keyLangLang = keyLangLang;
    }

    public Integer getPurcInvoiceTypeId() {
        return purcInvoiceTypeId;
    }

    public void setPurcInvoiceTypeId(Integer purcInvoiceTypeId) {
        this.purcInvoiceTypeId = purcInvoiceTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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

	public String getInvoiceCategroyLangLang() {
		return invoiceCategroyLangLang;
	}

	public void setInvoiceCategroyLangLang(String invoiceCategroyLangLang) {
		this.invoiceCategroyLangLang = invoiceCategroyLangLang;
	}
    
}
