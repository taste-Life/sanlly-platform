package com.sanlly.warehouse.models.output.stockin;

import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
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

    // 入库单id
    private Integer wareStockinId;

    // 入库单号
    private String stockinNo;

    // 源单号
    private String no;

    // 单据类型
    private String billType;
    private String billTypeLangLang;

    // 所属公司
    private String company;
    private String companyLangLang;

    // 所属代管公司
    private String escrowCompany;
    private String escrowCompanyLangLang;

    // 入库仓库
    private String entryWarehouse;
    private String entryWarehouseLangLang;

    // 入库状态
    private String entryStatus;
    private String entryStatusLangLang;

    // 供应商
    private String supplierId;
    private String supplierIdLangLang;

    // 单据总金额
    private BigDecimal billTotalAmount;

    // 发票类型
    private String invoiceType;
    private String invoiceTypeLangLang;

    // 物流公司
    private String logisticsCompany;

    // 总金额
    private BigDecimal totalAmount;

    // 关税
    private BigDecimal tariff;

    // 增值税
    private BigDecimal vat;

    // 运费
    private BigDecimal freight;

    // 已入库数量
    private Double entryedNum;

    // 传SBS状态
    private String isStockSbs;
    private String isStockSbsLangLang;

    // 审核状态
    private String auditStatus;
    private String auditStatusLangLang;

    // 驳回原因
    private String reasonsRejection;
    
    // 评价状态
    private String evaluateStatus;
    private String evaluateStatusLangLang;

    // 备注
    private String remark;

    // 图片
    private String image;
    //操作人
    private Integer operator;
    //操作人姓名
    private String operatorName;
    //入库时间
    private String stockInDate;

    // 入库单明细
    private List<StockinDetailOutput> stockinDetail;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<StockinDetailOutput> getStockinDetail() {
        return stockinDetail;
    }

    public void setStockinDetail(List<StockinDetailOutput> stockinDetail) {
        this.stockinDetail = stockinDetail;
    }

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

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillTypeLangLang() {
        return billTypeLangLang;
    }

    public void setBillTypeLangLang(String billTypeLangLang) {
        this.billTypeLangLang = billTypeLangLang;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany;
    }

    public String getEscrowCompanyLangLang() {
        return escrowCompanyLangLang;
    }

    public void setEscrowCompanyLangLang(String escrowCompanyLangLang) {
        this.escrowCompanyLangLang = escrowCompanyLangLang;
    }

    public String getEntryWarehouse() {
        return entryWarehouse;
    }

    public void setEntryWarehouse(String entryWarehouse) {
        this.entryWarehouse = entryWarehouse;
    }

    public String getEntryWarehouseLangLang() {
        return entryWarehouseLangLang;
    }

    public void setEntryWarehouseLangLang(String entryWarehouseLangLang) {
        this.entryWarehouseLangLang = entryWarehouseLangLang;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getEntryStatusLangLang() {
        return entryStatusLangLang;
    }

    public void setEntryStatusLangLang(String entryStatusLangLang) {
        this.entryStatusLangLang = entryStatusLangLang;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierIdLangLang() {
        return supplierIdLangLang;
    }

    public void setSupplierIdLangLang(String supplierIdLangLang) {
        this.supplierIdLangLang = supplierIdLangLang;
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

    public String getIsStockSbs() {
        return isStockSbs;
    }

    public void setIsStockSbs(String isStockSbs) {
        this.isStockSbs = isStockSbs;
    }

    public String getIsStockSbsLangLang() {
        return isStockSbsLangLang;
    }

    public void setIsStockSbsLangLang(String isStockSbsLangLang) {
        this.isStockSbsLangLang = isStockSbsLangLang;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatusLangLang() {
        return auditStatusLangLang;
    }

    public void setAuditStatusLangLang(String auditStatusLangLang) {
        this.auditStatusLangLang = auditStatusLangLang;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getEvaluateStatus() {
		return evaluateStatus;
	}

	public void setEvaluateStatus(String evaluateStatus) {
		this.evaluateStatus = evaluateStatus;
	}

	public String getEvaluateStatusLangLang() {
		return evaluateStatusLangLang;
	}

	public void setEvaluateStatusLangLang(String evaluateStatusLangLang) {
		this.evaluateStatusLangLang = evaluateStatusLangLang;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getStockInDate() {
		return stockInDate;
	}

	public void setStockInDate(String stockInDate) {
		this.stockInDate = stockInDate;
	}
    
}
