package com.sanlly.warehouse.models.output.masterdevice;

import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;

import java.util.List;

/**
 * ClassName: MasterDeviceOutput
 * Description: 主件详细输出
 * date: 2019/7/24 15:03
 *
 * @author wannt
 * @since JDK 1.8
 */
public class MasterDeviceDetailOutput {

    // Id
    private Integer wareMasterDeviceId;

    // key
    private String keyLangLang;

    // key
    private String key;

    // 主件编号
    private String masterDeviceNo;

    // 英文名
    private String masterDeviceNameEn;

    // 中文名
    private String masterDeviceName;

    // 默认备件
    private String defaultSpare;
    private String defaultSpareLangLang;

    // 备件列表
    private List<SparePartsOutput> sparePartsList;

    public Integer getWareMasterDeviceId() {
        return wareMasterDeviceId;
    }

    public void setWareMasterDeviceId(Integer wareMasterDeviceId) {
        this.wareMasterDeviceId = wareMasterDeviceId;
    }

    public String getKeyLangLang() {
        return keyLangLang;
    }

    public void setKeyLangLang(String keyLangLang) {
        this.keyLangLang = keyLangLang;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getMasterDeviceName() {
        return masterDeviceName;
    }

    public void setMasterDeviceName(String masterDeviceName) {
        this.masterDeviceName = masterDeviceName;
    }

    public List<SparePartsOutput> getSparePartsList() {
        return sparePartsList;
    }

    public void setSparePartsList(List<SparePartsOutput> sparePartsList) {
        this.sparePartsList = sparePartsList;
    }

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
}
