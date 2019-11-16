package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintenanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MaintenanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProdMaintenanceIdIsNull() {
            addCriterion("prod_maintenance_id is null");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdIsNotNull() {
            addCriterion("prod_maintenance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdEqualTo(String value) {
            addCriterion("prod_maintenance_id =", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdNotEqualTo(String value) {
            addCriterion("prod_maintenance_id <>", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdGreaterThan(String value) {
            addCriterion("prod_maintenance_id >", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_maintenance_id >=", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdLessThan(String value) {
            addCriterion("prod_maintenance_id <", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdLessThanOrEqualTo(String value) {
            addCriterion("prod_maintenance_id <=", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdLike(String value) {
            addCriterion("prod_maintenance_id like", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdNotLike(String value) {
            addCriterion("prod_maintenance_id not like", value, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdIn(List<String> values) {
            addCriterion("prod_maintenance_id in", values, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdNotIn(List<String> values) {
            addCriterion("prod_maintenance_id not in", values, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdBetween(String value1, String value2) {
            addCriterion("prod_maintenance_id between", value1, value2, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdMaintenanceIdNotBetween(String value1, String value2) {
            addCriterion("prod_maintenance_id not between", value1, value2, "prodMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(String value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(String value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(String value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(String value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(String value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLike(String value) {
            addCriterion("operate_type like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotLike(String value) {
            addCriterion("operate_type not like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<String> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<String> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(String value1, String value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(String value1, String value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNull() {
            addCriterion("container_no is null");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNotNull() {
            addCriterion("container_no is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNoEqualTo(String value) {
            addCriterion("container_no =", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotEqualTo(String value) {
            addCriterion("container_no <>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThan(String value) {
            addCriterion("container_no >", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThanOrEqualTo(String value) {
            addCriterion("container_no >=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThan(String value) {
            addCriterion("container_no <", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThanOrEqualTo(String value) {
            addCriterion("container_no <=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLike(String value) {
            addCriterion("container_no like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotLike(String value) {
            addCriterion("container_no not like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIn(List<String> values) {
            addCriterion("container_no in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotIn(List<String> values) {
            addCriterion("container_no not in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoBetween(String value1, String value2) {
            addCriterion("container_no between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotBetween(String value1, String value2) {
            addCriterion("container_no not between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNull() {
            addCriterion("container_type is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("container_type is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("container_type =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("container_type <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("container_type >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("container_type >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("container_type <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("container_type <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("container_type like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("container_type not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("container_type in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("container_type not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("container_type between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("container_type not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNull() {
            addCriterion("container_user is null");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNotNull() {
            addCriterion("container_user is not null");
            return (Criteria) this;
        }

        public Criteria andContainerUserEqualTo(String value) {
            addCriterion("container_user =", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotEqualTo(String value) {
            addCriterion("container_user <>", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThan(String value) {
            addCriterion("container_user >", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThanOrEqualTo(String value) {
            addCriterion("container_user >=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThan(String value) {
            addCriterion("container_user <", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThanOrEqualTo(String value) {
            addCriterion("container_user <=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLike(String value) {
            addCriterion("container_user like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotLike(String value) {
            addCriterion("container_user not like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserIn(List<String> values) {
            addCriterion("container_user in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotIn(List<String> values) {
            addCriterion("container_user not in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserBetween(String value1, String value2) {
            addCriterion("container_user between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotBetween(String value1, String value2) {
            addCriterion("container_user not between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andContainerTareIsNull() {
            addCriterion("container_tare is null");
            return (Criteria) this;
        }

        public Criteria andContainerTareIsNotNull() {
            addCriterion("container_tare is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTareEqualTo(String value) {
            addCriterion("container_tare =", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotEqualTo(String value) {
            addCriterion("container_tare <>", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareGreaterThan(String value) {
            addCriterion("container_tare >", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareGreaterThanOrEqualTo(String value) {
            addCriterion("container_tare >=", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareLessThan(String value) {
            addCriterion("container_tare <", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareLessThanOrEqualTo(String value) {
            addCriterion("container_tare <=", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareLike(String value) {
            addCriterion("container_tare like", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotLike(String value) {
            addCriterion("container_tare not like", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareIn(List<String> values) {
            addCriterion("container_tare in", values, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotIn(List<String> values) {
            addCriterion("container_tare not in", values, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareBetween(String value1, String value2) {
            addCriterion("container_tare between", value1, value2, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotBetween(String value1, String value2) {
            addCriterion("container_tare not between", value1, value2, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIsNull() {
            addCriterion("container_load is null");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIsNotNull() {
            addCriterion("container_load is not null");
            return (Criteria) this;
        }

        public Criteria andContainerLoadEqualTo(String value) {
            addCriterion("container_load =", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotEqualTo(String value) {
            addCriterion("container_load <>", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadGreaterThan(String value) {
            addCriterion("container_load >", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadGreaterThanOrEqualTo(String value) {
            addCriterion("container_load >=", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadLessThan(String value) {
            addCriterion("container_load <", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadLessThanOrEqualTo(String value) {
            addCriterion("container_load <=", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadLike(String value) {
            addCriterion("container_load like", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotLike(String value) {
            addCriterion("container_load not like", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIn(List<String> values) {
            addCriterion("container_load in", values, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotIn(List<String> values) {
            addCriterion("container_load not in", values, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadBetween(String value1, String value2) {
            addCriterion("container_load between", value1, value2, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotBetween(String value1, String value2) {
            addCriterion("container_load not between", value1, value2, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIsNull() {
            addCriterion("container_volume is null");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIsNotNull() {
            addCriterion("container_volume is not null");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeEqualTo(String value) {
            addCriterion("container_volume =", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotEqualTo(String value) {
            addCriterion("container_volume <>", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeGreaterThan(String value) {
            addCriterion("container_volume >", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("container_volume >=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLessThan(String value) {
            addCriterion("container_volume <", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLessThanOrEqualTo(String value) {
            addCriterion("container_volume <=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLike(String value) {
            addCriterion("container_volume like", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotLike(String value) {
            addCriterion("container_volume not like", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIn(List<String> values) {
            addCriterion("container_volume in", values, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotIn(List<String> values) {
            addCriterion("container_volume not in", values, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeBetween(String value1, String value2) {
            addCriterion("container_volume between", value1, value2, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotBetween(String value1, String value2) {
            addCriterion("container_volume not between", value1, value2, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(String value) {
            addCriterion("gross_weight =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(String value) {
            addCriterion("gross_weight <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(String value) {
            addCriterion("gross_weight >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(String value) {
            addCriterion("gross_weight >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(String value) {
            addCriterion("gross_weight <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(String value) {
            addCriterion("gross_weight <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLike(String value) {
            addCriterion("gross_weight like", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotLike(String value) {
            addCriterion("gross_weight not like", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<String> values) {
            addCriterion("gross_weight in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<String> values) {
            addCriterion("gross_weight not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(String value1, String value2) {
            addCriterion("gross_weight between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(String value1, String value2) {
            addCriterion("gross_weight not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIsNull() {
            addCriterion("is_surrender is null");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIsNotNull() {
            addCriterion("is_surrender is not null");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderEqualTo(String value) {
            addCriterion("is_surrender =", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotEqualTo(String value) {
            addCriterion("is_surrender <>", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderGreaterThan(String value) {
            addCriterion("is_surrender >", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderGreaterThanOrEqualTo(String value) {
            addCriterion("is_surrender >=", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderLessThan(String value) {
            addCriterion("is_surrender <", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderLessThanOrEqualTo(String value) {
            addCriterion("is_surrender <=", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderLike(String value) {
            addCriterion("is_surrender like", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotLike(String value) {
            addCriterion("is_surrender not like", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIn(List<String> values) {
            addCriterion("is_surrender in", values, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotIn(List<String> values) {
            addCriterion("is_surrender not in", values, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderBetween(String value1, String value2) {
            addCriterion("is_surrender between", value1, value2, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotBetween(String value1, String value2) {
            addCriterion("is_surrender not between", value1, value2, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andYardIsNull() {
            addCriterion("yard is null");
            return (Criteria) this;
        }

        public Criteria andYardIsNotNull() {
            addCriterion("yard is not null");
            return (Criteria) this;
        }

        public Criteria andYardEqualTo(String value) {
            addCriterion("yard =", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotEqualTo(String value) {
            addCriterion("yard <>", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThan(String value) {
            addCriterion("yard >", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThanOrEqualTo(String value) {
            addCriterion("yard >=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThan(String value) {
            addCriterion("yard <", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThanOrEqualTo(String value) {
            addCriterion("yard <=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLike(String value) {
            addCriterion("yard like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotLike(String value) {
            addCriterion("yard not like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardIn(List<String> values) {
            addCriterion("yard in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotIn(List<String> values) {
            addCriterion("yard not in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardBetween(String value1, String value2) {
            addCriterion("yard between", value1, value2, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotBetween(String value1, String value2) {
            addCriterion("yard not between", value1, value2, "yard");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("unit_type like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("unit_type not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIsNull() {
            addCriterion("unit_company is null");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIsNotNull() {
            addCriterion("unit_company is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyEqualTo(String value) {
            addCriterion("unit_company =", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotEqualTo(String value) {
            addCriterion("unit_company <>", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyGreaterThan(String value) {
            addCriterion("unit_company >", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("unit_company >=", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyLessThan(String value) {
            addCriterion("unit_company <", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyLessThanOrEqualTo(String value) {
            addCriterion("unit_company <=", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyLike(String value) {
            addCriterion("unit_company like", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotLike(String value) {
            addCriterion("unit_company not like", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIn(List<String> values) {
            addCriterion("unit_company in", values, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotIn(List<String> values) {
            addCriterion("unit_company not in", values, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyBetween(String value1, String value2) {
            addCriterion("unit_company between", value1, value2, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotBetween(String value1, String value2) {
            addCriterion("unit_company not between", value1, value2, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNull() {
            addCriterion("unit_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNotNull() {
            addCriterion("unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeEqualTo(String value) {
            addCriterion("unit_code =", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotEqualTo(String value) {
            addCriterion("unit_code <>", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThan(String value) {
            addCriterion("unit_code >", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_code >=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThan(String value) {
            addCriterion("unit_code <", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_code <=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLike(String value) {
            addCriterion("unit_code like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotLike(String value) {
            addCriterion("unit_code not like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIn(List<String> values) {
            addCriterion("unit_code in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotIn(List<String> values) {
            addCriterion("unit_code not in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeBetween(String value1, String value2) {
            addCriterion("unit_code between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotBetween(String value1, String value2) {
            addCriterion("unit_code not between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andCompressorIsNull() {
            addCriterion("compressor is null");
            return (Criteria) this;
        }

        public Criteria andCompressorIsNotNull() {
            addCriterion("compressor is not null");
            return (Criteria) this;
        }

        public Criteria andCompressorEqualTo(String value) {
            addCriterion("compressor =", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotEqualTo(String value) {
            addCriterion("compressor <>", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThan(String value) {
            addCriterion("compressor >", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThanOrEqualTo(String value) {
            addCriterion("compressor >=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThan(String value) {
            addCriterion("compressor <", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThanOrEqualTo(String value) {
            addCriterion("compressor <=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLike(String value) {
            addCriterion("compressor like", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotLike(String value) {
            addCriterion("compressor not like", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorIn(List<String> values) {
            addCriterion("compressor in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotIn(List<String> values) {
            addCriterion("compressor not in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorBetween(String value1, String value2) {
            addCriterion("compressor between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotBetween(String value1, String value2) {
            addCriterion("compressor not between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andControlIsNull() {
            addCriterion("control is null");
            return (Criteria) this;
        }

        public Criteria andControlIsNotNull() {
            addCriterion("control is not null");
            return (Criteria) this;
        }

        public Criteria andControlEqualTo(String value) {
            addCriterion("control =", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotEqualTo(String value) {
            addCriterion("control <>", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThan(String value) {
            addCriterion("control >", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThanOrEqualTo(String value) {
            addCriterion("control >=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThan(String value) {
            addCriterion("control <", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThanOrEqualTo(String value) {
            addCriterion("control <=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLike(String value) {
            addCriterion("control like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotLike(String value) {
            addCriterion("control not like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlIn(List<String> values) {
            addCriterion("control in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotIn(List<String> values) {
            addCriterion("control not in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlBetween(String value1, String value2) {
            addCriterion("control between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotBetween(String value1, String value2) {
            addCriterion("control not between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNull() {
            addCriterion("software_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNotNull() {
            addCriterion("software_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionEqualTo(String value) {
            addCriterion("software_version =", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotEqualTo(String value) {
            addCriterion("software_version <>", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThan(String value) {
            addCriterion("software_version >", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("software_version >=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThan(String value) {
            addCriterion("software_version <", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThanOrEqualTo(String value) {
            addCriterion("software_version <=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLike(String value) {
            addCriterion("software_version like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotLike(String value) {
            addCriterion("software_version not like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIn(List<String> values) {
            addCriterion("software_version in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotIn(List<String> values) {
            addCriterion("software_version not in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionBetween(String value1, String value2) {
            addCriterion("software_version between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotBetween(String value1, String value2) {
            addCriterion("software_version not between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andIsCaIsNull() {
            addCriterion("is_ca is null");
            return (Criteria) this;
        }

        public Criteria andIsCaIsNotNull() {
            addCriterion("is_ca is not null");
            return (Criteria) this;
        }

        public Criteria andIsCaEqualTo(String value) {
            addCriterion("is_ca =", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotEqualTo(String value) {
            addCriterion("is_ca <>", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaGreaterThan(String value) {
            addCriterion("is_ca >", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaGreaterThanOrEqualTo(String value) {
            addCriterion("is_ca >=", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLessThan(String value) {
            addCriterion("is_ca <", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLessThanOrEqualTo(String value) {
            addCriterion("is_ca <=", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLike(String value) {
            addCriterion("is_ca like", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotLike(String value) {
            addCriterion("is_ca not like", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaIn(List<String> values) {
            addCriterion("is_ca in", values, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotIn(List<String> values) {
            addCriterion("is_ca not in", values, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaBetween(String value1, String value2) {
            addCriterion("is_ca between", value1, value2, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotBetween(String value1, String value2) {
            addCriterion("is_ca not between", value1, value2, "isCa");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeIsNull() {
            addCriterion("substrate_code is null");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeIsNotNull() {
            addCriterion("substrate_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeEqualTo(String value) {
            addCriterion("substrate_code =", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotEqualTo(String value) {
            addCriterion("substrate_code <>", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeGreaterThan(String value) {
            addCriterion("substrate_code >", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("substrate_code >=", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeLessThan(String value) {
            addCriterion("substrate_code <", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeLessThanOrEqualTo(String value) {
            addCriterion("substrate_code <=", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeLike(String value) {
            addCriterion("substrate_code like", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotLike(String value) {
            addCriterion("substrate_code not like", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeIn(List<String> values) {
            addCriterion("substrate_code in", values, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotIn(List<String> values) {
            addCriterion("substrate_code not in", values, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeBetween(String value1, String value2) {
            addCriterion("substrate_code between", value1, value2, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotBetween(String value1, String value2) {
            addCriterion("substrate_code not between", value1, value2, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureIsNull() {
            addCriterion("is_temperature is null");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureIsNotNull() {
            addCriterion("is_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureEqualTo(String value) {
            addCriterion("is_temperature =", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotEqualTo(String value) {
            addCriterion("is_temperature <>", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureGreaterThan(String value) {
            addCriterion("is_temperature >", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("is_temperature >=", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureLessThan(String value) {
            addCriterion("is_temperature <", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureLessThanOrEqualTo(String value) {
            addCriterion("is_temperature <=", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureLike(String value) {
            addCriterion("is_temperature like", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotLike(String value) {
            addCriterion("is_temperature not like", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureIn(List<String> values) {
            addCriterion("is_temperature in", values, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotIn(List<String> values) {
            addCriterion("is_temperature not in", values, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureBetween(String value1, String value2) {
            addCriterion("is_temperature between", value1, value2, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotBetween(String value1, String value2) {
            addCriterion("is_temperature not between", value1, value2, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsHumidityIsNull() {
            addCriterion("is_humidity is null");
            return (Criteria) this;
        }

        public Criteria andIsHumidityIsNotNull() {
            addCriterion("is_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andIsHumidityEqualTo(String value) {
            addCriterion("is_humidity =", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotEqualTo(String value) {
            addCriterion("is_humidity <>", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityGreaterThan(String value) {
            addCriterion("is_humidity >", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("is_humidity >=", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityLessThan(String value) {
            addCriterion("is_humidity <", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityLessThanOrEqualTo(String value) {
            addCriterion("is_humidity <=", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityLike(String value) {
            addCriterion("is_humidity like", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotLike(String value) {
            addCriterion("is_humidity not like", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityIn(List<String> values) {
            addCriterion("is_humidity in", values, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotIn(List<String> values) {
            addCriterion("is_humidity not in", values, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityBetween(String value1, String value2) {
            addCriterion("is_humidity between", value1, value2, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotBetween(String value1, String value2) {
            addCriterion("is_humidity not between", value1, value2, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsVentilateIsNull() {
            addCriterion("is_ventilate is null");
            return (Criteria) this;
        }

        public Criteria andIsVentilateIsNotNull() {
            addCriterion("is_ventilate is not null");
            return (Criteria) this;
        }

        public Criteria andIsVentilateEqualTo(String value) {
            addCriterion("is_ventilate =", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateNotEqualTo(String value) {
            addCriterion("is_ventilate <>", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateGreaterThan(String value) {
            addCriterion("is_ventilate >", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateGreaterThanOrEqualTo(String value) {
            addCriterion("is_ventilate >=", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateLessThan(String value) {
            addCriterion("is_ventilate <", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateLessThanOrEqualTo(String value) {
            addCriterion("is_ventilate <=", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateLike(String value) {
            addCriterion("is_ventilate like", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateNotLike(String value) {
            addCriterion("is_ventilate not like", value, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateIn(List<String> values) {
            addCriterion("is_ventilate in", values, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateNotIn(List<String> values) {
            addCriterion("is_ventilate not in", values, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateBetween(String value1, String value2) {
            addCriterion("is_ventilate between", value1, value2, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andIsVentilateNotBetween(String value1, String value2) {
            addCriterion("is_ventilate not between", value1, value2, "isVentilate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberIsNull() {
            addCriterion("maintenance_number is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberIsNotNull() {
            addCriterion("maintenance_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberEqualTo(String value) {
            addCriterion("maintenance_number =", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberNotEqualTo(String value) {
            addCriterion("maintenance_number <>", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberGreaterThan(String value) {
            addCriterion("maintenance_number >", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_number >=", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberLessThan(String value) {
            addCriterion("maintenance_number <", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberLessThanOrEqualTo(String value) {
            addCriterion("maintenance_number <=", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberLike(String value) {
            addCriterion("maintenance_number like", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberNotLike(String value) {
            addCriterion("maintenance_number not like", value, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberIn(List<String> values) {
            addCriterion("maintenance_number in", values, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberNotIn(List<String> values) {
            addCriterion("maintenance_number not in", values, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberBetween(String value1, String value2) {
            addCriterion("maintenance_number between", value1, value2, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNumberNotBetween(String value1, String value2) {
            addCriterion("maintenance_number not between", value1, value2, "maintenanceNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberIsNull() {
            addCriterion("modem_number is null");
            return (Criteria) this;
        }

        public Criteria andModemNumberIsNotNull() {
            addCriterion("modem_number is not null");
            return (Criteria) this;
        }

        public Criteria andModemNumberEqualTo(String value) {
            addCriterion("modem_number =", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberNotEqualTo(String value) {
            addCriterion("modem_number <>", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberGreaterThan(String value) {
            addCriterion("modem_number >", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberGreaterThanOrEqualTo(String value) {
            addCriterion("modem_number >=", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberLessThan(String value) {
            addCriterion("modem_number <", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberLessThanOrEqualTo(String value) {
            addCriterion("modem_number <=", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberLike(String value) {
            addCriterion("modem_number like", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberNotLike(String value) {
            addCriterion("modem_number not like", value, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberIn(List<String> values) {
            addCriterion("modem_number in", values, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberNotIn(List<String> values) {
            addCriterion("modem_number not in", values, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberBetween(String value1, String value2) {
            addCriterion("modem_number between", value1, value2, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andModemNumberNotBetween(String value1, String value2) {
            addCriterion("modem_number not between", value1, value2, "modemNumber");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeIsNull() {
            addCriterion("maintenance_type is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeIsNotNull() {
            addCriterion("maintenance_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeEqualTo(String value) {
            addCriterion("maintenance_type =", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeNotEqualTo(String value) {
            addCriterion("maintenance_type <>", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeGreaterThan(String value) {
            addCriterion("maintenance_type >", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_type >=", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeLessThan(String value) {
            addCriterion("maintenance_type <", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeLessThanOrEqualTo(String value) {
            addCriterion("maintenance_type <=", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeLike(String value) {
            addCriterion("maintenance_type like", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeNotLike(String value) {
            addCriterion("maintenance_type not like", value, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeIn(List<String> values) {
            addCriterion("maintenance_type in", values, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeNotIn(List<String> values) {
            addCriterion("maintenance_type not in", values, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeBetween(String value1, String value2) {
            addCriterion("maintenance_type between", value1, value2, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTypeNotBetween(String value1, String value2) {
            addCriterion("maintenance_type not between", value1, value2, "maintenanceType");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteIsNull() {
            addCriterion("maintenance_site is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteIsNotNull() {
            addCriterion("maintenance_site is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteEqualTo(String value) {
            addCriterion("maintenance_site =", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteNotEqualTo(String value) {
            addCriterion("maintenance_site <>", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteGreaterThan(String value) {
            addCriterion("maintenance_site >", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_site >=", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteLessThan(String value) {
            addCriterion("maintenance_site <", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteLessThanOrEqualTo(String value) {
            addCriterion("maintenance_site <=", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteLike(String value) {
            addCriterion("maintenance_site like", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteNotLike(String value) {
            addCriterion("maintenance_site not like", value, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteIn(List<String> values) {
            addCriterion("maintenance_site in", values, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteNotIn(List<String> values) {
            addCriterion("maintenance_site not in", values, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteBetween(String value1, String value2) {
            addCriterion("maintenance_site between", value1, value2, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andMaintenanceSiteNotBetween(String value1, String value2) {
            addCriterion("maintenance_site not between", value1, value2, "maintenanceSite");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNull() {
            addCriterion("fault_type is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNotNull() {
            addCriterion("fault_type is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeEqualTo(String value) {
            addCriterion("fault_type =", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotEqualTo(String value) {
            addCriterion("fault_type <>", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThan(String value) {
            addCriterion("fault_type >", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fault_type >=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThan(String value) {
            addCriterion("fault_type <", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThanOrEqualTo(String value) {
            addCriterion("fault_type <=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLike(String value) {
            addCriterion("fault_type like", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotLike(String value) {
            addCriterion("fault_type not like", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIn(List<String> values) {
            addCriterion("fault_type in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotIn(List<String> values) {
            addCriterion("fault_type not in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeBetween(String value1, String value2) {
            addCriterion("fault_type between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotBetween(String value1, String value2) {
            addCriterion("fault_type not between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTimeIsNull() {
            addCriterion("fault_time is null");
            return (Criteria) this;
        }

        public Criteria andFaultTimeIsNotNull() {
            addCriterion("fault_time is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTimeEqualTo(Date value) {
            addCriterion("fault_time =", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeNotEqualTo(Date value) {
            addCriterion("fault_time <>", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeGreaterThan(Date value) {
            addCriterion("fault_time >", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fault_time >=", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeLessThan(Date value) {
            addCriterion("fault_time <", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeLessThanOrEqualTo(Date value) {
            addCriterion("fault_time <=", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeIn(List<Date> values) {
            addCriterion("fault_time in", values, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeNotIn(List<Date> values) {
            addCriterion("fault_time not in", values, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeBetween(Date value1, Date value2) {
            addCriterion("fault_time between", value1, value2, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeNotBetween(Date value1, Date value2) {
            addCriterion("fault_time not between", value1, value2, "faultTime");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceIsNull() {
            addCriterion("is_maintenance is null");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceIsNotNull() {
            addCriterion("is_maintenance is not null");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceEqualTo(String value) {
            addCriterion("is_maintenance =", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceNotEqualTo(String value) {
            addCriterion("is_maintenance <>", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceGreaterThan(String value) {
            addCriterion("is_maintenance >", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceGreaterThanOrEqualTo(String value) {
            addCriterion("is_maintenance >=", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceLessThan(String value) {
            addCriterion("is_maintenance <", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceLessThanOrEqualTo(String value) {
            addCriterion("is_maintenance <=", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceLike(String value) {
            addCriterion("is_maintenance like", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceNotLike(String value) {
            addCriterion("is_maintenance not like", value, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceIn(List<String> values) {
            addCriterion("is_maintenance in", values, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceNotIn(List<String> values) {
            addCriterion("is_maintenance not in", values, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceBetween(String value1, String value2) {
            addCriterion("is_maintenance between", value1, value2, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andIsMaintenanceNotBetween(String value1, String value2) {
            addCriterion("is_maintenance not between", value1, value2, "isMaintenance");
            return (Criteria) this;
        }

        public Criteria andTestingUserIsNull() {
            addCriterion("testing_user is null");
            return (Criteria) this;
        }

        public Criteria andTestingUserIsNotNull() {
            addCriterion("testing_user is not null");
            return (Criteria) this;
        }

        public Criteria andTestingUserEqualTo(Integer value) {
            addCriterion("testing_user =", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserNotEqualTo(Integer value) {
            addCriterion("testing_user <>", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserGreaterThan(Integer value) {
            addCriterion("testing_user >", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("testing_user >=", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserLessThan(Integer value) {
            addCriterion("testing_user <", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserLessThanOrEqualTo(Integer value) {
            addCriterion("testing_user <=", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserIn(List<Integer> values) {
            addCriterion("testing_user in", values, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserNotIn(List<Integer> values) {
            addCriterion("testing_user not in", values, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserBetween(Integer value1, Integer value2) {
            addCriterion("testing_user between", value1, value2, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserNotBetween(Integer value1, Integer value2) {
            addCriterion("testing_user not between", value1, value2, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingStateIsNull() {
            addCriterion("testing_state is null");
            return (Criteria) this;
        }

        public Criteria andTestingStateIsNotNull() {
            addCriterion("testing_state is not null");
            return (Criteria) this;
        }

        public Criteria andTestingStateEqualTo(String value) {
            addCriterion("testing_state =", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotEqualTo(String value) {
            addCriterion("testing_state <>", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateGreaterThan(String value) {
            addCriterion("testing_state >", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateGreaterThanOrEqualTo(String value) {
            addCriterion("testing_state >=", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateLessThan(String value) {
            addCriterion("testing_state <", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateLessThanOrEqualTo(String value) {
            addCriterion("testing_state <=", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateLike(String value) {
            addCriterion("testing_state like", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotLike(String value) {
            addCriterion("testing_state not like", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateIn(List<String> values) {
            addCriterion("testing_state in", values, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotIn(List<String> values) {
            addCriterion("testing_state not in", values, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateBetween(String value1, String value2) {
            addCriterion("testing_state between", value1, value2, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotBetween(String value1, String value2) {
            addCriterion("testing_state not between", value1, value2, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIsNull() {
            addCriterion("testing_man_hour_cost is null");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIsNotNull() {
            addCriterion("testing_man_hour_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost =", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostNotEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost <>", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostGreaterThan(BigDecimal value) {
            addCriterion("testing_man_hour_cost >", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost >=", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostLessThan(BigDecimal value) {
            addCriterion("testing_man_hour_cost <", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost <=", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIn(List<BigDecimal> values) {
            addCriterion("testing_man_hour_cost in", values, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostNotIn(List<BigDecimal> values) {
            addCriterion("testing_man_hour_cost not in", values, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_man_hour_cost between", value1, value2, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_man_hour_cost not between", value1, value2, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIsNull() {
            addCriterion("testing_material_cost is null");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIsNotNull() {
            addCriterion("testing_material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost =", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost <>", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("testing_material_cost >", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost >=", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostLessThan(BigDecimal value) {
            addCriterion("testing_material_cost <", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost <=", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIn(List<BigDecimal> values) {
            addCriterion("testing_material_cost in", values, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("testing_material_cost not in", values, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_material_cost between", value1, value2, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_material_cost not between", value1, value2, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIsNull() {
            addCriterion("testing_thirdparty_money is null");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIsNotNull() {
            addCriterion("testing_thirdparty_money is not null");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money =", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money <>", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyGreaterThan(BigDecimal value) {
            addCriterion("testing_thirdparty_money >", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money >=", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyLessThan(BigDecimal value) {
            addCriterion("testing_thirdparty_money <", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money <=", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIn(List<BigDecimal> values) {
            addCriterion("testing_thirdparty_money in", values, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("testing_thirdparty_money not in", values, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_thirdparty_money between", value1, value2, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_thirdparty_money not between", value1, value2, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIsNull() {
            addCriterion("testing_money is null");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIsNotNull() {
            addCriterion("testing_money is not null");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyEqualTo(BigDecimal value) {
            addCriterion("testing_money =", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("testing_money <>", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyGreaterThan(BigDecimal value) {
            addCriterion("testing_money >", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_money >=", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyLessThan(BigDecimal value) {
            addCriterion("testing_money <", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_money <=", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIn(List<BigDecimal> values) {
            addCriterion("testing_money in", values, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("testing_money not in", values, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_money between", value1, value2, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_money not between", value1, value2, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIsNull() {
            addCriterion("testing_time is null");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIsNotNull() {
            addCriterion("testing_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestingTimeEqualTo(Date value) {
            addCriterion("testing_time =", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeNotEqualTo(Date value) {
            addCriterion("testing_time <>", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeGreaterThan(Date value) {
            addCriterion("testing_time >", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testing_time >=", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeLessThan(Date value) {
            addCriterion("testing_time <", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeLessThanOrEqualTo(Date value) {
            addCriterion("testing_time <=", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIn(List<Date> values) {
            addCriterion("testing_time in", values, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeNotIn(List<Date> values) {
            addCriterion("testing_time not in", values, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeBetween(Date value1, Date value2) {
            addCriterion("testing_time between", value1, value2, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeNotBetween(Date value1, Date value2) {
            addCriterion("testing_time not between", value1, value2, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIsNull() {
            addCriterion("testing_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIsNotNull() {
            addCriterion("testing_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeEqualTo(Date value) {
            addCriterion("testing_end_time =", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeNotEqualTo(Date value) {
            addCriterion("testing_end_time <>", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeGreaterThan(Date value) {
            addCriterion("testing_end_time >", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testing_end_time >=", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeLessThan(Date value) {
            addCriterion("testing_end_time <", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("testing_end_time <=", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIn(List<Date> values) {
            addCriterion("testing_end_time in", values, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeNotIn(List<Date> values) {
            addCriterion("testing_end_time not in", values, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeBetween(Date value1, Date value2) {
            addCriterion("testing_end_time between", value1, value2, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("testing_end_time not between", value1, value2, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNull() {
            addCriterion("course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNotNull() {
            addCriterion("course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeEqualTo(Date value) {
            addCriterion("course_time =", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotEqualTo(Date value) {
            addCriterion("course_time <>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThan(Date value) {
            addCriterion("course_time >", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_time >=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThan(Date value) {
            addCriterion("course_time <", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_time <=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIn(List<Date> values) {
            addCriterion("course_time in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotIn(List<Date> values) {
            addCriterion("course_time not in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeBetween(Date value1, Date value2) {
            addCriterion("course_time between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_time not between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIsNull() {
            addCriterion("valuation_currency is null");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIsNotNull() {
            addCriterion("valuation_currency is not null");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyEqualTo(String value) {
            addCriterion("valuation_currency =", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotEqualTo(String value) {
            addCriterion("valuation_currency <>", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyGreaterThan(String value) {
            addCriterion("valuation_currency >", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_currency >=", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyLessThan(String value) {
            addCriterion("valuation_currency <", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyLessThanOrEqualTo(String value) {
            addCriterion("valuation_currency <=", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyLike(String value) {
            addCriterion("valuation_currency like", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotLike(String value) {
            addCriterion("valuation_currency not like", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIn(List<String> values) {
            addCriterion("valuation_currency in", values, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotIn(List<String> values) {
            addCriterion("valuation_currency not in", values, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyBetween(String value1, String value2) {
            addCriterion("valuation_currency between", value1, value2, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotBetween(String value1, String value2) {
            addCriterion("valuation_currency not between", value1, value2, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationNoIsNull() {
            addCriterion("valuation_no is null");
            return (Criteria) this;
        }

        public Criteria andValuationNoIsNotNull() {
            addCriterion("valuation_no is not null");
            return (Criteria) this;
        }

        public Criteria andValuationNoEqualTo(String value) {
            addCriterion("valuation_no =", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotEqualTo(String value) {
            addCriterion("valuation_no <>", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoGreaterThan(String value) {
            addCriterion("valuation_no >", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_no >=", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoLessThan(String value) {
            addCriterion("valuation_no <", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoLessThanOrEqualTo(String value) {
            addCriterion("valuation_no <=", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoLike(String value) {
            addCriterion("valuation_no like", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotLike(String value) {
            addCriterion("valuation_no not like", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoIn(List<String> values) {
            addCriterion("valuation_no in", values, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotIn(List<String> values) {
            addCriterion("valuation_no not in", values, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoBetween(String value1, String value2) {
            addCriterion("valuation_no between", value1, value2, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotBetween(String value1, String value2) {
            addCriterion("valuation_no not between", value1, value2, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationUserIsNull() {
            addCriterion("valuation_user is null");
            return (Criteria) this;
        }

        public Criteria andValuationUserIsNotNull() {
            addCriterion("valuation_user is not null");
            return (Criteria) this;
        }

        public Criteria andValuationUserEqualTo(Integer value) {
            addCriterion("valuation_user =", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserNotEqualTo(Integer value) {
            addCriterion("valuation_user <>", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserGreaterThan(Integer value) {
            addCriterion("valuation_user >", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("valuation_user >=", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserLessThan(Integer value) {
            addCriterion("valuation_user <", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserLessThanOrEqualTo(Integer value) {
            addCriterion("valuation_user <=", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserIn(List<Integer> values) {
            addCriterion("valuation_user in", values, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserNotIn(List<Integer> values) {
            addCriterion("valuation_user not in", values, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserBetween(Integer value1, Integer value2) {
            addCriterion("valuation_user between", value1, value2, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserNotBetween(Integer value1, Integer value2) {
            addCriterion("valuation_user not between", value1, value2, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIsNull() {
            addCriterion("valuation_time is null");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIsNotNull() {
            addCriterion("valuation_time is not null");
            return (Criteria) this;
        }

        public Criteria andValuationTimeEqualTo(Date value) {
            addCriterion("valuation_time =", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeNotEqualTo(Date value) {
            addCriterion("valuation_time <>", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeGreaterThan(Date value) {
            addCriterion("valuation_time >", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valuation_time >=", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeLessThan(Date value) {
            addCriterion("valuation_time <", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeLessThanOrEqualTo(Date value) {
            addCriterion("valuation_time <=", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIn(List<Date> values) {
            addCriterion("valuation_time in", values, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeNotIn(List<Date> values) {
            addCriterion("valuation_time not in", values, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeBetween(Date value1, Date value2) {
            addCriterion("valuation_time between", value1, value2, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeNotBetween(Date value1, Date value2) {
            addCriterion("valuation_time not between", value1, value2, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationStateIsNull() {
            addCriterion("valuation_state is null");
            return (Criteria) this;
        }

        public Criteria andValuationStateIsNotNull() {
            addCriterion("valuation_state is not null");
            return (Criteria) this;
        }

        public Criteria andValuationStateEqualTo(String value) {
            addCriterion("valuation_state =", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotEqualTo(String value) {
            addCriterion("valuation_state <>", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateGreaterThan(String value) {
            addCriterion("valuation_state >", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_state >=", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateLessThan(String value) {
            addCriterion("valuation_state <", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateLessThanOrEqualTo(String value) {
            addCriterion("valuation_state <=", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateLike(String value) {
            addCriterion("valuation_state like", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotLike(String value) {
            addCriterion("valuation_state not like", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateIn(List<String> values) {
            addCriterion("valuation_state in", values, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotIn(List<String> values) {
            addCriterion("valuation_state not in", values, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateBetween(String value1, String value2) {
            addCriterion("valuation_state between", value1, value2, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotBetween(String value1, String value2) {
            addCriterion("valuation_state not between", value1, value2, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserIsNull() {
            addCriterion("valuation_reject_user is null");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserIsNotNull() {
            addCriterion("valuation_reject_user is not null");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserEqualTo(Integer value) {
            addCriterion("valuation_reject_user =", value, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserNotEqualTo(Integer value) {
            addCriterion("valuation_reject_user <>", value, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserGreaterThan(Integer value) {
            addCriterion("valuation_reject_user >", value, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("valuation_reject_user >=", value, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserLessThan(Integer value) {
            addCriterion("valuation_reject_user <", value, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserLessThanOrEqualTo(Integer value) {
            addCriterion("valuation_reject_user <=", value, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserIn(List<Integer> values) {
            addCriterion("valuation_reject_user in", values, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserNotIn(List<Integer> values) {
            addCriterion("valuation_reject_user not in", values, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserBetween(Integer value1, Integer value2) {
            addCriterion("valuation_reject_user between", value1, value2, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectUserNotBetween(Integer value1, Integer value2) {
            addCriterion("valuation_reject_user not between", value1, value2, "valuationRejectUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeIsNull() {
            addCriterion("valuation_reject_time is null");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeIsNotNull() {
            addCriterion("valuation_reject_time is not null");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeEqualTo(Date value) {
            addCriterion("valuation_reject_time =", value, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeNotEqualTo(Date value) {
            addCriterion("valuation_reject_time <>", value, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeGreaterThan(Date value) {
            addCriterion("valuation_reject_time >", value, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valuation_reject_time >=", value, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeLessThan(Date value) {
            addCriterion("valuation_reject_time <", value, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeLessThanOrEqualTo(Date value) {
            addCriterion("valuation_reject_time <=", value, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeIn(List<Date> values) {
            addCriterion("valuation_reject_time in", values, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeNotIn(List<Date> values) {
            addCriterion("valuation_reject_time not in", values, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeBetween(Date value1, Date value2) {
            addCriterion("valuation_reject_time between", value1, value2, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationRejectTimeNotBetween(Date value1, Date value2) {
            addCriterion("valuation_reject_time not between", value1, value2, "valuationRejectTime");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursIsNull() {
            addCriterion("valuation_working_hours is null");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursIsNotNull() {
            addCriterion("valuation_working_hours is not null");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursEqualTo(Integer value) {
            addCriterion("valuation_working_hours =", value, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursNotEqualTo(Integer value) {
            addCriterion("valuation_working_hours <>", value, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursGreaterThan(Integer value) {
            addCriterion("valuation_working_hours >", value, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("valuation_working_hours >=", value, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursLessThan(Integer value) {
            addCriterion("valuation_working_hours <", value, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursLessThanOrEqualTo(Integer value) {
            addCriterion("valuation_working_hours <=", value, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursIn(List<Integer> values) {
            addCriterion("valuation_working_hours in", values, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursNotIn(List<Integer> values) {
            addCriterion("valuation_working_hours not in", values, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursBetween(Integer value1, Integer value2) {
            addCriterion("valuation_working_hours between", value1, value2, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("valuation_working_hours not between", value1, value2, "valuationWorkingHours");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostIsNull() {
            addCriterion("valuation_working_hours_cost is null");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostIsNotNull() {
            addCriterion("valuation_working_hours_cost is not null");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostEqualTo(BigDecimal value) {
            addCriterion("valuation_working_hours_cost =", value, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostNotEqualTo(BigDecimal value) {
            addCriterion("valuation_working_hours_cost <>", value, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostGreaterThan(BigDecimal value) {
            addCriterion("valuation_working_hours_cost >", value, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_working_hours_cost >=", value, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostLessThan(BigDecimal value) {
            addCriterion("valuation_working_hours_cost <", value, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_working_hours_cost <=", value, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostIn(List<BigDecimal> values) {
            addCriterion("valuation_working_hours_cost in", values, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostNotIn(List<BigDecimal> values) {
            addCriterion("valuation_working_hours_cost not in", values, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_working_hours_cost between", value1, value2, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationWorkingHoursCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_working_hours_cost not between", value1, value2, "valuationWorkingHoursCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIsNull() {
            addCriterion("valuation_material_cost is null");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIsNotNull() {
            addCriterion("valuation_material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost =", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost <>", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("valuation_material_cost >", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost >=", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostLessThan(BigDecimal value) {
            addCriterion("valuation_material_cost <", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost <=", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIn(List<BigDecimal> values) {
            addCriterion("valuation_material_cost in", values, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("valuation_material_cost not in", values, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_material_cost between", value1, value2, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_material_cost not between", value1, value2, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostIsNull() {
            addCriterion("valuation_total_cost is null");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostIsNotNull() {
            addCriterion("valuation_total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost =", value, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost <>", value, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostGreaterThan(BigDecimal value) {
            addCriterion("valuation_total_cost >", value, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost >=", value, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostLessThan(BigDecimal value) {
            addCriterion("valuation_total_cost <", value, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost <=", value, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostIn(List<BigDecimal> values) {
            addCriterion("valuation_total_cost in", values, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("valuation_total_cost not in", values, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_total_cost between", value1, value2, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_total_cost not between", value1, value2, "valuationTotalCost");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbIsNull() {
            addCriterion("valuation_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbIsNotNull() {
            addCriterion("valuation_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost_rmb =", value, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost_rmb <>", value, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("valuation_total_cost_rmb >", value, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost_rmb >=", value, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("valuation_total_cost_rmb <", value, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_total_cost_rmb <=", value, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("valuation_total_cost_rmb in", values, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("valuation_total_cost_rmb not in", values, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_total_cost_rmb between", value1, value2, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andValuationTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_total_cost_rmb not between", value1, value2, "valuationTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondUserIsNull() {
            addCriterion("respond_user is null");
            return (Criteria) this;
        }

        public Criteria andRespondUserIsNotNull() {
            addCriterion("respond_user is not null");
            return (Criteria) this;
        }

        public Criteria andRespondUserEqualTo(Integer value) {
            addCriterion("respond_user =", value, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserNotEqualTo(Integer value) {
            addCriterion("respond_user <>", value, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserGreaterThan(Integer value) {
            addCriterion("respond_user >", value, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("respond_user >=", value, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserLessThan(Integer value) {
            addCriterion("respond_user <", value, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserLessThanOrEqualTo(Integer value) {
            addCriterion("respond_user <=", value, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserIn(List<Integer> values) {
            addCriterion("respond_user in", values, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserNotIn(List<Integer> values) {
            addCriterion("respond_user not in", values, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserBetween(Integer value1, Integer value2) {
            addCriterion("respond_user between", value1, value2, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondUserNotBetween(Integer value1, Integer value2) {
            addCriterion("respond_user not between", value1, value2, "respondUser");
            return (Criteria) this;
        }

        public Criteria andRespondTimeIsNull() {
            addCriterion("respond_time is null");
            return (Criteria) this;
        }

        public Criteria andRespondTimeIsNotNull() {
            addCriterion("respond_time is not null");
            return (Criteria) this;
        }

        public Criteria andRespondTimeEqualTo(Date value) {
            addCriterion("respond_time =", value, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeNotEqualTo(Date value) {
            addCriterion("respond_time <>", value, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeGreaterThan(Date value) {
            addCriterion("respond_time >", value, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("respond_time >=", value, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeLessThan(Date value) {
            addCriterion("respond_time <", value, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeLessThanOrEqualTo(Date value) {
            addCriterion("respond_time <=", value, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeIn(List<Date> values) {
            addCriterion("respond_time in", values, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeNotIn(List<Date> values) {
            addCriterion("respond_time not in", values, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeBetween(Date value1, Date value2) {
            addCriterion("respond_time between", value1, value2, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondTimeNotBetween(Date value1, Date value2) {
            addCriterion("respond_time not between", value1, value2, "respondTime");
            return (Criteria) this;
        }

        public Criteria andRespondCostIsNull() {
            addCriterion("respond_cost is null");
            return (Criteria) this;
        }

        public Criteria andRespondCostIsNotNull() {
            addCriterion("respond_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRespondCostEqualTo(BigDecimal value) {
            addCriterion("respond_cost =", value, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostNotEqualTo(BigDecimal value) {
            addCriterion("respond_cost <>", value, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostGreaterThan(BigDecimal value) {
            addCriterion("respond_cost >", value, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("respond_cost >=", value, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostLessThan(BigDecimal value) {
            addCriterion("respond_cost <", value, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("respond_cost <=", value, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostIn(List<BigDecimal> values) {
            addCriterion("respond_cost in", values, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostNotIn(List<BigDecimal> values) {
            addCriterion("respond_cost not in", values, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("respond_cost between", value1, value2, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("respond_cost not between", value1, value2, "respondCost");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbIsNull() {
            addCriterion("respond_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbIsNotNull() {
            addCriterion("respond_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbEqualTo(BigDecimal value) {
            addCriterion("respond_cost_rmb =", value, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("respond_cost_rmb <>", value, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbGreaterThan(BigDecimal value) {
            addCriterion("respond_cost_rmb >", value, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("respond_cost_rmb >=", value, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbLessThan(BigDecimal value) {
            addCriterion("respond_cost_rmb <", value, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("respond_cost_rmb <=", value, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbIn(List<BigDecimal> values) {
            addCriterion("respond_cost_rmb in", values, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("respond_cost_rmb not in", values, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("respond_cost_rmb between", value1, value2, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andRespondCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("respond_cost_rmb not between", value1, value2, "respondCostRmb");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIsNull() {
            addCriterion("designate_user is null");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIsNotNull() {
            addCriterion("designate_user is not null");
            return (Criteria) this;
        }

        public Criteria andDesignateUserEqualTo(Integer value) {
            addCriterion("designate_user =", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserNotEqualTo(Integer value) {
            addCriterion("designate_user <>", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserGreaterThan(Integer value) {
            addCriterion("designate_user >", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("designate_user >=", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserLessThan(Integer value) {
            addCriterion("designate_user <", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserLessThanOrEqualTo(Integer value) {
            addCriterion("designate_user <=", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIn(List<Integer> values) {
            addCriterion("designate_user in", values, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserNotIn(List<Integer> values) {
            addCriterion("designate_user not in", values, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserBetween(Integer value1, Integer value2) {
            addCriterion("designate_user between", value1, value2, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("designate_user not between", value1, value2, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIsNull() {
            addCriterion("designate_time is null");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIsNotNull() {
            addCriterion("designate_time is not null");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeEqualTo(Date value) {
            addCriterion("designate_time =", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeNotEqualTo(Date value) {
            addCriterion("designate_time <>", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeGreaterThan(Date value) {
            addCriterion("designate_time >", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("designate_time >=", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeLessThan(Date value) {
            addCriterion("designate_time <", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeLessThanOrEqualTo(Date value) {
            addCriterion("designate_time <=", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIn(List<Date> values) {
            addCriterion("designate_time in", values, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeNotIn(List<Date> values) {
            addCriterion("designate_time not in", values, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeBetween(Date value1, Date value2) {
            addCriterion("designate_time between", value1, value2, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeNotBetween(Date value1, Date value2) {
            addCriterion("designate_time not between", value1, value2, "designateTime");
            return (Criteria) this;
        }

        public Criteria andReferralStateIsNull() {
            addCriterion("referral_state is null");
            return (Criteria) this;
        }

        public Criteria andReferralStateIsNotNull() {
            addCriterion("referral_state is not null");
            return (Criteria) this;
        }

        public Criteria andReferralStateEqualTo(String value) {
            addCriterion("referral_state =", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotEqualTo(String value) {
            addCriterion("referral_state <>", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateGreaterThan(String value) {
            addCriterion("referral_state >", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateGreaterThanOrEqualTo(String value) {
            addCriterion("referral_state >=", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateLessThan(String value) {
            addCriterion("referral_state <", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateLessThanOrEqualTo(String value) {
            addCriterion("referral_state <=", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateLike(String value) {
            addCriterion("referral_state like", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotLike(String value) {
            addCriterion("referral_state not like", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateIn(List<String> values) {
            addCriterion("referral_state in", values, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotIn(List<String> values) {
            addCriterion("referral_state not in", values, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateBetween(String value1, String value2) {
            addCriterion("referral_state between", value1, value2, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotBetween(String value1, String value2) {
            addCriterion("referral_state not between", value1, value2, "referralState");
            return (Criteria) this;
        }

        public Criteria andFinishUserIsNull() {
            addCriterion("finish_user is null");
            return (Criteria) this;
        }

        public Criteria andFinishUserIsNotNull() {
            addCriterion("finish_user is not null");
            return (Criteria) this;
        }

        public Criteria andFinishUserEqualTo(Integer value) {
            addCriterion("finish_user =", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotEqualTo(Integer value) {
            addCriterion("finish_user <>", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserGreaterThan(Integer value) {
            addCriterion("finish_user >", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_user >=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLessThan(Integer value) {
            addCriterion("finish_user <", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLessThanOrEqualTo(Integer value) {
            addCriterion("finish_user <=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserIn(List<Integer> values) {
            addCriterion("finish_user in", values, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotIn(List<Integer> values) {
            addCriterion("finish_user not in", values, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserBetween(Integer value1, Integer value2) {
            addCriterion("finish_user between", value1, value2, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_user not between", value1, value2, "finishUser");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIsNull() {
            addCriterion("referral_type is null");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIsNotNull() {
            addCriterion("referral_type is not null");
            return (Criteria) this;
        }

        public Criteria andReferralTypeEqualTo(String value) {
            addCriterion("referral_type =", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotEqualTo(String value) {
            addCriterion("referral_type <>", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeGreaterThan(String value) {
            addCriterion("referral_type >", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeGreaterThanOrEqualTo(String value) {
            addCriterion("referral_type >=", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeLessThan(String value) {
            addCriterion("referral_type <", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeLessThanOrEqualTo(String value) {
            addCriterion("referral_type <=", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeLike(String value) {
            addCriterion("referral_type like", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotLike(String value) {
            addCriterion("referral_type not like", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIn(List<String> values) {
            addCriterion("referral_type in", values, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotIn(List<String> values) {
            addCriterion("referral_type not in", values, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeBetween(String value1, String value2) {
            addCriterion("referral_type between", value1, value2, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotBetween(String value1, String value2) {
            addCriterion("referral_type not between", value1, value2, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIsNull() {
            addCriterion("referral_time is null");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIsNotNull() {
            addCriterion("referral_time is not null");
            return (Criteria) this;
        }

        public Criteria andReferralTimeEqualTo(Date value) {
            addCriterion("referral_time =", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeNotEqualTo(Date value) {
            addCriterion("referral_time <>", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeGreaterThan(Date value) {
            addCriterion("referral_time >", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("referral_time >=", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeLessThan(Date value) {
            addCriterion("referral_time <", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeLessThanOrEqualTo(Date value) {
            addCriterion("referral_time <=", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIn(List<Date> values) {
            addCriterion("referral_time in", values, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeNotIn(List<Date> values) {
            addCriterion("referral_time not in", values, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeBetween(Date value1, Date value2) {
            addCriterion("referral_time between", value1, value2, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeNotBetween(Date value1, Date value2) {
            addCriterion("referral_time not between", value1, value2, "referralTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNull() {
            addCriterion("predict_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNotNull() {
            addCriterion("predict_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeEqualTo(String value) {
            addCriterion("predict_time =", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotEqualTo(String value) {
            addCriterion("predict_time <>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThan(String value) {
            addCriterion("predict_time >", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_time >=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThan(String value) {
            addCriterion("predict_time <", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThanOrEqualTo(String value) {
            addCriterion("predict_time <=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLike(String value) {
            addCriterion("predict_time like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotLike(String value) {
            addCriterion("predict_time not like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIn(List<String> values) {
            addCriterion("predict_time in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotIn(List<String> values) {
            addCriterion("predict_time not in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeBetween(String value1, String value2) {
            addCriterion("predict_time between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotBetween(String value1, String value2) {
            addCriterion("predict_time not between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andManHourIsNull() {
            addCriterion("man_hour is null");
            return (Criteria) this;
        }

        public Criteria andManHourIsNotNull() {
            addCriterion("man_hour is not null");
            return (Criteria) this;
        }

        public Criteria andManHourEqualTo(Double value) {
            addCriterion("man_hour =", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotEqualTo(Double value) {
            addCriterion("man_hour <>", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThan(Double value) {
            addCriterion("man_hour >", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThanOrEqualTo(Double value) {
            addCriterion("man_hour >=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThan(Double value) {
            addCriterion("man_hour <", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThanOrEqualTo(Double value) {
            addCriterion("man_hour <=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourIn(List<Double> values) {
            addCriterion("man_hour in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotIn(List<Double> values) {
            addCriterion("man_hour not in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourBetween(Double value1, Double value2) {
            addCriterion("man_hour between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotBetween(Double value1, Double value2) {
            addCriterion("man_hour not between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIsNull() {
            addCriterion("finish_audit_user is null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIsNotNull() {
            addCriterion("finish_audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserEqualTo(Integer value) {
            addCriterion("finish_audit_user =", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserNotEqualTo(Integer value) {
            addCriterion("finish_audit_user <>", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserGreaterThan(Integer value) {
            addCriterion("finish_audit_user >", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_audit_user >=", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserLessThan(Integer value) {
            addCriterion("finish_audit_user <", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserLessThanOrEqualTo(Integer value) {
            addCriterion("finish_audit_user <=", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIn(List<Integer> values) {
            addCriterion("finish_audit_user in", values, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserNotIn(List<Integer> values) {
            addCriterion("finish_audit_user not in", values, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserBetween(Integer value1, Integer value2) {
            addCriterion("finish_audit_user between", value1, value2, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_audit_user not between", value1, value2, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIsNull() {
            addCriterion("finish_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIsNotNull() {
            addCriterion("finish_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeEqualTo(Date value) {
            addCriterion("finish_audit_time =", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeNotEqualTo(Date value) {
            addCriterion("finish_audit_time <>", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeGreaterThan(Date value) {
            addCriterion("finish_audit_time >", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_audit_time >=", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeLessThan(Date value) {
            addCriterion("finish_audit_time <", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_audit_time <=", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIn(List<Date> values) {
            addCriterion("finish_audit_time in", values, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeNotIn(List<Date> values) {
            addCriterion("finish_audit_time not in", values, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeBetween(Date value1, Date value2) {
            addCriterion("finish_audit_time between", value1, value2, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_audit_time not between", value1, value2, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIsNull() {
            addCriterion("referral_remarks is null");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIsNotNull() {
            addCriterion("referral_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksEqualTo(String value) {
            addCriterion("referral_remarks =", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotEqualTo(String value) {
            addCriterion("referral_remarks <>", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksGreaterThan(String value) {
            addCriterion("referral_remarks >", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("referral_remarks >=", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksLessThan(String value) {
            addCriterion("referral_remarks <", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksLessThanOrEqualTo(String value) {
            addCriterion("referral_remarks <=", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksLike(String value) {
            addCriterion("referral_remarks like", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotLike(String value) {
            addCriterion("referral_remarks not like", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIn(List<String> values) {
            addCriterion("referral_remarks in", values, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotIn(List<String> values) {
            addCriterion("referral_remarks not in", values, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksBetween(String value1, String value2) {
            addCriterion("referral_remarks between", value1, value2, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotBetween(String value1, String value2) {
            addCriterion("referral_remarks not between", value1, value2, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}