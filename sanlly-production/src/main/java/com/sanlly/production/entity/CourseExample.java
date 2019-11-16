package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CourseExample() {
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

    public CourseExample setOrderByProdCourseIdAsc() {
        this.orderByClause=this.orderByClause==null?"prod_course_id":(this.orderByClause+",prod_course_id");
        return this;
    }

    public CourseExample setOrderByProdCourseIdDesc() {
        this.orderByClause=this.orderByClause==null?"prod_course_id desc":(this.orderByClause+",prod_course_id desc");
        return this;
    }

    public CourseExample setOrderByContainerNoAsc() {
        this.orderByClause=this.orderByClause==null?"container_no":(this.orderByClause+",container_no");
        return this;
    }

    public CourseExample setOrderByContainerNoDesc() {
        this.orderByClause=this.orderByClause==null?"container_no desc":(this.orderByClause+",container_no desc");
        return this;
    }

    public CourseExample setOrderByIsPreviewAsc() {
        this.orderByClause=this.orderByClause==null?"is_preview":(this.orderByClause+",is_preview");
        return this;
    }

    public CourseExample setOrderByIsPreviewDesc() {
        this.orderByClause=this.orderByClause==null?"is_preview desc":(this.orderByClause+",is_preview desc");
        return this;
    }

    public CourseExample setOrderBySizeAsc() {
        this.orderByClause=this.orderByClause==null?"size":(this.orderByClause+",size");
        return this;
    }

    public CourseExample setOrderBySizeDesc() {
        this.orderByClause=this.orderByClause==null?"size desc":(this.orderByClause+",size desc");
        return this;
    }

    public CourseExample setOrderByContainerCategoryAsc() {
        this.orderByClause=this.orderByClause==null?"container_category":(this.orderByClause+",container_category");
        return this;
    }

    public CourseExample setOrderByContainerCategoryDesc() {
        this.orderByClause=this.orderByClause==null?"container_category desc":(this.orderByClause+",container_category desc");
        return this;
    }

    public CourseExample setOrderByContainerTypeAsc() {
        this.orderByClause=this.orderByClause==null?"container_type":(this.orderByClause+",container_type");
        return this;
    }

    public CourseExample setOrderByContainerTypeDesc() {
        this.orderByClause=this.orderByClause==null?"container_type desc":(this.orderByClause+",container_type desc");
        return this;
    }

    public CourseExample setOrderByContainerAgeAsc() {
        this.orderByClause=this.orderByClause==null?"container_age":(this.orderByClause+",container_age");
        return this;
    }

    public CourseExample setOrderByContainerAgeDesc() {
        this.orderByClause=this.orderByClause==null?"container_age desc":(this.orderByClause+",container_age desc");
        return this;
    }

    public CourseExample setOrderByContainerTareAsc() {
        this.orderByClause=this.orderByClause==null?"container_tare":(this.orderByClause+",container_tare");
        return this;
    }

    public CourseExample setOrderByContainerTareDesc() {
        this.orderByClause=this.orderByClause==null?"container_tare desc":(this.orderByClause+",container_tare desc");
        return this;
    }

    public CourseExample setOrderByContainerLoadAsc() {
        this.orderByClause=this.orderByClause==null?"container_load":(this.orderByClause+",container_load");
        return this;
    }

    public CourseExample setOrderByContainerLoadDesc() {
        this.orderByClause=this.orderByClause==null?"container_load desc":(this.orderByClause+",container_load desc");
        return this;
    }

    public CourseExample setOrderByContainerVolumeAsc() {
        this.orderByClause=this.orderByClause==null?"container_volume":(this.orderByClause+",container_volume");
        return this;
    }

    public CourseExample setOrderByContainerVolumeDesc() {
        this.orderByClause=this.orderByClause==null?"container_volume desc":(this.orderByClause+",container_volume desc");
        return this;
    }

    public CourseExample setOrderByGrossWeightAsc() {
        this.orderByClause=this.orderByClause==null?"gross_weight":(this.orderByClause+",gross_weight");
        return this;
    }

    public CourseExample setOrderByGrossWeightDesc() {
        this.orderByClause=this.orderByClause==null?"gross_weight desc":(this.orderByClause+",gross_weight desc");
        return this;
    }

    public CourseExample setOrderByUnitTypeAsc() {
        this.orderByClause=this.orderByClause==null?"unit_type":(this.orderByClause+",unit_type");
        return this;
    }

    public CourseExample setOrderByUnitTypeDesc() {
        this.orderByClause=this.orderByClause==null?"unit_type desc":(this.orderByClause+",unit_type desc");
        return this;
    }

    public CourseExample setOrderByRightAngleAsc() {
        this.orderByClause=this.orderByClause==null?"right_angle":(this.orderByClause+",right_angle");
        return this;
    }

    public CourseExample setOrderByRightAngleDesc() {
        this.orderByClause=this.orderByClause==null?"right_angle desc":(this.orderByClause+",right_angle desc");
        return this;
    }

    public CourseExample setOrderByIsLabelAsc() {
        this.orderByClause=this.orderByClause==null?"is_label":(this.orderByClause+",is_label");
        return this;
    }

    public CourseExample setOrderByIsLabelDesc() {
        this.orderByClause=this.orderByClause==null?"is_label desc":(this.orderByClause+",is_label desc");
        return this;
    }

    public CourseExample setOrderByContainerOwnerAsc() {
        this.orderByClause=this.orderByClause==null?"container_owner":(this.orderByClause+",container_owner");
        return this;
    }

    public CourseExample setOrderByContainerOwnerDesc() {
        this.orderByClause=this.orderByClause==null?"container_owner desc":(this.orderByClause+",container_owner desc");
        return this;
    }

    public CourseExample setOrderByContainerBelongAsc() {
        this.orderByClause=this.orderByClause==null?"container_belong":(this.orderByClause+",container_belong");
        return this;
    }

    public CourseExample setOrderByContainerBelongDesc() {
        this.orderByClause=this.orderByClause==null?"container_belong desc":(this.orderByClause+",container_belong desc");
        return this;
    }

    public CourseExample setOrderByContainerUserAsc() {
        this.orderByClause=this.orderByClause==null?"container_user":(this.orderByClause+",container_user");
        return this;
    }

    public CourseExample setOrderByContainerUserDesc() {
        this.orderByClause=this.orderByClause==null?"container_user desc":(this.orderByClause+",container_user desc");
        return this;
    }

    public CourseExample setOrderByContainerGradeAsc() {
        this.orderByClause=this.orderByClause==null?"container_grade":(this.orderByClause+",container_grade");
        return this;
    }

    public CourseExample setOrderByContainerGradeDesc() {
        this.orderByClause=this.orderByClause==null?"container_grade desc":(this.orderByClause+",container_grade desc");
        return this;
    }

    public CourseExample setOrderByContainerConditionAsc() {
        this.orderByClause=this.orderByClause==null?"container_condition":(this.orderByClause+",container_condition");
        return this;
    }

    public CourseExample setOrderByContainerConditionDesc() {
        this.orderByClause=this.orderByClause==null?"container_condition desc":(this.orderByClause+",container_condition desc");
        return this;
    }

    public CourseExample setOrderByBillOfLadingNoAsc() {
        this.orderByClause=this.orderByClause==null?"bill_of_lading_no":(this.orderByClause+",bill_of_lading_no");
        return this;
    }

    public CourseExample setOrderByBillOfLadingNoDesc() {
        this.orderByClause=this.orderByClause==null?"bill_of_lading_no desc":(this.orderByClause+",bill_of_lading_no desc");
        return this;
    }

    public CourseExample setOrderByVesselVoyageAsc() {
        this.orderByClause=this.orderByClause==null?"vessel_voyage":(this.orderByClause+",vessel_voyage");
        return this;
    }

    public CourseExample setOrderByVesselVoyageDesc() {
        this.orderByClause=this.orderByClause==null?"vessel_voyage desc":(this.orderByClause+",vessel_voyage desc");
        return this;
    }

    public CourseExample setOrderByDomesticForeignTradeAsc() {
        this.orderByClause=this.orderByClause==null?"domestic_foreign_trade":(this.orderByClause+",domestic_foreign_trade");
        return this;
    }

    public CourseExample setOrderByDomesticForeignTradeDesc() {
        this.orderByClause=this.orderByClause==null?"domestic_foreign_trade desc":(this.orderByClause+",domestic_foreign_trade desc");
        return this;
    }

    public CourseExample setOrderByIsGonContainerAsc() {
        this.orderByClause=this.orderByClause==null?"is_gon_container":(this.orderByClause+",is_gon_container");
        return this;
    }

    public CourseExample setOrderByIsGonContainerDesc() {
        this.orderByClause=this.orderByClause==null?"is_gon_container desc":(this.orderByClause+",is_gon_container desc");
        return this;
    }

    public CourseExample setOrderByIsFreezeDryAsc() {
        this.orderByClause=this.orderByClause==null?"is_freeze_dry":(this.orderByClause+",is_freeze_dry");
        return this;
    }

    public CourseExample setOrderByIsFreezeDryDesc() {
        this.orderByClause=this.orderByClause==null?"is_freeze_dry desc":(this.orderByClause+",is_freeze_dry desc");
        return this;
    }

    public CourseExample setOrderByIsSurrenderAsc() {
        this.orderByClause=this.orderByClause==null?"is_surrender":(this.orderByClause+",is_surrender");
        return this;
    }

    public CourseExample setOrderByIsSurrenderDesc() {
        this.orderByClause=this.orderByClause==null?"is_surrender desc":(this.orderByClause+",is_surrender desc");
        return this;
    }

    public CourseExample setOrderBySurrenderCourseAsc() {
        this.orderByClause=this.orderByClause==null?"surrender_course":(this.orderByClause+",surrender_course");
        return this;
    }

    public CourseExample setOrderBySurrenderCourseDesc() {
        this.orderByClause=this.orderByClause==null?"surrender_course desc":(this.orderByClause+",surrender_course desc");
        return this;
    }

    public CourseExample setOrderByLabellingAsc() {
        this.orderByClause=this.orderByClause==null?"labelling":(this.orderByClause+",labelling");
        return this;
    }

    public CourseExample setOrderByLabellingDesc() {
        this.orderByClause=this.orderByClause==null?"labelling desc":(this.orderByClause+",labelling desc");
        return this;
    }

    public CourseExample setOrderByYardContainerTypeAsc() {
        this.orderByClause=this.orderByClause==null?"yard_container_type":(this.orderByClause+",yard_container_type");
        return this;
    }

    public CourseExample setOrderByYardContainerTypeDesc() {
        this.orderByClause=this.orderByClause==null?"yard_container_type desc":(this.orderByClause+",yard_container_type desc");
        return this;
    }

    public CourseExample setOrderByYardContGradeAsc() {
        this.orderByClause=this.orderByClause==null?"yard_cont_grade":(this.orderByClause+",yard_cont_grade");
        return this;
    }

    public CourseExample setOrderByYardContGradeDesc() {
        this.orderByClause=this.orderByClause==null?"yard_cont_grade desc":(this.orderByClause+",yard_cont_grade desc");
        return this;
    }

    public CourseExample setOrderByLeadSealingAsc() {
        this.orderByClause=this.orderByClause==null?"lead_sealing":(this.orderByClause+",lead_sealing");
        return this;
    }

    public CourseExample setOrderByLeadSealingDesc() {
        this.orderByClause=this.orderByClause==null?"lead_sealing desc":(this.orderByClause+",lead_sealing desc");
        return this;
    }

    public CourseExample setOrderByBareWeightAsc() {
        this.orderByClause=this.orderByClause==null?"bare_weight":(this.orderByClause+",bare_weight");
        return this;
    }

    public CourseExample setOrderByBareWeightDesc() {
        this.orderByClause=this.orderByClause==null?"bare_weight desc":(this.orderByClause+",bare_weight desc");
        return this;
    }

    public CourseExample setOrderByIsCleanoutAsc() {
        this.orderByClause=this.orderByClause==null?"is_cleanout":(this.orderByClause+",is_cleanout");
        return this;
    }

    public CourseExample setOrderByIsCleanoutDesc() {
        this.orderByClause=this.orderByClause==null?"is_cleanout desc":(this.orderByClause+",is_cleanout desc");
        return this;
    }

    public CourseExample setOrderByIsLocatorAsc() {
        this.orderByClause=this.orderByClause==null?"is_locator":(this.orderByClause+",is_locator");
        return this;
    }

    public CourseExample setOrderByIsLocatorDesc() {
        this.orderByClause=this.orderByClause==null?"is_locator desc":(this.orderByClause+",is_locator desc");
        return this;
    }

    public CourseExample setOrderByMotorcadeAsc() {
        this.orderByClause=this.orderByClause==null?"motorcade":(this.orderByClause+",motorcade");
        return this;
    }

    public CourseExample setOrderByMotorcadeDesc() {
        this.orderByClause=this.orderByClause==null?"motorcade desc":(this.orderByClause+",motorcade desc");
        return this;
    }

    public CourseExample setOrderByCarNumberAsc() {
        this.orderByClause=this.orderByClause==null?"car_number":(this.orderByClause+",car_number");
        return this;
    }

    public CourseExample setOrderByCarNumberDesc() {
        this.orderByClause=this.orderByClause==null?"car_number desc":(this.orderByClause+",car_number desc");
        return this;
    }

    public CourseExample setOrderByYardAsc() {
        this.orderByClause=this.orderByClause==null?"yard":(this.orderByClause+",yard");
        return this;
    }

    public CourseExample setOrderByYardDesc() {
        this.orderByClause=this.orderByClause==null?"yard desc":(this.orderByClause+",yard desc");
        return this;
    }

    public CourseExample setOrderByCourseTypeAsc() {
        this.orderByClause=this.orderByClause==null?"course_type":(this.orderByClause+",course_type");
        return this;
    }

    public CourseExample setOrderByCourseTypeDesc() {
        this.orderByClause=this.orderByClause==null?"course_type desc":(this.orderByClause+",course_type desc");
        return this;
    }

    public CourseExample setOrderByCourseTimeAsc() {
        this.orderByClause=this.orderByClause==null?"course_time":(this.orderByClause+",course_time");
        return this;
    }

    public CourseExample setOrderByCourseTimeDesc() {
        this.orderByClause=this.orderByClause==null?"course_time desc":(this.orderByClause+",course_time desc");
        return this;
    }

    public CourseExample setOrderByTestingUserAsc() {
        this.orderByClause=this.orderByClause==null?"testing_user":(this.orderByClause+",testing_user");
        return this;
    }

    public CourseExample setOrderByTestingUserDesc() {
        this.orderByClause=this.orderByClause==null?"testing_user desc":(this.orderByClause+",testing_user desc");
        return this;
    }

    public CourseExample setOrderByTestingStateAsc() {
        this.orderByClause=this.orderByClause==null?"testing_state":(this.orderByClause+",testing_state");
        return this;
    }

    public CourseExample setOrderByTestingStateDesc() {
        this.orderByClause=this.orderByClause==null?"testing_state desc":(this.orderByClause+",testing_state desc");
        return this;
    }

    public CourseExample setOrderByTestingRejectAsc() {
        this.orderByClause=this.orderByClause==null?"testing_reject":(this.orderByClause+",testing_reject");
        return this;
    }

    public CourseExample setOrderByTestingRejectDesc() {
        this.orderByClause=this.orderByClause==null?"testing_reject desc":(this.orderByClause+",testing_reject desc");
        return this;
    }

    public CourseExample setOrderByTestingTimeAsc() {
        this.orderByClause=this.orderByClause==null?"testing_time":(this.orderByClause+",testing_time");
        return this;
    }

    public CourseExample setOrderByTestingTimeDesc() {
        this.orderByClause=this.orderByClause==null?"testing_time desc":(this.orderByClause+",testing_time desc");
        return this;
    }

    public CourseExample setOrderByTestingEndTimeAsc() {
        this.orderByClause=this.orderByClause==null?"testing_end_time":(this.orderByClause+",testing_end_time");
        return this;
    }

    public CourseExample setOrderByTestingEndTimeDesc() {
        this.orderByClause=this.orderByClause==null?"testing_end_time desc":(this.orderByClause+",testing_end_time desc");
        return this;
    }

    public CourseExample setOrderByTestingManHourCostAsc() {
        this.orderByClause=this.orderByClause==null?"testing_man_hour_cost":(this.orderByClause+",testing_man_hour_cost");
        return this;
    }

    public CourseExample setOrderByTestingManHourCostDesc() {
        this.orderByClause=this.orderByClause==null?"testing_man_hour_cost desc":(this.orderByClause+",testing_man_hour_cost desc");
        return this;
    }

    public CourseExample setOrderByTestingMaterialCostAsc() {
        this.orderByClause=this.orderByClause==null?"testing_material_cost":(this.orderByClause+",testing_material_cost");
        return this;
    }

    public CourseExample setOrderByTestingMaterialCostDesc() {
        this.orderByClause=this.orderByClause==null?"testing_material_cost desc":(this.orderByClause+",testing_material_cost desc");
        return this;
    }

    public CourseExample setOrderByTestingThirdpartyMoneyAsc() {
        this.orderByClause=this.orderByClause==null?"testing_thirdparty_money":(this.orderByClause+",testing_thirdparty_money");
        return this;
    }

    public CourseExample setOrderByTestingThirdpartyMoneyDesc() {
        this.orderByClause=this.orderByClause==null?"testing_thirdparty_money desc":(this.orderByClause+",testing_thirdparty_money desc");
        return this;
    }

    public CourseExample setOrderByTestingMoneyAsc() {
        this.orderByClause=this.orderByClause==null?"testing_money":(this.orderByClause+",testing_money");
        return this;
    }

    public CourseExample setOrderByTestingMoneyDesc() {
        this.orderByClause=this.orderByClause==null?"testing_money desc":(this.orderByClause+",testing_money desc");
        return this;
    }

    public CourseExample setOrderByAuditTypeAsc() {
        this.orderByClause=this.orderByClause==null?"audit_type":(this.orderByClause+",audit_type");
        return this;
    }

    public CourseExample setOrderByAuditTypeDesc() {
        this.orderByClause=this.orderByClause==null?"audit_type desc":(this.orderByClause+",audit_type desc");
        return this;
    }

    public CourseExample setOrderByAuditUserAsc() {
        this.orderByClause=this.orderByClause==null?"audit_user":(this.orderByClause+",audit_user");
        return this;
    }

    public CourseExample setOrderByAuditUserDesc() {
        this.orderByClause=this.orderByClause==null?"audit_user desc":(this.orderByClause+",audit_user desc");
        return this;
    }

    public CourseExample setOrderByAuditTimeAsc() {
        this.orderByClause=this.orderByClause==null?"audit_time":(this.orderByClause+",audit_time");
        return this;
    }

    public CourseExample setOrderByAuditTimeDesc() {
        this.orderByClause=this.orderByClause==null?"audit_time desc":(this.orderByClause+",audit_time desc");
        return this;
    }

    public CourseExample setOrderByTestingRemarksAsc() {
        this.orderByClause=this.orderByClause==null?"testing_remarks":(this.orderByClause+",testing_remarks");
        return this;
    }

    public CourseExample setOrderByTestingRemarksDesc() {
        this.orderByClause=this.orderByClause==null?"testing_remarks desc":(this.orderByClause+",testing_remarks desc");
        return this;
    }

    public CourseExample setOrderBySurrenderTypeAsc() {
        this.orderByClause=this.orderByClause==null?"surrender_type":(this.orderByClause+",surrender_type");
        return this;
    }

    public CourseExample setOrderBySurrenderTypeDesc() {
        this.orderByClause=this.orderByClause==null?"surrender_type desc":(this.orderByClause+",surrender_type desc");
        return this;
    }

    public CourseExample setOrderBySurrenderBillTypeAsc() {
        this.orderByClause=this.orderByClause==null?"surrender_bill_type":(this.orderByClause+",surrender_bill_type");
        return this;
    }

    public CourseExample setOrderBySurrenderBillTypeDesc() {
        this.orderByClause=this.orderByClause==null?"surrender_bill_type desc":(this.orderByClause+",surrender_bill_type desc");
        return this;
    }

    public CourseExample setOrderByIsOwnerChargeAsc() {
        this.orderByClause=this.orderByClause==null?"is_owner_charge":(this.orderByClause+",is_owner_charge");
        return this;
    }

    public CourseExample setOrderByIsOwnerChargeDesc() {
        this.orderByClause=this.orderByClause==null?"is_owner_charge desc":(this.orderByClause+",is_owner_charge desc");
        return this;
    }

    public CourseExample setOrderByValuationNoAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_no":(this.orderByClause+",valuation_no");
        return this;
    }

    public CourseExample setOrderByValuationNoDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_no desc":(this.orderByClause+",valuation_no desc");
        return this;
    }

    public CourseExample setOrderByUseReplyStateAsc() {
        this.orderByClause=this.orderByClause==null?"use_reply_state":(this.orderByClause+",use_reply_state");
        return this;
    }

    public CourseExample setOrderByUseReplyStateDesc() {
        this.orderByClause=this.orderByClause==null?"use_reply_state desc":(this.orderByClause+",use_reply_state desc");
        return this;
    }

    public CourseExample setOrderByUseReplyTimeAsc() {
        this.orderByClause=this.orderByClause==null?"use_reply_time":(this.orderByClause+",use_reply_time");
        return this;
    }

    public CourseExample setOrderByUseReplyTimeDesc() {
        this.orderByClause=this.orderByClause==null?"use_reply_time desc":(this.orderByClause+",use_reply_time desc");
        return this;
    }

    public CourseExample setOrderByMasterReplyStateAsc() {
        this.orderByClause=this.orderByClause==null?"master_reply_state":(this.orderByClause+",master_reply_state");
        return this;
    }

    public CourseExample setOrderByMasterReplyStateDesc() {
        this.orderByClause=this.orderByClause==null?"master_reply_state desc":(this.orderByClause+",master_reply_state desc");
        return this;
    }

    public CourseExample setOrderByMasterReplyTimeAsc() {
        this.orderByClause=this.orderByClause==null?"master_reply_time":(this.orderByClause+",master_reply_time");
        return this;
    }

    public CourseExample setOrderByMasterReplyTimeDesc() {
        this.orderByClause=this.orderByClause==null?"master_reply_time desc":(this.orderByClause+",master_reply_time desc");
        return this;
    }

    public CourseExample setOrderByThirdpartyChargeStateAsc() {
        this.orderByClause=this.orderByClause==null?"thirdparty_charge_state":(this.orderByClause+",thirdparty_charge_state");
        return this;
    }

    public CourseExample setOrderByThirdpartyChargeStateDesc() {
        this.orderByClause=this.orderByClause==null?"thirdparty_charge_state desc":(this.orderByClause+",thirdparty_charge_state desc");
        return this;
    }

    public CourseExample setOrderByAlreadyUseContUserAsc() {
        this.orderByClause=this.orderByClause==null?"already_use_cont_user":(this.orderByClause+",already_use_cont_user");
        return this;
    }

    public CourseExample setOrderByAlreadyUseContUserDesc() {
        this.orderByClause=this.orderByClause==null?"already_use_cont_user desc":(this.orderByClause+",already_use_cont_user desc");
        return this;
    }

    public CourseExample setOrderByValuationCurrencyAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_currency":(this.orderByClause+",valuation_currency");
        return this;
    }

    public CourseExample setOrderByValuationCurrencyDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_currency desc":(this.orderByClause+",valuation_currency desc");
        return this;
    }

    public CourseExample setOrderByValuationManHourCostAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_man_hour_cost":(this.orderByClause+",valuation_man_hour_cost");
        return this;
    }

    public CourseExample setOrderByValuationManHourCostDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_man_hour_cost desc":(this.orderByClause+",valuation_man_hour_cost desc");
        return this;
    }

    public CourseExample setOrderByValuationMaterialCostAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_material_cost":(this.orderByClause+",valuation_material_cost");
        return this;
    }

    public CourseExample setOrderByValuationMaterialCostDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_material_cost desc":(this.orderByClause+",valuation_material_cost desc");
        return this;
    }

    public CourseExample setOrderByValuationThirdpartyMoneyAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_thirdparty_money":(this.orderByClause+",valuation_thirdparty_money");
        return this;
    }

    public CourseExample setOrderByValuationThirdpartyMoneyDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_thirdparty_money desc":(this.orderByClause+",valuation_thirdparty_money desc");
        return this;
    }

    public CourseExample setOrderByValuationMoneyAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_money":(this.orderByClause+",valuation_money");
        return this;
    }

    public CourseExample setOrderByValuationMoneyDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_money desc":(this.orderByClause+",valuation_money desc");
        return this;
    }

    public CourseExample setOrderByMasterReplyMoneyRmbAsc() {
        this.orderByClause=this.orderByClause==null?"master_reply_money_rmb":(this.orderByClause+",master_reply_money_rmb");
        return this;
    }

    public CourseExample setOrderByMasterReplyMoneyRmbDesc() {
        this.orderByClause=this.orderByClause==null?"master_reply_money_rmb desc":(this.orderByClause+",master_reply_money_rmb desc");
        return this;
    }

    public CourseExample setOrderByMasterReplyMoneyUsdAsc() {
        this.orderByClause=this.orderByClause==null?"master_reply_money_usd":(this.orderByClause+",master_reply_money_usd");
        return this;
    }

    public CourseExample setOrderByMasterReplyMoneyUsdDesc() {
        this.orderByClause=this.orderByClause==null?"master_reply_money_usd desc":(this.orderByClause+",master_reply_money_usd desc");
        return this;
    }

    public CourseExample setOrderByUseReplyMoneyRmbAsc() {
        this.orderByClause=this.orderByClause==null?"use_reply_money_rmb":(this.orderByClause+",use_reply_money_rmb");
        return this;
    }

    public CourseExample setOrderByUseReplyMoneyRmbDesc() {
        this.orderByClause=this.orderByClause==null?"use_reply_money_rmb desc":(this.orderByClause+",use_reply_money_rmb desc");
        return this;
    }

    public CourseExample setOrderByUseReplyMoneyUsdAsc() {
        this.orderByClause=this.orderByClause==null?"use_reply_money_usd":(this.orderByClause+",use_reply_money_usd");
        return this;
    }

    public CourseExample setOrderByUseReplyMoneyUsdDesc() {
        this.orderByClause=this.orderByClause==null?"use_reply_money_usd desc":(this.orderByClause+",use_reply_money_usd desc");
        return this;
    }

    public CourseExample setOrderByReceiptsMasterMoneyRmbAsc() {
        this.orderByClause=this.orderByClause==null?"receipts_master_money_rmb":(this.orderByClause+",receipts_master_money_rmb");
        return this;
    }

    public CourseExample setOrderByReceiptsMasterMoneyRmbDesc() {
        this.orderByClause=this.orderByClause==null?"receipts_master_money_rmb desc":(this.orderByClause+",receipts_master_money_rmb desc");
        return this;
    }

    public CourseExample setOrderByReceiptsMasterMoneyUsdAsc() {
        this.orderByClause=this.orderByClause==null?"receipts_master_money_usd":(this.orderByClause+",receipts_master_money_usd");
        return this;
    }

    public CourseExample setOrderByReceiptsMasterMoneyUsdDesc() {
        this.orderByClause=this.orderByClause==null?"receipts_master_money_usd desc":(this.orderByClause+",receipts_master_money_usd desc");
        return this;
    }

    public CourseExample setOrderByReceiptsUseMoneyRmbAsc() {
        this.orderByClause=this.orderByClause==null?"receipts_use_money_rmb":(this.orderByClause+",receipts_use_money_rmb");
        return this;
    }

    public CourseExample setOrderByReceiptsUseMoneyRmbDesc() {
        this.orderByClause=this.orderByClause==null?"receipts_use_money_rmb desc":(this.orderByClause+",receipts_use_money_rmb desc");
        return this;
    }

    public CourseExample setOrderByReceiptsUseMoneyUsdAsc() {
        this.orderByClause=this.orderByClause==null?"receipts_use_money_usd":(this.orderByClause+",receipts_use_money_usd");
        return this;
    }

    public CourseExample setOrderByReceiptsUseMoneyUsdDesc() {
        this.orderByClause=this.orderByClause==null?"receipts_use_money_usd desc":(this.orderByClause+",receipts_use_money_usd desc");
        return this;
    }

    public CourseExample setOrderByUrgencyAsc() {
        this.orderByClause=this.orderByClause==null?"urgency":(this.orderByClause+",urgency");
        return this;
    }

    public CourseExample setOrderByUrgencyDesc() {
        this.orderByClause=this.orderByClause==null?"urgency desc":(this.orderByClause+",urgency desc");
        return this;
    }

    public CourseExample setOrderByValuationTimeAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_time":(this.orderByClause+",valuation_time");
        return this;
    }

    public CourseExample setOrderByValuationTimeDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_time desc":(this.orderByClause+",valuation_time desc");
        return this;
    }

    public CourseExample setOrderByValuationUserAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_user":(this.orderByClause+",valuation_user");
        return this;
    }

    public CourseExample setOrderByValuationUserDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_user desc":(this.orderByClause+",valuation_user desc");
        return this;
    }

    public CourseExample setOrderByValuationRejectAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_reject":(this.orderByClause+",valuation_reject");
        return this;
    }

    public CourseExample setOrderByValuationRejectDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_reject desc":(this.orderByClause+",valuation_reject desc");
        return this;
    }

    public CourseExample setOrderByValuationRemarksAsc() {
        this.orderByClause=this.orderByClause==null?"valuation_remarks":(this.orderByClause+",valuation_remarks");
        return this;
    }

    public CourseExample setOrderByValuationRemarksDesc() {
        this.orderByClause=this.orderByClause==null?"valuation_remarks desc":(this.orderByClause+",valuation_remarks desc");
        return this;
    }

    public CourseExample setOrderByDesignateUserAsc() {
        this.orderByClause=this.orderByClause==null?"designate_user":(this.orderByClause+",designate_user");
        return this;
    }

    public CourseExample setOrderByDesignateUserDesc() {
        this.orderByClause=this.orderByClause==null?"designate_user desc":(this.orderByClause+",designate_user desc");
        return this;
    }

    public CourseExample setOrderByDesignateTimeAsc() {
        this.orderByClause=this.orderByClause==null?"designate_time":(this.orderByClause+",designate_time");
        return this;
    }

    public CourseExample setOrderByDesignateTimeDesc() {
        this.orderByClause=this.orderByClause==null?"designate_time desc":(this.orderByClause+",designate_time desc");
        return this;
    }

    public CourseExample setOrderByReferralStateAsc() {
        this.orderByClause=this.orderByClause==null?"referral_state":(this.orderByClause+",referral_state");
        return this;
    }

    public CourseExample setOrderByReferralStateDesc() {
        this.orderByClause=this.orderByClause==null?"referral_state desc":(this.orderByClause+",referral_state desc");
        return this;
    }

    public CourseExample setOrderByFinishUserAsc() {
        this.orderByClause=this.orderByClause==null?"finish_user":(this.orderByClause+",finish_user");
        return this;
    }

    public CourseExample setOrderByFinishUserDesc() {
        this.orderByClause=this.orderByClause==null?"finish_user desc":(this.orderByClause+",finish_user desc");
        return this;
    }

    public CourseExample setOrderByReferralTypeAsc() {
        this.orderByClause=this.orderByClause==null?"referral_type":(this.orderByClause+",referral_type");
        return this;
    }

    public CourseExample setOrderByReferralTypeDesc() {
        this.orderByClause=this.orderByClause==null?"referral_type desc":(this.orderByClause+",referral_type desc");
        return this;
    }

    public CourseExample setOrderByReferralTimeAsc() {
        this.orderByClause=this.orderByClause==null?"referral_time":(this.orderByClause+",referral_time");
        return this;
    }

    public CourseExample setOrderByReferralTimeDesc() {
        this.orderByClause=this.orderByClause==null?"referral_time desc":(this.orderByClause+",referral_time desc");
        return this;
    }

    public CourseExample setOrderByPredictTimeAsc() {
        this.orderByClause=this.orderByClause==null?"predict_time":(this.orderByClause+",predict_time");
        return this;
    }

    public CourseExample setOrderByPredictTimeDesc() {
        this.orderByClause=this.orderByClause==null?"predict_time desc":(this.orderByClause+",predict_time desc");
        return this;
    }

    public CourseExample setOrderByManHourAsc() {
        this.orderByClause=this.orderByClause==null?"man_hour":(this.orderByClause+",man_hour");
        return this;
    }

    public CourseExample setOrderByManHourDesc() {
        this.orderByClause=this.orderByClause==null?"man_hour desc":(this.orderByClause+",man_hour desc");
        return this;
    }

    public CourseExample setOrderByFinishTimeAsc() {
        this.orderByClause=this.orderByClause==null?"finish_time":(this.orderByClause+",finish_time");
        return this;
    }

    public CourseExample setOrderByFinishTimeDesc() {
        this.orderByClause=this.orderByClause==null?"finish_time desc":(this.orderByClause+",finish_time desc");
        return this;
    }

    public CourseExample setOrderByFinishAuditUserAsc() {
        this.orderByClause=this.orderByClause==null?"finish_audit_user":(this.orderByClause+",finish_audit_user");
        return this;
    }

    public CourseExample setOrderByFinishAuditUserDesc() {
        this.orderByClause=this.orderByClause==null?"finish_audit_user desc":(this.orderByClause+",finish_audit_user desc");
        return this;
    }

    public CourseExample setOrderByFinishAuditTimeAsc() {
        this.orderByClause=this.orderByClause==null?"finish_audit_time":(this.orderByClause+",finish_audit_time");
        return this;
    }

    public CourseExample setOrderByFinishAuditTimeDesc() {
        this.orderByClause=this.orderByClause==null?"finish_audit_time desc":(this.orderByClause+",finish_audit_time desc");
        return this;
    }

    public CourseExample setOrderByReferralRemarksAsc() {
        this.orderByClause=this.orderByClause==null?"referral_remarks":(this.orderByClause+",referral_remarks");
        return this;
    }

    public CourseExample setOrderByReferralRemarksDesc() {
        this.orderByClause=this.orderByClause==null?"referral_remarks desc":(this.orderByClause+",referral_remarks desc");
        return this;
    }

    public CourseExample setOrderByQualityTypeAsc() {
        this.orderByClause=this.orderByClause==null?"quality_type":(this.orderByClause+",quality_type");
        return this;
    }

    public CourseExample setOrderByQualityTypeDesc() {
        this.orderByClause=this.orderByClause==null?"quality_type desc":(this.orderByClause+",quality_type desc");
        return this;
    }

    public CourseExample setOrderByQualityStateAsc() {
        this.orderByClause=this.orderByClause==null?"quality_state":(this.orderByClause+",quality_state");
        return this;
    }

    public CourseExample setOrderByQualityStateDesc() {
        this.orderByClause=this.orderByClause==null?"quality_state desc":(this.orderByClause+",quality_state desc");
        return this;
    }

    public CourseExample setOrderByQualityResultAsc() {
        this.orderByClause=this.orderByClause==null?"quality_result":(this.orderByClause+",quality_result");
        return this;
    }

    public CourseExample setOrderByQualityResultDesc() {
        this.orderByClause=this.orderByClause==null?"quality_result desc":(this.orderByClause+",quality_result desc");
        return this;
    }

    public CourseExample setOrderByQualityUserAsc() {
        this.orderByClause=this.orderByClause==null?"quality_user":(this.orderByClause+",quality_user");
        return this;
    }

    public CourseExample setOrderByQualityUserDesc() {
        this.orderByClause=this.orderByClause==null?"quality_user desc":(this.orderByClause+",quality_user desc");
        return this;
    }

    public CourseExample setOrderByQualityTimeAsc() {
        this.orderByClause=this.orderByClause==null?"quality_time":(this.orderByClause+",quality_time");
        return this;
    }

    public CourseExample setOrderByQualityTimeDesc() {
        this.orderByClause=this.orderByClause==null?"quality_time desc":(this.orderByClause+",quality_time desc");
        return this;
    }

    public CourseExample setOrderByQualityTimeoutAsc() {
        this.orderByClause=this.orderByClause==null?"quality_timeout":(this.orderByClause+",quality_timeout");
        return this;
    }

    public CourseExample setOrderByQualityTimeoutDesc() {
        this.orderByClause=this.orderByClause==null?"quality_timeout desc":(this.orderByClause+",quality_timeout desc");
        return this;
    }

    public CourseExample setOrderByPkQualityStateAsc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_state":(this.orderByClause+",pk_quality_state");
        return this;
    }

    public CourseExample setOrderByPkQualityStateDesc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_state desc":(this.orderByClause+",pk_quality_state desc");
        return this;
    }

    public CourseExample setOrderByPkQualityUserAsc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_user":(this.orderByClause+",pk_quality_user");
        return this;
    }

    public CourseExample setOrderByPkQualityUserDesc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_user desc":(this.orderByClause+",pk_quality_user desc");
        return this;
    }

    public CourseExample setOrderByPkQualityTimeAsc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_time":(this.orderByClause+",pk_quality_time");
        return this;
    }

    public CourseExample setOrderByPkQualityTimeDesc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_time desc":(this.orderByClause+",pk_quality_time desc");
        return this;
    }

    public CourseExample setOrderByPkQualityRemarksAsc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_remarks":(this.orderByClause+",pk_quality_remarks");
        return this;
    }

    public CourseExample setOrderByPkQualityRemarksDesc() {
        this.orderByClause=this.orderByClause==null?"pk_quality_remarks desc":(this.orderByClause+",pk_quality_remarks desc");
        return this;
    }

    public CourseExample setOrderByCreateTimeAsc() {
        this.orderByClause=this.orderByClause==null?"create_time":(this.orderByClause+",create_time");
        return this;
    }

    public CourseExample setOrderByCreateTimeDesc() {
        this.orderByClause=this.orderByClause==null?"create_time desc":(this.orderByClause+",create_time desc");
        return this;
    }

    public CourseExample setOrderByCreateUserAsc() {
        this.orderByClause=this.orderByClause==null?"create_user":(this.orderByClause+",create_user");
        return this;
    }

    public CourseExample setOrderByCreateUserDesc() {
        this.orderByClause=this.orderByClause==null?"create_user desc":(this.orderByClause+",create_user desc");
        return this;
    }

    public CourseExample setOrderByUpdateTimeAsc() {
        this.orderByClause=this.orderByClause==null?"update_time":(this.orderByClause+",update_time");
        return this;
    }

    public CourseExample setOrderByUpdateTimeDesc() {
        this.orderByClause=this.orderByClause==null?"update_time desc":(this.orderByClause+",update_time desc");
        return this;
    }

    public CourseExample setOrderByUpdateUserAsc() {
        this.orderByClause=this.orderByClause==null?"update_user":(this.orderByClause+",update_user");
        return this;
    }

    public CourseExample setOrderByUpdateUserDesc() {
        this.orderByClause=this.orderByClause==null?"update_user desc":(this.orderByClause+",update_user desc");
        return this;
    }

    public CourseExample setOrderByTestingPhotoAsc() {
        this.orderByClause=this.orderByClause==null?"testing_photo":(this.orderByClause+",testing_photo");
        return this;
    }

    public CourseExample setOrderByTestingPhotoDesc() {
        this.orderByClause=this.orderByClause==null?"testing_photo desc":(this.orderByClause+",testing_photo desc");
        return this;
    }

    public CourseExample setOrderBySpeedPhotoAsc() {
        this.orderByClause=this.orderByClause==null?"speed_photo":(this.orderByClause+",speed_photo");
        return this;
    }

    public CourseExample setOrderBySpeedPhotoDesc() {
        this.orderByClause=this.orderByClause==null?"speed_photo desc":(this.orderByClause+",speed_photo desc");
        return this;
    }

    public CourseExample setOrderByAfterPhotoAsc() {
        this.orderByClause=this.orderByClause==null?"after_photo":(this.orderByClause+",after_photo");
        return this;
    }

    public CourseExample setOrderByAfterPhotoDesc() {
        this.orderByClause=this.orderByClause==null?"after_photo desc":(this.orderByClause+",after_photo desc");
        return this;
    }

    public CourseExample setOrderByQualityPhotoAsc() {
        this.orderByClause=this.orderByClause==null?"quality_photo":(this.orderByClause+",quality_photo");
        return this;
    }

    public CourseExample setOrderByQualityPhotoDesc() {
        this.orderByClause=this.orderByClause==null?"quality_photo desc":(this.orderByClause+",quality_photo desc");
        return this;
    }

    public CourseExample setOrderByRecheckPhotoAsc() {
        this.orderByClause=this.orderByClause==null?"recheck_photo":(this.orderByClause+",recheck_photo");
        return this;
    }

    public CourseExample setOrderByRecheckPhotoDesc() {
        this.orderByClause=this.orderByClause==null?"recheck_photo desc":(this.orderByClause+",recheck_photo desc");
        return this;
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

        public Criteria andProdCourseIdIsNull() {
            addCriterion("prod_course_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIsNotNull() {
            addCriterion("prod_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdEqualTo(String value) {
            addCriterion("prod_course_id =", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotEqualTo(String value) {
            addCriterion("prod_course_id <>", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThan(String value) {
            addCriterion("prod_course_id >", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_course_id >=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThan(String value) {
            addCriterion("prod_course_id <", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThanOrEqualTo(String value) {
            addCriterion("prod_course_id <=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLike(String value) {
            addCriterion("prod_course_id like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotLike(String value) {
            addCriterion("prod_course_id not like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIn(List<String> values) {
            addCriterion("prod_course_id in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotIn(List<String> values) {
            addCriterion("prod_course_id not in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdBetween(String value1, String value2) {
            addCriterion("prod_course_id between", value1, value2, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotBetween(String value1, String value2) {
            addCriterion("prod_course_id not between", value1, value2, "prodCourseId");
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

        public Criteria andIsPreviewIsNull() {
            addCriterion("is_preview is null");
            return (Criteria) this;
        }

        public Criteria andIsPreviewIsNotNull() {
            addCriterion("is_preview is not null");
            return (Criteria) this;
        }

        public Criteria andIsPreviewEqualTo(String value) {
            addCriterion("is_preview =", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewNotEqualTo(String value) {
            addCriterion("is_preview <>", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewGreaterThan(String value) {
            addCriterion("is_preview >", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewGreaterThanOrEqualTo(String value) {
            addCriterion("is_preview >=", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewLessThan(String value) {
            addCriterion("is_preview <", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewLessThanOrEqualTo(String value) {
            addCriterion("is_preview <=", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewLike(String value) {
            addCriterion("is_preview like", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewNotLike(String value) {
            addCriterion("is_preview not like", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewIn(List<String> values) {
            addCriterion("is_preview in", values, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewNotIn(List<String> values) {
            addCriterion("is_preview not in", values, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewBetween(String value1, String value2) {
            addCriterion("is_preview between", value1, value2, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewNotBetween(String value1, String value2) {
            addCriterion("is_preview not between", value1, value2, "isPreview");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
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

        public Criteria andContainerTypeIsNull() {
            addCriterion("container_type is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("container_type is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("container_type =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("container_type <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("container_type >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("container_type >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("container_type <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("container_type <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("container_type like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("container_type not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("container_type in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("container_type not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("container_type between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("container_type not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIsNull() {
            addCriterion("container_age is null");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIsNotNull() {
            addCriterion("container_age is not null");
            return (Criteria) this;
        }

        public Criteria andContainerAgeEqualTo(String value) {
            addCriterion("container_age =", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotEqualTo(String value) {
            addCriterion("container_age <>", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeGreaterThan(String value) {
            addCriterion("container_age >", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeGreaterThanOrEqualTo(String value) {
            addCriterion("container_age >=", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeLessThan(String value) {
            addCriterion("container_age <", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeLessThanOrEqualTo(String value) {
            addCriterion("container_age <=", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeLike(String value) {
            addCriterion("container_age like", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotLike(String value) {
            addCriterion("container_age not like", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIn(List<String> values) {
            addCriterion("container_age in", values, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotIn(List<String> values) {
            addCriterion("container_age not in", values, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeBetween(String value1, String value2) {
            addCriterion("container_age between", value1, value2, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeNotBetween(String value1, String value2) {
            addCriterion("container_age not between", value1, value2, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerTareIsNull() {
            addCriterion("container_tare is null");
            return (Criteria) this;
        }

        public Criteria andContainerTareIsNotNull() {
            addCriterion("container_tare is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTareEqualTo(String value) {
            addCriterion("container_tare =", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotEqualTo(String value) {
            addCriterion("container_tare <>", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareGreaterThan(String value) {
            addCriterion("container_tare >", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareGreaterThanOrEqualTo(String value) {
            addCriterion("container_tare >=", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareLessThan(String value) {
            addCriterion("container_tare <", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareLessThanOrEqualTo(String value) {
            addCriterion("container_tare <=", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareLike(String value) {
            addCriterion("container_tare like", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotLike(String value) {
            addCriterion("container_tare not like", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareIn(List<String> values) {
            addCriterion("container_tare in", values, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotIn(List<String> values) {
            addCriterion("container_tare not in", values, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareBetween(String value1, String value2) {
            addCriterion("container_tare between", value1, value2, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareNotBetween(String value1, String value2) {
            addCriterion("container_tare not between", value1, value2, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIsNull() {
            addCriterion("container_load is null");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIsNotNull() {
            addCriterion("container_load is not null");
            return (Criteria) this;
        }

        public Criteria andContainerLoadEqualTo(String value) {
            addCriterion("container_load =", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotEqualTo(String value) {
            addCriterion("container_load <>", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadGreaterThan(String value) {
            addCriterion("container_load >", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadGreaterThanOrEqualTo(String value) {
            addCriterion("container_load >=", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadLessThan(String value) {
            addCriterion("container_load <", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadLessThanOrEqualTo(String value) {
            addCriterion("container_load <=", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadLike(String value) {
            addCriterion("container_load like", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotLike(String value) {
            addCriterion("container_load not like", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIn(List<String> values) {
            addCriterion("container_load in", values, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotIn(List<String> values) {
            addCriterion("container_load not in", values, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadBetween(String value1, String value2) {
            addCriterion("container_load between", value1, value2, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadNotBetween(String value1, String value2) {
            addCriterion("container_load not between", value1, value2, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIsNull() {
            addCriterion("container_volume is null");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIsNotNull() {
            addCriterion("container_volume is not null");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeEqualTo(String value) {
            addCriterion("container_volume =", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotEqualTo(String value) {
            addCriterion("container_volume <>", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeGreaterThan(String value) {
            addCriterion("container_volume >", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("container_volume >=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLessThan(String value) {
            addCriterion("container_volume <", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLessThanOrEqualTo(String value) {
            addCriterion("container_volume <=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeLike(String value) {
            addCriterion("container_volume like", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotLike(String value) {
            addCriterion("container_volume not like", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIn(List<String> values) {
            addCriterion("container_volume in", values, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotIn(List<String> values) {
            addCriterion("container_volume not in", values, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeBetween(String value1, String value2) {
            addCriterion("container_volume between", value1, value2, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeNotBetween(String value1, String value2) {
            addCriterion("container_volume not between", value1, value2, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(String value) {
            addCriterion("gross_weight =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(String value) {
            addCriterion("gross_weight <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(String value) {
            addCriterion("gross_weight >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(String value) {
            addCriterion("gross_weight >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(String value) {
            addCriterion("gross_weight <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(String value) {
            addCriterion("gross_weight <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLike(String value) {
            addCriterion("gross_weight like", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotLike(String value) {
            addCriterion("gross_weight not like", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<String> values) {
            addCriterion("gross_weight in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<String> values) {
            addCriterion("gross_weight not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(String value1, String value2) {
            addCriterion("gross_weight between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(String value1, String value2) {
            addCriterion("gross_weight not between", value1, value2, "grossWeight");
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

        public Criteria andRightAngleIsNull() {
            addCriterion("right_angle is null");
            return (Criteria) this;
        }

        public Criteria andRightAngleIsNotNull() {
            addCriterion("right_angle is not null");
            return (Criteria) this;
        }

        public Criteria andRightAngleEqualTo(String value) {
            addCriterion("right_angle =", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotEqualTo(String value) {
            addCriterion("right_angle <>", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleGreaterThan(String value) {
            addCriterion("right_angle >", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleGreaterThanOrEqualTo(String value) {
            addCriterion("right_angle >=", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleLessThan(String value) {
            addCriterion("right_angle <", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleLessThanOrEqualTo(String value) {
            addCriterion("right_angle <=", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleLike(String value) {
            addCriterion("right_angle like", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotLike(String value) {
            addCriterion("right_angle not like", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleIn(List<String> values) {
            addCriterion("right_angle in", values, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotIn(List<String> values) {
            addCriterion("right_angle not in", values, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleBetween(String value1, String value2) {
            addCriterion("right_angle between", value1, value2, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleNotBetween(String value1, String value2) {
            addCriterion("right_angle not between", value1, value2, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andIsLabelIsNull() {
            addCriterion("is_label is null");
            return (Criteria) this;
        }

        public Criteria andIsLabelIsNotNull() {
            addCriterion("is_label is not null");
            return (Criteria) this;
        }

        public Criteria andIsLabelEqualTo(String value) {
            addCriterion("is_label =", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotEqualTo(String value) {
            addCriterion("is_label <>", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelGreaterThan(String value) {
            addCriterion("is_label >", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelGreaterThanOrEqualTo(String value) {
            addCriterion("is_label >=", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelLessThan(String value) {
            addCriterion("is_label <", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelLessThanOrEqualTo(String value) {
            addCriterion("is_label <=", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelLike(String value) {
            addCriterion("is_label like", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotLike(String value) {
            addCriterion("is_label not like", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelIn(List<String> values) {
            addCriterion("is_label in", values, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotIn(List<String> values) {
            addCriterion("is_label not in", values, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelBetween(String value1, String value2) {
            addCriterion("is_label between", value1, value2, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelNotBetween(String value1, String value2) {
            addCriterion("is_label not between", value1, value2, "isLabel");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerIsNull() {
            addCriterion("container_owner is null");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerIsNotNull() {
            addCriterion("container_owner is not null");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerEqualTo(String value) {
            addCriterion("container_owner =", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerNotEqualTo(String value) {
            addCriterion("container_owner <>", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerGreaterThan(String value) {
            addCriterion("container_owner >", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("container_owner >=", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerLessThan(String value) {
            addCriterion("container_owner <", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerLessThanOrEqualTo(String value) {
            addCriterion("container_owner <=", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerLike(String value) {
            addCriterion("container_owner like", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerNotLike(String value) {
            addCriterion("container_owner not like", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerIn(List<String> values) {
            addCriterion("container_owner in", values, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerNotIn(List<String> values) {
            addCriterion("container_owner not in", values, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerBetween(String value1, String value2) {
            addCriterion("container_owner between", value1, value2, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerNotBetween(String value1, String value2) {
            addCriterion("container_owner not between", value1, value2, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerBelongIsNull() {
            addCriterion("container_belong is null");
            return (Criteria) this;
        }

        public Criteria andContainerBelongIsNotNull() {
            addCriterion("container_belong is not null");
            return (Criteria) this;
        }

        public Criteria andContainerBelongEqualTo(String value) {
            addCriterion("container_belong =", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongNotEqualTo(String value) {
            addCriterion("container_belong <>", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongGreaterThan(String value) {
            addCriterion("container_belong >", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongGreaterThanOrEqualTo(String value) {
            addCriterion("container_belong >=", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongLessThan(String value) {
            addCriterion("container_belong <", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongLessThanOrEqualTo(String value) {
            addCriterion("container_belong <=", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongLike(String value) {
            addCriterion("container_belong like", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongNotLike(String value) {
            addCriterion("container_belong not like", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongIn(List<String> values) {
            addCriterion("container_belong in", values, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongNotIn(List<String> values) {
            addCriterion("container_belong not in", values, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongBetween(String value1, String value2) {
            addCriterion("container_belong between", value1, value2, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongNotBetween(String value1, String value2) {
            addCriterion("container_belong not between", value1, value2, "containerBelong");
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

        public Criteria andContainerGradeIsNull() {
            addCriterion("container_grade is null");
            return (Criteria) this;
        }

        public Criteria andContainerGradeIsNotNull() {
            addCriterion("container_grade is not null");
            return (Criteria) this;
        }

        public Criteria andContainerGradeEqualTo(String value) {
            addCriterion("container_grade =", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeNotEqualTo(String value) {
            addCriterion("container_grade <>", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeGreaterThan(String value) {
            addCriterion("container_grade >", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeGreaterThanOrEqualTo(String value) {
            addCriterion("container_grade >=", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeLessThan(String value) {
            addCriterion("container_grade <", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeLessThanOrEqualTo(String value) {
            addCriterion("container_grade <=", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeLike(String value) {
            addCriterion("container_grade like", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeNotLike(String value) {
            addCriterion("container_grade not like", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeIn(List<String> values) {
            addCriterion("container_grade in", values, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeNotIn(List<String> values) {
            addCriterion("container_grade not in", values, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeBetween(String value1, String value2) {
            addCriterion("container_grade between", value1, value2, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeNotBetween(String value1, String value2) {
            addCriterion("container_grade not between", value1, value2, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerConditionIsNull() {
            addCriterion("container_condition is null");
            return (Criteria) this;
        }

        public Criteria andContainerConditionIsNotNull() {
            addCriterion("container_condition is not null");
            return (Criteria) this;
        }

        public Criteria andContainerConditionEqualTo(String value) {
            addCriterion("container_condition =", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionNotEqualTo(String value) {
            addCriterion("container_condition <>", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionGreaterThan(String value) {
            addCriterion("container_condition >", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionGreaterThanOrEqualTo(String value) {
            addCriterion("container_condition >=", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionLessThan(String value) {
            addCriterion("container_condition <", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionLessThanOrEqualTo(String value) {
            addCriterion("container_condition <=", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionLike(String value) {
            addCriterion("container_condition like", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionNotLike(String value) {
            addCriterion("container_condition not like", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionIn(List<String> values) {
            addCriterion("container_condition in", values, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionNotIn(List<String> values) {
            addCriterion("container_condition not in", values, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionBetween(String value1, String value2) {
            addCriterion("container_condition between", value1, value2, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionNotBetween(String value1, String value2) {
            addCriterion("container_condition not between", value1, value2, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIsNull() {
            addCriterion("bill_of_lading_no is null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIsNotNull() {
            addCriterion("bill_of_lading_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoEqualTo(String value) {
            addCriterion("bill_of_lading_no =", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotEqualTo(String value) {
            addCriterion("bill_of_lading_no <>", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoGreaterThan(String value) {
            addCriterion("bill_of_lading_no >", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_of_lading_no >=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLessThan(String value) {
            addCriterion("bill_of_lading_no <", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLessThanOrEqualTo(String value) {
            addCriterion("bill_of_lading_no <=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLike(String value) {
            addCriterion("bill_of_lading_no like", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotLike(String value) {
            addCriterion("bill_of_lading_no not like", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIn(List<String> values) {
            addCriterion("bill_of_lading_no in", values, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotIn(List<String> values) {
            addCriterion("bill_of_lading_no not in", values, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoBetween(String value1, String value2) {
            addCriterion("bill_of_lading_no between", value1, value2, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotBetween(String value1, String value2) {
            addCriterion("bill_of_lading_no not between", value1, value2, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIsNull() {
            addCriterion("vessel_voyage is null");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIsNotNull() {
            addCriterion("vessel_voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageEqualTo(String value) {
            addCriterion("vessel_voyage =", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotEqualTo(String value) {
            addCriterion("vessel_voyage <>", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageGreaterThan(String value) {
            addCriterion("vessel_voyage >", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageGreaterThanOrEqualTo(String value) {
            addCriterion("vessel_voyage >=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLessThan(String value) {
            addCriterion("vessel_voyage <", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLessThanOrEqualTo(String value) {
            addCriterion("vessel_voyage <=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLike(String value) {
            addCriterion("vessel_voyage like", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotLike(String value) {
            addCriterion("vessel_voyage not like", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIn(List<String> values) {
            addCriterion("vessel_voyage in", values, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotIn(List<String> values) {
            addCriterion("vessel_voyage not in", values, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageBetween(String value1, String value2) {
            addCriterion("vessel_voyage between", value1, value2, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotBetween(String value1, String value2) {
            addCriterion("vessel_voyage not between", value1, value2, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeIsNull() {
            addCriterion("domestic_foreign_trade is null");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeIsNotNull() {
            addCriterion("domestic_foreign_trade is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeEqualTo(String value) {
            addCriterion("domestic_foreign_trade =", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeNotEqualTo(String value) {
            addCriterion("domestic_foreign_trade <>", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeGreaterThan(String value) {
            addCriterion("domestic_foreign_trade >", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeGreaterThanOrEqualTo(String value) {
            addCriterion("domestic_foreign_trade >=", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeLessThan(String value) {
            addCriterion("domestic_foreign_trade <", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeLessThanOrEqualTo(String value) {
            addCriterion("domestic_foreign_trade <=", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeLike(String value) {
            addCriterion("domestic_foreign_trade like", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeNotLike(String value) {
            addCriterion("domestic_foreign_trade not like", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeIn(List<String> values) {
            addCriterion("domestic_foreign_trade in", values, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeNotIn(List<String> values) {
            addCriterion("domestic_foreign_trade not in", values, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeBetween(String value1, String value2) {
            addCriterion("domestic_foreign_trade between", value1, value2, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeNotBetween(String value1, String value2) {
            addCriterion("domestic_foreign_trade not between", value1, value2, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerIsNull() {
            addCriterion("is_gon_container is null");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerIsNotNull() {
            addCriterion("is_gon_container is not null");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerEqualTo(String value) {
            addCriterion("is_gon_container =", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerNotEqualTo(String value) {
            addCriterion("is_gon_container <>", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerGreaterThan(String value) {
            addCriterion("is_gon_container >", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerGreaterThanOrEqualTo(String value) {
            addCriterion("is_gon_container >=", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerLessThan(String value) {
            addCriterion("is_gon_container <", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerLessThanOrEqualTo(String value) {
            addCriterion("is_gon_container <=", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerLike(String value) {
            addCriterion("is_gon_container like", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerNotLike(String value) {
            addCriterion("is_gon_container not like", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerIn(List<String> values) {
            addCriterion("is_gon_container in", values, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerNotIn(List<String> values) {
            addCriterion("is_gon_container not in", values, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerBetween(String value1, String value2) {
            addCriterion("is_gon_container between", value1, value2, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerNotBetween(String value1, String value2) {
            addCriterion("is_gon_container not between", value1, value2, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryIsNull() {
            addCriterion("is_freeze_dry is null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryIsNotNull() {
            addCriterion("is_freeze_dry is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryEqualTo(String value) {
            addCriterion("is_freeze_dry =", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryNotEqualTo(String value) {
            addCriterion("is_freeze_dry <>", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryGreaterThan(String value) {
            addCriterion("is_freeze_dry >", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryGreaterThanOrEqualTo(String value) {
            addCriterion("is_freeze_dry >=", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryLessThan(String value) {
            addCriterion("is_freeze_dry <", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryLessThanOrEqualTo(String value) {
            addCriterion("is_freeze_dry <=", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryLike(String value) {
            addCriterion("is_freeze_dry like", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryNotLike(String value) {
            addCriterion("is_freeze_dry not like", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryIn(List<String> values) {
            addCriterion("is_freeze_dry in", values, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryNotIn(List<String> values) {
            addCriterion("is_freeze_dry not in", values, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryBetween(String value1, String value2) {
            addCriterion("is_freeze_dry between", value1, value2, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryNotBetween(String value1, String value2) {
            addCriterion("is_freeze_dry not between", value1, value2, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIsNull() {
            addCriterion("is_surrender is null");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIsNotNull() {
            addCriterion("is_surrender is not null");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderEqualTo(String value) {
            addCriterion("is_surrender =", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotEqualTo(String value) {
            addCriterion("is_surrender <>", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderGreaterThan(String value) {
            addCriterion("is_surrender >", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderGreaterThanOrEqualTo(String value) {
            addCriterion("is_surrender >=", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderLessThan(String value) {
            addCriterion("is_surrender <", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderLessThanOrEqualTo(String value) {
            addCriterion("is_surrender <=", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderLike(String value) {
            addCriterion("is_surrender like", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotLike(String value) {
            addCriterion("is_surrender not like", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIn(List<String> values) {
            addCriterion("is_surrender in", values, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotIn(List<String> values) {
            addCriterion("is_surrender not in", values, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderBetween(String value1, String value2) {
            addCriterion("is_surrender between", value1, value2, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderNotBetween(String value1, String value2) {
            addCriterion("is_surrender not between", value1, value2, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseIsNull() {
            addCriterion("surrender_course is null");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseIsNotNull() {
            addCriterion("surrender_course is not null");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseEqualTo(String value) {
            addCriterion("surrender_course =", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseNotEqualTo(String value) {
            addCriterion("surrender_course <>", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseGreaterThan(String value) {
            addCriterion("surrender_course >", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseGreaterThanOrEqualTo(String value) {
            addCriterion("surrender_course >=", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseLessThan(String value) {
            addCriterion("surrender_course <", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseLessThanOrEqualTo(String value) {
            addCriterion("surrender_course <=", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseLike(String value) {
            addCriterion("surrender_course like", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseNotLike(String value) {
            addCriterion("surrender_course not like", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseIn(List<String> values) {
            addCriterion("surrender_course in", values, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseNotIn(List<String> values) {
            addCriterion("surrender_course not in", values, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseBetween(String value1, String value2) {
            addCriterion("surrender_course between", value1, value2, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseNotBetween(String value1, String value2) {
            addCriterion("surrender_course not between", value1, value2, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andLabellingIsNull() {
            addCriterion("labelling is null");
            return (Criteria) this;
        }

        public Criteria andLabellingIsNotNull() {
            addCriterion("labelling is not null");
            return (Criteria) this;
        }

        public Criteria andLabellingEqualTo(String value) {
            addCriterion("labelling =", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotEqualTo(String value) {
            addCriterion("labelling <>", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingGreaterThan(String value) {
            addCriterion("labelling >", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingGreaterThanOrEqualTo(String value) {
            addCriterion("labelling >=", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingLessThan(String value) {
            addCriterion("labelling <", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingLessThanOrEqualTo(String value) {
            addCriterion("labelling <=", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingLike(String value) {
            addCriterion("labelling like", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotLike(String value) {
            addCriterion("labelling not like", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingIn(List<String> values) {
            addCriterion("labelling in", values, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotIn(List<String> values) {
            addCriterion("labelling not in", values, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingBetween(String value1, String value2) {
            addCriterion("labelling between", value1, value2, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotBetween(String value1, String value2) {
            addCriterion("labelling not between", value1, value2, "labelling");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeIsNull() {
            addCriterion("yard_container_type is null");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeIsNotNull() {
            addCriterion("yard_container_type is not null");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeEqualTo(String value) {
            addCriterion("yard_container_type =", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeNotEqualTo(String value) {
            addCriterion("yard_container_type <>", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeGreaterThan(String value) {
            addCriterion("yard_container_type >", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("yard_container_type >=", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeLessThan(String value) {
            addCriterion("yard_container_type <", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("yard_container_type <=", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeLike(String value) {
            addCriterion("yard_container_type like", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeNotLike(String value) {
            addCriterion("yard_container_type not like", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeIn(List<String> values) {
            addCriterion("yard_container_type in", values, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeNotIn(List<String> values) {
            addCriterion("yard_container_type not in", values, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeBetween(String value1, String value2) {
            addCriterion("yard_container_type between", value1, value2, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeNotBetween(String value1, String value2) {
            addCriterion("yard_container_type not between", value1, value2, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContGradeIsNull() {
            addCriterion("yard_cont_grade is null");
            return (Criteria) this;
        }

        public Criteria andYardContGradeIsNotNull() {
            addCriterion("yard_cont_grade is not null");
            return (Criteria) this;
        }

        public Criteria andYardContGradeEqualTo(String value) {
            addCriterion("yard_cont_grade =", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeNotEqualTo(String value) {
            addCriterion("yard_cont_grade <>", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeGreaterThan(String value) {
            addCriterion("yard_cont_grade >", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeGreaterThanOrEqualTo(String value) {
            addCriterion("yard_cont_grade >=", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeLessThan(String value) {
            addCriterion("yard_cont_grade <", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeLessThanOrEqualTo(String value) {
            addCriterion("yard_cont_grade <=", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeLike(String value) {
            addCriterion("yard_cont_grade like", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeNotLike(String value) {
            addCriterion("yard_cont_grade not like", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeIn(List<String> values) {
            addCriterion("yard_cont_grade in", values, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeNotIn(List<String> values) {
            addCriterion("yard_cont_grade not in", values, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeBetween(String value1, String value2) {
            addCriterion("yard_cont_grade between", value1, value2, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeNotBetween(String value1, String value2) {
            addCriterion("yard_cont_grade not between", value1, value2, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andLeadSealingIsNull() {
            addCriterion("lead_sealing is null");
            return (Criteria) this;
        }

        public Criteria andLeadSealingIsNotNull() {
            addCriterion("lead_sealing is not null");
            return (Criteria) this;
        }

        public Criteria andLeadSealingEqualTo(String value) {
            addCriterion("lead_sealing =", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingNotEqualTo(String value) {
            addCriterion("lead_sealing <>", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingGreaterThan(String value) {
            addCriterion("lead_sealing >", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingGreaterThanOrEqualTo(String value) {
            addCriterion("lead_sealing >=", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingLessThan(String value) {
            addCriterion("lead_sealing <", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingLessThanOrEqualTo(String value) {
            addCriterion("lead_sealing <=", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingLike(String value) {
            addCriterion("lead_sealing like", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingNotLike(String value) {
            addCriterion("lead_sealing not like", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingIn(List<String> values) {
            addCriterion("lead_sealing in", values, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingNotIn(List<String> values) {
            addCriterion("lead_sealing not in", values, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingBetween(String value1, String value2) {
            addCriterion("lead_sealing between", value1, value2, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingNotBetween(String value1, String value2) {
            addCriterion("lead_sealing not between", value1, value2, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andBareWeightIsNull() {
            addCriterion("bare_weight is null");
            return (Criteria) this;
        }

        public Criteria andBareWeightIsNotNull() {
            addCriterion("bare_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBareWeightEqualTo(String value) {
            addCriterion("bare_weight =", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightNotEqualTo(String value) {
            addCriterion("bare_weight <>", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightGreaterThan(String value) {
            addCriterion("bare_weight >", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightGreaterThanOrEqualTo(String value) {
            addCriterion("bare_weight >=", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightLessThan(String value) {
            addCriterion("bare_weight <", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightLessThanOrEqualTo(String value) {
            addCriterion("bare_weight <=", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightLike(String value) {
            addCriterion("bare_weight like", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightNotLike(String value) {
            addCriterion("bare_weight not like", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightIn(List<String> values) {
            addCriterion("bare_weight in", values, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightNotIn(List<String> values) {
            addCriterion("bare_weight not in", values, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightBetween(String value1, String value2) {
            addCriterion("bare_weight between", value1, value2, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightNotBetween(String value1, String value2) {
            addCriterion("bare_weight not between", value1, value2, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutIsNull() {
            addCriterion("is_cleanout is null");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutIsNotNull() {
            addCriterion("is_cleanout is not null");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutEqualTo(String value) {
            addCriterion("is_cleanout =", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutNotEqualTo(String value) {
            addCriterion("is_cleanout <>", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutGreaterThan(String value) {
            addCriterion("is_cleanout >", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutGreaterThanOrEqualTo(String value) {
            addCriterion("is_cleanout >=", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutLessThan(String value) {
            addCriterion("is_cleanout <", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutLessThanOrEqualTo(String value) {
            addCriterion("is_cleanout <=", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutLike(String value) {
            addCriterion("is_cleanout like", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutNotLike(String value) {
            addCriterion("is_cleanout not like", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutIn(List<String> values) {
            addCriterion("is_cleanout in", values, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutNotIn(List<String> values) {
            addCriterion("is_cleanout not in", values, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutBetween(String value1, String value2) {
            addCriterion("is_cleanout between", value1, value2, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutNotBetween(String value1, String value2) {
            addCriterion("is_cleanout not between", value1, value2, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsLocatorIsNull() {
            addCriterion("is_locator is null");
            return (Criteria) this;
        }

        public Criteria andIsLocatorIsNotNull() {
            addCriterion("is_locator is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocatorEqualTo(String value) {
            addCriterion("is_locator =", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorNotEqualTo(String value) {
            addCriterion("is_locator <>", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorGreaterThan(String value) {
            addCriterion("is_locator >", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorGreaterThanOrEqualTo(String value) {
            addCriterion("is_locator >=", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorLessThan(String value) {
            addCriterion("is_locator <", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorLessThanOrEqualTo(String value) {
            addCriterion("is_locator <=", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorLike(String value) {
            addCriterion("is_locator like", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorNotLike(String value) {
            addCriterion("is_locator not like", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorIn(List<String> values) {
            addCriterion("is_locator in", values, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorNotIn(List<String> values) {
            addCriterion("is_locator not in", values, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorBetween(String value1, String value2) {
            addCriterion("is_locator between", value1, value2, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorNotBetween(String value1, String value2) {
            addCriterion("is_locator not between", value1, value2, "isLocator");
            return (Criteria) this;
        }

        public Criteria andMotorcadeIsNull() {
            addCriterion("motorcade is null");
            return (Criteria) this;
        }

        public Criteria andMotorcadeIsNotNull() {
            addCriterion("motorcade is not null");
            return (Criteria) this;
        }

        public Criteria andMotorcadeEqualTo(String value) {
            addCriterion("motorcade =", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeNotEqualTo(String value) {
            addCriterion("motorcade <>", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeGreaterThan(String value) {
            addCriterion("motorcade >", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeGreaterThanOrEqualTo(String value) {
            addCriterion("motorcade >=", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeLessThan(String value) {
            addCriterion("motorcade <", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeLessThanOrEqualTo(String value) {
            addCriterion("motorcade <=", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeLike(String value) {
            addCriterion("motorcade like", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeNotLike(String value) {
            addCriterion("motorcade not like", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeIn(List<String> values) {
            addCriterion("motorcade in", values, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeNotIn(List<String> values) {
            addCriterion("motorcade not in", values, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeBetween(String value1, String value2) {
            addCriterion("motorcade between", value1, value2, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeNotBetween(String value1, String value2) {
            addCriterion("motorcade not between", value1, value2, "motorcade");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
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

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNull() {
            addCriterion("course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNotNull() {
            addCriterion("course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeEqualTo(Date value) {
            addCriterion("course_time =", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotEqualTo(Date value) {
            addCriterion("course_time <>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThan(Date value) {
            addCriterion("course_time >", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_time >=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThan(Date value) {
            addCriterion("course_time <", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_time <=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIn(List<Date> values) {
            addCriterion("course_time in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotIn(List<Date> values) {
            addCriterion("course_time not in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeBetween(Date value1, Date value2) {
            addCriterion("course_time between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_time not between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andTestingUserIsNull() {
            addCriterion("testing_user is null");
            return (Criteria) this;
        }

        public Criteria andTestingUserIsNotNull() {
            addCriterion("testing_user is not null");
            return (Criteria) this;
        }

        public Criteria andTestingUserEqualTo(Integer value) {
            addCriterion("testing_user =", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserNotEqualTo(Integer value) {
            addCriterion("testing_user <>", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserGreaterThan(Integer value) {
            addCriterion("testing_user >", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("testing_user >=", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserLessThan(Integer value) {
            addCriterion("testing_user <", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserLessThanOrEqualTo(Integer value) {
            addCriterion("testing_user <=", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserIn(List<Integer> values) {
            addCriterion("testing_user in", values, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserNotIn(List<Integer> values) {
            addCriterion("testing_user not in", values, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserBetween(Integer value1, Integer value2) {
            addCriterion("testing_user between", value1, value2, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserNotBetween(Integer value1, Integer value2) {
            addCriterion("testing_user not between", value1, value2, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingStateIsNull() {
            addCriterion("testing_state is null");
            return (Criteria) this;
        }

        public Criteria andTestingStateIsNotNull() {
            addCriterion("testing_state is not null");
            return (Criteria) this;
        }

        public Criteria andTestingStateEqualTo(String value) {
            addCriterion("testing_state =", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotEqualTo(String value) {
            addCriterion("testing_state <>", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateGreaterThan(String value) {
            addCriterion("testing_state >", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateGreaterThanOrEqualTo(String value) {
            addCriterion("testing_state >=", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateLessThan(String value) {
            addCriterion("testing_state <", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateLessThanOrEqualTo(String value) {
            addCriterion("testing_state <=", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateLike(String value) {
            addCriterion("testing_state like", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotLike(String value) {
            addCriterion("testing_state not like", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateIn(List<String> values) {
            addCriterion("testing_state in", values, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotIn(List<String> values) {
            addCriterion("testing_state not in", values, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateBetween(String value1, String value2) {
            addCriterion("testing_state between", value1, value2, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateNotBetween(String value1, String value2) {
            addCriterion("testing_state not between", value1, value2, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingRejectIsNull() {
            addCriterion("testing_reject is null");
            return (Criteria) this;
        }

        public Criteria andTestingRejectIsNotNull() {
            addCriterion("testing_reject is not null");
            return (Criteria) this;
        }

        public Criteria andTestingRejectEqualTo(String value) {
            addCriterion("testing_reject =", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectNotEqualTo(String value) {
            addCriterion("testing_reject <>", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectGreaterThan(String value) {
            addCriterion("testing_reject >", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectGreaterThanOrEqualTo(String value) {
            addCriterion("testing_reject >=", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectLessThan(String value) {
            addCriterion("testing_reject <", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectLessThanOrEqualTo(String value) {
            addCriterion("testing_reject <=", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectLike(String value) {
            addCriterion("testing_reject like", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectNotLike(String value) {
            addCriterion("testing_reject not like", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectIn(List<String> values) {
            addCriterion("testing_reject in", values, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectNotIn(List<String> values) {
            addCriterion("testing_reject not in", values, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectBetween(String value1, String value2) {
            addCriterion("testing_reject between", value1, value2, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectNotBetween(String value1, String value2) {
            addCriterion("testing_reject not between", value1, value2, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIsNull() {
            addCriterion("testing_time is null");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIsNotNull() {
            addCriterion("testing_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestingTimeEqualTo(Date value) {
            addCriterion("testing_time =", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeNotEqualTo(Date value) {
            addCriterion("testing_time <>", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeGreaterThan(Date value) {
            addCriterion("testing_time >", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testing_time >=", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeLessThan(Date value) {
            addCriterion("testing_time <", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeLessThanOrEqualTo(Date value) {
            addCriterion("testing_time <=", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIn(List<Date> values) {
            addCriterion("testing_time in", values, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeNotIn(List<Date> values) {
            addCriterion("testing_time not in", values, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeBetween(Date value1, Date value2) {
            addCriterion("testing_time between", value1, value2, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeNotBetween(Date value1, Date value2) {
            addCriterion("testing_time not between", value1, value2, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIsNull() {
            addCriterion("testing_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIsNotNull() {
            addCriterion("testing_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeEqualTo(Date value) {
            addCriterion("testing_end_time =", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeNotEqualTo(Date value) {
            addCriterion("testing_end_time <>", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeGreaterThan(Date value) {
            addCriterion("testing_end_time >", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testing_end_time >=", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeLessThan(Date value) {
            addCriterion("testing_end_time <", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("testing_end_time <=", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIn(List<Date> values) {
            addCriterion("testing_end_time in", values, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeNotIn(List<Date> values) {
            addCriterion("testing_end_time not in", values, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeBetween(Date value1, Date value2) {
            addCriterion("testing_end_time between", value1, value2, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("testing_end_time not between", value1, value2, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIsNull() {
            addCriterion("testing_man_hour_cost is null");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIsNotNull() {
            addCriterion("testing_man_hour_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost =", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostNotEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost <>", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostGreaterThan(BigDecimal value) {
            addCriterion("testing_man_hour_cost >", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost >=", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostLessThan(BigDecimal value) {
            addCriterion("testing_man_hour_cost <", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_man_hour_cost <=", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIn(List<BigDecimal> values) {
            addCriterion("testing_man_hour_cost in", values, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostNotIn(List<BigDecimal> values) {
            addCriterion("testing_man_hour_cost not in", values, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_man_hour_cost between", value1, value2, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_man_hour_cost not between", value1, value2, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIsNull() {
            addCriterion("testing_material_cost is null");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIsNotNull() {
            addCriterion("testing_material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost =", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost <>", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("testing_material_cost >", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost >=", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostLessThan(BigDecimal value) {
            addCriterion("testing_material_cost <", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_material_cost <=", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIn(List<BigDecimal> values) {
            addCriterion("testing_material_cost in", values, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("testing_material_cost not in", values, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_material_cost between", value1, value2, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_material_cost not between", value1, value2, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIsNull() {
            addCriterion("testing_thirdparty_money is null");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIsNotNull() {
            addCriterion("testing_thirdparty_money is not null");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money =", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money <>", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyGreaterThan(BigDecimal value) {
            addCriterion("testing_thirdparty_money >", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money >=", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyLessThan(BigDecimal value) {
            addCriterion("testing_thirdparty_money <", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_thirdparty_money <=", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIn(List<BigDecimal> values) {
            addCriterion("testing_thirdparty_money in", values, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("testing_thirdparty_money not in", values, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_thirdparty_money between", value1, value2, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_thirdparty_money not between", value1, value2, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIsNull() {
            addCriterion("testing_money is null");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIsNotNull() {
            addCriterion("testing_money is not null");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyEqualTo(BigDecimal value) {
            addCriterion("testing_money =", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("testing_money <>", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyGreaterThan(BigDecimal value) {
            addCriterion("testing_money >", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_money >=", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyLessThan(BigDecimal value) {
            addCriterion("testing_money <", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("testing_money <=", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIn(List<BigDecimal> values) {
            addCriterion("testing_money in", values, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("testing_money not in", values, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_money between", value1, value2, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("testing_money not between", value1, value2, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("audit_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("audit_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(String value) {
            addCriterion("audit_type =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(String value) {
            addCriterion("audit_type <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(String value) {
            addCriterion("audit_type >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_type >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(String value) {
            addCriterion("audit_type <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(String value) {
            addCriterion("audit_type <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLike(String value) {
            addCriterion("audit_type like", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotLike(String value) {
            addCriterion("audit_type not like", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<String> values) {
            addCriterion("audit_type in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<String> values) {
            addCriterion("audit_type not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(String value1, String value2) {
            addCriterion("audit_type between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(String value1, String value2) {
            addCriterion("audit_type not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(Integer value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(Integer value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(Integer value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(Integer value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<Integer> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<Integer> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(Integer value1, Integer value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIsNull() {
            addCriterion("testing_remarks is null");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIsNotNull() {
            addCriterion("testing_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksEqualTo(String value) {
            addCriterion("testing_remarks =", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotEqualTo(String value) {
            addCriterion("testing_remarks <>", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksGreaterThan(String value) {
            addCriterion("testing_remarks >", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("testing_remarks >=", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksLessThan(String value) {
            addCriterion("testing_remarks <", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksLessThanOrEqualTo(String value) {
            addCriterion("testing_remarks <=", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksLike(String value) {
            addCriterion("testing_remarks like", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotLike(String value) {
            addCriterion("testing_remarks not like", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIn(List<String> values) {
            addCriterion("testing_remarks in", values, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotIn(List<String> values) {
            addCriterion("testing_remarks not in", values, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksBetween(String value1, String value2) {
            addCriterion("testing_remarks between", value1, value2, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksNotBetween(String value1, String value2) {
            addCriterion("testing_remarks not between", value1, value2, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeIsNull() {
            addCriterion("surrender_type is null");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeIsNotNull() {
            addCriterion("surrender_type is not null");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeEqualTo(String value) {
            addCriterion("surrender_type =", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeNotEqualTo(String value) {
            addCriterion("surrender_type <>", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeGreaterThan(String value) {
            addCriterion("surrender_type >", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("surrender_type >=", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeLessThan(String value) {
            addCriterion("surrender_type <", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeLessThanOrEqualTo(String value) {
            addCriterion("surrender_type <=", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeLike(String value) {
            addCriterion("surrender_type like", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeNotLike(String value) {
            addCriterion("surrender_type not like", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeIn(List<String> values) {
            addCriterion("surrender_type in", values, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeNotIn(List<String> values) {
            addCriterion("surrender_type not in", values, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeBetween(String value1, String value2) {
            addCriterion("surrender_type between", value1, value2, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeNotBetween(String value1, String value2) {
            addCriterion("surrender_type not between", value1, value2, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeIsNull() {
            addCriterion("surrender_bill_type is null");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeIsNotNull() {
            addCriterion("surrender_bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeEqualTo(String value) {
            addCriterion("surrender_bill_type =", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeNotEqualTo(String value) {
            addCriterion("surrender_bill_type <>", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeGreaterThan(String value) {
            addCriterion("surrender_bill_type >", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("surrender_bill_type >=", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeLessThan(String value) {
            addCriterion("surrender_bill_type <", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeLessThanOrEqualTo(String value) {
            addCriterion("surrender_bill_type <=", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeLike(String value) {
            addCriterion("surrender_bill_type like", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeNotLike(String value) {
            addCriterion("surrender_bill_type not like", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeIn(List<String> values) {
            addCriterion("surrender_bill_type in", values, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeNotIn(List<String> values) {
            addCriterion("surrender_bill_type not in", values, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeBetween(String value1, String value2) {
            addCriterion("surrender_bill_type between", value1, value2, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeNotBetween(String value1, String value2) {
            addCriterion("surrender_bill_type not between", value1, value2, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeIsNull() {
            addCriterion("is_owner_charge is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeIsNotNull() {
            addCriterion("is_owner_charge is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeEqualTo(String value) {
            addCriterion("is_owner_charge =", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeNotEqualTo(String value) {
            addCriterion("is_owner_charge <>", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeGreaterThan(String value) {
            addCriterion("is_owner_charge >", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeGreaterThanOrEqualTo(String value) {
            addCriterion("is_owner_charge >=", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeLessThan(String value) {
            addCriterion("is_owner_charge <", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeLessThanOrEqualTo(String value) {
            addCriterion("is_owner_charge <=", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeLike(String value) {
            addCriterion("is_owner_charge like", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeNotLike(String value) {
            addCriterion("is_owner_charge not like", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeIn(List<String> values) {
            addCriterion("is_owner_charge in", values, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeNotIn(List<String> values) {
            addCriterion("is_owner_charge not in", values, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeBetween(String value1, String value2) {
            addCriterion("is_owner_charge between", value1, value2, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeNotBetween(String value1, String value2) {
            addCriterion("is_owner_charge not between", value1, value2, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andValuationNoIsNull() {
            addCriterion("valuation_no is null");
            return (Criteria) this;
        }

        public Criteria andValuationNoIsNotNull() {
            addCriterion("valuation_no is not null");
            return (Criteria) this;
        }

        public Criteria andValuationNoEqualTo(String value) {
            addCriterion("valuation_no =", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotEqualTo(String value) {
            addCriterion("valuation_no <>", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoGreaterThan(String value) {
            addCriterion("valuation_no >", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_no >=", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoLessThan(String value) {
            addCriterion("valuation_no <", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoLessThanOrEqualTo(String value) {
            addCriterion("valuation_no <=", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoLike(String value) {
            addCriterion("valuation_no like", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotLike(String value) {
            addCriterion("valuation_no not like", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoIn(List<String> values) {
            addCriterion("valuation_no in", values, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotIn(List<String> values) {
            addCriterion("valuation_no not in", values, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoBetween(String value1, String value2) {
            addCriterion("valuation_no between", value1, value2, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoNotBetween(String value1, String value2) {
            addCriterion("valuation_no not between", value1, value2, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateIsNull() {
            addCriterion("use_reply_state is null");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateIsNotNull() {
            addCriterion("use_reply_state is not null");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateEqualTo(String value) {
            addCriterion("use_reply_state =", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateNotEqualTo(String value) {
            addCriterion("use_reply_state <>", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateGreaterThan(String value) {
            addCriterion("use_reply_state >", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateGreaterThanOrEqualTo(String value) {
            addCriterion("use_reply_state >=", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateLessThan(String value) {
            addCriterion("use_reply_state <", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateLessThanOrEqualTo(String value) {
            addCriterion("use_reply_state <=", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateLike(String value) {
            addCriterion("use_reply_state like", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateNotLike(String value) {
            addCriterion("use_reply_state not like", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateIn(List<String> values) {
            addCriterion("use_reply_state in", values, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateNotIn(List<String> values) {
            addCriterion("use_reply_state not in", values, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateBetween(String value1, String value2) {
            addCriterion("use_reply_state between", value1, value2, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateNotBetween(String value1, String value2) {
            addCriterion("use_reply_state not between", value1, value2, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeIsNull() {
            addCriterion("use_reply_time is null");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeIsNotNull() {
            addCriterion("use_reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeEqualTo(Date value) {
            addCriterion("use_reply_time =", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeNotEqualTo(Date value) {
            addCriterion("use_reply_time <>", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeGreaterThan(Date value) {
            addCriterion("use_reply_time >", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("use_reply_time >=", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeLessThan(Date value) {
            addCriterion("use_reply_time <", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("use_reply_time <=", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeIn(List<Date> values) {
            addCriterion("use_reply_time in", values, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeNotIn(List<Date> values) {
            addCriterion("use_reply_time not in", values, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeBetween(Date value1, Date value2) {
            addCriterion("use_reply_time between", value1, value2, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("use_reply_time not between", value1, value2, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateIsNull() {
            addCriterion("master_reply_state is null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateIsNotNull() {
            addCriterion("master_reply_state is not null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateEqualTo(String value) {
            addCriterion("master_reply_state =", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateNotEqualTo(String value) {
            addCriterion("master_reply_state <>", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateGreaterThan(String value) {
            addCriterion("master_reply_state >", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateGreaterThanOrEqualTo(String value) {
            addCriterion("master_reply_state >=", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateLessThan(String value) {
            addCriterion("master_reply_state <", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateLessThanOrEqualTo(String value) {
            addCriterion("master_reply_state <=", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateLike(String value) {
            addCriterion("master_reply_state like", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateNotLike(String value) {
            addCriterion("master_reply_state not like", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateIn(List<String> values) {
            addCriterion("master_reply_state in", values, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateNotIn(List<String> values) {
            addCriterion("master_reply_state not in", values, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateBetween(String value1, String value2) {
            addCriterion("master_reply_state between", value1, value2, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateNotBetween(String value1, String value2) {
            addCriterion("master_reply_state not between", value1, value2, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeIsNull() {
            addCriterion("master_reply_time is null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeIsNotNull() {
            addCriterion("master_reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeEqualTo(Date value) {
            addCriterion("master_reply_time =", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeNotEqualTo(Date value) {
            addCriterion("master_reply_time <>", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeGreaterThan(Date value) {
            addCriterion("master_reply_time >", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("master_reply_time >=", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeLessThan(Date value) {
            addCriterion("master_reply_time <", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("master_reply_time <=", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeIn(List<Date> values) {
            addCriterion("master_reply_time in", values, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeNotIn(List<Date> values) {
            addCriterion("master_reply_time not in", values, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeBetween(Date value1, Date value2) {
            addCriterion("master_reply_time between", value1, value2, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("master_reply_time not between", value1, value2, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateIsNull() {
            addCriterion("thirdparty_charge_state is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateIsNotNull() {
            addCriterion("thirdparty_charge_state is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateEqualTo(String value) {
            addCriterion("thirdparty_charge_state =", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateNotEqualTo(String value) {
            addCriterion("thirdparty_charge_state <>", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateGreaterThan(String value) {
            addCriterion("thirdparty_charge_state >", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateGreaterThanOrEqualTo(String value) {
            addCriterion("thirdparty_charge_state >=", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateLessThan(String value) {
            addCriterion("thirdparty_charge_state <", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateLessThanOrEqualTo(String value) {
            addCriterion("thirdparty_charge_state <=", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateLike(String value) {
            addCriterion("thirdparty_charge_state like", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateNotLike(String value) {
            addCriterion("thirdparty_charge_state not like", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateIn(List<String> values) {
            addCriterion("thirdparty_charge_state in", values, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateNotIn(List<String> values) {
            addCriterion("thirdparty_charge_state not in", values, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateBetween(String value1, String value2) {
            addCriterion("thirdparty_charge_state between", value1, value2, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateNotBetween(String value1, String value2) {
            addCriterion("thirdparty_charge_state not between", value1, value2, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserIsNull() {
            addCriterion("already_use_cont_user is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserIsNotNull() {
            addCriterion("already_use_cont_user is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserEqualTo(Integer value) {
            addCriterion("already_use_cont_user =", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserNotEqualTo(Integer value) {
            addCriterion("already_use_cont_user <>", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserGreaterThan(Integer value) {
            addCriterion("already_use_cont_user >", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("already_use_cont_user >=", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserLessThan(Integer value) {
            addCriterion("already_use_cont_user <", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserLessThanOrEqualTo(Integer value) {
            addCriterion("already_use_cont_user <=", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserIn(List<Integer> values) {
            addCriterion("already_use_cont_user in", values, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserNotIn(List<Integer> values) {
            addCriterion("already_use_cont_user not in", values, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserBetween(Integer value1, Integer value2) {
            addCriterion("already_use_cont_user between", value1, value2, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserNotBetween(Integer value1, Integer value2) {
            addCriterion("already_use_cont_user not between", value1, value2, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIsNull() {
            addCriterion("valuation_currency is null");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIsNotNull() {
            addCriterion("valuation_currency is not null");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyEqualTo(String value) {
            addCriterion("valuation_currency =", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotEqualTo(String value) {
            addCriterion("valuation_currency <>", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyGreaterThan(String value) {
            addCriterion("valuation_currency >", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_currency >=", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyLessThan(String value) {
            addCriterion("valuation_currency <", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyLessThanOrEqualTo(String value) {
            addCriterion("valuation_currency <=", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyLike(String value) {
            addCriterion("valuation_currency like", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotLike(String value) {
            addCriterion("valuation_currency not like", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIn(List<String> values) {
            addCriterion("valuation_currency in", values, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotIn(List<String> values) {
            addCriterion("valuation_currency not in", values, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyBetween(String value1, String value2) {
            addCriterion("valuation_currency between", value1, value2, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyNotBetween(String value1, String value2) {
            addCriterion("valuation_currency not between", value1, value2, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIsNull() {
            addCriterion("valuation_man_hour_cost is null");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIsNotNull() {
            addCriterion("valuation_man_hour_cost is not null");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost =", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostNotEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost <>", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostGreaterThan(BigDecimal value) {
            addCriterion("valuation_man_hour_cost >", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost >=", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostLessThan(BigDecimal value) {
            addCriterion("valuation_man_hour_cost <", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_man_hour_cost <=", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIn(List<BigDecimal> values) {
            addCriterion("valuation_man_hour_cost in", values, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostNotIn(List<BigDecimal> values) {
            addCriterion("valuation_man_hour_cost not in", values, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_man_hour_cost between", value1, value2, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_man_hour_cost not between", value1, value2, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIsNull() {
            addCriterion("valuation_material_cost is null");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIsNotNull() {
            addCriterion("valuation_material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost =", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost <>", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("valuation_material_cost >", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost >=", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostLessThan(BigDecimal value) {
            addCriterion("valuation_material_cost <", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_material_cost <=", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIn(List<BigDecimal> values) {
            addCriterion("valuation_material_cost in", values, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("valuation_material_cost not in", values, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_material_cost between", value1, value2, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_material_cost not between", value1, value2, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyIsNull() {
            addCriterion("valuation_thirdparty_money is null");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyIsNotNull() {
            addCriterion("valuation_thirdparty_money is not null");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyEqualTo(BigDecimal value) {
            addCriterion("valuation_thirdparty_money =", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("valuation_thirdparty_money <>", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyGreaterThan(BigDecimal value) {
            addCriterion("valuation_thirdparty_money >", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_thirdparty_money >=", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyLessThan(BigDecimal value) {
            addCriterion("valuation_thirdparty_money <", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_thirdparty_money <=", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyIn(List<BigDecimal> values) {
            addCriterion("valuation_thirdparty_money in", values, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("valuation_thirdparty_money not in", values, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_thirdparty_money between", value1, value2, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_thirdparty_money not between", value1, value2, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyIsNull() {
            addCriterion("valuation_money is null");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyIsNotNull() {
            addCriterion("valuation_money is not null");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyEqualTo(BigDecimal value) {
            addCriterion("valuation_money =", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyNotEqualTo(BigDecimal value) {
            addCriterion("valuation_money <>", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyGreaterThan(BigDecimal value) {
            addCriterion("valuation_money >", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_money >=", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyLessThan(BigDecimal value) {
            addCriterion("valuation_money <", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_money <=", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyIn(List<BigDecimal> values) {
            addCriterion("valuation_money in", values, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyNotIn(List<BigDecimal> values) {
            addCriterion("valuation_money not in", values, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_money between", value1, value2, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_money not between", value1, value2, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbIsNull() {
            addCriterion("master_reply_money_rmb is null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbIsNotNull() {
            addCriterion("master_reply_money_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_rmb =", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbNotEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_rmb <>", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbGreaterThan(BigDecimal value) {
            addCriterion("master_reply_money_rmb >", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_rmb >=", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbLessThan(BigDecimal value) {
            addCriterion("master_reply_money_rmb <", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_rmb <=", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbIn(List<BigDecimal> values) {
            addCriterion("master_reply_money_rmb in", values, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbNotIn(List<BigDecimal> values) {
            addCriterion("master_reply_money_rmb not in", values, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_reply_money_rmb between", value1, value2, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_reply_money_rmb not between", value1, value2, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdIsNull() {
            addCriterion("master_reply_money_usd is null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdIsNotNull() {
            addCriterion("master_reply_money_usd is not null");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_usd =", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdNotEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_usd <>", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdGreaterThan(BigDecimal value) {
            addCriterion("master_reply_money_usd >", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_usd >=", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdLessThan(BigDecimal value) {
            addCriterion("master_reply_money_usd <", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("master_reply_money_usd <=", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdIn(List<BigDecimal> values) {
            addCriterion("master_reply_money_usd in", values, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdNotIn(List<BigDecimal> values) {
            addCriterion("master_reply_money_usd not in", values, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_reply_money_usd between", value1, value2, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_reply_money_usd not between", value1, value2, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbIsNull() {
            addCriterion("use_reply_money_rmb is null");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbIsNotNull() {
            addCriterion("use_reply_money_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_rmb =", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbNotEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_rmb <>", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbGreaterThan(BigDecimal value) {
            addCriterion("use_reply_money_rmb >", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_rmb >=", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbLessThan(BigDecimal value) {
            addCriterion("use_reply_money_rmb <", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_rmb <=", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbIn(List<BigDecimal> values) {
            addCriterion("use_reply_money_rmb in", values, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbNotIn(List<BigDecimal> values) {
            addCriterion("use_reply_money_rmb not in", values, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_reply_money_rmb between", value1, value2, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_reply_money_rmb not between", value1, value2, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdIsNull() {
            addCriterion("use_reply_money_usd is null");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdIsNotNull() {
            addCriterion("use_reply_money_usd is not null");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_usd =", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdNotEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_usd <>", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdGreaterThan(BigDecimal value) {
            addCriterion("use_reply_money_usd >", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_usd >=", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdLessThan(BigDecimal value) {
            addCriterion("use_reply_money_usd <", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_reply_money_usd <=", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdIn(List<BigDecimal> values) {
            addCriterion("use_reply_money_usd in", values, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdNotIn(List<BigDecimal> values) {
            addCriterion("use_reply_money_usd not in", values, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_reply_money_usd between", value1, value2, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_reply_money_usd not between", value1, value2, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbIsNull() {
            addCriterion("receipts_master_money_rmb is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbIsNotNull() {
            addCriterion("receipts_master_money_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_rmb =", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbNotEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_rmb <>", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbGreaterThan(BigDecimal value) {
            addCriterion("receipts_master_money_rmb >", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_rmb >=", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbLessThan(BigDecimal value) {
            addCriterion("receipts_master_money_rmb <", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_rmb <=", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbIn(List<BigDecimal> values) {
            addCriterion("receipts_master_money_rmb in", values, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbNotIn(List<BigDecimal> values) {
            addCriterion("receipts_master_money_rmb not in", values, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_master_money_rmb between", value1, value2, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_master_money_rmb not between", value1, value2, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdIsNull() {
            addCriterion("receipts_master_money_usd is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdIsNotNull() {
            addCriterion("receipts_master_money_usd is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_usd =", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdNotEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_usd <>", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdGreaterThan(BigDecimal value) {
            addCriterion("receipts_master_money_usd >", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_usd >=", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdLessThan(BigDecimal value) {
            addCriterion("receipts_master_money_usd <", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_master_money_usd <=", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdIn(List<BigDecimal> values) {
            addCriterion("receipts_master_money_usd in", values, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdNotIn(List<BigDecimal> values) {
            addCriterion("receipts_master_money_usd not in", values, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_master_money_usd between", value1, value2, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_master_money_usd not between", value1, value2, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbIsNull() {
            addCriterion("receipts_use_money_rmb is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbIsNotNull() {
            addCriterion("receipts_use_money_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_rmb =", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbNotEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_rmb <>", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbGreaterThan(BigDecimal value) {
            addCriterion("receipts_use_money_rmb >", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_rmb >=", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbLessThan(BigDecimal value) {
            addCriterion("receipts_use_money_rmb <", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_rmb <=", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbIn(List<BigDecimal> values) {
            addCriterion("receipts_use_money_rmb in", values, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbNotIn(List<BigDecimal> values) {
            addCriterion("receipts_use_money_rmb not in", values, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_use_money_rmb between", value1, value2, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_use_money_rmb not between", value1, value2, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdIsNull() {
            addCriterion("receipts_use_money_usd is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdIsNotNull() {
            addCriterion("receipts_use_money_usd is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_usd =", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdNotEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_usd <>", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdGreaterThan(BigDecimal value) {
            addCriterion("receipts_use_money_usd >", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_usd >=", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdLessThan(BigDecimal value) {
            addCriterion("receipts_use_money_usd <", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receipts_use_money_usd <=", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdIn(List<BigDecimal> values) {
            addCriterion("receipts_use_money_usd in", values, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdNotIn(List<BigDecimal> values) {
            addCriterion("receipts_use_money_usd not in", values, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_use_money_usd between", value1, value2, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipts_use_money_usd not between", value1, value2, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNull() {
            addCriterion("urgency is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("urgency is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(String value) {
            addCriterion("urgency =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(String value) {
            addCriterion("urgency <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(String value) {
            addCriterion("urgency >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("urgency >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(String value) {
            addCriterion("urgency <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(String value) {
            addCriterion("urgency <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLike(String value) {
            addCriterion("urgency like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotLike(String value) {
            addCriterion("urgency not like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<String> values) {
            addCriterion("urgency in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<String> values) {
            addCriterion("urgency not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(String value1, String value2) {
            addCriterion("urgency between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(String value1, String value2) {
            addCriterion("urgency not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIsNull() {
            addCriterion("valuation_time is null");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIsNotNull() {
            addCriterion("valuation_time is not null");
            return (Criteria) this;
        }

        public Criteria andValuationTimeEqualTo(Date value) {
            addCriterion("valuation_time =", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeNotEqualTo(Date value) {
            addCriterion("valuation_time <>", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeGreaterThan(Date value) {
            addCriterion("valuation_time >", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valuation_time >=", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeLessThan(Date value) {
            addCriterion("valuation_time <", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeLessThanOrEqualTo(Date value) {
            addCriterion("valuation_time <=", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIn(List<Date> values) {
            addCriterion("valuation_time in", values, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeNotIn(List<Date> values) {
            addCriterion("valuation_time not in", values, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeBetween(Date value1, Date value2) {
            addCriterion("valuation_time between", value1, value2, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeNotBetween(Date value1, Date value2) {
            addCriterion("valuation_time not between", value1, value2, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationUserIsNull() {
            addCriterion("valuation_user is null");
            return (Criteria) this;
        }

        public Criteria andValuationUserIsNotNull() {
            addCriterion("valuation_user is not null");
            return (Criteria) this;
        }

        public Criteria andValuationUserEqualTo(Integer value) {
            addCriterion("valuation_user =", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserNotEqualTo(Integer value) {
            addCriterion("valuation_user <>", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserGreaterThan(Integer value) {
            addCriterion("valuation_user >", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("valuation_user >=", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserLessThan(Integer value) {
            addCriterion("valuation_user <", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserLessThanOrEqualTo(Integer value) {
            addCriterion("valuation_user <=", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserIn(List<Integer> values) {
            addCriterion("valuation_user in", values, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserNotIn(List<Integer> values) {
            addCriterion("valuation_user not in", values, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserBetween(Integer value1, Integer value2) {
            addCriterion("valuation_user between", value1, value2, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserNotBetween(Integer value1, Integer value2) {
            addCriterion("valuation_user not between", value1, value2, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectIsNull() {
            addCriterion("valuation_reject is null");
            return (Criteria) this;
        }

        public Criteria andValuationRejectIsNotNull() {
            addCriterion("valuation_reject is not null");
            return (Criteria) this;
        }

        public Criteria andValuationRejectEqualTo(String value) {
            addCriterion("valuation_reject =", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectNotEqualTo(String value) {
            addCriterion("valuation_reject <>", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectGreaterThan(String value) {
            addCriterion("valuation_reject >", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_reject >=", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectLessThan(String value) {
            addCriterion("valuation_reject <", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectLessThanOrEqualTo(String value) {
            addCriterion("valuation_reject <=", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectLike(String value) {
            addCriterion("valuation_reject like", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectNotLike(String value) {
            addCriterion("valuation_reject not like", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectIn(List<String> values) {
            addCriterion("valuation_reject in", values, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectNotIn(List<String> values) {
            addCriterion("valuation_reject not in", values, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectBetween(String value1, String value2) {
            addCriterion("valuation_reject between", value1, value2, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectNotBetween(String value1, String value2) {
            addCriterion("valuation_reject not between", value1, value2, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksIsNull() {
            addCriterion("valuation_remarks is null");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksIsNotNull() {
            addCriterion("valuation_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksEqualTo(String value) {
            addCriterion("valuation_remarks =", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksNotEqualTo(String value) {
            addCriterion("valuation_remarks <>", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksGreaterThan(String value) {
            addCriterion("valuation_remarks >", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_remarks >=", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksLessThan(String value) {
            addCriterion("valuation_remarks <", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksLessThanOrEqualTo(String value) {
            addCriterion("valuation_remarks <=", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksLike(String value) {
            addCriterion("valuation_remarks like", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksNotLike(String value) {
            addCriterion("valuation_remarks not like", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksIn(List<String> values) {
            addCriterion("valuation_remarks in", values, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksNotIn(List<String> values) {
            addCriterion("valuation_remarks not in", values, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksBetween(String value1, String value2) {
            addCriterion("valuation_remarks between", value1, value2, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksNotBetween(String value1, String value2) {
            addCriterion("valuation_remarks not between", value1, value2, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIsNull() {
            addCriterion("designate_user is null");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIsNotNull() {
            addCriterion("designate_user is not null");
            return (Criteria) this;
        }

        public Criteria andDesignateUserEqualTo(Integer value) {
            addCriterion("designate_user =", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserNotEqualTo(Integer value) {
            addCriterion("designate_user <>", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserGreaterThan(Integer value) {
            addCriterion("designate_user >", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("designate_user >=", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserLessThan(Integer value) {
            addCriterion("designate_user <", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserLessThanOrEqualTo(Integer value) {
            addCriterion("designate_user <=", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIn(List<Integer> values) {
            addCriterion("designate_user in", values, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserNotIn(List<Integer> values) {
            addCriterion("designate_user not in", values, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserBetween(Integer value1, Integer value2) {
            addCriterion("designate_user between", value1, value2, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("designate_user not between", value1, value2, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIsNull() {
            addCriterion("designate_time is null");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIsNotNull() {
            addCriterion("designate_time is not null");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeEqualTo(Date value) {
            addCriterion("designate_time =", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeNotEqualTo(Date value) {
            addCriterion("designate_time <>", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeGreaterThan(Date value) {
            addCriterion("designate_time >", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("designate_time >=", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeLessThan(Date value) {
            addCriterion("designate_time <", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeLessThanOrEqualTo(Date value) {
            addCriterion("designate_time <=", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIn(List<Date> values) {
            addCriterion("designate_time in", values, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeNotIn(List<Date> values) {
            addCriterion("designate_time not in", values, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeBetween(Date value1, Date value2) {
            addCriterion("designate_time between", value1, value2, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeNotBetween(Date value1, Date value2) {
            addCriterion("designate_time not between", value1, value2, "designateTime");
            return (Criteria) this;
        }

        public Criteria andReferralStateIsNull() {
            addCriterion("referral_state is null");
            return (Criteria) this;
        }

        public Criteria andReferralStateIsNotNull() {
            addCriterion("referral_state is not null");
            return (Criteria) this;
        }

        public Criteria andReferralStateEqualTo(String value) {
            addCriterion("referral_state =", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotEqualTo(String value) {
            addCriterion("referral_state <>", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateGreaterThan(String value) {
            addCriterion("referral_state >", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateGreaterThanOrEqualTo(String value) {
            addCriterion("referral_state >=", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateLessThan(String value) {
            addCriterion("referral_state <", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateLessThanOrEqualTo(String value) {
            addCriterion("referral_state <=", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateLike(String value) {
            addCriterion("referral_state like", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotLike(String value) {
            addCriterion("referral_state not like", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateIn(List<String> values) {
            addCriterion("referral_state in", values, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotIn(List<String> values) {
            addCriterion("referral_state not in", values, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateBetween(String value1, String value2) {
            addCriterion("referral_state between", value1, value2, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateNotBetween(String value1, String value2) {
            addCriterion("referral_state not between", value1, value2, "referralState");
            return (Criteria) this;
        }

        public Criteria andFinishUserIsNull() {
            addCriterion("finish_user is null");
            return (Criteria) this;
        }

        public Criteria andFinishUserIsNotNull() {
            addCriterion("finish_user is not null");
            return (Criteria) this;
        }

        public Criteria andFinishUserEqualTo(Integer value) {
            addCriterion("finish_user =", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotEqualTo(Integer value) {
            addCriterion("finish_user <>", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserGreaterThan(Integer value) {
            addCriterion("finish_user >", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_user >=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLessThan(Integer value) {
            addCriterion("finish_user <", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLessThanOrEqualTo(Integer value) {
            addCriterion("finish_user <=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserIn(List<Integer> values) {
            addCriterion("finish_user in", values, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotIn(List<Integer> values) {
            addCriterion("finish_user not in", values, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserBetween(Integer value1, Integer value2) {
            addCriterion("finish_user between", value1, value2, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_user not between", value1, value2, "finishUser");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIsNull() {
            addCriterion("referral_type is null");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIsNotNull() {
            addCriterion("referral_type is not null");
            return (Criteria) this;
        }

        public Criteria andReferralTypeEqualTo(String value) {
            addCriterion("referral_type =", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotEqualTo(String value) {
            addCriterion("referral_type <>", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeGreaterThan(String value) {
            addCriterion("referral_type >", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeGreaterThanOrEqualTo(String value) {
            addCriterion("referral_type >=", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeLessThan(String value) {
            addCriterion("referral_type <", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeLessThanOrEqualTo(String value) {
            addCriterion("referral_type <=", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeLike(String value) {
            addCriterion("referral_type like", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotLike(String value) {
            addCriterion("referral_type not like", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIn(List<String> values) {
            addCriterion("referral_type in", values, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotIn(List<String> values) {
            addCriterion("referral_type not in", values, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeBetween(String value1, String value2) {
            addCriterion("referral_type between", value1, value2, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeNotBetween(String value1, String value2) {
            addCriterion("referral_type not between", value1, value2, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIsNull() {
            addCriterion("referral_time is null");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIsNotNull() {
            addCriterion("referral_time is not null");
            return (Criteria) this;
        }

        public Criteria andReferralTimeEqualTo(Date value) {
            addCriterion("referral_time =", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeNotEqualTo(Date value) {
            addCriterion("referral_time <>", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeGreaterThan(Date value) {
            addCriterion("referral_time >", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("referral_time >=", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeLessThan(Date value) {
            addCriterion("referral_time <", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeLessThanOrEqualTo(Date value) {
            addCriterion("referral_time <=", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIn(List<Date> values) {
            addCriterion("referral_time in", values, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeNotIn(List<Date> values) {
            addCriterion("referral_time not in", values, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeBetween(Date value1, Date value2) {
            addCriterion("referral_time between", value1, value2, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeNotBetween(Date value1, Date value2) {
            addCriterion("referral_time not between", value1, value2, "referralTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNull() {
            addCriterion("predict_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNotNull() {
            addCriterion("predict_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeEqualTo(String value) {
            addCriterion("predict_time =", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotEqualTo(String value) {
            addCriterion("predict_time <>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThan(String value) {
            addCriterion("predict_time >", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_time >=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThan(String value) {
            addCriterion("predict_time <", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThanOrEqualTo(String value) {
            addCriterion("predict_time <=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLike(String value) {
            addCriterion("predict_time like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotLike(String value) {
            addCriterion("predict_time not like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIn(List<String> values) {
            addCriterion("predict_time in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotIn(List<String> values) {
            addCriterion("predict_time not in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeBetween(String value1, String value2) {
            addCriterion("predict_time between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotBetween(String value1, String value2) {
            addCriterion("predict_time not between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andManHourIsNull() {
            addCriterion("man_hour is null");
            return (Criteria) this;
        }

        public Criteria andManHourIsNotNull() {
            addCriterion("man_hour is not null");
            return (Criteria) this;
        }

        public Criteria andManHourEqualTo(Double value) {
            addCriterion("man_hour =", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotEqualTo(Double value) {
            addCriterion("man_hour <>", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThan(Double value) {
            addCriterion("man_hour >", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThanOrEqualTo(Double value) {
            addCriterion("man_hour >=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThan(Double value) {
            addCriterion("man_hour <", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThanOrEqualTo(Double value) {
            addCriterion("man_hour <=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourIn(List<Double> values) {
            addCriterion("man_hour in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotIn(List<Double> values) {
            addCriterion("man_hour not in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourBetween(Double value1, Double value2) {
            addCriterion("man_hour between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotBetween(Double value1, Double value2) {
            addCriterion("man_hour not between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIsNull() {
            addCriterion("finish_audit_user is null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIsNotNull() {
            addCriterion("finish_audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserEqualTo(Integer value) {
            addCriterion("finish_audit_user =", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserNotEqualTo(Integer value) {
            addCriterion("finish_audit_user <>", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserGreaterThan(Integer value) {
            addCriterion("finish_audit_user >", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_audit_user >=", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserLessThan(Integer value) {
            addCriterion("finish_audit_user <", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserLessThanOrEqualTo(Integer value) {
            addCriterion("finish_audit_user <=", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIn(List<Integer> values) {
            addCriterion("finish_audit_user in", values, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserNotIn(List<Integer> values) {
            addCriterion("finish_audit_user not in", values, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserBetween(Integer value1, Integer value2) {
            addCriterion("finish_audit_user between", value1, value2, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_audit_user not between", value1, value2, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIsNull() {
            addCriterion("finish_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIsNotNull() {
            addCriterion("finish_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeEqualTo(Date value) {
            addCriterion("finish_audit_time =", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeNotEqualTo(Date value) {
            addCriterion("finish_audit_time <>", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeGreaterThan(Date value) {
            addCriterion("finish_audit_time >", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_audit_time >=", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeLessThan(Date value) {
            addCriterion("finish_audit_time <", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_audit_time <=", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIn(List<Date> values) {
            addCriterion("finish_audit_time in", values, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeNotIn(List<Date> values) {
            addCriterion("finish_audit_time not in", values, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeBetween(Date value1, Date value2) {
            addCriterion("finish_audit_time between", value1, value2, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_audit_time not between", value1, value2, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIsNull() {
            addCriterion("referral_remarks is null");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIsNotNull() {
            addCriterion("referral_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksEqualTo(String value) {
            addCriterion("referral_remarks =", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotEqualTo(String value) {
            addCriterion("referral_remarks <>", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksGreaterThan(String value) {
            addCriterion("referral_remarks >", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("referral_remarks >=", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksLessThan(String value) {
            addCriterion("referral_remarks <", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksLessThanOrEqualTo(String value) {
            addCriterion("referral_remarks <=", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksLike(String value) {
            addCriterion("referral_remarks like", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotLike(String value) {
            addCriterion("referral_remarks not like", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIn(List<String> values) {
            addCriterion("referral_remarks in", values, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotIn(List<String> values) {
            addCriterion("referral_remarks not in", values, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksBetween(String value1, String value2) {
            addCriterion("referral_remarks between", value1, value2, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksNotBetween(String value1, String value2) {
            addCriterion("referral_remarks not between", value1, value2, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIsNull() {
            addCriterion("quality_type is null");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIsNotNull() {
            addCriterion("quality_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTypeEqualTo(String value) {
            addCriterion("quality_type =", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotEqualTo(String value) {
            addCriterion("quality_type <>", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeGreaterThan(String value) {
            addCriterion("quality_type >", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quality_type >=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLessThan(String value) {
            addCriterion("quality_type <", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLessThanOrEqualTo(String value) {
            addCriterion("quality_type <=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLike(String value) {
            addCriterion("quality_type like", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotLike(String value) {
            addCriterion("quality_type not like", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIn(List<String> values) {
            addCriterion("quality_type in", values, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotIn(List<String> values) {
            addCriterion("quality_type not in", values, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeBetween(String value1, String value2) {
            addCriterion("quality_type between", value1, value2, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotBetween(String value1, String value2) {
            addCriterion("quality_type not between", value1, value2, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityStateIsNull() {
            addCriterion("quality_state is null");
            return (Criteria) this;
        }

        public Criteria andQualityStateIsNotNull() {
            addCriterion("quality_state is not null");
            return (Criteria) this;
        }

        public Criteria andQualityStateEqualTo(String value) {
            addCriterion("quality_state =", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateNotEqualTo(String value) {
            addCriterion("quality_state <>", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateGreaterThan(String value) {
            addCriterion("quality_state >", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateGreaterThanOrEqualTo(String value) {
            addCriterion("quality_state >=", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateLessThan(String value) {
            addCriterion("quality_state <", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateLessThanOrEqualTo(String value) {
            addCriterion("quality_state <=", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateLike(String value) {
            addCriterion("quality_state like", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateNotLike(String value) {
            addCriterion("quality_state not like", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateIn(List<String> values) {
            addCriterion("quality_state in", values, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateNotIn(List<String> values) {
            addCriterion("quality_state not in", values, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateBetween(String value1, String value2) {
            addCriterion("quality_state between", value1, value2, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateNotBetween(String value1, String value2) {
            addCriterion("quality_state not between", value1, value2, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityResultIsNull() {
            addCriterion("quality_result is null");
            return (Criteria) this;
        }

        public Criteria andQualityResultIsNotNull() {
            addCriterion("quality_result is not null");
            return (Criteria) this;
        }

        public Criteria andQualityResultEqualTo(String value) {
            addCriterion("quality_result =", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotEqualTo(String value) {
            addCriterion("quality_result <>", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultGreaterThan(String value) {
            addCriterion("quality_result >", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultGreaterThanOrEqualTo(String value) {
            addCriterion("quality_result >=", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultLessThan(String value) {
            addCriterion("quality_result <", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultLessThanOrEqualTo(String value) {
            addCriterion("quality_result <=", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultLike(String value) {
            addCriterion("quality_result like", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotLike(String value) {
            addCriterion("quality_result not like", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultIn(List<String> values) {
            addCriterion("quality_result in", values, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotIn(List<String> values) {
            addCriterion("quality_result not in", values, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultBetween(String value1, String value2) {
            addCriterion("quality_result between", value1, value2, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotBetween(String value1, String value2) {
            addCriterion("quality_result not between", value1, value2, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityUserIsNull() {
            addCriterion("quality_user is null");
            return (Criteria) this;
        }

        public Criteria andQualityUserIsNotNull() {
            addCriterion("quality_user is not null");
            return (Criteria) this;
        }

        public Criteria andQualityUserEqualTo(Integer value) {
            addCriterion("quality_user =", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserNotEqualTo(Integer value) {
            addCriterion("quality_user <>", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserGreaterThan(Integer value) {
            addCriterion("quality_user >", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_user >=", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserLessThan(Integer value) {
            addCriterion("quality_user <", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserLessThanOrEqualTo(Integer value) {
            addCriterion("quality_user <=", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserIn(List<Integer> values) {
            addCriterion("quality_user in", values, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserNotIn(List<Integer> values) {
            addCriterion("quality_user not in", values, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserBetween(Integer value1, Integer value2) {
            addCriterion("quality_user between", value1, value2, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_user not between", value1, value2, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIsNull() {
            addCriterion("quality_time is null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIsNotNull() {
            addCriterion("quality_time is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeEqualTo(Date value) {
            addCriterion("quality_time =", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotEqualTo(Date value) {
            addCriterion("quality_time <>", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeGreaterThan(Date value) {
            addCriterion("quality_time >", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("quality_time >=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeLessThan(Date value) {
            addCriterion("quality_time <", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeLessThanOrEqualTo(Date value) {
            addCriterion("quality_time <=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIn(List<Date> values) {
            addCriterion("quality_time in", values, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotIn(List<Date> values) {
            addCriterion("quality_time not in", values, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeBetween(Date value1, Date value2) {
            addCriterion("quality_time between", value1, value2, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotBetween(Date value1, Date value2) {
            addCriterion("quality_time not between", value1, value2, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutIsNull() {
            addCriterion("quality_timeout is null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutIsNotNull() {
            addCriterion("quality_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutEqualTo(Double value) {
            addCriterion("quality_timeout =", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutNotEqualTo(Double value) {
            addCriterion("quality_timeout <>", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutGreaterThan(Double value) {
            addCriterion("quality_timeout >", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutGreaterThanOrEqualTo(Double value) {
            addCriterion("quality_timeout >=", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutLessThan(Double value) {
            addCriterion("quality_timeout <", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutLessThanOrEqualTo(Double value) {
            addCriterion("quality_timeout <=", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutIn(List<Double> values) {
            addCriterion("quality_timeout in", values, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutNotIn(List<Double> values) {
            addCriterion("quality_timeout not in", values, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutBetween(Double value1, Double value2) {
            addCriterion("quality_timeout between", value1, value2, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutNotBetween(Double value1, Double value2) {
            addCriterion("quality_timeout not between", value1, value2, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateIsNull() {
            addCriterion("pk_quality_state is null");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateIsNotNull() {
            addCriterion("pk_quality_state is not null");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateEqualTo(String value) {
            addCriterion("pk_quality_state =", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateNotEqualTo(String value) {
            addCriterion("pk_quality_state <>", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateGreaterThan(String value) {
            addCriterion("pk_quality_state >", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateGreaterThanOrEqualTo(String value) {
            addCriterion("pk_quality_state >=", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateLessThan(String value) {
            addCriterion("pk_quality_state <", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateLessThanOrEqualTo(String value) {
            addCriterion("pk_quality_state <=", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateLike(String value) {
            addCriterion("pk_quality_state like", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateNotLike(String value) {
            addCriterion("pk_quality_state not like", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateIn(List<String> values) {
            addCriterion("pk_quality_state in", values, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateNotIn(List<String> values) {
            addCriterion("pk_quality_state not in", values, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateBetween(String value1, String value2) {
            addCriterion("pk_quality_state between", value1, value2, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateNotBetween(String value1, String value2) {
            addCriterion("pk_quality_state not between", value1, value2, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserIsNull() {
            addCriterion("pk_quality_user is null");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserIsNotNull() {
            addCriterion("pk_quality_user is not null");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserEqualTo(Integer value) {
            addCriterion("pk_quality_user =", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserNotEqualTo(Integer value) {
            addCriterion("pk_quality_user <>", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserGreaterThan(Integer value) {
            addCriterion("pk_quality_user >", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_quality_user >=", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserLessThan(Integer value) {
            addCriterion("pk_quality_user <", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserLessThanOrEqualTo(Integer value) {
            addCriterion("pk_quality_user <=", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserIn(List<Integer> values) {
            addCriterion("pk_quality_user in", values, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserNotIn(List<Integer> values) {
            addCriterion("pk_quality_user not in", values, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserBetween(Integer value1, Integer value2) {
            addCriterion("pk_quality_user between", value1, value2, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_quality_user not between", value1, value2, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeIsNull() {
            addCriterion("pk_quality_time is null");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeIsNotNull() {
            addCriterion("pk_quality_time is not null");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeEqualTo(Date value) {
            addCriterion("pk_quality_time =", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeNotEqualTo(Date value) {
            addCriterion("pk_quality_time <>", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeGreaterThan(Date value) {
            addCriterion("pk_quality_time >", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pk_quality_time >=", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeLessThan(Date value) {
            addCriterion("pk_quality_time <", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeLessThanOrEqualTo(Date value) {
            addCriterion("pk_quality_time <=", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeIn(List<Date> values) {
            addCriterion("pk_quality_time in", values, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeNotIn(List<Date> values) {
            addCriterion("pk_quality_time not in", values, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeBetween(Date value1, Date value2) {
            addCriterion("pk_quality_time between", value1, value2, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeNotBetween(Date value1, Date value2) {
            addCriterion("pk_quality_time not between", value1, value2, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksIsNull() {
            addCriterion("pk_quality_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksIsNotNull() {
            addCriterion("pk_quality_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksEqualTo(String value) {
            addCriterion("pk_quality_remarks =", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksNotEqualTo(String value) {
            addCriterion("pk_quality_remarks <>", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksGreaterThan(String value) {
            addCriterion("pk_quality_remarks >", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("pk_quality_remarks >=", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksLessThan(String value) {
            addCriterion("pk_quality_remarks <", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksLessThanOrEqualTo(String value) {
            addCriterion("pk_quality_remarks <=", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksLike(String value) {
            addCriterion("pk_quality_remarks like", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksNotLike(String value) {
            addCriterion("pk_quality_remarks not like", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksIn(List<String> values) {
            addCriterion("pk_quality_remarks in", values, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksNotIn(List<String> values) {
            addCriterion("pk_quality_remarks not in", values, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksBetween(String value1, String value2) {
            addCriterion("pk_quality_remarks between", value1, value2, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksNotBetween(String value1, String value2) {
            addCriterion("pk_quality_remarks not between", value1, value2, "pkQualityRemarks");
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
        protected List<Criteria> orCriteria;

        protected Criteria() {
            super();
            orCriteria=new ArrayList<Criteria>();
        }

        public Criteria andProdCourseIdIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(prod_course_id,'"+defaultValue+"')=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(prod_course_id,'"+defaultValue+"')<>", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andContainerNoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_no,'"+defaultValue+"')=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_no,'"+defaultValue+"')<>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andIsPreviewIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_preview,'"+defaultValue+"')=", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andIsPreviewIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_preview,'"+defaultValue+"')<>", value, "isPreview");
            return (Criteria) this;
        }

        public Criteria andSizeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(`size`,'"+defaultValue+"')=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(`size`,'"+defaultValue+"')<>", value, "size");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_category,'"+defaultValue+"')=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_category,'"+defaultValue+"')<>", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_type,'"+defaultValue+"')=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_type,'"+defaultValue+"')<>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_age,'"+defaultValue+"')=", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerAgeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_age,'"+defaultValue+"')<>", value, "containerAge");
            return (Criteria) this;
        }

        public Criteria andContainerTareIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_tare,'"+defaultValue+"')=", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerTareIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_tare,'"+defaultValue+"')<>", value, "containerTare");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_load,'"+defaultValue+"')=", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerLoadIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_load,'"+defaultValue+"')<>", value, "containerLoad");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_volume,'"+defaultValue+"')=", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andContainerVolumeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_volume,'"+defaultValue+"')<>", value, "containerVolume");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(gross_weight,'"+defaultValue+"')=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(gross_weight,'"+defaultValue+"')<>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(unit_type,'"+defaultValue+"')=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(unit_type,'"+defaultValue+"')<>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andRightAngleIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(right_angle,'"+defaultValue+"')=", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andRightAngleIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(right_angle,'"+defaultValue+"')<>", value, "rightAngle");
            return (Criteria) this;
        }

        public Criteria andIsLabelIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_label,'"+defaultValue+"')=", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andIsLabelIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_label,'"+defaultValue+"')<>", value, "isLabel");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_owner,'"+defaultValue+"')=", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerOwnerIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_owner,'"+defaultValue+"')<>", value, "containerOwner");
            return (Criteria) this;
        }

        public Criteria andContainerBelongIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_belong,'"+defaultValue+"')=", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerBelongIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_belong,'"+defaultValue+"')<>", value, "containerBelong");
            return (Criteria) this;
        }

        public Criteria andContainerUserIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_user,'"+defaultValue+"')=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_user,'"+defaultValue+"')<>", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerGradeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_grade,'"+defaultValue+"')=", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerGradeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_grade,'"+defaultValue+"')<>", value, "containerGrade");
            return (Criteria) this;
        }

        public Criteria andContainerConditionIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_condition,'"+defaultValue+"')=", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andContainerConditionIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(container_condition,'"+defaultValue+"')<>", value, "containerCondition");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(bill_of_lading_no,'"+defaultValue+"')=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(bill_of_lading_no,'"+defaultValue+"')<>", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(vessel_voyage,'"+defaultValue+"')=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(vessel_voyage,'"+defaultValue+"')<>", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(domestic_foreign_trade,'"+defaultValue+"')=", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andDomesticForeignTradeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(domestic_foreign_trade,'"+defaultValue+"')<>", value, "domesticForeignTrade");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_gon_container,'"+defaultValue+"')=", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsGonContainerIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_gon_container,'"+defaultValue+"')<>", value, "isGonContainer");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_freeze_dry,'"+defaultValue+"')=", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeDryIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_freeze_dry,'"+defaultValue+"')<>", value, "isFreezeDry");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_surrender,'"+defaultValue+"')=", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andIsSurrenderIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_surrender,'"+defaultValue+"')<>", value, "isSurrender");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(surrender_course,'"+defaultValue+"')=", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andSurrenderCourseIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(surrender_course,'"+defaultValue+"')<>", value, "surrenderCourse");
            return (Criteria) this;
        }

        public Criteria andLabellingIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(labelling,'"+defaultValue+"')=", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(labelling,'"+defaultValue+"')<>", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(yard_container_type,'"+defaultValue+"')=", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContainerTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(yard_container_type,'"+defaultValue+"')<>", value, "yardContainerType");
            return (Criteria) this;
        }

        public Criteria andYardContGradeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(yard_cont_grade,'"+defaultValue+"')=", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andYardContGradeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(yard_cont_grade,'"+defaultValue+"')<>", value, "yardContGrade");
            return (Criteria) this;
        }

        public Criteria andLeadSealingIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(lead_sealing,'"+defaultValue+"')=", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andLeadSealingIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(lead_sealing,'"+defaultValue+"')<>", value, "leadSealing");
            return (Criteria) this;
        }

        public Criteria andBareWeightIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(bare_weight,'"+defaultValue+"')=", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andBareWeightIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(bare_weight,'"+defaultValue+"')<>", value, "bareWeight");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_cleanout,'"+defaultValue+"')=", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsCleanoutIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_cleanout,'"+defaultValue+"')<>", value, "isCleanout");
            return (Criteria) this;
        }

        public Criteria andIsLocatorIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_locator,'"+defaultValue+"')=", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andIsLocatorIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_locator,'"+defaultValue+"')<>", value, "isLocator");
            return (Criteria) this;
        }

        public Criteria andMotorcadeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(motorcade,'"+defaultValue+"')=", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andMotorcadeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(motorcade,'"+defaultValue+"')<>", value, "motorcade");
            return (Criteria) this;
        }

        public Criteria andCarNumberIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(car_number,'"+defaultValue+"')=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(car_number,'"+defaultValue+"')<>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andYardIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(yard,'"+defaultValue+"')=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(yard,'"+defaultValue+"')<>", value, "yard");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(course_type,'"+defaultValue+"')=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(course_type,'"+defaultValue+"')<>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(course_time,"+defaultValue+")=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(course_time,"+defaultValue+")<>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andTestingUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(testing_user,"+defaultValue+")=", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(testing_user,"+defaultValue+")<>", value, "testingUser");
            return (Criteria) this;
        }

        public Criteria andTestingStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_state,'"+defaultValue+"')=", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_state,'"+defaultValue+"')<>", value, "testingState");
            return (Criteria) this;
        }

        public Criteria andTestingRejectIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_reject,'"+defaultValue+"')=", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingRejectIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_reject,'"+defaultValue+"')<>", value, "testingReject");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(testing_time,"+defaultValue+")=", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(testing_time,"+defaultValue+")<>", value, "testingTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(testing_end_time,"+defaultValue+")=", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingEndTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(testing_end_time,"+defaultValue+")<>", value, "testingEndTime");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_man_hour_cost,"+defaultValue+")=", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingManHourCostIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_man_hour_cost,"+defaultValue+")<>", value, "testingManHourCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_material_cost,"+defaultValue+")=", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingMaterialCostIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_material_cost,"+defaultValue+")<>", value, "testingMaterialCost");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_thirdparty_money,"+defaultValue+")=", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingThirdpartyMoneyIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_thirdparty_money,"+defaultValue+")<>", value, "testingThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_money,"+defaultValue+")=", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andTestingMoneyIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(testing_money,"+defaultValue+")<>", value, "testingMoney");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(audit_type,'"+defaultValue+"')=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(audit_type,'"+defaultValue+"')<>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(audit_user,"+defaultValue+")=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(audit_user,"+defaultValue+")<>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(audit_time,"+defaultValue+")=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(audit_time,"+defaultValue+")<>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_remarks,'"+defaultValue+"')=", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andTestingRemarksIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_remarks,'"+defaultValue+"')<>", value, "testingRemarks");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(surrender_type,'"+defaultValue+"')=", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(surrender_type,'"+defaultValue+"')<>", value, "surrenderType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(surrender_bill_type,'"+defaultValue+"')=", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andSurrenderBillTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(surrender_bill_type,'"+defaultValue+"')<>", value, "surrenderBillType");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_owner_charge,'"+defaultValue+"')=", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andIsOwnerChargeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(is_owner_charge,'"+defaultValue+"')<>", value, "isOwnerCharge");
            return (Criteria) this;
        }

        public Criteria andValuationNoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_no,'"+defaultValue+"')=", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andValuationNoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_no,'"+defaultValue+"')<>", value, "valuationNo");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(use_reply_state,'"+defaultValue+"')=", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(use_reply_state,'"+defaultValue+"')<>", value, "useReplyState");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(use_reply_time,"+defaultValue+")=", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andUseReplyTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(use_reply_time,"+defaultValue+")<>", value, "useReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(master_reply_state,'"+defaultValue+"')=", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(master_reply_state,'"+defaultValue+"')<>", value, "masterReplyState");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(master_reply_time,"+defaultValue+")=", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andMasterReplyTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(master_reply_time,"+defaultValue+")<>", value, "masterReplyTime");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(thirdparty_charge_state,'"+defaultValue+"')=", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChargeStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(thirdparty_charge_state,'"+defaultValue+"')<>", value, "thirdpartyChargeState");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(already_use_cont_user,"+defaultValue+")=", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andAlreadyUseContUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(already_use_cont_user,"+defaultValue+")<>", value, "alreadyUseContUser");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_currency,'"+defaultValue+"')=", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationCurrencyIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_currency,'"+defaultValue+"')<>", value, "valuationCurrency");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_man_hour_cost,"+defaultValue+")=", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationManHourCostIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_man_hour_cost,"+defaultValue+")<>", value, "valuationManHourCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_material_cost,"+defaultValue+")=", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationMaterialCostIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_material_cost,"+defaultValue+")<>", value, "valuationMaterialCost");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_thirdparty_money,"+defaultValue+")=", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationThirdpartyMoneyIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_thirdparty_money,"+defaultValue+")<>", value, "valuationThirdpartyMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_money,"+defaultValue+")=", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andValuationMoneyIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(valuation_money,"+defaultValue+")<>", value, "valuationMoney");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(master_reply_money_rmb,"+defaultValue+")=", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyRmbIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(master_reply_money_rmb,"+defaultValue+")<>", value, "masterReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(master_reply_money_usd,"+defaultValue+")=", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andMasterReplyMoneyUsdIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(master_reply_money_usd,"+defaultValue+")<>", value, "masterReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(use_reply_money_rmb,"+defaultValue+")=", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyRmbIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(use_reply_money_rmb,"+defaultValue+")<>", value, "useReplyMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(use_reply_money_usd,"+defaultValue+")=", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUseReplyMoneyUsdIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(use_reply_money_usd,"+defaultValue+")<>", value, "useReplyMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_master_money_rmb,"+defaultValue+")=", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyRmbIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_master_money_rmb,"+defaultValue+")<>", value, "receiptsMasterMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_master_money_usd,"+defaultValue+")=", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsMasterMoneyUsdIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_master_money_usd,"+defaultValue+")<>", value, "receiptsMasterMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_use_money_rmb,"+defaultValue+")=", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyRmbIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_use_money_rmb,"+defaultValue+")<>", value, "receiptsUseMoneyRmb");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdIfNullEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_use_money_usd,"+defaultValue+")=", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andReceiptsUseMoneyUsdIfNullNotEqualTo(BigDecimal value, BigDecimal defaultValue) {
            addCriterion("ifnull(receipts_use_money_usd,"+defaultValue+")<>", value, "receiptsUseMoneyUsd");
            return (Criteria) this;
        }

        public Criteria andUrgencyIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(urgency,'"+defaultValue+"')=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(urgency,'"+defaultValue+"')<>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(valuation_time,"+defaultValue+")=", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(valuation_time,"+defaultValue+")<>", value, "valuationTime");
            return (Criteria) this;
        }

        public Criteria andValuationUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(valuation_user,"+defaultValue+")=", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(valuation_user,"+defaultValue+")<>", value, "valuationUser");
            return (Criteria) this;
        }

        public Criteria andValuationRejectIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_reject,'"+defaultValue+"')=", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRejectIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_reject,'"+defaultValue+"')<>", value, "valuationReject");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_remarks,'"+defaultValue+"')=", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andValuationRemarksIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(valuation_remarks,'"+defaultValue+"')<>", value, "valuationRemarks");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(designate_user,"+defaultValue+")=", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(designate_user,"+defaultValue+")<>", value, "designateUser");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(designate_time,"+defaultValue+")=", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andDesignateTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(designate_time,"+defaultValue+")<>", value, "designateTime");
            return (Criteria) this;
        }

        public Criteria andReferralStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(referral_state,'"+defaultValue+"')=", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andReferralStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(referral_state,'"+defaultValue+"')<>", value, "referralState");
            return (Criteria) this;
        }

        public Criteria andFinishUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(finish_user,"+defaultValue+")=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(finish_user,"+defaultValue+")<>", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(referral_type,'"+defaultValue+"')=", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(referral_type,'"+defaultValue+"')<>", value, "referralType");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(referral_time,"+defaultValue+")=", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andReferralTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(referral_time,"+defaultValue+")<>", value, "referralTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(predict_time,'"+defaultValue+"')=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(predict_time,'"+defaultValue+"')<>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andManHourIfNullEqualTo(Double value, Double defaultValue) {
            addCriterion("ifnull(man_hour,"+defaultValue+")=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourIfNullNotEqualTo(Double value, Double defaultValue) {
            addCriterion("ifnull(man_hour,"+defaultValue+")<>", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(finish_time,"+defaultValue+")=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(finish_time,"+defaultValue+")<>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(finish_audit_user,"+defaultValue+")=", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(finish_audit_user,"+defaultValue+")<>", value, "finishAuditUser");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(finish_audit_time,"+defaultValue+")=", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andFinishAuditTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(finish_audit_time,"+defaultValue+")<>", value, "finishAuditTime");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(referral_remarks,'"+defaultValue+"')=", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andReferralRemarksIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(referral_remarks,'"+defaultValue+"')<>", value, "referralRemarks");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_type,'"+defaultValue+"')=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_type,'"+defaultValue+"')<>", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_state,'"+defaultValue+"')=", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_state,'"+defaultValue+"')<>", value, "qualityState");
            return (Criteria) this;
        }

        public Criteria andQualityResultIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_result,'"+defaultValue+"')=", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_result,'"+defaultValue+"')<>", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(quality_user,"+defaultValue+")=", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(quality_user,"+defaultValue+")<>", value, "qualityUser");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(quality_time,"+defaultValue+")=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(quality_time,"+defaultValue+")<>", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutIfNullEqualTo(Double value, Double defaultValue) {
            addCriterion("ifnull(quality_timeout,"+defaultValue+")=", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andQualityTimeoutIfNullNotEqualTo(Double value, Double defaultValue) {
            addCriterion("ifnull(quality_timeout,"+defaultValue+")<>", value, "qualityTimeout");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(pk_quality_state,'"+defaultValue+"')=", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityStateIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(pk_quality_state,'"+defaultValue+"')<>", value, "pkQualityState");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(pk_quality_user,"+defaultValue+")=", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(pk_quality_user,"+defaultValue+")<>", value, "pkQualityUser");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(pk_quality_time,"+defaultValue+")=", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(pk_quality_time,"+defaultValue+")<>", value, "pkQualityTime");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(pk_quality_remarks,'"+defaultValue+"')=", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andPkQualityRemarksIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(pk_quality_remarks,'"+defaultValue+"')<>", value, "pkQualityRemarks");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(create_time,"+defaultValue+")=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(create_time,"+defaultValue+")<>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(create_user,"+defaultValue+")=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(create_user,"+defaultValue+")<>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIfNullEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(update_time,"+defaultValue+")=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIfNullNotEqualTo(Date value, Date defaultValue) {
            addCriterion("ifnull(update_time,"+defaultValue+")<>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIfNullEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(update_user,"+defaultValue+")=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIfNullNotEqualTo(Integer value, Integer defaultValue) {
            addCriterion("ifnull(update_user,"+defaultValue+")<>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andTestingPhotoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_photo,'"+defaultValue+"')=", value, "testingPhoto");
            return (Criteria) this;
        }

        public Criteria andTestingPhotoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(testing_photo,'"+defaultValue+"')<>", value, "testingPhoto");
            return (Criteria) this;
        }

        public Criteria andSpeedPhotoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(speed_photo,'"+defaultValue+"')=", value, "speedPhoto");
            return (Criteria) this;
        }

        public Criteria andSpeedPhotoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(speed_photo,'"+defaultValue+"')<>", value, "speedPhoto");
            return (Criteria) this;
        }

        public Criteria andAfterPhotoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(after_photo,'"+defaultValue+"')=", value, "afterPhoto");
            return (Criteria) this;
        }

        public Criteria andAfterPhotoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(after_photo,'"+defaultValue+"')<>", value, "afterPhoto");
            return (Criteria) this;
        }

        public Criteria andQualityPhotoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_photo,'"+defaultValue+"')=", value, "qualityPhoto");
            return (Criteria) this;
        }

        public Criteria andQualityPhotoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(quality_photo,'"+defaultValue+"')<>", value, "qualityPhoto");
            return (Criteria) this;
        }

        public Criteria andRecheckPhotoIfNullEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(recheck_photo,'"+defaultValue+"')=", value, "recheckPhoto");
            return (Criteria) this;
        }

        public Criteria andRecheckPhotoIfNullNotEqualTo(String value, String defaultValue) {
            addCriterion("ifnull(recheck_photo,'"+defaultValue+"')<>", value, "recheckPhoto");
            return (Criteria) this;
        }

        public Criteria createOrCriteria() {
            Criteria criteria = new Criteria();
            orCriteria.add(criteria);
            return criteria;
        }

        public List<Criteria> getOrCriteria() {
            return orCriteria;
        }

        public boolean getValidOr() {
            return orCriteria.size() > 0;
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