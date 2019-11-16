package com.sanlly.warehouse.models.output.stockoutApply;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ClassName: StockoutApplyOutput
 * Description: 出库申请输出类
 * date: 2019/8/16 13:05
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("出库申请输出类")
public class StockoutApplyOutput {

    @ApiModelProperty(name = "wareStockoutApplyId",value = "出库申请单ID")
    private Integer wareStockoutApplyId;

    @ApiModelProperty(name = "stockoutApplyNo",value = "出库申请单号")
    private String stockoutApplyNo;

    @ApiModelProperty(name = "no",value = "源单号")
    private String no;

    @ApiModelProperty(name = "company",value = "所属公司")
    private String company;
    private String companyLangLang;

    @ApiModelProperty(name = "warehouse",value = "所属仓库")
    private String warehouse;
    private String warehouseLangLang;

    @ApiModelProperty(name = "warehouseType",value = "仓库类型")
    private String warehouseType;
    private String warehouseTypeLangLang;

    @ApiModelProperty(name = "billType",value = "单据类型")
    private String billType;
    private String billTypeLangLang;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;
    private String stockoutStatusLangLang;

    @ApiModelProperty(name = "receiveDepartment",value = "申请部门")
    private String receiveDepartment;
    private String receiveDepartmentLangLang;

    @ApiModelProperty(name = "receiveUser",value = "申请人")
    private Integer receiveUser;
    private String receiveUserStr;

    @ApiModelProperty(name = "status",value = "确认状态")
    private String status;
    private String statusLangLang;

    @ApiModelProperty(name = "auditStatus",value = "审核状态")
    private String auditStatus;
    private String auditStatusLangLang;

    @ApiModelProperty(name = "reasonsRejection",value = "驳回原因")
    private String reasonsRejection;

    private Integer operator;
    private String operatorName;
    private String operatorTime;
    
    @ApiModelProperty(name = "containerNo",value = "箱号")
    private String containerNo;
    
    @ApiModelProperty(name = "applyDetailList",value = "出库申请单明细")
    private List<StockoutApplyDetailOutput> applyDetailList;

    public String getReceiveUserStr() {
        return receiveUserStr;
    }

    public void setReceiveUserStr(String receiveUserStr) {
        this.receiveUserStr = receiveUserStr;
    }

    public Integer getWareStockoutApplyId() {
        return wareStockoutApplyId;
    }

    public void setWareStockoutApplyId(Integer wareStockoutApplyId) {
        this.wareStockoutApplyId = wareStockoutApplyId;
    }

    public String getStockoutApplyNo() {
        return stockoutApplyNo;
    }

    public void setStockoutApplyNo(String stockoutApplyNo) {
        this.stockoutApplyNo = stockoutApplyNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getStockoutStatusLangLang() {
        return stockoutStatusLangLang;
    }

    public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
        this.stockoutStatusLangLang = stockoutStatusLangLang;
    }

    public String getReceiveDepartment() {
        return receiveDepartment;
    }

    public void setReceiveDepartment(String receiveDepartment) {
        this.receiveDepartment = receiveDepartment;
    }

    public String getReceiveDepartmentLangLang() {
        return receiveDepartmentLangLang;
    }

    public void setReceiveDepartmentLangLang(String receiveDepartmentLangLang) {
        this.receiveDepartmentLangLang = receiveDepartmentLangLang;
    }

    public Integer getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(Integer receiveUser) {
        this.receiveUser = receiveUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLangLang() {
        return statusLangLang;
    }

    public void setStatusLangLang(String statusLangLang) {
        this.statusLangLang = statusLangLang;
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

    public List<StockoutApplyDetailOutput> getApplyDetailList() {
        return applyDetailList;
    }

    public void setApplyDetailList(List<StockoutApplyDetailOutput> applyDetailList) {
        this.applyDetailList = applyDetailList;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getWarehouseTypeLangLang() {
        return warehouseTypeLangLang;
    }

    public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
        this.warehouseTypeLangLang = warehouseTypeLangLang;
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

	public String getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(String operatorTime) {
		this.operatorTime = operatorTime;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	
	
    
}
