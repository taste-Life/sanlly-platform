package com.sanlly.production.service;

import com.sanlly.production.models.input.edi.AddEdiMessageInput;

public interface EdiMessageService {
    /**
     *@Description: 中远edi
     *@Param: []
     *@return: java.lang.String
     *@Author: zjd
     *@date: 2019-10-12
     */
    public String getCOSWestimEDI(AddEdiMessageInput input);
    /**
    *@Description: CMA估价EDI
    *@Param: []
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-18
    */
    public String getCMAWestimEDI(AddEdiMessageInput input);

    /**
    *@Description: CMA PTI EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-21
    */
    public String getCMAPTIEDI(AddEdiMessageInput input);
    /**
    *@Description: ONE 估价EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-22
    */
    public String getONEWestimEDI(AddEdiMessageInput input);
    /**
    *@Description: ONE 入场EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-23
    */
    public String getONEGateInEDI(AddEdiMessageInput input);
    /**
    *@Description: ONE 修理EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-23
    */
    public String getONERepairCompleteEDI(AddEdiMessageInput input);

    /**
     * ONE 估价明细EDI
     * @param input
     * @return
     */
    public String getONEWestimdtEDI(AddEdiMessageInput input);

    /**
     * GMS 估价EDI
     * @param input
     * @return
     */
    public String getGMSWestimEDI(AddEdiMessageInput input);

    /**
     * GMS PTI EDI
     * @param input
     * @return
     */
    public String getGMSPTIEDI(AddEdiMessageInput input);

    /**
     * TRTN  估价EDI
     * @param input
     * @return
     */
    public String getTRTNWestimNewEDI(AddEdiMessageInput input);

    /**
     * TRTN 修理EDI
     * @param input
     * @return
     */
    public String getTRTNRepairCompleteNEWEDI(AddEdiMessageInput input);

    /**
     * TRTN 联合检验 EDI
     * @param input
     * @return
     */
    public String getTRTNJointSurveydtEDI(AddEdiMessageInput input);

    /**
     * SEACO 进场 EDI
     * @param input
     * @return
     */
    public String getGESGateInEDI(AddEdiMessageInput input);

    /**
     * SEACO 出场 EDI
     * @param input
     * @return
     */
    public String getGESGateOutEDI(AddEdiMessageInput input);

    /**
     * SEACO 修理 EDI
     * @param input
     * @return
     */
    public String getGESRepairCompleteEDI(AddEdiMessageInput input);

    /**
     * SEACO 估价 EDI
     * @param input
     * @return
     */
    public String getGESWestimEDI(AddEdiMessageInput input);

    /**
     * SEACO 估价明细 EDI
     * @param input
     * @return
     */
    public String getGESWestimdtEDI(AddEdiMessageInput input);

    /**
     * SEACO 估价批复 EDI
     * @param input
     * @return
     */
    public String getGESWestimAUTEDI(AddEdiMessageInput input);

    /**
     * SEACO 估价明细批复 EDI
     * @param input
     * @return
     */
    public String getGESWestimdtAUTEDI(AddEdiMessageInput input);

    /**
     * SEACO    检验EDI
     * @param input
     * @return
     */
    public String getGESJointSurveyEDI(AddEdiMessageInput input);

    /**
     * SEACO 检验批复EDI
     * @param input
     * @return
     */
    public String getGESJointSurveyAUTEDI(AddEdiMessageInput input);

    /**
     * SEACO  检验明细EDI
     * @param input
     * @return
     */
    public String getGESJointSurveydtEDI(AddEdiMessageInput input);

    /**
     * SEACO  检验明细批复EDI
     * @param input
     * @return
     */
    public String getGESJointSurveydtAUTEDI(AddEdiMessageInput input);

}
