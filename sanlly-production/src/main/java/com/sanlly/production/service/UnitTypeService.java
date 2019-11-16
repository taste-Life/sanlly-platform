package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.unittype.UnitTypeInput;
import com.sanlly.production.models.output.unittype.UnitTypeOutput;

/**
 * 机型信息维护
 *
 * @author zhq
 * @date 2019.10.18
 */
public interface UnitTypeService {
    /**
     * @author zhq
     * @date 2019/10/18
     * @description 根据关键字查询机型列表
     */
    PagedList<UnitTypeOutput> getUnitTypeListByKeywords(PageInput input, String searchWords);

    /**
     * @author zhq
     * @date 2019/10/18
     * @description 新增机型记录
     */
    int addUnitType(UnitTypeInput unitTypeInput);

    /**
     * @author zhq
     * @date 2019/10/19
     * @description 根据主键更新机型记录
     */
    int updateUnitTypeById(UnitTypeInput unitTypeInput);

    /**
     * @author zhq
     * @date 2019/10/19
     * @description 根据主键列表删除记录
     */
    int deleteUnitTypeByIds(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/10/21
     * @description 批量设置有效性
     */
    int multiValid(Integer[] ids, int valid);
}
