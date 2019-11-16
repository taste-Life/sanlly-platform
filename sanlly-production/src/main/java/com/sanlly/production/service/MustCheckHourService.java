package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.mustcheckhour.MustCheckHourInputAdd;
import com.sanlly.production.models.input.mustcheckhour.MustCheckHourInputUpdate;
import com.sanlly.production.models.output.mustcheckhour.MustCheckHourOutput;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public interface MustCheckHourService {
    /**
     * @author zhq
     * @date 2019/11/11
     * @description 新增必检工时
     */
    int addMustCheckHour(MustCheckHourInputAdd mustCheckHourInputAdd);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 修改必检工时
     */
    int updateMustCheckHour(MustCheckHourInputUpdate mustCheckHourInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 删除必检工时
     */
    int deleteMustCheckHour(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 设置有效
     */
    int validateMustCheckHour(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    PagedList<MustCheckHourOutput> getMustCheckHourList(Integer index, Integer size, String searchWords);
}
