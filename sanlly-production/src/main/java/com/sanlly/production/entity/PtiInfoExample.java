package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PtiInfoExample() {
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

        public Criteria andProdVisualCheckIdIsNull() {
            addCriterion("prod_visual_check_id is null");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdIsNotNull() {
            addCriterion("prod_visual_check_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdEqualTo(Integer value) {
            addCriterion("prod_visual_check_id =", value, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdNotEqualTo(Integer value) {
            addCriterion("prod_visual_check_id <>", value, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdGreaterThan(Integer value) {
            addCriterion("prod_visual_check_id >", value, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_visual_check_id >=", value, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdLessThan(Integer value) {
            addCriterion("prod_visual_check_id <", value, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_visual_check_id <=", value, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdIn(List<Integer> values) {
            addCriterion("prod_visual_check_id in", values, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdNotIn(List<Integer> values) {
            addCriterion("prod_visual_check_id not in", values, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_visual_check_id between", value1, value2, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andProdVisualCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_visual_check_id not between", value1, value2, "prodVisualCheckId");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("`owner` is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("`owner` is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("`owner` =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("`owner` <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("`owner` >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("`owner` >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("`owner` <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("`owner` <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("`owner` like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("`owner` not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("`owner` in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("`owner` not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("`owner` between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("`owner` not between", value1, value2, "owner");
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

        public Criteria andUnitModelIsNull() {
            addCriterion("unit_model is null");
            return (Criteria) this;
        }

        public Criteria andUnitModelIsNotNull() {
            addCriterion("unit_model is not null");
            return (Criteria) this;
        }

        public Criteria andUnitModelEqualTo(String value) {
            addCriterion("unit_model =", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelNotEqualTo(String value) {
            addCriterion("unit_model <>", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelGreaterThan(String value) {
            addCriterion("unit_model >", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelGreaterThanOrEqualTo(String value) {
            addCriterion("unit_model >=", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelLessThan(String value) {
            addCriterion("unit_model <", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelLessThanOrEqualTo(String value) {
            addCriterion("unit_model <=", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelLike(String value) {
            addCriterion("unit_model like", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelNotLike(String value) {
            addCriterion("unit_model not like", value, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelIn(List<String> values) {
            addCriterion("unit_model in", values, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelNotIn(List<String> values) {
            addCriterion("unit_model not in", values, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelBetween(String value1, String value2) {
            addCriterion("unit_model between", value1, value2, "unitModel");
            return (Criteria) this;
        }

        public Criteria andUnitModelNotBetween(String value1, String value2) {
            addCriterion("unit_model not between", value1, value2, "unitModel");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIsNull() {
            addCriterion("inspection_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIsNotNull() {
            addCriterion("inspection_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDateEqualTo(Date value) {
            addCriterion("inspection_date =", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotEqualTo(Date value) {
            addCriterion("inspection_date <>", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateGreaterThan(Date value) {
            addCriterion("inspection_date >", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inspection_date >=", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateLessThan(Date value) {
            addCriterion("inspection_date <", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateLessThanOrEqualTo(Date value) {
            addCriterion("inspection_date <=", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIn(List<Date> values) {
            addCriterion("inspection_date in", values, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotIn(List<Date> values) {
            addCriterion("inspection_date not in", values, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateBetween(Date value1, Date value2) {
            addCriterion("inspection_date between", value1, value2, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotBetween(Date value1, Date value2) {
            addCriterion("inspection_date not between", value1, value2, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andAmbientTempIsNull() {
            addCriterion("ambient_temp is null");
            return (Criteria) this;
        }

        public Criteria andAmbientTempIsNotNull() {
            addCriterion("ambient_temp is not null");
            return (Criteria) this;
        }

        public Criteria andAmbientTempEqualTo(String value) {
            addCriterion("ambient_temp =", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempNotEqualTo(String value) {
            addCriterion("ambient_temp <>", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempGreaterThan(String value) {
            addCriterion("ambient_temp >", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempGreaterThanOrEqualTo(String value) {
            addCriterion("ambient_temp >=", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempLessThan(String value) {
            addCriterion("ambient_temp <", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempLessThanOrEqualTo(String value) {
            addCriterion("ambient_temp <=", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempLike(String value) {
            addCriterion("ambient_temp like", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempNotLike(String value) {
            addCriterion("ambient_temp not like", value, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempIn(List<String> values) {
            addCriterion("ambient_temp in", values, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempNotIn(List<String> values) {
            addCriterion("ambient_temp not in", values, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempBetween(String value1, String value2) {
            addCriterion("ambient_temp between", value1, value2, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andAmbientTempNotBetween(String value1, String value2) {
            addCriterion("ambient_temp not between", value1, value2, "ambientTemp");
            return (Criteria) this;
        }

        public Criteria andTempUnitIsNull() {
            addCriterion("temp_unit is null");
            return (Criteria) this;
        }

        public Criteria andTempUnitIsNotNull() {
            addCriterion("temp_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTempUnitEqualTo(String value) {
            addCriterion("temp_unit =", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitNotEqualTo(String value) {
            addCriterion("temp_unit <>", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitGreaterThan(String value) {
            addCriterion("temp_unit >", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitGreaterThanOrEqualTo(String value) {
            addCriterion("temp_unit >=", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitLessThan(String value) {
            addCriterion("temp_unit <", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitLessThanOrEqualTo(String value) {
            addCriterion("temp_unit <=", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitLike(String value) {
            addCriterion("temp_unit like", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitNotLike(String value) {
            addCriterion("temp_unit not like", value, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitIn(List<String> values) {
            addCriterion("temp_unit in", values, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitNotIn(List<String> values) {
            addCriterion("temp_unit not in", values, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitBetween(String value1, String value2) {
            addCriterion("temp_unit between", value1, value2, "tempUnit");
            return (Criteria) this;
        }

        public Criteria andTempUnitNotBetween(String value1, String value2) {
            addCriterion("temp_unit not between", value1, value2, "tempUnit");
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

        public Criteria andUnitSnIsNull() {
            addCriterion("unit_sn is null");
            return (Criteria) this;
        }

        public Criteria andUnitSnIsNotNull() {
            addCriterion("unit_sn is not null");
            return (Criteria) this;
        }

        public Criteria andUnitSnEqualTo(String value) {
            addCriterion("unit_sn =", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnNotEqualTo(String value) {
            addCriterion("unit_sn <>", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnGreaterThan(String value) {
            addCriterion("unit_sn >", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnGreaterThanOrEqualTo(String value) {
            addCriterion("unit_sn >=", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnLessThan(String value) {
            addCriterion("unit_sn <", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnLessThanOrEqualTo(String value) {
            addCriterion("unit_sn <=", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnLike(String value) {
            addCriterion("unit_sn like", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnNotLike(String value) {
            addCriterion("unit_sn not like", value, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnIn(List<String> values) {
            addCriterion("unit_sn in", values, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnNotIn(List<String> values) {
            addCriterion("unit_sn not in", values, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnBetween(String value1, String value2) {
            addCriterion("unit_sn between", value1, value2, "unitSn");
            return (Criteria) this;
        }

        public Criteria andUnitSnNotBetween(String value1, String value2) {
            addCriterion("unit_sn not between", value1, value2, "unitSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnIsNull() {
            addCriterion("controller_sn is null");
            return (Criteria) this;
        }

        public Criteria andControllerSnIsNotNull() {
            addCriterion("controller_sn is not null");
            return (Criteria) this;
        }

        public Criteria andControllerSnEqualTo(String value) {
            addCriterion("controller_sn =", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnNotEqualTo(String value) {
            addCriterion("controller_sn <>", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnGreaterThan(String value) {
            addCriterion("controller_sn >", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnGreaterThanOrEqualTo(String value) {
            addCriterion("controller_sn >=", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnLessThan(String value) {
            addCriterion("controller_sn <", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnLessThanOrEqualTo(String value) {
            addCriterion("controller_sn <=", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnLike(String value) {
            addCriterion("controller_sn like", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnNotLike(String value) {
            addCriterion("controller_sn not like", value, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnIn(List<String> values) {
            addCriterion("controller_sn in", values, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnNotIn(List<String> values) {
            addCriterion("controller_sn not in", values, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnBetween(String value1, String value2) {
            addCriterion("controller_sn between", value1, value2, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andControllerSnNotBetween(String value1, String value2) {
            addCriterion("controller_sn not between", value1, value2, "controllerSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnIsNull() {
            addCriterion("compressor_sn is null");
            return (Criteria) this;
        }

        public Criteria andCompressorSnIsNotNull() {
            addCriterion("compressor_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCompressorSnEqualTo(String value) {
            addCriterion("compressor_sn =", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnNotEqualTo(String value) {
            addCriterion("compressor_sn <>", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnGreaterThan(String value) {
            addCriterion("compressor_sn >", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnGreaterThanOrEqualTo(String value) {
            addCriterion("compressor_sn >=", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnLessThan(String value) {
            addCriterion("compressor_sn <", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnLessThanOrEqualTo(String value) {
            addCriterion("compressor_sn <=", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnLike(String value) {
            addCriterion("compressor_sn like", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnNotLike(String value) {
            addCriterion("compressor_sn not like", value, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnIn(List<String> values) {
            addCriterion("compressor_sn in", values, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnNotIn(List<String> values) {
            addCriterion("compressor_sn not in", values, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnBetween(String value1, String value2) {
            addCriterion("compressor_sn between", value1, value2, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andCompressorSnNotBetween(String value1, String value2) {
            addCriterion("compressor_sn not between", value1, value2, "compressorSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnIsNull() {
            addCriterion("mrb_sn is null");
            return (Criteria) this;
        }

        public Criteria andMrbSnIsNotNull() {
            addCriterion("mrb_sn is not null");
            return (Criteria) this;
        }

        public Criteria andMrbSnEqualTo(String value) {
            addCriterion("mrb_sn =", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnNotEqualTo(String value) {
            addCriterion("mrb_sn <>", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnGreaterThan(String value) {
            addCriterion("mrb_sn >", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnGreaterThanOrEqualTo(String value) {
            addCriterion("mrb_sn >=", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnLessThan(String value) {
            addCriterion("mrb_sn <", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnLessThanOrEqualTo(String value) {
            addCriterion("mrb_sn <=", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnLike(String value) {
            addCriterion("mrb_sn like", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnNotLike(String value) {
            addCriterion("mrb_sn not like", value, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnIn(List<String> values) {
            addCriterion("mrb_sn in", values, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnNotIn(List<String> values) {
            addCriterion("mrb_sn not in", values, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnBetween(String value1, String value2) {
            addCriterion("mrb_sn between", value1, value2, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andMrbSnNotBetween(String value1, String value2) {
            addCriterion("mrb_sn not between", value1, value2, "mrbSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnIsNull() {
            addCriterion("erecorder_sn is null");
            return (Criteria) this;
        }

        public Criteria andErecorderSnIsNotNull() {
            addCriterion("erecorder_sn is not null");
            return (Criteria) this;
        }

        public Criteria andErecorderSnEqualTo(String value) {
            addCriterion("erecorder_sn =", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnNotEqualTo(String value) {
            addCriterion("erecorder_sn <>", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnGreaterThan(String value) {
            addCriterion("erecorder_sn >", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnGreaterThanOrEqualTo(String value) {
            addCriterion("erecorder_sn >=", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnLessThan(String value) {
            addCriterion("erecorder_sn <", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnLessThanOrEqualTo(String value) {
            addCriterion("erecorder_sn <=", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnLike(String value) {
            addCriterion("erecorder_sn like", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnNotLike(String value) {
            addCriterion("erecorder_sn not like", value, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnIn(List<String> values) {
            addCriterion("erecorder_sn in", values, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnNotIn(List<String> values) {
            addCriterion("erecorder_sn not in", values, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnBetween(String value1, String value2) {
            addCriterion("erecorder_sn between", value1, value2, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andErecorderSnNotBetween(String value1, String value2) {
            addCriterion("erecorder_sn not between", value1, value2, "erecorderSn");
            return (Criteria) this;
        }

        public Criteria andRmmIdIsNull() {
            addCriterion("rmm_id is null");
            return (Criteria) this;
        }

        public Criteria andRmmIdIsNotNull() {
            addCriterion("rmm_id is not null");
            return (Criteria) this;
        }

        public Criteria andRmmIdEqualTo(String value) {
            addCriterion("rmm_id =", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdNotEqualTo(String value) {
            addCriterion("rmm_id <>", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdGreaterThan(String value) {
            addCriterion("rmm_id >", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdGreaterThanOrEqualTo(String value) {
            addCriterion("rmm_id >=", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdLessThan(String value) {
            addCriterion("rmm_id <", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdLessThanOrEqualTo(String value) {
            addCriterion("rmm_id <=", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdLike(String value) {
            addCriterion("rmm_id like", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdNotLike(String value) {
            addCriterion("rmm_id not like", value, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdIn(List<String> values) {
            addCriterion("rmm_id in", values, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdNotIn(List<String> values) {
            addCriterion("rmm_id not in", values, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdBetween(String value1, String value2) {
            addCriterion("rmm_id between", value1, value2, "rmmId");
            return (Criteria) this;
        }

        public Criteria andRmmIdNotBetween(String value1, String value2) {
            addCriterion("rmm_id not between", value1, value2, "rmmId");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoIsNull() {
            addCriterion("software_no is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoIsNotNull() {
            addCriterion("software_no is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoEqualTo(String value) {
            addCriterion("software_no =", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoNotEqualTo(String value) {
            addCriterion("software_no <>", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoGreaterThan(String value) {
            addCriterion("software_no >", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoGreaterThanOrEqualTo(String value) {
            addCriterion("software_no >=", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoLessThan(String value) {
            addCriterion("software_no <", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoLessThanOrEqualTo(String value) {
            addCriterion("software_no <=", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoLike(String value) {
            addCriterion("software_no like", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoNotLike(String value) {
            addCriterion("software_no not like", value, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoIn(List<String> values) {
            addCriterion("software_no in", values, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoNotIn(List<String> values) {
            addCriterion("software_no not in", values, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoBetween(String value1, String value2) {
            addCriterion("software_no between", value1, value2, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andSoftwareNoNotBetween(String value1, String value2) {
            addCriterion("software_no not between", value1, value2, "softwareNo");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNull() {
            addCriterion("manufacture_date is null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNotNull() {
            addCriterion("manufacture_date is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateEqualTo(String value) {
            addCriterion("manufacture_date =", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotEqualTo(String value) {
            addCriterion("manufacture_date <>", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThan(String value) {
            addCriterion("manufacture_date >", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_date >=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThan(String value) {
            addCriterion("manufacture_date <", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThanOrEqualTo(String value) {
            addCriterion("manufacture_date <=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLike(String value) {
            addCriterion("manufacture_date like", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotLike(String value) {
            addCriterion("manufacture_date not like", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIn(List<String> values) {
            addCriterion("manufacture_date in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotIn(List<String> values) {
            addCriterion("manufacture_date not in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateBetween(String value1, String value2) {
            addCriterion("manufacture_date between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotBetween(String value1, String value2) {
            addCriterion("manufacture_date not between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andIsHumidityIsNull() {
            addCriterion("is_humidity is null");
            return (Criteria) this;
        }

        public Criteria andIsHumidityIsNotNull() {
            addCriterion("is_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andIsHumidityEqualTo(String value) {
            addCriterion("is_humidity =", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotEqualTo(String value) {
            addCriterion("is_humidity <>", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityGreaterThan(String value) {
            addCriterion("is_humidity >", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("is_humidity >=", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityLessThan(String value) {
            addCriterion("is_humidity <", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityLessThanOrEqualTo(String value) {
            addCriterion("is_humidity <=", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityLike(String value) {
            addCriterion("is_humidity like", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotLike(String value) {
            addCriterion("is_humidity not like", value, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityIn(List<String> values) {
            addCriterion("is_humidity in", values, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotIn(List<String> values) {
            addCriterion("is_humidity not in", values, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityBetween(String value1, String value2) {
            addCriterion("is_humidity between", value1, value2, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsHumidityNotBetween(String value1, String value2) {
            addCriterion("is_humidity not between", value1, value2, "isHumidity");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureIsNull() {
            addCriterion("is_temperature is null");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureIsNotNull() {
            addCriterion("is_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureEqualTo(String value) {
            addCriterion("is_temperature =", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotEqualTo(String value) {
            addCriterion("is_temperature <>", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureGreaterThan(String value) {
            addCriterion("is_temperature >", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("is_temperature >=", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureLessThan(String value) {
            addCriterion("is_temperature <", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureLessThanOrEqualTo(String value) {
            addCriterion("is_temperature <=", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureLike(String value) {
            addCriterion("is_temperature like", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotLike(String value) {
            addCriterion("is_temperature not like", value, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureIn(List<String> values) {
            addCriterion("is_temperature in", values, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotIn(List<String> values) {
            addCriterion("is_temperature not in", values, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureBetween(String value1, String value2) {
            addCriterion("is_temperature between", value1, value2, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andIsTemperatureNotBetween(String value1, String value2) {
            addCriterion("is_temperature not between", value1, value2, "isTemperature");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdIsNull() {
            addCriterion("unit_company_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdIsNotNull() {
            addCriterion("unit_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdEqualTo(String value) {
            addCriterion("unit_company_id =", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdNotEqualTo(String value) {
            addCriterion("unit_company_id <>", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdGreaterThan(String value) {
            addCriterion("unit_company_id >", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_company_id >=", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdLessThan(String value) {
            addCriterion("unit_company_id <", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("unit_company_id <=", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdLike(String value) {
            addCriterion("unit_company_id like", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdNotLike(String value) {
            addCriterion("unit_company_id not like", value, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdIn(List<String> values) {
            addCriterion("unit_company_id in", values, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdNotIn(List<String> values) {
            addCriterion("unit_company_id not in", values, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdBetween(String value1, String value2) {
            addCriterion("unit_company_id between", value1, value2, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIdNotBetween(String value1, String value2) {
            addCriterion("unit_company_id not between", value1, value2, "unitCompanyId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIsNull() {
            addCriterion("check_container is null");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIsNotNull() {
            addCriterion("check_container is not null");
            return (Criteria) this;
        }

        public Criteria andCheckContainerEqualTo(String value) {
            addCriterion("check_container =", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerNotEqualTo(String value) {
            addCriterion("check_container <>", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerGreaterThan(String value) {
            addCriterion("check_container >", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerGreaterThanOrEqualTo(String value) {
            addCriterion("check_container >=", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerLessThan(String value) {
            addCriterion("check_container <", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerLessThanOrEqualTo(String value) {
            addCriterion("check_container <=", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerLike(String value) {
            addCriterion("check_container like", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerNotLike(String value) {
            addCriterion("check_container not like", value, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIn(List<String> values) {
            addCriterion("check_container in", values, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerNotIn(List<String> values) {
            addCriterion("check_container not in", values, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerBetween(String value1, String value2) {
            addCriterion("check_container between", value1, value2, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCheckContainerNotBetween(String value1, String value2) {
            addCriterion("check_container not between", value1, value2, "checkContainer");
            return (Criteria) this;
        }

        public Criteria andCleanUnitIsNull() {
            addCriterion("clean_unit is null");
            return (Criteria) this;
        }

        public Criteria andCleanUnitIsNotNull() {
            addCriterion("clean_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCleanUnitEqualTo(String value) {
            addCriterion("clean_unit =", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitNotEqualTo(String value) {
            addCriterion("clean_unit <>", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitGreaterThan(String value) {
            addCriterion("clean_unit >", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitGreaterThanOrEqualTo(String value) {
            addCriterion("clean_unit >=", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitLessThan(String value) {
            addCriterion("clean_unit <", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitLessThanOrEqualTo(String value) {
            addCriterion("clean_unit <=", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitLike(String value) {
            addCriterion("clean_unit like", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitNotLike(String value) {
            addCriterion("clean_unit not like", value, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitIn(List<String> values) {
            addCriterion("clean_unit in", values, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitNotIn(List<String> values) {
            addCriterion("clean_unit not in", values, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitBetween(String value1, String value2) {
            addCriterion("clean_unit between", value1, value2, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCleanUnitNotBetween(String value1, String value2) {
            addCriterion("clean_unit not between", value1, value2, "cleanUnit");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersIsNull() {
            addCriterion("check_fasteners is null");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersIsNotNull() {
            addCriterion("check_fasteners is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersEqualTo(String value) {
            addCriterion("check_fasteners =", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersNotEqualTo(String value) {
            addCriterion("check_fasteners <>", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersGreaterThan(String value) {
            addCriterion("check_fasteners >", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersGreaterThanOrEqualTo(String value) {
            addCriterion("check_fasteners >=", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersLessThan(String value) {
            addCriterion("check_fasteners <", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersLessThanOrEqualTo(String value) {
            addCriterion("check_fasteners <=", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersLike(String value) {
            addCriterion("check_fasteners like", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersNotLike(String value) {
            addCriterion("check_fasteners not like", value, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersIn(List<String> values) {
            addCriterion("check_fasteners in", values, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersNotIn(List<String> values) {
            addCriterion("check_fasteners not in", values, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersBetween(String value1, String value2) {
            addCriterion("check_fasteners between", value1, value2, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckFastenersNotBetween(String value1, String value2) {
            addCriterion("check_fasteners not between", value1, value2, "checkFasteners");
            return (Criteria) this;
        }

        public Criteria andCheckDrainIsNull() {
            addCriterion("check_drain is null");
            return (Criteria) this;
        }

        public Criteria andCheckDrainIsNotNull() {
            addCriterion("check_drain is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDrainEqualTo(String value) {
            addCriterion("check_drain =", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainNotEqualTo(String value) {
            addCriterion("check_drain <>", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainGreaterThan(String value) {
            addCriterion("check_drain >", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainGreaterThanOrEqualTo(String value) {
            addCriterion("check_drain >=", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainLessThan(String value) {
            addCriterion("check_drain <", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainLessThanOrEqualTo(String value) {
            addCriterion("check_drain <=", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainLike(String value) {
            addCriterion("check_drain like", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainNotLike(String value) {
            addCriterion("check_drain not like", value, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainIn(List<String> values) {
            addCriterion("check_drain in", values, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainNotIn(List<String> values) {
            addCriterion("check_drain not in", values, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainBetween(String value1, String value2) {
            addCriterion("check_drain between", value1, value2, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckDrainNotBetween(String value1, String value2) {
            addCriterion("check_drain not between", value1, value2, "checkDrain");
            return (Criteria) this;
        }

        public Criteria andCheckWiringIsNull() {
            addCriterion("check_wiring is null");
            return (Criteria) this;
        }

        public Criteria andCheckWiringIsNotNull() {
            addCriterion("check_wiring is not null");
            return (Criteria) this;
        }

        public Criteria andCheckWiringEqualTo(String value) {
            addCriterion("check_wiring =", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringNotEqualTo(String value) {
            addCriterion("check_wiring <>", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringGreaterThan(String value) {
            addCriterion("check_wiring >", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringGreaterThanOrEqualTo(String value) {
            addCriterion("check_wiring >=", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringLessThan(String value) {
            addCriterion("check_wiring <", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringLessThanOrEqualTo(String value) {
            addCriterion("check_wiring <=", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringLike(String value) {
            addCriterion("check_wiring like", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringNotLike(String value) {
            addCriterion("check_wiring not like", value, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringIn(List<String> values) {
            addCriterion("check_wiring in", values, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringNotIn(List<String> values) {
            addCriterion("check_wiring not in", values, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringBetween(String value1, String value2) {
            addCriterion("check_wiring between", value1, value2, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckWiringNotBetween(String value1, String value2) {
            addCriterion("check_wiring not between", value1, value2, "checkWiring");
            return (Criteria) this;
        }

        public Criteria andCheckPowerIsNull() {
            addCriterion("check_power is null");
            return (Criteria) this;
        }

        public Criteria andCheckPowerIsNotNull() {
            addCriterion("check_power is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPowerEqualTo(String value) {
            addCriterion("check_power =", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerNotEqualTo(String value) {
            addCriterion("check_power <>", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerGreaterThan(String value) {
            addCriterion("check_power >", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerGreaterThanOrEqualTo(String value) {
            addCriterion("check_power >=", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerLessThan(String value) {
            addCriterion("check_power <", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerLessThanOrEqualTo(String value) {
            addCriterion("check_power <=", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerLike(String value) {
            addCriterion("check_power like", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerNotLike(String value) {
            addCriterion("check_power not like", value, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerIn(List<String> values) {
            addCriterion("check_power in", values, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerNotIn(List<String> values) {
            addCriterion("check_power not in", values, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerBetween(String value1, String value2) {
            addCriterion("check_power between", value1, value2, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckPowerNotBetween(String value1, String value2) {
            addCriterion("check_power not between", value1, value2, "checkPower");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationIsNull() {
            addCriterion("check_insulation is null");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationIsNotNull() {
            addCriterion("check_insulation is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationEqualTo(String value) {
            addCriterion("check_insulation =", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationNotEqualTo(String value) {
            addCriterion("check_insulation <>", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationGreaterThan(String value) {
            addCriterion("check_insulation >", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationGreaterThanOrEqualTo(String value) {
            addCriterion("check_insulation >=", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationLessThan(String value) {
            addCriterion("check_insulation <", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationLessThanOrEqualTo(String value) {
            addCriterion("check_insulation <=", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationLike(String value) {
            addCriterion("check_insulation like", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationNotLike(String value) {
            addCriterion("check_insulation not like", value, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationIn(List<String> values) {
            addCriterion("check_insulation in", values, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationNotIn(List<String> values) {
            addCriterion("check_insulation not in", values, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationBetween(String value1, String value2) {
            addCriterion("check_insulation between", value1, value2, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCheckInsulationNotBetween(String value1, String value2) {
            addCriterion("check_insulation not between", value1, value2, "checkInsulation");
            return (Criteria) this;
        }

        public Criteria andCompIsNull() {
            addCriterion("comp is null");
            return (Criteria) this;
        }

        public Criteria andCompIsNotNull() {
            addCriterion("comp is not null");
            return (Criteria) this;
        }

        public Criteria andCompEqualTo(String value) {
            addCriterion("comp =", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompNotEqualTo(String value) {
            addCriterion("comp <>", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompGreaterThan(String value) {
            addCriterion("comp >", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompGreaterThanOrEqualTo(String value) {
            addCriterion("comp >=", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompLessThan(String value) {
            addCriterion("comp <", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompLessThanOrEqualTo(String value) {
            addCriterion("comp <=", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompLike(String value) {
            addCriterion("comp like", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompNotLike(String value) {
            addCriterion("comp not like", value, "comp");
            return (Criteria) this;
        }

        public Criteria andCompIn(List<String> values) {
            addCriterion("comp in", values, "comp");
            return (Criteria) this;
        }

        public Criteria andCompNotIn(List<String> values) {
            addCriterion("comp not in", values, "comp");
            return (Criteria) this;
        }

        public Criteria andCompBetween(String value1, String value2) {
            addCriterion("comp between", value1, value2, "comp");
            return (Criteria) this;
        }

        public Criteria andCompNotBetween(String value1, String value2) {
            addCriterion("comp not between", value1, value2, "comp");
            return (Criteria) this;
        }

        public Criteria andEfIsNull() {
            addCriterion("ef is null");
            return (Criteria) this;
        }

        public Criteria andEfIsNotNull() {
            addCriterion("ef is not null");
            return (Criteria) this;
        }

        public Criteria andEfEqualTo(String value) {
            addCriterion("ef =", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotEqualTo(String value) {
            addCriterion("ef <>", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThan(String value) {
            addCriterion("ef >", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThanOrEqualTo(String value) {
            addCriterion("ef >=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThan(String value) {
            addCriterion("ef <", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThanOrEqualTo(String value) {
            addCriterion("ef <=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLike(String value) {
            addCriterion("ef like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotLike(String value) {
            addCriterion("ef not like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfIn(List<String> values) {
            addCriterion("ef in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotIn(List<String> values) {
            addCriterion("ef not in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfBetween(String value1, String value2) {
            addCriterion("ef between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotBetween(String value1, String value2) {
            addCriterion("ef not between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andCfIsNull() {
            addCriterion("cf is null");
            return (Criteria) this;
        }

        public Criteria andCfIsNotNull() {
            addCriterion("cf is not null");
            return (Criteria) this;
        }

        public Criteria andCfEqualTo(String value) {
            addCriterion("cf =", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotEqualTo(String value) {
            addCriterion("cf <>", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThan(String value) {
            addCriterion("cf >", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThanOrEqualTo(String value) {
            addCriterion("cf >=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThan(String value) {
            addCriterion("cf <", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThanOrEqualTo(String value) {
            addCriterion("cf <=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLike(String value) {
            addCriterion("cf like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotLike(String value) {
            addCriterion("cf not like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfIn(List<String> values) {
            addCriterion("cf in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotIn(List<String> values) {
            addCriterion("cf not in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfBetween(String value1, String value2) {
            addCriterion("cf between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotBetween(String value1, String value2) {
            addCriterion("cf not between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andHrIsNull() {
            addCriterion("hr is null");
            return (Criteria) this;
        }

        public Criteria andHrIsNotNull() {
            addCriterion("hr is not null");
            return (Criteria) this;
        }

        public Criteria andHrEqualTo(String value) {
            addCriterion("hr =", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotEqualTo(String value) {
            addCriterion("hr <>", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrGreaterThan(String value) {
            addCriterion("hr >", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrGreaterThanOrEqualTo(String value) {
            addCriterion("hr >=", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLessThan(String value) {
            addCriterion("hr <", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLessThanOrEqualTo(String value) {
            addCriterion("hr <=", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLike(String value) {
            addCriterion("hr like", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotLike(String value) {
            addCriterion("hr not like", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrIn(List<String> values) {
            addCriterion("hr in", values, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotIn(List<String> values) {
            addCriterion("hr not in", values, "hr");
            return (Criteria) this;
        }

        public Criteria andHrBetween(String value1, String value2) {
            addCriterion("hr between", value1, value2, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotBetween(String value1, String value2) {
            addCriterion("hr not between", value1, value2, "hr");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateIsNull() {
            addCriterion("check_indicate is null");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateIsNotNull() {
            addCriterion("check_indicate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateEqualTo(String value) {
            addCriterion("check_indicate =", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateNotEqualTo(String value) {
            addCriterion("check_indicate <>", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateGreaterThan(String value) {
            addCriterion("check_indicate >", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateGreaterThanOrEqualTo(String value) {
            addCriterion("check_indicate >=", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateLessThan(String value) {
            addCriterion("check_indicate <", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateLessThanOrEqualTo(String value) {
            addCriterion("check_indicate <=", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateLike(String value) {
            addCriterion("check_indicate like", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateNotLike(String value) {
            addCriterion("check_indicate not like", value, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateIn(List<String> values) {
            addCriterion("check_indicate in", values, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateNotIn(List<String> values) {
            addCriterion("check_indicate not in", values, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateBetween(String value1, String value2) {
            addCriterion("check_indicate between", value1, value2, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckIndicateNotBetween(String value1, String value2) {
            addCriterion("check_indicate not between", value1, value2, "checkIndicate");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdIsNull() {
            addCriterion("check_container_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdIsNotNull() {
            addCriterion("check_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdEqualTo(String value) {
            addCriterion("check_container_id =", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdNotEqualTo(String value) {
            addCriterion("check_container_id <>", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdGreaterThan(String value) {
            addCriterion("check_container_id >", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_container_id >=", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdLessThan(String value) {
            addCriterion("check_container_id <", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdLessThanOrEqualTo(String value) {
            addCriterion("check_container_id <=", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdLike(String value) {
            addCriterion("check_container_id like", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdNotLike(String value) {
            addCriterion("check_container_id not like", value, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdIn(List<String> values) {
            addCriterion("check_container_id in", values, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdNotIn(List<String> values) {
            addCriterion("check_container_id not in", values, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdBetween(String value1, String value2) {
            addCriterion("check_container_id between", value1, value2, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andCheckContainerIdNotBetween(String value1, String value2) {
            addCriterion("check_container_id not between", value1, value2, "checkContainerId");
            return (Criteria) this;
        }

        public Criteria andOperateIsNull() {
            addCriterion("operate is null");
            return (Criteria) this;
        }

        public Criteria andOperateIsNotNull() {
            addCriterion("operate is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEqualTo(String value) {
            addCriterion("operate =", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotEqualTo(String value) {
            addCriterion("operate <>", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThan(String value) {
            addCriterion("operate >", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThanOrEqualTo(String value) {
            addCriterion("operate >=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThan(String value) {
            addCriterion("operate <", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThanOrEqualTo(String value) {
            addCriterion("operate <=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLike(String value) {
            addCriterion("operate like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotLike(String value) {
            addCriterion("operate not like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateIn(List<String> values) {
            addCriterion("operate in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotIn(List<String> values) {
            addCriterion("operate not in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateBetween(String value1, String value2) {
            addCriterion("operate between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotBetween(String value1, String value2) {
            addCriterion("operate not between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andCheckRotationIsNull() {
            addCriterion("check_rotation is null");
            return (Criteria) this;
        }

        public Criteria andCheckRotationIsNotNull() {
            addCriterion("check_rotation is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRotationEqualTo(String value) {
            addCriterion("check_rotation =", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationNotEqualTo(String value) {
            addCriterion("check_rotation <>", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationGreaterThan(String value) {
            addCriterion("check_rotation >", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationGreaterThanOrEqualTo(String value) {
            addCriterion("check_rotation >=", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationLessThan(String value) {
            addCriterion("check_rotation <", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationLessThanOrEqualTo(String value) {
            addCriterion("check_rotation <=", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationLike(String value) {
            addCriterion("check_rotation like", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationNotLike(String value) {
            addCriterion("check_rotation not like", value, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationIn(List<String> values) {
            addCriterion("check_rotation in", values, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationNotIn(List<String> values) {
            addCriterion("check_rotation not in", values, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationBetween(String value1, String value2) {
            addCriterion("check_rotation between", value1, value2, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckRotationNotBetween(String value1, String value2) {
            addCriterion("check_rotation not between", value1, value2, "checkRotation");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyIsNull() {
            addCriterion("check_power_supply is null");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyIsNotNull() {
            addCriterion("check_power_supply is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyEqualTo(String value) {
            addCriterion("check_power_supply =", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyNotEqualTo(String value) {
            addCriterion("check_power_supply <>", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyGreaterThan(String value) {
            addCriterion("check_power_supply >", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyGreaterThanOrEqualTo(String value) {
            addCriterion("check_power_supply >=", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyLessThan(String value) {
            addCriterion("check_power_supply <", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyLessThanOrEqualTo(String value) {
            addCriterion("check_power_supply <=", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyLike(String value) {
            addCriterion("check_power_supply like", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyNotLike(String value) {
            addCriterion("check_power_supply not like", value, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyIn(List<String> values) {
            addCriterion("check_power_supply in", values, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyNotIn(List<String> values) {
            addCriterion("check_power_supply not in", values, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyBetween(String value1, String value2) {
            addCriterion("check_power_supply between", value1, value2, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andCheckPowerSupplyNotBetween(String value1, String value2) {
            addCriterion("check_power_supply not between", value1, value2, "checkPowerSupply");
            return (Criteria) this;
        }

        public Criteria andL1L2IsNull() {
            addCriterion("l1_l2 is null");
            return (Criteria) this;
        }

        public Criteria andL1L2IsNotNull() {
            addCriterion("l1_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andL1L2EqualTo(String value) {
            addCriterion("l1_l2 =", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2NotEqualTo(String value) {
            addCriterion("l1_l2 <>", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2GreaterThan(String value) {
            addCriterion("l1_l2 >", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2GreaterThanOrEqualTo(String value) {
            addCriterion("l1_l2 >=", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2LessThan(String value) {
            addCriterion("l1_l2 <", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2LessThanOrEqualTo(String value) {
            addCriterion("l1_l2 <=", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2Like(String value) {
            addCriterion("l1_l2 like", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2NotLike(String value) {
            addCriterion("l1_l2 not like", value, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2In(List<String> values) {
            addCriterion("l1_l2 in", values, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2NotIn(List<String> values) {
            addCriterion("l1_l2 not in", values, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2Between(String value1, String value2) {
            addCriterion("l1_l2 between", value1, value2, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL1L2NotBetween(String value1, String value2) {
            addCriterion("l1_l2 not between", value1, value2, "l1L2");
            return (Criteria) this;
        }

        public Criteria andL2L3IsNull() {
            addCriterion("l2_l3 is null");
            return (Criteria) this;
        }

        public Criteria andL2L3IsNotNull() {
            addCriterion("l2_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andL2L3EqualTo(String value) {
            addCriterion("l2_l3 =", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3NotEqualTo(String value) {
            addCriterion("l2_l3 <>", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3GreaterThan(String value) {
            addCriterion("l2_l3 >", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3GreaterThanOrEqualTo(String value) {
            addCriterion("l2_l3 >=", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3LessThan(String value) {
            addCriterion("l2_l3 <", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3LessThanOrEqualTo(String value) {
            addCriterion("l2_l3 <=", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3Like(String value) {
            addCriterion("l2_l3 like", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3NotLike(String value) {
            addCriterion("l2_l3 not like", value, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3In(List<String> values) {
            addCriterion("l2_l3 in", values, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3NotIn(List<String> values) {
            addCriterion("l2_l3 not in", values, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3Between(String value1, String value2) {
            addCriterion("l2_l3 between", value1, value2, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL2L3NotBetween(String value1, String value2) {
            addCriterion("l2_l3 not between", value1, value2, "l2L3");
            return (Criteria) this;
        }

        public Criteria andL1L3IsNull() {
            addCriterion("l1_l3 is null");
            return (Criteria) this;
        }

        public Criteria andL1L3IsNotNull() {
            addCriterion("l1_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andL1L3EqualTo(String value) {
            addCriterion("l1_l3 =", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3NotEqualTo(String value) {
            addCriterion("l1_l3 <>", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3GreaterThan(String value) {
            addCriterion("l1_l3 >", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3GreaterThanOrEqualTo(String value) {
            addCriterion("l1_l3 >=", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3LessThan(String value) {
            addCriterion("l1_l3 <", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3LessThanOrEqualTo(String value) {
            addCriterion("l1_l3 <=", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3Like(String value) {
            addCriterion("l1_l3 like", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3NotLike(String value) {
            addCriterion("l1_l3 not like", value, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3In(List<String> values) {
            addCriterion("l1_l3 in", values, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3NotIn(List<String> values) {
            addCriterion("l1_l3 not in", values, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3Between(String value1, String value2) {
            addCriterion("l1_l3 between", value1, value2, "l1L3");
            return (Criteria) this;
        }

        public Criteria andL1L3NotBetween(String value1, String value2) {
            addCriterion("l1_l3 not between", value1, value2, "l1L3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorIsNull() {
            addCriterion("check_evaporator is null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorIsNotNull() {
            addCriterion("check_evaporator is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorEqualTo(String value) {
            addCriterion("check_evaporator =", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorNotEqualTo(String value) {
            addCriterion("check_evaporator <>", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorGreaterThan(String value) {
            addCriterion("check_evaporator >", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorGreaterThanOrEqualTo(String value) {
            addCriterion("check_evaporator >=", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorLessThan(String value) {
            addCriterion("check_evaporator <", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorLessThanOrEqualTo(String value) {
            addCriterion("check_evaporator <=", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorLike(String value) {
            addCriterion("check_evaporator like", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorNotLike(String value) {
            addCriterion("check_evaporator not like", value, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorIn(List<String> values) {
            addCriterion("check_evaporator in", values, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorNotIn(List<String> values) {
            addCriterion("check_evaporator not in", values, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorBetween(String value1, String value2) {
            addCriterion("check_evaporator between", value1, value2, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorNotBetween(String value1, String value2) {
            addCriterion("check_evaporator not between", value1, value2, "checkEvaporator");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1IsNull() {
            addCriterion("check_evaporator_l1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1IsNotNull() {
            addCriterion("check_evaporator_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1EqualTo(String value) {
            addCriterion("check_evaporator_l1 =", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1NotEqualTo(String value) {
            addCriterion("check_evaporator_l1 <>", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1GreaterThan(String value) {
            addCriterion("check_evaporator_l1 >", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1GreaterThanOrEqualTo(String value) {
            addCriterion("check_evaporator_l1 >=", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1LessThan(String value) {
            addCriterion("check_evaporator_l1 <", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1LessThanOrEqualTo(String value) {
            addCriterion("check_evaporator_l1 <=", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1Like(String value) {
            addCriterion("check_evaporator_l1 like", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1NotLike(String value) {
            addCriterion("check_evaporator_l1 not like", value, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1In(List<String> values) {
            addCriterion("check_evaporator_l1 in", values, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1NotIn(List<String> values) {
            addCriterion("check_evaporator_l1 not in", values, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1Between(String value1, String value2) {
            addCriterion("check_evaporator_l1 between", value1, value2, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL1NotBetween(String value1, String value2) {
            addCriterion("check_evaporator_l1 not between", value1, value2, "checkEvaporatorL1");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2IsNull() {
            addCriterion("check_evaporator_l2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2IsNotNull() {
            addCriterion("check_evaporator_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2EqualTo(String value) {
            addCriterion("check_evaporator_l2 =", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2NotEqualTo(String value) {
            addCriterion("check_evaporator_l2 <>", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2GreaterThan(String value) {
            addCriterion("check_evaporator_l2 >", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2GreaterThanOrEqualTo(String value) {
            addCriterion("check_evaporator_l2 >=", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2LessThan(String value) {
            addCriterion("check_evaporator_l2 <", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2LessThanOrEqualTo(String value) {
            addCriterion("check_evaporator_l2 <=", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2Like(String value) {
            addCriterion("check_evaporator_l2 like", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2NotLike(String value) {
            addCriterion("check_evaporator_l2 not like", value, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2In(List<String> values) {
            addCriterion("check_evaporator_l2 in", values, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2NotIn(List<String> values) {
            addCriterion("check_evaporator_l2 not in", values, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2Between(String value1, String value2) {
            addCriterion("check_evaporator_l2 between", value1, value2, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL2NotBetween(String value1, String value2) {
            addCriterion("check_evaporator_l2 not between", value1, value2, "checkEvaporatorL2");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3IsNull() {
            addCriterion("check_evaporator_l3 is null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3IsNotNull() {
            addCriterion("check_evaporator_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3EqualTo(String value) {
            addCriterion("check_evaporator_l3 =", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3NotEqualTo(String value) {
            addCriterion("check_evaporator_l3 <>", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3GreaterThan(String value) {
            addCriterion("check_evaporator_l3 >", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3GreaterThanOrEqualTo(String value) {
            addCriterion("check_evaporator_l3 >=", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3LessThan(String value) {
            addCriterion("check_evaporator_l3 <", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3LessThanOrEqualTo(String value) {
            addCriterion("check_evaporator_l3 <=", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3Like(String value) {
            addCriterion("check_evaporator_l3 like", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3NotLike(String value) {
            addCriterion("check_evaporator_l3 not like", value, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3In(List<String> values) {
            addCriterion("check_evaporator_l3 in", values, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3NotIn(List<String> values) {
            addCriterion("check_evaporator_l3 not in", values, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3Between(String value1, String value2) {
            addCriterion("check_evaporator_l3 between", value1, value2, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckEvaporatorL3NotBetween(String value1, String value2) {
            addCriterion("check_evaporator_l3 not between", value1, value2, "checkEvaporatorL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentIsNull() {
            addCriterion("check_current is null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentIsNotNull() {
            addCriterion("check_current is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentEqualTo(String value) {
            addCriterion("check_current =", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentNotEqualTo(String value) {
            addCriterion("check_current <>", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentGreaterThan(String value) {
            addCriterion("check_current >", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("check_current >=", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentLessThan(String value) {
            addCriterion("check_current <", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentLessThanOrEqualTo(String value) {
            addCriterion("check_current <=", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentLike(String value) {
            addCriterion("check_current like", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentNotLike(String value) {
            addCriterion("check_current not like", value, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentIn(List<String> values) {
            addCriterion("check_current in", values, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentNotIn(List<String> values) {
            addCriterion("check_current not in", values, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentBetween(String value1, String value2) {
            addCriterion("check_current between", value1, value2, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentNotBetween(String value1, String value2) {
            addCriterion("check_current not between", value1, value2, "checkCurrent");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1IsNull() {
            addCriterion("check_current_L1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1IsNotNull() {
            addCriterion("check_current_L1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1EqualTo(String value) {
            addCriterion("check_current_L1 =", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1NotEqualTo(String value) {
            addCriterion("check_current_L1 <>", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1GreaterThan(String value) {
            addCriterion("check_current_L1 >", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1GreaterThanOrEqualTo(String value) {
            addCriterion("check_current_L1 >=", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1LessThan(String value) {
            addCriterion("check_current_L1 <", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1LessThanOrEqualTo(String value) {
            addCriterion("check_current_L1 <=", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1Like(String value) {
            addCriterion("check_current_L1 like", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1NotLike(String value) {
            addCriterion("check_current_L1 not like", value, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1In(List<String> values) {
            addCriterion("check_current_L1 in", values, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1NotIn(List<String> values) {
            addCriterion("check_current_L1 not in", values, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1Between(String value1, String value2) {
            addCriterion("check_current_L1 between", value1, value2, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL1NotBetween(String value1, String value2) {
            addCriterion("check_current_L1 not between", value1, value2, "checkCurrentL1");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2IsNull() {
            addCriterion("check_current_L2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2IsNotNull() {
            addCriterion("check_current_L2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2EqualTo(String value) {
            addCriterion("check_current_L2 =", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2NotEqualTo(String value) {
            addCriterion("check_current_L2 <>", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2GreaterThan(String value) {
            addCriterion("check_current_L2 >", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2GreaterThanOrEqualTo(String value) {
            addCriterion("check_current_L2 >=", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2LessThan(String value) {
            addCriterion("check_current_L2 <", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2LessThanOrEqualTo(String value) {
            addCriterion("check_current_L2 <=", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2Like(String value) {
            addCriterion("check_current_L2 like", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2NotLike(String value) {
            addCriterion("check_current_L2 not like", value, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2In(List<String> values) {
            addCriterion("check_current_L2 in", values, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2NotIn(List<String> values) {
            addCriterion("check_current_L2 not in", values, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2Between(String value1, String value2) {
            addCriterion("check_current_L2 between", value1, value2, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL2NotBetween(String value1, String value2) {
            addCriterion("check_current_L2 not between", value1, value2, "checkCurrentL2");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3IsNull() {
            addCriterion("check_current_L3 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3IsNotNull() {
            addCriterion("check_current_L3 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3EqualTo(String value) {
            addCriterion("check_current_L3 =", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3NotEqualTo(String value) {
            addCriterion("check_current_L3 <>", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3GreaterThan(String value) {
            addCriterion("check_current_L3 >", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3GreaterThanOrEqualTo(String value) {
            addCriterion("check_current_L3 >=", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3LessThan(String value) {
            addCriterion("check_current_L3 <", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3LessThanOrEqualTo(String value) {
            addCriterion("check_current_L3 <=", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3Like(String value) {
            addCriterion("check_current_L3 like", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3NotLike(String value) {
            addCriterion("check_current_L3 not like", value, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3In(List<String> values) {
            addCriterion("check_current_L3 in", values, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3NotIn(List<String> values) {
            addCriterion("check_current_L3 not in", values, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3Between(String value1, String value2) {
            addCriterion("check_current_L3 between", value1, value2, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckCurrentL3NotBetween(String value1, String value2) {
            addCriterion("check_current_L3 not between", value1, value2, "checkCurrentL3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1IsNull() {
            addCriterion("check_No1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1IsNotNull() {
            addCriterion("check_No1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1EqualTo(String value) {
            addCriterion("check_No1 =", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1NotEqualTo(String value) {
            addCriterion("check_No1 <>", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1GreaterThan(String value) {
            addCriterion("check_No1 >", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1GreaterThanOrEqualTo(String value) {
            addCriterion("check_No1 >=", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1LessThan(String value) {
            addCriterion("check_No1 <", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1LessThanOrEqualTo(String value) {
            addCriterion("check_No1 <=", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1Like(String value) {
            addCriterion("check_No1 like", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1NotLike(String value) {
            addCriterion("check_No1 not like", value, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1In(List<String> values) {
            addCriterion("check_No1 in", values, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1NotIn(List<String> values) {
            addCriterion("check_No1 not in", values, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1Between(String value1, String value2) {
            addCriterion("check_No1 between", value1, value2, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1NotBetween(String value1, String value2) {
            addCriterion("check_No1 not between", value1, value2, "checkNo1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1IsNull() {
            addCriterion("check_no1_l1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1IsNotNull() {
            addCriterion("check_no1_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1EqualTo(String value) {
            addCriterion("check_no1_l1 =", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1NotEqualTo(String value) {
            addCriterion("check_no1_l1 <>", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1GreaterThan(String value) {
            addCriterion("check_no1_l1 >", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1GreaterThanOrEqualTo(String value) {
            addCriterion("check_no1_l1 >=", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1LessThan(String value) {
            addCriterion("check_no1_l1 <", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1LessThanOrEqualTo(String value) {
            addCriterion("check_no1_l1 <=", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1Like(String value) {
            addCriterion("check_no1_l1 like", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1NotLike(String value) {
            addCriterion("check_no1_l1 not like", value, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1In(List<String> values) {
            addCriterion("check_no1_l1 in", values, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1NotIn(List<String> values) {
            addCriterion("check_no1_l1 not in", values, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1Between(String value1, String value2) {
            addCriterion("check_no1_l1 between", value1, value2, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L1NotBetween(String value1, String value2) {
            addCriterion("check_no1_l1 not between", value1, value2, "checkNo1L1");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2IsNull() {
            addCriterion("check_no1_l2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2IsNotNull() {
            addCriterion("check_no1_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2EqualTo(String value) {
            addCriterion("check_no1_l2 =", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2NotEqualTo(String value) {
            addCriterion("check_no1_l2 <>", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2GreaterThan(String value) {
            addCriterion("check_no1_l2 >", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2GreaterThanOrEqualTo(String value) {
            addCriterion("check_no1_l2 >=", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2LessThan(String value) {
            addCriterion("check_no1_l2 <", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2LessThanOrEqualTo(String value) {
            addCriterion("check_no1_l2 <=", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2Like(String value) {
            addCriterion("check_no1_l2 like", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2NotLike(String value) {
            addCriterion("check_no1_l2 not like", value, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2In(List<String> values) {
            addCriterion("check_no1_l2 in", values, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2NotIn(List<String> values) {
            addCriterion("check_no1_l2 not in", values, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2Between(String value1, String value2) {
            addCriterion("check_no1_l2 between", value1, value2, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L2NotBetween(String value1, String value2) {
            addCriterion("check_no1_l2 not between", value1, value2, "checkNo1L2");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3IsNull() {
            addCriterion("check_no1_l3 is null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3IsNotNull() {
            addCriterion("check_no1_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3EqualTo(String value) {
            addCriterion("check_no1_l3 =", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3NotEqualTo(String value) {
            addCriterion("check_no1_l3 <>", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3GreaterThan(String value) {
            addCriterion("check_no1_l3 >", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3GreaterThanOrEqualTo(String value) {
            addCriterion("check_no1_l3 >=", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3LessThan(String value) {
            addCriterion("check_no1_l3 <", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3LessThanOrEqualTo(String value) {
            addCriterion("check_no1_l3 <=", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3Like(String value) {
            addCriterion("check_no1_l3 like", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3NotLike(String value) {
            addCriterion("check_no1_l3 not like", value, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3In(List<String> values) {
            addCriterion("check_no1_l3 in", values, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3NotIn(List<String> values) {
            addCriterion("check_no1_l3 not in", values, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3Between(String value1, String value2) {
            addCriterion("check_no1_l3 between", value1, value2, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo1L3NotBetween(String value1, String value2) {
            addCriterion("check_no1_l3 not between", value1, value2, "checkNo1L3");
            return (Criteria) this;
        }

        public Criteria andCheckNo2IsNull() {
            addCriterion("check_No2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckNo2IsNotNull() {
            addCriterion("check_No2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNo2EqualTo(String value) {
            addCriterion("check_No2 =", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2NotEqualTo(String value) {
            addCriterion("check_No2 <>", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2GreaterThan(String value) {
            addCriterion("check_No2 >", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2GreaterThanOrEqualTo(String value) {
            addCriterion("check_No2 >=", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2LessThan(String value) {
            addCriterion("check_No2 <", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2LessThanOrEqualTo(String value) {
            addCriterion("check_No2 <=", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2Like(String value) {
            addCriterion("check_No2 like", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2NotLike(String value) {
            addCriterion("check_No2 not like", value, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2In(List<String> values) {
            addCriterion("check_No2 in", values, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2NotIn(List<String> values) {
            addCriterion("check_No2 not in", values, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2Between(String value1, String value2) {
            addCriterion("check_No2 between", value1, value2, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andCheckNo2NotBetween(String value1, String value2) {
            addCriterion("check_No2 not between", value1, value2, "checkNo2");
            return (Criteria) this;
        }

        public Criteria andPutHeatIsNull() {
            addCriterion("put_heat is null");
            return (Criteria) this;
        }

        public Criteria andPutHeatIsNotNull() {
            addCriterion("put_heat is not null");
            return (Criteria) this;
        }

        public Criteria andPutHeatEqualTo(String value) {
            addCriterion("put_heat =", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatNotEqualTo(String value) {
            addCriterion("put_heat <>", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatGreaterThan(String value) {
            addCriterion("put_heat >", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatGreaterThanOrEqualTo(String value) {
            addCriterion("put_heat >=", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatLessThan(String value) {
            addCriterion("put_heat <", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatLessThanOrEqualTo(String value) {
            addCriterion("put_heat <=", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatLike(String value) {
            addCriterion("put_heat like", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatNotLike(String value) {
            addCriterion("put_heat not like", value, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatIn(List<String> values) {
            addCriterion("put_heat in", values, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatNotIn(List<String> values) {
            addCriterion("put_heat not in", values, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatBetween(String value1, String value2) {
            addCriterion("put_heat between", value1, value2, "putHeat");
            return (Criteria) this;
        }

        public Criteria andPutHeatNotBetween(String value1, String value2) {
            addCriterion("put_heat not between", value1, value2, "putHeat");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersIsNull() {
            addCriterion("check_main_heaters is null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersIsNotNull() {
            addCriterion("check_main_heaters is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersEqualTo(String value) {
            addCriterion("check_main_heaters =", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersNotEqualTo(String value) {
            addCriterion("check_main_heaters <>", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersGreaterThan(String value) {
            addCriterion("check_main_heaters >", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersGreaterThanOrEqualTo(String value) {
            addCriterion("check_main_heaters >=", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersLessThan(String value) {
            addCriterion("check_main_heaters <", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersLessThanOrEqualTo(String value) {
            addCriterion("check_main_heaters <=", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersLike(String value) {
            addCriterion("check_main_heaters like", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersNotLike(String value) {
            addCriterion("check_main_heaters not like", value, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersIn(List<String> values) {
            addCriterion("check_main_heaters in", values, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersNotIn(List<String> values) {
            addCriterion("check_main_heaters not in", values, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersBetween(String value1, String value2) {
            addCriterion("check_main_heaters between", value1, value2, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersNotBetween(String value1, String value2) {
            addCriterion("check_main_heaters not between", value1, value2, "checkMainHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1IsNull() {
            addCriterion("check_main_heaters_l1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1IsNotNull() {
            addCriterion("check_main_heaters_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1EqualTo(String value) {
            addCriterion("check_main_heaters_l1 =", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1NotEqualTo(String value) {
            addCriterion("check_main_heaters_l1 <>", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1GreaterThan(String value) {
            addCriterion("check_main_heaters_l1 >", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1GreaterThanOrEqualTo(String value) {
            addCriterion("check_main_heaters_l1 >=", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1LessThan(String value) {
            addCriterion("check_main_heaters_l1 <", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1LessThanOrEqualTo(String value) {
            addCriterion("check_main_heaters_l1 <=", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1Like(String value) {
            addCriterion("check_main_heaters_l1 like", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1NotLike(String value) {
            addCriterion("check_main_heaters_l1 not like", value, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1In(List<String> values) {
            addCriterion("check_main_heaters_l1 in", values, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1NotIn(List<String> values) {
            addCriterion("check_main_heaters_l1 not in", values, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1Between(String value1, String value2) {
            addCriterion("check_main_heaters_l1 between", value1, value2, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL1NotBetween(String value1, String value2) {
            addCriterion("check_main_heaters_l1 not between", value1, value2, "checkMainHeatersL1");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2IsNull() {
            addCriterion("check_main_heaters_l2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2IsNotNull() {
            addCriterion("check_main_heaters_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2EqualTo(String value) {
            addCriterion("check_main_heaters_l2 =", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2NotEqualTo(String value) {
            addCriterion("check_main_heaters_l2 <>", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2GreaterThan(String value) {
            addCriterion("check_main_heaters_l2 >", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2GreaterThanOrEqualTo(String value) {
            addCriterion("check_main_heaters_l2 >=", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2LessThan(String value) {
            addCriterion("check_main_heaters_l2 <", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2LessThanOrEqualTo(String value) {
            addCriterion("check_main_heaters_l2 <=", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2Like(String value) {
            addCriterion("check_main_heaters_l2 like", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2NotLike(String value) {
            addCriterion("check_main_heaters_l2 not like", value, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2In(List<String> values) {
            addCriterion("check_main_heaters_l2 in", values, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2NotIn(List<String> values) {
            addCriterion("check_main_heaters_l2 not in", values, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2Between(String value1, String value2) {
            addCriterion("check_main_heaters_l2 between", value1, value2, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL2NotBetween(String value1, String value2) {
            addCriterion("check_main_heaters_l2 not between", value1, value2, "checkMainHeatersL2");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3IsNull() {
            addCriterion("check_main_heaters_l3 is null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3IsNotNull() {
            addCriterion("check_main_heaters_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3EqualTo(String value) {
            addCriterion("check_main_heaters_l3 =", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3NotEqualTo(String value) {
            addCriterion("check_main_heaters_l3 <>", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3GreaterThan(String value) {
            addCriterion("check_main_heaters_l3 >", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3GreaterThanOrEqualTo(String value) {
            addCriterion("check_main_heaters_l3 >=", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3LessThan(String value) {
            addCriterion("check_main_heaters_l3 <", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3LessThanOrEqualTo(String value) {
            addCriterion("check_main_heaters_l3 <=", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3Like(String value) {
            addCriterion("check_main_heaters_l3 like", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3NotLike(String value) {
            addCriterion("check_main_heaters_l3 not like", value, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3In(List<String> values) {
            addCriterion("check_main_heaters_l3 in", values, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3NotIn(List<String> values) {
            addCriterion("check_main_heaters_l3 not in", values, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3Between(String value1, String value2) {
            addCriterion("check_main_heaters_l3 between", value1, value2, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckMainHeatersL3NotBetween(String value1, String value2) {
            addCriterion("check_main_heaters_l3 not between", value1, value2, "checkMainHeatersL3");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersIsNull() {
            addCriterion("check_sub_heaters is null");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersIsNotNull() {
            addCriterion("check_sub_heaters is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersEqualTo(String value) {
            addCriterion("check_sub_heaters =", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersNotEqualTo(String value) {
            addCriterion("check_sub_heaters <>", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersGreaterThan(String value) {
            addCriterion("check_sub_heaters >", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersGreaterThanOrEqualTo(String value) {
            addCriterion("check_sub_heaters >=", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersLessThan(String value) {
            addCriterion("check_sub_heaters <", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersLessThanOrEqualTo(String value) {
            addCriterion("check_sub_heaters <=", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersLike(String value) {
            addCriterion("check_sub_heaters like", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersNotLike(String value) {
            addCriterion("check_sub_heaters not like", value, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersIn(List<String> values) {
            addCriterion("check_sub_heaters in", values, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersNotIn(List<String> values) {
            addCriterion("check_sub_heaters not in", values, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersBetween(String value1, String value2) {
            addCriterion("check_sub_heaters between", value1, value2, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckSubHeatersNotBetween(String value1, String value2) {
            addCriterion("check_sub_heaters not between", value1, value2, "checkSubHeaters");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantIsNull() {
            addCriterion("check_refrigerant is null");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantIsNotNull() {
            addCriterion("check_refrigerant is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantEqualTo(String value) {
            addCriterion("check_refrigerant =", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantNotEqualTo(String value) {
            addCriterion("check_refrigerant <>", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantGreaterThan(String value) {
            addCriterion("check_refrigerant >", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantGreaterThanOrEqualTo(String value) {
            addCriterion("check_refrigerant >=", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantLessThan(String value) {
            addCriterion("check_refrigerant <", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantLessThanOrEqualTo(String value) {
            addCriterion("check_refrigerant <=", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantLike(String value) {
            addCriterion("check_refrigerant like", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantNotLike(String value) {
            addCriterion("check_refrigerant not like", value, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantIn(List<String> values) {
            addCriterion("check_refrigerant in", values, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantNotIn(List<String> values) {
            addCriterion("check_refrigerant not in", values, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantBetween(String value1, String value2) {
            addCriterion("check_refrigerant between", value1, value2, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andCheckRefrigerantNotBetween(String value1, String value2) {
            addCriterion("check_refrigerant not between", value1, value2, "checkRefrigerant");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andDownTo32IsNull() {
            addCriterion("down_to_32 is null");
            return (Criteria) this;
        }

        public Criteria andDownTo32IsNotNull() {
            addCriterion("down_to_32 is not null");
            return (Criteria) this;
        }

        public Criteria andDownTo32EqualTo(String value) {
            addCriterion("down_to_32 =", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32NotEqualTo(String value) {
            addCriterion("down_to_32 <>", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32GreaterThan(String value) {
            addCriterion("down_to_32 >", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32GreaterThanOrEqualTo(String value) {
            addCriterion("down_to_32 >=", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32LessThan(String value) {
            addCriterion("down_to_32 <", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32LessThanOrEqualTo(String value) {
            addCriterion("down_to_32 <=", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32Like(String value) {
            addCriterion("down_to_32 like", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32NotLike(String value) {
            addCriterion("down_to_32 not like", value, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32In(List<String> values) {
            addCriterion("down_to_32 in", values, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32NotIn(List<String> values) {
            addCriterion("down_to_32 not in", values, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32Between(String value1, String value2) {
            addCriterion("down_to_32 between", value1, value2, "downTo32");
            return (Criteria) this;
        }

        public Criteria andDownTo32NotBetween(String value1, String value2) {
            addCriterion("down_to_32 not between", value1, value2, "downTo32");
            return (Criteria) this;
        }

        public Criteria andCheckOperationIsNull() {
            addCriterion("check_operation is null");
            return (Criteria) this;
        }

        public Criteria andCheckOperationIsNotNull() {
            addCriterion("check_operation is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOperationEqualTo(String value) {
            addCriterion("check_operation =", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationNotEqualTo(String value) {
            addCriterion("check_operation <>", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationGreaterThan(String value) {
            addCriterion("check_operation >", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationGreaterThanOrEqualTo(String value) {
            addCriterion("check_operation >=", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationLessThan(String value) {
            addCriterion("check_operation <", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationLessThanOrEqualTo(String value) {
            addCriterion("check_operation <=", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationLike(String value) {
            addCriterion("check_operation like", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationNotLike(String value) {
            addCriterion("check_operation not like", value, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationIn(List<String> values) {
            addCriterion("check_operation in", values, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationNotIn(List<String> values) {
            addCriterion("check_operation not in", values, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationBetween(String value1, String value2) {
            addCriterion("check_operation between", value1, value2, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckOperationNotBetween(String value1, String value2) {
            addCriterion("check_operation not between", value1, value2, "checkOperation");
            return (Criteria) this;
        }

        public Criteria andCheckDefostIsNull() {
            addCriterion("check_defost is null");
            return (Criteria) this;
        }

        public Criteria andCheckDefostIsNotNull() {
            addCriterion("check_defost is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDefostEqualTo(String value) {
            addCriterion("check_defost =", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostNotEqualTo(String value) {
            addCriterion("check_defost <>", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostGreaterThan(String value) {
            addCriterion("check_defost >", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostGreaterThanOrEqualTo(String value) {
            addCriterion("check_defost >=", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostLessThan(String value) {
            addCriterion("check_defost <", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostLessThanOrEqualTo(String value) {
            addCriterion("check_defost <=", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostLike(String value) {
            addCriterion("check_defost like", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostNotLike(String value) {
            addCriterion("check_defost not like", value, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostIn(List<String> values) {
            addCriterion("check_defost in", values, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostNotIn(List<String> values) {
            addCriterion("check_defost not in", values, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostBetween(String value1, String value2) {
            addCriterion("check_defost between", value1, value2, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andCheckDefostNotBetween(String value1, String value2) {
            addCriterion("check_defost not between", value1, value2, "checkDefost");
            return (Criteria) this;
        }

        public Criteria andOperateUnitIsNull() {
            addCriterion("operate_unit is null");
            return (Criteria) this;
        }

        public Criteria andOperateUnitIsNotNull() {
            addCriterion("operate_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUnitEqualTo(String value) {
            addCriterion("operate_unit =", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitNotEqualTo(String value) {
            addCriterion("operate_unit <>", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitGreaterThan(String value) {
            addCriterion("operate_unit >", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitGreaterThanOrEqualTo(String value) {
            addCriterion("operate_unit >=", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitLessThan(String value) {
            addCriterion("operate_unit <", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitLessThanOrEqualTo(String value) {
            addCriterion("operate_unit <=", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitLike(String value) {
            addCriterion("operate_unit like", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitNotLike(String value) {
            addCriterion("operate_unit not like", value, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitIn(List<String> values) {
            addCriterion("operate_unit in", values, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitNotIn(List<String> values) {
            addCriterion("operate_unit not in", values, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitBetween(String value1, String value2) {
            addCriterion("operate_unit between", value1, value2, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andOperateUnitNotBetween(String value1, String value2) {
            addCriterion("operate_unit not between", value1, value2, "operateUnit");
            return (Criteria) this;
        }

        public Criteria andCheckFansIsNull() {
            addCriterion("check_fans is null");
            return (Criteria) this;
        }

        public Criteria andCheckFansIsNotNull() {
            addCriterion("check_fans is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFansEqualTo(String value) {
            addCriterion("check_fans =", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansNotEqualTo(String value) {
            addCriterion("check_fans <>", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansGreaterThan(String value) {
            addCriterion("check_fans >", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansGreaterThanOrEqualTo(String value) {
            addCriterion("check_fans >=", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansLessThan(String value) {
            addCriterion("check_fans <", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansLessThanOrEqualTo(String value) {
            addCriterion("check_fans <=", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansLike(String value) {
            addCriterion("check_fans like", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansNotLike(String value) {
            addCriterion("check_fans not like", value, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansIn(List<String> values) {
            addCriterion("check_fans in", values, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansNotIn(List<String> values) {
            addCriterion("check_fans not in", values, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansBetween(String value1, String value2) {
            addCriterion("check_fans between", value1, value2, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansNotBetween(String value1, String value2) {
            addCriterion("check_fans not between", value1, value2, "checkFans");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1IsNull() {
            addCriterion("check_fans_l1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1IsNotNull() {
            addCriterion("check_fans_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1EqualTo(String value) {
            addCriterion("check_fans_l1 =", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1NotEqualTo(String value) {
            addCriterion("check_fans_l1 <>", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1GreaterThan(String value) {
            addCriterion("check_fans_l1 >", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1GreaterThanOrEqualTo(String value) {
            addCriterion("check_fans_l1 >=", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1LessThan(String value) {
            addCriterion("check_fans_l1 <", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1LessThanOrEqualTo(String value) {
            addCriterion("check_fans_l1 <=", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1Like(String value) {
            addCriterion("check_fans_l1 like", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1NotLike(String value) {
            addCriterion("check_fans_l1 not like", value, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1In(List<String> values) {
            addCriterion("check_fans_l1 in", values, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1NotIn(List<String> values) {
            addCriterion("check_fans_l1 not in", values, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1Between(String value1, String value2) {
            addCriterion("check_fans_l1 between", value1, value2, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL1NotBetween(String value1, String value2) {
            addCriterion("check_fans_l1 not between", value1, value2, "checkFansL1");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2IsNull() {
            addCriterion("check_fans_l2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2IsNotNull() {
            addCriterion("check_fans_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2EqualTo(String value) {
            addCriterion("check_fans_l2 =", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2NotEqualTo(String value) {
            addCriterion("check_fans_l2 <>", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2GreaterThan(String value) {
            addCriterion("check_fans_l2 >", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2GreaterThanOrEqualTo(String value) {
            addCriterion("check_fans_l2 >=", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2LessThan(String value) {
            addCriterion("check_fans_l2 <", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2LessThanOrEqualTo(String value) {
            addCriterion("check_fans_l2 <=", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2Like(String value) {
            addCriterion("check_fans_l2 like", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2NotLike(String value) {
            addCriterion("check_fans_l2 not like", value, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2In(List<String> values) {
            addCriterion("check_fans_l2 in", values, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2NotIn(List<String> values) {
            addCriterion("check_fans_l2 not in", values, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2Between(String value1, String value2) {
            addCriterion("check_fans_l2 between", value1, value2, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL2NotBetween(String value1, String value2) {
            addCriterion("check_fans_l2 not between", value1, value2, "checkFansL2");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3IsNull() {
            addCriterion("check_fans_l3 is null");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3IsNotNull() {
            addCriterion("check_fans_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3EqualTo(String value) {
            addCriterion("check_fans_l3 =", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3NotEqualTo(String value) {
            addCriterion("check_fans_l3 <>", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3GreaterThan(String value) {
            addCriterion("check_fans_l3 >", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3GreaterThanOrEqualTo(String value) {
            addCriterion("check_fans_l3 >=", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3LessThan(String value) {
            addCriterion("check_fans_l3 <", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3LessThanOrEqualTo(String value) {
            addCriterion("check_fans_l3 <=", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3Like(String value) {
            addCriterion("check_fans_l3 like", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3NotLike(String value) {
            addCriterion("check_fans_l3 not like", value, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3In(List<String> values) {
            addCriterion("check_fans_l3 in", values, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3NotIn(List<String> values) {
            addCriterion("check_fans_l3 not in", values, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3Between(String value1, String value2) {
            addCriterion("check_fans_l3 between", value1, value2, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andCheckFansL3NotBetween(String value1, String value2) {
            addCriterion("check_fans_l3 not between", value1, value2, "checkFansL3");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullIsNull() {
            addCriterion("refrigerant_full is null");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullIsNotNull() {
            addCriterion("refrigerant_full is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullEqualTo(String value) {
            addCriterion("refrigerant_full =", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullNotEqualTo(String value) {
            addCriterion("refrigerant_full <>", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullGreaterThan(String value) {
            addCriterion("refrigerant_full >", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullGreaterThanOrEqualTo(String value) {
            addCriterion("refrigerant_full >=", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullLessThan(String value) {
            addCriterion("refrigerant_full <", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullLessThanOrEqualTo(String value) {
            addCriterion("refrigerant_full <=", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullLike(String value) {
            addCriterion("refrigerant_full like", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullNotLike(String value) {
            addCriterion("refrigerant_full not like", value, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullIn(List<String> values) {
            addCriterion("refrigerant_full in", values, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullNotIn(List<String> values) {
            addCriterion("refrigerant_full not in", values, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullBetween(String value1, String value2) {
            addCriterion("refrigerant_full between", value1, value2, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andRefrigerantFullNotBetween(String value1, String value2) {
            addCriterion("refrigerant_full not between", value1, value2, "refrigerantFull");
            return (Criteria) this;
        }

        public Criteria andMonistureColorIsNull() {
            addCriterion("monisture_color is null");
            return (Criteria) this;
        }

        public Criteria andMonistureColorIsNotNull() {
            addCriterion("monisture_color is not null");
            return (Criteria) this;
        }

        public Criteria andMonistureColorEqualTo(String value) {
            addCriterion("monisture_color =", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorNotEqualTo(String value) {
            addCriterion("monisture_color <>", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorGreaterThan(String value) {
            addCriterion("monisture_color >", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorGreaterThanOrEqualTo(String value) {
            addCriterion("monisture_color >=", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorLessThan(String value) {
            addCriterion("monisture_color <", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorLessThanOrEqualTo(String value) {
            addCriterion("monisture_color <=", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorLike(String value) {
            addCriterion("monisture_color like", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorNotLike(String value) {
            addCriterion("monisture_color not like", value, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorIn(List<String> values) {
            addCriterion("monisture_color in", values, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorNotIn(List<String> values) {
            addCriterion("monisture_color not in", values, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorBetween(String value1, String value2) {
            addCriterion("monisture_color between", value1, value2, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andMonistureColorNotBetween(String value1, String value2) {
            addCriterion("monisture_color not between", value1, value2, "monistureColor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorIsNull() {
            addCriterion("check_compressor is null");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorIsNotNull() {
            addCriterion("check_compressor is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorEqualTo(String value) {
            addCriterion("check_compressor =", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorNotEqualTo(String value) {
            addCriterion("check_compressor <>", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorGreaterThan(String value) {
            addCriterion("check_compressor >", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorGreaterThanOrEqualTo(String value) {
            addCriterion("check_compressor >=", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLessThan(String value) {
            addCriterion("check_compressor <", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLessThanOrEqualTo(String value) {
            addCriterion("check_compressor <=", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLike(String value) {
            addCriterion("check_compressor like", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorNotLike(String value) {
            addCriterion("check_compressor not like", value, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorIn(List<String> values) {
            addCriterion("check_compressor in", values, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorNotIn(List<String> values) {
            addCriterion("check_compressor not in", values, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorBetween(String value1, String value2) {
            addCriterion("check_compressor between", value1, value2, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorNotBetween(String value1, String value2) {
            addCriterion("check_compressor not between", value1, value2, "checkCompressor");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelIsNull() {
            addCriterion("check_compressor_level is null");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelIsNotNull() {
            addCriterion("check_compressor_level is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelEqualTo(String value) {
            addCriterion("check_compressor_level =", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelNotEqualTo(String value) {
            addCriterion("check_compressor_level <>", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelGreaterThan(String value) {
            addCriterion("check_compressor_level >", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelGreaterThanOrEqualTo(String value) {
            addCriterion("check_compressor_level >=", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelLessThan(String value) {
            addCriterion("check_compressor_level <", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelLessThanOrEqualTo(String value) {
            addCriterion("check_compressor_level <=", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelLike(String value) {
            addCriterion("check_compressor_level like", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelNotLike(String value) {
            addCriterion("check_compressor_level not like", value, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelIn(List<String> values) {
            addCriterion("check_compressor_level in", values, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelNotIn(List<String> values) {
            addCriterion("check_compressor_level not in", values, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelBetween(String value1, String value2) {
            addCriterion("check_compressor_level between", value1, value2, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andCheckCompressorLevelNotBetween(String value1, String value2) {
            addCriterion("check_compressor_level not between", value1, value2, "checkCompressorLevel");
            return (Criteria) this;
        }

        public Criteria andDownTo0IsNull() {
            addCriterion("down_to_0 is null");
            return (Criteria) this;
        }

        public Criteria andDownTo0IsNotNull() {
            addCriterion("down_to_0 is not null");
            return (Criteria) this;
        }

        public Criteria andDownTo0EqualTo(String value) {
            addCriterion("down_to_0 =", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0NotEqualTo(String value) {
            addCriterion("down_to_0 <>", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0GreaterThan(String value) {
            addCriterion("down_to_0 >", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0GreaterThanOrEqualTo(String value) {
            addCriterion("down_to_0 >=", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0LessThan(String value) {
            addCriterion("down_to_0 <", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0LessThanOrEqualTo(String value) {
            addCriterion("down_to_0 <=", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0Like(String value) {
            addCriterion("down_to_0 like", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0NotLike(String value) {
            addCriterion("down_to_0 not like", value, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0In(List<String> values) {
            addCriterion("down_to_0 in", values, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0NotIn(List<String> values) {
            addCriterion("down_to_0 not in", values, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0Between(String value1, String value2) {
            addCriterion("down_to_0 between", value1, value2, "downTo0");
            return (Criteria) this;
        }

        public Criteria andDownTo0NotBetween(String value1, String value2) {
            addCriterion("down_to_0 not between", value1, value2, "downTo0");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureIsNull() {
            addCriterion("wind_temerature is null");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureIsNotNull() {
            addCriterion("wind_temerature is not null");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureEqualTo(String value) {
            addCriterion("wind_temerature =", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureNotEqualTo(String value) {
            addCriterion("wind_temerature <>", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureGreaterThan(String value) {
            addCriterion("wind_temerature >", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureGreaterThanOrEqualTo(String value) {
            addCriterion("wind_temerature >=", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureLessThan(String value) {
            addCriterion("wind_temerature <", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureLessThanOrEqualTo(String value) {
            addCriterion("wind_temerature <=", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureLike(String value) {
            addCriterion("wind_temerature like", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureNotLike(String value) {
            addCriterion("wind_temerature not like", value, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureIn(List<String> values) {
            addCriterion("wind_temerature in", values, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureNotIn(List<String> values) {
            addCriterion("wind_temerature not in", values, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureBetween(String value1, String value2) {
            addCriterion("wind_temerature between", value1, value2, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andWindTemeratureNotBetween(String value1, String value2) {
            addCriterion("wind_temerature not between", value1, value2, "windTemerature");
            return (Criteria) this;
        }

        public Criteria andCheckChartIsNull() {
            addCriterion("check_chart is null");
            return (Criteria) this;
        }

        public Criteria andCheckChartIsNotNull() {
            addCriterion("check_chart is not null");
            return (Criteria) this;
        }

        public Criteria andCheckChartEqualTo(String value) {
            addCriterion("check_chart =", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartNotEqualTo(String value) {
            addCriterion("check_chart <>", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartGreaterThan(String value) {
            addCriterion("check_chart >", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartGreaterThanOrEqualTo(String value) {
            addCriterion("check_chart >=", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartLessThan(String value) {
            addCriterion("check_chart <", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartLessThanOrEqualTo(String value) {
            addCriterion("check_chart <=", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartLike(String value) {
            addCriterion("check_chart like", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartNotLike(String value) {
            addCriterion("check_chart not like", value, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartIn(List<String> values) {
            addCriterion("check_chart in", values, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartNotIn(List<String> values) {
            addCriterion("check_chart not in", values, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartBetween(String value1, String value2) {
            addCriterion("check_chart between", value1, value2, "checkChart");
            return (Criteria) this;
        }

        public Criteria andCheckChartNotBetween(String value1, String value2) {
            addCriterion("check_chart not between", value1, value2, "checkChart");
            return (Criteria) this;
        }

        public Criteria andMechanicIsNull() {
            addCriterion("mechanic is null");
            return (Criteria) this;
        }

        public Criteria andMechanicIsNotNull() {
            addCriterion("mechanic is not null");
            return (Criteria) this;
        }

        public Criteria andMechanicEqualTo(String value) {
            addCriterion("mechanic =", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotEqualTo(String value) {
            addCriterion("mechanic <>", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicGreaterThan(String value) {
            addCriterion("mechanic >", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicGreaterThanOrEqualTo(String value) {
            addCriterion("mechanic >=", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicLessThan(String value) {
            addCriterion("mechanic <", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicLessThanOrEqualTo(String value) {
            addCriterion("mechanic <=", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicLike(String value) {
            addCriterion("mechanic like", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotLike(String value) {
            addCriterion("mechanic not like", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicIn(List<String> values) {
            addCriterion("mechanic in", values, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotIn(List<String> values) {
            addCriterion("mechanic not in", values, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicBetween(String value1, String value2) {
            addCriterion("mechanic between", value1, value2, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotBetween(String value1, String value2) {
            addCriterion("mechanic not between", value1, value2, "mechanic");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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