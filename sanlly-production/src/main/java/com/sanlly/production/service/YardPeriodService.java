package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.yardperiod.YardPeriodInputAdd;
import com.sanlly.production.models.input.yardperiod.YardPeriodInputUpdate;
import com.sanlly.production.models.output.yardperiod.YardPeriodOutput;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
public interface YardPeriodService {
    /**
     * @author zhq
     * @date 2019/11/11
     * @description 新增场站时段
     */
    int addYardPeriod(YardPeriodInputAdd yardPeriodInputAdd);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 修改场站时段
     */
    int updateYardPeriod(YardPeriodInputUpdate yardPeriodInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 删除场站时段
     */
    int deleteYardPeriod(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description
     */
    int validateYardPeriod(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    PagedList<YardPeriodOutput> getYarPeriodList(Integer index, Integer size, String searchWords);
}
