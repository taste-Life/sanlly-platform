package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoolRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PoolRepairExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseIsNull() {
            addCriterion("is_back_lease is null");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseIsNotNull() {
            addCriterion("is_back_lease is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseEqualTo(String value) {
            addCriterion("is_back_lease =", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseNotEqualTo(String value) {
            addCriterion("is_back_lease <>", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseGreaterThan(String value) {
            addCriterion("is_back_lease >", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseGreaterThanOrEqualTo(String value) {
            addCriterion("is_back_lease >=", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseLessThan(String value) {
            addCriterion("is_back_lease <", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseLessThanOrEqualTo(String value) {
            addCriterion("is_back_lease <=", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseLike(String value) {
            addCriterion("is_back_lease like", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseNotLike(String value) {
            addCriterion("is_back_lease not like", value, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseIn(List<String> values) {
            addCriterion("is_back_lease in", values, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseNotIn(List<String> values) {
            addCriterion("is_back_lease not in", values, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseBetween(String value1, String value2) {
            addCriterion("is_back_lease between", value1, value2, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andIsBackLeaseNotBetween(String value1, String value2) {
            addCriterion("is_back_lease not between", value1, value2, "isBackLease");
            return (Criteria) this;
        }

        public Criteria andRepairNumberIsNull() {
            addCriterion("repair_number is null");
            return (Criteria) this;
        }

        public Criteria andRepairNumberIsNotNull() {
            addCriterion("repair_number is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNumberEqualTo(String value) {
            addCriterion("repair_number =", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberNotEqualTo(String value) {
            addCriterion("repair_number <>", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberGreaterThan(String value) {
            addCriterion("repair_number >", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberGreaterThanOrEqualTo(String value) {
            addCriterion("repair_number >=", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberLessThan(String value) {
            addCriterion("repair_number <", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberLessThanOrEqualTo(String value) {
            addCriterion("repair_number <=", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberLike(String value) {
            addCriterion("repair_number like", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberNotLike(String value) {
            addCriterion("repair_number not like", value, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberIn(List<String> values) {
            addCriterion("repair_number in", values, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberNotIn(List<String> values) {
            addCriterion("repair_number not in", values, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberBetween(String value1, String value2) {
            addCriterion("repair_number between", value1, value2, "repairNumber");
            return (Criteria) this;
        }

        public Criteria andRepairNumberNotBetween(String value1, String value2) {
            addCriterion("repair_number not between", value1, value2, "repairNumber");
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

        public Criteria andChargeObjectIsNull() {
            addCriterion("charge_object is null");
            return (Criteria) this;
        }

        public Criteria andChargeObjectIsNotNull() {
            addCriterion("charge_object is not null");
            return (Criteria) this;
        }

        public Criteria andChargeObjectEqualTo(String value) {
            addCriterion("charge_object =", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotEqualTo(String value) {
            addCriterion("charge_object <>", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectGreaterThan(String value) {
            addCriterion("charge_object >", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectGreaterThanOrEqualTo(String value) {
            addCriterion("charge_object >=", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectLessThan(String value) {
            addCriterion("charge_object <", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectLessThanOrEqualTo(String value) {
            addCriterion("charge_object <=", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectLike(String value) {
            addCriterion("charge_object like", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotLike(String value) {
            addCriterion("charge_object not like", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectIn(List<String> values) {
            addCriterion("charge_object in", values, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotIn(List<String> values) {
            addCriterion("charge_object not in", values, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectBetween(String value1, String value2) {
            addCriterion("charge_object between", value1, value2, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotBetween(String value1, String value2) {
            addCriterion("charge_object not between", value1, value2, "chargeObject");
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

        public Criteria andValuationHourNumberIsNull() {
            addCriterion("valuation_hour_number is null");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberIsNotNull() {
            addCriterion("valuation_hour_number is not null");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberEqualTo(BigDecimal value) {
            addCriterion("valuation_hour_number =", value, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberNotEqualTo(BigDecimal value) {
            addCriterion("valuation_hour_number <>", value, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberGreaterThan(BigDecimal value) {
            addCriterion("valuation_hour_number >", value, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_hour_number >=", value, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberLessThan(BigDecimal value) {
            addCriterion("valuation_hour_number <", value, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_hour_number <=", value, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberIn(List<BigDecimal> values) {
            addCriterion("valuation_hour_number in", values, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberNotIn(List<BigDecimal> values) {
            addCriterion("valuation_hour_number not in", values, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_hour_number between", value1, value2, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationHourNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_hour_number not between", value1, value2, "valuationHourNumber");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIsNull() {
            addCriterion("valuation_man_hour_cost is null");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIsNotNull() {
            addCriterion("valuation_man_hour_cost is not null");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost =", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostNotEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost <>", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostGreaterThan(BigDecimal value) {
            addCriterion("valuation_man_hour_cost >", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost >=", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostLessThan(BigDecimal value) {
            addCriterion("valuation_man_hour_cost <", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost <=", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIn(List<BigDecimal> values) {
            addCriterion("valuation_man_hour_cost in", values, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostNotIn(List<BigDecimal> values) {
            addCriterion("valuation_man_hour_cost not in", values, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_man_hour_cost between", value1, value2, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_man_hour_cost not between", value1, value2, "valuationManHourCost");
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

        public Criteria andValuationMoneyUsdIsNull() {
            addCriterion("valuation_money_usd is null");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdIsNotNull() {
            addCriterion("valuation_money_usd is not null");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdEqualTo(BigDecimal value) {
            addCriterion("valuation_money_usd =", value, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdNotEqualTo(BigDecimal value) {
            addCriterion("valuation_money_usd <>", value, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdGreaterThan(BigDecimal value) {
            addCriterion("valuation_money_usd >", value, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_money_usd >=", value, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdLessThan(BigDecimal value) {
            addCriterion("valuation_money_usd <", value, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_money_usd <=", value, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdIn(List<BigDecimal> values) {
            addCriterion("valuation_money_usd in", values, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdNotIn(List<BigDecimal> values) {
            addCriterion("valuation_money_usd not in", values, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_money_usd between", value1, value2, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_money_usd not between", value1, value2, "valuationMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbIsNull() {
            addCriterion("valuation_money_rmb is null");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbIsNotNull() {
            addCriterion("valuation_money_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbEqualTo(BigDecimal value) {
            addCriterion("valuation_money_rmb =", value, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbNotEqualTo(BigDecimal value) {
            addCriterion("valuation_money_rmb <>", value, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbGreaterThan(BigDecimal value) {
            addCriterion("valuation_money_rmb >", value, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_money_rmb >=", value, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbLessThan(BigDecimal value) {
            addCriterion("valuation_money_rmb <", value, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_money_rmb <=", value, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbIn(List<BigDecimal> values) {
            addCriterion("valuation_money_rmb in", values, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbNotIn(List<BigDecimal> values) {
            addCriterion("valuation_money_rmb not in", values, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_money_rmb between", value1, value2, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_money_rmb not between", value1, value2, "valuationMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaIsNull() {
            addCriterion("reply_tax_total_cost_usa is null");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaIsNotNull() {
            addCriterion("reply_tax_total_cost_usa is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_usa =", value, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaNotEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_usa <>", value, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaGreaterThan(BigDecimal value) {
            addCriterion("reply_tax_total_cost_usa >", value, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_usa >=", value, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaLessThan(BigDecimal value) {
            addCriterion("reply_tax_total_cost_usa <", value, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_usa <=", value, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaIn(List<BigDecimal> values) {
            addCriterion("reply_tax_total_cost_usa in", values, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaNotIn(List<BigDecimal> values) {
            addCriterion("reply_tax_total_cost_usa not in", values, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_tax_total_cost_usa between", value1, value2, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_tax_total_cost_usa not between", value1, value2, "replyTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbIsNull() {
            addCriterion("reply_tax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbIsNotNull() {
            addCriterion("reply_tax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_rmb =", value, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_rmb <>", value, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("reply_tax_total_cost_rmb >", value, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_rmb >=", value, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("reply_tax_total_cost_rmb <", value, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_tax_total_cost_rmb <=", value, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("reply_tax_total_cost_rmb in", values, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("reply_tax_total_cost_rmb not in", values, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_tax_total_cost_rmb between", value1, value2, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyTaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_tax_total_cost_rmb not between", value1, value2, "replyTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaIsNull() {
            addCriterion("reply_notax_total_cost_usa is null");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaIsNotNull() {
            addCriterion("reply_notax_total_cost_usa is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_usa =", value, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaNotEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_usa <>", value, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaGreaterThan(BigDecimal value) {
            addCriterion("reply_notax_total_cost_usa >", value, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_usa >=", value, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaLessThan(BigDecimal value) {
            addCriterion("reply_notax_total_cost_usa <", value, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_usa <=", value, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaIn(List<BigDecimal> values) {
            addCriterion("reply_notax_total_cost_usa in", values, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaNotIn(List<BigDecimal> values) {
            addCriterion("reply_notax_total_cost_usa not in", values, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_notax_total_cost_usa between", value1, value2, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_notax_total_cost_usa not between", value1, value2, "replyNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbIsNull() {
            addCriterion("reply_notax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbIsNotNull() {
            addCriterion("reply_notax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_rmb =", value, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_rmb <>", value, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("reply_notax_total_cost_rmb >", value, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_rmb >=", value, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("reply_notax_total_cost_rmb <", value, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reply_notax_total_cost_rmb <=", value, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("reply_notax_total_cost_rmb in", values, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("reply_notax_total_cost_rmb not in", values, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_notax_total_cost_rmb between", value1, value2, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andReplyNotaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reply_notax_total_cost_rmb not between", value1, value2, "replyNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaIsNull() {
            addCriterion("real_tax_total_cost_usa is null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaIsNotNull() {
            addCriterion("real_tax_total_cost_usa is not null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa =", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaNotEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa <>", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaGreaterThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa >", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa >=", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaLessThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa <", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa <=", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_usa in", values, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaNotIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_usa not in", values, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_usa between", value1, value2, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_usa not between", value1, value2, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaIsNull() {
            addCriterion("real_notax_total_cost_usa is null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaIsNotNull() {
            addCriterion("real_notax_total_cost_usa is not null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa =", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaNotEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa <>", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaGreaterThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa >", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa >=", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaLessThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa <", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa <=", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_usa in", values, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaNotIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_usa not in", values, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_usa between", value1, value2, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_usa not between", value1, value2, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbIsNull() {
            addCriterion("real_tax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbIsNotNull() {
            addCriterion("real_tax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb =", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb <>", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb >", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb >=", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb <", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb <=", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_rmb in", values, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_rmb not in", values, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_rmb between", value1, value2, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_rmb not between", value1, value2, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbIsNull() {
            addCriterion("real_notax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbIsNotNull() {
            addCriterion("real_notax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb =", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb <>", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb >", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb >=", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb <", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb <=", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_rmb in", values, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_rmb not in", values, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_rmb between", value1, value2, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_rmb not between", value1, value2, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealRateIsNull() {
            addCriterion("real_rate is null");
            return (Criteria) this;
        }

        public Criteria andRealRateIsNotNull() {
            addCriterion("real_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRealRateEqualTo(BigDecimal value) {
            addCriterion("real_rate =", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotEqualTo(BigDecimal value) {
            addCriterion("real_rate <>", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateGreaterThan(BigDecimal value) {
            addCriterion("real_rate >", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_rate >=", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateLessThan(BigDecimal value) {
            addCriterion("real_rate <", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_rate <=", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateIn(List<BigDecimal> values) {
            addCriterion("real_rate in", values, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotIn(List<BigDecimal> values) {
            addCriterion("real_rate not in", values, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_rate between", value1, value2, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_rate not between", value1, value2, "realRate");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentIsNull() {
            addCriterion("discount_percent is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentIsNotNull() {
            addCriterion("discount_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentEqualTo(BigDecimal value) {
            addCriterion("discount_percent =", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentNotEqualTo(BigDecimal value) {
            addCriterion("discount_percent <>", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentGreaterThan(BigDecimal value) {
            addCriterion("discount_percent >", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_percent >=", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentLessThan(BigDecimal value) {
            addCriterion("discount_percent <", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_percent <=", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentIn(List<BigDecimal> values) {
            addCriterion("discount_percent in", values, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentNotIn(List<BigDecimal> values) {
            addCriterion("discount_percent not in", values, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_percent between", value1, value2, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_percent not between", value1, value2, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpIsNull() {
            addCriterion("discount_percent_tmp is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpIsNotNull() {
            addCriterion("discount_percent_tmp is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpEqualTo(BigDecimal value) {
            addCriterion("discount_percent_tmp =", value, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpNotEqualTo(BigDecimal value) {
            addCriterion("discount_percent_tmp <>", value, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpGreaterThan(BigDecimal value) {
            addCriterion("discount_percent_tmp >", value, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_percent_tmp >=", value, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpLessThan(BigDecimal value) {
            addCriterion("discount_percent_tmp <", value, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_percent_tmp <=", value, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpIn(List<BigDecimal> values) {
            addCriterion("discount_percent_tmp in", values, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpNotIn(List<BigDecimal> values) {
            addCriterion("discount_percent_tmp not in", values, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_percent_tmp between", value1, value2, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentTmpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_percent_tmp not between", value1, value2, "discountPercentTmp");
            return (Criteria) this;
        }

        public Criteria andReductionAmountIsNull() {
            addCriterion("reduction_amount is null");
            return (Criteria) this;
        }

        public Criteria andReductionAmountIsNotNull() {
            addCriterion("reduction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReductionAmountEqualTo(BigDecimal value) {
            addCriterion("reduction_amount =", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountNotEqualTo(BigDecimal value) {
            addCriterion("reduction_amount <>", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountGreaterThan(BigDecimal value) {
            addCriterion("reduction_amount >", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_amount >=", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountLessThan(BigDecimal value) {
            addCriterion("reduction_amount <", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_amount <=", value, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountIn(List<BigDecimal> values) {
            addCriterion("reduction_amount in", values, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountNotIn(List<BigDecimal> values) {
            addCriterion("reduction_amount not in", values, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_amount between", value1, value2, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andReductionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_amount not between", value1, value2, "reductionAmount");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeIsNull() {
            addCriterion("est_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeIsNotNull() {
            addCriterion("est_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeEqualTo(String value) {
            addCriterion("est_currency_type =", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeNotEqualTo(String value) {
            addCriterion("est_currency_type <>", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeGreaterThan(String value) {
            addCriterion("est_currency_type >", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("est_currency_type >=", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeLessThan(String value) {
            addCriterion("est_currency_type <", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("est_currency_type <=", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeLike(String value) {
            addCriterion("est_currency_type like", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeNotLike(String value) {
            addCriterion("est_currency_type not like", value, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeIn(List<String> values) {
            addCriterion("est_currency_type in", values, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeNotIn(List<String> values) {
            addCriterion("est_currency_type not in", values, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeBetween(String value1, String value2) {
            addCriterion("est_currency_type between", value1, value2, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andEstCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("est_currency_type not between", value1, value2, "estCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserIsNull() {
            addCriterion("reply_free_user is null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserIsNotNull() {
            addCriterion("reply_free_user is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserEqualTo(Integer value) {
            addCriterion("reply_free_user =", value, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserNotEqualTo(Integer value) {
            addCriterion("reply_free_user <>", value, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserGreaterThan(Integer value) {
            addCriterion("reply_free_user >", value, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_free_user >=", value, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserLessThan(Integer value) {
            addCriterion("reply_free_user <", value, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserLessThanOrEqualTo(Integer value) {
            addCriterion("reply_free_user <=", value, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserIn(List<Integer> values) {
            addCriterion("reply_free_user in", values, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserNotIn(List<Integer> values) {
            addCriterion("reply_free_user not in", values, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserBetween(Integer value1, Integer value2) {
            addCriterion("reply_free_user between", value1, value2, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_free_user not between", value1, value2, "replyFreeUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeIsNull() {
            addCriterion("reply_free_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeIsNotNull() {
            addCriterion("reply_free_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeEqualTo(Date value) {
            addCriterion("reply_free_time =", value, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeNotEqualTo(Date value) {
            addCriterion("reply_free_time <>", value, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeGreaterThan(Date value) {
            addCriterion("reply_free_time >", value, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_free_time >=", value, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeLessThan(Date value) {
            addCriterion("reply_free_time <", value, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_free_time <=", value, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeIn(List<Date> values) {
            addCriterion("reply_free_time in", values, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeNotIn(List<Date> values) {
            addCriterion("reply_free_time not in", values, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeBetween(Date value1, Date value2) {
            addCriterion("reply_free_time between", value1, value2, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_free_time not between", value1, value2, "replyFreeTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserIsNull() {
            addCriterion("reply_free_ok_user is null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserIsNotNull() {
            addCriterion("reply_free_ok_user is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserEqualTo(Integer value) {
            addCriterion("reply_free_ok_user =", value, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserNotEqualTo(Integer value) {
            addCriterion("reply_free_ok_user <>", value, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserGreaterThan(Integer value) {
            addCriterion("reply_free_ok_user >", value, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_free_ok_user >=", value, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserLessThan(Integer value) {
            addCriterion("reply_free_ok_user <", value, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserLessThanOrEqualTo(Integer value) {
            addCriterion("reply_free_ok_user <=", value, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserIn(List<Integer> values) {
            addCriterion("reply_free_ok_user in", values, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserNotIn(List<Integer> values) {
            addCriterion("reply_free_ok_user not in", values, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserBetween(Integer value1, Integer value2) {
            addCriterion("reply_free_ok_user between", value1, value2, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkUserNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_free_ok_user not between", value1, value2, "replyFreeOkUser");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeIsNull() {
            addCriterion("reply_free_ok_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeIsNotNull() {
            addCriterion("reply_free_ok_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeEqualTo(Date value) {
            addCriterion("reply_free_ok_time =", value, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeNotEqualTo(Date value) {
            addCriterion("reply_free_ok_time <>", value, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeGreaterThan(Date value) {
            addCriterion("reply_free_ok_time >", value, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_free_ok_time >=", value, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeLessThan(Date value) {
            addCriterion("reply_free_ok_time <", value, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_free_ok_time <=", value, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeIn(List<Date> values) {
            addCriterion("reply_free_ok_time in", values, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeNotIn(List<Date> values) {
            addCriterion("reply_free_ok_time not in", values, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeBetween(Date value1, Date value2) {
            addCriterion("reply_free_ok_time between", value1, value2, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andReplyFreeOkTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_free_ok_time not between", value1, value2, "replyFreeOkTime");
            return (Criteria) this;
        }

        public Criteria andDeptKeyIsNull() {
            addCriterion("dept_key is null");
            return (Criteria) this;
        }

        public Criteria andDeptKeyIsNotNull() {
            addCriterion("dept_key is not null");
            return (Criteria) this;
        }

        public Criteria andDeptKeyEqualTo(String value) {
            addCriterion("dept_key =", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotEqualTo(String value) {
            addCriterion("dept_key <>", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyGreaterThan(String value) {
            addCriterion("dept_key >", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyGreaterThanOrEqualTo(String value) {
            addCriterion("dept_key >=", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyLessThan(String value) {
            addCriterion("dept_key <", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyLessThanOrEqualTo(String value) {
            addCriterion("dept_key <=", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyLike(String value) {
            addCriterion("dept_key like", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotLike(String value) {
            addCriterion("dept_key not like", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyIn(List<String> values) {
            addCriterion("dept_key in", values, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotIn(List<String> values) {
            addCriterion("dept_key not in", values, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyBetween(String value1, String value2) {
            addCriterion("dept_key between", value1, value2, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotBetween(String value1, String value2) {
            addCriterion("dept_key not between", value1, value2, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyIsNull() {
            addCriterion("charge_type_key is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyIsNotNull() {
            addCriterion("charge_type_key is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyEqualTo(String value) {
            addCriterion("charge_type_key =", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotEqualTo(String value) {
            addCriterion("charge_type_key <>", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyGreaterThan(String value) {
            addCriterion("charge_type_key >", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type_key >=", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyLessThan(String value) {
            addCriterion("charge_type_key <", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyLessThanOrEqualTo(String value) {
            addCriterion("charge_type_key <=", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyLike(String value) {
            addCriterion("charge_type_key like", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotLike(String value) {
            addCriterion("charge_type_key not like", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyIn(List<String> values) {
            addCriterion("charge_type_key in", values, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotIn(List<String> values) {
            addCriterion("charge_type_key not in", values, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyBetween(String value1, String value2) {
            addCriterion("charge_type_key between", value1, value2, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotBetween(String value1, String value2) {
            addCriterion("charge_type_key not between", value1, value2, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andFreeStatusIsNull() {
            addCriterion("free_status is null");
            return (Criteria) this;
        }

        public Criteria andFreeStatusIsNotNull() {
            addCriterion("free_status is not null");
            return (Criteria) this;
        }

        public Criteria andFreeStatusEqualTo(String value) {
            addCriterion("free_status =", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotEqualTo(String value) {
            addCriterion("free_status <>", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusGreaterThan(String value) {
            addCriterion("free_status >", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("free_status >=", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusLessThan(String value) {
            addCriterion("free_status <", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusLessThanOrEqualTo(String value) {
            addCriterion("free_status <=", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusLike(String value) {
            addCriterion("free_status like", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotLike(String value) {
            addCriterion("free_status not like", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusIn(List<String> values) {
            addCriterion("free_status in", values, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotIn(List<String> values) {
            addCriterion("free_status not in", values, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusBetween(String value1, String value2) {
            addCriterion("free_status between", value1, value2, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotBetween(String value1, String value2) {
            addCriterion("free_status not between", value1, value2, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
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

        public Criteria andNoCostDescIsNull() {
            addCriterion("no_cost_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIsNotNull() {
            addCriterion("no_cost_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescEqualTo(String value) {
            addCriterion("no_cost_desc =", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotEqualTo(String value) {
            addCriterion("no_cost_desc <>", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThan(String value) {
            addCriterion("no_cost_desc >", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThanOrEqualTo(String value) {
            addCriterion("no_cost_desc >=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThan(String value) {
            addCriterion("no_cost_desc <", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThanOrEqualTo(String value) {
            addCriterion("no_cost_desc <=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLike(String value) {
            addCriterion("no_cost_desc like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotLike(String value) {
            addCriterion("no_cost_desc not like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIn(List<String> values) {
            addCriterion("no_cost_desc in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotIn(List<String> values) {
            addCriterion("no_cost_desc not in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescBetween(String value1, String value2) {
            addCriterion("no_cost_desc between", value1, value2, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotBetween(String value1, String value2) {
            addCriterion("no_cost_desc not between", value1, value2, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andPoolTypeIsNull() {
            addCriterion("pool_type is null");
            return (Criteria) this;
        }

        public Criteria andPoolTypeIsNotNull() {
            addCriterion("pool_type is not null");
            return (Criteria) this;
        }

        public Criteria andPoolTypeEqualTo(Integer value) {
            addCriterion("pool_type =", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeNotEqualTo(Integer value) {
            addCriterion("pool_type <>", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeGreaterThan(Integer value) {
            addCriterion("pool_type >", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_type >=", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeLessThan(Integer value) {
            addCriterion("pool_type <", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pool_type <=", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeIn(List<Integer> values) {
            addCriterion("pool_type in", values, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeNotIn(List<Integer> values) {
            addCriterion("pool_type not in", values, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeBetween(Integer value1, Integer value2) {
            addCriterion("pool_type between", value1, value2, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_type not between", value1, value2, "poolType");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(String value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(String value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(String value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(String value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(String value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLike(String value) {
            addCriterion("is_enabled like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotLike(String value) {
            addCriterion("is_enabled not like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<String> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<String> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(String value1, String value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(String value1, String value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
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

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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