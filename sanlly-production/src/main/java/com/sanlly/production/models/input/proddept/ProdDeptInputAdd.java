package com.sanlly.production.models.input.proddept;

import com.alibaba.fastjson.JSON;

/**
 * @author zhq
 * @date 2019/10/24
 * @description 新增生产部门接口请求报文
 */
public class ProdDeptInputAdd {


    private String company;

    private String yard;

    private String prodDeptName;

    private String prodDeptNameEn;

    private Integer isValid;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getProdDeptName() {
        return prodDeptName;
    }

    public void setProdDeptName(String prodDeptName) {
        this.prodDeptName = prodDeptName;
    }

    public String getProdDeptNameEn() {
        return prodDeptNameEn;
    }

    public void setProdDeptNameEn(String prodDeptNameEn) {
        this.prodDeptNameEn = prodDeptNameEn;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
