package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyEdiTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CompanyEdiTypeExample() {
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

        public Criteria andProdCompanyEdiTypeIdIsNull() {
            addCriterion("prod_company_edi_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdIsNotNull() {
            addCriterion("prod_company_edi_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdEqualTo(Integer value) {
            addCriterion("prod_company_edi_type_id =", value, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdNotEqualTo(Integer value) {
            addCriterion("prod_company_edi_type_id <>", value, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdGreaterThan(Integer value) {
            addCriterion("prod_company_edi_type_id >", value, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_company_edi_type_id >=", value, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdLessThan(Integer value) {
            addCriterion("prod_company_edi_type_id <", value, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_company_edi_type_id <=", value, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdIn(List<Integer> values) {
            addCriterion("prod_company_edi_type_id in", values, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdNotIn(List<Integer> values) {
            addCriterion("prod_company_edi_type_id not in", values, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_company_edi_type_id between", value1, value2, "prodCompanyEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyEdiTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_company_edi_type_id not between", value1, value2, "prodCompanyEdiTypeId");
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

        public Criteria andEdiTypeIsNull() {
            addCriterion("edi_type is null");
            return (Criteria) this;
        }

        public Criteria andEdiTypeIsNotNull() {
            addCriterion("edi_type is not null");
            return (Criteria) this;
        }

        public Criteria andEdiTypeEqualTo(String value) {
            addCriterion("edi_type =", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotEqualTo(String value) {
            addCriterion("edi_type <>", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeGreaterThan(String value) {
            addCriterion("edi_type >", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("edi_type >=", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeLessThan(String value) {
            addCriterion("edi_type <", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeLessThanOrEqualTo(String value) {
            addCriterion("edi_type <=", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeLike(String value) {
            addCriterion("edi_type like", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotLike(String value) {
            addCriterion("edi_type not like", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeIn(List<String> values) {
            addCriterion("edi_type in", values, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotIn(List<String> values) {
            addCriterion("edi_type not in", values, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeBetween(String value1, String value2) {
            addCriterion("edi_type between", value1, value2, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotBetween(String value1, String value2) {
            addCriterion("edi_type not between", value1, value2, "ediType");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteIsNull() {
            addCriterion("is_unity_quote is null");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteIsNotNull() {
            addCriterion("is_unity_quote is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteEqualTo(String value) {
            addCriterion("is_unity_quote =", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteNotEqualTo(String value) {
            addCriterion("is_unity_quote <>", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteGreaterThan(String value) {
            addCriterion("is_unity_quote >", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("is_unity_quote >=", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteLessThan(String value) {
            addCriterion("is_unity_quote <", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteLessThanOrEqualTo(String value) {
            addCriterion("is_unity_quote <=", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteLike(String value) {
            addCriterion("is_unity_quote like", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteNotLike(String value) {
            addCriterion("is_unity_quote not like", value, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteIn(List<String> values) {
            addCriterion("is_unity_quote in", values, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteNotIn(List<String> values) {
            addCriterion("is_unity_quote not in", values, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteBetween(String value1, String value2) {
            addCriterion("is_unity_quote between", value1, value2, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andIsUnityQuoteNotBetween(String value1, String value2) {
            addCriterion("is_unity_quote not between", value1, value2, "isUnityQuote");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatIsNull() {
            addCriterion("edit_file_format is null");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatIsNotNull() {
            addCriterion("edit_file_format is not null");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatEqualTo(Integer value) {
            addCriterion("edit_file_format =", value, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatNotEqualTo(Integer value) {
            addCriterion("edit_file_format <>", value, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatGreaterThan(Integer value) {
            addCriterion("edit_file_format >", value, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_file_format >=", value, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatLessThan(Integer value) {
            addCriterion("edit_file_format <", value, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatLessThanOrEqualTo(Integer value) {
            addCriterion("edit_file_format <=", value, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatIn(List<Integer> values) {
            addCriterion("edit_file_format in", values, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatNotIn(List<Integer> values) {
            addCriterion("edit_file_format not in", values, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatBetween(Integer value1, Integer value2) {
            addCriterion("edit_file_format between", value1, value2, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEditFileFormatNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_file_format not between", value1, value2, "editFileFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatIsNull() {
            addCriterion("estimate_format is null");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatIsNotNull() {
            addCriterion("estimate_format is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatEqualTo(String value) {
            addCriterion("estimate_format =", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatNotEqualTo(String value) {
            addCriterion("estimate_format <>", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatGreaterThan(String value) {
            addCriterion("estimate_format >", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatGreaterThanOrEqualTo(String value) {
            addCriterion("estimate_format >=", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatLessThan(String value) {
            addCriterion("estimate_format <", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatLessThanOrEqualTo(String value) {
            addCriterion("estimate_format <=", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatLike(String value) {
            addCriterion("estimate_format like", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatNotLike(String value) {
            addCriterion("estimate_format not like", value, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatIn(List<String> values) {
            addCriterion("estimate_format in", values, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatNotIn(List<String> values) {
            addCriterion("estimate_format not in", values, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatBetween(String value1, String value2) {
            addCriterion("estimate_format between", value1, value2, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andEstimateFormatNotBetween(String value1, String value2) {
            addCriterion("estimate_format not between", value1, value2, "estimateFormat");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(String value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(String value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(String value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(String value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(String value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLike(String value) {
            addCriterion("send_type like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotLike(String value) {
            addCriterion("send_type not like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<String> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<String> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(String value1, String value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(String value1, String value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andEdiMethodIsNull() {
            addCriterion("edi_method is null");
            return (Criteria) this;
        }

        public Criteria andEdiMethodIsNotNull() {
            addCriterion("edi_method is not null");
            return (Criteria) this;
        }

        public Criteria andEdiMethodEqualTo(String value) {
            addCriterion("edi_method =", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodNotEqualTo(String value) {
            addCriterion("edi_method <>", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodGreaterThan(String value) {
            addCriterion("edi_method >", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodGreaterThanOrEqualTo(String value) {
            addCriterion("edi_method >=", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodLessThan(String value) {
            addCriterion("edi_method <", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodLessThanOrEqualTo(String value) {
            addCriterion("edi_method <=", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodLike(String value) {
            addCriterion("edi_method like", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodNotLike(String value) {
            addCriterion("edi_method not like", value, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodIn(List<String> values) {
            addCriterion("edi_method in", values, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodNotIn(List<String> values) {
            addCriterion("edi_method not in", values, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodBetween(String value1, String value2) {
            addCriterion("edi_method between", value1, value2, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiMethodNotBetween(String value1, String value2) {
            addCriterion("edi_method not between", value1, value2, "ediMethod");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateIsNull() {
            addCriterion("edi_file_template is null");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateIsNotNull() {
            addCriterion("edi_file_template is not null");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateEqualTo(String value) {
            addCriterion("edi_file_template =", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateNotEqualTo(String value) {
            addCriterion("edi_file_template <>", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateGreaterThan(String value) {
            addCriterion("edi_file_template >", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("edi_file_template >=", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateLessThan(String value) {
            addCriterion("edi_file_template <", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateLessThanOrEqualTo(String value) {
            addCriterion("edi_file_template <=", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateLike(String value) {
            addCriterion("edi_file_template like", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateNotLike(String value) {
            addCriterion("edi_file_template not like", value, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateIn(List<String> values) {
            addCriterion("edi_file_template in", values, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateNotIn(List<String> values) {
            addCriterion("edi_file_template not in", values, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateBetween(String value1, String value2) {
            addCriterion("edi_file_template between", value1, value2, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andEdiFileTemplateNotBetween(String value1, String value2) {
            addCriterion("edi_file_template not between", value1, value2, "ediFileTemplate");
            return (Criteria) this;
        }

        public Criteria andSendEmailIsNull() {
            addCriterion("send_email is null");
            return (Criteria) this;
        }

        public Criteria andSendEmailIsNotNull() {
            addCriterion("send_email is not null");
            return (Criteria) this;
        }

        public Criteria andSendEmailEqualTo(String value) {
            addCriterion("send_email =", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotEqualTo(String value) {
            addCriterion("send_email <>", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailGreaterThan(String value) {
            addCriterion("send_email >", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailGreaterThanOrEqualTo(String value) {
            addCriterion("send_email >=", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLessThan(String value) {
            addCriterion("send_email <", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLessThanOrEqualTo(String value) {
            addCriterion("send_email <=", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLike(String value) {
            addCriterion("send_email like", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotLike(String value) {
            addCriterion("send_email not like", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailIn(List<String> values) {
            addCriterion("send_email in", values, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotIn(List<String> values) {
            addCriterion("send_email not in", values, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailBetween(String value1, String value2) {
            addCriterion("send_email between", value1, value2, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotBetween(String value1, String value2) {
            addCriterion("send_email not between", value1, value2, "sendEmail");
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

        public Criteria andIsEnabledEqualTo(Integer value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Integer value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Integer value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Integer value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Integer> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Integer> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Integer value1, Integer value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Integer value1, Integer value2) {
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