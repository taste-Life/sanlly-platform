package com.sanlly.production.models.input.mustcheckhour;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public class MustCheckHourInputAdd {
    private String containerCategory;

    private String company;

    private Integer hour;

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}
