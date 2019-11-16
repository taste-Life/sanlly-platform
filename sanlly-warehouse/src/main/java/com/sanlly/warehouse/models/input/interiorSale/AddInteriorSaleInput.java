package com.sanlly.warehouse.models.input.interiorSale;

import com.sanlly.warehouse.models.output.interiorSale.InteriorSaleDetailOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * ClassName: AddInteriorSaleInput
 * Description: 内部销售新增输入类
 * date: 2019/8/22 13:44
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("内部销售新增输入类")
public class AddInteriorSaleInput {

    @ApiModelProperty(value = "收货地址",name = "receivingAddress")
    private String receivingAddress;

    @ApiModelProperty(value = "单据类型",name = "billType")
    private String billType;

    @ApiModelProperty(value = "采购仓库",name = "intWarehouse")
    private String intWarehouse;

    @ApiModelProperty(value = "所属仓库",name = "outWarehouse")
    private String outWarehouse;

    @ApiModelProperty(value = "客户名称",name = "customerName")
    private String customerName;

    @ApiModelProperty(value = "收货人",name = "receivingUser")
    private String receivingUser;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    @ApiModelProperty(value = "内部采购详细",name = "interiordetail")
    private List<AddInteriorSaleDetailInput> interiordetail;

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getIntWarehouse() {
        return intWarehouse;
    }

    public void setIntWarehouse(String intWarehouse) {
        this.intWarehouse = intWarehouse;
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AddInteriorSaleDetailInput> getInteriordetail() {
        return interiordetail;
    }

    public void setInteriordetail(List<AddInteriorSaleDetailInput> interiordetail) {
        this.interiordetail = interiordetail;
    }

    public String getReceivingUser() {
        return receivingUser;
    }

    public void setReceivingUser(String receivingUser) {
        this.receivingUser = receivingUser;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
}
