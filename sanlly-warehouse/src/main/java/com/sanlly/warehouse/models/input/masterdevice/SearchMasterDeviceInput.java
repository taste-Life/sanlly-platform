package com.sanlly.warehouse.models.input.masterdevice;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: SearchMasterDeviceInput
 * Description:主件查询输入类
 * date: 2019/7/24 14:48
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "主件查询输入类")
public class SearchMasterDeviceInput extends PageInput {

    @ApiModelProperty(value = "主件名",name = "masterDeviceName")
    private String masterDeviceName;

    @ApiModelProperty(value = "主件号",name = "masterDeviceNo")
    private String masterDeviceNo;

    @ApiModelProperty(value = "主件英文名",name = "masterDeviceNameEn")
    private String masterDeviceNameEn;

    public SearchMasterDeviceInput() {
    }

    public SearchMasterDeviceInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getMasterDeviceName() {
        return masterDeviceName;
    }

    public void setMasterDeviceName(String masterDeviceName) {
        this.masterDeviceName = masterDeviceName;
    }

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
}
