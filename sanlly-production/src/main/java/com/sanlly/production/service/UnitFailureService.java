package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.unitfailure.UnitFailureInputAdd;
import com.sanlly.production.models.input.unitfailure.UnitFailureInputUpdate;
import com.sanlly.production.models.output.unitfailure.UnitFailureOutput;

/**
 * @author zhq
 * @date 2019/11/1
 * @description
 */
public interface UnitFailureService {

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 新增机组故障
     */
    int addUnitFailure(UnitFailureInputAdd unitFailureInputAdd);

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 修改机组故障
     */
    int updateUnitFailure(UnitFailureInputUpdate unitFailureInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 批量删除
     */
    int deleteUnitFailure(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/1
     * @description 设置有效
     */
    int validateUnitFailure(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 根据关键字分页查询机组故障列表
     */
    PagedList<UnitFailureOutput> getUnitFailureList(Integer index, Integer size, String searchWords);
}
