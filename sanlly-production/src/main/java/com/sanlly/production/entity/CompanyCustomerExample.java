package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CompanyCustomerExample() {
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

        public Criteria andProdEdiTypeIdIsNull() {
            addCriterion("prod_edi_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdIsNotNull() {
            addCriterion("prod_edi_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdEqualTo(Integer value) {
            addCriterion("prod_edi_type_id =", value, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdNotEqualTo(Integer value) {
            addCriterion("prod_edi_type_id <>", value, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdGreaterThan(Integer value) {
            addCriterion("prod_edi_type_id >", value, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_edi_type_id >=", value, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdLessThan(Integer value) {
            addCriterion("prod_edi_type_id <", value, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_edi_type_id <=", value, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdIn(List<Integer> values) {
            addCriterion("prod_edi_type_id in", values, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdNotIn(List<Integer> values) {
            addCriterion("prod_edi_type_id not in", values, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_edi_type_id between", value1, value2, "prodEdiTypeId");
            return (Criteria) this;
        }

        public Criteria andProdEdiTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_edi_type_id not between", value1, value2, "prodEdiTypeId");
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

        public Criteria andFtpReceiveAddressIsNull() {
            addCriterion("ftp_receive_address is null");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressIsNotNull() {
            addCriterion("ftp_receive_address is not null");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressEqualTo(String value) {
            addCriterion("ftp_receive_address =", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressNotEqualTo(String value) {
            addCriterion("ftp_receive_address <>", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressGreaterThan(String value) {
            addCriterion("ftp_receive_address >", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_receive_address >=", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressLessThan(String value) {
            addCriterion("ftp_receive_address <", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("ftp_receive_address <=", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressLike(String value) {
            addCriterion("ftp_receive_address like", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressNotLike(String value) {
            addCriterion("ftp_receive_address not like", value, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressIn(List<String> values) {
            addCriterion("ftp_receive_address in", values, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressNotIn(List<String> values) {
            addCriterion("ftp_receive_address not in", values, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressBetween(String value1, String value2) {
            addCriterion("ftp_receive_address between", value1, value2, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("ftp_receive_address not between", value1, value2, "ftpReceiveAddress");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortIsNull() {
            addCriterion("ftp_receive_port is null");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortIsNotNull() {
            addCriterion("ftp_receive_port is not null");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortEqualTo(Integer value) {
            addCriterion("ftp_receive_port =", value, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortNotEqualTo(Integer value) {
            addCriterion("ftp_receive_port <>", value, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortGreaterThan(Integer value) {
            addCriterion("ftp_receive_port >", value, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftp_receive_port >=", value, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortLessThan(Integer value) {
            addCriterion("ftp_receive_port <", value, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortLessThanOrEqualTo(Integer value) {
            addCriterion("ftp_receive_port <=", value, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortIn(List<Integer> values) {
            addCriterion("ftp_receive_port in", values, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortNotIn(List<Integer> values) {
            addCriterion("ftp_receive_port not in", values, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortBetween(Integer value1, Integer value2) {
            addCriterion("ftp_receive_port between", value1, value2, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceivePortNotBetween(Integer value1, Integer value2) {
            addCriterion("ftp_receive_port not between", value1, value2, "ftpReceivePort");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryIsNull() {
            addCriterion("ftp_receive_directory is null");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryIsNotNull() {
            addCriterion("ftp_receive_directory is not null");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryEqualTo(String value) {
            addCriterion("ftp_receive_directory =", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryNotEqualTo(String value) {
            addCriterion("ftp_receive_directory <>", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryGreaterThan(String value) {
            addCriterion("ftp_receive_directory >", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_receive_directory >=", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryLessThan(String value) {
            addCriterion("ftp_receive_directory <", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryLessThanOrEqualTo(String value) {
            addCriterion("ftp_receive_directory <=", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryLike(String value) {
            addCriterion("ftp_receive_directory like", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryNotLike(String value) {
            addCriterion("ftp_receive_directory not like", value, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryIn(List<String> values) {
            addCriterion("ftp_receive_directory in", values, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryNotIn(List<String> values) {
            addCriterion("ftp_receive_directory not in", values, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryBetween(String value1, String value2) {
            addCriterion("ftp_receive_directory between", value1, value2, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpReceiveDirectoryNotBetween(String value1, String value2) {
            addCriterion("ftp_receive_directory not between", value1, value2, "ftpReceiveDirectory");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountIsNull() {
            addCriterion("ftp_send_account is null");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountIsNotNull() {
            addCriterion("ftp_send_account is not null");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountEqualTo(String value) {
            addCriterion("ftp_send_account =", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountNotEqualTo(String value) {
            addCriterion("ftp_send_account <>", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountGreaterThan(String value) {
            addCriterion("ftp_send_account >", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_send_account >=", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountLessThan(String value) {
            addCriterion("ftp_send_account <", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountLessThanOrEqualTo(String value) {
            addCriterion("ftp_send_account <=", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountLike(String value) {
            addCriterion("ftp_send_account like", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountNotLike(String value) {
            addCriterion("ftp_send_account not like", value, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountIn(List<String> values) {
            addCriterion("ftp_send_account in", values, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountNotIn(List<String> values) {
            addCriterion("ftp_send_account not in", values, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountBetween(String value1, String value2) {
            addCriterion("ftp_send_account between", value1, value2, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendAccountNotBetween(String value1, String value2) {
            addCriterion("ftp_send_account not between", value1, value2, "ftpSendAccount");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdIsNull() {
            addCriterion("ftp_send_pwd is null");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdIsNotNull() {
            addCriterion("ftp_send_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdEqualTo(String value) {
            addCriterion("ftp_send_pwd =", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdNotEqualTo(String value) {
            addCriterion("ftp_send_pwd <>", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdGreaterThan(String value) {
            addCriterion("ftp_send_pwd >", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ftp_send_pwd >=", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdLessThan(String value) {
            addCriterion("ftp_send_pwd <", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdLessThanOrEqualTo(String value) {
            addCriterion("ftp_send_pwd <=", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdLike(String value) {
            addCriterion("ftp_send_pwd like", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdNotLike(String value) {
            addCriterion("ftp_send_pwd not like", value, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdIn(List<String> values) {
            addCriterion("ftp_send_pwd in", values, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdNotIn(List<String> values) {
            addCriterion("ftp_send_pwd not in", values, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdBetween(String value1, String value2) {
            addCriterion("ftp_send_pwd between", value1, value2, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andFtpSendPwdNotBetween(String value1, String value2) {
            addCriterion("ftp_send_pwd not between", value1, value2, "ftpSendPwd");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressIsNull() {
            addCriterion("send_email_address is null");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressIsNotNull() {
            addCriterion("send_email_address is not null");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressEqualTo(String value) {
            addCriterion("send_email_address =", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressNotEqualTo(String value) {
            addCriterion("send_email_address <>", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressGreaterThan(String value) {
            addCriterion("send_email_address >", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("send_email_address >=", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressLessThan(String value) {
            addCriterion("send_email_address <", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("send_email_address <=", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressLike(String value) {
            addCriterion("send_email_address like", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressNotLike(String value) {
            addCriterion("send_email_address not like", value, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressIn(List<String> values) {
            addCriterion("send_email_address in", values, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressNotIn(List<String> values) {
            addCriterion("send_email_address not in", values, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressBetween(String value1, String value2) {
            addCriterion("send_email_address between", value1, value2, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendEmailAddressNotBetween(String value1, String value2) {
            addCriterion("send_email_address not between", value1, value2, "sendEmailAddress");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentIsNull() {
            addCriterion("send_smtp_content is null");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentIsNotNull() {
            addCriterion("send_smtp_content is not null");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentEqualTo(String value) {
            addCriterion("send_smtp_content =", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentNotEqualTo(String value) {
            addCriterion("send_smtp_content <>", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentGreaterThan(String value) {
            addCriterion("send_smtp_content >", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentGreaterThanOrEqualTo(String value) {
            addCriterion("send_smtp_content >=", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentLessThan(String value) {
            addCriterion("send_smtp_content <", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentLessThanOrEqualTo(String value) {
            addCriterion("send_smtp_content <=", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentLike(String value) {
            addCriterion("send_smtp_content like", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentNotLike(String value) {
            addCriterion("send_smtp_content not like", value, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentIn(List<String> values) {
            addCriterion("send_smtp_content in", values, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentNotIn(List<String> values) {
            addCriterion("send_smtp_content not in", values, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentBetween(String value1, String value2) {
            addCriterion("send_smtp_content between", value1, value2, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpContentNotBetween(String value1, String value2) {
            addCriterion("send_smtp_content not between", value1, value2, "sendSmtpContent");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortIsNull() {
            addCriterion("send_smtp_port is null");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortIsNotNull() {
            addCriterion("send_smtp_port is not null");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortEqualTo(Integer value) {
            addCriterion("send_smtp_port =", value, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortNotEqualTo(Integer value) {
            addCriterion("send_smtp_port <>", value, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortGreaterThan(Integer value) {
            addCriterion("send_smtp_port >", value, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_smtp_port >=", value, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortLessThan(Integer value) {
            addCriterion("send_smtp_port <", value, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortLessThanOrEqualTo(Integer value) {
            addCriterion("send_smtp_port <=", value, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortIn(List<Integer> values) {
            addCriterion("send_smtp_port in", values, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortNotIn(List<Integer> values) {
            addCriterion("send_smtp_port not in", values, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortBetween(Integer value1, Integer value2) {
            addCriterion("send_smtp_port between", value1, value2, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andSendSmtpPortNotBetween(Integer value1, Integer value2) {
            addCriterion("send_smtp_port not between", value1, value2, "sendSmtpPort");
            return (Criteria) this;
        }

        public Criteria andEmailUserIsNull() {
            addCriterion("email_user is null");
            return (Criteria) this;
        }

        public Criteria andEmailUserIsNotNull() {
            addCriterion("email_user is not null");
            return (Criteria) this;
        }

        public Criteria andEmailUserEqualTo(String value) {
            addCriterion("email_user =", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserNotEqualTo(String value) {
            addCriterion("email_user <>", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserGreaterThan(String value) {
            addCriterion("email_user >", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserGreaterThanOrEqualTo(String value) {
            addCriterion("email_user >=", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserLessThan(String value) {
            addCriterion("email_user <", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserLessThanOrEqualTo(String value) {
            addCriterion("email_user <=", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserLike(String value) {
            addCriterion("email_user like", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserNotLike(String value) {
            addCriterion("email_user not like", value, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserIn(List<String> values) {
            addCriterion("email_user in", values, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserNotIn(List<String> values) {
            addCriterion("email_user not in", values, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserBetween(String value1, String value2) {
            addCriterion("email_user between", value1, value2, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailUserNotBetween(String value1, String value2) {
            addCriterion("email_user not between", value1, value2, "emailUser");
            return (Criteria) this;
        }

        public Criteria andEmailPwdIsNull() {
            addCriterion("email_pwd is null");
            return (Criteria) this;
        }

        public Criteria andEmailPwdIsNotNull() {
            addCriterion("email_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPwdEqualTo(String value) {
            addCriterion("email_pwd =", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotEqualTo(String value) {
            addCriterion("email_pwd <>", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdGreaterThan(String value) {
            addCriterion("email_pwd >", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdGreaterThanOrEqualTo(String value) {
            addCriterion("email_pwd >=", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdLessThan(String value) {
            addCriterion("email_pwd <", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdLessThanOrEqualTo(String value) {
            addCriterion("email_pwd <=", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdLike(String value) {
            addCriterion("email_pwd like", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotLike(String value) {
            addCriterion("email_pwd not like", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdIn(List<String> values) {
            addCriterion("email_pwd in", values, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotIn(List<String> values) {
            addCriterion("email_pwd not in", values, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdBetween(String value1, String value2) {
            addCriterion("email_pwd between", value1, value2, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotBetween(String value1, String value2) {
            addCriterion("email_pwd not between", value1, value2, "emailPwd");
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