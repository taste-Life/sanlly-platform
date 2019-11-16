package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockinDetailLabaorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockinDetailLabaorExample() {
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

        public Criteria andWareStockinDetailLabaorIdIsNull() {
            addCriterion("ware_stockin_detail_labaor_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdIsNotNull() {
            addCriterion("ware_stockin_detail_labaor_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_labaor_id =", value, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdNotEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_labaor_id <>", value, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdGreaterThan(Integer value) {
            addCriterion("ware_stockin_detail_labaor_id >", value, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_labaor_id >=", value, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdLessThan(Integer value) {
            addCriterion("ware_stockin_detail_labaor_id <", value, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_detail_labaor_id <=", value, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdIn(List<Integer> values) {
            addCriterion("ware_stockin_detail_labaor_id in", values, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdNotIn(List<Integer> values) {
            addCriterion("ware_stockin_detail_labaor_id not in", values, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_detail_labaor_id between", value1, value2, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinDetailLabaorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_detail_labaor_id not between", value1, value2, "wareStockinDetailLabaorId");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinIsNull() {
            addCriterion("labaor_stockin is null");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinIsNotNull() {
            addCriterion("labaor_stockin is not null");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinEqualTo(Integer value) {
            addCriterion("labaor_stockin =", value, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNotEqualTo(Integer value) {
            addCriterion("labaor_stockin <>", value, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinGreaterThan(Integer value) {
            addCriterion("labaor_stockin >", value, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinGreaterThanOrEqualTo(Integer value) {
            addCriterion("labaor_stockin >=", value, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinLessThan(Integer value) {
            addCriterion("labaor_stockin <", value, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinLessThanOrEqualTo(Integer value) {
            addCriterion("labaor_stockin <=", value, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinIn(List<Integer> values) {
            addCriterion("labaor_stockin in", values, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNotIn(List<Integer> values) {
            addCriterion("labaor_stockin not in", values, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinBetween(Integer value1, Integer value2) {
            addCriterion("labaor_stockin between", value1, value2, "labaorStockin");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNotBetween(Integer value1, Integer value2) {
            addCriterion("labaor_stockin not between", value1, value2, "labaorStockin");
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
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

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
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