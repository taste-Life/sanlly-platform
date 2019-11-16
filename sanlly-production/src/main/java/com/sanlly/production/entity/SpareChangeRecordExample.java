package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpareChangeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public SpareChangeRecordExample() {
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

        public Criteria andProdCourseEntryIdIsNull() {
            addCriterion("prod_course_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdIsNotNull() {
            addCriterion("prod_course_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdEqualTo(String value) {
            addCriterion("prod_course_entry_id =", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdNotEqualTo(String value) {
            addCriterion("prod_course_entry_id <>", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdGreaterThan(String value) {
            addCriterion("prod_course_entry_id >", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_course_entry_id >=", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdLessThan(String value) {
            addCriterion("prod_course_entry_id <", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdLessThanOrEqualTo(String value) {
            addCriterion("prod_course_entry_id <=", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdLike(String value) {
            addCriterion("prod_course_entry_id like", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdNotLike(String value) {
            addCriterion("prod_course_entry_id not like", value, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdIn(List<String> values) {
            addCriterion("prod_course_entry_id in", values, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdNotIn(List<String> values) {
            addCriterion("prod_course_entry_id not in", values, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdBetween(String value1, String value2) {
            addCriterion("prod_course_entry_id between", value1, value2, "prodCourseEntryId");
            return (Criteria) this;
        }

        public Criteria andProdCourseEntryIdNotBetween(String value1, String value2) {
            addCriterion("prod_course_entry_id not between", value1, value2, "prodCourseEntryId");
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

        public Criteria andProductNodeIsNull() {
            addCriterion("product_node is null");
            return (Criteria) this;
        }

        public Criteria andProductNodeIsNotNull() {
            addCriterion("product_node is not null");
            return (Criteria) this;
        }

        public Criteria andProductNodeEqualTo(String value) {
            addCriterion("product_node =", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeNotEqualTo(String value) {
            addCriterion("product_node <>", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeGreaterThan(String value) {
            addCriterion("product_node >", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_node >=", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeLessThan(String value) {
            addCriterion("product_node <", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeLessThanOrEqualTo(String value) {
            addCriterion("product_node <=", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeLike(String value) {
            addCriterion("product_node like", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeNotLike(String value) {
            addCriterion("product_node not like", value, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeIn(List<String> values) {
            addCriterion("product_node in", values, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeNotIn(List<String> values) {
            addCriterion("product_node not in", values, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeBetween(String value1, String value2) {
            addCriterion("product_node between", value1, value2, "productNode");
            return (Criteria) this;
        }

        public Criteria andProductNodeNotBetween(String value1, String value2) {
            addCriterion("product_node not between", value1, value2, "productNode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIsNull() {
            addCriterion("parts_details_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIsNotNull() {
            addCriterion("parts_details_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeEqualTo(String value) {
            addCriterion("parts_details_code =", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotEqualTo(String value) {
            addCriterion("parts_details_code <>", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeGreaterThan(String value) {
            addCriterion("parts_details_code >", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_details_code >=", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLessThan(String value) {
            addCriterion("parts_details_code <", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_details_code <=", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLike(String value) {
            addCriterion("parts_details_code like", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotLike(String value) {
            addCriterion("parts_details_code not like", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIn(List<String> values) {
            addCriterion("parts_details_code in", values, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotIn(List<String> values) {
            addCriterion("parts_details_code not in", values, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeBetween(String value1, String value2) {
            addCriterion("parts_details_code between", value1, value2, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotBetween(String value1, String value2) {
            addCriterion("parts_details_code not between", value1, value2, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeIsNull() {
            addCriterion("damage_code is null");
            return (Criteria) this;
        }

        public Criteria andDamageCodeIsNotNull() {
            addCriterion("damage_code is not null");
            return (Criteria) this;
        }

        public Criteria andDamageCodeEqualTo(String value) {
            addCriterion("damage_code =", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotEqualTo(String value) {
            addCriterion("damage_code <>", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeGreaterThan(String value) {
            addCriterion("damage_code >", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("damage_code >=", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeLessThan(String value) {
            addCriterion("damage_code <", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeLessThanOrEqualTo(String value) {
            addCriterion("damage_code <=", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeLike(String value) {
            addCriterion("damage_code like", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotLike(String value) {
            addCriterion("damage_code not like", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeIn(List<String> values) {
            addCriterion("damage_code in", values, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotIn(List<String> values) {
            addCriterion("damage_code not in", values, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeBetween(String value1, String value2) {
            addCriterion("damage_code between", value1, value2, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotBetween(String value1, String value2) {
            addCriterion("damage_code not between", value1, value2, "damageCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIsNull() {
            addCriterion("repair_code is null");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIsNotNull() {
            addCriterion("repair_code is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCodeEqualTo(String value) {
            addCriterion("repair_code =", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotEqualTo(String value) {
            addCriterion("repair_code <>", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeGreaterThan(String value) {
            addCriterion("repair_code >", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_code >=", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLessThan(String value) {
            addCriterion("repair_code <", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLessThanOrEqualTo(String value) {
            addCriterion("repair_code <=", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLike(String value) {
            addCriterion("repair_code like", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotLike(String value) {
            addCriterion("repair_code not like", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIn(List<String> values) {
            addCriterion("repair_code in", values, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotIn(List<String> values) {
            addCriterion("repair_code not in", values, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeBetween(String value1, String value2) {
            addCriterion("repair_code between", value1, value2, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotBetween(String value1, String value2) {
            addCriterion("repair_code not between", value1, value2, "repairCode");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberIsNull() {
            addCriterion("test_spares_number is null");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberIsNotNull() {
            addCriterion("test_spares_number is not null");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberEqualTo(String value) {
            addCriterion("test_spares_number =", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberNotEqualTo(String value) {
            addCriterion("test_spares_number <>", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberGreaterThan(String value) {
            addCriterion("test_spares_number >", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("test_spares_number >=", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberLessThan(String value) {
            addCriterion("test_spares_number <", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberLessThanOrEqualTo(String value) {
            addCriterion("test_spares_number <=", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberLike(String value) {
            addCriterion("test_spares_number like", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberNotLike(String value) {
            addCriterion("test_spares_number not like", value, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberIn(List<String> values) {
            addCriterion("test_spares_number in", values, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberNotIn(List<String> values) {
            addCriterion("test_spares_number not in", values, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberBetween(String value1, String value2) {
            addCriterion("test_spares_number between", value1, value2, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestSparesNumberNotBetween(String value1, String value2) {
            addCriterion("test_spares_number not between", value1, value2, "testSparesNumber");
            return (Criteria) this;
        }

        public Criteria andTestCompanyIsNull() {
            addCriterion("test_company is null");
            return (Criteria) this;
        }

        public Criteria andTestCompanyIsNotNull() {
            addCriterion("test_company is not null");
            return (Criteria) this;
        }

        public Criteria andTestCompanyEqualTo(String value) {
            addCriterion("test_company =", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyNotEqualTo(String value) {
            addCriterion("test_company <>", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyGreaterThan(String value) {
            addCriterion("test_company >", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("test_company >=", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyLessThan(String value) {
            addCriterion("test_company <", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyLessThanOrEqualTo(String value) {
            addCriterion("test_company <=", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyLike(String value) {
            addCriterion("test_company like", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyNotLike(String value) {
            addCriterion("test_company not like", value, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyIn(List<String> values) {
            addCriterion("test_company in", values, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyNotIn(List<String> values) {
            addCriterion("test_company not in", values, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyBetween(String value1, String value2) {
            addCriterion("test_company between", value1, value2, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestCompanyNotBetween(String value1, String value2) {
            addCriterion("test_company not between", value1, value2, "testCompany");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseIsNull() {
            addCriterion("test_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseIsNotNull() {
            addCriterion("test_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseEqualTo(String value) {
            addCriterion("test_warehouse =", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseNotEqualTo(String value) {
            addCriterion("test_warehouse <>", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseGreaterThan(String value) {
            addCriterion("test_warehouse >", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("test_warehouse >=", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseLessThan(String value) {
            addCriterion("test_warehouse <", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseLessThanOrEqualTo(String value) {
            addCriterion("test_warehouse <=", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseLike(String value) {
            addCriterion("test_warehouse like", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseNotLike(String value) {
            addCriterion("test_warehouse not like", value, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseIn(List<String> values) {
            addCriterion("test_warehouse in", values, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseNotIn(List<String> values) {
            addCriterion("test_warehouse not in", values, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseBetween(String value1, String value2) {
            addCriterion("test_warehouse between", value1, value2, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseNotBetween(String value1, String value2) {
            addCriterion("test_warehouse not between", value1, value2, "testWarehouse");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeIsNull() {
            addCriterion("test_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeIsNotNull() {
            addCriterion("test_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeEqualTo(String value) {
            addCriterion("test_warehouse_type =", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeNotEqualTo(String value) {
            addCriterion("test_warehouse_type <>", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeGreaterThan(String value) {
            addCriterion("test_warehouse_type >", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("test_warehouse_type >=", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeLessThan(String value) {
            addCriterion("test_warehouse_type <", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("test_warehouse_type <=", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeLike(String value) {
            addCriterion("test_warehouse_type like", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeNotLike(String value) {
            addCriterion("test_warehouse_type not like", value, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeIn(List<String> values) {
            addCriterion("test_warehouse_type in", values, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeNotIn(List<String> values) {
            addCriterion("test_warehouse_type not in", values, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeBetween(String value1, String value2) {
            addCriterion("test_warehouse_type between", value1, value2, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("test_warehouse_type not between", value1, value2, "testWarehouseType");
            return (Criteria) this;
        }

        public Criteria andTestPriceIsNull() {
            addCriterion("test_price is null");
            return (Criteria) this;
        }

        public Criteria andTestPriceIsNotNull() {
            addCriterion("test_price is not null");
            return (Criteria) this;
        }

        public Criteria andTestPriceEqualTo(BigDecimal value) {
            addCriterion("test_price =", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotEqualTo(BigDecimal value) {
            addCriterion("test_price <>", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceGreaterThan(BigDecimal value) {
            addCriterion("test_price >", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("test_price >=", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceLessThan(BigDecimal value) {
            addCriterion("test_price <", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("test_price <=", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceIn(List<BigDecimal> values) {
            addCriterion("test_price in", values, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotIn(List<BigDecimal> values) {
            addCriterion("test_price not in", values, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("test_price between", value1, value2, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("test_price not between", value1, value2, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserIsNull() {
            addCriterion("test_change_user is null");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserIsNotNull() {
            addCriterion("test_change_user is not null");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserEqualTo(Integer value) {
            addCriterion("test_change_user =", value, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserNotEqualTo(Integer value) {
            addCriterion("test_change_user <>", value, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserGreaterThan(Integer value) {
            addCriterion("test_change_user >", value, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_change_user >=", value, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserLessThan(Integer value) {
            addCriterion("test_change_user <", value, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserLessThanOrEqualTo(Integer value) {
            addCriterion("test_change_user <=", value, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserIn(List<Integer> values) {
            addCriterion("test_change_user in", values, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserNotIn(List<Integer> values) {
            addCriterion("test_change_user not in", values, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserBetween(Integer value1, Integer value2) {
            addCriterion("test_change_user between", value1, value2, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("test_change_user not between", value1, value2, "testChangeUser");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeIsNull() {
            addCriterion("test_change_time is null");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeIsNotNull() {
            addCriterion("test_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeEqualTo(Date value) {
            addCriterion("test_change_time =", value, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeNotEqualTo(Date value) {
            addCriterion("test_change_time <>", value, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeGreaterThan(Date value) {
            addCriterion("test_change_time >", value, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_change_time >=", value, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeLessThan(Date value) {
            addCriterion("test_change_time <", value, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("test_change_time <=", value, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeIn(List<Date> values) {
            addCriterion("test_change_time in", values, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeNotIn(List<Date> values) {
            addCriterion("test_change_time not in", values, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeBetween(Date value1, Date value2) {
            addCriterion("test_change_time between", value1, value2, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andTestChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("test_change_time not between", value1, value2, "testChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberIsNull() {
            addCriterion("eval_spares_number is null");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberIsNotNull() {
            addCriterion("eval_spares_number is not null");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberEqualTo(String value) {
            addCriterion("eval_spares_number =", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberNotEqualTo(String value) {
            addCriterion("eval_spares_number <>", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberGreaterThan(String value) {
            addCriterion("eval_spares_number >", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("eval_spares_number >=", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberLessThan(String value) {
            addCriterion("eval_spares_number <", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberLessThanOrEqualTo(String value) {
            addCriterion("eval_spares_number <=", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberLike(String value) {
            addCriterion("eval_spares_number like", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberNotLike(String value) {
            addCriterion("eval_spares_number not like", value, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberIn(List<String> values) {
            addCriterion("eval_spares_number in", values, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberNotIn(List<String> values) {
            addCriterion("eval_spares_number not in", values, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberBetween(String value1, String value2) {
            addCriterion("eval_spares_number between", value1, value2, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalSparesNumberNotBetween(String value1, String value2) {
            addCriterion("eval_spares_number not between", value1, value2, "evalSparesNumber");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyIsNull() {
            addCriterion("eval_company is null");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyIsNotNull() {
            addCriterion("eval_company is not null");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyEqualTo(String value) {
            addCriterion("eval_company =", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyNotEqualTo(String value) {
            addCriterion("eval_company <>", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyGreaterThan(String value) {
            addCriterion("eval_company >", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("eval_company >=", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyLessThan(String value) {
            addCriterion("eval_company <", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyLessThanOrEqualTo(String value) {
            addCriterion("eval_company <=", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyLike(String value) {
            addCriterion("eval_company like", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyNotLike(String value) {
            addCriterion("eval_company not like", value, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyIn(List<String> values) {
            addCriterion("eval_company in", values, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyNotIn(List<String> values) {
            addCriterion("eval_company not in", values, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyBetween(String value1, String value2) {
            addCriterion("eval_company between", value1, value2, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalCompanyNotBetween(String value1, String value2) {
            addCriterion("eval_company not between", value1, value2, "evalCompany");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseIsNull() {
            addCriterion("eval_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseIsNotNull() {
            addCriterion("eval_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseEqualTo(String value) {
            addCriterion("eval_warehouse =", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseNotEqualTo(String value) {
            addCriterion("eval_warehouse <>", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseGreaterThan(String value) {
            addCriterion("eval_warehouse >", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("eval_warehouse >=", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseLessThan(String value) {
            addCriterion("eval_warehouse <", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseLessThanOrEqualTo(String value) {
            addCriterion("eval_warehouse <=", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseLike(String value) {
            addCriterion("eval_warehouse like", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseNotLike(String value) {
            addCriterion("eval_warehouse not like", value, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseIn(List<String> values) {
            addCriterion("eval_warehouse in", values, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseNotIn(List<String> values) {
            addCriterion("eval_warehouse not in", values, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseBetween(String value1, String value2) {
            addCriterion("eval_warehouse between", value1, value2, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseNotBetween(String value1, String value2) {
            addCriterion("eval_warehouse not between", value1, value2, "evalWarehouse");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeIsNull() {
            addCriterion("eval_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeIsNotNull() {
            addCriterion("eval_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeEqualTo(String value) {
            addCriterion("eval_warehouse_type =", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeNotEqualTo(String value) {
            addCriterion("eval_warehouse_type <>", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeGreaterThan(String value) {
            addCriterion("eval_warehouse_type >", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("eval_warehouse_type >=", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeLessThan(String value) {
            addCriterion("eval_warehouse_type <", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("eval_warehouse_type <=", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeLike(String value) {
            addCriterion("eval_warehouse_type like", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeNotLike(String value) {
            addCriterion("eval_warehouse_type not like", value, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeIn(List<String> values) {
            addCriterion("eval_warehouse_type in", values, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeNotIn(List<String> values) {
            addCriterion("eval_warehouse_type not in", values, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeBetween(String value1, String value2) {
            addCriterion("eval_warehouse_type between", value1, value2, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("eval_warehouse_type not between", value1, value2, "evalWarehouseType");
            return (Criteria) this;
        }

        public Criteria andEvalPriceIsNull() {
            addCriterion("eval_price is null");
            return (Criteria) this;
        }

        public Criteria andEvalPriceIsNotNull() {
            addCriterion("eval_price is not null");
            return (Criteria) this;
        }

        public Criteria andEvalPriceEqualTo(BigDecimal value) {
            addCriterion("eval_price =", value, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceNotEqualTo(BigDecimal value) {
            addCriterion("eval_price <>", value, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceGreaterThan(BigDecimal value) {
            addCriterion("eval_price >", value, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eval_price >=", value, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceLessThan(BigDecimal value) {
            addCriterion("eval_price <", value, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eval_price <=", value, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceIn(List<BigDecimal> values) {
            addCriterion("eval_price in", values, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceNotIn(List<BigDecimal> values) {
            addCriterion("eval_price not in", values, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eval_price between", value1, value2, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eval_price not between", value1, value2, "evalPrice");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserIsNull() {
            addCriterion("eval_change_user is null");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserIsNotNull() {
            addCriterion("eval_change_user is not null");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserEqualTo(Integer value) {
            addCriterion("eval_change_user =", value, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserNotEqualTo(Integer value) {
            addCriterion("eval_change_user <>", value, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserGreaterThan(Integer value) {
            addCriterion("eval_change_user >", value, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_change_user >=", value, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserLessThan(Integer value) {
            addCriterion("eval_change_user <", value, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserLessThanOrEqualTo(Integer value) {
            addCriterion("eval_change_user <=", value, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserIn(List<Integer> values) {
            addCriterion("eval_change_user in", values, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserNotIn(List<Integer> values) {
            addCriterion("eval_change_user not in", values, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserBetween(Integer value1, Integer value2) {
            addCriterion("eval_change_user between", value1, value2, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_change_user not between", value1, value2, "evalChangeUser");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeIsNull() {
            addCriterion("eval_change_time is null");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeIsNotNull() {
            addCriterion("eval_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeEqualTo(Date value) {
            addCriterion("eval_change_time =", value, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeNotEqualTo(Date value) {
            addCriterion("eval_change_time <>", value, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeGreaterThan(Date value) {
            addCriterion("eval_change_time >", value, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eval_change_time >=", value, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeLessThan(Date value) {
            addCriterion("eval_change_time <", value, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("eval_change_time <=", value, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeIn(List<Date> values) {
            addCriterion("eval_change_time in", values, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeNotIn(List<Date> values) {
            addCriterion("eval_change_time not in", values, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeBetween(Date value1, Date value2) {
            addCriterion("eval_change_time between", value1, value2, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("eval_change_time not between", value1, value2, "evalChangeTime");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffIsNull() {
            addCriterion("eval_change_diff is null");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffIsNotNull() {
            addCriterion("eval_change_diff is not null");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffEqualTo(BigDecimal value) {
            addCriterion("eval_change_diff =", value, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffNotEqualTo(BigDecimal value) {
            addCriterion("eval_change_diff <>", value, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffGreaterThan(BigDecimal value) {
            addCriterion("eval_change_diff >", value, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eval_change_diff >=", value, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffLessThan(BigDecimal value) {
            addCriterion("eval_change_diff <", value, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eval_change_diff <=", value, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffIn(List<BigDecimal> values) {
            addCriterion("eval_change_diff in", values, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffNotIn(List<BigDecimal> values) {
            addCriterion("eval_change_diff not in", values, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eval_change_diff between", value1, value2, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangeDiffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eval_change_diff not between", value1, value2, "evalChangeDiff");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentIsNull() {
            addCriterion("eval_change_percent is null");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentIsNotNull() {
            addCriterion("eval_change_percent is not null");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentEqualTo(Double value) {
            addCriterion("eval_change_percent =", value, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentNotEqualTo(Double value) {
            addCriterion("eval_change_percent <>", value, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentGreaterThan(Double value) {
            addCriterion("eval_change_percent >", value, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentGreaterThanOrEqualTo(Double value) {
            addCriterion("eval_change_percent >=", value, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentLessThan(Double value) {
            addCriterion("eval_change_percent <", value, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentLessThanOrEqualTo(Double value) {
            addCriterion("eval_change_percent <=", value, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentIn(List<Double> values) {
            addCriterion("eval_change_percent in", values, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentNotIn(List<Double> values) {
            addCriterion("eval_change_percent not in", values, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentBetween(Double value1, Double value2) {
            addCriterion("eval_change_percent between", value1, value2, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andEvalChangePercentNotBetween(Double value1, Double value2) {
            addCriterion("eval_change_percent not between", value1, value2, "evalChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberIsNull() {
            addCriterion("ware_spares_number is null");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberIsNotNull() {
            addCriterion("ware_spares_number is not null");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberEqualTo(String value) {
            addCriterion("ware_spares_number =", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberNotEqualTo(String value) {
            addCriterion("ware_spares_number <>", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberGreaterThan(String value) {
            addCriterion("ware_spares_number >", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ware_spares_number >=", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberLessThan(String value) {
            addCriterion("ware_spares_number <", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberLessThanOrEqualTo(String value) {
            addCriterion("ware_spares_number <=", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberLike(String value) {
            addCriterion("ware_spares_number like", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberNotLike(String value) {
            addCriterion("ware_spares_number not like", value, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberIn(List<String> values) {
            addCriterion("ware_spares_number in", values, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberNotIn(List<String> values) {
            addCriterion("ware_spares_number not in", values, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberBetween(String value1, String value2) {
            addCriterion("ware_spares_number between", value1, value2, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareSparesNumberNotBetween(String value1, String value2) {
            addCriterion("ware_spares_number not between", value1, value2, "wareSparesNumber");
            return (Criteria) this;
        }

        public Criteria andWareCompanyIsNull() {
            addCriterion("ware_company is null");
            return (Criteria) this;
        }

        public Criteria andWareCompanyIsNotNull() {
            addCriterion("ware_company is not null");
            return (Criteria) this;
        }

        public Criteria andWareCompanyEqualTo(String value) {
            addCriterion("ware_company =", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyNotEqualTo(String value) {
            addCriterion("ware_company <>", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyGreaterThan(String value) {
            addCriterion("ware_company >", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ware_company >=", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyLessThan(String value) {
            addCriterion("ware_company <", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyLessThanOrEqualTo(String value) {
            addCriterion("ware_company <=", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyLike(String value) {
            addCriterion("ware_company like", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyNotLike(String value) {
            addCriterion("ware_company not like", value, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyIn(List<String> values) {
            addCriterion("ware_company in", values, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyNotIn(List<String> values) {
            addCriterion("ware_company not in", values, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyBetween(String value1, String value2) {
            addCriterion("ware_company between", value1, value2, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareCompanyNotBetween(String value1, String value2) {
            addCriterion("ware_company not between", value1, value2, "wareCompany");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseIsNull() {
            addCriterion("ware_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseIsNotNull() {
            addCriterion("ware_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseEqualTo(String value) {
            addCriterion("ware_warehouse =", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseNotEqualTo(String value) {
            addCriterion("ware_warehouse <>", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseGreaterThan(String value) {
            addCriterion("ware_warehouse >", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("ware_warehouse >=", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseLessThan(String value) {
            addCriterion("ware_warehouse <", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseLessThanOrEqualTo(String value) {
            addCriterion("ware_warehouse <=", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseLike(String value) {
            addCriterion("ware_warehouse like", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseNotLike(String value) {
            addCriterion("ware_warehouse not like", value, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseIn(List<String> values) {
            addCriterion("ware_warehouse in", values, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseNotIn(List<String> values) {
            addCriterion("ware_warehouse not in", values, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseBetween(String value1, String value2) {
            addCriterion("ware_warehouse between", value1, value2, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseNotBetween(String value1, String value2) {
            addCriterion("ware_warehouse not between", value1, value2, "wareWarehouse");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeIsNull() {
            addCriterion("ware_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeIsNotNull() {
            addCriterion("ware_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeEqualTo(String value) {
            addCriterion("ware_warehouse_type =", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeNotEqualTo(String value) {
            addCriterion("ware_warehouse_type <>", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeGreaterThan(String value) {
            addCriterion("ware_warehouse_type >", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ware_warehouse_type >=", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeLessThan(String value) {
            addCriterion("ware_warehouse_type <", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("ware_warehouse_type <=", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeLike(String value) {
            addCriterion("ware_warehouse_type like", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeNotLike(String value) {
            addCriterion("ware_warehouse_type not like", value, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeIn(List<String> values) {
            addCriterion("ware_warehouse_type in", values, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeNotIn(List<String> values) {
            addCriterion("ware_warehouse_type not in", values, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeBetween(String value1, String value2) {
            addCriterion("ware_warehouse_type between", value1, value2, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWareWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("ware_warehouse_type not between", value1, value2, "wareWarehouseType");
            return (Criteria) this;
        }

        public Criteria andWarePriceIsNull() {
            addCriterion("ware_price is null");
            return (Criteria) this;
        }

        public Criteria andWarePriceIsNotNull() {
            addCriterion("ware_price is not null");
            return (Criteria) this;
        }

        public Criteria andWarePriceEqualTo(BigDecimal value) {
            addCriterion("ware_price =", value, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceNotEqualTo(BigDecimal value) {
            addCriterion("ware_price <>", value, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceGreaterThan(BigDecimal value) {
            addCriterion("ware_price >", value, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ware_price >=", value, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceLessThan(BigDecimal value) {
            addCriterion("ware_price <", value, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ware_price <=", value, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceIn(List<BigDecimal> values) {
            addCriterion("ware_price in", values, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceNotIn(List<BigDecimal> values) {
            addCriterion("ware_price not in", values, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ware_price between", value1, value2, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWarePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ware_price not between", value1, value2, "warePrice");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserIsNull() {
            addCriterion("ware_change_user is null");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserIsNotNull() {
            addCriterion("ware_change_user is not null");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserEqualTo(Integer value) {
            addCriterion("ware_change_user =", value, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserNotEqualTo(Integer value) {
            addCriterion("ware_change_user <>", value, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserGreaterThan(Integer value) {
            addCriterion("ware_change_user >", value, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_change_user >=", value, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserLessThan(Integer value) {
            addCriterion("ware_change_user <", value, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserLessThanOrEqualTo(Integer value) {
            addCriterion("ware_change_user <=", value, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserIn(List<Integer> values) {
            addCriterion("ware_change_user in", values, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserNotIn(List<Integer> values) {
            addCriterion("ware_change_user not in", values, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserBetween(Integer value1, Integer value2) {
            addCriterion("ware_change_user between", value1, value2, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_change_user not between", value1, value2, "wareChangeUser");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeIsNull() {
            addCriterion("ware_change_time is null");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeIsNotNull() {
            addCriterion("ware_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeEqualTo(Date value) {
            addCriterion("ware_change_time =", value, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeNotEqualTo(Date value) {
            addCriterion("ware_change_time <>", value, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeGreaterThan(Date value) {
            addCriterion("ware_change_time >", value, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ware_change_time >=", value, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeLessThan(Date value) {
            addCriterion("ware_change_time <", value, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("ware_change_time <=", value, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeIn(List<Date> values) {
            addCriterion("ware_change_time in", values, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeNotIn(List<Date> values) {
            addCriterion("ware_change_time not in", values, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeBetween(Date value1, Date value2) {
            addCriterion("ware_change_time between", value1, value2, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("ware_change_time not between", value1, value2, "wareChangeTime");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffIsNull() {
            addCriterion("ware_change_diff is null");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffIsNotNull() {
            addCriterion("ware_change_diff is not null");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffEqualTo(BigDecimal value) {
            addCriterion("ware_change_diff =", value, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffNotEqualTo(BigDecimal value) {
            addCriterion("ware_change_diff <>", value, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffGreaterThan(BigDecimal value) {
            addCriterion("ware_change_diff >", value, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ware_change_diff >=", value, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffLessThan(BigDecimal value) {
            addCriterion("ware_change_diff <", value, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ware_change_diff <=", value, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffIn(List<BigDecimal> values) {
            addCriterion("ware_change_diff in", values, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffNotIn(List<BigDecimal> values) {
            addCriterion("ware_change_diff not in", values, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ware_change_diff between", value1, value2, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangeDiffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ware_change_diff not between", value1, value2, "wareChangeDiff");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentIsNull() {
            addCriterion("ware_change_percent is null");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentIsNotNull() {
            addCriterion("ware_change_percent is not null");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentEqualTo(Double value) {
            addCriterion("ware_change_percent =", value, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentNotEqualTo(Double value) {
            addCriterion("ware_change_percent <>", value, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentGreaterThan(Double value) {
            addCriterion("ware_change_percent >", value, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentGreaterThanOrEqualTo(Double value) {
            addCriterion("ware_change_percent >=", value, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentLessThan(Double value) {
            addCriterion("ware_change_percent <", value, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentLessThanOrEqualTo(Double value) {
            addCriterion("ware_change_percent <=", value, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentIn(List<Double> values) {
            addCriterion("ware_change_percent in", values, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentNotIn(List<Double> values) {
            addCriterion("ware_change_percent not in", values, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentBetween(Double value1, Double value2) {
            addCriterion("ware_change_percent between", value1, value2, "wareChangePercent");
            return (Criteria) this;
        }

        public Criteria andWareChangePercentNotBetween(Double value1, Double value2) {
            addCriterion("ware_change_percent not between", value1, value2, "wareChangePercent");
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