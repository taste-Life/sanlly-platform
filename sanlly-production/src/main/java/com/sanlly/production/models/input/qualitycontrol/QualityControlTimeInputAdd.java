package com.sanlly.production.models.input.qualitycontrol;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class QualityControlTimeInputAdd {
    private String company;

    private String containerCategory;

    private String qualityControlType;

    private Integer qualityControlTime;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getQualityControlType() {
        return qualityControlType;
    }

    public void setQualityControlType(String qualityControlType) {
        this.qualityControlType = qualityControlType;
    }

    public Integer getQualityControlTime() {
        return qualityControlTime;
    }

    public void setQualityControlTime(Integer qualityControlTime) {
        this.qualityControlTime = qualityControlTime;
    }
}
