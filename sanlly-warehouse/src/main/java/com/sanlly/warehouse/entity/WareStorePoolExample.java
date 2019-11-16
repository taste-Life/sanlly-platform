package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStorePoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStorePoolExample() {
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

        public Criteria andWareStorePoolIdIsNull() {
            addCriterion("ware_store_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdIsNotNull() {
            addCriterion("ware_store_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdEqualTo(Integer value) {
            addCriterion("ware_store_pool_id =", value, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdNotEqualTo(Integer value) {
            addCriterion("ware_store_pool_id <>", value, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdGreaterThan(Integer value) {
            addCriterion("ware_store_pool_id >", value, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_store_pool_id >=", value, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdLessThan(Integer value) {
            addCriterion("ware_store_pool_id <", value, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_store_pool_id <=", value, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdIn(List<Integer> values) {
            addCriterion("ware_store_pool_id in", values, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdNotIn(List<Integer> values) {
            addCriterion("ware_store_pool_id not in", values, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_store_pool_id between", value1, value2, "wareStorePoolId");
            return (Criteria) this;
        }

        public Criteria andWareStorePoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_store_pool_id not between", value1, value2, "wareStorePoolId");
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

        public Criteria andInvtrTypCdeIsNull() {
            addCriterion("invtr_typ_cde is null");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeIsNotNull() {
            addCriterion("invtr_typ_cde is not null");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeEqualTo(String value) {
            addCriterion("invtr_typ_cde =", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeNotEqualTo(String value) {
            addCriterion("invtr_typ_cde <>", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeGreaterThan(String value) {
            addCriterion("invtr_typ_cde >", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeGreaterThanOrEqualTo(String value) {
            addCriterion("invtr_typ_cde >=", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeLessThan(String value) {
            addCriterion("invtr_typ_cde <", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeLessThanOrEqualTo(String value) {
            addCriterion("invtr_typ_cde <=", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeLike(String value) {
            addCriterion("invtr_typ_cde like", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeNotLike(String value) {
            addCriterion("invtr_typ_cde not like", value, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeIn(List<String> values) {
            addCriterion("invtr_typ_cde in", values, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeNotIn(List<String> values) {
            addCriterion("invtr_typ_cde not in", values, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeBetween(String value1, String value2) {
            addCriterion("invtr_typ_cde between", value1, value2, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andInvtrTypCdeNotBetween(String value1, String value2) {
            addCriterion("invtr_typ_cde not between", value1, value2, "invtrTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeIsNull() {
            addCriterion("biz_typ_cde is null");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeIsNotNull() {
            addCriterion("biz_typ_cde is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeEqualTo(String value) {
            addCriterion("biz_typ_cde =", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeNotEqualTo(String value) {
            addCriterion("biz_typ_cde <>", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeGreaterThan(String value) {
            addCriterion("biz_typ_cde >", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_typ_cde >=", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeLessThan(String value) {
            addCriterion("biz_typ_cde <", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeLessThanOrEqualTo(String value) {
            addCriterion("biz_typ_cde <=", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeLike(String value) {
            addCriterion("biz_typ_cde like", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeNotLike(String value) {
            addCriterion("biz_typ_cde not like", value, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeIn(List<String> values) {
            addCriterion("biz_typ_cde in", values, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeNotIn(List<String> values) {
            addCriterion("biz_typ_cde not in", values, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeBetween(String value1, String value2) {
            addCriterion("biz_typ_cde between", value1, value2, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andBizTypCdeNotBetween(String value1, String value2) {
            addCriterion("biz_typ_cde not between", value1, value2, "bizTypCde");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypIsNull() {
            addCriterion("tgt_invtr_typ is null");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypIsNotNull() {
            addCriterion("tgt_invtr_typ is not null");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypEqualTo(String value) {
            addCriterion("tgt_invtr_typ =", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypNotEqualTo(String value) {
            addCriterion("tgt_invtr_typ <>", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypGreaterThan(String value) {
            addCriterion("tgt_invtr_typ >", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypGreaterThanOrEqualTo(String value) {
            addCriterion("tgt_invtr_typ >=", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypLessThan(String value) {
            addCriterion("tgt_invtr_typ <", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypLessThanOrEqualTo(String value) {
            addCriterion("tgt_invtr_typ <=", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypLike(String value) {
            addCriterion("tgt_invtr_typ like", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypNotLike(String value) {
            addCriterion("tgt_invtr_typ not like", value, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypIn(List<String> values) {
            addCriterion("tgt_invtr_typ in", values, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypNotIn(List<String> values) {
            addCriterion("tgt_invtr_typ not in", values, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypBetween(String value1, String value2) {
            addCriterion("tgt_invtr_typ between", value1, value2, "tgtInvtrTyp");
            return (Criteria) this;
        }

        public Criteria andTgtInvtrTypNotBetween(String value1, String value2) {
            addCriterion("tgt_invtr_typ not between", value1, value2, "tgtInvtrTyp");
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

        public Criteria andCreDteEqualTo(String value) {
            addCriterion("cre_dte =", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotEqualTo(String value) {
            addCriterion("cre_dte <>", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteGreaterThan(String value) {
            addCriterion("cre_dte >", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteGreaterThanOrEqualTo(String value) {
            addCriterion("cre_dte >=", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLessThan(String value) {
            addCriterion("cre_dte <", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLessThanOrEqualTo(String value) {
            addCriterion("cre_dte <=", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteLike(String value) {
            addCriterion("cre_dte like", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotLike(String value) {
            addCriterion("cre_dte not like", value, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteIn(List<String> values) {
            addCriterion("cre_dte in", values, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotIn(List<String> values) {
            addCriterion("cre_dte not in", values, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteBetween(String value1, String value2) {
            addCriterion("cre_dte between", value1, value2, "creDte");
            return (Criteria) this;
        }

        public Criteria andCreDteNotBetween(String value1, String value2) {
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