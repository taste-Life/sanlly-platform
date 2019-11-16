package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UnitExample() {
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

        public Criteria andProdUnitIdIsNull() {
            addCriterion("prod_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdIsNotNull() {
            addCriterion("prod_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdEqualTo(String value) {
            addCriterion("prod_unit_id =", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdNotEqualTo(String value) {
            addCriterion("prod_unit_id <>", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdGreaterThan(String value) {
            addCriterion("prod_unit_id >", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_unit_id >=", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdLessThan(String value) {
            addCriterion("prod_unit_id <", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdLessThanOrEqualTo(String value) {
            addCriterion("prod_unit_id <=", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdLike(String value) {
            addCriterion("prod_unit_id like", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdNotLike(String value) {
            addCriterion("prod_unit_id not like", value, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdIn(List<String> values) {
            addCriterion("prod_unit_id in", values, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdNotIn(List<String> values) {
            addCriterion("prod_unit_id not in", values, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdBetween(String value1, String value2) {
            addCriterion("prod_unit_id between", value1, value2, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andProdUnitIdNotBetween(String value1, String value2) {
            addCriterion("prod_unit_id not between", value1, value2, "prodUnitId");
            return (Criteria) this;
        }

        public Criteria andContainerIsNull() {
            addCriterion("container is null");
            return (Criteria) this;
        }

        public Criteria andContainerIsNotNull() {
            addCriterion("container is not null");
            return (Criteria) this;
        }

        public Criteria andContainerEqualTo(String value) {
            addCriterion("container =", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotEqualTo(String value) {
            addCriterion("container <>", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerGreaterThan(String value) {
            addCriterion("container >", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerGreaterThanOrEqualTo(String value) {
            addCriterion("container >=", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerLessThan(String value) {
            addCriterion("container <", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerLessThanOrEqualTo(String value) {
            addCriterion("container <=", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerLike(String value) {
            addCriterion("container like", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotLike(String value) {
            addCriterion("container not like", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerIn(List<String> values) {
            addCriterion("container in", values, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotIn(List<String> values) {
            addCriterion("container not in", values, "container");
            return (Criteria) this;
        }

        public Criteria andContainerBetween(String value1, String value2) {
            addCriterion("container between", value1, value2, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotBetween(String value1, String value2) {
            addCriterion("container not between", value1, value2, "container");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
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

        public Criteria andControlIsNull() {
            addCriterion("control is null");
            return (Criteria) this;
        }

        public Criteria andControlIsNotNull() {
            addCriterion("control is not null");
            return (Criteria) this;
        }

        public Criteria andControlEqualTo(String value) {
            addCriterion("control =", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotEqualTo(String value) {
            addCriterion("control <>", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThan(String value) {
            addCriterion("control >", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThanOrEqualTo(String value) {
            addCriterion("control >=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThan(String value) {
            addCriterion("control <", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThanOrEqualTo(String value) {
            addCriterion("control <=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLike(String value) {
            addCriterion("control like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotLike(String value) {
            addCriterion("control not like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlIn(List<String> values) {
            addCriterion("control in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotIn(List<String> values) {
            addCriterion("control not in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlBetween(String value1, String value2) {
            addCriterion("control between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotBetween(String value1, String value2) {
            addCriterion("control not between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNull() {
            addCriterion("software_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNotNull() {
            addCriterion("software_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionEqualTo(String value) {
            addCriterion("software_version =", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotEqualTo(String value) {
            addCriterion("software_version <>", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThan(String value) {
            addCriterion("software_version >", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("software_version >=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThan(String value) {
            addCriterion("software_version <", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThanOrEqualTo(String value) {
            addCriterion("software_version <=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLike(String value) {
            addCriterion("software_version like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotLike(String value) {
            addCriterion("software_version not like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIn(List<String> values) {
            addCriterion("software_version in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotIn(List<String> values) {
            addCriterion("software_version not in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionBetween(String value1, String value2) {
            addCriterion("software_version between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotBetween(String value1, String value2) {
            addCriterion("software_version not between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andIsCaIsNull() {
            addCriterion("is_ca is null");
            return (Criteria) this;
        }

        public Criteria andIsCaIsNotNull() {
            addCriterion("is_ca is not null");
            return (Criteria) this;
        }

        public Criteria andIsCaEqualTo(String value) {
            addCriterion("is_ca =", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotEqualTo(String value) {
            addCriterion("is_ca <>", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaGreaterThan(String value) {
            addCriterion("is_ca >", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaGreaterThanOrEqualTo(String value) {
            addCriterion("is_ca >=", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLessThan(String value) {
            addCriterion("is_ca <", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLessThanOrEqualTo(String value) {
            addCriterion("is_ca <=", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLike(String value) {
            addCriterion("is_ca like", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotLike(String value) {
            addCriterion("is_ca not like", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaIn(List<String> values) {
            addCriterion("is_ca in", values, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotIn(List<String> values) {
            addCriterion("is_ca not in", values, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaBetween(String value1, String value2) {
            addCriterion("is_ca between", value1, value2, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotBetween(String value1, String value2) {
            addCriterion("is_ca not between", value1, value2, "isCa");
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