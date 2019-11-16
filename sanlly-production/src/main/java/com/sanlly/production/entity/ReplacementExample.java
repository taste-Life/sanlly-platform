package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplacementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ReplacementExample() {
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

        public Criteria andProdReplacementIdIsNull() {
            addCriterion("prod_replacement_id is null");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdIsNotNull() {
            addCriterion("prod_replacement_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdEqualTo(Integer value) {
            addCriterion("prod_replacement_id =", value, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdNotEqualTo(Integer value) {
            addCriterion("prod_replacement_id <>", value, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdGreaterThan(Integer value) {
            addCriterion("prod_replacement_id >", value, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_replacement_id >=", value, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdLessThan(Integer value) {
            addCriterion("prod_replacement_id <", value, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_replacement_id <=", value, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdIn(List<Integer> values) {
            addCriterion("prod_replacement_id in", values, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdNotIn(List<Integer> values) {
            addCriterion("prod_replacement_id not in", values, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_replacement_id between", value1, value2, "prodReplacementId");
            return (Criteria) this;
        }

        public Criteria andProdReplacementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_replacement_id not between", value1, value2, "prodReplacementId");
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

        public Criteria andSparesIsNull() {
            addCriterion("spares is null");
            return (Criteria) this;
        }

        public Criteria andSparesIsNotNull() {
            addCriterion("spares is not null");
            return (Criteria) this;
        }

        public Criteria andSparesEqualTo(String value) {
            addCriterion("spares =", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotEqualTo(String value) {
            addCriterion("spares <>", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesGreaterThan(String value) {
            addCriterion("spares >", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesGreaterThanOrEqualTo(String value) {
            addCriterion("spares >=", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesLessThan(String value) {
            addCriterion("spares <", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesLessThanOrEqualTo(String value) {
            addCriterion("spares <=", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesLike(String value) {
            addCriterion("spares like", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotLike(String value) {
            addCriterion("spares not like", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesIn(List<String> values) {
            addCriterion("spares in", values, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotIn(List<String> values) {
            addCriterion("spares not in", values, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesBetween(String value1, String value2) {
            addCriterion("spares between", value1, value2, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotBetween(String value1, String value2) {
            addCriterion("spares not between", value1, value2, "spares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesIsNull() {
            addCriterion("replace_spares is null");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesIsNotNull() {
            addCriterion("replace_spares is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesEqualTo(String value) {
            addCriterion("replace_spares =", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesNotEqualTo(String value) {
            addCriterion("replace_spares <>", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesGreaterThan(String value) {
            addCriterion("replace_spares >", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesGreaterThanOrEqualTo(String value) {
            addCriterion("replace_spares >=", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesLessThan(String value) {
            addCriterion("replace_spares <", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesLessThanOrEqualTo(String value) {
            addCriterion("replace_spares <=", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesLike(String value) {
            addCriterion("replace_spares like", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesNotLike(String value) {
            addCriterion("replace_spares not like", value, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesIn(List<String> values) {
            addCriterion("replace_spares in", values, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesNotIn(List<String> values) {
            addCriterion("replace_spares not in", values, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesBetween(String value1, String value2) {
            addCriterion("replace_spares between", value1, value2, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplaceSparesNotBetween(String value1, String value2) {
            addCriterion("replace_spares not between", value1, value2, "replaceSpares");
            return (Criteria) this;
        }

        public Criteria andReplacementUserIsNull() {
            addCriterion("replacement_user is null");
            return (Criteria) this;
        }

        public Criteria andReplacementUserIsNotNull() {
            addCriterion("replacement_user is not null");
            return (Criteria) this;
        }

        public Criteria andReplacementUserEqualTo(Integer value) {
            addCriterion("replacement_user =", value, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserNotEqualTo(Integer value) {
            addCriterion("replacement_user <>", value, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserGreaterThan(Integer value) {
            addCriterion("replacement_user >", value, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("replacement_user >=", value, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserLessThan(Integer value) {
            addCriterion("replacement_user <", value, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserLessThanOrEqualTo(Integer value) {
            addCriterion("replacement_user <=", value, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserIn(List<Integer> values) {
            addCriterion("replacement_user in", values, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserNotIn(List<Integer> values) {
            addCriterion("replacement_user not in", values, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserBetween(Integer value1, Integer value2) {
            addCriterion("replacement_user between", value1, value2, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementUserNotBetween(Integer value1, Integer value2) {
            addCriterion("replacement_user not between", value1, value2, "replacementUser");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeIsNull() {
            addCriterion("replacement_time is null");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeIsNotNull() {
            addCriterion("replacement_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeEqualTo(Date value) {
            addCriterion("replacement_time =", value, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeNotEqualTo(Date value) {
            addCriterion("replacement_time <>", value, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeGreaterThan(Date value) {
            addCriterion("replacement_time >", value, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("replacement_time >=", value, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeLessThan(Date value) {
            addCriterion("replacement_time <", value, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeLessThanOrEqualTo(Date value) {
            addCriterion("replacement_time <=", value, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeIn(List<Date> values) {
            addCriterion("replacement_time in", values, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeNotIn(List<Date> values) {
            addCriterion("replacement_time not in", values, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeBetween(Date value1, Date value2) {
            addCriterion("replacement_time between", value1, value2, "replacementTime");
            return (Criteria) this;
        }

        public Criteria andReplacementTimeNotBetween(Date value1, Date value2) {
            addCriterion("replacement_time not between", value1, value2, "replacementTime");
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