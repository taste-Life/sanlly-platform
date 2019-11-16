package com.sanlly.production.dao;

import java.util.List;
import java.util.Map;

public interface EdiMessageMapperExt {
    /**
     *@Description: 通过箱号和付费人分组，获取各种费用
     *@Param: [cntrId]
     *@return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     *@Author: zjd
     *@date: 2019-10-19
     */
    List<Map<String,Object>> getFeeCostGroupByCntrNoAndFeePayer(String courseId);
    /**
     *@Description: 根据箱型尺寸进场id,获取iso95
     *@Param: [courseId]
     *@return: java.util.List<java.util.Map<java.lang.String,java.lang.String>>
     *@Author: zjd
     *@date: 2019-10-19
     */
    List<Map<String,String>> getISO95CntrSizeAndType(String courseId);

    /**
     * OneEDI 箱体计算费用
     * @param id
     * @return
     */
    List<Map<String,String>> getTexZDFeeCostByIdForBox(String courseId);

    /**
     * OneEDI 机组计算费用
     * @param id
     * @return
     */
    List<Map<String,String>> getTexZDFeeCostByIdForUnit(String courseId);

    /**
     * SEACO 箱体计算费用
     * @param courseId
     * @return
     */
    List<Map<String,String>> getSEACOFeeCostByIdForBox(String courseId);

    /**
     * SEACO 机组计算费用
     * @param courseId
     * @return
     */
    List<Map<String,String>> getSEACOFeeCostByIdForUnit(String courseId);

    List<Map<String,String>> getGMSValInfo(String courseId);
}
