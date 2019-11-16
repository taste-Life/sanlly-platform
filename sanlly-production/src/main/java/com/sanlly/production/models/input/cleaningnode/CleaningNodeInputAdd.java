package com.sanlly.production.models.input.cleaningnode;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public class CleaningNodeInputAdd {
    private String company;

    private String containerUser;

    private String cleaningType;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser;
    }

    public String getCleaningType() {
        return cleaningType;
    }

    public void setCleaningType(String cleaningType) {
        this.cleaningType = cleaningType;
    }
}
