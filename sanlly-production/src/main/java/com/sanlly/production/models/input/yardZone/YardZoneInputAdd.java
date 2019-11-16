package com.sanlly.production.models.input.yardZone;

/**
 * @author zhq
 * @date 2019/11/4
 * @description
 */
public class YardZoneInputAdd {

    private String yard;

    private String zoneType;

    private String zoneCode;

    private Integer user;

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }
}
