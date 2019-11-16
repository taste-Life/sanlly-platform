package com.sanlly.warehouse.models.output.returnSlip;

import java.util.Date;

/**
 * ClassName: ReturnSlipDetailOutput
 * Description: 退货单明细输出类
 * date: 2019/9/16 9:47
 *
 * @author wannt
 * @since JDK 1.8
 */
public class ReturnSlipDetailOutput {

    // 退货单明细ID
    private Integer wareReturnSlipDetailId;

    // 退货单ID
    private Integer wareReturnSlipId;

    // 备件批次
    private String sparePartsBatch;

    // 备件
    private String spareParts;
    private String sparePartsLangLang;

    // 备件号
    private String sparePartsNo;

    // 库位
    private String storageLocation;

    // 备件大类
    private String sparePartsCategories;
    private String sparePartsCategoriesLangLang;

    // 入库数量
    private Double entryNum;

    private Integer isDel;

    // 退货数量
    private Double returnNum;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareReturnSlipDetailId() {
        return wareReturnSlipDetailId;
    }

    public void setWareReturnSlipDetailId(Integer wareReturnSlipDetailId) {
        this.wareReturnSlipDetailId = wareReturnSlipDetailId;
    }

    public Integer getWareReturnSlipId() {
        return wareReturnSlipId;
    }

    public void setWareReturnSlipId(Integer wareReturnSlipId) {
        this.wareReturnSlipId = wareReturnSlipId;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsCategoriesLangLang() {
        return sparePartsCategoriesLangLang;
    }

    public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
        this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }
}
