package com.sanlly.warehouse.models.input.cbstype;

/**
 * @Description: TODO
 * @ClassName: AddCBSTypeInput
 * @Date: 2019/10/12 10:47
 * @Version 1.0
 * @Author mqz
 */
public class AddCBSTypeInput {

    //cbs仓库类型英文名称
    private String cbsWarehouseTypeNameEn;
    //cbs仓库类型名称
    private String cbsWarehouseTypeName;
    //数值
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
