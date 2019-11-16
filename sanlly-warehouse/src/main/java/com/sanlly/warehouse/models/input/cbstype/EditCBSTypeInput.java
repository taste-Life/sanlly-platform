package com.sanlly.warehouse.models.input.cbstype;

/**
 * @Description: TODO
 * @ClassName: EditCBSTypeInput
 * @Date: 2019/10/12 10:47
 * @Version 1.0
 * @Author mqz
 */
public class EditCBSTypeInput {
    //主键id
    private Integer wareCbsWarehouseTypeId;
    //数值
    private String code;
    //cbs仓库类型英文名称
    private String cbsWarehouseTypeNameEn;
    //cbs仓库类型名称
    private String cbsWarehouseTypeName;

    public Integer getWareCbsWarehouseTypeId() {
        return wareCbsWarehouseTypeId;
    }

    public void setWareCbsWarehouseTypeId(Integer wareCbsWarehouseTypeId) {
        this.wareCbsWarehouseTypeId = wareCbsWarehouseTypeId;
    }

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
