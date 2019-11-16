package com.sanlly.production.entity;

import java.util.Date;

public class TeamEntry {
    private Integer prodTeamEntryId;

    private Integer team;

    private String teamName;

    private Integer isOutsourcing;

    private String outsourcingName;

    private Integer timeRestrict;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdTeamEntryId() {
        return prodTeamEntryId;
    }

    public void setProdTeamEntryId(Integer prodTeamEntryId) {
        this.prodTeamEntryId = prodTeamEntryId;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public Integer getIsOutsourcing() {
        return isOutsourcing;
    }

    public void setIsOutsourcing(Integer isOutsourcing) {
        this.isOutsourcing = isOutsourcing;
    }

    public String getOutsourcingName() {
        return outsourcingName;
    }

    public void setOutsourcingName(String outsourcingName) {
        this.outsourcingName = outsourcingName == null ? null : outsourcingName.trim();
    }

    public Integer getTimeRestrict() {
        return timeRestrict;
    }

    public void setTimeRestrict(Integer timeRestrict) {
        this.timeRestrict = timeRestrict;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}