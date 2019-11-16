package com.sanlly.production.entity;

public class MaintenanceWithBLOBs extends Maintenance {
    private String faultDesc;

    private String faultDispose;

    private String faultRemarks;

    private String testingRemarks;

    private String afterPhoto;

    private String valuationRemarks;

    private String valuationRejectReason;

    private String respondRemarks;

    public String getFaultDesc() {
        return faultDesc;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc == null ? null : faultDesc.trim();
    }

    public String getFaultDispose() {
        return faultDispose;
    }

    public void setFaultDispose(String faultDispose) {
        this.faultDispose = faultDispose == null ? null : faultDispose.trim();
    }

    public String getFaultRemarks() {
        return faultRemarks;
    }

    public void setFaultRemarks(String faultRemarks) {
        this.faultRemarks = faultRemarks == null ? null : faultRemarks.trim();
    }

    public String getTestingRemarks() {
        return testingRemarks;
    }

    public void setTestingRemarks(String testingRemarks) {
        this.testingRemarks = testingRemarks == null ? null : testingRemarks.trim();
    }

    public String getAfterPhoto() {
        return afterPhoto;
    }

    public void setAfterPhoto(String afterPhoto) {
        this.afterPhoto = afterPhoto == null ? null : afterPhoto.trim();
    }

    public String getValuationRemarks() {
        return valuationRemarks;
    }

    public void setValuationRemarks(String valuationRemarks) {
        this.valuationRemarks = valuationRemarks == null ? null : valuationRemarks.trim();
    }

    public String getValuationRejectReason() {
        return valuationRejectReason;
    }

    public void setValuationRejectReason(String valuationRejectReason) {
        this.valuationRejectReason = valuationRejectReason == null ? null : valuationRejectReason.trim();
    }

    public String getRespondRemarks() {
        return respondRemarks;
    }

    public void setRespondRemarks(String respondRemarks) {
        this.respondRemarks = respondRemarks == null ? null : respondRemarks.trim();
    }
}