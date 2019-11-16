package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoolLeaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PoolLeaseExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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