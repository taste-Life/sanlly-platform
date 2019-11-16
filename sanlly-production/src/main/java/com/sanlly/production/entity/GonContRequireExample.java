package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GonContRequireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GonContRequireExample() {
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

        public Criteria andProdGonContRequireIdIsNull() {
            addCriterion("prod_gon_cont_require_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdIsNotNull() {
            addCriterion("prod_gon_cont_require_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdEqualTo(Integer value) {
            addCriterion("prod_gon_cont_require_id =", value, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdNotEqualTo(Integer value) {
            addCriterion("prod_gon_cont_require_id <>", value, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdGreaterThan(Integer value) {
            addCriterion("prod_gon_cont_require_id >", value, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_gon_cont_require_id >=", value, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdLessThan(Integer value) {
            addCriterion("prod_gon_cont_require_id <", value, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_gon_cont_require_id <=", value, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdIn(List<Integer> values) {
            addCriterion("prod_gon_cont_require_id in", values, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdNotIn(List<Integer> values) {
            addCriterion("prod_gon_cont_require_id not in", values, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_gon_cont_require_id between", value1, value2, "prodGonContRequireId");
            return (Criteria) this;
        }

        public Criteria andProdGonContRequireIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_gon_cont_require_id not between", value1, value2, "prodGonContRequireId");
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

        public Criteria andContainerTypeIsNull() {
            addCriterion("container_type is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("container_type is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("container_type =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("container_type <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("container_type >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("container_type >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("container_type <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("container_type <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("container_type like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("container_type not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("container_type in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("container_type not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("container_type between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("container_type not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("`structure` is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("`structure` is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("`structure` =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("`structure` <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("`structure` >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("`structure` >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("`structure` <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("`structure` <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("`structure` like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("`structure` not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("`structure` in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("`structure` not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("`structure` between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("`structure` not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andGirderIsNull() {
            addCriterion("girder is null");
            return (Criteria) this;
        }

        public Criteria andGirderIsNotNull() {
            addCriterion("girder is not null");
            return (Criteria) this;
        }

        public Criteria andGirderEqualTo(String value) {
            addCriterion("girder =", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderNotEqualTo(String value) {
            addCriterion("girder <>", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderGreaterThan(String value) {
            addCriterion("girder >", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderGreaterThanOrEqualTo(String value) {
            addCriterion("girder >=", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderLessThan(String value) {
            addCriterion("girder <", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderLessThanOrEqualTo(String value) {
            addCriterion("girder <=", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderLike(String value) {
            addCriterion("girder like", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderNotLike(String value) {
            addCriterion("girder not like", value, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderIn(List<String> values) {
            addCriterion("girder in", values, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderNotIn(List<String> values) {
            addCriterion("girder not in", values, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderBetween(String value1, String value2) {
            addCriterion("girder between", value1, value2, "girder");
            return (Criteria) this;
        }

        public Criteria andGirderNotBetween(String value1, String value2) {
            addCriterion("girder not between", value1, value2, "girder");
            return (Criteria) this;
        }

        public Criteria andRopeIsNull() {
            addCriterion("rope is null");
            return (Criteria) this;
        }

        public Criteria andRopeIsNotNull() {
            addCriterion("rope is not null");
            return (Criteria) this;
        }

        public Criteria andRopeEqualTo(String value) {
            addCriterion("rope =", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeNotEqualTo(String value) {
            addCriterion("rope <>", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeGreaterThan(String value) {
            addCriterion("rope >", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeGreaterThanOrEqualTo(String value) {
            addCriterion("rope >=", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeLessThan(String value) {
            addCriterion("rope <", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeLessThanOrEqualTo(String value) {
            addCriterion("rope <=", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeLike(String value) {
            addCriterion("rope like", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeNotLike(String value) {
            addCriterion("rope not like", value, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeIn(List<String> values) {
            addCriterion("rope in", values, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeNotIn(List<String> values) {
            addCriterion("rope not in", values, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeBetween(String value1, String value2) {
            addCriterion("rope between", value1, value2, "rope");
            return (Criteria) this;
        }

        public Criteria andRopeNotBetween(String value1, String value2) {
            addCriterion("rope not between", value1, value2, "rope");
            return (Criteria) this;
        }

        public Criteria andKnotIsNull() {
            addCriterion("knot is null");
            return (Criteria) this;
        }

        public Criteria andKnotIsNotNull() {
            addCriterion("knot is not null");
            return (Criteria) this;
        }

        public Criteria andKnotEqualTo(String value) {
            addCriterion("knot =", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotNotEqualTo(String value) {
            addCriterion("knot <>", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotGreaterThan(String value) {
            addCriterion("knot >", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotGreaterThanOrEqualTo(String value) {
            addCriterion("knot >=", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotLessThan(String value) {
            addCriterion("knot <", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotLessThanOrEqualTo(String value) {
            addCriterion("knot <=", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotLike(String value) {
            addCriterion("knot like", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotNotLike(String value) {
            addCriterion("knot not like", value, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotIn(List<String> values) {
            addCriterion("knot in", values, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotNotIn(List<String> values) {
            addCriterion("knot not in", values, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotBetween(String value1, String value2) {
            addCriterion("knot between", value1, value2, "knot");
            return (Criteria) this;
        }

        public Criteria andKnotNotBetween(String value1, String value2) {
            addCriterion("knot not between", value1, value2, "knot");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceIsNull() {
            addCriterion("girder_distance is null");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceIsNotNull() {
            addCriterion("girder_distance is not null");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceEqualTo(Double value) {
            addCriterion("girder_distance =", value, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceNotEqualTo(Double value) {
            addCriterion("girder_distance <>", value, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceGreaterThan(Double value) {
            addCriterion("girder_distance >", value, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("girder_distance >=", value, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceLessThan(Double value) {
            addCriterion("girder_distance <", value, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceLessThanOrEqualTo(Double value) {
            addCriterion("girder_distance <=", value, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceIn(List<Double> values) {
            addCriterion("girder_distance in", values, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceNotIn(List<Double> values) {
            addCriterion("girder_distance not in", values, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceBetween(Double value1, Double value2) {
            addCriterion("girder_distance between", value1, value2, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andGirderDistanceNotBetween(Double value1, Double value2) {
            addCriterion("girder_distance not between", value1, value2, "girderDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceIsNull() {
            addCriterion("knot_distance is null");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceIsNotNull() {
            addCriterion("knot_distance is not null");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceEqualTo(Double value) {
            addCriterion("knot_distance =", value, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceNotEqualTo(Double value) {
            addCriterion("knot_distance <>", value, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceGreaterThan(Double value) {
            addCriterion("knot_distance >", value, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("knot_distance >=", value, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceLessThan(Double value) {
            addCriterion("knot_distance <", value, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceLessThanOrEqualTo(Double value) {
            addCriterion("knot_distance <=", value, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceIn(List<Double> values) {
            addCriterion("knot_distance in", values, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceNotIn(List<Double> values) {
            addCriterion("knot_distance not in", values, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceBetween(Double value1, Double value2) {
            addCriterion("knot_distance between", value1, value2, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andKnotDistanceNotBetween(Double value1, Double value2) {
            addCriterion("knot_distance not between", value1, value2, "knotDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceIsNull() {
            addCriterion("board_distance is null");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceIsNotNull() {
            addCriterion("board_distance is not null");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceEqualTo(Double value) {
            addCriterion("board_distance =", value, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceNotEqualTo(Double value) {
            addCriterion("board_distance <>", value, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceGreaterThan(Double value) {
            addCriterion("board_distance >", value, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("board_distance >=", value, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceLessThan(Double value) {
            addCriterion("board_distance <", value, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceLessThanOrEqualTo(Double value) {
            addCriterion("board_distance <=", value, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceIn(List<Double> values) {
            addCriterion("board_distance in", values, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceNotIn(List<Double> values) {
            addCriterion("board_distance not in", values, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceBetween(Double value1, Double value2) {
            addCriterion("board_distance between", value1, value2, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andBoardDistanceNotBetween(Double value1, Double value2) {
            addCriterion("board_distance not between", value1, value2, "boardDistance");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightIsNull() {
            addCriterion("cont_skin_weight is null");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightIsNotNull() {
            addCriterion("cont_skin_weight is not null");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightEqualTo(Double value) {
            addCriterion("cont_skin_weight =", value, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightNotEqualTo(Double value) {
            addCriterion("cont_skin_weight <>", value, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightGreaterThan(Double value) {
            addCriterion("cont_skin_weight >", value, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("cont_skin_weight >=", value, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightLessThan(Double value) {
            addCriterion("cont_skin_weight <", value, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightLessThanOrEqualTo(Double value) {
            addCriterion("cont_skin_weight <=", value, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightIn(List<Double> values) {
            addCriterion("cont_skin_weight in", values, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightNotIn(List<Double> values) {
            addCriterion("cont_skin_weight not in", values, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightBetween(Double value1, Double value2) {
            addCriterion("cont_skin_weight between", value1, value2, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andContSkinWeightNotBetween(Double value1, Double value2) {
            addCriterion("cont_skin_weight not between", value1, value2, "contSkinWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightIsNull() {
            addCriterion("material_weight is null");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightIsNotNull() {
            addCriterion("material_weight is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightEqualTo(Double value) {
            addCriterion("material_weight =", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightNotEqualTo(Double value) {
            addCriterion("material_weight <>", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightGreaterThan(Double value) {
            addCriterion("material_weight >", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("material_weight >=", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightLessThan(Double value) {
            addCriterion("material_weight <", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightLessThanOrEqualTo(Double value) {
            addCriterion("material_weight <=", value, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightIn(List<Double> values) {
            addCriterion("material_weight in", values, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightNotIn(List<Double> values) {
            addCriterion("material_weight not in", values, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightBetween(Double value1, Double value2) {
            addCriterion("material_weight between", value1, value2, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andMaterialWeightNotBetween(Double value1, Double value2) {
            addCriterion("material_weight not between", value1, value2, "materialWeight");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNull() {
            addCriterion("container_user is null");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNotNull() {
            addCriterion("container_user is not null");
            return (Criteria) this;
        }

        public Criteria andContainerUserEqualTo(String value) {
            addCriterion("container_user =", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotEqualTo(String value) {
            addCriterion("container_user <>", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThan(String value) {
            addCriterion("container_user >", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThanOrEqualTo(String value) {
            addCriterion("container_user >=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThan(String value) {
            addCriterion("container_user <", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThanOrEqualTo(String value) {
            addCriterion("container_user <=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLike(String value) {
            addCriterion("container_user like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotLike(String value) {
            addCriterion("container_user not like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserIn(List<String> values) {
            addCriterion("container_user in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotIn(List<String> values) {
            addCriterion("container_user not in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserBetween(String value1, String value2) {
            addCriterion("container_user between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotBetween(String value1, String value2) {
            addCriterion("container_user not between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andRestsRequireIsNull() {
            addCriterion("rests_require is null");
            return (Criteria) this;
        }

        public Criteria andRestsRequireIsNotNull() {
            addCriterion("rests_require is not null");
            return (Criteria) this;
        }

        public Criteria andRestsRequireEqualTo(String value) {
            addCriterion("rests_require =", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireNotEqualTo(String value) {
            addCriterion("rests_require <>", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireGreaterThan(String value) {
            addCriterion("rests_require >", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireGreaterThanOrEqualTo(String value) {
            addCriterion("rests_require >=", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireLessThan(String value) {
            addCriterion("rests_require <", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireLessThanOrEqualTo(String value) {
            addCriterion("rests_require <=", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireLike(String value) {
            addCriterion("rests_require like", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireNotLike(String value) {
            addCriterion("rests_require not like", value, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireIn(List<String> values) {
            addCriterion("rests_require in", values, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireNotIn(List<String> values) {
            addCriterion("rests_require not in", values, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireBetween(String value1, String value2) {
            addCriterion("rests_require between", value1, value2, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andRestsRequireNotBetween(String value1, String value2) {
            addCriterion("rests_require not between", value1, value2, "restsRequire");
            return (Criteria) this;
        }

        public Criteria andZyMoneyIsNull() {
            addCriterion("zy_money is null");
            return (Criteria) this;
        }

        public Criteria andZyMoneyIsNotNull() {
            addCriterion("zy_money is not null");
            return (Criteria) this;
        }

        public Criteria andZyMoneyEqualTo(BigDecimal value) {
            addCriterion("zy_money =", value, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("zy_money <>", value, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyGreaterThan(BigDecimal value) {
            addCriterion("zy_money >", value, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zy_money >=", value, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyLessThan(BigDecimal value) {
            addCriterion("zy_money <", value, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zy_money <=", value, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyIn(List<BigDecimal> values) {
            addCriterion("zy_money in", values, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("zy_money not in", values, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zy_money between", value1, value2, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andZyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zy_money not between", value1, value2, "zyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyIsNull() {
            addCriterion("company_money is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyIsNotNull() {
            addCriterion("company_money is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyEqualTo(BigDecimal value) {
            addCriterion("company_money =", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("company_money <>", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyGreaterThan(BigDecimal value) {
            addCriterion("company_money >", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("company_money >=", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyLessThan(BigDecimal value) {
            addCriterion("company_money <", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("company_money <=", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyIn(List<BigDecimal> values) {
            addCriterion("company_money in", values, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("company_money not in", values, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_money between", value1, value2, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_money not between", value1, value2, "companyMoney");
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