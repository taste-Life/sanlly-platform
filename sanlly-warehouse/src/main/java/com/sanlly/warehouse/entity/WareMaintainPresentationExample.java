package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareMaintainPresentationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareMaintainPresentationExample() {
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

        public Criteria andWareMaintainPresentationIdIsNull() {
            addCriterion("ware_maintain_presentation_id is null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdIsNotNull() {
            addCriterion("ware_maintain_presentation_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_id =", value, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdNotEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_id <>", value, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdGreaterThan(Integer value) {
            addCriterion("ware_maintain_presentation_id >", value, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_id >=", value, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdLessThan(Integer value) {
            addCriterion("ware_maintain_presentation_id <", value, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_id <=", value, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdIn(List<Integer> values) {
            addCriterion("ware_maintain_presentation_id in", values, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdNotIn(List<Integer> values) {
            addCriterion("ware_maintain_presentation_id not in", values, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_presentation_id between", value1, value2, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_presentation_id not between", value1, value2, "wareMaintainPresentationId");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoIsNull() {
            addCriterion("maintain_presentation_no is null");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoIsNotNull() {
            addCriterion("maintain_presentation_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoEqualTo(String value) {
            addCriterion("maintain_presentation_no =", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoNotEqualTo(String value) {
            addCriterion("maintain_presentation_no <>", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoGreaterThan(String value) {
            addCriterion("maintain_presentation_no >", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_presentation_no >=", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoLessThan(String value) {
            addCriterion("maintain_presentation_no <", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoLessThanOrEqualTo(String value) {
            addCriterion("maintain_presentation_no <=", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoLike(String value) {
            addCriterion("maintain_presentation_no like", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoNotLike(String value) {
            addCriterion("maintain_presentation_no not like", value, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoIn(List<String> values) {
            addCriterion("maintain_presentation_no in", values, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoNotIn(List<String> values) {
            addCriterion("maintain_presentation_no not in", values, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoBetween(String value1, String value2) {
            addCriterion("maintain_presentation_no between", value1, value2, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andMaintainPresentationNoNotBetween(String value1, String value2) {
            addCriterion("maintain_presentation_no not between", value1, value2, "maintainPresentationNo");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
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

        public Criteria andMaintainNoIsNull() {
            addCriterion("maintain_no is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNoIsNotNull() {
            addCriterion("maintain_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNoEqualTo(String value) {
            addCriterion("maintain_no =", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotEqualTo(String value) {
            addCriterion("maintain_no <>", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoGreaterThan(String value) {
            addCriterion("maintain_no >", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_no >=", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoLessThan(String value) {
            addCriterion("maintain_no <", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoLessThanOrEqualTo(String value) {
            addCriterion("maintain_no <=", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoLike(String value) {
            addCriterion("maintain_no like", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotLike(String value) {
            addCriterion("maintain_no not like", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoIn(List<String> values) {
            addCriterion("maintain_no in", values, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotIn(List<String> values) {
            addCriterion("maintain_no not in", values, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoBetween(String value1, String value2) {
            addCriterion("maintain_no between", value1, value2, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotBetween(String value1, String value2) {
            addCriterion("maintain_no not between", value1, value2, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsIsNull() {
            addCriterion("maintain_departments is null");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsIsNotNull() {
            addCriterion("maintain_departments is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsEqualTo(String value) {
            addCriterion("maintain_departments =", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsNotEqualTo(String value) {
            addCriterion("maintain_departments <>", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsGreaterThan(String value) {
            addCriterion("maintain_departments >", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_departments >=", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsLessThan(String value) {
            addCriterion("maintain_departments <", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsLessThanOrEqualTo(String value) {
            addCriterion("maintain_departments <=", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsLike(String value) {
            addCriterion("maintain_departments like", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsNotLike(String value) {
            addCriterion("maintain_departments not like", value, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsIn(List<String> values) {
            addCriterion("maintain_departments in", values, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsNotIn(List<String> values) {
            addCriterion("maintain_departments not in", values, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsBetween(String value1, String value2) {
            addCriterion("maintain_departments between", value1, value2, "maintainDepartments");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentsNotBetween(String value1, String value2) {
            addCriterion("maintain_departments not between", value1, value2, "maintainDepartments");
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

        public Criteria andTestUserIsNull() {
            addCriterion("test_user is null");
            return (Criteria) this;
        }

        public Criteria andTestUserIsNotNull() {
            addCriterion("test_user is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserEqualTo(Integer value) {
            addCriterion("test_user =", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotEqualTo(Integer value) {
            addCriterion("test_user <>", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThan(Integer value) {
            addCriterion("test_user >", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_user >=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThan(Integer value) {
            addCriterion("test_user <", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThanOrEqualTo(Integer value) {
            addCriterion("test_user <=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserIn(List<Integer> values) {
            addCriterion("test_user in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotIn(List<Integer> values) {
            addCriterion("test_user not in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserBetween(Integer value1, Integer value2) {
            addCriterion("test_user between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotBetween(Integer value1, Integer value2) {
            addCriterion("test_user not between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andInputUserIsNull() {
            addCriterion("input_user is null");
            return (Criteria) this;
        }

        public Criteria andInputUserIsNotNull() {
            addCriterion("input_user is not null");
            return (Criteria) this;
        }

        public Criteria andInputUserEqualTo(Integer value) {
            addCriterion("input_user =", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotEqualTo(Integer value) {
            addCriterion("input_user <>", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserGreaterThan(Integer value) {
            addCriterion("input_user >", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_user >=", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLessThan(Integer value) {
            addCriterion("input_user <", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLessThanOrEqualTo(Integer value) {
            addCriterion("input_user <=", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserIn(List<Integer> values) {
            addCriterion("input_user in", values, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotIn(List<Integer> values) {
            addCriterion("input_user not in", values, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserBetween(Integer value1, Integer value2) {
            addCriterion("input_user between", value1, value2, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotBetween(Integer value1, Integer value2) {
            addCriterion("input_user not between", value1, value2, "inputUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserIsNull() {
            addCriterion("maintain_user is null");
            return (Criteria) this;
        }

        public Criteria andMaintainUserIsNotNull() {
            addCriterion("maintain_user is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainUserEqualTo(Integer value) {
            addCriterion("maintain_user =", value, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserNotEqualTo(Integer value) {
            addCriterion("maintain_user <>", value, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserGreaterThan(Integer value) {
            addCriterion("maintain_user >", value, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintain_user >=", value, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserLessThan(Integer value) {
            addCriterion("maintain_user <", value, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserLessThanOrEqualTo(Integer value) {
            addCriterion("maintain_user <=", value, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserIn(List<Integer> values) {
            addCriterion("maintain_user in", values, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserNotIn(List<Integer> values) {
            addCriterion("maintain_user not in", values, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserBetween(Integer value1, Integer value2) {
            addCriterion("maintain_user between", value1, value2, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainUserNotBetween(Integer value1, Integer value2) {
            addCriterion("maintain_user not between", value1, value2, "maintainUser");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIsNull() {
            addCriterion("maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIsNotNull() {
            addCriterion("maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNumEqualTo(Double value) {
            addCriterion("maintain_num =", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotEqualTo(Double value) {
            addCriterion("maintain_num <>", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumGreaterThan(Double value) {
            addCriterion("maintain_num >", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumGreaterThanOrEqualTo(Double value) {
            addCriterion("maintain_num >=", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumLessThan(Double value) {
            addCriterion("maintain_num <", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumLessThanOrEqualTo(Double value) {
            addCriterion("maintain_num <=", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIn(List<Double> values) {
            addCriterion("maintain_num in", values, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotIn(List<Double> values) {
            addCriterion("maintain_num not in", values, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumBetween(Double value1, Double value2) {
            addCriterion("maintain_num between", value1, value2, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotBetween(Double value1, Double value2) {
            addCriterion("maintain_num not between", value1, value2, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialIsNull() {
            addCriterion("new_maintain_serial is null");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialIsNotNull() {
            addCriterion("new_maintain_serial is not null");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialEqualTo(String value) {
            addCriterion("new_maintain_serial =", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialNotEqualTo(String value) {
            addCriterion("new_maintain_serial <>", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialGreaterThan(String value) {
            addCriterion("new_maintain_serial >", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialGreaterThanOrEqualTo(String value) {
            addCriterion("new_maintain_serial >=", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialLessThan(String value) {
            addCriterion("new_maintain_serial <", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialLessThanOrEqualTo(String value) {
            addCriterion("new_maintain_serial <=", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialLike(String value) {
            addCriterion("new_maintain_serial like", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialNotLike(String value) {
            addCriterion("new_maintain_serial not like", value, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialIn(List<String> values) {
            addCriterion("new_maintain_serial in", values, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialNotIn(List<String> values) {
            addCriterion("new_maintain_serial not in", values, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialBetween(String value1, String value2) {
            addCriterion("new_maintain_serial between", value1, value2, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andNewMaintainSerialNotBetween(String value1, String value2) {
            addCriterion("new_maintain_serial not between", value1, value2, "newMaintainSerial");
            return (Criteria) this;
        }

        public Criteria andFaultStorageIsNull() {
            addCriterion("fault_storage is null");
            return (Criteria) this;
        }

        public Criteria andFaultStorageIsNotNull() {
            addCriterion("fault_storage is not null");
            return (Criteria) this;
        }

        public Criteria andFaultStorageEqualTo(String value) {
            addCriterion("fault_storage =", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotEqualTo(String value) {
            addCriterion("fault_storage <>", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageGreaterThan(String value) {
            addCriterion("fault_storage >", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageGreaterThanOrEqualTo(String value) {
            addCriterion("fault_storage >=", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageLessThan(String value) {
            addCriterion("fault_storage <", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageLessThanOrEqualTo(String value) {
            addCriterion("fault_storage <=", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageLike(String value) {
            addCriterion("fault_storage like", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotLike(String value) {
            addCriterion("fault_storage not like", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageIn(List<String> values) {
            addCriterion("fault_storage in", values, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotIn(List<String> values) {
            addCriterion("fault_storage not in", values, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageBetween(String value1, String value2) {
            addCriterion("fault_storage between", value1, value2, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotBetween(String value1, String value2) {
            addCriterion("fault_storage not between", value1, value2, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andScrapNumIsNull() {
            addCriterion("scrap_num is null");
            return (Criteria) this;
        }

        public Criteria andScrapNumIsNotNull() {
            addCriterion("scrap_num is not null");
            return (Criteria) this;
        }

        public Criteria andScrapNumEqualTo(Double value) {
            addCriterion("scrap_num =", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumNotEqualTo(Double value) {
            addCriterion("scrap_num <>", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumGreaterThan(Double value) {
            addCriterion("scrap_num >", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumGreaterThanOrEqualTo(Double value) {
            addCriterion("scrap_num >=", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumLessThan(Double value) {
            addCriterion("scrap_num <", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumLessThanOrEqualTo(Double value) {
            addCriterion("scrap_num <=", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumIn(List<Double> values) {
            addCriterion("scrap_num in", values, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumNotIn(List<Double> values) {
            addCriterion("scrap_num not in", values, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumBetween(Double value1, Double value2) {
            addCriterion("scrap_num between", value1, value2, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumNotBetween(Double value1, Double value2) {
            addCriterion("scrap_num not between", value1, value2, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalIsNull() {
            addCriterion("change_original is null");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalIsNotNull() {
            addCriterion("change_original is not null");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalEqualTo(String value) {
            addCriterion("change_original =", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotEqualTo(String value) {
            addCriterion("change_original <>", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalGreaterThan(String value) {
            addCriterion("change_original >", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("change_original >=", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalLessThan(String value) {
            addCriterion("change_original <", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalLessThanOrEqualTo(String value) {
            addCriterion("change_original <=", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalLike(String value) {
            addCriterion("change_original like", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotLike(String value) {
            addCriterion("change_original not like", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalIn(List<String> values) {
            addCriterion("change_original in", values, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotIn(List<String> values) {
            addCriterion("change_original not in", values, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalBetween(String value1, String value2) {
            addCriterion("change_original between", value1, value2, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotBetween(String value1, String value2) {
            addCriterion("change_original not between", value1, value2, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andFaultRecordIsNull() {
            addCriterion("fault_record is null");
            return (Criteria) this;
        }

        public Criteria andFaultRecordIsNotNull() {
            addCriterion("fault_record is not null");
            return (Criteria) this;
        }

        public Criteria andFaultRecordEqualTo(String value) {
            addCriterion("fault_record =", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotEqualTo(String value) {
            addCriterion("fault_record <>", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordGreaterThan(String value) {
            addCriterion("fault_record >", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordGreaterThanOrEqualTo(String value) {
            addCriterion("fault_record >=", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordLessThan(String value) {
            addCriterion("fault_record <", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordLessThanOrEqualTo(String value) {
            addCriterion("fault_record <=", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordLike(String value) {
            addCriterion("fault_record like", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotLike(String value) {
            addCriterion("fault_record not like", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordIn(List<String> values) {
            addCriterion("fault_record in", values, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotIn(List<String> values) {
            addCriterion("fault_record not in", values, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordBetween(String value1, String value2) {
            addCriterion("fault_record between", value1, value2, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotBetween(String value1, String value2) {
            addCriterion("fault_record not between", value1, value2, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordIsNull() {
            addCriterion("maintain_record is null");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordIsNotNull() {
            addCriterion("maintain_record is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordEqualTo(String value) {
            addCriterion("maintain_record =", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordNotEqualTo(String value) {
            addCriterion("maintain_record <>", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordGreaterThan(String value) {
            addCriterion("maintain_record >", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_record >=", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordLessThan(String value) {
            addCriterion("maintain_record <", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordLessThanOrEqualTo(String value) {
            addCriterion("maintain_record <=", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordLike(String value) {
            addCriterion("maintain_record like", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordNotLike(String value) {
            addCriterion("maintain_record not like", value, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordIn(List<String> values) {
            addCriterion("maintain_record in", values, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordNotIn(List<String> values) {
            addCriterion("maintain_record not in", values, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordBetween(String value1, String value2) {
            addCriterion("maintain_record between", value1, value2, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainRecordNotBetween(String value1, String value2) {
            addCriterion("maintain_record not between", value1, value2, "maintainRecord");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyIsNull() {
            addCriterion("maintain_money is null");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyIsNotNull() {
            addCriterion("maintain_money is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyEqualTo(BigDecimal value) {
            addCriterion("maintain_money =", value, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyNotEqualTo(BigDecimal value) {
            addCriterion("maintain_money <>", value, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyGreaterThan(BigDecimal value) {
            addCriterion("maintain_money >", value, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_money >=", value, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyLessThan(BigDecimal value) {
            addCriterion("maintain_money <", value, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_money <=", value, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyIn(List<BigDecimal> values) {
            addCriterion("maintain_money in", values, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyNotIn(List<BigDecimal> values) {
            addCriterion("maintain_money not in", values, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_money between", value1, value2, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_money not between", value1, value2, "maintainMoney");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIsNull() {
            addCriterion("repair_reason is null");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIsNotNull() {
            addCriterion("repair_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRepairReasonEqualTo(String value) {
            addCriterion("repair_reason =", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotEqualTo(String value) {
            addCriterion("repair_reason <>", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonGreaterThan(String value) {
            addCriterion("repair_reason >", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonGreaterThanOrEqualTo(String value) {
            addCriterion("repair_reason >=", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLessThan(String value) {
            addCriterion("repair_reason <", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLessThanOrEqualTo(String value) {
            addCriterion("repair_reason <=", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLike(String value) {
            addCriterion("repair_reason like", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotLike(String value) {
            addCriterion("repair_reason not like", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIn(List<String> values) {
            addCriterion("repair_reason in", values, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotIn(List<String> values) {
            addCriterion("repair_reason not in", values, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonBetween(String value1, String value2) {
            addCriterion("repair_reason between", value1, value2, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotBetween(String value1, String value2) {
            addCriterion("repair_reason not between", value1, value2, "repairReason");
            return (Criteria) this;
        }

        public Criteria andInputNumIsNull() {
            addCriterion("input_num is null");
            return (Criteria) this;
        }

        public Criteria andInputNumIsNotNull() {
            addCriterion("input_num is not null");
            return (Criteria) this;
        }

        public Criteria andInputNumEqualTo(Date value) {
            addCriterion("input_num =", value, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumNotEqualTo(Date value) {
            addCriterion("input_num <>", value, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumGreaterThan(Date value) {
            addCriterion("input_num >", value, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumGreaterThanOrEqualTo(Date value) {
            addCriterion("input_num >=", value, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumLessThan(Date value) {
            addCriterion("input_num <", value, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumLessThanOrEqualTo(Date value) {
            addCriterion("input_num <=", value, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumIn(List<Date> values) {
            addCriterion("input_num in", values, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumNotIn(List<Date> values) {
            addCriterion("input_num not in", values, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumBetween(Date value1, Date value2) {
            addCriterion("input_num between", value1, value2, "inputNum");
            return (Criteria) this;
        }

        public Criteria andInputNumNotBetween(Date value1, Date value2) {
            addCriterion("input_num not between", value1, value2, "inputNum");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNull() {
            addCriterion("reasons_rejection is null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNotNull() {
            addCriterion("reasons_rejection is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionEqualTo(String value) {
            addCriterion("reasons_rejection =", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotEqualTo(String value) {
            addCriterion("reasons_rejection <>", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThan(String value) {
            addCriterion("reasons_rejection >", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThanOrEqualTo(String value) {
            addCriterion("reasons_rejection >=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThan(String value) {
            addCriterion("reasons_rejection <", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThanOrEqualTo(String value) {
            addCriterion("reasons_rejection <=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLike(String value) {
            addCriterion("reasons_rejection like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotLike(String value) {
            addCriterion("reasons_rejection not like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIn(List<String> values) {
            addCriterion("reasons_rejection in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotIn(List<String> values) {
            addCriterion("reasons_rejection not in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionBetween(String value1, String value2) {
            addCriterion("reasons_rejection between", value1, value2, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotBetween(String value1, String value2) {
            addCriterion("reasons_rejection not between", value1, value2, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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