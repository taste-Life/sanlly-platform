package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockinDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockinDetailExample() {
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

        public Criteria andWareStockinDetailIdIsNull() {
            addCriterion("ware_stockin_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdIsNotNull() {
            addCriterion("ware_stockin_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_id =", value, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_id <>", value, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdGreaterThan(Integer value) {
            addCriterion("ware_stockin_detail_id >", value, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_id >=", value, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdLessThan(Integer value) {
            addCriterion("ware_stockin_detail_id <", value, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_id <=", value, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdIn(List<Integer> values) {
            addCriterion("ware_stockin_detail_id in", values, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_stockin_detail_id not in", values, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_detail_id between", value1, value2, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_detail_id not between", value1, value2, "wareStockinDetailId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdIsNull() {
            addCriterion("ware_stockin_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdIsNotNull() {
            addCriterion("ware_stockin_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdEqualTo(Integer value) {
            addCriterion("ware_stockin_id =", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdNotEqualTo(Integer value) {
            addCriterion("ware_stockin_id <>", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdGreaterThan(Integer value) {
            addCriterion("ware_stockin_id >", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_id >=", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdLessThan(Integer value) {
            addCriterion("ware_stockin_id <", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_id <=", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdIn(List<Integer> values) {
            addCriterion("ware_stockin_id in", values, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdNotIn(List<Integer> values) {
            addCriterion("ware_stockin_id not in", values, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_id between", value1, value2, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_id not between", value1, value2, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andStockinBatchIsNull() {
            addCriterion("stockin_batch is null");
            return (Criteria) this;
        }

        public Criteria andStockinBatchIsNotNull() {
            addCriterion("stockin_batch is not null");
            return (Criteria) this;
        }

        public Criteria andStockinBatchEqualTo(String value) {
            addCriterion("stockin_batch =", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchNotEqualTo(String value) {
            addCriterion("stockin_batch <>", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchGreaterThan(String value) {
            addCriterion("stockin_batch >", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_batch >=", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchLessThan(String value) {
            addCriterion("stockin_batch <", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchLessThanOrEqualTo(String value) {
            addCriterion("stockin_batch <=", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchLike(String value) {
            addCriterion("stockin_batch like", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchNotLike(String value) {
            addCriterion("stockin_batch not like", value, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchIn(List<String> values) {
            addCriterion("stockin_batch in", values, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchNotIn(List<String> values) {
            addCriterion("stockin_batch not in", values, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchBetween(String value1, String value2) {
            addCriterion("stockin_batch between", value1, value2, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andStockinBatchNotBetween(String value1, String value2) {
            addCriterion("stockin_batch not between", value1, value2, "stockinBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchIsNull() {
            addCriterion("spare_parts_original_batch is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchIsNotNull() {
            addCriterion("spare_parts_original_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchEqualTo(String value) {
            addCriterion("spare_parts_original_batch =", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotEqualTo(String value) {
            addCriterion("spare_parts_original_batch <>", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchGreaterThan(String value) {
            addCriterion("spare_parts_original_batch >", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_original_batch >=", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchLessThan(String value) {
            addCriterion("spare_parts_original_batch <", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_original_batch <=", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchLike(String value) {
            addCriterion("spare_parts_original_batch like", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotLike(String value) {
            addCriterion("spare_parts_original_batch not like", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchIn(List<String> values) {
            addCriterion("spare_parts_original_batch in", values, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotIn(List<String> values) {
            addCriterion("spare_parts_original_batch not in", values, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchBetween(String value1, String value2) {
            addCriterion("spare_parts_original_batch between", value1, value2, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotBetween(String value1, String value2) {
            addCriterion("spare_parts_original_batch not between", value1, value2, "sparePartsOriginalBatch");
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

        public Criteria andEntryAreaIsNull() {
            addCriterion("entry_area is null");
            return (Criteria) this;
        }

        public Criteria andEntryAreaIsNotNull() {
            addCriterion("entry_area is not null");
            return (Criteria) this;
        }

        public Criteria andEntryAreaEqualTo(Double value) {
            addCriterion("entry_area =", value, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaNotEqualTo(Double value) {
            addCriterion("entry_area <>", value, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaGreaterThan(Double value) {
            addCriterion("entry_area >", value, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("entry_area >=", value, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaLessThan(Double value) {
            addCriterion("entry_area <", value, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaLessThanOrEqualTo(Double value) {
            addCriterion("entry_area <=", value, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaIn(List<Double> values) {
            addCriterion("entry_area in", values, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaNotIn(List<Double> values) {
            addCriterion("entry_area not in", values, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaBetween(Double value1, Double value2) {
            addCriterion("entry_area between", value1, value2, "entryArea");
            return (Criteria) this;
        }

        public Criteria andEntryAreaNotBetween(Double value1, Double value2) {
            addCriterion("entry_area not between", value1, value2, "entryArea");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNull() {
            addCriterion("delivery_num is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNotNull() {
            addCriterion("delivery_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumEqualTo(Double value) {
            addCriterion("delivery_num =", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotEqualTo(Double value) {
            addCriterion("delivery_num <>", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThan(Double value) {
            addCriterion("delivery_num >", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery_num >=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThan(Double value) {
            addCriterion("delivery_num <", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThanOrEqualTo(Double value) {
            addCriterion("delivery_num <=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIn(List<Double> values) {
            addCriterion("delivery_num in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotIn(List<Double> values) {
            addCriterion("delivery_num not in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumBetween(Double value1, Double value2) {
            addCriterion("delivery_num between", value1, value2, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotBetween(Double value1, Double value2) {
            addCriterion("delivery_num not between", value1, value2, "deliveryNum");
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

        public Criteria andEntryNumIsNull() {
            addCriterion("entry_num is null");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNotNull() {
            addCriterion("entry_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNumEqualTo(Double value) {
            addCriterion("entry_num =", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotEqualTo(Double value) {
            addCriterion("entry_num <>", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThan(Double value) {
            addCriterion("entry_num >", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThanOrEqualTo(Double value) {
            addCriterion("entry_num >=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThan(Double value) {
            addCriterion("entry_num <", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThanOrEqualTo(Double value) {
            addCriterion("entry_num <=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumIn(List<Double> values) {
            addCriterion("entry_num in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotIn(List<Double> values) {
            addCriterion("entry_num not in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumBetween(Double value1, Double value2) {
            addCriterion("entry_num between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotBetween(Double value1, Double value2) {
            addCriterion("entry_num not between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNull() {
            addCriterion("storage_location is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNotNull() {
            addCriterion("storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationEqualTo(String value) {
            addCriterion("storage_location =", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotEqualTo(String value) {
            addCriterion("storage_location <>", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThan(String value) {
            addCriterion("storage_location >", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("storage_location >=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThan(String value) {
            addCriterion("storage_location <", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("storage_location <=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLike(String value) {
            addCriterion("storage_location like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotLike(String value) {
            addCriterion("storage_location not like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIn(List<String> values) {
            addCriterion("storage_location in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotIn(List<String> values) {
            addCriterion("storage_location not in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBetween(String value1, String value2) {
            addCriterion("storage_location between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotBetween(String value1, String value2) {
            addCriterion("storage_location not between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andTariffIsNull() {
            addCriterion("tariff is null");
            return (Criteria) this;
        }

        public Criteria andTariffIsNotNull() {
            addCriterion("tariff is not null");
            return (Criteria) this;
        }

        public Criteria andTariffEqualTo(BigDecimal value) {
            addCriterion("tariff =", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotEqualTo(BigDecimal value) {
            addCriterion("tariff <>", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThan(BigDecimal value) {
            addCriterion("tariff >", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tariff >=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThan(BigDecimal value) {
            addCriterion("tariff <", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tariff <=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffIn(List<BigDecimal> values) {
            addCriterion("tariff in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotIn(List<BigDecimal> values) {
            addCriterion("tariff not in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tariff between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tariff not between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffStatusIsNull() {
            addCriterion("tariff_status is null");
            return (Criteria) this;
        }

        public Criteria andTariffStatusIsNotNull() {
            addCriterion("tariff_status is not null");
            return (Criteria) this;
        }

        public Criteria andTariffStatusEqualTo(String value) {
            addCriterion("tariff_status =", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotEqualTo(String value) {
            addCriterion("tariff_status <>", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusGreaterThan(String value) {
            addCriterion("tariff_status >", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tariff_status >=", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusLessThan(String value) {
            addCriterion("tariff_status <", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusLessThanOrEqualTo(String value) {
            addCriterion("tariff_status <=", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusLike(String value) {
            addCriterion("tariff_status like", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotLike(String value) {
            addCriterion("tariff_status not like", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusIn(List<String> values) {
            addCriterion("tariff_status in", values, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotIn(List<String> values) {
            addCriterion("tariff_status not in", values, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusBetween(String value1, String value2) {
            addCriterion("tariff_status between", value1, value2, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotBetween(String value1, String value2) {
            addCriterion("tariff_status not between", value1, value2, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffNoIsNull() {
            addCriterion("tariff_no is null");
            return (Criteria) this;
        }

        public Criteria andTariffNoIsNotNull() {
            addCriterion("tariff_no is not null");
            return (Criteria) this;
        }

        public Criteria andTariffNoEqualTo(String value) {
            addCriterion("tariff_no =", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotEqualTo(String value) {
            addCriterion("tariff_no <>", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoGreaterThan(String value) {
            addCriterion("tariff_no >", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoGreaterThanOrEqualTo(String value) {
            addCriterion("tariff_no >=", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoLessThan(String value) {
            addCriterion("tariff_no <", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoLessThanOrEqualTo(String value) {
            addCriterion("tariff_no <=", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoLike(String value) {
            addCriterion("tariff_no like", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotLike(String value) {
            addCriterion("tariff_no not like", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoIn(List<String> values) {
            addCriterion("tariff_no in", values, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotIn(List<String> values) {
            addCriterion("tariff_no not in", values, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoBetween(String value1, String value2) {
            addCriterion("tariff_no between", value1, value2, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotBetween(String value1, String value2) {
            addCriterion("tariff_no not between", value1, value2, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffDateIsNull() {
            addCriterion("tariff_date is null");
            return (Criteria) this;
        }

        public Criteria andTariffDateIsNotNull() {
            addCriterion("tariff_date is not null");
            return (Criteria) this;
        }

        public Criteria andTariffDateEqualTo(Date value) {
            addCriterion("tariff_date =", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateNotEqualTo(Date value) {
            addCriterion("tariff_date <>", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateGreaterThan(Date value) {
            addCriterion("tariff_date >", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tariff_date >=", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateLessThan(Date value) {
            addCriterion("tariff_date <", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateLessThanOrEqualTo(Date value) {
            addCriterion("tariff_date <=", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateIn(List<Date> values) {
            addCriterion("tariff_date in", values, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateNotIn(List<Date> values) {
            addCriterion("tariff_date not in", values, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateBetween(Date value1, Date value2) {
            addCriterion("tariff_date between", value1, value2, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateNotBetween(Date value1, Date value2) {
            addCriterion("tariff_date not between", value1, value2, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andVatIsNull() {
            addCriterion("vat is null");
            return (Criteria) this;
        }

        public Criteria andVatIsNotNull() {
            addCriterion("vat is not null");
            return (Criteria) this;
        }

        public Criteria andVatEqualTo(BigDecimal value) {
            addCriterion("vat =", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotEqualTo(BigDecimal value) {
            addCriterion("vat <>", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThan(BigDecimal value) {
            addCriterion("vat >", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vat >=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThan(BigDecimal value) {
            addCriterion("vat <", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vat <=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatIn(List<BigDecimal> values) {
            addCriterion("vat in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotIn(List<BigDecimal> values) {
            addCriterion("vat not in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat not between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNull() {
            addCriterion("warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNotNull() {
            addCriterion("warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeEqualTo(String value) {
            addCriterion("warehouse_type =", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotEqualTo(String value) {
            addCriterion("warehouse_type <>", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThan(String value) {
            addCriterion("warehouse_type >", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_type >=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThan(String value) {
            addCriterion("warehouse_type <", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_type <=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLike(String value) {
            addCriterion("warehouse_type like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotLike(String value) {
            addCriterion("warehouse_type not like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIn(List<String> values) {
            addCriterion("warehouse_type in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotIn(List<String> values) {
            addCriterion("warehouse_type not in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeBetween(String value1, String value2) {
            addCriterion("warehouse_type between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("warehouse_type not between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNull() {
            addCriterion("invoice_price is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNotNull() {
            addCriterion("invoice_price is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceEqualTo(BigDecimal value) {
            addCriterion("invoice_price =", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotEqualTo(BigDecimal value) {
            addCriterion("invoice_price <>", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThan(BigDecimal value) {
            addCriterion("invoice_price >", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_price >=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThan(BigDecimal value) {
            addCriterion("invoice_price <", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_price <=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIn(List<BigDecimal> values) {
            addCriterion("invoice_price in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotIn(List<BigDecimal> values) {
            addCriterion("invoice_price not in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_price between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_price not between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andCoreIsNull() {
            addCriterion("core is null");
            return (Criteria) this;
        }

        public Criteria andCoreIsNotNull() {
            addCriterion("core is not null");
            return (Criteria) this;
        }

        public Criteria andCoreEqualTo(BigDecimal value) {
            addCriterion("core =", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotEqualTo(BigDecimal value) {
            addCriterion("core <>", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThan(BigDecimal value) {
            addCriterion("core >", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("core >=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThan(BigDecimal value) {
            addCriterion("core <", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("core <=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreIn(List<BigDecimal> values) {
            addCriterion("core in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotIn(List<BigDecimal> values) {
            addCriterion("core not in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("core between", value1, value2, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("core not between", value1, value2, "core");
            return (Criteria) this;
        }

        public Criteria andEntryPriceIsNull() {
            addCriterion("entry_price is null");
            return (Criteria) this;
        }

        public Criteria andEntryPriceIsNotNull() {
            addCriterion("entry_price is not null");
            return (Criteria) this;
        }

        public Criteria andEntryPriceEqualTo(BigDecimal value) {
            addCriterion("entry_price =", value, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceNotEqualTo(BigDecimal value) {
            addCriterion("entry_price <>", value, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceGreaterThan(BigDecimal value) {
            addCriterion("entry_price >", value, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_price >=", value, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceLessThan(BigDecimal value) {
            addCriterion("entry_price <", value, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_price <=", value, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceIn(List<BigDecimal> values) {
            addCriterion("entry_price in", values, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceNotIn(List<BigDecimal> values) {
            addCriterion("entry_price not in", values, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_price between", value1, value2, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_price not between", value1, value2, "entryPrice");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateIsNull() {
            addCriterion("old_stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateIsNotNull() {
            addCriterion("old_stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateEqualTo(Date value) {
            addCriterion("old_stockin_date =", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateNotEqualTo(Date value) {
            addCriterion("old_stockin_date <>", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateGreaterThan(Date value) {
            addCriterion("old_stockin_date >", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("old_stockin_date >=", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateLessThan(Date value) {
            addCriterion("old_stockin_date <", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("old_stockin_date <=", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateIn(List<Date> values) {
            addCriterion("old_stockin_date in", values, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateNotIn(List<Date> values) {
            addCriterion("old_stockin_date not in", values, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateBetween(Date value1, Date value2) {
            addCriterion("old_stockin_date between", value1, value2, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("old_stockin_date not between", value1, value2, "oldStockinDate");
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