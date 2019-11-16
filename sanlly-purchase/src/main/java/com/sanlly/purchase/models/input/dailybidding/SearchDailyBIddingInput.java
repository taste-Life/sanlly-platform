package com.sanlly.purchase.models.input.dailybidding;

import com.sanlly.common.models.input.PageInput;

import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: SearchDailyBIddingInput
 * @Date: 2019/8/26 9:16
 * @Version 1.0
 * @Author mqz
 */
public class SearchDailyBIddingInput extends PageInput {
    // 招标发布时间起
    private Date tenderCreateTimeStart;
    // 招标发布时间止
    private Date tenderCreateTimeEnd;
    // 采购单位
    private String purchaseCompany;
    // 招标方式
    private String tenderMethod;
    // 招标状态
    private String tenderStatus;
    // 招标项目名称
    private String tenderName;

    public SearchDailyBIddingInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public Date getTenderCreateTimeStart() {
        return tenderCreateTimeStart;
    }

    public void setTenderCreateTimeStart(Date tenderCreateTimeStart) {
        this.tenderCreateTimeStart = tenderCreateTimeStart;
    }

    public Date getTenderCreateTimeEnd() {
        return tenderCreateTimeEnd;
    }

    public void setTenderCreateTimeEnd(Date tenderCreateTimeEnd) {
        this.tenderCreateTimeEnd = tenderCreateTimeEnd;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getTenderMethod() {
        return tenderMethod;
    }

    public void setTenderMethod(String tenderMethod) {
        this.tenderMethod = tenderMethod;
    }

    public String getTenderStatus() {
        return tenderStatus;
    }

    public void setTenderStatus(String tenderStatus) {
        this.tenderStatus = tenderStatus;
    }

    public String getTenderName() {
        return tenderName;
    }

    public void setTenderName(String tenderName) {
        this.tenderName = tenderName;
    }
}
