package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillLeaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BillLeaseExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNull() {
            addCriterion("bill_code is null");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNotNull() {
            addCriterion("bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andBillCodeEqualTo(String value) {
            addCriterion("bill_code =", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotEqualTo(String value) {
            addCriterion("bill_code <>", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThan(String value) {
            addCriterion("bill_code >", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_code >=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThan(String value) {
            addCriterion("bill_code <", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThanOrEqualTo(String value) {
            addCriterion("bill_code <=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLike(String value) {
            addCriterion("bill_code like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotLike(String value) {
            addCriterion("bill_code not like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeIn(List<String> values) {
            addCriterion("bill_code in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotIn(List<String> values) {
            addCriterion("bill_code not in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeBetween(String value1, String value2) {
            addCriterion("bill_code between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotBetween(String value1, String value2) {
            addCriterion("bill_code not between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillMonthIsNull() {
            addCriterion("bill_month is null");
            return (Criteria) this;
        }

        public Criteria andBillMonthIsNotNull() {
            addCriterion("bill_month is not null");
            return (Criteria) this;
        }

        public Criteria andBillMonthEqualTo(String value) {
            addCriterion("bill_month =", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotEqualTo(String value) {
            addCriterion("bill_month <>", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthGreaterThan(String value) {
            addCriterion("bill_month >", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthGreaterThanOrEqualTo(String value) {
            addCriterion("bill_month >=", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthLessThan(String value) {
            addCriterion("bill_month <", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthLessThanOrEqualTo(String value) {
            addCriterion("bill_month <=", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthLike(String value) {
            addCriterion("bill_month like", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotLike(String value) {
            addCriterion("bill_month not like", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthIn(List<String> values) {
            addCriterion("bill_month in", values, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotIn(List<String> values) {
            addCriterion("bill_month not in", values, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthBetween(String value1, String value2) {
            addCriterion("bill_month between", value1, value2, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotBetween(String value1, String value2) {
            addCriterion("bill_month not between", value1, value2, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryIsNull() {
            addCriterion("business_category is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryIsNotNull() {
            addCriterion("business_category is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryEqualTo(String value) {
            addCriterion("business_category =", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotEqualTo(String value) {
            addCriterion("business_category <>", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryGreaterThan(String value) {
            addCriterion("business_category >", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("business_category >=", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryLessThan(String value) {
            addCriterion("business_category <", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryLessThanOrEqualTo(String value) {
            addCriterion("business_category <=", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryLike(String value) {
            addCriterion("business_category like", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotLike(String value) {
            addCriterion("business_category not like", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryIn(List<String> values) {
            addCriterion("business_category in", values, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotIn(List<String> values) {
            addCriterion("business_category not in", values, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryBetween(String value1, String value2) {
            addCriterion("business_category between", value1, value2, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotBetween(String value1, String value2) {
            addCriterion("business_category not between", value1, value2, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andSapidIsNull() {
            addCriterion("sapid is null");
            return (Criteria) this;
        }

        public Criteria andSapidIsNotNull() {
            addCriterion("sapid is not null");
            return (Criteria) this;
        }

        public Criteria andSapidEqualTo(String value) {
            addCriterion("sapid =", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotEqualTo(String value) {
            addCriterion("sapid <>", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidGreaterThan(String value) {
            addCriterion("sapid >", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidGreaterThanOrEqualTo(String value) {
            addCriterion("sapid >=", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLessThan(String value) {
            addCriterion("sapid <", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLessThanOrEqualTo(String value) {
            addCriterion("sapid <=", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLike(String value) {
            addCriterion("sapid like", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotLike(String value) {
            addCriterion("sapid not like", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidIn(List<String> values) {
            addCriterion("sapid in", values, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotIn(List<String> values) {
            addCriterion("sapid not in", values, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidBetween(String value1, String value2) {
            addCriterion("sapid between", value1, value2, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotBetween(String value1, String value2) {
            addCriterion("sapid not between", value1, value2, "sapid");
            return (Criteria) this;
        }

        public Criteria andContractPathIsNull() {
            addCriterion("contract_path is null");
            return (Criteria) this;
        }

        public Criteria andContractPathIsNotNull() {
            addCriterion("contract_path is not null");
            return (Criteria) this;
        }

        public Criteria andContractPathEqualTo(String value) {
            addCriterion("contract_path =", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotEqualTo(String value) {
            addCriterion("contract_path <>", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathGreaterThan(String value) {
            addCriterion("contract_path >", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathGreaterThanOrEqualTo(String value) {
            addCriterion("contract_path >=", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathLessThan(String value) {
            addCriterion("contract_path <", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathLessThanOrEqualTo(String value) {
            addCriterion("contract_path <=", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathLike(String value) {
            addCriterion("contract_path like", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotLike(String value) {
            addCriterion("contract_path not like", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathIn(List<String> values) {
            addCriterion("contract_path in", values, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotIn(List<String> values) {
            addCriterion("contract_path not in", values, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathBetween(String value1, String value2) {
            addCriterion("contract_path between", value1, value2, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotBetween(String value1, String value2) {
            addCriterion("contract_path not between", value1, value2, "contractPath");
            return (Criteria) this;
        }

        public Criteria andStartMonthIsNull() {
            addCriterion("start_month is null");
            return (Criteria) this;
        }

        public Criteria andStartMonthIsNotNull() {
            addCriterion("start_month is not null");
            return (Criteria) this;
        }

        public Criteria andStartMonthEqualTo(String value) {
            addCriterion("start_month =", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthNotEqualTo(String value) {
            addCriterion("start_month <>", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthGreaterThan(String value) {
            addCriterion("start_month >", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthGreaterThanOrEqualTo(String value) {
            addCriterion("start_month >=", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthLessThan(String value) {
            addCriterion("start_month <", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthLessThanOrEqualTo(String value) {
            addCriterion("start_month <=", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthLike(String value) {
            addCriterion("start_month like", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthNotLike(String value) {
            addCriterion("start_month not like", value, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthIn(List<String> values) {
            addCriterion("start_month in", values, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthNotIn(List<String> values) {
            addCriterion("start_month not in", values, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthBetween(String value1, String value2) {
            addCriterion("start_month between", value1, value2, "startMonth");
            return (Criteria) this;
        }

        public Criteria andStartMonthNotBetween(String value1, String value2) {
            addCriterion("start_month not between", value1, value2, "startMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthIsNull() {
            addCriterion("end_month is null");
            return (Criteria) this;
        }

        public Criteria andEndMonthIsNotNull() {
            addCriterion("end_month is not null");
            return (Criteria) this;
        }

        public Criteria andEndMonthEqualTo(String value) {
            addCriterion("end_month =", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthNotEqualTo(String value) {
            addCriterion("end_month <>", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthGreaterThan(String value) {
            addCriterion("end_month >", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthGreaterThanOrEqualTo(String value) {
            addCriterion("end_month >=", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthLessThan(String value) {
            addCriterion("end_month <", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthLessThanOrEqualTo(String value) {
            addCriterion("end_month <=", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthLike(String value) {
            addCriterion("end_month like", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthNotLike(String value) {
            addCriterion("end_month not like", value, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthIn(List<String> values) {
            addCriterion("end_month in", values, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthNotIn(List<String> values) {
            addCriterion("end_month not in", values, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthBetween(String value1, String value2) {
            addCriterion("end_month between", value1, value2, "endMonth");
            return (Criteria) this;
        }

        public Criteria andEndMonthNotBetween(String value1, String value2) {
            addCriterion("end_month not between", value1, value2, "endMonth");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("bill_type like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("bill_type not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
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

        public Criteria andChargeInoutTypeIsNull() {
            addCriterion("charge_inout_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeIsNotNull() {
            addCriterion("charge_inout_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeEqualTo(String value) {
            addCriterion("charge_inout_type =", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotEqualTo(String value) {
            addCriterion("charge_inout_type <>", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeGreaterThan(String value) {
            addCriterion("charge_inout_type >", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_inout_type >=", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeLessThan(String value) {
            addCriterion("charge_inout_type <", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_inout_type <=", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeLike(String value) {
            addCriterion("charge_inout_type like", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotLike(String value) {
            addCriterion("charge_inout_type not like", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeIn(List<String> values) {
            addCriterion("charge_inout_type in", values, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotIn(List<String> values) {
            addCriterion("charge_inout_type not in", values, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeBetween(String value1, String value2) {
            addCriterion("charge_inout_type between", value1, value2, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotBetween(String value1, String value2) {
            addCriterion("charge_inout_type not between", value1, value2, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargecodeIsNull() {
            addCriterion("chargecode is null");
            return (Criteria) this;
        }

        public Criteria andChargecodeIsNotNull() {
            addCriterion("chargecode is not null");
            return (Criteria) this;
        }

        public Criteria andChargecodeEqualTo(String value) {
            addCriterion("chargecode =", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotEqualTo(String value) {
            addCriterion("chargecode <>", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeGreaterThan(String value) {
            addCriterion("chargecode >", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeGreaterThanOrEqualTo(String value) {
            addCriterion("chargecode >=", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLessThan(String value) {
            addCriterion("chargecode <", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLessThanOrEqualTo(String value) {
            addCriterion("chargecode <=", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLike(String value) {
            addCriterion("chargecode like", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotLike(String value) {
            addCriterion("chargecode not like", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeIn(List<String> values) {
            addCriterion("chargecode in", values, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotIn(List<String> values) {
            addCriterion("chargecode not in", values, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeBetween(String value1, String value2) {
            addCriterion("chargecode between", value1, value2, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotBetween(String value1, String value2) {
            addCriterion("chargecode not between", value1, value2, "chargecode");
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

        public Criteria andFormulaTypeIsNull() {
            addCriterion("formula_type is null");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeIsNotNull() {
            addCriterion("formula_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeEqualTo(String value) {
            addCriterion("formula_type =", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeNotEqualTo(String value) {
            addCriterion("formula_type <>", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeGreaterThan(String value) {
            addCriterion("formula_type >", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("formula_type >=", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeLessThan(String value) {
            addCriterion("formula_type <", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeLessThanOrEqualTo(String value) {
            addCriterion("formula_type <=", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeLike(String value) {
            addCriterion("formula_type like", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeNotLike(String value) {
            addCriterion("formula_type not like", value, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeIn(List<String> values) {
            addCriterion("formula_type in", values, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeNotIn(List<String> values) {
            addCriterion("formula_type not in", values, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeBetween(String value1, String value2) {
            addCriterion("formula_type between", value1, value2, "formulaType");
            return (Criteria) this;
        }

        public Criteria andFormulaTypeNotBetween(String value1, String value2) {
            addCriterion("formula_type not between", value1, value2, "formulaType");
            return (Criteria) this;
        }

        public Criteria andDayNumberIsNull() {
            addCriterion("day_number is null");
            return (Criteria) this;
        }

        public Criteria andDayNumberIsNotNull() {
            addCriterion("day_number is not null");
            return (Criteria) this;
        }

        public Criteria andDayNumberEqualTo(BigDecimal value) {
            addCriterion("day_number =", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberNotEqualTo(BigDecimal value) {
            addCriterion("day_number <>", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberGreaterThan(BigDecimal value) {
            addCriterion("day_number >", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("day_number >=", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberLessThan(BigDecimal value) {
            addCriterion("day_number <", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("day_number <=", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberIn(List<BigDecimal> values) {
            addCriterion("day_number in", values, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberNotIn(List<BigDecimal> values) {
            addCriterion("day_number not in", values, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_number between", value1, value2, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_number not between", value1, value2, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeIsNull() {
            addCriterion("real_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeIsNotNull() {
            addCriterion("real_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeEqualTo(String value) {
            addCriterion("real_currency_type =", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotEqualTo(String value) {
            addCriterion("real_currency_type <>", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeGreaterThan(String value) {
            addCriterion("real_currency_type >", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("real_currency_type >=", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeLessThan(String value) {
            addCriterion("real_currency_type <", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("real_currency_type <=", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeLike(String value) {
            addCriterion("real_currency_type like", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotLike(String value) {
            addCriterion("real_currency_type not like", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeIn(List<String> values) {
            addCriterion("real_currency_type in", values, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotIn(List<String> values) {
            addCriterion("real_currency_type not in", values, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeBetween(String value1, String value2) {
            addCriterion("real_currency_type between", value1, value2, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("real_currency_type not between", value1, value2, "realCurrencyType");
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

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdIsNull() {
            addCriterion("tax_amount_usd is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdIsNotNull() {
            addCriterion("tax_amount_usd is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd =", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd <>", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdGreaterThan(BigDecimal value) {
            addCriterion("tax_amount_usd >", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd >=", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdLessThan(BigDecimal value) {
            addCriterion("tax_amount_usd <", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd <=", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdIn(List<BigDecimal> values) {
            addCriterion("tax_amount_usd in", values, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount_usd not in", values, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_usd between", value1, value2, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_usd not between", value1, value2, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbIsNull() {
            addCriterion("tax_amount_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbIsNotNull() {
            addCriterion("tax_amount_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb =", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb <>", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbGreaterThan(BigDecimal value) {
            addCriterion("tax_amount_rmb >", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb >=", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbLessThan(BigDecimal value) {
            addCriterion("tax_amount_rmb <", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb <=", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbIn(List<BigDecimal> values) {
            addCriterion("tax_amount_rmb in", values, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount_rmb not in", values, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_rmb between", value1, value2, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_rmb not between", value1, value2, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdIsNull() {
            addCriterion("real_tax_total_cost_usd is null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdIsNotNull() {
            addCriterion("real_tax_total_cost_usd is not null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usd =", value, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdNotEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usd <>", value, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdGreaterThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_usd >", value, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usd >=", value, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdLessThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_usd <", value, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usd <=", value, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_usd in", values, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdNotIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_usd not in", values, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_usd between", value1, value2, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_usd not between", value1, value2, "realTaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdIsNull() {
            addCriterion("real_notax_total_cost_usd is null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdIsNotNull() {
            addCriterion("real_notax_total_cost_usd is not null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usd =", value, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdNotEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usd <>", value, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdGreaterThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_usd >", value, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usd >=", value, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdLessThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_usd <", value, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usd <=", value, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_usd in", values, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdNotIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_usd not in", values, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_usd between", value1, value2, "realNotaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_usd not between", value1, value2, "realNotaxTotalCostUsd");
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

        public Criteria andBillAuditorIsNull() {
            addCriterion("bill_auditor is null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorIsNotNull() {
            addCriterion("bill_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorEqualTo(Integer value) {
            addCriterion("bill_auditor =", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorNotEqualTo(Integer value) {
            addCriterion("bill_auditor <>", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorGreaterThan(Integer value) {
            addCriterion("bill_auditor >", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_auditor >=", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorLessThan(Integer value) {
            addCriterion("bill_auditor <", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorLessThanOrEqualTo(Integer value) {
            addCriterion("bill_auditor <=", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorIn(List<Integer> values) {
            addCriterion("bill_auditor in", values, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorNotIn(List<Integer> values) {
            addCriterion("bill_auditor not in", values, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorBetween(Integer value1, Integer value2) {
            addCriterion("bill_auditor between", value1, value2, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_auditor not between", value1, value2, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeIsNull() {
            addCriterion("bill_auditor_time is null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeIsNotNull() {
            addCriterion("bill_auditor_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeEqualTo(Date value) {
            addCriterion("bill_auditor_time =", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeNotEqualTo(Date value) {
            addCriterion("bill_auditor_time <>", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeGreaterThan(Date value) {
            addCriterion("bill_auditor_time >", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_auditor_time >=", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeLessThan(Date value) {
            addCriterion("bill_auditor_time <", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_auditor_time <=", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeIn(List<Date> values) {
            addCriterion("bill_auditor_time in", values, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeNotIn(List<Date> values) {
            addCriterion("bill_auditor_time not in", values, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeBetween(Date value1, Date value2) {
            addCriterion("bill_auditor_time between", value1, value2, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_auditor_time not between", value1, value2, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnIsNull() {
            addCriterion("bill_return is null");
            return (Criteria) this;
        }

        public Criteria andBillReturnIsNotNull() {
            addCriterion("bill_return is not null");
            return (Criteria) this;
        }

        public Criteria andBillReturnEqualTo(Integer value) {
            addCriterion("bill_return =", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnNotEqualTo(Integer value) {
            addCriterion("bill_return <>", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnGreaterThan(Integer value) {
            addCriterion("bill_return >", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_return >=", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnLessThan(Integer value) {
            addCriterion("bill_return <", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnLessThanOrEqualTo(Integer value) {
            addCriterion("bill_return <=", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnIn(List<Integer> values) {
            addCriterion("bill_return in", values, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnNotIn(List<Integer> values) {
            addCriterion("bill_return not in", values, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnBetween(Integer value1, Integer value2) {
            addCriterion("bill_return between", value1, value2, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_return not between", value1, value2, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeIsNull() {
            addCriterion("bill_return_time is null");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeIsNotNull() {
            addCriterion("bill_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeEqualTo(Date value) {
            addCriterion("bill_return_time =", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeNotEqualTo(Date value) {
            addCriterion("bill_return_time <>", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeGreaterThan(Date value) {
            addCriterion("bill_return_time >", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_return_time >=", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeLessThan(Date value) {
            addCriterion("bill_return_time <", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_return_time <=", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeIn(List<Date> values) {
            addCriterion("bill_return_time in", values, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeNotIn(List<Date> values) {
            addCriterion("bill_return_time not in", values, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeBetween(Date value1, Date value2) {
            addCriterion("bill_return_time between", value1, value2, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_return_time not between", value1, value2, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonIsNull() {
            addCriterion("bill_return_reason is null");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonIsNotNull() {
            addCriterion("bill_return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonEqualTo(String value) {
            addCriterion("bill_return_reason =", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotEqualTo(String value) {
            addCriterion("bill_return_reason <>", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonGreaterThan(String value) {
            addCriterion("bill_return_reason >", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("bill_return_reason >=", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonLessThan(String value) {
            addCriterion("bill_return_reason <", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("bill_return_reason <=", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonLike(String value) {
            addCriterion("bill_return_reason like", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotLike(String value) {
            addCriterion("bill_return_reason not like", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonIn(List<String> values) {
            addCriterion("bill_return_reason in", values, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotIn(List<String> values) {
            addCriterion("bill_return_reason not in", values, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonBetween(String value1, String value2) {
            addCriterion("bill_return_reason between", value1, value2, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotBetween(String value1, String value2) {
            addCriterion("bill_return_reason not between", value1, value2, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIsNull() {
            addCriterion("bill_remark is null");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIsNotNull() {
            addCriterion("bill_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBillRemarkEqualTo(String value) {
            addCriterion("bill_remark =", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotEqualTo(String value) {
            addCriterion("bill_remark <>", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkGreaterThan(String value) {
            addCriterion("bill_remark >", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bill_remark >=", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLessThan(String value) {
            addCriterion("bill_remark <", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLessThanOrEqualTo(String value) {
            addCriterion("bill_remark <=", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLike(String value) {
            addCriterion("bill_remark like", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotLike(String value) {
            addCriterion("bill_remark not like", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIn(List<String> values) {
            addCriterion("bill_remark in", values, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotIn(List<String> values) {
            addCriterion("bill_remark not in", values, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkBetween(String value1, String value2) {
            addCriterion("bill_remark between", value1, value2, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotBetween(String value1, String value2) {
            addCriterion("bill_remark not between", value1, value2, "billRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnIsNull() {
            addCriterion("finance_return is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnIsNotNull() {
            addCriterion("finance_return is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnEqualTo(Integer value) {
            addCriterion("finance_return =", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnNotEqualTo(Integer value) {
            addCriterion("finance_return <>", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnGreaterThan(Integer value) {
            addCriterion("finance_return >", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_return >=", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnLessThan(Integer value) {
            addCriterion("finance_return <", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnLessThanOrEqualTo(Integer value) {
            addCriterion("finance_return <=", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnIn(List<Integer> values) {
            addCriterion("finance_return in", values, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnNotIn(List<Integer> values) {
            addCriterion("finance_return not in", values, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnBetween(Integer value1, Integer value2) {
            addCriterion("finance_return between", value1, value2, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_return not between", value1, value2, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeIsNull() {
            addCriterion("finance_return_time is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeIsNotNull() {
            addCriterion("finance_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeEqualTo(Date value) {
            addCriterion("finance_return_time =", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeNotEqualTo(Date value) {
            addCriterion("finance_return_time <>", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeGreaterThan(Date value) {
            addCriterion("finance_return_time >", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finance_return_time >=", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeLessThan(Date value) {
            addCriterion("finance_return_time <", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("finance_return_time <=", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeIn(List<Date> values) {
            addCriterion("finance_return_time in", values, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeNotIn(List<Date> values) {
            addCriterion("finance_return_time not in", values, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeBetween(Date value1, Date value2) {
            addCriterion("finance_return_time between", value1, value2, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("finance_return_time not between", value1, value2, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonIsNull() {
            addCriterion("finance_return_reason is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonIsNotNull() {
            addCriterion("finance_return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonEqualTo(String value) {
            addCriterion("finance_return_reason =", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotEqualTo(String value) {
            addCriterion("finance_return_reason <>", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonGreaterThan(String value) {
            addCriterion("finance_return_reason >", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("finance_return_reason >=", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonLessThan(String value) {
            addCriterion("finance_return_reason <", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("finance_return_reason <=", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonLike(String value) {
            addCriterion("finance_return_reason like", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotLike(String value) {
            addCriterion("finance_return_reason not like", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonIn(List<String> values) {
            addCriterion("finance_return_reason in", values, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotIn(List<String> values) {
            addCriterion("finance_return_reason not in", values, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonBetween(String value1, String value2) {
            addCriterion("finance_return_reason between", value1, value2, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotBetween(String value1, String value2) {
            addCriterion("finance_return_reason not between", value1, value2, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkIsNull() {
            addCriterion("finance_remark is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkIsNotNull() {
            addCriterion("finance_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkEqualTo(String value) {
            addCriterion("finance_remark =", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotEqualTo(String value) {
            addCriterion("finance_remark <>", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkGreaterThan(String value) {
            addCriterion("finance_remark >", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("finance_remark >=", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkLessThan(String value) {
            addCriterion("finance_remark <", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkLessThanOrEqualTo(String value) {
            addCriterion("finance_remark <=", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkLike(String value) {
            addCriterion("finance_remark like", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotLike(String value) {
            addCriterion("finance_remark not like", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkIn(List<String> values) {
            addCriterion("finance_remark in", values, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotIn(List<String> values) {
            addCriterion("finance_remark not in", values, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkBetween(String value1, String value2) {
            addCriterion("finance_remark between", value1, value2, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotBetween(String value1, String value2) {
            addCriterion("finance_remark not between", value1, value2, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andCreateNodeIsNull() {
            addCriterion("create_node is null");
            return (Criteria) this;
        }

        public Criteria andCreateNodeIsNotNull() {
            addCriterion("create_node is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNodeEqualTo(String value) {
            addCriterion("create_node =", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotEqualTo(String value) {
            addCriterion("create_node <>", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeGreaterThan(String value) {
            addCriterion("create_node >", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeGreaterThanOrEqualTo(String value) {
            addCriterion("create_node >=", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeLessThan(String value) {
            addCriterion("create_node <", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeLessThanOrEqualTo(String value) {
            addCriterion("create_node <=", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeLike(String value) {
            addCriterion("create_node like", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotLike(String value) {
            addCriterion("create_node not like", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeIn(List<String> values) {
            addCriterion("create_node in", values, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotIn(List<String> values) {
            addCriterion("create_node not in", values, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeBetween(String value1, String value2) {
            addCriterion("create_node between", value1, value2, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotBetween(String value1, String value2) {
            addCriterion("create_node not between", value1, value2, "createNode");
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

        public Criteria andVersionNoEqualTo(String value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(String value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(String value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(String value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(String value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLike(String value) {
            addCriterion("version_no like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotLike(String value) {
            addCriterion("version_no not like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<String> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<String> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(String value1, String value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(String value1, String value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("bill_status like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("bill_status not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusIsNull() {
            addCriterion("modify_bill_status is null");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusIsNotNull() {
            addCriterion("modify_bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusEqualTo(String value) {
            addCriterion("modify_bill_status =", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotEqualTo(String value) {
            addCriterion("modify_bill_status <>", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusGreaterThan(String value) {
            addCriterion("modify_bill_status >", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("modify_bill_status >=", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusLessThan(String value) {
            addCriterion("modify_bill_status <", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusLessThanOrEqualTo(String value) {
            addCriterion("modify_bill_status <=", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusLike(String value) {
            addCriterion("modify_bill_status like", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotLike(String value) {
            addCriterion("modify_bill_status not like", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusIn(List<String> values) {
            addCriterion("modify_bill_status in", values, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotIn(List<String> values) {
            addCriterion("modify_bill_status not in", values, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusBetween(String value1, String value2) {
            addCriterion("modify_bill_status between", value1, value2, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotBetween(String value1, String value2) {
            addCriterion("modify_bill_status not between", value1, value2, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeIsNull() {
            addCriterion("modify_bill_type is null");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeIsNotNull() {
            addCriterion("modify_bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeEqualTo(String value) {
            addCriterion("modify_bill_type =", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotEqualTo(String value) {
            addCriterion("modify_bill_type <>", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeGreaterThan(String value) {
            addCriterion("modify_bill_type >", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_bill_type >=", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeLessThan(String value) {
            addCriterion("modify_bill_type <", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeLessThanOrEqualTo(String value) {
            addCriterion("modify_bill_type <=", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeLike(String value) {
            addCriterion("modify_bill_type like", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotLike(String value) {
            addCriterion("modify_bill_type not like", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeIn(List<String> values) {
            addCriterion("modify_bill_type in", values, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotIn(List<String> values) {
            addCriterion("modify_bill_type not in", values, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeBetween(String value1, String value2) {
            addCriterion("modify_bill_type between", value1, value2, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotBetween(String value1, String value2) {
            addCriterion("modify_bill_type not between", value1, value2, "modifyBillType");
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