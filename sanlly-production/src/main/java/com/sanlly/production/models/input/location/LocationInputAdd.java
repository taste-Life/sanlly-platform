package com.sanlly.production.models.input.location;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public class LocationInputAdd {
    private String locationName;

    private String locationNameEn;

    private String dock;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationNameEn() {
        return locationNameEn;
    }

    public void setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
    }

    public String getDock() {
        return dock;
    }

    public void setDock(String dock) {
        this.dock = dock;
    }
}
