package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompressorMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CompressorMaterialExample() {
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

        public Criteria andWareCompressorMaterialIdIsNull() {
            addCriterion("ware_compressor_material_id is null");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdIsNotNull() {
            addCriterion("ware_compressor_material_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdEqualTo(Integer value) {
            addCriterion("ware_compressor_material_id =", value, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdNotEqualTo(Integer value) {
            addCriterion("ware_compressor_material_id <>", value, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdGreaterThan(Integer value) {
            addCriterion("ware_compressor_material_id >", value, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_compressor_material_id >=", value, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdLessThan(Integer value) {
            addCriterion("ware_compressor_material_id <", value, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_compressor_material_id <=", value, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdIn(List<Integer> values) {
            addCriterion("ware_compressor_material_id in", values, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdNotIn(List<Integer> values) {
            addCriterion("ware_compressor_material_id not in", values, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_compressor_material_id between", value1, value2, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andWareCompressorMaterialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_compressor_material_id not between", value1, value2, "wareCompressorMaterialId");
            return (Criteria) this;
        }

        public Criteria andCompressorIsNull() {
            addCriterion("compressor is null");
            return (Criteria) this;
        }

        public Criteria andCompressorIsNotNull() {
            addCriterion("compressor is not null");
            return (Criteria) this;
        }

        public Criteria andCompressorEqualTo(String value) {
            addCriterion("compressor =", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotEqualTo(String value) {
            addCriterion("compressor <>", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThan(String value) {
            addCriterion("compressor >", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThanOrEqualTo(String value) {
            addCriterion("compressor >=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThan(String value) {
            addCriterion("compressor <", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThanOrEqualTo(String value) {
            addCriterion("compressor <=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLike(String value) {
            addCriterion("compressor like", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotLike(String value) {
            addCriterion("compressor not like", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorIn(List<String> values) {
            addCriterion("compressor in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotIn(List<String> values) {
            addCriterion("compressor not in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorBetween(String value1, String value2) {
            addCriterion("compressor between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotBetween(String value1, String value2) {
            addCriterion("compressor not between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andRepairOfferIsNull() {
            addCriterion("repair_offer is null");
            return (Criteria) this;
        }

        public Criteria andRepairOfferIsNotNull() {
            addCriterion("repair_offer is not null");
            return (Criteria) this;
        }

        public Criteria andRepairOfferEqualTo(BigDecimal value) {
            addCriterion("repair_offer =", value, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferNotEqualTo(BigDecimal value) {
            addCriterion("repair_offer <>", value, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferGreaterThan(BigDecimal value) {
            addCriterion("repair_offer >", value, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_offer >=", value, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferLessThan(BigDecimal value) {
            addCriterion("repair_offer <", value, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_offer <=", value, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferIn(List<BigDecimal> values) {
            addCriterion("repair_offer in", values, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferNotIn(List<BigDecimal> values) {
            addCriterion("repair_offer not in", values, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_offer between", value1, value2, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andRepairOfferNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_offer not between", value1, value2, "repairOffer");
            return (Criteria) this;
        }

        public Criteria andDescripZhIsNull() {
            addCriterion("descrip_zh is null");
            return (Criteria) this;
        }

        public Criteria andDescripZhIsNotNull() {
            addCriterion("descrip_zh is not null");
            return (Criteria) this;
        }

        public Criteria andDescripZhEqualTo(String value) {
            addCriterion("descrip_zh =", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhNotEqualTo(String value) {
            addCriterion("descrip_zh <>", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhGreaterThan(String value) {
            addCriterion("descrip_zh >", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhGreaterThanOrEqualTo(String value) {
            addCriterion("descrip_zh >=", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhLessThan(String value) {
            addCriterion("descrip_zh <", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhLessThanOrEqualTo(String value) {
            addCriterion("descrip_zh <=", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhLike(String value) {
            addCriterion("descrip_zh like", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhNotLike(String value) {
            addCriterion("descrip_zh not like", value, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhIn(List<String> values) {
            addCriterion("descrip_zh in", values, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhNotIn(List<String> values) {
            addCriterion("descrip_zh not in", values, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhBetween(String value1, String value2) {
            addCriterion("descrip_zh between", value1, value2, "descripZh");
            return (Criteria) this;
        }

        public Criteria andDescripZhNotBetween(String value1, String value2) {
            addCriterion("descrip_zh not between", value1, value2, "descripZh");
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

        public Criteria andRepairWayIsNull() {
            addCriterion("repair_way is null");
            return (Criteria) this;
        }

        public Criteria andRepairWayIsNotNull() {
            addCriterion("repair_way is not null");
            return (Criteria) this;
        }

        public Criteria andRepairWayEqualTo(String value) {
            addCriterion("repair_way =", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayNotEqualTo(String value) {
            addCriterion("repair_way <>", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayGreaterThan(String value) {
            addCriterion("repair_way >", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayGreaterThanOrEqualTo(String value) {
            addCriterion("repair_way >=", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayLessThan(String value) {
            addCriterion("repair_way <", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayLessThanOrEqualTo(String value) {
            addCriterion("repair_way <=", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayLike(String value) {
            addCriterion("repair_way like", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayNotLike(String value) {
            addCriterion("repair_way not like", value, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayIn(List<String> values) {
            addCriterion("repair_way in", values, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayNotIn(List<String> values) {
            addCriterion("repair_way not in", values, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayBetween(String value1, String value2) {
            addCriterion("repair_way between", value1, value2, "repairWay");
            return (Criteria) this;
        }

        public Criteria andRepairWayNotBetween(String value1, String value2) {
            addCriterion("repair_way not between", value1, value2, "repairWay");
            return (Criteria) this;
        }

        public Criteria andDescripEnIsNull() {
            addCriterion("descrip_en is null");
            return (Criteria) this;
        }

        public Criteria andDescripEnIsNotNull() {
            addCriterion("descrip_en is not null");
            return (Criteria) this;
        }

        public Criteria andDescripEnEqualTo(String value) {
            addCriterion("descrip_en =", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnNotEqualTo(String value) {
            addCriterion("descrip_en <>", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnGreaterThan(String value) {
            addCriterion("descrip_en >", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnGreaterThanOrEqualTo(String value) {
            addCriterion("descrip_en >=", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnLessThan(String value) {
            addCriterion("descrip_en <", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnLessThanOrEqualTo(String value) {
            addCriterion("descrip_en <=", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnLike(String value) {
            addCriterion("descrip_en like", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnNotLike(String value) {
            addCriterion("descrip_en not like", value, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnIn(List<String> values) {
            addCriterion("descrip_en in", values, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnNotIn(List<String> values) {
            addCriterion("descrip_en not in", values, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnBetween(String value1, String value2) {
            addCriterion("descrip_en between", value1, value2, "descripEn");
            return (Criteria) this;
        }

        public Criteria andDescripEnNotBetween(String value1, String value2) {
            addCriterion("descrip_en not between", value1, value2, "descripEn");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("is_valid like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("is_valid not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNull() {
            addCriterion("material_no is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNotNull() {
            addCriterion("material_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoEqualTo(String value) {
            addCriterion("material_no =", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotEqualTo(String value) {
            addCriterion("material_no <>", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThan(String value) {
            addCriterion("material_no >", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("material_no >=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThan(String value) {
            addCriterion("material_no <", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("material_no <=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLike(String value) {
            addCriterion("material_no like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotLike(String value) {
            addCriterion("material_no not like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIn(List<String> values) {
            addCriterion("material_no in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotIn(List<String> values) {
            addCriterion("material_no not in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoBetween(String value1, String value2) {
            addCriterion("material_no between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotBetween(String value1, String value2) {
            addCriterion("material_no not between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoIsNull() {
            addCriterion("compressor_no is null");
            return (Criteria) this;
        }

        public Criteria andCompressorNoIsNotNull() {
            addCriterion("compressor_no is not null");
            return (Criteria) this;
        }

        public Criteria andCompressorNoEqualTo(String value) {
            addCriterion("compressor_no =", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoNotEqualTo(String value) {
            addCriterion("compressor_no <>", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoGreaterThan(String value) {
            addCriterion("compressor_no >", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoGreaterThanOrEqualTo(String value) {
            addCriterion("compressor_no >=", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoLessThan(String value) {
            addCriterion("compressor_no <", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoLessThanOrEqualTo(String value) {
            addCriterion("compressor_no <=", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoLike(String value) {
            addCriterion("compressor_no like", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoNotLike(String value) {
            addCriterion("compressor_no not like", value, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoIn(List<String> values) {
            addCriterion("compressor_no in", values, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoNotIn(List<String> values) {
            addCriterion("compressor_no not in", values, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoBetween(String value1, String value2) {
            addCriterion("compressor_no between", value1, value2, "compressorNo");
            return (Criteria) this;
        }

        public Criteria andCompressorNoNotBetween(String value1, String value2) {
            addCriterion("compressor_no not between", value1, value2, "compressorNo");
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