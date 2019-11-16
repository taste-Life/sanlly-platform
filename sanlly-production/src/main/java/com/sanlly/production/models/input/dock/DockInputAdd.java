package com.sanlly.production.models.input.dock;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public class DockInputAdd {
    private String dockCode;

    private String dockName;

    private String dockNameEn;

    private String company;

    public String getDockCode() {
        return dockCode;
    }

    public void setDockCode(String dockCode) {
        this.dockCode = dockCode;
    }

    public String getDockName() {
        return dockName;
    }

    public void setDockName(String dockName) {
        this.dockName = dockName;
    }

    public String getDockNameEn() {
        return dockNameEn;
    }

    public void setDockNameEn(String dockNameEn) {
        this.dockNameEn = dockNameEn;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
