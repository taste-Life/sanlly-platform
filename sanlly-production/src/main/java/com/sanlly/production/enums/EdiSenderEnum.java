package com.sanlly.production.enums;
/**
*@Description: Edi发送人枚举
*@Author: zjd
*@date: 2019-10-13
*/
public enum EdiSenderEnum {


    GES_SENDER ("CNTAOXANA",""),
    GES_RECEIVER ("GBLONSCLIT",""),
    TRTN_SENDER ("CNQINQOGA",""),
    TRTN_RECEIVER ("USSFOTRIB",""),
    HSD_SENDER ("CNQINQOGA",""),
    HSD_RECEIVER ("HKHKGC00AT",""),
    COS_SENDER ("COSHDY",""),
    COS_SENDER_SZX ("COSSZX",""),
    COS_SENDER_GLH ("COSPV2",""),
    COS_SENDER_DJK ("COSDJK",""),
    COS_RECEIVER ("COSCO",""),
    CMA_SENDER ("CNTAODGAD",""),
    CMA_CML_SENDER ("CNTAODCML",""),
    CMA_GLJ_SENDER ("CNTAODCOS",""),
    CMA_RECEIVER ("CMA",""),

    PIL_SENDER ("SAN",""),
    PIL_RECEIVER ("PIL",""),

    TAL_SENDER ("CNQINQOGA",""),
    TAL_RECEIVER ("PIL","");
    private String code;

    private String message;

    EdiSenderEnum() {

    }

    EdiSenderEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
