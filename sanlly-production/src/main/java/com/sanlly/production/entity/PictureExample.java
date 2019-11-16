package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PictureExample() {
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

        public Criteria andProdPictureIdIsNull() {
            addCriterion("prod_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdIsNotNull() {
            addCriterion("prod_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdEqualTo(Integer value) {
            addCriterion("prod_picture_id =", value, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdNotEqualTo(Integer value) {
            addCriterion("prod_picture_id <>", value, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdGreaterThan(Integer value) {
            addCriterion("prod_picture_id >", value, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_picture_id >=", value, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdLessThan(Integer value) {
            addCriterion("prod_picture_id <", value, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_picture_id <=", value, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdIn(List<Integer> values) {
            addCriterion("prod_picture_id in", values, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdNotIn(List<Integer> values) {
            addCriterion("prod_picture_id not in", values, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_picture_id between", value1, value2, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andProdPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_picture_id not between", value1, value2, "prodPictureId");
            return (Criteria) this;
        }

        public Criteria andMountIdIsNull() {
            addCriterion("mount_id is null");
            return (Criteria) this;
        }

        public Criteria andMountIdIsNotNull() {
            addCriterion("mount_id is not null");
            return (Criteria) this;
        }

        public Criteria andMountIdEqualTo(Integer value) {
            addCriterion("mount_id =", value, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdNotEqualTo(Integer value) {
            addCriterion("mount_id <>", value, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdGreaterThan(Integer value) {
            addCriterion("mount_id >", value, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mount_id >=", value, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdLessThan(Integer value) {
            addCriterion("mount_id <", value, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdLessThanOrEqualTo(Integer value) {
            addCriterion("mount_id <=", value, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdIn(List<Integer> values) {
            addCriterion("mount_id in", values, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdNotIn(List<Integer> values) {
            addCriterion("mount_id not in", values, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdBetween(Integer value1, Integer value2) {
            addCriterion("mount_id between", value1, value2, "mountId");
            return (Criteria) this;
        }

        public Criteria andMountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mount_id not between", value1, value2, "mountId");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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