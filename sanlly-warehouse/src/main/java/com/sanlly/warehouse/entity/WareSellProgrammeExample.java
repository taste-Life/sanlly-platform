package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareSellProgrammeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareSellProgrammeExample() {
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

        public Criteria andWareSellProgrammeIdIsNull() {
            addCriterion("ware_sell_programme_id is null");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdIsNotNull() {
            addCriterion("ware_sell_programme_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdEqualTo(Integer value) {
            addCriterion("ware_sell_programme_id =", value, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdNotEqualTo(Integer value) {
            addCriterion("ware_sell_programme_id <>", value, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdGreaterThan(Integer value) {
            addCriterion("ware_sell_programme_id >", value, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_sell_programme_id >=", value, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdLessThan(Integer value) {
            addCriterion("ware_sell_programme_id <", value, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_sell_programme_id <=", value, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdIn(List<Integer> values) {
            addCriterion("ware_sell_programme_id in", values, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdNotIn(List<Integer> values) {
            addCriterion("ware_sell_programme_id not in", values, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_sell_programme_id between", value1, value2, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andWareSellProgrammeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_sell_programme_id not between", value1, value2, "wareSellProgrammeId");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIsNull() {
            addCriterion("advance_warehouse_receipt_no is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIsNotNull() {
            addCriterion("advance_warehouse_receipt_no is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no =", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no <>", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoGreaterThan(String value) {
            addCriterion("advance_warehouse_receipt_no >", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoGreaterThanOrEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no >=", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLessThan(String value) {
            addCriterion("advance_warehouse_receipt_no <", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLessThanOrEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no <=", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLike(String value) {
            addCriterion("advance_warehouse_receipt_no like", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotLike(String value) {
            addCriterion("advance_warehouse_receipt_no not like", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIn(List<String> values) {
            addCriterion("advance_warehouse_receipt_no in", values, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotIn(List<String> values) {
            addCriterion("advance_warehouse_receipt_no not in", values, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoBetween(String value1, String value2) {
            addCriterion("advance_warehouse_receipt_no between", value1, value2, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotBetween(String value1, String value2) {
            addCriterion("advance_warehouse_receipt_no not between", value1, value2, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoIsNull() {
            addCriterion("sell_programme_no is null");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoIsNotNull() {
            addCriterion("sell_programme_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoEqualTo(String value) {
            addCriterion("sell_programme_no =", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoNotEqualTo(String value) {
            addCriterion("sell_programme_no <>", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoGreaterThan(String value) {
            addCriterion("sell_programme_no >", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoGreaterThanOrEqualTo(String value) {
            addCriterion("sell_programme_no >=", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoLessThan(String value) {
            addCriterion("sell_programme_no <", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoLessThanOrEqualTo(String value) {
            addCriterion("sell_programme_no <=", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoLike(String value) {
            addCriterion("sell_programme_no like", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoNotLike(String value) {
            addCriterion("sell_programme_no not like", value, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoIn(List<String> values) {
            addCriterion("sell_programme_no in", values, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoNotIn(List<String> values) {
            addCriterion("sell_programme_no not in", values, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoBetween(String value1, String value2) {
            addCriterion("sell_programme_no between", value1, value2, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andSellProgrammeNoNotBetween(String value1, String value2) {
            addCriterion("sell_programme_no not between", value1, value2, "sellProgrammeNo");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
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

        public Criteria andApplyDepartmentIsNull() {
            addCriterion("apply_department is null");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentIsNotNull() {
            addCriterion("apply_department is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentEqualTo(String value) {
            addCriterion("apply_department =", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotEqualTo(String value) {
            addCriterion("apply_department <>", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentGreaterThan(String value) {
            addCriterion("apply_department >", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("apply_department >=", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentLessThan(String value) {
            addCriterion("apply_department <", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentLessThanOrEqualTo(String value) {
            addCriterion("apply_department <=", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentLike(String value) {
            addCriterion("apply_department like", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotLike(String value) {
            addCriterion("apply_department not like", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentIn(List<String> values) {
            addCriterion("apply_department in", values, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotIn(List<String> values) {
            addCriterion("apply_department not in", values, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentBetween(String value1, String value2) {
            addCriterion("apply_department between", value1, value2, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotBetween(String value1, String value2) {
            addCriterion("apply_department not between", value1, value2, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("buyer like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("buyer not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNull() {
            addCriterion("apply_user is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNotNull() {
            addCriterion("apply_user is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(Integer value) {
            addCriterion("apply_user =", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotEqualTo(Integer value) {
            addCriterion("apply_user <>", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThan(Integer value) {
            addCriterion("apply_user >", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_user >=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThan(Integer value) {
            addCriterion("apply_user <", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThanOrEqualTo(Integer value) {
            addCriterion("apply_user <=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserIn(List<Integer> values) {
            addCriterion("apply_user in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotIn(List<Integer> values) {
            addCriterion("apply_user not in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserBetween(Integer value1, Integer value2) {
            addCriterion("apply_user between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_user not between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
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

        public Criteria andApplyDetailsIsNull() {
            addCriterion("apply_details is null");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsIsNotNull() {
            addCriterion("apply_details is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsEqualTo(String value) {
            addCriterion("apply_details =", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsNotEqualTo(String value) {
            addCriterion("apply_details <>", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsGreaterThan(String value) {
            addCriterion("apply_details >", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("apply_details >=", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsLessThan(String value) {
            addCriterion("apply_details <", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsLessThanOrEqualTo(String value) {
            addCriterion("apply_details <=", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsLike(String value) {
            addCriterion("apply_details like", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsNotLike(String value) {
            addCriterion("apply_details not like", value, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsIn(List<String> values) {
            addCriterion("apply_details in", values, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsNotIn(List<String> values) {
            addCriterion("apply_details not in", values, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsBetween(String value1, String value2) {
            addCriterion("apply_details between", value1, value2, "applyDetails");
            return (Criteria) this;
        }

        public Criteria andApplyDetailsNotBetween(String value1, String value2) {
            addCriterion("apply_details not between", value1, value2, "applyDetails");
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsIsNull() {
            addCriterion("is_stock_sbs is null");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsIsNotNull() {
            addCriterion("is_stock_sbs is not null");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsEqualTo(String value) {
            addCriterion("is_stock_sbs =", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotEqualTo(String value) {
            addCriterion("is_stock_sbs <>", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsGreaterThan(String value) {
            addCriterion("is_stock_sbs >", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsGreaterThanOrEqualTo(String value) {
            addCriterion("is_stock_sbs >=", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsLessThan(String value) {
            addCriterion("is_stock_sbs <", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsLessThanOrEqualTo(String value) {
            addCriterion("is_stock_sbs <=", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsLike(String value) {
            addCriterion("is_stock_sbs like", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotLike(String value) {
            addCriterion("is_stock_sbs not like", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsIn(List<String> values) {
            addCriterion("is_stock_sbs in", values, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotIn(List<String> values) {
            addCriterion("is_stock_sbs not in", values, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsBetween(String value1, String value2) {
            addCriterion("is_stock_sbs between", value1, value2, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotBetween(String value1, String value2) {
            addCriterion("is_stock_sbs not between", value1, value2, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIsNull() {
            addCriterion("buyer_user is null");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIsNotNull() {
            addCriterion("buyer_user is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerUserEqualTo(String value) {
            addCriterion("buyer_user =", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserNotEqualTo(String value) {
            addCriterion("buyer_user <>", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserGreaterThan(String value) {
            addCriterion("buyer_user >", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_user >=", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserLessThan(String value) {
            addCriterion("buyer_user <", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserLessThanOrEqualTo(String value) {
            addCriterion("buyer_user <=", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserLike(String value) {
            addCriterion("buyer_user like", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserNotLike(String value) {
            addCriterion("buyer_user not like", value, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIn(List<String> values) {
            addCriterion("buyer_user in", values, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserNotIn(List<String> values) {
            addCriterion("buyer_user not in", values, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserBetween(String value1, String value2) {
            addCriterion("buyer_user between", value1, value2, "buyerUser");
            return (Criteria) this;
        }

        public Criteria andBuyerUserNotBetween(String value1, String value2) {
            addCriterion("buyer_user not between", value1, value2, "buyerUser");
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