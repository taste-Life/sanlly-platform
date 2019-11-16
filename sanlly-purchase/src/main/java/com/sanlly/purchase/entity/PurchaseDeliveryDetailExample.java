package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseDeliveryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseDeliveryDetailExample() {
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

        public Criteria andPurcPurchaseDeliveryDetailIdIsNull() {
            addCriterion("purc_purchase_delivery_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdIsNotNull() {
            addCriterion("purc_purchase_delivery_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_detail_id =", value, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdNotEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_detail_id <>", value, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdGreaterThan(Integer value) {
            addCriterion("purc_purchase_delivery_detail_id >", value, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_detail_id >=", value, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdLessThan(Integer value) {
            addCriterion("purc_purchase_delivery_detail_id <", value, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_detail_id <=", value, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdIn(List<Integer> values) {
            addCriterion("purc_purchase_delivery_detail_id in", values, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdNotIn(List<Integer> values) {
            addCriterion("purc_purchase_delivery_detail_id not in", values, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_delivery_detail_id between", value1, value2, "purcPurchaseDeliveryDetailId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_delivery_detail_id not between", value1, value2, "purcPurchaseDeliveryDetailId");
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

        public Criteria andPurcPurchaseDeliveryIsNull() {
            addCriterion("purc_purchase_delivery is null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIsNotNull() {
            addCriterion("purc_purchase_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery =", value, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryNotEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery <>", value, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryGreaterThan(Integer value) {
            addCriterion("purc_purchase_delivery >", value, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery >=", value, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryLessThan(Integer value) {
            addCriterion("purc_purchase_delivery <", value, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryLessThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery <=", value, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIn(List<Integer> values) {
            addCriterion("purc_purchase_delivery in", values, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryNotIn(List<Integer> values) {
            addCriterion("purc_purchase_delivery not in", values, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_delivery between", value1, value2, "purcPurchaseDelivery");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_delivery not between", value1, value2, "purcPurchaseDelivery");
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

        public Criteria andDeliveryCountIsNull() {
            addCriterion("delivery_count is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountIsNotNull() {
            addCriterion("delivery_count is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountEqualTo(Double value) {
            addCriterion("delivery_count =", value, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountNotEqualTo(Double value) {
            addCriterion("delivery_count <>", value, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountGreaterThan(Double value) {
            addCriterion("delivery_count >", value, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery_count >=", value, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountLessThan(Double value) {
            addCriterion("delivery_count <", value, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountLessThanOrEqualTo(Double value) {
            addCriterion("delivery_count <=", value, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountIn(List<Double> values) {
            addCriterion("delivery_count in", values, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountNotIn(List<Double> values) {
            addCriterion("delivery_count not in", values, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountBetween(Double value1, Double value2) {
            addCriterion("delivery_count between", value1, value2, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryCountNotBetween(Double value1, Double value2) {
            addCriterion("delivery_count not between", value1, value2, "deliveryCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountIsNull() {
            addCriterion("recive_count is null");
            return (Criteria) this;
        }

        public Criteria andReciveCountIsNotNull() {
            addCriterion("recive_count is not null");
            return (Criteria) this;
        }

        public Criteria andReciveCountEqualTo(Double value) {
            addCriterion("recive_count =", value, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountNotEqualTo(Double value) {
            addCriterion("recive_count <>", value, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountGreaterThan(Double value) {
            addCriterion("recive_count >", value, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountGreaterThanOrEqualTo(Double value) {
            addCriterion("recive_count >=", value, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountLessThan(Double value) {
            addCriterion("recive_count <", value, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountLessThanOrEqualTo(Double value) {
            addCriterion("recive_count <=", value, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountIn(List<Double> values) {
            addCriterion("recive_count in", values, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountNotIn(List<Double> values) {
            addCriterion("recive_count not in", values, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountBetween(Double value1, Double value2) {
            addCriterion("recive_count between", value1, value2, "reciveCount");
            return (Criteria) this;
        }

        public Criteria andReciveCountNotBetween(Double value1, Double value2) {
            addCriterion("recive_count not between", value1, value2, "reciveCount");
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

        public Criteria andReciveSumAmountIsNull() {
            addCriterion("recive_sum_amount is null");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountIsNotNull() {
            addCriterion("recive_sum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountEqualTo(BigDecimal value) {
            addCriterion("recive_sum_amount =", value, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountNotEqualTo(BigDecimal value) {
            addCriterion("recive_sum_amount <>", value, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountGreaterThan(BigDecimal value) {
            addCriterion("recive_sum_amount >", value, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recive_sum_amount >=", value, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountLessThan(BigDecimal value) {
            addCriterion("recive_sum_amount <", value, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recive_sum_amount <=", value, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountIn(List<BigDecimal> values) {
            addCriterion("recive_sum_amount in", values, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountNotIn(List<BigDecimal> values) {
            addCriterion("recive_sum_amount not in", values, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recive_sum_amount between", value1, value2, "reciveSumAmount");
            return (Criteria) this;
        }

        public Criteria andReciveSumAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recive_sum_amount not between", value1, value2, "reciveSumAmount");
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

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
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

        public Criteria andActualArrivalDateIsNull() {
            addCriterion("actual_arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateIsNotNull() {
            addCriterion("actual_arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateEqualTo(Date value) {
            addCriterion("actual_arrival_date =", value, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateNotEqualTo(Date value) {
            addCriterion("actual_arrival_date <>", value, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateGreaterThan(Date value) {
            addCriterion("actual_arrival_date >", value, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_arrival_date >=", value, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateLessThan(Date value) {
            addCriterion("actual_arrival_date <", value, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateLessThanOrEqualTo(Date value) {
            addCriterion("actual_arrival_date <=", value, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateIn(List<Date> values) {
            addCriterion("actual_arrival_date in", values, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateNotIn(List<Date> values) {
            addCriterion("actual_arrival_date not in", values, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateBetween(Date value1, Date value2) {
            addCriterion("actual_arrival_date between", value1, value2, "actualArrivalDate");
            return (Criteria) this;
        }

        public Criteria andActualArrivalDateNotBetween(Date value1, Date value2) {
            addCriterion("actual_arrival_date not between", value1, value2, "actualArrivalDate");
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