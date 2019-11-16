package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareWasteWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareWasteWarehouseExample() {
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

        public Criteria andWareWasteWarehouseIdIsNull() {
            addCriterion("ware_waste_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdIsNotNull() {
            addCriterion("ware_waste_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdEqualTo(Integer value) {
            addCriterion("ware_waste_warehouse_id =", value, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdNotEqualTo(Integer value) {
            addCriterion("ware_waste_warehouse_id <>", value, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdGreaterThan(Integer value) {
            addCriterion("ware_waste_warehouse_id >", value, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_waste_warehouse_id >=", value, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdLessThan(Integer value) {
            addCriterion("ware_waste_warehouse_id <", value, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_waste_warehouse_id <=", value, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdIn(List<Integer> values) {
            addCriterion("ware_waste_warehouse_id in", values, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdNotIn(List<Integer> values) {
            addCriterion("ware_waste_warehouse_id not in", values, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_waste_warehouse_id between", value1, value2, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWareWasteWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_waste_warehouse_id not between", value1, value2, "wareWasteWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("`no` is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("`no` is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("`no` =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("`no` <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("`no` >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("`no` >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("`no` <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("`no` <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("`no` like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("`no` not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("`no` in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("`no` not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("`no` between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("`no` not between", value1, value2, "no");
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

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(Integer value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(Integer value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(Integer value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(Integer value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(Integer value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(Integer value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<Integer> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<Integer> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(Integer value1, Integer value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(Integer value1, Integer value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserIsNull() {
            addCriterion("use_container_user is null");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserIsNotNull() {
            addCriterion("use_container_user is not null");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserEqualTo(Integer value) {
            addCriterion("use_container_user =", value, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserNotEqualTo(Integer value) {
            addCriterion("use_container_user <>", value, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserGreaterThan(Integer value) {
            addCriterion("use_container_user >", value, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_container_user >=", value, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserLessThan(Integer value) {
            addCriterion("use_container_user <", value, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserLessThanOrEqualTo(Integer value) {
            addCriterion("use_container_user <=", value, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserIn(List<Integer> values) {
            addCriterion("use_container_user in", values, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserNotIn(List<Integer> values) {
            addCriterion("use_container_user not in", values, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserBetween(Integer value1, Integer value2) {
            addCriterion("use_container_user between", value1, value2, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andUseContainerUserNotBetween(Integer value1, Integer value2) {
            addCriterion("use_container_user not between", value1, value2, "useContainerUser");
            return (Criteria) this;
        }

        public Criteria andReturnYardIsNull() {
            addCriterion("return_yard is null");
            return (Criteria) this;
        }

        public Criteria andReturnYardIsNotNull() {
            addCriterion("return_yard is not null");
            return (Criteria) this;
        }

        public Criteria andReturnYardEqualTo(String value) {
            addCriterion("return_yard =", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardNotEqualTo(String value) {
            addCriterion("return_yard <>", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardGreaterThan(String value) {
            addCriterion("return_yard >", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardGreaterThanOrEqualTo(String value) {
            addCriterion("return_yard >=", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardLessThan(String value) {
            addCriterion("return_yard <", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardLessThanOrEqualTo(String value) {
            addCriterion("return_yard <=", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardLike(String value) {
            addCriterion("return_yard like", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardNotLike(String value) {
            addCriterion("return_yard not like", value, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardIn(List<String> values) {
            addCriterion("return_yard in", values, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardNotIn(List<String> values) {
            addCriterion("return_yard not in", values, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardBetween(String value1, String value2) {
            addCriterion("return_yard between", value1, value2, "returnYard");
            return (Criteria) this;
        }

        public Criteria andReturnYardNotBetween(String value1, String value2) {
            addCriterion("return_yard not between", value1, value2, "returnYard");
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

        public Criteria andSparePartsBatchIsNull() {
            addCriterion("spare_parts_batch is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIsNotNull() {
            addCriterion("spare_parts_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchEqualTo(String value) {
            addCriterion("spare_parts_batch =", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotEqualTo(String value) {
            addCriterion("spare_parts_batch <>", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThan(String value) {
            addCriterion("spare_parts_batch >", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch >=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThan(String value) {
            addCriterion("spare_parts_batch <", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch <=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLike(String value) {
            addCriterion("spare_parts_batch like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotLike(String value) {
            addCriterion("spare_parts_batch not like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIn(List<String> values) {
            addCriterion("spare_parts_batch in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotIn(List<String> values) {
            addCriterion("spare_parts_batch not in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchBetween(String value1, String value2) {
            addCriterion("spare_parts_batch between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotBetween(String value1, String value2) {
            addCriterion("spare_parts_batch not between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andStockinTypeIsNull() {
            addCriterion("stockin_type is null");
            return (Criteria) this;
        }

        public Criteria andStockinTypeIsNotNull() {
            addCriterion("stockin_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockinTypeEqualTo(String value) {
            addCriterion("stockin_type =", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotEqualTo(String value) {
            addCriterion("stockin_type <>", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeGreaterThan(String value) {
            addCriterion("stockin_type >", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_type >=", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeLessThan(String value) {
            addCriterion("stockin_type <", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeLessThanOrEqualTo(String value) {
            addCriterion("stockin_type <=", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeLike(String value) {
            addCriterion("stockin_type like", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotLike(String value) {
            addCriterion("stockin_type not like", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeIn(List<String> values) {
            addCriterion("stockin_type in", values, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotIn(List<String> values) {
            addCriterion("stockin_type not in", values, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeBetween(String value1, String value2) {
            addCriterion("stockin_type between", value1, value2, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotBetween(String value1, String value2) {
            addCriterion("stockin_type not between", value1, value2, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkIsNull() {
            addCriterion("stockin_remark is null");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkIsNotNull() {
            addCriterion("stockin_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkEqualTo(String value) {
            addCriterion("stockin_remark =", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkNotEqualTo(String value) {
            addCriterion("stockin_remark <>", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkGreaterThan(String value) {
            addCriterion("stockin_remark >", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_remark >=", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkLessThan(String value) {
            addCriterion("stockin_remark <", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkLessThanOrEqualTo(String value) {
            addCriterion("stockin_remark <=", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkLike(String value) {
            addCriterion("stockin_remark like", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkNotLike(String value) {
            addCriterion("stockin_remark not like", value, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkIn(List<String> values) {
            addCriterion("stockin_remark in", values, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkNotIn(List<String> values) {
            addCriterion("stockin_remark not in", values, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkBetween(String value1, String value2) {
            addCriterion("stockin_remark between", value1, value2, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinRemarkNotBetween(String value1, String value2) {
            addCriterion("stockin_remark not between", value1, value2, "stockinRemark");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNull() {
            addCriterion("stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNotNull() {
            addCriterion("stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockinDateEqualTo(Date value) {
            addCriterion("stockin_date =", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotEqualTo(Date value) {
            addCriterion("stockin_date <>", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThan(Date value) {
            addCriterion("stockin_date >", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockin_date >=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThan(Date value) {
            addCriterion("stockin_date <", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("stockin_date <=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateIn(List<Date> values) {
            addCriterion("stockin_date in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotIn(List<Date> values) {
            addCriterion("stockin_date not in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateBetween(Date value1, Date value2) {
            addCriterion("stockin_date between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("stockin_date not between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinNumIsNull() {
            addCriterion("stockin_num is null");
            return (Criteria) this;
        }

        public Criteria andStockinNumIsNotNull() {
            addCriterion("stockin_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockinNumEqualTo(Double value) {
            addCriterion("stockin_num =", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotEqualTo(Double value) {
            addCriterion("stockin_num <>", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumGreaterThan(Double value) {
            addCriterion("stockin_num >", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockin_num >=", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumLessThan(Double value) {
            addCriterion("stockin_num <", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumLessThanOrEqualTo(Double value) {
            addCriterion("stockin_num <=", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumIn(List<Double> values) {
            addCriterion("stockin_num in", values, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotIn(List<Double> values) {
            addCriterion("stockin_num not in", values, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumBetween(Double value1, Double value2) {
            addCriterion("stockin_num between", value1, value2, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotBetween(Double value1, Double value2) {
            addCriterion("stockin_num not between", value1, value2, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNull() {
            addCriterion("old_price is null");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNotNull() {
            addCriterion("old_price is not null");
            return (Criteria) this;
        }

        public Criteria andOldPriceEqualTo(BigDecimal value) {
            addCriterion("old_price =", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotEqualTo(BigDecimal value) {
            addCriterion("old_price <>", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThan(BigDecimal value) {
            addCriterion("old_price >", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_price >=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThan(BigDecimal value) {
            addCriterion("old_price <", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_price <=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceIn(List<BigDecimal> values) {
            addCriterion("old_price in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotIn(List<BigDecimal> values) {
            addCriterion("old_price not in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_price between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_price not between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andDisposeNoIsNull() {
            addCriterion("dispose_no is null");
            return (Criteria) this;
        }

        public Criteria andDisposeNoIsNotNull() {
            addCriterion("dispose_no is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeNoEqualTo(String value) {
            addCriterion("dispose_no =", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoNotEqualTo(String value) {
            addCriterion("dispose_no <>", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoGreaterThan(String value) {
            addCriterion("dispose_no >", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_no >=", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoLessThan(String value) {
            addCriterion("dispose_no <", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoLessThanOrEqualTo(String value) {
            addCriterion("dispose_no <=", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoLike(String value) {
            addCriterion("dispose_no like", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoNotLike(String value) {
            addCriterion("dispose_no not like", value, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoIn(List<String> values) {
            addCriterion("dispose_no in", values, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoNotIn(List<String> values) {
            addCriterion("dispose_no not in", values, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoBetween(String value1, String value2) {
            addCriterion("dispose_no between", value1, value2, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andDisposeNoNotBetween(String value1, String value2) {
            addCriterion("dispose_no not between", value1, value2, "disposeNo");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumIsNull() {
            addCriterion("waste_dispose_num is null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumIsNotNull() {
            addCriterion("waste_dispose_num is not null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumEqualTo(Double value) {
            addCriterion("waste_dispose_num =", value, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumNotEqualTo(Double value) {
            addCriterion("waste_dispose_num <>", value, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumGreaterThan(Double value) {
            addCriterion("waste_dispose_num >", value, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumGreaterThanOrEqualTo(Double value) {
            addCriterion("waste_dispose_num >=", value, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumLessThan(Double value) {
            addCriterion("waste_dispose_num <", value, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumLessThanOrEqualTo(Double value) {
            addCriterion("waste_dispose_num <=", value, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumIn(List<Double> values) {
            addCriterion("waste_dispose_num in", values, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumNotIn(List<Double> values) {
            addCriterion("waste_dispose_num not in", values, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumBetween(Double value1, Double value2) {
            addCriterion("waste_dispose_num between", value1, value2, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeNumNotBetween(Double value1, Double value2) {
            addCriterion("waste_dispose_num not between", value1, value2, "wasteDisposeNum");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateIsNull() {
            addCriterion("waste_dispose_date is null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateIsNotNull() {
            addCriterion("waste_dispose_date is not null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateEqualTo(Date value) {
            addCriterion("waste_dispose_date =", value, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateNotEqualTo(Date value) {
            addCriterion("waste_dispose_date <>", value, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateGreaterThan(Date value) {
            addCriterion("waste_dispose_date >", value, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("waste_dispose_date >=", value, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateLessThan(Date value) {
            addCriterion("waste_dispose_date <", value, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateLessThanOrEqualTo(Date value) {
            addCriterion("waste_dispose_date <=", value, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateIn(List<Date> values) {
            addCriterion("waste_dispose_date in", values, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateNotIn(List<Date> values) {
            addCriterion("waste_dispose_date not in", values, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateBetween(Date value1, Date value2) {
            addCriterion("waste_dispose_date between", value1, value2, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeDateNotBetween(Date value1, Date value2) {
            addCriterion("waste_dispose_date not between", value1, value2, "wasteDisposeDate");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceIsNull() {
            addCriterion("waste_dispose_price is null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceIsNotNull() {
            addCriterion("waste_dispose_price is not null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceEqualTo(BigDecimal value) {
            addCriterion("waste_dispose_price =", value, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceNotEqualTo(BigDecimal value) {
            addCriterion("waste_dispose_price <>", value, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceGreaterThan(BigDecimal value) {
            addCriterion("waste_dispose_price >", value, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("waste_dispose_price >=", value, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceLessThan(BigDecimal value) {
            addCriterion("waste_dispose_price <", value, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("waste_dispose_price <=", value, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceIn(List<BigDecimal> values) {
            addCriterion("waste_dispose_price in", values, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceNotIn(List<BigDecimal> values) {
            addCriterion("waste_dispose_price not in", values, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("waste_dispose_price between", value1, value2, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteDisposePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("waste_dispose_price not between", value1, value2, "wasteDisposePrice");
            return (Criteria) this;
        }

        public Criteria andWasteUserIsNull() {
            addCriterion("waste_user is null");
            return (Criteria) this;
        }

        public Criteria andWasteUserIsNotNull() {
            addCriterion("waste_user is not null");
            return (Criteria) this;
        }

        public Criteria andWasteUserEqualTo(Integer value) {
            addCriterion("waste_user =", value, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserNotEqualTo(Integer value) {
            addCriterion("waste_user <>", value, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserGreaterThan(Integer value) {
            addCriterion("waste_user >", value, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("waste_user >=", value, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserLessThan(Integer value) {
            addCriterion("waste_user <", value, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserLessThanOrEqualTo(Integer value) {
            addCriterion("waste_user <=", value, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserIn(List<Integer> values) {
            addCriterion("waste_user in", values, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserNotIn(List<Integer> values) {
            addCriterion("waste_user not in", values, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserBetween(Integer value1, Integer value2) {
            addCriterion("waste_user between", value1, value2, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteUserNotBetween(Integer value1, Integer value2) {
            addCriterion("waste_user not between", value1, value2, "wasteUser");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkIsNull() {
            addCriterion("waste_remark is null");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkIsNotNull() {
            addCriterion("waste_remark is not null");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkEqualTo(String value) {
            addCriterion("waste_remark =", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkNotEqualTo(String value) {
            addCriterion("waste_remark <>", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkGreaterThan(String value) {
            addCriterion("waste_remark >", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("waste_remark >=", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkLessThan(String value) {
            addCriterion("waste_remark <", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkLessThanOrEqualTo(String value) {
            addCriterion("waste_remark <=", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkLike(String value) {
            addCriterion("waste_remark like", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkNotLike(String value) {
            addCriterion("waste_remark not like", value, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkIn(List<String> values) {
            addCriterion("waste_remark in", values, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkNotIn(List<String> values) {
            addCriterion("waste_remark not in", values, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkBetween(String value1, String value2) {
            addCriterion("waste_remark between", value1, value2, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteRemarkNotBetween(String value1, String value2) {
            addCriterion("waste_remark not between", value1, value2, "wasteRemark");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusIsNull() {
            addCriterion("waste_dispose_status is null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusIsNotNull() {
            addCriterion("waste_dispose_status is not null");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusEqualTo(String value) {
            addCriterion("waste_dispose_status =", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusNotEqualTo(String value) {
            addCriterion("waste_dispose_status <>", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusGreaterThan(String value) {
            addCriterion("waste_dispose_status >", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("waste_dispose_status >=", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusLessThan(String value) {
            addCriterion("waste_dispose_status <", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusLessThanOrEqualTo(String value) {
            addCriterion("waste_dispose_status <=", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusLike(String value) {
            addCriterion("waste_dispose_status like", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusNotLike(String value) {
            addCriterion("waste_dispose_status not like", value, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusIn(List<String> values) {
            addCriterion("waste_dispose_status in", values, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusNotIn(List<String> values) {
            addCriterion("waste_dispose_status not in", values, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusBetween(String value1, String value2) {
            addCriterion("waste_dispose_status between", value1, value2, "wasteDisposeStatus");
            return (Criteria) this;
        }

        public Criteria andWasteDisposeStatusNotBetween(String value1, String value2) {
            addCriterion("waste_dispose_status not between", value1, value2, "wasteDisposeStatus");
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

        public Criteria andReasonsRejectionIsNull() {
            addCriterion("reasons_rejection is null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNotNull() {
            addCriterion("reasons_rejection is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionEqualTo(String value) {
            addCriterion("reasons_rejection =", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotEqualTo(String value) {
            addCriterion("reasons_rejection <>", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThan(String value) {
            addCriterion("reasons_rejection >", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThanOrEqualTo(String value) {
            addCriterion("reasons_rejection >=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThan(String value) {
            addCriterion("reasons_rejection <", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThanOrEqualTo(String value) {
            addCriterion("reasons_rejection <=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLike(String value) {
            addCriterion("reasons_rejection like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotLike(String value) {
            addCriterion("reasons_rejection not like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIn(List<String> values) {
            addCriterion("reasons_rejection in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotIn(List<String> values) {
            addCriterion("reasons_rejection not in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionBetween(String value1, String value2) {
            addCriterion("reasons_rejection between", value1, value2, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotBetween(String value1, String value2) {
            addCriterion("reasons_rejection not between", value1, value2, "reasonsRejection");
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