package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.UnitRepairEntry;
import com.sanlly.production.models.input.unit.UnitRepairEntryInput;
import com.sanlly.production.models.output.unit.UnitRepairEntryOutput;

import java.util.Map;

public interface UnitRepairEntryService {
    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zjd
     */
    int update(UnitRepairEntryInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zjd
     */
    int add(UnitRepairEntryInput input);

    PagedList<UnitRepairEntryOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);

    Map<String,Object> selectList();
}
