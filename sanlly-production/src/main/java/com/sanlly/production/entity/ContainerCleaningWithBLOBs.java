package com.sanlly.production.entity;

public class ContainerCleaningWithBLOBs extends ContainerCleaning {
    private String cleaningPhoto;

    private String auditPhoto;

    public String getCleaningPhoto() {
        return cleaningPhoto;
    }

    public void setCleaningPhoto(String cleaningPhoto) {
        this.cleaningPhoto = cleaningPhoto == null ? null : cleaningPhoto.trim();
    }

    public String getAuditPhoto() {
        return auditPhoto;
    }

    public void setAuditPhoto(String auditPhoto) {
        this.auditPhoto = auditPhoto == null ? null : auditPhoto.trim();
    }
}