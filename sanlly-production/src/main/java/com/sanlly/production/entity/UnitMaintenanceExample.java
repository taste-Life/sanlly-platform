package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitMaintenanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UnitMaintenanceExample() {
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

        public Criteria andProdUnitMaintenanceIdIsNull() {
            addCriterion("prod_unit_maintenance_id is null");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdIsNotNull() {
            addCriterion("prod_unit_maintenance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdEqualTo(Integer value) {
            addCriterion("prod_unit_maintenance_id =", value, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdNotEqualTo(Integer value) {
            addCriterion("prod_unit_maintenance_id <>", value, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdGreaterThan(Integer value) {
            addCriterion("prod_unit_maintenance_id >", value, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_unit_maintenance_id >=", value, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdLessThan(Integer value) {
            addCriterion("prod_unit_maintenance_id <", value, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_unit_maintenance_id <=", value, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdIn(List<Integer> values) {
            addCriterion("prod_unit_maintenance_id in", values, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdNotIn(List<Integer> values) {
            addCriterion("prod_unit_maintenance_id not in", values, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_unit_maintenance_id between", value1, value2, "prodUnitMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andProdUnitMaintenanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_unit_maintenance_id not between", value1, value2, "prodUnitMaintenanceId");
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

        public Criteria andEntireRepairTimeIsNull() {
            addCriterion("entire_repair_time is null");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeIsNotNull() {
            addCriterion("entire_repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeEqualTo(Integer value) {
            addCriterion("entire_repair_time =", value, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeNotEqualTo(Integer value) {
            addCriterion("entire_repair_time <>", value, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeGreaterThan(Integer value) {
            addCriterion("entire_repair_time >", value, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("entire_repair_time >=", value, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeLessThan(Integer value) {
            addCriterion("entire_repair_time <", value, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeLessThanOrEqualTo(Integer value) {
            addCriterion("entire_repair_time <=", value, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeIn(List<Integer> values) {
            addCriterion("entire_repair_time in", values, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeNotIn(List<Integer> values) {
            addCriterion("entire_repair_time not in", values, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeBetween(Integer value1, Integer value2) {
            addCriterion("entire_repair_time between", value1, value2, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andEntireRepairTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("entire_repair_time not between", value1, value2, "entireRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeIsNull() {
            addCriterion("winder_repair_time is null");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeIsNotNull() {
            addCriterion("winder_repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeEqualTo(Integer value) {
            addCriterion("winder_repair_time =", value, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeNotEqualTo(Integer value) {
            addCriterion("winder_repair_time <>", value, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeGreaterThan(Integer value) {
            addCriterion("winder_repair_time >", value, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("winder_repair_time >=", value, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeLessThan(Integer value) {
            addCriterion("winder_repair_time <", value, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeLessThanOrEqualTo(Integer value) {
            addCriterion("winder_repair_time <=", value, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeIn(List<Integer> values) {
            addCriterion("winder_repair_time in", values, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeNotIn(List<Integer> values) {
            addCriterion("winder_repair_time not in", values, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeBetween(Integer value1, Integer value2) {
            addCriterion("winder_repair_time between", value1, value2, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andWinderRepairTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("winder_repair_time not between", value1, value2, "winderRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeIsNull() {
            addCriterion("compressor_repair_time is null");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeIsNotNull() {
            addCriterion("compressor_repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeEqualTo(Integer value) {
            addCriterion("compressor_repair_time =", value, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeNotEqualTo(Integer value) {
            addCriterion("compressor_repair_time <>", value, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeGreaterThan(Integer value) {
            addCriterion("compressor_repair_time >", value, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("compressor_repair_time >=", value, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeLessThan(Integer value) {
            addCriterion("compressor_repair_time <", value, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeLessThanOrEqualTo(Integer value) {
            addCriterion("compressor_repair_time <=", value, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeIn(List<Integer> values) {
            addCriterion("compressor_repair_time in", values, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeNotIn(List<Integer> values) {
            addCriterion("compressor_repair_time not in", values, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeBetween(Integer value1, Integer value2) {
            addCriterion("compressor_repair_time between", value1, value2, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andCompressorRepairTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("compressor_repair_time not between", value1, value2, "compressorRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeIsNull() {
            addCriterion("control_repair_time is null");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeIsNotNull() {
            addCriterion("control_repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeEqualTo(Integer value) {
            addCriterion("control_repair_time =", value, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeNotEqualTo(Integer value) {
            addCriterion("control_repair_time <>", value, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeGreaterThan(Integer value) {
            addCriterion("control_repair_time >", value, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("control_repair_time >=", value, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeLessThan(Integer value) {
            addCriterion("control_repair_time <", value, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeLessThanOrEqualTo(Integer value) {
            addCriterion("control_repair_time <=", value, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeIn(List<Integer> values) {
            addCriterion("control_repair_time in", values, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeNotIn(List<Integer> values) {
            addCriterion("control_repair_time not in", values, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeBetween(Integer value1, Integer value2) {
            addCriterion("control_repair_time between", value1, value2, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andControlRepairTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("control_repair_time not between", value1, value2, "controlRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeIsNull() {
            addCriterion("base_repair_time is null");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeIsNotNull() {
            addCriterion("base_repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeEqualTo(Integer value) {
            addCriterion("base_repair_time =", value, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeNotEqualTo(Integer value) {
            addCriterion("base_repair_time <>", value, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeGreaterThan(Integer value) {
            addCriterion("base_repair_time >", value, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_repair_time >=", value, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeLessThan(Integer value) {
            addCriterion("base_repair_time <", value, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeLessThanOrEqualTo(Integer value) {
            addCriterion("base_repair_time <=", value, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeIn(List<Integer> values) {
            addCriterion("base_repair_time in", values, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeNotIn(List<Integer> values) {
            addCriterion("base_repair_time not in", values, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeBetween(Integer value1, Integer value2) {
            addCriterion("base_repair_time between", value1, value2, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBaseRepairTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("base_repair_time not between", value1, value2, "baseRepairTime");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceIsNull() {
            addCriterion("begin_maintenance is null");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceIsNotNull() {
            addCriterion("begin_maintenance is not null");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceEqualTo(Date value) {
            addCriterion("begin_maintenance =", value, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceNotEqualTo(Date value) {
            addCriterion("begin_maintenance <>", value, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceGreaterThan(Date value) {
            addCriterion("begin_maintenance >", value, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_maintenance >=", value, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceLessThan(Date value) {
            addCriterion("begin_maintenance <", value, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceLessThanOrEqualTo(Date value) {
            addCriterion("begin_maintenance <=", value, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceIn(List<Date> values) {
            addCriterion("begin_maintenance in", values, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceNotIn(List<Date> values) {
            addCriterion("begin_maintenance not in", values, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceBetween(Date value1, Date value2) {
            addCriterion("begin_maintenance between", value1, value2, "beginMaintenance");
            return (Criteria) this;
        }

        public Criteria andBeginMaintenanceNotBetween(Date value1, Date value2) {
            addCriterion("begin_maintenance not between", value1, value2, "beginMaintenance");
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