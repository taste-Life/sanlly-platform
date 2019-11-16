package com.sanlly.production.entity;

public class QualityReworkWithBLOBs extends QualityRework {
    private String backPhoto;

    private String recheckPhoto;

    public String getBackPhoto() {
        return backPhoto;
    }

    public void setBackPhoto(String backPhoto) {
        this.backPhoto = backPhoto == null ? null : backPhoto.trim();
    }

    public String getRecheckPhoto() {
        return recheckPhoto;
    }

    public void setRecheckPhoto(String recheckPhoto) {
        this.recheckPhoto = recheckPhoto == null ? null : recheckPhoto.trim();
    }
}