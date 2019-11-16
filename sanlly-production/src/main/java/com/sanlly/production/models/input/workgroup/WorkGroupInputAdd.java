package com.sanlly.production.models.input.workgroup;

import com.alibaba.fastjson.JSON;
import com.sanlly.production.models.output.yardZone.ZoneListOutput;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author zhq
 * @date 2019/10/25
 * @description
 */
public class WorkGroupInputAdd {

    @NotBlank(message = "code编码不能为空")
    private String code;
    @NotBlank(message = "company不能为空")
    private String company;
    @NotBlank(message = "yard不能为空")
    private String yard;
    @NotEmpty(message = "prodDept不能为空")
    private String prodDept;

    private String workGroupType;

    private Integer user;

    private String type;

    private List<ZoneListOutput> zoneList;

    private Integer workHourTop;

    private Integer workHourBottom;

    private String title;

    private Integer isValid;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getProdDept() {
        return prodDept;
    }

    public void setProdDept(String prodDept) {
        this.prodDept = prodDept;
    }

    public String getWorkGroupType() {
        return workGroupType;
    }

    public void setWorkGroupType(String workGroupType) {
        this.workGroupType = workGroupType;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ZoneListOutput> getZoneList() {
        return zoneList;
    }

    public void setZoneList(List<ZoneListOutput> zoneList) {
        this.zoneList = zoneList;
    }

    public Integer getWorkHourTop() {
        return workHourTop;
    }

    public void setWorkHourTop(Integer workHourTop) {
        this.workHourTop = workHourTop;
    }

    public Integer getWorkHourBottom() {
        return workHourBottom;
    }

    public void setWorkHourBottom(Integer workHourBottom) {
        this.workHourBottom = workHourBottom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
