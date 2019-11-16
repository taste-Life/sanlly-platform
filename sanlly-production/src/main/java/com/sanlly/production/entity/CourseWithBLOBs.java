package com.sanlly.production.entity;

public class CourseWithBLOBs extends Course {
    private String testingPhoto;

    private String speedPhoto;

    private String afterPhoto;

    private String qualityPhoto;

    private String recheckPhoto;

    public String getTestingPhoto() {
        return testingPhoto;
    }

    public void setTestingPhoto(String testingPhoto) {
        this.testingPhoto = testingPhoto == null ? null : testingPhoto.trim();
    }

    public String getSpeedPhoto() {
        return speedPhoto;
    }

    public void setSpeedPhoto(String speedPhoto) {
        this.speedPhoto = speedPhoto == null ? null : speedPhoto.trim();
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