package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.delay.DelayReceiveTimeInput;
import com.sanlly.production.models.output.delay.DelayReceiveTimeOutput;

public interface DelayReceiveTimeService {
    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zjd
     */
    int update(DelayReceiveTimeInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zjd
     */
    int add(DelayReceiveTimeInput input);

    PagedList<DelayReceiveTimeOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
