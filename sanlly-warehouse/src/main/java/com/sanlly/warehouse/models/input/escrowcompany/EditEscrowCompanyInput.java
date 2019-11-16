package com.sanlly.warehouse.models.input.escrowcompany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditEscrowCompanyInput
 * Description: 修改代管公司输入类
 * date: 2019/7/29 14:45
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "修改代管公司输入类")
public class EditEscrowCompanyInput {

    @ApiModelProperty(value = "代管公司ID",name = "wareEscrowCompanyId")
    private Integer wareEscrowCompanyId;

    @ApiModelProperty(value = "代管公司key",name = "key")
    private String key;

    @ApiModelProperty(value = "代管公司名称",name = "escrowCompanyName")
    private String escrowCompanyName;

    @ApiModelProperty(value = "代管公司名称",name = "escrowCompanyNo")
    private String escrowCompanyNo;

    @ApiModelProperty(value = "代管公司英文名称",name = "escrowCompanyNameEn")
    private String escrowCompanyNameEn;

    @ApiModelProperty(value = "代管公司地址",name = "escrowCompanyAddr")
    private String escrowCompanyAddr;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    public EditEscrowCompanyInput() {
    }

    public String getEscrowCompanyNo() {
        return escrowCompanyNo;
    }

    public void setEscrowCompanyNo(String escrowCompanyNo) {
        this.escrowCompanyNo = escrowCompanyNo;
    }

    public EditEscrowCompanyInput(String key) {
        this.key = key;
    }

    public Integer getWareEscrowCompanyId() {
        return wareEscrowCompanyId;
    }

    public void setWareEscrowCompanyId(Integer wareEscrowCompanyId) {
        this.wareEscrowCompanyId = wareEscrowCompanyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
