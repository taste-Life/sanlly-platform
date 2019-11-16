package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CourseEntryExample() {
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Integer value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Integer value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Integer value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Integer value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Integer> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Integer> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNull() {
            addCriterion("rate_id is null");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNotNull() {
            addCriterion("rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRateIdEqualTo(String value) {
            addCriterion("rate_id =", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotEqualTo(String value) {
            addCriterion("rate_id <>", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThan(String value) {
            addCriterion("rate_id >", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("rate_id >=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThan(String value) {
            addCriterion("rate_id <", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThanOrEqualTo(String value) {
            addCriterion("rate_id <=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLike(String value) {
            addCriterion("rate_id like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotLike(String value) {
            addCriterion("rate_id not like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdIn(List<String> values) {
            addCriterion("rate_id in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotIn(List<String> values) {
            addCriterion("rate_id not in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdBetween(String value1, String value2) {
            addCriterion("rate_id between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotBetween(String value1, String value2) {
            addCriterion("rate_id not between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andFiveCodeIsNull() {
            addCriterion("five_code is null");
            return (Criteria) this;
        }

        public Criteria andFiveCodeIsNotNull() {
            addCriterion("five_code is not null");
            return (Criteria) this;
        }

        public Criteria andFiveCodeEqualTo(String value) {
            addCriterion("five_code =", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeNotEqualTo(String value) {
            addCriterion("five_code <>", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeGreaterThan(String value) {
            addCriterion("five_code >", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("five_code >=", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeLessThan(String value) {
            addCriterion("five_code <", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeLessThanOrEqualTo(String value) {
            addCriterion("five_code <=", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeLike(String value) {
            addCriterion("five_code like", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeNotLike(String value) {
            addCriterion("five_code not like", value, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeIn(List<String> values) {
            addCriterion("five_code in", values, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeNotIn(List<String> values) {
            addCriterion("five_code not in", values, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeBetween(String value1, String value2) {
            addCriterion("five_code between", value1, value2, "fiveCode");
            return (Criteria) this;
        }

        public Criteria andFiveCodeNotBetween(String value1, String value2) {
            addCriterion("five_code not between", value1, value2, "fiveCode");
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

        public Criteria andPositionCodeIsNull() {
            addCriterion("position_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNotNull() {
            addCriterion("position_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeEqualTo(String value) {
            addCriterion("position_code =", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotEqualTo(String value) {
            addCriterion("position_code <>", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThan(String value) {
            addCriterion("position_code >", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_code >=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThan(String value) {
            addCriterion("position_code <", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThanOrEqualTo(String value) {
            addCriterion("position_code <=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLike(String value) {
            addCriterion("position_code like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotLike(String value) {
            addCriterion("position_code not like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIn(List<String> values) {
            addCriterion("position_code in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotIn(List<String> values) {
            addCriterion("position_code not in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeBetween(String value1, String value2) {
            addCriterion("position_code between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotBetween(String value1, String value2) {
            addCriterion("position_code not between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIsNull() {
            addCriterion("parts_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIsNotNull() {
            addCriterion("parts_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeEqualTo(String value) {
            addCriterion("parts_type_code =", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotEqualTo(String value) {
            addCriterion("parts_type_code <>", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeGreaterThan(String value) {
            addCriterion("parts_type_code >", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_type_code >=", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLessThan(String value) {
            addCriterion("parts_type_code <", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_type_code <=", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLike(String value) {
            addCriterion("parts_type_code like", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotLike(String value) {
            addCriterion("parts_type_code not like", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIn(List<String> values) {
            addCriterion("parts_type_code in", values, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotIn(List<String> values) {
            addCriterion("parts_type_code not in", values, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeBetween(String value1, String value2) {
            addCriterion("parts_type_code between", value1, value2, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotBetween(String value1, String value2) {
            addCriterion("parts_type_code not between", value1, value2, "partsTypeCode");
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

        public Criteria andPartsRepairCodeIsNull() {
            addCriterion("parts_repair_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeIsNotNull() {
            addCriterion("parts_repair_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeEqualTo(String value) {
            addCriterion("parts_repair_code =", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotEqualTo(String value) {
            addCriterion("parts_repair_code <>", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeGreaterThan(String value) {
            addCriterion("parts_repair_code >", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_repair_code >=", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeLessThan(String value) {
            addCriterion("parts_repair_code <", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_repair_code <=", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeLike(String value) {
            addCriterion("parts_repair_code like", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotLike(String value) {
            addCriterion("parts_repair_code not like", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeIn(List<String> values) {
            addCriterion("parts_repair_code in", values, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotIn(List<String> values) {
            addCriterion("parts_repair_code not in", values, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeBetween(String value1, String value2) {
            addCriterion("parts_repair_code between", value1, value2, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotBetween(String value1, String value2) {
            addCriterion("parts_repair_code not between", value1, value2, "partsRepairCode");
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

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIsNull() {
            addCriterion("spares_number is null");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIsNotNull() {
            addCriterion("spares_number is not null");
            return (Criteria) this;
        }

        public Criteria andSparesNumberEqualTo(String value) {
            addCriterion("spares_number =", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotEqualTo(String value) {
            addCriterion("spares_number <>", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberGreaterThan(String value) {
            addCriterion("spares_number >", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("spares_number >=", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLessThan(String value) {
            addCriterion("spares_number <", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLessThanOrEqualTo(String value) {
            addCriterion("spares_number <=", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLike(String value) {
            addCriterion("spares_number like", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotLike(String value) {
            addCriterion("spares_number not like", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIn(List<String> values) {
            addCriterion("spares_number in", values, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotIn(List<String> values) {
            addCriterion("spares_number not in", values, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberBetween(String value1, String value2) {
            addCriterion("spares_number between", value1, value2, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotBetween(String value1, String value2) {
            addCriterion("spares_number not between", value1, value2, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNull() {
            addCriterion("warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNotNull() {
            addCriterion("warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeEqualTo(String value) {
            addCriterion("warehouse_type =", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotEqualTo(String value) {
            addCriterion("warehouse_type <>", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThan(String value) {
            addCriterion("warehouse_type >", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_type >=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThan(String value) {
            addCriterion("warehouse_type <", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_type <=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLike(String value) {
            addCriterion("warehouse_type like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotLike(String value) {
            addCriterion("warehouse_type not like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIn(List<String> values) {
            addCriterion("warehouse_type in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotIn(List<String> values) {
            addCriterion("warehouse_type not in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeBetween(String value1, String value2) {
            addCriterion("warehouse_type between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("warehouse_type not between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIsNull() {
            addCriterion("is_original is null");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIsNotNull() {
            addCriterion("is_original is not null");
            return (Criteria) this;
        }

        public Criteria andIsOriginalEqualTo(String value) {
            addCriterion("is_original =", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotEqualTo(String value) {
            addCriterion("is_original <>", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalGreaterThan(String value) {
            addCriterion("is_original >", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("is_original >=", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLessThan(String value) {
            addCriterion("is_original <", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLessThanOrEqualTo(String value) {
            addCriterion("is_original <=", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLike(String value) {
            addCriterion("is_original like", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotLike(String value) {
            addCriterion("is_original not like", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIn(List<String> values) {
            addCriterion("is_original in", values, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotIn(List<String> values) {
            addCriterion("is_original not in", values, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalBetween(String value1, String value2) {
            addCriterion("is_original between", value1, value2, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotBetween(String value1, String value2) {
            addCriterion("is_original not between", value1, value2, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("`length` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`length` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("`length` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("`length` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("`length` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("`length` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("`length` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("`length` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("`length` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("`length` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("`length` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("`length` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Double value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Double value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Double value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Double value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Double value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Double> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Double> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Double value1, Double value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Double value1, Double value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andManHourCostIsNull() {
            addCriterion("man_hour_cost is null");
            return (Criteria) this;
        }

        public Criteria andManHourCostIsNotNull() {
            addCriterion("man_hour_cost is not null");
            return (Criteria) this;
        }

        public Criteria andManHourCostEqualTo(BigDecimal value) {
            addCriterion("man_hour_cost =", value, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostNotEqualTo(BigDecimal value) {
            addCriterion("man_hour_cost <>", value, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostGreaterThan(BigDecimal value) {
            addCriterion("man_hour_cost >", value, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("man_hour_cost >=", value, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostLessThan(BigDecimal value) {
            addCriterion("man_hour_cost <", value, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("man_hour_cost <=", value, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostIn(List<BigDecimal> values) {
            addCriterion("man_hour_cost in", values, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostNotIn(List<BigDecimal> values) {
            addCriterion("man_hour_cost not in", values, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("man_hour_cost between", value1, value2, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andManHourCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("man_hour_cost not between", value1, value2, "manHourCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNull() {
            addCriterion("material_cost is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNotNull() {
            addCriterion("material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostEqualTo(BigDecimal value) {
            addCriterion("material_cost =", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("material_cost <>", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("material_cost >", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cost >=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThan(BigDecimal value) {
            addCriterion("material_cost <", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cost <=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIn(List<BigDecimal> values) {
            addCriterion("material_cost in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("material_cost not in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cost between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cost not between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyIsNull() {
            addCriterion("thirdparty_money is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyIsNotNull() {
            addCriterion("thirdparty_money is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyEqualTo(BigDecimal value) {
            addCriterion("thirdparty_money =", value, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("thirdparty_money <>", value, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyGreaterThan(BigDecimal value) {
            addCriterion("thirdparty_money >", value, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("thirdparty_money >=", value, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyLessThan(BigDecimal value) {
            addCriterion("thirdparty_money <", value, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("thirdparty_money <=", value, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyIn(List<BigDecimal> values) {
            addCriterion("thirdparty_money in", values, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("thirdparty_money not in", values, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thirdparty_money between", value1, value2, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andThirdpartyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thirdparty_money not between", value1, value2, "thirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andIsChargeIsNull() {
            addCriterion("is_charge is null");
            return (Criteria) this;
        }

        public Criteria andIsChargeIsNotNull() {
            addCriterion("is_charge is not null");
            return (Criteria) this;
        }

        public Criteria andIsChargeEqualTo(String value) {
            addCriterion("is_charge =", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotEqualTo(String value) {
            addCriterion("is_charge <>", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeGreaterThan(String value) {
            addCriterion("is_charge >", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeGreaterThanOrEqualTo(String value) {
            addCriterion("is_charge >=", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLessThan(String value) {
            addCriterion("is_charge <", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLessThanOrEqualTo(String value) {
            addCriterion("is_charge <=", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLike(String value) {
            addCriterion("is_charge like", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotLike(String value) {
            addCriterion("is_charge not like", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeIn(List<String> values) {
            addCriterion("is_charge in", values, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotIn(List<String> values) {
            addCriterion("is_charge not in", values, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeBetween(String value1, String value2) {
            addCriterion("is_charge between", value1, value2, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotBetween(String value1, String value2) {
            addCriterion("is_charge not between", value1, value2, "isCharge");
            return (Criteria) this;
        }

        public Criteria andSumMoneyIsNull() {
            addCriterion("sum_money is null");
            return (Criteria) this;
        }

        public Criteria andSumMoneyIsNotNull() {
            addCriterion("sum_money is not null");
            return (Criteria) this;
        }

        public Criteria andSumMoneyEqualTo(BigDecimal value) {
            addCriterion("sum_money =", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyNotEqualTo(BigDecimal value) {
            addCriterion("sum_money <>", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyGreaterThan(BigDecimal value) {
            addCriterion("sum_money >", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_money >=", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyLessThan(BigDecimal value) {
            addCriterion("sum_money <", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_money <=", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyIn(List<BigDecimal> values) {
            addCriterion("sum_money in", values, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyNotIn(List<BigDecimal> values) {
            addCriterion("sum_money not in", values, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_money between", value1, value2, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_money not between", value1, value2, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andPayingPartyIsNull() {
            addCriterion("paying_party is null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyIsNotNull() {
            addCriterion("paying_party is not null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyEqualTo(String value) {
            addCriterion("paying_party =", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotEqualTo(String value) {
            addCriterion("paying_party <>", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyGreaterThan(String value) {
            addCriterion("paying_party >", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyGreaterThanOrEqualTo(String value) {
            addCriterion("paying_party >=", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyLessThan(String value) {
            addCriterion("paying_party <", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyLessThanOrEqualTo(String value) {
            addCriterion("paying_party <=", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyLike(String value) {
            addCriterion("paying_party like", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotLike(String value) {
            addCriterion("paying_party not like", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyIn(List<String> values) {
            addCriterion("paying_party in", values, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotIn(List<String> values) {
            addCriterion("paying_party not in", values, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyBetween(String value1, String value2) {
            addCriterion("paying_party between", value1, value2, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotBetween(String value1, String value2) {
            addCriterion("paying_party not between", value1, value2, "payingParty");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIsNull() {
            addCriterion("is_must_photo is null");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIsNotNull() {
            addCriterion("is_must_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoEqualTo(String value) {
            addCriterion("is_must_photo =", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotEqualTo(String value) {
            addCriterion("is_must_photo <>", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoGreaterThan(String value) {
            addCriterion("is_must_photo >", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("is_must_photo >=", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLessThan(String value) {
            addCriterion("is_must_photo <", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLessThanOrEqualTo(String value) {
            addCriterion("is_must_photo <=", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLike(String value) {
            addCriterion("is_must_photo like", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotLike(String value) {
            addCriterion("is_must_photo not like", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIn(List<String> values) {
            addCriterion("is_must_photo in", values, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotIn(List<String> values) {
            addCriterion("is_must_photo not in", values, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoBetween(String value1, String value2) {
            addCriterion("is_must_photo between", value1, value2, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotBetween(String value1, String value2) {
            addCriterion("is_must_photo not between", value1, value2, "isMustPhoto");
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