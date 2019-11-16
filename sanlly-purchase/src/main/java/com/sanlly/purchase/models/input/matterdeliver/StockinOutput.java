package com.sanlly.purchase.models.input.matterdeliver;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: StockinOutput
 * Description:  入库单输出类
 * date: 2019/8/2 14:58
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "入库单输出类")
public class StockinOutput {

    @ApiModelProperty(value = "入库单ID",name = "wareStockinId")
    private Integer wareStockinId;

    @ApiModelProperty(value = "入库单单号",name = "stockinNo")
    private String stockinNo;

    @ApiModelProperty(value = "源单号",name = "no")
    private String no;

    @ApiModelProperty(value = "源单据类型",name = "billTypeLang")
    private String billTypeLangLang;
    private String billType;

    @ApiModelProperty(value = "所属公司",name = "companyLang")
    private String companyLangLang;
    private String company;

    @ApiModelProperty(value = "所属代管公司",name = "escrowCompany")
    private String escrowCompanyLangLang;
    private String escrowCompany;

    @ApiModelProperty(value = "入库仓库",name = "entryWarehouseLang")
    private String entryWarehouseLangLang;
    private String entryWarehouse;

    @ApiModelProperty(value = "入库状态",name = "entryStatusLang")
    private String entryStatusLangLang;
    private String entryStatus;

    @ApiModelProperty(value = "供应商",name = "supplierIdLang")
    private String supplierIdLangLang;
    private String supplierId;

    @ApiModelProperty(value = "单据总金额",name = "billTotalAmount")
    private BigDecimal billTotalAmount;

    @ApiModelProperty(value = "发票类型",name = "invoiceTypeLang")
    private String invoiceType;
    private String invoiceTypeLangLang;

    @ApiModelProperty(value = "物流公司",name = "logisticsCompany")
    private String logisticsCompany;

    @ApiModelProperty(value = "总金额",name = "totalAmount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "关税",name = "tariff")
    private BigDecimal tariff;

    @ApiModelProperty(value = "增值税",name = "vat")
    private BigDecimal vat;

    @ApiModelProperty(value = "运费",name = "freight")
    private BigDecimal freight;

    @ApiModelProperty(value = "已入库数量",name = "entryedNum")
    private Double entryedNum;

    @ApiModelProperty(value = "审核状态",name = "auditStatusLang")
    private String auditStatusLangLang;
    private String auditStatus;

    @ApiModelProperty(value = "驳回原因",name = "reasonsRejection")
    private String reasonsRejection;

    @ApiModelProperty(value = "入库单明细列表",name = "stockinDetail")
    private List<StockinDetailOutput> stockinDetail;

    public Integer getWareStockinId() {
        return wareStockinId;
    }

    public void setWareStockinId(Integer wareStockinId) {
        this.wareStockinId = wareStockinId;
    }

    public String getStockinNo() {
        return stockinNo;
    }

    public void setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBillTypeLangLang() {
        return billTypeLangLang;
    }

    public void setBillTypeLangLang(String billTypeLangLang) {
        this.billTypeLangLang = billTypeLangLang;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEntryWarehouseLangLang() {
        return entryWarehouseLangLang;
    }

    public void setEntryWarehouseLangLang(String entryWarehouseLangLang) {
        this.entryWarehouseLangLang = entryWarehouseLangLang;
    }

    public String getEntryWarehouse() {
        return entryWarehouse;
    }

    public void setEntryWarehouse(String entryWarehouse) {
        this.entryWarehouse = entryWarehouse;
    }

    public String getEntryStatusLangLang() {
        return entryStatusLangLang;
    }

    public void setEntryStatusLangLang(String entryStatusLangLang) {
        this.entryStatusLangLang = entryStatusLangLang;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getSupplierIdLangLang() {
        return supplierIdLangLang;
    }

    public void setSupplierIdLangLang(String supplierIdLangLang) {
        this.supplierIdLangLang = supplierIdLangLang;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getBillTotalAmount() {
        return billTotalAmount;
    }

    public void setBillTotalAmount(BigDecimal billTotalAmount) {
        this.billTotalAmount = billTotalAmount;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTypeLangLang() {
        return invoiceTypeLangLang;
    }

    public void setInvoiceTypeLangLang(String invoiceTypeLangLang) {
        this.invoiceTypeLangLang = invoiceTypeLangLang;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public Double getEntryedNum() {
        return entryedNum;
    }

    public void setEntryedNum(Double entryedNum) {
        this.entryedNum = entryedNum;
    }

    public String getAuditStatusLangLang() {
        return auditStatusLangLang;
    }

    public void setAuditStatusLangLang(String auditStatusLangLang) {
        this.auditStatusLangLang = auditStatusLangLang;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection;
    }

    public List<StockinDetailOutput> getStockinDetail() {
        return stockinDetail;
    }

    public void setStockinDetail(List<StockinDetailOutput> stockinDetail) {
        this.stockinDetail = stockinDetail;
    }

    public String getEscrowCompanyLangLang() {
        return escrowCompanyLangLang;
    }

    public void setEscrowCompanyLangLang(String escrowCompanyLangLang) {
        this.escrowCompanyLangLang = escrowCompanyLangLang;
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany;
    }
}
