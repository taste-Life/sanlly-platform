package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ChargeExample() {
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

        public Criteria andProdChargeIdIsNull() {
            addCriterion("prod_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdIsNotNull() {
            addCriterion("prod_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdEqualTo(Integer value) {
            addCriterion("prod_charge_id =", value, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdNotEqualTo(Integer value) {
            addCriterion("prod_charge_id <>", value, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdGreaterThan(Integer value) {
            addCriterion("prod_charge_id >", value, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_charge_id >=", value, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdLessThan(Integer value) {
            addCriterion("prod_charge_id <", value, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_charge_id <=", value, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdIn(List<Integer> values) {
            addCriterion("prod_charge_id in", values, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdNotIn(List<Integer> values) {
            addCriterion("prod_charge_id not in", values, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_charge_id between", value1, value2, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_charge_id not between", value1, value2, "prodChargeId");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeIsNull() {
            addCriterion("prod_charge_code is null");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeIsNotNull() {
            addCriterion("prod_charge_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeEqualTo(String value) {
            addCriterion("prod_charge_code =", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeNotEqualTo(String value) {
            addCriterion("prod_charge_code <>", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeGreaterThan(String value) {
            addCriterion("prod_charge_code >", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_charge_code >=", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeLessThan(String value) {
            addCriterion("prod_charge_code <", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_charge_code <=", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeLike(String value) {
            addCriterion("prod_charge_code like", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeNotLike(String value) {
            addCriterion("prod_charge_code not like", value, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeIn(List<String> values) {
            addCriterion("prod_charge_code in", values, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeNotIn(List<String> values) {
            addCriterion("prod_charge_code not in", values, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeBetween(String value1, String value2) {
            addCriterion("prod_charge_code between", value1, value2, "prodChargeCode");
            return (Criteria) this;
        }

        public Criteria andProdChargeCodeNotBetween(String value1, String value2) {
            addCriterion("prod_charge_code not between", value1, value2, "prodChargeCode");
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

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("charge_type like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("charge_type not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNull() {
            addCriterion("deposit_money is null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNotNull() {
            addCriterion("deposit_money is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyEqualTo(BigDecimal value) {
            addCriterion("deposit_money =", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotEqualTo(BigDecimal value) {
            addCriterion("deposit_money <>", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThan(BigDecimal value) {
            addCriterion("deposit_money >", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_money >=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThan(BigDecimal value) {
            addCriterion("deposit_money <", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_money <=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIn(List<BigDecimal> values) {
            addCriterion("deposit_money in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotIn(List<BigDecimal> values) {
            addCriterion("deposit_money not in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_money between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_money not between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNull() {
            addCriterion("received_money is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNotNull() {
            addCriterion("received_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyEqualTo(BigDecimal value) {
            addCriterion("received_money =", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotEqualTo(BigDecimal value) {
            addCriterion("received_money <>", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThan(BigDecimal value) {
            addCriterion("received_money >", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("received_money >=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThan(BigDecimal value) {
            addCriterion("received_money <", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("received_money <=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIn(List<BigDecimal> values) {
            addCriterion("received_money in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotIn(List<BigDecimal> values) {
            addCriterion("received_money not in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("received_money between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("received_money not between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyIsNull() {
            addCriterion("should_back_money is null");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyIsNotNull() {
            addCriterion("should_back_money is not null");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyEqualTo(BigDecimal value) {
            addCriterion("should_back_money =", value, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyNotEqualTo(BigDecimal value) {
            addCriterion("should_back_money <>", value, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyGreaterThan(BigDecimal value) {
            addCriterion("should_back_money >", value, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("should_back_money >=", value, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyLessThan(BigDecimal value) {
            addCriterion("should_back_money <", value, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("should_back_money <=", value, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyIn(List<BigDecimal> values) {
            addCriterion("should_back_money in", values, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyNotIn(List<BigDecimal> values) {
            addCriterion("should_back_money not in", values, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_back_money between", value1, value2, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andShouldBackMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("should_back_money not between", value1, value2, "shouldBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyIsNull() {
            addCriterion("actual_back_money is null");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyIsNotNull() {
            addCriterion("actual_back_money is not null");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyEqualTo(BigDecimal value) {
            addCriterion("actual_back_money =", value, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyNotEqualTo(BigDecimal value) {
            addCriterion("actual_back_money <>", value, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyGreaterThan(BigDecimal value) {
            addCriterion("actual_back_money >", value, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_back_money >=", value, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyLessThan(BigDecimal value) {
            addCriterion("actual_back_money <", value, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_back_money <=", value, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyIn(List<BigDecimal> values) {
            addCriterion("actual_back_money in", values, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyNotIn(List<BigDecimal> values) {
            addCriterion("actual_back_money not in", values, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_back_money between", value1, value2, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andActualBackMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_back_money not between", value1, value2, "actualBackMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadIsNull() {
            addCriterion("is_back_spread is null");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadIsNotNull() {
            addCriterion("is_back_spread is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadEqualTo(String value) {
            addCriterion("is_back_spread =", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadNotEqualTo(String value) {
            addCriterion("is_back_spread <>", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadGreaterThan(String value) {
            addCriterion("is_back_spread >", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadGreaterThanOrEqualTo(String value) {
            addCriterion("is_back_spread >=", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadLessThan(String value) {
            addCriterion("is_back_spread <", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadLessThanOrEqualTo(String value) {
            addCriterion("is_back_spread <=", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadLike(String value) {
            addCriterion("is_back_spread like", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadNotLike(String value) {
            addCriterion("is_back_spread not like", value, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadIn(List<String> values) {
            addCriterion("is_back_spread in", values, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadNotIn(List<String> values) {
            addCriterion("is_back_spread not in", values, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadBetween(String value1, String value2) {
            addCriterion("is_back_spread between", value1, value2, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andIsBackSpreadNotBetween(String value1, String value2) {
            addCriterion("is_back_spread not between", value1, value2, "isBackSpread");
            return (Criteria) this;
        }

        public Criteria andChargeUserIsNull() {
            addCriterion("charge_user is null");
            return (Criteria) this;
        }

        public Criteria andChargeUserIsNotNull() {
            addCriterion("charge_user is not null");
            return (Criteria) this;
        }

        public Criteria andChargeUserEqualTo(Integer value) {
            addCriterion("charge_user =", value, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserNotEqualTo(Integer value) {
            addCriterion("charge_user <>", value, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserGreaterThan(Integer value) {
            addCriterion("charge_user >", value, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_user >=", value, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserLessThan(Integer value) {
            addCriterion("charge_user <", value, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserLessThanOrEqualTo(Integer value) {
            addCriterion("charge_user <=", value, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserIn(List<Integer> values) {
            addCriterion("charge_user in", values, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserNotIn(List<Integer> values) {
            addCriterion("charge_user not in", values, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserBetween(Integer value1, Integer value2) {
            addCriterion("charge_user between", value1, value2, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_user not between", value1, value2, "chargeUser");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNull() {
            addCriterion("charge_time is null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNotNull() {
            addCriterion("charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeEqualTo(Date value) {
            addCriterion("charge_time =", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotEqualTo(Date value) {
            addCriterion("charge_time <>", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThan(Date value) {
            addCriterion("charge_time >", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("charge_time >=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThan(Date value) {
            addCriterion("charge_time <", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("charge_time <=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIn(List<Date> values) {
            addCriterion("charge_time in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotIn(List<Date> values) {
            addCriterion("charge_time not in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeBetween(Date value1, Date value2) {
            addCriterion("charge_time between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("charge_time not between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoIsNull() {
            addCriterion("tax_iden_no is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoIsNotNull() {
            addCriterion("tax_iden_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoEqualTo(String value) {
            addCriterion("tax_iden_no =", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoNotEqualTo(String value) {
            addCriterion("tax_iden_no <>", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoGreaterThan(String value) {
            addCriterion("tax_iden_no >", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoGreaterThanOrEqualTo(String value) {
            addCriterion("tax_iden_no >=", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoLessThan(String value) {
            addCriterion("tax_iden_no <", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoLessThanOrEqualTo(String value) {
            addCriterion("tax_iden_no <=", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoLike(String value) {
            addCriterion("tax_iden_no like", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoNotLike(String value) {
            addCriterion("tax_iden_no not like", value, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoIn(List<String> values) {
            addCriterion("tax_iden_no in", values, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoNotIn(List<String> values) {
            addCriterion("tax_iden_no not in", values, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoBetween(String value1, String value2) {
            addCriterion("tax_iden_no between", value1, value2, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdenNoNotBetween(String value1, String value2) {
            addCriterion("tax_iden_no not between", value1, value2, "taxIdenNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameIsNull() {
            addCriterion("refund_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameIsNotNull() {
            addCriterion("refund_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameEqualTo(String value) {
            addCriterion("refund_bank_name =", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameNotEqualTo(String value) {
            addCriterion("refund_bank_name <>", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameGreaterThan(String value) {
            addCriterion("refund_bank_name >", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("refund_bank_name >=", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameLessThan(String value) {
            addCriterion("refund_bank_name <", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameLessThanOrEqualTo(String value) {
            addCriterion("refund_bank_name <=", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameLike(String value) {
            addCriterion("refund_bank_name like", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameNotLike(String value) {
            addCriterion("refund_bank_name not like", value, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameIn(List<String> values) {
            addCriterion("refund_bank_name in", values, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameNotIn(List<String> values) {
            addCriterion("refund_bank_name not in", values, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameBetween(String value1, String value2) {
            addCriterion("refund_bank_name between", value1, value2, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankNameNotBetween(String value1, String value2) {
            addCriterion("refund_bank_name not between", value1, value2, "refundBankName");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountIsNull() {
            addCriterion("refund_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountIsNotNull() {
            addCriterion("refund_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountEqualTo(String value) {
            addCriterion("refund_bank_account =", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountNotEqualTo(String value) {
            addCriterion("refund_bank_account <>", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountGreaterThan(String value) {
            addCriterion("refund_bank_account >", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("refund_bank_account >=", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountLessThan(String value) {
            addCriterion("refund_bank_account <", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountLessThanOrEqualTo(String value) {
            addCriterion("refund_bank_account <=", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountLike(String value) {
            addCriterion("refund_bank_account like", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountNotLike(String value) {
            addCriterion("refund_bank_account not like", value, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountIn(List<String> values) {
            addCriterion("refund_bank_account in", values, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountNotIn(List<String> values) {
            addCriterion("refund_bank_account not in", values, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountBetween(String value1, String value2) {
            addCriterion("refund_bank_account between", value1, value2, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andRefundBankAccountNotBetween(String value1, String value2) {
            addCriterion("refund_bank_account not between", value1, value2, "refundBankAccount");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksIsNull() {
            addCriterion("invoice_remarks is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksIsNotNull() {
            addCriterion("invoice_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksEqualTo(String value) {
            addCriterion("invoice_remarks =", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksNotEqualTo(String value) {
            addCriterion("invoice_remarks <>", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksGreaterThan(String value) {
            addCriterion("invoice_remarks >", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_remarks >=", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksLessThan(String value) {
            addCriterion("invoice_remarks <", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksLessThanOrEqualTo(String value) {
            addCriterion("invoice_remarks <=", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksLike(String value) {
            addCriterion("invoice_remarks like", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksNotLike(String value) {
            addCriterion("invoice_remarks not like", value, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksIn(List<String> values) {
            addCriterion("invoice_remarks in", values, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksNotIn(List<String> values) {
            addCriterion("invoice_remarks not in", values, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksBetween(String value1, String value2) {
            addCriterion("invoice_remarks between", value1, value2, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarksNotBetween(String value1, String value2) {
            addCriterion("invoice_remarks not between", value1, value2, "invoiceRemarks");
            return (Criteria) this;
        }

        public Criteria andSignaturePicIsNull() {
            addCriterion("signature_pic is null");
            return (Criteria) this;
        }

        public Criteria andSignaturePicIsNotNull() {
            addCriterion("signature_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSignaturePicEqualTo(String value) {
            addCriterion("signature_pic =", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicNotEqualTo(String value) {
            addCriterion("signature_pic <>", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicGreaterThan(String value) {
            addCriterion("signature_pic >", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicGreaterThanOrEqualTo(String value) {
            addCriterion("signature_pic >=", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicLessThan(String value) {
            addCriterion("signature_pic <", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicLessThanOrEqualTo(String value) {
            addCriterion("signature_pic <=", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicLike(String value) {
            addCriterion("signature_pic like", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicNotLike(String value) {
            addCriterion("signature_pic not like", value, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicIn(List<String> values) {
            addCriterion("signature_pic in", values, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicNotIn(List<String> values) {
            addCriterion("signature_pic not in", values, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicBetween(String value1, String value2) {
            addCriterion("signature_pic between", value1, value2, "signaturePic");
            return (Criteria) this;
        }

        public Criteria andSignaturePicNotBetween(String value1, String value2) {
            addCriterion("signature_pic not between", value1, value2, "signaturePic");
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

        public Criteria andChargeStateIsNull() {
            addCriterion("charge_state is null");
            return (Criteria) this;
        }

        public Criteria andChargeStateIsNotNull() {
            addCriterion("charge_state is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStateEqualTo(String value) {
            addCriterion("charge_state =", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotEqualTo(String value) {
            addCriterion("charge_state <>", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateGreaterThan(String value) {
            addCriterion("charge_state >", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateGreaterThanOrEqualTo(String value) {
            addCriterion("charge_state >=", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLessThan(String value) {
            addCriterion("charge_state <", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLessThanOrEqualTo(String value) {
            addCriterion("charge_state <=", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateLike(String value) {
            addCriterion("charge_state like", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotLike(String value) {
            addCriterion("charge_state not like", value, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateIn(List<String> values) {
            addCriterion("charge_state in", values, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotIn(List<String> values) {
            addCriterion("charge_state not in", values, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateBetween(String value1, String value2) {
            addCriterion("charge_state between", value1, value2, "chargeState");
            return (Criteria) this;
        }

        public Criteria andChargeStateNotBetween(String value1, String value2) {
            addCriterion("charge_state not between", value1, value2, "chargeState");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidIsNull() {
            addCriterion("allinpay_trxid is null");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidIsNotNull() {
            addCriterion("allinpay_trxid is not null");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidEqualTo(String value) {
            addCriterion("allinpay_trxid =", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidNotEqualTo(String value) {
            addCriterion("allinpay_trxid <>", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidGreaterThan(String value) {
            addCriterion("allinpay_trxid >", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidGreaterThanOrEqualTo(String value) {
            addCriterion("allinpay_trxid >=", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidLessThan(String value) {
            addCriterion("allinpay_trxid <", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidLessThanOrEqualTo(String value) {
            addCriterion("allinpay_trxid <=", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidLike(String value) {
            addCriterion("allinpay_trxid like", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidNotLike(String value) {
            addCriterion("allinpay_trxid not like", value, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidIn(List<String> values) {
            addCriterion("allinpay_trxid in", values, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidNotIn(List<String> values) {
            addCriterion("allinpay_trxid not in", values, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidBetween(String value1, String value2) {
            addCriterion("allinpay_trxid between", value1, value2, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andAllinpayTrxidNotBetween(String value1, String value2) {
            addCriterion("allinpay_trxid not between", value1, value2, "allinpayTrxid");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceIsNull() {
            addCriterion("pay_invoice is null");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceIsNotNull() {
            addCriterion("pay_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceEqualTo(String value) {
            addCriterion("pay_invoice =", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceNotEqualTo(String value) {
            addCriterion("pay_invoice <>", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceGreaterThan(String value) {
            addCriterion("pay_invoice >", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("pay_invoice >=", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceLessThan(String value) {
            addCriterion("pay_invoice <", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceLessThanOrEqualTo(String value) {
            addCriterion("pay_invoice <=", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceLike(String value) {
            addCriterion("pay_invoice like", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceNotLike(String value) {
            addCriterion("pay_invoice not like", value, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceIn(List<String> values) {
            addCriterion("pay_invoice in", values, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceNotIn(List<String> values) {
            addCriterion("pay_invoice not in", values, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceBetween(String value1, String value2) {
            addCriterion("pay_invoice between", value1, value2, "payInvoice");
            return (Criteria) this;
        }

        public Criteria andPayInvoiceNotBetween(String value1, String value2) {
            addCriterion("pay_invoice not between", value1, value2, "payInvoice");
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