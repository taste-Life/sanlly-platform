package com.sanlly.warehouse.models.output.stockout;

import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: StockoutOutput
 * Description: 出库输出类
 * date: 2019/8/6 16:57
 *
 * @author wannt
 * @since JDK 1.8
 */
public class StockoutOutput {

    //出库单id
    private Integer wareStockoutId;

    //出库单号
    private String stockoutNo;

    //预出库单号
    private String advanceWarehouseReceiptNo;

    //研发单号
    private String researchNo;

    //源单号
    private String no;

    //所属公司
    private String companyLangLang;
    private String company;

    //所属仓库
    private String warehouseLangLang;
    private String warehouse;

    //单据类型
    private String billTypeLangLang;
    private String billType;

    //出库状态
    private String stockoutStatusLangLang;
    private String stockoutStatus;

    //领用部门
    private String receiveDepartmentLangLang;
    private String receiveDepartment;

    //领用人
    private String receiveUser;
    private String receiveUserStr;

    //确认状态
    private String statusLangLang;
    private String status;

    //是否传SBS
    private String isStockSbsLangLang;
    private String isStockSbs;

    //审核状态
    private String auditStatusLangLang;
    private String auditStatus;

    //驳回原因
    private String reasonsRejection;

    private String createTime;

    private Integer createUser;
    private String createUserName;

    private String updateTime;

    private Integer updateUser;
    private String updateUserLang;
    //箱号
    private String containerNo;

    //出库单详细 集合
    private List<StockoutDetailOutput> detailOutputs;

    public String getReceiveUserStr() {
        return receiveUserStr;
    }

    public void setReceiveUserStr(String receiveUserStr) {
        this.receiveUserStr = receiveUserStr;
    }

    public Integer getWareStockoutId() {
        return wareStockoutId;
    }

    public void setWareStockoutId(Integer wareStockoutId) {
        this.wareStockoutId = wareStockoutId;
    }

    public String getStockoutNo() {
        return stockoutNo;
    }

    public void setStockoutNo(String stockoutNo) {
        this.stockoutNo = stockoutNo;
    }

    public String getAdvanceWarehouseReceiptNo() {
        return advanceWarehouseReceiptNo;
    }

    public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
        this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo;
    }

    public String getResearchNo() {
        return researchNo;
    }

    public void setResearchNo(String researchNo) {
        this.researchNo = researchNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public String getWarehouseLangLang() {
        return warehouseLangLang;
    }

    public void setWarehouseLangLang(String warehouseLangLang) {
        this.warehouseLangLang = warehouseLangLang;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
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

    public String getStockoutStatusLangLang() {
        return stockoutStatusLangLang;
    }

    public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
        this.stockoutStatusLangLang = stockoutStatusLangLang;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getReceiveDepartmentLangLang() {
        return receiveDepartmentLangLang;
    }

    public void setReceiveDepartmentLangLang(String receiveDepartmentLangLang) {
        this.receiveDepartmentLangLang = receiveDepartmentLangLang;
    }

    public String getReceiveDepartment() {
        return receiveDepartment;
    }

    public void setReceiveDepartment(String receiveDepartment) {
        this.receiveDepartment = receiveDepartment;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    public String getStatusLangLang() {
        return statusLangLang;
    }

    public void setStatusLangLang(String statusLangLang) {
        this.statusLangLang = statusLangLang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsStockSbsLangLang() {
        return isStockSbsLangLang;
    }

    public void setIsStockSbsLangLang(String isStockSbsLangLang) {
        this.isStockSbsLangLang = isStockSbsLangLang;
    }

    public String getIsStockSbs() {
        return isStockSbs;
    }

    public void setIsStockSbs(String isStockSbs) {
        this.isStockSbs = isStockSbs;
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

    public List<StockoutDetailOutput> getDetailOutputs() {
        return detailOutputs;
    }

    public void setDetailOutputs(List<StockoutDetailOutput> detailOutputs) {
        this.detailOutputs = detailOutputs;
    }


    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
    
	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getUpdateUserLang() {
        return updateUserLang;
    }

    public void setUpdateUserLang(String updateUserLang) {
        this.updateUserLang = updateUserLang;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    
	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	@Override
	public String toString() {
		return "StockoutOutput [wareStockoutId=" + wareStockoutId + ", stockoutNo=" + stockoutNo
				+ ", advanceWarehouseReceiptNo=" + advanceWarehouseReceiptNo + ", researchNo=" + researchNo + ", no="
				+ no + ", companyLangLang=" + companyLangLang + ", company=" + company + ", warehouseLangLang="
				+ warehouseLangLang + ", warehouse=" + warehouse + ", billTypeLangLang=" + billTypeLangLang
				+ ", billType=" + billType + ", stockoutStatusLangLang=" + stockoutStatusLangLang + ", stockoutStatus="
				+ stockoutStatus + ", receiveDepartmentLangLang=" + receiveDepartmentLangLang + ", receiveDepartment="
				+ receiveDepartment + ", receiveUser=" + receiveUser + ", receiveUserStr=" + receiveUserStr
				+ ", statusLangLang=" + statusLangLang + ", status=" + status + ", isStockSbsLangLang="
				+ isStockSbsLangLang + ", isStockSbs=" + isStockSbs + ", auditStatusLangLang=" + auditStatusLangLang
				+ ", auditStatus=" + auditStatus + ", reasonsRejection=" + reasonsRejection + ", createTime="
				+ createTime + ", createUser=" + createUser + ", createUserName=" + createUserName + ", updateTime="
				+ updateTime + ", updateUser=" + updateUser + ", updateUserLang=" + updateUserLang + ", detailOutputs="
				+ detailOutputs + "]";
	}

	
    
}

