package com.sanlly.warehouse.models.output.escrowcompany;

import io.swagger.annotations.ApiModel;

/**
 * ClassName: EscrowCompanyOutput
 * Description: 代管公司输出类
 * date: 2019/7/29 14:45
 *
 * @author wannt
 * @since JDK 1.8
 */
public class EscrowCompanyOutput {

    //代管公司ID
    private Integer wareEscrowCompanyId;

    //代管公司Key
    private String key;

    //代管公司 国际化key
    private String keyLangLang;

    //代管公司 编号
    private String escrowCompanyNo;

    //代管公司 名称
    private String escrowCompanyName;

    //代管公司 英文名称
    private String escrowCompanyNameEn;

    //代管公司 地址
    private String escrowCompanyAddr;

    private String remark;

    public String getEscrowCompanyNo() {
        return escrowCompanyNo;
    }

    public void setEscrowCompanyNo(String escrowCompanyNo) {
        this.escrowCompanyNo = escrowCompanyNo;
    }

    public Integer getWareEscrowCompanyId() {
        return wareEscrowCompanyId;
    }

    public void setWareEscrowCompanyId(Integer wareEscrowCompanyId) {
        this.wareEscrowCompanyId = wareEscrowCompanyId;
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

    public String getEscrowCompanyName() {
        return escrowCompanyName;
    }

    public void setEscrowCompanyName(String escrowCompanyName) {
        this.escrowCompanyName = escrowCompanyName;
    }

    public String getEscrowCompanyNameEn() {
        return escrowCompanyNameEn;
    }

    public void setEscrowCompanyNameEn(String escrowCompanyNameEn) {
        this.escrowCompanyNameEn = escrowCompanyNameEn;
    }

    public String getEscrowCompanyAddr() {
        return escrowCompanyAddr;
    }

    public void setEscrowCompanyAddr(String escrowCompanyAddr) {
        this.escrowCompanyAddr = escrowCompanyAddr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
