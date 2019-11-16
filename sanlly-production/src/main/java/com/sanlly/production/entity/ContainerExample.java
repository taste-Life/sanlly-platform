package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ContainerExample() {
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

        public Criteria andProdContainerIdIsNull() {
            addCriterion("prod_container_id is null");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIsNotNull() {
            addCriterion("prod_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdEqualTo(String value) {
            addCriterion("prod_container_id =", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotEqualTo(String value) {
            addCriterion("prod_container_id <>", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdGreaterThan(String value) {
            addCriterion("prod_container_id >", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_container_id >=", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLessThan(String value) {
            addCriterion("prod_container_id <", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLessThanOrEqualTo(String value) {
            addCriterion("prod_container_id <=", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLike(String value) {
            addCriterion("prod_container_id like", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotLike(String value) {
            addCriterion("prod_container_id not like", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIn(List<String> values) {
            addCriterion("prod_container_id in", values, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotIn(List<String> values) {
            addCriterion("prod_container_id not in", values, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdBetween(String value1, String value2) {
            addCriterion("prod_container_id between", value1, value2, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotBetween(String value1, String value2) {
            addCriterion("prod_container_id not between", value1, value2, "prodContainerId");
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

        public Criteria andContainerCategoryIsNull() {
            addCriterion("container_category is null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIsNotNull() {
            addCriterion("container_category is not null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryEqualTo(String value) {
            addCriterion("container_category =", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotEqualTo(String value) {
            addCriterion("container_category <>", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThan(String value) {
            addCriterion("container_category >", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("container_category >=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThan(String value) {
            addCriterion("container_category <", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThanOrEqualTo(String value) {
            addCriterion("container_category <=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLike(String value) {
            addCriterion("container_category like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotLike(String value) {
            addCriterion("container_category not like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIn(List<String> values) {
            addCriterion("container_category in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotIn(List<String> values) {
            addCriterion("container_category not in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryBetween(String value1, String value2) {
            addCriterion("container_category between", value1, value2, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotBetween(String value1, String value2) {
            addCriterion("container_category not between", value1, value2, "containerCategory");
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

        public Criteria andContainerAgeIsNull() {
            addCriterion("container_age is null");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIsNotNull() {
            addCriterion("container_age is not null");
            return (Criteria) this;
        }

        public Criteria andContainerAgeEqualTo(String value) {
            addCriterion("container_age =", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotEqualTo(String value) {
            addCriterion("container_age <>", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeGreaterThan(String value) {
            addCriterion("container_age >", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeGreaterThanOrEqualTo(String value) {
            addCriterion("container_age >=", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeLessThan(String value) {
            addCriterion("container_age <", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeLessThanOrEqualTo(String value) {
            addCriterion("container_age <=", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeLike(String value) {
            addCriterion("container_age like", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotLike(String value) {
            addCriterion("container_age not like", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIn(List<String> values) {
            addCriterion("container_age in", values, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotIn(List<String> values) {
            addCriterion("container_age not in", values, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeBetween(String value1, String value2) {
            addCriterion("container_age between", value1, value2, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotBetween(String value1, String value2) {
            addCriterion("container_age not between", value1, value2, "containerAge");
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

        public Criteria andRightAngleIsNull() {
            addCriterion("right_angle is null");
            return (Criteria) this;
        }

        public Criteria andRightAngleIsNotNull() {
            addCriterion("right_angle is not null");
            return (Criteria) this;
        }

        public Criteria andRightAngleEqualTo(String value) {
            addCriterion("right_angle =", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotEqualTo(String value) {
            addCriterion("right_angle <>", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleGreaterThan(String value) {
            addCriterion("right_angle >", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleGreaterThanOrEqualTo(String value) {
            addCriterion("right_angle >=", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleLessThan(String value) {
            addCriterion("right_angle <", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleLessThanOrEqualTo(String value) {
            addCriterion("right_angle <=", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleLike(String value) {
            addCriterion("right_angle like", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotLike(String value) {
            addCriterion("right_angle not like", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleIn(List<String> values) {
            addCriterion("right_angle in", values, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotIn(List<String> values) {
            addCriterion("right_angle not in", values, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleBetween(String value1, String value2) {
            addCriterion("right_angle between", value1, value2, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotBetween(String value1, String value2) {
            addCriterion("right_angle not between", value1, value2, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andIsLabelIsNull() {
            addCriterion("is_label is null");
            return (Criteria) this;
        }

        public Criteria andIsLabelIsNotNull() {
            addCriterion("is_label is not null");
            return (Criteria) this;
        }

        public Criteria andIsLabelEqualTo(String value) {
            addCriterion("is_label =", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotEqualTo(String value) {
            addCriterion("is_label <>", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelGreaterThan(String value) {
            addCriterion("is_label >", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelGreaterThanOrEqualTo(String value) {
            addCriterion("is_label >=", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelLessThan(String value) {
            addCriterion("is_label <", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelLessThanOrEqualTo(String value) {
            addCriterion("is_label <=", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelLike(String value) {
            addCriterion("is_label like", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotLike(String value) {
            addCriterion("is_label not like", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelIn(List<String> values) {
            addCriterion("is_label in", values, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotIn(List<String> values) {
            addCriterion("is_label not in", values, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelBetween(String value1, String value2) {
            addCriterion("is_label between", value1, value2, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotBetween(String value1, String value2) {
            addCriterion("is_label not between", value1, value2, "isLabel");
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