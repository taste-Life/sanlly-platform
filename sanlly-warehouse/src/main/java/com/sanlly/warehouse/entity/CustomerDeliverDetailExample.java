package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDeliverDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CustomerDeliverDetailExample() {
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

        public Criteria andWareCustomerDeliverDetaillIdIsNull() {
            addCriterion("ware_customer_deliver_detaill_id is null");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdIsNotNull() {
            addCriterion("ware_customer_deliver_detaill_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_detaill_id =", value, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdNotEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_detaill_id <>", value, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdGreaterThan(Integer value) {
            addCriterion("ware_customer_deliver_detaill_id >", value, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_detaill_id >=", value, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdLessThan(Integer value) {
            addCriterion("ware_customer_deliver_detaill_id <", value, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_detaill_id <=", value, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdIn(List<Integer> values) {
            addCriterion("ware_customer_deliver_detaill_id in", values, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdNotIn(List<Integer> values) {
            addCriterion("ware_customer_deliver_detaill_id not in", values, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_customer_deliver_detaill_id between", value1, value2, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverDetaillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_customer_deliver_detaill_id not between", value1, value2, "wareCustomerDeliverDetaillId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdIsNull() {
            addCriterion("ware_customer_deliver_id is null");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdIsNotNull() {
            addCriterion("ware_customer_deliver_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id =", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdNotEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id <>", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdGreaterThan(Integer value) {
            addCriterion("ware_customer_deliver_id >", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id >=", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdLessThan(Integer value) {
            addCriterion("ware_customer_deliver_id <", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id <=", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdIn(List<Integer> values) {
            addCriterion("ware_customer_deliver_id in", values, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdNotIn(List<Integer> values) {
            addCriterion("ware_customer_deliver_id not in", values, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_customer_deliver_id between", value1, value2, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_customer_deliver_id not between", value1, value2, "wareCustomerDeliverId");
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

        public Criteria andNewSerialIsNull() {
            addCriterion("new_serial is null");
            return (Criteria) this;
        }

        public Criteria andNewSerialIsNotNull() {
            addCriterion("new_serial is not null");
            return (Criteria) this;
        }

        public Criteria andNewSerialEqualTo(String value) {
            addCriterion("new_serial =", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotEqualTo(String value) {
            addCriterion("new_serial <>", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialGreaterThan(String value) {
            addCriterion("new_serial >", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialGreaterThanOrEqualTo(String value) {
            addCriterion("new_serial >=", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialLessThan(String value) {
            addCriterion("new_serial <", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialLessThanOrEqualTo(String value) {
            addCriterion("new_serial <=", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialLike(String value) {
            addCriterion("new_serial like", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotLike(String value) {
            addCriterion("new_serial not like", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialIn(List<String> values) {
            addCriterion("new_serial in", values, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotIn(List<String> values) {
            addCriterion("new_serial not in", values, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialBetween(String value1, String value2) {
            addCriterion("new_serial between", value1, value2, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotBetween(String value1, String value2) {
            addCriterion("new_serial not between", value1, value2, "newSerial");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNull() {
            addCriterion("repair_cost is null");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNotNull() {
            addCriterion("repair_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCostEqualTo(BigDecimal value) {
            addCriterion("repair_cost =", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotEqualTo(BigDecimal value) {
            addCriterion("repair_cost <>", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThan(BigDecimal value) {
            addCriterion("repair_cost >", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_cost >=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThan(BigDecimal value) {
            addCriterion("repair_cost <", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_cost <=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostIn(List<BigDecimal> values) {
            addCriterion("repair_cost in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotIn(List<BigDecimal> values) {
            addCriterion("repair_cost not in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_cost between", value1, value2, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_cost not between", value1, value2, "repairCost");
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

        public Criteria andOutStatusIsNull() {
            addCriterion("out_status is null");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNotNull() {
            addCriterion("out_status is not null");
            return (Criteria) this;
        }

        public Criteria andOutStatusEqualTo(String value) {
            addCriterion("out_status =", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotEqualTo(String value) {
            addCriterion("out_status <>", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThan(String value) {
            addCriterion("out_status >", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("out_status >=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThan(String value) {
            addCriterion("out_status <", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThanOrEqualTo(String value) {
            addCriterion("out_status <=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLike(String value) {
            addCriterion("out_status like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotLike(String value) {
            addCriterion("out_status not like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusIn(List<String> values) {
            addCriterion("out_status in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotIn(List<String> values) {
            addCriterion("out_status not in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusBetween(String value1, String value2) {
            addCriterion("out_status between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotBetween(String value1, String value2) {
            addCriterion("out_status not between", value1, value2, "outStatus");
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

        public Criteria andRepairIncomeIsNull() {
            addCriterion("repair_income is null");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeIsNotNull() {
            addCriterion("repair_income is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeEqualTo(BigDecimal value) {
            addCriterion("repair_income =", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeNotEqualTo(BigDecimal value) {
            addCriterion("repair_income <>", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeGreaterThan(BigDecimal value) {
            addCriterion("repair_income >", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_income >=", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeLessThan(BigDecimal value) {
            addCriterion("repair_income <", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_income <=", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeIn(List<BigDecimal> values) {
            addCriterion("repair_income in", values, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeNotIn(List<BigDecimal> values) {
            addCriterion("repair_income not in", values, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_income between", value1, value2, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_income not between", value1, value2, "repairIncome");
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