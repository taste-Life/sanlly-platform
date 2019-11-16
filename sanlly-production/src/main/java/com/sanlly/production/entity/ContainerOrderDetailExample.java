package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContainerOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ContainerOrderDetailExample() {
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

        public Criteria andProdContainerOrderDetailIdIsNull() {
            addCriterion("prod_container_order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdIsNotNull() {
            addCriterion("prod_container_order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdEqualTo(Integer value) {
            addCriterion("prod_container_order_detail_id =", value, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdNotEqualTo(Integer value) {
            addCriterion("prod_container_order_detail_id <>", value, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdGreaterThan(Integer value) {
            addCriterion("prod_container_order_detail_id >", value, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_container_order_detail_id >=", value, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdLessThan(Integer value) {
            addCriterion("prod_container_order_detail_id <", value, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_container_order_detail_id <=", value, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdIn(List<Integer> values) {
            addCriterion("prod_container_order_detail_id in", values, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdNotIn(List<Integer> values) {
            addCriterion("prod_container_order_detail_id not in", values, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_order_detail_id between", value1, value2, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andProdContainerOrderDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_order_detail_id not between", value1, value2, "prodContainerOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("`no` is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("`no` is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("`no` =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("`no` <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("`no` >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("`no` >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("`no` <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("`no` <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("`no` like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("`no` not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("`no` in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("`no` not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("`no` between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("`no` not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("unit_type like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("unit_type not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIsNull() {
            addCriterion("container_category is null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIsNotNull() {
            addCriterion("container_category is not null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryEqualTo(String value) {
            addCriterion("container_category =", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotEqualTo(String value) {
            addCriterion("container_category <>", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThan(String value) {
            addCriterion("container_category >", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("container_category >=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThan(String value) {
            addCriterion("container_category <", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThanOrEqualTo(String value) {
            addCriterion("container_category <=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLike(String value) {
            addCriterion("container_category like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotLike(String value) {
            addCriterion("container_category not like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIn(List<String> values) {
            addCriterion("container_category in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotIn(List<String> values) {
            addCriterion("container_category not in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryBetween(String value1, String value2) {
            addCriterion("container_category between", value1, value2, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotBetween(String value1, String value2) {
            addCriterion("container_category not between", value1, value2, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIsNull() {
            addCriterion("hardware_version is null");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIsNotNull() {
            addCriterion("hardware_version is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionEqualTo(String value) {
            addCriterion("hardware_version =", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotEqualTo(String value) {
            addCriterion("hardware_version <>", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionGreaterThan(String value) {
            addCriterion("hardware_version >", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("hardware_version >=", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLessThan(String value) {
            addCriterion("hardware_version <", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLessThanOrEqualTo(String value) {
            addCriterion("hardware_version <=", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLike(String value) {
            addCriterion("hardware_version like", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotLike(String value) {
            addCriterion("hardware_version not like", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIn(List<String> values) {
            addCriterion("hardware_version in", values, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotIn(List<String> values) {
            addCriterion("hardware_version not in", values, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionBetween(String value1, String value2) {
            addCriterion("hardware_version between", value1, value2, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotBetween(String value1, String value2) {
            addCriterion("hardware_version not between", value1, value2, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionIsNull() {
            addCriterion("controller_version is null");
            return (Criteria) this;
        }

        public Criteria andControllerVersionIsNotNull() {
            addCriterion("controller_version is not null");
            return (Criteria) this;
        }

        public Criteria andControllerVersionEqualTo(String value) {
            addCriterion("controller_version =", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionNotEqualTo(String value) {
            addCriterion("controller_version <>", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionGreaterThan(String value) {
            addCriterion("controller_version >", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionGreaterThanOrEqualTo(String value) {
            addCriterion("controller_version >=", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionLessThan(String value) {
            addCriterion("controller_version <", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionLessThanOrEqualTo(String value) {
            addCriterion("controller_version <=", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionLike(String value) {
            addCriterion("controller_version like", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionNotLike(String value) {
            addCriterion("controller_version not like", value, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionIn(List<String> values) {
            addCriterion("controller_version in", values, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionNotIn(List<String> values) {
            addCriterion("controller_version not in", values, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionBetween(String value1, String value2) {
            addCriterion("controller_version between", value1, value2, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andControllerVersionNotBetween(String value1, String value2) {
            addCriterion("controller_version not between", value1, value2, "controllerVersion");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNull() {
            addCriterion("unit_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNotNull() {
            addCriterion("unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeEqualTo(String value) {
            addCriterion("unit_code =", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotEqualTo(String value) {
            addCriterion("unit_code <>", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThan(String value) {
            addCriterion("unit_code >", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_code >=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThan(String value) {
            addCriterion("unit_code <", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_code <=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLike(String value) {
            addCriterion("unit_code like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotLike(String value) {
            addCriterion("unit_code not like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIn(List<String> values) {
            addCriterion("unit_code in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotIn(List<String> values) {
            addCriterion("unit_code not in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeBetween(String value1, String value2) {
            addCriterion("unit_code between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotBetween(String value1, String value2) {
            addCriterion("unit_code not between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUniIdIsNull() {
            addCriterion("uni_id is null");
            return (Criteria) this;
        }

        public Criteria andUniIdIsNotNull() {
            addCriterion("uni_id is not null");
            return (Criteria) this;
        }

        public Criteria andUniIdEqualTo(String value) {
            addCriterion("uni_id =", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdNotEqualTo(String value) {
            addCriterion("uni_id <>", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdGreaterThan(String value) {
            addCriterion("uni_id >", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdGreaterThanOrEqualTo(String value) {
            addCriterion("uni_id >=", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdLessThan(String value) {
            addCriterion("uni_id <", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdLessThanOrEqualTo(String value) {
            addCriterion("uni_id <=", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdLike(String value) {
            addCriterion("uni_id like", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdNotLike(String value) {
            addCriterion("uni_id not like", value, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdIn(List<String> values) {
            addCriterion("uni_id in", values, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdNotIn(List<String> values) {
            addCriterion("uni_id not in", values, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdBetween(String value1, String value2) {
            addCriterion("uni_id between", value1, value2, "uniId");
            return (Criteria) this;
        }

        public Criteria andUniIdNotBetween(String value1, String value2) {
            addCriterion("uni_id not between", value1, value2, "uniId");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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

        public Criteria andCommDateIsNull() {
            addCriterion("comm_date is null");
            return (Criteria) this;
        }

        public Criteria andCommDateIsNotNull() {
            addCriterion("comm_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommDateEqualTo(String value) {
            addCriterion("comm_date =", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotEqualTo(String value) {
            addCriterion("comm_date <>", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateGreaterThan(String value) {
            addCriterion("comm_date >", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateGreaterThanOrEqualTo(String value) {
            addCriterion("comm_date >=", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateLessThan(String value) {
            addCriterion("comm_date <", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateLessThanOrEqualTo(String value) {
            addCriterion("comm_date <=", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateLike(String value) {
            addCriterion("comm_date like", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotLike(String value) {
            addCriterion("comm_date not like", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateIn(List<String> values) {
            addCriterion("comm_date in", values, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotIn(List<String> values) {
            addCriterion("comm_date not in", values, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateBetween(String value1, String value2) {
            addCriterion("comm_date between", value1, value2, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotBetween(String value1, String value2) {
            addCriterion("comm_date not between", value1, value2, "commDate");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeIsNull() {
            addCriterion("substrate_code is null");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeIsNotNull() {
            addCriterion("substrate_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeEqualTo(String value) {
            addCriterion("substrate_code =", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotEqualTo(String value) {
            addCriterion("substrate_code <>", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeGreaterThan(String value) {
            addCriterion("substrate_code >", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("substrate_code >=", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeLessThan(String value) {
            addCriterion("substrate_code <", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeLessThanOrEqualTo(String value) {
            addCriterion("substrate_code <=", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeLike(String value) {
            addCriterion("substrate_code like", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotLike(String value) {
            addCriterion("substrate_code not like", value, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeIn(List<String> values) {
            addCriterion("substrate_code in", values, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotIn(List<String> values) {
            addCriterion("substrate_code not in", values, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeBetween(String value1, String value2) {
            addCriterion("substrate_code between", value1, value2, "substrateCode");
            return (Criteria) this;
        }

        public Criteria andSubstrateCodeNotBetween(String value1, String value2) {
            addCriterion("substrate_code not between", value1, value2, "substrateCode");
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

        public Criteria andThermographNoIsNull() {
            addCriterion("thermograph_no is null");
            return (Criteria) this;
        }

        public Criteria andThermographNoIsNotNull() {
            addCriterion("thermograph_no is not null");
            return (Criteria) this;
        }

        public Criteria andThermographNoEqualTo(String value) {
            addCriterion("thermograph_no =", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoNotEqualTo(String value) {
            addCriterion("thermograph_no <>", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoGreaterThan(String value) {
            addCriterion("thermograph_no >", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoGreaterThanOrEqualTo(String value) {
            addCriterion("thermograph_no >=", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoLessThan(String value) {
            addCriterion("thermograph_no <", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoLessThanOrEqualTo(String value) {
            addCriterion("thermograph_no <=", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoLike(String value) {
            addCriterion("thermograph_no like", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoNotLike(String value) {
            addCriterion("thermograph_no not like", value, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoIn(List<String> values) {
            addCriterion("thermograph_no in", values, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoNotIn(List<String> values) {
            addCriterion("thermograph_no not in", values, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoBetween(String value1, String value2) {
            addCriterion("thermograph_no between", value1, value2, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andThermographNoNotBetween(String value1, String value2) {
            addCriterion("thermograph_no not between", value1, value2, "thermographNo");
            return (Criteria) this;
        }

        public Criteria andModemNoIsNull() {
            addCriterion("modem_no is null");
            return (Criteria) this;
        }

        public Criteria andModemNoIsNotNull() {
            addCriterion("modem_no is not null");
            return (Criteria) this;
        }

        public Criteria andModemNoEqualTo(String value) {
            addCriterion("modem_no =", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoNotEqualTo(String value) {
            addCriterion("modem_no <>", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoGreaterThan(String value) {
            addCriterion("modem_no >", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoGreaterThanOrEqualTo(String value) {
            addCriterion("modem_no >=", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoLessThan(String value) {
            addCriterion("modem_no <", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoLessThanOrEqualTo(String value) {
            addCriterion("modem_no <=", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoLike(String value) {
            addCriterion("modem_no like", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoNotLike(String value) {
            addCriterion("modem_no not like", value, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoIn(List<String> values) {
            addCriterion("modem_no in", values, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoNotIn(List<String> values) {
            addCriterion("modem_no not in", values, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoBetween(String value1, String value2) {
            addCriterion("modem_no between", value1, value2, "modemNo");
            return (Criteria) this;
        }

        public Criteria andModemNoNotBetween(String value1, String value2) {
            addCriterion("modem_no not between", value1, value2, "modemNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoIsNull() {
            addCriterion("gps_no is null");
            return (Criteria) this;
        }

        public Criteria andGpsNoIsNotNull() {
            addCriterion("gps_no is not null");
            return (Criteria) this;
        }

        public Criteria andGpsNoEqualTo(String value) {
            addCriterion("gps_no =", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoNotEqualTo(String value) {
            addCriterion("gps_no <>", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoGreaterThan(String value) {
            addCriterion("gps_no >", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoGreaterThanOrEqualTo(String value) {
            addCriterion("gps_no >=", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoLessThan(String value) {
            addCriterion("gps_no <", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoLessThanOrEqualTo(String value) {
            addCriterion("gps_no <=", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoLike(String value) {
            addCriterion("gps_no like", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoNotLike(String value) {
            addCriterion("gps_no not like", value, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoIn(List<String> values) {
            addCriterion("gps_no in", values, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoNotIn(List<String> values) {
            addCriterion("gps_no not in", values, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoBetween(String value1, String value2) {
            addCriterion("gps_no between", value1, value2, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andGpsNoNotBetween(String value1, String value2) {
            addCriterion("gps_no not between", value1, value2, "gpsNo");
            return (Criteria) this;
        }

        public Criteria andCaNoIsNull() {
            addCriterion("ca_no is null");
            return (Criteria) this;
        }

        public Criteria andCaNoIsNotNull() {
            addCriterion("ca_no is not null");
            return (Criteria) this;
        }

        public Criteria andCaNoEqualTo(String value) {
            addCriterion("ca_no =", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoNotEqualTo(String value) {
            addCriterion("ca_no <>", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoGreaterThan(String value) {
            addCriterion("ca_no >", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoGreaterThanOrEqualTo(String value) {
            addCriterion("ca_no >=", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoLessThan(String value) {
            addCriterion("ca_no <", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoLessThanOrEqualTo(String value) {
            addCriterion("ca_no <=", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoLike(String value) {
            addCriterion("ca_no like", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoNotLike(String value) {
            addCriterion("ca_no not like", value, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoIn(List<String> values) {
            addCriterion("ca_no in", values, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoNotIn(List<String> values) {
            addCriterion("ca_no not in", values, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoBetween(String value1, String value2) {
            addCriterion("ca_no between", value1, value2, "caNo");
            return (Criteria) this;
        }

        public Criteria andCaNoNotBetween(String value1, String value2) {
            addCriterion("ca_no not between", value1, value2, "caNo");
            return (Criteria) this;
        }

        public Criteria andColdDateIsNull() {
            addCriterion("cold_date is null");
            return (Criteria) this;
        }

        public Criteria andColdDateIsNotNull() {
            addCriterion("cold_date is not null");
            return (Criteria) this;
        }

        public Criteria andColdDateEqualTo(String value) {
            addCriterion("cold_date =", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateNotEqualTo(String value) {
            addCriterion("cold_date <>", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateGreaterThan(String value) {
            addCriterion("cold_date >", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateGreaterThanOrEqualTo(String value) {
            addCriterion("cold_date >=", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateLessThan(String value) {
            addCriterion("cold_date <", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateLessThanOrEqualTo(String value) {
            addCriterion("cold_date <=", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateLike(String value) {
            addCriterion("cold_date like", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateNotLike(String value) {
            addCriterion("cold_date not like", value, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateIn(List<String> values) {
            addCriterion("cold_date in", values, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateNotIn(List<String> values) {
            addCriterion("cold_date not in", values, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateBetween(String value1, String value2) {
            addCriterion("cold_date between", value1, value2, "coldDate");
            return (Criteria) this;
        }

        public Criteria andColdDateNotBetween(String value1, String value2) {
            addCriterion("cold_date not between", value1, value2, "coldDate");
            return (Criteria) this;
        }

        public Criteria andControllerNoIsNull() {
            addCriterion("controller_no is null");
            return (Criteria) this;
        }

        public Criteria andControllerNoIsNotNull() {
            addCriterion("controller_no is not null");
            return (Criteria) this;
        }

        public Criteria andControllerNoEqualTo(String value) {
            addCriterion("controller_no =", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoNotEqualTo(String value) {
            addCriterion("controller_no <>", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoGreaterThan(String value) {
            addCriterion("controller_no >", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoGreaterThanOrEqualTo(String value) {
            addCriterion("controller_no >=", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoLessThan(String value) {
            addCriterion("controller_no <", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoLessThanOrEqualTo(String value) {
            addCriterion("controller_no <=", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoLike(String value) {
            addCriterion("controller_no like", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoNotLike(String value) {
            addCriterion("controller_no not like", value, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoIn(List<String> values) {
            addCriterion("controller_no in", values, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoNotIn(List<String> values) {
            addCriterion("controller_no not in", values, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoBetween(String value1, String value2) {
            addCriterion("controller_no between", value1, value2, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andControllerNoNotBetween(String value1, String value2) {
            addCriterion("controller_no not between", value1, value2, "controllerNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoIsNull() {
            addCriterion("base_no is null");
            return (Criteria) this;
        }

        public Criteria andBaseNoIsNotNull() {
            addCriterion("base_no is not null");
            return (Criteria) this;
        }

        public Criteria andBaseNoEqualTo(String value) {
            addCriterion("base_no =", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoNotEqualTo(String value) {
            addCriterion("base_no <>", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoGreaterThan(String value) {
            addCriterion("base_no >", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("base_no >=", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoLessThan(String value) {
            addCriterion("base_no <", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoLessThanOrEqualTo(String value) {
            addCriterion("base_no <=", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoLike(String value) {
            addCriterion("base_no like", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoNotLike(String value) {
            addCriterion("base_no not like", value, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoIn(List<String> values) {
            addCriterion("base_no in", values, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoNotIn(List<String> values) {
            addCriterion("base_no not in", values, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoBetween(String value1, String value2) {
            addCriterion("base_no between", value1, value2, "baseNo");
            return (Criteria) this;
        }

        public Criteria andBaseNoNotBetween(String value1, String value2) {
            addCriterion("base_no not between", value1, value2, "baseNo");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
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