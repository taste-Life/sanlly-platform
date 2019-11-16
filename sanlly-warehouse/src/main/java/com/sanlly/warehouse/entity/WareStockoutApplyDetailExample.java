package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockoutApplyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockoutApplyDetailExample() {
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

        public Criteria andWareStockoutOrderDetailIdIsNull() {
            addCriterion("ware_stockout_order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdIsNotNull() {
            addCriterion("ware_stockout_order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdEqualTo(Integer value) {
            addCriterion("ware_stockout_order_detail_id =", value, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_stockout_order_detail_id <>", value, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdGreaterThan(Integer value) {
            addCriterion("ware_stockout_order_detail_id >", value, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_order_detail_id >=", value, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdLessThan(Integer value) {
            addCriterion("ware_stockout_order_detail_id <", value, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_order_detail_id <=", value, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdIn(List<Integer> values) {
            addCriterion("ware_stockout_order_detail_id in", values, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_stockout_order_detail_id not in", values, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_order_detail_id between", value1, value2, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutOrderDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_order_detail_id not between", value1, value2, "wareStockoutOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdIsNull() {
            addCriterion("ware_stockout_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdIsNotNull() {
            addCriterion("ware_stockout_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdEqualTo(Integer value) {
            addCriterion("ware_stockout_apply_id =", value, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdNotEqualTo(Integer value) {
            addCriterion("ware_stockout_apply_id <>", value, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdGreaterThan(Integer value) {
            addCriterion("ware_stockout_apply_id >", value, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_apply_id >=", value, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdLessThan(Integer value) {
            addCriterion("ware_stockout_apply_id <", value, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_apply_id <=", value, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdIn(List<Integer> values) {
            addCriterion("ware_stockout_apply_id in", values, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdNotIn(List<Integer> values) {
            addCriterion("ware_stockout_apply_id not in", values, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_apply_id between", value1, value2, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_apply_id not between", value1, value2, "wareStockoutApplyId");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeIsNull() {
            addCriterion("default_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeIsNotNull() {
            addCriterion("default_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeEqualTo(String value) {
            addCriterion("default_warehouse_type =", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotEqualTo(String value) {
            addCriterion("default_warehouse_type <>", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeGreaterThan(String value) {
            addCriterion("default_warehouse_type >", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("default_warehouse_type >=", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeLessThan(String value) {
            addCriterion("default_warehouse_type <", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("default_warehouse_type <=", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeLike(String value) {
            addCriterion("default_warehouse_type like", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotLike(String value) {
            addCriterion("default_warehouse_type not like", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeIn(List<String> values) {
            addCriterion("default_warehouse_type in", values, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotIn(List<String> values) {
            addCriterion("default_warehouse_type not in", values, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeBetween(String value1, String value2) {
            addCriterion("default_warehouse_type between", value1, value2, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("default_warehouse_type not between", value1, value2, "defaultWarehouseType");
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

        public Criteria andStockoutNumIsNull() {
            addCriterion("stockout_num is null");
            return (Criteria) this;
        }

        public Criteria andStockoutNumIsNotNull() {
            addCriterion("stockout_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutNumEqualTo(Double value) {
            addCriterion("stockout_num =", value, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumNotEqualTo(Double value) {
            addCriterion("stockout_num <>", value, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumGreaterThan(Double value) {
            addCriterion("stockout_num >", value, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockout_num >=", value, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumLessThan(Double value) {
            addCriterion("stockout_num <", value, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumLessThanOrEqualTo(Double value) {
            addCriterion("stockout_num <=", value, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumIn(List<Double> values) {
            addCriterion("stockout_num in", values, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumNotIn(List<Double> values) {
            addCriterion("stockout_num not in", values, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumBetween(Double value1, Double value2) {
            addCriterion("stockout_num between", value1, value2, "stockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockoutNumNotBetween(Double value1, Double value2) {
            addCriterion("stockout_num not between", value1, value2, "stockoutNum");
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

        public Criteria andLengthIsNull() {
            addCriterion("`length` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`length` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("`length` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("`length` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("`length` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("`length` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("`length` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("`length` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("`length` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("`length` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("`length` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("`length` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaIsNull() {
            addCriterion("stockout_area is null");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaIsNotNull() {
            addCriterion("stockout_area is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaEqualTo(Double value) {
            addCriterion("stockout_area =", value, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaNotEqualTo(Double value) {
            addCriterion("stockout_area <>", value, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaGreaterThan(Double value) {
            addCriterion("stockout_area >", value, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("stockout_area >=", value, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaLessThan(Double value) {
            addCriterion("stockout_area <", value, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaLessThanOrEqualTo(Double value) {
            addCriterion("stockout_area <=", value, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaIn(List<Double> values) {
            addCriterion("stockout_area in", values, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaNotIn(List<Double> values) {
            addCriterion("stockout_area not in", values, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaBetween(Double value1, Double value2) {
            addCriterion("stockout_area between", value1, value2, "stockoutArea");
            return (Criteria) this;
        }

        public Criteria andStockoutAreaNotBetween(Double value1, Double value2) {
            addCriterion("stockout_area not between", value1, value2, "stockoutArea");
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

        public Criteria andUseUserIsNull() {
            addCriterion("use_user is null");
            return (Criteria) this;
        }

        public Criteria andUseUserIsNotNull() {
            addCriterion("use_user is not null");
            return (Criteria) this;
        }

        public Criteria andUseUserEqualTo(String value) {
            addCriterion("use_user =", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserNotEqualTo(String value) {
            addCriterion("use_user <>", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserGreaterThan(String value) {
            addCriterion("use_user >", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserGreaterThanOrEqualTo(String value) {
            addCriterion("use_user >=", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserLessThan(String value) {
            addCriterion("use_user <", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserLessThanOrEqualTo(String value) {
            addCriterion("use_user <=", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserLike(String value) {
            addCriterion("use_user like", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserNotLike(String value) {
            addCriterion("use_user not like", value, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserIn(List<String> values) {
            addCriterion("use_user in", values, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserNotIn(List<String> values) {
            addCriterion("use_user not in", values, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserBetween(String value1, String value2) {
            addCriterion("use_user between", value1, value2, "useUser");
            return (Criteria) this;
        }

        public Criteria andUseUserNotBetween(String value1, String value2) {
            addCriterion("use_user not between", value1, value2, "useUser");
            return (Criteria) this;
        }

        public Criteria andYardIsNull() {
            addCriterion("yard is null");
            return (Criteria) this;
        }

        public Criteria andYardIsNotNull() {
            addCriterion("yard is not null");
            return (Criteria) this;
        }

        public Criteria andYardEqualTo(String value) {
            addCriterion("yard =", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotEqualTo(String value) {
            addCriterion("yard <>", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThan(String value) {
            addCriterion("yard >", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThanOrEqualTo(String value) {
            addCriterion("yard >=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThan(String value) {
            addCriterion("yard <", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThanOrEqualTo(String value) {
            addCriterion("yard <=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLike(String value) {
            addCriterion("yard like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotLike(String value) {
            addCriterion("yard not like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardIn(List<String> values) {
            addCriterion("yard in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotIn(List<String> values) {
            addCriterion("yard not in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardBetween(String value1, String value2) {
            addCriterion("yard between", value1, value2, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotBetween(String value1, String value2) {
            addCriterion("yard not between", value1, value2, "yard");
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

        public Criteria andStockoutSurplusAreaIsNull() {
            addCriterion("stockout_surplus_area is null");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaIsNotNull() {
            addCriterion("stockout_surplus_area is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaEqualTo(Double value) {
            addCriterion("stockout_surplus_area =", value, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaNotEqualTo(Double value) {
            addCriterion("stockout_surplus_area <>", value, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaGreaterThan(Double value) {
            addCriterion("stockout_surplus_area >", value, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("stockout_surplus_area >=", value, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaLessThan(Double value) {
            addCriterion("stockout_surplus_area <", value, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaLessThanOrEqualTo(Double value) {
            addCriterion("stockout_surplus_area <=", value, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaIn(List<Double> values) {
            addCriterion("stockout_surplus_area in", values, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaNotIn(List<Double> values) {
            addCriterion("stockout_surplus_area not in", values, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaBetween(Double value1, Double value2) {
            addCriterion("stockout_surplus_area between", value1, value2, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusAreaNotBetween(Double value1, Double value2) {
            addCriterion("stockout_surplus_area not between", value1, value2, "stockoutSurplusArea");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumIsNull() {
            addCriterion("stockout_surplus_num is null");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumIsNotNull() {
            addCriterion("stockout_surplus_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumEqualTo(Double value) {
            addCriterion("stockout_surplus_num =", value, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumNotEqualTo(Double value) {
            addCriterion("stockout_surplus_num <>", value, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumGreaterThan(Double value) {
            addCriterion("stockout_surplus_num >", value, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockout_surplus_num >=", value, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumLessThan(Double value) {
            addCriterion("stockout_surplus_num <", value, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumLessThanOrEqualTo(Double value) {
            addCriterion("stockout_surplus_num <=", value, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumIn(List<Double> values) {
            addCriterion("stockout_surplus_num in", values, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumNotIn(List<Double> values) {
            addCriterion("stockout_surplus_num not in", values, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumBetween(Double value1, Double value2) {
            addCriterion("stockout_surplus_num between", value1, value2, "stockoutSurplusNum");
            return (Criteria) this;
        }

        public Criteria andStockoutSurplusNumNotBetween(Double value1, Double value2) {
            addCriterion("stockout_surplus_num not between", value1, value2, "stockoutSurplusNum");
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