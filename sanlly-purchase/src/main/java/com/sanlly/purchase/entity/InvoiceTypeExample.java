package com.sanlly.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public InvoiceTypeExample() {
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

        public Criteria andPurcInvoiceTypeIdIsNull() {
            addCriterion("purc_invoice_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdIsNotNull() {
            addCriterion("purc_invoice_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdEqualTo(Integer value) {
            addCriterion("purc_invoice_type_id =", value, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdNotEqualTo(Integer value) {
            addCriterion("purc_invoice_type_id <>", value, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdGreaterThan(Integer value) {
            addCriterion("purc_invoice_type_id >", value, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_invoice_type_id >=", value, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdLessThan(Integer value) {
            addCriterion("purc_invoice_type_id <", value, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_invoice_type_id <=", value, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdIn(List<Integer> values) {
            addCriterion("purc_invoice_type_id in", values, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdNotIn(List<Integer> values) {
            addCriterion("purc_invoice_type_id not in", values, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_invoice_type_id between", value1, value2, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPurcInvoiceTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_invoice_type_id not between", value1, value2, "purcInvoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("`key` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`key` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("`key` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("`key` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("`key` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`key` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("`key` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("`key` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("`key` like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("`key` not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("`key` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("`key` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("`key` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("`key` not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameIsNull() {
            addCriterion("invoice_type_name is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameIsNotNull() {
            addCriterion("invoice_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameEqualTo(String value) {
            addCriterion("invoice_type_name =", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameNotEqualTo(String value) {
            addCriterion("invoice_type_name <>", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameGreaterThan(String value) {
            addCriterion("invoice_type_name >", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type_name >=", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameLessThan(String value) {
            addCriterion("invoice_type_name <", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("invoice_type_name <=", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameLike(String value) {
            addCriterion("invoice_type_name like", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameNotLike(String value) {
            addCriterion("invoice_type_name not like", value, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameIn(List<String> values) {
            addCriterion("invoice_type_name in", values, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameNotIn(List<String> values) {
            addCriterion("invoice_type_name not in", values, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameBetween(String value1, String value2) {
            addCriterion("invoice_type_name between", value1, value2, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNameNotBetween(String value1, String value2) {
            addCriterion("invoice_type_name not between", value1, value2, "invoiceTypeName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnIsNull() {
            addCriterion("invoice_type_en is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnIsNotNull() {
            addCriterion("invoice_type_en is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnEqualTo(String value) {
            addCriterion("invoice_type_en =", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnNotEqualTo(String value) {
            addCriterion("invoice_type_en <>", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnGreaterThan(String value) {
            addCriterion("invoice_type_en >", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type_en >=", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnLessThan(String value) {
            addCriterion("invoice_type_en <", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnLessThanOrEqualTo(String value) {
            addCriterion("invoice_type_en <=", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnLike(String value) {
            addCriterion("invoice_type_en like", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnNotLike(String value) {
            addCriterion("invoice_type_en not like", value, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnIn(List<String> values) {
            addCriterion("invoice_type_en in", values, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnNotIn(List<String> values) {
            addCriterion("invoice_type_en not in", values, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnBetween(String value1, String value2) {
            addCriterion("invoice_type_en between", value1, value2, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEnNotBetween(String value1, String value2) {
            addCriterion("invoice_type_en not between", value1, value2, "invoiceTypeEn");
            return (Criteria) this;
        }

        public Criteria andInvoicePointIsNull() {
            addCriterion("invoice_point is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePointIsNotNull() {
            addCriterion("invoice_point is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePointEqualTo(Double value) {
            addCriterion("invoice_point =", value, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointNotEqualTo(Double value) {
            addCriterion("invoice_point <>", value, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointGreaterThan(Double value) {
            addCriterion("invoice_point >", value, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointGreaterThanOrEqualTo(Double value) {
            addCriterion("invoice_point >=", value, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointLessThan(Double value) {
            addCriterion("invoice_point <", value, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointLessThanOrEqualTo(Double value) {
            addCriterion("invoice_point <=", value, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointIn(List<Double> values) {
            addCriterion("invoice_point in", values, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointNotIn(List<Double> values) {
            addCriterion("invoice_point not in", values, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointBetween(Double value1, Double value2) {
            addCriterion("invoice_point between", value1, value2, "invoicePoint");
            return (Criteria) this;
        }

        public Criteria andInvoicePointNotBetween(Double value1, Double value2) {
            addCriterion("invoice_point not between", value1, value2, "invoicePoint");
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

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
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

        public Criteria andInvoiceCategroyIsNull() {
            addCriterion("invoice_categroy is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyIsNotNull() {
            addCriterion("invoice_categroy is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyEqualTo(String value) {
            addCriterion("invoice_categroy =", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyNotEqualTo(String value) {
            addCriterion("invoice_categroy <>", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyGreaterThan(String value) {
            addCriterion("invoice_categroy >", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_categroy >=", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyLessThan(String value) {
            addCriterion("invoice_categroy <", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyLessThanOrEqualTo(String value) {
            addCriterion("invoice_categroy <=", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyLike(String value) {
            addCriterion("invoice_categroy like", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyNotLike(String value) {
            addCriterion("invoice_categroy not like", value, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyIn(List<String> values) {
            addCriterion("invoice_categroy in", values, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyNotIn(List<String> values) {
            addCriterion("invoice_categroy not in", values, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyBetween(String value1, String value2) {
            addCriterion("invoice_categroy between", value1, value2, "invoiceCategroy");
            return (Criteria) this;
        }

        public Criteria andInvoiceCategroyNotBetween(String value1, String value2) {
            addCriterion("invoice_categroy not between", value1, value2, "invoiceCategroy");
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