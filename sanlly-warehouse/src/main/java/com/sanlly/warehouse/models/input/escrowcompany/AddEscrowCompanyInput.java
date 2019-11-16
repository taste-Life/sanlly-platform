package com.sanlly.warehouse.models.input.escrowcompany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddEscrowCompanyInput
 * Description: 添加代管公司输入类
 * date: 2019/7/29 14:44
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "添加代管公司输入类")
public class AddEscrowCompanyInput {

    @ApiModelProperty(value = "代管公司编号",name = "escrowCompanyNo")
    private String escrowCompanyNo;

    @ApiModelProperty(value = "代管公司名称",name = "escrowCompanyName")
    private String escrowCompanyName;

    @ApiModelProperty(value = "代管公司英文名称",name = "escrowCompanyNameEn")
    private String escrowCompanyNameEn;

    @ApiModelProperty(value = "代管公司地址",name = "escrowCompanyAddr")
    private String escrowCompanyAddr;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    public String getEscrowCompanyNo() {
        return escrowCompanyNo;
    }

    public void setEscrowCompanyNo(String escrowCompanyNo) {
        this.escrowCompanyNo = escrowCompanyNo;
    }

    public String getEscrowCompanyName() {
        return escrowCompanyName;
    }

    public void setEscrowCompanyName(String escrowCompanyName) {
        this.escrowCompanyName = escrowCompanyName;
    }

    public String getEscrowCompanyNameEn() {
        return escrowCompanyNameEn;
    }

    public void setEscrowCompanyNameEn(String escrowCompanyNameEn) {
        this.escrowCompanyNameEn = escrowCompanyNameEn;
    }

    public String getEscrowCompanyAddr() {
        return escrowCompanyAddr;
    }

    public void setEscrowCompanyAddr(String escrowCompanyAddr) {
        this.escrowCompanyAddr = escrowCompanyAddr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
