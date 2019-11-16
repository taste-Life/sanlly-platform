package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationVersionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public EvaluationVersionsExample() {
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

        public Criteria andProdEvaluationVersionsIdIsNull() {
            addCriterion("prod_evaluation_versions_id is null");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdIsNotNull() {
            addCriterion("prod_evaluation_versions_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdEqualTo(Integer value) {
            addCriterion("prod_evaluation_versions_id =", value, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdNotEqualTo(Integer value) {
            addCriterion("prod_evaluation_versions_id <>", value, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdGreaterThan(Integer value) {
            addCriterion("prod_evaluation_versions_id >", value, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_evaluation_versions_id >=", value, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdLessThan(Integer value) {
            addCriterion("prod_evaluation_versions_id <", value, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_evaluation_versions_id <=", value, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdIn(List<Integer> values) {
            addCriterion("prod_evaluation_versions_id in", values, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdNotIn(List<Integer> values) {
            addCriterion("prod_evaluation_versions_id not in", values, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_evaluation_versions_id between", value1, value2, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andProdEvaluationVersionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_evaluation_versions_id not between", value1, value2, "prodEvaluationVersionsId");
            return (Criteria) this;
        }

        public Criteria andEntryIsNull() {
            addCriterion("entry is null");
            return (Criteria) this;
        }

        public Criteria andEntryIsNotNull() {
            addCriterion("entry is not null");
            return (Criteria) this;
        }

        public Criteria andEntryEqualTo(String value) {
            addCriterion("entry =", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotEqualTo(String value) {
            addCriterion("entry <>", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThan(String value) {
            addCriterion("entry >", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThanOrEqualTo(String value) {
            addCriterion("entry >=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThan(String value) {
            addCriterion("entry <", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThanOrEqualTo(String value) {
            addCriterion("entry <=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLike(String value) {
            addCriterion("entry like", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotLike(String value) {
            addCriterion("entry not like", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryIn(List<String> values) {
            addCriterion("entry in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotIn(List<String> values) {
            addCriterion("entry not in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryBetween(String value1, String value2) {
            addCriterion("entry between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotBetween(String value1, String value2) {
            addCriterion("entry not between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateIsNull() {
            addCriterion("before_update is null");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateIsNotNull() {
            addCriterion("before_update is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateEqualTo(String value) {
            addCriterion("before_update =", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateNotEqualTo(String value) {
            addCriterion("before_update <>", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateGreaterThan(String value) {
            addCriterion("before_update >", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("before_update >=", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateLessThan(String value) {
            addCriterion("before_update <", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateLessThanOrEqualTo(String value) {
            addCriterion("before_update <=", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateLike(String value) {
            addCriterion("before_update like", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateNotLike(String value) {
            addCriterion("before_update not like", value, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateIn(List<String> values) {
            addCriterion("before_update in", values, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateNotIn(List<String> values) {
            addCriterion("before_update not in", values, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateBetween(String value1, String value2) {
            addCriterion("before_update between", value1, value2, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andBeforeUpdateNotBetween(String value1, String value2) {
            addCriterion("before_update not between", value1, value2, "beforeUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateIsNull() {
            addCriterion("after_update is null");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateIsNotNull() {
            addCriterion("after_update is not null");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateEqualTo(String value) {
            addCriterion("after_update =", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateNotEqualTo(String value) {
            addCriterion("after_update <>", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateGreaterThan(String value) {
            addCriterion("after_update >", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("after_update >=", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateLessThan(String value) {
            addCriterion("after_update <", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateLessThanOrEqualTo(String value) {
            addCriterion("after_update <=", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateLike(String value) {
            addCriterion("after_update like", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateNotLike(String value) {
            addCriterion("after_update not like", value, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateIn(List<String> values) {
            addCriterion("after_update in", values, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateNotIn(List<String> values) {
            addCriterion("after_update not in", values, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateBetween(String value1, String value2) {
            addCriterion("after_update between", value1, value2, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andAfterUpdateNotBetween(String value1, String value2) {
            addCriterion("after_update not between", value1, value2, "afterUpdate");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIsNull() {
            addCriterion("prod_course_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIsNotNull() {
            addCriterion("prod_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdEqualTo(String value) {
            addCriterion("prod_course_id =", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotEqualTo(String value) {
            addCriterion("prod_course_id <>", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThan(String value) {
            addCriterion("prod_course_id >", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_course_id >=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThan(String value) {
            addCriterion("prod_course_id <", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThanOrEqualTo(String value) {
            addCriterion("prod_course_id <=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLike(String value) {
            addCriterion("prod_course_id like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotLike(String value) {
            addCriterion("prod_course_id not like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIn(List<String> values) {
            addCriterion("prod_course_id in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotIn(List<String> values) {
            addCriterion("prod_course_id not in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdBetween(String value1, String value2) {
            addCriterion("prod_course_id between", value1, value2, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotBetween(String value1, String value2) {
            addCriterion("prod_course_id not between", value1, value2, "prodCourseId");
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

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Integer value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Integer value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Integer value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Integer value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Integer value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Integer> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Integer> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Integer value1, Integer value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
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