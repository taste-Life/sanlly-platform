package com.sanlly.warehouse.models.input.masterdevice;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditMasterDeviceInput
 * Description: 添加主件输入类
 * date: 2019/7/24 14:47
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "添加主件输入类")
public class AddMasterDeviceInput {

    @ApiModelProperty(value="主件号",name="masterDeviceNo")
    private String masterDeviceNo;

    @ApiModelProperty(value="主件英文名",name="masterDeviceNameEn")
    private String masterDeviceNameEn;

    @ApiModelProperty(value="主件名",name="masterDeviceName")
    private String masterDeviceName;

    @ApiModelProperty(name="默认备件",value = "defaultSpare")
    private String defaultSpare;

    @ApiModelProperty(value = "所属备件",name = "masterDeviceDetail")
    private String[] masterDeviceDetail;


    public String getMasterDeviceNo() {
        return masterDeviceNo;
    }

    public void setMasterDeviceNo(String masterDeviceNo) {
        this.masterDeviceNo = masterDeviceNo;
    }

    public String getMasterDeviceNameEn() {
        return masterDeviceNameEn;
    }

    public void setMasterDeviceNameEn(String masterDeviceNameEn) {
        this.masterDeviceNameEn = masterDeviceNameEn;
    }

    public String getMasterDeviceName() {
        return masterDeviceName;
    }

    public void setMasterDeviceName(String masterDeviceName) {
        this.masterDeviceName = masterDeviceName;
    }

    public String[] getMasterDeviceDetail() {
        return masterDeviceDetail;
    }

    public String getDefaultSpare() {
        return defaultSpare;
    }

    public void setDefaultSpare(String defaultSpare) {
        this.defaultSpare = defaultSpare;
    }

    public void setMasterDeviceDetail(String[] masterDeviceDetail) {
        this.masterDeviceDetail = masterDeviceDetail;
    }
}