package com.sanlly.production.models.input.cleaningpattern;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public class CleaningPatternInputAdd {

    private String company;

    private String yard;

    private String containerCategory;

    private String cleaningPattern;

    private Integer team;

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

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory;
    }

    public String getCleaningPattern() {
        return cleaningPattern;
    }

    public void setCleaningPattern(String cleaningPattern) {
        this.cleaningPattern = cleaningPattern;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }
}
