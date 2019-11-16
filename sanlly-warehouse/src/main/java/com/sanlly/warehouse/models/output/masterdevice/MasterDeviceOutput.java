package com.sanlly.warehouse.models.output.masterdevice;

import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ClassName: MasterDeviceOutput
 * Description: 主件输出类
 * date: 2019/7/24 15:03
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("主件输出类")
public class MasterDeviceOutput {

    @ApiModelProperty(name="主件ID",value = "wareMasterDeviceId")
    private Integer wareMasterDeviceId;

    @ApiModelProperty(name="主键编号",value = "masterDeviceNo")
    private String masterDeviceNo;

    @ApiModelProperty(name="key",value = "key")
    private String key;

    @ApiModelProperty(name="国际化key",value = "keyLangLang")
    private String keyLangLang;

    @ApiModelProperty(name="主件英文名",value = "masterDeviceNameEn")
    private String masterDeviceNameEn;

    @ApiModelProperty(name="主件名",value = "masterDeviceName")
    private String masterDeviceName;

    @ApiModelProperty(name="默认备件",value = "defaultSpare")
    private String defaultSpare;

    @ApiModelProperty(name="默认备件",value = "defaultSpareLangLang")
    private String defaultSpareLangLang;

    @ApiModelProperty(name = "所属备件",value = "detailList")
    private List<SparePartsOutput> detailList;

    public String getDefaultSpare() {
        return defaultSpare;
    }

    public void setDefaultSpare(String defaultSpare) {
        this.defaultSpare = defaultSpare;
    }

    public String getDefaultSpareLangLang() {
        return defaultSpareLangLang;
    }

    public void setDefaultSpareLangLang(String defaultSpareLangLang) {
        this.defaultSpareLangLang = defaultSpareLangLang;
    }

    public Integer getWareMasterDeviceId() {
        return wareMasterDeviceId;
    }

    public void setWareMasterDeviceId(Integer wareMasterDeviceId) {
        this.wareMasterDeviceId = wareMasterDeviceId;
    }

    public String getMasterDeviceNo() {
        return masterDeviceNo;
    }

    public void setMasterDeviceNo(String masterDeviceNo) {
        this.masterDeviceNo = masterDeviceNo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyLangLang() {
        return keyLangLang;
    }

    public void setKeyLangLang(String keyLangLang) {
        this.keyLangLang = keyLangLang;
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

    public List<SparePartsOutput> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<SparePartsOutput> detailList) {
        this.detailList = detailList;
    }
}
