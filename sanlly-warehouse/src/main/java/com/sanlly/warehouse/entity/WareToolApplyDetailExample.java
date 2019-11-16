package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareToolApplyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareToolApplyDetailExample() {
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

        public Criteria andWareToolApplyDetailIdIsNull() {
            addCriterion("ware_tool_apply_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdIsNotNull() {
            addCriterion("ware_tool_apply_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdEqualTo(Integer value) {
            addCriterion("ware_tool_apply_detail_id =", value, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_tool_apply_detail_id <>", value, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdGreaterThan(Integer value) {
            addCriterion("ware_tool_apply_detail_id >", value, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_tool_apply_detail_id >=", value, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdLessThan(Integer value) {
            addCriterion("ware_tool_apply_detail_id <", value, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_tool_apply_detail_id <=", value, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdIn(List<Integer> values) {
            addCriterion("ware_tool_apply_detail_id in", values, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_tool_apply_detail_id not in", values, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_tool_apply_detail_id between", value1, value2, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_tool_apply_detail_id not between", value1, value2, "wareToolApplyDetailId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdIsNull() {
            addCriterion("ware_tool_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdIsNotNull() {
            addCriterion("ware_tool_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdEqualTo(Integer value) {
            addCriterion("ware_tool_apply_id =", value, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdNotEqualTo(Integer value) {
            addCriterion("ware_tool_apply_id <>", value, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdGreaterThan(Integer value) {
            addCriterion("ware_tool_apply_id >", value, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_tool_apply_id >=", value, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdLessThan(Integer value) {
            addCriterion("ware_tool_apply_id <", value, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_tool_apply_id <=", value, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdIn(List<Integer> values) {
            addCriterion("ware_tool_apply_id in", values, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdNotIn(List<Integer> values) {
            addCriterion("ware_tool_apply_id not in", values, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_tool_apply_id between", value1, value2, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andWareToolApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_tool_apply_id not between", value1, value2, "wareToolApplyId");
            return (Criteria) this;
        }

        public Criteria andSparePartsIsNull() {
            addCriterion("spare_parts is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsIsNotNull() {
            addCriterion("spare_parts is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsEqualTo(String value) {
            addCriterion("spare_parts =", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotEqualTo(String value) {
            addCriterion("spare_parts <>", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsGreaterThan(String value) {
            addCriterion("spare_parts >", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts >=", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLessThan(String value) {
            addCriterion("spare_parts <", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLessThanOrEqualTo(String value) {
            addCriterion("spare_parts <=", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLike(String value) {
            addCriterion("spare_parts like", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotLike(String value) {
            addCriterion("spare_parts not like", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsIn(List<String> values) {
            addCriterion("spare_parts in", values, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotIn(List<String> values) {
            addCriterion("spare_parts not in", values, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsBetween(String value1, String value2) {
            addCriterion("spare_parts between", value1, value2, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotBetween(String value1, String value2) {
            addCriterion("spare_parts not between", value1, value2, "spareParts");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLiablePersonIsNull() {
            addCriterion("liable_person is null");
            return (Criteria) this;
        }

        public Criteria andLiablePersonIsNotNull() {
            addCriterion("liable_person is not null");
            return (Criteria) this;
        }

        public Criteria andLiablePersonEqualTo(Integer value) {
            addCriterion("liable_person =", value, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonNotEqualTo(Integer value) {
            addCriterion("liable_person <>", value, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonGreaterThan(Integer value) {
            addCriterion("liable_person >", value, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("liable_person >=", value, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonLessThan(Integer value) {
            addCriterion("liable_person <", value, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonLessThanOrEqualTo(Integer value) {
            addCriterion("liable_person <=", value, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonIn(List<Integer> values) {
            addCriterion("liable_person in", values, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonNotIn(List<Integer> values) {
            addCriterion("liable_person not in", values, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonBetween(Integer value1, Integer value2) {
            addCriterion("liable_person between", value1, value2, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andLiablePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("liable_person not between", value1, value2, "liablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonIsNull() {
            addCriterion("new_liable_person is null");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonIsNotNull() {
            addCriterion("new_liable_person is not null");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonEqualTo(Integer value) {
            addCriterion("new_liable_person =", value, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonNotEqualTo(Integer value) {
            addCriterion("new_liable_person <>", value, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonGreaterThan(Integer value) {
            addCriterion("new_liable_person >", value, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_liable_person >=", value, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonLessThan(Integer value) {
            addCriterion("new_liable_person <", value, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonLessThanOrEqualTo(Integer value) {
            addCriterion("new_liable_person <=", value, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonIn(List<Integer> values) {
            addCriterion("new_liable_person in", values, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonNotIn(List<Integer> values) {
            addCriterion("new_liable_person not in", values, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonBetween(Integer value1, Integer value2) {
            addCriterion("new_liable_person between", value1, value2, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andNewLiablePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("new_liable_person not between", value1, value2, "newLiablePerson");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsIsNull() {
            addCriterion("in_departments is null");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsIsNotNull() {
            addCriterion("in_departments is not null");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsEqualTo(String value) {
            addCriterion("in_departments =", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsNotEqualTo(String value) {
            addCriterion("in_departments <>", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsGreaterThan(String value) {
            addCriterion("in_departments >", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsGreaterThanOrEqualTo(String value) {
            addCriterion("in_departments >=", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsLessThan(String value) {
            addCriterion("in_departments <", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsLessThanOrEqualTo(String value) {
            addCriterion("in_departments <=", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsLike(String value) {
            addCriterion("in_departments like", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsNotLike(String value) {
            addCriterion("in_departments not like", value, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsIn(List<String> values) {
            addCriterion("in_departments in", values, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsNotIn(List<String> values) {
            addCriterion("in_departments not in", values, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsBetween(String value1, String value2) {
            addCriterion("in_departments between", value1, value2, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andInDepartmentsNotBetween(String value1, String value2) {
            addCriterion("in_departments not between", value1, value2, "inDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsIsNull() {
            addCriterion("use_departments is null");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsIsNotNull() {
            addCriterion("use_departments is not null");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsEqualTo(String value) {
            addCriterion("use_departments =", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsNotEqualTo(String value) {
            addCriterion("use_departments <>", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsGreaterThan(String value) {
            addCriterion("use_departments >", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsGreaterThanOrEqualTo(String value) {
            addCriterion("use_departments >=", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsLessThan(String value) {
            addCriterion("use_departments <", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsLessThanOrEqualTo(String value) {
            addCriterion("use_departments <=", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsLike(String value) {
            addCriterion("use_departments like", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsNotLike(String value) {
            addCriterion("use_departments not like", value, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsIn(List<String> values) {
            addCriterion("use_departments in", values, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsNotIn(List<String> values) {
            addCriterion("use_departments not in", values, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsBetween(String value1, String value2) {
            addCriterion("use_departments between", value1, value2, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseDepartmentsNotBetween(String value1, String value2) {
            addCriterion("use_departments not between", value1, value2, "useDepartments");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(String value) {
            addCriterion("use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(String value) {
            addCriterion("use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(String value) {
            addCriterion("use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(String value) {
            addCriterion("use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLike(String value) {
            addCriterion("use_type like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotLike(String value) {
            addCriterion("use_type not like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<String> values) {
            addCriterion("use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<String> values) {
            addCriterion("use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(String value1, String value2) {
            addCriterion("use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("use_type not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusIsNull() {
            addCriterion("distribute_status is null");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusIsNotNull() {
            addCriterion("distribute_status is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusEqualTo(String value) {
            addCriterion("distribute_status =", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotEqualTo(String value) {
            addCriterion("distribute_status <>", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusGreaterThan(String value) {
            addCriterion("distribute_status >", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("distribute_status >=", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusLessThan(String value) {
            addCriterion("distribute_status <", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusLessThanOrEqualTo(String value) {
            addCriterion("distribute_status <=", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusLike(String value) {
            addCriterion("distribute_status like", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotLike(String value) {
            addCriterion("distribute_status not like", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusIn(List<String> values) {
            addCriterion("distribute_status in", values, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotIn(List<String> values) {
            addCriterion("distribute_status not in", values, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusBetween(String value1, String value2) {
            addCriterion("distribute_status between", value1, value2, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotBetween(String value1, String value2) {
            addCriterion("distribute_status not between", value1, value2, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIsNull() {
            addCriterion("spare_parts_num is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIsNotNull() {
            addCriterion("spare_parts_num is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumEqualTo(Double value) {
            addCriterion("spare_parts_num =", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotEqualTo(Double value) {
            addCriterion("spare_parts_num <>", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumGreaterThan(Double value) {
            addCriterion("spare_parts_num >", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumGreaterThanOrEqualTo(Double value) {
            addCriterion("spare_parts_num >=", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumLessThan(Double value) {
            addCriterion("spare_parts_num <", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumLessThanOrEqualTo(Double value) {
            addCriterion("spare_parts_num <=", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIn(List<Double> values) {
            addCriterion("spare_parts_num in", values, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotIn(List<Double> values) {
            addCriterion("spare_parts_num not in", values, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumBetween(Double value1, Double value2) {
            addCriterion("spare_parts_num between", value1, value2, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotBetween(Double value1, Double value2) {
            addCriterion("spare_parts_num not between", value1, value2, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumIsNull() {
            addCriterion("scrap_num is null");
            return (Criteria) this;
        }

        public Criteria andScrapNumIsNotNull() {
            addCriterion("scrap_num is not null");
            return (Criteria) this;
        }

        public Criteria andScrapNumEqualTo(Double value) {
            addCriterion("scrap_num =", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumNotEqualTo(Double value) {
            addCriterion("scrap_num <>", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumGreaterThan(Double value) {
            addCriterion("scrap_num >", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumGreaterThanOrEqualTo(Double value) {
            addCriterion("scrap_num >=", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumLessThan(Double value) {
            addCriterion("scrap_num <", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumLessThanOrEqualTo(Double value) {
            addCriterion("scrap_num <=", value, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumIn(List<Double> values) {
            addCriterion("scrap_num in", values, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumNotIn(List<Double> values) {
            addCriterion("scrap_num not in", values, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumBetween(Double value1, Double value2) {
            addCriterion("scrap_num between", value1, value2, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andScrapNumNotBetween(Double value1, Double value2) {
            addCriterion("scrap_num not between", value1, value2, "scrapNum");
            return (Criteria) this;
        }

        public Criteria andDistributeDateIsNull() {
            addCriterion("distribute_date is null");
            return (Criteria) this;
        }

        public Criteria andDistributeDateIsNotNull() {
            addCriterion("distribute_date is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeDateEqualTo(Date value) {
            addCriterion("distribute_date =", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateNotEqualTo(Date value) {
            addCriterion("distribute_date <>", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateGreaterThan(Date value) {
            addCriterion("distribute_date >", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("distribute_date >=", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateLessThan(Date value) {
            addCriterion("distribute_date <", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateLessThanOrEqualTo(Date value) {
            addCriterion("distribute_date <=", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateIn(List<Date> values) {
            addCriterion("distribute_date in", values, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateNotIn(List<Date> values) {
            addCriterion("distribute_date not in", values, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateBetween(Date value1, Date value2) {
            addCriterion("distribute_date between", value1, value2, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateNotBetween(Date value1, Date value2) {
            addCriterion("distribute_date not between", value1, value2, "distributeDate");
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

        public Criteria andOutedNumIsNull() {
            addCriterion("outed_num is null");
            return (Criteria) this;
        }

        public Criteria andOutedNumIsNotNull() {
            addCriterion("outed_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutedNumEqualTo(Double value) {
            addCriterion("outed_num =", value, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumNotEqualTo(Double value) {
            addCriterion("outed_num <>", value, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumGreaterThan(Double value) {
            addCriterion("outed_num >", value, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumGreaterThanOrEqualTo(Double value) {
            addCriterion("outed_num >=", value, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumLessThan(Double value) {
            addCriterion("outed_num <", value, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumLessThanOrEqualTo(Double value) {
            addCriterion("outed_num <=", value, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumIn(List<Double> values) {
            addCriterion("outed_num in", values, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumNotIn(List<Double> values) {
            addCriterion("outed_num not in", values, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumBetween(Double value1, Double value2) {
            addCriterion("outed_num between", value1, value2, "outedNum");
            return (Criteria) this;
        }

        public Criteria andOutedNumNotBetween(Double value1, Double value2) {
            addCriterion("outed_num not between", value1, value2, "outedNum");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNull() {
            addCriterion("stockout_status is null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNotNull() {
            addCriterion("stockout_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusEqualTo(String value) {
            addCriterion("stockout_status =", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotEqualTo(String value) {
            addCriterion("stockout_status <>", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThan(String value) {
            addCriterion("stockout_status >", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_status >=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThan(String value) {
            addCriterion("stockout_status <", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThanOrEqualTo(String value) {
            addCriterion("stockout_status <=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLike(String value) {
            addCriterion("stockout_status like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotLike(String value) {
            addCriterion("stockout_status not like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIn(List<String> values) {
            addCriterion("stockout_status in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotIn(List<String> values) {
            addCriterion("stockout_status not in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusBetween(String value1, String value2) {
            addCriterion("stockout_status between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotBetween(String value1, String value2) {
            addCriterion("stockout_status not between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdIsNull() {
            addCriterion("ware_tool_manage_id is null");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdIsNotNull() {
            addCriterion("ware_tool_manage_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdEqualTo(Integer value) {
            addCriterion("ware_tool_manage_id =", value, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdNotEqualTo(Integer value) {
            addCriterion("ware_tool_manage_id <>", value, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdGreaterThan(Integer value) {
            addCriterion("ware_tool_manage_id >", value, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_tool_manage_id >=", value, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdLessThan(Integer value) {
            addCriterion("ware_tool_manage_id <", value, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_tool_manage_id <=", value, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdIn(List<Integer> values) {
            addCriterion("ware_tool_manage_id in", values, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdNotIn(List<Integer> values) {
            addCriterion("ware_tool_manage_id not in", values, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_tool_manage_id between", value1, value2, "wareToolManageId");
            return (Criteria) this;
        }

        public Criteria andWareToolManageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_tool_manage_id not between", value1, value2, "wareToolManageId");
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