package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.rate.SpecialWashingRateInput;
import com.sanlly.production.models.output.rate.SpecialWashingRateOutput;

public interface SpecialWashingRateService {

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zjd
     */
    int update(SpecialWashingRateInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zjd
     */
    int add(SpecialWashingRateInput input);

    PagedList<SpecialWashingRateOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);

}
