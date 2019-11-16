package com.sanlly.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatterTenderPurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MatterTenderPurchaseExample() {
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

        public Criteria andPurcMatterTenderPurchaseIdIsNull() {
            addCriterion("purc_matter_tender_purchase_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdIsNotNull() {
            addCriterion("purc_matter_tender_purchase_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdEqualTo(Integer value) {
            addCriterion("purc_matter_tender_purchase_id =", value, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdNotEqualTo(Integer value) {
            addCriterion("purc_matter_tender_purchase_id <>", value, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdGreaterThan(Integer value) {
            addCriterion("purc_matter_tender_purchase_id >", value, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_tender_purchase_id >=", value, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdLessThan(Integer value) {
            addCriterion("purc_matter_tender_purchase_id <", value, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_tender_purchase_id <=", value, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdIn(List<Integer> values) {
            addCriterion("purc_matter_tender_purchase_id in", values, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdNotIn(List<Integer> values) {
            addCriterion("purc_matter_tender_purchase_id not in", values, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_tender_purchase_id between", value1, value2, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderPurchaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_tender_purchase_id not between", value1, value2, "purcMatterTenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseIsNull() {
            addCriterion("is_day_pruchase is null");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseIsNotNull() {
            addCriterion("is_day_pruchase is not null");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseEqualTo(String value) {
            addCriterion("is_day_pruchase =", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotEqualTo(String value) {
            addCriterion("is_day_pruchase <>", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseGreaterThan(String value) {
            addCriterion("is_day_pruchase >", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseGreaterThanOrEqualTo(String value) {
            addCriterion("is_day_pruchase >=", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseLessThan(String value) {
            addCriterion("is_day_pruchase <", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseLessThanOrEqualTo(String value) {
            addCriterion("is_day_pruchase <=", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseLike(String value) {
            addCriterion("is_day_pruchase like", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotLike(String value) {
            addCriterion("is_day_pruchase not like", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseIn(List<String> values) {
            addCriterion("is_day_pruchase in", values, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotIn(List<String> values) {
            addCriterion("is_day_pruchase not in", values, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseBetween(String value1, String value2) {
            addCriterion("is_day_pruchase between", value1, value2, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotBetween(String value1, String value2) {
            addCriterion("is_day_pruchase not between", value1, value2, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andTenderNameIsNull() {
            addCriterion("tender_name is null");
            return (Criteria) this;
        }

        public Criteria andTenderNameIsNotNull() {
            addCriterion("tender_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenderNameEqualTo(String value) {
            addCriterion("tender_name =", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameNotEqualTo(String value) {
            addCriterion("tender_name <>", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameGreaterThan(String value) {
            addCriterion("tender_name >", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("tender_name >=", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameLessThan(String value) {
            addCriterion("tender_name <", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameLessThanOrEqualTo(String value) {
            addCriterion("tender_name <=", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameLike(String value) {
            addCriterion("tender_name like", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameNotLike(String value) {
            addCriterion("tender_name not like", value, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameIn(List<String> values) {
            addCriterion("tender_name in", values, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameNotIn(List<String> values) {
            addCriterion("tender_name not in", values, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameBetween(String value1, String value2) {
            addCriterion("tender_name between", value1, value2, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderNameNotBetween(String value1, String value2) {
            addCriterion("tender_name not between", value1, value2, "tenderName");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNull() {
            addCriterion("tender_id is null");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNotNull() {
            addCriterion("tender_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenderIdEqualTo(String value) {
            addCriterion("tender_id =", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotEqualTo(String value) {
            addCriterion("tender_id <>", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThan(String value) {
            addCriterion("tender_id >", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("tender_id >=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThan(String value) {
            addCriterion("tender_id <", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThanOrEqualTo(String value) {
            addCriterion("tender_id <=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLike(String value) {
            addCriterion("tender_id like", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotLike(String value) {
            addCriterion("tender_id not like", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdIn(List<String> values) {
            addCriterion("tender_id in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotIn(List<String> values) {
            addCriterion("tender_id not in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdBetween(String value1, String value2) {
            addCriterion("tender_id between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotBetween(String value1, String value2) {
            addCriterion("tender_id not between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderTypeIsNull() {
            addCriterion("tender_type is null");
            return (Criteria) this;
        }

        public Criteria andTenderTypeIsNotNull() {
            addCriterion("tender_type is not null");
            return (Criteria) this;
        }

        public Criteria andTenderTypeEqualTo(String value) {
            addCriterion("tender_type =", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotEqualTo(String value) {
            addCriterion("tender_type <>", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeGreaterThan(String value) {
            addCriterion("tender_type >", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tender_type >=", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeLessThan(String value) {
            addCriterion("tender_type <", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeLessThanOrEqualTo(String value) {
            addCriterion("tender_type <=", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeLike(String value) {
            addCriterion("tender_type like", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotLike(String value) {
            addCriterion("tender_type not like", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeIn(List<String> values) {
            addCriterion("tender_type in", values, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotIn(List<String> values) {
            addCriterion("tender_type not in", values, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeBetween(String value1, String value2) {
            addCriterion("tender_type between", value1, value2, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotBetween(String value1, String value2) {
            addCriterion("tender_type not between", value1, value2, "tenderType");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyIsNull() {
            addCriterion("purchase_company is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyIsNotNull() {
            addCriterion("purchase_company is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyEqualTo(String value) {
            addCriterion("purchase_company =", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotEqualTo(String value) {
            addCriterion("purchase_company <>", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyGreaterThan(String value) {
            addCriterion("purchase_company >", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_company >=", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyLessThan(String value) {
            addCriterion("purchase_company <", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyLessThanOrEqualTo(String value) {
            addCriterion("purchase_company <=", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyLike(String value) {
            addCriterion("purchase_company like", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotLike(String value) {
            addCriterion("purchase_company not like", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyIn(List<String> values) {
            addCriterion("purchase_company in", values, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotIn(List<String> values) {
            addCriterion("purchase_company not in", values, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyBetween(String value1, String value2) {
            addCriterion("purchase_company between", value1, value2, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotBetween(String value1, String value2) {
            addCriterion("purchase_company not between", value1, value2, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNull() {
            addCriterion("contact_type is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("contact_type is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("contact_type =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(String value) {
            addCriterion("contact_type <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(String value) {
            addCriterion("contact_type >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contact_type >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(String value) {
            addCriterion("contact_type <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(String value) {
            addCriterion("contact_type <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLike(String value) {
            addCriterion("contact_type like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotLike(String value) {
            addCriterion("contact_type not like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<String> values) {
            addCriterion("contact_type in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<String> values) {
            addCriterion("contact_type not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(String value1, String value2) {
            addCriterion("contact_type between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(String value1, String value2) {
            addCriterion("contact_type not between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andTenderContentIsNull() {
            addCriterion("tender_content is null");
            return (Criteria) this;
        }

        public Criteria andTenderContentIsNotNull() {
            addCriterion("tender_content is not null");
            return (Criteria) this;
        }

        public Criteria andTenderContentEqualTo(String value) {
            addCriterion("tender_content =", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentNotEqualTo(String value) {
            addCriterion("tender_content <>", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentGreaterThan(String value) {
            addCriterion("tender_content >", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentGreaterThanOrEqualTo(String value) {
            addCriterion("tender_content >=", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentLessThan(String value) {
            addCriterion("tender_content <", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentLessThanOrEqualTo(String value) {
            addCriterion("tender_content <=", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentLike(String value) {
            addCriterion("tender_content like", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentNotLike(String value) {
            addCriterion("tender_content not like", value, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentIn(List<String> values) {
            addCriterion("tender_content in", values, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentNotIn(List<String> values) {
            addCriterion("tender_content not in", values, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentBetween(String value1, String value2) {
            addCriterion("tender_content between", value1, value2, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderContentNotBetween(String value1, String value2) {
            addCriterion("tender_content not between", value1, value2, "tenderContent");
            return (Criteria) this;
        }

        public Criteria andTenderConditionIsNull() {
            addCriterion("tender_condition is null");
            return (Criteria) this;
        }

        public Criteria andTenderConditionIsNotNull() {
            addCriterion("tender_condition is not null");
            return (Criteria) this;
        }

        public Criteria andTenderConditionEqualTo(String value) {
            addCriterion("tender_condition =", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionNotEqualTo(String value) {
            addCriterion("tender_condition <>", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionGreaterThan(String value) {
            addCriterion("tender_condition >", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionGreaterThanOrEqualTo(String value) {
            addCriterion("tender_condition >=", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionLessThan(String value) {
            addCriterion("tender_condition <", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionLessThanOrEqualTo(String value) {
            addCriterion("tender_condition <=", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionLike(String value) {
            addCriterion("tender_condition like", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionNotLike(String value) {
            addCriterion("tender_condition not like", value, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionIn(List<String> values) {
            addCriterion("tender_condition in", values, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionNotIn(List<String> values) {
            addCriterion("tender_condition not in", values, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionBetween(String value1, String value2) {
            addCriterion("tender_condition between", value1, value2, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andTenderConditionNotBetween(String value1, String value2) {
            addCriterion("tender_condition not between", value1, value2, "tenderCondition");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeIsNull() {
            addCriterion("first_instance_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeIsNotNull() {
            addCriterion("first_instance_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeEqualTo(Date value) {
            addCriterion("first_instance_time =", value, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeNotEqualTo(Date value) {
            addCriterion("first_instance_time <>", value, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeGreaterThan(Date value) {
            addCriterion("first_instance_time >", value, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_instance_time >=", value, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeLessThan(Date value) {
            addCriterion("first_instance_time <", value, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_instance_time <=", value, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeIn(List<Date> values) {
            addCriterion("first_instance_time in", values, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeNotIn(List<Date> values) {
            addCriterion("first_instance_time not in", values, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeBetween(Date value1, Date value2) {
            addCriterion("first_instance_time between", value1, value2, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andFirstInstanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_instance_time not between", value1, value2, "firstInstanceTime");
            return (Criteria) this;
        }

        public Criteria andTenderMethodIsNull() {
            addCriterion("tender_method is null");
            return (Criteria) this;
        }

        public Criteria andTenderMethodIsNotNull() {
            addCriterion("tender_method is not null");
            return (Criteria) this;
        }

        public Criteria andTenderMethodEqualTo(String value) {
            addCriterion("tender_method =", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotEqualTo(String value) {
            addCriterion("tender_method <>", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodGreaterThan(String value) {
            addCriterion("tender_method >", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodGreaterThanOrEqualTo(String value) {
            addCriterion("tender_method >=", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodLessThan(String value) {
            addCriterion("tender_method <", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodLessThanOrEqualTo(String value) {
            addCriterion("tender_method <=", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodLike(String value) {
            addCriterion("tender_method like", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotLike(String value) {
            addCriterion("tender_method not like", value, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodIn(List<String> values) {
            addCriterion("tender_method in", values, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotIn(List<String> values) {
            addCriterion("tender_method not in", values, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodBetween(String value1, String value2) {
            addCriterion("tender_method between", value1, value2, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andTenderMethodNotBetween(String value1, String value2) {
            addCriterion("tender_method not between", value1, value2, "tenderMethod");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeIsNull() {
            addCriterion("supply_time is null");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeIsNotNull() {
            addCriterion("supply_time is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeEqualTo(Date value) {
            addCriterion("supply_time =", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeNotEqualTo(Date value) {
            addCriterion("supply_time <>", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeGreaterThan(Date value) {
            addCriterion("supply_time >", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("supply_time >=", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeLessThan(Date value) {
            addCriterion("supply_time <", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("supply_time <=", value, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeIn(List<Date> values) {
            addCriterion("supply_time in", values, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeNotIn(List<Date> values) {
            addCriterion("supply_time not in", values, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeBetween(Date value1, Date value2) {
            addCriterion("supply_time between", value1, value2, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("supply_time not between", value1, value2, "supplyTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeIsNull() {
            addCriterion("supply_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeIsNotNull() {
            addCriterion("supply_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeEqualTo(Date value) {
            addCriterion("supply_end_time =", value, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeNotEqualTo(Date value) {
            addCriterion("supply_end_time <>", value, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeGreaterThan(Date value) {
            addCriterion("supply_end_time >", value, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("supply_end_time >=", value, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeLessThan(Date value) {
            addCriterion("supply_end_time <", value, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("supply_end_time <=", value, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeIn(List<Date> values) {
            addCriterion("supply_end_time in", values, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeNotIn(List<Date> values) {
            addCriterion("supply_end_time not in", values, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeBetween(Date value1, Date value2) {
            addCriterion("supply_end_time between", value1, value2, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andSupplyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("supply_end_time not between", value1, value2, "supplyEndTime");
            return (Criteria) this;
        }

        public Criteria andIsPeriodIsNull() {
            addCriterion("is_period is null");
            return (Criteria) this;
        }

        public Criteria andIsPeriodIsNotNull() {
            addCriterion("is_period is not null");
            return (Criteria) this;
        }

        public Criteria andIsPeriodEqualTo(String value) {
            addCriterion("is_period =", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotEqualTo(String value) {
            addCriterion("is_period <>", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodGreaterThan(String value) {
            addCriterion("is_period >", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("is_period >=", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodLessThan(String value) {
            addCriterion("is_period <", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodLessThanOrEqualTo(String value) {
            addCriterion("is_period <=", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodLike(String value) {
            addCriterion("is_period like", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotLike(String value) {
            addCriterion("is_period not like", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodIn(List<String> values) {
            addCriterion("is_period in", values, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotIn(List<String> values) {
            addCriterion("is_period not in", values, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodBetween(String value1, String value2) {
            addCriterion("is_period between", value1, value2, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotBetween(String value1, String value2) {
            addCriterion("is_period not between", value1, value2, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andInquiryNumIsNull() {
            addCriterion("inquiry_num is null");
            return (Criteria) this;
        }

        public Criteria andInquiryNumIsNotNull() {
            addCriterion("inquiry_num is not null");
            return (Criteria) this;
        }

        public Criteria andInquiryNumEqualTo(Integer value) {
            addCriterion("inquiry_num =", value, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumNotEqualTo(Integer value) {
            addCriterion("inquiry_num <>", value, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumGreaterThan(Integer value) {
            addCriterion("inquiry_num >", value, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("inquiry_num >=", value, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumLessThan(Integer value) {
            addCriterion("inquiry_num <", value, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumLessThanOrEqualTo(Integer value) {
            addCriterion("inquiry_num <=", value, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumIn(List<Integer> values) {
            addCriterion("inquiry_num in", values, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumNotIn(List<Integer> values) {
            addCriterion("inquiry_num not in", values, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumBetween(Integer value1, Integer value2) {
            addCriterion("inquiry_num between", value1, value2, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andInquiryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("inquiry_num not between", value1, value2, "inquiryNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumIsNull() {
            addCriterion("bidding_num is null");
            return (Criteria) this;
        }

        public Criteria andBiddingNumIsNotNull() {
            addCriterion("bidding_num is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingNumEqualTo(Integer value) {
            addCriterion("bidding_num =", value, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumNotEqualTo(Integer value) {
            addCriterion("bidding_num <>", value, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumGreaterThan(Integer value) {
            addCriterion("bidding_num >", value, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bidding_num >=", value, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumLessThan(Integer value) {
            addCriterion("bidding_num <", value, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumLessThanOrEqualTo(Integer value) {
            addCriterion("bidding_num <=", value, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumIn(List<Integer> values) {
            addCriterion("bidding_num in", values, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumNotIn(List<Integer> values) {
            addCriterion("bidding_num not in", values, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumBetween(Integer value1, Integer value2) {
            addCriterion("bidding_num between", value1, value2, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bidding_num not between", value1, value2, "biddingNum");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeIsNull() {
            addCriterion("bidding_start_time is null");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeIsNotNull() {
            addCriterion("bidding_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeEqualTo(Date value) {
            addCriterion("bidding_start_time =", value, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeNotEqualTo(Date value) {
            addCriterion("bidding_start_time <>", value, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeGreaterThan(Date value) {
            addCriterion("bidding_start_time >", value, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bidding_start_time >=", value, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeLessThan(Date value) {
            addCriterion("bidding_start_time <", value, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("bidding_start_time <=", value, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeIn(List<Date> values) {
            addCriterion("bidding_start_time in", values, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeNotIn(List<Date> values) {
            addCriterion("bidding_start_time not in", values, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeBetween(Date value1, Date value2) {
            addCriterion("bidding_start_time between", value1, value2, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("bidding_start_time not between", value1, value2, "biddingStartTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeIsNull() {
            addCriterion("bidding_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeIsNotNull() {
            addCriterion("bidding_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeEqualTo(Date value) {
            addCriterion("bidding_end_time =", value, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeNotEqualTo(Date value) {
            addCriterion("bidding_end_time <>", value, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeGreaterThan(Date value) {
            addCriterion("bidding_end_time >", value, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bidding_end_time >=", value, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeLessThan(Date value) {
            addCriterion("bidding_end_time <", value, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("bidding_end_time <=", value, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeIn(List<Date> values) {
            addCriterion("bidding_end_time in", values, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeNotIn(List<Date> values) {
            addCriterion("bidding_end_time not in", values, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeBetween(Date value1, Date value2) {
            addCriterion("bidding_end_time between", value1, value2, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andBiddingEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("bidding_end_time not between", value1, value2, "biddingEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeIsNull() {
            addCriterion("tender_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeIsNotNull() {
            addCriterion("tender_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeEqualTo(Date value) {
            addCriterion("tender_end_time =", value, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeNotEqualTo(Date value) {
            addCriterion("tender_end_time <>", value, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeGreaterThan(Date value) {
            addCriterion("tender_end_time >", value, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tender_end_time >=", value, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeLessThan(Date value) {
            addCriterion("tender_end_time <", value, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("tender_end_time <=", value, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeIn(List<Date> values) {
            addCriterion("tender_end_time in", values, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeNotIn(List<Date> values) {
            addCriterion("tender_end_time not in", values, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeBetween(Date value1, Date value2) {
            addCriterion("tender_end_time between", value1, value2, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andTenderEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("tender_end_time not between", value1, value2, "tenderEndTime");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialIsNull() {
            addCriterion("is_first_trial is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialIsNotNull() {
            addCriterion("is_first_trial is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialEqualTo(String value) {
            addCriterion("is_first_trial =", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialNotEqualTo(String value) {
            addCriterion("is_first_trial <>", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialGreaterThan(String value) {
            addCriterion("is_first_trial >", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialGreaterThanOrEqualTo(String value) {
            addCriterion("is_first_trial >=", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialLessThan(String value) {
            addCriterion("is_first_trial <", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialLessThanOrEqualTo(String value) {
            addCriterion("is_first_trial <=", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialLike(String value) {
            addCriterion("is_first_trial like", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialNotLike(String value) {
            addCriterion("is_first_trial not like", value, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialIn(List<String> values) {
            addCriterion("is_first_trial in", values, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialNotIn(List<String> values) {
            addCriterion("is_first_trial not in", values, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialBetween(String value1, String value2) {
            addCriterion("is_first_trial between", value1, value2, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andIsFirstTrialNotBetween(String value1, String value2) {
            addCriterion("is_first_trial not between", value1, value2, "isFirstTrial");
            return (Criteria) this;
        }

        public Criteria andTenderStatusIsNull() {
            addCriterion("tender_status is null");
            return (Criteria) this;
        }

        public Criteria andTenderStatusIsNotNull() {
            addCriterion("tender_status is not null");
            return (Criteria) this;
        }

        public Criteria andTenderStatusEqualTo(String value) {
            addCriterion("tender_status =", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusNotEqualTo(String value) {
            addCriterion("tender_status <>", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusGreaterThan(String value) {
            addCriterion("tender_status >", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tender_status >=", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusLessThan(String value) {
            addCriterion("tender_status <", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusLessThanOrEqualTo(String value) {
            addCriterion("tender_status <=", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusLike(String value) {
            addCriterion("tender_status like", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusNotLike(String value) {
            addCriterion("tender_status not like", value, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusIn(List<String> values) {
            addCriterion("tender_status in", values, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusNotIn(List<String> values) {
            addCriterion("tender_status not in", values, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusBetween(String value1, String value2) {
            addCriterion("tender_status between", value1, value2, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andTenderStatusNotBetween(String value1, String value2) {
            addCriterion("tender_status not between", value1, value2, "tenderStatus");
            return (Criteria) this;
        }

        public Criteria andReminderIsNull() {
            addCriterion("reminder is null");
            return (Criteria) this;
        }

        public Criteria andReminderIsNotNull() {
            addCriterion("reminder is not null");
            return (Criteria) this;
        }

        public Criteria andReminderEqualTo(String value) {
            addCriterion("reminder =", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderNotEqualTo(String value) {
            addCriterion("reminder <>", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderGreaterThan(String value) {
            addCriterion("reminder >", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderGreaterThanOrEqualTo(String value) {
            addCriterion("reminder >=", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderLessThan(String value) {
            addCriterion("reminder <", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderLessThanOrEqualTo(String value) {
            addCriterion("reminder <=", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderLike(String value) {
            addCriterion("reminder like", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderNotLike(String value) {
            addCriterion("reminder not like", value, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderIn(List<String> values) {
            addCriterion("reminder in", values, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderNotIn(List<String> values) {
            addCriterion("reminder not in", values, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderBetween(String value1, String value2) {
            addCriterion("reminder between", value1, value2, "reminder");
            return (Criteria) this;
        }

        public Criteria andReminderNotBetween(String value1, String value2) {
            addCriterion("reminder not between", value1, value2, "reminder");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierIsNull() {
            addCriterion("select_supplier is null");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierIsNotNull() {
            addCriterion("select_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierEqualTo(String value) {
            addCriterion("select_supplier =", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotEqualTo(String value) {
            addCriterion("select_supplier <>", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierGreaterThan(String value) {
            addCriterion("select_supplier >", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("select_supplier >=", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierLessThan(String value) {
            addCriterion("select_supplier <", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierLessThanOrEqualTo(String value) {
            addCriterion("select_supplier <=", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierLike(String value) {
            addCriterion("select_supplier like", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotLike(String value) {
            addCriterion("select_supplier not like", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierIn(List<String> values) {
            addCriterion("select_supplier in", values, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotIn(List<String> values) {
            addCriterion("select_supplier not in", values, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierBetween(String value1, String value2) {
            addCriterion("select_supplier between", value1, value2, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotBetween(String value1, String value2) {
            addCriterion("select_supplier not between", value1, value2, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
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

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
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

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("process_instance_id like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("process_instance_id not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
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