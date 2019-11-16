package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.reason.ReasonInput;
import com.sanlly.production.models.output.reason.ReasonOutput;

public interface ReasonService {

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zjd
     */
    int update(ReasonInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zjd
     */
    int add(ReasonInput input);

    PagedList<ReasonOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
