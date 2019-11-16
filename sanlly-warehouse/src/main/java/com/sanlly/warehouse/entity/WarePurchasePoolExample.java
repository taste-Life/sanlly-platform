package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarePurchasePoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WarePurchasePoolExample() {
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

        public Criteria andWarePurchasePoolIdIsNull() {
            addCriterion("ware_purchase_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdIsNotNull() {
            addCriterion("ware_purchase_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdEqualTo(Integer value) {
            addCriterion("ware_purchase_pool_id =", value, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdNotEqualTo(Integer value) {
            addCriterion("ware_purchase_pool_id <>", value, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdGreaterThan(Integer value) {
            addCriterion("ware_purchase_pool_id >", value, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_purchase_pool_id >=", value, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdLessThan(Integer value) {
            addCriterion("ware_purchase_pool_id <", value, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_purchase_pool_id <=", value, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdIn(List<Integer> values) {
            addCriterion("ware_purchase_pool_id in", values, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdNotIn(List<Integer> values) {
            addCriterion("ware_purchase_pool_id not in", values, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_purchase_pool_id between", value1, value2, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andWarePurchasePoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_purchase_pool_id not between", value1, value2, "warePurchasePoolId");
            return (Criteria) this;
        }

        public Criteria andInteTypeIsNull() {
            addCriterion("inte_type is null");
            return (Criteria) this;
        }

        public Criteria andInteTypeIsNotNull() {
            addCriterion("inte_type is not null");
            return (Criteria) this;
        }

        public Criteria andInteTypeEqualTo(String value) {
            addCriterion("inte_type =", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeNotEqualTo(String value) {
            addCriterion("inte_type <>", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeGreaterThan(String value) {
            addCriterion("inte_type >", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inte_type >=", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeLessThan(String value) {
            addCriterion("inte_type <", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeLessThanOrEqualTo(String value) {
            addCriterion("inte_type <=", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeLike(String value) {
            addCriterion("inte_type like", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeNotLike(String value) {
            addCriterion("inte_type not like", value, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeIn(List<String> values) {
            addCriterion("inte_type in", values, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeNotIn(List<String> values) {
            addCriterion("inte_type not in", values, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeBetween(String value1, String value2) {
            addCriterion("inte_type between", value1, value2, "inteType");
            return (Criteria) this;
        }

        public Criteria andInteTypeNotBetween(String value1, String value2) {
            addCriterion("inte_type not between", value1, value2, "inteType");
            return (Criteria) this;
        }

        public Criteria andCompCdeIsNull() {
            addCriterion("comp_cde is null");
            return (Criteria) this;
        }

        public Criteria andCompCdeIsNotNull() {
            addCriterion("comp_cde is not null");
            return (Criteria) this;
        }

        public Criteria andCompCdeEqualTo(String value) {
            addCriterion("comp_cde =", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeNotEqualTo(String value) {
            addCriterion("comp_cde <>", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeGreaterThan(String value) {
            addCriterion("comp_cde >", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_cde >=", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeLessThan(String value) {
            addCriterion("comp_cde <", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeLessThanOrEqualTo(String value) {
            addCriterion("comp_cde <=", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeLike(String value) {
            addCriterion("comp_cde like", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeNotLike(String value) {
            addCriterion("comp_cde not like", value, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeIn(List<String> values) {
            addCriterion("comp_cde in", values, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeNotIn(List<String> values) {
            addCriterion("comp_cde not in", values, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeBetween(String value1, String value2) {
            addCriterion("comp_cde between", value1, value2, "compCde");
            return (Criteria) this;
        }

        public Criteria andCompCdeNotBetween(String value1, String value2) {
            addCriterion("comp_cde not between", value1, value2, "compCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeIsNull() {
            addCriterion("dept_cde is null");
            return (Criteria) this;
        }

        public Criteria andDeptCdeIsNotNull() {
            addCriterion("dept_cde is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCdeEqualTo(String value) {
            addCriterion("dept_cde =", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeNotEqualTo(String value) {
            addCriterion("dept_cde <>", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeGreaterThan(String value) {
            addCriterion("dept_cde >", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_cde >=", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeLessThan(String value) {
            addCriterion("dept_cde <", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeLessThanOrEqualTo(String value) {
            addCriterion("dept_cde <=", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeLike(String value) {
            addCriterion("dept_cde like", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeNotLike(String value) {
            addCriterion("dept_cde not like", value, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeIn(List<String> values) {
            addCriterion("dept_cde in", values, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeNotIn(List<String> values) {
            addCriterion("dept_cde not in", values, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeBetween(String value1, String value2) {
            addCriterion("dept_cde between", value1, value2, "deptCde");
            return (Criteria) this;
        }

        public Criteria andDeptCdeNotBetween(String value1, String value2) {
            addCriterion("dept_cde not between", value1, value2, "deptCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeIsNull() {
            addCriterion("pctr_cde is null");
            return (Criteria) this;
        }

        public Criteria andPctrCdeIsNotNull() {
            addCriterion("pctr_cde is not null");
            return (Criteria) this;
        }

        public Criteria andPctrCdeEqualTo(String value) {
            addCriterion("pctr_cde =", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeNotEqualTo(String value) {
            addCriterion("pctr_cde <>", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeGreaterThan(String value) {
            addCriterion("pctr_cde >", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeGreaterThanOrEqualTo(String value) {
            addCriterion("pctr_cde >=", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeLessThan(String value) {
            addCriterion("pctr_cde <", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeLessThanOrEqualTo(String value) {
            addCriterion("pctr_cde <=", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeLike(String value) {
            addCriterion("pctr_cde like", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeNotLike(String value) {
            addCriterion("pctr_cde not like", value, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeIn(List<String> values) {
            addCriterion("pctr_cde in", values, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeNotIn(List<String> values) {
            addCriterion("pctr_cde not in", values, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeBetween(String value1, String value2) {
            addCriterion("pctr_cde between", value1, value2, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andPctrCdeNotBetween(String value1, String value2) {
            addCriterion("pctr_cde not between", value1, value2, "pctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeIsNull() {
            addCriterion("cctr_cde is null");
            return (Criteria) this;
        }

        public Criteria andCctrCdeIsNotNull() {
            addCriterion("cctr_cde is not null");
            return (Criteria) this;
        }

        public Criteria andCctrCdeEqualTo(String value) {
            addCriterion("cctr_cde =", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeNotEqualTo(String value) {
            addCriterion("cctr_cde <>", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeGreaterThan(String value) {
            addCriterion("cctr_cde >", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeGreaterThanOrEqualTo(String value) {
            addCriterion("cctr_cde >=", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeLessThan(String value) {
            addCriterion("cctr_cde <", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeLessThanOrEqualTo(String value) {
            addCriterion("cctr_cde <=", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeLike(String value) {
            addCriterion("cctr_cde like", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeNotLike(String value) {
            addCriterion("cctr_cde not like", value, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeIn(List<String> values) {
            addCriterion("cctr_cde in", values, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeNotIn(List<String> values) {
            addCriterion("cctr_cde not in", values, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeBetween(String value1, String value2) {
            addCriterion("cctr_cde between", value1, value2, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andCctrCdeNotBetween(String value1, String value2) {
            addCriterion("cctr_cde not between", value1, value2, "cctrCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeIsNull() {
            addCriterion("itm_typ_cde is null");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeIsNotNull() {
            addCriterion("itm_typ_cde is not null");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeEqualTo(String value) {
            addCriterion("itm_typ_cde =", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeNotEqualTo(String value) {
            addCriterion("itm_typ_cde <>", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeGreaterThan(String value) {
            addCriterion("itm_typ_cde >", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeGreaterThanOrEqualTo(String value) {
            addCriterion("itm_typ_cde >=", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeLessThan(String value) {
            addCriterion("itm_typ_cde <", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeLessThanOrEqualTo(String value) {
            addCriterion("itm_typ_cde <=", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeLike(String value) {
            addCriterion("itm_typ_cde like", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeNotLike(String value) {
            addCriterion("itm_typ_cde not like", value, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeIn(List<String> values) {
            addCriterion("itm_typ_cde in", values, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeNotIn(List<String> values) {
            addCriterion("itm_typ_cde not in", values, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeBetween(String value1, String value2) {
            addCriterion("itm_typ_cde between", value1, value2, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andItmTypCdeNotBetween(String value1, String value2) {
            addCriterion("itm_typ_cde not between", value1, value2, "itmTypCde");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypIsNull() {
            addCriterion("legacy_doc_typ is null");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypIsNotNull() {
            addCriterion("legacy_doc_typ is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypEqualTo(String value) {
            addCriterion("legacy_doc_typ =", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypNotEqualTo(String value) {
            addCriterion("legacy_doc_typ <>", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypGreaterThan(String value) {
            addCriterion("legacy_doc_typ >", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_doc_typ >=", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypLessThan(String value) {
            addCriterion("legacy_doc_typ <", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypLessThanOrEqualTo(String value) {
            addCriterion("legacy_doc_typ <=", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypLike(String value) {
            addCriterion("legacy_doc_typ like", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypNotLike(String value) {
            addCriterion("legacy_doc_typ not like", value, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypIn(List<String> values) {
            addCriterion("legacy_doc_typ in", values, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypNotIn(List<String> values) {
            addCriterion("legacy_doc_typ not in", values, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypBetween(String value1, String value2) {
            addCriterion("legacy_doc_typ between", value1, value2, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypNotBetween(String value1, String value2) {
            addCriterion("legacy_doc_typ not between", value1, value2, "legacyDocTyp");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumIsNull() {
            addCriterion("legacy_ordr_num is null");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumIsNotNull() {
            addCriterion("legacy_ordr_num is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumEqualTo(String value) {
            addCriterion("legacy_ordr_num =", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumNotEqualTo(String value) {
            addCriterion("legacy_ordr_num <>", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumGreaterThan(String value) {
            addCriterion("legacy_ordr_num >", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_ordr_num >=", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumLessThan(String value) {
            addCriterion("legacy_ordr_num <", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumLessThanOrEqualTo(String value) {
            addCriterion("legacy_ordr_num <=", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumLike(String value) {
            addCriterion("legacy_ordr_num like", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumNotLike(String value) {
            addCriterion("legacy_ordr_num not like", value, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumIn(List<String> values) {
            addCriterion("legacy_ordr_num in", values, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumNotIn(List<String> values) {
            addCriterion("legacy_ordr_num not in", values, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumBetween(String value1, String value2) {
            addCriterion("legacy_ordr_num between", value1, value2, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrNumNotBetween(String value1, String value2) {
            addCriterion("legacy_ordr_num not between", value1, value2, "legacyOrdrNum");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdIsNull() {
            addCriterion("legacy_ordr_id is null");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdIsNotNull() {
            addCriterion("legacy_ordr_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdEqualTo(String value) {
            addCriterion("legacy_ordr_id =", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdNotEqualTo(String value) {
            addCriterion("legacy_ordr_id <>", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdGreaterThan(String value) {
            addCriterion("legacy_ordr_id >", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_ordr_id >=", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdLessThan(String value) {
            addCriterion("legacy_ordr_id <", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdLessThanOrEqualTo(String value) {
            addCriterion("legacy_ordr_id <=", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdLike(String value) {
            addCriterion("legacy_ordr_id like", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdNotLike(String value) {
            addCriterion("legacy_ordr_id not like", value, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdIn(List<String> values) {
            addCriterion("legacy_ordr_id in", values, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdNotIn(List<String> values) {
            addCriterion("legacy_ordr_id not in", values, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdBetween(String value1, String value2) {
            addCriterion("legacy_ordr_id between", value1, value2, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andLegacyOrdrIdNotBetween(String value1, String value2) {
            addCriterion("legacy_ordr_id not between", value1, value2, "legacyOrdrId");
            return (Criteria) this;
        }

        public Criteria andExpsTypIsNull() {
            addCriterion("exps_typ is null");
            return (Criteria) this;
        }

        public Criteria andExpsTypIsNotNull() {
            addCriterion("exps_typ is not null");
            return (Criteria) this;
        }

        public Criteria andExpsTypEqualTo(String value) {
            addCriterion("exps_typ =", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypNotEqualTo(String value) {
            addCriterion("exps_typ <>", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypGreaterThan(String value) {
            addCriterion("exps_typ >", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypGreaterThanOrEqualTo(String value) {
            addCriterion("exps_typ >=", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypLessThan(String value) {
            addCriterion("exps_typ <", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypLessThanOrEqualTo(String value) {
            addCriterion("exps_typ <=", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypLike(String value) {
            addCriterion("exps_typ like", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypNotLike(String value) {
            addCriterion("exps_typ not like", value, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypIn(List<String> values) {
            addCriterion("exps_typ in", values, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypNotIn(List<String> values) {
            addCriterion("exps_typ not in", values, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypBetween(String value1, String value2) {
            addCriterion("exps_typ between", value1, value2, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andExpsTypNotBetween(String value1, String value2) {
            addCriterion("exps_typ not between", value1, value2, "expsTyp");
            return (Criteria) this;
        }

        public Criteria andPlaceLocIsNull() {
            addCriterion("place_loc is null");
            return (Criteria) this;
        }

        public Criteria andPlaceLocIsNotNull() {
            addCriterion("place_loc is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceLocEqualTo(String value) {
            addCriterion("place_loc =", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocNotEqualTo(String value) {
            addCriterion("place_loc <>", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocGreaterThan(String value) {
            addCriterion("place_loc >", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocGreaterThanOrEqualTo(String value) {
            addCriterion("place_loc >=", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocLessThan(String value) {
            addCriterion("place_loc <", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocLessThanOrEqualTo(String value) {
            addCriterion("place_loc <=", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocLike(String value) {
            addCriterion("place_loc like", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocNotLike(String value) {
            addCriterion("place_loc not like", value, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocIn(List<String> values) {
            addCriterion("place_loc in", values, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocNotIn(List<String> values) {
            addCriterion("place_loc not in", values, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocBetween(String value1, String value2) {
            addCriterion("place_loc between", value1, value2, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andPlaceLocNotBetween(String value1, String value2) {
            addCriterion("place_loc not between", value1, value2, "placeLoc");
            return (Criteria) this;
        }

        public Criteria andDepotIsNull() {
            addCriterion("depot is null");
            return (Criteria) this;
        }

        public Criteria andDepotIsNotNull() {
            addCriterion("depot is not null");
            return (Criteria) this;
        }

        public Criteria andDepotEqualTo(String value) {
            addCriterion("depot =", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotEqualTo(String value) {
            addCriterion("depot <>", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotGreaterThan(String value) {
            addCriterion("depot >", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotGreaterThanOrEqualTo(String value) {
            addCriterion("depot >=", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotLessThan(String value) {
            addCriterion("depot <", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotLessThanOrEqualTo(String value) {
            addCriterion("depot <=", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotLike(String value) {
            addCriterion("depot like", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotLike(String value) {
            addCriterion("depot not like", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotIn(List<String> values) {
            addCriterion("depot in", values, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotIn(List<String> values) {
            addCriterion("depot not in", values, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotBetween(String value1, String value2) {
            addCriterion("depot between", value1, value2, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotBetween(String value1, String value2) {
            addCriterion("depot not between", value1, value2, "depot");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdIsNull() {
            addCriterion("legacy_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdIsNotNull() {
            addCriterion("legacy_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdEqualTo(String value) {
            addCriterion("legacy_cust_id =", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdNotEqualTo(String value) {
            addCriterion("legacy_cust_id <>", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdGreaterThan(String value) {
            addCriterion("legacy_cust_id >", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_cust_id >=", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdLessThan(String value) {
            addCriterion("legacy_cust_id <", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdLessThanOrEqualTo(String value) {
            addCriterion("legacy_cust_id <=", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdLike(String value) {
            addCriterion("legacy_cust_id like", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdNotLike(String value) {
            addCriterion("legacy_cust_id not like", value, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdIn(List<String> values) {
            addCriterion("legacy_cust_id in", values, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdNotIn(List<String> values) {
            addCriterion("legacy_cust_id not in", values, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdBetween(String value1, String value2) {
            addCriterion("legacy_cust_id between", value1, value2, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andLegacyCustIdNotBetween(String value1, String value2) {
            addCriterion("legacy_cust_id not between", value1, value2, "legacyCustId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdIsNull() {
            addCriterion("cust_sap_id is null");
            return (Criteria) this;
        }

        public Criteria andCustSapIdIsNotNull() {
            addCriterion("cust_sap_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustSapIdEqualTo(String value) {
            addCriterion("cust_sap_id =", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdNotEqualTo(String value) {
            addCriterion("cust_sap_id <>", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdGreaterThan(String value) {
            addCriterion("cust_sap_id >", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_sap_id >=", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdLessThan(String value) {
            addCriterion("cust_sap_id <", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdLessThanOrEqualTo(String value) {
            addCriterion("cust_sap_id <=", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdLike(String value) {
            addCriterion("cust_sap_id like", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdNotLike(String value) {
            addCriterion("cust_sap_id not like", value, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdIn(List<String> values) {
            addCriterion("cust_sap_id in", values, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdNotIn(List<String> values) {
            addCriterion("cust_sap_id not in", values, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdBetween(String value1, String value2) {
            addCriterion("cust_sap_id between", value1, value2, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustSapIdNotBetween(String value1, String value2) {
            addCriterion("cust_sap_id not between", value1, value2, "custSapId");
            return (Criteria) this;
        }

        public Criteria andCustNmeIsNull() {
            addCriterion("cust_nme is null");
            return (Criteria) this;
        }

        public Criteria andCustNmeIsNotNull() {
            addCriterion("cust_nme is not null");
            return (Criteria) this;
        }

        public Criteria andCustNmeEqualTo(String value) {
            addCriterion("cust_nme =", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeNotEqualTo(String value) {
            addCriterion("cust_nme <>", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeGreaterThan(String value) {
            addCriterion("cust_nme >", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_nme >=", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeLessThan(String value) {
            addCriterion("cust_nme <", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeLessThanOrEqualTo(String value) {
            addCriterion("cust_nme <=", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeLike(String value) {
            addCriterion("cust_nme like", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeNotLike(String value) {
            addCriterion("cust_nme not like", value, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeIn(List<String> values) {
            addCriterion("cust_nme in", values, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeNotIn(List<String> values) {
            addCriterion("cust_nme not in", values, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeBetween(String value1, String value2) {
            addCriterion("cust_nme between", value1, value2, "custNme");
            return (Criteria) this;
        }

        public Criteria andCustNmeNotBetween(String value1, String value2) {
            addCriterion("cust_nme not between", value1, value2, "custNme");
            return (Criteria) this;
        }

        public Criteria andInvTypIsNull() {
            addCriterion("inv_typ is null");
            return (Criteria) this;
        }

        public Criteria andInvTypIsNotNull() {
            addCriterion("inv_typ is not null");
            return (Criteria) this;
        }

        public Criteria andInvTypEqualTo(String value) {
            addCriterion("inv_typ =", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypNotEqualTo(String value) {
            addCriterion("inv_typ <>", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypGreaterThan(String value) {
            addCriterion("inv_typ >", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypGreaterThanOrEqualTo(String value) {
            addCriterion("inv_typ >=", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypLessThan(String value) {
            addCriterion("inv_typ <", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypLessThanOrEqualTo(String value) {
            addCriterion("inv_typ <=", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypLike(String value) {
            addCriterion("inv_typ like", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypNotLike(String value) {
            addCriterion("inv_typ not like", value, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypIn(List<String> values) {
            addCriterion("inv_typ in", values, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypNotIn(List<String> values) {
            addCriterion("inv_typ not in", values, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypBetween(String value1, String value2) {
            addCriterion("inv_typ between", value1, value2, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTypNotBetween(String value1, String value2) {
            addCriterion("inv_typ not between", value1, value2, "invTyp");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateIsNull() {
            addCriterion("inv_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateIsNotNull() {
            addCriterion("inv_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateEqualTo(String value) {
            addCriterion("inv_tax_rate =", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateNotEqualTo(String value) {
            addCriterion("inv_tax_rate <>", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateGreaterThan(String value) {
            addCriterion("inv_tax_rate >", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("inv_tax_rate >=", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateLessThan(String value) {
            addCriterion("inv_tax_rate <", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateLessThanOrEqualTo(String value) {
            addCriterion("inv_tax_rate <=", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateLike(String value) {
            addCriterion("inv_tax_rate like", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateNotLike(String value) {
            addCriterion("inv_tax_rate not like", value, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateIn(List<String> values) {
            addCriterion("inv_tax_rate in", values, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateNotIn(List<String> values) {
            addCriterion("inv_tax_rate not in", values, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateBetween(String value1, String value2) {
            addCriterion("inv_tax_rate between", value1, value2, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andInvTaxRateNotBetween(String value1, String value2) {
            addCriterion("inv_tax_rate not between", value1, value2, "invTaxRate");
            return (Criteria) this;
        }

        public Criteria andPurUsrIsNull() {
            addCriterion("pur_usr is null");
            return (Criteria) this;
        }

        public Criteria andPurUsrIsNotNull() {
            addCriterion("pur_usr is not null");
            return (Criteria) this;
        }

        public Criteria andPurUsrEqualTo(String value) {
            addCriterion("pur_usr =", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrNotEqualTo(String value) {
            addCriterion("pur_usr <>", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrGreaterThan(String value) {
            addCriterion("pur_usr >", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrGreaterThanOrEqualTo(String value) {
            addCriterion("pur_usr >=", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrLessThan(String value) {
            addCriterion("pur_usr <", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrLessThanOrEqualTo(String value) {
            addCriterion("pur_usr <=", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrLike(String value) {
            addCriterion("pur_usr like", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrNotLike(String value) {
            addCriterion("pur_usr not like", value, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrIn(List<String> values) {
            addCriterion("pur_usr in", values, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrNotIn(List<String> values) {
            addCriterion("pur_usr not in", values, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrBetween(String value1, String value2) {
            addCriterion("pur_usr between", value1, value2, "purUsr");
            return (Criteria) this;
        }

        public Criteria andPurUsrNotBetween(String value1, String value2) {
            addCriterion("pur_usr not between", value1, value2, "purUsr");
            return (Criteria) this;
        }

        public Criteria andStockLocIsNull() {
            addCriterion("stock_loc is null");
            return (Criteria) this;
        }

        public Criteria andStockLocIsNotNull() {
            addCriterion("stock_loc is not null");
            return (Criteria) this;
        }

        public Criteria andStockLocEqualTo(String value) {
            addCriterion("stock_loc =", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocNotEqualTo(String value) {
            addCriterion("stock_loc <>", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocGreaterThan(String value) {
            addCriterion("stock_loc >", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocGreaterThanOrEqualTo(String value) {
            addCriterion("stock_loc >=", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocLessThan(String value) {
            addCriterion("stock_loc <", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocLessThanOrEqualTo(String value) {
            addCriterion("stock_loc <=", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocLike(String value) {
            addCriterion("stock_loc like", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocNotLike(String value) {
            addCriterion("stock_loc not like", value, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocIn(List<String> values) {
            addCriterion("stock_loc in", values, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocNotIn(List<String> values) {
            addCriterion("stock_loc not in", values, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocBetween(String value1, String value2) {
            addCriterion("stock_loc between", value1, value2, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andStockLocNotBetween(String value1, String value2) {
            addCriterion("stock_loc not between", value1, value2, "stockLoc");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdIsNull() {
            addCriterion("legacy_vndr_id is null");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdIsNotNull() {
            addCriterion("legacy_vndr_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdEqualTo(String value) {
            addCriterion("legacy_vndr_id =", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdNotEqualTo(String value) {
            addCriterion("legacy_vndr_id <>", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdGreaterThan(String value) {
            addCriterion("legacy_vndr_id >", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_vndr_id >=", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdLessThan(String value) {
            addCriterion("legacy_vndr_id <", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdLessThanOrEqualTo(String value) {
            addCriterion("legacy_vndr_id <=", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdLike(String value) {
            addCriterion("legacy_vndr_id like", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdNotLike(String value) {
            addCriterion("legacy_vndr_id not like", value, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdIn(List<String> values) {
            addCriterion("legacy_vndr_id in", values, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdNotIn(List<String> values) {
            addCriterion("legacy_vndr_id not in", values, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdBetween(String value1, String value2) {
            addCriterion("legacy_vndr_id between", value1, value2, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andLegacyVndrIdNotBetween(String value1, String value2) {
            addCriterion("legacy_vndr_id not between", value1, value2, "legacyVndrId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdIsNull() {
            addCriterion("vndr_sap_id is null");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdIsNotNull() {
            addCriterion("vndr_sap_id is not null");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdEqualTo(String value) {
            addCriterion("vndr_sap_id =", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdNotEqualTo(String value) {
            addCriterion("vndr_sap_id <>", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdGreaterThan(String value) {
            addCriterion("vndr_sap_id >", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdGreaterThanOrEqualTo(String value) {
            addCriterion("vndr_sap_id >=", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdLessThan(String value) {
            addCriterion("vndr_sap_id <", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdLessThanOrEqualTo(String value) {
            addCriterion("vndr_sap_id <=", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdLike(String value) {
            addCriterion("vndr_sap_id like", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdNotLike(String value) {
            addCriterion("vndr_sap_id not like", value, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdIn(List<String> values) {
            addCriterion("vndr_sap_id in", values, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdNotIn(List<String> values) {
            addCriterion("vndr_sap_id not in", values, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdBetween(String value1, String value2) {
            addCriterion("vndr_sap_id between", value1, value2, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrSapIdNotBetween(String value1, String value2) {
            addCriterion("vndr_sap_id not between", value1, value2, "vndrSapId");
            return (Criteria) this;
        }

        public Criteria andVndrNmeIsNull() {
            addCriterion("vndr_nme is null");
            return (Criteria) this;
        }

        public Criteria andVndrNmeIsNotNull() {
            addCriterion("vndr_nme is not null");
            return (Criteria) this;
        }

        public Criteria andVndrNmeEqualTo(String value) {
            addCriterion("vndr_nme =", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeNotEqualTo(String value) {
            addCriterion("vndr_nme <>", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeGreaterThan(String value) {
            addCriterion("vndr_nme >", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeGreaterThanOrEqualTo(String value) {
            addCriterion("vndr_nme >=", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeLessThan(String value) {
            addCriterion("vndr_nme <", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeLessThanOrEqualTo(String value) {
            addCriterion("vndr_nme <=", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeLike(String value) {
            addCriterion("vndr_nme like", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeNotLike(String value) {
            addCriterion("vndr_nme not like", value, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeIn(List<String> values) {
            addCriterion("vndr_nme in", values, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeNotIn(List<String> values) {
            addCriterion("vndr_nme not in", values, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeBetween(String value1, String value2) {
            addCriterion("vndr_nme between", value1, value2, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andVndrNmeNotBetween(String value1, String value2) {
            addCriterion("vndr_nme not between", value1, value2, "vndrNme");
            return (Criteria) this;
        }

        public Criteria andBizDteIsNull() {
            addCriterion("biz_dte is null");
            return (Criteria) this;
        }

        public Criteria andBizDteIsNotNull() {
            addCriterion("biz_dte is not null");
            return (Criteria) this;
        }

        public Criteria andBizDteEqualTo(String value) {
            addCriterion("biz_dte =", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteNotEqualTo(String value) {
            addCriterion("biz_dte <>", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteGreaterThan(String value) {
            addCriterion("biz_dte >", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteGreaterThanOrEqualTo(String value) {
            addCriterion("biz_dte >=", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteLessThan(String value) {
            addCriterion("biz_dte <", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteLessThanOrEqualTo(String value) {
            addCriterion("biz_dte <=", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteLike(String value) {
            addCriterion("biz_dte like", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteNotLike(String value) {
            addCriterion("biz_dte not like", value, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteIn(List<String> values) {
            addCriterion("biz_dte in", values, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteNotIn(List<String> values) {
            addCriterion("biz_dte not in", values, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteBetween(String value1, String value2) {
            addCriterion("biz_dte between", value1, value2, "bizDte");
            return (Criteria) this;
        }

        public Criteria andBizDteNotBetween(String value1, String value2) {
            addCriterion("biz_dte not between", value1, value2, "bizDte");
            return (Criteria) this;
        }

        public Criteria andRefBizNumIsNull() {
            addCriterion("ref_biz_num is null");
            return (Criteria) this;
        }

        public Criteria andRefBizNumIsNotNull() {
            addCriterion("ref_biz_num is not null");
            return (Criteria) this;
        }

        public Criteria andRefBizNumEqualTo(String value) {
            addCriterion("ref_biz_num =", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumNotEqualTo(String value) {
            addCriterion("ref_biz_num <>", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumGreaterThan(String value) {
            addCriterion("ref_biz_num >", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumGreaterThanOrEqualTo(String value) {
            addCriterion("ref_biz_num >=", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumLessThan(String value) {
            addCriterion("ref_biz_num <", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumLessThanOrEqualTo(String value) {
            addCriterion("ref_biz_num <=", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumLike(String value) {
            addCriterion("ref_biz_num like", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumNotLike(String value) {
            addCriterion("ref_biz_num not like", value, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumIn(List<String> values) {
            addCriterion("ref_biz_num in", values, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumNotIn(List<String> values) {
            addCriterion("ref_biz_num not in", values, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumBetween(String value1, String value2) {
            addCriterion("ref_biz_num between", value1, value2, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andRefBizNumNotBetween(String value1, String value2) {
            addCriterion("ref_biz_num not between", value1, value2, "refBizNum");
            return (Criteria) this;
        }

        public Criteria andChrgCdeIsNull() {
            addCriterion("chrg_cde is null");
            return (Criteria) this;
        }

        public Criteria andChrgCdeIsNotNull() {
            addCriterion("chrg_cde is not null");
            return (Criteria) this;
        }

        public Criteria andChrgCdeEqualTo(String value) {
            addCriterion("chrg_cde =", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeNotEqualTo(String value) {
            addCriterion("chrg_cde <>", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeGreaterThan(String value) {
            addCriterion("chrg_cde >", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeGreaterThanOrEqualTo(String value) {
            addCriterion("chrg_cde >=", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeLessThan(String value) {
            addCriterion("chrg_cde <", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeLessThanOrEqualTo(String value) {
            addCriterion("chrg_cde <=", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeLike(String value) {
            addCriterion("chrg_cde like", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeNotLike(String value) {
            addCriterion("chrg_cde not like", value, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeIn(List<String> values) {
            addCriterion("chrg_cde in", values, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeNotIn(List<String> values) {
            addCriterion("chrg_cde not in", values, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeBetween(String value1, String value2) {
            addCriterion("chrg_cde between", value1, value2, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andChrgCdeNotBetween(String value1, String value2) {
            addCriterion("chrg_cde not between", value1, value2, "chrgCde");
            return (Criteria) this;
        }

        public Criteria andMatrlTypIsNull() {
            addCriterion("matrl_typ is null");
            return (Criteria) this;
        }

        public Criteria andMatrlTypIsNotNull() {
            addCriterion("matrl_typ is not null");
            return (Criteria) this;
        }

        public Criteria andMatrlTypEqualTo(String value) {
            addCriterion("matrl_typ =", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypNotEqualTo(String value) {
            addCriterion("matrl_typ <>", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypGreaterThan(String value) {
            addCriterion("matrl_typ >", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypGreaterThanOrEqualTo(String value) {
            addCriterion("matrl_typ >=", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypLessThan(String value) {
            addCriterion("matrl_typ <", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypLessThanOrEqualTo(String value) {
            addCriterion("matrl_typ <=", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypLike(String value) {
            addCriterion("matrl_typ like", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypNotLike(String value) {
            addCriterion("matrl_typ not like", value, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypIn(List<String> values) {
            addCriterion("matrl_typ in", values, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypNotIn(List<String> values) {
            addCriterion("matrl_typ not in", values, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypBetween(String value1, String value2) {
            addCriterion("matrl_typ between", value1, value2, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andMatrlTypNotBetween(String value1, String value2) {
            addCriterion("matrl_typ not between", value1, value2, "matrlTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypIsNull() {
            addCriterion("invtr_typ is null");
            return (Criteria) this;
        }

        public Criteria andInvtrTypIsNotNull() {
            addCriterion("invtr_typ is not null");
            return (Criteria) this;
        }

        public Criteria andInvtrTypEqualTo(String value) {
            addCriterion("invtr_typ =", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypNotEqualTo(String value) {
            addCriterion("invtr_typ <>", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypGreaterThan(String value) {
            addCriterion("invtr_typ >", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypGreaterThanOrEqualTo(String value) {
            addCriterion("invtr_typ >=", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypLessThan(String value) {
            addCriterion("invtr_typ <", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypLessThanOrEqualTo(String value) {
            addCriterion("invtr_typ <=", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypLike(String value) {
            addCriterion("invtr_typ like", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypNotLike(String value) {
            addCriterion("invtr_typ not like", value, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypIn(List<String> values) {
            addCriterion("invtr_typ in", values, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypNotIn(List<String> values) {
            addCriterion("invtr_typ not in", values, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypBetween(String value1, String value2) {
            addCriterion("invtr_typ between", value1, value2, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andInvtrTypNotBetween(String value1, String value2) {
            addCriterion("invtr_typ not between", value1, value2, "invtrTyp");
            return (Criteria) this;
        }

        public Criteria andCcyCdeIsNull() {
            addCriterion("ccy_cde is null");
            return (Criteria) this;
        }

        public Criteria andCcyCdeIsNotNull() {
            addCriterion("ccy_cde is not null");
            return (Criteria) this;
        }

        public Criteria andCcyCdeEqualTo(String value) {
            addCriterion("ccy_cde =", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeNotEqualTo(String value) {
            addCriterion("ccy_cde <>", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeGreaterThan(String value) {
            addCriterion("ccy_cde >", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeGreaterThanOrEqualTo(String value) {
            addCriterion("ccy_cde >=", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeLessThan(String value) {
            addCriterion("ccy_cde <", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeLessThanOrEqualTo(String value) {
            addCriterion("ccy_cde <=", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeLike(String value) {
            addCriterion("ccy_cde like", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeNotLike(String value) {
            addCriterion("ccy_cde not like", value, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeIn(List<String> values) {
            addCriterion("ccy_cde in", values, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeNotIn(List<String> values) {
            addCriterion("ccy_cde not in", values, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeBetween(String value1, String value2) {
            addCriterion("ccy_cde between", value1, value2, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andCcyCdeNotBetween(String value1, String value2) {
            addCriterion("ccy_cde not between", value1, value2, "ccyCde");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndIsNull() {
            addCriterion("incld_tax_ind is null");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndIsNotNull() {
            addCriterion("incld_tax_ind is not null");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndEqualTo(String value) {
            addCriterion("incld_tax_ind =", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndNotEqualTo(String value) {
            addCriterion("incld_tax_ind <>", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndGreaterThan(String value) {
            addCriterion("incld_tax_ind >", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndGreaterThanOrEqualTo(String value) {
            addCriterion("incld_tax_ind >=", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndLessThan(String value) {
            addCriterion("incld_tax_ind <", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndLessThanOrEqualTo(String value) {
            addCriterion("incld_tax_ind <=", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndLike(String value) {
            addCriterion("incld_tax_ind like", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndNotLike(String value) {
            addCriterion("incld_tax_ind not like", value, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndIn(List<String> values) {
            addCriterion("incld_tax_ind in", values, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndNotIn(List<String> values) {
            addCriterion("incld_tax_ind not in", values, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndBetween(String value1, String value2) {
            addCriterion("incld_tax_ind between", value1, value2, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andIncldTaxIndNotBetween(String value1, String value2) {
            addCriterion("incld_tax_ind not between", value1, value2, "incldTaxInd");
            return (Criteria) this;
        }

        public Criteria andNetAmtIsNull() {
            addCriterion("net_amt is null");
            return (Criteria) this;
        }

        public Criteria andNetAmtIsNotNull() {
            addCriterion("net_amt is not null");
            return (Criteria) this;
        }

        public Criteria andNetAmtEqualTo(String value) {
            addCriterion("net_amt =", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtNotEqualTo(String value) {
            addCriterion("net_amt <>", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtGreaterThan(String value) {
            addCriterion("net_amt >", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtGreaterThanOrEqualTo(String value) {
            addCriterion("net_amt >=", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtLessThan(String value) {
            addCriterion("net_amt <", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtLessThanOrEqualTo(String value) {
            addCriterion("net_amt <=", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtLike(String value) {
            addCriterion("net_amt like", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtNotLike(String value) {
            addCriterion("net_amt not like", value, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtIn(List<String> values) {
            addCriterion("net_amt in", values, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtNotIn(List<String> values) {
            addCriterion("net_amt not in", values, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtBetween(String value1, String value2) {
            addCriterion("net_amt between", value1, value2, "netAmt");
            return (Criteria) this;
        }

        public Criteria andNetAmtNotBetween(String value1, String value2) {
            addCriterion("net_amt not between", value1, value2, "netAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtIsNull() {
            addCriterion("tax_amt is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmtIsNotNull() {
            addCriterion("tax_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmtEqualTo(String value) {
            addCriterion("tax_amt =", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotEqualTo(String value) {
            addCriterion("tax_amt <>", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtGreaterThan(String value) {
            addCriterion("tax_amt >", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtGreaterThanOrEqualTo(String value) {
            addCriterion("tax_amt >=", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtLessThan(String value) {
            addCriterion("tax_amt <", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtLessThanOrEqualTo(String value) {
            addCriterion("tax_amt <=", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtLike(String value) {
            addCriterion("tax_amt like", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotLike(String value) {
            addCriterion("tax_amt not like", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtIn(List<String> values) {
            addCriterion("tax_amt in", values, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotIn(List<String> values) {
            addCriterion("tax_amt not in", values, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtBetween(String value1, String value2) {
            addCriterion("tax_amt between", value1, value2, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotBetween(String value1, String value2) {
            addCriterion("tax_amt not between", value1, value2, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtIsNull() {
            addCriterion("ttl_amt is null");
            return (Criteria) this;
        }

        public Criteria andTtlAmtIsNotNull() {
            addCriterion("ttl_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTtlAmtEqualTo(String value) {
            addCriterion("ttl_amt =", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtNotEqualTo(String value) {
            addCriterion("ttl_amt <>", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtGreaterThan(String value) {
            addCriterion("ttl_amt >", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtGreaterThanOrEqualTo(String value) {
            addCriterion("ttl_amt >=", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtLessThan(String value) {
            addCriterion("ttl_amt <", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtLessThanOrEqualTo(String value) {
            addCriterion("ttl_amt <=", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtLike(String value) {
            addCriterion("ttl_amt like", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtNotLike(String value) {
            addCriterion("ttl_amt not like", value, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtIn(List<String> values) {
            addCriterion("ttl_amt in", values, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtNotIn(List<String> values) {
            addCriterion("ttl_amt not in", values, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtBetween(String value1, String value2) {
            addCriterion("ttl_amt between", value1, value2, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andTtlAmtNotBetween(String value1, String value2) {
            addCriterion("ttl_amt not between", value1, value2, "ttlAmt");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeIsNull() {
            addCriterion("loc_ccy_cde is null");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeIsNotNull() {
            addCriterion("loc_ccy_cde is not null");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeEqualTo(String value) {
            addCriterion("loc_ccy_cde =", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeNotEqualTo(String value) {
            addCriterion("loc_ccy_cde <>", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeGreaterThan(String value) {
            addCriterion("loc_ccy_cde >", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeGreaterThanOrEqualTo(String value) {
            addCriterion("loc_ccy_cde >=", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeLessThan(String value) {
            addCriterion("loc_ccy_cde <", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeLessThanOrEqualTo(String value) {
            addCriterion("loc_ccy_cde <=", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeLike(String value) {
            addCriterion("loc_ccy_cde like", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeNotLike(String value) {
            addCriterion("loc_ccy_cde not like", value, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeIn(List<String> values) {
            addCriterion("loc_ccy_cde in", values, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeNotIn(List<String> values) {
            addCriterion("loc_ccy_cde not in", values, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeBetween(String value1, String value2) {
            addCriterion("loc_ccy_cde between", value1, value2, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocCcyCdeNotBetween(String value1, String value2) {
            addCriterion("loc_ccy_cde not between", value1, value2, "locCcyCde");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtIsNull() {
            addCriterion("loc_net_amt is null");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtIsNotNull() {
            addCriterion("loc_net_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtEqualTo(String value) {
            addCriterion("loc_net_amt =", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtNotEqualTo(String value) {
            addCriterion("loc_net_amt <>", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtGreaterThan(String value) {
            addCriterion("loc_net_amt >", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtGreaterThanOrEqualTo(String value) {
            addCriterion("loc_net_amt >=", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtLessThan(String value) {
            addCriterion("loc_net_amt <", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtLessThanOrEqualTo(String value) {
            addCriterion("loc_net_amt <=", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtLike(String value) {
            addCriterion("loc_net_amt like", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtNotLike(String value) {
            addCriterion("loc_net_amt not like", value, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtIn(List<String> values) {
            addCriterion("loc_net_amt in", values, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtNotIn(List<String> values) {
            addCriterion("loc_net_amt not in", values, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtBetween(String value1, String value2) {
            addCriterion("loc_net_amt between", value1, value2, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocNetAmtNotBetween(String value1, String value2) {
            addCriterion("loc_net_amt not between", value1, value2, "locNetAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtIsNull() {
            addCriterion("loc_tax_amt is null");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtIsNotNull() {
            addCriterion("loc_tax_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtEqualTo(String value) {
            addCriterion("loc_tax_amt =", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtNotEqualTo(String value) {
            addCriterion("loc_tax_amt <>", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtGreaterThan(String value) {
            addCriterion("loc_tax_amt >", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtGreaterThanOrEqualTo(String value) {
            addCriterion("loc_tax_amt >=", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtLessThan(String value) {
            addCriterion("loc_tax_amt <", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtLessThanOrEqualTo(String value) {
            addCriterion("loc_tax_amt <=", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtLike(String value) {
            addCriterion("loc_tax_amt like", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtNotLike(String value) {
            addCriterion("loc_tax_amt not like", value, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtIn(List<String> values) {
            addCriterion("loc_tax_amt in", values, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtNotIn(List<String> values) {
            addCriterion("loc_tax_amt not in", values, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtBetween(String value1, String value2) {
            addCriterion("loc_tax_amt between", value1, value2, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andLocTaxAmtNotBetween(String value1, String value2) {
            addCriterion("loc_tax_amt not between", value1, value2, "locTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtIsNull() {
            addCriterion("custom_tariff_amt is null");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtIsNotNull() {
            addCriterion("custom_tariff_amt is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtEqualTo(String value) {
            addCriterion("custom_tariff_amt =", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtNotEqualTo(String value) {
            addCriterion("custom_tariff_amt <>", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtGreaterThan(String value) {
            addCriterion("custom_tariff_amt >", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtGreaterThanOrEqualTo(String value) {
            addCriterion("custom_tariff_amt >=", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtLessThan(String value) {
            addCriterion("custom_tariff_amt <", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtLessThanOrEqualTo(String value) {
            addCriterion("custom_tariff_amt <=", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtLike(String value) {
            addCriterion("custom_tariff_amt like", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtNotLike(String value) {
            addCriterion("custom_tariff_amt not like", value, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtIn(List<String> values) {
            addCriterion("custom_tariff_amt in", values, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtNotIn(List<String> values) {
            addCriterion("custom_tariff_amt not in", values, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtBetween(String value1, String value2) {
            addCriterion("custom_tariff_amt between", value1, value2, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andCustomTariffAmtNotBetween(String value1, String value2) {
            addCriterion("custom_tariff_amt not between", value1, value2, "customTariffAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtIsNull() {
            addCriterion("loc_ttl_amt is null");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtIsNotNull() {
            addCriterion("loc_ttl_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtEqualTo(String value) {
            addCriterion("loc_ttl_amt =", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtNotEqualTo(String value) {
            addCriterion("loc_ttl_amt <>", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtGreaterThan(String value) {
            addCriterion("loc_ttl_amt >", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtGreaterThanOrEqualTo(String value) {
            addCriterion("loc_ttl_amt >=", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtLessThan(String value) {
            addCriterion("loc_ttl_amt <", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtLessThanOrEqualTo(String value) {
            addCriterion("loc_ttl_amt <=", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtLike(String value) {
            addCriterion("loc_ttl_amt like", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtNotLike(String value) {
            addCriterion("loc_ttl_amt not like", value, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtIn(List<String> values) {
            addCriterion("loc_ttl_amt in", values, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtNotIn(List<String> values) {
            addCriterion("loc_ttl_amt not in", values, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtBetween(String value1, String value2) {
            addCriterion("loc_ttl_amt between", value1, value2, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andLocTtlAmtNotBetween(String value1, String value2) {
            addCriterion("loc_ttl_amt not between", value1, value2, "locTtlAmt");
            return (Criteria) this;
        }

        public Criteria andRefProjNumIsNull() {
            addCriterion("ref_proj_num is null");
            return (Criteria) this;
        }

        public Criteria andRefProjNumIsNotNull() {
            addCriterion("ref_proj_num is not null");
            return (Criteria) this;
        }

        public Criteria andRefProjNumEqualTo(String value) {
            addCriterion("ref_proj_num =", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumNotEqualTo(String value) {
            addCriterion("ref_proj_num <>", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumGreaterThan(String value) {
            addCriterion("ref_proj_num >", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumGreaterThanOrEqualTo(String value) {
            addCriterion("ref_proj_num >=", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumLessThan(String value) {
            addCriterion("ref_proj_num <", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumLessThanOrEqualTo(String value) {
            addCriterion("ref_proj_num <=", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumLike(String value) {
            addCriterion("ref_proj_num like", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumNotLike(String value) {
            addCriterion("ref_proj_num not like", value, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumIn(List<String> values) {
            addCriterion("ref_proj_num in", values, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumNotIn(List<String> values) {
            addCriterion("ref_proj_num not in", values, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumBetween(String value1, String value2) {
            addCriterion("ref_proj_num between", value1, value2, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRefProjNumNotBetween(String value1, String value2) {
            addCriterion("ref_proj_num not between", value1, value2, "refProjNum");
            return (Criteria) this;
        }

        public Criteria andRmkIsNull() {
            addCriterion("rmk is null");
            return (Criteria) this;
        }

        public Criteria andRmkIsNotNull() {
            addCriterion("rmk is not null");
            return (Criteria) this;
        }

        public Criteria andRmkEqualTo(String value) {
            addCriterion("rmk =", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkNotEqualTo(String value) {
            addCriterion("rmk <>", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkGreaterThan(String value) {
            addCriterion("rmk >", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkGreaterThanOrEqualTo(String value) {
            addCriterion("rmk >=", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkLessThan(String value) {
            addCriterion("rmk <", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkLessThanOrEqualTo(String value) {
            addCriterion("rmk <=", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkLike(String value) {
            addCriterion("rmk like", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkNotLike(String value) {
            addCriterion("rmk not like", value, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkIn(List<String> values) {
            addCriterion("rmk in", values, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkNotIn(List<String> values) {
            addCriterion("rmk not in", values, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkBetween(String value1, String value2) {
            addCriterion("rmk between", value1, value2, "rmk");
            return (Criteria) this;
        }

        public Criteria andRmkNotBetween(String value1, String value2) {
            addCriterion("rmk not between", value1, value2, "rmk");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrIsNull() {
            addCriterion("legacy_cre_by_usr is null");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrIsNotNull() {
            addCriterion("legacy_cre_by_usr is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrEqualTo(String value) {
            addCriterion("legacy_cre_by_usr =", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrNotEqualTo(String value) {
            addCriterion("legacy_cre_by_usr <>", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrGreaterThan(String value) {
            addCriterion("legacy_cre_by_usr >", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_cre_by_usr >=", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrLessThan(String value) {
            addCriterion("legacy_cre_by_usr <", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrLessThanOrEqualTo(String value) {
            addCriterion("legacy_cre_by_usr <=", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrLike(String value) {
            addCriterion("legacy_cre_by_usr like", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrNotLike(String value) {
            addCriterion("legacy_cre_by_usr not like", value, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrIn(List<String> values) {
            addCriterion("legacy_cre_by_usr in", values, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrNotIn(List<String> values) {
            addCriterion("legacy_cre_by_usr not in", values, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrBetween(String value1, String value2) {
            addCriterion("legacy_cre_by_usr between", value1, value2, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andLegacyCreByUsrNotBetween(String value1, String value2) {
            addCriterion("legacy_cre_by_usr not between", value1, value2, "legacyCreByUsr");
            return (Criteria) this;
        }

        public Criteria andPosDteIsNull() {
            addCriterion("pos_dte is null");
            return (Criteria) this;
        }

        public Criteria andPosDteIsNotNull() {
            addCriterion("pos_dte is not null");
            return (Criteria) this;
        }

        public Criteria andPosDteEqualTo(String value) {
            addCriterion("pos_dte =", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteNotEqualTo(String value) {
            addCriterion("pos_dte <>", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteGreaterThan(String value) {
            addCriterion("pos_dte >", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteGreaterThanOrEqualTo(String value) {
            addCriterion("pos_dte >=", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteLessThan(String value) {
            addCriterion("pos_dte <", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteLessThanOrEqualTo(String value) {
            addCriterion("pos_dte <=", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteLike(String value) {
            addCriterion("pos_dte like", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteNotLike(String value) {
            addCriterion("pos_dte not like", value, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteIn(List<String> values) {
            addCriterion("pos_dte in", values, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteNotIn(List<String> values) {
            addCriterion("pos_dte not in", values, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteBetween(String value1, String value2) {
            addCriterion("pos_dte between", value1, value2, "posDte");
            return (Criteria) this;
        }

        public Criteria andPosDteNotBetween(String value1, String value2) {
            addCriterion("pos_dte not between", value1, value2, "posDte");
            return (Criteria) this;
        }

        public Criteria andCreDteIsNull() {
            addCriterion("cre_dte is null");
            return (Criteria) this;
        }

        public Criteria andCreDteIsNotNull() {
            addCriterion("cre_dte is not null");
            return (Criteria) this;
        }

        public Criteria andCreDteEqualTo(Date value) {
            addCriterion("cre_dte =", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotEqualTo(Date value) {
            addCriterion("cre_dte <>", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteGreaterThan(Date value) {
            addCriterion("cre_dte >", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteGreaterThanOrEqualTo(Date value) {
            addCriterion("cre_dte >=", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLessThan(Date value) {
            addCriterion("cre_dte <", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLessThanOrEqualTo(Date value) {
            addCriterion("cre_dte <=", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteIn(List<Date> values) {
            addCriterion("cre_dte in", values, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotIn(List<Date> values) {
            addCriterion("cre_dte not in", values, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteBetween(Date value1, Date value2) {
            addCriterion("cre_dte between", value1, value2, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotBetween(Date value1, Date value2) {
            addCriterion("cre_dte not between", value1, value2, "creDte");
            return (Criteria) this;
        }

        public Criteria andStatsIsNull() {
            addCriterion("stats is null");
            return (Criteria) this;
        }

        public Criteria andStatsIsNotNull() {
            addCriterion("stats is not null");
            return (Criteria) this;
        }

        public Criteria andStatsEqualTo(String value) {
            addCriterion("stats =", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotEqualTo(String value) {
            addCriterion("stats <>", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsGreaterThan(String value) {
            addCriterion("stats >", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsGreaterThanOrEqualTo(String value) {
            addCriterion("stats >=", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLessThan(String value) {
            addCriterion("stats <", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLessThanOrEqualTo(String value) {
            addCriterion("stats <=", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLike(String value) {
            addCriterion("stats like", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotLike(String value) {
            addCriterion("stats not like", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsIn(List<String> values) {
            addCriterion("stats in", values, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotIn(List<String> values) {
            addCriterion("stats not in", values, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsBetween(String value1, String value2) {
            addCriterion("stats between", value1, value2, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotBetween(String value1, String value2) {
            addCriterion("stats not between", value1, value2, "stats");
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