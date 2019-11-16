package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RepairStoreExample() {
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

        public Criteria andWareRepairStoreIdIsNull() {
            addCriterion("ware_repair_store_id is null");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdIsNotNull() {
            addCriterion("ware_repair_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdEqualTo(Integer value) {
            addCriterion("ware_repair_store_id =", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdNotEqualTo(Integer value) {
            addCriterion("ware_repair_store_id <>", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdGreaterThan(Integer value) {
            addCriterion("ware_repair_store_id >", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_repair_store_id >=", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdLessThan(Integer value) {
            addCriterion("ware_repair_store_id <", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_repair_store_id <=", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdIn(List<Integer> values) {
            addCriterion("ware_repair_store_id in", values, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdNotIn(List<Integer> values) {
            addCriterion("ware_repair_store_id not in", values, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_repair_store_id between", value1, value2, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_repair_store_id not between", value1, value2, "wareRepairStoreId");
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

        public Criteria andRepairNoIsNull() {
            addCriterion("repair_no is null");
            return (Criteria) this;
        }

        public Criteria andRepairNoIsNotNull() {
            addCriterion("repair_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNoEqualTo(String value) {
            addCriterion("repair_no =", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotEqualTo(String value) {
            addCriterion("repair_no <>", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoGreaterThan(String value) {
            addCriterion("repair_no >", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoGreaterThanOrEqualTo(String value) {
            addCriterion("repair_no >=", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLessThan(String value) {
            addCriterion("repair_no <", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLessThanOrEqualTo(String value) {
            addCriterion("repair_no <=", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLike(String value) {
            addCriterion("repair_no like", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotLike(String value) {
            addCriterion("repair_no not like", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoIn(List<String> values) {
            addCriterion("repair_no in", values, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotIn(List<String> values) {
            addCriterion("repair_no not in", values, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoBetween(String value1, String value2) {
            addCriterion("repair_no between", value1, value2, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotBetween(String value1, String value2) {
            addCriterion("repair_no not between", value1, value2, "repairNo");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andRepairTypeIsNull() {
            addCriterion("repair_type is null");
            return (Criteria) this;
        }

        public Criteria andRepairTypeIsNotNull() {
            addCriterion("repair_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTypeEqualTo(String value) {
            addCriterion("repair_type =", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotEqualTo(String value) {
            addCriterion("repair_type <>", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeGreaterThan(String value) {
            addCriterion("repair_type >", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_type >=", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeLessThan(String value) {
            addCriterion("repair_type <", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeLessThanOrEqualTo(String value) {
            addCriterion("repair_type <=", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeLike(String value) {
            addCriterion("repair_type like", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotLike(String value) {
            addCriterion("repair_type not like", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeIn(List<String> values) {
            addCriterion("repair_type in", values, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotIn(List<String> values) {
            addCriterion("repair_type not in", values, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeBetween(String value1, String value2) {
            addCriterion("repair_type between", value1, value2, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotBetween(String value1, String value2) {
            addCriterion("repair_type not between", value1, value2, "repairType");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesIsNull() {
            addCriterion("spare_parts_categories is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesIsNotNull() {
            addCriterion("spare_parts_categories is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesEqualTo(String value) {
            addCriterion("spare_parts_categories =", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotEqualTo(String value) {
            addCriterion("spare_parts_categories <>", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesGreaterThan(String value) {
            addCriterion("spare_parts_categories >", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories >=", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesLessThan(String value) {
            addCriterion("spare_parts_categories <", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories <=", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesLike(String value) {
            addCriterion("spare_parts_categories like", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotLike(String value) {
            addCriterion("spare_parts_categories not like", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesIn(List<String> values) {
            addCriterion("spare_parts_categories in", values, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotIn(List<String> values) {
            addCriterion("spare_parts_categories not in", values, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesBetween(String value1, String value2) {
            addCriterion("spare_parts_categories between", value1, value2, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotBetween(String value1, String value2) {
            addCriterion("spare_parts_categories not between", value1, value2, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIsNull() {
            addCriterion("unit_company is null");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIsNotNull() {
            addCriterion("unit_company is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyEqualTo(String value) {
            addCriterion("unit_company =", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotEqualTo(String value) {
            addCriterion("unit_company <>", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyGreaterThan(String value) {
            addCriterion("unit_company >", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("unit_company >=", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyLessThan(String value) {
            addCriterion("unit_company <", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyLessThanOrEqualTo(String value) {
            addCriterion("unit_company <=", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyLike(String value) {
            addCriterion("unit_company like", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotLike(String value) {
            addCriterion("unit_company not like", value, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyIn(List<String> values) {
            addCriterion("unit_company in", values, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotIn(List<String> values) {
            addCriterion("unit_company not in", values, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyBetween(String value1, String value2) {
            addCriterion("unit_company between", value1, value2, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andUnitCompanyNotBetween(String value1, String value2) {
            addCriterion("unit_company not between", value1, value2, "unitCompany");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentIsNull() {
            addCriterion("repair_department is null");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentIsNotNull() {
            addCriterion("repair_department is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentEqualTo(String value) {
            addCriterion("repair_department =", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotEqualTo(String value) {
            addCriterion("repair_department <>", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentGreaterThan(String value) {
            addCriterion("repair_department >", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("repair_department >=", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentLessThan(String value) {
            addCriterion("repair_department <", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentLessThanOrEqualTo(String value) {
            addCriterion("repair_department <=", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentLike(String value) {
            addCriterion("repair_department like", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotLike(String value) {
            addCriterion("repair_department not like", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentIn(List<String> values) {
            addCriterion("repair_department in", values, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotIn(List<String> values) {
            addCriterion("repair_department not in", values, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentBetween(String value1, String value2) {
            addCriterion("repair_department between", value1, value2, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotBetween(String value1, String value2) {
            addCriterion("repair_department not between", value1, value2, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIsNull() {
            addCriterion("repair_status is null");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIsNotNull() {
            addCriterion("repair_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStatusEqualTo(String value) {
            addCriterion("repair_status =", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotEqualTo(String value) {
            addCriterion("repair_status <>", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusGreaterThan(String value) {
            addCriterion("repair_status >", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repair_status >=", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLessThan(String value) {
            addCriterion("repair_status <", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLessThanOrEqualTo(String value) {
            addCriterion("repair_status <=", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusLike(String value) {
            addCriterion("repair_status like", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotLike(String value) {
            addCriterion("repair_status not like", value, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusIn(List<String> values) {
            addCriterion("repair_status in", values, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotIn(List<String> values) {
            addCriterion("repair_status not in", values, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusBetween(String value1, String value2) {
            addCriterion("repair_status between", value1, value2, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andRepairStatusNotBetween(String value1, String value2) {
            addCriterion("repair_status not between", value1, value2, "repairStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusIsNull() {
            addCriterion("stock_status is null");
            return (Criteria) this;
        }

        public Criteria andStockStatusIsNotNull() {
            addCriterion("stock_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockStatusEqualTo(String value) {
            addCriterion("stock_status =", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotEqualTo(String value) {
            addCriterion("stock_status <>", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusGreaterThan(String value) {
            addCriterion("stock_status >", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stock_status >=", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLessThan(String value) {
            addCriterion("stock_status <", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLessThanOrEqualTo(String value) {
            addCriterion("stock_status <=", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLike(String value) {
            addCriterion("stock_status like", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotLike(String value) {
            addCriterion("stock_status not like", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusIn(List<String> values) {
            addCriterion("stock_status in", values, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotIn(List<String> values) {
            addCriterion("stock_status not in", values, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusBetween(String value1, String value2) {
            addCriterion("stock_status between", value1, value2, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotBetween(String value1, String value2) {
            addCriterion("stock_status not between", value1, value2, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelIsNull() {
            addCriterion("urgent_level is null");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelIsNotNull() {
            addCriterion("urgent_level is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelEqualTo(String value) {
            addCriterion("urgent_level =", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelNotEqualTo(String value) {
            addCriterion("urgent_level <>", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelGreaterThan(String value) {
            addCriterion("urgent_level >", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_level >=", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelLessThan(String value) {
            addCriterion("urgent_level <", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelLessThanOrEqualTo(String value) {
            addCriterion("urgent_level <=", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelLike(String value) {
            addCriterion("urgent_level like", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelNotLike(String value) {
            addCriterion("urgent_level not like", value, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelIn(List<String> values) {
            addCriterion("urgent_level in", values, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelNotIn(List<String> values) {
            addCriterion("urgent_level not in", values, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelBetween(String value1, String value2) {
            addCriterion("urgent_level between", value1, value2, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andUrgentLevelNotBetween(String value1, String value2) {
            addCriterion("urgent_level not between", value1, value2, "urgentLevel");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andYardIsNull() {
            addCriterion("yard is null");
            return (Criteria) this;
        }

        public Criteria andYardIsNotNull() {
            addCriterion("yard is not null");
            return (Criteria) this;
        }

        public Criteria andYardEqualTo(String value) {
            addCriterion("yard =", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotEqualTo(String value) {
            addCriterion("yard <>", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThan(String value) {
            addCriterion("yard >", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThanOrEqualTo(String value) {
            addCriterion("yard >=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThan(String value) {
            addCriterion("yard <", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThanOrEqualTo(String value) {
            addCriterion("yard <=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLike(String value) {
            addCriterion("yard like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotLike(String value) {
            addCriterion("yard not like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardIn(List<String> values) {
            addCriterion("yard in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotIn(List<String> values) {
            addCriterion("yard not in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardBetween(String value1, String value2) {
            addCriterion("yard between", value1, value2, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotBetween(String value1, String value2) {
            addCriterion("yard not between", value1, value2, "yard");
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

        public Criteria andSparePartsBatchIsNull() {
            addCriterion("spare_parts_batch is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIsNotNull() {
            addCriterion("spare_parts_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchEqualTo(String value) {
            addCriterion("spare_parts_batch =", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotEqualTo(String value) {
            addCriterion("spare_parts_batch <>", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThan(String value) {
            addCriterion("spare_parts_batch >", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch >=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThan(String value) {
            addCriterion("spare_parts_batch <", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch <=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLike(String value) {
            addCriterion("spare_parts_batch like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotLike(String value) {
            addCriterion("spare_parts_batch not like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIn(List<String> values) {
            addCriterion("spare_parts_batch in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotIn(List<String> values) {
            addCriterion("spare_parts_batch not in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchBetween(String value1, String value2) {
            addCriterion("spare_parts_batch between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotBetween(String value1, String value2) {
            addCriterion("spare_parts_batch not between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andStockinNumIsNull() {
            addCriterion("stockin_num is null");
            return (Criteria) this;
        }

        public Criteria andStockinNumIsNotNull() {
            addCriterion("stockin_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockinNumEqualTo(Double value) {
            addCriterion("stockin_num =", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotEqualTo(Double value) {
            addCriterion("stockin_num <>", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumGreaterThan(Double value) {
            addCriterion("stockin_num >", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockin_num >=", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumLessThan(Double value) {
            addCriterion("stockin_num <", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumLessThanOrEqualTo(Double value) {
            addCriterion("stockin_num <=", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumIn(List<Double> values) {
            addCriterion("stockin_num in", values, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotIn(List<Double> values) {
            addCriterion("stockin_num not in", values, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumBetween(Double value1, Double value2) {
            addCriterion("stockin_num between", value1, value2, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotBetween(Double value1, Double value2) {
            addCriterion("stockin_num not between", value1, value2, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinUserIsNull() {
            addCriterion("stockin_user is null");
            return (Criteria) this;
        }

        public Criteria andStockinUserIsNotNull() {
            addCriterion("stockin_user is not null");
            return (Criteria) this;
        }

        public Criteria andStockinUserEqualTo(Integer value) {
            addCriterion("stockin_user =", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserNotEqualTo(Integer value) {
            addCriterion("stockin_user <>", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserGreaterThan(Integer value) {
            addCriterion("stockin_user >", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockin_user >=", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserLessThan(Integer value) {
            addCriterion("stockin_user <", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserLessThanOrEqualTo(Integer value) {
            addCriterion("stockin_user <=", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserIn(List<Integer> values) {
            addCriterion("stockin_user in", values, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserNotIn(List<Integer> values) {
            addCriterion("stockin_user not in", values, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserBetween(Integer value1, Integer value2) {
            addCriterion("stockin_user between", value1, value2, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserNotBetween(Integer value1, Integer value2) {
            addCriterion("stockin_user not between", value1, value2, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNull() {
            addCriterion("stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNotNull() {
            addCriterion("stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockinDateEqualTo(Date value) {
            addCriterion("stockin_date =", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotEqualTo(Date value) {
            addCriterion("stockin_date <>", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThan(Date value) {
            addCriterion("stockin_date >", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockin_date >=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThan(Date value) {
            addCriterion("stockin_date <", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("stockin_date <=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateIn(List<Date> values) {
            addCriterion("stockin_date in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotIn(List<Date> values) {
            addCriterion("stockin_date not in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateBetween(Date value1, Date value2) {
            addCriterion("stockin_date between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("stockin_date not between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Double value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Double value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Double value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Double value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Double value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Double value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Double> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Double> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Double value1, Double value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Double value1, Double value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andRepairNumIsNull() {
            addCriterion("repair_num is null");
            return (Criteria) this;
        }

        public Criteria andRepairNumIsNotNull() {
            addCriterion("repair_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNumEqualTo(Double value) {
            addCriterion("repair_num =", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotEqualTo(Double value) {
            addCriterion("repair_num <>", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumGreaterThan(Double value) {
            addCriterion("repair_num >", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumGreaterThanOrEqualTo(Double value) {
            addCriterion("repair_num >=", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumLessThan(Double value) {
            addCriterion("repair_num <", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumLessThanOrEqualTo(Double value) {
            addCriterion("repair_num <=", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumIn(List<Double> values) {
            addCriterion("repair_num in", values, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotIn(List<Double> values) {
            addCriterion("repair_num not in", values, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumBetween(Double value1, Double value2) {
            addCriterion("repair_num between", value1, value2, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotBetween(Double value1, Double value2) {
            addCriterion("repair_num not between", value1, value2, "repairNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumIsNull() {
            addCriterion("waste_num is null");
            return (Criteria) this;
        }

        public Criteria andWasteNumIsNotNull() {
            addCriterion("waste_num is not null");
            return (Criteria) this;
        }

        public Criteria andWasteNumEqualTo(Double value) {
            addCriterion("waste_num =", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotEqualTo(Double value) {
            addCriterion("waste_num <>", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumGreaterThan(Double value) {
            addCriterion("waste_num >", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumGreaterThanOrEqualTo(Double value) {
            addCriterion("waste_num >=", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumLessThan(Double value) {
            addCriterion("waste_num <", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumLessThanOrEqualTo(Double value) {
            addCriterion("waste_num <=", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumIn(List<Double> values) {
            addCriterion("waste_num in", values, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotIn(List<Double> values) {
            addCriterion("waste_num not in", values, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumBetween(Double value1, Double value2) {
            addCriterion("waste_num between", value1, value2, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotBetween(Double value1, Double value2) {
            addCriterion("waste_num not between", value1, value2, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumIsNull() {
            addCriterion("surplus_maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumIsNotNull() {
            addCriterion("surplus_maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumEqualTo(Double value) {
            addCriterion("surplus_maintain_num =", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumNotEqualTo(Double value) {
            addCriterion("surplus_maintain_num <>", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumGreaterThan(Double value) {
            addCriterion("surplus_maintain_num >", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_maintain_num >=", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumLessThan(Double value) {
            addCriterion("surplus_maintain_num <", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumLessThanOrEqualTo(Double value) {
            addCriterion("surplus_maintain_num <=", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumIn(List<Double> values) {
            addCriterion("surplus_maintain_num in", values, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumNotIn(List<Double> values) {
            addCriterion("surplus_maintain_num not in", values, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumBetween(Double value1, Double value2) {
            addCriterion("surplus_maintain_num between", value1, value2, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumNotBetween(Double value1, Double value2) {
            addCriterion("surplus_maintain_num not between", value1, value2, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumIsNull() {
            addCriterion("surplus_waste_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumIsNotNull() {
            addCriterion("surplus_waste_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumEqualTo(Double value) {
            addCriterion("surplus_waste_num =", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumNotEqualTo(Double value) {
            addCriterion("surplus_waste_num <>", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumGreaterThan(Double value) {
            addCriterion("surplus_waste_num >", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_waste_num >=", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumLessThan(Double value) {
            addCriterion("surplus_waste_num <", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumLessThanOrEqualTo(Double value) {
            addCriterion("surplus_waste_num <=", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumIn(List<Double> values) {
            addCriterion("surplus_waste_num in", values, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumNotIn(List<Double> values) {
            addCriterion("surplus_waste_num not in", values, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumBetween(Double value1, Double value2) {
            addCriterion("surplus_waste_num between", value1, value2, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumNotBetween(Double value1, Double value2) {
            addCriterion("surplus_waste_num not between", value1, value2, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumIsNull() {
            addCriterion("stockout_maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumIsNotNull() {
            addCriterion("stockout_maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumEqualTo(Double value) {
            addCriterion("stockout_maintain_num =", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumNotEqualTo(Double value) {
            addCriterion("stockout_maintain_num <>", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumGreaterThan(Double value) {
            addCriterion("stockout_maintain_num >", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockout_maintain_num >=", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumLessThan(Double value) {
            addCriterion("stockout_maintain_num <", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumLessThanOrEqualTo(Double value) {
            addCriterion("stockout_maintain_num <=", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumIn(List<Double> values) {
            addCriterion("stockout_maintain_num in", values, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumNotIn(List<Double> values) {
            addCriterion("stockout_maintain_num not in", values, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumBetween(Double value1, Double value2) {
            addCriterion("stockout_maintain_num between", value1, value2, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumNotBetween(Double value1, Double value2) {
            addCriterion("stockout_maintain_num not between", value1, value2, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumIsNull() {
            addCriterion("waste_stockout_num is null");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumIsNotNull() {
            addCriterion("waste_stockout_num is not null");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumEqualTo(Double value) {
            addCriterion("waste_stockout_num =", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumNotEqualTo(Double value) {
            addCriterion("waste_stockout_num <>", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumGreaterThan(Double value) {
            addCriterion("waste_stockout_num >", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumGreaterThanOrEqualTo(Double value) {
            addCriterion("waste_stockout_num >=", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumLessThan(Double value) {
            addCriterion("waste_stockout_num <", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumLessThanOrEqualTo(Double value) {
            addCriterion("waste_stockout_num <=", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumIn(List<Double> values) {
            addCriterion("waste_stockout_num in", values, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumNotIn(List<Double> values) {
            addCriterion("waste_stockout_num not in", values, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumBetween(Double value1, Double value2) {
            addCriterion("waste_stockout_num between", value1, value2, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumNotBetween(Double value1, Double value2) {
            addCriterion("waste_stockout_num not between", value1, value2, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockinPriceIsNull() {
            addCriterion("stockin_price is null");
            return (Criteria) this;
        }

        public Criteria andStockinPriceIsNotNull() {
            addCriterion("stockin_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockinPriceEqualTo(BigDecimal value) {
            addCriterion("stockin_price =", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceNotEqualTo(BigDecimal value) {
            addCriterion("stockin_price <>", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceGreaterThan(BigDecimal value) {
            addCriterion("stockin_price >", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockin_price >=", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceLessThan(BigDecimal value) {
            addCriterion("stockin_price <", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockin_price <=", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceIn(List<BigDecimal> values) {
            addCriterion("stockin_price in", values, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceNotIn(List<BigDecimal> values) {
            addCriterion("stockin_price not in", values, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockin_price between", value1, value2, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockin_price not between", value1, value2, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceIsNull() {
            addCriterion("use_spare_parts_price is null");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceIsNotNull() {
            addCriterion("use_spare_parts_price is not null");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price =", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceNotEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price <>", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceGreaterThan(BigDecimal value) {
            addCriterion("use_spare_parts_price >", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price >=", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceLessThan(BigDecimal value) {
            addCriterion("use_spare_parts_price <", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price <=", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceIn(List<BigDecimal> values) {
            addCriterion("use_spare_parts_price in", values, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceNotIn(List<BigDecimal> values) {
            addCriterion("use_spare_parts_price not in", values, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_spare_parts_price between", value1, value2, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_spare_parts_price not between", value1, value2, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceIsNull() {
            addCriterion("stockout_price is null");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceIsNotNull() {
            addCriterion("stockout_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceEqualTo(BigDecimal value) {
            addCriterion("stockout_price =", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceNotEqualTo(BigDecimal value) {
            addCriterion("stockout_price <>", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceGreaterThan(BigDecimal value) {
            addCriterion("stockout_price >", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockout_price >=", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceLessThan(BigDecimal value) {
            addCriterion("stockout_price <", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockout_price <=", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceIn(List<BigDecimal> values) {
            addCriterion("stockout_price in", values, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceNotIn(List<BigDecimal> values) {
            addCriterion("stockout_price not in", values, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockout_price between", value1, value2, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockout_price not between", value1, value2, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNull() {
            addCriterion("reasons_rejection is null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNotNull() {
            addCriterion("reasons_rejection is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionEqualTo(String value) {
            addCriterion("reasons_rejection =", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotEqualTo(String value) {
            addCriterion("reasons_rejection <>", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThan(String value) {
            addCriterion("reasons_rejection >", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThanOrEqualTo(String value) {
            addCriterion("reasons_rejection >=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThan(String value) {
            addCriterion("reasons_rejection <", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThanOrEqualTo(String value) {
            addCriterion("reasons_rejection <=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLike(String value) {
            addCriterion("reasons_rejection like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotLike(String value) {
            addCriterion("reasons_rejection not like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIn(List<String> values) {
            addCriterion("reasons_rejection in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotIn(List<String> values) {
            addCriterion("reasons_rejection not in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionBetween(String value1, String value2) {
            addCriterion("reasons_rejection between", value1, value2, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotBetween(String value1, String value2) {
            addCriterion("reasons_rejection not between", value1, value2, "reasonsRejection");
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

        public Criteria andSparePartsNameIsNull() {
            addCriterion("spare_parts_name is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIsNotNull() {
            addCriterion("spare_parts_name is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEqualTo(String value) {
            addCriterion("spare_parts_name =", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotEqualTo(String value) {
            addCriterion("spare_parts_name <>", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameGreaterThan(String value) {
            addCriterion("spare_parts_name >", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_name >=", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLessThan(String value) {
            addCriterion("spare_parts_name <", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_name <=", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLike(String value) {
            addCriterion("spare_parts_name like", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotLike(String value) {
            addCriterion("spare_parts_name not like", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIn(List<String> values) {
            addCriterion("spare_parts_name in", values, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotIn(List<String> values) {
            addCriterion("spare_parts_name not in", values, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameBetween(String value1, String value2) {
            addCriterion("spare_parts_name between", value1, value2, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotBetween(String value1, String value2) {
            addCriterion("spare_parts_name not between", value1, value2, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andIsOverIsNull() {
            addCriterion("is_over is null");
            return (Criteria) this;
        }

        public Criteria andIsOverIsNotNull() {
            addCriterion("is_over is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverEqualTo(String value) {
            addCriterion("is_over =", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotEqualTo(String value) {
            addCriterion("is_over <>", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverGreaterThan(String value) {
            addCriterion("is_over >", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverGreaterThanOrEqualTo(String value) {
            addCriterion("is_over >=", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverLessThan(String value) {
            addCriterion("is_over <", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverLessThanOrEqualTo(String value) {
            addCriterion("is_over <=", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverLike(String value) {
            addCriterion("is_over like", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotLike(String value) {
            addCriterion("is_over not like", value, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverIn(List<String> values) {
            addCriterion("is_over in", values, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotIn(List<String> values) {
            addCriterion("is_over not in", values, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverBetween(String value1, String value2) {
            addCriterion("is_over between", value1, value2, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOverNotBetween(String value1, String value2) {
            addCriterion("is_over not between", value1, value2, "isOver");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNull() {
            addCriterion("is_out is null");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNotNull() {
            addCriterion("is_out is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutEqualTo(String value) {
            addCriterion("is_out =", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotEqualTo(String value) {
            addCriterion("is_out <>", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThan(String value) {
            addCriterion("is_out >", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThanOrEqualTo(String value) {
            addCriterion("is_out >=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThan(String value) {
            addCriterion("is_out <", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThanOrEqualTo(String value) {
            addCriterion("is_out <=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLike(String value) {
            addCriterion("is_out like", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotLike(String value) {
            addCriterion("is_out not like", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutIn(List<String> values) {
            addCriterion("is_out in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotIn(List<String> values) {
            addCriterion("is_out not in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutBetween(String value1, String value2) {
            addCriterion("is_out between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotBetween(String value1, String value2) {
            addCriterion("is_out not between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsInIsNull() {
            addCriterion("is_in is null");
            return (Criteria) this;
        }

        public Criteria andIsInIsNotNull() {
            addCriterion("is_in is not null");
            return (Criteria) this;
        }

        public Criteria andIsInEqualTo(String value) {
            addCriterion("is_in =", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInNotEqualTo(String value) {
            addCriterion("is_in <>", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInGreaterThan(String value) {
            addCriterion("is_in >", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInGreaterThanOrEqualTo(String value) {
            addCriterion("is_in >=", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInLessThan(String value) {
            addCriterion("is_in <", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInLessThanOrEqualTo(String value) {
            addCriterion("is_in <=", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInLike(String value) {
            addCriterion("is_in like", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInNotLike(String value) {
            addCriterion("is_in not like", value, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInIn(List<String> values) {
            addCriterion("is_in in", values, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInNotIn(List<String> values) {
            addCriterion("is_in not in", values, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInBetween(String value1, String value2) {
            addCriterion("is_in between", value1, value2, "isIn");
            return (Criteria) this;
        }

        public Criteria andIsInNotBetween(String value1, String value2) {
            addCriterion("is_in not between", value1, value2, "isIn");
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