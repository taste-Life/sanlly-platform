package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GohContainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GohContainerExample() {
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

        public Criteria andProdGohContainerIdIsNull() {
            addCriterion("prod_goh_container_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdIsNotNull() {
            addCriterion("prod_goh_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdEqualTo(Integer value) {
            addCriterion("prod_goh_container_id =", value, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdNotEqualTo(Integer value) {
            addCriterion("prod_goh_container_id <>", value, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdGreaterThan(Integer value) {
            addCriterion("prod_goh_container_id >", value, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_id >=", value, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdLessThan(Integer value) {
            addCriterion("prod_goh_container_id <", value, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_id <=", value, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdIn(List<Integer> values) {
            addCriterion("prod_goh_container_id in", values, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdNotIn(List<Integer> values) {
            addCriterion("prod_goh_container_id not in", values, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_id between", value1, value2, "prodGohContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_id not between", value1, value2, "prodGohContainerId");
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

        public Criteria andGohContRequireIsNull() {
            addCriterion("goh_cont_require is null");
            return (Criteria) this;
        }

        public Criteria andGohContRequireIsNotNull() {
            addCriterion("goh_cont_require is not null");
            return (Criteria) this;
        }

        public Criteria andGohContRequireEqualTo(Integer value) {
            addCriterion("goh_cont_require =", value, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireNotEqualTo(Integer value) {
            addCriterion("goh_cont_require <>", value, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireGreaterThan(Integer value) {
            addCriterion("goh_cont_require >", value, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireGreaterThanOrEqualTo(Integer value) {
            addCriterion("goh_cont_require >=", value, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireLessThan(Integer value) {
            addCriterion("goh_cont_require <", value, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireLessThanOrEqualTo(Integer value) {
            addCriterion("goh_cont_require <=", value, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireIn(List<Integer> values) {
            addCriterion("goh_cont_require in", values, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireNotIn(List<Integer> values) {
            addCriterion("goh_cont_require not in", values, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireBetween(Integer value1, Integer value2) {
            addCriterion("goh_cont_require between", value1, value2, "gohContRequire");
            return (Criteria) this;
        }

        public Criteria andGohContRequireNotBetween(Integer value1, Integer value2) {
            addCriterion("goh_cont_require not between", value1, value2, "gohContRequire");
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

        public Criteria andBeforeContainerTypeIsNull() {
            addCriterion("before_container_type is null");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeIsNotNull() {
            addCriterion("before_container_type is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeEqualTo(String value) {
            addCriterion("before_container_type =", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotEqualTo(String value) {
            addCriterion("before_container_type <>", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeGreaterThan(String value) {
            addCriterion("before_container_type >", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("before_container_type >=", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeLessThan(String value) {
            addCriterion("before_container_type <", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("before_container_type <=", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeLike(String value) {
            addCriterion("before_container_type like", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotLike(String value) {
            addCriterion("before_container_type not like", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeIn(List<String> values) {
            addCriterion("before_container_type in", values, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotIn(List<String> values) {
            addCriterion("before_container_type not in", values, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeBetween(String value1, String value2) {
            addCriterion("before_container_type between", value1, value2, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotBetween(String value1, String value2) {
            addCriterion("before_container_type not between", value1, value2, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeIsNull() {
            addCriterion("after_container_type is null");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeIsNotNull() {
            addCriterion("after_container_type is not null");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeEqualTo(String value) {
            addCriterion("after_container_type =", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotEqualTo(String value) {
            addCriterion("after_container_type <>", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeGreaterThan(String value) {
            addCriterion("after_container_type >", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("after_container_type >=", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeLessThan(String value) {
            addCriterion("after_container_type <", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("after_container_type <=", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeLike(String value) {
            addCriterion("after_container_type like", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotLike(String value) {
            addCriterion("after_container_type not like", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeIn(List<String> values) {
            addCriterion("after_container_type in", values, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotIn(List<String> values) {
            addCriterion("after_container_type not in", values, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeBetween(String value1, String value2) {
            addCriterion("after_container_type between", value1, value2, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotBetween(String value1, String value2) {
            addCriterion("after_container_type not between", value1, value2, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("`structure` is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("`structure` is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("`structure` =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("`structure` <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("`structure` >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("`structure` >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("`structure` <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("`structure` <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("`structure` like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("`structure` not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("`structure` in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("`structure` not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("`structure` between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("`structure` not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andTierNumberIsNull() {
            addCriterion("tier_number is null");
            return (Criteria) this;
        }

        public Criteria andTierNumberIsNotNull() {
            addCriterion("tier_number is not null");
            return (Criteria) this;
        }

        public Criteria andTierNumberEqualTo(String value) {
            addCriterion("tier_number =", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotEqualTo(String value) {
            addCriterion("tier_number <>", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberGreaterThan(String value) {
            addCriterion("tier_number >", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tier_number >=", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberLessThan(String value) {
            addCriterion("tier_number <", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberLessThanOrEqualTo(String value) {
            addCriterion("tier_number <=", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberLike(String value) {
            addCriterion("tier_number like", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotLike(String value) {
            addCriterion("tier_number not like", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberIn(List<String> values) {
            addCriterion("tier_number in", values, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotIn(List<String> values) {
            addCriterion("tier_number not in", values, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberBetween(String value1, String value2) {
            addCriterion("tier_number between", value1, value2, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotBetween(String value1, String value2) {
            addCriterion("tier_number not between", value1, value2, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeIsNull() {
            addCriterion("reshape_type is null");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeIsNotNull() {
            addCriterion("reshape_type is not null");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeEqualTo(String value) {
            addCriterion("reshape_type =", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotEqualTo(String value) {
            addCriterion("reshape_type <>", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeGreaterThan(String value) {
            addCriterion("reshape_type >", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reshape_type >=", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeLessThan(String value) {
            addCriterion("reshape_type <", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeLessThanOrEqualTo(String value) {
            addCriterion("reshape_type <=", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeLike(String value) {
            addCriterion("reshape_type like", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotLike(String value) {
            addCriterion("reshape_type not like", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeIn(List<String> values) {
            addCriterion("reshape_type in", values, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotIn(List<String> values) {
            addCriterion("reshape_type not in", values, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeBetween(String value1, String value2) {
            addCriterion("reshape_type between", value1, value2, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotBetween(String value1, String value2) {
            addCriterion("reshape_type not between", value1, value2, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberIsNull() {
            addCriterion("sum_beam_number is null");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberIsNotNull() {
            addCriterion("sum_beam_number is not null");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberEqualTo(Double value) {
            addCriterion("sum_beam_number =", value, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberNotEqualTo(Double value) {
            addCriterion("sum_beam_number <>", value, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberGreaterThan(Double value) {
            addCriterion("sum_beam_number >", value, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_beam_number >=", value, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberLessThan(Double value) {
            addCriterion("sum_beam_number <", value, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberLessThanOrEqualTo(Double value) {
            addCriterion("sum_beam_number <=", value, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberIn(List<Double> values) {
            addCriterion("sum_beam_number in", values, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberNotIn(List<Double> values) {
            addCriterion("sum_beam_number not in", values, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberBetween(Double value1, Double value2) {
            addCriterion("sum_beam_number between", value1, value2, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andSumBeamNumberNotBetween(Double value1, Double value2) {
            addCriterion("sum_beam_number not between", value1, value2, "sumBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberIsNull() {
            addCriterion("lose_beam_number is null");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberIsNotNull() {
            addCriterion("lose_beam_number is not null");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberEqualTo(Double value) {
            addCriterion("lose_beam_number =", value, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberNotEqualTo(Double value) {
            addCriterion("lose_beam_number <>", value, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberGreaterThan(Double value) {
            addCriterion("lose_beam_number >", value, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("lose_beam_number >=", value, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberLessThan(Double value) {
            addCriterion("lose_beam_number <", value, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberLessThanOrEqualTo(Double value) {
            addCriterion("lose_beam_number <=", value, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberIn(List<Double> values) {
            addCriterion("lose_beam_number in", values, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberNotIn(List<Double> values) {
            addCriterion("lose_beam_number not in", values, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberBetween(Double value1, Double value2) {
            addCriterion("lose_beam_number between", value1, value2, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andLoseBeamNumberNotBetween(Double value1, Double value2) {
            addCriterion("lose_beam_number not between", value1, value2, "loseBeamNumber");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceIsNull() {
            addCriterion("horizontal_distance is null");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceIsNotNull() {
            addCriterion("horizontal_distance is not null");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceEqualTo(Double value) {
            addCriterion("horizontal_distance =", value, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceNotEqualTo(Double value) {
            addCriterion("horizontal_distance <>", value, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceGreaterThan(Double value) {
            addCriterion("horizontal_distance >", value, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("horizontal_distance >=", value, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceLessThan(Double value) {
            addCriterion("horizontal_distance <", value, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceLessThanOrEqualTo(Double value) {
            addCriterion("horizontal_distance <=", value, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceIn(List<Double> values) {
            addCriterion("horizontal_distance in", values, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceNotIn(List<Double> values) {
            addCriterion("horizontal_distance not in", values, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceBetween(Double value1, Double value2) {
            addCriterion("horizontal_distance between", value1, value2, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andHorizontalDistanceNotBetween(Double value1, Double value2) {
            addCriterion("horizontal_distance not between", value1, value2, "horizontalDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceIsNull() {
            addCriterion("updown_distance is null");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceIsNotNull() {
            addCriterion("updown_distance is not null");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceEqualTo(Double value) {
            addCriterion("updown_distance =", value, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceNotEqualTo(Double value) {
            addCriterion("updown_distance <>", value, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceGreaterThan(Double value) {
            addCriterion("updown_distance >", value, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("updown_distance >=", value, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceLessThan(Double value) {
            addCriterion("updown_distance <", value, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceLessThanOrEqualTo(Double value) {
            addCriterion("updown_distance <=", value, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceIn(List<Double> values) {
            addCriterion("updown_distance in", values, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceNotIn(List<Double> values) {
            addCriterion("updown_distance not in", values, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceBetween(Double value1, Double value2) {
            addCriterion("updown_distance between", value1, value2, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andUpdownDistanceNotBetween(Double value1, Double value2) {
            addCriterion("updown_distance not between", value1, value2, "updownDistance");
            return (Criteria) this;
        }

        public Criteria andIsGohIsNull() {
            addCriterion("is_goh is null");
            return (Criteria) this;
        }

        public Criteria andIsGohIsNotNull() {
            addCriterion("is_goh is not null");
            return (Criteria) this;
        }

        public Criteria andIsGohEqualTo(String value) {
            addCriterion("is_goh =", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohNotEqualTo(String value) {
            addCriterion("is_goh <>", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohGreaterThan(String value) {
            addCriterion("is_goh >", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohGreaterThanOrEqualTo(String value) {
            addCriterion("is_goh >=", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohLessThan(String value) {
            addCriterion("is_goh <", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohLessThanOrEqualTo(String value) {
            addCriterion("is_goh <=", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohLike(String value) {
            addCriterion("is_goh like", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohNotLike(String value) {
            addCriterion("is_goh not like", value, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohIn(List<String> values) {
            addCriterion("is_goh in", values, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohNotIn(List<String> values) {
            addCriterion("is_goh not in", values, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohBetween(String value1, String value2) {
            addCriterion("is_goh between", value1, value2, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsGohNotBetween(String value1, String value2) {
            addCriterion("is_goh not between", value1, value2, "isGoh");
            return (Criteria) this;
        }

        public Criteria andIsEntryIsNull() {
            addCriterion("is_entry is null");
            return (Criteria) this;
        }

        public Criteria andIsEntryIsNotNull() {
            addCriterion("is_entry is not null");
            return (Criteria) this;
        }

        public Criteria andIsEntryEqualTo(String value) {
            addCriterion("is_entry =", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryNotEqualTo(String value) {
            addCriterion("is_entry <>", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryGreaterThan(String value) {
            addCriterion("is_entry >", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryGreaterThanOrEqualTo(String value) {
            addCriterion("is_entry >=", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryLessThan(String value) {
            addCriterion("is_entry <", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryLessThanOrEqualTo(String value) {
            addCriterion("is_entry <=", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryLike(String value) {
            addCriterion("is_entry like", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryNotLike(String value) {
            addCriterion("is_entry not like", value, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryIn(List<String> values) {
            addCriterion("is_entry in", values, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryNotIn(List<String> values) {
            addCriterion("is_entry not in", values, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryBetween(String value1, String value2) {
            addCriterion("is_entry between", value1, value2, "isEntry");
            return (Criteria) this;
        }

        public Criteria andIsEntryNotBetween(String value1, String value2) {
            addCriterion("is_entry not between", value1, value2, "isEntry");
            return (Criteria) this;
        }

        public Criteria andContainerWeightIsNull() {
            addCriterion("container_weight is null");
            return (Criteria) this;
        }

        public Criteria andContainerWeightIsNotNull() {
            addCriterion("container_weight is not null");
            return (Criteria) this;
        }

        public Criteria andContainerWeightEqualTo(String value) {
            addCriterion("container_weight =", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightNotEqualTo(String value) {
            addCriterion("container_weight <>", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightGreaterThan(String value) {
            addCriterion("container_weight >", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightGreaterThanOrEqualTo(String value) {
            addCriterion("container_weight >=", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightLessThan(String value) {
            addCriterion("container_weight <", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightLessThanOrEqualTo(String value) {
            addCriterion("container_weight <=", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightLike(String value) {
            addCriterion("container_weight like", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightNotLike(String value) {
            addCriterion("container_weight not like", value, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightIn(List<String> values) {
            addCriterion("container_weight in", values, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightNotIn(List<String> values) {
            addCriterion("container_weight not in", values, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightBetween(String value1, String value2) {
            addCriterion("container_weight between", value1, value2, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andContainerWeightNotBetween(String value1, String value2) {
            addCriterion("container_weight not between", value1, value2, "containerWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightIsNull() {
            addCriterion("material_weight is null");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightIsNotNull() {
            addCriterion("material_weight is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightEqualTo(Double value) {
            addCriterion("material_weight =", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightNotEqualTo(Double value) {
            addCriterion("material_weight <>", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightGreaterThan(Double value) {
            addCriterion("material_weight >", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("material_weight >=", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightLessThan(Double value) {
            addCriterion("material_weight <", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightLessThanOrEqualTo(Double value) {
            addCriterion("material_weight <=", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightIn(List<Double> values) {
            addCriterion("material_weight in", values, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightNotIn(List<Double> values) {
            addCriterion("material_weight not in", values, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightBetween(Double value1, Double value2) {
            addCriterion("material_weight between", value1, value2, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightNotBetween(Double value1, Double value2) {
            addCriterion("material_weight not between", value1, value2, "materialWeight");
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

        public Criteria andPickingStateIsNull() {
            addCriterion("picking_state is null");
            return (Criteria) this;
        }

        public Criteria andPickingStateIsNotNull() {
            addCriterion("picking_state is not null");
            return (Criteria) this;
        }

        public Criteria andPickingStateEqualTo(String value) {
            addCriterion("picking_state =", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateNotEqualTo(String value) {
            addCriterion("picking_state <>", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateGreaterThan(String value) {
            addCriterion("picking_state >", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateGreaterThanOrEqualTo(String value) {
            addCriterion("picking_state >=", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateLessThan(String value) {
            addCriterion("picking_state <", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateLessThanOrEqualTo(String value) {
            addCriterion("picking_state <=", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateLike(String value) {
            addCriterion("picking_state like", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateNotLike(String value) {
            addCriterion("picking_state not like", value, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateIn(List<String> values) {
            addCriterion("picking_state in", values, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateNotIn(List<String> values) {
            addCriterion("picking_state not in", values, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateBetween(String value1, String value2) {
            addCriterion("picking_state between", value1, value2, "pickingState");
            return (Criteria) this;
        }

        public Criteria andPickingStateNotBetween(String value1, String value2) {
            addCriterion("picking_state not between", value1, value2, "pickingState");
            return (Criteria) this;
        }

        public Criteria andContainerCostIsNull() {
            addCriterion("container_cost is null");
            return (Criteria) this;
        }

        public Criteria andContainerCostIsNotNull() {
            addCriterion("container_cost is not null");
            return (Criteria) this;
        }

        public Criteria andContainerCostEqualTo(BigDecimal value) {
            addCriterion("container_cost =", value, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostNotEqualTo(BigDecimal value) {
            addCriterion("container_cost <>", value, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostGreaterThan(BigDecimal value) {
            addCriterion("container_cost >", value, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("container_cost >=", value, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostLessThan(BigDecimal value) {
            addCriterion("container_cost <", value, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("container_cost <=", value, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostIn(List<BigDecimal> values) {
            addCriterion("container_cost in", values, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostNotIn(List<BigDecimal> values) {
            addCriterion("container_cost not in", values, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("container_cost between", value1, value2, "containerCost");
            return (Criteria) this;
        }

        public Criteria andContainerCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("container_cost not between", value1, value2, "containerCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostIsNull() {
            addCriterion("third_party_cost is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostIsNotNull() {
            addCriterion("third_party_cost is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostEqualTo(BigDecimal value) {
            addCriterion("third_party_cost =", value, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostNotEqualTo(BigDecimal value) {
            addCriterion("third_party_cost <>", value, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostGreaterThan(BigDecimal value) {
            addCriterion("third_party_cost >", value, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("third_party_cost >=", value, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostLessThan(BigDecimal value) {
            addCriterion("third_party_cost <", value, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("third_party_cost <=", value, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostIn(List<BigDecimal> values) {
            addCriterion("third_party_cost in", values, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostNotIn(List<BigDecimal> values) {
            addCriterion("third_party_cost not in", values, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_party_cost between", value1, value2, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_party_cost not between", value1, value2, "thirdPartyCost");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNull() {
            addCriterion("sum_cost is null");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNotNull() {
            addCriterion("sum_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostEqualTo(BigDecimal value) {
            addCriterion("sum_cost =", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotEqualTo(BigDecimal value) {
            addCriterion("sum_cost <>", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThan(BigDecimal value) {
            addCriterion("sum_cost >", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_cost >=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThan(BigDecimal value) {
            addCriterion("sum_cost <", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_cost <=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostIn(List<BigDecimal> values) {
            addCriterion("sum_cost in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotIn(List<BigDecimal> values) {
            addCriterion("sum_cost not in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_cost between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_cost not between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostIsNull() {
            addCriterion("labor_cost is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostIsNotNull() {
            addCriterion("labor_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostEqualTo(BigDecimal value) {
            addCriterion("labor_cost =", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotEqualTo(BigDecimal value) {
            addCriterion("labor_cost <>", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostGreaterThan(BigDecimal value) {
            addCriterion("labor_cost >", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost >=", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostLessThan(BigDecimal value) {
            addCriterion("labor_cost <", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost <=", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostIn(List<BigDecimal> values) {
            addCriterion("labor_cost in", values, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotIn(List<BigDecimal> values) {
            addCriterion("labor_cost not in", values, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost between", value1, value2, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost not between", value1, value2, "laborCost");
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

        public Criteria andVesselVoyageIsNull() {
            addCriterion("vessel_voyage is null");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIsNotNull() {
            addCriterion("vessel_voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageEqualTo(String value) {
            addCriterion("vessel_voyage =", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotEqualTo(String value) {
            addCriterion("vessel_voyage <>", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageGreaterThan(String value) {
            addCriterion("vessel_voyage >", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageGreaterThanOrEqualTo(String value) {
            addCriterion("vessel_voyage >=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLessThan(String value) {
            addCriterion("vessel_voyage <", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLessThanOrEqualTo(String value) {
            addCriterion("vessel_voyage <=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLike(String value) {
            addCriterion("vessel_voyage like", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotLike(String value) {
            addCriterion("vessel_voyage not like", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIn(List<String> values) {
            addCriterion("vessel_voyage in", values, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotIn(List<String> values) {
            addCriterion("vessel_voyage not in", values, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageBetween(String value1, String value2) {
            addCriterion("vessel_voyage between", value1, value2, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotBetween(String value1, String value2) {
            addCriterion("vessel_voyage not between", value1, value2, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIsNull() {
            addCriterion("bill_of_lading_no is null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIsNotNull() {
            addCriterion("bill_of_lading_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoEqualTo(String value) {
            addCriterion("bill_of_lading_no =", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotEqualTo(String value) {
            addCriterion("bill_of_lading_no <>", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoGreaterThan(String value) {
            addCriterion("bill_of_lading_no >", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_of_lading_no >=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLessThan(String value) {
            addCriterion("bill_of_lading_no <", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLessThanOrEqualTo(String value) {
            addCriterion("bill_of_lading_no <=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLike(String value) {
            addCriterion("bill_of_lading_no like", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotLike(String value) {
            addCriterion("bill_of_lading_no not like", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIn(List<String> values) {
            addCriterion("bill_of_lading_no in", values, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotIn(List<String> values) {
            addCriterion("bill_of_lading_no not in", values, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoBetween(String value1, String value2) {
            addCriterion("bill_of_lading_no between", value1, value2, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotBetween(String value1, String value2) {
            addCriterion("bill_of_lading_no not between", value1, value2, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIsNull() {
            addCriterion("destination_port is null");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIsNotNull() {
            addCriterion("destination_port is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationPortEqualTo(String value) {
            addCriterion("destination_port =", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotEqualTo(String value) {
            addCriterion("destination_port <>", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortGreaterThan(String value) {
            addCriterion("destination_port >", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortGreaterThanOrEqualTo(String value) {
            addCriterion("destination_port >=", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLessThan(String value) {
            addCriterion("destination_port <", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLessThanOrEqualTo(String value) {
            addCriterion("destination_port <=", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLike(String value) {
            addCriterion("destination_port like", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotLike(String value) {
            addCriterion("destination_port not like", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIn(List<String> values) {
            addCriterion("destination_port in", values, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotIn(List<String> values) {
            addCriterion("destination_port not in", values, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortBetween(String value1, String value2) {
            addCriterion("destination_port between", value1, value2, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotBetween(String value1, String value2) {
            addCriterion("destination_port not between", value1, value2, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeIsNull() {
            addCriterion("extract_cont_time is null");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeIsNotNull() {
            addCriterion("extract_cont_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeEqualTo(Date value) {
            addCriterion("extract_cont_time =", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeNotEqualTo(Date value) {
            addCriterion("extract_cont_time <>", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeGreaterThan(Date value) {
            addCriterion("extract_cont_time >", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("extract_cont_time >=", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeLessThan(Date value) {
            addCriterion("extract_cont_time <", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeLessThanOrEqualTo(Date value) {
            addCriterion("extract_cont_time <=", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeIn(List<Date> values) {
            addCriterion("extract_cont_time in", values, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeNotIn(List<Date> values) {
            addCriterion("extract_cont_time not in", values, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeBetween(Date value1, Date value2) {
            addCriterion("extract_cont_time between", value1, value2, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeNotBetween(Date value1, Date value2) {
            addCriterion("extract_cont_time not between", value1, value2, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(Integer value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(Integer value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(Integer value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(Integer value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<Integer> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<Integer> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(Integer value1, Integer value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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