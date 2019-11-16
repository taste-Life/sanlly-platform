package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareSparePartsReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareSparePartsReturnExample() {
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

        public Criteria andWareSparePartsReturnIdIsNull() {
            addCriterion("ware_spare_parts_return_id is null");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdIsNotNull() {
            addCriterion("ware_spare_parts_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdEqualTo(Integer value) {
            addCriterion("ware_spare_parts_return_id =", value, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdNotEqualTo(Integer value) {
            addCriterion("ware_spare_parts_return_id <>", value, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdGreaterThan(Integer value) {
            addCriterion("ware_spare_parts_return_id >", value, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_spare_parts_return_id >=", value, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdLessThan(Integer value) {
            addCriterion("ware_spare_parts_return_id <", value, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_spare_parts_return_id <=", value, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdIn(List<Integer> values) {
            addCriterion("ware_spare_parts_return_id in", values, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdNotIn(List<Integer> values) {
            addCriterion("ware_spare_parts_return_id not in", values, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_spare_parts_return_id between", value1, value2, "wareSparePartsReturnId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsReturnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_spare_parts_return_id not between", value1, value2, "wareSparePartsReturnId");
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

        public Criteria andNoTypeIsNull() {
            addCriterion("no_type is null");
            return (Criteria) this;
        }

        public Criteria andNoTypeIsNotNull() {
            addCriterion("no_type is not null");
            return (Criteria) this;
        }

        public Criteria andNoTypeEqualTo(String value) {
            addCriterion("no_type =", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeNotEqualTo(String value) {
            addCriterion("no_type <>", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeGreaterThan(String value) {
            addCriterion("no_type >", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("no_type >=", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeLessThan(String value) {
            addCriterion("no_type <", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeLessThanOrEqualTo(String value) {
            addCriterion("no_type <=", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeLike(String value) {
            addCriterion("no_type like", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeNotLike(String value) {
            addCriterion("no_type not like", value, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeIn(List<String> values) {
            addCriterion("no_type in", values, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeNotIn(List<String> values) {
            addCriterion("no_type not in", values, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeBetween(String value1, String value2) {
            addCriterion("no_type between", value1, value2, "noType");
            return (Criteria) this;
        }

        public Criteria andNoTypeNotBetween(String value1, String value2) {
            addCriterion("no_type not between", value1, value2, "noType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeIsNull() {
            addCriterion("spare_parts_return_type is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeIsNotNull() {
            addCriterion("spare_parts_return_type is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeEqualTo(String value) {
            addCriterion("spare_parts_return_type =", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeNotEqualTo(String value) {
            addCriterion("spare_parts_return_type <>", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeGreaterThan(String value) {
            addCriterion("spare_parts_return_type >", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_return_type >=", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeLessThan(String value) {
            addCriterion("spare_parts_return_type <", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_return_type <=", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeLike(String value) {
            addCriterion("spare_parts_return_type like", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeNotLike(String value) {
            addCriterion("spare_parts_return_type not like", value, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeIn(List<String> values) {
            addCriterion("spare_parts_return_type in", values, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeNotIn(List<String> values) {
            addCriterion("spare_parts_return_type not in", values, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeBetween(String value1, String value2) {
            addCriterion("spare_parts_return_type between", value1, value2, "sparePartsReturnType");
            return (Criteria) this;
        }

        public Criteria andSparePartsReturnTypeNotBetween(String value1, String value2) {
            addCriterion("spare_parts_return_type not between", value1, value2, "sparePartsReturnType");
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

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
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

        public Criteria andReturnWarehouseIsNull() {
            addCriterion("return_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseIsNotNull() {
            addCriterion("return_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseEqualTo(String value) {
            addCriterion("return_warehouse =", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseNotEqualTo(String value) {
            addCriterion("return_warehouse <>", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseGreaterThan(String value) {
            addCriterion("return_warehouse >", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("return_warehouse >=", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseLessThan(String value) {
            addCriterion("return_warehouse <", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseLessThanOrEqualTo(String value) {
            addCriterion("return_warehouse <=", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseLike(String value) {
            addCriterion("return_warehouse like", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseNotLike(String value) {
            addCriterion("return_warehouse not like", value, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseIn(List<String> values) {
            addCriterion("return_warehouse in", values, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseNotIn(List<String> values) {
            addCriterion("return_warehouse not in", values, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseBetween(String value1, String value2) {
            addCriterion("return_warehouse between", value1, value2, "returnWarehouse");
            return (Criteria) this;
        }

        public Criteria andReturnWarehouseNotBetween(String value1, String value2) {
            addCriterion("return_warehouse not between", value1, value2, "returnWarehouse");
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

        public Criteria andReturnNumIsNull() {
            addCriterion("return_num is null");
            return (Criteria) this;
        }

        public Criteria andReturnNumIsNotNull() {
            addCriterion("return_num is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNumEqualTo(Double value) {
            addCriterion("return_num =", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotEqualTo(Double value) {
            addCriterion("return_num <>", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThan(Double value) {
            addCriterion("return_num >", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThanOrEqualTo(Double value) {
            addCriterion("return_num >=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThan(Double value) {
            addCriterion("return_num <", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThanOrEqualTo(Double value) {
            addCriterion("return_num <=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumIn(List<Double> values) {
            addCriterion("return_num in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotIn(List<Double> values) {
            addCriterion("return_num not in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumBetween(Double value1, Double value2) {
            addCriterion("return_num between", value1, value2, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotBetween(Double value1, Double value2) {
            addCriterion("return_num not between", value1, value2, "returnNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIsNull() {
            addCriterion("surplus_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIsNotNull() {
            addCriterion("surplus_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusNumEqualTo(Double value) {
            addCriterion("surplus_num =", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotEqualTo(Double value) {
            addCriterion("surplus_num <>", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumGreaterThan(Double value) {
            addCriterion("surplus_num >", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_num >=", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumLessThan(Double value) {
            addCriterion("surplus_num <", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumLessThanOrEqualTo(Double value) {
            addCriterion("surplus_num <=", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIn(List<Double> values) {
            addCriterion("surplus_num in", values, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotIn(List<Double> values) {
            addCriterion("surplus_num not in", values, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumBetween(Double value1, Double value2) {
            addCriterion("surplus_num between", value1, value2, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotBetween(Double value1, Double value2) {
            addCriterion("surplus_num not between", value1, value2, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andReturnGoIsNull() {
            addCriterion("return_go is null");
            return (Criteria) this;
        }

        public Criteria andReturnGoIsNotNull() {
            addCriterion("return_go is not null");
            return (Criteria) this;
        }

        public Criteria andReturnGoEqualTo(String value) {
            addCriterion("return_go =", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoNotEqualTo(String value) {
            addCriterion("return_go <>", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoGreaterThan(String value) {
            addCriterion("return_go >", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoGreaterThanOrEqualTo(String value) {
            addCriterion("return_go >=", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoLessThan(String value) {
            addCriterion("return_go <", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoLessThanOrEqualTo(String value) {
            addCriterion("return_go <=", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoLike(String value) {
            addCriterion("return_go like", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoNotLike(String value) {
            addCriterion("return_go not like", value, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoIn(List<String> values) {
            addCriterion("return_go in", values, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoNotIn(List<String> values) {
            addCriterion("return_go not in", values, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoBetween(String value1, String value2) {
            addCriterion("return_go between", value1, value2, "returnGo");
            return (Criteria) this;
        }

        public Criteria andReturnGoNotBetween(String value1, String value2) {
            addCriterion("return_go not between", value1, value2, "returnGo");
            return (Criteria) this;
        }

        public Criteria andGoDescribeIsNull() {
            addCriterion("go_describe is null");
            return (Criteria) this;
        }

        public Criteria andGoDescribeIsNotNull() {
            addCriterion("go_describe is not null");
            return (Criteria) this;
        }

        public Criteria andGoDescribeEqualTo(String value) {
            addCriterion("go_describe =", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeNotEqualTo(String value) {
            addCriterion("go_describe <>", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeGreaterThan(String value) {
            addCriterion("go_describe >", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("go_describe >=", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeLessThan(String value) {
            addCriterion("go_describe <", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeLessThanOrEqualTo(String value) {
            addCriterion("go_describe <=", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeLike(String value) {
            addCriterion("go_describe like", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeNotLike(String value) {
            addCriterion("go_describe not like", value, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeIn(List<String> values) {
            addCriterion("go_describe in", values, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeNotIn(List<String> values) {
            addCriterion("go_describe not in", values, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeBetween(String value1, String value2) {
            addCriterion("go_describe between", value1, value2, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andGoDescribeNotBetween(String value1, String value2) {
            addCriterion("go_describe not between", value1, value2, "goDescribe");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIsNull() {
            addCriterion("accept_user is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIsNotNull() {
            addCriterion("accept_user is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserEqualTo(Integer value) {
            addCriterion("accept_user =", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotEqualTo(Integer value) {
            addCriterion("accept_user <>", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserGreaterThan(Integer value) {
            addCriterion("accept_user >", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("accept_user >=", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserLessThan(Integer value) {
            addCriterion("accept_user <", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserLessThanOrEqualTo(Integer value) {
            addCriterion("accept_user <=", value, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIn(List<Integer> values) {
            addCriterion("accept_user in", values, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotIn(List<Integer> values) {
            addCriterion("accept_user not in", values, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserBetween(Integer value1, Integer value2) {
            addCriterion("accept_user between", value1, value2, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNotBetween(Integer value1, Integer value2) {
            addCriterion("accept_user not between", value1, value2, "acceptUser");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("accept_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("accept_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterion("accept_date =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterion("accept_date <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterion("accept_date >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("accept_date >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterion("accept_date <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterion("accept_date <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterion("accept_date in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterion("accept_date not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterion("accept_date between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterion("accept_date not between", value1, value2, "acceptDate");
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