package com.sanlly.warehouse.models.output.cbstype;

/**
 * @Description: TODO
 * @ClassName: CBSTypeOutput
 * @Date: 2019/10/12 10:47
 * @Version 1.0
 * @Author mqz
 */
public class CBSTypeOutput {
    //主键id
    private Integer wareCbsWarehouseTypeId;
    //key
    private String key;
    //cbs仓库类型英文名称
    private String cbsWarehouseTypeNameEn;
    //cbs仓库类型名称
    private String cbsWarehouseTypeName;
    private String code;
    private  String cbsWarehouseTypeLangLang;

    public String getCbsWarehouseTypeLangLang() {
        return cbsWarehouseTypeLangLang;
    }

    public void setCbsWarehouseTypeLangLang(String cbsWarehouseTypeLangLang) {
        this.cbsWarehouseTypeLangLang = cbsWarehouseTypeLangLang;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getWareCbsWarehouseTypeId() {
        return wareCbsWarehouseTypeId;
    }

    public void setWareCbsWarehouseTypeId(Integer wareCbsWarehouseTypeId) {
        this.wareCbsWarehouseTypeId = wareCbsWarehouseTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCbsWarehouseTypeNameEn() {
        return cbsWarehouseTypeNameEn;
    }

    public void setCbsWarehouseTypeNameEn(String cbsWarehouseTypeNameEn) {
        this.cbsWarehouseTypeNameEn = cbsWarehouseTypeNameEn;
    }

    public String getCbsWarehouseTypeName() {
        return cbsWarehouseTypeName;
    }

    public void setCbsWarehouseTypeName(String cbsWarehouseTypeName) {
        this.cbsWarehouseTypeName = cbsWarehouseTypeName;
    }

}
