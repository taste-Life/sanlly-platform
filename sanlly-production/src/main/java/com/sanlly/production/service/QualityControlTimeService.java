package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.qualitycontrol.QualityControlTimeInputAdd;
import com.sanlly.production.models.input.qualitycontrol.QualityControlTimeInputUpdate;
import com.sanlly.production.models.output.qualitycontrol.QualityControlTimeOutput;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public interface QualityControlTimeService {
    /**
     * @author zhq
     * @date 2019/11/11
     * @description 新增质检时间
     */
    int addQualityControlTime(QualityControlTimeInputAdd qualityControlTimeInputAdd);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 修改质检时间
     */
    int updateQualityControlTime(QualityControlTimeInputUpdate qualityControlTimeInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 删除质检时间
     */
    int deleteQualityControlTime(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description
     */
    int validateQualityControlTime(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    PagedList<QualityControlTimeOutput> getQualityControlTimeList(Integer index, Integer size, String searchWords);


}
