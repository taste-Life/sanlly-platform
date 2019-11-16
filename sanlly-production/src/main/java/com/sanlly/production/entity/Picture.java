package com.sanlly.production.entity;

public class Picture {
    private Integer prodPictureId;

    private Integer mountId;

    private Integer type;

    private String url;

    public Integer getProdPictureId() {
        return prodPictureId;
    }

    public void setProdPictureId(Integer prodPictureId) {
        this.prodPictureId = prodPictureId;
    }

    public Integer getMountId() {
        return mountId;
    }

    public void setMountId(Integer mountId) {
        this.mountId = mountId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}