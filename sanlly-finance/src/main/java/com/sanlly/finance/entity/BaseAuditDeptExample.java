package com.sanlly.finance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseAuditDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BaseAuditDeptExample() {
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

        public Criteria andCompanyKeyIsNull() {
            addCriterion("company_key is null");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyIsNotNull() {
            addCriterion("company_key is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyEqualTo(String value) {
            addCriterion("company_key =", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotEqualTo(String value) {
            addCriterion("company_key <>", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyGreaterThan(String value) {
            addCriterion("company_key >", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyGreaterThanOrEqualTo(String value) {
            addCriterion("company_key >=", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyLessThan(String value) {
            addCriterion("company_key <", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyLessThanOrEqualTo(String value) {
            addCriterion("company_key <=", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyLike(String value) {
            addCriterion("company_key like", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotLike(String value) {
            addCriterion("company_key not like", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyIn(List<String> values) {
            addCriterion("company_key in", values, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotIn(List<String> values) {
            addCriterion("company_key not in", values, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyBetween(String value1, String value2) {
            addCriterion("company_key between", value1, value2, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotBetween(String value1, String value2) {
            addCriterion("company_key not between", value1, value2, "companyKey");
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

        public Criteria andChargeKeyIsNull() {
            addCriterion("charge_key is null");
            return (Criteria) this;
        }

        public Criteria andChargeKeyIsNotNull() {
            addCriterion("charge_key is not null");
            return (Criteria) this;
        }

        public Criteria andChargeKeyEqualTo(String value) {
            addCriterion("charge_key =", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotEqualTo(String value) {
            addCriterion("charge_key <>", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyGreaterThan(String value) {
            addCriterion("charge_key >", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("charge_key >=", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyLessThan(String value) {
            addCriterion("charge_key <", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyLessThanOrEqualTo(String value) {
            addCriterion("charge_key <=", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyLike(String value) {
            addCriterion("charge_key like", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotLike(String value) {
            addCriterion("charge_key not like", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyIn(List<String> values) {
            addCriterion("charge_key in", values, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotIn(List<String> values) {
            addCriterion("charge_key not in", values, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyBetween(String value1, String value2) {
            addCriterion("charge_key between", value1, value2, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotBetween(String value1, String value2) {
            addCriterion("charge_key not between", value1, value2, "chargeKey");
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

        public Criteria andChargeCodeIsNull() {
            addCriterion("charge_code is null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIsNotNull() {
            addCriterion("charge_code is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeEqualTo(String value) {
            addCriterion("charge_code =", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotEqualTo(String value) {
            addCriterion("charge_code <>", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThan(String value) {
            addCriterion("charge_code >", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_code >=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThan(String value) {
            addCriterion("charge_code <", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThanOrEqualTo(String value) {
            addCriterion("charge_code <=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLike(String value) {
            addCriterion("charge_code like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotLike(String value) {
            addCriterion("charge_code not like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIn(List<String> values) {
            addCriterion("charge_code in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotIn(List<String> values) {
            addCriterion("charge_code not in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeBetween(String value1, String value2) {
            addCriterion("charge_code between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotBetween(String value1, String value2) {
            addCriterion("charge_code not between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeIsNull() {
            addCriterion("profit_center_code is null");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeIsNotNull() {
            addCriterion("profit_center_code is not null");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeEqualTo(String value) {
            addCriterion("profit_center_code =", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeNotEqualTo(String value) {
            addCriterion("profit_center_code <>", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeGreaterThan(String value) {
            addCriterion("profit_center_code >", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("profit_center_code >=", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeLessThan(String value) {
            addCriterion("profit_center_code <", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeLessThanOrEqualTo(String value) {
            addCriterion("profit_center_code <=", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeLike(String value) {
            addCriterion("profit_center_code like", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeNotLike(String value) {
            addCriterion("profit_center_code not like", value, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeIn(List<String> values) {
            addCriterion("profit_center_code in", values, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeNotIn(List<String> values) {
            addCriterion("profit_center_code not in", values, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeBetween(String value1, String value2) {
            addCriterion("profit_center_code between", value1, value2, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterCodeNotBetween(String value1, String value2) {
            addCriterion("profit_center_code not between", value1, value2, "profitCenterCode");
            return (Criteria) this;
        }

        public Criteria andProfitCenterIsNull() {
            addCriterion("profit_center is null");
            return (Criteria) this;
        }

        public Criteria andProfitCenterIsNotNull() {
            addCriterion("profit_center is not null");
            return (Criteria) this;
        }

        public Criteria andProfitCenterEqualTo(String value) {
            addCriterion("profit_center =", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterNotEqualTo(String value) {
            addCriterion("profit_center <>", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterGreaterThan(String value) {
            addCriterion("profit_center >", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterGreaterThanOrEqualTo(String value) {
            addCriterion("profit_center >=", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterLessThan(String value) {
            addCriterion("profit_center <", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterLessThanOrEqualTo(String value) {
            addCriterion("profit_center <=", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterLike(String value) {
            addCriterion("profit_center like", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterNotLike(String value) {
            addCriterion("profit_center not like", value, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterIn(List<String> values) {
            addCriterion("profit_center in", values, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterNotIn(List<String> values) {
            addCriterion("profit_center not in", values, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterBetween(String value1, String value2) {
            addCriterion("profit_center between", value1, value2, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitCenterNotBetween(String value1, String value2) {
            addCriterion("profit_center not between", value1, value2, "profitCenter");
            return (Criteria) this;
        }

        public Criteria andProfitDeptIsNull() {
            addCriterion("profit_dept is null");
            return (Criteria) this;
        }

        public Criteria andProfitDeptIsNotNull() {
            addCriterion("profit_dept is not null");
            return (Criteria) this;
        }

        public Criteria andProfitDeptEqualTo(String value) {
            addCriterion("profit_dept =", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptNotEqualTo(String value) {
            addCriterion("profit_dept <>", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptGreaterThan(String value) {
            addCriterion("profit_dept >", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptGreaterThanOrEqualTo(String value) {
            addCriterion("profit_dept >=", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptLessThan(String value) {
            addCriterion("profit_dept <", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptLessThanOrEqualTo(String value) {
            addCriterion("profit_dept <=", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptLike(String value) {
            addCriterion("profit_dept like", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptNotLike(String value) {
            addCriterion("profit_dept not like", value, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptIn(List<String> values) {
            addCriterion("profit_dept in", values, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptNotIn(List<String> values) {
            addCriterion("profit_dept not in", values, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptBetween(String value1, String value2) {
            addCriterion("profit_dept between", value1, value2, "profitDept");
            return (Criteria) this;
        }

        public Criteria andProfitDeptNotBetween(String value1, String value2) {
            addCriterion("profit_dept not between", value1, value2, "profitDept");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeIsNull() {
            addCriterion("cost_center_code is null");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeIsNotNull() {
            addCriterion("cost_center_code is not null");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeEqualTo(String value) {
            addCriterion("cost_center_code =", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeNotEqualTo(String value) {
            addCriterion("cost_center_code <>", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeGreaterThan(String value) {
            addCriterion("cost_center_code >", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cost_center_code >=", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeLessThan(String value) {
            addCriterion("cost_center_code <", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeLessThanOrEqualTo(String value) {
            addCriterion("cost_center_code <=", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeLike(String value) {
            addCriterion("cost_center_code like", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeNotLike(String value) {
            addCriterion("cost_center_code not like", value, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeIn(List<String> values) {
            addCriterion("cost_center_code in", values, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeNotIn(List<String> values) {
            addCriterion("cost_center_code not in", values, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeBetween(String value1, String value2) {
            addCriterion("cost_center_code between", value1, value2, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterCodeNotBetween(String value1, String value2) {
            addCriterion("cost_center_code not between", value1, value2, "costCenterCode");
            return (Criteria) this;
        }

        public Criteria andCostCenterIsNull() {
            addCriterion("cost_center is null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIsNotNull() {
            addCriterion("cost_center is not null");
            return (Criteria) this;
        }

        public Criteria andCostCenterEqualTo(String value) {
            addCriterion("cost_center =", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotEqualTo(String value) {
            addCriterion("cost_center <>", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterGreaterThan(String value) {
            addCriterion("cost_center >", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterGreaterThanOrEqualTo(String value) {
            addCriterion("cost_center >=", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLessThan(String value) {
            addCriterion("cost_center <", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLessThanOrEqualTo(String value) {
            addCriterion("cost_center <=", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLike(String value) {
            addCriterion("cost_center like", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotLike(String value) {
            addCriterion("cost_center not like", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterIn(List<String> values) {
            addCriterion("cost_center in", values, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotIn(List<String> values) {
            addCriterion("cost_center not in", values, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterBetween(String value1, String value2) {
            addCriterion("cost_center between", value1, value2, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotBetween(String value1, String value2) {
            addCriterion("cost_center not between", value1, value2, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostDeptIsNull() {
            addCriterion("cost_dept is null");
            return (Criteria) this;
        }

        public Criteria andCostDeptIsNotNull() {
            addCriterion("cost_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCostDeptEqualTo(String value) {
            addCriterion("cost_dept =", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptNotEqualTo(String value) {
            addCriterion("cost_dept <>", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptGreaterThan(String value) {
            addCriterion("cost_dept >", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptGreaterThanOrEqualTo(String value) {
            addCriterion("cost_dept >=", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptLessThan(String value) {
            addCriterion("cost_dept <", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptLessThanOrEqualTo(String value) {
            addCriterion("cost_dept <=", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptLike(String value) {
            addCriterion("cost_dept like", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptNotLike(String value) {
            addCriterion("cost_dept not like", value, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptIn(List<String> values) {
            addCriterion("cost_dept in", values, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptNotIn(List<String> values) {
            addCriterion("cost_dept not in", values, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptBetween(String value1, String value2) {
            addCriterion("cost_dept between", value1, value2, "costDept");
            return (Criteria) this;
        }

        public Criteria andCostDeptNotBetween(String value1, String value2) {
            addCriterion("cost_dept not between", value1, value2, "costDept");
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