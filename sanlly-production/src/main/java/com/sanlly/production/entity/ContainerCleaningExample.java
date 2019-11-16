package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContainerCleaningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ContainerCleaningExample() {
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

        public Criteria andProdContainerCleaningIdIsNull() {
            addCriterion("prod_container_cleaning_id is null");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdIsNotNull() {
            addCriterion("prod_container_cleaning_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdEqualTo(Integer value) {
            addCriterion("prod_container_cleaning_id =", value, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdNotEqualTo(Integer value) {
            addCriterion("prod_container_cleaning_id <>", value, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdGreaterThan(Integer value) {
            addCriterion("prod_container_cleaning_id >", value, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_container_cleaning_id >=", value, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdLessThan(Integer value) {
            addCriterion("prod_container_cleaning_id <", value, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_container_cleaning_id <=", value, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdIn(List<Integer> values) {
            addCriterion("prod_container_cleaning_id in", values, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdNotIn(List<Integer> values) {
            addCriterion("prod_container_cleaning_id not in", values, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_cleaning_id between", value1, value2, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andProdContainerCleaningIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_cleaning_id not between", value1, value2, "prodContainerCleaningId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternIsNull() {
            addCriterion("cleaning_pattern is null");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternIsNotNull() {
            addCriterion("cleaning_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternEqualTo(String value) {
            addCriterion("cleaning_pattern =", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternNotEqualTo(String value) {
            addCriterion("cleaning_pattern <>", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternGreaterThan(String value) {
            addCriterion("cleaning_pattern >", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternGreaterThanOrEqualTo(String value) {
            addCriterion("cleaning_pattern >=", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternLessThan(String value) {
            addCriterion("cleaning_pattern <", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternLessThanOrEqualTo(String value) {
            addCriterion("cleaning_pattern <=", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternLike(String value) {
            addCriterion("cleaning_pattern like", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternNotLike(String value) {
            addCriterion("cleaning_pattern not like", value, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternIn(List<String> values) {
            addCriterion("cleaning_pattern in", values, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternNotIn(List<String> values) {
            addCriterion("cleaning_pattern not in", values, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternBetween(String value1, String value2) {
            addCriterion("cleaning_pattern between", value1, value2, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andCleaningPatternNotBetween(String value1, String value2) {
            addCriterion("cleaning_pattern not between", value1, value2, "cleaningPattern");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeIsNull() {
            addCriterion("cleaning_time is null");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeIsNotNull() {
            addCriterion("cleaning_time is not null");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeEqualTo(Date value) {
            addCriterion("cleaning_time =", value, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeNotEqualTo(Date value) {
            addCriterion("cleaning_time <>", value, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeGreaterThan(Date value) {
            addCriterion("cleaning_time >", value, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cleaning_time >=", value, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeLessThan(Date value) {
            addCriterion("cleaning_time <", value, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeLessThanOrEqualTo(Date value) {
            addCriterion("cleaning_time <=", value, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeIn(List<Date> values) {
            addCriterion("cleaning_time in", values, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeNotIn(List<Date> values) {
            addCriterion("cleaning_time not in", values, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeBetween(Date value1, Date value2) {
            addCriterion("cleaning_time between", value1, value2, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningTimeNotBetween(Date value1, Date value2) {
            addCriterion("cleaning_time not between", value1, value2, "cleaningTime");
            return (Criteria) this;
        }

        public Criteria andCleaningStateIsNull() {
            addCriterion("cleaning_state is null");
            return (Criteria) this;
        }

        public Criteria andCleaningStateIsNotNull() {
            addCriterion("cleaning_state is not null");
            return (Criteria) this;
        }

        public Criteria andCleaningStateEqualTo(String value) {
            addCriterion("cleaning_state =", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateNotEqualTo(String value) {
            addCriterion("cleaning_state <>", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateGreaterThan(String value) {
            addCriterion("cleaning_state >", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateGreaterThanOrEqualTo(String value) {
            addCriterion("cleaning_state >=", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateLessThan(String value) {
            addCriterion("cleaning_state <", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateLessThanOrEqualTo(String value) {
            addCriterion("cleaning_state <=", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateLike(String value) {
            addCriterion("cleaning_state like", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateNotLike(String value) {
            addCriterion("cleaning_state not like", value, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateIn(List<String> values) {
            addCriterion("cleaning_state in", values, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateNotIn(List<String> values) {
            addCriterion("cleaning_state not in", values, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateBetween(String value1, String value2) {
            addCriterion("cleaning_state between", value1, value2, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andCleaningStateNotBetween(String value1, String value2) {
            addCriterion("cleaning_state not between", value1, value2, "cleaningState");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("is_special is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("is_special is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(String value) {
            addCriterion("is_special =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(String value) {
            addCriterion("is_special <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(String value) {
            addCriterion("is_special >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("is_special >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(String value) {
            addCriterion("is_special <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(String value) {
            addCriterion("is_special <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLike(String value) {
            addCriterion("is_special like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotLike(String value) {
            addCriterion("is_special not like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<String> values) {
            addCriterion("is_special in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<String> values) {
            addCriterion("is_special not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(String value1, String value2) {
            addCriterion("is_special between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(String value1, String value2) {
            addCriterion("is_special not between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeIsNull() {
            addCriterion("off_flavor_type is null");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeIsNotNull() {
            addCriterion("off_flavor_type is not null");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeEqualTo(String value) {
            addCriterion("off_flavor_type =", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeNotEqualTo(String value) {
            addCriterion("off_flavor_type <>", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeGreaterThan(String value) {
            addCriterion("off_flavor_type >", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("off_flavor_type >=", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeLessThan(String value) {
            addCriterion("off_flavor_type <", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeLessThanOrEqualTo(String value) {
            addCriterion("off_flavor_type <=", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeLike(String value) {
            addCriterion("off_flavor_type like", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeNotLike(String value) {
            addCriterion("off_flavor_type not like", value, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeIn(List<String> values) {
            addCriterion("off_flavor_type in", values, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeNotIn(List<String> values) {
            addCriterion("off_flavor_type not in", values, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeBetween(String value1, String value2) {
            addCriterion("off_flavor_type between", value1, value2, "offFlavorType");
            return (Criteria) this;
        }

        public Criteria andOffFlavorTypeNotBetween(String value1, String value2) {
            addCriterion("off_flavor_type not between", value1, value2, "offFlavorType");
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

        public Criteria andTestingRemarksIsNull() {
            addCriterion("testing_remarks is null");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIsNotNull() {
            addCriterion("testing_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksEqualTo(String value) {
            addCriterion("testing_remarks =", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotEqualTo(String value) {
            addCriterion("testing_remarks <>", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksGreaterThan(String value) {
            addCriterion("testing_remarks >", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("testing_remarks >=", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksLessThan(String value) {
            addCriterion("testing_remarks <", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksLessThanOrEqualTo(String value) {
            addCriterion("testing_remarks <=", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksLike(String value) {
            addCriterion("testing_remarks like", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotLike(String value) {
            addCriterion("testing_remarks not like", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIn(List<String> values) {
            addCriterion("testing_remarks in", values, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotIn(List<String> values) {
            addCriterion("testing_remarks not in", values, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksBetween(String value1, String value2) {
            addCriterion("testing_remarks between", value1, value2, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotBetween(String value1, String value2) {
            addCriterion("testing_remarks not between", value1, value2, "testingRemarks");
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