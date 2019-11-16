package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareShouleSpareReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareShouleSpareReturnExample() {
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

        public Criteria andWareShouleSpareReturnIdIsNull() {
            addCriterion("ware_shoule_spare_return_id is null");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdIsNotNull() {
            addCriterion("ware_shoule_spare_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdEqualTo(Integer value) {
            addCriterion("ware_shoule_spare_return_id =", value, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdNotEqualTo(Integer value) {
            addCriterion("ware_shoule_spare_return_id <>", value, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdGreaterThan(Integer value) {
            addCriterion("ware_shoule_spare_return_id >", value, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_shoule_spare_return_id >=", value, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdLessThan(Integer value) {
            addCriterion("ware_shoule_spare_return_id <", value, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_shoule_spare_return_id <=", value, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdIn(List<Integer> values) {
            addCriterion("ware_shoule_spare_return_id in", values, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdNotIn(List<Integer> values) {
            addCriterion("ware_shoule_spare_return_id not in", values, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_shoule_spare_return_id between", value1, value2, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andWareShouleSpareReturnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_shoule_spare_return_id not between", value1, value2, "wareShouleSpareReturnId");
            return (Criteria) this;
        }

        public Criteria andStockoutIsNull() {
            addCriterion("stockout is null");
            return (Criteria) this;
        }

        public Criteria andStockoutIsNotNull() {
            addCriterion("stockout is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutEqualTo(Integer value) {
            addCriterion("stockout =", value, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutNotEqualTo(Integer value) {
            addCriterion("stockout <>", value, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutGreaterThan(Integer value) {
            addCriterion("stockout >", value, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockout >=", value, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutLessThan(Integer value) {
            addCriterion("stockout <", value, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutLessThanOrEqualTo(Integer value) {
            addCriterion("stockout <=", value, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutIn(List<Integer> values) {
            addCriterion("stockout in", values, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutNotIn(List<Integer> values) {
            addCriterion("stockout not in", values, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutBetween(Integer value1, Integer value2) {
            addCriterion("stockout between", value1, value2, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutNotBetween(Integer value1, Integer value2) {
            addCriterion("stockout not between", value1, value2, "stockout");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailIsNull() {
            addCriterion("stockout_detail is null");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailIsNotNull() {
            addCriterion("stockout_detail is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailEqualTo(Integer value) {
            addCriterion("stockout_detail =", value, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailNotEqualTo(Integer value) {
            addCriterion("stockout_detail <>", value, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailGreaterThan(Integer value) {
            addCriterion("stockout_detail >", value, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockout_detail >=", value, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailLessThan(Integer value) {
            addCriterion("stockout_detail <", value, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailLessThanOrEqualTo(Integer value) {
            addCriterion("stockout_detail <=", value, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailIn(List<Integer> values) {
            addCriterion("stockout_detail in", values, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailNotIn(List<Integer> values) {
            addCriterion("stockout_detail not in", values, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailBetween(Integer value1, Integer value2) {
            addCriterion("stockout_detail between", value1, value2, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andStockoutDetailNotBetween(Integer value1, Integer value2) {
            addCriterion("stockout_detail not between", value1, value2, "stockoutDetail");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("bill_type like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("bill_type not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("return_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("return_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("return_type =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("return_type <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("return_type >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("return_type >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("return_type <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("return_type <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("return_type like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("return_type not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("return_type in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("return_type not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("return_type between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("return_type not between", value1, value2, "returnType");
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

        public Criteria andStockoutYardIsNull() {
            addCriterion("stockout_yard is null");
            return (Criteria) this;
        }

        public Criteria andStockoutYardIsNotNull() {
            addCriterion("stockout_yard is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutYardEqualTo(String value) {
            addCriterion("stockout_yard =", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardNotEqualTo(String value) {
            addCriterion("stockout_yard <>", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardGreaterThan(String value) {
            addCriterion("stockout_yard >", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_yard >=", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardLessThan(String value) {
            addCriterion("stockout_yard <", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardLessThanOrEqualTo(String value) {
            addCriterion("stockout_yard <=", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardLike(String value) {
            addCriterion("stockout_yard like", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardNotLike(String value) {
            addCriterion("stockout_yard not like", value, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardIn(List<String> values) {
            addCriterion("stockout_yard in", values, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardNotIn(List<String> values) {
            addCriterion("stockout_yard not in", values, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardBetween(String value1, String value2) {
            addCriterion("stockout_yard between", value1, value2, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutYardNotBetween(String value1, String value2) {
            addCriterion("stockout_yard not between", value1, value2, "stockoutYard");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseIsNull() {
            addCriterion("stockout_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseIsNotNull() {
            addCriterion("stockout_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseEqualTo(String value) {
            addCriterion("stockout_warehouse =", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseNotEqualTo(String value) {
            addCriterion("stockout_warehouse <>", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseGreaterThan(String value) {
            addCriterion("stockout_warehouse >", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_warehouse >=", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseLessThan(String value) {
            addCriterion("stockout_warehouse <", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseLessThanOrEqualTo(String value) {
            addCriterion("stockout_warehouse <=", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseLike(String value) {
            addCriterion("stockout_warehouse like", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseNotLike(String value) {
            addCriterion("stockout_warehouse not like", value, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseIn(List<String> values) {
            addCriterion("stockout_warehouse in", values, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseNotIn(List<String> values) {
            addCriterion("stockout_warehouse not in", values, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseBetween(String value1, String value2) {
            addCriterion("stockout_warehouse between", value1, value2, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andStockoutWarehouseNotBetween(String value1, String value2) {
            addCriterion("stockout_warehouse not between", value1, value2, "stockoutWarehouse");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsIsNull() {
            addCriterion("receive_departments is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsIsNotNull() {
            addCriterion("receive_departments is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsEqualTo(String value) {
            addCriterion("receive_departments =", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsNotEqualTo(String value) {
            addCriterion("receive_departments <>", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsGreaterThan(String value) {
            addCriterion("receive_departments >", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsGreaterThanOrEqualTo(String value) {
            addCriterion("receive_departments >=", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsLessThan(String value) {
            addCriterion("receive_departments <", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsLessThanOrEqualTo(String value) {
            addCriterion("receive_departments <=", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsLike(String value) {
            addCriterion("receive_departments like", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsNotLike(String value) {
            addCriterion("receive_departments not like", value, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsIn(List<String> values) {
            addCriterion("receive_departments in", values, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsNotIn(List<String> values) {
            addCriterion("receive_departments not in", values, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsBetween(String value1, String value2) {
            addCriterion("receive_departments between", value1, value2, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentsNotBetween(String value1, String value2) {
            addCriterion("receive_departments not between", value1, value2, "receiveDepartments");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("receive_user is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("receive_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(Integer value) {
            addCriterion("receive_user =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(Integer value) {
            addCriterion("receive_user <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(Integer value) {
            addCriterion("receive_user >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_user >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(Integer value) {
            addCriterion("receive_user <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(Integer value) {
            addCriterion("receive_user <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<Integer> values) {
            addCriterion("receive_user in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<Integer> values) {
            addCriterion("receive_user not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(Integer value1, Integer value2) {
            addCriterion("receive_user between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_user not between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andStockoutDateIsNull() {
            addCriterion("stockout_date is null");
            return (Criteria) this;
        }

        public Criteria andStockoutDateIsNotNull() {
            addCriterion("stockout_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutDateEqualTo(Date value) {
            addCriterion("stockout_date =", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateNotEqualTo(Date value) {
            addCriterion("stockout_date <>", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateGreaterThan(Date value) {
            addCriterion("stockout_date >", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockout_date >=", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateLessThan(Date value) {
            addCriterion("stockout_date <", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateLessThanOrEqualTo(Date value) {
            addCriterion("stockout_date <=", value, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateIn(List<Date> values) {
            addCriterion("stockout_date in", values, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateNotIn(List<Date> values) {
            addCriterion("stockout_date not in", values, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateBetween(Date value1, Date value2) {
            addCriterion("stockout_date between", value1, value2, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutDateNotBetween(Date value1, Date value2) {
            addCriterion("stockout_date not between", value1, value2, "stockoutDate");
            return (Criteria) this;
        }

        public Criteria andStockoutGoIsNull() {
            addCriterion("stockout_go is null");
            return (Criteria) this;
        }

        public Criteria andStockoutGoIsNotNull() {
            addCriterion("stockout_go is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutGoEqualTo(String value) {
            addCriterion("stockout_go =", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoNotEqualTo(String value) {
            addCriterion("stockout_go <>", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoGreaterThan(String value) {
            addCriterion("stockout_go >", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_go >=", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoLessThan(String value) {
            addCriterion("stockout_go <", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoLessThanOrEqualTo(String value) {
            addCriterion("stockout_go <=", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoLike(String value) {
            addCriterion("stockout_go like", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoNotLike(String value) {
            addCriterion("stockout_go not like", value, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoIn(List<String> values) {
            addCriterion("stockout_go in", values, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoNotIn(List<String> values) {
            addCriterion("stockout_go not in", values, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoBetween(String value1, String value2) {
            addCriterion("stockout_go between", value1, value2, "stockoutGo");
            return (Criteria) this;
        }

        public Criteria andStockoutGoNotBetween(String value1, String value2) {
            addCriterion("stockout_go not between", value1, value2, "stockoutGo");
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

        public Criteria andReturnStatusIsNull() {
            addCriterion("return_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("return_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(String value) {
            addCriterion("return_status =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(String value) {
            addCriterion("return_status <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(String value) {
            addCriterion("return_status >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("return_status >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(String value) {
            addCriterion("return_status <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(String value) {
            addCriterion("return_status <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLike(String value) {
            addCriterion("return_status like", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotLike(String value) {
            addCriterion("return_status not like", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<String> values) {
            addCriterion("return_status in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<String> values) {
            addCriterion("return_status not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(String value1, String value2) {
            addCriterion("return_status between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(String value1, String value2) {
            addCriterion("return_status not between", value1, value2, "returnStatus");
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

        public Criteria andRealityStockoutNumIsNull() {
            addCriterion("reality_stockout_num is null");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumIsNotNull() {
            addCriterion("reality_stockout_num is not null");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumEqualTo(Double value) {
            addCriterion("reality_stockout_num =", value, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumNotEqualTo(Double value) {
            addCriterion("reality_stockout_num <>", value, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumGreaterThan(Double value) {
            addCriterion("reality_stockout_num >", value, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumGreaterThanOrEqualTo(Double value) {
            addCriterion("reality_stockout_num >=", value, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumLessThan(Double value) {
            addCriterion("reality_stockout_num <", value, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumLessThanOrEqualTo(Double value) {
            addCriterion("reality_stockout_num <=", value, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumIn(List<Double> values) {
            addCriterion("reality_stockout_num in", values, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumNotIn(List<Double> values) {
            addCriterion("reality_stockout_num not in", values, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumBetween(Double value1, Double value2) {
            addCriterion("reality_stockout_num between", value1, value2, "realityStockoutNum");
            return (Criteria) this;
        }

        public Criteria andRealityStockoutNumNotBetween(Double value1, Double value2) {
            addCriterion("reality_stockout_num not between", value1, value2, "realityStockoutNum");
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