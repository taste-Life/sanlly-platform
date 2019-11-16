package com.sanlly.warehouse.models.input.masterdevice;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: AddMasterDeviceSparePartsRelation
 * Description: 添加主件备件关联输入类
 * date: 2019/7/24 15:32
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "添加主件备件关联输入类")
public class AddMasterDeviceSparePartsRelation {

    @ApiModelProperty(value="主件key",name="masterDevice")
    private String masterDevice;

    @ApiModelProperty(value="备件key",name="spareParts")
    private String spareParts;

    @ApiModelProperty(value="备注",name="remark")
    private String remark;

    public String getMasterDevice() {
        return masterDevice;
    }

    public void setMasterDevice(String masterDevice) {
        this.masterDevice = masterDevice;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
