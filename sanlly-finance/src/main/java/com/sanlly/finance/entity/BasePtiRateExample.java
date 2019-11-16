package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasePtiRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BasePtiRateExample() {
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

        public Criteria andContainerSizeIsNull() {
            addCriterion("container_size is null");
            return (Criteria) this;
        }

        public Criteria andContainerSizeIsNotNull() {
            addCriterion("container_size is not null");
            return (Criteria) this;
        }

        public Criteria andContainerSizeEqualTo(String value) {
            addCriterion("container_size =", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotEqualTo(String value) {
            addCriterion("container_size <>", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeGreaterThan(String value) {
            addCriterion("container_size >", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeGreaterThanOrEqualTo(String value) {
            addCriterion("container_size >=", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeLessThan(String value) {
            addCriterion("container_size <", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeLessThanOrEqualTo(String value) {
            addCriterion("container_size <=", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeLike(String value) {
            addCriterion("container_size like", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotLike(String value) {
            addCriterion("container_size not like", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeIn(List<String> values) {
            addCriterion("container_size in", values, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotIn(List<String> values) {
            addCriterion("container_size not in", values, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeBetween(String value1, String value2) {
            addCriterion("container_size between", value1, value2, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotBetween(String value1, String value2) {
            addCriterion("container_size not between", value1, value2, "containerSize");
            return (Criteria) this;
        }

        public Criteria andPtiTypeIsNull() {
            addCriterion("pti_type is null");
            return (Criteria) this;
        }

        public Criteria andPtiTypeIsNotNull() {
            addCriterion("pti_type is not null");
            return (Criteria) this;
        }

        public Criteria andPtiTypeEqualTo(String value) {
            addCriterion("pti_type =", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotEqualTo(String value) {
            addCriterion("pti_type <>", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeGreaterThan(String value) {
            addCriterion("pti_type >", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pti_type >=", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeLessThan(String value) {
            addCriterion("pti_type <", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeLessThanOrEqualTo(String value) {
            addCriterion("pti_type <=", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeLike(String value) {
            addCriterion("pti_type like", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotLike(String value) {
            addCriterion("pti_type not like", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeIn(List<String> values) {
            addCriterion("pti_type in", values, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotIn(List<String> values) {
            addCriterion("pti_type not in", values, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeBetween(String value1, String value2) {
            addCriterion("pti_type between", value1, value2, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotBetween(String value1, String value2) {
            addCriterion("pti_type not between", value1, value2, "ptiType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNull() {
            addCriterion("currency_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNotNull() {
            addCriterion("currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeEqualTo(String value) {
            addCriterion("currency_type =", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotEqualTo(String value) {
            addCriterion("currency_type <>", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThan(String value) {
            addCriterion("currency_type >", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_type >=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThan(String value) {
            addCriterion("currency_type <", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("currency_type <=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLike(String value) {
            addCriterion("currency_type like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotLike(String value) {
            addCriterion("currency_type not like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIn(List<String> values) {
            addCriterion("currency_type in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotIn(List<String> values) {
            addCriterion("currency_type not in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeBetween(String value1, String value2) {
            addCriterion("currency_type between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("currency_type not between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andReceivableIsNull() {
            addCriterion("receivable is null");
            return (Criteria) this;
        }

        public Criteria andReceivableIsNotNull() {
            addCriterion("receivable is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableEqualTo(BigDecimal value) {
            addCriterion("receivable =", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotEqualTo(BigDecimal value) {
            addCriterion("receivable <>", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableGreaterThan(BigDecimal value) {
            addCriterion("receivable >", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable >=", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLessThan(BigDecimal value) {
            addCriterion("receivable <", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable <=", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableIn(List<BigDecimal> values) {
            addCriterion("receivable in", values, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotIn(List<BigDecimal> values) {
            addCriterion("receivable not in", values, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable between", value1, value2, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable not between", value1, value2, "receivable");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsIsNull() {
            addCriterion("is_formula_ys is null");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsIsNotNull() {
            addCriterion("is_formula_ys is not null");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsEqualTo(String value) {
            addCriterion("is_formula_ys =", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsNotEqualTo(String value) {
            addCriterion("is_formula_ys <>", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsGreaterThan(String value) {
            addCriterion("is_formula_ys >", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsGreaterThanOrEqualTo(String value) {
            addCriterion("is_formula_ys >=", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsLessThan(String value) {
            addCriterion("is_formula_ys <", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsLessThanOrEqualTo(String value) {
            addCriterion("is_formula_ys <=", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsLike(String value) {
            addCriterion("is_formula_ys like", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsNotLike(String value) {
            addCriterion("is_formula_ys not like", value, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsIn(List<String> values) {
            addCriterion("is_formula_ys in", values, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsNotIn(List<String> values) {
            addCriterion("is_formula_ys not in", values, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsBetween(String value1, String value2) {
            addCriterion("is_formula_ys between", value1, value2, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYsNotBetween(String value1, String value2) {
            addCriterion("is_formula_ys not between", value1, value2, "isFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsIsNull() {
            addCriterion("compute_formula_ys is null");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsIsNotNull() {
            addCriterion("compute_formula_ys is not null");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsEqualTo(String value) {
            addCriterion("compute_formula_ys =", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsNotEqualTo(String value) {
            addCriterion("compute_formula_ys <>", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsGreaterThan(String value) {
            addCriterion("compute_formula_ys >", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsGreaterThanOrEqualTo(String value) {
            addCriterion("compute_formula_ys >=", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsLessThan(String value) {
            addCriterion("compute_formula_ys <", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsLessThanOrEqualTo(String value) {
            addCriterion("compute_formula_ys <=", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsLike(String value) {
            addCriterion("compute_formula_ys like", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsNotLike(String value) {
            addCriterion("compute_formula_ys not like", value, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsIn(List<String> values) {
            addCriterion("compute_formula_ys in", values, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsNotIn(List<String> values) {
            addCriterion("compute_formula_ys not in", values, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsBetween(String value1, String value2) {
            addCriterion("compute_formula_ys between", value1, value2, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYsNotBetween(String value1, String value2) {
            addCriterion("compute_formula_ys not between", value1, value2, "computeFormulaYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsIsNull() {
            addCriterion("currency_type_ys is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsIsNotNull() {
            addCriterion("currency_type_ys is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsEqualTo(String value) {
            addCriterion("currency_type_ys =", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsNotEqualTo(String value) {
            addCriterion("currency_type_ys <>", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsGreaterThan(String value) {
            addCriterion("currency_type_ys >", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsGreaterThanOrEqualTo(String value) {
            addCriterion("currency_type_ys >=", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsLessThan(String value) {
            addCriterion("currency_type_ys <", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsLessThanOrEqualTo(String value) {
            addCriterion("currency_type_ys <=", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsLike(String value) {
            addCriterion("currency_type_ys like", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsNotLike(String value) {
            addCriterion("currency_type_ys not like", value, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsIn(List<String> values) {
            addCriterion("currency_type_ys in", values, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsNotIn(List<String> values) {
            addCriterion("currency_type_ys not in", values, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsBetween(String value1, String value2) {
            addCriterion("currency_type_ys between", value1, value2, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYsNotBetween(String value1, String value2) {
            addCriterion("currency_type_ys not between", value1, value2, "currencyTypeYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsIsNull() {
            addCriterion("option_value_ys is null");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsIsNotNull() {
            addCriterion("option_value_ys is not null");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsEqualTo(String value) {
            addCriterion("option_value_ys =", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsNotEqualTo(String value) {
            addCriterion("option_value_ys <>", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsGreaterThan(String value) {
            addCriterion("option_value_ys >", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsGreaterThanOrEqualTo(String value) {
            addCriterion("option_value_ys >=", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsLessThan(String value) {
            addCriterion("option_value_ys <", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsLessThanOrEqualTo(String value) {
            addCriterion("option_value_ys <=", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsLike(String value) {
            addCriterion("option_value_ys like", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsNotLike(String value) {
            addCriterion("option_value_ys not like", value, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsIn(List<String> values) {
            addCriterion("option_value_ys in", values, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsNotIn(List<String> values) {
            addCriterion("option_value_ys not in", values, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsBetween(String value1, String value2) {
            addCriterion("option_value_ys between", value1, value2, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andOptionValueYsNotBetween(String value1, String value2) {
            addCriterion("option_value_ys not between", value1, value2, "optionValueYs");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeIsNull() {
            addCriterion("pay_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeIsNotNull() {
            addCriterion("pay_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeEqualTo(String value) {
            addCriterion("pay_currency_type =", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeNotEqualTo(String value) {
            addCriterion("pay_currency_type <>", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeGreaterThan(String value) {
            addCriterion("pay_currency_type >", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_currency_type >=", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeLessThan(String value) {
            addCriterion("pay_currency_type <", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_currency_type <=", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeLike(String value) {
            addCriterion("pay_currency_type like", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeNotLike(String value) {
            addCriterion("pay_currency_type not like", value, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeIn(List<String> values) {
            addCriterion("pay_currency_type in", values, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeNotIn(List<String> values) {
            addCriterion("pay_currency_type not in", values, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeBetween(String value1, String value2) {
            addCriterion("pay_currency_type between", value1, value2, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("pay_currency_type not between", value1, value2, "payCurrencyType");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfIsNull() {
            addCriterion("is_formula_yf is null");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfIsNotNull() {
            addCriterion("is_formula_yf is not null");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfEqualTo(String value) {
            addCriterion("is_formula_yf =", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfNotEqualTo(String value) {
            addCriterion("is_formula_yf <>", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfGreaterThan(String value) {
            addCriterion("is_formula_yf >", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfGreaterThanOrEqualTo(String value) {
            addCriterion("is_formula_yf >=", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfLessThan(String value) {
            addCriterion("is_formula_yf <", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfLessThanOrEqualTo(String value) {
            addCriterion("is_formula_yf <=", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfLike(String value) {
            addCriterion("is_formula_yf like", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfNotLike(String value) {
            addCriterion("is_formula_yf not like", value, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfIn(List<String> values) {
            addCriterion("is_formula_yf in", values, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfNotIn(List<String> values) {
            addCriterion("is_formula_yf not in", values, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfBetween(String value1, String value2) {
            addCriterion("is_formula_yf between", value1, value2, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andIsFormulaYfNotBetween(String value1, String value2) {
            addCriterion("is_formula_yf not between", value1, value2, "isFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfIsNull() {
            addCriterion("compute_formula_yf is null");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfIsNotNull() {
            addCriterion("compute_formula_yf is not null");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfEqualTo(String value) {
            addCriterion("compute_formula_yf =", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfNotEqualTo(String value) {
            addCriterion("compute_formula_yf <>", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfGreaterThan(String value) {
            addCriterion("compute_formula_yf >", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfGreaterThanOrEqualTo(String value) {
            addCriterion("compute_formula_yf >=", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfLessThan(String value) {
            addCriterion("compute_formula_yf <", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfLessThanOrEqualTo(String value) {
            addCriterion("compute_formula_yf <=", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfLike(String value) {
            addCriterion("compute_formula_yf like", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfNotLike(String value) {
            addCriterion("compute_formula_yf not like", value, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfIn(List<String> values) {
            addCriterion("compute_formula_yf in", values, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfNotIn(List<String> values) {
            addCriterion("compute_formula_yf not in", values, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfBetween(String value1, String value2) {
            addCriterion("compute_formula_yf between", value1, value2, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaYfNotBetween(String value1, String value2) {
            addCriterion("compute_formula_yf not between", value1, value2, "computeFormulaYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfIsNull() {
            addCriterion("currency_type_yf is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfIsNotNull() {
            addCriterion("currency_type_yf is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfEqualTo(String value) {
            addCriterion("currency_type_yf =", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfNotEqualTo(String value) {
            addCriterion("currency_type_yf <>", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfGreaterThan(String value) {
            addCriterion("currency_type_yf >", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfGreaterThanOrEqualTo(String value) {
            addCriterion("currency_type_yf >=", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfLessThan(String value) {
            addCriterion("currency_type_yf <", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfLessThanOrEqualTo(String value) {
            addCriterion("currency_type_yf <=", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfLike(String value) {
            addCriterion("currency_type_yf like", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfNotLike(String value) {
            addCriterion("currency_type_yf not like", value, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfIn(List<String> values) {
            addCriterion("currency_type_yf in", values, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfNotIn(List<String> values) {
            addCriterion("currency_type_yf not in", values, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfBetween(String value1, String value2) {
            addCriterion("currency_type_yf between", value1, value2, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeYfNotBetween(String value1, String value2) {
            addCriterion("currency_type_yf not between", value1, value2, "currencyTypeYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfIsNull() {
            addCriterion("option_value_yf is null");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfIsNotNull() {
            addCriterion("option_value_yf is not null");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfEqualTo(String value) {
            addCriterion("option_value_yf =", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfNotEqualTo(String value) {
            addCriterion("option_value_yf <>", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfGreaterThan(String value) {
            addCriterion("option_value_yf >", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfGreaterThanOrEqualTo(String value) {
            addCriterion("option_value_yf >=", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfLessThan(String value) {
            addCriterion("option_value_yf <", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfLessThanOrEqualTo(String value) {
            addCriterion("option_value_yf <=", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfLike(String value) {
            addCriterion("option_value_yf like", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfNotLike(String value) {
            addCriterion("option_value_yf not like", value, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfIn(List<String> values) {
            addCriterion("option_value_yf in", values, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfNotIn(List<String> values) {
            addCriterion("option_value_yf not in", values, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfBetween(String value1, String value2) {
            addCriterion("option_value_yf between", value1, value2, "optionValueYf");
            return (Criteria) this;
        }

        public Criteria andOptionValueYfNotBetween(String value1, String value2) {
            addCriterion("option_value_yf not between", value1, value2, "optionValueYf");
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFormulaYsIsNull() {
            addCriterion("formula_ys is null");
            return (Criteria) this;
        }

        public Criteria andFormulaYsIsNotNull() {
            addCriterion("formula_ys is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaYsEqualTo(String value) {
            addCriterion("formula_ys =", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsNotEqualTo(String value) {
            addCriterion("formula_ys <>", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsGreaterThan(String value) {
            addCriterion("formula_ys >", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsGreaterThanOrEqualTo(String value) {
            addCriterion("formula_ys >=", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsLessThan(String value) {
            addCriterion("formula_ys <", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsLessThanOrEqualTo(String value) {
            addCriterion("formula_ys <=", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsLike(String value) {
            addCriterion("formula_ys like", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsNotLike(String value) {
            addCriterion("formula_ys not like", value, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsIn(List<String> values) {
            addCriterion("formula_ys in", values, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsNotIn(List<String> values) {
            addCriterion("formula_ys not in", values, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsBetween(String value1, String value2) {
            addCriterion("formula_ys between", value1, value2, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYsNotBetween(String value1, String value2) {
            addCriterion("formula_ys not between", value1, value2, "formulaYs");
            return (Criteria) this;
        }

        public Criteria andFormulaYfIsNull() {
            addCriterion("formula_yf is null");
            return (Criteria) this;
        }

        public Criteria andFormulaYfIsNotNull() {
            addCriterion("formula_yf is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaYfEqualTo(String value) {
            addCriterion("formula_yf =", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfNotEqualTo(String value) {
            addCriterion("formula_yf <>", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfGreaterThan(String value) {
            addCriterion("formula_yf >", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfGreaterThanOrEqualTo(String value) {
            addCriterion("formula_yf >=", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfLessThan(String value) {
            addCriterion("formula_yf <", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfLessThanOrEqualTo(String value) {
            addCriterion("formula_yf <=", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfLike(String value) {
            addCriterion("formula_yf like", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfNotLike(String value) {
            addCriterion("formula_yf not like", value, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfIn(List<String> values) {
            addCriterion("formula_yf in", values, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfNotIn(List<String> values) {
            addCriterion("formula_yf not in", values, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfBetween(String value1, String value2) {
            addCriterion("formula_yf between", value1, value2, "formulaYf");
            return (Criteria) this;
        }

        public Criteria andFormulaYfNotBetween(String value1, String value2) {
            addCriterion("formula_yf not between", value1, value2, "formulaYf");
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