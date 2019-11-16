package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HeavyEnterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public HeavyEnterInfoExample() {
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

        public Criteria andProdHeavyEnterIdIsNull() {
            addCriterion("prod_heavy_enter_id is null");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdIsNotNull() {
            addCriterion("prod_heavy_enter_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdEqualTo(Integer value) {
            addCriterion("prod_heavy_enter_id =", value, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdNotEqualTo(Integer value) {
            addCriterion("prod_heavy_enter_id <>", value, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdGreaterThan(Integer value) {
            addCriterion("prod_heavy_enter_id >", value, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_heavy_enter_id >=", value, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdLessThan(Integer value) {
            addCriterion("prod_heavy_enter_id <", value, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_heavy_enter_id <=", value, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdIn(List<Integer> values) {
            addCriterion("prod_heavy_enter_id in", values, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdNotIn(List<Integer> values) {
            addCriterion("prod_heavy_enter_id not in", values, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_heavy_enter_id between", value1, value2, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andProdHeavyEnterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_heavy_enter_id not between", value1, value2, "prodHeavyEnterId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
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

        public Criteria andIsExportIsNull() {
            addCriterion("is_export is null");
            return (Criteria) this;
        }

        public Criteria andIsExportIsNotNull() {
            addCriterion("is_export is not null");
            return (Criteria) this;
        }

        public Criteria andIsExportEqualTo(String value) {
            addCriterion("is_export =", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportNotEqualTo(String value) {
            addCriterion("is_export <>", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportGreaterThan(String value) {
            addCriterion("is_export >", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportGreaterThanOrEqualTo(String value) {
            addCriterion("is_export >=", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportLessThan(String value) {
            addCriterion("is_export <", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportLessThanOrEqualTo(String value) {
            addCriterion("is_export <=", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportLike(String value) {
            addCriterion("is_export like", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportNotLike(String value) {
            addCriterion("is_export not like", value, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportIn(List<String> values) {
            addCriterion("is_export in", values, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportNotIn(List<String> values) {
            addCriterion("is_export not in", values, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportBetween(String value1, String value2) {
            addCriterion("is_export between", value1, value2, "isExport");
            return (Criteria) this;
        }

        public Criteria andIsExportNotBetween(String value1, String value2) {
            addCriterion("is_export not between", value1, value2, "isExport");
            return (Criteria) this;
        }

        public Criteria andVesVosIsNull() {
            addCriterion("ves_vos is null");
            return (Criteria) this;
        }

        public Criteria andVesVosIsNotNull() {
            addCriterion("ves_vos is not null");
            return (Criteria) this;
        }

        public Criteria andVesVosEqualTo(String value) {
            addCriterion("ves_vos =", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosNotEqualTo(String value) {
            addCriterion("ves_vos <>", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosGreaterThan(String value) {
            addCriterion("ves_vos >", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosGreaterThanOrEqualTo(String value) {
            addCriterion("ves_vos >=", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosLessThan(String value) {
            addCriterion("ves_vos <", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosLessThanOrEqualTo(String value) {
            addCriterion("ves_vos <=", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosLike(String value) {
            addCriterion("ves_vos like", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosNotLike(String value) {
            addCriterion("ves_vos not like", value, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosIn(List<String> values) {
            addCriterion("ves_vos in", values, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosNotIn(List<String> values) {
            addCriterion("ves_vos not in", values, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosBetween(String value1, String value2) {
            addCriterion("ves_vos between", value1, value2, "vesVos");
            return (Criteria) this;
        }

        public Criteria andVesVosNotBetween(String value1, String value2) {
            addCriterion("ves_vos not between", value1, value2, "vesVos");
            return (Criteria) this;
        }

        public Criteria andSailingDateIsNull() {
            addCriterion("sailing_date is null");
            return (Criteria) this;
        }

        public Criteria andSailingDateIsNotNull() {
            addCriterion("sailing_date is not null");
            return (Criteria) this;
        }

        public Criteria andSailingDateEqualTo(Date value) {
            addCriterion("sailing_date =", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateNotEqualTo(Date value) {
            addCriterion("sailing_date <>", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateGreaterThan(Date value) {
            addCriterion("sailing_date >", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sailing_date >=", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateLessThan(Date value) {
            addCriterion("sailing_date <", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateLessThanOrEqualTo(Date value) {
            addCriterion("sailing_date <=", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateIn(List<Date> values) {
            addCriterion("sailing_date in", values, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateNotIn(List<Date> values) {
            addCriterion("sailing_date not in", values, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateBetween(Date value1, Date value2) {
            addCriterion("sailing_date between", value1, value2, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateNotBetween(Date value1, Date value2) {
            addCriterion("sailing_date not between", value1, value2, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateIsNull() {
            addCriterion("shipment_date is null");
            return (Criteria) this;
        }

        public Criteria andShipmentDateIsNotNull() {
            addCriterion("shipment_date is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentDateEqualTo(Date value) {
            addCriterion("shipment_date =", value, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateNotEqualTo(Date value) {
            addCriterion("shipment_date <>", value, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateGreaterThan(Date value) {
            addCriterion("shipment_date >", value, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("shipment_date >=", value, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateLessThan(Date value) {
            addCriterion("shipment_date <", value, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateLessThanOrEqualTo(Date value) {
            addCriterion("shipment_date <=", value, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateIn(List<Date> values) {
            addCriterion("shipment_date in", values, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateNotIn(List<Date> values) {
            addCriterion("shipment_date not in", values, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateBetween(Date value1, Date value2) {
            addCriterion("shipment_date between", value1, value2, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andShipmentDateNotBetween(Date value1, Date value2) {
            addCriterion("shipment_date not between", value1, value2, "shipmentDate");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("`location` is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("`location` is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("`location` =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("`location` <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("`location` >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("`location` >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("`location` <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("`location` <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("`location` like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("`location` not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("`location` in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("`location` not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("`location` between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("`location` not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andExitYardIsNull() {
            addCriterion("exit_yard is null");
            return (Criteria) this;
        }

        public Criteria andExitYardIsNotNull() {
            addCriterion("exit_yard is not null");
            return (Criteria) this;
        }

        public Criteria andExitYardEqualTo(String value) {
            addCriterion("exit_yard =", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotEqualTo(String value) {
            addCriterion("exit_yard <>", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardGreaterThan(String value) {
            addCriterion("exit_yard >", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardGreaterThanOrEqualTo(String value) {
            addCriterion("exit_yard >=", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardLessThan(String value) {
            addCriterion("exit_yard <", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardLessThanOrEqualTo(String value) {
            addCriterion("exit_yard <=", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardLike(String value) {
            addCriterion("exit_yard like", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotLike(String value) {
            addCriterion("exit_yard not like", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardIn(List<String> values) {
            addCriterion("exit_yard in", values, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotIn(List<String> values) {
            addCriterion("exit_yard not in", values, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardBetween(String value1, String value2) {
            addCriterion("exit_yard between", value1, value2, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotBetween(String value1, String value2) {
            addCriterion("exit_yard not between", value1, value2, "exitYard");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andSettingTempIsNull() {
            addCriterion("setting_temp is null");
            return (Criteria) this;
        }

        public Criteria andSettingTempIsNotNull() {
            addCriterion("setting_temp is not null");
            return (Criteria) this;
        }

        public Criteria andSettingTempEqualTo(Double value) {
            addCriterion("setting_temp =", value, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempNotEqualTo(Double value) {
            addCriterion("setting_temp <>", value, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempGreaterThan(Double value) {
            addCriterion("setting_temp >", value, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempGreaterThanOrEqualTo(Double value) {
            addCriterion("setting_temp >=", value, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempLessThan(Double value) {
            addCriterion("setting_temp <", value, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempLessThanOrEqualTo(Double value) {
            addCriterion("setting_temp <=", value, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempIn(List<Double> values) {
            addCriterion("setting_temp in", values, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempNotIn(List<Double> values) {
            addCriterion("setting_temp not in", values, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempBetween(Double value1, Double value2) {
            addCriterion("setting_temp between", value1, value2, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingTempNotBetween(Double value1, Double value2) {
            addCriterion("setting_temp not between", value1, value2, "settingTemp");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityIsNull() {
            addCriterion("setting_humidity is null");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityIsNotNull() {
            addCriterion("setting_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityEqualTo(Double value) {
            addCriterion("setting_humidity =", value, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityNotEqualTo(Double value) {
            addCriterion("setting_humidity <>", value, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityGreaterThan(Double value) {
            addCriterion("setting_humidity >", value, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("setting_humidity >=", value, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityLessThan(Double value) {
            addCriterion("setting_humidity <", value, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityLessThanOrEqualTo(Double value) {
            addCriterion("setting_humidity <=", value, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityIn(List<Double> values) {
            addCriterion("setting_humidity in", values, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityNotIn(List<Double> values) {
            addCriterion("setting_humidity not in", values, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityBetween(Double value1, Double value2) {
            addCriterion("setting_humidity between", value1, value2, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andSettingHumidityNotBetween(Double value1, Double value2) {
            addCriterion("setting_humidity not between", value1, value2, "settingHumidity");
            return (Criteria) this;
        }

        public Criteria andVentIsNull() {
            addCriterion("vent is null");
            return (Criteria) this;
        }

        public Criteria andVentIsNotNull() {
            addCriterion("vent is not null");
            return (Criteria) this;
        }

        public Criteria andVentEqualTo(Double value) {
            addCriterion("vent =", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotEqualTo(Double value) {
            addCriterion("vent <>", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentGreaterThan(Double value) {
            addCriterion("vent >", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentGreaterThanOrEqualTo(Double value) {
            addCriterion("vent >=", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentLessThan(Double value) {
            addCriterion("vent <", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentLessThanOrEqualTo(Double value) {
            addCriterion("vent <=", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentIn(List<Double> values) {
            addCriterion("vent in", values, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotIn(List<Double> values) {
            addCriterion("vent not in", values, "vent");
            return (Criteria) this;
        }

        public Criteria andVentBetween(Double value1, Double value2) {
            addCriterion("vent between", value1, value2, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotBetween(Double value1, Double value2) {
            addCriterion("vent not between", value1, value2, "vent");
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

        public Criteria andDockIsNull() {
            addCriterion("dock is null");
            return (Criteria) this;
        }

        public Criteria andDockIsNotNull() {
            addCriterion("dock is not null");
            return (Criteria) this;
        }

        public Criteria andDockEqualTo(String value) {
            addCriterion("dock =", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockNotEqualTo(String value) {
            addCriterion("dock <>", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockGreaterThan(String value) {
            addCriterion("dock >", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockGreaterThanOrEqualTo(String value) {
            addCriterion("dock >=", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockLessThan(String value) {
            addCriterion("dock <", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockLessThanOrEqualTo(String value) {
            addCriterion("dock <=", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockLike(String value) {
            addCriterion("dock like", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockNotLike(String value) {
            addCriterion("dock not like", value, "dock");
            return (Criteria) this;
        }

        public Criteria andDockIn(List<String> values) {
            addCriterion("dock in", values, "dock");
            return (Criteria) this;
        }

        public Criteria andDockNotIn(List<String> values) {
            addCriterion("dock not in", values, "dock");
            return (Criteria) this;
        }

        public Criteria andDockBetween(String value1, String value2) {
            addCriterion("dock between", value1, value2, "dock");
            return (Criteria) this;
        }

        public Criteria andDockNotBetween(String value1, String value2) {
            addCriterion("dock not between", value1, value2, "dock");
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