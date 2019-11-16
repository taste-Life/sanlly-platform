package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseMerchantsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BaseMerchantsExample() {
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

        public Criteria andMerchantsKeyIsNull() {
            addCriterion("merchants_key is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyIsNotNull() {
            addCriterion("merchants_key is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyEqualTo(String value) {
            addCriterion("merchants_key =", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotEqualTo(String value) {
            addCriterion("merchants_key <>", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyGreaterThan(String value) {
            addCriterion("merchants_key >", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyGreaterThanOrEqualTo(String value) {
            addCriterion("merchants_key >=", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyLessThan(String value) {
            addCriterion("merchants_key <", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyLessThanOrEqualTo(String value) {
            addCriterion("merchants_key <=", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyLike(String value) {
            addCriterion("merchants_key like", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotLike(String value) {
            addCriterion("merchants_key not like", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyIn(List<String> values) {
            addCriterion("merchants_key in", values, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotIn(List<String> values) {
            addCriterion("merchants_key not in", values, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyBetween(String value1, String value2) {
            addCriterion("merchants_key between", value1, value2, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotBetween(String value1, String value2) {
            addCriterion("merchants_key not between", value1, value2, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameIsNull() {
            addCriterion("merchants_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameIsNotNull() {
            addCriterion("merchants_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEqualTo(String value) {
            addCriterion("merchants_name =", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameNotEqualTo(String value) {
            addCriterion("merchants_name <>", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameGreaterThan(String value) {
            addCriterion("merchants_name >", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchants_name >=", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameLessThan(String value) {
            addCriterion("merchants_name <", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameLessThanOrEqualTo(String value) {
            addCriterion("merchants_name <=", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameLike(String value) {
            addCriterion("merchants_name like", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameNotLike(String value) {
            addCriterion("merchants_name not like", value, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameIn(List<String> values) {
            addCriterion("merchants_name in", values, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameNotIn(List<String> values) {
            addCriterion("merchants_name not in", values, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameBetween(String value1, String value2) {
            addCriterion("merchants_name between", value1, value2, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameNotBetween(String value1, String value2) {
            addCriterion("merchants_name not between", value1, value2, "merchantsName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameIsNull() {
            addCriterion("merchantssub_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameIsNotNull() {
            addCriterion("merchantssub_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameEqualTo(String value) {
            addCriterion("merchantssub_name =", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameNotEqualTo(String value) {
            addCriterion("merchantssub_name <>", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameGreaterThan(String value) {
            addCriterion("merchantssub_name >", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchantssub_name >=", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameLessThan(String value) {
            addCriterion("merchantssub_name <", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameLessThanOrEqualTo(String value) {
            addCriterion("merchantssub_name <=", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameLike(String value) {
            addCriterion("merchantssub_name like", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameNotLike(String value) {
            addCriterion("merchantssub_name not like", value, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameIn(List<String> values) {
            addCriterion("merchantssub_name in", values, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameNotIn(List<String> values) {
            addCriterion("merchantssub_name not in", values, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameBetween(String value1, String value2) {
            addCriterion("merchantssub_name between", value1, value2, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantssubNameNotBetween(String value1, String value2) {
            addCriterion("merchantssub_name not between", value1, value2, "merchantssubName");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnIsNull() {
            addCriterion("merchants_name_en is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnIsNotNull() {
            addCriterion("merchants_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnEqualTo(String value) {
            addCriterion("merchants_name_en =", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnNotEqualTo(String value) {
            addCriterion("merchants_name_en <>", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnGreaterThan(String value) {
            addCriterion("merchants_name_en >", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("merchants_name_en >=", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnLessThan(String value) {
            addCriterion("merchants_name_en <", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnLessThanOrEqualTo(String value) {
            addCriterion("merchants_name_en <=", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnLike(String value) {
            addCriterion("merchants_name_en like", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnNotLike(String value) {
            addCriterion("merchants_name_en not like", value, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnIn(List<String> values) {
            addCriterion("merchants_name_en in", values, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnNotIn(List<String> values) {
            addCriterion("merchants_name_en not in", values, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnBetween(String value1, String value2) {
            addCriterion("merchants_name_en between", value1, value2, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsNameEnNotBetween(String value1, String value2) {
            addCriterion("merchants_name_en not between", value1, value2, "merchantsNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnIsNull() {
            addCriterion("merchants_sub_name_en is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnIsNotNull() {
            addCriterion("merchants_sub_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnEqualTo(String value) {
            addCriterion("merchants_sub_name_en =", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnNotEqualTo(String value) {
            addCriterion("merchants_sub_name_en <>", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnGreaterThan(String value) {
            addCriterion("merchants_sub_name_en >", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("merchants_sub_name_en >=", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnLessThan(String value) {
            addCriterion("merchants_sub_name_en <", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnLessThanOrEqualTo(String value) {
            addCriterion("merchants_sub_name_en <=", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnLike(String value) {
            addCriterion("merchants_sub_name_en like", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnNotLike(String value) {
            addCriterion("merchants_sub_name_en not like", value, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnIn(List<String> values) {
            addCriterion("merchants_sub_name_en in", values, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnNotIn(List<String> values) {
            addCriterion("merchants_sub_name_en not in", values, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnBetween(String value1, String value2) {
            addCriterion("merchants_sub_name_en between", value1, value2, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantsSubNameEnNotBetween(String value1, String value2) {
            addCriterion("merchants_sub_name_en not between", value1, value2, "merchantsSubNameEn");
            return (Criteria) this;
        }

        public Criteria andSapidIsNull() {
            addCriterion("SAPID is null");
            return (Criteria) this;
        }

        public Criteria andSapidIsNotNull() {
            addCriterion("SAPID is not null");
            return (Criteria) this;
        }

        public Criteria andSapidEqualTo(String value) {
            addCriterion("SAPID =", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotEqualTo(String value) {
            addCriterion("SAPID <>", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidGreaterThan(String value) {
            addCriterion("SAPID >", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidGreaterThanOrEqualTo(String value) {
            addCriterion("SAPID >=", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLessThan(String value) {
            addCriterion("SAPID <", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLessThanOrEqualTo(String value) {
            addCriterion("SAPID <=", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLike(String value) {
            addCriterion("SAPID like", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotLike(String value) {
            addCriterion("SAPID not like", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidIn(List<String> values) {
            addCriterion("SAPID in", values, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotIn(List<String> values) {
            addCriterion("SAPID not in", values, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidBetween(String value1, String value2) {
            addCriterion("SAPID between", value1, value2, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotBetween(String value1, String value2) {
            addCriterion("SAPID not between", value1, value2, "sapid");
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

        public Criteria andCreditDateIsNull() {
            addCriterion("credit_date is null");
            return (Criteria) this;
        }

        public Criteria andCreditDateIsNotNull() {
            addCriterion("credit_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreditDateEqualTo(BigDecimal value) {
            addCriterion("credit_date =", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotEqualTo(BigDecimal value) {
            addCriterion("credit_date <>", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateGreaterThan(BigDecimal value) {
            addCriterion("credit_date >", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_date >=", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateLessThan(BigDecimal value) {
            addCriterion("credit_date <", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_date <=", value, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateIn(List<BigDecimal> values) {
            addCriterion("credit_date in", values, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotIn(List<BigDecimal> values) {
            addCriterion("credit_date not in", values, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_date between", value1, value2, "creditDate");
            return (Criteria) this;
        }

        public Criteria andCreditDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_date not between", value1, value2, "creditDate");
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