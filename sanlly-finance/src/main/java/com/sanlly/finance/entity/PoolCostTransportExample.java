package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoolCostTransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PoolCostTransportExample() {
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

        public Criteria andProdCourseIdIsNull() {
            addCriterion("prod_course_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIsNotNull() {
            addCriterion("prod_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdEqualTo(String value) {
            addCriterion("prod_course_id =", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotEqualTo(String value) {
            addCriterion("prod_course_id <>", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThan(String value) {
            addCriterion("prod_course_id >", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_course_id >=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThan(String value) {
            addCriterion("prod_course_id <", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThanOrEqualTo(String value) {
            addCriterion("prod_course_id <=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLike(String value) {
            addCriterion("prod_course_id like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotLike(String value) {
            addCriterion("prod_course_id not like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIn(List<String> values) {
            addCriterion("prod_course_id in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotIn(List<String> values) {
            addCriterion("prod_course_id not in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdBetween(String value1, String value2) {
            addCriterion("prod_course_id between", value1, value2, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotBetween(String value1, String value2) {
            addCriterion("prod_course_id not between", value1, value2, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIsNull() {
            addCriterion("prod_container_id is null");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIsNotNull() {
            addCriterion("prod_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdEqualTo(Integer value) {
            addCriterion("prod_container_id =", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotEqualTo(Integer value) {
            addCriterion("prod_container_id <>", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdGreaterThan(Integer value) {
            addCriterion("prod_container_id >", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_container_id >=", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLessThan(Integer value) {
            addCriterion("prod_container_id <", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_container_id <=", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIn(List<Integer> values) {
            addCriterion("prod_container_id in", values, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotIn(List<Integer> values) {
            addCriterion("prod_container_id not in", values, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_id between", value1, value2, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_id not between", value1, value2, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNull() {
            addCriterion("container_no is null");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNotNull() {
            addCriterion("container_no is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNoEqualTo(String value) {
            addCriterion("container_no =", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotEqualTo(String value) {
            addCriterion("container_no <>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThan(String value) {
            addCriterion("container_no >", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThanOrEqualTo(String value) {
            addCriterion("container_no >=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThan(String value) {
            addCriterion("container_no <", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThanOrEqualTo(String value) {
            addCriterion("container_no <=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLike(String value) {
            addCriterion("container_no like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotLike(String value) {
            addCriterion("container_no not like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIn(List<String> values) {
            addCriterion("container_no in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotIn(List<String> values) {
            addCriterion("container_no not in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoBetween(String value1, String value2) {
            addCriterion("container_no between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotBetween(String value1, String value2) {
            addCriterion("container_no not between", value1, value2, "containerNo");
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

        public Criteria andAllocationNoIsNull() {
            addCriterion("allocation_no is null");
            return (Criteria) this;
        }

        public Criteria andAllocationNoIsNotNull() {
            addCriterion("allocation_no is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationNoEqualTo(String value) {
            addCriterion("allocation_no =", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotEqualTo(String value) {
            addCriterion("allocation_no <>", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoGreaterThan(String value) {
            addCriterion("allocation_no >", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoGreaterThanOrEqualTo(String value) {
            addCriterion("allocation_no >=", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoLessThan(String value) {
            addCriterion("allocation_no <", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoLessThanOrEqualTo(String value) {
            addCriterion("allocation_no <=", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoLike(String value) {
            addCriterion("allocation_no like", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotLike(String value) {
            addCriterion("allocation_no not like", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoIn(List<String> values) {
            addCriterion("allocation_no in", values, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotIn(List<String> values) {
            addCriterion("allocation_no not in", values, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoBetween(String value1, String value2) {
            addCriterion("allocation_no between", value1, value2, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotBetween(String value1, String value2) {
            addCriterion("allocation_no not between", value1, value2, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andOutYardIsNull() {
            addCriterion("out_yard is null");
            return (Criteria) this;
        }

        public Criteria andOutYardIsNotNull() {
            addCriterion("out_yard is not null");
            return (Criteria) this;
        }

        public Criteria andOutYardEqualTo(String value) {
            addCriterion("out_yard =", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardNotEqualTo(String value) {
            addCriterion("out_yard <>", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardGreaterThan(String value) {
            addCriterion("out_yard >", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardGreaterThanOrEqualTo(String value) {
            addCriterion("out_yard >=", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardLessThan(String value) {
            addCriterion("out_yard <", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardLessThanOrEqualTo(String value) {
            addCriterion("out_yard <=", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardLike(String value) {
            addCriterion("out_yard like", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardNotLike(String value) {
            addCriterion("out_yard not like", value, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardIn(List<String> values) {
            addCriterion("out_yard in", values, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardNotIn(List<String> values) {
            addCriterion("out_yard not in", values, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardBetween(String value1, String value2) {
            addCriterion("out_yard between", value1, value2, "outYard");
            return (Criteria) this;
        }

        public Criteria andOutYardNotBetween(String value1, String value2) {
            addCriterion("out_yard not between", value1, value2, "outYard");
            return (Criteria) this;
        }

        public Criteria andIntYardIsNull() {
            addCriterion("int_yard is null");
            return (Criteria) this;
        }

        public Criteria andIntYardIsNotNull() {
            addCriterion("int_yard is not null");
            return (Criteria) this;
        }

        public Criteria andIntYardEqualTo(String value) {
            addCriterion("int_yard =", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardNotEqualTo(String value) {
            addCriterion("int_yard <>", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardGreaterThan(String value) {
            addCriterion("int_yard >", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardGreaterThanOrEqualTo(String value) {
            addCriterion("int_yard >=", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardLessThan(String value) {
            addCriterion("int_yard <", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardLessThanOrEqualTo(String value) {
            addCriterion("int_yard <=", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardLike(String value) {
            addCriterion("int_yard like", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardNotLike(String value) {
            addCriterion("int_yard not like", value, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardIn(List<String> values) {
            addCriterion("int_yard in", values, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardNotIn(List<String> values) {
            addCriterion("int_yard not in", values, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardBetween(String value1, String value2) {
            addCriterion("int_yard between", value1, value2, "intYard");
            return (Criteria) this;
        }

        public Criteria andIntYardNotBetween(String value1, String value2) {
            addCriterion("int_yard not between", value1, value2, "intYard");
            return (Criteria) this;
        }

        public Criteria andFleetIsNull() {
            addCriterion("fleet is null");
            return (Criteria) this;
        }

        public Criteria andFleetIsNotNull() {
            addCriterion("fleet is not null");
            return (Criteria) this;
        }

        public Criteria andFleetEqualTo(String value) {
            addCriterion("fleet =", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotEqualTo(String value) {
            addCriterion("fleet <>", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetGreaterThan(String value) {
            addCriterion("fleet >", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetGreaterThanOrEqualTo(String value) {
            addCriterion("fleet >=", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLessThan(String value) {
            addCriterion("fleet <", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLessThanOrEqualTo(String value) {
            addCriterion("fleet <=", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLike(String value) {
            addCriterion("fleet like", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotLike(String value) {
            addCriterion("fleet not like", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetIn(List<String> values) {
            addCriterion("fleet in", values, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotIn(List<String> values) {
            addCriterion("fleet not in", values, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetBetween(String value1, String value2) {
            addCriterion("fleet between", value1, value2, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotBetween(String value1, String value2) {
            addCriterion("fleet not between", value1, value2, "fleet");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNull() {
            addCriterion("plate_no is null");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNotNull() {
            addCriterion("plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNoEqualTo(String value) {
            addCriterion("plate_no =", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotEqualTo(String value) {
            addCriterion("plate_no <>", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThan(String value) {
            addCriterion("plate_no >", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("plate_no >=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThan(String value) {
            addCriterion("plate_no <", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThanOrEqualTo(String value) {
            addCriterion("plate_no <=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLike(String value) {
            addCriterion("plate_no like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotLike(String value) {
            addCriterion("plate_no not like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoIn(List<String> values) {
            addCriterion("plate_no in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotIn(List<String> values) {
            addCriterion("plate_no not in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoBetween(String value1, String value2) {
            addCriterion("plate_no between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotBetween(String value1, String value2) {
            addCriterion("plate_no not between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andCostUsdIsNull() {
            addCriterion("cost_usd is null");
            return (Criteria) this;
        }

        public Criteria andCostUsdIsNotNull() {
            addCriterion("cost_usd is not null");
            return (Criteria) this;
        }

        public Criteria andCostUsdEqualTo(BigDecimal value) {
            addCriterion("cost_usd =", value, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdNotEqualTo(BigDecimal value) {
            addCriterion("cost_usd <>", value, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdGreaterThan(BigDecimal value) {
            addCriterion("cost_usd >", value, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_usd >=", value, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdLessThan(BigDecimal value) {
            addCriterion("cost_usd <", value, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_usd <=", value, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdIn(List<BigDecimal> values) {
            addCriterion("cost_usd in", values, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdNotIn(List<BigDecimal> values) {
            addCriterion("cost_usd not in", values, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_usd between", value1, value2, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_usd not between", value1, value2, "costUsd");
            return (Criteria) this;
        }

        public Criteria andCostRmbIsNull() {
            addCriterion("cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andCostRmbIsNotNull() {
            addCriterion("cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andCostRmbEqualTo(BigDecimal value) {
            addCriterion("cost_rmb =", value, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("cost_rmb <>", value, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbGreaterThan(BigDecimal value) {
            addCriterion("cost_rmb >", value, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_rmb >=", value, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbLessThan(BigDecimal value) {
            addCriterion("cost_rmb <", value, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_rmb <=", value, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbIn(List<BigDecimal> values) {
            addCriterion("cost_rmb in", values, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("cost_rmb not in", values, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_rmb between", value1, value2, "costRmb");
            return (Criteria) this;
        }

        public Criteria andCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_rmb not between", value1, value2, "costRmb");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeIsNull() {
            addCriterion("allocation_time is null");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeIsNotNull() {
            addCriterion("allocation_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeEqualTo(Date value) {
            addCriterion("allocation_time =", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeNotEqualTo(Date value) {
            addCriterion("allocation_time <>", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeGreaterThan(Date value) {
            addCriterion("allocation_time >", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("allocation_time >=", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeLessThan(Date value) {
            addCriterion("allocation_time <", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeLessThanOrEqualTo(Date value) {
            addCriterion("allocation_time <=", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeIn(List<Date> values) {
            addCriterion("allocation_time in", values, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeNotIn(List<Date> values) {
            addCriterion("allocation_time not in", values, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeBetween(Date value1, Date value2) {
            addCriterion("allocation_time between", value1, value2, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeNotBetween(Date value1, Date value2) {
            addCriterion("allocation_time not between", value1, value2, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
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

        public Criteria andAllocationTypeIsNull() {
            addCriterion("allocation_type is null");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIsNotNull() {
            addCriterion("allocation_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeEqualTo(String value) {
            addCriterion("allocation_type =", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotEqualTo(String value) {
            addCriterion("allocation_type <>", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeGreaterThan(String value) {
            addCriterion("allocation_type >", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("allocation_type >=", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLessThan(String value) {
            addCriterion("allocation_type <", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLessThanOrEqualTo(String value) {
            addCriterion("allocation_type <=", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLike(String value) {
            addCriterion("allocation_type like", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotLike(String value) {
            addCriterion("allocation_type not like", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIn(List<String> values) {
            addCriterion("allocation_type in", values, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotIn(List<String> values) {
            addCriterion("allocation_type not in", values, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeBetween(String value1, String value2) {
            addCriterion("allocation_type between", value1, value2, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotBetween(String value1, String value2) {
            addCriterion("allocation_type not between", value1, value2, "allocationType");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerIsNull() {
            addCriterion("directive_issuer is null");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerIsNotNull() {
            addCriterion("directive_issuer is not null");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerEqualTo(String value) {
            addCriterion("directive_issuer =", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotEqualTo(String value) {
            addCriterion("directive_issuer <>", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerGreaterThan(String value) {
            addCriterion("directive_issuer >", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("directive_issuer >=", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerLessThan(String value) {
            addCriterion("directive_issuer <", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerLessThanOrEqualTo(String value) {
            addCriterion("directive_issuer <=", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerLike(String value) {
            addCriterion("directive_issuer like", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotLike(String value) {
            addCriterion("directive_issuer not like", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerIn(List<String> values) {
            addCriterion("directive_issuer in", values, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotIn(List<String> values) {
            addCriterion("directive_issuer not in", values, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerBetween(String value1, String value2) {
            addCriterion("directive_issuer between", value1, value2, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotBetween(String value1, String value2) {
            addCriterion("directive_issuer not between", value1, value2, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeIsNull() {
            addCriterion("directive_time is null");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeIsNotNull() {
            addCriterion("directive_time is not null");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeEqualTo(Date value) {
            addCriterion("directive_time =", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeNotEqualTo(Date value) {
            addCriterion("directive_time <>", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeGreaterThan(Date value) {
            addCriterion("directive_time >", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("directive_time >=", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeLessThan(Date value) {
            addCriterion("directive_time <", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("directive_time <=", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeIn(List<Date> values) {
            addCriterion("directive_time in", values, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeNotIn(List<Date> values) {
            addCriterion("directive_time not in", values, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeBetween(Date value1, Date value2) {
            addCriterion("directive_time between", value1, value2, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("directive_time not between", value1, value2, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleIsNull() {
            addCriterion("identify_people is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleIsNotNull() {
            addCriterion("identify_people is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleEqualTo(String value) {
            addCriterion("identify_people =", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotEqualTo(String value) {
            addCriterion("identify_people <>", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleGreaterThan(String value) {
            addCriterion("identify_people >", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("identify_people >=", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleLessThan(String value) {
            addCriterion("identify_people <", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleLessThanOrEqualTo(String value) {
            addCriterion("identify_people <=", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleLike(String value) {
            addCriterion("identify_people like", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotLike(String value) {
            addCriterion("identify_people not like", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleIn(List<String> values) {
            addCriterion("identify_people in", values, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotIn(List<String> values) {
            addCriterion("identify_people not in", values, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleBetween(String value1, String value2) {
            addCriterion("identify_people between", value1, value2, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotBetween(String value1, String value2) {
            addCriterion("identify_people not between", value1, value2, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeIsNull() {
            addCriterion("identify_time is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeIsNotNull() {
            addCriterion("identify_time is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeEqualTo(Date value) {
            addCriterion("identify_time =", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeNotEqualTo(Date value) {
            addCriterion("identify_time <>", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeGreaterThan(Date value) {
            addCriterion("identify_time >", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("identify_time >=", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeLessThan(Date value) {
            addCriterion("identify_time <", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("identify_time <=", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeIn(List<Date> values) {
            addCriterion("identify_time in", values, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeNotIn(List<Date> values) {
            addCriterion("identify_time not in", values, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeBetween(Date value1, Date value2) {
            addCriterion("identify_time between", value1, value2, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("identify_time not between", value1, value2, "identifyTime");
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

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIsNull() {
            addCriterion("no_cost_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIsNotNull() {
            addCriterion("no_cost_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescEqualTo(String value) {
            addCriterion("no_cost_desc =", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotEqualTo(String value) {
            addCriterion("no_cost_desc <>", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThan(String value) {
            addCriterion("no_cost_desc >", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThanOrEqualTo(String value) {
            addCriterion("no_cost_desc >=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThan(String value) {
            addCriterion("no_cost_desc <", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThanOrEqualTo(String value) {
            addCriterion("no_cost_desc <=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLike(String value) {
            addCriterion("no_cost_desc like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotLike(String value) {
            addCriterion("no_cost_desc not like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIn(List<String> values) {
            addCriterion("no_cost_desc in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotIn(List<String> values) {
            addCriterion("no_cost_desc not in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescBetween(String value1, String value2) {
            addCriterion("no_cost_desc between", value1, value2, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotBetween(String value1, String value2) {
            addCriterion("no_cost_desc not between", value1, value2, "noCostDesc");
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