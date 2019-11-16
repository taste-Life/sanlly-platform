package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareLaborInformationStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareLaborInformationStaffExample() {
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

        public Criteria andWareLaborInformationStaffIdIsNull() {
            addCriterion("ware_labor_information_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdIsNotNull() {
            addCriterion("ware_labor_information_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdEqualTo(Integer value) {
            addCriterion("ware_labor_information_staff_id =", value, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdNotEqualTo(Integer value) {
            addCriterion("ware_labor_information_staff_id <>", value, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdGreaterThan(Integer value) {
            addCriterion("ware_labor_information_staff_id >", value, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_information_staff_id >=", value, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdLessThan(Integer value) {
            addCriterion("ware_labor_information_staff_id <", value, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_information_staff_id <=", value, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdIn(List<Integer> values) {
            addCriterion("ware_labor_information_staff_id in", values, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdNotIn(List<Integer> values) {
            addCriterion("ware_labor_information_staff_id not in", values, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_information_staff_id between", value1, value2, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInformationStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_information_staff_id not between", value1, value2, "wareLaborInformationStaffId");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoIsNull() {
            addCriterion("labaor_insurance_no is null");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoIsNotNull() {
            addCriterion("labaor_insurance_no is not null");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoEqualTo(String value) {
            addCriterion("labaor_insurance_no =", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoNotEqualTo(String value) {
            addCriterion("labaor_insurance_no <>", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoGreaterThan(String value) {
            addCriterion("labaor_insurance_no >", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoGreaterThanOrEqualTo(String value) {
            addCriterion("labaor_insurance_no >=", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoLessThan(String value) {
            addCriterion("labaor_insurance_no <", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoLessThanOrEqualTo(String value) {
            addCriterion("labaor_insurance_no <=", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoLike(String value) {
            addCriterion("labaor_insurance_no like", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoNotLike(String value) {
            addCriterion("labaor_insurance_no not like", value, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoIn(List<String> values) {
            addCriterion("labaor_insurance_no in", values, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoNotIn(List<String> values) {
            addCriterion("labaor_insurance_no not in", values, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoBetween(String value1, String value2) {
            addCriterion("labaor_insurance_no between", value1, value2, "labaorInsuranceNo");
            return (Criteria) this;
        }

        public Criteria andLabaorInsuranceNoNotBetween(String value1, String value2) {
            addCriterion("labaor_insurance_no not between", value1, value2, "labaorInsuranceNo");
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

        public Criteria andUserIsNull() {
            addCriterion("`user` is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("`user` is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Integer value) {
            addCriterion("`user` =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Integer value) {
            addCriterion("`user` <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Integer value) {
            addCriterion("`user` >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("`user` >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Integer value) {
            addCriterion("`user` <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Integer value) {
            addCriterion("`user` <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Integer> values) {
            addCriterion("`user` in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Integer> values) {
            addCriterion("`user` not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Integer value1, Integer value2) {
            addCriterion("`user` between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Integer value1, Integer value2) {
            addCriterion("`user` not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andSummerWearIsNull() {
            addCriterion("summer_wear is null");
            return (Criteria) this;
        }

        public Criteria andSummerWearIsNotNull() {
            addCriterion("summer_wear is not null");
            return (Criteria) this;
        }

        public Criteria andSummerWearEqualTo(String value) {
            addCriterion("summer_wear =", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearNotEqualTo(String value) {
            addCriterion("summer_wear <>", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearGreaterThan(String value) {
            addCriterion("summer_wear >", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearGreaterThanOrEqualTo(String value) {
            addCriterion("summer_wear >=", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearLessThan(String value) {
            addCriterion("summer_wear <", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearLessThanOrEqualTo(String value) {
            addCriterion("summer_wear <=", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearLike(String value) {
            addCriterion("summer_wear like", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearNotLike(String value) {
            addCriterion("summer_wear not like", value, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearIn(List<String> values) {
            addCriterion("summer_wear in", values, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearNotIn(List<String> values) {
            addCriterion("summer_wear not in", values, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearBetween(String value1, String value2) {
            addCriterion("summer_wear between", value1, value2, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSummerWearNotBetween(String value1, String value2) {
            addCriterion("summer_wear not between", value1, value2, "summerWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearIsNull() {
            addCriterion("spring_autumn_wear is null");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearIsNotNull() {
            addCriterion("spring_autumn_wear is not null");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearEqualTo(String value) {
            addCriterion("spring_autumn_wear =", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearNotEqualTo(String value) {
            addCriterion("spring_autumn_wear <>", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearGreaterThan(String value) {
            addCriterion("spring_autumn_wear >", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearGreaterThanOrEqualTo(String value) {
            addCriterion("spring_autumn_wear >=", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearLessThan(String value) {
            addCriterion("spring_autumn_wear <", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearLessThanOrEqualTo(String value) {
            addCriterion("spring_autumn_wear <=", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearLike(String value) {
            addCriterion("spring_autumn_wear like", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearNotLike(String value) {
            addCriterion("spring_autumn_wear not like", value, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearIn(List<String> values) {
            addCriterion("spring_autumn_wear in", values, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearNotIn(List<String> values) {
            addCriterion("spring_autumn_wear not in", values, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearBetween(String value1, String value2) {
            addCriterion("spring_autumn_wear between", value1, value2, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andSpringAutumnWearNotBetween(String value1, String value2) {
            addCriterion("spring_autumn_wear not between", value1, value2, "springAutumnWear");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesIsNull() {
            addCriterion("cotton_padded_clothes is null");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesIsNotNull() {
            addCriterion("cotton_padded_clothes is not null");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesEqualTo(String value) {
            addCriterion("cotton_padded_clothes =", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesNotEqualTo(String value) {
            addCriterion("cotton_padded_clothes <>", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesGreaterThan(String value) {
            addCriterion("cotton_padded_clothes >", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesGreaterThanOrEqualTo(String value) {
            addCriterion("cotton_padded_clothes >=", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesLessThan(String value) {
            addCriterion("cotton_padded_clothes <", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesLessThanOrEqualTo(String value) {
            addCriterion("cotton_padded_clothes <=", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesLike(String value) {
            addCriterion("cotton_padded_clothes like", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesNotLike(String value) {
            addCriterion("cotton_padded_clothes not like", value, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesIn(List<String> values) {
            addCriterion("cotton_padded_clothes in", values, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesNotIn(List<String> values) {
            addCriterion("cotton_padded_clothes not in", values, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesBetween(String value1, String value2) {
            addCriterion("cotton_padded_clothes between", value1, value2, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedClothesNotBetween(String value1, String value2) {
            addCriterion("cotton_padded_clothes not between", value1, value2, "cottonPaddedClothes");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortIsNull() {
            addCriterion("steel_headed_shoes_short is null");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortIsNotNull() {
            addCriterion("steel_headed_shoes_short is not null");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_short =", value, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortNotEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_short <>", value, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortGreaterThan(Integer value) {
            addCriterion("steel_headed_shoes_short >", value, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortGreaterThanOrEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_short >=", value, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortLessThan(Integer value) {
            addCriterion("steel_headed_shoes_short <", value, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortLessThanOrEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_short <=", value, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortIn(List<Integer> values) {
            addCriterion("steel_headed_shoes_short in", values, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortNotIn(List<Integer> values) {
            addCriterion("steel_headed_shoes_short not in", values, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortBetween(Integer value1, Integer value2) {
            addCriterion("steel_headed_shoes_short between", value1, value2, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesShortNotBetween(Integer value1, Integer value2) {
            addCriterion("steel_headed_shoes_short not between", value1, value2, "steelHeadedShoesShort");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighIsNull() {
            addCriterion("steel_headed_shoes_high is null");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighIsNotNull() {
            addCriterion("steel_headed_shoes_high is not null");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_high =", value, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighNotEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_high <>", value, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighGreaterThan(Integer value) {
            addCriterion("steel_headed_shoes_high >", value, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_high >=", value, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighLessThan(Integer value) {
            addCriterion("steel_headed_shoes_high <", value, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighLessThanOrEqualTo(Integer value) {
            addCriterion("steel_headed_shoes_high <=", value, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighIn(List<Integer> values) {
            addCriterion("steel_headed_shoes_high in", values, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighNotIn(List<Integer> values) {
            addCriterion("steel_headed_shoes_high not in", values, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighBetween(Integer value1, Integer value2) {
            addCriterion("steel_headed_shoes_high between", value1, value2, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andSteelHeadedShoesHighNotBetween(Integer value1, Integer value2) {
            addCriterion("steel_headed_shoes_high not between", value1, value2, "steelHeadedShoesHigh");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesIsNull() {
            addCriterion("insulating_shoes is null");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesIsNotNull() {
            addCriterion("insulating_shoes is not null");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesEqualTo(Integer value) {
            addCriterion("insulating_shoes =", value, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesNotEqualTo(Integer value) {
            addCriterion("insulating_shoes <>", value, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesGreaterThan(Integer value) {
            addCriterion("insulating_shoes >", value, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesGreaterThanOrEqualTo(Integer value) {
            addCriterion("insulating_shoes >=", value, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesLessThan(Integer value) {
            addCriterion("insulating_shoes <", value, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesLessThanOrEqualTo(Integer value) {
            addCriterion("insulating_shoes <=", value, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesIn(List<Integer> values) {
            addCriterion("insulating_shoes in", values, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesNotIn(List<Integer> values) {
            addCriterion("insulating_shoes not in", values, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesBetween(Integer value1, Integer value2) {
            addCriterion("insulating_shoes between", value1, value2, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andInsulatingShoesNotBetween(Integer value1, Integer value2) {
            addCriterion("insulating_shoes not between", value1, value2, "insulatingShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesIsNull() {
            addCriterion("cotton_padded_shoes is null");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesIsNotNull() {
            addCriterion("cotton_padded_shoes is not null");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesEqualTo(Integer value) {
            addCriterion("cotton_padded_shoes =", value, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesNotEqualTo(Integer value) {
            addCriterion("cotton_padded_shoes <>", value, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesGreaterThan(Integer value) {
            addCriterion("cotton_padded_shoes >", value, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotton_padded_shoes >=", value, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesLessThan(Integer value) {
            addCriterion("cotton_padded_shoes <", value, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesLessThanOrEqualTo(Integer value) {
            addCriterion("cotton_padded_shoes <=", value, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesIn(List<Integer> values) {
            addCriterion("cotton_padded_shoes in", values, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesNotIn(List<Integer> values) {
            addCriterion("cotton_padded_shoes not in", values, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesBetween(Integer value1, Integer value2) {
            addCriterion("cotton_padded_shoes between", value1, value2, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andCottonPaddedShoesNotBetween(Integer value1, Integer value2) {
            addCriterion("cotton_padded_shoes not between", value1, value2, "cottonPaddedShoes");
            return (Criteria) this;
        }

        public Criteria andRainCoatIsNull() {
            addCriterion("rain_coat is null");
            return (Criteria) this;
        }

        public Criteria andRainCoatIsNotNull() {
            addCriterion("rain_coat is not null");
            return (Criteria) this;
        }

        public Criteria andRainCoatEqualTo(String value) {
            addCriterion("rain_coat =", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatNotEqualTo(String value) {
            addCriterion("rain_coat <>", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatGreaterThan(String value) {
            addCriterion("rain_coat >", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatGreaterThanOrEqualTo(String value) {
            addCriterion("rain_coat >=", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatLessThan(String value) {
            addCriterion("rain_coat <", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatLessThanOrEqualTo(String value) {
            addCriterion("rain_coat <=", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatLike(String value) {
            addCriterion("rain_coat like", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatNotLike(String value) {
            addCriterion("rain_coat not like", value, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatIn(List<String> values) {
            addCriterion("rain_coat in", values, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatNotIn(List<String> values) {
            addCriterion("rain_coat not in", values, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatBetween(String value1, String value2) {
            addCriterion("rain_coat between", value1, value2, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainCoatNotBetween(String value1, String value2) {
            addCriterion("rain_coat not between", value1, value2, "rainCoat");
            return (Criteria) this;
        }

        public Criteria andRainShoesIsNull() {
            addCriterion("rain_shoes is null");
            return (Criteria) this;
        }

        public Criteria andRainShoesIsNotNull() {
            addCriterion("rain_shoes is not null");
            return (Criteria) this;
        }

        public Criteria andRainShoesEqualTo(Integer value) {
            addCriterion("rain_shoes =", value, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesNotEqualTo(Integer value) {
            addCriterion("rain_shoes <>", value, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesGreaterThan(Integer value) {
            addCriterion("rain_shoes >", value, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesGreaterThanOrEqualTo(Integer value) {
            addCriterion("rain_shoes >=", value, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesLessThan(Integer value) {
            addCriterion("rain_shoes <", value, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesLessThanOrEqualTo(Integer value) {
            addCriterion("rain_shoes <=", value, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesIn(List<Integer> values) {
            addCriterion("rain_shoes in", values, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesNotIn(List<Integer> values) {
            addCriterion("rain_shoes not in", values, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesBetween(Integer value1, Integer value2) {
            addCriterion("rain_shoes between", value1, value2, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andRainShoesNotBetween(Integer value1, Integer value2) {
            addCriterion("rain_shoes not between", value1, value2, "rainShoes");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeIsNull() {
            addCriterion("initiation_time is null");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeIsNotNull() {
            addCriterion("initiation_time is not null");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeEqualTo(Date value) {
            addCriterion("initiation_time =", value, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeNotEqualTo(Date value) {
            addCriterion("initiation_time <>", value, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeGreaterThan(Date value) {
            addCriterion("initiation_time >", value, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("initiation_time >=", value, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeLessThan(Date value) {
            addCriterion("initiation_time <", value, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeLessThanOrEqualTo(Date value) {
            addCriterion("initiation_time <=", value, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeIn(List<Date> values) {
            addCriterion("initiation_time in", values, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeNotIn(List<Date> values) {
            addCriterion("initiation_time not in", values, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeBetween(Date value1, Date value2) {
            addCriterion("initiation_time between", value1, value2, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andInitiationTimeNotBetween(Date value1, Date value2) {
            addCriterion("initiation_time not between", value1, value2, "initiationTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(String value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(String value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(String value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(String value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(String value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLike(String value) {
            addCriterion("is_enabled like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotLike(String value) {
            addCriterion("is_enabled not like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<String> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<String> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(String value1, String value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(String value1, String value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
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

        public Criteria andIsLeaveIsNull() {
            addCriterion("is_leave is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIsNotNull() {
            addCriterion("is_leave is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveEqualTo(String value) {
            addCriterion("is_leave =", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotEqualTo(String value) {
            addCriterion("is_leave <>", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveGreaterThan(String value) {
            addCriterion("is_leave >", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveGreaterThanOrEqualTo(String value) {
            addCriterion("is_leave >=", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLessThan(String value) {
            addCriterion("is_leave <", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLessThanOrEqualTo(String value) {
            addCriterion("is_leave <=", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLike(String value) {
            addCriterion("is_leave like", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotLike(String value) {
            addCriterion("is_leave not like", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIn(List<String> values) {
            addCriterion("is_leave in", values, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotIn(List<String> values) {
            addCriterion("is_leave not in", values, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveBetween(String value1, String value2) {
            addCriterion("is_leave between", value1, value2, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotBetween(String value1, String value2) {
            addCriterion("is_leave not between", value1, value2, "isLeave");
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