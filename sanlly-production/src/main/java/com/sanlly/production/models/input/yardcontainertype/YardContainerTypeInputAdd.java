package com.sanlly.production.models.input.yardcontainertype;

/**
 * @author zhq
 * @date 2019/11/5
 * @description
 */
public class YardContainerTypeInputAdd {
    private String yard;

    private String containerCondition;

    private String courseTypeName;

    private String courseTypeNameEn;

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getContainerCondition() {
        return containerCondition;
    }

    public void setContainerCondition(String containerCondition) {
        this.containerCondition = containerCondition;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public String getCourseTypeNameEn() {
        return courseTypeNameEn;
    }

    public void setCourseTypeNameEn(String courseTypeNameEn) {
        this.courseTypeNameEn = courseTypeNameEn;
    }
}
