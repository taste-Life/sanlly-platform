package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LendSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public LendSaleExample() {
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

        public Criteria andLendSaleIdIsNull() {
            addCriterion("lend_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdIsNotNull() {
            addCriterion("lend_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdEqualTo(Integer value) {
            addCriterion("lend_sale_id =", value, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdNotEqualTo(Integer value) {
            addCriterion("lend_sale_id <>", value, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdGreaterThan(Integer value) {
            addCriterion("lend_sale_id >", value, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lend_sale_id >=", value, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdLessThan(Integer value) {
            addCriterion("lend_sale_id <", value, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("lend_sale_id <=", value, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdIn(List<Integer> values) {
            addCriterion("lend_sale_id in", values, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdNotIn(List<Integer> values) {
            addCriterion("lend_sale_id not in", values, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("lend_sale_id between", value1, value2, "lendSaleId");
            return (Criteria) this;
        }

        public Criteria andLendSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lend_sale_id not between", value1, value2, "lendSaleId");
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

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("bill_status like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("bill_status not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdIsNull() {
            addCriterion("borrow_lend_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdIsNotNull() {
            addCriterion("borrow_lend_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdEqualTo(Integer value) {
            addCriterion("borrow_lend_id =", value, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdNotEqualTo(Integer value) {
            addCriterion("borrow_lend_id <>", value, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdGreaterThan(Integer value) {
            addCriterion("borrow_lend_id >", value, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_lend_id >=", value, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdLessThan(Integer value) {
            addCriterion("borrow_lend_id <", value, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_lend_id <=", value, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdIn(List<Integer> values) {
            addCriterion("borrow_lend_id in", values, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdNotIn(List<Integer> values) {
            addCriterion("borrow_lend_id not in", values, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_lend_id between", value1, value2, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_lend_id not between", value1, value2, "borrowLendId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNull() {
            addCriterion("sale_no is null");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNotNull() {
            addCriterion("sale_no is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNoEqualTo(String value) {
            addCriterion("sale_no =", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotEqualTo(String value) {
            addCriterion("sale_no <>", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThan(String value) {
            addCriterion("sale_no >", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThanOrEqualTo(String value) {
            addCriterion("sale_no >=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThan(String value) {
            addCriterion("sale_no <", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThanOrEqualTo(String value) {
            addCriterion("sale_no <=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLike(String value) {
            addCriterion("sale_no like", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotLike(String value) {
            addCriterion("sale_no not like", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoIn(List<String> values) {
            addCriterion("sale_no in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotIn(List<String> values) {
            addCriterion("sale_no not in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoBetween(String value1, String value2) {
            addCriterion("sale_no between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotBetween(String value1, String value2) {
            addCriterion("sale_no not between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("receive_user is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("receive_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(String value) {
            addCriterion("receive_user =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(String value) {
            addCriterion("receive_user <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(String value) {
            addCriterion("receive_user >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(String value) {
            addCriterion("receive_user >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(String value) {
            addCriterion("receive_user <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(String value) {
            addCriterion("receive_user <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLike(String value) {
            addCriterion("receive_user like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotLike(String value) {
            addCriterion("receive_user not like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<String> values) {
            addCriterion("receive_user in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<String> values) {
            addCriterion("receive_user not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(String value1, String value2) {
            addCriterion("receive_user between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(String value1, String value2) {
            addCriterion("receive_user not between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("recipient not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andConcatWayIsNull() {
            addCriterion("concat_way is null");
            return (Criteria) this;
        }

        public Criteria andConcatWayIsNotNull() {
            addCriterion("concat_way is not null");
            return (Criteria) this;
        }

        public Criteria andConcatWayEqualTo(String value) {
            addCriterion("concat_way =", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayNotEqualTo(String value) {
            addCriterion("concat_way <>", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayGreaterThan(String value) {
            addCriterion("concat_way >", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayGreaterThanOrEqualTo(String value) {
            addCriterion("concat_way >=", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayLessThan(String value) {
            addCriterion("concat_way <", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayLessThanOrEqualTo(String value) {
            addCriterion("concat_way <=", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayLike(String value) {
            addCriterion("concat_way like", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayNotLike(String value) {
            addCriterion("concat_way not like", value, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayIn(List<String> values) {
            addCriterion("concat_way in", values, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayNotIn(List<String> values) {
            addCriterion("concat_way not in", values, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayBetween(String value1, String value2) {
            addCriterion("concat_way between", value1, value2, "concatWay");
            return (Criteria) this;
        }

        public Criteria andConcatWayNotBetween(String value1, String value2) {
            addCriterion("concat_way not between", value1, value2, "concatWay");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNull() {
            addCriterion("purchaser is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNotNull() {
            addCriterion("purchaser is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserEqualTo(String value) {
            addCriterion("purchaser =", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotEqualTo(String value) {
            addCriterion("purchaser <>", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThan(String value) {
            addCriterion("purchaser >", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThanOrEqualTo(String value) {
            addCriterion("purchaser >=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThan(String value) {
            addCriterion("purchaser <", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThanOrEqualTo(String value) {
            addCriterion("purchaser <=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLike(String value) {
            addCriterion("purchaser like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotLike(String value) {
            addCriterion("purchaser not like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserIn(List<String> values) {
            addCriterion("purchaser in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotIn(List<String> values) {
            addCriterion("purchaser not in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserBetween(String value1, String value2) {
            addCriterion("purchaser between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotBetween(String value1, String value2) {
            addCriterion("purchaser not between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitIsNull() {
            addCriterion("purchase_unit is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitIsNotNull() {
            addCriterion("purchase_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitEqualTo(String value) {
            addCriterion("purchase_unit =", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNotEqualTo(String value) {
            addCriterion("purchase_unit <>", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitGreaterThan(String value) {
            addCriterion("purchase_unit >", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_unit >=", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitLessThan(String value) {
            addCriterion("purchase_unit <", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitLessThanOrEqualTo(String value) {
            addCriterion("purchase_unit <=", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitLike(String value) {
            addCriterion("purchase_unit like", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNotLike(String value) {
            addCriterion("purchase_unit not like", value, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitIn(List<String> values) {
            addCriterion("purchase_unit in", values, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNotIn(List<String> values) {
            addCriterion("purchase_unit not in", values, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitBetween(String value1, String value2) {
            addCriterion("purchase_unit between", value1, value2, "purchaseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNotBetween(String value1, String value2) {
            addCriterion("purchase_unit not between", value1, value2, "purchaseUnit");
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