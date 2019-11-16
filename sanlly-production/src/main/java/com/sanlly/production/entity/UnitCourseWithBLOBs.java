package com.sanlly.production.entity;

public class UnitCourseWithBLOBs extends UnitCourse {
    private String unitPhoto;

    private String afterPhoto;

    private String qualityPhoto;

    private String recheckPhoto;

    public String getUnitPhoto() {
        return unitPhoto;
    }

    public void setUnitPhoto(String unitPhoto) {
        this.unitPhoto = unitPhoto == null ? null : unitPhoto.trim();
    }

    public String getAfterPhoto() {
        return afterPhoto;
    }

    public void setAfterPhoto(String afterPhoto) {
        this.afterPhoto = afterPhoto == null ? null : afterPhoto.trim();
    }

    public String getQualityPhoto() {
        return qualityPhoto;
    }

    public void setQualityPhoto(String qualityPhoto) {
        this.qualityPhoto = qualityPhoto == null ? null : qualityPhoto.trim();
    }

    public String getRecheckPhoto() {
        return recheckPhoto;
    }

    public void setRecheckPhoto(String recheckPhoto) {
        this.recheckPhoto = recheckPhoto == null ? null : recheckPhoto.trim();
    }
}