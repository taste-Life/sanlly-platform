package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseOrderDetailExample() {
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

        public Criteria andPurcPurchaseOrderDetailIdIsNull() {
            addCriterion("purc_purchase_order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdIsNotNull() {
            addCriterion("purc_purchase_order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdEqualTo(Integer value) {
            addCriterion("purc_purchase_order_detail_id =", value, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdNotEqualTo(Integer value) {
            addCriterion("purc_purchase_order_detail_id <>", value, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdGreaterThan(Integer value) {
            addCriterion("purc_purchase_order_detail_id >", value, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_order_detail_id >=", value, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdLessThan(Integer value) {
            addCriterion("purc_purchase_order_detail_id <", value, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_order_detail_id <=", value, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdIn(List<Integer> values) {
            addCriterion("purc_purchase_order_detail_id in", values, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdNotIn(List<Integer> values) {
            addCriterion("purc_purchase_order_detail_id not in", values, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_order_detail_id between", value1, value2, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_order_detail_id not between", value1, value2, "purcPurchaseOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andDemandNoIsNull() {
            addCriterion("demand_no is null");
            return (Criteria) this;
        }

        public Criteria andDemandNoIsNotNull() {
            addCriterion("demand_no is not null");
            return (Criteria) this;
        }

        public Criteria andDemandNoEqualTo(String value) {
            addCriterion("demand_no =", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotEqualTo(String value) {
            addCriterion("demand_no <>", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoGreaterThan(String value) {
            addCriterion("demand_no >", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoGreaterThanOrEqualTo(String value) {
            addCriterion("demand_no >=", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLessThan(String value) {
            addCriterion("demand_no <", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLessThanOrEqualTo(String value) {
            addCriterion("demand_no <=", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLike(String value) {
            addCriterion("demand_no like", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotLike(String value) {
            addCriterion("demand_no not like", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoIn(List<String> values) {
            addCriterion("demand_no in", values, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotIn(List<String> values) {
            addCriterion("demand_no not in", values, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoBetween(String value1, String value2) {
            addCriterion("demand_no between", value1, value2, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotBetween(String value1, String value2) {
            addCriterion("demand_no not between", value1, value2, "demandNo");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderIsNull() {
            addCriterion("purc_purchase_order is null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderIsNotNull() {
            addCriterion("purc_purchase_order is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderEqualTo(Integer value) {
            addCriterion("purc_purchase_order =", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderNotEqualTo(Integer value) {
            addCriterion("purc_purchase_order <>", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderGreaterThan(Integer value) {
            addCriterion("purc_purchase_order >", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_order >=", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderLessThan(Integer value) {
            addCriterion("purc_purchase_order <", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderLessThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_order <=", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderIn(List<Integer> values) {
            addCriterion("purc_purchase_order in", values, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderNotIn(List<Integer> values) {
            addCriterion("purc_purchase_order not in", values, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_order between", value1, value2, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_order not between", value1, value2, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andDemandTimeIsNull() {
            addCriterion("demand_time is null");
            return (Criteria) this;
        }

        public Criteria andDemandTimeIsNotNull() {
            addCriterion("demand_time is not null");
            return (Criteria) this;
        }

        public Criteria andDemandTimeEqualTo(Date value) {
            addCriterion("demand_time =", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeNotEqualTo(Date value) {
            addCriterion("demand_time <>", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeGreaterThan(Date value) {
            addCriterion("demand_time >", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("demand_time >=", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeLessThan(Date value) {
            addCriterion("demand_time <", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeLessThanOrEqualTo(Date value) {
            addCriterion("demand_time <=", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeIn(List<Date> values) {
            addCriterion("demand_time in", values, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeNotIn(List<Date> values) {
            addCriterion("demand_time not in", values, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeBetween(Date value1, Date value2) {
            addCriterion("demand_time between", value1, value2, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeNotBetween(Date value1, Date value2) {
            addCriterion("demand_time not between", value1, value2, "demandTime");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIsNull() {
            addCriterion("spare_parts_no is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIsNotNull() {
            addCriterion("spare_parts_no is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoEqualTo(String value) {
            addCriterion("spare_parts_no =", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotEqualTo(String value) {
            addCriterion("spare_parts_no <>", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoGreaterThan(String value) {
            addCriterion("spare_parts_no >", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_no >=", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLessThan(String value) {
            addCriterion("spare_parts_no <", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_no <=", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLike(String value) {
            addCriterion("spare_parts_no like", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotLike(String value) {
            addCriterion("spare_parts_no not like", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIn(List<String> values) {
            addCriterion("spare_parts_no in", values, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotIn(List<String> values) {
            addCriterion("spare_parts_no not in", values, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoBetween(String value1, String value2) {
            addCriterion("spare_parts_no between", value1, value2, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotBetween(String value1, String value2) {
            addCriterion("spare_parts_no not between", value1, value2, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Double value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Double value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Double value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Double value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Double value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Double value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Double> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Double> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Double value1, Double value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Double value1, Double value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumIsNull() {
            addCriterion("deliver_num is null");
            return (Criteria) this;
        }

        public Criteria andDeliverNumIsNotNull() {
            addCriterion("deliver_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverNumEqualTo(Double value) {
            addCriterion("deliver_num =", value, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumNotEqualTo(Double value) {
            addCriterion("deliver_num <>", value, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumGreaterThan(Double value) {
            addCriterion("deliver_num >", value, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumGreaterThanOrEqualTo(Double value) {
            addCriterion("deliver_num >=", value, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumLessThan(Double value) {
            addCriterion("deliver_num <", value, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumLessThanOrEqualTo(Double value) {
            addCriterion("deliver_num <=", value, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumIn(List<Double> values) {
            addCriterion("deliver_num in", values, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumNotIn(List<Double> values) {
            addCriterion("deliver_num not in", values, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumBetween(Double value1, Double value2) {
            addCriterion("deliver_num between", value1, value2, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andDeliverNumNotBetween(Double value1, Double value2) {
            addCriterion("deliver_num not between", value1, value2, "deliverNum");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateIsNull() {
            addCriterion("required_delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateIsNotNull() {
            addCriterion("required_delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateEqualTo(Date value) {
            addCriterion("required_delivery_date =", value, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateNotEqualTo(Date value) {
            addCriterion("required_delivery_date <>", value, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateGreaterThan(Date value) {
            addCriterion("required_delivery_date >", value, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("required_delivery_date >=", value, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateLessThan(Date value) {
            addCriterion("required_delivery_date <", value, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("required_delivery_date <=", value, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateIn(List<Date> values) {
            addCriterion("required_delivery_date in", values, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateNotIn(List<Date> values) {
            addCriterion("required_delivery_date not in", values, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("required_delivery_date between", value1, value2, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("required_delivery_date not between", value1, value2, "requiredDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
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

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
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

        public Criteria andSparePartsUnitIsNull() {
            addCriterion("spare_parts_unit is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIsNotNull() {
            addCriterion("spare_parts_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitEqualTo(String value) {
            addCriterion("spare_parts_unit =", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotEqualTo(String value) {
            addCriterion("spare_parts_unit <>", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitGreaterThan(String value) {
            addCriterion("spare_parts_unit >", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_unit >=", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLessThan(String value) {
            addCriterion("spare_parts_unit <", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_unit <=", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLike(String value) {
            addCriterion("spare_parts_unit like", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotLike(String value) {
            addCriterion("spare_parts_unit not like", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIn(List<String> values) {
            addCriterion("spare_parts_unit in", values, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotIn(List<String> values) {
            addCriterion("spare_parts_unit not in", values, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitBetween(String value1, String value2) {
            addCriterion("spare_parts_unit between", value1, value2, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotBetween(String value1, String value2) {
            addCriterion("spare_parts_unit not between", value1, value2, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
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