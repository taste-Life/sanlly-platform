package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.unit.UnitRepairInput;
import com.sanlly.production.models.output.unit.UnitRepairOutput;

public interface UnitRepairService {
    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zjd
     */
    int update(UnitRepairInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zjd
     */
    int add(UnitRepairInput input);

    PagedList<UnitRepairOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
