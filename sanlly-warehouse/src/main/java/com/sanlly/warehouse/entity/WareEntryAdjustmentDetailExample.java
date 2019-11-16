package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareEntryAdjustmentDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareEntryAdjustmentDetailExample() {
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

        public Criteria andWareReturnWarehouseDetailIdIsNull() {
            addCriterion("ware_return_warehouse_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdIsNotNull() {
            addCriterion("ware_return_warehouse_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdEqualTo(Integer value) {
            addCriterion("ware_return_warehouse_detail_id =", value, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_return_warehouse_detail_id <>", value, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdGreaterThan(Integer value) {
            addCriterion("ware_return_warehouse_detail_id >", value, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_return_warehouse_detail_id >=", value, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdLessThan(Integer value) {
            addCriterion("ware_return_warehouse_detail_id <", value, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_return_warehouse_detail_id <=", value, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdIn(List<Integer> values) {
            addCriterion("ware_return_warehouse_detail_id in", values, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_return_warehouse_detail_id not in", values, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_return_warehouse_detail_id between", value1, value2, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andWareReturnWarehouseDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_return_warehouse_detail_id not between", value1, value2, "wareReturnWarehouseDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentIsNull() {
            addCriterion("entry_adjustment is null");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentIsNotNull() {
            addCriterion("entry_adjustment is not null");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentEqualTo(Integer value) {
            addCriterion("entry_adjustment =", value, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNotEqualTo(Integer value) {
            addCriterion("entry_adjustment <>", value, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentGreaterThan(Integer value) {
            addCriterion("entry_adjustment >", value, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_adjustment >=", value, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentLessThan(Integer value) {
            addCriterion("entry_adjustment <", value, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentLessThanOrEqualTo(Integer value) {
            addCriterion("entry_adjustment <=", value, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentIn(List<Integer> values) {
            addCriterion("entry_adjustment in", values, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNotIn(List<Integer> values) {
            addCriterion("entry_adjustment not in", values, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentBetween(Integer value1, Integer value2) {
            addCriterion("entry_adjustment between", value1, value2, "entryAdjustment");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_adjustment not between", value1, value2, "entryAdjustment");
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

        public Criteria andOldWarehouseTypeIsNull() {
            addCriterion("old_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeIsNotNull() {
            addCriterion("old_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeEqualTo(String value) {
            addCriterion("old_warehouse_type =", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeNotEqualTo(String value) {
            addCriterion("old_warehouse_type <>", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeGreaterThan(String value) {
            addCriterion("old_warehouse_type >", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("old_warehouse_type >=", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeLessThan(String value) {
            addCriterion("old_warehouse_type <", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("old_warehouse_type <=", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeLike(String value) {
            addCriterion("old_warehouse_type like", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeNotLike(String value) {
            addCriterion("old_warehouse_type not like", value, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeIn(List<String> values) {
            addCriterion("old_warehouse_type in", values, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeNotIn(List<String> values) {
            addCriterion("old_warehouse_type not in", values, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeBetween(String value1, String value2) {
            addCriterion("old_warehouse_type between", value1, value2, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("old_warehouse_type not between", value1, value2, "oldWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeIsNull() {
            addCriterion("adjustment_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeIsNotNull() {
            addCriterion("adjustment_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeEqualTo(String value) {
            addCriterion("adjustment_warehouse_type =", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeNotEqualTo(String value) {
            addCriterion("adjustment_warehouse_type <>", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeGreaterThan(String value) {
            addCriterion("adjustment_warehouse_type >", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("adjustment_warehouse_type >=", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeLessThan(String value) {
            addCriterion("adjustment_warehouse_type <", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("adjustment_warehouse_type <=", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeLike(String value) {
            addCriterion("adjustment_warehouse_type like", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeNotLike(String value) {
            addCriterion("adjustment_warehouse_type not like", value, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeIn(List<String> values) {
            addCriterion("adjustment_warehouse_type in", values, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeNotIn(List<String> values) {
            addCriterion("adjustment_warehouse_type not in", values, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeBetween(String value1, String value2) {
            addCriterion("adjustment_warehouse_type between", value1, value2, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("adjustment_warehouse_type not between", value1, value2, "adjustmentWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOldVatIsNull() {
            addCriterion("old_vat is null");
            return (Criteria) this;
        }

        public Criteria andOldVatIsNotNull() {
            addCriterion("old_vat is not null");
            return (Criteria) this;
        }

        public Criteria andOldVatEqualTo(BigDecimal value) {
            addCriterion("old_vat =", value, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatNotEqualTo(BigDecimal value) {
            addCriterion("old_vat <>", value, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatGreaterThan(BigDecimal value) {
            addCriterion("old_vat >", value, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_vat >=", value, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatLessThan(BigDecimal value) {
            addCriterion("old_vat <", value, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_vat <=", value, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatIn(List<BigDecimal> values) {
            addCriterion("old_vat in", values, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatNotIn(List<BigDecimal> values) {
            addCriterion("old_vat not in", values, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_vat between", value1, value2, "oldVat");
            return (Criteria) this;
        }

        public Criteria andOldVatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_vat not between", value1, value2, "oldVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatIsNull() {
            addCriterion("adjustment_vat is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatIsNotNull() {
            addCriterion("adjustment_vat is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatEqualTo(BigDecimal value) {
            addCriterion("adjustment_vat =", value, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatNotEqualTo(BigDecimal value) {
            addCriterion("adjustment_vat <>", value, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatGreaterThan(BigDecimal value) {
            addCriterion("adjustment_vat >", value, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_vat >=", value, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatLessThan(BigDecimal value) {
            addCriterion("adjustment_vat <", value, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_vat <=", value, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatIn(List<BigDecimal> values) {
            addCriterion("adjustment_vat in", values, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatNotIn(List<BigDecimal> values) {
            addCriterion("adjustment_vat not in", values, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_vat between", value1, value2, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andAdjustmentVatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_vat not between", value1, value2, "adjustmentVat");
            return (Criteria) this;
        }

        public Criteria andOldNumIsNull() {
            addCriterion("old_num is null");
            return (Criteria) this;
        }

        public Criteria andOldNumIsNotNull() {
            addCriterion("old_num is not null");
            return (Criteria) this;
        }

        public Criteria andOldNumEqualTo(Double value) {
            addCriterion("old_num =", value, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumNotEqualTo(Double value) {
            addCriterion("old_num <>", value, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumGreaterThan(Double value) {
            addCriterion("old_num >", value, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumGreaterThanOrEqualTo(Double value) {
            addCriterion("old_num >=", value, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumLessThan(Double value) {
            addCriterion("old_num <", value, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumLessThanOrEqualTo(Double value) {
            addCriterion("old_num <=", value, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumIn(List<Double> values) {
            addCriterion("old_num in", values, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumNotIn(List<Double> values) {
            addCriterion("old_num not in", values, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumBetween(Double value1, Double value2) {
            addCriterion("old_num between", value1, value2, "oldNum");
            return (Criteria) this;
        }

        public Criteria andOldNumNotBetween(Double value1, Double value2) {
            addCriterion("old_num not between", value1, value2, "oldNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumIsNull() {
            addCriterion("adjustment_num is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumIsNotNull() {
            addCriterion("adjustment_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumEqualTo(Double value) {
            addCriterion("adjustment_num =", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumNotEqualTo(Double value) {
            addCriterion("adjustment_num <>", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumGreaterThan(Double value) {
            addCriterion("adjustment_num >", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumGreaterThanOrEqualTo(Double value) {
            addCriterion("adjustment_num >=", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumLessThan(Double value) {
            addCriterion("adjustment_num <", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumLessThanOrEqualTo(Double value) {
            addCriterion("adjustment_num <=", value, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumIn(List<Double> values) {
            addCriterion("adjustment_num in", values, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumNotIn(List<Double> values) {
            addCriterion("adjustment_num not in", values, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumBetween(Double value1, Double value2) {
            addCriterion("adjustment_num between", value1, value2, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNumNotBetween(Double value1, Double value2) {
            addCriterion("adjustment_num not between", value1, value2, "adjustmentNum");
            return (Criteria) this;
        }

        public Criteria andOldTariffIsNull() {
            addCriterion("old_tariff is null");
            return (Criteria) this;
        }

        public Criteria andOldTariffIsNotNull() {
            addCriterion("old_tariff is not null");
            return (Criteria) this;
        }

        public Criteria andOldTariffEqualTo(BigDecimal value) {
            addCriterion("old_tariff =", value, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffNotEqualTo(BigDecimal value) {
            addCriterion("old_tariff <>", value, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffGreaterThan(BigDecimal value) {
            addCriterion("old_tariff >", value, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_tariff >=", value, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffLessThan(BigDecimal value) {
            addCriterion("old_tariff <", value, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_tariff <=", value, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffIn(List<BigDecimal> values) {
            addCriterion("old_tariff in", values, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffNotIn(List<BigDecimal> values) {
            addCriterion("old_tariff not in", values, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_tariff between", value1, value2, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andOldTariffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_tariff not between", value1, value2, "oldTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffIsNull() {
            addCriterion("adjustment_tariff is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffIsNotNull() {
            addCriterion("adjustment_tariff is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffEqualTo(BigDecimal value) {
            addCriterion("adjustment_tariff =", value, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffNotEqualTo(BigDecimal value) {
            addCriterion("adjustment_tariff <>", value, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffGreaterThan(BigDecimal value) {
            addCriterion("adjustment_tariff >", value, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_tariff >=", value, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffLessThan(BigDecimal value) {
            addCriterion("adjustment_tariff <", value, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_tariff <=", value, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffIn(List<BigDecimal> values) {
            addCriterion("adjustment_tariff in", values, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffNotIn(List<BigDecimal> values) {
            addCriterion("adjustment_tariff not in", values, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_tariff between", value1, value2, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andAdjustmentTariffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_tariff not between", value1, value2, "adjustmentTariff");
            return (Criteria) this;
        }

        public Criteria andOldFreightIsNull() {
            addCriterion("old_freight is null");
            return (Criteria) this;
        }

        public Criteria andOldFreightIsNotNull() {
            addCriterion("old_freight is not null");
            return (Criteria) this;
        }

        public Criteria andOldFreightEqualTo(BigDecimal value) {
            addCriterion("old_freight =", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotEqualTo(BigDecimal value) {
            addCriterion("old_freight <>", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightGreaterThan(BigDecimal value) {
            addCriterion("old_freight >", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_freight >=", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightLessThan(BigDecimal value) {
            addCriterion("old_freight <", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_freight <=", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightIn(List<BigDecimal> values) {
            addCriterion("old_freight in", values, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotIn(List<BigDecimal> values) {
            addCriterion("old_freight not in", values, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_freight between", value1, value2, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_freight not between", value1, value2, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightIsNull() {
            addCriterion("adjustment_freight is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightIsNotNull() {
            addCriterion("adjustment_freight is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight =", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightNotEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight <>", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightGreaterThan(BigDecimal value) {
            addCriterion("adjustment_freight >", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight >=", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightLessThan(BigDecimal value) {
            addCriterion("adjustment_freight <", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight <=", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightIn(List<BigDecimal> values) {
            addCriterion("adjustment_freight in", values, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightNotIn(List<BigDecimal> values) {
            addCriterion("adjustment_freight not in", values, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_freight between", value1, value2, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_freight not between", value1, value2, "adjustmentFreight");
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