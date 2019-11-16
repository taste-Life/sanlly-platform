package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditAutomaticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AuditAutomaticExample() {
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

        public Criteria andProdAuditAutomaticIdIsNull() {
            addCriterion("prod_audit_automatic_id is null");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdIsNotNull() {
            addCriterion("prod_audit_automatic_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdEqualTo(Integer value) {
            addCriterion("prod_audit_automatic_id =", value, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdNotEqualTo(Integer value) {
            addCriterion("prod_audit_automatic_id <>", value, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdGreaterThan(Integer value) {
            addCriterion("prod_audit_automatic_id >", value, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_audit_automatic_id >=", value, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdLessThan(Integer value) {
            addCriterion("prod_audit_automatic_id <", value, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_audit_automatic_id <=", value, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdIn(List<Integer> values) {
            addCriterion("prod_audit_automatic_id in", values, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdNotIn(List<Integer> values) {
            addCriterion("prod_audit_automatic_id not in", values, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_audit_automatic_id between", value1, value2, "prodAuditAutomaticId");
            return (Criteria) this;
        }

        public Criteria andProdAuditAutomaticIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_audit_automatic_id not between", value1, value2, "prodAuditAutomaticId");
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

        public Criteria andIsAuditEnableIsNull() {
            addCriterion("is_audit_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableIsNotNull() {
            addCriterion("is_audit_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableEqualTo(String value) {
            addCriterion("is_audit_enable =", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableNotEqualTo(String value) {
            addCriterion("is_audit_enable <>", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableGreaterThan(String value) {
            addCriterion("is_audit_enable >", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableGreaterThanOrEqualTo(String value) {
            addCriterion("is_audit_enable >=", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableLessThan(String value) {
            addCriterion("is_audit_enable <", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableLessThanOrEqualTo(String value) {
            addCriterion("is_audit_enable <=", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableLike(String value) {
            addCriterion("is_audit_enable like", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableNotLike(String value) {
            addCriterion("is_audit_enable not like", value, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableIn(List<String> values) {
            addCriterion("is_audit_enable in", values, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableNotIn(List<String> values) {
            addCriterion("is_audit_enable not in", values, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableBetween(String value1, String value2) {
            addCriterion("is_audit_enable between", value1, value2, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsAuditEnableNotBetween(String value1, String value2) {
            addCriterion("is_audit_enable not between", value1, value2, "isAuditEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableIsNull() {
            addCriterion("is_referra_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableIsNotNull() {
            addCriterion("is_referra_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableEqualTo(String value) {
            addCriterion("is_referra_enable =", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableNotEqualTo(String value) {
            addCriterion("is_referra_enable <>", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableGreaterThan(String value) {
            addCriterion("is_referra_enable >", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableGreaterThanOrEqualTo(String value) {
            addCriterion("is_referra_enable >=", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableLessThan(String value) {
            addCriterion("is_referra_enable <", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableLessThanOrEqualTo(String value) {
            addCriterion("is_referra_enable <=", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableLike(String value) {
            addCriterion("is_referra_enable like", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableNotLike(String value) {
            addCriterion("is_referra_enable not like", value, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableIn(List<String> values) {
            addCriterion("is_referra_enable in", values, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableNotIn(List<String> values) {
            addCriterion("is_referra_enable not in", values, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableBetween(String value1, String value2) {
            addCriterion("is_referra_enable between", value1, value2, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andIsReferraEnableNotBetween(String value1, String value2) {
            addCriterion("is_referra_enable not between", value1, value2, "isReferraEnable");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyIsNull() {
            addCriterion("referra_money is null");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyIsNotNull() {
            addCriterion("referra_money is not null");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyEqualTo(BigDecimal value) {
            addCriterion("referra_money =", value, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyNotEqualTo(BigDecimal value) {
            addCriterion("referra_money <>", value, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyGreaterThan(BigDecimal value) {
            addCriterion("referra_money >", value, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("referra_money >=", value, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyLessThan(BigDecimal value) {
            addCriterion("referra_money <", value, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("referra_money <=", value, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyIn(List<BigDecimal> values) {
            addCriterion("referra_money in", values, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyNotIn(List<BigDecimal> values) {
            addCriterion("referra_money not in", values, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("referra_money between", value1, value2, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andReferraMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("referra_money not between", value1, value2, "referraMoney");
            return (Criteria) this;
        }

        public Criteria andIsRestrictIsNull() {
            addCriterion("is_restrict is null");
            return (Criteria) this;
        }

        public Criteria andIsRestrictIsNotNull() {
            addCriterion("is_restrict is not null");
            return (Criteria) this;
        }

        public Criteria andIsRestrictEqualTo(String value) {
            addCriterion("is_restrict =", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictNotEqualTo(String value) {
            addCriterion("is_restrict <>", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictGreaterThan(String value) {
            addCriterion("is_restrict >", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictGreaterThanOrEqualTo(String value) {
            addCriterion("is_restrict >=", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictLessThan(String value) {
            addCriterion("is_restrict <", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictLessThanOrEqualTo(String value) {
            addCriterion("is_restrict <=", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictLike(String value) {
            addCriterion("is_restrict like", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictNotLike(String value) {
            addCriterion("is_restrict not like", value, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictIn(List<String> values) {
            addCriterion("is_restrict in", values, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictNotIn(List<String> values) {
            addCriterion("is_restrict not in", values, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictBetween(String value1, String value2) {
            addCriterion("is_restrict between", value1, value2, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsRestrictNotBetween(String value1, String value2) {
            addCriterion("is_restrict not between", value1, value2, "isRestrict");
            return (Criteria) this;
        }

        public Criteria andIsInspectorIsNull() {
            addCriterion("is_inspector is null");
            return (Criteria) this;
        }

        public Criteria andIsInspectorIsNotNull() {
            addCriterion("is_inspector is not null");
            return (Criteria) this;
        }

        public Criteria andIsInspectorEqualTo(String value) {
            addCriterion("is_inspector =", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorNotEqualTo(String value) {
            addCriterion("is_inspector <>", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorGreaterThan(String value) {
            addCriterion("is_inspector >", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorGreaterThanOrEqualTo(String value) {
            addCriterion("is_inspector >=", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorLessThan(String value) {
            addCriterion("is_inspector <", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorLessThanOrEqualTo(String value) {
            addCriterion("is_inspector <=", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorLike(String value) {
            addCriterion("is_inspector like", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorNotLike(String value) {
            addCriterion("is_inspector not like", value, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorIn(List<String> values) {
            addCriterion("is_inspector in", values, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorNotIn(List<String> values) {
            addCriterion("is_inspector not in", values, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorBetween(String value1, String value2) {
            addCriterion("is_inspector between", value1, value2, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsInspectorNotBetween(String value1, String value2) {
            addCriterion("is_inspector not between", value1, value2, "isInspector");
            return (Criteria) this;
        }

        public Criteria andIsQuotedIsNull() {
            addCriterion("is_quoted is null");
            return (Criteria) this;
        }

        public Criteria andIsQuotedIsNotNull() {
            addCriterion("is_quoted is not null");
            return (Criteria) this;
        }

        public Criteria andIsQuotedEqualTo(String value) {
            addCriterion("is_quoted =", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedNotEqualTo(String value) {
            addCriterion("is_quoted <>", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedGreaterThan(String value) {
            addCriterion("is_quoted >", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedGreaterThanOrEqualTo(String value) {
            addCriterion("is_quoted >=", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedLessThan(String value) {
            addCriterion("is_quoted <", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedLessThanOrEqualTo(String value) {
            addCriterion("is_quoted <=", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedLike(String value) {
            addCriterion("is_quoted like", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedNotLike(String value) {
            addCriterion("is_quoted not like", value, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedIn(List<String> values) {
            addCriterion("is_quoted in", values, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedNotIn(List<String> values) {
            addCriterion("is_quoted not in", values, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedBetween(String value1, String value2) {
            addCriterion("is_quoted between", value1, value2, "isQuoted");
            return (Criteria) this;
        }

        public Criteria andIsQuotedNotBetween(String value1, String value2) {
            addCriterion("is_quoted not between", value1, value2, "isQuoted");
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