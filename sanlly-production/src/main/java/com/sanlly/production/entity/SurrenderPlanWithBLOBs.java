package com.sanlly.production.entity;

public class SurrenderPlanWithBLOBs extends SurrenderPlan {
    private byte[] surrenderPlan;

    private byte[] surrenderPlanEn;

    public byte[] getSurrenderPlan() {
        return surrenderPlan;
    }

    public void setSurrenderPlan(byte[] surrenderPlan) {
        this.surrenderPlan = surrenderPlan;
    }

    public byte[] getSurrenderPlanEn() {
        return surrenderPlanEn;
    }

    public void setSurrenderPlanEn(byte[] surrenderPlanEn) {
        this.surrenderPlanEn = surrenderPlanEn;
    }
}