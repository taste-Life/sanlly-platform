package com.sanlly.warehouse.models.output.returnSlip;

import java.util.Date;
import java.util.List;

/**
 * ClassName: ReturnSlipOutput
 * Description: 退货单输出类
 * date: 2019/9/16 9:46
 *
 * @author wannt
 * @since JDK 1.8
 */
public class ReturnSlipOutput {

    // 退货单ID
    private Integer wareReturnSlipId;

    // 源单号
    private String sourceId;

    // 所属公司
    private String company;
    private String companyLangLang;

    // 所属仓库
    private String warehouse;
    private String warehouseLangLang;

    // 退货单号
    private String returnBillNo;

    // 退货日期
    private Date returnDate;
    private String returnDateStr;

    // 供应商
    private String supplier;
    private String supplierLangLang;

    // 发票类型
    private String invoiceType;
    private String invoiceTypeLangLang;

    // 审核状态
    private String auditStatus;
    private String auditStatusLangLang;

    // 驳回原因
    private String reasonsRejection;

    // 退货状态
    private String returnStatus;
    private String returnStatusLangLang;

    private Integer isDel;

    private Date createTime;
    private String createTimeStr;

    private Integer createUser;
    private String createUserStr;

    private Date updateTime;

    private Integer updateUser;

    private List<ReturnSlipDetailOutput> detailOutputList;

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getCreateUserStr() {
        return createUserStr;
    }

    public void setCreateUserStr(String createUserStr) {
        this.createUserStr = createUserStr;
    }

    public String getReturnDateStr() {
        return returnDateStr;
    }

    public void setReturnDateStr(String returnDateStr) {
        this.returnDateStr = returnDateStr;
    }

    public List<ReturnSlipDetailOutput> getDetailOutputList() {
        return detailOutputList;
    }

    public void setDetailOutputList(List<ReturnSlipDetailOutput> detailOutputList) {
        this.detailOutputList = detailOutputList;
    }

    public Integer getWareReturnSlipId() {
        return wareReturnSlipId;
    }

    public void setWareReturnSlipId(Integer wareReturnSlipId) {
        this.wareReturnSlipId = wareReturnSlipId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
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

    public String getReturnBillNo() {
        return returnBillNo;
    }

    public void setReturnBillNo(String returnBillNo) {
        this.returnBillNo = returnBillNo;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierLangLang() {
        return supplierLangLang;
    }

    public void setSupplierLangLang(String supplierLangLang) {
        this.supplierLangLang = supplierLangLang;
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

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnStatusLangLang() {
        return returnStatusLangLang;
    }

    public void setReturnStatusLangLang(String returnStatusLangLang) {
        this.returnStatusLangLang = returnStatusLangLang;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouseLangLang() {
        return warehouseLangLang;
    }

    public void setWarehouseLangLang(String warehouseLangLang) {
        this.warehouseLangLang = warehouseLangLang;
    }
}
